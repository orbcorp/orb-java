// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
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
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import com.withorb.api.models.DimensionalPriceGroupListPageAsync
import com.withorb.api.models.DimensionalPriceGroupListParams
import com.withorb.api.models.DimensionalPriceGroupRetrieveParams
import com.withorb.api.models.DimensionalPriceGroups
import com.withorb.api.services.async.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdServiceAsync
import com.withorb.api.services.async.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

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
    ): CompletableFuture<DimensionalPriceGroup> =
        // post /dimensional_price_groups
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DimensionalPriceGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DimensionalPriceGroup> =
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

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val externalDimensionalPriceGroupId:
            ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse by lazy {
            ExternalDimensionalPriceGroupIdServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun externalDimensionalPriceGroupId():
            ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse =
            externalDimensionalPriceGroupId

        private val createHandler: Handler<DimensionalPriceGroup> =
            jsonHandler<DimensionalPriceGroup>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: DimensionalPriceGroupCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
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

        private val retrieveHandler: Handler<DimensionalPriceGroup> =
            jsonHandler<DimensionalPriceGroup>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: DimensionalPriceGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dimensionalPriceGroupId", params.dimensionalPriceGroupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dimensional_price_groups", params._pathParam(0))
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

        private val listHandler: Handler<DimensionalPriceGroups> =
            jsonHandler<DimensionalPriceGroups>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DimensionalPriceGroupListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DimensionalPriceGroupListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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
                                DimensionalPriceGroupListPageAsync.builder()
                                    .service(DimensionalPriceGroupServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
