// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.SubscriptionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [SubscriptionServiceAsync.fetchSchedule] */
class SubscriptionFetchSchedulePageAsync
private constructor(
    private val service: SubscriptionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SubscriptionFetchScheduleParams,
    private val response: SubscriptionFetchSchedulePageResponse,
) : PageAsync<SubscriptionFetchScheduleResponse> {

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

    override fun items(): List<SubscriptionFetchScheduleResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): SubscriptionFetchScheduleParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SubscriptionFetchSchedulePageAsync> =
        service.fetchSchedule(nextPageParams())

    fun autoPager(): AutoPagerAsync<SubscriptionFetchScheduleResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionFetchSchedulePageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SubscriptionFetchScheduleParams? = null
        private var response: SubscriptionFetchSchedulePageResponse? = null

        @JvmSynthetic
        internal fun from(subscriptionFetchSchedulePageAsync: SubscriptionFetchSchedulePageAsync) =
            apply {
                service = subscriptionFetchSchedulePageAsync.service
                streamHandlerExecutor = subscriptionFetchSchedulePageAsync.streamHandlerExecutor
                params = subscriptionFetchSchedulePageAsync.params
                response = subscriptionFetchSchedulePageAsync.response
            }

        fun service(service: SubscriptionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionFetchSchedulePageAsync =
            SubscriptionFetchSchedulePageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchSchedulePageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "SubscriptionFetchSchedulePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
