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
import com.withorb.api.core.json
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.Price
import com.withorb.api.models.PriceCreateParams
import com.withorb.api.models.PriceEvaluateParams
import com.withorb.api.models.PriceEvaluateResponse
import com.withorb.api.models.PriceFetchParams
import com.withorb.api.models.PriceListPageAsync
import com.withorb.api.models.PriceListParams
import com.withorb.api.models.PriceUpdateParams
import com.withorb.api.services.async.prices.ExternalPriceIdServiceAsync
import com.withorb.api.services.async.prices.ExternalPriceIdServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class PriceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PriceServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val externalPriceId: ExternalPriceIdServiceAsync by lazy {
        ExternalPriceIdServiceAsyncImpl(clientOptions)
    }

    override fun externalPriceId(): ExternalPriceIdServiceAsync = externalPriceId

    private val createHandler: Handler<Price> =
        jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to create a [price](/product-catalog/price-configuration). A price
     * created using this endpoint is always an add-on, meaning that it’s not associated with a
     * specific plan and can instead be individually added to subscriptions, including subscriptions
     * on different plans.
     *
     * An `external_price_id` can be optionally specified as an alias to allow ergonomic interaction
     * with prices in the Orb API.
     *
     * See the [Price resource](/product-catalog/price-configuration) for the specification of
     * different price model configurations possible in this endpoint.
     */
    override fun create(
        params: PriceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Price> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("prices")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<Price> =
        jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint allows you to update the `metadata` property on a price. If you pass null for
     * the metadata value, it will clear any existing metadata for that price.
     */
    override fun update(
        params: PriceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Price> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("prices", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<PriceListPageAsync.Response> =
        jsonHandler<PriceListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to list all add-on prices created using the
     * [price creation endpoint](/api-reference/price/create-price).
     */
    override fun list(
        params: PriceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PriceListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("prices")
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
                    .let { PriceListPageAsync.of(this, params, it) }
            }
    }

    private val evaluateHandler: Handler<PriceEvaluateResponse> =
        jsonHandler<PriceEvaluateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to evaluate the output of a price for a given customer and time range.
     * It enables filtering and grouping the output using
     * [computed properties](/extensibility/advanced-metrics#computed-properties), supporting the
     * following workflows:
     * 1. Showing detailed usage and costs to the end customer.
     * 2. Auditing subtotals on invoice line items.
     *
     * For these workflows, the expressiveness of computed properties in both the filters and
     * grouping is critical. For example, if you'd like to show your customer their usage grouped by
     * hour and another property, you can do so with the following `grouping_keys`:
     * `["hour_floor_timestamp_millis(timestamp_millis)", "my_property"]`. If you'd like to examine
     * a customer's usage for a specific property value, you can do so with the following `filter`:
     * `my_property = 'foo' AND my_other_property = 'bar'`.
     *
     * By default, the start of the time range must be no more than 100 days ago and the length of
     * the results must be no greater than 1000. Note that this is a POST endpoint rather than a GET
     * endpoint because it employs a JSON body rather than query parameters.
     */
    override fun evaluate(
        params: PriceEvaluateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PriceEvaluateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("prices", params.getPathParam(0), "evaluate")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { evaluateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val fetchHandler: Handler<Price> =
        jsonHandler<Price>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** This endpoint returns a price given an identifier. */
    override fun fetch(
        params: PriceFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Price> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("prices", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { fetchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
