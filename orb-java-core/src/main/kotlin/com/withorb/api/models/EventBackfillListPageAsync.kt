// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.events.BackfillServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint returns a list of all backfills in a list format.
 *
 * The list of backfills is ordered starting from the most recently created backfill. The response
 * also includes [`pagination_metadata`](/api-reference/pagination), which lets the caller retrieve
 * the next page of results if they exist. More information about pagination can be found in the
 * [Pagination-metadata schema](pagination).
 */
class EventBackfillListPageAsync
private constructor(
    private val backfillsService: BackfillServiceAsync,
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

        return /* spotless:off */ other is EventBackfillListPageAsync && backfillsService == other.backfillsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(backfillsService, params, response) /* spotless:on */

    override fun toString() =
        "EventBackfillListPageAsync{backfillsService=$backfillsService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<EventBackfillListPageAsync>> {
        return getNextPageParams()
            .map { backfillsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            backfillsService: BackfillServiceAsync,
            params: EventBackfillListParams,
            response: EventBackfillListPageResponse,
        ) = EventBackfillListPageAsync(backfillsService, params, response)
    }

    class AutoPager(private val firstPage: EventBackfillListPageAsync) {

        fun forEach(
            action: Predicate<EventBackfillListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<EventBackfillListPageAsync>>.forEach(
                action: (EventBackfillListResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<EventBackfillListResponse>> {
            val values = mutableListOf<EventBackfillListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
