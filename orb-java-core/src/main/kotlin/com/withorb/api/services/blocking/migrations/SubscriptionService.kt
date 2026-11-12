// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.migrations

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.MigrationSubscriptionListPage
import com.withorb.api.models.MigrationSubscriptionListParams
import java.util.function.Consumer

/**
 * A migration moves a plan's subscriptions onto one of the plan's versions. Each subscription is
 * migrated asynchronously, either immediately or at a scheduled time, and the migration reports its
 * overall status as it progresses.
 */
interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionService

    /**
     * This endpoint returns the subscriptions a migration applies to, with the status of each one.
     * A subscription that could not be migrated has the status `failed` and a `failure_reason`.
     *
     * The list is empty until the migration has finished selecting its subscriptions. Once a
     * migration is canceled, only the subscriptions it processed before the cancellation are
     * returned.
     */
    fun list(migrationId: String): MigrationSubscriptionListPage =
        list(migrationId, MigrationSubscriptionListParams.none())

    /** @see list */
    fun list(
        migrationId: String,
        params: MigrationSubscriptionListParams = MigrationSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSubscriptionListPage =
        list(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see list */
    fun list(
        migrationId: String,
        params: MigrationSubscriptionListParams = MigrationSubscriptionListParams.none(),
    ): MigrationSubscriptionListPage = list(migrationId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MigrationSubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationSubscriptionListPage

    /** @see list */
    fun list(params: MigrationSubscriptionListParams): MigrationSubscriptionListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(migrationId: String, requestOptions: RequestOptions): MigrationSubscriptionListPage =
        list(migrationId, MigrationSubscriptionListParams.none(), requestOptions)

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /migrations/{migration_id}/subscriptions`, but is
         * otherwise the same as [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(migrationId: String): HttpResponseFor<MigrationSubscriptionListPage> =
            list(migrationId, MigrationSubscriptionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            migrationId: String,
            params: MigrationSubscriptionListParams = MigrationSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSubscriptionListPage> =
            list(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            migrationId: String,
            params: MigrationSubscriptionListParams = MigrationSubscriptionListParams.none(),
        ): HttpResponseFor<MigrationSubscriptionListPage> =
            list(migrationId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MigrationSubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationSubscriptionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MigrationSubscriptionListParams
        ): HttpResponseFor<MigrationSubscriptionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            migrationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationSubscriptionListPage> =
            list(migrationId, MigrationSubscriptionListParams.none(), requestOptions)
    }
}
