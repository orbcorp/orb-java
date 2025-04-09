// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.customers.BalanceTransactionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [BalanceTransactionServiceAsync.list] */
class CustomerBalanceTransactionListPageAsync
private constructor(
    private val service: BalanceTransactionServiceAsync,
    private val params: CustomerBalanceTransactionListParams,
    private val response: CustomerBalanceTransactionListPageResponse,
) {

    /**
     * Delegates to [CustomerBalanceTransactionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [CustomerBalanceTransactionListPageResponse.data]
     */
    fun data(): List<CustomerBalanceTransactionListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerBalanceTransactionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [CustomerBalanceTransactionListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<CustomerBalanceTransactionListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<CustomerBalanceTransactionListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerBalanceTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerBalanceTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerBalanceTransactionListPageAsync].
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

    /** A builder for [CustomerBalanceTransactionListPageAsync]. */
    class Builder internal constructor() {

        private var service: BalanceTransactionServiceAsync? = null
        private var params: CustomerBalanceTransactionListParams? = null
        private var response: CustomerBalanceTransactionListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            customerBalanceTransactionListPageAsync: CustomerBalanceTransactionListPageAsync
        ) = apply {
            service = customerBalanceTransactionListPageAsync.service
            params = customerBalanceTransactionListPageAsync.params
            response = customerBalanceTransactionListPageAsync.response
        }

        fun service(service: BalanceTransactionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerBalanceTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerBalanceTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerBalanceTransactionListPageAsync].
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
        fun build(): CustomerBalanceTransactionListPageAsync =
            CustomerBalanceTransactionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CustomerBalanceTransactionListPageAsync) {

        fun forEach(
            action: Predicate<CustomerBalanceTransactionListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CustomerBalanceTransactionListPageAsync>>.forEach(
                action: (CustomerBalanceTransactionListResponse) -> Boolean,
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

        fun toList(
            executor: Executor
        ): CompletableFuture<List<CustomerBalanceTransactionListResponse>> {
            val values = mutableListOf<CustomerBalanceTransactionListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBalanceTransactionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerBalanceTransactionListPageAsync{service=$service, params=$params, response=$response}"
}
