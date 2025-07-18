// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertCreateForCustomerParamsTest {

    @Test
    fun create() {
        AlertCreateForCustomerParams.builder()
            .customerId("customer_id")
            .currency("currency")
            .type(AlertCreateForCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
            .addThreshold(Threshold.builder().value(0.0).build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AlertCreateForCustomerParams.builder()
                .customerId("customer_id")
                .currency("currency")
                .type(AlertCreateForCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AlertCreateForCustomerParams.builder()
                .customerId("customer_id")
                .currency("currency")
                .type(AlertCreateForCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
                .addThreshold(Threshold.builder().value(0.0).build())
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.type()).isEqualTo(AlertCreateForCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
        assertThat(body.thresholds().getOrNull())
            .containsExactly(Threshold.builder().value(0.0).build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlertCreateForCustomerParams.builder()
                .customerId("customer_id")
                .currency("currency")
                .type(AlertCreateForCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.type()).isEqualTo(AlertCreateForCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
    }
}
