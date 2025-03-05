// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Alert
import com.withorb.api.models.AlertCreateForCustomerParams
import com.withorb.api.models.AlertCreateForExternalCustomerParams
import com.withorb.api.models.AlertCreateForSubscriptionParams
import com.withorb.api.models.AlertDisableParams
import com.withorb.api.models.AlertEnableParams
import com.withorb.api.models.AlertListPage
import com.withorb.api.models.AlertListParams
import com.withorb.api.models.AlertRetrieveParams
import com.withorb.api.models.AlertUpdateParams

interface AlertService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** This endpoint retrieves an alert by its ID. */
    @JvmOverloads
    fun retrieve(
        params: AlertRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /** This endpoint updates the thresholds of an alert. */
    @JvmOverloads
    fun update(
        params: AlertUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /**
     * This endpoint returns a list of alerts within Orb.
     *
     * The request must specify one of `customer_id`, `external_customer_id`, or `subscription_id`.
     *
     * If querying by subscripion_id, the endpoint will return the subscription level alerts as well
     * as the plan level alerts associated with the subscription.
     *
     * The list of alerts is ordered starting from the most recently created alert. This endpoint
     * follows Orb's [standardized pagination format](/api-reference/pagination).
     */
    @JvmOverloads
    fun list(
        params: AlertListParams = AlertListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertListPage

    /**
     * This endpoint returns a list of alerts within Orb.
     *
     * The request must specify one of `customer_id`, `external_customer_id`, or `subscription_id`.
     *
     * If querying by subscripion_id, the endpoint will return the subscription level alerts as well
     * as the plan level alerts associated with the subscription.
     *
     * The list of alerts is ordered starting from the most recently created alert. This endpoint
     * follows Orb's [standardized pagination format](/api-reference/pagination).
     */
    fun list(requestOptions: RequestOptions): AlertListPage =
        list(AlertListParams.none(), requestOptions)

    /**
     * This endpoint creates a new alert to monitor a customer's credit balance. There are three
     * types of alerts that can be scoped to customers: `credit_balance_depleted`,
     * `credit_balance_dropped`, and `credit_balance_recovered`. Customers can have a maximum of one
     * of each type of alert per [credit balance currency](/product-catalog/prepurchase).
     * `credit_balance_dropped` alerts require a list of thresholds to be provided while
     * `credit_balance_depleted` and `credit_balance_recovered` alerts do not require thresholds.
     */
    @JvmOverloads
    fun createForCustomer(
        params: AlertCreateForCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /**
     * This endpoint creates a new alert to monitor a customer's credit balance. There are three
     * types of alerts that can be scoped to customers: `credit_balance_depleted`,
     * `credit_balance_dropped`, and `credit_balance_recovered`. Customers can have a maximum of one
     * of each type of alert per [credit balance currency](/product-catalog/prepurchase).
     * `credit_balance_dropped` alerts require a list of thresholds to be provided while
     * `credit_balance_depleted` and `credit_balance_recovered` alerts do not require thresholds.
     */
    @JvmOverloads
    fun createForExternalCustomer(
        params: AlertCreateForExternalCustomerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /**
     * This endpoint is used to create alerts at the subscription level.
     *
     * Subscription level alerts can be one of two types: `usage_exceeded` or `cost_exceeded`. A
     * `usage_exceeded` alert is scoped to a particular metric and is triggered when the usage of
     * that metric exceeds predefined thresholds during the current billing cycle. A `cost_exceeded`
     * alert is triggered when the total amount due during the current billing cycle surpasses
     * predefined thresholds. `cost_exceeded` alerts do not include burndown of pre-purchase
     * credits. Each subscription can have one `cost_exceeded` alert and one `usage_exceeded` alert
     * per metric that is a part of the subscription. Alerts are triggered based on usage or cost
     * conditions met during the current billing cycle.
     */
    @JvmOverloads
    fun createForSubscription(
        params: AlertCreateForSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /**
     * This endpoint allows you to disable an alert. To disable a plan-level alert for a specific
     * subscription, you must include the `subscription_id`. The `subscription_id` is not required
     * for customer or subscription level alerts.
     */
    @JvmOverloads
    fun disable(
        params: AlertDisableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /**
     * This endpoint allows you to enable an alert. To enable a plan-level alert for a specific
     * subscription, you must include the `subscription_id`. The `subscription_id` is not required
     * for customer or subscription level alerts.
     */
    @JvmOverloads
    fun enable(
        params: AlertEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Alert

    /** A view of [AlertService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /alerts/{alert_id}`, but is otherwise the same as
         * [AlertService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AlertRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /**
         * Returns a raw HTTP response for `put /alerts/{alert_configuration_id}`, but is otherwise
         * the same as [AlertService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: AlertUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /**
         * Returns a raw HTTP response for `get /alerts`, but is otherwise the same as
         * [AlertService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AlertListParams = AlertListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertListPage>

        /**
         * Returns a raw HTTP response for `get /alerts`, but is otherwise the same as
         * [AlertService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AlertListPage> =
            list(AlertListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /alerts/customer_id/{customer_id}`, but is
         * otherwise the same as [AlertService.createForCustomer].
         */
        @JvmOverloads
        @MustBeClosed
        fun createForCustomer(
            params: AlertCreateForCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /**
         * Returns a raw HTTP response for `post
         * /alerts/external_customer_id/{external_customer_id}`, but is otherwise the same as
         * [AlertService.createForExternalCustomer].
         */
        @JvmOverloads
        @MustBeClosed
        fun createForExternalCustomer(
            params: AlertCreateForExternalCustomerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /**
         * Returns a raw HTTP response for `post /alerts/subscription_id/{subscription_id}`, but is
         * otherwise the same as [AlertService.createForSubscription].
         */
        @JvmOverloads
        @MustBeClosed
        fun createForSubscription(
            params: AlertCreateForSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /**
         * Returns a raw HTTP response for `post /alerts/{alert_configuration_id}/disable`, but is
         * otherwise the same as [AlertService.disable].
         */
        @JvmOverloads
        @MustBeClosed
        fun disable(
            params: AlertDisableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>

        /**
         * Returns a raw HTTP response for `post /alerts/{alert_configuration_id}/enable`, but is
         * otherwise the same as [AlertService.enable].
         */
        @JvmOverloads
        @MustBeClosed
        fun enable(
            params: AlertEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Alert>
    }
}
