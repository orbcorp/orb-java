// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.customers.credits.TopUpService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List top-ups by external ID */
class CustomerCreditTopUpListByExternalIdPage
private constructor(
    private val topUpsService: TopUpService,
    private val params: CustomerCreditTopUpListByExternalIdParams,
    private val response: CustomerCreditTopUpListByExternalIdPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerCreditTopUpListByExternalIdPageResponse = response

    /**
     * Delegates to [CustomerCreditTopUpListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditTopUpListByExternalIdPageResponse.data]
     */
    fun data(): List<CustomerCreditTopUpListByExternalIdResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerCreditTopUpListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditTopUpListByExternalIdPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditTopUpListByExternalIdPage && topUpsService == other.topUpsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(topUpsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditTopUpListByExternalIdPage{topUpsService=$topUpsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<CustomerCreditTopUpListByExternalIdParams> {
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

    fun getNextPage(): Optional<CustomerCreditTopUpListByExternalIdPage> {
        return getNextPageParams().map { topUpsService.listByExternalId(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            topUpsService: TopUpService,
            params: CustomerCreditTopUpListByExternalIdParams,
            response: CustomerCreditTopUpListByExternalIdPageResponse,
        ) = CustomerCreditTopUpListByExternalIdPage(topUpsService, params, response)
    }

    class AutoPager(private val firstPage: CustomerCreditTopUpListByExternalIdPage) :
        Iterable<CustomerCreditTopUpListByExternalIdResponse> {

        override fun iterator(): Iterator<CustomerCreditTopUpListByExternalIdResponse> = iterator {
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

        fun stream(): Stream<CustomerCreditTopUpListByExternalIdResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
