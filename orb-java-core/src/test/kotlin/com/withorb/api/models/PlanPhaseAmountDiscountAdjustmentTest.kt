// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanPhaseAmountDiscountAdjustmentTest {

    @Test
    fun create() {
        val planPhaseAmountDiscountAdjustment =
            PlanPhaseAmountDiscountAdjustment.builder()
                .id("id")
                .adjustmentType(PlanPhaseAmountDiscountAdjustment.AdjustmentType.AMOUNT_DISCOUNT)
                .amountDiscount("amount_discount")
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .planPhaseOrder(0L)
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .build()

        assertThat(planPhaseAmountDiscountAdjustment.id()).isEqualTo("id")
        assertThat(planPhaseAmountDiscountAdjustment.adjustmentType())
            .isEqualTo(PlanPhaseAmountDiscountAdjustment.AdjustmentType.AMOUNT_DISCOUNT)
        assertThat(planPhaseAmountDiscountAdjustment.amountDiscount()).isEqualTo("amount_discount")
        assertThat(planPhaseAmountDiscountAdjustment.appliesToPriceIds()).containsExactly("string")
        assertThat(planPhaseAmountDiscountAdjustment.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(planPhaseAmountDiscountAdjustment.isInvoiceLevel()).isEqualTo(true)
        assertThat(planPhaseAmountDiscountAdjustment.planPhaseOrder()).contains(0L)
        assertThat(planPhaseAmountDiscountAdjustment.reason()).contains("reason")
        assertThat(planPhaseAmountDiscountAdjustment.replacesAdjustmentId())
            .contains("replaces_adjustment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planPhaseAmountDiscountAdjustment =
            PlanPhaseAmountDiscountAdjustment.builder()
                .id("id")
                .adjustmentType(PlanPhaseAmountDiscountAdjustment.AdjustmentType.AMOUNT_DISCOUNT)
                .amountDiscount("amount_discount")
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .planPhaseOrder(0L)
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .build()

        val roundtrippedPlanPhaseAmountDiscountAdjustment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planPhaseAmountDiscountAdjustment),
                jacksonTypeRef<PlanPhaseAmountDiscountAdjustment>(),
            )

        assertThat(roundtrippedPlanPhaseAmountDiscountAdjustment)
            .isEqualTo(planPhaseAmountDiscountAdjustment)
    }
}
