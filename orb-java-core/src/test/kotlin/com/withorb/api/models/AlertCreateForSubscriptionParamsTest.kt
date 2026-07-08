// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertCreateForSubscriptionParamsTest {

    @Test
    fun create() {
        AlertCreateForSubscriptionParams.builder()
            .subscriptionId("subscription_id")
            .addThreshold(Threshold.builder().value(0.0).build())
            .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
            .currency("currency")
            .addGroupingKey("string")
            .metricId("metric_id")
            .addPriceFilter(
                AlertCreateForSubscriptionParams.PriceFilter.builder()
                    .field(AlertCreateForSubscriptionParams.PriceFilter.Field.PRICE_ID)
                    .operator(AlertCreateForSubscriptionParams.PriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
            .addThresholdOverride(
                AlertCreateForSubscriptionParams.ThresholdOverride.builder()
                    .addGroupValue("string")
                    .addThreshold(Threshold.builder().value(0.0).build())
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AlertCreateForSubscriptionParams.builder()
                .subscriptionId("subscription_id")
                .addThreshold(Threshold.builder().value(0.0).build())
                .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AlertCreateForSubscriptionParams.builder()
                .subscriptionId("subscription_id")
                .addThreshold(Threshold.builder().value(0.0).build())
                .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
                .currency("currency")
                .addGroupingKey("string")
                .metricId("metric_id")
                .addPriceFilter(
                    AlertCreateForSubscriptionParams.PriceFilter.builder()
                        .field(AlertCreateForSubscriptionParams.PriceFilter.Field.PRICE_ID)
                        .operator(AlertCreateForSubscriptionParams.PriceFilter.Operator.INCLUDES)
                        .addValue("string")
                        .build()
                )
                .addThresholdOverride(
                    AlertCreateForSubscriptionParams.ThresholdOverride.builder()
                        .addGroupValue("string")
                        .addThreshold(Threshold.builder().value(0.0).build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.thresholds()).containsExactly(Threshold.builder().value(0.0).build())
        assertThat(body.type()).isEqualTo(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
        assertThat(body.currency()).contains("currency")
        assertThat(body.groupingKeys().getOrNull()).containsExactly("string")
        assertThat(body.metricId()).contains("metric_id")
        assertThat(body.priceFilters().getOrNull())
            .containsExactly(
                AlertCreateForSubscriptionParams.PriceFilter.builder()
                    .field(AlertCreateForSubscriptionParams.PriceFilter.Field.PRICE_ID)
                    .operator(AlertCreateForSubscriptionParams.PriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(body.thresholdOverrides().getOrNull())
            .containsExactly(
                AlertCreateForSubscriptionParams.ThresholdOverride.builder()
                    .addGroupValue("string")
                    .addThreshold(Threshold.builder().value(0.0).build())
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlertCreateForSubscriptionParams.builder()
                .subscriptionId("subscription_id")
                .addThreshold(Threshold.builder().value(0.0).build())
                .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
                .build()

        val body = params._body()

        assertThat(body.thresholds()).containsExactly(Threshold.builder().value(0.0).build())
        assertThat(body.type()).isEqualTo(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
    }
}
