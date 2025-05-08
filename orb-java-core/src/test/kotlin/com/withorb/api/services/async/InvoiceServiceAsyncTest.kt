// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoiceUpdateParams
import com.withorb.api.models.PercentageDiscount
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InvoiceServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoiceFuture =
            invoiceServiceAsync.create(
                InvoiceCreateParams.builder()
                    .currency("USD")
                    .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addLineItem(
                        InvoiceCreateParams.LineItem.builder()
                            .endDate(LocalDate.parse("2023-09-22"))
                            .itemId("4khy3nwzktxv7")
                            .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                            .name("Line Item Name")
                            .quantity(1.0)
                            .startDate(LocalDate.parse("2023-09-22"))
                            .unitConfig(
                                InvoiceCreateParams.LineItem.UnitConfig.builder()
                                    .unitAmount("unit_amount")
                                    .build()
                            )
                            .build()
                    )
                    .netTerms(0L)
                    .customerId("4khy3nwzktxv7")
                    .discount(
                        PercentageDiscount.builder()
                            .addAppliesToPriceId("h74gfhdjvn7ujokd")
                            .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                            .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                            .percentageDiscount(0.15)
                            .reason("reason")
                            .build()
                    )
                    .externalCustomerId("external-customer-id")
                    .memo("An optional memo for my invoice.")
                    .metadata(
                        InvoiceCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .willAutoIssue(false)
                    .build()
            )

        val invoice = invoiceFuture.get()
        invoice.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoiceFuture =
            invoiceServiceAsync.update(
                InvoiceUpdateParams.builder()
                    .invoiceId("invoice_id")
                    .metadata(
                        InvoiceUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val invoice = invoiceFuture.get()
        invoice.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val pageFuture = invoiceServiceAsync.list()

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
        val invoiceServiceAsync = client.invoices()

        val invoiceFuture = invoiceServiceAsync.fetch("invoice_id")

        val invoice = invoiceFuture.get()
        invoice.validate()
    }

    @Test
    fun fetchUpcoming() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val responseFuture =
            invoiceServiceAsync.fetchUpcoming(
                InvoiceFetchUpcomingParams.builder().subscriptionId("subscription_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun issue() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoiceFuture =
            invoiceServiceAsync.issue(
                InvoiceIssueParams.builder().invoiceId("invoice_id").synchronous(true).build()
            )

        val invoice = invoiceFuture.get()
        invoice.validate()
    }

    @Test
    fun markPaid() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoiceFuture =
            invoiceServiceAsync.markPaid(
                InvoiceMarkPaidParams.builder()
                    .invoiceId("invoice_id")
                    .paymentReceivedDate(LocalDate.parse("2023-09-22"))
                    .externalId("external_payment_id_123")
                    .notes("notes")
                    .build()
            )

        val invoice = invoiceFuture.get()
        invoice.validate()
    }

    @Test
    fun pay() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoiceFuture = invoiceServiceAsync.pay("invoice_id")

        val invoice = invoiceFuture.get()
        invoice.validate()
    }

    @Test
    fun voidInvoice() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invoiceServiceAsync = client.invoices()

        val invoiceFuture = invoiceServiceAsync.voidInvoice("invoice_id")

        val invoice = invoiceFuture.get()
        invoice.validate()
    }
}
