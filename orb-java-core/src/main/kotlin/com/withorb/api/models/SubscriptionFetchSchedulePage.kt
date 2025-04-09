// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.SubscriptionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint returns a [paginated](/api-reference/pagination) list of all plans associated with
 * a subscription along with their start and end dates. This list contains the subscription's
 * initial plan along with past and future plan changes.
 */
class SubscriptionFetchSchedulePage
private constructor(
    private val subscriptionsService: SubscriptionService,
    private val params: SubscriptionFetchScheduleParams,
    private val response: SubscriptionFetchSchedulePageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): SubscriptionFetchSchedulePageResponse = response

    /**
     * Delegates to [SubscriptionFetchSchedulePageResponse], but gracefully handles missing data.
     *
     * @see [SubscriptionFetchSchedulePageResponse.data]
     */
    fun data(): List<SubscriptionFetchScheduleResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SubscriptionFetchSchedulePageResponse], but gracefully handles missing data.
     *
     * @see [SubscriptionFetchSchedulePageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchSchedulePage && subscriptionsService == other.subscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "SubscriptionFetchSchedulePage{subscriptionsService=$subscriptionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<SubscriptionFetchScheduleParams> {
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

    fun getNextPage(): Optional<SubscriptionFetchSchedulePage> {
        return getNextPageParams().map { subscriptionsService.fetchSchedule(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            subscriptionsService: SubscriptionService,
            params: SubscriptionFetchScheduleParams,
            response: SubscriptionFetchSchedulePageResponse,
        ) = SubscriptionFetchSchedulePage(subscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: SubscriptionFetchSchedulePage) :
        Iterable<SubscriptionFetchScheduleResponse> {

        override fun iterator(): Iterator<SubscriptionFetchScheduleResponse> = iterator {
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

        fun stream(): Stream<SubscriptionFetchScheduleResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
