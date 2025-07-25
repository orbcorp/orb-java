// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import com.withorb.api.models.DimensionalPriceGroupListPage
import com.withorb.api.models.DimensionalPriceGroupListParams
import com.withorb.api.models.DimensionalPriceGroupRetrieveParams
import com.withorb.api.models.DimensionalPriceGroupUpdateParams
import com.withorb.api.services.blocking.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdService
import java.util.function.Consumer

interface DimensionalPriceGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DimensionalPriceGroupService

    fun externalDimensionalPriceGroupId(): ExternalDimensionalPriceGroupIdService

    /**
     * A dimensional price group is used to partition the result of a billable metric by a set of
     * dimensions. Prices in a price group must specify the parition used to derive their usage.
     *
     * For example, suppose we have a billable metric that measures the number of widgets used and
     * we want to charge differently depending on the color of the widget. We can create a price
     * group with a dimension "color" and two prices: one that charges \$10 per red widget and one
     * that charges \$20 per blue widget.
     */
    fun create(params: DimensionalPriceGroupCreateParams): DimensionalPriceGroup =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DimensionalPriceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup

    /** Fetch dimensional price group */
    fun retrieve(dimensionalPriceGroupId: String): DimensionalPriceGroup =
        retrieve(dimensionalPriceGroupId, DimensionalPriceGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        dimensionalPriceGroupId: String,
        params: DimensionalPriceGroupRetrieveParams = DimensionalPriceGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup =
        retrieve(
            params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        dimensionalPriceGroupId: String,
        params: DimensionalPriceGroupRetrieveParams = DimensionalPriceGroupRetrieveParams.none(),
    ): DimensionalPriceGroup = retrieve(dimensionalPriceGroupId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DimensionalPriceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup

    /** @see retrieve */
    fun retrieve(params: DimensionalPriceGroupRetrieveParams): DimensionalPriceGroup =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        dimensionalPriceGroupId: String,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroup =
        retrieve(
            dimensionalPriceGroupId,
            DimensionalPriceGroupRetrieveParams.none(),
            requestOptions,
        )

    /**
     * This endpoint can be used to update the `external_dimensional_price_group_id` and `metadata`
     * of an existing dimensional price group. Other fields on a dimensional price group are
     * currently immutable.
     */
    fun update(dimensionalPriceGroupId: String): DimensionalPriceGroup =
        update(dimensionalPriceGroupId, DimensionalPriceGroupUpdateParams.none())

    /** @see update */
    fun update(
        dimensionalPriceGroupId: String,
        params: DimensionalPriceGroupUpdateParams = DimensionalPriceGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup =
        update(
            params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        dimensionalPriceGroupId: String,
        params: DimensionalPriceGroupUpdateParams = DimensionalPriceGroupUpdateParams.none(),
    ): DimensionalPriceGroup = update(dimensionalPriceGroupId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DimensionalPriceGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroup

    /** @see update */
    fun update(params: DimensionalPriceGroupUpdateParams): DimensionalPriceGroup =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        dimensionalPriceGroupId: String,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroup =
        update(dimensionalPriceGroupId, DimensionalPriceGroupUpdateParams.none(), requestOptions)

    /** List dimensional price groups */
    fun list(): DimensionalPriceGroupListPage = list(DimensionalPriceGroupListParams.none())

    /** @see list */
    fun list(
        params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DimensionalPriceGroupListPage

    /** @see list */
    fun list(
        params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none()
    ): DimensionalPriceGroupListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DimensionalPriceGroupListPage =
        list(DimensionalPriceGroupListParams.none(), requestOptions)

    /**
     * A view of [DimensionalPriceGroupService] that provides access to raw HTTP responses for each
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
        ): DimensionalPriceGroupService.WithRawResponse

        fun externalDimensionalPriceGroupId():
            ExternalDimensionalPriceGroupIdService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dimensional_price_groups`, but is otherwise the
         * same as [DimensionalPriceGroupService.create].
         */
        @MustBeClosed
        fun create(
            params: DimensionalPriceGroupCreateParams
        ): HttpResponseFor<DimensionalPriceGroup> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DimensionalPriceGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup>

        /**
         * Returns a raw HTTP response for `get
         * /dimensional_price_groups/{dimensional_price_group_id}`, but is otherwise the same as
         * [DimensionalPriceGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(dimensionalPriceGroupId: String): HttpResponseFor<DimensionalPriceGroup> =
            retrieve(dimensionalPriceGroupId, DimensionalPriceGroupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            dimensionalPriceGroupId: String,
            params: DimensionalPriceGroupRetrieveParams =
                DimensionalPriceGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup> =
            retrieve(
                params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            dimensionalPriceGroupId: String,
            params: DimensionalPriceGroupRetrieveParams = DimensionalPriceGroupRetrieveParams.none(),
        ): HttpResponseFor<DimensionalPriceGroup> =
            retrieve(dimensionalPriceGroupId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DimensionalPriceGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DimensionalPriceGroupRetrieveParams
        ): HttpResponseFor<DimensionalPriceGroup> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            dimensionalPriceGroupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroup> =
            retrieve(
                dimensionalPriceGroupId,
                DimensionalPriceGroupRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put
         * /dimensional_price_groups/{dimensional_price_group_id}`, but is otherwise the same as
         * [DimensionalPriceGroupService.update].
         */
        @MustBeClosed
        fun update(dimensionalPriceGroupId: String): HttpResponseFor<DimensionalPriceGroup> =
            update(dimensionalPriceGroupId, DimensionalPriceGroupUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            dimensionalPriceGroupId: String,
            params: DimensionalPriceGroupUpdateParams = DimensionalPriceGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup> =
            update(
                params.toBuilder().dimensionalPriceGroupId(dimensionalPriceGroupId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            dimensionalPriceGroupId: String,
            params: DimensionalPriceGroupUpdateParams = DimensionalPriceGroupUpdateParams.none(),
        ): HttpResponseFor<DimensionalPriceGroup> =
            update(dimensionalPriceGroupId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DimensionalPriceGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroup>

        /** @see update */
        @MustBeClosed
        fun update(
            params: DimensionalPriceGroupUpdateParams
        ): HttpResponseFor<DimensionalPriceGroup> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            dimensionalPriceGroupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroup> =
            update(
                dimensionalPriceGroupId,
                DimensionalPriceGroupUpdateParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /dimensional_price_groups`, but is otherwise the
         * same as [DimensionalPriceGroupService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DimensionalPriceGroupListPage> =
            list(DimensionalPriceGroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DimensionalPriceGroupListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none()
        ): HttpResponseFor<DimensionalPriceGroupListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DimensionalPriceGroupListPage> =
            list(DimensionalPriceGroupListParams.none(), requestOptions)
    }
}
