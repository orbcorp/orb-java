// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.BillableMetric
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListPageAsync
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUpdateParams
import java.util.concurrent.CompletableFuture

interface MetricServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint is used to create a [metric](/core-concepts###metric) using a SQL string. See
     * [SQL support](/extensibility/advanced-metrics#sql-support) for a description of constructing
     * SQL queries with examples.
     */
    fun create(params: MetricCreateParams): CompletableFuture<BillableMetric> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: MetricCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetric>

    /**
     * This endpoint allows you to update the `metadata` property on a metric. If you pass `null`
     * for the metadata value, it will clear any existing metadata for that invoice.
     */
    fun update(params: MetricUpdateParams): CompletableFuture<BillableMetric> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: MetricUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetric>

    /**
     * This endpoint is used to fetch [metric](/core-concepts##metric) details given a metric
     * identifier. It returns information about the metrics including its name, description, and
     * item.
     */
    fun list(): CompletableFuture<MetricListPageAsync> = list(MetricListParams.none())

    /** @see [list] */
    fun list(
        params: MetricListParams = MetricListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetricListPageAsync>

    /** @see [list] */
    fun list(
        params: MetricListParams = MetricListParams.none()
    ): CompletableFuture<MetricListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<MetricListPageAsync> =
        list(MetricListParams.none(), requestOptions)

    /**
     * This endpoint is used to list [metrics](/core-concepts#metric). It returns information about
     * the metrics including its name, description, and item.
     */
    fun fetch(params: MetricFetchParams): CompletableFuture<BillableMetric> =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: MetricFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetric>

    /**
     * A view of [MetricServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /metrics`, but is otherwise the same as
         * [MetricServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: MetricCreateParams): CompletableFuture<HttpResponseFor<BillableMetric>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: MetricCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>>

        /**
         * Returns a raw HTTP response for `put /metrics/{metric_id}`, but is otherwise the same as
         * [MetricServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: MetricUpdateParams): CompletableFuture<HttpResponseFor<BillableMetric>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: MetricUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>>

        /**
         * Returns a raw HTTP response for `get /metrics`, but is otherwise the same as
         * [MetricServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<MetricListPageAsync>> =
            list(MetricListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: MetricListParams = MetricListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetricListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: MetricListParams = MetricListParams.none()
        ): CompletableFuture<HttpResponseFor<MetricListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MetricListPageAsync>> =
            list(MetricListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /metrics/{metric_id}`, but is otherwise the same as
         * [MetricServiceAsync.fetch].
         */
        @MustBeClosed
        fun fetch(params: MetricFetchParams): CompletableFuture<HttpResponseFor<BillableMetric>> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: MetricFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>>
    }
}
