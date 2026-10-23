// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.BillableMetric
import com.withorb.api.models.MetricArchiveParams
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListPageAsync
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUnarchiveParams
import com.withorb.api.models.MetricUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * The Metric resource represents a calculation of a quantity based on events. Metrics are defined
 * by the query that transforms raw usage events into meaningful values for your customers.
 */
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
     * This endpoint allows you to update the `name`, `description`, and `metadata` properties on a
     * metric. Fields left out of the request are not changed, and `name` cannot be empty. If you
     * pass `null` for the metadata value, it will clear any existing metadata for that metric.
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
     * This endpoint is used to list [metrics](/core-concepts#metric). It returns information about
     * the metrics including its name, description, and item.
     *
     * Pass `status` to only return metrics with that status, e.g. `status=active` to leave out
     * archived metrics.
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
     * This endpoint archives a [metric](/core-concepts#metric). Archived metrics are left out of
     * `GET /v1/metrics` when filtering with `status=active`, and can't be chosen when creating new
     * plans in the Orb dashboard.
     *
     * Archiving does not change existing prices, plans, or subscriptions that use the metric, and
     * usage on those prices continues to be billed. A metric that is already archived cannot be
     * archived again.
     */
    fun archive(metricId: String): CompletableFuture<BillableMetric> =
        archive(metricId, MetricArchiveParams.none())

    /** @see archive */
    fun archive(
        metricId: String,
        params: MetricArchiveParams = MetricArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetric> =
        archive(params.toBuilder().metricId(metricId).build(), requestOptions)

    /** @see archive */
    fun archive(
        metricId: String,
        params: MetricArchiveParams = MetricArchiveParams.none(),
    ): CompletableFuture<BillableMetric> = archive(metricId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: MetricArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetric>

    /** @see archive */
    fun archive(params: MetricArchiveParams): CompletableFuture<BillableMetric> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        metricId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillableMetric> =
        archive(metricId, MetricArchiveParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch [metric](/core-concepts#metric) details given a metric
     * identifier. It returns information about the metrics including its name, description, and
     * item.
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
     * This endpoint restores an archived [metric](/core-concepts#metric) to `active`, so it can be
     * chosen for new plans again. Only archived metrics can be unarchived.
     */
    fun unarchive(metricId: String): CompletableFuture<BillableMetric> =
        unarchive(metricId, MetricUnarchiveParams.none())

    /** @see unarchive */
    fun unarchive(
        metricId: String,
        params: MetricUnarchiveParams = MetricUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetric> =
        unarchive(params.toBuilder().metricId(metricId).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(
        metricId: String,
        params: MetricUnarchiveParams = MetricUnarchiveParams.none(),
    ): CompletableFuture<BillableMetric> = unarchive(metricId, params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        params: MetricUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetric>

    /** @see unarchive */
    fun unarchive(params: MetricUnarchiveParams): CompletableFuture<BillableMetric> =
        unarchive(params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        metricId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillableMetric> =
        unarchive(metricId, MetricUnarchiveParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /metrics/{metric_id}/archive`, but is otherwise the
         * same as [MetricServiceAsync.archive].
         */
        fun archive(metricId: String): CompletableFuture<HttpResponseFor<BillableMetric>> =
            archive(metricId, MetricArchiveParams.none())

        /** @see archive */
        fun archive(
            metricId: String,
            params: MetricArchiveParams = MetricArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            archive(params.toBuilder().metricId(metricId).build(), requestOptions)

        /** @see archive */
        fun archive(
            metricId: String,
            params: MetricArchiveParams = MetricArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            archive(metricId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: MetricArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>>

        /** @see archive */
        fun archive(
            params: MetricArchiveParams
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            metricId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            archive(metricId, MetricArchiveParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `post /metrics/{metric_id}/unarchive`, but is otherwise
         * the same as [MetricServiceAsync.unarchive].
         */
        fun unarchive(metricId: String): CompletableFuture<HttpResponseFor<BillableMetric>> =
            unarchive(metricId, MetricUnarchiveParams.none())

        /** @see unarchive */
        fun unarchive(
            metricId: String,
            params: MetricUnarchiveParams = MetricUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            unarchive(params.toBuilder().metricId(metricId).build(), requestOptions)

        /** @see unarchive */
        fun unarchive(
            metricId: String,
            params: MetricUnarchiveParams = MetricUnarchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            unarchive(metricId, params, RequestOptions.none())

        /** @see unarchive */
        fun unarchive(
            params: MetricUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetric>>

        /** @see unarchive */
        fun unarchive(
            params: MetricUnarchiveParams
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            unarchive(params, RequestOptions.none())

        /** @see unarchive */
        fun unarchive(
            metricId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillableMetric>> =
            unarchive(metricId, MetricUnarchiveParams.none(), requestOptions)
    }
}
