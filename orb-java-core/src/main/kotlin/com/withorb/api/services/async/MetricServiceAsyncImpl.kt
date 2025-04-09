// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
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
import com.withorb.api.models.BillableMetric
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListPageAsync
import com.withorb.api.models.MetricListPageResponse
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUpdateParams
import java.util.concurrent.CompletableFuture

class MetricServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MetricServiceAsync {

    private val withRawResponse: MetricServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MetricServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: MetricCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillableMetric> =
        // post /metrics
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MetricUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillableMetric> =
        // put /metrics/{metric_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MetricListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MetricListPageAsync> =
        // get /metrics
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun fetch(
        params: MetricFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillableMetric> =
        // get /metrics/{metric_id}
        withRawResponse().fetch(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MetricServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BillableMetric> =
            jsonHandler<BillableMetric>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: MetricCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillableMetric>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("metrics")
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

        private val updateHandler: Handler<BillableMetric> =
            jsonHandler<BillableMetric>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: MetricUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillableMetric>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("metrics", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<MetricListPageResponse> =
            jsonHandler<MetricListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: MetricListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MetricListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("metrics")
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
                                MetricListPageAsync.builder()
                                    .service(MetricServiceAsyncImpl(clientOptions))
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val fetchHandler: Handler<BillableMetric> =
            jsonHandler<BillableMetric>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: MetricFetchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillableMetric>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("metrics", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { fetchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
