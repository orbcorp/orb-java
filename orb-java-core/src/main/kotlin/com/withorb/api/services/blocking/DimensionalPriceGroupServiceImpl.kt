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
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import com.withorb.api.models.DimensionalPriceGroupListPage
import com.withorb.api.models.DimensionalPriceGroupListParams
import com.withorb.api.models.DimensionalPriceGroupRetrieveParams
import com.withorb.api.models.DimensionalPriceGroupUpdateParams
import com.withorb.api.models.DimensionalPriceGroups
import com.withorb.api.services.blocking.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdService
import com.withorb.api.services.blocking.dimensionalPriceGroups.ExternalDimensionalPriceGroupIdServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DimensionalPriceGroupServiceImpl
internal constructor(private val clientOptions: ClientOptions) : DimensionalPriceGroupService {

    private val withRawResponse: DimensionalPriceGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalDimensionalPriceGroupId: ExternalDimensionalPriceGroupIdService by lazy {
        ExternalDimensionalPriceGroupIdServiceImpl(clientOptions)
    }

    override fun withRawResponse(): DimensionalPriceGroupService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DimensionalPriceGroupService =
        DimensionalPriceGroupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun externalDimensionalPriceGroupId(): ExternalDimensionalPriceGroupIdService =
        externalDimensionalPriceGroupId

    override fun create(
        params: DimensionalPriceGroupCreateParams,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroup =
        // post /dimensional_price_groups
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DimensionalPriceGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroup =
        // get /dimensional_price_groups/{dimensional_price_group_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: DimensionalPriceGroupUpdateParams,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroup =
        // put /dimensional_price_groups/{dimensional_price_group_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: DimensionalPriceGroupListParams,
        requestOptions: RequestOptions,
    ): DimensionalPriceGroupListPage =
        // get /dimensional_price_groups
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DimensionalPriceGroupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val externalDimensionalPriceGroupId:
            ExternalDimensionalPriceGroupIdService.WithRawResponse by lazy {
            ExternalDimensionalPriceGroupIdServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DimensionalPriceGroupService.WithRawResponse =
            DimensionalPriceGroupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun externalDimensionalPriceGroupId():
            ExternalDimensionalPriceGroupIdService.WithRawResponse = externalDimensionalPriceGroupId

        private val createHandler: Handler<DimensionalPriceGroup> =
            jsonHandler<DimensionalPriceGroup>(clientOptions.jsonMapper)

        override fun create(
            params: DimensionalPriceGroupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroup> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dimensional_price_groups")
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

        private val retrieveHandler: Handler<DimensionalPriceGroup> =
            jsonHandler<DimensionalPriceGroup>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DimensionalPriceGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dimensionalPriceGroupId", params.dimensionalPriceGroupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dimensional_price_groups", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<DimensionalPriceGroup> =
            jsonHandler<DimensionalPriceGroup>(clientOptions.jsonMapper)

        override fun update(
            params: DimensionalPriceGroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dimensionalPriceGroupId", params.dimensionalPriceGroupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dimensional_price_groups", params._pathParam(0))
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

        private val listHandler: Handler<DimensionalPriceGroups> =
            jsonHandler<DimensionalPriceGroups>(clientOptions.jsonMapper)

        override fun list(
            params: DimensionalPriceGroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DimensionalPriceGroupListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dimensional_price_groups")
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
                        DimensionalPriceGroupListPage.builder()
                            .service(DimensionalPriceGroupServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
