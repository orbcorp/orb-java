// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.CouponServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint returns a list of all coupons for an account in a list format.
 *
 * The list of coupons is ordered starting from the most recently created coupon. The response also
 * includes `pagination_metadata`, which lets the caller retrieve the next page of results if they
 * exist. More information about pagination can be found in the Pagination-metadata schema.
 */
class CouponListPageAsync
private constructor(
    private val couponsService: CouponServiceAsync,
    private val params: CouponListParams,
    private val response: CouponListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CouponListPageResponse = response

    /**
     * Delegates to [CouponListPageResponse], but gracefully handles missing data.
     *
     * @see [CouponListPageResponse.data]
     */
    fun data(): List<Coupon> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CouponListPageResponse], but gracefully handles missing data.
     *
     * @see [CouponListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CouponListPageAsync && couponsService == other.couponsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(couponsService, params, response) /* spotless:on */

    override fun toString() =
        "CouponListPageAsync{couponsService=$couponsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<CouponListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<CouponListPageAsync>> {
        return getNextPageParams()
            .map { couponsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            couponsService: CouponServiceAsync,
            params: CouponListParams,
            response: CouponListPageResponse,
        ) = CouponListPageAsync(couponsService, params, response)
    }

    class AutoPager(private val firstPage: CouponListPageAsync) {

        fun forEach(action: Predicate<Coupon>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CouponListPageAsync>>.forEach(
                action: (Coupon) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Coupon>> {
            val values = mutableListOf<Coupon>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
