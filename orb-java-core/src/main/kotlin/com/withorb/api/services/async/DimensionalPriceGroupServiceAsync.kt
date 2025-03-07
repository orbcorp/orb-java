// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import com.withorb.api.models.DimensionalPriceGroupListPageAsync
import com.withorb.api.models.DimensionalPriceGroupListParams
import com.withorb.api.models.DimensionalPriceGroupRetrieveParams
import com.withorb.api.services.async.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdServiceAsync
import java.util.concurrent.CompletableFuture

interface DimensionalPriceGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun externalDimensionalPriceGroupId(): ExternalDimensionalPriceGroupIdServiceAsync

    /**
     * A dimensional price group is used to partition the result of a billable metric by a set of
     * dimensions. Prices in a price group must specify the parition used to derive their usage.
     *
     * For example, suppose we have a billable metric that measures the number of widgets used and
     * we want to charge differently depending on the color of the widget. We can create a price
     * group with a dimension "color" and two prices: one that charges $10 per red widget and one
     * that charges $20 per blue widget.
     */
    fun create(
        params: DimensionalPriceGroupCreateParams
    ): CompletableFuture<DimensionalPriceGroup> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DimensionalPriceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DimensionalPriceGroup>

    /** Fetch dimensional price group */
    fun retrieve(
        params: DimensionalPriceGroupRetrieveParams
    ): CompletableFuture<DimensionalPriceGroup> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DimensionalPriceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DimensionalPriceGroup>

    /** List dimensional price groups */
    fun list(): CompletableFuture<DimensionalPriceGroupListPageAsync> =
        list(DimensionalPriceGroupListParams.none())

    /** @see [list] */
    fun list(
        params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DimensionalPriceGroupListPageAsync>

    /** @see [list] */
    fun list(
        params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none()
    ): CompletableFuture<DimensionalPriceGroupListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<DimensionalPriceGroupListPageAsync> =
        list(DimensionalPriceGroupListParams.none(), requestOptions)

    /**
     * A view of [DimensionalPriceGroupServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        fun externalDimensionalPriceGroupId():
            ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dimensional_price_groups`, but is otherwise the
         * same as [DimensionalPriceGroupServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: DimensionalPriceGroupCreateParams
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DimensionalPriceGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>>

        /**
         * Returns a raw HTTP response for `get
         * /dimensional_price_groups/{dimensional_price_group_id}`, but is otherwise the same as
         * [DimensionalPriceGroupServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: DimensionalPriceGroupRetrieveParams
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DimensionalPriceGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>>

        /**
         * Returns a raw HTTP response for `get /dimensional_price_groups`, but is otherwise the
         * same as [DimensionalPriceGroupServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DimensionalPriceGroupListPageAsync>> =
            list(DimensionalPriceGroupListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DimensionalPriceGroupListParams = DimensionalPriceGroupListParams.none()
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupListPageAsync>> =
            list(DimensionalPriceGroupListParams.none(), requestOptions)
    }
}
