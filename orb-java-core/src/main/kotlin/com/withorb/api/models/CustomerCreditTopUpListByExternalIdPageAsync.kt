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

/** @see TopUpServiceAsync.listByExternalId */
class CustomerCreditTopUpListByExternalIdPageAsync
private constructor(
    private val service: TopUpServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomerCreditTopUpListByExternalIdParams,
    private val response: CustomerCreditTopUpListByExternalIdPageResponse,
) : PageAsync<CustomerCreditTopUpListByExternalIdResponse> {

    /**
     * Delegates to [CustomerCreditTopUpListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see CustomerCreditTopUpListByExternalIdPageResponse.data
     */
    fun data(): List<CustomerCreditTopUpListByExternalIdResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerCreditTopUpListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see CustomerCreditTopUpListByExternalIdPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<CustomerCreditTopUpListByExternalIdResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): CustomerCreditTopUpListByExternalIdParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CustomerCreditTopUpListByExternalIdPageAsync> =
        service.listByExternalId(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerCreditTopUpListByExternalIdResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditTopUpListByExternalIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditTopUpListByExternalIdPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditTopUpListByExternalIdPageAsync].
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

    /** A builder for [CustomerCreditTopUpListByExternalIdPageAsync]. */
    class Builder internal constructor() {

        private var service: TopUpServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomerCreditTopUpListByExternalIdParams? = null
        private var response: CustomerCreditTopUpListByExternalIdPageResponse? = null

        @JvmSynthetic
        internal fun from(
            customerCreditTopUpListByExternalIdPageAsync:
                CustomerCreditTopUpListByExternalIdPageAsync
        ) = apply {
            service = customerCreditTopUpListByExternalIdPageAsync.service
            streamHandlerExecutor =
                customerCreditTopUpListByExternalIdPageAsync.streamHandlerExecutor
            params = customerCreditTopUpListByExternalIdPageAsync.params
            response = customerCreditTopUpListByExternalIdPageAsync.response
        }

        fun service(service: TopUpServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditTopUpListByExternalIdParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditTopUpListByExternalIdPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditTopUpListByExternalIdPageAsync].
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
        fun build(): CustomerCreditTopUpListByExternalIdPageAsync =
            CustomerCreditTopUpListByExternalIdPageAsync(
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

        return /* spotless:off */ other is CustomerCreditTopUpListByExternalIdPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditTopUpListByExternalIdPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
