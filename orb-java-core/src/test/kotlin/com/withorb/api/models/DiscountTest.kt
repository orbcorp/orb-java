// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import com.withorb.api.errors.OrbInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class DiscountTest {

    @Test
    fun ofPercentage() {
        val percentage =
            PercentageDiscount.builder()
                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                .percentageDiscount(0.15)
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .reason("reason")
                .build()

        val discount = Discount.ofPercentage(percentage)

        assertThat(discount.percentage()).contains(percentage)
        assertThat(discount.trial()).isEmpty
        assertThat(discount.usage()).isEmpty
        assertThat(discount.amount()).isEmpty
    }

    @Test
    fun ofPercentageRoundtrip() {
        val jsonMapper = jsonMapper()
        val discount =
            Discount.ofPercentage(
                PercentageDiscount.builder()
                    .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                    .percentageDiscount(0.15)
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .reason("reason")
                    .build()
            )

        val roundtrippedDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discount),
                jacksonTypeRef<Discount>(),
            )

        assertThat(roundtrippedDiscount).isEqualTo(discount)
    }

    @Test
    fun ofTrial() {
        val trial =
            TrialDiscount.builder()
                .discountType(TrialDiscount.DiscountType.TRIAL)
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .reason("reason")
                .trialAmountDiscount("trial_amount_discount")
                .trialPercentageDiscount(0.0)
                .build()

        val discount = Discount.ofTrial(trial)

        assertThat(discount.percentage()).isEmpty
        assertThat(discount.trial()).contains(trial)
        assertThat(discount.usage()).isEmpty
        assertThat(discount.amount()).isEmpty
    }

    @Test
    fun ofTrialRoundtrip() {
        val jsonMapper = jsonMapper()
        val discount =
            Discount.ofTrial(
                TrialDiscount.builder()
                    .discountType(TrialDiscount.DiscountType.TRIAL)
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .reason("reason")
                    .trialAmountDiscount("trial_amount_discount")
                    .trialPercentageDiscount(0.0)
                    .build()
            )

        val roundtrippedDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discount),
                jacksonTypeRef<Discount>(),
            )

        assertThat(roundtrippedDiscount).isEqualTo(discount)
    }

    @Test
    fun ofUsage() {
        val usage =
            UsageDiscount.builder()
                .discountType(UsageDiscount.DiscountType.USAGE)
                .usageDiscount(0.0)
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .reason("reason")
                .build()

        val discount = Discount.ofUsage(usage)

        assertThat(discount.percentage()).isEmpty
        assertThat(discount.trial()).isEmpty
        assertThat(discount.usage()).contains(usage)
        assertThat(discount.amount()).isEmpty
    }

    @Test
    fun ofUsageRoundtrip() {
        val jsonMapper = jsonMapper()
        val discount =
            Discount.ofUsage(
                UsageDiscount.builder()
                    .discountType(UsageDiscount.DiscountType.USAGE)
                    .usageDiscount(0.0)
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .reason("reason")
                    .build()
            )

        val roundtrippedDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discount),
                jacksonTypeRef<Discount>(),
            )

        assertThat(roundtrippedDiscount).isEqualTo(discount)
    }

    @Test
    fun ofAmount() {
        val amount =
            AmountDiscount.builder()
                .amountDiscount("amount_discount")
                .discountType(AmountDiscount.DiscountType.AMOUNT)
                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                .reason("reason")
                .build()

        val discount = Discount.ofAmount(amount)

        assertThat(discount.percentage()).isEmpty
        assertThat(discount.trial()).isEmpty
        assertThat(discount.usage()).isEmpty
        assertThat(discount.amount()).contains(amount)
    }

    @Test
    fun ofAmountRoundtrip() {
        val jsonMapper = jsonMapper()
        val discount =
            Discount.ofAmount(
                AmountDiscount.builder()
                    .amountDiscount("amount_discount")
                    .discountType(AmountDiscount.DiscountType.AMOUNT)
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .reason("reason")
                    .build()
            )

        val roundtrippedDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discount),
                jacksonTypeRef<Discount>(),
            )

        assertThat(roundtrippedDiscount).isEqualTo(discount)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val discount = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Discount>())

        val e = assertThrows<OrbInvalidDataException> { discount.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
