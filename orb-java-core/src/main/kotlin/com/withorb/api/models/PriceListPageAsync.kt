// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.PriceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [PriceServiceAsync.list] */
class PriceListPageAsync
private constructor(
    private val service: PriceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PriceListParams,
    private val response: PriceListPageResponse,
) : PageAsync<Price> {

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

    override fun items(): List<Price> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): PriceListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PriceListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Price> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PriceListParams = params

    /** The response that this page was parsed from. */
    fun response(): PriceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PriceListPageAsync].
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

    /** A builder for [PriceListPageAsync]. */
    class Builder internal constructor() {

        private var service: PriceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PriceListParams? = null
        private var response: PriceListPageResponse? = null

        @JvmSynthetic
        internal fun from(priceListPageAsync: PriceListPageAsync) = apply {
            service = priceListPageAsync.service
            streamHandlerExecutor = priceListPageAsync.streamHandlerExecutor
            params = priceListPageAsync.params
            response = priceListPageAsync.response
        }

        fun service(service: PriceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PriceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PriceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PriceListPageAsync].
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
        fun build(): PriceListPageAsync =
            PriceListPageAsync(
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

        return /* spotless:off */ other is PriceListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "PriceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
