// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

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
import com.withorb.api.models.MutatedSubscriptionModel
import com.withorb.api.models.SubscriptionCancelParams
import com.withorb.api.models.SubscriptionCreateParams
import com.withorb.api.models.SubscriptionFetchCostsParams
import com.withorb.api.models.SubscriptionFetchCostsResponse
import com.withorb.api.models.SubscriptionFetchParams
import com.withorb.api.models.SubscriptionFetchSchedulePageAsync
import com.withorb.api.models.SubscriptionFetchScheduleParams
import com.withorb.api.models.SubscriptionFetchUsageParams
import com.withorb.api.models.SubscriptionListPageAsync
import com.withorb.api.models.SubscriptionListParams
import com.withorb.api.models.SubscriptionModel
import com.withorb.api.models.SubscriptionPriceIntervalsParams
import com.withorb.api.models.SubscriptionSchedulePlanChangeParams
import com.withorb.api.models.SubscriptionTriggerPhaseParams
import com.withorb.api.models.SubscriptionUnscheduleCancellationParams
import com.withorb.api.models.SubscriptionUnscheduleFixedFeeQuantityUpdatesParams
import com.withorb.api.models.SubscriptionUnschedulePendingPlanChangesParams
import com.withorb.api.models.SubscriptionUpdateFixedFeeQuantityParams
import com.withorb.api.models.SubscriptionUpdateParams
import com.withorb.api.models.SubscriptionUpdateTrialParams
import com.withorb.api.models.SubscriptionUsage
import java.util.concurrent.CompletableFuture

class SubscriptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionServiceAsync {

    private val withRawResponse: SubscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscriptionServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MutatedSubscriptionModel> =
        // post /subscriptions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionModel> =
        // put /subscriptions/{subscription_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListPageAsync> =
        // get /subscriptions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: SubscriptionCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MutatedSubscriptionModel> =
        // post /subscriptions/{subscription_id}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun fetch(
        params: SubscriptionFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionModel> =
        // get /subscriptions/{subscription_id}
        withRawResponse().fetch(params, requestOptions).thenApply { it.parse() }

    override fun fetchCosts(
        params: SubscriptionFetchCostsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionFetchCostsResponse> =
        // get /subscriptions/{subscription_id}/costs
        withRawResponse().fetchCosts(params, requestOptions).thenApply { it.parse() }

    override fun fetchSchedule(
        params: SubscriptionFetchScheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionFetchSchedulePageAsync> =
        // get /subscriptions/{subscription_id}/schedule
        withRawResponse().fetchSchedule(params, requestOptions).thenApply { it.parse() }

    override fun fetchUsage(
        params: SubscriptionFetchUsageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionUsage> =
        // get /subscriptions/{subscription_id}/usage
        withRawResponse().fetchUsage(params, requestOptions).thenApply { it.parse() }

    override fun priceIntervals(
        params: SubscriptionPriceIntervalsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MutatedSubscriptionModel> =
        // post /subscriptions/{subscription_id}/price_intervals
        withRawResponse().priceIntervals(params, requestOptions).thenApply { it.parse() }

    override fun schedulePlanChange(
        params: SubscriptionSchedulePlanChangeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MutatedSubscriptionModel> =
        // post /subscriptions/{subscription_id}/schedule_plan_change
        withRawResponse().schedulePlanChange(params, requestOptions).thenApply { it.parse() }

    override fun triggerPhase(
        params: SubscriptionTriggerPhaseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MutatedSubscriptionModel> =
        // post /subscriptions/{subscription_id}/trigger_phase
        withRawResponse().triggerPhase(params, requestOptions).thenApply { it.parse() }

    override fun unscheduleCancellation(
        params: SubscriptionUnscheduleCancellationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MutatedSubscriptionModel> =
        // post /subscriptions/{subscription_id}/unschedule_cancellation
        withRawResponse().unscheduleCancellation(params, requestOptions).thenApply { it.parse() }

    override fun unscheduleFixedFeeQuantityUpdates(
        params: SubscriptionUnscheduleFixedFeeQuantityUpdatesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MutatedSubscriptionModel> =
        // post /subscriptions/{subscription_id}/unschedule_fixed_fee_quantity_updates
        withRawResponse().unscheduleFixedFeeQuantityUpdates(params, requestOptions).thenApply {
            it.parse()
        }

    override fun unschedulePendingPlanChanges(
        params: SubscriptionUnschedulePendingPlanChangesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MutatedSubscriptionModel> =
        // post /subscriptions/{subscription_id}/unschedule_pending_plan_changes
        withRawResponse().unschedulePendingPlanChanges(params, requestOptions).thenApply {
            it.parse()
        }

    override fun updateFixedFeeQuantity(
        params: SubscriptionUpdateFixedFeeQuantityParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MutatedSubscriptionModel> =
        // post /subscriptions/{subscription_id}/update_fixed_fee_quantity
        withRawResponse().updateFixedFeeQuantity(params, requestOptions).thenApply { it.parse() }

    override fun updateTrial(
        params: SubscriptionUpdateTrialParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MutatedSubscriptionModel> =
        // post /subscriptions/{subscription_id}/update_trial
        withRawResponse().updateTrial(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscriptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<MutatedSubscriptionModel> =
            jsonHandler<MutatedSubscriptionModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MutatedSubscriptionModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscriptions")
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

        private val updateHandler: Handler<SubscriptionModel> =
            jsonHandler<SubscriptionModel>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("subscriptions", params.getPathParam(0))
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

        private val listHandler: Handler<SubscriptionListPageAsync.Response> =
            jsonHandler<SubscriptionListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("subscriptions")
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
                                SubscriptionListPageAsync.of(
                                    SubscriptionServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val cancelHandler: Handler<MutatedSubscriptionModel> =
            jsonHandler<MutatedSubscriptionModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun cancel(
            params: SubscriptionCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MutatedSubscriptionModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscriptions", params.getPathParam(0), "cancel")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val fetchHandler: Handler<SubscriptionModel> =
            jsonHandler<SubscriptionModel>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: SubscriptionFetchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("subscriptions", params.getPathParam(0))
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

        private val fetchCostsHandler: Handler<SubscriptionFetchCostsResponse> =
            jsonHandler<SubscriptionFetchCostsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetchCosts(
            params: SubscriptionFetchCostsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionFetchCostsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("subscriptions", params.getPathParam(0), "costs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { fetchCostsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val fetchScheduleHandler: Handler<SubscriptionFetchSchedulePageAsync.Response> =
            jsonHandler<SubscriptionFetchSchedulePageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetchSchedule(
            params: SubscriptionFetchScheduleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionFetchSchedulePageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("subscriptions", params.getPathParam(0), "schedule")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { fetchScheduleHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                SubscriptionFetchSchedulePageAsync.of(
                                    SubscriptionServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val fetchUsageHandler: Handler<SubscriptionUsage> =
            jsonHandler<SubscriptionUsage>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetchUsage(
            params: SubscriptionFetchUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionUsage>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("subscriptions", params.getPathParam(0), "usage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { fetchUsageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val priceIntervalsHandler: Handler<MutatedSubscriptionModel> =
            jsonHandler<MutatedSubscriptionModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun priceIntervals(
            params: SubscriptionPriceIntervalsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MutatedSubscriptionModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscriptions", params.getPathParam(0), "price_intervals")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { priceIntervalsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val schedulePlanChangeHandler: Handler<MutatedSubscriptionModel> =
            jsonHandler<MutatedSubscriptionModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun schedulePlanChange(
            params: SubscriptionSchedulePlanChangeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MutatedSubscriptionModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "subscriptions",
                        params.getPathParam(0),
                        "schedule_plan_change",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { schedulePlanChangeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val triggerPhaseHandler: Handler<MutatedSubscriptionModel> =
            jsonHandler<MutatedSubscriptionModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun triggerPhase(
            params: SubscriptionTriggerPhaseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MutatedSubscriptionModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscriptions", params.getPathParam(0), "trigger_phase")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { triggerPhaseHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unscheduleCancellationHandler: Handler<MutatedSubscriptionModel> =
            jsonHandler<MutatedSubscriptionModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun unscheduleCancellation(
            params: SubscriptionUnscheduleCancellationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MutatedSubscriptionModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "subscriptions",
                        params.getPathParam(0),
                        "unschedule_cancellation",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { unscheduleCancellationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unscheduleFixedFeeQuantityUpdatesHandler: Handler<MutatedSubscriptionModel> =
            jsonHandler<MutatedSubscriptionModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun unscheduleFixedFeeQuantityUpdates(
            params: SubscriptionUnscheduleFixedFeeQuantityUpdatesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MutatedSubscriptionModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "subscriptions",
                        params.getPathParam(0),
                        "unschedule_fixed_fee_quantity_updates",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { unscheduleFixedFeeQuantityUpdatesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unschedulePendingPlanChangesHandler: Handler<MutatedSubscriptionModel> =
            jsonHandler<MutatedSubscriptionModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun unschedulePendingPlanChanges(
            params: SubscriptionUnschedulePendingPlanChangesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MutatedSubscriptionModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "subscriptions",
                        params.getPathParam(0),
                        "unschedule_pending_plan_changes",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { unschedulePendingPlanChangesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateFixedFeeQuantityHandler: Handler<MutatedSubscriptionModel> =
            jsonHandler<MutatedSubscriptionModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun updateFixedFeeQuantity(
            params: SubscriptionUpdateFixedFeeQuantityParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MutatedSubscriptionModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "subscriptions",
                        params.getPathParam(0),
                        "update_fixed_fee_quantity",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateFixedFeeQuantityHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateTrialHandler: Handler<MutatedSubscriptionModel> =
            jsonHandler<MutatedSubscriptionModel>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun updateTrial(
            params: SubscriptionUpdateTrialParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MutatedSubscriptionModel>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("subscriptions", params.getPathParam(0), "update_trial")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateTrialHandler.handle(it) }
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
