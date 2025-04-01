// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.CustomerCostListByExternalIdParams
import com.withorb.api.models.CustomerCostListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CostServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val costServiceAsync = client.customers().costs()

        val costsFuture =
            costServiceAsync.list(
                CustomerCostListParams.builder()
                    .customerId("customer_id")
                    .currency("currency")
                    .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                    .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                    .viewMode(CustomerCostListParams.ViewMode.PERIODIC)
                    .build()
            )

        val costs = costsFuture.get()
        costs.validate()
    }

    @Test
    fun listByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val costServiceAsync = client.customers().costs()

        val responseFuture =
            costServiceAsync.listByExternalId(
                CustomerCostListByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .currency("currency")
                    .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                    .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                    .viewMode(CustomerCostListByExternalIdParams.ViewMode.PERIODIC)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
