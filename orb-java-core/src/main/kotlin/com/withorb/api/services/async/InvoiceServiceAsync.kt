// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
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

interface InvoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** This endpoint is used to create a one-off invoice for a customer. */
    fun create(params: InvoiceCreateParams): CompletableFuture<Invoice> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * This endpoint allows you to update the `metadata` property on an invoice. If you pass null
     * for the metadata value, it will clear any existing metadata for that invoice.
     *
     * `metadata` can be modified regardless of invoice state.
     */
    fun update(params: InvoiceUpdateParams): CompletableFuture<Invoice> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

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

    /** @see [list] */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceListPageAsync>

    /** @see [list] */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none()
    ): CompletableFuture<InvoiceListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<InvoiceListPageAsync> =
        list(InvoiceListParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch an [`Invoice`](/core-concepts#invoice) given an identifier.
     */
    fun fetch(params: InvoiceFetchParams): CompletableFuture<Invoice> =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: InvoiceFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * This endpoint can be used to fetch the upcoming [invoice](/core-concepts#invoice) for the
     * current billing period given a subscription.
     */
    fun fetchUpcoming(
        params: InvoiceFetchUpcomingParams
    ): CompletableFuture<InvoiceFetchUpcomingResponse> =
        fetchUpcoming(params, RequestOptions.none())

    /** @see [fetchUpcoming] */
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
    fun issue(params: InvoiceIssueParams): CompletableFuture<Invoice> =
        issue(params, RequestOptions.none())

    /** @see [issue] */
    fun issue(
        params: InvoiceIssueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * This endpoint allows an invoice's status to be set the `paid` status. This can only be done
     * to invoices that are in the `issued` status.
     */
    fun markPaid(params: InvoiceMarkPaidParams): CompletableFuture<Invoice> =
        markPaid(params, RequestOptions.none())

    /** @see [markPaid] */
    fun markPaid(
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * This endpoint collects payment for an invoice using the customer's default payment method.
     * This action can only be taken on invoices with status "issued".
     */
    fun pay(params: InvoicePayParams): CompletableFuture<Invoice> =
        pay(params, RequestOptions.none())

    /** @see [pay] */
    fun pay(
        params: InvoicePayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * This endpoint allows an invoice's status to be set the `void` status. This can only be done
     * to invoices that are in the `issued` status.
     *
     * If the associated invoice has used the customer balance to change the amount due, the
     * customer balance operation will be reverted. For example, if the invoice used $10 of customer
     * balance, that amount will be added back to the customer balance upon voiding.
     *
     * If the invoice was used to purchase a credit block, but the invoice is not yet paid, the
     * credit block will be voided. If the invoice was created due to a top-up, the top-up will be
     * disabled.
     */
    fun voidInvoice(params: InvoiceVoidInvoiceParams): CompletableFuture<Invoice> =
        voidInvoice(params, RequestOptions.none())

    /** @see [voidInvoice] */
    fun voidInvoice(
        params: InvoiceVoidInvoiceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * A view of [InvoiceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: InvoiceCreateParams): CompletableFuture<HttpResponseFor<Invoice>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `put /invoices/{invoice_id}`, but is otherwise the same
         * as [InvoiceServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: InvoiceUpdateParams): CompletableFuture<HttpResponseFor<Invoice>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `get /invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>> =
            list(InvoiceListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none()
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices/{invoice_id}`, but is otherwise the same
         * as [InvoiceServiceAsync.fetch].
         */
        @MustBeClosed
        fun fetch(params: InvoiceFetchParams): CompletableFuture<HttpResponseFor<Invoice>> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: InvoiceFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `get /invoices/upcoming`, but is otherwise the same as
         * [InvoiceServiceAsync.fetchUpcoming].
         */
        @MustBeClosed
        fun fetchUpcoming(
            params: InvoiceFetchUpcomingParams
        ): CompletableFuture<HttpResponseFor<InvoiceFetchUpcomingResponse>> =
            fetchUpcoming(params, RequestOptions.none())

        /** @see [fetchUpcoming] */
        @MustBeClosed
        fun fetchUpcoming(
            params: InvoiceFetchUpcomingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceFetchUpcomingResponse>>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/issue`, but is otherwise the
         * same as [InvoiceServiceAsync.issue].
         */
        @MustBeClosed
        fun issue(params: InvoiceIssueParams): CompletableFuture<HttpResponseFor<Invoice>> =
            issue(params, RequestOptions.none())

        /** @see [issue] */
        @MustBeClosed
        fun issue(
            params: InvoiceIssueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/mark_paid`, but is otherwise
         * the same as [InvoiceServiceAsync.markPaid].
         */
        @MustBeClosed
        fun markPaid(params: InvoiceMarkPaidParams): CompletableFuture<HttpResponseFor<Invoice>> =
            markPaid(params, RequestOptions.none())

        /** @see [markPaid] */
        @MustBeClosed
        fun markPaid(
            params: InvoiceMarkPaidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/pay`, but is otherwise the
         * same as [InvoiceServiceAsync.pay].
         */
        @MustBeClosed
        fun pay(params: InvoicePayParams): CompletableFuture<HttpResponseFor<Invoice>> =
            pay(params, RequestOptions.none())

        /** @see [pay] */
        @MustBeClosed
        fun pay(
            params: InvoicePayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/void`, but is otherwise the
         * same as [InvoiceServiceAsync.voidInvoice].
         */
        @MustBeClosed
        fun voidInvoice(
            params: InvoiceVoidInvoiceParams
        ): CompletableFuture<HttpResponseFor<Invoice>> = voidInvoice(params, RequestOptions.none())

        /** @see [voidInvoice] */
        @MustBeClosed
        fun voidInvoice(
            params: InvoiceVoidInvoiceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>
    }
}
