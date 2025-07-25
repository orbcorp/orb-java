// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.beta

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
import com.withorb.api.models.BetaExternalPlanIdCreatePlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdFetchPlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdSetDefaultPlanVersionParams
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanVersion
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExternalPlanIdServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalPlanIdServiceAsync {

    private val withRawResponse: ExternalPlanIdServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalPlanIdServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExternalPlanIdServiceAsync =
        ExternalPlanIdServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createPlanVersion(
        params: BetaExternalPlanIdCreatePlanVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanVersion> =
        // post /plans/external_plan_id/{external_plan_id}/versions
        withRawResponse().createPlanVersion(params, requestOptions).thenApply { it.parse() }

    override fun fetchPlanVersion(
        params: BetaExternalPlanIdFetchPlanVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanVersion> =
        // get /plans/external_plan_id/{external_plan_id}/versions/{version}
        withRawResponse().fetchPlanVersion(params, requestOptions).thenApply { it.parse() }

    override fun setDefaultPlanVersion(
        params: BetaExternalPlanIdSetDefaultPlanVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Plan> =
        // post /plans/external_plan_id/{external_plan_id}/set_default_version
        withRawResponse().setDefaultPlanVersion(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalPlanIdServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalPlanIdServiceAsync.WithRawResponse =
            ExternalPlanIdServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createPlanVersionHandler: Handler<PlanVersion> =
            jsonHandler<PlanVersion>(clientOptions.jsonMapper)

        override fun createPlanVersion(
            params: BetaExternalPlanIdCreatePlanVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanVersion>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPlanId", params.externalPlanId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", "external_plan_id", params._pathParam(0), "versions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createPlanVersionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val fetchPlanVersionHandler: Handler<PlanVersion> =
            jsonHandler<PlanVersion>(clientOptions.jsonMapper)

        override fun fetchPlanVersion(
            params: BetaExternalPlanIdFetchPlanVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanVersion>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("version", params.version().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "plans",
                        "external_plan_id",
                        params._pathParam(0),
                        "versions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { fetchPlanVersionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val setDefaultPlanVersionHandler: Handler<Plan> =
            jsonHandler<Plan>(clientOptions.jsonMapper)

        override fun setDefaultPlanVersion(
            params: BetaExternalPlanIdSetDefaultPlanVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Plan>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPlanId", params.externalPlanId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "plans",
                        "external_plan_id",
                        params._pathParam(0),
                        "set_default_version",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { setDefaultPlanVersionHandler.handle(it) }
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
