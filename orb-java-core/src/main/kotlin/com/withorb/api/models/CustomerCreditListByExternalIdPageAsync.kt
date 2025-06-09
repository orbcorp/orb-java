// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.customers.CreditServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [CreditServiceAsync.listByExternalId] */
class CustomerCreditListByExternalIdPageAsync
private constructor(
    private val service: CreditServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomerCreditListByExternalIdParams,
    private val response: CustomerCreditListByExternalIdPageResponse,
) : PageAsync<CustomerCreditListByExternalIdResponse> {

    /**
     * Delegates to [CustomerCreditListByExternalIdPageResponse], but gracefully handles missing
     * data.
     *
     * @see [CustomerCreditListByExternalIdPageResponse.data]
     */
    fun data(): List<CustomerCreditListByExternalIdResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerCreditListByExternalIdPageResponse], but gracefully handles missing
     * data.
     *
     * @see [CustomerCreditListByExternalIdPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<CustomerCreditListByExternalIdResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): CustomerCreditListByExternalIdParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CustomerCreditListByExternalIdPageAsync> =
        service.listByExternalId(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerCreditListByExternalIdResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditListByExternalIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditListByExternalIdPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditListByExternalIdPageAsync].
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

    /** A builder for [CustomerCreditListByExternalIdPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomerCreditListByExternalIdParams? = null
        private var response: CustomerCreditListByExternalIdPageResponse? = null

        @JvmSynthetic
        internal fun from(
            customerCreditListByExternalIdPageAsync: CustomerCreditListByExternalIdPageAsync
        ) = apply {
            service = customerCreditListByExternalIdPageAsync.service
            streamHandlerExecutor = customerCreditListByExternalIdPageAsync.streamHandlerExecutor
            params = customerCreditListByExternalIdPageAsync.params
            response = customerCreditListByExternalIdPageAsync.response
        }

        fun service(service: CreditServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditListByExternalIdParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditListByExternalIdPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditListByExternalIdPageAsync].
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
        fun build(): CustomerCreditListByExternalIdPageAsync =
            CustomerCreditListByExternalIdPageAsync(
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

        return /* spotless:off */ other is CustomerCreditListByExternalIdPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditListByExternalIdPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
