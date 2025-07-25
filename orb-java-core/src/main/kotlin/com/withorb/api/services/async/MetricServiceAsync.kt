// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.BillableMetric
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListPageAsync
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MetricServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetricServiceAsync

    /**
     * This endpoint is used to create a [metric](/core-concepts###metric) using a SQL string. See
     * [SQL support](/extensibility/advanced-metrics#sql-support) for a description of constructing
     * SQL queries with examples.
     */
    fun create(params: MetricCreateParams): CompletableFuture<BillableMetric> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MetricCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetric>

    /**
     * This endpoint allows you to update the `metadata` property on a metric. If you pass `null`
     * for the metadata value, it will clear any existing metadata for that invoice.
     */
    fun update(metricId: String): CompletableFuture<BillableMetric> =
        update(metricId, MetricUpdateParams.none())

    /** @see update */
    fun update(
        metricId: String,
        params: MetricUpdateParams = MetricUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetric> =
        update(params.toBuilder().metricId(metricId).build(), requestOptions)

    /** @see update */
    fun update(
        metricId: String,
        params: MetricUpdateParams = MetricUpdateParams.none(),
    ): CompletableFuture<BillableMetric> = update(metricId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MetricUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetric>

    /** @see update */
    fun update(params: MetricUpdateParams): CompletableFuture<BillableMetric> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        metricId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillableMetric> =
        update(metricId, MetricUpdateParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch [metric](/core-concepts##metric) details given a metric
     * identifier. It returns information about the metrics including its name, description, and
     * item.
     */
    fun list(): CompletableFuture<MetricListPageAsync> = list(MetricListParams.none())

    /** @see list */
    fun list(
        params: MetricListParams = MetricListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetricListPageAsync>

    /** @see list */
    fun list(
        params: MetricListParams = MetricListParams.none()
    ): CompletableFuture<MetricListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MetricListPageAsync> =
        list(MetricListParams.none(), requestOptions)

    /**
     * This endpoint is used to list [metrics](/core-concepts#metric). It returns information about
     * the metrics including its name, description, and item.
     */
    fun fetch(metricId: String): CompletableFuture<BillableMetric> =
        fetch(metricId, MetricFetchParams.none())

    /** @see fetch */
    fun fetch(
        metricId: String,
        params: MetricFetchParams = MetricFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetric> =
        fetch(params.toBuilder().metricId(metricId).build(), requestOptions)

    /** @see fetch */
    fun fetch(
        metricId: String,
        params: MetricFetchParams = MetricFetchParams.none(),
    ): CompletableFuture<BillableMetric> = fetch(metricId, params, RequestOptions.none())

    /** @see fetch */
    fun fetch(
        params: MetricFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetric>

    /** @see fetch */
    fun fetch(params: MetricFetchParams): CompletableFuture<BillableMetric> =
        fetch(params, RequestOptions.none())

    /** @see fetch */
    fun fetch(metricId: String, requestOptions: RequestOptions): CompletableFuture<BillableMetric> =
        fetch(metricId, MetricFetchParams.none(), requestOptions)

    /**
     * A view of [MetricServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MetricServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /metrics`, but is otherwise the same as
         * [MetricServiceAsync.create].
         */
        fun create(params: MetricCreateParams): CompletableFuture<HttpResponseFor<BillableMetric>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MetricCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>>

        /**
         * Returns a raw HTTP response for `put /metrics/{metric_id}`, but is otherwise the same as
         * [MetricServiceAsync.update].
         */
        fun update(metricId: String): CompletableFuture<HttpResponseFor<BillableMetric>> =
            update(metricId, MetricUpdateParams.none())

        /** @see update */
        fun update(
            metricId: String,
            params: MetricUpdateParams = MetricUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            update(params.toBuilder().metricId(metricId).build(), requestOptions)

        /** @see update */
        fun update(
            metricId: String,
            params: MetricUpdateParams = MetricUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            update(metricId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MetricUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>>

        /** @see update */
        fun update(params: MetricUpdateParams): CompletableFuture<HttpResponseFor<BillableMetric>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            metricId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            update(metricId, MetricUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /metrics`, but is otherwise the same as
         * [MetricServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MetricListPageAsync>> =
            list(MetricListParams.none())

        /** @see list */
        fun list(
            params: MetricListParams = MetricListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetricListPageAsync>>

        /** @see list */
        fun list(
            params: MetricListParams = MetricListParams.none()
        ): CompletableFuture<HttpResponseFor<MetricListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MetricListPageAsync>> =
            list(MetricListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /metrics/{metric_id}`, but is otherwise the same as
         * [MetricServiceAsync.fetch].
         */
        fun fetch(metricId: String): CompletableFuture<HttpResponseFor<BillableMetric>> =
            fetch(metricId, MetricFetchParams.none())

        /** @see fetch */
        fun fetch(
            metricId: String,
            params: MetricFetchParams = MetricFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            fetch(params.toBuilder().metricId(metricId).build(), requestOptions)

        /** @see fetch */
        fun fetch(
            metricId: String,
            params: MetricFetchParams = MetricFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            fetch(metricId, params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            params: MetricFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>>

        /** @see fetch */
        fun fetch(params: MetricFetchParams): CompletableFuture<HttpResponseFor<BillableMetric>> =
            fetch(params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            metricId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            fetch(metricId, MetricFetchParams.none(), requestOptions)
    }
}
