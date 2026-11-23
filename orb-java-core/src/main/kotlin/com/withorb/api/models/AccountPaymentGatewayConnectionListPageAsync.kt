// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.account.PaymentGatewayConnectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PaymentGatewayConnectionServiceAsync.list */
class AccountPaymentGatewayConnectionListPageAsync
private constructor(
    private val service: PaymentGatewayConnectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccountPaymentGatewayConnectionListParams,
    private val response: AccountPaymentGatewayConnectionListPageResponse,
) : PageAsync<PaymentGatewayConnection> {

    /**
     * Delegates to [AccountPaymentGatewayConnectionListPageResponse], but gracefully handles
     * missing data.
     *
     * @see AccountPaymentGatewayConnectionListPageResponse.data
     */
    fun data(): List<PaymentGatewayConnection> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountPaymentGatewayConnectionListPageResponse], but gracefully handles
     * missing data.
     *
     * @see AccountPaymentGatewayConnectionListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<PaymentGatewayConnection> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): AccountPaymentGatewayConnectionListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AccountPaymentGatewayConnectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PaymentGatewayConnection> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AccountPaymentGatewayConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountPaymentGatewayConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountPaymentGatewayConnectionListPageAsync].
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

    /** A builder for [AccountPaymentGatewayConnectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: PaymentGatewayConnectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccountPaymentGatewayConnectionListParams? = null
        private var response: AccountPaymentGatewayConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            accountPaymentGatewayConnectionListPageAsync:
                AccountPaymentGatewayConnectionListPageAsync
        ) = apply {
            service = accountPaymentGatewayConnectionListPageAsync.service
            streamHandlerExecutor =
                accountPaymentGatewayConnectionListPageAsync.streamHandlerExecutor
            params = accountPaymentGatewayConnectionListPageAsync.params
            response = accountPaymentGatewayConnectionListPageAsync.response
        }

        fun service(service: PaymentGatewayConnectionServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AccountPaymentGatewayConnectionListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: AccountPaymentGatewayConnectionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AccountPaymentGatewayConnectionListPageAsync].
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
        fun build(): AccountPaymentGatewayConnectionListPageAsync =
            AccountPaymentGatewayConnectionListPageAsync(
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

        return other is AccountPaymentGatewayConnectionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AccountPaymentGatewayConnectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
