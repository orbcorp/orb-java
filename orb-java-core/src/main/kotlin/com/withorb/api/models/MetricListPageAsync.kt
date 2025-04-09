// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.MetricServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint is used to fetch [metric](/core-concepts##metric) details given a metric
 * identifier. It returns information about the metrics including its name, description, and item.
 */
class MetricListPageAsync
private constructor(
    private val metricsService: MetricServiceAsync,
    private val params: MetricListParams,
    private val response: MetricListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): MetricListPageResponse = response

    /**
     * Delegates to [MetricListPageResponse], but gracefully handles missing data.
     *
     * @see [MetricListPageResponse.data]
     */
    fun data(): List<BillableMetric> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MetricListPageResponse], but gracefully handles missing data.
     *
     * @see [MetricListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MetricListPageAsync && metricsService == other.metricsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(metricsService, params, response) /* spotless:on */

    override fun toString() =
        "MetricListPageAsync{metricsService=$metricsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<MetricListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<MetricListPageAsync>> {
        return getNextPageParams()
            .map { metricsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            metricsService: MetricServiceAsync,
            params: MetricListParams,
            response: MetricListPageResponse,
        ) = MetricListPageAsync(metricsService, params, response)
    }

    class AutoPager(private val firstPage: MetricListPageAsync) {

        fun forEach(
            action: Predicate<BillableMetric>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<MetricListPageAsync>>.forEach(
                action: (BillableMetric) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BillableMetric>> {
            val values = mutableListOf<BillableMetric>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
