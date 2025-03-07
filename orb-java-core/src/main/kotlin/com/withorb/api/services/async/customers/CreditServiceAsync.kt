// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CustomerCreditListByExternalIdPageAsync
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListPageAsync
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.services.async.customers.credits.LedgerServiceAsync
import com.withorb.api.services.async.customers.credits.TopUpServiceAsync
import java.util.concurrent.CompletableFuture

interface CreditServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun ledger(): LedgerServiceAsync

    fun topUps(): TopUpServiceAsync

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
     * blocks) will be included in the response.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    fun list(params: CustomerCreditListParams): CompletableFuture<CustomerCreditListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditListPageAsync>

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
     * blocks) will be included in the response.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    fun listByExternalId(
        params: CustomerCreditListByExternalIdParams
    ): CompletableFuture<CustomerCreditListByExternalIdPageAsync> =
        listByExternalId(params, RequestOptions.none())

    /** @see [listByExternalId] */
    fun listByExternalId(
        params: CustomerCreditListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditListByExternalIdPageAsync>

    /**
     * A view of [CreditServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun ledger(): LedgerServiceAsync.WithRawResponse

        fun topUps(): TopUpServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credits`, but is otherwise
         * the same as [CreditServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: CustomerCreditListParams
        ): CompletableFuture<HttpResponseFor<CustomerCreditListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CustomerCreditListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditListPageAsync>>

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}/credits`, but is otherwise the
         * same as [CreditServiceAsync.listByExternalId].
         */
        @MustBeClosed
        fun listByExternalId(
            params: CustomerCreditListByExternalIdParams
        ): CompletableFuture<HttpResponseFor<CustomerCreditListByExternalIdPageAsync>> =
            listByExternalId(params, RequestOptions.none())

        /** @see [listByExternalId] */
        @MustBeClosed
        fun listByExternalId(
            params: CustomerCreditListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditListByExternalIdPageAsync>>
    }
}
