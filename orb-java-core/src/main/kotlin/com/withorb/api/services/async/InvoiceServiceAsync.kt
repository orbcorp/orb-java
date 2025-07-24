// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Invoice
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceFetchParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceFetchUpcomingResponse
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceListPageAsync
import com.withorb.api.models.InvoiceListParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoicePayParams
import com.withorb.api.models.InvoiceUpdateParams
import com.withorb.api.models.InvoiceVoidInvoiceParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InvoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceServiceAsync

    /** This endpoint is used to create a one-off invoice for a customer. */
    fun create(params: InvoiceCreateParams): CompletableFuture<Invoice> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * This endpoint allows you to update the `metadata`, `net_terms`, and `due_date` properties on
     * an invoice. If you pass null for the metadata value, it will clear any existing metadata for
     * that invoice.
     *
     * `metadata` can be modified regardless of invoice state. `net_terms` and `due_date` can only
     * be modified if the invoice is in a `draft` state.
     */
    fun update(invoiceId: String): CompletableFuture<Invoice> =
        update(invoiceId, InvoiceUpdateParams.none())

    /** @see update */
    fun update(
        invoiceId: String,
        params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see update */
    fun update(
        invoiceId: String,
        params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
    ): CompletableFuture<Invoice> = update(invoiceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** @see update */
    fun update(params: InvoiceUpdateParams): CompletableFuture<Invoice> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(invoiceId: String, requestOptions: RequestOptions): CompletableFuture<Invoice> =
        update(invoiceId, InvoiceUpdateParams.none(), requestOptions)

    /**
     * This endpoint returns a list of all [`Invoice`](/core-concepts#invoice)s for an account in a
     * list format.
     *
     * The list of invoices is ordered starting from the most recently issued invoice date. The
     * response also includes [`pagination_metadata`](/api-reference/pagination), which lets the
     * caller retrieve the next page of results if they exist.
     *
     * By default, this only returns invoices that are `issued`, `paid`, or `synced`.
     *
     * When fetching any `draft` invoices, this returns the last-computed invoice values for each
     * draft invoice, which may not always be up-to-date since Orb regularly refreshes invoices
     * asynchronously.
     */
    fun list(): CompletableFuture<InvoiceListPageAsync> = list(InvoiceListParams.none())

    /** @see list */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceListPageAsync>

    /** @see list */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none()
    ): CompletableFuture<InvoiceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InvoiceListPageAsync> =
        list(InvoiceListParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch an [`Invoice`](/core-concepts#invoice) given an identifier.
     */
    fun fetch(invoiceId: String): CompletableFuture<Invoice> =
        fetch(invoiceId, InvoiceFetchParams.none())

    /** @see fetch */
    fun fetch(
        invoiceId: String,
        params: InvoiceFetchParams = InvoiceFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        fetch(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see fetch */
    fun fetch(
        invoiceId: String,
        params: InvoiceFetchParams = InvoiceFetchParams.none(),
    ): CompletableFuture<Invoice> = fetch(invoiceId, params, RequestOptions.none())

    /** @see fetch */
    fun fetch(
        params: InvoiceFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** @see fetch */
    fun fetch(params: InvoiceFetchParams): CompletableFuture<Invoice> =
        fetch(params, RequestOptions.none())

    /** @see fetch */
    fun fetch(invoiceId: String, requestOptions: RequestOptions): CompletableFuture<Invoice> =
        fetch(invoiceId, InvoiceFetchParams.none(), requestOptions)

    /**
     * This endpoint can be used to fetch the upcoming [invoice](/core-concepts#invoice) for the
     * current billing period given a subscription.
     */
    fun fetchUpcoming(
        params: InvoiceFetchUpcomingParams
    ): CompletableFuture<InvoiceFetchUpcomingResponse> =
        fetchUpcoming(params, RequestOptions.none())

    /** @see fetchUpcoming */
    fun fetchUpcoming(
        params: InvoiceFetchUpcomingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceFetchUpcomingResponse>

    /**
     * This endpoint allows an eligible invoice to be issued manually. This is only possible with
     * invoices where status is `draft`, `will_auto_issue` is false, and an `eligible_to_issue_at`
     * is a time in the past. Issuing an invoice could possibly trigger side effects, some of which
     * could be customer-visible (e.g. sending emails, auto-collecting payment, syncing the invoice
     * to external providers, etc).
     */
    fun issue(invoiceId: String): CompletableFuture<Invoice> =
        issue(invoiceId, InvoiceIssueParams.none())

    /** @see issue */
    fun issue(
        invoiceId: String,
        params: InvoiceIssueParams = InvoiceIssueParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        issue(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see issue */
    fun issue(
        invoiceId: String,
        params: InvoiceIssueParams = InvoiceIssueParams.none(),
    ): CompletableFuture<Invoice> = issue(invoiceId, params, RequestOptions.none())

    /** @see issue */
    fun issue(
        params: InvoiceIssueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** @see issue */
    fun issue(params: InvoiceIssueParams): CompletableFuture<Invoice> =
        issue(params, RequestOptions.none())

    /** @see issue */
    fun issue(invoiceId: String, requestOptions: RequestOptions): CompletableFuture<Invoice> =
        issue(invoiceId, InvoiceIssueParams.none(), requestOptions)

    /**
     * This endpoint allows an invoice's status to be set the `paid` status. This can only be done
     * to invoices that are in the `issued` status.
     */
    fun markPaid(invoiceId: String, params: InvoiceMarkPaidParams): CompletableFuture<Invoice> =
        markPaid(invoiceId, params, RequestOptions.none())

    /** @see markPaid */
    fun markPaid(
        invoiceId: String,
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        markPaid(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see markPaid */
    fun markPaid(params: InvoiceMarkPaidParams): CompletableFuture<Invoice> =
        markPaid(params, RequestOptions.none())

    /** @see markPaid */
    fun markPaid(
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * This endpoint collects payment for an invoice using the customer's default payment method.
     * This action can only be taken on invoices with status "issued".
     */
    fun pay(invoiceId: String): CompletableFuture<Invoice> = pay(invoiceId, InvoicePayParams.none())

    /** @see pay */
    fun pay(
        invoiceId: String,
        params: InvoicePayParams = InvoicePayParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        pay(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see pay */
    fun pay(
        invoiceId: String,
        params: InvoicePayParams = InvoicePayParams.none(),
    ): CompletableFuture<Invoice> = pay(invoiceId, params, RequestOptions.none())

    /** @see pay */
    fun pay(
        params: InvoicePayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** @see pay */
    fun pay(params: InvoicePayParams): CompletableFuture<Invoice> =
        pay(params, RequestOptions.none())

    /** @see pay */
    fun pay(invoiceId: String, requestOptions: RequestOptions): CompletableFuture<Invoice> =
        pay(invoiceId, InvoicePayParams.none(), requestOptions)

    /**
     * This endpoint allows an invoice's status to be set the `void` status. This can only be done
     * to invoices that are in the `issued` status.
     *
     * If the associated invoice has used the customer balance to change the amount due, the
     * customer balance operation will be reverted. For example, if the invoice used \$10 of
     * customer balance, that amount will be added back to the customer balance upon voiding.
     *
     * If the invoice was used to purchase a credit block, but the invoice is not yet paid, the
     * credit block will be voided. If the invoice was created due to a top-up, the top-up will be
     * disabled.
     */
    fun voidInvoice(invoiceId: String): CompletableFuture<Invoice> =
        voidInvoice(invoiceId, InvoiceVoidInvoiceParams.none())

    /** @see voidInvoice */
    fun voidInvoice(
        invoiceId: String,
        params: InvoiceVoidInvoiceParams = InvoiceVoidInvoiceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice> =
        voidInvoice(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see voidInvoice */
    fun voidInvoice(
        invoiceId: String,
        params: InvoiceVoidInvoiceParams = InvoiceVoidInvoiceParams.none(),
    ): CompletableFuture<Invoice> = voidInvoice(invoiceId, params, RequestOptions.none())

    /** @see voidInvoice */
    fun voidInvoice(
        params: InvoiceVoidInvoiceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /** @see voidInvoice */
    fun voidInvoice(params: InvoiceVoidInvoiceParams): CompletableFuture<Invoice> =
        voidInvoice(params, RequestOptions.none())

    /** @see voidInvoice */
    fun voidInvoice(invoiceId: String, requestOptions: RequestOptions): CompletableFuture<Invoice> =
        voidInvoice(invoiceId, InvoiceVoidInvoiceParams.none(), requestOptions)

    /**
     * A view of [InvoiceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvoiceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.create].
         */
        fun create(params: InvoiceCreateParams): CompletableFuture<HttpResponseFor<Invoice>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `put /invoices/{invoice_id}`, but is otherwise the same
         * as [InvoiceServiceAsync.update].
         */
        fun update(invoiceId: String): CompletableFuture<HttpResponseFor<Invoice>> =
            update(invoiceId, InvoiceUpdateParams.none())

        /** @see update */
        fun update(
            invoiceId: String,
            params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see update */
        fun update(
            invoiceId: String,
            params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            update(invoiceId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /** @see update */
        fun update(params: InvoiceUpdateParams): CompletableFuture<HttpResponseFor<Invoice>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            update(invoiceId, InvoiceUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>> =
            list(InvoiceListParams.none())

        /** @see list */
        fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>>

        /** @see list */
        fun list(
            params: InvoiceListParams = InvoiceListParams.none()
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices/{invoice_id}`, but is otherwise the same
         * as [InvoiceServiceAsync.fetch].
         */
        fun fetch(invoiceId: String): CompletableFuture<HttpResponseFor<Invoice>> =
            fetch(invoiceId, InvoiceFetchParams.none())

        /** @see fetch */
        fun fetch(
            invoiceId: String,
            params: InvoiceFetchParams = InvoiceFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            fetch(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see fetch */
        fun fetch(
            invoiceId: String,
            params: InvoiceFetchParams = InvoiceFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            fetch(invoiceId, params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            params: InvoiceFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /** @see fetch */
        fun fetch(params: InvoiceFetchParams): CompletableFuture<HttpResponseFor<Invoice>> =
            fetch(params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            fetch(invoiceId, InvoiceFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices/upcoming`, but is otherwise the same as
         * [InvoiceServiceAsync.fetchUpcoming].
         */
        fun fetchUpcoming(
            params: InvoiceFetchUpcomingParams
        ): CompletableFuture<HttpResponseFor<InvoiceFetchUpcomingResponse>> =
            fetchUpcoming(params, RequestOptions.none())

        /** @see fetchUpcoming */
        fun fetchUpcoming(
            params: InvoiceFetchUpcomingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceFetchUpcomingResponse>>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/issue`, but is otherwise the
         * same as [InvoiceServiceAsync.issue].
         */
        fun issue(invoiceId: String): CompletableFuture<HttpResponseFor<Invoice>> =
            issue(invoiceId, InvoiceIssueParams.none())

        /** @see issue */
        fun issue(
            invoiceId: String,
            params: InvoiceIssueParams = InvoiceIssueParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            issue(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see issue */
        fun issue(
            invoiceId: String,
            params: InvoiceIssueParams = InvoiceIssueParams.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            issue(invoiceId, params, RequestOptions.none())

        /** @see issue */
        fun issue(
            params: InvoiceIssueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /** @see issue */
        fun issue(params: InvoiceIssueParams): CompletableFuture<HttpResponseFor<Invoice>> =
            issue(params, RequestOptions.none())

        /** @see issue */
        fun issue(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            issue(invoiceId, InvoiceIssueParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/mark_paid`, but is otherwise
         * the same as [InvoiceServiceAsync.markPaid].
         */
        fun markPaid(
            invoiceId: String,
            params: InvoiceMarkPaidParams,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            markPaid(invoiceId, params, RequestOptions.none())

        /** @see markPaid */
        fun markPaid(
            invoiceId: String,
            params: InvoiceMarkPaidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            markPaid(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see markPaid */
        fun markPaid(params: InvoiceMarkPaidParams): CompletableFuture<HttpResponseFor<Invoice>> =
            markPaid(params, RequestOptions.none())

        /** @see markPaid */
        fun markPaid(
            params: InvoiceMarkPaidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/pay`, but is otherwise the
         * same as [InvoiceServiceAsync.pay].
         */
        fun pay(invoiceId: String): CompletableFuture<HttpResponseFor<Invoice>> =
            pay(invoiceId, InvoicePayParams.none())

        /** @see pay */
        fun pay(
            invoiceId: String,
            params: InvoicePayParams = InvoicePayParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            pay(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see pay */
        fun pay(
            invoiceId: String,
            params: InvoicePayParams = InvoicePayParams.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            pay(invoiceId, params, RequestOptions.none())

        /** @see pay */
        fun pay(
            params: InvoicePayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /** @see pay */
        fun pay(params: InvoicePayParams): CompletableFuture<HttpResponseFor<Invoice>> =
            pay(params, RequestOptions.none())

        /** @see pay */
        fun pay(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            pay(invoiceId, InvoicePayParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/void`, but is otherwise the
         * same as [InvoiceServiceAsync.voidInvoice].
         */
        fun voidInvoice(invoiceId: String): CompletableFuture<HttpResponseFor<Invoice>> =
            voidInvoice(invoiceId, InvoiceVoidInvoiceParams.none())

        /** @see voidInvoice */
        fun voidInvoice(
            invoiceId: String,
            params: InvoiceVoidInvoiceParams = InvoiceVoidInvoiceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            voidInvoice(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see voidInvoice */
        fun voidInvoice(
            invoiceId: String,
            params: InvoiceVoidInvoiceParams = InvoiceVoidInvoiceParams.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            voidInvoice(invoiceId, params, RequestOptions.none())

        /** @see voidInvoice */
        fun voidInvoice(
            params: InvoiceVoidInvoiceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /** @see voidInvoice */
        fun voidInvoice(
            params: InvoiceVoidInvoiceParams
        ): CompletableFuture<HttpResponseFor<Invoice>> = voidInvoice(params, RequestOptions.none())

        /** @see voidInvoice */
        fun voidInvoice(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> =
            voidInvoice(invoiceId, InvoiceVoidInvoiceParams.none(), requestOptions)
    }
}
