// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.dimensionalPriceGroups

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExternalDimensionalPriceGroupIdServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExternalDimensionalPriceGroupIdServiceAsync

    /** Fetch dimensional price group by external ID */
    fun retrieve(
        externalDimensionalPriceGroupId: String
    ): CompletableFuture<DimensionalPriceGroup> =
        retrieve(
            externalDimensionalPriceGroupId,
            DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
        )

    /** @see retrieve */
    fun retrieve(
        externalDimensionalPriceGroupId: String,
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams =
            DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DimensionalPriceGroup> =
        retrieve(
            params
                .toBuilder()
                .externalDimensionalPriceGroupId(externalDimensionalPriceGroupId)
                .build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        externalDimensionalPriceGroupId: String,
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams =
            DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
    ): CompletableFuture<DimensionalPriceGroup> =
        retrieve(externalDimensionalPriceGroupId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DimensionalPriceGroup>

    /** @see retrieve */
    fun retrieve(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
    ): CompletableFuture<DimensionalPriceGroup> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        externalDimensionalPriceGroupId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DimensionalPriceGroup> =
        retrieve(
            externalDimensionalPriceGroupId,
            DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
            requestOptions,
        )

    /**
     * This endpoint can be used to update the `external_dimensional_price_group_id` and `metadata`
     * of an existing dimensional price group. Other fields on a dimensional price group are
     * currently immutable.
     */
    fun update(
        pathExternalDimensionalPriceGroupId: String
    ): CompletableFuture<DimensionalPriceGroup> =
        update(
            pathExternalDimensionalPriceGroupId,
            DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
        )

    /** @see update */
    fun update(
        pathExternalDimensionalPriceGroupId: String,
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams =
            DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DimensionalPriceGroup> =
        update(
            params
                .toBuilder()
                .pathExternalDimensionalPriceGroupId(pathExternalDimensionalPriceGroupId)
                .build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        pathExternalDimensionalPriceGroupId: String,
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams =
            DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
    ): CompletableFuture<DimensionalPriceGroup> =
        update(pathExternalDimensionalPriceGroupId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DimensionalPriceGroup>

    /** @see update */
    fun update(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams
    ): CompletableFuture<DimensionalPriceGroup> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        pathExternalDimensionalPriceGroupId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DimensionalPriceGroup> =
        update(
            pathExternalDimensionalPriceGroupId,
            DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
            requestOptions,
        )

    /**
     * A view of [ExternalDimensionalPriceGroupIdServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /dimensional_price_groups/external_dimensional_price_group_id/{external_dimensional_price_group_id}`,
         * but is otherwise the same as [ExternalDimensionalPriceGroupIdServiceAsync.retrieve].
         */
        fun retrieve(
            externalDimensionalPriceGroupId: String
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            retrieve(
                externalDimensionalPriceGroupId,
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
            )

        /** @see retrieve */
        fun retrieve(
            externalDimensionalPriceGroupId: String,
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams =
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            retrieve(
                params
                    .toBuilder()
                    .externalDimensionalPriceGroupId(externalDimensionalPriceGroupId)
                    .build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            externalDimensionalPriceGroupId: String,
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams =
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            retrieve(externalDimensionalPriceGroupId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>>

        /** @see retrieve */
        fun retrieve(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            externalDimensionalPriceGroupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            retrieve(
                externalDimensionalPriceGroupId,
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put
         * /dimensional_price_groups/external_dimensional_price_group_id/{external_dimensional_price_group_id}`,
         * but is otherwise the same as [ExternalDimensionalPriceGroupIdServiceAsync.update].
         */
        fun update(
            pathExternalDimensionalPriceGroupId: String
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            update(
                pathExternalDimensionalPriceGroupId,
                DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
            )

        /** @see update */
        fun update(
            pathExternalDimensionalPriceGroupId: String,
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams =
                DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            update(
                params
                    .toBuilder()
                    .pathExternalDimensionalPriceGroupId(pathExternalDimensionalPriceGroupId)
                    .build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            pathExternalDimensionalPriceGroupId: String,
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams =
                DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            update(pathExternalDimensionalPriceGroupId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>>

        /** @see update */
        fun update(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            pathExternalDimensionalPriceGroupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            update(
                pathExternalDimensionalPriceGroupId,
                DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
                requestOptions,
            )
    }
}
