// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.customers.credits.TopUpServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TopUpServiceAsync.list */
class CustomerCreditTopUpListPageAsync
private constructor(
    private val service: TopUpServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomerCreditTopUpListParams,
    private val response: CustomerCreditTopUpListPageResponse,
) : PageAsync<CustomerCreditTopUpListResponse> {

    /**
     * Delegates to [CustomerCreditTopUpListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerCreditTopUpListPageResponse.data
     */
    fun data(): List<CustomerCreditTopUpListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerCreditTopUpListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerCreditTopUpListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<CustomerCreditTopUpListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): CustomerCreditTopUpListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CustomerCreditTopUpListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerCreditTopUpListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditTopUpListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditTopUpListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditTopUpListPageAsync].
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

    /** A builder for [CustomerCreditTopUpListPageAsync]. */
    class Builder internal constructor() {

        private var service: TopUpServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomerCreditTopUpListParams? = null
        private var response: CustomerCreditTopUpListPageResponse? = null

        @JvmSynthetic
        internal fun from(customerCreditTopUpListPageAsync: CustomerCreditTopUpListPageAsync) =
            apply {
                service = customerCreditTopUpListPageAsync.service
                streamHandlerExecutor = customerCreditTopUpListPageAsync.streamHandlerExecutor
                params = customerCreditTopUpListPageAsync.params
                response = customerCreditTopUpListPageAsync.response
            }

        fun service(service: TopUpServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditTopUpListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditTopUpListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditTopUpListPageAsync].
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
        fun build(): CustomerCreditTopUpListPageAsync =
            CustomerCreditTopUpListPageAsync(
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

        return /* spotless:off */ other is CustomerCreditTopUpListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditTopUpListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
