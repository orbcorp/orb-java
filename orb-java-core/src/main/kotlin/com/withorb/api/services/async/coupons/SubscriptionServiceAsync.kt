// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.coupons

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CouponSubscriptionListPageAsync
import com.withorb.api.models.CouponSubscriptionListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync

    /**
     * This endpoint returns a list of all subscriptions that have redeemed a given coupon as a
     * [paginated](/api-reference/pagination) list, ordered starting from the most recently created
     * subscription. For a full discussion of the subscription resource, see
     * [Subscription](/core-concepts#subscription).
     */
    fun list(couponId: String): CompletableFuture<CouponSubscriptionListPageAsync> =
        list(couponId, CouponSubscriptionListParams.none())

    /** @see list */
    fun list(
        couponId: String,
        params: CouponSubscriptionListParams = CouponSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CouponSubscriptionListPageAsync> =
        list(params.toBuilder().couponId(couponId).build(), requestOptions)

    /** @see list */
    fun list(
        couponId: String,
        params: CouponSubscriptionListParams = CouponSubscriptionListParams.none(),
    ): CompletableFuture<CouponSubscriptionListPageAsync> =
        list(couponId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CouponSubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CouponSubscriptionListPageAsync>

    /** @see list */
    fun list(
        params: CouponSubscriptionListParams
    ): CompletableFuture<CouponSubscriptionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        couponId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CouponSubscriptionListPageAsync> =
        list(couponId, CouponSubscriptionListParams.none(), requestOptions)

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /coupons/{coupon_id}/subscriptions`, but is
         * otherwise the same as [SubscriptionServiceAsync.list].
         */
        fun list(
            couponId: String
        ): CompletableFuture<HttpResponseFor<CouponSubscriptionListPageAsync>> =
            list(couponId, CouponSubscriptionListParams.none())

        /** @see list */
        fun list(
            couponId: String,
            params: CouponSubscriptionListParams = CouponSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CouponSubscriptionListPageAsync>> =
            list(params.toBuilder().couponId(couponId).build(), requestOptions)

        /** @see list */
        fun list(
            couponId: String,
            params: CouponSubscriptionListParams = CouponSubscriptionListParams.none(),
        ): CompletableFuture<HttpResponseFor<CouponSubscriptionListPageAsync>> =
            list(couponId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CouponSubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CouponSubscriptionListPageAsync>>

        /** @see list */
        fun list(
            params: CouponSubscriptionListParams
        ): CompletableFuture<HttpResponseFor<CouponSubscriptionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            couponId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CouponSubscriptionListPageAsync>> =
            list(couponId, CouponSubscriptionListParams.none(), requestOptions)
    }
}
