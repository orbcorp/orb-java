// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans.externalPlanId

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.emptyHandler
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
import com.withorb.api.models.PlanExternalPlanIdDraftDiscardParams
import com.withorb.api.models.PlanExternalPlanIdDraftFetchParams
import com.withorb.api.models.PlanExternalPlanIdDraftPublishParams
import com.withorb.api.models.PlanExternalPlanIdDraftSaveParams
import com.withorb.api.models.PlanVersion
import com.withorb.api.models.PlanVersionDraft
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
class DraftServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DraftServiceAsync {

    private val withRawResponse: DraftServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DraftServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftServiceAsync =
        DraftServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun discard(
        params: PlanExternalPlanIdDraftDiscardParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /plans/external_plan_id/{external_plan_id}/draft
        withRawResponse().discard(params, requestOptions).thenAccept {}

    override fun fetch(
        params: PlanExternalPlanIdDraftFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanVersionDraft> =
        // get /plans/external_plan_id/{external_plan_id}/draft
        withRawResponse().fetch(params, requestOptions).thenApply { it.parse() }

    override fun publish(
        params: PlanExternalPlanIdDraftPublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanVersion> =
        // post /plans/external_plan_id/{external_plan_id}/draft/publish
        withRawResponse().publish(params, requestOptions).thenApply { it.parse() }

    override fun save(
        params: PlanExternalPlanIdDraftSaveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanVersionDraft> =
        // put /plans/external_plan_id/{external_plan_id}/draft
        withRawResponse().save(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DraftServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DraftServiceAsync.WithRawResponse =
            DraftServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val discardHandler: Handler<Void?> = emptyHandler()

        override fun discard(
            params: PlanExternalPlanIdDraftDiscardParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPlanId", params.externalPlanId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", "external_plan_id", params._pathParam(0), "draft")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { discardHandler.handle(it) }
                    }
                }
        }

        private val fetchHandler: Handler<PlanVersionDraft> =
            jsonHandler<PlanVersionDraft>(clientOptions.jsonMapper)

        override fun fetch(
            params: PlanExternalPlanIdDraftFetchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPlanId", params.externalPlanId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", "external_plan_id", params._pathParam(0), "draft")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val publishHandler: Handler<PlanVersion> =
            jsonHandler<PlanVersion>(clientOptions.jsonMapper)

        override fun publish(
            params: PlanExternalPlanIdDraftPublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanVersion>> {
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
                        "draft",
                        "publish",
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
                            .use { publishHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val saveHandler: Handler<PlanVersionDraft> =
            jsonHandler<PlanVersionDraft>(clientOptions.jsonMapper)

        override fun save(
            params: PlanExternalPlanIdDraftSaveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalPlanId", params.externalPlanId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("plans", "external_plan_id", params._pathParam(0), "draft")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { saveHandler.handle(it) }
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
