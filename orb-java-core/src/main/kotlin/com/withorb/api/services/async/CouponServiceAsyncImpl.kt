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
import com.withorb.api.models.Coupon
import com.withorb.api.models.CouponArchiveParams
import com.withorb.api.models.CouponCreateParams
import com.withorb.api.models.CouponFetchParams
import com.withorb.api.models.CouponListPageAsync
import com.withorb.api.models.CouponListParams
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
import com.withorb.api.services.async.coupons.SubscriptionServiceAsync
import com.withorb.api.services.async.coupons.SubscriptionServiceAsyncImpl

class CouponServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : CouponServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val subscriptions: SubscriptionServiceAsync by lazy { SubscriptionServiceAsyncImpl(clientOptions) }

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    private val createHandler: Handler<Coupon> =
    jsonHandler<Coupon>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint allows the creation of coupons, which can then be redeemed at
     * subscription creation or plan change.
     */
    override fun create(params: CouponCreateParams, requestOptions: RequestOptions): CompletableFuture<Coupon> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("coupons")
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

    private val listHandler: Handler<CouponListPageAsync.Response> =
    jsonHandler<CouponListPageAsync.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint returns a list of all coupons for an account in a list format.
     *
     * The list of coupons is ordered starting from the most recently created coupon.
     * The response also includes `pagination_metadata`, which lets the caller retrieve
     * the next page of results if they exist. More information about pagination can be
     * found in the Pagination-metadata schema.
     */
    override fun list(params: CouponListParams, requestOptions: RequestOptions): CompletableFuture<CouponListPageAsync> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("coupons")
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
              CouponListPageAsync.of(this, params, it)
          }
      }
    }

    private val archiveHandler: Handler<Coupon> =
    jsonHandler<Coupon>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint allows a coupon to be archived. Archived coupons can no longer be
     * redeemed, and will be hidden from lists of active coupons. Additionally, once a
     * coupon is archived, its redemption code can be reused for a different coupon.
     */
    override fun archive(params: CouponArchiveParams, requestOptions: RequestOptions): CompletableFuture<Coupon> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("coupons", params.getPathParam(0), "archive")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .apply {
            params.getBody().ifPresent {
                body(json(clientOptions.jsonMapper, it))
            }
        }
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              archiveHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val fetchHandler: Handler<Coupon> =
    jsonHandler<Coupon>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint retrieves a coupon by its ID. To fetch coupons by their redemption
     * code, use the [List coupons](list-coupons) endpoint with the redemption_code
     * parameter.
     */
    override fun fetch(params: CouponFetchParams, requestOptions: RequestOptions): CompletableFuture<Coupon> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("coupons", params.getPathParam(0))
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
