// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TrialDiscountTest {

    @Test
    fun createTrialDiscount() {
      val trialDiscount = TrialDiscount.builder()
          .addAppliesToPriceId("h74gfhdjvn7ujokd")
          .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
          .discountType(TrialDiscount.DiscountType.TRIAL)
          .reason("reason")
          .trialAmountDiscount("trial_amount_discount")
          .trialPercentageDiscount(0.0)
          .build()
      assertThat(trialDiscount).isNotNull
      assertThat(trialDiscount.appliesToPriceIds()).containsExactly("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl")
      assertThat(trialDiscount.discountType()).isEqualTo(TrialDiscount.DiscountType.TRIAL)
      assertThat(trialDiscount.reason()).contains("reason")
      assertThat(trialDiscount.trialAmountDiscount()).contains("trial_amount_discount")
      assertThat(trialDiscount.trialPercentageDiscount()).contains(0.0)
    }
}
