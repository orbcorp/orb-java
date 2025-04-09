// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.events.BackfillService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint returns a list of all backfills in a list format.
 *
 * The list of backfills is ordered starting from the most recently created backfill. The response
 * also includes [`pagination_metadata`](/api-reference/pagination), which lets the caller retrieve
 * the next page of results if they exist. More information about pagination can be found in the
 * [Pagination-metadata schema](pagination).
 */
class EventBackfillListPage
private constructor(
    private val backfillsService: BackfillService,
    private val params: EventBackfillListParams,
    private val response: EventBackfillListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EventBackfillListPageResponse = response

    /**
     * Delegates to [EventBackfillListPageResponse], but gracefully handles missing data.
     *
     * @see [EventBackfillListPageResponse.data]
     */
    fun data(): List<EventBackfillListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventBackfillListPageResponse], but gracefully handles missing data.
     *
     * @see [EventBackfillListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventBackfillListPage && backfillsService == other.backfillsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(backfillsService, params, response) /* spotless:on */

    override fun toString() =
        "EventBackfillListPage{backfillsService=$backfillsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<EventBackfillListParams> {
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

    fun getNextPage(): Optional<EventBackfillListPage> {
        return getNextPageParams().map { backfillsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            backfillsService: BackfillService,
            params: EventBackfillListParams,
            response: EventBackfillListPageResponse,
        ) = EventBackfillListPage(backfillsService, params, response)
    }

    class AutoPager(private val firstPage: EventBackfillListPage) :
        Iterable<EventBackfillListResponse> {

        override fun iterator(): Iterator<EventBackfillListResponse> = iterator {
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

        fun stream(): Stream<EventBackfillListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
