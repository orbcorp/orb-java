// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.account

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.AccountPaymentGatewayConnectionFetchParams
import com.withorb.api.models.AccountPaymentGatewayConnectionListPageAsync
import com.withorb.api.models.AccountPaymentGatewayConnectionListParams
import com.withorb.api.models.PaymentGatewayConnection
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * A payment gateway connection is one Stripe account or one Adyen merchant account that a billing
 * entity collects payments through.
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
     * This endpoint returns the account's payment gateway connections with the billing entity each
     * one collects for, ordered in descending order by creation time.
     */
    fun list(): CompletableFuture<AccountPaymentGatewayConnectionListPageAsync> =
        list(AccountPaymentGatewayConnectionListParams.none())

    /** @see list */
    fun list(
        params: AccountPaymentGatewayConnectionListParams =
            AccountPaymentGatewayConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountPaymentGatewayConnectionListPageAsync>

    /** @see list */
    fun list(
        params: AccountPaymentGatewayConnectionListParams =
            AccountPaymentGatewayConnectionListParams.none()
    ): CompletableFuture<AccountPaymentGatewayConnectionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<AccountPaymentGatewayConnectionListPageAsync> =
        list(AccountPaymentGatewayConnectionListParams.none(), requestOptions)

    /** This endpoint returns a payment gateway connection identified by its ID. */
    fun fetch(paymentGatewayConnectionId: String): CompletableFuture<PaymentGatewayConnection> =
        fetch(paymentGatewayConnectionId, AccountPaymentGatewayConnectionFetchParams.none())

    /** @see fetch */
    fun fetch(
        paymentGatewayConnectionId: String,
        params: AccountPaymentGatewayConnectionFetchParams =
            AccountPaymentGatewayConnectionFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentGatewayConnection> =
        fetch(
            params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
            requestOptions,
        )

    /** @see fetch */
    fun fetch(
        paymentGatewayConnectionId: String,
        params: AccountPaymentGatewayConnectionFetchParams =
            AccountPaymentGatewayConnectionFetchParams.none(),
    ): CompletableFuture<PaymentGatewayConnection> =
        fetch(paymentGatewayConnectionId, params, RequestOptions.none())

    /** @see fetch */
    fun fetch(
        params: AccountPaymentGatewayConnectionFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentGatewayConnection>

    /** @see fetch */
    fun fetch(
        params: AccountPaymentGatewayConnectionFetchParams
    ): CompletableFuture<PaymentGatewayConnection> = fetch(params, RequestOptions.none())

    /** @see fetch */
    fun fetch(
        paymentGatewayConnectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentGatewayConnection> =
        fetch(
            paymentGatewayConnectionId,
            AccountPaymentGatewayConnectionFetchParams.none(),
            requestOptions,
        )

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
         * Returns a raw HTTP response for `get /account/payment_gateway_connections`, but is
         * otherwise the same as [PaymentGatewayConnectionServiceAsync.list].
         */
        fun list():
            CompletableFuture<HttpResponseFor<AccountPaymentGatewayConnectionListPageAsync>> =
            list(AccountPaymentGatewayConnectionListParams.none())

        /** @see list */
        fun list(
            params: AccountPaymentGatewayConnectionListParams =
                AccountPaymentGatewayConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountPaymentGatewayConnectionListPageAsync>>

        /** @see list */
        fun list(
            params: AccountPaymentGatewayConnectionListParams =
                AccountPaymentGatewayConnectionListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountPaymentGatewayConnectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountPaymentGatewayConnectionListPageAsync>> =
            list(AccountPaymentGatewayConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /account/payment_gateway_connections/{payment_gateway_connection_id}`, but is otherwise
         * the same as [PaymentGatewayConnectionServiceAsync.fetch].
         */
        fun fetch(
            paymentGatewayConnectionId: String
        ): CompletableFuture<HttpResponseFor<PaymentGatewayConnection>> =
            fetch(paymentGatewayConnectionId, AccountPaymentGatewayConnectionFetchParams.none())

        /** @see fetch */
        fun fetch(
            paymentGatewayConnectionId: String,
            params: AccountPaymentGatewayConnectionFetchParams =
                AccountPaymentGatewayConnectionFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentGatewayConnection>> =
            fetch(
                params.toBuilder().paymentGatewayConnectionId(paymentGatewayConnectionId).build(),
                requestOptions,
            )

        /** @see fetch */
        fun fetch(
            paymentGatewayConnectionId: String,
            params: AccountPaymentGatewayConnectionFetchParams =
                AccountPaymentGatewayConnectionFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<PaymentGatewayConnection>> =
            fetch(paymentGatewayConnectionId, params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            params: AccountPaymentGatewayConnectionFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentGatewayConnection>>

        /** @see fetch */
        fun fetch(
            params: AccountPaymentGatewayConnectionFetchParams
        ): CompletableFuture<HttpResponseFor<PaymentGatewayConnection>> =
            fetch(params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            paymentGatewayConnectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentGatewayConnection>> =
            fetch(
                paymentGatewayConnectionId,
                AccountPaymentGatewayConnectionFetchParams.none(),
                requestOptions,
            )
    }
}
