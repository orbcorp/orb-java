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
import com.withorb.api.models.Price
import com.withorb.api.models.PriceCreateParams
import com.withorb.api.models.PriceEvaluateMultipleParams
import com.withorb.api.models.PriceEvaluateMultipleResponse
import com.withorb.api.models.PriceEvaluateParams
import com.withorb.api.models.PriceEvaluatePreviewEventsParams
import com.withorb.api.models.PriceEvaluatePreviewEventsResponse
import com.withorb.api.models.PriceEvaluateResponse
import com.withorb.api.models.PriceFetchParams
import com.withorb.api.models.PriceListPage
import com.withorb.api.models.PriceListPageResponse
import com.withorb.api.models.PriceListParams
import com.withorb.api.models.PriceUpdateParams
import com.withorb.api.services.blocking.prices.ExternalPriceIdService
import com.withorb.api.services.blocking.prices.ExternalPriceIdServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PriceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PriceService {

    private val withRawResponse: PriceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalPriceId: ExternalPriceIdService by lazy {
        ExternalPriceIdServiceImpl(clientOptions)
    }

    override fun withRawResponse(): PriceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PriceService =
        PriceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun externalPriceId(): ExternalPriceIdService = externalPriceId

    override fun create(params: PriceCreateParams, requestOptions: RequestOptions): Price =
        // post /prices
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: PriceUpdateParams, requestOptions: RequestOptions): Price =
        // put /prices/{price_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: PriceListParams, requestOptions: RequestOptions): PriceListPage =
        // get /prices
        withRawResponse().list(params, requestOptions).parse()

    override fun evaluate(
        params: PriceEvaluateParams,
        requestOptions: RequestOptions,
    ): PriceEvaluateResponse =
        // post /prices/{price_id}/evaluate
        withRawResponse().evaluate(params, requestOptions).parse()

    override fun evaluateMultiple(
        params: PriceEvaluateMultipleParams,
        requestOptions: RequestOptions,
    ): PriceEvaluateMultipleResponse =
        // post /prices/evaluate
        withRawResponse().evaluateMultiple(params, requestOptions).parse()

    override fun evaluatePreviewEvents(
        params: PriceEvaluatePreviewEventsParams,
        requestOptions: RequestOptions,
    ): PriceEvaluatePreviewEventsResponse =
        // post /prices/evaluate_preview_events
        withRawResponse().evaluatePreviewEvents(params, requestOptions).parse()

    override fun fetch(params: PriceFetchParams, requestOptions: RequestOptions): Price =
        // get /prices/{price_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PriceService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val externalPriceId: ExternalPriceIdService.WithRawResponse by lazy {
            ExternalPriceIdServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PriceService.WithRawResponse =
            PriceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun externalPriceId(): ExternalPriceIdService.WithRawResponse = externalPriceId

        private val createHandler: Handler<Price> =
            jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PriceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Price> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("prices")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Price> =
            jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PriceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Price> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("priceId", params.priceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("prices", params._pathParam(0))
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

        private val listHandler: Handler<PriceListPageResponse> =
            jsonHandler<PriceListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PriceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PriceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("prices")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PriceListPage.builder()
                            .service(PriceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val evaluateHandler: Handler<PriceEvaluateResponse> =
            jsonHandler<PriceEvaluateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun evaluate(
            params: PriceEvaluateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PriceEvaluateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("priceId", params.priceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("prices", params._pathParam(0), "evaluate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { evaluateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val evaluateMultipleHandler: Handler<PriceEvaluateMultipleResponse> =
            jsonHandler<PriceEvaluateMultipleResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun evaluateMultiple(
            params: PriceEvaluateMultipleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PriceEvaluateMultipleResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("prices", "evaluate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { evaluateMultipleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val evaluatePreviewEventsHandler: Handler<PriceEvaluatePreviewEventsResponse> =
            jsonHandler<PriceEvaluatePreviewEventsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun evaluatePreviewEvents(
            params: PriceEvaluatePreviewEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PriceEvaluatePreviewEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("prices", "evaluate_preview_events")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { evaluatePreviewEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val fetchHandler: Handler<Price> =
            jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: PriceFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Price> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("priceId", params.priceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("prices", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
