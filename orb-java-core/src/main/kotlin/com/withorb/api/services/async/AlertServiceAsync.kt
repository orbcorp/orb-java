// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Alert
import com.withorb.api.models.AlertCreateForCustomerParams
import com.withorb.api.models.AlertCreateForExternalCustomerParams
import com.withorb.api.models.AlertCreateForSubscriptionParams
import com.withorb.api.models.AlertDisableParams
import com.withorb.api.models.AlertEnableParams
import com.withorb.api.models.AlertListPageAsync
import com.withorb.api.models.AlertListParams
import com.withorb.api.models.AlertRetrieveParams
import com.withorb.api.models.AlertUpdateParams
import java.util.concurrent.CompletableFuture

interface AlertServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** This endpoint retrieves an alert by its ID. */
    fun retrieve(params: AlertRetrieveParams): CompletableFuture<Alert> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: AlertRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Alert>

    /** This endpoint updates the thresholds of an alert. */
    fun update(params: AlertUpdateParams): CompletableFuture<Alert> =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: AlertUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Alert>

    /**
     * This endpoint returns a list of alerts within Orb.
     *
     * The request must specify one of `customer_id`, `external_customer_id`, or
     * `subscription_id`.
     *
     * If querying by subscripion_id, the endpoint will return the subscription level
     * alerts as well as the plan level alerts associated with the subscription.
     *
     * The list of alerts is ordered starting from the most recently created alert.
     * This endpoint follows Orb's
     * [standardized pagination format](/api-reference/pagination).
     */
    fun list(): CompletableFuture<AlertListPageAsync> = list(AlertListParams.none())

    /** @see [list] */
    fun list(params: AlertListParams = AlertListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AlertListPageAsync>

    /** @see [list] */
    fun list(params: AlertListParams = AlertListParams.none()): CompletableFuture<AlertListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AlertListPageAsync> = list(AlertListParams.none(), requestOptions)

    /**
     * This endpoint creates a new alert to monitor a customer's credit balance. There
     * are three types of alerts that can be scoped to customers:
     * `credit_balance_depleted`, `credit_balance_dropped`, and
     * `credit_balance_recovered`. Customers can have a maximum of one of each type of
     * alert per [credit balance currency](/product-catalog/prepurchase).
     * `credit_balance_dropped` alerts require a list of thresholds to be provided
     * while `credit_balance_depleted` and `credit_balance_recovered` alerts do not
     * require thresholds.
     */
    fun createForCustomer(params: AlertCreateForCustomerParams): CompletableFuture<Alert> =
        createForCustomer(
          params, RequestOptions.none()
        )

    /** @see [createForCustomer] */
    fun createForCustomer(params: AlertCreateForCustomerParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Alert>

    /**
     * This endpoint creates a new alert to monitor a customer's credit balance. There
     * are three types of alerts that can be scoped to customers:
     * `credit_balance_depleted`, `credit_balance_dropped`, and
     * `credit_balance_recovered`. Customers can have a maximum of one of each type of
     * alert per [credit balance currency](/product-catalog/prepurchase).
     * `credit_balance_dropped` alerts require a list of thresholds to be provided
     * while `credit_balance_depleted` and `credit_balance_recovered` alerts do not
     * require thresholds.
     */
    fun createForExternalCustomer(params: AlertCreateForExternalCustomerParams): CompletableFuture<Alert> =
        createForExternalCustomer(
          params, RequestOptions.none()
        )

    /** @see [createForExternalCustomer] */
    fun createForExternalCustomer(params: AlertCreateForExternalCustomerParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Alert>

    /**
     * This endpoint is used to create alerts at the subscription level.
     *
     * Subscription level alerts can be one of two types: `usage_exceeded` or
     * `cost_exceeded`. A `usage_exceeded` alert is scoped to a particular metric and
     * is triggered when the usage of that metric exceeds predefined thresholds during
     * the current billing cycle. A `cost_exceeded` alert is triggered when the total
     * amount due during the current billing cycle surpasses predefined thresholds.
     * `cost_exceeded` alerts do not include burndown of pre-purchase credits. Each
     * subscription can have one `cost_exceeded` alert and one `usage_exceeded` alert
     * per metric that is a part of the subscription. Alerts are triggered based on
     * usage or cost conditions met during the current billing cycle.
     */
    fun createForSubscription(params: AlertCreateForSubscriptionParams): CompletableFuture<Alert> =
        createForSubscription(
          params, RequestOptions.none()
        )

    /** @see [createForSubscription] */
    fun createForSubscription(params: AlertCreateForSubscriptionParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Alert>

    /**
     * This endpoint allows you to disable an alert. To disable a plan-level alert for
     * a specific subscription, you must include the `subscription_id`. The
     * `subscription_id` is not required for customer or subscription level alerts.
     */
    fun disable(params: AlertDisableParams): CompletableFuture<Alert> =
        disable(
          params, RequestOptions.none()
        )

    /** @see [disable] */
    fun disable(params: AlertDisableParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Alert>

    /**
     * This endpoint allows you to enable an alert. To enable a plan-level alert for a
     * specific subscription, you must include the `subscription_id`. The
     * `subscription_id` is not required for customer or subscription level alerts.
     */
    fun enable(params: AlertEnableParams): CompletableFuture<Alert> =
        enable(
          params, RequestOptions.none()
        )

    /** @see [enable] */
    fun enable(params: AlertEnableParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Alert>

    /**
     * A view of [AlertServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /alerts/{alert_id}`, but is otherwise the
         * same as [AlertServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: AlertRetrieveParams): CompletableFuture<HttpResponseFor<Alert>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: AlertRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Alert>>

        /**
         * Returns a raw HTTP response for `put /alerts/{alert_configuration_id}`, but is
         * otherwise the same as [AlertServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: AlertUpdateParams): CompletableFuture<HttpResponseFor<Alert>> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: AlertUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Alert>>

        /**
         * Returns a raw HTTP response for `get /alerts`, but is otherwise the same as
         * [AlertServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AlertListPageAsync>> = list(AlertListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: AlertListParams = AlertListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AlertListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: AlertListParams = AlertListParams.none()): CompletableFuture<HttpResponseFor<AlertListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AlertListPageAsync>> = list(AlertListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /alerts/customer_id/{customer_id}`, but is
         * otherwise the same as [AlertServiceAsync.createForCustomer].
         */
        @MustBeClosed
        fun createForCustomer(params: AlertCreateForCustomerParams): CompletableFuture<HttpResponseFor<Alert>> =
            createForCustomer(
              params, RequestOptions.none()
            )

        /** @see [createForCustomer] */
        @MustBeClosed
        fun createForCustomer(params: AlertCreateForCustomerParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Alert>>

        /**
         * Returns a raw HTTP response for
         * `post /alerts/external_customer_id/{external_customer_id}`, but is otherwise the
         * same as [AlertServiceAsync.createForExternalCustomer].
         */
        @MustBeClosed
        fun createForExternalCustomer(params: AlertCreateForExternalCustomerParams): CompletableFuture<HttpResponseFor<Alert>> =
            createForExternalCustomer(
              params, RequestOptions.none()
            )

        /** @see [createForExternalCustomer] */
        @MustBeClosed
        fun createForExternalCustomer(params: AlertCreateForExternalCustomerParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Alert>>

        /**
         * Returns a raw HTTP response for
         * `post /alerts/subscription_id/{subscription_id}`, but is otherwise the same as
         * [AlertServiceAsync.createForSubscription].
         */
        @MustBeClosed
        fun createForSubscription(params: AlertCreateForSubscriptionParams): CompletableFuture<HttpResponseFor<Alert>> =
            createForSubscription(
              params, RequestOptions.none()
            )

        /** @see [createForSubscription] */
        @MustBeClosed
        fun createForSubscription(params: AlertCreateForSubscriptionParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Alert>>

        /**
         * Returns a raw HTTP response for `post /alerts/{alert_configuration_id}/disable`,
         * but is otherwise the same as [AlertServiceAsync.disable].
         */
        @MustBeClosed
        fun disable(params: AlertDisableParams): CompletableFuture<HttpResponseFor<Alert>> =
            disable(
              params, RequestOptions.none()
            )

        /** @see [disable] */
        @MustBeClosed
        fun disable(params: AlertDisableParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Alert>>

        /**
         * Returns a raw HTTP response for `post /alerts/{alert_configuration_id}/enable`,
         * but is otherwise the same as [AlertServiceAsync.enable].
         */
        @MustBeClosed
        fun enable(params: AlertEnableParams): CompletableFuture<HttpResponseFor<Alert>> =
            enable(
              params, RequestOptions.none()
            )

        /** @see [enable] */
        @MustBeClosed
        fun enable(params: AlertEnableParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Alert>>
    }
}
