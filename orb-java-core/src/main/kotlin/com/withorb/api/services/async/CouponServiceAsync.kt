// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CouponArchiveParams
import com.withorb.api.models.CouponCreateParams
import com.withorb.api.models.CouponFetchParams
import com.withorb.api.models.CouponListPageAsync
import com.withorb.api.models.CouponListParams
import com.withorb.api.models.CouponModel
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
    @JvmOverloads
    fun create(
        params: CouponCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CouponModel>

    /**
     * This endpoint returns a list of all coupons for an account in a list format.
     *
     * The list of coupons is ordered starting from the most recently created coupon. The response
     * also includes `pagination_metadata`, which lets the caller retrieve the next page of results
     * if they exist. More information about pagination can be found in the Pagination-metadata
     * schema.
     */
    @JvmOverloads
    fun list(
        params: CouponListParams = CouponListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CouponListPageAsync>

    /**
     * This endpoint returns a list of all coupons for an account in a list format.
     *
     * The list of coupons is ordered starting from the most recently created coupon. The response
     * also includes `pagination_metadata`, which lets the caller retrieve the next page of results
     * if they exist. More information about pagination can be found in the Pagination-metadata
     * schema.
     */
    fun list(requestOptions: RequestOptions): CompletableFuture<CouponListPageAsync> =
        list(CouponListParams.none(), requestOptions)

    /**
     * This endpoint allows a coupon to be archived. Archived coupons can no longer be redeemed, and
     * will be hidden from lists of active coupons. Additionally, once a coupon is archived, its
     * redemption code can be reused for a different coupon.
     */
    @JvmOverloads
    fun archive(
        params: CouponArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CouponModel>

    /**
     * This endpoint retrieves a coupon by its ID. To fetch coupons by their redemption code, use
     * the [List coupons](list-coupons) endpoint with the redemption_code parameter.
     */
    @JvmOverloads
    fun fetch(
        params: CouponFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CouponModel>

    /**
     * A view of [CouponServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /coupons`, but is otherwise the same as
         * [CouponServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CouponModel>>

        /**
         * Returns a raw HTTP response for `get /coupons`, but is otherwise the same as
         * [CouponServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CouponListParams = CouponListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CouponListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /coupons`, but is otherwise the same as
         * [CouponServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CouponListPageAsync>> =
            list(CouponListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /coupons/{coupon_id}/archive`, but is otherwise the
         * same as [CouponServiceAsync.archive].
         */
        @JvmOverloads
        @MustBeClosed
        fun archive(
            params: CouponArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CouponModel>>

        /**
         * Returns a raw HTTP response for `get /coupons/{coupon_id}`, but is otherwise the same as
         * [CouponServiceAsync.fetch].
         */
        @JvmOverloads
        @MustBeClosed
        fun fetch(
            params: CouponFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CouponModel>>
    }
}
