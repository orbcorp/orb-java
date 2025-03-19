// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans

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
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanExternalPlanIdFetchParams
import com.withorb.api.models.PlanExternalPlanIdUpdateParams
import java.util.concurrent.CompletableFuture

class ExternalPlanIdServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalPlanIdServiceAsync {

    private val withRawResponse: ExternalPlanIdServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalPlanIdServiceAsync.WithRawResponse = withRawResponse

    override fun update(
        params: PlanExternalPlanIdUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Plan> =
        // put /plans/external_plan_id/{external_plan_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun fetch(
        params: PlanExternalPlanIdFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Plan> =
        // get /plans/external_plan_id/{external_plan_id}
        withRawResponse().fetch(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalPlanIdServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val updateHandler: Handler<Plan> =
            jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PlanExternalPlanIdUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Plan>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("plans", "external_plan_id", params._pathParam(0))
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

        private val fetchHandler: Handler<Plan> =
            jsonHandler<Plan>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: PlanExternalPlanIdFetchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Plan>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("plans", "external_plan_id", params._pathParam(0))
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
    }
}
