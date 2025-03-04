// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

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
import com.withorb.api.models.CustomerBalanceTransactionCreateParams
import com.withorb.api.models.CustomerBalanceTransactionCreateResponse
import com.withorb.api.models.CustomerBalanceTransactionListPageAsync
import com.withorb.api.models.CustomerBalanceTransactionListParams
import java.util.concurrent.CompletableFuture

class BalanceTransactionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BalanceTransactionServiceAsync {

    private val withRawResponse: BalanceTransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceTransactionServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: CustomerBalanceTransactionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerBalanceTransactionCreateResponse> =
        // post /customers/{customer_id}/balance_transactions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CustomerBalanceTransactionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerBalanceTransactionListPageAsync> =
        // get /customers/{customer_id}/balance_transactions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceTransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CustomerBalanceTransactionCreateResponse> =
            jsonHandler<CustomerBalanceTransactionCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: CustomerBalanceTransactionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerBalanceTransactionCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("customers", params.getPathParam(0), "balance_transactions")
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

        private val listHandler: Handler<CustomerBalanceTransactionListPageAsync.Response> =
            jsonHandler<CustomerBalanceTransactionListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CustomerBalanceTransactionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerBalanceTransactionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers", params.getPathParam(0), "balance_transactions")
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
                                CustomerBalanceTransactionListPageAsync.of(
                                    BalanceTransactionServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
