// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CouponSubscriptionListParamsTest {

    @Test
    fun createCouponSubscriptionListParams() {
        CouponSubscriptionListParams.builder()
            .couponId("coupon_id")
            .cursor("cursor")
            .limit(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CouponSubscriptionListParams.builder()
                .couponId("coupon_id")
                .cursor("cursor")
                .limit(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("cursor"))
        expected.put("limit", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CouponSubscriptionListParams.builder().couponId("coupon_id").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = CouponSubscriptionListParams.builder().couponId("coupon_id").build()
        assertThat(params).isNotNull
        // path param "couponId"
        assertThat(params.getPathParam(0)).isEqualTo("coupon_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
