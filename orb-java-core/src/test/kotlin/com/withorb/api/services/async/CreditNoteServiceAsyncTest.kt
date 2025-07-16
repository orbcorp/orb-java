// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.CreditNoteCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditNoteServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditNoteServiceAsync = client.creditNotes()

        val creditNoteFuture =
            creditNoteServiceAsync.create(
                CreditNoteCreateParams.builder()
                    .addLineItem(
                        CreditNoteCreateParams.LineItem.builder()
                            .amount("amount")
                            .invoiceLineItemId("4khy3nwzktxv7")
                            .endDate(LocalDate.parse("2023-01-31"))
                            .startDate(LocalDate.parse("2023-01-01"))
                            .build()
                    )
                    .reason(CreditNoteCreateParams.Reason.DUPLICATE)
                    .endDate(LocalDate.parse("2023-01-31"))
                    .memo("An optional memo for my credit note.")
                    .startDate(LocalDate.parse("2023-01-01"))
                    .build()
            )

        val creditNote = creditNoteFuture.get()
        creditNote.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditNoteServiceAsync = client.creditNotes()

        val pageFuture = creditNoteServiceAsync.list()

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
        val creditNoteServiceAsync = client.creditNotes()

        val creditNoteFuture = creditNoteServiceAsync.fetch("credit_note_id")

        val creditNote = creditNoteFuture.get()
        creditNote.validate()
    }
}
