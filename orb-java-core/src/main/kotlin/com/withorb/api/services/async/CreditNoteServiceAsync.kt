// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.CreditNote
import com.withorb.api.models.CreditNoteCreateParams
import com.withorb.api.models.CreditNoteFetchParams
import com.withorb.api.models.CreditNoteListPageAsync
import com.withorb.api.models.CreditNoteListParams
import java.util.concurrent.CompletableFuture

interface CreditNoteServiceAsync {

    /**
     * This endpoint is used to create a single [`Credit Note`](../guides/invoicing/credit-notes).
     */
    @JvmOverloads
    fun create(
        params: CreditNoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CreditNote>

    /**
     * Get a paginated list of CreditNotes. Users can also filter by customer_id, subscription_id,
     * or external_customer_id. The credit notes will be returned in reverse chronological order by
     * `creation_time`.
     */
    @JvmOverloads
    fun list(
        params: CreditNoteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CreditNoteListPageAsync>

    /**
     * This endpoint is used to fetch a single [`Credit Note`](../guides/invoicing/credit-notes)
     * given an identifier.
     */
    @JvmOverloads
    fun fetch(
        params: CreditNoteFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CreditNote>
}
