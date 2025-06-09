// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Coupon
import com.withorb.api.models.CouponArchiveParams
import com.withorb.api.models.CouponCreateParams
import com.withorb.api.models.CouponFetchParams
import com.withorb.api.models.CouponListPageAsync
import com.withorb.api.models.CouponListParams
import com.withorb.api.services.async.coupons.SubscriptionServiceAsync
import java.util.concurrent.CompletableFuture

interface CouponServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun subscriptions(): SubscriptionServiceAsync

    /**
     * This endpoint allows the creation of coupons, which can then be redeemed at subscription
     * creation or plan change.
     */
    fun create(params: CouponCreateParams): CompletableFuture<Coupon> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CouponCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Coupon>

    /**
     * This endpoint returns a list of all coupons for an account in a list format.
     *
     * The list of coupons is ordered starting from the most recently created coupon. The response
     * also includes `pagination_metadata`, which lets the caller retrieve the next page of results
     * if they exist. More information about pagination can be found in the Pagination-metadata
     * schema.
     */
    fun list(): CompletableFuture<CouponListPageAsync> = list(CouponListParams.none())

    /** @see [list] */
    fun list(
        params: CouponListParams = CouponListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CouponListPageAsync>

    /** @see [list] */
    fun list(
        params: CouponListParams = CouponListParams.none()
    ): CompletableFuture<CouponListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CouponListPageAsync> =
        list(CouponListParams.none(), requestOptions)

    /**
     * This endpoint allows a coupon to be archived. Archived coupons can no longer be redeemed, and
     * will be hidden from lists of active coupons. Additionally, once a coupon is archived, its
     * redemption code can be reused for a different coupon.
     */
    fun archive(couponId: String): CompletableFuture<Coupon> =
        archive(couponId, CouponArchiveParams.none())

    /** @see [archive] */
    fun archive(
        couponId: String,
        params: CouponArchiveParams = CouponArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Coupon> =
        archive(params.toBuilder().couponId(couponId).build(), requestOptions)

    /** @see [archive] */
    fun archive(
        couponId: String,
        params: CouponArchiveParams = CouponArchiveParams.none(),
    ): CompletableFuture<Coupon> = archive(couponId, params, RequestOptions.none())

    /** @see [archive] */
    fun archive(
        params: CouponArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Coupon>

    /** @see [archive] */
    fun archive(params: CouponArchiveParams): CompletableFuture<Coupon> =
        archive(params, RequestOptions.none())

    /** @see [archive] */
    fun archive(couponId: String, requestOptions: RequestOptions): CompletableFuture<Coupon> =
        archive(couponId, CouponArchiveParams.none(), requestOptions)

    /**
     * This endpoint retrieves a coupon by its ID. To fetch coupons by their redemption code, use
     * the [List coupons](list-coupons) endpoint with the redemption_code parameter.
     */
    fun fetch(couponId: String): CompletableFuture<Coupon> =
        fetch(couponId, CouponFetchParams.none())

    /** @see [fetch] */
    fun fetch(
        couponId: String,
        params: CouponFetchParams = CouponFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Coupon> =
        fetch(params.toBuilder().couponId(couponId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(
        couponId: String,
        params: CouponFetchParams = CouponFetchParams.none(),
    ): CompletableFuture<Coupon> = fetch(couponId, params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: CouponFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Coupon>

    /** @see [fetch] */
    fun fetch(params: CouponFetchParams): CompletableFuture<Coupon> =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(couponId: String, requestOptions: RequestOptions): CompletableFuture<Coupon> =
        fetch(couponId, CouponFetchParams.none(), requestOptions)

    /**
     * A view of [CouponServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /coupons`, but is otherwise the same as
         * [CouponServiceAsync.create].
         */
        fun create(params: CouponCreateParams): CompletableFuture<HttpResponseFor<Coupon>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Coupon>>

        /**
         * Returns a raw HTTP response for `get /coupons`, but is otherwise the same as
         * [CouponServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CouponListPageAsync>> =
            list(CouponListParams.none())

        /** @see [list] */
        fun list(
            params: CouponListParams = CouponListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CouponListPageAsync>>

        /** @see [list] */
        fun list(
            params: CouponListParams = CouponListParams.none()
        ): CompletableFuture<HttpResponseFor<CouponListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CouponListPageAsync>> =
            list(CouponListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /coupons/{coupon_id}/archive`, but is otherwise the
         * same as [CouponServiceAsync.archive].
         */
        fun archive(couponId: String): CompletableFuture<HttpResponseFor<Coupon>> =
            archive(couponId, CouponArchiveParams.none())

        /** @see [archive] */
        fun archive(
            couponId: String,
            params: CouponArchiveParams = CouponArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Coupon>> =
            archive(params.toBuilder().couponId(couponId).build(), requestOptions)

        /** @see [archive] */
        fun archive(
            couponId: String,
            params: CouponArchiveParams = CouponArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<Coupon>> =
            archive(couponId, params, RequestOptions.none())

        /** @see [archive] */
        fun archive(
            params: CouponArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Coupon>>

        /** @see [archive] */
        fun archive(params: CouponArchiveParams): CompletableFuture<HttpResponseFor<Coupon>> =
            archive(params, RequestOptions.none())

        /** @see [archive] */
        fun archive(
            couponId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Coupon>> =
            archive(couponId, CouponArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /coupons/{coupon_id}`, but is otherwise the same as
         * [CouponServiceAsync.fetch].
         */
        fun fetch(couponId: String): CompletableFuture<HttpResponseFor<Coupon>> =
            fetch(couponId, CouponFetchParams.none())

        /** @see [fetch] */
        fun fetch(
            couponId: String,
            params: CouponFetchParams = CouponFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Coupon>> =
            fetch(params.toBuilder().couponId(couponId).build(), requestOptions)

        /** @see [fetch] */
        fun fetch(
            couponId: String,
            params: CouponFetchParams = CouponFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<Coupon>> =
            fetch(couponId, params, RequestOptions.none())

        /** @see [fetch] */
        fun fetch(
            params: CouponFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Coupon>>

        /** @see [fetch] */
        fun fetch(params: CouponFetchParams): CompletableFuture<HttpResponseFor<Coupon>> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        fun fetch(
            couponId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Coupon>> =
            fetch(couponId, CouponFetchParams.none(), requestOptions)
    }
}
