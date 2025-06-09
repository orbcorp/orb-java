// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrialDiscountTest {

    @Test
    fun create() {
        val trialDiscount =
            TrialDiscount.builder()
                .discountType(TrialDiscount.DiscountType.TRIAL)
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .reason("reason")
                .trialAmountDiscount("trial_amount_discount")
                .trialPercentageDiscount(0.0)
                .build()

        assertThat(trialDiscount.discountType()).isEqualTo(TrialDiscount.DiscountType.TRIAL)
        assertThat(trialDiscount.appliesToPriceIds().getOrNull())
            .containsExactly("h74gfhdjvn7ujokd", "7hfgtgjnbvc3ujkl")
        assertThat(trialDiscount.filters().getOrNull())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(trialDiscount.reason()).contains("reason")
        assertThat(trialDiscount.trialAmountDiscount()).contains("trial_amount_discount")
        assertThat(trialDiscount.trialPercentageDiscount()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trialDiscount =
            TrialDiscount.builder()
                .discountType(TrialDiscount.DiscountType.TRIAL)
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .reason("reason")
                .trialAmountDiscount("trial_amount_discount")
                .trialPercentageDiscount(0.0)
                .build()

        val roundtrippedTrialDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trialDiscount),
                jacksonTypeRef<TrialDiscount>(),
            )

        assertThat(roundtrippedTrialDiscount).isEqualTo(trialDiscount)
    }
}
