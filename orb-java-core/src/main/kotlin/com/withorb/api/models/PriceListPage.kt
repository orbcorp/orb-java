// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.PriceService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint is used to list all add-on prices created using the
 * [price creation endpoint](/api-reference/price/create-price).
 */
class PriceListPage
private constructor(
    private val pricesService: PriceService,
    private val params: PriceListParams,
    private val response: PriceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PriceListPageResponse = response

    /**
     * Delegates to [PriceListPageResponse], but gracefully handles missing data.
     *
     * @see [PriceListPageResponse.data]
     */
    fun data(): List<Price> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PriceListPageResponse], but gracefully handles missing data.
     *
     * @see [PriceListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceListPage && pricesService == other.pricesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(pricesService, params, response) /* spotless:on */

    override fun toString() =
        "PriceListPage{pricesService=$pricesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<PriceListParams> {
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

    fun getNextPage(): Optional<PriceListPage> {
        return getNextPageParams().map { pricesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            pricesService: PriceService,
            params: PriceListParams,
            response: PriceListPageResponse,
        ) = PriceListPage(pricesService, params, response)
    }

    class AutoPager(private val firstPage: PriceListPage) : Iterable<Price> {

        override fun iterator(): Iterator<Price> = iterator {
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

        fun stream(): Stream<Price> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
