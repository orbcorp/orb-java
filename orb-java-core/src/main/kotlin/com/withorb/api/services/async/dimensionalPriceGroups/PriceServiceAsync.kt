// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.dimensionalPriceGroups

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.DimensionalPriceGroupPriceCreateParams
import com.withorb.api.models.DimensionalPriceGroupPriceCreateResponse
import com.withorb.api.models.DimensionalPriceGroupPriceListPageAsync
import com.withorb.api.models.DimensionalPriceGroupPriceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PriceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PriceServiceAsync

    /**
     * Create prices in a dimensional price group. Every price shares `item_id`, `cadence`,
     * `currency`, and `model_type`. Tiered prices also share tier boundaries; each row supplies its
     * own amounts. The request is one transaction.
     */
    fun create(
        dimensionalPriceGroupId: String,
        params: DimensionalPriceGroupPriceCreateParams,
    ): CompletableFuture<DimensionalPriceGroupPriceCreateResponse> =
        create(dimensionalPriceGroupId, params, RequestOptions.none())

    /** @see create */
    fun create(
        dimensionalPriceGroupId: String,
        params: DimensionalPriceGroupPriceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DimensionalPriceGroupPriceCreateResponse> =
        create(
            params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        params: DimensionalPriceGroupPriceCreateParams
    ): CompletableFuture<DimensionalPriceGroupPriceCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DimensionalPriceGroupPriceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DimensionalPriceGroupPriceCreateResponse>

    /**
     * This endpoint returns the prices in a dimensional price group. Subscription overrides are
     * omitted. Archived prices are omitted unless `status` is `archived` or `all`.
     */
    fun list(
        dimensionalPriceGroupId: String
    ): CompletableFuture<DimensionalPriceGroupPriceListPageAsync> =
        list(dimensionalPriceGroupId, DimensionalPriceGroupPriceListParams.none())

    /** @see list */
    fun list(
        dimensionalPriceGroupId: String,
        params: DimensionalPriceGroupPriceListParams = DimensionalPriceGroupPriceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DimensionalPriceGroupPriceListPageAsync> =
        list(
            params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
            requestOptions,
        )

    /** @see list */
    fun list(
        dimensionalPriceGroupId: String,
        params: DimensionalPriceGroupPriceListParams = DimensionalPriceGroupPriceListParams.none(),
    ): CompletableFuture<DimensionalPriceGroupPriceListPageAsync> =
        list(dimensionalPriceGroupId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DimensionalPriceGroupPriceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DimensionalPriceGroupPriceListPageAsync>

    /** @see list */
    fun list(
        params: DimensionalPriceGroupPriceListParams
    ): CompletableFuture<DimensionalPriceGroupPriceListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        dimensionalPriceGroupId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DimensionalPriceGroupPriceListPageAsync> =
        list(dimensionalPriceGroupId, DimensionalPriceGroupPriceListParams.none(), requestOptions)

    /** A view of [PriceServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PriceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /dimensional_price_groups/{dimensional_price_group_id}/prices`, but is otherwise the same
         * as [PriceServiceAsync.create].
         */
        fun create(
            dimensionalPriceGroupId: String,
            params: DimensionalPriceGroupPriceCreateParams,
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupPriceCreateResponse>> =
            create(dimensionalPriceGroupId, params, RequestOptions.none())

        /** @see create */
        fun create(
            dimensionalPriceGroupId: String,
            params: DimensionalPriceGroupPriceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupPriceCreateResponse>> =
            create(
                params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            params: DimensionalPriceGroupPriceCreateParams
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupPriceCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DimensionalPriceGroupPriceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupPriceCreateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /dimensional_price_groups/{dimensional_price_group_id}/prices`, but is otherwise the same
         * as [PriceServiceAsync.list].
         */
        fun list(
            dimensionalPriceGroupId: String
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupPriceListPageAsync>> =
            list(dimensionalPriceGroupId, DimensionalPriceGroupPriceListParams.none())

        /** @see list */
        fun list(
            dimensionalPriceGroupId: String,
            params: DimensionalPriceGroupPriceListParams =
                DimensionalPriceGroupPriceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupPriceListPageAsync>> =
            list(
                params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
                requestOptions,
            )

        /** @see list */
        fun list(
            dimensionalPriceGroupId: String,
            params: DimensionalPriceGroupPriceListParams =
                DimensionalPriceGroupPriceListParams.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupPriceListPageAsync>> =
            list(dimensionalPriceGroupId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DimensionalPriceGroupPriceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupPriceListPageAsync>>

        /** @see list */
        fun list(
            params: DimensionalPriceGroupPriceListParams
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupPriceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            dimensionalPriceGroupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupPriceListPageAsync>> =
            list(
                dimensionalPriceGroupId,
                DimensionalPriceGroupPriceListParams.none(),
                requestOptions,
            )
    }
}
