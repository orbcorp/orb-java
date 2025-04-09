// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.customers.credits.TopUpService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List top-ups */
class CustomerCreditTopUpListPage
private constructor(
    private val topUpsService: TopUpService,
    private val params: CustomerCreditTopUpListParams,
    private val response: CustomerCreditTopUpListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerCreditTopUpListPageResponse = response

    /**
     * Delegates to [CustomerCreditTopUpListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerCreditTopUpListPageResponse.data]
     */
    fun data(): List<CustomerCreditTopUpListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerCreditTopUpListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerCreditTopUpListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditTopUpListPage && topUpsService == other.topUpsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(topUpsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditTopUpListPage{topUpsService=$topUpsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<CustomerCreditTopUpListParams> {
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

    fun getNextPage(): Optional<CustomerCreditTopUpListPage> {
        return getNextPageParams().map { topUpsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            topUpsService: TopUpService,
            params: CustomerCreditTopUpListParams,
            response: CustomerCreditTopUpListPageResponse,
        ) = CustomerCreditTopUpListPage(topUpsService, params, response)
    }

    class AutoPager(private val firstPage: CustomerCreditTopUpListPage) :
        Iterable<CustomerCreditTopUpListResponse> {

        override fun iterator(): Iterator<CustomerCreditTopUpListResponse> = iterator {
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

        fun stream(): Stream<CustomerCreditTopUpListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
