// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.customers.CreditServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
 *
 * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
 * blocks) will be included in the response.
 *
 * Note that `currency` defaults to credits if not specified. To use a real world currency, set
 * `currency` to an ISO 4217 string.
 */
class CustomerCreditListPageAsync
private constructor(
    private val creditsService: CreditServiceAsync,
    private val params: CustomerCreditListParams,
    private val response: CustomerCreditListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerCreditListPageResponse = response

    /**
     * Delegates to [CustomerCreditListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerCreditListPageResponse.data]
     */
    fun data(): List<CustomerCreditListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerCreditListPageResponse], but gracefully handles missing data.
     *
     * @see [CustomerCreditListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditListPageAsync && creditsService == other.creditsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditListPageAsync{creditsService=$creditsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<CustomerCreditListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<CustomerCreditListPageAsync>> {
        return getNextPageParams()
            .map { creditsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            creditsService: CreditServiceAsync,
            params: CustomerCreditListParams,
            response: CustomerCreditListPageResponse,
        ) = CustomerCreditListPageAsync(creditsService, params, response)
    }

    class AutoPager(private val firstPage: CustomerCreditListPageAsync) {

        fun forEach(
            action: Predicate<CustomerCreditListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CustomerCreditListPageAsync>>.forEach(
                action: (CustomerCreditListResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CustomerCreditListResponse>> {
            val values = mutableListOf<CustomerCreditListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
