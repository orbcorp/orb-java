// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.SubscriptionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint returns a list of all subscriptions for an account as a
 * [paginated](/api-reference/pagination) list, ordered starting from the most recently created
 * subscription. For a full discussion of the subscription resource, see
 * [Subscription](/core-concepts##subscription).
 *
 * Subscriptions can be filtered for a specific customer by using either the customer_id or
 * external_customer_id query parameters. To filter subscriptions for multiple customers, use the
 * customer_id[] or external_customer_id[] query parameters.
 */
class SubscriptionListPage
private constructor(
    private val subscriptionsService: SubscriptionService,
    private val params: SubscriptionListParams,
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

        return /* spotless:off */ other is SubscriptionListPage && subscriptionsService == other.subscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "SubscriptionListPage{subscriptionsService=$subscriptionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<SubscriptionListParams> {
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

    fun getNextPage(): Optional<SubscriptionListPage> {
        return getNextPageParams().map { subscriptionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            subscriptionsService: SubscriptionService,
            params: SubscriptionListParams,
            response: Subscriptions,
        ) = SubscriptionListPage(subscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: SubscriptionListPage) : Iterable<Subscription> {

        override fun iterator(): Iterator<Subscription> = iterator {
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

        fun stream(): Stream<Subscription> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
