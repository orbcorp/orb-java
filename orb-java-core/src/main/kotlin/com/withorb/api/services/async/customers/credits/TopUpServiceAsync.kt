// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async.customers.credits

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CustomerCreditTopUpCreateByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpCreateParams
import com.withorb.api.models.CustomerCreditTopUpDeleteByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpDeleteParams
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdPageAsync
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpListPageAsync
import com.withorb.api.models.CustomerCreditTopUpListParams
import com.withorb.api.models.TopUpModel
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
    @JvmOverloads
    fun create(
        params: CustomerCreditTopUpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TopUpModel>

    /** List top-ups */
    @JvmOverloads
    fun list(
        params: CustomerCreditTopUpListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditTopUpListPageAsync>

    /**
     * This deactivates the top-up and voids any invoices associated with pending credit blocks
     * purchased through the top-up.
     */
    @JvmOverloads
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
    @JvmOverloads
    fun createByExternalId(
        params: CustomerCreditTopUpCreateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TopUpModel>

    /**
     * This deactivates the top-up and voids any invoices associated with pending credit blocks
     * purchased through the top-up.
     */
    @JvmOverloads
    fun deleteByExternalId(
        params: CustomerCreditTopUpDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List top-ups by external ID */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: CustomerCreditTopUpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TopUpModel>>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credits/top_ups`, but is
         * otherwise the same as [TopUpServiceAsync.list].
         */
        @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun createByExternalId(
            params: CustomerCreditTopUpCreateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TopUpModel>>

        /**
         * Returns a raw HTTP response for `delete
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups/{top_up_id}`, but
         * is otherwise the same as [TopUpServiceAsync.deleteByExternalId].
         */
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun listByExternalId(
            params: CustomerCreditTopUpListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListByExternalIdPageAsync>>
    }
}
