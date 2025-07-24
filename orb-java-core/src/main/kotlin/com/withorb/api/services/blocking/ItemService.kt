// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Item
import com.withorb.api.models.ItemArchiveParams
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPage
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemUpdateParams
import java.util.function.Consumer

interface ItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemService

    /** This endpoint is used to create an [Item](/core-concepts#item). */
    fun create(params: ItemCreateParams): Item = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item

    /** This endpoint can be used to update properties on the Item. */
    fun update(itemId: String): Item = update(itemId, ItemUpdateParams.none())

    /** @see update */
    fun update(
        itemId: String,
        params: ItemUpdateParams = ItemUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item = update(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see update */
    fun update(itemId: String, params: ItemUpdateParams = ItemUpdateParams.none()): Item =
        update(itemId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item

    /** @see update */
    fun update(params: ItemUpdateParams): Item = update(params, RequestOptions.none())

    /** @see update */
    fun update(itemId: String, requestOptions: RequestOptions): Item =
        update(itemId, ItemUpdateParams.none(), requestOptions)

    /** This endpoint returns a list of all Items, ordered in descending order by creation time. */
    fun list(): ItemListPage = list(ItemListParams.none())

    /** @see list */
    fun list(
        params: ItemListParams = ItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemListPage

    /** @see list */
    fun list(params: ItemListParams = ItemListParams.none()): ItemListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ItemListPage =
        list(ItemListParams.none(), requestOptions)

    /** Archive item */
    fun archive(itemId: String): Item = archive(itemId, ItemArchiveParams.none())

    /** @see archive */
    fun archive(
        itemId: String,
        params: ItemArchiveParams = ItemArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item = archive(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see archive */
    fun archive(itemId: String, params: ItemArchiveParams = ItemArchiveParams.none()): Item =
        archive(itemId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: ItemArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item

    /** @see archive */
    fun archive(params: ItemArchiveParams): Item = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(itemId: String, requestOptions: RequestOptions): Item =
        archive(itemId, ItemArchiveParams.none(), requestOptions)

    /** This endpoint returns an item identified by its item_id. */
    fun fetch(itemId: String): Item = fetch(itemId, ItemFetchParams.none())

    /** @see fetch */
    fun fetch(
        itemId: String,
        params: ItemFetchParams = ItemFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Item = fetch(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see fetch */
    fun fetch(itemId: String, params: ItemFetchParams = ItemFetchParams.none()): Item =
        fetch(itemId, params, RequestOptions.none())

    /** @see fetch */
    fun fetch(params: ItemFetchParams, requestOptions: RequestOptions = RequestOptions.none()): Item

    /** @see fetch */
    fun fetch(params: ItemFetchParams): Item = fetch(params, RequestOptions.none())

    /** @see fetch */
    fun fetch(itemId: String, requestOptions: RequestOptions): Item =
        fetch(itemId, ItemFetchParams.none(), requestOptions)

    /** A view of [ItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /items`, but is otherwise the same as
         * [ItemService.create].
         */
        @MustBeClosed
        fun create(params: ItemCreateParams): HttpResponseFor<Item> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item>

        /**
         * Returns a raw HTTP response for `put /items/{item_id}`, but is otherwise the same as
         * [ItemService.update].
         */
        @MustBeClosed
        fun update(itemId: String): HttpResponseFor<Item> = update(itemId, ItemUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            itemId: String,
            params: ItemUpdateParams = ItemUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item> = update(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            itemId: String,
            params: ItemUpdateParams = ItemUpdateParams.none(),
        ): HttpResponseFor<Item> = update(itemId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item>

        /** @see update */
        @MustBeClosed
        fun update(params: ItemUpdateParams): HttpResponseFor<Item> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(itemId: String, requestOptions: RequestOptions): HttpResponseFor<Item> =
            update(itemId, ItemUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /items`, but is otherwise the same as
         * [ItemService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ItemListPage> = list(ItemListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ItemListParams = ItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ItemListParams = ItemListParams.none()): HttpResponseFor<ItemListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ItemListPage> =
            list(ItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /items/{item_id}/archive`, but is otherwise the
         * same as [ItemService.archive].
         */
        @MustBeClosed
        fun archive(itemId: String): HttpResponseFor<Item> =
            archive(itemId, ItemArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            itemId: String,
            params: ItemArchiveParams = ItemArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item> =
            archive(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            itemId: String,
            params: ItemArchiveParams = ItemArchiveParams.none(),
        ): HttpResponseFor<Item> = archive(itemId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: ItemArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item>

        /** @see archive */
        @MustBeClosed
        fun archive(params: ItemArchiveParams): HttpResponseFor<Item> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(itemId: String, requestOptions: RequestOptions): HttpResponseFor<Item> =
            archive(itemId, ItemArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /items/{item_id}`, but is otherwise the same as
         * [ItemService.fetch].
         */
        @MustBeClosed
        fun fetch(itemId: String): HttpResponseFor<Item> = fetch(itemId, ItemFetchParams.none())

        /** @see fetch */
        @MustBeClosed
        fun fetch(
            itemId: String,
            params: ItemFetchParams = ItemFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item> = fetch(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see fetch */
        @MustBeClosed
        fun fetch(
            itemId: String,
            params: ItemFetchParams = ItemFetchParams.none(),
        ): HttpResponseFor<Item> = fetch(itemId, params, RequestOptions.none())

        /** @see fetch */
        @MustBeClosed
        fun fetch(
            params: ItemFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Item>

        /** @see fetch */
        @MustBeClosed
        fun fetch(params: ItemFetchParams): HttpResponseFor<Item> =
            fetch(params, RequestOptions.none())

        /** @see fetch */
        @MustBeClosed
        fun fetch(itemId: String, requestOptions: RequestOptions): HttpResponseFor<Item> =
            fetch(itemId, ItemFetchParams.none(), requestOptions)
    }
}
