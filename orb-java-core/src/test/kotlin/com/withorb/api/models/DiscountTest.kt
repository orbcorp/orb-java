// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscountTest {

    @Test
    fun ofPercentage() {
        val percentage =
            PercentageDiscount.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                .percentageDiscount(0.15)
                .build()

        val discount = Discount.ofPercentage(percentage)

        assertThat(discount.percentage()).contains(percentage)
        assertThat(discount.trial()).isEmpty
        assertThat(discount.usage()).isEmpty
        assertThat(discount.amount()).isEmpty
    }

    @Test
    fun ofTrial() {
        val trial =
            TrialDiscount.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(TrialDiscount.DiscountType.TRIAL)
                .build()

        val discount = Discount.ofTrial(trial)

        assertThat(discount.percentage()).isEmpty
        assertThat(discount.trial()).contains(trial)
        assertThat(discount.usage()).isEmpty
        assertThat(discount.amount()).isEmpty
    }

    @Test
    fun ofUsage() {
        val usage =
            UsageDiscount.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(UsageDiscount.DiscountType.USAGE)
                .usageDiscount(0.0)
                .build()

        val discount = Discount.ofUsage(usage)

        assertThat(discount.percentage()).isEmpty
        assertThat(discount.trial()).isEmpty
        assertThat(discount.usage()).contains(usage)
        assertThat(discount.amount()).isEmpty
    }

    @Test
    fun ofAmount() {
        val amount =
            AmountDiscount.builder()
                .amountDiscount("amount_discount")
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(AmountDiscount.DiscountType.AMOUNT)
                .build()

        val discount = Discount.ofAmount(amount)

        assertThat(discount.percentage()).isEmpty
        assertThat(discount.trial()).isEmpty
        assertThat(discount.usage()).isEmpty
        assertThat(discount.amount()).contains(amount)
    }
}
