// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PriceUpdateParamsTest {

    @Test
    fun createPriceUpdateParams() {
        PriceUpdateParams.builder()
            .priceId("price_id")
            .metadata(PriceUpdateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PriceUpdateParams.builder()
                .priceId("price_id")
                .metadata(PriceUpdateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.metadata()).isEqualTo(PriceUpdateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = PriceUpdateParams.builder().priceId("price_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = PriceUpdateParams.builder().priceId("price_id").build()
        assertThat(params).isNotNull
        // path param "priceId"
        assertThat(params.getPathParam(0)).isEqualTo("price_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
