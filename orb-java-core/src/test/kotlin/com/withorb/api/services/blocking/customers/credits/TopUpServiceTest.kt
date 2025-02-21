// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking.customers.credits

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.CustomerCreditTopUpCreateByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpCreateParams
import com.withorb.api.models.CustomerCreditTopUpDeleteByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpDeleteParams
import com.withorb.api.models.CustomerCreditTopUpListByExternalIdParams
import com.withorb.api.models.CustomerCreditTopUpListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TopUpServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpService = client.customers().credits().topUps()
        val customerCreditTopUpCreateResponse =
            topUpService.create(
                CustomerCreditTopUpCreateParams.builder()
                    .customerId("customer_id")
                    .amount("amount")
                    .currency("currency")
                    .invoiceSettings(
                        CustomerCreditTopUpCreateParams.InvoiceSettings.builder()
                            .autoCollection(true)
                            .netTerms(0L)
                            .memo("memo")
                            .requireSuccessfulPayment(true)
                            .build()
                    )
                    .perUnitCostBasis("per_unit_cost_basis")
                    .threshold("threshold")
                    .activeFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiresAfter(0L)
                    .expiresAfterUnit(CustomerCreditTopUpCreateParams.ExpiresAfterUnit.DAY)
                    .build()
            )
        println(customerCreditTopUpCreateResponse)
        customerCreditTopUpCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpService = client.customers().credits().topUps()
        val topUps =
            topUpService.list(
                CustomerCreditTopUpListParams.builder().customerId("customer_id").build()
            )
        println(topUps)
        topUps.data().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpService = client.customers().credits().topUps()
        topUpService.delete(
            CustomerCreditTopUpDeleteParams.builder()
                .customerId("customer_id")
                .topUpId("top_up_id")
                .build()
        )
    }

    @Test
    fun callCreateByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpService = client.customers().credits().topUps()
        val customerCreditTopUpCreateByExternalIdResponse =
            topUpService.createByExternalId(
                CustomerCreditTopUpCreateByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .amount("amount")
                    .currency("currency")
                    .invoiceSettings(
                        CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                            .autoCollection(true)
                            .netTerms(0L)
                            .memo("memo")
                            .requireSuccessfulPayment(true)
                            .build()
                    )
                    .perUnitCostBasis("per_unit_cost_basis")
                    .threshold("threshold")
                    .activeFrom(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiresAfter(0L)
                    .expiresAfterUnit(
                        CustomerCreditTopUpCreateByExternalIdParams.ExpiresAfterUnit.DAY
                    )
                    .build()
            )
        println(customerCreditTopUpCreateByExternalIdResponse)
        customerCreditTopUpCreateByExternalIdResponse.validate()
    }

    @Test
    fun callDeleteByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpService = client.customers().credits().topUps()
        topUpService.deleteByExternalId(
            CustomerCreditTopUpDeleteByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .topUpId("top_up_id")
                .build()
        )
    }

    @Test
    fun callListByExternalId() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topUpService = client.customers().credits().topUps()
        val topUps =
            topUpService.listByExternalId(
                CustomerCreditTopUpListByExternalIdParams.builder()
                    .externalCustomerId("external_customer_id")
                    .build()
            )
        println(topUps)
        topUps.data().forEach { it.validate() }
    }
}
