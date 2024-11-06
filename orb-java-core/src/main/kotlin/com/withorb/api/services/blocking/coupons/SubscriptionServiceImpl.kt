// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.coupons

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CouponSubscriptionListPage
import com.withorb.api.models.CouponSubscriptionListParams

class SubscriptionServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : SubscriptionService {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CouponSubscriptionListPage.Response> =
        jsonHandler<CouponSubscriptionListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint returns a list of all subscriptions that have redeemed a given coupon as a
     * [paginated](../reference/pagination) list, ordered starting from the most recently created
     * subscription. For a full discussion of the subscription resource, see
     * [Subscription](../guides/concepts#subscription).
     */
    override fun list(
        params: CouponSubscriptionListParams,
        requestOptions: RequestOptions
    ): CouponSubscriptionListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("coupons", params.getPathParam(0), "subscriptions")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CouponSubscriptionListPage.of(this, params, it) }
        }
    }
}
