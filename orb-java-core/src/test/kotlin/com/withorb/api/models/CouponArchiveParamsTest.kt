// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CouponArchiveParamsTest {

    @Test
    fun createCouponArchiveParams() {
        CouponArchiveParams.builder().couponId("coupon_id").build()
    }

    @Test
    fun getPathParam() {
        val params = CouponArchiveParams.builder().couponId("coupon_id").build()
        assertThat(params).isNotNull
        // path param "couponId"
        assertThat(params.getPathParam(0)).isEqualTo("coupon_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
