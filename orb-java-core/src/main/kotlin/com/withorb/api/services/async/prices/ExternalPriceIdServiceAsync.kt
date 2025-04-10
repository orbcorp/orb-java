// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.prices

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Price
import com.withorb.api.models.PriceExternalPriceIdFetchParams
import com.withorb.api.models.PriceExternalPriceIdUpdateParams
import java.util.concurrent.CompletableFuture

interface ExternalPriceIdServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint allows you to update the `metadata` property on a price. If you pass null for
     * the metadata value, it will clear any existing metadata for that price.
     */
    fun update(params: PriceExternalPriceIdUpdateParams): CompletableFuture<Price> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PriceExternalPriceIdUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Price>

    /**
     * This endpoint returns a price given an external price id. See the
     * [price creation API](/api-reference/price/create-price) for more information about external
     * price aliases.
     */
    fun fetch(params: PriceExternalPriceIdFetchParams): CompletableFuture<Price> =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: PriceExternalPriceIdFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Price>

    /**
     * A view of [ExternalPriceIdServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /prices/external_price_id/{external_price_id}`, but
         * is otherwise the same as [ExternalPriceIdServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: PriceExternalPriceIdUpdateParams
        ): CompletableFuture<HttpResponseFor<Price>> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PriceExternalPriceIdUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Price>>

        /**
         * Returns a raw HTTP response for `get /prices/external_price_id/{external_price_id}`, but
         * is otherwise the same as [ExternalPriceIdServiceAsync.fetch].
         */
        @MustBeClosed
        fun fetch(
            params: PriceExternalPriceIdFetchParams
        ): CompletableFuture<HttpResponseFor<Price>> = fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: PriceExternalPriceIdFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Price>>
    }
}
