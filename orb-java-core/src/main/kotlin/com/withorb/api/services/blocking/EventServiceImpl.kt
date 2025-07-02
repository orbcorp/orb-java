// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

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
import com.withorb.api.core.prepare
import com.withorb.api.models.EventDeprecateParams
import com.withorb.api.models.EventDeprecateResponse
import com.withorb.api.models.EventIngestParams
import com.withorb.api.models.EventIngestResponse
import com.withorb.api.models.EventSearchParams
import com.withorb.api.models.EventSearchResponse
import com.withorb.api.models.EventUpdateParams
import com.withorb.api.models.EventUpdateResponse
import com.withorb.api.services.blocking.events.BackfillService
import com.withorb.api.services.blocking.events.BackfillServiceImpl
import com.withorb.api.services.blocking.events.VolumeService
import com.withorb.api.services.blocking.events.VolumeServiceImpl
import kotlin.jvm.optionals.getOrNull

class EventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventService {

    private val withRawResponse: EventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val backfills: BackfillService by lazy { BackfillServiceImpl(clientOptions) }

    private val volume: VolumeService by lazy { VolumeServiceImpl(clientOptions) }

    override fun withRawResponse(): EventService.WithRawResponse = withRawResponse

    override fun backfills(): BackfillService = backfills

    override fun volume(): VolumeService = volume

    override fun update(
        params: EventUpdateParams,
        requestOptions: RequestOptions,
    ): EventUpdateResponse =
        // put /events/{event_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun deprecate(
        params: EventDeprecateParams,
        requestOptions: RequestOptions,
    ): EventDeprecateResponse =
        // put /events/{event_id}/deprecate
        withRawResponse().deprecate(params, requestOptions).parse()

    override fun ingest(
        params: EventIngestParams,
        requestOptions: RequestOptions,
    ): EventIngestResponse =
        // post /ingest
        withRawResponse().ingest(params, requestOptions).parse()

    override fun search(
        params: EventSearchParams,
        requestOptions: RequestOptions,
    ): EventSearchResponse =
        // post /events/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val backfills: BackfillService.WithRawResponse by lazy {
            BackfillServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val volume: VolumeService.WithRawResponse by lazy {
            VolumeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun backfills(): BackfillService.WithRawResponse = backfills

        override fun volume(): VolumeService.WithRawResponse = volume

        private val updateHandler: Handler<EventUpdateResponse> =
            jsonHandler<EventUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: EventUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventId", params.eventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<EventDeprecateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventId", params.eventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", params._pathParam(0), "deprecate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deprecateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<EventIngestResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ingest")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { ingestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<EventSearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
