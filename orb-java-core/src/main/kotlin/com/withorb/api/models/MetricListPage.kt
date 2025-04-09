// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.MetricService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [MetricService.list] */
class MetricListPage
private constructor(
    private val service: MetricService,
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

    fun getNextPage(): Optional<MetricListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): MetricListParams = params

    /** The response that this page was parsed from. */
    fun response(): MetricListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MetricListPage].
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

    /** A builder for [MetricListPage]. */
    class Builder internal constructor() {

        private var service: MetricService? = null
        private var params: MetricListParams? = null
        private var response: MetricListPageResponse? = null

        @JvmSynthetic
        internal fun from(metricListPage: MetricListPage) = apply {
            service = metricListPage.service
            params = metricListPage.params
            response = metricListPage.response
        }

        fun service(service: MetricService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MetricListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MetricListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MetricListPage].
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
        fun build(): MetricListPage =
            MetricListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: MetricListPage) : Iterable<BillableMetric> {

        override fun iterator(): Iterator<BillableMetric> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<BillableMetric> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MetricListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "MetricListPage{service=$service, params=$params, response=$response}"
}
