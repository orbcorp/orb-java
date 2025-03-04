// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async.coupons

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CouponSubscriptionListPageAsync
import com.withorb.api.models.CouponSubscriptionListParams
import java.util.concurrent.CompletableFuture

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint returns a list of all subscriptions that have redeemed a given coupon as a
     * [paginated](/api-reference/pagination) list, ordered starting from the most recently created
     * subscription. For a full discussion of the subscription resource, see
     * [Subscription](/core-concepts#subscription).
     */
    @JvmOverloads
    fun list(
        params: CouponSubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CouponSubscriptionListPageAsync>

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /coupons/{coupon_id}/subscriptions`, but is
         * otherwise the same as [SubscriptionServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CouponSubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CouponSubscriptionListPageAsync>>
    }
}
