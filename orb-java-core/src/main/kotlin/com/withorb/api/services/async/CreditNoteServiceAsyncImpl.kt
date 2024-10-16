// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.handlers.withErrorHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.errors.OrbError
import com.withorb.api.models.CreditNote
import com.withorb.api.models.CreditNoteFetchParams
import com.withorb.api.models.CreditNoteListPageAsync
import com.withorb.api.models.CreditNoteListParams
import java.util.concurrent.CompletableFuture

class CreditNoteServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CreditNoteServiceAsync {

    private val errorHandler: Handler<OrbError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CreditNoteListPageAsync.Response> =
        jsonHandler<CreditNoteListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get a paginated list of CreditNotes. Users can also filter by customer_id, subscription_id,
     * or external_customer_id. The credit notes will be returned in reverse chronological order by
     * `creation_time`.
     */
    override fun list(
        params: CreditNoteListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditNoteListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("credit_notes")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CreditNoteListPageAsync.of(this, params, it) }
        }
    }

    private val fetchHandler: Handler<CreditNote> =
        jsonHandler<CreditNote>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint is used to fetch a single [`Credit Note`](../guides/invoicing/credit-notes)
     * given an identifier.
     */
    override fun fetch(
        params: CreditNoteFetchParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CreditNote> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("credit_notes", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { fetchHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
