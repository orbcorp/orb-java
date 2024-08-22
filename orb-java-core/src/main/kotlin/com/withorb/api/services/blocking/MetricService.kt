// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking

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
import com.withorb.api.models.BillableMetric
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListPage
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUpdateParams
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

interface MetricService {

    /**
     * This endpoint is used to create a [metric](../guides/concepts##metric) using a
     * SQL string. See
     * [SQL support](../guides/extensibility/advanced-metrics#sql-support) for a
     * description of constructing SQL queries with examples.
     */
    @JvmOverloads
    fun create(params: MetricCreateParams, requestOptions: RequestOptions = RequestOptions.none()): BillableMetric

    /**
     * This endpoint allows you to update the `metadata` property on a metric. If you
     * pass `null` for the metadata value, it will clear any existing metadata for that
     * invoice.
     */
    @JvmOverloads
    fun update(params: MetricUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): BillableMetric

    /**
     * This endpoint is used to fetch [metric](../guides/concepts#metric) details given
     * a metric identifier. It returns information about the metrics including its
     * name, description, and item.
     */
    @JvmOverloads
    fun list(params: MetricListParams, requestOptions: RequestOptions = RequestOptions.none()): MetricListPage

    /**
     * This endpoint is used to list [metrics](../guides/concepts##metric). It returns
     * information about the metrics including its name, description, and item.
     */
    @JvmOverloads
    fun fetch(params: MetricFetchParams, requestOptions: RequestOptions = RequestOptions.none()): BillableMetric
}
