// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.PlanMigrationCancelParams
import com.withorb.api.models.PlanMigrationCancelResponse
import com.withorb.api.models.PlanMigrationListPageAsync
import com.withorb.api.models.PlanMigrationListParams
import com.withorb.api.models.PlanMigrationRetrieveParams
import com.withorb.api.models.PlanMigrationRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
interface MigrationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MigrationServiceAsync

    /** Fetch migration */
    fun retrieve(
        migrationId: String,
        params: PlanMigrationRetrieveParams,
    ): CompletableFuture<PlanMigrationRetrieveResponse> =
        retrieve(migrationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        migrationId: String,
        params: PlanMigrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanMigrationRetrieveResponse> =
        retrieve(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PlanMigrationRetrieveParams
    ): CompletableFuture<PlanMigrationRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PlanMigrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanMigrationRetrieveResponse>

    /**
     * This endpoint returns a list of all migrations for a plan. The list of migrations is ordered
     * starting from the most recently created migration. The response also includes
     * pagination_metadata, which lets the caller retrieve the next page of results if they exist.
     */
    fun list(planId: String): CompletableFuture<PlanMigrationListPageAsync> =
        list(planId, PlanMigrationListParams.none())

    /** @see list */
    fun list(
        planId: String,
        params: PlanMigrationListParams = PlanMigrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanMigrationListPageAsync> =
        list(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see list */
    fun list(
        planId: String,
        params: PlanMigrationListParams = PlanMigrationListParams.none(),
    ): CompletableFuture<PlanMigrationListPageAsync> = list(planId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PlanMigrationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanMigrationListPageAsync>

    /** @see list */
    fun list(params: PlanMigrationListParams): CompletableFuture<PlanMigrationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        planId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanMigrationListPageAsync> =
        list(planId, PlanMigrationListParams.none(), requestOptions)

    /** This endpoint cancels a migration. */
    fun cancel(
        migrationId: String,
        params: PlanMigrationCancelParams,
    ): CompletableFuture<PlanMigrationCancelResponse> =
        cancel(migrationId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        migrationId: String,
        params: PlanMigrationCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanMigrationCancelResponse> =
        cancel(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see cancel */
    fun cancel(params: PlanMigrationCancelParams): CompletableFuture<PlanMigrationCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: PlanMigrationCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanMigrationCancelResponse>

    /**
     * A view of [MigrationServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MigrationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /plans/{plan_id}/migrations/{migration_id}`, but is
         * otherwise the same as [MigrationServiceAsync.retrieve].
         */
        fun retrieve(
            migrationId: String,
            params: PlanMigrationRetrieveParams,
        ): CompletableFuture<HttpResponseFor<PlanMigrationRetrieveResponse>> =
            retrieve(migrationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            migrationId: String,
            params: PlanMigrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanMigrationRetrieveResponse>> =
            retrieve(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: PlanMigrationRetrieveParams
        ): CompletableFuture<HttpResponseFor<PlanMigrationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PlanMigrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanMigrationRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /plans/{plan_id}/migrations`, but is otherwise the
         * same as [MigrationServiceAsync.list].
         */
        fun list(planId: String): CompletableFuture<HttpResponseFor<PlanMigrationListPageAsync>> =
            list(planId, PlanMigrationListParams.none())

        /** @see list */
        fun list(
            planId: String,
            params: PlanMigrationListParams = PlanMigrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanMigrationListPageAsync>> =
            list(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see list */
        fun list(
            planId: String,
            params: PlanMigrationListParams = PlanMigrationListParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanMigrationListPageAsync>> =
            list(planId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PlanMigrationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanMigrationListPageAsync>>

        /** @see list */
        fun list(
            params: PlanMigrationListParams
        ): CompletableFuture<HttpResponseFor<PlanMigrationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            planId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanMigrationListPageAsync>> =
            list(planId, PlanMigrationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /plans/{plan_id}/migrations/{migration_id}/cancel`,
         * but is otherwise the same as [MigrationServiceAsync.cancel].
         */
        fun cancel(
            migrationId: String,
            params: PlanMigrationCancelParams,
        ): CompletableFuture<HttpResponseFor<PlanMigrationCancelResponse>> =
            cancel(migrationId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            migrationId: String,
            params: PlanMigrationCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanMigrationCancelResponse>> =
            cancel(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            params: PlanMigrationCancelParams
        ): CompletableFuture<HttpResponseFor<PlanMigrationCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: PlanMigrationCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanMigrationCancelResponse>>
    }
}
