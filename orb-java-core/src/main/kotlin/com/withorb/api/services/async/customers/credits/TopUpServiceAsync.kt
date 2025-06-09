// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers.credits

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
        customerId: String,
        params: CustomerCreditTopUpCreateParams,
    ): CompletableFuture<CustomerCreditTopUpCreateResponse> =
        create(customerId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        customerId: String,
        params: CustomerCreditTopUpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditTopUpCreateResponse> =
        create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [create] */
    fun create(
        params: CustomerCreditTopUpCreateParams
    ): CompletableFuture<CustomerCreditTopUpCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CustomerCreditTopUpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditTopUpCreateResponse>

    /** List top-ups */
    fun list(customerId: String): CompletableFuture<CustomerCreditTopUpListPageAsync> =
        list(customerId, CustomerCreditTopUpListParams.none())

    /** @see [list] */
    fun list(
        customerId: String,
        params: CustomerCreditTopUpListParams = CustomerCreditTopUpListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditTopUpListPageAsync> =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [list] */
    fun list(
        customerId: String,
        params: CustomerCreditTopUpListParams = CustomerCreditTopUpListParams.none(),
    ): CompletableFuture<CustomerCreditTopUpListPageAsync> =
        list(customerId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CustomerCreditTopUpListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditTopUpListPageAsync>

    /** @see [list] */
    fun list(
        params: CustomerCreditTopUpListParams
    ): CompletableFuture<CustomerCreditTopUpListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        customerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCreditTopUpListPageAsync> =
        list(customerId, CustomerCreditTopUpListParams.none(), requestOptions)

    /**
     * This deactivates the top-up and voids any invoices associated with pending credit blocks
     * purchased through the top-up.
     */
    fun delete(topUpId: String, params: CustomerCreditTopUpDeleteParams): CompletableFuture<Void?> =
        delete(topUpId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        topUpId: String,
        params: CustomerCreditTopUpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().topUpId(topUpId).build(), requestOptions)

    /** @see [delete] */
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
        externalCustomerId: String,
        params: CustomerCreditTopUpCreateByExternalIdParams,
    ): CompletableFuture<CustomerCreditTopUpCreateByExternalIdResponse> =
        createByExternalId(externalCustomerId, params, RequestOptions.none())

    /** @see [createByExternalId] */
    fun createByExternalId(
        externalCustomerId: String,
        params: CustomerCreditTopUpCreateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditTopUpCreateByExternalIdResponse> =
        createByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [createByExternalId] */
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
        topUpId: String,
        params: CustomerCreditTopUpDeleteByExternalIdParams,
    ): CompletableFuture<Void?> = deleteByExternalId(topUpId, params, RequestOptions.none())

    /** @see [deleteByExternalId] */
    fun deleteByExternalId(
        topUpId: String,
        params: CustomerCreditTopUpDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteByExternalId(params.toBuilder().topUpId(topUpId).build(), requestOptions)

    /** @see [deleteByExternalId] */
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
        externalCustomerId: String
    ): CompletableFuture<CustomerCreditTopUpListByExternalIdPageAsync> =
        listByExternalId(externalCustomerId, CustomerCreditTopUpListByExternalIdParams.none())

    /** @see [listByExternalId] */
    fun listByExternalId(
        externalCustomerId: String,
        params: CustomerCreditTopUpListByExternalIdParams =
            CustomerCreditTopUpListByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditTopUpListByExternalIdPageAsync> =
        listByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [listByExternalId] */
    fun listByExternalId(
        externalCustomerId: String,
        params: CustomerCreditTopUpListByExternalIdParams =
            CustomerCreditTopUpListByExternalIdParams.none(),
    ): CompletableFuture<CustomerCreditTopUpListByExternalIdPageAsync> =
        listByExternalId(externalCustomerId, params, RequestOptions.none())

    /** @see [listByExternalId] */
    fun listByExternalId(
        params: CustomerCreditTopUpListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerCreditTopUpListByExternalIdPageAsync>

    /** @see [listByExternalId] */
    fun listByExternalId(
        params: CustomerCreditTopUpListByExternalIdParams
    ): CompletableFuture<CustomerCreditTopUpListByExternalIdPageAsync> =
        listByExternalId(params, RequestOptions.none())

    /** @see [listByExternalId] */
    fun listByExternalId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCreditTopUpListByExternalIdPageAsync> =
        listByExternalId(
            externalCustomerId,
            CustomerCreditTopUpListByExternalIdParams.none(),
            requestOptions,
        )

    /** A view of [TopUpServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/credits/top_ups`, but is
         * otherwise the same as [TopUpServiceAsync.create].
         */
        fun create(
            customerId: String,
            params: CustomerCreditTopUpCreateParams,
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpCreateResponse>> =
            create(customerId, params, RequestOptions.none())

        /** @see [create] */
        fun create(
            customerId: String,
            params: CustomerCreditTopUpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpCreateResponse>> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [create] */
        fun create(
            params: CustomerCreditTopUpCreateParams
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: CustomerCreditTopUpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credits/top_ups`, but is
         * otherwise the same as [TopUpServiceAsync.list].
         */
        fun list(
            customerId: String
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListPageAsync>> =
            list(customerId, CustomerCreditTopUpListParams.none())

        /** @see [list] */
        fun list(
            customerId: String,
            params: CustomerCreditTopUpListParams = CustomerCreditTopUpListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListPageAsync>> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [list] */
        fun list(
            customerId: String,
            params: CustomerCreditTopUpListParams = CustomerCreditTopUpListParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListPageAsync>> =
            list(customerId, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: CustomerCreditTopUpListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListPageAsync>>

        /** @see [list] */
        fun list(
            params: CustomerCreditTopUpListParams
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListPageAsync>> =
            list(customerId, CustomerCreditTopUpListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /customers/{customer_id}/credits/top_ups/{top_up_id}`, but is otherwise the same as
         * [TopUpServiceAsync.delete].
         */
        fun delete(
            topUpId: String,
            params: CustomerCreditTopUpDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(topUpId, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            topUpId: String,
            params: CustomerCreditTopUpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().topUpId(topUpId).build(), requestOptions)

        /** @see [delete] */
        fun delete(params: CustomerCreditTopUpDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: CustomerCreditTopUpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups`, but is otherwise
         * the same as [TopUpServiceAsync.createByExternalId].
         */
        fun createByExternalId(
            externalCustomerId: String,
            params: CustomerCreditTopUpCreateByExternalIdParams,
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpCreateByExternalIdResponse>> =
            createByExternalId(externalCustomerId, params, RequestOptions.none())

        /** @see [createByExternalId] */
        fun createByExternalId(
            externalCustomerId: String,
            params: CustomerCreditTopUpCreateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpCreateByExternalIdResponse>> =
            createByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see [createByExternalId] */
        fun createByExternalId(
            params: CustomerCreditTopUpCreateByExternalIdParams
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpCreateByExternalIdResponse>> =
            createByExternalId(params, RequestOptions.none())

        /** @see [createByExternalId] */
        fun createByExternalId(
            params: CustomerCreditTopUpCreateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpCreateByExternalIdResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups/{top_up_id}`, but
         * is otherwise the same as [TopUpServiceAsync.deleteByExternalId].
         */
        fun deleteByExternalId(
            topUpId: String,
            params: CustomerCreditTopUpDeleteByExternalIdParams,
        ): CompletableFuture<HttpResponse> =
            deleteByExternalId(topUpId, params, RequestOptions.none())

        /** @see [deleteByExternalId] */
        fun deleteByExternalId(
            topUpId: String,
            params: CustomerCreditTopUpDeleteByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteByExternalId(params.toBuilder().topUpId(topUpId).build(), requestOptions)

        /** @see [deleteByExternalId] */
        fun deleteByExternalId(
            params: CustomerCreditTopUpDeleteByExternalIdParams
        ): CompletableFuture<HttpResponse> = deleteByExternalId(params, RequestOptions.none())

        /** @see [deleteByExternalId] */
        fun deleteByExternalId(
            params: CustomerCreditTopUpDeleteByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}/credits/top_ups`, but is otherwise
         * the same as [TopUpServiceAsync.listByExternalId].
         */
        fun listByExternalId(
            externalCustomerId: String
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListByExternalIdPageAsync>> =
            listByExternalId(externalCustomerId, CustomerCreditTopUpListByExternalIdParams.none())

        /** @see [listByExternalId] */
        fun listByExternalId(
            externalCustomerId: String,
            params: CustomerCreditTopUpListByExternalIdParams =
                CustomerCreditTopUpListByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListByExternalIdPageAsync>> =
            listByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see [listByExternalId] */
        fun listByExternalId(
            externalCustomerId: String,
            params: CustomerCreditTopUpListByExternalIdParams =
                CustomerCreditTopUpListByExternalIdParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListByExternalIdPageAsync>> =
            listByExternalId(externalCustomerId, params, RequestOptions.none())

        /** @see [listByExternalId] */
        fun listByExternalId(
            params: CustomerCreditTopUpListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListByExternalIdPageAsync>>

        /** @see [listByExternalId] */
        fun listByExternalId(
            params: CustomerCreditTopUpListByExternalIdParams
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListByExternalIdPageAsync>> =
            listByExternalId(params, RequestOptions.none())

        /** @see [listByExternalId] */
        fun listByExternalId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCreditTopUpListByExternalIdPageAsync>> =
            listByExternalId(
                externalCustomerId,
                CustomerCreditTopUpListByExternalIdParams.none(),
                requestOptions,
            )
    }
}
