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

internal class InvoiceLevelDiscountTest {

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

        val invoiceLevelDiscount = InvoiceLevelDiscount.ofPercentage(percentage)

        assertThat(invoiceLevelDiscount.percentage()).contains(percentage)
        assertThat(invoiceLevelDiscount.amount()).isEmpty
        assertThat(invoiceLevelDiscount.trial()).isEmpty
    }

    @Test
    fun ofPercentageRoundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceLevelDiscount =
            InvoiceLevelDiscount.ofPercentage(
                PercentageDiscount.builder()
                    .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                    .percentageDiscount(0.15)
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .reason("reason")
                    .build()
            )

        val roundtrippedInvoiceLevelDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceLevelDiscount),
                jacksonTypeRef<InvoiceLevelDiscount>(),
            )

        assertThat(roundtrippedInvoiceLevelDiscount).isEqualTo(invoiceLevelDiscount)
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

        val invoiceLevelDiscount = InvoiceLevelDiscount.ofAmount(amount)

        assertThat(invoiceLevelDiscount.percentage()).isEmpty
        assertThat(invoiceLevelDiscount.amount()).contains(amount)
        assertThat(invoiceLevelDiscount.trial()).isEmpty
    }

    @Test
    fun ofAmountRoundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceLevelDiscount =
            InvoiceLevelDiscount.ofAmount(
                AmountDiscount.builder()
                    .amountDiscount("amount_discount")
                    .discountType(AmountDiscount.DiscountType.AMOUNT)
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .reason("reason")
                    .build()
            )

        val roundtrippedInvoiceLevelDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceLevelDiscount),
                jacksonTypeRef<InvoiceLevelDiscount>(),
            )

        assertThat(roundtrippedInvoiceLevelDiscount).isEqualTo(invoiceLevelDiscount)
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

        val invoiceLevelDiscount = InvoiceLevelDiscount.ofTrial(trial)

        assertThat(invoiceLevelDiscount.percentage()).isEmpty
        assertThat(invoiceLevelDiscount.amount()).isEmpty
        assertThat(invoiceLevelDiscount.trial()).contains(trial)
    }

    @Test
    fun ofTrialRoundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceLevelDiscount =
            InvoiceLevelDiscount.ofTrial(
                TrialDiscount.builder()
                    .discountType(TrialDiscount.DiscountType.TRIAL)
                    .addAppliesToPriceId("h74gfhdjvn7ujokd")
                    .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                    .reason("reason")
                    .trialAmountDiscount("trial_amount_discount")
                    .trialPercentageDiscount(0.0)
                    .build()
            )

        val roundtrippedInvoiceLevelDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceLevelDiscount),
                jacksonTypeRef<InvoiceLevelDiscount>(),
            )

        assertThat(roundtrippedInvoiceLevelDiscount).isEqualTo(invoiceLevelDiscount)
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
        val invoiceLevelDiscount =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<InvoiceLevelDiscount>())

        val e = assertThrows<OrbInvalidDataException> { invoiceLevelDiscount.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
