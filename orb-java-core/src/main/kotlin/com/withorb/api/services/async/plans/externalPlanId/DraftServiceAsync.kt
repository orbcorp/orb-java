// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans.externalPlanId

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.PlanExternalPlanIdDraftDiscardParams
import com.withorb.api.models.PlanExternalPlanIdDraftFetchParams
import com.withorb.api.models.PlanExternalPlanIdDraftPublishParams
import com.withorb.api.models.PlanExternalPlanIdDraftSaveParams
import com.withorb.api.models.PlanVersion
import com.withorb.api.models.PlanVersionDraft
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
interface DraftServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftServiceAsync

    /**
     * This endpoint discards the plan's draft version. Prices and adjustments the draft created
     * stay in the Pricebook.
     */
    fun discard(externalPlanId: String): CompletableFuture<Void?> =
        discard(externalPlanId, PlanExternalPlanIdDraftDiscardParams.none())

    /** @see discard */
    fun discard(
        externalPlanId: String,
        params: PlanExternalPlanIdDraftDiscardParams = PlanExternalPlanIdDraftDiscardParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        discard(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

    /** @see discard */
    fun discard(
        externalPlanId: String,
        params: PlanExternalPlanIdDraftDiscardParams = PlanExternalPlanIdDraftDiscardParams.none(),
    ): CompletableFuture<Void?> = discard(externalPlanId, params, RequestOptions.none())

    /** @see discard */
    fun discard(
        params: PlanExternalPlanIdDraftDiscardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see discard */
    fun discard(params: PlanExternalPlanIdDraftDiscardParams): CompletableFuture<Void?> =
        discard(params, RequestOptions.none())

    /** @see discard */
    fun discard(externalPlanId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        discard(externalPlanId, PlanExternalPlanIdDraftDiscardParams.none(), requestOptions)

    /**
     * This endpoint returns the plan's unpublished draft version, with its changes applied on top
     * of the latest published version. It returns a 404 if the plan has no draft.
     */
    fun fetch(externalPlanId: String): CompletableFuture<PlanVersionDraft> =
        fetch(externalPlanId, PlanExternalPlanIdDraftFetchParams.none())

    /** @see fetch */
    fun fetch(
        externalPlanId: String,
        params: PlanExternalPlanIdDraftFetchParams = PlanExternalPlanIdDraftFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersionDraft> =
        fetch(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

    /** @see fetch */
    fun fetch(
        externalPlanId: String,
        params: PlanExternalPlanIdDraftFetchParams = PlanExternalPlanIdDraftFetchParams.none(),
    ): CompletableFuture<PlanVersionDraft> = fetch(externalPlanId, params, RequestOptions.none())

    /** @see fetch */
    fun fetch(
        params: PlanExternalPlanIdDraftFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersionDraft>

    /** @see fetch */
    fun fetch(params: PlanExternalPlanIdDraftFetchParams): CompletableFuture<PlanVersionDraft> =
        fetch(params, RequestOptions.none())

    /** @see fetch */
    fun fetch(
        externalPlanId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanVersionDraft> =
        fetch(externalPlanId, PlanExternalPlanIdDraftFetchParams.none(), requestOptions)

    /**
     * This endpoint publishes the plan's draft as the next numbered version. A draft that fails
     * plan version validation is a 400 and is left as it was.
     */
    fun publish(externalPlanId: String): CompletableFuture<PlanVersion> =
        publish(externalPlanId, PlanExternalPlanIdDraftPublishParams.none())

    /** @see publish */
    fun publish(
        externalPlanId: String,
        params: PlanExternalPlanIdDraftPublishParams = PlanExternalPlanIdDraftPublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersion> =
        publish(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

    /** @see publish */
    fun publish(
        externalPlanId: String,
        params: PlanExternalPlanIdDraftPublishParams = PlanExternalPlanIdDraftPublishParams.none(),
    ): CompletableFuture<PlanVersion> = publish(externalPlanId, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: PlanExternalPlanIdDraftPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersion>

    /** @see publish */
    fun publish(params: PlanExternalPlanIdDraftPublishParams): CompletableFuture<PlanVersion> =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        externalPlanId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanVersion> =
        publish(externalPlanId, PlanExternalPlanIdDraftPublishParams.none(), requestOptions)

    /**
     * This endpoint creates the plan's draft version or fully replaces its changes. The changes are
     * always relative to the latest published version. A save replaces the draft; last write wins.
     */
    fun save(externalPlanId: String): CompletableFuture<PlanVersionDraft> =
        save(externalPlanId, PlanExternalPlanIdDraftSaveParams.none())

    /** @see save */
    fun save(
        externalPlanId: String,
        params: PlanExternalPlanIdDraftSaveParams = PlanExternalPlanIdDraftSaveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersionDraft> =
        save(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

    /** @see save */
    fun save(
        externalPlanId: String,
        params: PlanExternalPlanIdDraftSaveParams = PlanExternalPlanIdDraftSaveParams.none(),
    ): CompletableFuture<PlanVersionDraft> = save(externalPlanId, params, RequestOptions.none())

    /** @see save */
    fun save(
        params: PlanExternalPlanIdDraftSaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersionDraft>

    /** @see save */
    fun save(params: PlanExternalPlanIdDraftSaveParams): CompletableFuture<PlanVersionDraft> =
        save(params, RequestOptions.none())

    /** @see save */
    fun save(
        externalPlanId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanVersionDraft> =
        save(externalPlanId, PlanExternalPlanIdDraftSaveParams.none(), requestOptions)

    /** A view of [DraftServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DraftServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /plans/external_plan_id/{external_plan_id}/draft`, but is otherwise the same as
         * [DraftServiceAsync.discard].
         */
        fun discard(externalPlanId: String): CompletableFuture<HttpResponse> =
            discard(externalPlanId, PlanExternalPlanIdDraftDiscardParams.none())

        /** @see discard */
        fun discard(
            externalPlanId: String,
            params: PlanExternalPlanIdDraftDiscardParams =
                PlanExternalPlanIdDraftDiscardParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            discard(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

        /** @see discard */
        fun discard(
            externalPlanId: String,
            params: PlanExternalPlanIdDraftDiscardParams =
                PlanExternalPlanIdDraftDiscardParams.none(),
        ): CompletableFuture<HttpResponse> = discard(externalPlanId, params, RequestOptions.none())

        /** @see discard */
        fun discard(
            params: PlanExternalPlanIdDraftDiscardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see discard */
        fun discard(params: PlanExternalPlanIdDraftDiscardParams): CompletableFuture<HttpResponse> =
            discard(params, RequestOptions.none())

        /** @see discard */
        fun discard(
            externalPlanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            discard(externalPlanId, PlanExternalPlanIdDraftDiscardParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /plans/external_plan_id/{external_plan_id}/draft`,
         * but is otherwise the same as [DraftServiceAsync.fetch].
         */
        fun fetch(externalPlanId: String): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            fetch(externalPlanId, PlanExternalPlanIdDraftFetchParams.none())

        /** @see fetch */
        fun fetch(
            externalPlanId: String,
            params: PlanExternalPlanIdDraftFetchParams = PlanExternalPlanIdDraftFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            fetch(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

        /** @see fetch */
        fun fetch(
            externalPlanId: String,
            params: PlanExternalPlanIdDraftFetchParams = PlanExternalPlanIdDraftFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            fetch(externalPlanId, params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            params: PlanExternalPlanIdDraftFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>>

        /** @see fetch */
        fun fetch(
            params: PlanExternalPlanIdDraftFetchParams
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            fetch(params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            externalPlanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            fetch(externalPlanId, PlanExternalPlanIdDraftFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /plans/external_plan_id/{external_plan_id}/draft/publish`, but is otherwise the same as
         * [DraftServiceAsync.publish].
         */
        fun publish(externalPlanId: String): CompletableFuture<HttpResponseFor<PlanVersion>> =
            publish(externalPlanId, PlanExternalPlanIdDraftPublishParams.none())

        /** @see publish */
        fun publish(
            externalPlanId: String,
            params: PlanExternalPlanIdDraftPublishParams =
                PlanExternalPlanIdDraftPublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            publish(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

        /** @see publish */
        fun publish(
            externalPlanId: String,
            params: PlanExternalPlanIdDraftPublishParams =
                PlanExternalPlanIdDraftPublishParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            publish(externalPlanId, params, RequestOptions.none())

        /** @see publish */
        fun publish(
            params: PlanExternalPlanIdDraftPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>>

        /** @see publish */
        fun publish(
            params: PlanExternalPlanIdDraftPublishParams
        ): CompletableFuture<HttpResponseFor<PlanVersion>> = publish(params, RequestOptions.none())

        /** @see publish */
        fun publish(
            externalPlanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            publish(externalPlanId, PlanExternalPlanIdDraftPublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /plans/external_plan_id/{external_plan_id}/draft`,
         * but is otherwise the same as [DraftServiceAsync.save].
         */
        fun save(externalPlanId: String): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            save(externalPlanId, PlanExternalPlanIdDraftSaveParams.none())

        /** @see save */
        fun save(
            externalPlanId: String,
            params: PlanExternalPlanIdDraftSaveParams = PlanExternalPlanIdDraftSaveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            save(params.toBuilder().externalPlanId(externalPlanId).build(), requestOptions)

        /** @see save */
        fun save(
            externalPlanId: String,
            params: PlanExternalPlanIdDraftSaveParams = PlanExternalPlanIdDraftSaveParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            save(externalPlanId, params, RequestOptions.none())

        /** @see save */
        fun save(
            params: PlanExternalPlanIdDraftSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>>

        /** @see save */
        fun save(
            params: PlanExternalPlanIdDraftSaveParams
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            save(params, RequestOptions.none())

        /** @see save */
        fun save(
            externalPlanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            save(externalPlanId, PlanExternalPlanIdDraftSaveParams.none(), requestOptions)
    }
}
