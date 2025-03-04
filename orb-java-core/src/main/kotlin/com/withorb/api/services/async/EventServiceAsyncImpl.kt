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
import com.withorb.api.core.http.parseable
import com.withorb.api.core.json
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.EventDeprecateParams
import com.withorb.api.models.EventDeprecateResponse
import com.withorb.api.models.EventIngestParams
import com.withorb.api.models.EventIngestResponse
import com.withorb.api.models.EventSearchParams
import com.withorb.api.models.EventSearchResponse
import com.withorb.api.models.EventUpdateParams
import com.withorb.api.models.EventUpdateResponse
import com.withorb.api.services.async.events.BackfillServiceAsync
import com.withorb.api.services.async.events.BackfillServiceAsyncImpl
import com.withorb.api.services.async.events.VolumeServiceAsync
import com.withorb.api.services.async.events.VolumeServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class EventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventServiceAsync {

    private val withRawResponse: EventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val backfills: BackfillServiceAsync by lazy { BackfillServiceAsyncImpl(clientOptions) }

    private val volume: VolumeServiceAsync by lazy { VolumeServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EventServiceAsync.WithRawResponse = withRawResponse

    override fun backfills(): BackfillServiceAsync = backfills

    override fun volume(): VolumeServiceAsync = volume

    override fun update(
        params: EventUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventUpdateResponse> =
        // put /events/{event_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun deprecate(
        params: EventDeprecateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventDeprecateResponse> =
        // put /events/{event_id}/deprecate
        withRawResponse().deprecate(params, requestOptions).thenApply { it.parse() }

    override fun ingest(
        params: EventIngestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventIngestResponse> =
        // post /ingest
        withRawResponse().ingest(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: EventSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSearchResponse> =
        // post /events/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val backfills: BackfillServiceAsync.WithRawResponse by lazy {
            BackfillServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val volume: VolumeServiceAsync.WithRawResponse by lazy {
            VolumeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun backfills(): BackfillServiceAsync.WithRawResponse = backfills

        override fun volume(): VolumeServiceAsync.WithRawResponse = volume

        private val updateHandler: Handler<EventUpdateResponse> =
            jsonHandler<EventUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: EventUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("events", params.getPathParam(0))
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

        private val deprecateHandler: Handler<EventDeprecateResponse> =
            jsonHandler<EventDeprecateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun deprecate(
            params: EventDeprecateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventDeprecateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("events", params.getPathParam(0), "deprecate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { deprecateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val ingestHandler: Handler<EventIngestResponse> =
            jsonHandler<EventIngestResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun ingest(
            params: EventIngestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventIngestResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("ingest")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { ingestHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchHandler: Handler<EventSearchResponse> =
            jsonHandler<EventSearchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun search(
            params: EventSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("events", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { searchHandler.handle(it) }
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
