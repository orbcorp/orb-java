// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

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
import com.withorb.api.models.CustomerCostListByExternalIdParams
import com.withorb.api.models.CustomerCostListByExternalIdResponse
import com.withorb.api.models.CustomerCostListParams
import com.withorb.api.models.CustomerCostListResponse
import java.util.concurrent.CompletableFuture

class CostServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CostServiceAsync {

    private val withRawResponse: CostServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CostServiceAsync.WithRawResponse = withRawResponse

    override fun list(
        params: CustomerCostListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCostListResponse> =
        // get /customers/{customer_id}/costs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listByExternalId(
        params: CustomerCostListByExternalIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCostListByExternalIdResponse> =
        // get /customers/external_customer_id/{external_customer_id}/costs
        withRawResponse().listByExternalId(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CostServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<CustomerCostListResponse> =
            jsonHandler<CustomerCostListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CustomerCostListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCostListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers", params._pathParam(0), "costs")
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

        private val listByExternalIdHandler: Handler<CustomerCostListByExternalIdResponse> =
            jsonHandler<CustomerCostListByExternalIdResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listByExternalId(
            params: CustomerCostListByExternalIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCostListByExternalIdResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params._pathParam(0),
                        "costs",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listByExternalIdHandler.handle(it) }
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
