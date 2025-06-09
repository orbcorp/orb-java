// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.events

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
import com.withorb.api.models.EventBackfillCloseParams
import com.withorb.api.models.EventBackfillCloseResponse
import com.withorb.api.models.EventBackfillCreateParams
import com.withorb.api.models.EventBackfillCreateResponse
import com.withorb.api.models.EventBackfillFetchParams
import com.withorb.api.models.EventBackfillFetchResponse
import com.withorb.api.models.EventBackfillListPageAsync
import com.withorb.api.models.EventBackfillListPageResponse
import com.withorb.api.models.EventBackfillListParams
import com.withorb.api.models.EventBackfillRevertParams
import com.withorb.api.models.EventBackfillRevertResponse
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class BackfillServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BackfillServiceAsync {

    private val withRawResponse: BackfillServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BackfillServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: EventBackfillCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventBackfillCreateResponse> =
        // post /events/backfills
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EventBackfillListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventBackfillListPageAsync> =
        // get /events/backfills
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun close(
        params: EventBackfillCloseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventBackfillCloseResponse> =
        // post /events/backfills/{backfill_id}/close
        withRawResponse().close(params, requestOptions).thenApply { it.parse() }

    override fun fetch(
        params: EventBackfillFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventBackfillFetchResponse> =
        // get /events/backfills/{backfill_id}
        withRawResponse().fetch(params, requestOptions).thenApply { it.parse() }

    override fun revert(
        params: EventBackfillRevertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventBackfillRevertResponse> =
        // post /events/backfills/{backfill_id}/revert
        withRawResponse().revert(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BackfillServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<EventBackfillCreateResponse> =
            jsonHandler<EventBackfillCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: EventBackfillCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventBackfillCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("events", "backfills")
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

        private val listHandler: Handler<EventBackfillListPageResponse> =
            jsonHandler<EventBackfillListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: EventBackfillListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventBackfillListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("events", "backfills")
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
                                EventBackfillListPageAsync.builder()
                                    .service(BackfillServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val closeHandler: Handler<EventBackfillCloseResponse> =
            jsonHandler<EventBackfillCloseResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun close(
            params: EventBackfillCloseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventBackfillCloseResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("backfillId", params.backfillId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("events", "backfills", params._pathParam(0), "close")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { closeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val fetchHandler: Handler<EventBackfillFetchResponse> =
            jsonHandler<EventBackfillFetchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetch(
            params: EventBackfillFetchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventBackfillFetchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("backfillId", params.backfillId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("events", "backfills", params._pathParam(0))
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

        private val revertHandler: Handler<EventBackfillRevertResponse> =
            jsonHandler<EventBackfillRevertResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun revert(
            params: EventBackfillRevertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventBackfillRevertResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("backfillId", params.backfillId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("events", "backfills", params._pathParam(0), "revert")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { revertHandler.handle(it) }
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
