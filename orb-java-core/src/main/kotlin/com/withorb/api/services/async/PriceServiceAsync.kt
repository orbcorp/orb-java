// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.PriceCreateParams
import com.withorb.api.models.PriceEvaluateParams
import com.withorb.api.models.PriceEvaluateResponse
import com.withorb.api.models.PriceFetchParams
import com.withorb.api.models.PriceListPageAsync
import com.withorb.api.models.PriceListParams
import com.withorb.api.models.PriceModel
import com.withorb.api.models.PriceUpdateParams
import com.withorb.api.services.async.prices.ExternalPriceIdServiceAsync
import java.util.concurrent.CompletableFuture

interface PriceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun externalPriceId(): ExternalPriceIdServiceAsync

    /**
     * This endpoint is used to create a [price](/product-catalog/price-configuration). A price
     * created using this endpoint is always an add-on, meaning that it’s not associated with a
     * specific plan and can instead be individually added to subscriptions, including subscriptions
     * on different plans.
     *
     * An `external_price_id` can be optionally specified as an alias to allow ergonomic interaction
     * with prices in the Orb API.
     *
     * See the [Price resource](/product-catalog/price-configuration) for the specification of
     * different price model configurations possible in this endpoint.
     */
    @JvmOverloads
    fun create(
        params: PriceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PriceModel>

    /**
     * This endpoint allows you to update the `metadata` property on a price. If you pass null for
     * the metadata value, it will clear any existing metadata for that price.
     */
    @JvmOverloads
    fun update(
        params: PriceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PriceModel>

    /**
     * This endpoint is used to list all add-on prices created using the
     * [price creation endpoint](/api-reference/price/create-price).
     */
    @JvmOverloads
    fun list(
        params: PriceListParams = PriceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PriceListPageAsync>

    /**
     * This endpoint is used to list all add-on prices created using the
     * [price creation endpoint](/api-reference/price/create-price).
     */
    fun list(requestOptions: RequestOptions): CompletableFuture<PriceListPageAsync> =
        list(PriceListParams.none(), requestOptions)

    /**
     * This endpoint is used to evaluate the output of a price for a given customer and time range.
     * It enables filtering and grouping the output using
     * [computed properties](/extensibility/advanced-metrics#computed-properties), supporting the
     * following workflows:
     * 1. Showing detailed usage and costs to the end customer.
     * 2. Auditing subtotals on invoice line items.
     *
     * For these workflows, the expressiveness of computed properties in both the filters and
     * grouping is critical. For example, if you'd like to show your customer their usage grouped by
     * hour and another property, you can do so with the following `grouping_keys`:
     * `["hour_floor_timestamp_millis(timestamp_millis)", "my_property"]`. If you'd like to examine
     * a customer's usage for a specific property value, you can do so with the following `filter`:
     * `my_property = 'foo' AND my_other_property = 'bar'`.
     *
     * By default, the start of the time range must be no more than 100 days ago and the length of
     * the results must be no greater than 1000. Note that this is a POST endpoint rather than a GET
     * endpoint because it employs a JSON body rather than query parameters.
     */
    @JvmOverloads
    fun evaluate(
        params: PriceEvaluateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PriceEvaluateResponse>

    /** This endpoint returns a price given an identifier. */
    @JvmOverloads
    fun fetch(
        params: PriceFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PriceModel>

    /** A view of [PriceServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun externalPriceId(): ExternalPriceIdServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /prices`, but is otherwise the same as
         * [PriceServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PriceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PriceModel>>

        /**
         * Returns a raw HTTP response for `put /prices/{price_id}`, but is otherwise the same as
         * [PriceServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PriceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PriceModel>>

        /**
         * Returns a raw HTTP response for `get /prices`, but is otherwise the same as
         * [PriceServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PriceListParams = PriceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PriceListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /prices`, but is otherwise the same as
         * [PriceServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PriceListPageAsync>> =
            list(PriceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /prices/{price_id}/evaluate`, but is otherwise the
         * same as [PriceServiceAsync.evaluate].
         */
        @JvmOverloads
        @MustBeClosed
        fun evaluate(
            params: PriceEvaluateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PriceEvaluateResponse>>

        /**
         * Returns a raw HTTP response for `get /prices/{price_id}`, but is otherwise the same as
         * [PriceServiceAsync.fetch].
         */
        @JvmOverloads
        @MustBeClosed
        fun fetch(
            params: PriceFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PriceModel>>
    }
}
