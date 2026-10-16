// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertCreateForPlanParamsTest {

    @Test
    fun create() {
        AlertCreateForPlanParams.builder()
            .planId("plan_id")
            .addThreshold(Threshold.builder().value(0.0).build())
            .type(AlertCreateForPlanParams.Type.USAGE_EXCEEDED)
            .currency("currency")
            .addGroupingKey("string")
            .metricId("metric_id")
            .planVersion(0L)
            .addPriceFilter(
                AlertCreateForPlanParams.PriceFilter.builder()
                    .field(AlertCreateForPlanParams.PriceFilter.Field.PRICE_ID)
                    .operator(AlertCreateForPlanParams.PriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AlertCreateForPlanParams.builder()
                .planId("plan_id")
                .addThreshold(Threshold.builder().value(0.0).build())
                .type(AlertCreateForPlanParams.Type.USAGE_EXCEEDED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("plan_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AlertCreateForPlanParams.builder()
                .planId("plan_id")
                .addThreshold(Threshold.builder().value(0.0).build())
                .type(AlertCreateForPlanParams.Type.USAGE_EXCEEDED)
                .currency("currency")
                .addGroupingKey("string")
                .metricId("metric_id")
                .planVersion(0L)
                .addPriceFilter(
                    AlertCreateForPlanParams.PriceFilter.builder()
                        .field(AlertCreateForPlanParams.PriceFilter.Field.PRICE_ID)
                        .operator(AlertCreateForPlanParams.PriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.thresholds()).containsExactly(Threshold.builder().value(0.0).build())
        assertThat(body.type()).isEqualTo(AlertCreateForPlanParams.Type.USAGE_EXCEEDED)
        assertThat(body.currency()).contains("currency")
        assertThat(body.groupingKeys().getOrNull()).containsExactly("string")
        assertThat(body.metricId()).contains("metric_id")
        assertThat(body.planVersion()).contains(0L)
        assertThat(body.priceFilters().getOrNull())
            .containsExactly(
                AlertCreateForPlanParams.PriceFilter.builder()
                    .field(AlertCreateForPlanParams.PriceFilter.Field.PRICE_ID)
                    .operator(AlertCreateForPlanParams.PriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlertCreateForPlanParams.builder()
                .planId("plan_id")
                .addThreshold(Threshold.builder().value(0.0).build())
                .type(AlertCreateForPlanParams.Type.USAGE_EXCEEDED)
                .build()

        val body = params._body()

        assertThat(body.thresholds()).containsExactly(Threshold.builder().value(0.0).build())
        assertThat(body.type()).isEqualTo(AlertCreateForPlanParams.Type.USAGE_EXCEEDED)
    }
}
