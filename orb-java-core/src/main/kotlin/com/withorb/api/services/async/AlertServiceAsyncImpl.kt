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
import com.withorb.api.models.Alert
import com.withorb.api.models.AlertCreateForCustomerParams
import com.withorb.api.models.AlertCreateForExternalCustomerParams
import com.withorb.api.models.AlertCreateForSubscriptionParams
import com.withorb.api.models.AlertDisableParams
import com.withorb.api.models.AlertEnableParams
import com.withorb.api.models.AlertListPageAsync
import com.withorb.api.models.AlertListPageResponse
import com.withorb.api.models.AlertListParams
import com.withorb.api.models.AlertRetrieveParams
import com.withorb.api.models.AlertUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AlertServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AlertServiceAsync {

    private val withRawResponse: AlertServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlertServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertServiceAsync =
        AlertServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: AlertRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Alert> =
        // get /alerts/{alert_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AlertUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Alert> =
        // put /alerts/{alert_configuration_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AlertListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertListPageAsync> =
        // get /alerts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun createForCustomer(
        params: AlertCreateForCustomerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Alert> =
        // post /alerts/customer_id/{customer_id}
        withRawResponse().createForCustomer(params, requestOptions).thenApply { it.parse() }

    override fun createForExternalCustomer(
        params: AlertCreateForExternalCustomerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Alert> =
        // post /alerts/external_customer_id/{external_customer_id}
        withRawResponse().createForExternalCustomer(params, requestOptions).thenApply { it.parse() }

    override fun createForSubscription(
        params: AlertCreateForSubscriptionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Alert> =
        // post /alerts/subscription_id/{subscription_id}
        withRawResponse().createForSubscription(params, requestOptions).thenApply { it.parse() }

    override fun disable(
        params: AlertDisableParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Alert> =
        // post /alerts/{alert_configuration_id}/disable
        withRawResponse().disable(params, requestOptions).thenApply { it.parse() }

    override fun enable(
        params: AlertEnableParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Alert> =
        // post /alerts/{alert_configuration_id}/enable
        withRawResponse().enable(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlertServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlertServiceAsync.WithRawResponse =
            AlertServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AlertRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Alert>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("alertId", params.alertId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", params._pathParam(0))
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

        private val updateHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: AlertUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Alert>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("alertConfigurationId", params.alertConfigurationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", params._pathParam(0))
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

        private val listHandler: Handler<AlertListPageResponse> =
            jsonHandler<AlertListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AlertListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts")
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
                                AlertListPageAsync.builder()
                                    .service(AlertServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val createForCustomerHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createForCustomer(
            params: AlertCreateForCustomerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Alert>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", "customer_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createForCustomerHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createForExternalCustomerHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createForExternalCustomer(
            params: AlertCreateForExternalCustomerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Alert>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalCustomerId", params.externalCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", "external_customer_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createForExternalCustomerHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createForSubscriptionHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createForSubscription(
            params: AlertCreateForSubscriptionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Alert>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriptionId", params.subscriptionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", "subscription_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createForSubscriptionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val disableHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun disable(
            params: AlertDisableParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Alert>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("alertConfigurationId", params.alertConfigurationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", params._pathParam(0), "disable")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val enableHandler: Handler<Alert> =
            jsonHandler<Alert>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun enable(
            params: AlertEnableParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Alert>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("alertConfigurationId", params.alertConfigurationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alerts", params._pathParam(0), "enable")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
