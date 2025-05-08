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
    fun list(customerId: String): CompletableFuture<CustomerCreditListPageAsync> =
        list(customerId, CustomerCreditListParams.none())

    /** @see [list] */
    fun list(
        customerId: String,
        params: CustomerCreditListParams = CustomerCreditListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditListPageAsync> =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [list] */
    fun list(
        customerId: String,
        params: CustomerCreditListParams = CustomerCreditListParams.none(),
    ): CompletableFuture<CustomerCreditListPageAsync> =
        list(customerId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditListPageAsync>

    /** @see [list] */
    fun list(params: CustomerCreditListParams): CompletableFuture<CustomerCreditListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        customerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCreditListPageAsync> =
        list(customerId, CustomerCreditListParams.none(), requestOptions)

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
        externalCustomerId: String
    ): CompletableFuture<CustomerCreditListByExternalIdPageAsync> =
        listByExternalId(externalCustomerId, CustomerCreditListByExternalIdParams.none())

    /** @see [listByExternalId] */
    fun listByExternalId(
        externalCustomerId: String,
        params: CustomerCreditListByExternalIdParams = CustomerCreditListByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditListByExternalIdPageAsync> =
        listByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [listByExternalId] */
    fun listByExternalId(
        externalCustomerId: String,
        params: CustomerCreditListByExternalIdParams = CustomerCreditListByExternalIdParams.none(),
    ): CompletableFuture<CustomerCreditListByExternalIdPageAsync> =
        listByExternalId(externalCustomerId, params, RequestOptions.none())

    /** @see [listByExternalId] */
    fun listByExternalId(
        params: CustomerCreditListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditListByExternalIdPageAsync>

    /** @see [listByExternalId] */
    fun listByExternalId(
        params: CustomerCreditListByExternalIdParams
    ): CompletableFuture<CustomerCreditListByExternalIdPageAsync> =
        listByExternalId(params, RequestOptions.none())

    /** @see [listByExternalId] */
    fun listByExternalId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCreditListByExternalIdPageAsync> =
        listByExternalId(
            externalCustomerId,
            CustomerCreditListByExternalIdParams.none(),
            requestOptions,
        )

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
            customerId: String
        ): CompletableFuture<HttpResponseFor<CustomerCreditListPageAsync>> =
            list(customerId, CustomerCreditListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            customerId: String,
            params: CustomerCreditListParams = CustomerCreditListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditListPageAsync>> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            customerId: String,
            params: CustomerCreditListParams = CustomerCreditListParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditListPageAsync>> =
            list(customerId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CustomerCreditListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CustomerCreditListParams
        ): CompletableFuture<HttpResponseFor<CustomerCreditListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCreditListPageAsync>> =
            list(customerId, CustomerCreditListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}/credits`, but is otherwise the
         * same as [CreditServiceAsync.listByExternalId].
         */
        @MustBeClosed
        fun listByExternalId(
            externalCustomerId: String
        ): CompletableFuture<HttpResponseFor<CustomerCreditListByExternalIdPageAsync>> =
            listByExternalId(externalCustomerId, CustomerCreditListByExternalIdParams.none())

        /** @see [listByExternalId] */
        @MustBeClosed
        fun listByExternalId(
            externalCustomerId: String,
            params: CustomerCreditListByExternalIdParams =
                CustomerCreditListByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditListByExternalIdPageAsync>> =
            listByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see [listByExternalId] */
        @MustBeClosed
        fun listByExternalId(
            externalCustomerId: String,
            params: CustomerCreditListByExternalIdParams =
                CustomerCreditListByExternalIdParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditListByExternalIdPageAsync>> =
            listByExternalId(externalCustomerId, params, RequestOptions.none())

        /** @see [listByExternalId] */
        @MustBeClosed
        fun listByExternalId(
            params: CustomerCreditListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditListByExternalIdPageAsync>>

        /** @see [listByExternalId] */
        @MustBeClosed
        fun listByExternalId(
            params: CustomerCreditListByExternalIdParams
        ): CompletableFuture<HttpResponseFor<CustomerCreditListByExternalIdPageAsync>> =
            listByExternalId(params, RequestOptions.none())

        /** @see [listByExternalId] */
        @MustBeClosed
        fun listByExternalId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCreditListByExternalIdPageAsync>> =
            listByExternalId(
                externalCustomerId,
                CustomerCreditListByExternalIdParams.none(),
                requestOptions,
            )
    }
}
