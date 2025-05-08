// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.CreditNoteCreateParams
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
                            .build()
                    )
                    .memo("An optional memo for my credit note.")
                    .reason(CreditNoteCreateParams.Reason.DUPLICATE)
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
