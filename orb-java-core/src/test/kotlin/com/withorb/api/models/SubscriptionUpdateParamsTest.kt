// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionUpdateParamsTest {

    @Test
    fun createSubscriptionUpdateParams() {
        SubscriptionUpdateParams.builder()
            .subscriptionId("subscription_id")
            .autoCollection(true)
            .defaultInvoiceMemo("default_invoice_memo")
            .invoicingThreshold("10.00")
            .metadata(
                SubscriptionUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .netTerms(0L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SubscriptionUpdateParams.builder()
                .subscriptionId("subscription_id")
                .autoCollection(true)
                .defaultInvoiceMemo("default_invoice_memo")
                .invoicingThreshold("10.00")
                .metadata(
                    SubscriptionUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .netTerms(0L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.autoCollection()).contains(true)
        assertThat(body.defaultInvoiceMemo()).contains("default_invoice_memo")
        assertThat(body.invoicingThreshold()).contains("10.00")
        assertThat(body.metadata())
            .contains(
                SubscriptionUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.netTerms()).contains(0L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SubscriptionUpdateParams.builder().subscriptionId("subscription_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = SubscriptionUpdateParams.builder().subscriptionId("subscription_id").build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
