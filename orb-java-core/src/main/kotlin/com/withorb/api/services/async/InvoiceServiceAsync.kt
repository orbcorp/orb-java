// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
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
    @JvmOverloads
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
    @JvmOverloads
    fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvoiceListPageAsync>

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
    fun list(requestOptions: RequestOptions): CompletableFuture<InvoiceListPageAsync> =
        list(InvoiceListParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch an [`Invoice`](/core-concepts#invoice) given an identifier.
     */
    @JvmOverloads
    fun fetch(
        params: InvoiceFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * This endpoint can be used to fetch the upcoming [invoice](/core-concepts#invoice) for the
     * current billing period given a subscription.
     */
    @JvmOverloads
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
    @JvmOverloads
    fun issue(
        params: InvoiceIssueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * This endpoint allows an invoice's status to be set the `paid` status. This can only be done
     * to invoices that are in the `issued` status.
     */
    @JvmOverloads
    fun markPaid(
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invoice>

    /**
     * This endpoint collects payment for an invoice using the customer's default payment method.
     * This action can only be taken on invoices with status "issued".
     */
    @JvmOverloads
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
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `put /invoices/{invoice_id}`, but is otherwise the same
         * as [InvoiceServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `get /invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /invoices/{invoice_id}`, but is otherwise the same
         * as [InvoiceServiceAsync.fetch].
         */
        @JvmOverloads
        @MustBeClosed
        fun fetch(
            params: InvoiceFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `get /invoices/upcoming`, but is otherwise the same as
         * [InvoiceServiceAsync.fetchUpcoming].
         */
        @JvmOverloads
        @MustBeClosed
        fun fetchUpcoming(
            params: InvoiceFetchUpcomingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvoiceFetchUpcomingResponse>>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/issue`, but is otherwise the
         * same as [InvoiceServiceAsync.issue].
         */
        @JvmOverloads
        @MustBeClosed
        fun issue(
            params: InvoiceIssueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/mark_paid`, but is otherwise
         * the same as [InvoiceServiceAsync.markPaid].
         */
        @JvmOverloads
        @MustBeClosed
        fun markPaid(
            params: InvoiceMarkPaidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/pay`, but is otherwise the
         * same as [InvoiceServiceAsync.pay].
         */
        @JvmOverloads
        @MustBeClosed
        fun pay(
            params: InvoicePayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>

        /**
         * Returns a raw HTTP response for `post /invoices/{invoice_id}/void`, but is otherwise the
         * same as [InvoiceServiceAsync.voidInvoice].
         */
        @JvmOverloads
        @MustBeClosed
        fun voidInvoice(
            params: InvoiceVoidInvoiceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Invoice>>
    }
}
