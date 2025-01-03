// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceIssueParamsTest {

    @Test
    fun createInvoiceIssueParams() {
        InvoiceIssueParams.builder().invoiceId("invoice_id").synchronous(true).build()
    }

    @Test
    fun getBody() {
        val params = InvoiceIssueParams.builder().invoiceId("invoice_id").synchronous(true).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.synchronous()).contains(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = InvoiceIssueParams.builder().invoiceId("invoice_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = InvoiceIssueParams.builder().invoiceId("invoice_id").build()
        assertThat(params).isNotNull
        // path param "invoiceId"
        assertThat(params.getPathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
