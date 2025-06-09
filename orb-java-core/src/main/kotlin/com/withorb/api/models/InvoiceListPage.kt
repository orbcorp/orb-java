// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.InvoiceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [InvoiceService.list] */
class InvoiceListPage
private constructor(
    private val service: InvoiceService,
    private val params: InvoiceListParams,
    private val response: InvoiceListPageResponse,
) : Page<Invoice> {

    /**
     * Delegates to [InvoiceListPageResponse], but gracefully handles missing data.
     *
     * @see [InvoiceListPageResponse.data]
     */
    fun data(): List<Invoice> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InvoiceListPageResponse], but gracefully handles missing data.
     *
     * @see [InvoiceListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<Invoice> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): InvoiceListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): InvoiceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Invoice> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InvoiceListParams = params

    /** The response that this page was parsed from. */
    fun response(): InvoiceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceListPage].
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

    /** A builder for [InvoiceListPage]. */
    class Builder internal constructor() {

        private var service: InvoiceService? = null
        private var params: InvoiceListParams? = null
        private var response: InvoiceListPageResponse? = null

        @JvmSynthetic
        internal fun from(invoiceListPage: InvoiceListPage) = apply {
            service = invoiceListPage.service
            params = invoiceListPage.params
            response = invoiceListPage.response
        }

        fun service(service: InvoiceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InvoiceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InvoiceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InvoiceListPage].
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
        fun build(): InvoiceListPage =
            InvoiceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "InvoiceListPage{service=$service, params=$params, response=$response}"
}
