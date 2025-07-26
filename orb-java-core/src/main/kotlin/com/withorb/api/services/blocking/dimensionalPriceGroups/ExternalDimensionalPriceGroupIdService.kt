// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.dimensionalPriceGroups

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams
import java.util.function.Consumer

interface ExternalDimensionalPriceGroupIdService {

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
    ): ExternalDimensionalPriceGroupIdService

    /** Fetch dimensional price group by external ID */
    fun retrieve(externalDimensionalPriceGroupId: String): DimensionalPriceGroup =
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
    ): DimensionalPriceGroup =
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
    ): DimensionalPriceGroup =
        retrieve(externalDimensionalPriceGroupId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup

    /** @see retrieve */
    fun retrieve(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
    ): DimensionalPriceGroup = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        externalDimensionalPriceGroupId: String,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroup =
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
    fun update(pathExternalDimensionalPriceGroupId: String): DimensionalPriceGroup =
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
    ): DimensionalPriceGroup =
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
    ): DimensionalPriceGroup =
        update(pathExternalDimensionalPriceGroupId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup

    /** @see update */
    fun update(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams
    ): DimensionalPriceGroup = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        pathExternalDimensionalPriceGroupId: String,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroup =
        update(
            pathExternalDimensionalPriceGroupId,
            DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
            requestOptions,
        )

    /**
     * A view of [ExternalDimensionalPriceGroupIdService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalDimensionalPriceGroupIdService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /dimensional_price_groups/external_dimensional_price_group_id/{external_dimensional_price_group_id}`,
         * but is otherwise the same as [ExternalDimensionalPriceGroupIdService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            externalDimensionalPriceGroupId: String
        ): HttpResponseFor<DimensionalPriceGroup> =
            retrieve(
                externalDimensionalPriceGroupId,
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            externalDimensionalPriceGroupId: String,
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams =
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup> =
            retrieve(
                params
                    .toBuilder()
                    .externalDimensionalPriceGroupId(externalDimensionalPriceGroupId)
                    .build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            externalDimensionalPriceGroupId: String,
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams =
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
        ): HttpResponseFor<DimensionalPriceGroup> =
            retrieve(externalDimensionalPriceGroupId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
        ): HttpResponseFor<DimensionalPriceGroup> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            externalDimensionalPriceGroupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroup> =
            retrieve(
                externalDimensionalPriceGroupId,
                DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put
         * /dimensional_price_groups/external_dimensional_price_group_id/{external_dimensional_price_group_id}`,
         * but is otherwise the same as [ExternalDimensionalPriceGroupIdService.update].
         */
        @MustBeClosed
        fun update(
            pathExternalDimensionalPriceGroupId: String
        ): HttpResponseFor<DimensionalPriceGroup> =
            update(
                pathExternalDimensionalPriceGroupId,
                DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
            )

        /** @see update */
        @MustBeClosed
        fun update(
            pathExternalDimensionalPriceGroupId: String,
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams =
                DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup> =
            update(
                params
                    .toBuilder()
                    .pathExternalDimensionalPriceGroupId(pathExternalDimensionalPriceGroupId)
                    .build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            pathExternalDimensionalPriceGroupId: String,
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams =
                DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
        ): HttpResponseFor<DimensionalPriceGroup> =
            update(pathExternalDimensionalPriceGroupId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup>

        /** @see update */
        @MustBeClosed
        fun update(
            params: DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams
        ): HttpResponseFor<DimensionalPriceGroup> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathExternalDimensionalPriceGroupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroup> =
            update(
                pathExternalDimensionalPriceGroupId,
                DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.none(),
                requestOptions,
            )
    }
}
