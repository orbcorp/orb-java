// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.coupons.SubscriptionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint returns a list of all subscriptions that have redeemed a given coupon as a
 * [paginated](/api-reference/pagination) list, ordered starting from the most recently created
 * subscription. For a full discussion of the subscription resource, see
 * [Subscription](/core-concepts#subscription).
 */
class CouponSubscriptionListPageAsync
private constructor(
    private val subscriptionsService: SubscriptionServiceAsync,
    private val params: CouponSubscriptionListParams,
    private val response: Subscriptions,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): Subscriptions = response

    /**
     * Delegates to [Subscriptions], but gracefully handles missing data.
     *
     * @see [Subscriptions.data]
     */
    fun data(): List<Subscription> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [Subscriptions], but gracefully handles missing data.
     *
     * @see [Subscriptions.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CouponSubscriptionListPageAsync && subscriptionsService == other.subscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "CouponSubscriptionListPageAsync{subscriptionsService=$subscriptionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<CouponSubscriptionListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<CouponSubscriptionListPageAsync>> {
        return getNextPageParams()
            .map { subscriptionsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            subscriptionsService: SubscriptionServiceAsync,
            params: CouponSubscriptionListParams,
            response: Subscriptions,
        ) = CouponSubscriptionListPageAsync(subscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: CouponSubscriptionListPageAsync) {

        fun forEach(action: Predicate<Subscription>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CouponSubscriptionListPageAsync>>.forEach(
                action: (Subscription) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Subscription>> {
            val values = mutableListOf<Subscription>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
