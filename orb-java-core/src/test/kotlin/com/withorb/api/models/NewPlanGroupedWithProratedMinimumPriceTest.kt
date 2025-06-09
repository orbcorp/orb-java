// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanGroupedWithProratedMinimumPriceTest {

    @Test
    fun create() {
        val newPlanGroupedWithProratedMinimumPrice =
            NewPlanGroupedWithProratedMinimumPrice.builder()
                .cadence(NewPlanGroupedWithProratedMinimumPrice.Cadence.ANNUAL)
                .groupedWithProratedMinimumConfig(
                    NewPlanGroupedWithProratedMinimumPrice.GroupedWithProratedMinimumConfig
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewPlanGroupedWithProratedMinimumPrice.ModelType.GROUPED_WITH_PRORATED_MINIMUM
                )
                .name("Annual fee")
                .billableMetricId("billable_metric_id")
                .billedInAdvance(true)
                .billingCycleConfiguration(
                    NewBillingCycleConfiguration.builder()
                        .duration(0L)
                        .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                        .build()
                )
                .conversionRate(0.0)
                .currency("currency")
                .dimensionalPriceConfiguration(
                    NewDimensionalPriceConfiguration.builder()
                        .addDimensionValue("string")
                        .dimensionalPriceGroupId("dimensional_price_group_id")
                        .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                        .build()
                )
                .externalPriceId("external_price_id")
                .fixedPriceQuantity(0.0)
                .invoiceGroupingKey("x")
                .invoicingCycleConfiguration(
                    NewBillingCycleConfiguration.builder()
                        .duration(0L)
                        .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                        .build()
                )
                .metadata(
                    NewPlanGroupedWithProratedMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanGroupedWithProratedMinimumPrice.cadence())
            .isEqualTo(NewPlanGroupedWithProratedMinimumPrice.Cadence.ANNUAL)
        assertThat(newPlanGroupedWithProratedMinimumPrice.groupedWithProratedMinimumConfig())
            .isEqualTo(
                NewPlanGroupedWithProratedMinimumPrice.GroupedWithProratedMinimumConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanGroupedWithProratedMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanGroupedWithProratedMinimumPrice.modelType())
            .isEqualTo(
                NewPlanGroupedWithProratedMinimumPrice.ModelType.GROUPED_WITH_PRORATED_MINIMUM
            )
        assertThat(newPlanGroupedWithProratedMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanGroupedWithProratedMinimumPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newPlanGroupedWithProratedMinimumPrice.billedInAdvance()).contains(true)
        assertThat(newPlanGroupedWithProratedMinimumPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedWithProratedMinimumPrice.conversionRate()).contains(0.0)
        assertThat(newPlanGroupedWithProratedMinimumPrice.currency()).contains("currency")
        assertThat(newPlanGroupedWithProratedMinimumPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanGroupedWithProratedMinimumPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newPlanGroupedWithProratedMinimumPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanGroupedWithProratedMinimumPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanGroupedWithProratedMinimumPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedWithProratedMinimumPrice.metadata())
            .contains(
                NewPlanGroupedWithProratedMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanGroupedWithProratedMinimumPrice =
            NewPlanGroupedWithProratedMinimumPrice.builder()
                .cadence(NewPlanGroupedWithProratedMinimumPrice.Cadence.ANNUAL)
                .groupedWithProratedMinimumConfig(
                    NewPlanGroupedWithProratedMinimumPrice.GroupedWithProratedMinimumConfig
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewPlanGroupedWithProratedMinimumPrice.ModelType.GROUPED_WITH_PRORATED_MINIMUM
                )
                .name("Annual fee")
                .billableMetricId("billable_metric_id")
                .billedInAdvance(true)
                .billingCycleConfiguration(
                    NewBillingCycleConfiguration.builder()
                        .duration(0L)
                        .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                        .build()
                )
                .conversionRate(0.0)
                .currency("currency")
                .dimensionalPriceConfiguration(
                    NewDimensionalPriceConfiguration.builder()
                        .addDimensionValue("string")
                        .dimensionalPriceGroupId("dimensional_price_group_id")
                        .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                        .build()
                )
                .externalPriceId("external_price_id")
                .fixedPriceQuantity(0.0)
                .invoiceGroupingKey("x")
                .invoicingCycleConfiguration(
                    NewBillingCycleConfiguration.builder()
                        .duration(0L)
                        .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                        .build()
                )
                .metadata(
                    NewPlanGroupedWithProratedMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanGroupedWithProratedMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanGroupedWithProratedMinimumPrice),
                jacksonTypeRef<NewPlanGroupedWithProratedMinimumPrice>(),
            )

        assertThat(roundtrippedNewPlanGroupedWithProratedMinimumPrice)
            .isEqualTo(newPlanGroupedWithProratedMinimumPrice)
    }
}
