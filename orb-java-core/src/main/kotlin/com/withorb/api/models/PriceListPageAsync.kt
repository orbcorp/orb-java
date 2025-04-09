// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.PriceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint is used to list all add-on prices created using the
 * [price creation endpoint](/api-reference/price/create-price).
 */
class PriceListPageAsync
private constructor(
    private val pricesService: PriceServiceAsync,
    private val params: PriceListParams,
    private val response: PriceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PriceListPageResponse = response

    /**
     * Delegates to [PriceListPageResponse], but gracefully handles missing data.
     *
     * @see [PriceListPageResponse.data]
     */
    fun data(): List<Price> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PriceListPageResponse], but gracefully handles missing data.
     *
     * @see [PriceListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceListPageAsync && pricesService == other.pricesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(pricesService, params, response) /* spotless:on */

    override fun toString() =
        "PriceListPageAsync{pricesService=$pricesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<PriceListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params
                .toBuilder()
                .apply {
                    paginationMetadata()
                        .flatMap { it._nextCursor().getOptional("next_cursor") }
                        .ifPresent { cursor(it) }
                }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PriceListPageAsync>> {
        return getNextPageParams()
            .map { pricesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            pricesService: PriceServiceAsync,
            params: PriceListParams,
            response: PriceListPageResponse,
        ) = PriceListPageAsync(pricesService, params, response)
    }

    class AutoPager(private val firstPage: PriceListPageAsync) {

        fun forEach(action: Predicate<Price>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PriceListPageAsync>>.forEach(
                action: (Price) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<Price>> {
            val values = mutableListOf<Price>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
