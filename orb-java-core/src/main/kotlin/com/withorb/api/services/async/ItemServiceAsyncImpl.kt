// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.json
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Item
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemFetchParams
import com.withorb.api.models.ItemListPageAsync
import com.withorb.api.models.ItemListParams
import com.withorb.api.models.ItemUpdateParams
import java.util.concurrent.CompletableFuture

class ItemServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ItemServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Item> =
        jsonHandler<Item>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint is used to create an [Item](../guides/concepts#item). */
    override fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Item> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("items")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<Item> =
        jsonHandler<Item>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint can be used to update properties on the Item. */
    override fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Item> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("items", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<ItemListPageAsync.Response> =
        jsonHandler<ItemListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** This endpoint returns a list of all Items, ordered in descending order by creation time. */
    override fun list(
        params: ItemListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ItemListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("items")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { ItemListPageAsync.of(this, params, it) }
        }
    }

    private val fetchHandler: Handler<Item> =
        jsonHandler<Item>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint returns an item identified by its item_id. */
    override fun fetch(
        params: ItemFetchParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Item> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("items", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { fetchHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
