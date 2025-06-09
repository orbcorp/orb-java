// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoicePayParamsTest {

    @Test
    fun create() {
        InvoicePayParams.builder().invoiceId("invoice_id").build()
    }

    @Test
    fun pathParams() {
        val params = InvoicePayParams.builder().invoiceId("invoice_id").build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
