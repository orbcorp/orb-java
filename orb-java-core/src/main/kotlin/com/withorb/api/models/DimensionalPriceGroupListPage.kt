// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.DimensionalPriceGroupService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List dimensional price groups */
class DimensionalPriceGroupListPage
private constructor(
    private val dimensionalPriceGroupsService: DimensionalPriceGroupService,
    private val params: DimensionalPriceGroupListParams,
    private val response: DimensionalPriceGroups,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DimensionalPriceGroups = response

    /**
     * Delegates to [DimensionalPriceGroups], but gracefully handles missing data.
     *
     * @see [DimensionalPriceGroups.data]
     */
    fun data(): List<DimensionalPriceGroup> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DimensionalPriceGroups], but gracefully handles missing data.
     *
     * @see [DimensionalPriceGroups.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DimensionalPriceGroupListPage && dimensionalPriceGroupsService == other.dimensionalPriceGroupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(dimensionalPriceGroupsService, params, response) /* spotless:on */

    override fun toString() =
        "DimensionalPriceGroupListPage{dimensionalPriceGroupsService=$dimensionalPriceGroupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<DimensionalPriceGroupListParams> {
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

    fun getNextPage(): Optional<DimensionalPriceGroupListPage> {
        return getNextPageParams().map { dimensionalPriceGroupsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            dimensionalPriceGroupsService: DimensionalPriceGroupService,
            params: DimensionalPriceGroupListParams,
            response: DimensionalPriceGroups,
        ) = DimensionalPriceGroupListPage(dimensionalPriceGroupsService, params, response)
    }

    class AutoPager(private val firstPage: DimensionalPriceGroupListPage) :
        Iterable<DimensionalPriceGroup> {

        override fun iterator(): Iterator<DimensionalPriceGroup> = iterator {
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

        fun stream(): Stream<DimensionalPriceGroup> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
