// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CreditBlockDeleteParams
import com.withorb.api.models.CreditBlockListInvoicesParams
import com.withorb.api.models.CreditBlockListInvoicesResponse
import com.withorb.api.models.CreditBlockRetrieveParams
import com.withorb.api.models.CreditBlockRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * The [Credit Ledger Entry resource](/product-catalog/prepurchase) models prepaid credits within
 * Orb.
 */
interface CreditBlockServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditBlockServiceAsync

    /** This endpoint returns a credit block identified by its block_id. */
    fun retrieve(blockId: String): CompletableFuture<CreditBlockRetrieveResponse> =
        retrieve(blockId, CreditBlockRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        blockId: String,
        params: CreditBlockRetrieveParams = CreditBlockRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditBlockRetrieveResponse> =
        retrieve(params.toBuilder().blockId(blockId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        blockId: String,
        params: CreditBlockRetrieveParams = CreditBlockRetrieveParams.none(),
    ): CompletableFuture<CreditBlockRetrieveResponse> =
        retrieve(blockId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CreditBlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditBlockRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: CreditBlockRetrieveParams
    ): CompletableFuture<CreditBlockRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        blockId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditBlockRetrieveResponse> =
        retrieve(blockId, CreditBlockRetrieveParams.none(), requestOptions)

    /**
     * This endpoint deletes a credit block by its ID.
     *
     * When a credit block is deleted:
     * - The block is removed from the customer's credit ledger.
     * - Any usage of the credit block is reversed, and the ledger is replayed as if the block never
     *   existed.
     * - If invoices were generated from the purchase of the credit block, they will be deleted if
     *   in draft status, voided if issued, or a credit note will be issued if the invoice is paid.
     *
     * <Note> Issued invoices that had credits applied from this block will not be regenerated, but
     * the ledger will reflect the state as if credits from the deleted block were never applied.
     * </Note>
     */
    fun delete(blockId: String): CompletableFuture<Void?> =
        delete(blockId, CreditBlockDeleteParams.none())

    /** @see delete */
    fun delete(
        blockId: String,
        params: CreditBlockDeleteParams = CreditBlockDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().blockId(blockId).build(), requestOptions)

    /** @see delete */
    fun delete(
        blockId: String,
        params: CreditBlockDeleteParams = CreditBlockDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(blockId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CreditBlockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CreditBlockDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(blockId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(blockId, CreditBlockDeleteParams.none(), requestOptions)

    /**
     * This endpoint returns the credit block and its associated purchasing invoices.
     *
     * If a credit block was purchased (as opposed to being manually added), this endpoint returns
     * the invoices that were created to charge the customer for the credit block. For credit blocks
     * with payment schedules spanning multiple periods (e.g., monthly payments over 12 months),
     * multiple invoices will be returned.
     *
     * For credit blocks created by subscription allocation prices, this endpoint returns the
     * subscription invoice containing the allocation line item that created the block.
     *
     * If the credit block was not purchased (e.g., manual increment), an empty invoices list is
     * returned.
     *
     * **Note: This endpoint is currently experimental and its interface may change in future
     * releases. Please contact support before building production integrations against this
     * endpoint.**
     */
    fun listInvoices(blockId: String): CompletableFuture<CreditBlockListInvoicesResponse> =
        listInvoices(blockId, CreditBlockListInvoicesParams.none())

    /** @see listInvoices */
    fun listInvoices(
        blockId: String,
        params: CreditBlockListInvoicesParams = CreditBlockListInvoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditBlockListInvoicesResponse> =
        listInvoices(params.toBuilder().blockId(blockId).build(), requestOptions)

    /** @see listInvoices */
    fun listInvoices(
        blockId: String,
        params: CreditBlockListInvoicesParams = CreditBlockListInvoicesParams.none(),
    ): CompletableFuture<CreditBlockListInvoicesResponse> =
        listInvoices(blockId, params, RequestOptions.none())

    /** @see listInvoices */
    fun listInvoices(
        params: CreditBlockListInvoicesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditBlockListInvoicesResponse>

    /** @see listInvoices */
    fun listInvoices(
        params: CreditBlockListInvoicesParams
    ): CompletableFuture<CreditBlockListInvoicesResponse> =
        listInvoices(params, RequestOptions.none())

    /** @see listInvoices */
    fun listInvoices(
        blockId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditBlockListInvoicesResponse> =
        listInvoices(blockId, CreditBlockListInvoicesParams.none(), requestOptions)

    /**
     * A view of [CreditBlockServiceAsync] that provides access to raw HTTP responses for each
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
        ): CreditBlockServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /credit_blocks/{block_id}`, but is otherwise the
         * same as [CreditBlockServiceAsync.retrieve].
         */
        fun retrieve(
            blockId: String
        ): CompletableFuture<HttpResponseFor<CreditBlockRetrieveResponse>> =
            retrieve(blockId, CreditBlockRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            blockId: String,
            params: CreditBlockRetrieveParams = CreditBlockRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditBlockRetrieveResponse>> =
            retrieve(params.toBuilder().blockId(blockId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            blockId: String,
            params: CreditBlockRetrieveParams = CreditBlockRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CreditBlockRetrieveResponse>> =
            retrieve(blockId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CreditBlockRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditBlockRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CreditBlockRetrieveParams
        ): CompletableFuture<HttpResponseFor<CreditBlockRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            blockId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditBlockRetrieveResponse>> =
            retrieve(blockId, CreditBlockRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /credit_blocks/{block_id}`, but is otherwise the
         * same as [CreditBlockServiceAsync.delete].
         */
        fun delete(blockId: String): CompletableFuture<HttpResponse> =
            delete(blockId, CreditBlockDeleteParams.none())

        /** @see delete */
        fun delete(
            blockId: String,
            params: CreditBlockDeleteParams = CreditBlockDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().blockId(blockId).build(), requestOptions)

        /** @see delete */
        fun delete(
            blockId: String,
            params: CreditBlockDeleteParams = CreditBlockDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(blockId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CreditBlockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CreditBlockDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            blockId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(blockId, CreditBlockDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /credit_blocks/{block_id}/invoices`, but is
         * otherwise the same as [CreditBlockServiceAsync.listInvoices].
         */
        fun listInvoices(
            blockId: String
        ): CompletableFuture<HttpResponseFor<CreditBlockListInvoicesResponse>> =
            listInvoices(blockId, CreditBlockListInvoicesParams.none())

        /** @see listInvoices */
        fun listInvoices(
            blockId: String,
            params: CreditBlockListInvoicesParams = CreditBlockListInvoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditBlockListInvoicesResponse>> =
            listInvoices(params.toBuilder().blockId(blockId).build(), requestOptions)

        /** @see listInvoices */
        fun listInvoices(
            blockId: String,
            params: CreditBlockListInvoicesParams = CreditBlockListInvoicesParams.none(),
        ): CompletableFuture<HttpResponseFor<CreditBlockListInvoicesResponse>> =
            listInvoices(blockId, params, RequestOptions.none())

        /** @see listInvoices */
        fun listInvoices(
            params: CreditBlockListInvoicesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditBlockListInvoicesResponse>>

        /** @see listInvoices */
        fun listInvoices(
            params: CreditBlockListInvoicesParams
        ): CompletableFuture<HttpResponseFor<CreditBlockListInvoicesResponse>> =
            listInvoices(params, RequestOptions.none())

        /** @see listInvoices */
        fun listInvoices(
            blockId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditBlockListInvoicesResponse>> =
            listInvoices(blockId, CreditBlockListInvoicesParams.none(), requestOptions)
    }
}
