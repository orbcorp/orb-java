// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerBalanceTransactionCreateParamsTest {

    @Test
    fun createCustomerBalanceTransactionCreateParams() {
        CustomerBalanceTransactionCreateParams.builder()
            .customerId("customer_id")
            .amount("amount")
            .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
            .description("description")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerBalanceTransactionCreateParams.builder()
                .customerId("customer_id")
                .amount("amount")
                .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
                .description("description")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.type()).isEqualTo(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerBalanceTransactionCreateParams.builder()
                .customerId("customer_id")
                .amount("amount")
                .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.type()).isEqualTo(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerBalanceTransactionCreateParams.builder()
                .customerId("customer_id")
                .amount("amount")
                .type(CustomerBalanceTransactionCreateParams.Type.INCREMENT)
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
