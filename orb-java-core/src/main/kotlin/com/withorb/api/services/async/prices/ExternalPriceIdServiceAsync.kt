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
    fun update(externalPriceId: String): CompletableFuture<Price> =
        update(externalPriceId, PriceExternalPriceIdUpdateParams.none())

    /** @see [update] */
    fun update(
        externalPriceId: String,
        params: PriceExternalPriceIdUpdateParams = PriceExternalPriceIdUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Price> =
        update(params.toBuilder().externalPriceId(externalPriceId).build(), requestOptions)

    /** @see [update] */
    fun update(
        externalPriceId: String,
        params: PriceExternalPriceIdUpdateParams = PriceExternalPriceIdUpdateParams.none(),
    ): CompletableFuture<Price> = update(externalPriceId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PriceExternalPriceIdUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Price>

    /** @see [update] */
    fun update(params: PriceExternalPriceIdUpdateParams): CompletableFuture<Price> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(externalPriceId: String, requestOptions: RequestOptions): CompletableFuture<Price> =
        update(externalPriceId, PriceExternalPriceIdUpdateParams.none(), requestOptions)

    /**
     * This endpoint returns a price given an external price id. See the
     * [price creation API](/api-reference/price/create-price) for more information about external
     * price aliases.
     */
    fun fetch(externalPriceId: String): CompletableFuture<Price> =
        fetch(externalPriceId, PriceExternalPriceIdFetchParams.none())

    /** @see [fetch] */
    fun fetch(
        externalPriceId: String,
        params: PriceExternalPriceIdFetchParams = PriceExternalPriceIdFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Price> =
        fetch(params.toBuilder().externalPriceId(externalPriceId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(
        externalPriceId: String,
        params: PriceExternalPriceIdFetchParams = PriceExternalPriceIdFetchParams.none(),
    ): CompletableFuture<Price> = fetch(externalPriceId, params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: PriceExternalPriceIdFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Price>

    /** @see [fetch] */
    fun fetch(params: PriceExternalPriceIdFetchParams): CompletableFuture<Price> =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(externalPriceId: String, requestOptions: RequestOptions): CompletableFuture<Price> =
        fetch(externalPriceId, PriceExternalPriceIdFetchParams.none(), requestOptions)

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
        fun update(externalPriceId: String): CompletableFuture<HttpResponseFor<Price>> =
            update(externalPriceId, PriceExternalPriceIdUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            externalPriceId: String,
            params: PriceExternalPriceIdUpdateParams = PriceExternalPriceIdUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Price>> =
            update(params.toBuilder().externalPriceId(externalPriceId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            externalPriceId: String,
            params: PriceExternalPriceIdUpdateParams = PriceExternalPriceIdUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Price>> =
            update(externalPriceId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PriceExternalPriceIdUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Price>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PriceExternalPriceIdUpdateParams
        ): CompletableFuture<HttpResponseFor<Price>> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            externalPriceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Price>> =
            update(externalPriceId, PriceExternalPriceIdUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /prices/external_price_id/{external_price_id}`, but
         * is otherwise the same as [ExternalPriceIdServiceAsync.fetch].
         */
        @MustBeClosed
        fun fetch(externalPriceId: String): CompletableFuture<HttpResponseFor<Price>> =
            fetch(externalPriceId, PriceExternalPriceIdFetchParams.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            externalPriceId: String,
            params: PriceExternalPriceIdFetchParams = PriceExternalPriceIdFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Price>> =
            fetch(params.toBuilder().externalPriceId(externalPriceId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            externalPriceId: String,
            params: PriceExternalPriceIdFetchParams = PriceExternalPriceIdFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<Price>> =
            fetch(externalPriceId, params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: PriceExternalPriceIdFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Price>>

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: PriceExternalPriceIdFetchParams
        ): CompletableFuture<HttpResponseFor<Price>> = fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            externalPriceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Price>> =
            fetch(externalPriceId, PriceExternalPriceIdFetchParams.none(), requestOptions)
    }
}
