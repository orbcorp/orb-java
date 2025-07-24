// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.DimensionalPriceGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DimensionalPriceGroupServiceAsync.list */
class DimensionalPriceGroupListPageAsync
private constructor(
    private val service: DimensionalPriceGroupServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DimensionalPriceGroupListParams,
    private val response: DimensionalPriceGroups,
) : PageAsync<DimensionalPriceGroup> {

    /**
     * Delegates to [DimensionalPriceGroups], but gracefully handles missing data.
     *
     * @see DimensionalPriceGroups.data
     */
    fun data(): List<DimensionalPriceGroup> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DimensionalPriceGroups], but gracefully handles missing data.
     *
     * @see DimensionalPriceGroups.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<DimensionalPriceGroup> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): DimensionalPriceGroupListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DimensionalPriceGroupListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DimensionalPriceGroup> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DimensionalPriceGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): DimensionalPriceGroups = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DimensionalPriceGroupListPageAsync].
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

    /** A builder for [DimensionalPriceGroupListPageAsync]. */
    class Builder internal constructor() {

        private var service: DimensionalPriceGroupServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DimensionalPriceGroupListParams? = null
        private var response: DimensionalPriceGroups? = null

        @JvmSynthetic
        internal fun from(dimensionalPriceGroupListPageAsync: DimensionalPriceGroupListPageAsync) =
            apply {
                service = dimensionalPriceGroupListPageAsync.service
                streamHandlerExecutor = dimensionalPriceGroupListPageAsync.streamHandlerExecutor
                params = dimensionalPriceGroupListPageAsync.params
                response = dimensionalPriceGroupListPageAsync.response
            }

        fun service(service: DimensionalPriceGroupServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DimensionalPriceGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DimensionalPriceGroups) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DimensionalPriceGroupListPageAsync].
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
        fun build(): DimensionalPriceGroupListPageAsync =
            DimensionalPriceGroupListPageAsync(
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

        return /* spotless:off */ other is DimensionalPriceGroupListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "DimensionalPriceGroupListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
