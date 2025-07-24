// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanExternalPlanIdFetchParams
import com.withorb.api.models.PlanExternalPlanIdUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExternalPlanIdServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalPlanIdServiceAsync

    /**
     * This endpoint can be used to update the `external_plan_id`, and `metadata` of an existing
     * plan.
     *
     * Other fields on a plan are currently immutable.
     */
    fun update(otherExternalPlanId: String): CompletableFuture<Plan> =
        update(otherExternalPlanId, PlanExternalPlanIdUpdateParams.none())

    /** @see update */
    fun update(
        otherExternalPlanId: String,
        params: PlanExternalPlanIdUpdateParams = PlanExternalPlanIdUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan> =
        update(params.toBuilder().otherExternalPlanId(otherExternalPlanId).build(), requestOptions)

    /** @see update */
    fun update(
        otherExternalPlanId: String,
        params: PlanExternalPlanIdUpdateParams = PlanExternalPlanIdUpdateParams.none(),
    ): CompletableFuture<Plan> = update(otherExternalPlanId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PlanExternalPlanIdUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /** @see update */
    fun update(params: PlanExternalPlanIdUpdateParams): CompletableFuture<Plan> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        otherExternalPlanId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Plan> =
        update(otherExternalPlanId, PlanExternalPlanIdUpdateParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch [plan](/core-concepts##plan-and-price) details given an
     * external_plan_id identifier. It returns information about the prices included in the plan and
     * their configuration, as well as the product that the plan is attached to.
     *
     * If multiple plans are found to contain the specified external_plan_id, the active plans will
     * take priority over archived ones, and among those, the endpoint will return the most recently
     * created plan.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given [Price](/core-concepts#plan-and-price) object. The
     * `model_type` field determines the key for the configuration object that is present. A
     * detailed explanation of price types can be found in the
     * [Price schema](/core-concepts#plan-and-price). "
     */
    fun fetch(externalPlanId: String): CompletableFuture<Plan> =
        fetch(externalPlanId, PlanExternalPlanIdFetchParams.none())

    /** @see fetch */
    fun fetch(
        externalPlanId: String,
        params: PlanExternalPlanIdFetchParams = PlanExternalPlanIdFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan> =
        fetch(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

    /** @see fetch */
    fun fetch(
        externalPlanId: String,
        params: PlanExternalPlanIdFetchParams = PlanExternalPlanIdFetchParams.none(),
    ): CompletableFuture<Plan> = fetch(externalPlanId, params, RequestOptions.none())

    /** @see fetch */
    fun fetch(
        params: PlanExternalPlanIdFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /** @see fetch */
    fun fetch(params: PlanExternalPlanIdFetchParams): CompletableFuture<Plan> =
        fetch(params, RequestOptions.none())

    /** @see fetch */
    fun fetch(externalPlanId: String, requestOptions: RequestOptions): CompletableFuture<Plan> =
        fetch(externalPlanId, PlanExternalPlanIdFetchParams.none(), requestOptions)

    /**
     * A view of [ExternalPlanIdServiceAsync] that provides access to raw HTTP responses for each
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
        ): ExternalPlanIdServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /plans/external_plan_id/{external_plan_id}`, but is
         * otherwise the same as [ExternalPlanIdServiceAsync.update].
         */
        fun update(otherExternalPlanId: String): CompletableFuture<HttpResponseFor<Plan>> =
            update(otherExternalPlanId, PlanExternalPlanIdUpdateParams.none())

        /** @see update */
        fun update(
            otherExternalPlanId: String,
            params: PlanExternalPlanIdUpdateParams = PlanExternalPlanIdUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> =
            update(
                params.toBuilder().otherExternalPlanId(otherExternalPlanId).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            otherExternalPlanId: String,
            params: PlanExternalPlanIdUpdateParams = PlanExternalPlanIdUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> =
            update(otherExternalPlanId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PlanExternalPlanIdUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>

        /** @see update */
        fun update(
            params: PlanExternalPlanIdUpdateParams
        ): CompletableFuture<HttpResponseFor<Plan>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            otherExternalPlanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Plan>> =
            update(otherExternalPlanId, PlanExternalPlanIdUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /plans/external_plan_id/{external_plan_id}`, but is
         * otherwise the same as [ExternalPlanIdServiceAsync.fetch].
         */
        fun fetch(externalPlanId: String): CompletableFuture<HttpResponseFor<Plan>> =
            fetch(externalPlanId, PlanExternalPlanIdFetchParams.none())

        /** @see fetch */
        fun fetch(
            externalPlanId: String,
            params: PlanExternalPlanIdFetchParams = PlanExternalPlanIdFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> =
            fetch(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

        /** @see fetch */
        fun fetch(
            externalPlanId: String,
            params: PlanExternalPlanIdFetchParams = PlanExternalPlanIdFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> =
            fetch(externalPlanId, params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            params: PlanExternalPlanIdFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>

        /** @see fetch */
        fun fetch(params: PlanExternalPlanIdFetchParams): CompletableFuture<HttpResponseFor<Plan>> =
            fetch(params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            externalPlanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Plan>> =
            fetch(externalPlanId, PlanExternalPlanIdFetchParams.none(), requestOptions)
    }
}
