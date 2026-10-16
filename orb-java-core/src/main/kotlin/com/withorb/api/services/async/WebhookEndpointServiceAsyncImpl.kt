// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.emptyHandler
import com.withorb.api.core.handlers.errorBodyHandler
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.WebhookEndpoint
import com.withorb.api.models.WebhookEndpointCreateParams
import com.withorb.api.models.WebhookEndpointDeleteParams
import com.withorb.api.models.WebhookEndpointDisableParams
import com.withorb.api.models.WebhookEndpointEnableParams
import com.withorb.api.models.WebhookEndpointListPageAsync
import com.withorb.api.models.WebhookEndpointListPageResponse
import com.withorb.api.models.WebhookEndpointListParams
import com.withorb.api.models.WebhookEndpointRetrieveParams
import com.withorb.api.models.WebhookEndpointUpdateParams
import com.withorb.api.models.WebhookEndpointWithSecret
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * A webhook endpoint is an HTTPS URL that Orb sends
 * [webhook events](/integrations-and-exports/webhooks) to.
 */
class WebhookEndpointServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : WebhookEndpointServiceAsync {

    private val withRawResponse: WebhookEndpointServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookEndpointServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): WebhookEndpointServiceAsync =
        WebhookEndpointServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: WebhookEndpointCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookEndpointWithSecret> =
        // post /webhook_endpoints
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: WebhookEndpointRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookEndpoint> =
        // get /webhook_endpoints/{webhook_endpoint_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: WebhookEndpointUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookEndpoint> =
        // put /webhook_endpoints/{webhook_endpoint_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: WebhookEndpointListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookEndpointListPageAsync> =
        // get /webhook_endpoints
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: WebhookEndpointDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /webhook_endpoints/{webhook_endpoint_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun disable(
        params: WebhookEndpointDisableParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookEndpoint> =
        // post /webhook_endpoints/{webhook_endpoint_id}/disable
        withRawResponse().disable(params, requestOptions).thenApply { it.parse() }

    override fun enable(
        params: WebhookEndpointEnableParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookEndpoint> =
        // post /webhook_endpoints/{webhook_endpoint_id}/enable
        withRawResponse().enable(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookEndpointServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookEndpointServiceAsync.WithRawResponse =
            WebhookEndpointServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<WebhookEndpointWithSecret> =
            jsonHandler<WebhookEndpointWithSecret>(clientOptions.jsonMapper)

        override fun create(
            params: WebhookEndpointCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookEndpointWithSecret>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val retrieveHandler: Handler<WebhookEndpoint> =
            jsonHandler<WebhookEndpoint>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WebhookEndpointRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookEndpointId", params.webhookEndpointId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<WebhookEndpoint> =
            jsonHandler<WebhookEndpoint>(clientOptions.jsonMapper)

        override fun update(
            params: WebhookEndpointUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookEndpointId", params.webhookEndpointId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val listHandler: Handler<WebhookEndpointListPageResponse> =
            jsonHandler<WebhookEndpointListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WebhookEndpointListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookEndpointListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                WebhookEndpointListPageAsync.builder()
                                    .service(WebhookEndpointServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: WebhookEndpointDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookEndpointId", params.webhookEndpointId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val disableHandler: Handler<WebhookEndpoint> =
            jsonHandler<WebhookEndpoint>(clientOptions.jsonMapper)

        override fun disable(
            params: WebhookEndpointDisableParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookEndpointId", params.webhookEndpointId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints", params._pathParam(0), "disable")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { disableHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val enableHandler: Handler<WebhookEndpoint> =
            jsonHandler<WebhookEndpoint>(clientOptions.jsonMapper)

        override fun enable(
            params: WebhookEndpointEnableParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookEndpointId", params.webhookEndpointId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_endpoints", params._pathParam(0), "enable")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { enableHandler.handle(it) }
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
