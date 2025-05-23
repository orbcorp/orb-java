// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParamsTest {

    @Test
    fun create() {
        CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.builder()
            .externalCustomerId("external_customer_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
