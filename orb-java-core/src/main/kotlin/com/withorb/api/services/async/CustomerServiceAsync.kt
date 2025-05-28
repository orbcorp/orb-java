// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.Customer
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerDeleteParams
import com.withorb.api.models.CustomerFetchByExternalIdParams
import com.withorb.api.models.CustomerFetchParams
import com.withorb.api.models.CustomerListPageAsync
import com.withorb.api.models.CustomerListParams
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayParams
import com.withorb.api.models.CustomerUpdateByExternalIdParams
import com.withorb.api.models.CustomerUpdateParams
import com.withorb.api.services.async.customers.BalanceTransactionServiceAsync
import com.withorb.api.services.async.customers.CostServiceAsync
import com.withorb.api.services.async.customers.CreditServiceAsync
import java.util.concurrent.CompletableFuture

interface CustomerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun costs(): CostServiceAsync

    fun credits(): CreditServiceAsync

    fun balanceTransactions(): BalanceTransactionServiceAsync

    /**
     * This operation is used to create an Orb customer, who is party to the core billing
     * relationship. See [Customer](/core-concepts##customer) for an overview of the customer
     * resource.
     *
     * This endpoint is critical in the following Orb functionality:
     * - Automated charges can be configured by setting `payment_provider` and `payment_provider_id`
     *   to automatically issue invoices
     * - [Customer ID Aliases](/events-and-metrics/customer-aliases) can be configured by setting
     *   `external_customer_id`
     * - [Timezone localization](/essentials/timezones) can be configured on a per-customer basis by
     *   setting the `timezone` parameter
     */
    fun create(params: CustomerCreateParams): CompletableFuture<Customer> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer>

    /**
     * This endpoint can be used to update the `payment_provider`, `payment_provider_id`, `name`,
     * `email`, `email_delivery`, `tax_id`, `auto_collection`, `metadata`, `shipping_address`,
     * `billing_address`, and `additional_emails` of an existing customer. Other fields on a
     * customer are currently immutable.
     */
    fun update(customerId: String): CompletableFuture<Customer> =
        update(customerId, CustomerUpdateParams.none())

    /** @see [update] */
    fun update(
        customerId: String,
        params: CustomerUpdateParams = CustomerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer> =
        update(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [update] */
    fun update(
        customerId: String,
        params: CustomerUpdateParams = CustomerUpdateParams.none(),
    ): CompletableFuture<Customer> = update(customerId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer>

    /** @see [update] */
    fun update(params: CustomerUpdateParams): CompletableFuture<Customer> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(customerId: String, requestOptions: RequestOptions): CompletableFuture<Customer> =
        update(customerId, CustomerUpdateParams.none(), requestOptions)

    /**
     * This endpoint returns a list of all customers for an account. The list of customers is
     * ordered starting from the most recently created customer. This endpoint follows Orb's
     * [standardized pagination format](/api-reference/pagination).
     *
     * See [Customer](/core-concepts##customer) for an overview of the customer model.
     */
    fun list(): CompletableFuture<CustomerListPageAsync> = list(CustomerListParams.none())

    /** @see [list] */
    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListPageAsync>

    /** @see [list] */
    fun list(
        params: CustomerListParams = CustomerListParams.none()
    ): CompletableFuture<CustomerListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CustomerListPageAsync> =
        list(CustomerListParams.none(), requestOptions)

    /**
     * This performs a deletion of this customer, its subscriptions, and its invoices, provided the
     * customer does not have any issued invoices. Customers with issued invoices cannot be deleted.
     * This operation is irreversible. Note that this is a _soft_ deletion, but the data will be
     * inaccessible through the API and Orb dashboard.
     *
     * For a hard-deletion, please reach out to the Orb team directly.
     *
     * **Note**: This operation happens asynchronously and can be expected to take a few minutes to
     * propagate to related resources. However, querying for the customer on subsequent GET requests
     * while deletion is in process will reflect its deletion.
     */
    fun delete(customerId: String): CompletableFuture<Void?> =
        delete(customerId, CustomerDeleteParams.none())

    /** @see [delete] */
    fun delete(
        customerId: String,
        params: CustomerDeleteParams = CustomerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        customerId: String,
        params: CustomerDeleteParams = CustomerDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(customerId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CustomerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [delete] */
    fun delete(params: CustomerDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(customerId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(customerId, CustomerDeleteParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch customer details given an identifier. If the `Customer` is in
     * the process of being deleted, only the properties `id` and `deleted: true` will be returned.
     *
     * See the [Customer resource](/core-concepts#customer) for a full discussion of the Customer
     * model.
     */
    fun fetch(customerId: String): CompletableFuture<Customer> =
        fetch(customerId, CustomerFetchParams.none())

    /** @see [fetch] */
    fun fetch(
        customerId: String,
        params: CustomerFetchParams = CustomerFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer> =
        fetch(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(
        customerId: String,
        params: CustomerFetchParams = CustomerFetchParams.none(),
    ): CompletableFuture<Customer> = fetch(customerId, params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: CustomerFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer>

    /** @see [fetch] */
    fun fetch(params: CustomerFetchParams): CompletableFuture<Customer> =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(customerId: String, requestOptions: RequestOptions): CompletableFuture<Customer> =
        fetch(customerId, CustomerFetchParams.none(), requestOptions)

    /**
     * This endpoint is used to fetch customer details given an `external_customer_id` (see
     * [Customer ID Aliases](/events-and-metrics/customer-aliases)).
     *
     * Note that the resource and semantics of this endpoint exactly mirror
     * [Get Customer](fetch-customer).
     */
    fun fetchByExternalId(externalCustomerId: String): CompletableFuture<Customer> =
        fetchByExternalId(externalCustomerId, CustomerFetchByExternalIdParams.none())

    /** @see [fetchByExternalId] */
    fun fetchByExternalId(
        externalCustomerId: String,
        params: CustomerFetchByExternalIdParams = CustomerFetchByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer> =
        fetchByExternalId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [fetchByExternalId] */
    fun fetchByExternalId(
        externalCustomerId: String,
        params: CustomerFetchByExternalIdParams = CustomerFetchByExternalIdParams.none(),
    ): CompletableFuture<Customer> =
        fetchByExternalId(externalCustomerId, params, RequestOptions.none())

    /** @see [fetchByExternalId] */
    fun fetchByExternalId(
        params: CustomerFetchByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer>

    /** @see [fetchByExternalId] */
    fun fetchByExternalId(params: CustomerFetchByExternalIdParams): CompletableFuture<Customer> =
        fetchByExternalId(params, RequestOptions.none())

    /** @see [fetchByExternalId] */
    fun fetchByExternalId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Customer> =
        fetchByExternalId(
            externalCustomerId,
            CustomerFetchByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * Sync Orb's payment methods for the customer with their gateway.
     *
     * This method can be called before taking an action that may cause the customer to be charged,
     * ensuring that the most up-to-date payment method is charged.
     *
     * **Note**: This functionality is currently only available for Stripe.
     */
    fun syncPaymentMethodsFromGateway(customerId: String): CompletableFuture<Void?> =
        syncPaymentMethodsFromGateway(
            customerId,
            CustomerSyncPaymentMethodsFromGatewayParams.none(),
        )

    /** @see [syncPaymentMethodsFromGateway] */
    fun syncPaymentMethodsFromGateway(
        customerId: String,
        params: CustomerSyncPaymentMethodsFromGatewayParams =
            CustomerSyncPaymentMethodsFromGatewayParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        syncPaymentMethodsFromGateway(
            params.toBuilder().customerId(customerId).build(),
            requestOptions,
        )

    /** @see [syncPaymentMethodsFromGateway] */
    fun syncPaymentMethodsFromGateway(
        customerId: String,
        params: CustomerSyncPaymentMethodsFromGatewayParams =
            CustomerSyncPaymentMethodsFromGatewayParams.none(),
    ): CompletableFuture<Void?> =
        syncPaymentMethodsFromGateway(customerId, params, RequestOptions.none())

    /** @see [syncPaymentMethodsFromGateway] */
    fun syncPaymentMethodsFromGateway(
        params: CustomerSyncPaymentMethodsFromGatewayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [syncPaymentMethodsFromGateway] */
    fun syncPaymentMethodsFromGateway(
        params: CustomerSyncPaymentMethodsFromGatewayParams
    ): CompletableFuture<Void?> = syncPaymentMethodsFromGateway(params, RequestOptions.none())

    /** @see [syncPaymentMethodsFromGateway] */
    fun syncPaymentMethodsFromGateway(
        customerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        syncPaymentMethodsFromGateway(
            customerId,
            CustomerSyncPaymentMethodsFromGatewayParams.none(),
            requestOptions,
        )

    /**
     * Sync Orb's payment methods for the customer with their gateway.
     *
     * This method can be called before taking an action that may cause the customer to be charged,
     * ensuring that the most up-to-date payment method is charged.
     *
     * **Note**: This functionality is currently only available for Stripe.
     */
    fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        externalCustomerId: String
    ): CompletableFuture<Void?> =
        syncPaymentMethodsFromGatewayByExternalCustomerId(
            externalCustomerId,
            CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.none(),
        )

    /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
    fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        externalCustomerId: String,
        params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams =
            CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        syncPaymentMethodsFromGatewayByExternalCustomerId(
            params.toBuilder().externalCustomerId(externalCustomerId).build(),
            requestOptions,
        )

    /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
    fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        externalCustomerId: String,
        params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams =
            CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.none(),
    ): CompletableFuture<Void?> =
        syncPaymentMethodsFromGatewayByExternalCustomerId(
            externalCustomerId,
            params,
            RequestOptions.none(),
        )

    /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
    fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
    fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
    ): CompletableFuture<Void?> =
        syncPaymentMethodsFromGatewayByExternalCustomerId(params, RequestOptions.none())

    /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
    fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        externalCustomerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        syncPaymentMethodsFromGatewayByExternalCustomerId(
            externalCustomerId,
            CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.none(),
            requestOptions,
        )

    /**
     * This endpoint is used to update customer details given an `external_customer_id` (see
     * [Customer ID Aliases](/events-and-metrics/customer-aliases)). Note that the resource and
     * semantics of this endpoint exactly mirror [Update Customer](update-customer).
     */
    fun updateByExternalId(id: String): CompletableFuture<Customer> =
        updateByExternalId(id, CustomerUpdateByExternalIdParams.none())

    /** @see [updateByExternalId] */
    fun updateByExternalId(
        id: String,
        params: CustomerUpdateByExternalIdParams = CustomerUpdateByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer> =
        updateByExternalId(params.toBuilder().id(id).build(), requestOptions)

    /** @see [updateByExternalId] */
    fun updateByExternalId(
        id: String,
        params: CustomerUpdateByExternalIdParams = CustomerUpdateByExternalIdParams.none(),
    ): CompletableFuture<Customer> = updateByExternalId(id, params, RequestOptions.none())

    /** @see [updateByExternalId] */
    fun updateByExternalId(
        params: CustomerUpdateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer>

    /** @see [updateByExternalId] */
    fun updateByExternalId(params: CustomerUpdateByExternalIdParams): CompletableFuture<Customer> =
        updateByExternalId(params, RequestOptions.none())

    /** @see [updateByExternalId] */
    fun updateByExternalId(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Customer> =
        updateByExternalId(id, CustomerUpdateByExternalIdParams.none(), requestOptions)

    /**
     * A view of [CustomerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun costs(): CostServiceAsync.WithRawResponse

        fun credits(): CreditServiceAsync.WithRawResponse

        fun balanceTransactions(): BalanceTransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers`, but is otherwise the same as
         * [CustomerServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: CustomerCreateParams): CompletableFuture<HttpResponseFor<Customer>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>>

        /**
         * Returns a raw HTTP response for `put /customers/{customer_id}`, but is otherwise the same
         * as [CustomerServiceAsync.update].
         */
        @MustBeClosed
        fun update(customerId: String): CompletableFuture<HttpResponseFor<Customer>> =
            update(customerId, CustomerUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            customerId: String,
            params: CustomerUpdateParams = CustomerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>> =
            update(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            customerId: String,
            params: CustomerUpdateParams = CustomerUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Customer>> =
            update(customerId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>>

        /** @see [update] */
        @MustBeClosed
        fun update(params: CustomerUpdateParams): CompletableFuture<HttpResponseFor<Customer>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> =
            update(customerId, CustomerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers`, but is otherwise the same as
         * [CustomerServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(CustomerListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none()
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /customers/{customer_id}`, but is otherwise the
         * same as [CustomerServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(customerId: String): CompletableFuture<HttpResponse> =
            delete(customerId, CustomerDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            customerId: String,
            params: CustomerDeleteParams = CustomerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            customerId: String,
            params: CustomerDeleteParams = CustomerDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(customerId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: CustomerDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(customerId, CustomerDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}`, but is otherwise the same
         * as [CustomerServiceAsync.fetch].
         */
        @MustBeClosed
        fun fetch(customerId: String): CompletableFuture<HttpResponseFor<Customer>> =
            fetch(customerId, CustomerFetchParams.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            customerId: String,
            params: CustomerFetchParams = CustomerFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>> =
            fetch(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            customerId: String,
            params: CustomerFetchParams = CustomerFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<Customer>> =
            fetch(customerId, params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: CustomerFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>>

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(params: CustomerFetchParams): CompletableFuture<HttpResponseFor<Customer>> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> =
            fetch(customerId, CustomerFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}`, but is otherwise the same as
         * [CustomerServiceAsync.fetchByExternalId].
         */
        @MustBeClosed
        fun fetchByExternalId(
            externalCustomerId: String
        ): CompletableFuture<HttpResponseFor<Customer>> =
            fetchByExternalId(externalCustomerId, CustomerFetchByExternalIdParams.none())

        /** @see [fetchByExternalId] */
        @MustBeClosed
        fun fetchByExternalId(
            externalCustomerId: String,
            params: CustomerFetchByExternalIdParams = CustomerFetchByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>> =
            fetchByExternalId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see [fetchByExternalId] */
        @MustBeClosed
        fun fetchByExternalId(
            externalCustomerId: String,
            params: CustomerFetchByExternalIdParams = CustomerFetchByExternalIdParams.none(),
        ): CompletableFuture<HttpResponseFor<Customer>> =
            fetchByExternalId(externalCustomerId, params, RequestOptions.none())

        /** @see [fetchByExternalId] */
        @MustBeClosed
        fun fetchByExternalId(
            params: CustomerFetchByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>>

        /** @see [fetchByExternalId] */
        @MustBeClosed
        fun fetchByExternalId(
            params: CustomerFetchByExternalIdParams
        ): CompletableFuture<HttpResponseFor<Customer>> =
            fetchByExternalId(params, RequestOptions.none())

        /** @see [fetchByExternalId] */
        @MustBeClosed
        fun fetchByExternalId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> =
            fetchByExternalId(
                externalCustomerId,
                CustomerFetchByExternalIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /customers/{customer_id}/sync_payment_methods_from_gateway`, but is otherwise the same as
         * [CustomerServiceAsync.syncPaymentMethodsFromGateway].
         */
        @MustBeClosed
        fun syncPaymentMethodsFromGateway(customerId: String): CompletableFuture<HttpResponse> =
            syncPaymentMethodsFromGateway(
                customerId,
                CustomerSyncPaymentMethodsFromGatewayParams.none(),
            )

        /** @see [syncPaymentMethodsFromGateway] */
        @MustBeClosed
        fun syncPaymentMethodsFromGateway(
            customerId: String,
            params: CustomerSyncPaymentMethodsFromGatewayParams =
                CustomerSyncPaymentMethodsFromGatewayParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            syncPaymentMethodsFromGateway(
                params.toBuilder().customerId(customerId).build(),
                requestOptions,
            )

        /** @see [syncPaymentMethodsFromGateway] */
        @MustBeClosed
        fun syncPaymentMethodsFromGateway(
            customerId: String,
            params: CustomerSyncPaymentMethodsFromGatewayParams =
                CustomerSyncPaymentMethodsFromGatewayParams.none(),
        ): CompletableFuture<HttpResponse> =
            syncPaymentMethodsFromGateway(customerId, params, RequestOptions.none())

        /** @see [syncPaymentMethodsFromGateway] */
        @MustBeClosed
        fun syncPaymentMethodsFromGateway(
            params: CustomerSyncPaymentMethodsFromGatewayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [syncPaymentMethodsFromGateway] */
        @MustBeClosed
        fun syncPaymentMethodsFromGateway(
            params: CustomerSyncPaymentMethodsFromGatewayParams
        ): CompletableFuture<HttpResponse> =
            syncPaymentMethodsFromGateway(params, RequestOptions.none())

        /** @see [syncPaymentMethodsFromGateway] */
        @MustBeClosed
        fun syncPaymentMethodsFromGateway(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            syncPaymentMethodsFromGateway(
                customerId,
                CustomerSyncPaymentMethodsFromGatewayParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /customers/external_customer_id/{external_customer_id}/sync_payment_methods_from_gateway`,
         * but is otherwise the same as
         * [CustomerServiceAsync.syncPaymentMethodsFromGatewayByExternalCustomerId].
         */
        @MustBeClosed
        fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            externalCustomerId: String
        ): CompletableFuture<HttpResponse> =
            syncPaymentMethodsFromGatewayByExternalCustomerId(
                externalCustomerId,
                CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.none(),
            )

        /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
        @MustBeClosed
        fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            externalCustomerId: String,
            params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams =
                CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            syncPaymentMethodsFromGatewayByExternalCustomerId(
                params.toBuilder().externalCustomerId(externalCustomerId).build(),
                requestOptions,
            )

        /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
        @MustBeClosed
        fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            externalCustomerId: String,
            params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams =
                CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.none(),
        ): CompletableFuture<HttpResponse> =
            syncPaymentMethodsFromGatewayByExternalCustomerId(
                externalCustomerId,
                params,
                RequestOptions.none(),
            )

        /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
        @MustBeClosed
        fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
        @MustBeClosed
        fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
        ): CompletableFuture<HttpResponse> =
            syncPaymentMethodsFromGatewayByExternalCustomerId(params, RequestOptions.none())

        /** @see [syncPaymentMethodsFromGatewayByExternalCustomerId] */
        @MustBeClosed
        fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            externalCustomerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            syncPaymentMethodsFromGatewayByExternalCustomerId(
                externalCustomerId,
                CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put
         * /customers/external_customer_id/{external_customer_id}`, but is otherwise the same as
         * [CustomerServiceAsync.updateByExternalId].
         */
        @MustBeClosed
        fun updateByExternalId(id: String): CompletableFuture<HttpResponseFor<Customer>> =
            updateByExternalId(id, CustomerUpdateByExternalIdParams.none())

        /** @see [updateByExternalId] */
        @MustBeClosed
        fun updateByExternalId(
            id: String,
            params: CustomerUpdateByExternalIdParams = CustomerUpdateByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>> =
            updateByExternalId(params.toBuilder().id(id).build(), requestOptions)

        /** @see [updateByExternalId] */
        @MustBeClosed
        fun updateByExternalId(
            id: String,
            params: CustomerUpdateByExternalIdParams = CustomerUpdateByExternalIdParams.none(),
        ): CompletableFuture<HttpResponseFor<Customer>> =
            updateByExternalId(id, params, RequestOptions.none())

        /** @see [updateByExternalId] */
        @MustBeClosed
        fun updateByExternalId(
            params: CustomerUpdateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>>

        /** @see [updateByExternalId] */
        @MustBeClosed
        fun updateByExternalId(
            params: CustomerUpdateByExternalIdParams
        ): CompletableFuture<HttpResponseFor<Customer>> =
            updateByExternalId(params, RequestOptions.none())

        /** @see [updateByExternalId] */
        @MustBeClosed
        fun updateByExternalId(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> =
            updateByExternalId(id, CustomerUpdateByExternalIdParams.none(), requestOptions)
    }
}
