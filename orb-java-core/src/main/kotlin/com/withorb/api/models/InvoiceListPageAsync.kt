// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.InvoiceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
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
class InvoiceListPageAsync
private constructor(
    private val invoicesService: InvoiceServiceAsync,
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

        return /* spotless:off */ other is InvoiceListPageAsync && invoicesService == other.invoicesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(invoicesService, params, response) /* spotless:on */

    override fun toString() =
        "InvoiceListPageAsync{invoicesService=$invoicesService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<InvoiceListPageAsync>> {
        return getNextPageParams()
            .map { invoicesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            invoicesService: InvoiceServiceAsync,
            params: InvoiceListParams,
            response: InvoiceListPageResponse,
        ) = InvoiceListPageAsync(invoicesService, params, response)
    }

    class AutoPager(private val firstPage: InvoiceListPageAsync) {

        fun forEach(action: Predicate<Invoice>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<InvoiceListPageAsync>>.forEach(
                action: (Invoice) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<Invoice>> {
            val values = mutableListOf<Invoice>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
