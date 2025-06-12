// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Item
import com.withorb.api.models.ItemArchiveParams
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPageAsync
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync

    /** This endpoint is used to create an [Item](/core-concepts#item). */
    fun create(params: ItemCreateParams): CompletableFuture<Item> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Item>

    /** This endpoint can be used to update properties on the Item. */
    fun update(itemId: String): CompletableFuture<Item> = update(itemId, ItemUpdateParams.none())

    /** @see [update] */
    fun update(
        itemId: String,
        params: ItemUpdateParams = ItemUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Item> = update(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see [update] */
    fun update(
        itemId: String,
        params: ItemUpdateParams = ItemUpdateParams.none(),
    ): CompletableFuture<Item> = update(itemId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Item>

    /** @see [update] */
    fun update(params: ItemUpdateParams): CompletableFuture<Item> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(itemId: String, requestOptions: RequestOptions): CompletableFuture<Item> =
        update(itemId, ItemUpdateParams.none(), requestOptions)

    /** This endpoint returns a list of all Items, ordered in descending order by creation time. */
    fun list(): CompletableFuture<ItemListPageAsync> = list(ItemListParams.none())

    /** @see [list] */
    fun list(
        params: ItemListParams = ItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemListPageAsync>

    /** @see [list] */
    fun list(params: ItemListParams = ItemListParams.none()): CompletableFuture<ItemListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ItemListPageAsync> =
        list(ItemListParams.none(), requestOptions)

    /** Archive item */
    fun archive(itemId: String): CompletableFuture<Item> = archive(itemId, ItemArchiveParams.none())

    /** @see [archive] */
    fun archive(
        itemId: String,
        params: ItemArchiveParams = ItemArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Item> = archive(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see [archive] */
    fun archive(
        itemId: String,
        params: ItemArchiveParams = ItemArchiveParams.none(),
    ): CompletableFuture<Item> = archive(itemId, params, RequestOptions.none())

    /** @see [archive] */
    fun archive(
        params: ItemArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Item>

    /** @see [archive] */
    fun archive(params: ItemArchiveParams): CompletableFuture<Item> =
        archive(params, RequestOptions.none())

    /** @see [archive] */
    fun archive(itemId: String, requestOptions: RequestOptions): CompletableFuture<Item> =
        archive(itemId, ItemArchiveParams.none(), requestOptions)

    /** This endpoint returns an item identified by its item_id. */
    fun fetch(itemId: String): CompletableFuture<Item> = fetch(itemId, ItemFetchParams.none())

    /** @see [fetch] */
    fun fetch(
        itemId: String,
        params: ItemFetchParams = ItemFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Item> = fetch(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(
        itemId: String,
        params: ItemFetchParams = ItemFetchParams.none(),
    ): CompletableFuture<Item> = fetch(itemId, params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: ItemFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Item>

    /** @see [fetch] */
    fun fetch(params: ItemFetchParams): CompletableFuture<Item> =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(itemId: String, requestOptions: RequestOptions): CompletableFuture<Item> =
        fetch(itemId, ItemFetchParams.none(), requestOptions)

    /** A view of [ItemServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /items`, but is otherwise the same as
         * [ItemServiceAsync.create].
         */
        fun create(params: ItemCreateParams): CompletableFuture<HttpResponseFor<Item>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Item>>

        /**
         * Returns a raw HTTP response for `put /items/{item_id}`, but is otherwise the same as
         * [ItemServiceAsync.update].
         */
        fun update(itemId: String): CompletableFuture<HttpResponseFor<Item>> =
            update(itemId, ItemUpdateParams.none())

        /** @see [update] */
        fun update(
            itemId: String,
            params: ItemUpdateParams = ItemUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Item>> =
            update(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see [update] */
        fun update(
            itemId: String,
            params: ItemUpdateParams = ItemUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Item>> = update(itemId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Item>>

        /** @see [update] */
        fun update(params: ItemUpdateParams): CompletableFuture<HttpResponseFor<Item>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            itemId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Item>> =
            update(itemId, ItemUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /items`, but is otherwise the same as
         * [ItemServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ItemListPageAsync>> =
            list(ItemListParams.none())

        /** @see [list] */
        fun list(
            params: ItemListParams = ItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemListPageAsync>>

        /** @see [list] */
        fun list(
            params: ItemListParams = ItemListParams.none()
        ): CompletableFuture<HttpResponseFor<ItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ItemListPageAsync>> =
            list(ItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /items/{item_id}/archive`, but is otherwise the
         * same as [ItemServiceAsync.archive].
         */
        fun archive(itemId: String): CompletableFuture<HttpResponseFor<Item>> =
            archive(itemId, ItemArchiveParams.none())

        /** @see [archive] */
        fun archive(
            itemId: String,
            params: ItemArchiveParams = ItemArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Item>> =
            archive(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see [archive] */
        fun archive(
            itemId: String,
            params: ItemArchiveParams = ItemArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<Item>> = archive(itemId, params, RequestOptions.none())

        /** @see [archive] */
        fun archive(
            params: ItemArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Item>>

        /** @see [archive] */
        fun archive(params: ItemArchiveParams): CompletableFuture<HttpResponseFor<Item>> =
            archive(params, RequestOptions.none())

        /** @see [archive] */
        fun archive(
            itemId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Item>> =
            archive(itemId, ItemArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /items/{item_id}`, but is otherwise the same as
         * [ItemServiceAsync.fetch].
         */
        fun fetch(itemId: String): CompletableFuture<HttpResponseFor<Item>> =
            fetch(itemId, ItemFetchParams.none())

        /** @see [fetch] */
        fun fetch(
            itemId: String,
            params: ItemFetchParams = ItemFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Item>> =
            fetch(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see [fetch] */
        fun fetch(
            itemId: String,
            params: ItemFetchParams = ItemFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<Item>> = fetch(itemId, params, RequestOptions.none())

        /** @see [fetch] */
        fun fetch(
            params: ItemFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Item>>

        /** @see [fetch] */
        fun fetch(params: ItemFetchParams): CompletableFuture<HttpResponseFor<Item>> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        fun fetch(
            itemId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Item>> =
            fetch(itemId, ItemFetchParams.none(), requestOptions)
    }
}
