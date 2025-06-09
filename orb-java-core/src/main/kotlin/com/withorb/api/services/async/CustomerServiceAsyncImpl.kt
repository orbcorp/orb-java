// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.emptyHandler
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.Customer
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerDeleteParams
import com.withorb.api.models.CustomerFetchByExternalIdParams
import com.withorb.api.models.CustomerFetchParams
import com.withorb.api.models.CustomerListPageAsync
import com.withorb.api.models.CustomerListPageResponse
import com.withorb.api.models.CustomerListParams
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayParams
import com.withorb.api.models.CustomerUpdateByExternalIdParams
import com.withorb.api.models.CustomerUpdateParams
import com.withorb.api.services.async.customers.BalanceTransactionServiceAsync
import com.withorb.api.services.async.customers.BalanceTransactionServiceAsyncImpl
import com.withorb.api.services.async.customers.CostServiceAsync
import com.withorb.api.services.async.customers.CostServiceAsyncImpl
import com.withorb.api.services.async.customers.CreditServiceAsync
import com.withorb.api.services.async.customers.CreditServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class CustomerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomerServiceAsync {

    private val withRawResponse: CustomerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val costs: CostServiceAsync by lazy { CostServiceAsyncImpl(clientOptions) }

    private val credits: CreditServiceAsync by lazy { CreditServiceAsyncImpl(clientOptions) }

    private val balanceTransactions: BalanceTransactionServiceAsync by lazy {
        BalanceTransactionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerServiceAsync.WithRawResponse = withRawResponse

    override fun costs(): CostServiceAsync = costs

    override fun credits(): CreditServiceAsync = credits

    override fun balanceTransactions(): BalanceTransactionServiceAsync = balanceTransactions

    override fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Customer> =
        // post /customers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Customer> =
        // put /customers/{customer_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListPageAsync> =
        // get /customers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CustomerDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /customers/{customer_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun fetch(
        params: CustomerFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Customer> =
        // get /customers/{customer_id}
        withRawResponse().fetch(params, requestOptions).thenApply { it.parse() }

    override fun fetchByExternalId(
        params: CustomerFetchByExternalIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Customer> =
        // get /customers/external_customer_id/{external_customer_id}
        withRawResponse().fetchByExternalId(params, requestOptions).thenApply { it.parse() }

    override fun syncPaymentMethodsFromGateway(
        params: CustomerSyncPaymentMethodsFromGatewayParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /customers/{customer_id}/sync_payment_methods_from_gateway
        withRawResponse().syncPaymentMethodsFromGateway(params, requestOptions).thenAccept {}

    override fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post
        // /customers/external_customer_id/{external_customer_id}/sync_payment_methods_from_gateway
        withRawResponse()
            .syncPaymentMethodsFromGatewayByExternalCustomerId(params, requestOptions)
            .thenAccept {}

    override fun updateByExternalId(
        params: CustomerUpdateByExternalIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Customer> =
        // put /customers/external_customer_id/{external_customer_id}
        withRawResponse().updateByExternalId(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val costs: CostServiceAsync.WithRawResponse by lazy {
            CostServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val credits: CreditServiceAsync.WithRawResponse by lazy {
            CreditServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val balanceTransactions: BalanceTransactionServiceAsync.WithRawResponse by lazy {
            BalanceTransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun costs(): CostServiceAsync.WithRawResponse = costs

        override fun credits(): CreditServiceAsync.WithRawResponse = credits

        override fun balanceTransactions(): BalanceTransactionServiceAsync.WithRawResponse =
            balanceTransactions

        private val createHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("customers")
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

        private val updateHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("customers", params._pathParam(0))
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

        private val listHandler: Handler<CustomerListPageResponse> =
            jsonHandler<CustomerListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CustomerListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers")
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
                                CustomerListPageAsync.builder()
                                    .service(CustomerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("customers", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { deleteHandler.handle(it) } }
                }
        }

        private val fetchHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: CustomerFetchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers", params._pathParam(0))
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

        private val fetchByExternalIdHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetchByExternalId(
            params: CustomerFetchByExternalIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalCustomerId", params.externalCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("customers", "external_customer_id", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { fetchByExternalIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val syncPaymentMethodsFromGatewayHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun syncPaymentMethodsFromGateway(
            params: CustomerSyncPaymentMethodsFromGatewayParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "customers",
                        params._pathParam(0),
                        "sync_payment_methods_from_gateway",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response.use { syncPaymentMethodsFromGatewayHandler.handle(it) }
                    }
                }
        }

        private val syncPaymentMethodsFromGatewayByExternalCustomerIdHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalCustomerId", params.externalCustomerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "customers",
                        "external_customer_id",
                        params._pathParam(0),
                        "sync_payment_methods_from_gateway",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response.use {
                            syncPaymentMethodsFromGatewayByExternalCustomerIdHandler.handle(it)
                        }
                    }
                }
        }

        private val updateByExternalIdHandler: Handler<Customer> =
            jsonHandler<Customer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun updateByExternalId(
            params: CustomerUpdateByExternalIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("customers", "external_customer_id", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateByExternalIdHandler.handle(it) }
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
