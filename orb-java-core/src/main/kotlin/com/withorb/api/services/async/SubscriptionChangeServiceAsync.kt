// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.SubscriptionChangeApplyParams
import com.withorb.api.models.SubscriptionChangeApplyResponse
import com.withorb.api.models.SubscriptionChangeCancelParams
import com.withorb.api.models.SubscriptionChangeCancelResponse
import com.withorb.api.models.SubscriptionChangeRetrieveParams
import com.withorb.api.models.SubscriptionChangeRetrieveResponse
import java.util.concurrent.CompletableFuture

interface SubscriptionChangeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint returns a subscription change given an identifier.
     *
     * A subscription change is created by including `Create-Pending-Subscription-Change: True` in
     * the header of a subscription mutation API call (e.g.
     * [create subscription endpoint](/api-reference/subscription/create-subscription), [schedule
     * plan change endpoint](/api-reference/subscription/schedule-plan-change), ...). The
     * subscription change will be referenced by the `pending_subscription_change` field in the
     * response.
     */
    fun retrieve(
        params: SubscriptionChangeRetrieveParams
    ): CompletableFuture<SubscriptionChangeRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SubscriptionChangeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionChangeRetrieveResponse>

    /**
     * Apply a subscription change to perform the intended action. If a positive amount is passed
     * with a request to this endpoint, any eligible invoices that were created will be issued
     * immediately if they only contain in-advance fees.
     */
    fun apply(
        params: SubscriptionChangeApplyParams
    ): CompletableFuture<SubscriptionChangeApplyResponse> = apply(params, RequestOptions.none())

    /** @see [apply] */
    fun apply(
        params: SubscriptionChangeApplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionChangeApplyResponse>

    /**
     * Cancel a subscription change. The change can no longer be applied. A subscription can only
     * have one "pending" change at a time - use this endpoint to cancel an existing change before
     * creating a new one.
     */
    fun cancel(
        params: SubscriptionChangeCancelParams
    ): CompletableFuture<SubscriptionChangeCancelResponse> = cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: SubscriptionChangeCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionChangeCancelResponse>

    /**
     * A view of [SubscriptionChangeServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /subscription_changes/{subscription_change_id}`, but
         * is otherwise the same as [SubscriptionChangeServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: SubscriptionChangeRetrieveParams
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SubscriptionChangeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /subscription_changes/{subscription_change_id}/apply`, but is otherwise the same as
         * [SubscriptionChangeServiceAsync.apply].
         */
        @MustBeClosed
        fun apply(
            params: SubscriptionChangeApplyParams
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeApplyResponse>> =
            apply(params, RequestOptions.none())

        /** @see [apply] */
        @MustBeClosed
        fun apply(
            params: SubscriptionChangeApplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeApplyResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /subscription_changes/{subscription_change_id}/cancel`, but is otherwise the same as
         * [SubscriptionChangeServiceAsync.cancel].
         */
        @MustBeClosed
        fun cancel(
            params: SubscriptionChangeCancelParams
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: SubscriptionChangeCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeCancelResponse>>
    }
}
