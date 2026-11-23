// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.account

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentGatewayConnectionServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionServiceAsync = client.account().paymentGatewayConnections()

        val pageFuture = paymentGatewayConnectionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val paymentGatewayConnectionServiceAsync = client.account().paymentGatewayConnections()

        val paymentGatewayConnectionFuture =
            paymentGatewayConnectionServiceAsync.fetch("payment_gateway_connection_id")

        val paymentGatewayConnection = paymentGatewayConnectionFuture.get()
        paymentGatewayConnection.validate()
    }
}
