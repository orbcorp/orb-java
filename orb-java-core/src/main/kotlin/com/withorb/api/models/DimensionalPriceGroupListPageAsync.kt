// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.DimensionalPriceGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List dimensional price groups */
class DimensionalPriceGroupListPageAsync
private constructor(
    private val dimensionalPriceGroupsService: DimensionalPriceGroupServiceAsync,
    private val params: DimensionalPriceGroupListParams,
    private val response: DimensionalPriceGroups,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DimensionalPriceGroups = response

    /**
     * Delegates to [DimensionalPriceGroups], but gracefully handles missing data.
     *
     * @see [DimensionalPriceGroups.data]
     */
    fun data(): List<DimensionalPriceGroup> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DimensionalPriceGroups], but gracefully handles missing data.
     *
     * @see [DimensionalPriceGroups.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DimensionalPriceGroupListPageAsync && dimensionalPriceGroupsService == other.dimensionalPriceGroupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(dimensionalPriceGroupsService, params, response) /* spotless:on */

    override fun toString() =
        "DimensionalPriceGroupListPageAsync{dimensionalPriceGroupsService=$dimensionalPriceGroupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<DimensionalPriceGroupListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<DimensionalPriceGroupListPageAsync>> {
        return getNextPageParams()
            .map { dimensionalPriceGroupsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            dimensionalPriceGroupsService: DimensionalPriceGroupServiceAsync,
            params: DimensionalPriceGroupListParams,
            response: DimensionalPriceGroups,
        ) = DimensionalPriceGroupListPageAsync(dimensionalPriceGroupsService, params, response)
    }

    class AutoPager(private val firstPage: DimensionalPriceGroupListPageAsync) {

        fun forEach(
            action: Predicate<DimensionalPriceGroup>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DimensionalPriceGroupListPageAsync>>.forEach(
                action: (DimensionalPriceGroup) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<DimensionalPriceGroup>> {
            val values = mutableListOf<DimensionalPriceGroup>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
