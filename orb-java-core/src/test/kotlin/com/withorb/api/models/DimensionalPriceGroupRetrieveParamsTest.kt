// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DimensionalPriceGroupRetrieveParamsTest {

    @Test
    fun create() {
        DimensionalPriceGroupRetrieveParams.builder()
            .dimensionalPriceGroupId("dimensional_price_group_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            DimensionalPriceGroupRetrieveParams.builder()
                .dimensionalPriceGroupId("dimensional_price_group_id")
                .build()
        assertThat(params).isNotNull
        // path param "dimensionalPriceGroupId"
        assertThat(params.getPathParam(0)).isEqualTo("dimensional_price_group_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
