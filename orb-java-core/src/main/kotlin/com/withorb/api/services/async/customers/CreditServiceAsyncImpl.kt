// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.errorBodyHandler
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.CustomerCreditListByExternalIdPageAsync
import com.withorb.api.models.CustomerCreditListByExternalIdPageResponse
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListPageAsync
import com.withorb.api.models.CustomerCreditListPageResponse
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.services.async.customers.credits.LedgerServiceAsync
import com.withorb.api.services.async.customers.credits.LedgerServiceAsyncImpl
import com.withorb.api.services.async.customers.credits.TopUpServiceAsync
import com.withorb.api.services.async.customers.credits.TopUpServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CreditServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditServiceAsync {

    private val withRawResponse: CreditServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ledger: LedgerServiceAsync by lazy { LedgerServiceAsyncImpl(clientOptions) }

    private val topUps: TopUpServiceAsync by lazy { TopUpServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CreditServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditServiceAsync =
        CreditServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun ledger(): LedgerServiceAsync = ledger

    override fun topUps(): TopUpServiceAsync = topUps

    override fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCreditListPageAsync> =
        // get /customers/{customer_id}/credits
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listByExternalId(
        params: CustomerCreditListByExternalIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCreditListByExternalIdPageAsync> =
        // get /customers/external_customer_id/{external_customer_id}/credits
        withRawResponse().listByExternalId(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val ledger: LedgerServiceAsync.WithRawResponse by lazy {
            LedgerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val topUps: TopUpServiceAsync.WithRawResponse by lazy {
            TopUpServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditServiceAsync.WithRawResponse =
            CreditServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun ledger(): LedgerServiceAsync.WithRawResponse = ledger

        override fun topUps(): TopUpServiceAsync.WithRawResponse = topUps

        private val listHandler: Handler<CustomerCreditListPageResponse> =
            jsonHandler<CustomerCreditListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CustomerCreditListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCreditListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0), "credits")
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
                                CustomerCreditListPageAsync.builder()
                                    .service(CreditServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listByExternalIdHandler: Handler<CustomerCreditListByExternalIdPageResponse> =
            jsonHandler<CustomerCreditListByExternalIdPageResponse>(clientOptions.jsonMapper)

        override fun listByExternalId(
            params: CustomerCreditListByExternalIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCreditListByExternalIdPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalCustomerId", params.externalCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params._pathParam(0),
                        "credits",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listByExternalIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CustomerCreditListByExternalIdPageAsync.builder()
                                    .service(CreditServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
