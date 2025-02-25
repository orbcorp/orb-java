// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.Item
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPageAsync
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemUpdateParams
import java.util.concurrent.CompletableFuture

interface ItemServiceAsync {

    /** This endpoint is used to create an [Item](/core-concepts#item). */
    @JvmOverloads
    fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Item>

    /** This endpoint can be used to update properties on the Item. */
    @JvmOverloads
    fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Item>

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
    ): CompletableFuture<Item>
}
