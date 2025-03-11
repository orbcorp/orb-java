// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers.credits

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
import com.withorb.api.models.CustomerCreditLedgerCreateEntryByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerCreateEntryByExternalIdResponse
import com.withorb.api.models.CustomerCreditLedgerCreateEntryParams
import com.withorb.api.models.CustomerCreditLedgerCreateEntryResponse
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdPage
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdPageAsync
import com.withorb.api.models.CustomerCreditLedgerListByExternalIdParams
import com.withorb.api.models.CustomerCreditLedgerListPage
import com.withorb.api.models.CustomerCreditLedgerListPageAsync
import com.withorb.api.models.CustomerCreditLedgerListParams
import java.util.concurrent.CompletableFuture

class LedgerServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : LedgerServiceAsync {

    private val withRawResponse: LedgerServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): LedgerServiceAsync.WithRawResponse = withRawResponse

    override fun list(params: CustomerCreditLedgerListParams, requestOptions: RequestOptions): CompletableFuture<CustomerCreditLedgerListPageAsync> =
        // get /customers/{customer_id}/credits/ledger
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun createEntry(params: CustomerCreditLedgerCreateEntryParams, requestOptions: RequestOptions): CompletableFuture<CustomerCreditLedgerCreateEntryResponse> =
        // post /customers/{customer_id}/credits/ledger_entry
        withRawResponse().createEntry(params, requestOptions).thenApply { it.parse() }

    override fun createEntryByExternalId(params: CustomerCreditLedgerCreateEntryByExternalIdParams, requestOptions: RequestOptions): CompletableFuture<CustomerCreditLedgerCreateEntryByExternalIdResponse> =
        // post /customers/external_customer_id/{external_customer_id}/credits/ledger_entry
        withRawResponse().createEntryByExternalId(params, requestOptions).thenApply { it.parse() }

    override fun listByExternalId(params: CustomerCreditLedgerListByExternalIdParams, requestOptions: RequestOptions): CompletableFuture<CustomerCreditLedgerListByExternalIdPageAsync> =
        // get /customers/external_customer_id/{external_customer_id}/credits/ledger
        withRawResponse().listByExternalId(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : LedgerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<CustomerCreditLedgerListPageAsync.Response> = jsonHandler<CustomerCreditLedgerListPageAsync.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: CustomerCreditLedgerListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CustomerCreditLedgerListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("customers", params.getPathParam(0), "credits", "ledger")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  CustomerCreditLedgerListPageAsync.of(LedgerServiceAsyncImpl(clientOptions), params, it)
              }
          } }
        }

        private val createEntryHandler: Handler<CustomerCreditLedgerCreateEntryResponse> = jsonHandler<CustomerCreditLedgerCreateEntryResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createEntry(params: CustomerCreditLedgerCreateEntryParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CustomerCreditLedgerCreateEntryResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("customers", params.getPathParam(0), "credits", "ledger_entry")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  createEntryHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val createEntryByExternalIdHandler: Handler<CustomerCreditLedgerCreateEntryByExternalIdResponse> = jsonHandler<CustomerCreditLedgerCreateEntryByExternalIdResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createEntryByExternalId(params: CustomerCreditLedgerCreateEntryByExternalIdParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CustomerCreditLedgerCreateEntryByExternalIdResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("customers", "external_customer_id", params.getPathParam(0), "credits", "ledger_entry")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  createEntryByExternalIdHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val listByExternalIdHandler: Handler<CustomerCreditLedgerListByExternalIdPageAsync.Response> = jsonHandler<CustomerCreditLedgerListByExternalIdPageAsync.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun listByExternalId(params: CustomerCreditLedgerListByExternalIdParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CustomerCreditLedgerListByExternalIdPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("customers", "external_customer_id", params.getPathParam(0), "credits", "ledger")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  listByExternalIdHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  CustomerCreditLedgerListByExternalIdPageAsync.of(LedgerServiceAsyncImpl(clientOptions), params, it)
              }
          } }
        }
    }
}
