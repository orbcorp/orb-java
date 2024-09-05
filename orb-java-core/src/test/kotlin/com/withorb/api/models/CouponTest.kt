// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.models.Coupon

class CouponTest {

    @Test
    fun createCoupon() {
      val coupon = Coupon.builder()
          .id("7iz2yanVjQoBZhyH")
          .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .discount(Coupon.Discount.ofPercentageDiscount(Coupon.Discount.PercentageDiscount.builder()
              .appliesToPriceIds(listOf("string"))
              .discountType(Coupon.Discount.PercentageDiscount.DiscountType.PERCENTAGE)
              .percentageDiscount(1.0)
              .reason("reason")
              .build()))
          .durationInMonths(123L)
          .maxRedemptions(123L)
          .redemptionCode("HALFOFF")
          .timesRedeemed(123L)
          .build()
      assertThat(coupon).isNotNull
      assertThat(coupon.id()).isEqualTo("7iz2yanVjQoBZhyH")
      assertThat(coupon.archivedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(coupon.discount()).isEqualTo(Coupon.Discount.ofPercentageDiscount(Coupon.Discount.PercentageDiscount.builder()
          .appliesToPriceIds(listOf("string"))
          .discountType(Coupon.Discount.PercentageDiscount.DiscountType.PERCENTAGE)
          .percentageDiscount(1.0)
          .reason("reason")
          .build()))
      assertThat(coupon.durationInMonths()).contains(123L)
      assertThat(coupon.maxRedemptions()).contains(123L)
      assertThat(coupon.redemptionCode()).isEqualTo("HALFOFF")
      assertThat(coupon.timesRedeemed()).isEqualTo(123L)
    }
}
