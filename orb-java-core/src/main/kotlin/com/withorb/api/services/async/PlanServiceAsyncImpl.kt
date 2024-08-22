// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.withorb.api.core.Enum
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanFetchParams
import com.withorb.api.models.PlanListPageAsync
import com.withorb.api.models.PlanListParams
import com.withorb.api.models.PlanUpdateParams
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.RequestOptions
import com.withorb.api.errors.OrbError
import com.withorb.api.services.emptyHandler
import com.withorb.api.services.errorHandler
import com.withorb.api.services.json
import com.withorb.api.services.jsonHandler
import com.withorb.api.services.multipartFormData
import com.withorb.api.services.stringHandler
import com.withorb.api.services.binaryHandler
import com.withorb.api.services.withErrorHandler
import com.withorb.api.services.async.plans.ExternalPlanIdServiceAsync
import com.withorb.api.services.async.plans.ExternalPlanIdServiceAsyncImpl

class PlanServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : PlanServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val externalPlanId: ExternalPlanIdServiceAsync by lazy { ExternalPlanIdServiceAsyncImpl(clientOptions) }

    override fun externalPlanId(): ExternalPlanIdServiceAsync = externalPlanId

    private val createHandler: Handler<Plan> =
    jsonHandler<Plan>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** This endpoint allows creation of plans including their prices. */
    override fun create(params: PlanCreateParams, requestOptions: RequestOptions): CompletableFuture<Plan> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("plans")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              createHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val updateHandler: Handler<Plan> =
    jsonHandler<Plan>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint can be used to update the `external_plan_id`, and `metadata` of an
     * existing plan.
     *
     * Other fields on a customer are currently immutable.
     */
    override fun update(params: PlanUpdateParams, requestOptions: RequestOptions): CompletableFuture<Plan> {
      val request = HttpRequest.builder()
        .method(HttpMethod.PUT)
        .addPathSegments("plans", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              updateHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val listHandler: Handler<PlanListPageAsync.Response> =
    jsonHandler<PlanListPageAsync.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint returns a list of all [plans](../guides/concepts##plan-and-price)
     * for an account in a list format. The list of plans is ordered starting from the
     * most recently created plan. The response also includes
     * [`pagination_metadata`](../reference/pagination), which lets the caller retrieve
     * the next page of results if they exist.
     */
    override fun list(params: PlanListParams, requestOptions: RequestOptions): CompletableFuture<PlanListPageAsync> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("plans")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              listHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
          .let {
              PlanListPageAsync.of(this, params, it)
          }
      }
    }

    private val fetchHandler: Handler<Plan> =
    jsonHandler<Plan>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch [plan](../guides/concepts##plan-and-price)
     * details given a plan identifier. It returns information about the prices
     * included in the plan and their configuration, as well as the product that the
     * plan is attached to.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models
     * is serialized differently in a given [Price](../guides/concepts#plan-and-price)
     * object. The `model_type` field determines the key for the configuration object
     * that is present. A detailed explanation of price types can be found in the
     * [Price schema](../guides/concepts#plan-and-price).
     *
     * ## Phases
     *
     * Orb supports plan phases, also known as contract ramps. For plans with phases,
     * the serialized prices refer to all prices across all phases.
     */
    override fun fetch(params: PlanFetchParams, requestOptions: RequestOptions): CompletableFuture<Plan> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("plans", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              fetchHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
