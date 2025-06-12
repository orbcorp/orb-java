// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.BetaCreatePlanVersionParams
import com.withorb.api.models.BetaFetchPlanVersionParams
import com.withorb.api.models.BetaSetDefaultPlanVersionParams
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanVersion
import com.withorb.api.services.async.beta.ExternalPlanIdServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BetaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaServiceAsync

    fun externalPlanId(): ExternalPlanIdServiceAsync

    /**
     * This API endpoint is in beta and its interface may change. It is recommended for use only in
     * test mode.
     *
     * This endpoint allows the creation of a new plan version for an existing plan.
     */
    fun createPlanVersion(
        planId: String,
        params: BetaCreatePlanVersionParams,
    ): CompletableFuture<PlanVersion> = createPlanVersion(planId, params, RequestOptions.none())

    /** @see [createPlanVersion] */
    fun createPlanVersion(
        planId: String,
        params: BetaCreatePlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersion> =
        createPlanVersion(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see [createPlanVersion] */
    fun createPlanVersion(params: BetaCreatePlanVersionParams): CompletableFuture<PlanVersion> =
        createPlanVersion(params, RequestOptions.none())

    /** @see [createPlanVersion] */
    fun createPlanVersion(
        params: BetaCreatePlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersion>

    /**
     * This API endpoint is in beta and its interface may change. It is recommended for use only in
     * test mode.
     *
     * This endpoint is used to fetch a plan version. It returns the phases, prices, and adjustments
     * present on this version of the plan.
     */
    fun fetchPlanVersion(
        version: String,
        params: BetaFetchPlanVersionParams,
    ): CompletableFuture<PlanVersion> = fetchPlanVersion(version, params, RequestOptions.none())

    /** @see [fetchPlanVersion] */
    fun fetchPlanVersion(
        version: String,
        params: BetaFetchPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersion> =
        fetchPlanVersion(params.toBuilder().version(version).build(), requestOptions)

    /** @see [fetchPlanVersion] */
    fun fetchPlanVersion(params: BetaFetchPlanVersionParams): CompletableFuture<PlanVersion> =
        fetchPlanVersion(params, RequestOptions.none())

    /** @see [fetchPlanVersion] */
    fun fetchPlanVersion(
        params: BetaFetchPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersion>

    /**
     * This API endpoint is in beta and its interface may change. It is recommended for use only in
     * test mode.
     *
     * This endpoint allows setting the default version of a plan.
     */
    fun setDefaultPlanVersion(
        planId: String,
        params: BetaSetDefaultPlanVersionParams,
    ): CompletableFuture<Plan> = setDefaultPlanVersion(planId, params, RequestOptions.none())

    /** @see [setDefaultPlanVersion] */
    fun setDefaultPlanVersion(
        planId: String,
        params: BetaSetDefaultPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan> =
        setDefaultPlanVersion(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see [setDefaultPlanVersion] */
    fun setDefaultPlanVersion(params: BetaSetDefaultPlanVersionParams): CompletableFuture<Plan> =
        setDefaultPlanVersion(params, RequestOptions.none())

    /** @see [setDefaultPlanVersion] */
    fun setDefaultPlanVersion(
        params: BetaSetDefaultPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /** A view of [BetaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaServiceAsync.WithRawResponse

        fun externalPlanId(): ExternalPlanIdServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /plans/{plan_id}/versions`, but is otherwise the
         * same as [BetaServiceAsync.createPlanVersion].
         */
        fun createPlanVersion(
            planId: String,
            params: BetaCreatePlanVersionParams,
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            createPlanVersion(planId, params, RequestOptions.none())

        /** @see [createPlanVersion] */
        fun createPlanVersion(
            planId: String,
            params: BetaCreatePlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            createPlanVersion(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see [createPlanVersion] */
        fun createPlanVersion(
            params: BetaCreatePlanVersionParams
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            createPlanVersion(params, RequestOptions.none())

        /** @see [createPlanVersion] */
        fun createPlanVersion(
            params: BetaCreatePlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>>

        /**
         * Returns a raw HTTP response for `get /plans/{plan_id}/versions/{version}`, but is
         * otherwise the same as [BetaServiceAsync.fetchPlanVersion].
         */
        fun fetchPlanVersion(
            version: String,
            params: BetaFetchPlanVersionParams,
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            fetchPlanVersion(version, params, RequestOptions.none())

        /** @see [fetchPlanVersion] */
        fun fetchPlanVersion(
            version: String,
            params: BetaFetchPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            fetchPlanVersion(params.toBuilder().version(version).build(), requestOptions)

        /** @see [fetchPlanVersion] */
        fun fetchPlanVersion(
            params: BetaFetchPlanVersionParams
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            fetchPlanVersion(params, RequestOptions.none())

        /** @see [fetchPlanVersion] */
        fun fetchPlanVersion(
            params: BetaFetchPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>>

        /**
         * Returns a raw HTTP response for `post /plans/{plan_id}/set_default_version`, but is
         * otherwise the same as [BetaServiceAsync.setDefaultPlanVersion].
         */
        fun setDefaultPlanVersion(
            planId: String,
            params: BetaSetDefaultPlanVersionParams,
        ): CompletableFuture<HttpResponseFor<Plan>> =
            setDefaultPlanVersion(planId, params, RequestOptions.none())

        /** @see [setDefaultPlanVersion] */
        fun setDefaultPlanVersion(
            planId: String,
            params: BetaSetDefaultPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> =
            setDefaultPlanVersion(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see [setDefaultPlanVersion] */
        fun setDefaultPlanVersion(
            params: BetaSetDefaultPlanVersionParams
        ): CompletableFuture<HttpResponseFor<Plan>> =
            setDefaultPlanVersion(params, RequestOptions.none())

        /** @see [setDefaultPlanVersion] */
        fun setDefaultPlanVersion(
            params: BetaSetDefaultPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>
    }
}
