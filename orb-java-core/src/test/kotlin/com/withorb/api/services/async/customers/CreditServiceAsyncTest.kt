// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.customers

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CreditServiceAsyncTest {

    @Test
    fun list() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val creditServiceAsync = client.customers().credits()

      val pageFuture = creditServiceAsync.list(CustomerCreditListParams.builder()
          .customerId("customer_id")
          .build())

      val page = pageFuture.get()
      page.response().validate()
    }

    @Test
    fun listByExternalId() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val creditServiceAsync = client.customers().credits()

      val pageFuture = creditServiceAsync.listByExternalId(CustomerCreditListByExternalIdParams.builder()
          .externalCustomerId("external_customer_id")
          .build())

      val page = pageFuture.get()
      page.response().validate()
    }
}
