// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CustomerPaymentGatewayConnection
import com.withorb.api.models.CustomerPaymentGatewayConnectionCreateByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionCreateParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionDeleteByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionDeleteParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListByExternalIdResponse
import com.withorb.api.models.CustomerPaymentGatewayConnectionListParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListResponse
import com.withorb.api.models.CustomerPaymentGatewayConnectionUpdateByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * A customer is a buyer of your products, and the other party to the billing relationship.
 *
 * In Orb, customers are assigned system generated identifiers automatically, but it's often
 * desirable to have these match existing identifiers in your system. To avoid having to denormalize
 * Orb ID information, you can pass in an `external_customer_id` with your own identifier. See
 * [Customer ID Aliases](/events-and-metrics/customer-aliases) for further information about how
 * these aliases work in Orb.
 *
 * In addition to having an identifier in your system, a customer may exist in a payment provider
 * solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum field to
 * express this mapping.
 *
 * A customer also has a timezone (from the standard
 * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
 * timezone. See [Timezone localization](/essentials/timezones) for information on what this
 * timezone parameter influences within Orb.
 */
interface PaymentGatewayConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentGatewayConnectionServiceAsync

    /**
     * This endpoint maps the customer to a payment gateway connection. Orb charges the customer for
     * a billing entity's invoices through the customer's first mapping for that billing entity;
     * `is_default` moves that to this mapping when the customer already has one.
     */
    fun create(
        customerId: String,
        params: CustomerPaymentGatewayConnectionCreateParams,
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        create(customerId, params, RequestOptions.none())

    /** @see create */
    fun create(
        customerId: String,
        params: CustomerPaymentGatewayConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see create */
    fun create(
        params: CustomerPaymentGatewayConnectionCreateParams
    ): CompletableFuture<CustomerPaymentGatewayConnection> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomerPaymentGatewayConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnection>

    /**
     * This endpoint updates the customer's mapping to a payment gateway connection: the customer's
     * ID in that account, and whether Orb charges the customer for the billing entity's invoices
     * through it. Omitted fields keep their value.
     */
    fun update(
        paymentGatewayConnectionId: String,
        params: CustomerPaymentGatewayConnectionUpdateParams,
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        update(paymentGatewayConnectionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        paymentGatewayConnectionId: String,
        params: CustomerPaymentGatewayConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        update(
            params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        params: CustomerPaymentGatewayConnectionUpdateParams
    ): CompletableFuture<CustomerPaymentGatewayConnection> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomerPaymentGatewayConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnection>

    /**
     * This endpoint returns the customer's mappings to payment gateway connections, for example the
     * customer's Stripe ID in each connected Stripe account. A customer has at most one mapping per
     * connection, so the list is not paginated.
     */
    fun list(customerId: String): CompletableFuture<CustomerPaymentGatewayConnectionListResponse> =
        list(customerId, CustomerPaymentGatewayConnectionListParams.none())

    /** @see list */
    fun list(
        customerId: String,
        params: CustomerPaymentGatewayConnectionListParams =
            CustomerPaymentGatewayConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnectionListResponse> =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see list */
    fun list(
        customerId: String,
        params: CustomerPaymentGatewayConnectionListParams =
            CustomerPaymentGatewayConnectionListParams.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnectionListResponse> =
        list(customerId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CustomerPaymentGatewayConnectionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnectionListResponse>

    /** @see list */
    fun list(
        params: CustomerPaymentGatewayConnectionListParams
    ): CompletableFuture<CustomerPaymentGatewayConnectionListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        customerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerPaymentGatewayConnectionListResponse> =
        list(customerId, CustomerPaymentGatewayConnectionListParams.none(), requestOptions)

    /**
     * This endpoint removes the customer's mapping to a payment gateway connection and returns it.
     * Active subscriptions and unpaid invoices do not block it. If the mapping was the customer's
     * default for the billing entity, the customer's oldest remaining mapping on that entity
     * becomes the default. With no mapping left, the next charge goes through the billing entity's
     * default connection.
     */
    fun delete(
        paymentGatewayConnectionId: String,
        params: CustomerPaymentGatewayConnectionDeleteParams,
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        delete(paymentGatewayConnectionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        paymentGatewayConnectionId: String,
        params: CustomerPaymentGatewayConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        delete(
            params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        params: CustomerPaymentGatewayConnectionDeleteParams
    ): CompletableFuture<CustomerPaymentGatewayConnection> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CustomerPaymentGatewayConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnection>

    /**
     * This endpoint maps the customer to a payment gateway connection. Orb charges the customer for
     * a billing entity's invoices through the customer's first mapping for that billing entity;
     * `is_default` moves that to this mapping when the customer already has one.
     */
    fun createByExternalId(
        externalCustomerId: String,
        params: CustomerPaymentGatewayConnectionCreateByExternalIdParams,
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        createByExternalId(externalCustomerId, params, RequestOptions.none())

    /** @see createByExternalId */
    fun createByExternalId(
        externalCustomerId: String,
        params: CustomerPaymentGatewayConnectionCreateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        createByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see createByExternalId */
    fun createByExternalId(
        params: CustomerPaymentGatewayConnectionCreateByExternalIdParams
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        createByExternalId(params, RequestOptions.none())

    /** @see createByExternalId */
    fun createByExternalId(
        params: CustomerPaymentGatewayConnectionCreateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnection>

    /**
     * This endpoint removes the customer's mapping to a payment gateway connection and returns it.
     * Active subscriptions and unpaid invoices do not block it. If the mapping was the customer's
     * default for the billing entity, the customer's oldest remaining mapping on that entity
     * becomes the default. With no mapping left, the next charge goes through the billing entity's
     * default connection.
     */
    fun deleteByExternalId(
        paymentGatewayConnectionId: String,
        params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams,
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        deleteByExternalId(paymentGatewayConnectionId, params, RequestOptions.none())

    /** @see deleteByExternalId */
    fun deleteByExternalId(
        paymentGatewayConnectionId: String,
        params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        deleteByExternalId(
            params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
            requestOptions,
        )

    /** @see deleteByExternalId */
    fun deleteByExternalId(
        params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        deleteByExternalId(params, RequestOptions.none())

    /** @see deleteByExternalId */
    fun deleteByExternalId(
        params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnection>

    /**
     * This endpoint returns the customer's mappings to payment gateway connections, for example the
     * customer's Stripe ID in each connected Stripe account. A customer has at most one mapping per
     * connection, so the list is not paginated.
     */
    fun listByExternalId(
        externalCustomerId: String
    ): CompletableFuture<CustomerPaymentGatewayConnectionListByExternalIdResponse> =
        listByExternalId(
            externalCustomerId,
            CustomerPaymentGatewayConnectionListByExternalIdParams.none(),
        )

    /** @see listByExternalId */
    fun listByExternalId(
        externalCustomerId: String,
        params: CustomerPaymentGatewayConnectionListByExternalIdParams =
            CustomerPaymentGatewayConnectionListByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnectionListByExternalIdResponse> =
        listByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see listByExternalId */
    fun listByExternalId(
        externalCustomerId: String,
        params: CustomerPaymentGatewayConnectionListByExternalIdParams =
            CustomerPaymentGatewayConnectionListByExternalIdParams.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnectionListByExternalIdResponse> =
        listByExternalId(externalCustomerId, params, RequestOptions.none())

    /** @see listByExternalId */
    fun listByExternalId(
        params: CustomerPaymentGatewayConnectionListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnectionListByExternalIdResponse>

    /** @see listByExternalId */
    fun listByExternalId(
        params: CustomerPaymentGatewayConnectionListByExternalIdParams
    ): CompletableFuture<CustomerPaymentGatewayConnectionListByExternalIdResponse> =
        listByExternalId(params, RequestOptions.none())

    /** @see listByExternalId */
    fun listByExternalId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerPaymentGatewayConnectionListByExternalIdResponse> =
        listByExternalId(
            externalCustomerId,
            CustomerPaymentGatewayConnectionListByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * This endpoint updates the customer's mapping to a payment gateway connection: the customer's
     * ID in that account, and whether Orb charges the customer for the billing entity's invoices
     * through it. Omitted fields keep their value.
     */
    fun updateByExternalId(
        paymentGatewayConnectionId: String,
        params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams,
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        updateByExternalId(paymentGatewayConnectionId, params, RequestOptions.none())

    /** @see updateByExternalId */
    fun updateByExternalId(
        paymentGatewayConnectionId: String,
        params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        updateByExternalId(
            params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
            requestOptions,
        )

    /** @see updateByExternalId */
    fun updateByExternalId(
        params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams
    ): CompletableFuture<CustomerPaymentGatewayConnection> =
        updateByExternalId(params, RequestOptions.none())

    /** @see updateByExternalId */
    fun updateByExternalId(
        params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPaymentGatewayConnection>

    /**
     * A view of [PaymentGatewayConnectionServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentGatewayConnectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /customers/{customer_id}/payment_gateway_connections`, but is otherwise the same as
         * [PaymentGatewayConnectionServiceAsync.create].
         */
        fun create(
            customerId: String,
            params: CustomerPaymentGatewayConnectionCreateParams,
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            create(customerId, params, RequestOptions.none())

        /** @see create */
        fun create(
            customerId: String,
            params: CustomerPaymentGatewayConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see create */
        fun create(
            params: CustomerPaymentGatewayConnectionCreateParams
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomerPaymentGatewayConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>>

        /**
         * Returns a raw HTTP response for `put
         * /customers/{customer_id}/payment_gateway_connections/{payment_gateway_connection_id}`,
         * but is otherwise the same as [PaymentGatewayConnectionServiceAsync.update].
         */
        fun update(
            paymentGatewayConnectionId: String,
            params: CustomerPaymentGatewayConnectionUpdateParams,
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            update(paymentGatewayConnectionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            paymentGatewayConnectionId: String,
            params: CustomerPaymentGatewayConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            update(
                params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            params: CustomerPaymentGatewayConnectionUpdateParams
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CustomerPaymentGatewayConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>>

        /**
         * Returns a raw HTTP response for `get
         * /customers/{customer_id}/payment_gateway_connections`, but is otherwise the same as
         * [PaymentGatewayConnectionServiceAsync.list].
         */
        fun list(
            customerId: String
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnectionListResponse>> =
            list(customerId, CustomerPaymentGatewayConnectionListParams.none())

        /** @see list */
        fun list(
            customerId: String,
            params: CustomerPaymentGatewayConnectionListParams =
                CustomerPaymentGatewayConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnectionListResponse>> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see list */
        fun list(
            customerId: String,
            params: CustomerPaymentGatewayConnectionListParams =
                CustomerPaymentGatewayConnectionListParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnectionListResponse>> =
            list(customerId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CustomerPaymentGatewayConnectionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnectionListResponse>>

        /** @see list */
        fun list(
            params: CustomerPaymentGatewayConnectionListParams
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnectionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnectionListResponse>> =
            list(customerId, CustomerPaymentGatewayConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /customers/{customer_id}/payment_gateway_connections/{payment_gateway_connection_id}`,
         * but is otherwise the same as [PaymentGatewayConnectionServiceAsync.delete].
         */
        fun delete(
            paymentGatewayConnectionId: String,
            params: CustomerPaymentGatewayConnectionDeleteParams,
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            delete(paymentGatewayConnectionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            paymentGatewayConnectionId: String,
            params: CustomerPaymentGatewayConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            delete(
                params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(
            params: CustomerPaymentGatewayConnectionDeleteParams
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CustomerPaymentGatewayConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>>

        /**
         * Returns a raw HTTP response for `post
         * /customers/external_customer_id/{external_customer_id}/payment_gateway_connections`, but
         * is otherwise the same as [PaymentGatewayConnectionServiceAsync.createByExternalId].
         */
        fun createByExternalId(
            externalCustomerId: String,
            params: CustomerPaymentGatewayConnectionCreateByExternalIdParams,
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            createByExternalId(externalCustomerId, params, RequestOptions.none())

        /** @see createByExternalId */
        fun createByExternalId(
            externalCustomerId: String,
            params: CustomerPaymentGatewayConnectionCreateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            createByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see createByExternalId */
        fun createByExternalId(
            params: CustomerPaymentGatewayConnectionCreateByExternalIdParams
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            createByExternalId(params, RequestOptions.none())

        /** @see createByExternalId */
        fun createByExternalId(
            params: CustomerPaymentGatewayConnectionCreateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>>

        /**
         * Returns a raw HTTP response for `delete
         * /customers/external_customer_id/{external_customer_id}/payment_gateway_connections/{payment_gateway_connection_id}`,
         * but is otherwise the same as [PaymentGatewayConnectionServiceAsync.deleteByExternalId].
         */
        fun deleteByExternalId(
            paymentGatewayConnectionId: String,
            params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams,
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            deleteByExternalId(paymentGatewayConnectionId, params, RequestOptions.none())

        /** @see deleteByExternalId */
        fun deleteByExternalId(
            paymentGatewayConnectionId: String,
            params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            deleteByExternalId(
                params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
                requestOptions,
            )

        /** @see deleteByExternalId */
        fun deleteByExternalId(
            params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            deleteByExternalId(params, RequestOptions.none())

        /** @see deleteByExternalId */
        fun deleteByExternalId(
            params: CustomerPaymentGatewayConnectionDeleteByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>>

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}/payment_gateway_connections`, but
         * is otherwise the same as [PaymentGatewayConnectionServiceAsync.listByExternalId].
         */
        fun listByExternalId(
            externalCustomerId: String
        ): CompletableFuture<
            HttpResponseFor<CustomerPaymentGatewayConnectionListByExternalIdResponse>
        > =
            listByExternalId(
                externalCustomerId,
                CustomerPaymentGatewayConnectionListByExternalIdParams.none(),
            )

        /** @see listByExternalId */
        fun listByExternalId(
            externalCustomerId: String,
            params: CustomerPaymentGatewayConnectionListByExternalIdParams =
                CustomerPaymentGatewayConnectionListByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CustomerPaymentGatewayConnectionListByExternalIdResponse>
        > =
            listByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see listByExternalId */
        fun listByExternalId(
            externalCustomerId: String,
            params: CustomerPaymentGatewayConnectionListByExternalIdParams =
                CustomerPaymentGatewayConnectionListByExternalIdParams.none(),
        ): CompletableFuture<
            HttpResponseFor<CustomerPaymentGatewayConnectionListByExternalIdResponse>
        > = listByExternalId(externalCustomerId, params, RequestOptions.none())

        /** @see listByExternalId */
        fun listByExternalId(
            params: CustomerPaymentGatewayConnectionListByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CustomerPaymentGatewayConnectionListByExternalIdResponse>
        >

        /** @see listByExternalId */
        fun listByExternalId(
            params: CustomerPaymentGatewayConnectionListByExternalIdParams
        ): CompletableFuture<
            HttpResponseFor<CustomerPaymentGatewayConnectionListByExternalIdResponse>
        > = listByExternalId(params, RequestOptions.none())

        /** @see listByExternalId */
        fun listByExternalId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CustomerPaymentGatewayConnectionListByExternalIdResponse>
        > =
            listByExternalId(
                externalCustomerId,
                CustomerPaymentGatewayConnectionListByExternalIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put
         * /customers/external_customer_id/{external_customer_id}/payment_gateway_connections/{payment_gateway_connection_id}`,
         * but is otherwise the same as [PaymentGatewayConnectionServiceAsync.updateByExternalId].
         */
        fun updateByExternalId(
            paymentGatewayConnectionId: String,
            params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams,
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            updateByExternalId(paymentGatewayConnectionId, params, RequestOptions.none())

        /** @see updateByExternalId */
        fun updateByExternalId(
            paymentGatewayConnectionId: String,
            params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            updateByExternalId(
                params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
                requestOptions,
            )

        /** @see updateByExternalId */
        fun updateByExternalId(
            params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>> =
            updateByExternalId(params, RequestOptions.none())

        /** @see updateByExternalId */
        fun updateByExternalId(
            params: CustomerPaymentGatewayConnectionUpdateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPaymentGatewayConnection>>
    }
}
