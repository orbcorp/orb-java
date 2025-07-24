// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.coupons.SubscriptionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SubscriptionService.list */
class CouponSubscriptionListPage
private constructor(
    private val service: SubscriptionService,
    private val params: CouponSubscriptionListParams,
    private val response: Subscriptions,
) : Page<Subscription> {

    /**
     * Delegates to [Subscriptions], but gracefully handles missing data.
     *
     * @see Subscriptions.data
     */
    fun data(): List<Subscription> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [Subscriptions], but gracefully handles missing data.
     *
     * @see Subscriptions.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<Subscription> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): CouponSubscriptionListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CouponSubscriptionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Subscription> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CouponSubscriptionListParams = params

    /** The response that this page was parsed from. */
    fun response(): Subscriptions = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CouponSubscriptionListPage].
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

    /** A builder for [CouponSubscriptionListPage]. */
    class Builder internal constructor() {

        private var service: SubscriptionService? = null
        private var params: CouponSubscriptionListParams? = null
        private var response: Subscriptions? = null

        @JvmSynthetic
        internal fun from(couponSubscriptionListPage: CouponSubscriptionListPage) = apply {
            service = couponSubscriptionListPage.service
            params = couponSubscriptionListPage.params
            response = couponSubscriptionListPage.response
        }

        fun service(service: SubscriptionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CouponSubscriptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: Subscriptions) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CouponSubscriptionListPage].
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
        fun build(): CouponSubscriptionListPage =
            CouponSubscriptionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CouponSubscriptionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CouponSubscriptionListPage{service=$service, params=$params, response=$response}"
}
