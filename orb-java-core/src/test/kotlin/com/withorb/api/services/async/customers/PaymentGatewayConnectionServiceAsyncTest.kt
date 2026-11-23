// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.CustomerPaymentGatewayConnectionCreateByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionCreateParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionDeleteByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionDeleteParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionListParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionUpdateByExternalIdParams
import com.withorb.api.models.CustomerPaymentGatewayConnectionUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentGatewayConnectionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionServiceAsync = client.customers().paymentGatewayConnections()

        val customerPaymentGatewayConnectionFuture =
            paymentGatewayConnectionServiceAsync.create(
                CustomerPaymentGatewayConnectionCreateParams.builder()
                    .customerId("customer_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .isDefault(true)
                    .providerCustomerId("x")
                    .build()
            )

        val customerPaymentGatewayConnection = customerPaymentGatewayConnectionFuture.get()
        customerPaymentGatewayConnection.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionServiceAsync = client.customers().paymentGatewayConnections()

        val customerPaymentGatewayConnectionFuture =
            paymentGatewayConnectionServiceAsync.update(
                CustomerPaymentGatewayConnectionUpdateParams.builder()
                    .customerId("customer_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .isDefault(CustomerPaymentGatewayConnectionUpdateParams.IsDefault.TRUE)
                    .providerCustomerId("x")
                    .build()
            )

        val customerPaymentGatewayConnection = customerPaymentGatewayConnectionFuture.get()
        customerPaymentGatewayConnection.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionServiceAsync = client.customers().paymentGatewayConnections()

        val paymentGatewayConnectionsFuture =
            paymentGatewayConnectionServiceAsync.list(
                CustomerPaymentGatewayConnectionListParams.builder()
                    .customerId("customer_id")
                    .billingEntityId("billing_entity_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .build()
            )

        val paymentGatewayConnections = paymentGatewayConnectionsFuture.get()
        paymentGatewayConnections.validate()
    }

    @Test
    fun delete() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionServiceAsync = client.customers().paymentGatewayConnections()

        val customerPaymentGatewayConnectionFuture =
            paymentGatewayConnectionServiceAsync.delete(
                CustomerPaymentGatewayConnectionDeleteParams.builder()
                    .customerId("customer_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .build()
            )

        val customerPaymentGatewayConnection = customerPaymentGatewayConnectionFuture.get()
        customerPaymentGatewayConnection.validate()
    }

    @Test
    fun createByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionServiceAsync = client.customers().paymentGatewayConnections()

        val customerPaymentGatewayConnectionFuture =
            paymentGatewayConnectionServiceAsync.createByExternalId(
                CustomerPaymentGatewayConnectionCreateByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .isDefault(true)
                    .providerCustomerId("x")
                    .build()
            )

        val customerPaymentGatewayConnection = customerPaymentGatewayConnectionFuture.get()
        customerPaymentGatewayConnection.validate()
    }

    @Test
    fun deleteByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionServiceAsync = client.customers().paymentGatewayConnections()

        val customerPaymentGatewayConnectionFuture =
            paymentGatewayConnectionServiceAsync.deleteByExternalId(
                CustomerPaymentGatewayConnectionDeleteByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .build()
            )

        val customerPaymentGatewayConnection = customerPaymentGatewayConnectionFuture.get()
        customerPaymentGatewayConnection.validate()
    }

    @Test
    fun listByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionServiceAsync = client.customers().paymentGatewayConnections()

        val responseFuture =
            paymentGatewayConnectionServiceAsync.listByExternalId(
                CustomerPaymentGatewayConnectionListByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .billingEntityId("billing_entity_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun updateByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionServiceAsync = client.customers().paymentGatewayConnections()

        val customerPaymentGatewayConnectionFuture =
            paymentGatewayConnectionServiceAsync.updateByExternalId(
                CustomerPaymentGatewayConnectionUpdateByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .isDefault(
                        CustomerPaymentGatewayConnectionUpdateByExternalIdParams.IsDefault.TRUE
                    )
                    .providerCustomerId("x")
                    .build()
            )

        val customerPaymentGatewayConnection = customerPaymentGatewayConnectionFuture.get()
        customerPaymentGatewayConnection.validate()
    }
}
