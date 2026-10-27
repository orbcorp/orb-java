// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.CustomerCreditFetchBalanceByExternalIdParams
import com.withorb.api.models.CustomerCreditFetchBalanceParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditServiceAsync = client.customers().credits()

        val pageFuture = creditServiceAsync.list("customer_id")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun fetchBalance() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditServiceAsync = client.customers().credits()

        val responseFuture =
            creditServiceAsync.fetchBalance(
                CustomerCreditFetchBalanceParams.builder()
                    .customerId("customer_id")
                    .currency("currency")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun fetchBalanceByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditServiceAsync = client.customers().credits()

        val responseFuture =
            creditServiceAsync.fetchBalanceByExternalId(
                CustomerCreditFetchBalanceByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .currency("currency")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditServiceAsync = client.customers().credits()

        val pageFuture = creditServiceAsync.listByExternalId("external_customer_id")

        val page = pageFuture.get()
        page.response().validate()
    }
}
