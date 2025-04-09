// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.customers.credits.TopUpServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List top-ups by external ID */
class CustomerCreditTopUpListByExternalIdPageAsync
private constructor(
    private val topUpsService: TopUpServiceAsync,
    private val params: CustomerCreditTopUpListByExternalIdParams,
    private val response: CustomerCreditTopUpListByExternalIdPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerCreditTopUpListByExternalIdPageResponse = response

    /**
     * Delegates to [CustomerCreditTopUpListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditTopUpListByExternalIdPageResponse.data]
     */
    fun data(): List<CustomerCreditTopUpListByExternalIdResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerCreditTopUpListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditTopUpListByExternalIdPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditTopUpListByExternalIdPageAsync && topUpsService == other.topUpsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(topUpsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditTopUpListByExternalIdPageAsync{topUpsService=$topUpsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<CustomerCreditTopUpListByExternalIdParams> {
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

    fun getNextPage(): CompletableFuture<Optional<CustomerCreditTopUpListByExternalIdPageAsync>> {
        return getNextPageParams()
            .map { topUpsService.listByExternalId(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            topUpsService: TopUpServiceAsync,
            params: CustomerCreditTopUpListByExternalIdParams,
            response: CustomerCreditTopUpListByExternalIdPageResponse,
        ) = CustomerCreditTopUpListByExternalIdPageAsync(topUpsService, params, response)
    }

    class AutoPager(private val firstPage: CustomerCreditTopUpListByExternalIdPageAsync) {

        fun forEach(
            action: Predicate<CustomerCreditTopUpListByExternalIdResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CustomerCreditTopUpListByExternalIdPageAsync>>.forEach(
                action: (CustomerCreditTopUpListByExternalIdResponse) -> Boolean,
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

        fun toList(
            executor: Executor
        ): CompletableFuture<List<CustomerCreditTopUpListByExternalIdResponse>> {
            val values = mutableListOf<CustomerCreditTopUpListByExternalIdResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
