// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.prices

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
import com.withorb.api.models.PriceExternalPriceIdFetchParams
import com.withorb.api.models.PriceExternalPriceIdUpdateParams
import com.withorb.api.models.PriceModel
import java.util.concurrent.CompletableFuture

class ExternalPriceIdServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalPriceIdServiceAsync {

    private val withRawResponse: ExternalPriceIdServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalPriceIdServiceAsync.WithRawResponse = withRawResponse

    override fun update(
        params: PriceExternalPriceIdUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PriceModel> =
        // put /prices/external_price_id/{external_price_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun fetch(
        params: PriceExternalPriceIdFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PriceModel> =
        // get /prices/external_price_id/{external_price_id}
        withRawResponse().fetch(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalPriceIdServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val updateHandler: Handler<PriceModel> =
            jsonHandler<PriceModel>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PriceExternalPriceIdUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PriceModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("prices", "external_price_id", params.getPathParam(0))
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

        private val fetchHandler: Handler<PriceModel> =
            jsonHandler<PriceModel>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: PriceExternalPriceIdFetchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PriceModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("prices", "external_price_id", params.getPathParam(0))
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
