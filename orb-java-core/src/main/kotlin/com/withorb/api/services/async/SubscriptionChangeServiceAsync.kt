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
        subscriptionChangeId: String
    ): CompletableFuture<SubscriptionChangeRetrieveResponse> =
        retrieve(subscriptionChangeId, SubscriptionChangeRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        subscriptionChangeId: String,
        params: SubscriptionChangeRetrieveParams = SubscriptionChangeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionChangeRetrieveResponse> =
        retrieve(
            params.toBuilder().subscriptionChangeId(subscriptionChangeId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        subscriptionChangeId: String,
        params: SubscriptionChangeRetrieveParams = SubscriptionChangeRetrieveParams.none(),
    ): CompletableFuture<SubscriptionChangeRetrieveResponse> =
        retrieve(subscriptionChangeId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SubscriptionChangeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionChangeRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: SubscriptionChangeRetrieveParams
    ): CompletableFuture<SubscriptionChangeRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        subscriptionChangeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionChangeRetrieveResponse> =
        retrieve(subscriptionChangeId, SubscriptionChangeRetrieveParams.none(), requestOptions)

    /**
     * Apply a subscription change to perform the intended action. If a positive amount is passed
     * with a request to this endpoint, any eligible invoices that were created will be issued
     * immediately if they only contain in-advance fees.
     */
    fun apply(subscriptionChangeId: String): CompletableFuture<SubscriptionChangeApplyResponse> =
        apply(subscriptionChangeId, SubscriptionChangeApplyParams.none())

    /** @see [apply] */
    fun apply(
        subscriptionChangeId: String,
        params: SubscriptionChangeApplyParams = SubscriptionChangeApplyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionChangeApplyResponse> =
        apply(params.toBuilder().subscriptionChangeId(subscriptionChangeId).build(), requestOptions)

    /** @see [apply] */
    fun apply(
        subscriptionChangeId: String,
        params: SubscriptionChangeApplyParams = SubscriptionChangeApplyParams.none(),
    ): CompletableFuture<SubscriptionChangeApplyResponse> =
        apply(subscriptionChangeId, params, RequestOptions.none())

    /** @see [apply] */
    fun apply(
        params: SubscriptionChangeApplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionChangeApplyResponse>

    /** @see [apply] */
    fun apply(
        params: SubscriptionChangeApplyParams
    ): CompletableFuture<SubscriptionChangeApplyResponse> = apply(params, RequestOptions.none())

    /** @see [apply] */
    fun apply(
        subscriptionChangeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionChangeApplyResponse> =
        apply(subscriptionChangeId, SubscriptionChangeApplyParams.none(), requestOptions)

    /**
     * Cancel a subscription change. The change can no longer be applied. A subscription can only
     * have one "pending" change at a time - use this endpoint to cancel an existing change before
     * creating a new one.
     */
    fun cancel(subscriptionChangeId: String): CompletableFuture<SubscriptionChangeCancelResponse> =
        cancel(subscriptionChangeId, SubscriptionChangeCancelParams.none())

    /** @see [cancel] */
    fun cancel(
        subscriptionChangeId: String,
        params: SubscriptionChangeCancelParams = SubscriptionChangeCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionChangeCancelResponse> =
        cancel(
            params.toBuilder().subscriptionChangeId(subscriptionChangeId).build(),
            requestOptions,
        )

    /** @see [cancel] */
    fun cancel(
        subscriptionChangeId: String,
        params: SubscriptionChangeCancelParams = SubscriptionChangeCancelParams.none(),
    ): CompletableFuture<SubscriptionChangeCancelResponse> =
        cancel(subscriptionChangeId, params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: SubscriptionChangeCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionChangeCancelResponse>

    /** @see [cancel] */
    fun cancel(
        params: SubscriptionChangeCancelParams
    ): CompletableFuture<SubscriptionChangeCancelResponse> = cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        subscriptionChangeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionChangeCancelResponse> =
        cancel(subscriptionChangeId, SubscriptionChangeCancelParams.none(), requestOptions)

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
            subscriptionChangeId: String
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeRetrieveResponse>> =
            retrieve(subscriptionChangeId, SubscriptionChangeRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            subscriptionChangeId: String,
            params: SubscriptionChangeRetrieveParams = SubscriptionChangeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeRetrieveResponse>> =
            retrieve(
                params.toBuilder().subscriptionChangeId(subscriptionChangeId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            subscriptionChangeId: String,
            params: SubscriptionChangeRetrieveParams = SubscriptionChangeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeRetrieveResponse>> =
            retrieve(subscriptionChangeId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SubscriptionChangeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SubscriptionChangeRetrieveParams
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            subscriptionChangeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeRetrieveResponse>> =
            retrieve(subscriptionChangeId, SubscriptionChangeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /subscription_changes/{subscription_change_id}/apply`, but is otherwise the same as
         * [SubscriptionChangeServiceAsync.apply].
         */
        @MustBeClosed
        fun apply(
            subscriptionChangeId: String
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeApplyResponse>> =
            apply(subscriptionChangeId, SubscriptionChangeApplyParams.none())

        /** @see [apply] */
        @MustBeClosed
        fun apply(
            subscriptionChangeId: String,
            params: SubscriptionChangeApplyParams = SubscriptionChangeApplyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeApplyResponse>> =
            apply(
                params.toBuilder().subscriptionChangeId(subscriptionChangeId).build(),
                requestOptions,
            )

        /** @see [apply] */
        @MustBeClosed
        fun apply(
            subscriptionChangeId: String,
            params: SubscriptionChangeApplyParams = SubscriptionChangeApplyParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeApplyResponse>> =
            apply(subscriptionChangeId, params, RequestOptions.none())

        /** @see [apply] */
        @MustBeClosed
        fun apply(
            params: SubscriptionChangeApplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeApplyResponse>>

        /** @see [apply] */
        @MustBeClosed
        fun apply(
            params: SubscriptionChangeApplyParams
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeApplyResponse>> =
            apply(params, RequestOptions.none())

        /** @see [apply] */
        @MustBeClosed
        fun apply(
            subscriptionChangeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeApplyResponse>> =
            apply(subscriptionChangeId, SubscriptionChangeApplyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /subscription_changes/{subscription_change_id}/cancel`, but is otherwise the same as
         * [SubscriptionChangeServiceAsync.cancel].
         */
        @MustBeClosed
        fun cancel(
            subscriptionChangeId: String
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeCancelResponse>> =
            cancel(subscriptionChangeId, SubscriptionChangeCancelParams.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            subscriptionChangeId: String,
            params: SubscriptionChangeCancelParams = SubscriptionChangeCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeCancelResponse>> =
            cancel(
                params.toBuilder().subscriptionChangeId(subscriptionChangeId).build(),
                requestOptions,
            )

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            subscriptionChangeId: String,
            params: SubscriptionChangeCancelParams = SubscriptionChangeCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeCancelResponse>> =
            cancel(subscriptionChangeId, params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: SubscriptionChangeCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeCancelResponse>>

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: SubscriptionChangeCancelParams
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            subscriptionChangeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionChangeCancelResponse>> =
            cancel(subscriptionChangeId, SubscriptionChangeCancelParams.none(), requestOptions)
    }
}
