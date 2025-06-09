// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CreditNote
import com.withorb.api.models.CreditNoteCreateParams
import com.withorb.api.models.CreditNoteFetchParams
import com.withorb.api.models.CreditNoteListPageAsync
import com.withorb.api.models.CreditNoteListParams
import java.util.concurrent.CompletableFuture

interface CreditNoteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** This endpoint is used to create a single [`Credit Note`](/invoicing/credit-notes). */
    fun create(params: CreditNoteCreateParams): CompletableFuture<CreditNote> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CreditNoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditNote>

    /**
     * Get a paginated list of CreditNotes. Users can also filter by customer_id, subscription_id,
     * or external_customer_id. The credit notes will be returned in reverse chronological order by
     * `creation_time`.
     */
    fun list(): CompletableFuture<CreditNoteListPageAsync> = list(CreditNoteListParams.none())

    /** @see [list] */
    fun list(
        params: CreditNoteListParams = CreditNoteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditNoteListPageAsync>

    /** @see [list] */
    fun list(
        params: CreditNoteListParams = CreditNoteListParams.none()
    ): CompletableFuture<CreditNoteListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CreditNoteListPageAsync> =
        list(CreditNoteListParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch a single [`Credit Note`](/invoicing/credit-notes) given an
     * identifier.
     */
    fun fetch(creditNoteId: String): CompletableFuture<CreditNote> =
        fetch(creditNoteId, CreditNoteFetchParams.none())

    /** @see [fetch] */
    fun fetch(
        creditNoteId: String,
        params: CreditNoteFetchParams = CreditNoteFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditNote> =
        fetch(params.toBuilder().creditNoteId(creditNoteId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(
        creditNoteId: String,
        params: CreditNoteFetchParams = CreditNoteFetchParams.none(),
    ): CompletableFuture<CreditNote> = fetch(creditNoteId, params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: CreditNoteFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditNote>

    /** @see [fetch] */
    fun fetch(params: CreditNoteFetchParams): CompletableFuture<CreditNote> =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(creditNoteId: String, requestOptions: RequestOptions): CompletableFuture<CreditNote> =
        fetch(creditNoteId, CreditNoteFetchParams.none(), requestOptions)

    /**
     * A view of [CreditNoteServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /credit_notes`, but is otherwise the same as
         * [CreditNoteServiceAsync.create].
         */
        fun create(params: CreditNoteCreateParams): CompletableFuture<HttpResponseFor<CreditNote>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: CreditNoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditNote>>

        /**
         * Returns a raw HTTP response for `get /credit_notes`, but is otherwise the same as
         * [CreditNoteServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CreditNoteListPageAsync>> =
            list(CreditNoteListParams.none())

        /** @see [list] */
        fun list(
            params: CreditNoteListParams = CreditNoteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditNoteListPageAsync>>

        /** @see [list] */
        fun list(
            params: CreditNoteListParams = CreditNoteListParams.none()
        ): CompletableFuture<HttpResponseFor<CreditNoteListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CreditNoteListPageAsync>> =
            list(CreditNoteListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /credit_notes/{credit_note_id}`, but is otherwise
         * the same as [CreditNoteServiceAsync.fetch].
         */
        fun fetch(creditNoteId: String): CompletableFuture<HttpResponseFor<CreditNote>> =
            fetch(creditNoteId, CreditNoteFetchParams.none())

        /** @see [fetch] */
        fun fetch(
            creditNoteId: String,
            params: CreditNoteFetchParams = CreditNoteFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditNote>> =
            fetch(params.toBuilder().creditNoteId(creditNoteId).build(), requestOptions)

        /** @see [fetch] */
        fun fetch(
            creditNoteId: String,
            params: CreditNoteFetchParams = CreditNoteFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<CreditNote>> =
            fetch(creditNoteId, params, RequestOptions.none())

        /** @see [fetch] */
        fun fetch(
            params: CreditNoteFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditNote>>

        /** @see [fetch] */
        fun fetch(params: CreditNoteFetchParams): CompletableFuture<HttpResponseFor<CreditNote>> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        fun fetch(
            creditNoteId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditNote>> =
            fetch(creditNoteId, CreditNoteFetchParams.none(), requestOptions)
    }
}
