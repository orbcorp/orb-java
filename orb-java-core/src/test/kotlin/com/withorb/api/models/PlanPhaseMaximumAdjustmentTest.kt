// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanPhaseMaximumAdjustmentTest {

    @Test
    fun create() {
        val planPhaseMaximumAdjustment =
            PlanPhaseMaximumAdjustment.builder()
                .id("id")
                .adjustmentType(PlanPhaseMaximumAdjustment.AdjustmentType.MAXIMUM)
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .maximumAmount("maximum_amount")
                .planPhaseOrder(0L)
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .build()

        assertThat(planPhaseMaximumAdjustment.id()).isEqualTo("id")
        assertThat(planPhaseMaximumAdjustment.adjustmentType())
            .isEqualTo(PlanPhaseMaximumAdjustment.AdjustmentType.MAXIMUM)
        assertThat(planPhaseMaximumAdjustment.appliesToPriceIds()).containsExactly("string")
        assertThat(planPhaseMaximumAdjustment.filters())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(planPhaseMaximumAdjustment.isInvoiceLevel()).isEqualTo(true)
        assertThat(planPhaseMaximumAdjustment.maximumAmount()).isEqualTo("maximum_amount")
        assertThat(planPhaseMaximumAdjustment.planPhaseOrder()).contains(0L)
        assertThat(planPhaseMaximumAdjustment.reason()).contains("reason")
        assertThat(planPhaseMaximumAdjustment.replacesAdjustmentId())
            .contains("replaces_adjustment_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planPhaseMaximumAdjustment =
            PlanPhaseMaximumAdjustment.builder()
                .id("id")
                .adjustmentType(PlanPhaseMaximumAdjustment.AdjustmentType.MAXIMUM)
                .addAppliesToPriceId("string")
                .addFilter(
                    TransformPriceFilter.builder()
                        .field(TransformPriceFilter.Field.PRICE_ID)
                        .operator(TransformPriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .isInvoiceLevel(true)
                .maximumAmount("maximum_amount")
                .planPhaseOrder(0L)
                .reason("reason")
                .replacesAdjustmentId("replaces_adjustment_id")
                .build()

        val roundtrippedPlanPhaseMaximumAdjustment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planPhaseMaximumAdjustment),
                jacksonTypeRef<PlanPhaseMaximumAdjustment>(),
            )

        assertThat(roundtrippedPlanPhaseMaximumAdjustment).isEqualTo(planPhaseMaximumAdjustment)
    }
}
