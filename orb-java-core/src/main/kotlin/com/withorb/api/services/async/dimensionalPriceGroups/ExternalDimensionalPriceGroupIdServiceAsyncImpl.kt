// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.dimensionalPriceGroups

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.errors.OrbError
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
import java.util.concurrent.CompletableFuture

class ExternalDimensionalPriceGroupIdServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ExternalDimensionalPriceGroupIdServiceAsync {

    private val withRawResponse: ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams, requestOptions: RequestOptions): CompletableFuture<DimensionalPriceGroup> =
        // get /dimensional_price_groups/external_dimensional_price_group_id/{external_dimensional_price_group_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ExternalDimensionalPriceGroupIdServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<DimensionalPriceGroup> = jsonHandler<DimensionalPriceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DimensionalPriceGroup>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("dimensional_price_groups", "external_dimensional_price_group_id", params.getPathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }
    }
}
