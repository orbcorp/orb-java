// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.customers.credits.LedgerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [LedgerServiceAsync.listByExternalId] */
class CustomerCreditLedgerListByExternalIdPageAsync
private constructor(
    private val service: LedgerServiceAsync,
    private val params: CustomerCreditLedgerListByExternalIdParams,
    private val response: CustomerCreditLedgerListByExternalIdPageResponse,
) {

    /**
     * Delegates to [CustomerCreditLedgerListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditLedgerListByExternalIdPageResponse.data]
     */
    fun data(): List<CustomerCreditLedgerListByExternalIdResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerCreditLedgerListByExternalIdPageResponse], but gracefully handles
     * missing data.
     *
     * @see [CustomerCreditLedgerListByExternalIdPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<CustomerCreditLedgerListByExternalIdParams> {
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

    fun getNextPage(): CompletableFuture<Optional<CustomerCreditLedgerListByExternalIdPageAsync>> =
        getNextPageParams()
            .map { service.listByExternalId(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CustomerCreditLedgerListByExternalIdParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerCreditLedgerListByExternalIdPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditLedgerListByExternalIdPageAsync].
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

    /** A builder for [CustomerCreditLedgerListByExternalIdPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerServiceAsync? = null
        private var params: CustomerCreditLedgerListByExternalIdParams? = null
        private var response: CustomerCreditLedgerListByExternalIdPageResponse? = null

        @JvmSynthetic
        internal fun from(
            customerCreditLedgerListByExternalIdPageAsync:
                CustomerCreditLedgerListByExternalIdPageAsync
        ) = apply {
            service = customerCreditLedgerListByExternalIdPageAsync.service
            params = customerCreditLedgerListByExternalIdPageAsync.params
            response = customerCreditLedgerListByExternalIdPageAsync.response
        }

        fun service(service: LedgerServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerCreditLedgerListByExternalIdParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: CustomerCreditLedgerListByExternalIdPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerCreditLedgerListByExternalIdPageAsync].
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
        fun build(): CustomerCreditLedgerListByExternalIdPageAsync =
            CustomerCreditLedgerListByExternalIdPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CustomerCreditLedgerListByExternalIdPageAsync) {

        fun forEach(
            action: Predicate<CustomerCreditLedgerListByExternalIdResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CustomerCreditLedgerListByExternalIdPageAsync>>.forEach(
                action: (CustomerCreditLedgerListByExternalIdResponse) -> Boolean,
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
        ): CompletableFuture<List<CustomerCreditLedgerListByExternalIdResponse>> {
            val values = mutableListOf<CustomerCreditLedgerListByExternalIdResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListByExternalIdPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerListByExternalIdPageAsync{service=$service, params=$params, response=$response}"
}
