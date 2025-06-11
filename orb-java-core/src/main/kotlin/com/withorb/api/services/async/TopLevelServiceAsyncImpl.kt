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
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.TopLevelPingParams
import com.withorb.api.models.TopLevelPingResponse
import java.util.concurrent.CompletableFuture

class TopLevelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TopLevelServiceAsync {

    private val withRawResponse: TopLevelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TopLevelServiceAsync.WithRawResponse = withRawResponse

    override fun ping(
        params: TopLevelPingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TopLevelPingResponse> =
        // get /ping
        withRawResponse().ping(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TopLevelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val pingHandler: Handler<TopLevelPingResponse> =
            jsonHandler<TopLevelPingResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun ping(
            params: TopLevelPingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TopLevelPingResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ping")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { pingHandler.handle(it) }
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
