// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.migrations

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.MigrationSubscriptionListPageAsync
import com.withorb.api.models.MigrationSubscriptionListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync

    /**
     * This endpoint returns the subscriptions a migration applies to, with the status of each one.
     * A subscription that could not be migrated has the status `failed` and a `failure_reason`.
     *
     * The list is empty until the migration has finished selecting its subscriptions. Once a
     * migration is canceled, only the subscriptions it processed before the cancellation are
     * returned.
     */
    fun list(migrationId: String): CompletableFuture<MigrationSubscriptionListPageAsync> =
        list(migrationId, MigrationSubscriptionListParams.none())

    /** @see list */
    fun list(
        migrationId: String,
        params: MigrationSubscriptionListParams = MigrationSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationSubscriptionListPageAsync> =
        list(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see list */
    fun list(
        migrationId: String,
        params: MigrationSubscriptionListParams = MigrationSubscriptionListParams.none(),
    ): CompletableFuture<MigrationSubscriptionListPageAsync> =
        list(migrationId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MigrationSubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MigrationSubscriptionListPageAsync>

    /** @see list */
    fun list(
        params: MigrationSubscriptionListParams
    ): CompletableFuture<MigrationSubscriptionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        migrationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MigrationSubscriptionListPageAsync> =
        list(migrationId, MigrationSubscriptionListParams.none(), requestOptions)

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
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
        ): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /migrations/{migration_id}/subscriptions`, but is
         * otherwise the same as [SubscriptionServiceAsync.list].
         */
        fun list(
            migrationId: String
        ): CompletableFuture<HttpResponseFor<MigrationSubscriptionListPageAsync>> =
            list(migrationId, MigrationSubscriptionListParams.none())

        /** @see list */
        fun list(
            migrationId: String,
            params: MigrationSubscriptionListParams = MigrationSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationSubscriptionListPageAsync>> =
            list(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see list */
        fun list(
            migrationId: String,
            params: MigrationSubscriptionListParams = MigrationSubscriptionListParams.none(),
        ): CompletableFuture<HttpResponseFor<MigrationSubscriptionListPageAsync>> =
            list(migrationId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MigrationSubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MigrationSubscriptionListPageAsync>>

        /** @see list */
        fun list(
            params: MigrationSubscriptionListParams
        ): CompletableFuture<HttpResponseFor<MigrationSubscriptionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            migrationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MigrationSubscriptionListPageAsync>> =
            list(migrationId, MigrationSubscriptionListParams.none(), requestOptions)
    }
}
