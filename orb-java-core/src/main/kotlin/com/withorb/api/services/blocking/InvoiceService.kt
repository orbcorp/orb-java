// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Invoice
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceFetchParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceFetchUpcomingResponse
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceListPage
import com.withorb.api.models.InvoiceListParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoicePayParams
import com.withorb.api.models.InvoiceUpdateParams
import com.withorb.api.models.InvoiceVoidInvoiceParams
import java.util.function.Consumer

interface InvoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceService

    /** This endpoint is used to create a one-off invoice for a customer. */
    fun create(params: InvoiceCreateParams): Invoice = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /**
     * This endpoint allows you to update the `metadata` property on an invoice. If you pass null
     * for the metadata value, it will clear any existing metadata for that invoice.
     *
     * `metadata` can be modified regardless of invoice state.
     */
    fun update(invoiceId: String): Invoice = update(invoiceId, InvoiceUpdateParams.none())

    /** @see [update] */
    fun update(
        invoiceId: String,
        params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see [update] */
    fun update(
        invoiceId: String,
        params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
    ): Invoice = update(invoiceId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [update] */
    fun update(params: InvoiceUpdateParams): Invoice = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(invoiceId: String, requestOptions: RequestOptions): Invoice =
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
    fun list(): InvoiceListPage = list(InvoiceListParams.none())

    /** @see [list] */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListPage

    /** @see [list] */
    fun list(params: InvoiceListParams = InvoiceListParams.none()): InvoiceListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InvoiceListPage =
        list(InvoiceListParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch an [`Invoice`](/core-concepts#invoice) given an identifier.
     */
    fun fetch(invoiceId: String): Invoice = fetch(invoiceId, InvoiceFetchParams.none())

    /** @see [fetch] */
    fun fetch(
        invoiceId: String,
        params: InvoiceFetchParams = InvoiceFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = fetch(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(invoiceId: String, params: InvoiceFetchParams = InvoiceFetchParams.none()): Invoice =
        fetch(invoiceId, params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: InvoiceFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [fetch] */
    fun fetch(params: InvoiceFetchParams): Invoice = fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(invoiceId: String, requestOptions: RequestOptions): Invoice =
        fetch(invoiceId, InvoiceFetchParams.none(), requestOptions)

    /**
     * This endpoint can be used to fetch the upcoming [invoice](/core-concepts#invoice) for the
     * current billing period given a subscription.
     */
    fun fetchUpcoming(params: InvoiceFetchUpcomingParams): InvoiceFetchUpcomingResponse =
        fetchUpcoming(params, RequestOptions.none())

    /** @see [fetchUpcoming] */
    fun fetchUpcoming(
        params: InvoiceFetchUpcomingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceFetchUpcomingResponse

    /**
     * This endpoint allows an eligible invoice to be issued manually. This is only possible with
     * invoices where status is `draft`, `will_auto_issue` is false, and an `eligible_to_issue_at`
     * is a time in the past. Issuing an invoice could possibly trigger side effects, some of which
     * could be customer-visible (e.g. sending emails, auto-collecting payment, syncing the invoice
     * to external providers, etc).
     */
    fun issue(invoiceId: String): Invoice = issue(invoiceId, InvoiceIssueParams.none())

    /** @see [issue] */
    fun issue(
        invoiceId: String,
        params: InvoiceIssueParams = InvoiceIssueParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = issue(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see [issue] */
    fun issue(invoiceId: String, params: InvoiceIssueParams = InvoiceIssueParams.none()): Invoice =
        issue(invoiceId, params, RequestOptions.none())

    /** @see [issue] */
    fun issue(
        params: InvoiceIssueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [issue] */
    fun issue(params: InvoiceIssueParams): Invoice = issue(params, RequestOptions.none())

    /** @see [issue] */
    fun issue(invoiceId: String, requestOptions: RequestOptions): Invoice =
        issue(invoiceId, InvoiceIssueParams.none(), requestOptions)

    /**
     * This endpoint allows an invoice's status to be set the `paid` status. This can only be done
     * to invoices that are in the `issued` status.
     */
    fun markPaid(invoiceId: String, params: InvoiceMarkPaidParams): Invoice =
        markPaid(invoiceId, params, RequestOptions.none())

    /** @see [markPaid] */
    fun markPaid(
        invoiceId: String,
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = markPaid(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see [markPaid] */
    fun markPaid(params: InvoiceMarkPaidParams): Invoice = markPaid(params, RequestOptions.none())

    /** @see [markPaid] */
    fun markPaid(
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /**
     * This endpoint collects payment for an invoice using the customer's default payment method.
     * This action can only be taken on invoices with status "issued".
     */
    fun pay(invoiceId: String): Invoice = pay(invoiceId, InvoicePayParams.none())

    /** @see [pay] */
    fun pay(
        invoiceId: String,
        params: InvoicePayParams = InvoicePayParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = pay(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see [pay] */
    fun pay(invoiceId: String, params: InvoicePayParams = InvoicePayParams.none()): Invoice =
        pay(invoiceId, params, RequestOptions.none())

    /** @see [pay] */
    fun pay(
        params: InvoicePayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [pay] */
    fun pay(params: InvoicePayParams): Invoice = pay(params, RequestOptions.none())

    /** @see [pay] */
    fun pay(invoiceId: String, requestOptions: RequestOptions): Invoice =
        pay(invoiceId, InvoicePayParams.none(), requestOptions)

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
    fun voidInvoice(invoiceId: String): Invoice =
        voidInvoice(invoiceId, InvoiceVoidInvoiceParams.none())

    /** @see [voidInvoice] */
    fun voidInvoice(
        invoiceId: String,
        params: InvoiceVoidInvoiceParams = InvoiceVoidInvoiceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = voidInvoice(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

    /** @see [voidInvoice] */
    fun voidInvoice(
        invoiceId: String,
        params: InvoiceVoidInvoiceParams = InvoiceVoidInvoiceParams.none(),
    ): Invoice = voidInvoice(invoiceId, params, RequestOptions.none())

    /** @see [voidInvoice] */
    fun voidInvoice(
        params: InvoiceVoidInvoiceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [voidInvoice] */
    fun voidInvoice(params: InvoiceVoidInvoiceParams): Invoice =
        voidInvoice(params, RequestOptions.none())

    /** @see [voidInvoice] */
    fun voidInvoice(invoiceId: String, requestOptions: RequestOptions): Invoice =
        voidInvoice(invoiceId, InvoiceVoidInvoiceParams.none(), requestOptions)

    /** A view of [InvoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /invoices`, but is otherwise the same as
         * [InvoiceService.create].
         */
        @MustBeClosed
        fun create(params: InvoiceCreateParams): HttpResponseFor<Invoice> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `put /invoices/{invoice_id}`, but is otherwise the same
         * as [InvoiceService.update].
         */
        @MustBeClosed
        fun update(invoiceId: String): HttpResponseFor<Invoice> =
            update(invoiceId, InvoiceUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            invoiceId: String,
            params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            update(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            invoiceId: String,
            params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
        ): HttpResponseFor<Invoice> = update(invoiceId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [update] */
        @MustBeClosed
        fun update(params: InvoiceUpdateParams): HttpResponseFor<Invoice> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(invoiceId: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            update(invoiceId, InvoiceUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices`, but is otherwise the same as
         * [InvoiceService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<InvoiceListPage> = list(InvoiceListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none()
        ): HttpResponseFor<InvoiceListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InvoiceListPage> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices/{invoice_id}`, but is otherwise the same
         * as [InvoiceService.fetch].
         */
        @MustBeClosed
        fun fetch(invoiceId: String): HttpResponseFor<Invoice> =
            fetch(invoiceId, InvoiceFetchParams.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            invoiceId: String,
            params: InvoiceFetchParams = InvoiceFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            fetch(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            invoiceId: String,
            params: InvoiceFetchParams = InvoiceFetchParams.none(),
        ): HttpResponseFor<Invoice> = fetch(invoiceId, params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: InvoiceFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(params: InvoiceFetchParams): HttpResponseFor<Invoice> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(invoiceId: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            fetch(invoiceId, InvoiceFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices/upcoming`, but is otherwise the same as
         * [InvoiceService.fetchUpcoming].
         */
        @MustBeClosed
        fun fetchUpcoming(
            params: InvoiceFetchUpcomingParams
        ): HttpResponseFor<InvoiceFetchUpcomingResponse> =
            fetchUpcoming(params, RequestOptions.none())

        /** @see [fetchUpcoming] */
        @MustBeClosed
        fun fetchUpcoming(
            params: InvoiceFetchUpcomingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceFetchUpcomingResponse>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/issue`, but is otherwise the
         * same as [InvoiceService.issue].
         */
        @MustBeClosed
        fun issue(invoiceId: String): HttpResponseFor<Invoice> =
            issue(invoiceId, InvoiceIssueParams.none())

        /** @see [issue] */
        @MustBeClosed
        fun issue(
            invoiceId: String,
            params: InvoiceIssueParams = InvoiceIssueParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            issue(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see [issue] */
        @MustBeClosed
        fun issue(
            invoiceId: String,
            params: InvoiceIssueParams = InvoiceIssueParams.none(),
        ): HttpResponseFor<Invoice> = issue(invoiceId, params, RequestOptions.none())

        /** @see [issue] */
        @MustBeClosed
        fun issue(
            params: InvoiceIssueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [issue] */
        @MustBeClosed
        fun issue(params: InvoiceIssueParams): HttpResponseFor<Invoice> =
            issue(params, RequestOptions.none())

        /** @see [issue] */
        @MustBeClosed
        fun issue(invoiceId: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            issue(invoiceId, InvoiceIssueParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/mark_paid`, but is otherwise
         * the same as [InvoiceService.markPaid].
         */
        @MustBeClosed
        fun markPaid(invoiceId: String, params: InvoiceMarkPaidParams): HttpResponseFor<Invoice> =
            markPaid(invoiceId, params, RequestOptions.none())

        /** @see [markPaid] */
        @MustBeClosed
        fun markPaid(
            invoiceId: String,
            params: InvoiceMarkPaidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            markPaid(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see [markPaid] */
        @MustBeClosed
        fun markPaid(params: InvoiceMarkPaidParams): HttpResponseFor<Invoice> =
            markPaid(params, RequestOptions.none())

        /** @see [markPaid] */
        @MustBeClosed
        fun markPaid(
            params: InvoiceMarkPaidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/pay`, but is otherwise the
         * same as [InvoiceService.pay].
         */
        @MustBeClosed
        fun pay(invoiceId: String): HttpResponseFor<Invoice> =
            pay(invoiceId, InvoicePayParams.none())

        /** @see [pay] */
        @MustBeClosed
        fun pay(
            invoiceId: String,
            params: InvoicePayParams = InvoicePayParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            pay(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see [pay] */
        @MustBeClosed
        fun pay(
            invoiceId: String,
            params: InvoicePayParams = InvoicePayParams.none(),
        ): HttpResponseFor<Invoice> = pay(invoiceId, params, RequestOptions.none())

        /** @see [pay] */
        @MustBeClosed
        fun pay(
            params: InvoicePayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [pay] */
        @MustBeClosed
        fun pay(params: InvoicePayParams): HttpResponseFor<Invoice> =
            pay(params, RequestOptions.none())

        /** @see [pay] */
        @MustBeClosed
        fun pay(invoiceId: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            pay(invoiceId, InvoicePayParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/void`, but is otherwise the
         * same as [InvoiceService.voidInvoice].
         */
        @MustBeClosed
        fun voidInvoice(invoiceId: String): HttpResponseFor<Invoice> =
            voidInvoice(invoiceId, InvoiceVoidInvoiceParams.none())

        /** @see [voidInvoice] */
        @MustBeClosed
        fun voidInvoice(
            invoiceId: String,
            params: InvoiceVoidInvoiceParams = InvoiceVoidInvoiceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> =
            voidInvoice(params.toBuilder().invoiceId(invoiceId).build(), requestOptions)

        /** @see [voidInvoice] */
        @MustBeClosed
        fun voidInvoice(
            invoiceId: String,
            params: InvoiceVoidInvoiceParams = InvoiceVoidInvoiceParams.none(),
        ): HttpResponseFor<Invoice> = voidInvoice(invoiceId, params, RequestOptions.none())

        /** @see [voidInvoice] */
        @MustBeClosed
        fun voidInvoice(
            params: InvoiceVoidInvoiceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [voidInvoice] */
        @MustBeClosed
        fun voidInvoice(params: InvoiceVoidInvoiceParams): HttpResponseFor<Invoice> =
            voidInvoice(params, RequestOptions.none())

        /** @see [voidInvoice] */
        @MustBeClosed
        fun voidInvoice(
            invoiceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invoice> =
            voidInvoice(invoiceId, InvoiceVoidInvoiceParams.none(), requestOptions)
    }
}
