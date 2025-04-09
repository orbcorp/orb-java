// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.SubscriptionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [SubscriptionServiceAsync.fetchSchedule] */
class SubscriptionFetchSchedulePageAsync
private constructor(
    private val service: SubscriptionServiceAsync,
    private val params: SubscriptionFetchScheduleParams,
    private val response: SubscriptionFetchSchedulePageResponse,
) {

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

    fun getNextPage(): CompletableFuture<Optional<SubscriptionFetchSchedulePageAsync>> =
        getNextPageParams()
            .map { service.fetchSchedule(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionFetchScheduleParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionFetchSchedulePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionFetchSchedulePageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionFetchSchedulePageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionServiceAsync? = null
        private var params: SubscriptionFetchScheduleParams? = null
        private var response: SubscriptionFetchSchedulePageResponse? = null

        @JvmSynthetic
        internal fun from(subscriptionFetchSchedulePageAsync: SubscriptionFetchSchedulePageAsync) =
            apply {
                service = subscriptionFetchSchedulePageAsync.service
                params = subscriptionFetchSchedulePageAsync.params
                response = subscriptionFetchSchedulePageAsync.response
            }

        fun service(service: SubscriptionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionFetchScheduleParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionFetchSchedulePageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SubscriptionFetchSchedulePageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionFetchSchedulePageAsync =
            SubscriptionFetchSchedulePageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchSchedulePageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "SubscriptionFetchSchedulePageAsync{service=$service, params=$params, response=$response}"
}
