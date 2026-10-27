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

/** @see SubscriptionServiceAsync.listSummary */
class SubscriptionListSummaryPageAsync
private constructor(
    private val service: SubscriptionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SubscriptionListSummaryParams,
    private val response: SubscriptionListSummaryPageResponse,
) : PageAsync<SubscriptionListSummaryResponse> {

    /**
     * Delegates to [SubscriptionListSummaryPageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionListSummaryPageResponse.data
     */
    fun data(): List<SubscriptionListSummaryResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SubscriptionListSummaryPageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionListSummaryPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<SubscriptionListSummaryResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): SubscriptionListSummaryParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SubscriptionListSummaryPageAsync> =
        service.listSummary(nextPageParams())

    fun autoPager(): AutoPagerAsync<SubscriptionListSummaryResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionListSummaryParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionListSummaryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionListSummaryPageAsync].
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

    /** A builder for [SubscriptionListSummaryPageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SubscriptionListSummaryParams? = null
        private var response: SubscriptionListSummaryPageResponse? = null

        @JvmSynthetic
        internal fun from(subscriptionListSummaryPageAsync: SubscriptionListSummaryPageAsync) =
            apply {
                service = subscriptionListSummaryPageAsync.service
                streamHandlerExecutor = subscriptionListSummaryPageAsync.streamHandlerExecutor
                params = subscriptionListSummaryPageAsync.params
                response = subscriptionListSummaryPageAsync.response
            }

        fun service(service: SubscriptionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionListSummaryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionListSummaryPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SubscriptionListSummaryPageAsync].
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
        fun build(): SubscriptionListSummaryPageAsync =
            SubscriptionListSummaryPageAsync(
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

        return other is SubscriptionListSummaryPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SubscriptionListSummaryPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
