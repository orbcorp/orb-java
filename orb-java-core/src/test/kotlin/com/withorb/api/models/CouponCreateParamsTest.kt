// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CouponCreateParamsTest {

    @Test
    fun create() {
        CouponCreateParams.builder()
            .newCouponPercentageDiscount(0.0)
            .redemptionCode("HALFOFF")
            .durationInMonths(12L)
            .maxRedemptions(1L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CouponCreateParams.builder()
                .newCouponPercentageDiscount(0.0)
                .redemptionCode("HALFOFF")
                .durationInMonths(12L)
                .maxRedemptions(1L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.discount())
            .isEqualTo(
                CouponCreateParams.Discount.ofNewCouponPercentage(
                    CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                        .discountType(
                            CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType
                                .PERCENTAGE
                        )
                        .percentageDiscount(0.0)
                        .build()
                )
            )
        assertThat(body.redemptionCode()).isEqualTo("HALFOFF")
        assertThat(body.durationInMonths()).contains(12L)
        assertThat(body.maxRedemptions()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CouponCreateParams.builder()
                .newCouponPercentageDiscount(0.0)
                .redemptionCode("HALFOFF")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.discount())
            .isEqualTo(
                CouponCreateParams.Discount.ofNewCouponPercentage(
                    CouponCreateParams.Discount.NewCouponPercentageDiscount.builder()
                        .discountType(
                            CouponCreateParams.Discount.NewCouponPercentageDiscount.DiscountType
                                .PERCENTAGE
                        )
                        .percentageDiscount(0.0)
                        .build()
                )
            )
        assertThat(body.redemptionCode()).isEqualTo("HALFOFF")
    }
}
