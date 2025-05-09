// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.MetricServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [MetricServiceAsync.list] */
class MetricListPageAsync
private constructor(
    private val service: MetricServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MetricListParams,
    private val response: MetricListPageResponse,
) : PageAsync<BillableMetric> {

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

    override fun items(): List<BillableMetric> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): MetricListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<MetricListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BillableMetric> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MetricListPageAsync]. */
    class Builder internal constructor() {

        private var service: MetricServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MetricListParams? = null
        private var response: MetricListPageResponse? = null

        @JvmSynthetic
        internal fun from(metricListPageAsync: MetricListPageAsync) = apply {
            service = metricListPageAsync.service
            streamHandlerExecutor = metricListPageAsync.streamHandlerExecutor
            params = metricListPageAsync.params
            response = metricListPageAsync.response
        }

        fun service(service: MetricServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MetricListPageAsync =
            MetricListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MetricListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "MetricListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
