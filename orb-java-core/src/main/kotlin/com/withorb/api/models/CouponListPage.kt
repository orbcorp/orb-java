// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.CouponService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CouponService.list */
class CouponListPage
private constructor(
    private val service: CouponService,
    private val params: CouponListParams,
    private val response: CouponListPageResponse,
) : Page<Coupon> {

    /**
     * Delegates to [CouponListPageResponse], but gracefully handles missing data.
     *
     * @see CouponListPageResponse.data
     */
    fun data(): List<Coupon> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CouponListPageResponse], but gracefully handles missing data.
     *
     * @see CouponListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<Coupon> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): CouponListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CouponListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Coupon> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CouponListParams = params

    /** The response that this page was parsed from. */
    fun response(): CouponListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CouponListPage].
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

    /** A builder for [CouponListPage]. */
    class Builder internal constructor() {

        private var service: CouponService? = null
        private var params: CouponListParams? = null
        private var response: CouponListPageResponse? = null

        @JvmSynthetic
        internal fun from(couponListPage: CouponListPage) = apply {
            service = couponListPage.service
            params = couponListPage.params
            response = couponListPage.response
        }

        fun service(service: CouponService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CouponListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CouponListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CouponListPage].
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
        fun build(): CouponListPage =
            CouponListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CouponListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "CouponListPage{service=$service, params=$params, response=$response}"
}
