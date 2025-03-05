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
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import com.withorb.api.models.DimensionalPriceGroupListPageAsync
import com.withorb.api.models.DimensionalPriceGroupListParams
import com.withorb.api.models.DimensionalPriceGroupModel
import com.withorb.api.models.DimensionalPriceGroupRetrieveParams
import com.withorb.api.services.async.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdServiceAsync
import com.withorb.api.services.async.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class DimensionalPriceGroupServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : DimensionalPriceGroupServiceAsync {

    private val withRawResponse: DimensionalPriceGroupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalDimensionalPriceGroupId:
        ExternalDimensionalPriceGroupIdServiceAsync by lazy {
        ExternalDimensionalPriceGroupIdServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): DimensionalPriceGroupServiceAsync.WithRawResponse =
        withRawResponse

    override fun externalDimensionalPriceGroupId(): ExternalDimensionalPriceGroupIdServiceAsync =
        externalDimensionalPriceGroupId

    override fun create(
        params: DimensionalPriceGroupCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DimensionalPriceGroupModel> =
        // post /dimensional_price_groups
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DimensionalPriceGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DimensionalPriceGroupModel> =
        // get /dimensional_price_groups/{dimensional_price_group_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DimensionalPriceGroupListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DimensionalPriceGroupListPageAsync> =
        // get /dimensional_price_groups
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DimensionalPriceGroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val externalDimensionalPriceGroupId:
            ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse by lazy {
            ExternalDimensionalPriceGroupIdServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun externalDimensionalPriceGroupId():
            ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse =
            externalDimensionalPriceGroupId

        private val createHandler: Handler<DimensionalPriceGroupModel> =
            jsonHandler<DimensionalPriceGroupModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: DimensionalPriceGroupCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("dimensional_price_groups")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<DimensionalPriceGroupModel> =
            jsonHandler<DimensionalPriceGroupModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: DimensionalPriceGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("dimensional_price_groups", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<DimensionalPriceGroupListPageAsync.Response> =
            jsonHandler<DimensionalPriceGroupListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DimensionalPriceGroupListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("dimensional_price_groups")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                DimensionalPriceGroupListPageAsync.of(
                                    DimensionalPriceGroupServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
