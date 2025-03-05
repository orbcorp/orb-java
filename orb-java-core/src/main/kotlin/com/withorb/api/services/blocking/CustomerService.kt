// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.CustomerCreateParams
import com.withorb.api.models.CustomerDeleteParams
import com.withorb.api.models.CustomerFetchByExternalIdParams
import com.withorb.api.models.CustomerFetchParams
import com.withorb.api.models.CustomerListPage
import com.withorb.api.models.CustomerListParams
import com.withorb.api.models.CustomerModel
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
import com.withorb.api.models.CustomerSyncPaymentMethodsFromGatewayParams
import com.withorb.api.models.CustomerUpdateByExternalIdParams
import com.withorb.api.models.CustomerUpdateParams
import com.withorb.api.services.blocking.customers.BalanceTransactionService
import com.withorb.api.services.blocking.customers.CostService
import com.withorb.api.services.blocking.customers.CreditService

interface CustomerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun costs(): CostService

    fun credits(): CreditService

    fun balanceTransactions(): BalanceTransactionService

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
    @JvmOverloads
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerModel

    /**
     * This endpoint can be used to update the `payment_provider`, `payment_provider_id`, `name`,
     * `email`, `email_delivery`, `tax_id`, `auto_collection`, `metadata`, `shipping_address`,
     * `billing_address`, and `additional_emails` of an existing customer. Other fields on a
     * customer are currently immutable.
     */
    @JvmOverloads
    fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerModel

    /**
     * This endpoint returns a list of all customers for an account. The list of customers is
     * ordered starting from the most recently created customer. This endpoint follows Orb's
     * [standardized pagination format](/api-reference/pagination).
     *
     * See [Customer](/core-concepts##customer) for an overview of the customer model.
     */
    @JvmOverloads
    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPage

    /**
     * This endpoint returns a list of all customers for an account. The list of customers is
     * ordered starting from the most recently created customer. This endpoint follows Orb's
     * [standardized pagination format](/api-reference/pagination).
     *
     * See [Customer](/core-concepts##customer) for an overview of the customer model.
     */
    fun list(requestOptions: RequestOptions): CustomerListPage =
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
     * while deletion is in process will reflect its deletion with a `deleted: true` property. Once
     * the customer deletion has been fully processed, the customer will not be returned in the API.
     *
     * On successful processing, this returns an empty dictionary (`{}`) in the API.
     */
    @JvmOverloads
    fun delete(params: CustomerDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * This endpoint is used to fetch customer details given an identifier. If the `Customer` is in
     * the process of being deleted, only the properties `id` and `deleted: true` will be returned.
     *
     * See the [Customer resource](/core-concepts#customer) for a full discussion of the Customer
     * model.
     */
    @JvmOverloads
    fun fetch(
        params: CustomerFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerModel

    /**
     * This endpoint is used to fetch customer details given an `external_customer_id` (see
     * [Customer ID Aliases](/events-and-metrics/customer-aliases)).
     *
     * Note that the resource and semantics of this endpoint exactly mirror
     * [Get Customer](fetch-customer).
     */
    @JvmOverloads
    fun fetchByExternalId(
        params: CustomerFetchByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerModel

    /**
     * Sync Orb's payment methods for the customer with their gateway.
     *
     * This method can be called before taking an action that may cause the customer to be charged,
     * ensuring that the most up-to-date payment method is charged.
     *
     * **Note**: This functionality is currently only available for Stripe.
     */
    @JvmOverloads
    fun syncPaymentMethodsFromGateway(
        params: CustomerSyncPaymentMethodsFromGatewayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Sync Orb's payment methods for the customer with their gateway.
     *
     * This method can be called before taking an action that may cause the customer to be charged,
     * ensuring that the most up-to-date payment method is charged.
     *
     * **Note**: This functionality is currently only available for Stripe.
     */
    @JvmOverloads
    fun syncPaymentMethodsFromGatewayByExternalCustomerId(
        params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * This endpoint is used to update customer details given an `external_customer_id` (see
     * [Customer ID Aliases](/events-and-metrics/customer-aliases)). Note that the resource and
     * semantics of this endpoint exactly mirror [Update Customer](update-customer).
     */
    @JvmOverloads
    fun updateByExternalId(
        params: CustomerUpdateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerModel

    /** A view of [CustomerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun costs(): CostService.WithRawResponse

        fun credits(): CreditService.WithRawResponse

        fun balanceTransactions(): BalanceTransactionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers`, but is otherwise the same as
         * [CustomerService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerModel>

        /**
         * Returns a raw HTTP response for `put /customers/{customer_id}`, but is otherwise the same
         * as [CustomerService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerModel>

        /**
         * Returns a raw HTTP response for `get /customers`, but is otherwise the same as
         * [CustomerService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListPage>

        /**
         * Returns a raw HTTP response for `get /customers`, but is otherwise the same as
         * [CustomerService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CustomerListPage> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /customers/{customer_id}`, but is otherwise the
         * same as [CustomerService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}`, but is otherwise the same
         * as [CustomerService.fetch].
         */
        @JvmOverloads
        @MustBeClosed
        fun fetch(
            params: CustomerFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerModel>

        /**
         * Returns a raw HTTP response for `get
         * /customers/external_customer_id/{external_customer_id}`, but is otherwise the same as
         * [CustomerService.fetchByExternalId].
         */
        @JvmOverloads
        @MustBeClosed
        fun fetchByExternalId(
            params: CustomerFetchByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerModel>

        /**
         * Returns a raw HTTP response for `post
         * /customers/external_customer_id/{external_customer_id}/sync_payment_methods_from_gateway`,
         * but is otherwise the same as [CustomerService.syncPaymentMethodsFromGateway].
         */
        @JvmOverloads
        @MustBeClosed
        fun syncPaymentMethodsFromGateway(
            params: CustomerSyncPaymentMethodsFromGatewayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /customers/{customer_id}/sync_payment_methods_from_gateway`, but is otherwise the same as
         * [CustomerService.syncPaymentMethodsFromGatewayByExternalCustomerId].
         */
        @JvmOverloads
        @MustBeClosed
        fun syncPaymentMethodsFromGatewayByExternalCustomerId(
            params: CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put
         * /customers/external_customer_id/{external_customer_id}`, but is otherwise the same as
         * [CustomerService.updateByExternalId].
         */
        @JvmOverloads
        @MustBeClosed
        fun updateByExternalId(
            params: CustomerUpdateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerModel>
    }
}
