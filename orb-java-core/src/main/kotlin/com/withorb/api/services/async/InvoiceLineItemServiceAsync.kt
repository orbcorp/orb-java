// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.InvoiceLineItemCreateParams
import com.withorb.api.models.InvoiceLineItemCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InvoiceLineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceLineItemServiceAsync

    /**
     * This creates a one-off fixed fee invoice line item on an Invoice. This can only be done for
     * invoices that are in a `draft` status.
     */
    fun create(
        params: InvoiceLineItemCreateParams
    ): CompletableFuture<InvoiceLineItemCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceLineItemCreateResponse>

    /**
     * A view of [InvoiceLineItemServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvoiceLineItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /invoice_line_items`, but is otherwise the same as
         * [InvoiceLineItemServiceAsync.create].
         */
        fun create(
            params: InvoiceLineItemCreateParams
        ): CompletableFuture<HttpResponseFor<InvoiceLineItemCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: InvoiceLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceLineItemCreateResponse>>
    }
}
