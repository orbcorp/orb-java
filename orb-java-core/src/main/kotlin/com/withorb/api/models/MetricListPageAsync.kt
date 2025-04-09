// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.MetricServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [MetricServiceAsync.list] */
class MetricListPageAsync
private constructor(
    private val service: MetricServiceAsync,
    private val params: MetricListParams,
    private val response: MetricListPageResponse,
) {

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

    fun getNextPage(): CompletableFuture<Optional<MetricListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): MetricListParams = params

    /** The response that this page was parsed from. */
    fun response(): MetricListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MetricListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MetricListPageAsync]. */
    class Builder internal constructor() {

        private var service: MetricServiceAsync? = null
        private var params: MetricListParams? = null
        private var response: MetricListPageResponse? = null

        @JvmSynthetic
        internal fun from(metricListPageAsync: MetricListPageAsync) = apply {
            service = metricListPageAsync.service
            params = metricListPageAsync.params
            response = metricListPageAsync.response
        }

        fun service(service: MetricServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MetricListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MetricListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MetricListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MetricListPageAsync =
            MetricListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MetricListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "MetricListPageAsync{service=$service, params=$params, response=$response}"
}
