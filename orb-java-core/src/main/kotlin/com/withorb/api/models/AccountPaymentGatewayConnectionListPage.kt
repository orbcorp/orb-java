// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.account.PaymentGatewayConnectionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PaymentGatewayConnectionService.list */
class AccountPaymentGatewayConnectionListPage
private constructor(
    private val service: PaymentGatewayConnectionService,
    private val params: AccountPaymentGatewayConnectionListParams,
    private val response: AccountPaymentGatewayConnectionListPageResponse,
) : Page<PaymentGatewayConnection> {

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

    override fun nextPage(): AccountPaymentGatewayConnectionListPage =
        service.list(nextPageParams())

    fun autoPager(): AutoPager<PaymentGatewayConnection> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountPaymentGatewayConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountPaymentGatewayConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountPaymentGatewayConnectionListPage].
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

    /** A builder for [AccountPaymentGatewayConnectionListPage]. */
    class Builder internal constructor() {

        private var service: PaymentGatewayConnectionService? = null
        private var params: AccountPaymentGatewayConnectionListParams? = null
        private var response: AccountPaymentGatewayConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            accountPaymentGatewayConnectionListPage: AccountPaymentGatewayConnectionListPage
        ) = apply {
            service = accountPaymentGatewayConnectionListPage.service
            params = accountPaymentGatewayConnectionListPage.params
            response = accountPaymentGatewayConnectionListPage.response
        }

        fun service(service: PaymentGatewayConnectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountPaymentGatewayConnectionListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: AccountPaymentGatewayConnectionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AccountPaymentGatewayConnectionListPage].
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
        fun build(): AccountPaymentGatewayConnectionListPage =
            AccountPaymentGatewayConnectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountPaymentGatewayConnectionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AccountPaymentGatewayConnectionListPage{service=$service, params=$params, response=$response}"
}
