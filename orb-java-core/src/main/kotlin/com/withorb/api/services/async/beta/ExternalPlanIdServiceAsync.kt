// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.beta

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.BetaExternalPlanIdCreatePlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdFetchPlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdSetDefaultPlanVersionParams
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanVersion
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
     * This API endpoint is in beta and its interface may change. It is recommended for use only in
     * test mode.
     *
     * This endpoint allows the creation of a new plan version for an existing plan.
     */
    fun createPlanVersion(
        externalPlanId: String,
        params: BetaExternalPlanIdCreatePlanVersionParams,
    ): CompletableFuture<PlanVersion> =
        createPlanVersion(externalPlanId, params, RequestOptions.none())

    /** @see createPlanVersion */
    fun createPlanVersion(
        externalPlanId: String,
        params: BetaExternalPlanIdCreatePlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersion> =
        createPlanVersion(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

    /** @see createPlanVersion */
    fun createPlanVersion(
        params: BetaExternalPlanIdCreatePlanVersionParams
    ): CompletableFuture<PlanVersion> = createPlanVersion(params, RequestOptions.none())

    /** @see createPlanVersion */
    fun createPlanVersion(
        params: BetaExternalPlanIdCreatePlanVersionParams,
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
        params: BetaExternalPlanIdFetchPlanVersionParams,
    ): CompletableFuture<PlanVersion> = fetchPlanVersion(version, params, RequestOptions.none())

    /** @see fetchPlanVersion */
    fun fetchPlanVersion(
        version: String,
        params: BetaExternalPlanIdFetchPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersion> =
        fetchPlanVersion(params.toBuilder().version(version).build(), requestOptions)

    /** @see fetchPlanVersion */
    fun fetchPlanVersion(
        params: BetaExternalPlanIdFetchPlanVersionParams
    ): CompletableFuture<PlanVersion> = fetchPlanVersion(params, RequestOptions.none())

    /** @see fetchPlanVersion */
    fun fetchPlanVersion(
        params: BetaExternalPlanIdFetchPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersion>

    /**
     * This API endpoint is in beta and its interface may change. It is recommended for use only in
     * test mode.
     *
     * This endpoint allows setting the default version of a plan.
     */
    fun setDefaultPlanVersion(
        externalPlanId: String,
        params: BetaExternalPlanIdSetDefaultPlanVersionParams,
    ): CompletableFuture<Plan> =
        setDefaultPlanVersion(externalPlanId, params, RequestOptions.none())

    /** @see setDefaultPlanVersion */
    fun setDefaultPlanVersion(
        externalPlanId: String,
        params: BetaExternalPlanIdSetDefaultPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan> =
        setDefaultPlanVersion(
            params.toBuilder().externalPlanId(externalPlanId).build(),
            requestOptions,
        )

    /** @see setDefaultPlanVersion */
    fun setDefaultPlanVersion(
        params: BetaExternalPlanIdSetDefaultPlanVersionParams
    ): CompletableFuture<Plan> = setDefaultPlanVersion(params, RequestOptions.none())

    /** @see setDefaultPlanVersion */
    fun setDefaultPlanVersion(
        params: BetaExternalPlanIdSetDefaultPlanVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

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
         * Returns a raw HTTP response for `post
         * /plans/external_plan_id/{external_plan_id}/versions`, but is otherwise the same as
         * [ExternalPlanIdServiceAsync.createPlanVersion].
         */
        fun createPlanVersion(
            externalPlanId: String,
            params: BetaExternalPlanIdCreatePlanVersionParams,
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            createPlanVersion(externalPlanId, params, RequestOptions.none())

        /** @see createPlanVersion */
        fun createPlanVersion(
            externalPlanId: String,
            params: BetaExternalPlanIdCreatePlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            createPlanVersion(
                params.toBuilder().externalPlanId(externalPlanId).build(),
                requestOptions,
            )

        /** @see createPlanVersion */
        fun createPlanVersion(
            params: BetaExternalPlanIdCreatePlanVersionParams
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            createPlanVersion(params, RequestOptions.none())

        /** @see createPlanVersion */
        fun createPlanVersion(
            params: BetaExternalPlanIdCreatePlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>>

        /**
         * Returns a raw HTTP response for `get
         * /plans/external_plan_id/{external_plan_id}/versions/{version}`, but is otherwise the same
         * as [ExternalPlanIdServiceAsync.fetchPlanVersion].
         */
        fun fetchPlanVersion(
            version: String,
            params: BetaExternalPlanIdFetchPlanVersionParams,
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            fetchPlanVersion(version, params, RequestOptions.none())

        /** @see fetchPlanVersion */
        fun fetchPlanVersion(
            version: String,
            params: BetaExternalPlanIdFetchPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            fetchPlanVersion(params.toBuilder().version(version).build(), requestOptions)

        /** @see fetchPlanVersion */
        fun fetchPlanVersion(
            params: BetaExternalPlanIdFetchPlanVersionParams
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            fetchPlanVersion(params, RequestOptions.none())

        /** @see fetchPlanVersion */
        fun fetchPlanVersion(
            params: BetaExternalPlanIdFetchPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>>

        /**
         * Returns a raw HTTP response for `post
         * /plans/external_plan_id/{external_plan_id}/set_default_version`, but is otherwise the
         * same as [ExternalPlanIdServiceAsync.setDefaultPlanVersion].
         */
        fun setDefaultPlanVersion(
            externalPlanId: String,
            params: BetaExternalPlanIdSetDefaultPlanVersionParams,
        ): CompletableFuture<HttpResponseFor<Plan>> =
            setDefaultPlanVersion(externalPlanId, params, RequestOptions.none())

        /** @see setDefaultPlanVersion */
        fun setDefaultPlanVersion(
            externalPlanId: String,
            params: BetaExternalPlanIdSetDefaultPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>> =
            setDefaultPlanVersion(
                params.toBuilder().externalPlanId(externalPlanId).build(),
                requestOptions,
            )

        /** @see setDefaultPlanVersion */
        fun setDefaultPlanVersion(
            params: BetaExternalPlanIdSetDefaultPlanVersionParams
        ): CompletableFuture<HttpResponseFor<Plan>> =
            setDefaultPlanVersion(params, RequestOptions.none())

        /** @see setDefaultPlanVersion */
        fun setDefaultPlanVersion(
            params: BetaExternalPlanIdSetDefaultPlanVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>
    }
}
