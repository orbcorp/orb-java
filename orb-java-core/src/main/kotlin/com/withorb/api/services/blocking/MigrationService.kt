// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.MigrationCancelParams
import com.withorb.api.models.MigrationCancelResponse
import com.withorb.api.models.MigrationCreateParams
import com.withorb.api.models.MigrationCreateResponse
import com.withorb.api.models.MigrationListPage
import com.withorb.api.models.MigrationListParams
import com.withorb.api.models.MigrationRetrieveParams
import com.withorb.api.models.MigrationRetrieveResponse
import com.withorb.api.services.blocking.migrations.SubscriptionService
import java.util.function.Consumer

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
interface MigrationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MigrationService

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    fun subscriptions(): SubscriptionService

    /**
     * This endpoint creates a migration of a plan's subscriptions to one of its versions. With
     * `included_subscription_ids` it migrates exactly those subscriptions; otherwise it migrates
     * the plan's subscriptions that match the filters. Each subscription is migrated
     * asynchronously; fetch the migration to follow its status.
     */
    fun create(params: MigrationCreateParams): MigrationCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MigrationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationCreateResponse

    /** This endpoint returns a migration identified by its ID. */
    fun retrieve(migrationId: String): MigrationRetrieveResponse =
        retrieve(migrationId, MigrationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        migrationId: String,
        params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationRetrieveResponse =
        retrieve(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        migrationId: String,
        params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
    ): MigrationRetrieveResponse = retrieve(migrationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MigrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MigrationRetrieveParams): MigrationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(migrationId: String, requestOptions: RequestOptions): MigrationRetrieveResponse =
        retrieve(migrationId, MigrationRetrieveParams.none(), requestOptions)

    /**
     * This endpoint returns a list of migrations across all plans in the account, optionally
     * filtered by plan (`plan_id` or `external_plan_id`). The list of migrations is ordered
     * starting from the most recently created migration. The response also includes
     * pagination_metadata, which lets the caller retrieve the next page of results if they exist.
     */
    fun list(): MigrationListPage = list(MigrationListParams.none())

    /** @see list */
    fun list(
        params: MigrationListParams = MigrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationListPage

    /** @see list */
    fun list(params: MigrationListParams = MigrationListParams.none()): MigrationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MigrationListPage =
        list(MigrationListParams.none(), requestOptions)

    /** This endpoint cancels a migration identified by its ID. */
    fun cancel(migrationId: String): MigrationCancelResponse =
        cancel(migrationId, MigrationCancelParams.none())

    /** @see cancel */
    fun cancel(
        migrationId: String,
        params: MigrationCancelParams = MigrationCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationCancelResponse =
        cancel(params.toBuilder().migrationId(migrationId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        migrationId: String,
        params: MigrationCancelParams = MigrationCancelParams.none(),
    ): MigrationCancelResponse = cancel(migrationId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: MigrationCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MigrationCancelResponse

    /** @see cancel */
    fun cancel(params: MigrationCancelParams): MigrationCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(migrationId: String, requestOptions: RequestOptions): MigrationCancelResponse =
        cancel(migrationId, MigrationCancelParams.none(), requestOptions)

    /** A view of [MigrationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MigrationService.WithRawResponse

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        fun subscriptions(): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /migrations`, but is otherwise the same as
         * [MigrationService.create].
         */
        @MustBeClosed
        fun create(params: MigrationCreateParams): HttpResponseFor<MigrationCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MigrationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationCreateResponse>

        /**
         * Returns a raw HTTP response for `get /migrations/{migration_id}`, but is otherwise the
         * same as [MigrationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(migrationId: String): HttpResponseFor<MigrationRetrieveResponse> =
            retrieve(migrationId, MigrationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            migrationId: String,
            params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationRetrieveResponse> =
            retrieve(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            migrationId: String,
            params: MigrationRetrieveParams = MigrationRetrieveParams.none(),
        ): HttpResponseFor<MigrationRetrieveResponse> =
            retrieve(migrationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MigrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MigrationRetrieveParams): HttpResponseFor<MigrationRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            migrationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationRetrieveResponse> =
            retrieve(migrationId, MigrationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /migrations`, but is otherwise the same as
         * [MigrationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MigrationListPage> = list(MigrationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MigrationListParams = MigrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MigrationListParams = MigrationListParams.none()
        ): HttpResponseFor<MigrationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MigrationListPage> =
            list(MigrationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /migrations/{migration_id}/cancel`, but is
         * otherwise the same as [MigrationService.cancel].
         */
        @MustBeClosed
        fun cancel(migrationId: String): HttpResponseFor<MigrationCancelResponse> =
            cancel(migrationId, MigrationCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            migrationId: String,
            params: MigrationCancelParams = MigrationCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationCancelResponse> =
            cancel(params.toBuilder().migrationId(migrationId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            migrationId: String,
            params: MigrationCancelParams = MigrationCancelParams.none(),
        ): HttpResponseFor<MigrationCancelResponse> =
            cancel(migrationId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: MigrationCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MigrationCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: MigrationCancelParams): HttpResponseFor<MigrationCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            migrationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationCancelResponse> =
            cancel(migrationId, MigrationCancelParams.none(), requestOptions)
    }
}
