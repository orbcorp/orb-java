// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.*
import com.withorb.api.models.InvoiceListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InvoiceServiceTest {

    @Test
    fun callCreate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()
        val invoice =
            invoiceService.create(
                InvoiceCreateParams.builder()
                    .currency("USD")
                    .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lineItems(
                        listOf(
                            InvoiceCreateParams.LineItem.builder()
                                .endDate(LocalDate.parse("2023-09-22"))
                                .itemId("4khy3nwzktxv7")
                                .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                                .name("Line Item Name")
                                .quantity(42.23)
                                .startDate(LocalDate.parse("2023-09-22"))
                                .unitConfig(
                                    InvoiceCreateParams.LineItem.UnitConfig.builder()
                                        .unitAmount("unit_amount")
                                        .build()
                                )
                                .build()
                        )
                    )
                    .netTerms(123L)
                    .customerId("4khy3nwzktxv7")
                    .discount(
                        Discount.ofPercentageDiscount(
                            Discount.PercentageDiscount.builder()
                                .appliesToPriceIds(listOf("string"))
                                .discountType(Discount.PercentageDiscount.DiscountType.PERCENTAGE)
                                .percentageDiscount(1.0)
                                .reason("reason")
                                .build()
                        )
                    )
                    .externalCustomerId("external-customer-id")
                    .memo("An optional memo for my invoice.")
                    .metadata(InvoiceCreateParams.Metadata.builder().build())
                    .willAutoIssue(true)
                    .build()
            )
        println(invoice)
        invoice.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()
        val invoice =
            invoiceService.update(
                InvoiceUpdateParams.builder()
                    .invoiceId("invoice_id")
                    .metadata(InvoiceUpdateParams.Metadata.builder().build())
                    .build()
            )
        println(invoice)
        invoice.validate()
    }

    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()
        val invoices = invoiceService.list(InvoiceListParams.builder().build())
        println(invoices)
        invoices.data().forEach { it.validate() }
    }

    @Test
    fun callFetch() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()
        val invoice =
            invoiceService.fetch(InvoiceFetchParams.builder().invoiceId("invoice_id").build())
        println(invoice)
        invoice.validate()
    }

    @Test
    fun callFetchUpcoming() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()
        val invoiceFetchUpcomingResponse =
            invoiceService.fetchUpcoming(
                InvoiceFetchUpcomingParams.builder().subscriptionId("subscription_id").build()
            )
        println(invoiceFetchUpcomingResponse)
        invoiceFetchUpcomingResponse.validate()
    }

    @Test
    fun callIssue() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()
        val invoice =
            invoiceService.issue(InvoiceIssueParams.builder().invoiceId("invoice_id").build())
        println(invoice)
        invoice.validate()
    }

    @Test
    fun callMarkPaid() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()
        val invoice =
            invoiceService.markPaid(
                InvoiceMarkPaidParams.builder()
                    .invoiceId("invoice_id")
                    .paymentReceivedDate(LocalDate.parse("2023-09-22"))
                    .externalId("external_payment_id_123")
                    .notes("notes")
                    .build()
            )
        println(invoice)
        invoice.validate()
    }

    @Test
    fun callVoidInvoice() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceService = client.invoices()
        val invoice =
            invoiceService.voidInvoice(
                InvoiceVoidInvoiceParams.builder().invoiceId("invoice_id").build()
            )
        println(invoice)
        invoice.validate()
    }
}
