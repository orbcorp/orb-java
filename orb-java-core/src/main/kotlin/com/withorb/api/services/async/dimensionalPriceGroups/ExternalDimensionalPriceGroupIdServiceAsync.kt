// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.dimensionalPriceGroups

import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
import java.util.concurrent.CompletableFuture

interface ExternalDimensionalPriceGroupIdServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Fetch dimensional price group by external ID */
    fun retrieve(
        externalDimensionalPriceGroupId: String
    ): CompletableFuture<DimensionalPriceGroup> =
        retrieve(
            externalDimensionalPriceGroupId,
            DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
        )

    /** @see [retrieve] */
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

    /** @see [retrieve] */
    fun retrieve(
        externalDimensionalPriceGroupId: String,
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams =
            DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
    ): CompletableFuture<DimensionalPriceGroup> =
        retrieve(externalDimensionalPriceGroupId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DimensionalPriceGroup>

    /** @see [retrieve] */
    fun retrieve(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
    ): CompletableFuture<DimensionalPriceGroup> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
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
     * A view of [ExternalDimensionalPriceGroupIdServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

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

        /** @see [retrieve] */
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

        /** @see [retrieve] */
        fun retrieve(
            externalDimensionalPriceGroupId: String,
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams =
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            retrieve(externalDimensionalPriceGroupId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>>

        /** @see [retrieve] */
        fun retrieve(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            externalDimensionalPriceGroupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            retrieve(
                externalDimensionalPriceGroupId,
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
                requestOptions,
            )
    }
}
