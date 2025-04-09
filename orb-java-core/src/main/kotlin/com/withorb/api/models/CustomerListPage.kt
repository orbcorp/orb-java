// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.CustomerService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint returns a list of all customers for an account. The list of customers is ordered
 * starting from the most recently created customer. This endpoint follows Orb's
 * [standardized pagination format](/api-reference/pagination).
 *
 * See [Customer](/core-concepts##customer) for an overview of the customer model.
 */
class CustomerListPage
private constructor(
    private val customersService: CustomerService,
    private val params: CustomerListParams,
    private val response: CustomerListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerListPageResponse = response

    /**
     * Delegates to [CustomerListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerListPageResponse.data]
     */
    fun data(): List<Customer> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListPage && customersService == other.customersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customersService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerListPage{customersService=$customersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<CustomerListParams> {
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

    fun getNextPage(): Optional<CustomerListPage> {
        return getNextPageParams().map { customersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            customersService: CustomerService,
            params: CustomerListParams,
            response: CustomerListPageResponse,
        ) = CustomerListPage(customersService, params, response)
    }

    class AutoPager(private val firstPage: CustomerListPage) : Iterable<Customer> {

        override fun iterator(): Iterator<Customer> = iterator {
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

        fun stream(): Stream<Customer> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
