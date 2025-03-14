// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceVoidInvoiceParamsTest {

    @Test
    fun create() {
        InvoiceVoidInvoiceParams.builder().invoiceId("invoice_id").build()
    }

    @Test
    fun getPathParam() {
        val params = InvoiceVoidInvoiceParams.builder().invoiceId("invoice_id").build()
        assertThat(params).isNotNull
        // path param "invoiceId"
        assertThat(params.getPathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
