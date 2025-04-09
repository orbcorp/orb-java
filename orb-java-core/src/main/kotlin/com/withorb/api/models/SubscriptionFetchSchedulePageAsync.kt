// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.SubscriptionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint returns a [paginated](/api-reference/pagination) list of all plans associated with
 * a subscription along with their start and end dates. This list contains the subscription's
 * initial plan along with past and future plan changes.
 */
class SubscriptionFetchSchedulePageAsync
private constructor(
    private val subscriptionsService: SubscriptionServiceAsync,
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

        return /* spotless:off */ other is SubscriptionFetchSchedulePageAsync && subscriptionsService == other.subscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "SubscriptionFetchSchedulePageAsync{subscriptionsService=$subscriptionsService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<SubscriptionFetchSchedulePageAsync>> {
        return getNextPageParams()
            .map { subscriptionsService.fetchSchedule(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            subscriptionsService: SubscriptionServiceAsync,
            params: SubscriptionFetchScheduleParams,
            response: SubscriptionFetchSchedulePageResponse,
        ) = SubscriptionFetchSchedulePageAsync(subscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: SubscriptionFetchSchedulePageAsync) {

        fun forEach(
            action: Predicate<SubscriptionFetchScheduleResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<SubscriptionFetchSchedulePageAsync>>.forEach(
                action: (SubscriptionFetchScheduleResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<SubscriptionFetchScheduleResponse>> {
            val values = mutableListOf<SubscriptionFetchScheduleResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
