// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.events

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
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.EventVolumeListParams
import com.withorb.api.models.EventVolumes
import java.util.concurrent.CompletableFuture

class VolumeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VolumeServiceAsync {

    private val withRawResponse: VolumeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VolumeServiceAsync.WithRawResponse = withRawResponse

    override fun list(
        params: EventVolumeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventVolumes> =
        // get /events/volume
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VolumeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<EventVolumes> =
            jsonHandler<EventVolumes>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: EventVolumeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventVolumes>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("events", "volume")
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
                    }
                }
        }
    }
}
