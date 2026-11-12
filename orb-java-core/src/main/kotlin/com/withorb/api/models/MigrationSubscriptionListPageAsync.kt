// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.migrations.SubscriptionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SubscriptionServiceAsync.list */
class MigrationSubscriptionListPageAsync
private constructor(
    private val service: SubscriptionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MigrationSubscriptionListParams,
    private val response: MigrationSubscriptionListPageResponse,
) : PageAsync<MigrationSubscription> {

    /**
     * Delegates to [MigrationSubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see MigrationSubscriptionListPageResponse.data
     */
    fun data(): List<MigrationSubscription> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MigrationSubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see MigrationSubscriptionListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<MigrationSubscription> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): MigrationSubscriptionListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<MigrationSubscriptionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MigrationSubscription> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MigrationSubscriptionListParams = params

    /** The response that this page was parsed from. */
    fun response(): MigrationSubscriptionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MigrationSubscriptionListPageAsync].
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

    /** A builder for [MigrationSubscriptionListPageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MigrationSubscriptionListParams? = null
        private var response: MigrationSubscriptionListPageResponse? = null

        @JvmSynthetic
        internal fun from(migrationSubscriptionListPageAsync: MigrationSubscriptionListPageAsync) =
            apply {
                service = migrationSubscriptionListPageAsync.service
                streamHandlerExecutor = migrationSubscriptionListPageAsync.streamHandlerExecutor
                params = migrationSubscriptionListPageAsync.params
                response = migrationSubscriptionListPageAsync.response
            }

        fun service(service: SubscriptionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MigrationSubscriptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MigrationSubscriptionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MigrationSubscriptionListPageAsync].
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
        fun build(): MigrationSubscriptionListPageAsync =
            MigrationSubscriptionListPageAsync(
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

        return other is MigrationSubscriptionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MigrationSubscriptionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
