// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.customers.BalanceTransactionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * ## The customer balance
 *
 * The customer balance is an amount in the customer's currency, which Orb automatically applies to
 * subsequent invoices. This balance can be adjusted manually via Orb's webapp on the customer
 * details page. You can use this balance to provide a fixed mid-period credit to the customer.
 * Commonly, this is done due to system downtime/SLA violation, or an adhoc adjustment discussed
 * with the customer.
 *
 * If the balance is a positive value at the time of invoicing, it represents that the customer has
 * credit that should be used to offset the amount due on the next issued invoice. In this case, Orb
 * will automatically reduce the next invoice by the balance amount, and roll over any remaining
 * balance if the invoice is fully discounted.
 *
 * If the balance is a negative value at the time of invoicing, Orb will increase the invoice's
 * amount due with a positive adjustment, and reset the balance to 0.
 *
 * This endpoint retrieves all customer balance transactions in reverse chronological order for a
 * single customer, providing a complete audit trail of all adjustments and invoice applications.
 *
 * ## Eligibility
 *
 * The customer balance can only be applied to invoices or adjusted manually if invoices are not
 * synced to a separate invoicing provider. If a payment gateway such as Stripe is used, the balance
 * will be applied to the invoice before forwarding payment to the gateway.
 */
class CustomerBalanceTransactionListPageAsync
private constructor(
    private val balanceTransactionsService: BalanceTransactionServiceAsync,
    private val params: CustomerBalanceTransactionListParams,
    private val response: CustomerBalanceTransactionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerBalanceTransactionListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBalanceTransactionListPageAsync && balanceTransactionsService == other.balanceTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balanceTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerBalanceTransactionListPageAsync{balanceTransactionsService=$balanceTransactionsService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<CustomerBalanceTransactionListPageAsync>> {
        return getNextPageParams()
            .map { balanceTransactionsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            balanceTransactionsService: BalanceTransactionServiceAsync,
            params: CustomerBalanceTransactionListParams,
            response: CustomerBalanceTransactionListPageResponse,
        ) = CustomerBalanceTransactionListPageAsync(balanceTransactionsService, params, response)
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
}
