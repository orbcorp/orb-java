// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.customers.credits.TopUpService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see TopUpService.list */
class CustomerCreditTopUpListPage
private constructor(
    private val service: TopUpService,
    private val params: CustomerCreditTopUpListParams,
    private val response: CustomerCreditTopUpListPageResponse,
) : Page<CustomerCreditTopUpListResponse> {

    /**
     * Delegates to [CustomerCreditTopUpListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerCreditTopUpListPageResponse.data
     */
    fun data(): List<CustomerCreditTopUpListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerCreditTopUpListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerCreditTopUpListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<CustomerCreditTopUpListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): CustomerCreditTopUpListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CustomerCreditTopUpListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CustomerCreditTopUpListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditTopUpListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditTopUpListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerCreditTopUpListPage].
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

    /** A builder for [CustomerCreditTopUpListPage]. */
    class Builder internal constructor() {

        private var service: TopUpService? = null
        private var params: CustomerCreditTopUpListParams? = null
        private var response: CustomerCreditTopUpListPageResponse? = null

        @JvmSynthetic
        internal fun from(customerCreditTopUpListPage: CustomerCreditTopUpListPage) = apply {
            service = customerCreditTopUpListPage.service
            params = customerCreditTopUpListPage.params
            response = customerCreditTopUpListPage.response
        }

        fun service(service: TopUpService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditTopUpListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditTopUpListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditTopUpListPage].
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
        fun build(): CustomerCreditTopUpListPage =
            CustomerCreditTopUpListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditTopUpListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditTopUpListPage{service=$service, params=$params, response=$response}"
}
