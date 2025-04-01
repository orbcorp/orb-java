// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PercentageDiscountTest {

    @Test
    fun create() {
        val percentageDiscount =
            PercentageDiscount.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                .percentageDiscount(0.15)
                .reason("reason")
                .build()

        assertThat(percentageDiscount.appliesToPriceIds())
            .containsExactly("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl")
        assertThat(percentageDiscount.discountType())
            .isEqualTo(PercentageDiscount.DiscountType.PERCENTAGE)
        assertThat(percentageDiscount.percentageDiscount()).isEqualTo(0.15)
        assertThat(percentageDiscount.reason()).contains("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val percentageDiscount =
            PercentageDiscount.builder()
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                .percentageDiscount(0.15)
                .reason("reason")
                .build()

        val roundtrippedPercentageDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(percentageDiscount),
                jacksonTypeRef<PercentageDiscount>(),
            )

        assertThat(roundtrippedPercentageDiscount).isEqualTo(percentageDiscount)
    }
}
