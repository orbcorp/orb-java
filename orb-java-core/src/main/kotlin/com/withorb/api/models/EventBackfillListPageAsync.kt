// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.events.BackfillServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BackfillServiceAsync.list */
class EventBackfillListPageAsync
private constructor(
    private val service: BackfillServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EventBackfillListParams,
    private val response: EventBackfillListPageResponse,
) : PageAsync<EventBackfillListResponse> {

    /**
     * Delegates to [EventBackfillListPageResponse], but gracefully handles missing data.
     *
     * @see EventBackfillListPageResponse.data
     */
    fun data(): List<EventBackfillListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventBackfillListPageResponse], but gracefully handles missing data.
     *
     * @see EventBackfillListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<EventBackfillListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): EventBackfillListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EventBackfillListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EventBackfillListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EventBackfillListParams = params

    /** The response that this page was parsed from. */
    fun response(): EventBackfillListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventBackfillListPageAsync].
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

    /** A builder for [EventBackfillListPageAsync]. */
    class Builder internal constructor() {

        private var service: BackfillServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EventBackfillListParams? = null
        private var response: EventBackfillListPageResponse? = null

        @JvmSynthetic
        internal fun from(eventBackfillListPageAsync: EventBackfillListPageAsync) = apply {
            service = eventBackfillListPageAsync.service
            streamHandlerExecutor = eventBackfillListPageAsync.streamHandlerExecutor
            params = eventBackfillListPageAsync.params
            response = eventBackfillListPageAsync.response
        }

        fun service(service: BackfillServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EventBackfillListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventBackfillListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EventBackfillListPageAsync].
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
        fun build(): EventBackfillListPageAsync =
            EventBackfillListPageAsync(
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

        return /* spotless:off */ other is EventBackfillListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "EventBackfillListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
