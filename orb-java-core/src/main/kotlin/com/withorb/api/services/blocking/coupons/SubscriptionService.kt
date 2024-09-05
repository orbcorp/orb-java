// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking.coupons

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.CouponSubscriptionListPage
import com.withorb.api.models.CouponSubscriptionListParams

interface SubscriptionService {

    /**
     * This endpoint returns a list of all subscriptions that have redeemed a given coupon as a
     * [paginated](../reference/pagination) list, ordered starting from the most recently created
     * subscription. For a full discussion of the subscription resource, see
     * [Subscription](../guides/concepts#subscription).
     */
    @JvmOverloads
    fun list(
        params: CouponSubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CouponSubscriptionListPage
}
