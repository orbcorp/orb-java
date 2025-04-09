// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.InvoiceService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint returns a list of all [`Invoice`](/core-concepts#invoice)s for an account in a list
 * format.
 *
 * The list of invoices is ordered starting from the most recently issued invoice date. The response
 * also includes [`pagination_metadata`](/api-reference/pagination), which lets the caller retrieve
 * the next page of results if they exist.
 *
 * By default, this only returns invoices that are `issued`, `paid`, or `synced`.
 *
 * When fetching any `draft` invoices, this returns the last-computed invoice values for each draft
 * invoice, which may not always be up-to-date since Orb regularly refreshes invoices
 * asynchronously.
 */
class InvoiceListPage
private constructor(
    private val invoicesService: InvoiceService,
    private val params: InvoiceListParams,
    private val response: InvoiceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InvoiceListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceListPage && invoicesService == other.invoicesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(invoicesService, params, response) /* spotless:on */

    override fun toString() =
        "InvoiceListPage{invoicesService=$invoicesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<InvoiceListParams> {
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

    fun getNextPage(): Optional<InvoiceListPage> {
        return getNextPageParams().map { invoicesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            invoicesService: InvoiceService,
            params: InvoiceListParams,
            response: InvoiceListPageResponse,
        ) = InvoiceListPage(invoicesService, params, response)
    }

    class AutoPager(private val firstPage: InvoiceListPage) : Iterable<Invoice> {

        override fun iterator(): Iterator<Invoice> = iterator {
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

        fun stream(): Stream<Invoice> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
