// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.customers.credits.LedgerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LedgerServiceAsync.listByExternalId */
class CustomerCreditLedgerListByExternalIdPageAsync
private constructor(
    private val service: LedgerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomerCreditLedgerListByExternalIdParams,
    private val response: CustomerCreditLedgerListByExternalIdPageResponse,
) : PageAsync<CustomerCreditLedgerListByExternalIdResponse> {

    /**
     * Delegates to [CustomerCreditLedgerListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see CustomerCreditLedgerListByExternalIdPageResponse.data
     */
    fun data(): List<CustomerCreditLedgerListByExternalIdResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerCreditLedgerListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see CustomerCreditLedgerListByExternalIdPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<CustomerCreditLedgerListByExternalIdResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): CustomerCreditLedgerListByExternalIdParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CustomerCreditLedgerListByExternalIdPageAsync> =
        service.listByExternalId(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerCreditLedgerListByExternalIdResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditLedgerListByExternalIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditLedgerListByExternalIdPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditLedgerListByExternalIdPageAsync].
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

    /** A builder for [CustomerCreditLedgerListByExternalIdPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomerCreditLedgerListByExternalIdParams? = null
        private var response: CustomerCreditLedgerListByExternalIdPageResponse? = null

        @JvmSynthetic
        internal fun from(
            customerCreditLedgerListByExternalIdPageAsync:
                CustomerCreditLedgerListByExternalIdPageAsync
        ) = apply {
            service = customerCreditLedgerListByExternalIdPageAsync.service
            streamHandlerExecutor =
                customerCreditLedgerListByExternalIdPageAsync.streamHandlerExecutor
            params = customerCreditLedgerListByExternalIdPageAsync.params
            response = customerCreditLedgerListByExternalIdPageAsync.response
        }

        fun service(service: LedgerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditLedgerListByExternalIdParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditLedgerListByExternalIdPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditLedgerListByExternalIdPageAsync].
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
        fun build(): CustomerCreditLedgerListByExternalIdPageAsync =
            CustomerCreditLedgerListByExternalIdPageAsync(
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

        return /* spotless:off */ other is CustomerCreditLedgerListByExternalIdPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerListByExternalIdPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
