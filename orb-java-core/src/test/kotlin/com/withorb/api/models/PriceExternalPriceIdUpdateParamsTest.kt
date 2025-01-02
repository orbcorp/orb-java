// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PriceExternalPriceIdUpdateParamsTest {

    @Test
    fun createPriceExternalPriceIdUpdateParams() {
        PriceExternalPriceIdUpdateParams.builder()
            .externalPriceId("external_price_id")
            .metadata(
                PriceExternalPriceIdUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PriceExternalPriceIdUpdateParams.builder()
                .externalPriceId("external_price_id")
                .metadata(
                    PriceExternalPriceIdUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.metadata())
            .contains(
                PriceExternalPriceIdUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PriceExternalPriceIdUpdateParams.builder().externalPriceId("external_price_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            PriceExternalPriceIdUpdateParams.builder().externalPriceId("external_price_id").build()
        assertThat(params).isNotNull
        // path param "externalPriceId"
        assertThat(params.getPathParam(0)).isEqualTo("external_price_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
