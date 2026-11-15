// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.PlanDraftDiscardParams
import com.withorb.api.models.PlanDraftFetchParams
import com.withorb.api.models.PlanDraftPublishParams
import com.withorb.api.models.PlanDraftSaveParams
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
    fun discard(planId: String): CompletableFuture<Void?> =
        discard(planId, PlanDraftDiscardParams.none())

    /** @see discard */
    fun discard(
        planId: String,
        params: PlanDraftDiscardParams = PlanDraftDiscardParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = discard(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see discard */
    fun discard(
        planId: String,
        params: PlanDraftDiscardParams = PlanDraftDiscardParams.none(),
    ): CompletableFuture<Void?> = discard(planId, params, RequestOptions.none())

    /** @see discard */
    fun discard(
        params: PlanDraftDiscardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see discard */
    fun discard(params: PlanDraftDiscardParams): CompletableFuture<Void?> =
        discard(params, RequestOptions.none())

    /** @see discard */
    fun discard(planId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        discard(planId, PlanDraftDiscardParams.none(), requestOptions)

    /**
     * This endpoint returns the plan's unpublished draft version, with its changes applied on top
     * of the latest published version. It returns a 404 if the plan has no draft.
     */
    fun fetch(planId: String): CompletableFuture<PlanVersionDraft> =
        fetch(planId, PlanDraftFetchParams.none())

    /** @see fetch */
    fun fetch(
        planId: String,
        params: PlanDraftFetchParams = PlanDraftFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersionDraft> =
        fetch(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see fetch */
    fun fetch(
        planId: String,
        params: PlanDraftFetchParams = PlanDraftFetchParams.none(),
    ): CompletableFuture<PlanVersionDraft> = fetch(planId, params, RequestOptions.none())

    /** @see fetch */
    fun fetch(
        params: PlanDraftFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersionDraft>

    /** @see fetch */
    fun fetch(params: PlanDraftFetchParams): CompletableFuture<PlanVersionDraft> =
        fetch(params, RequestOptions.none())

    /** @see fetch */
    fun fetch(planId: String, requestOptions: RequestOptions): CompletableFuture<PlanVersionDraft> =
        fetch(planId, PlanDraftFetchParams.none(), requestOptions)

    /**
     * This endpoint publishes the plan's draft as the next numbered version. A draft that fails
     * plan version validation is a 400 and is left as it was.
     */
    fun publish(planId: String): CompletableFuture<PlanVersion> =
        publish(planId, PlanDraftPublishParams.none())

    /** @see publish */
    fun publish(
        planId: String,
        params: PlanDraftPublishParams = PlanDraftPublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersion> =
        publish(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see publish */
    fun publish(
        planId: String,
        params: PlanDraftPublishParams = PlanDraftPublishParams.none(),
    ): CompletableFuture<PlanVersion> = publish(planId, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: PlanDraftPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersion>

    /** @see publish */
    fun publish(params: PlanDraftPublishParams): CompletableFuture<PlanVersion> =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(planId: String, requestOptions: RequestOptions): CompletableFuture<PlanVersion> =
        publish(planId, PlanDraftPublishParams.none(), requestOptions)

    /**
     * This endpoint creates the plan's draft version or fully replaces its changes. The changes are
     * always relative to the latest published version. A save replaces the draft; last write wins.
     */
    fun save(planId: String): CompletableFuture<PlanVersionDraft> =
        save(planId, PlanDraftSaveParams.none())

    /** @see save */
    fun save(
        planId: String,
        params: PlanDraftSaveParams = PlanDraftSaveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersionDraft> =
        save(params.toBuilder().planId(planId).build(), requestOptions)

    /** @see save */
    fun save(
        planId: String,
        params: PlanDraftSaveParams = PlanDraftSaveParams.none(),
    ): CompletableFuture<PlanVersionDraft> = save(planId, params, RequestOptions.none())

    /** @see save */
    fun save(
        params: PlanDraftSaveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanVersionDraft>

    /** @see save */
    fun save(params: PlanDraftSaveParams): CompletableFuture<PlanVersionDraft> =
        save(params, RequestOptions.none())

    /** @see save */
    fun save(planId: String, requestOptions: RequestOptions): CompletableFuture<PlanVersionDraft> =
        save(planId, PlanDraftSaveParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `delete /plans/{plan_id}/draft`, but is otherwise the
         * same as [DraftServiceAsync.discard].
         */
        fun discard(planId: String): CompletableFuture<HttpResponse> =
            discard(planId, PlanDraftDiscardParams.none())

        /** @see discard */
        fun discard(
            planId: String,
            params: PlanDraftDiscardParams = PlanDraftDiscardParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            discard(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see discard */
        fun discard(
            planId: String,
            params: PlanDraftDiscardParams = PlanDraftDiscardParams.none(),
        ): CompletableFuture<HttpResponse> = discard(planId, params, RequestOptions.none())

        /** @see discard */
        fun discard(
            params: PlanDraftDiscardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see discard */
        fun discard(params: PlanDraftDiscardParams): CompletableFuture<HttpResponse> =
            discard(params, RequestOptions.none())

        /** @see discard */
        fun discard(
            planId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            discard(planId, PlanDraftDiscardParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /plans/{plan_id}/draft`, but is otherwise the same
         * as [DraftServiceAsync.fetch].
         */
        fun fetch(planId: String): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            fetch(planId, PlanDraftFetchParams.none())

        /** @see fetch */
        fun fetch(
            planId: String,
            params: PlanDraftFetchParams = PlanDraftFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            fetch(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see fetch */
        fun fetch(
            planId: String,
            params: PlanDraftFetchParams = PlanDraftFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            fetch(planId, params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            params: PlanDraftFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>>

        /** @see fetch */
        fun fetch(
            params: PlanDraftFetchParams
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            fetch(params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            planId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            fetch(planId, PlanDraftFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /plans/{plan_id}/draft/publish`, but is otherwise
         * the same as [DraftServiceAsync.publish].
         */
        fun publish(planId: String): CompletableFuture<HttpResponseFor<PlanVersion>> =
            publish(planId, PlanDraftPublishParams.none())

        /** @see publish */
        fun publish(
            planId: String,
            params: PlanDraftPublishParams = PlanDraftPublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            publish(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see publish */
        fun publish(
            planId: String,
            params: PlanDraftPublishParams = PlanDraftPublishParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            publish(planId, params, RequestOptions.none())

        /** @see publish */
        fun publish(
            params: PlanDraftPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersion>>

        /** @see publish */
        fun publish(
            params: PlanDraftPublishParams
        ): CompletableFuture<HttpResponseFor<PlanVersion>> = publish(params, RequestOptions.none())

        /** @see publish */
        fun publish(
            planId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanVersion>> =
            publish(planId, PlanDraftPublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /plans/{plan_id}/draft`, but is otherwise the same
         * as [DraftServiceAsync.save].
         */
        fun save(planId: String): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            save(planId, PlanDraftSaveParams.none())

        /** @see save */
        fun save(
            planId: String,
            params: PlanDraftSaveParams = PlanDraftSaveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            save(params.toBuilder().planId(planId).build(), requestOptions)

        /** @see save */
        fun save(
            planId: String,
            params: PlanDraftSaveParams = PlanDraftSaveParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            save(planId, params, RequestOptions.none())

        /** @see save */
        fun save(
            params: PlanDraftSaveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>>

        /** @see save */
        fun save(
            params: PlanDraftSaveParams
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            save(params, RequestOptions.none())

        /** @see save */
        fun save(
            planId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanVersionDraft>> =
            save(planId, PlanDraftSaveParams.none(), requestOptions)
    }
}
