// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.coupons

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CouponSubscriptionListPageAsync
import com.withorb.api.models.CouponSubscriptionListParams
import java.util.concurrent.CompletableFuture

class SubscriptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscriptionServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CouponSubscriptionListPageAsync.Response> =
        jsonHandler<CouponSubscriptionListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint returns a list of all subscriptions that have redeemed a given coupon as a
     * [paginated](/api-reference/pagination) list, ordered starting from the most recently created
     * subscription. For a full discussion of the subscription resource, see
     * [Subscription](/core-concepts#subscription).
     */
    override fun list(
        params: CouponSubscriptionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CouponSubscriptionListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("coupons", params.getPathParam(0), "subscriptions")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { CouponSubscriptionListPageAsync.of(this, params, it) }
            }
    }
}
