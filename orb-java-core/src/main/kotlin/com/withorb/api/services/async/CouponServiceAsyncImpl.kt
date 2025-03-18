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
import com.withorb.api.models.Coupon
import com.withorb.api.models.CouponArchiveParams
import com.withorb.api.models.CouponCreateParams
import com.withorb.api.models.CouponFetchParams
import com.withorb.api.models.CouponListPageAsync
import com.withorb.api.models.CouponListParams
import com.withorb.api.services.async.coupons.SubscriptionServiceAsync
import com.withorb.api.services.async.coupons.SubscriptionServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class CouponServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CouponServiceAsync {

    private val withRawResponse: CouponServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CouponServiceAsync.WithRawResponse = withRawResponse

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    override fun create(
        params: CouponCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Coupon> =
        // post /coupons
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CouponListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CouponListPageAsync> =
        // get /coupons
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: CouponArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Coupon> =
        // post /coupons/{coupon_id}/archive
        withRawResponse().archive(params, requestOptions).thenApply { it.parse() }

    override fun fetch(
        params: CouponFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Coupon> =
        // get /coupons/{coupon_id}
        withRawResponse().fetch(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CouponServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions

        private val createHandler: Handler<Coupon> =
            jsonHandler<Coupon>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CouponCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Coupon>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("coupons")
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

        private val listHandler: Handler<CouponListPageAsync.Response> =
            jsonHandler<CouponListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CouponListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CouponListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("coupons")
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
                                CouponListPageAsync.of(
                                    CouponServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val archiveHandler: Handler<Coupon> =
            jsonHandler<Coupon>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun archive(
            params: CouponArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Coupon>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("coupons", params._pathParam(0), "archive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { archiveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val fetchHandler: Handler<Coupon> =
            jsonHandler<Coupon>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun fetch(
            params: CouponFetchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Coupon>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("coupons", params._pathParam(0))
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
