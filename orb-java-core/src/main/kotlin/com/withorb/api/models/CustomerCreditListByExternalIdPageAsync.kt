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
class CustomerCreditListByExternalIdPageAsync
private constructor(
    private val creditsService: CreditServiceAsync,
    private val params: CustomerCreditListByExternalIdParams,
    private val response: CustomerCreditListByExternalIdPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CustomerCreditListByExternalIdPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditListByExternalIdPageAsync && creditsService == other.creditsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditListByExternalIdPageAsync{creditsService=$creditsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<CustomerCreditListByExternalIdParams> {
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

    fun getNextPage(): CompletableFuture<Optional<CustomerCreditListByExternalIdPageAsync>> {
        return getNextPageParams()
            .map { creditsService.listByExternalId(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            creditsService: CreditServiceAsync,
            params: CustomerCreditListByExternalIdParams,
            response: CustomerCreditListByExternalIdPageResponse,
        ) = CustomerCreditListByExternalIdPageAsync(creditsService, params, response)
    }

    class AutoPager(private val firstPage: CustomerCreditListByExternalIdPageAsync) {

        fun forEach(
            action: Predicate<CustomerCreditListByExternalIdResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CustomerCreditListByExternalIdPageAsync>>.forEach(
                action: (CustomerCreditListByExternalIdResponse) -> Boolean,
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
        ): CompletableFuture<List<CustomerCreditListByExternalIdResponse>> {
            val values = mutableListOf<CustomerCreditListByExternalIdResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
