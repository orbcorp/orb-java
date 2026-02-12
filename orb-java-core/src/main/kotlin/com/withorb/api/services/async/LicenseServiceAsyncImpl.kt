// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

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
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.LicenseCreateParams
import com.withorb.api.models.LicenseCreateResponse
import com.withorb.api.models.LicenseDeactivateParams
import com.withorb.api.models.LicenseDeactivateResponse
import com.withorb.api.models.LicenseListPageAsync
import com.withorb.api.models.LicenseListPageResponse
import com.withorb.api.models.LicenseListParams
import com.withorb.api.models.LicenseRetrieveByExternalIdParams
import com.withorb.api.models.LicenseRetrieveByExternalIdResponse
import com.withorb.api.models.LicenseRetrieveParams
import com.withorb.api.models.LicenseRetrieveResponse
import com.withorb.api.services.async.licenses.ExternalLicenseServiceAsync
import com.withorb.api.services.async.licenses.ExternalLicenseServiceAsyncImpl
import com.withorb.api.services.async.licenses.UsageServiceAsync
import com.withorb.api.services.async.licenses.UsageServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LicenseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LicenseServiceAsync {

    private val withRawResponse: LicenseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalLicenses: ExternalLicenseServiceAsync by lazy {
        ExternalLicenseServiceAsyncImpl(clientOptions)
    }

    private val usage: UsageServiceAsync by lazy { UsageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LicenseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LicenseServiceAsync =
        LicenseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun externalLicenses(): ExternalLicenseServiceAsync = externalLicenses

    override fun usage(): UsageServiceAsync = usage

    override fun create(
        params: LicenseCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LicenseCreateResponse> =
        // post /licenses
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: LicenseRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LicenseRetrieveResponse> =
        // get /licenses/{license_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LicenseListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LicenseListPageAsync> =
        // get /licenses
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun deactivate(
        params: LicenseDeactivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LicenseDeactivateResponse> =
        // post /licenses/{license_id}/deactivate
        withRawResponse().deactivate(params, requestOptions).thenApply { it.parse() }

    override fun retrieveByExternalId(
        params: LicenseRetrieveByExternalIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LicenseRetrieveByExternalIdResponse> =
        // get /licenses/external_license_id/{external_license_id}
        withRawResponse().retrieveByExternalId(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LicenseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val externalLicenses: ExternalLicenseServiceAsync.WithRawResponse by lazy {
            ExternalLicenseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LicenseServiceAsync.WithRawResponse =
            LicenseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun externalLicenses(): ExternalLicenseServiceAsync.WithRawResponse =
            externalLicenses

        override fun usage(): UsageServiceAsync.WithRawResponse = usage

        private val createHandler: Handler<LicenseCreateResponse> =
            jsonHandler<LicenseCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: LicenseCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses")
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

        private val retrieveHandler: Handler<LicenseRetrieveResponse> =
            jsonHandler<LicenseRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LicenseRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("licenseId", params.licenseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses", params._pathParam(0))
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

        private val listHandler: Handler<LicenseListPageResponse> =
            jsonHandler<LicenseListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LicenseListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses")
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
                                LicenseListPageAsync.builder()
                                    .service(LicenseServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deactivateHandler: Handler<LicenseDeactivateResponse> =
            jsonHandler<LicenseDeactivateResponse>(clientOptions.jsonMapper)

        override fun deactivate(
            params: LicenseDeactivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseDeactivateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("licenseId", params.licenseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses", params._pathParam(0), "deactivate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deactivateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveByExternalIdHandler: Handler<LicenseRetrieveByExternalIdResponse> =
            jsonHandler<LicenseRetrieveByExternalIdResponse>(clientOptions.jsonMapper)

        override fun retrieveByExternalId(
            params: LicenseRetrieveByExternalIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseRetrieveByExternalIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalLicenseId", params.externalLicenseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses", "external_license_id", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveByExternalIdHandler.handle(it) }
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
