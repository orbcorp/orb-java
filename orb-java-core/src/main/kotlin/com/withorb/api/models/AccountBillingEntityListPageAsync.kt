// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.account.BillingEntityServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BillingEntityServiceAsync.list */
class AccountBillingEntityListPageAsync
private constructor(
    private val service: BillingEntityServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccountBillingEntityListParams,
    private val response: AccountBillingEntityListPageResponse,
) : PageAsync<BillingEntity> {

    /**
     * Delegates to [AccountBillingEntityListPageResponse], but gracefully handles missing data.
     *
     * @see AccountBillingEntityListPageResponse.data
     */
    fun data(): List<BillingEntity> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountBillingEntityListPageResponse], but gracefully handles missing data.
     *
     * @see AccountBillingEntityListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<BillingEntity> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): AccountBillingEntityListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AccountBillingEntityListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BillingEntity> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AccountBillingEntityListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountBillingEntityListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountBillingEntityListPageAsync].
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

    /** A builder for [AccountBillingEntityListPageAsync]. */
    class Builder internal constructor() {

        private var service: BillingEntityServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccountBillingEntityListParams? = null
        private var response: AccountBillingEntityListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountBillingEntityListPageAsync: AccountBillingEntityListPageAsync) =
            apply {
                service = accountBillingEntityListPageAsync.service
                streamHandlerExecutor = accountBillingEntityListPageAsync.streamHandlerExecutor
                params = accountBillingEntityListPageAsync.params
                response = accountBillingEntityListPageAsync.response
            }

        fun service(service: BillingEntityServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AccountBillingEntityListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountBillingEntityListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AccountBillingEntityListPageAsync].
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
        fun build(): AccountBillingEntityListPageAsync =
            AccountBillingEntityListPageAsync(
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

        return other is AccountBillingEntityListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AccountBillingEntityListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
