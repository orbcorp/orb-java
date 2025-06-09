// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanGroupedTieredPriceTest {

    @Test
    fun create() {
        val newPlanGroupedTieredPrice =
            NewPlanGroupedTieredPrice.builder()
                .cadence(NewPlanGroupedTieredPrice.Cadence.ANNUAL)
                .groupedTieredConfig(
                    NewPlanGroupedTieredPrice.GroupedTieredConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewPlanGroupedTieredPrice.ModelType.GROUPED_TIERED)
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
                .unitConversionRateConfig(
                    ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                )
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
                    NewPlanGroupedTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanGroupedTieredPrice.cadence())
            .isEqualTo(NewPlanGroupedTieredPrice.Cadence.ANNUAL)
        assertThat(newPlanGroupedTieredPrice.groupedTieredConfig())
            .isEqualTo(
                NewPlanGroupedTieredPrice.GroupedTieredConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanGroupedTieredPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanGroupedTieredPrice.modelType())
            .isEqualTo(NewPlanGroupedTieredPrice.ModelType.GROUPED_TIERED)
        assertThat(newPlanGroupedTieredPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanGroupedTieredPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newPlanGroupedTieredPrice.billedInAdvance()).contains(true)
        assertThat(newPlanGroupedTieredPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedTieredPrice.conversionRate()).contains(0.0)
        assertThat(newPlanGroupedTieredPrice.conversionRateConfig())
            .contains(
                NewPlanGroupedTieredPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanGroupedTieredPrice.currency()).contains("currency")
        assertThat(newPlanGroupedTieredPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanGroupedTieredPrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanGroupedTieredPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanGroupedTieredPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanGroupedTieredPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedTieredPrice.metadata())
            .contains(
                NewPlanGroupedTieredPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanGroupedTieredPrice =
            NewPlanGroupedTieredPrice.builder()
                .cadence(NewPlanGroupedTieredPrice.Cadence.ANNUAL)
                .groupedTieredConfig(
                    NewPlanGroupedTieredPrice.GroupedTieredConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewPlanGroupedTieredPrice.ModelType.GROUPED_TIERED)
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
                .unitConversionRateConfig(
                    ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                )
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
                    NewPlanGroupedTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanGroupedTieredPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanGroupedTieredPrice),
                jacksonTypeRef<NewPlanGroupedTieredPrice>(),
            )

        assertThat(roundtrippedNewPlanGroupedTieredPrice).isEqualTo(newPlanGroupedTieredPrice)
    }
}
