// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

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
import com.withorb.api.core.prepare
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanFetchParams
import com.withorb.api.models.PlanListPage
import com.withorb.api.models.PlanListPageResponse
import com.withorb.api.models.PlanListParams
import com.withorb.api.models.PlanUpdateParams
import com.withorb.api.services.blocking.plans.ExternalPlanIdService
import com.withorb.api.services.blocking.plans.ExternalPlanIdServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PlanServiceImpl internal constructor(private val clientOptions: ClientOptions) : PlanService {

    private val withRawResponse: PlanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalPlanId: ExternalPlanIdService by lazy {
        ExternalPlanIdServiceImpl(clientOptions)
    }

    override fun withRawResponse(): PlanService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService =
        PlanServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun externalPlanId(): ExternalPlanIdService = externalPlanId

    override fun create(params: PlanCreateParams, requestOptions: RequestOptions): Plan =
        // post /plans
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: PlanUpdateParams, requestOptions: RequestOptions): Plan =
        // put /plans/{plan_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: PlanListParams, requestOptions: RequestOptions): PlanListPage =
        // get /plans
        withRawResponse().list(params, requestOptions).parse()

    override fun fetch(params: PlanFetchParams, requestOptions: RequestOptions): Plan =
        // get /plans/{plan_id}
        withRawResponse().fetch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val externalPlanId: ExternalPlanIdService.WithRawResponse by lazy {
            ExternalPlanIdServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlanService.WithRawResponse =
            PlanServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun externalPlanId(): ExternalPlanIdService.WithRawResponse = externalPlanId

        private val createHandler: Handler<Plan> = jsonHandler<Plan>(clientOptions.jsonMapper)

        override fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Plan> = jsonHandler<Plan>(clientOptions.jsonMapper)

        override fun update(
            params: PlanUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("planId", params.planId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PlanListPageResponse> =
            jsonHandler<PlanListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PlanListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PlanListPage.builder()
                            .service(PlanServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val fetchHandler: Handler<Plan> = jsonHandler<Plan>(clientOptions.jsonMapper)

        override fun fetch(
            params: PlanFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Plan> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("planId", params.planId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
