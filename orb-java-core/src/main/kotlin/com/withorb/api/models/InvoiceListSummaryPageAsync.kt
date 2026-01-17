// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.InvoiceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see InvoiceServiceAsync.listSummary */
class InvoiceListSummaryPageAsync
private constructor(
    private val service: InvoiceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: InvoiceListSummaryParams,
    private val response: InvoiceListSummaryPageResponse,
) : PageAsync<InvoiceListSummaryResponse> {

    /**
     * Delegates to [InvoiceListSummaryPageResponse], but gracefully handles missing data.
     *
     * @see InvoiceListSummaryPageResponse.data
     */
    fun data(): List<InvoiceListSummaryResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InvoiceListSummaryPageResponse], but gracefully handles missing data.
     *
     * @see InvoiceListSummaryPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<InvoiceListSummaryResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): InvoiceListSummaryParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<InvoiceListSummaryPageAsync> =
        service.listSummary(nextPageParams())

    fun autoPager(): AutoPagerAsync<InvoiceListSummaryResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): InvoiceListSummaryParams = params

    /** The response that this page was parsed from. */
    fun response(): InvoiceListSummaryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceListSummaryPageAsync].
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

    /** A builder for [InvoiceListSummaryPageAsync]. */
    class Builder internal constructor() {

        private var service: InvoiceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: InvoiceListSummaryParams? = null
        private var response: InvoiceListSummaryPageResponse? = null

        @JvmSynthetic
        internal fun from(invoiceListSummaryPageAsync: InvoiceListSummaryPageAsync) = apply {
            service = invoiceListSummaryPageAsync.service
            streamHandlerExecutor = invoiceListSummaryPageAsync.streamHandlerExecutor
            params = invoiceListSummaryPageAsync.params
            response = invoiceListSummaryPageAsync.response
        }

        fun service(service: InvoiceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: InvoiceListSummaryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InvoiceListSummaryPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InvoiceListSummaryPageAsync].
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
        fun build(): InvoiceListSummaryPageAsync =
            InvoiceListSummaryPageAsync(
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

        return other is InvoiceListSummaryPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "InvoiceListSummaryPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
