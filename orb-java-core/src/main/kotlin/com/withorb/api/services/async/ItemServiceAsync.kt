// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPageAsync
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemModel
import com.withorb.api.models.ItemUpdateParams
import java.util.concurrent.CompletableFuture

interface ItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** This endpoint is used to create an [Item](/core-concepts#item). */
    @JvmOverloads
    fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemModel>

    /** This endpoint can be used to update properties on the Item. */
    @JvmOverloads
    fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemModel>

    /** This endpoint returns a list of all Items, ordered in descending order by creation time. */
    @JvmOverloads
    fun list(
        params: ItemListParams = ItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemListPageAsync>

    /** This endpoint returns a list of all Items, ordered in descending order by creation time. */
    fun list(requestOptions: RequestOptions): CompletableFuture<ItemListPageAsync> =
        list(ItemListParams.none(), requestOptions)

    /** This endpoint returns an item identified by its item_id. */
    @JvmOverloads
    fun fetch(
        params: ItemFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemModel>

    /** A view of [ItemServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /items`, but is otherwise the same as
         * [ItemServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemModel>>

        /**
         * Returns a raw HTTP response for `put /items/{item_id}`, but is otherwise the same as
         * [ItemServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemModel>>

        /**
         * Returns a raw HTTP response for `get /items`, but is otherwise the same as
         * [ItemServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ItemListParams = ItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /items`, but is otherwise the same as
         * [ItemServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ItemListPageAsync>> =
            list(ItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /items/{item_id}`, but is otherwise the same as
         * [ItemServiceAsync.fetch].
         */
        @JvmOverloads
        @MustBeClosed
        fun fetch(
            params: ItemFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemModel>>
    }
}
