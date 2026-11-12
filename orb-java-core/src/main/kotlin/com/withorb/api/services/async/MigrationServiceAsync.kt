// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.MigrationCancelParams
import com.withorb.api.models.MigrationCancelResponse
import com.withorb.api.models.MigrationCreateParams
import com.withorb.api.models.MigrationCreateResponse
import com.withorb.api.models.MigrationListPageAsync
import com.withorb.api.models.MigrationListParams
import com.withorb.api.models.MigrationRetrieveParams
import com.withorb.api.models.MigrationRetrieveResponse
import com.withorb.api.services.async.migrations.SubscriptionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * A migration moves a plan's subscriptions onto one of the plan's versions. Each subscription is
 * migrated asynchronously, either immediately or at a scheduled time, and the migration reports its
 * overall status as it progresses.
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

    /**
     * A migration moves a plan's subscriptions onto one of the plan's versions. Each subscription
     * is migrated asynchronously, either immediately or at a scheduled time, and the migration
     * reports its overall status as it progresses.
     */
    fun subscriptions(): SubscriptionServiceAsync

    /**
     * This endpoint creates a migration of a plan's subscriptions to one of its versions. With
     * `included_subscription_ids` it migrates exactly those subscriptions; otherwise it migrates
     * the plan's subscriptions that match the filters. Each subscription is migrated
     * asynchronously; fetch the migration to follow its status.
     */
    fun create(params: MigrationCreateParams): CompletableFuture<MigrationCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MigrationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationCreateResponse>

    /** This endpoint returns a migration identified by its ID. */
    fun retrieve(migrationId: String): CompletableFuture<MigrationRetrieveResponse> =
        retrieve(migrationId, MigrationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        migrationId: String,
        params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationRetrieveResponse> =
        retrieve(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        migrationId: String,
        params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
    ): CompletableFuture<MigrationRetrieveResponse> =
        retrieve(migrationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MigrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: MigrationRetrieveParams): CompletableFuture<MigrationRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        migrationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MigrationRetrieveResponse> =
        retrieve(migrationId, MigrationRetrieveParams.none(), requestOptions)

    /**
     * This endpoint returns a list of migrations across all plans in the account, optionally
     * filtered by plan (`plan_id` or `external_plan_id`). The list of migrations is ordered
     * starting from the most recently created migration. The response also includes
     * pagination_metadata, which lets the caller retrieve the next page of results if they exist.
     */
    fun list(): CompletableFuture<MigrationListPageAsync> = list(MigrationListParams.none())

    /** @see list */
    fun list(
        params: MigrationListParams = MigrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationListPageAsync>

    /** @see list */
    fun list(
        params: MigrationListParams = MigrationListParams.none()
    ): CompletableFuture<MigrationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MigrationListPageAsync> =
        list(MigrationListParams.none(), requestOptions)

    /** This endpoint cancels a migration identified by its ID. */
    fun cancel(migrationId: String): CompletableFuture<MigrationCancelResponse> =
        cancel(migrationId, MigrationCancelParams.none())

    /** @see cancel */
    fun cancel(
        migrationId: String,
        params: MigrationCancelParams = MigrationCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationCancelResponse> =
        cancel(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        migrationId: String,
        params: MigrationCancelParams = MigrationCancelParams.none(),
    ): CompletableFuture<MigrationCancelResponse> =
        cancel(migrationId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: MigrationCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationCancelResponse>

    /** @see cancel */
    fun cancel(params: MigrationCancelParams): CompletableFuture<MigrationCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        migrationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MigrationCancelResponse> =
        cancel(migrationId, MigrationCancelParams.none(), requestOptions)

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
         * A migration moves a plan's subscriptions onto one of the plan's versions. Each
         * subscription is migrated asynchronously, either immediately or at a scheduled time, and
         * the migration reports its overall status as it progresses.
         */
        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /migrations`, but is otherwise the same as
         * [MigrationServiceAsync.create].
         */
        fun create(
            params: MigrationCreateParams
        ): CompletableFuture<HttpResponseFor<MigrationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MigrationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /migrations/{migration_id}`, but is otherwise the
         * same as [MigrationServiceAsync.retrieve].
         */
        fun retrieve(
            migrationId: String
        ): CompletableFuture<HttpResponseFor<MigrationRetrieveResponse>> =
            retrieve(migrationId, MigrationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            migrationId: String,
            params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationRetrieveResponse>> =
            retrieve(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            migrationId: String,
            params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MigrationRetrieveResponse>> =
            retrieve(migrationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MigrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MigrationRetrieveParams
        ): CompletableFuture<HttpResponseFor<MigrationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            migrationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MigrationRetrieveResponse>> =
            retrieve(migrationId, MigrationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /migrations`, but is otherwise the same as
         * [MigrationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MigrationListPageAsync>> =
            list(MigrationListParams.none())

        /** @see list */
        fun list(
            params: MigrationListParams = MigrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationListPageAsync>>

        /** @see list */
        fun list(
            params: MigrationListParams = MigrationListParams.none()
        ): CompletableFuture<HttpResponseFor<MigrationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MigrationListPageAsync>> =
            list(MigrationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /migrations/{migration_id}/cancel`, but is
         * otherwise the same as [MigrationServiceAsync.cancel].
         */
        fun cancel(
            migrationId: String
        ): CompletableFuture<HttpResponseFor<MigrationCancelResponse>> =
            cancel(migrationId, MigrationCancelParams.none())

        /** @see cancel */
        fun cancel(
            migrationId: String,
            params: MigrationCancelParams = MigrationCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationCancelResponse>> =
            cancel(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            migrationId: String,
            params: MigrationCancelParams = MigrationCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<MigrationCancelResponse>> =
            cancel(migrationId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: MigrationCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: MigrationCancelParams
        ): CompletableFuture<HttpResponseFor<MigrationCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            migrationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MigrationCancelResponse>> =
            cancel(migrationId, MigrationCancelParams.none(), requestOptions)
    }
}
