// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers.credits

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CustomerCreditTopUpCreateByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpCreateByExternalIdResponse
import com.withorb.api.models.CustomerCreditTopUpCreateParams
import com.withorb.api.models.CustomerCreditTopUpCreateResponse
import com.withorb.api.models.CustomerCreditTopUpDeleteByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpDeleteParams
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdPageAsync
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpListPageAsync
import com.withorb.api.models.CustomerCreditTopUpListParams
import java.util.concurrent.CompletableFuture

interface TopUpServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint allows you to create a new top-up for a specified customer's balance. While
     * this top-up is active, the customer's balance will added in increments of the specified
     * amount whenever the balance reaches the specified threshold.
     *
     * If a top-up already exists for this customer in the same currency, the existing top-up will
     * be replaced.
     */
    fun create(
        params: CustomerCreditTopUpCreateParams
    ): CompletableFuture<CustomerCreditTopUpCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CustomerCreditTopUpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditTopUpCreateResponse>

    /** List top-ups */
    fun list(
        params: CustomerCreditTopUpListParams
    ): CompletableFuture<CustomerCreditTopUpListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CustomerCreditTopUpListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditTopUpListPageAsync>

    /**
     * This deactivates the top-up and voids any invoices associated with pending credit blocks
     * purchased through the top-up.
     */
    fun delete(params: CustomerCreditTopUpDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CustomerCreditTopUpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * This endpoint allows you to create a new top-up for a specified customer's balance. While
     * this top-up is active, the customer's balance will added in increments of the specified
     * amount whenever the balance reaches the specified threshold.
     *
     * If a top-up already exists for this customer in the same currency, the existing top-up will
     * be replaced.
     */
    fun createByExternalId(
        params: CustomerCreditTopUpCreateByExternalIdParams
    ): CompletableFuture<CustomerCreditTopUpCreateByExternalIdResponse> =
        createByExternalId(params, RequestOptions.none())

    /** @see [createByExternalId] */
    fun createByExternalId(
        params: CustomerCreditTopUpCreateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditTopUpCreateByExternalIdResponse>

    /**
     * This deactivates the top-up and voids any invoices associated with pending credit blocks
     * purchased through the top-up.
     */
    fun deleteByExternalId(
        params: CustomerCreditTopUpDeleteByExternalIdParams
    ): CompletableFuture<Void?> = deleteByExternalId(params, RequestOptions.none())

    /** @see [deleteByExternalId] */
    fun deleteByExternalId(
        params: CustomerCreditTopUpDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List top-ups by external ID */
    fun listByExternalId(
        params: CustomerCreditTopUpListByExternalIdParams
    ): CompletableFuture<CustomerCreditTopUpListByExternalIdPageAsync> =
        listByExternalId(params, RequestOptions.none())

    /** @see [listByExternalId] */
    fun listByExternalId(
        params: CustomerCreditTopUpListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditTopUpListByExternalIdPageAsync>

    /** A view of [TopUpServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/credits/top_ups`, but is
         * otherwise the same as [TopUpServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CustomerCreditTopUpCreateParams
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CustomerCreditTopUpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credits/top_ups`, but is
         * otherwise the same as [TopUpServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: CustomerCreditTopUpListParams
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CustomerCreditTopUpListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /customers/{customer_id}/credits/top_ups/{top_up_id}`, but is otherwise the same as
         * [TopUpServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: CustomerCreditTopUpDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CustomerCreditTopUpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups`, but is otherwise
         * the same as [TopUpServiceAsync.createByExternalId].
         */
        @MustBeClosed
        fun createByExternalId(
            params: CustomerCreditTopUpCreateByExternalIdParams
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpCreateByExternalIdResponse>> =
            createByExternalId(params, RequestOptions.none())

        /** @see [createByExternalId] */
        @MustBeClosed
        fun createByExternalId(
            params: CustomerCreditTopUpCreateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpCreateByExternalIdResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups/{top_up_id}`, but
         * is otherwise the same as [TopUpServiceAsync.deleteByExternalId].
         */
        @MustBeClosed
        fun deleteByExternalId(
            params: CustomerCreditTopUpDeleteByExternalIdParams
        ): CompletableFuture<HttpResponse> = deleteByExternalId(params, RequestOptions.none())

        /** @see [deleteByExternalId] */
        @MustBeClosed
        fun deleteByExternalId(
            params: CustomerCreditTopUpDeleteByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups`, but is otherwise
         * the same as [TopUpServiceAsync.listByExternalId].
         */
        @MustBeClosed
        fun listByExternalId(
            params: CustomerCreditTopUpListByExternalIdParams
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListByExternalIdPageAsync>> =
            listByExternalId(params, RequestOptions.none())

        /** @see [listByExternalId] */
        @MustBeClosed
        fun listByExternalId(
            params: CustomerCreditTopUpListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListByExternalIdPageAsync>>
    }
}
