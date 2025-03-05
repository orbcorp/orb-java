// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.InvoiceLineItemCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InvoiceLineItemServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceLineItemServiceAsync = client.invoiceLineItems()

        val invoiceLineItemModelFuture =
            invoiceLineItemServiceAsync.create(
                InvoiceLineItemCreateParams.builder()
                    .amount("12.00")
                    .endDate(LocalDate.parse("2023-09-22"))
                    .invoiceId("4khy3nwzktxv7")
                    .name("Item Name")
                    .quantity(1.0)
                    .startDate(LocalDate.parse("2023-09-22"))
                    .build()
            )

        val invoiceLineItemModel = invoiceLineItemModelFuture.get()
        invoiceLineItemModel.validate()
    }
}
