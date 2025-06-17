// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanTieredPriceTest {

    @Test
    fun create() {
        val newPlanTieredPrice =
            NewPlanTieredPrice.builder()
                .cadence(NewPlanTieredPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTieredPrice.ModelType.TIERED)
                .name("Annual fee")
                .tieredConfig(
                    TieredConfig.builder()
                        .addTier(
                            Tier.builder()
                                .firstUnit(0.0)
                                .unitAmount("unit_amount")
                                .lastUnit(0.0)
                                .build()
                        )
                        .build()
                )
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
                    NewPlanTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanTieredPrice.cadence()).isEqualTo(NewPlanTieredPrice.Cadence.ANNUAL)
        assertThat(newPlanTieredPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanTieredPrice.modelType()).isEqualTo(NewPlanTieredPrice.ModelType.TIERED)
        assertThat(newPlanTieredPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanTieredPrice.tieredConfig())
            .isEqualTo(
                TieredConfig.builder()
                    .addTier(
                        Tier.builder()
                            .firstUnit(0.0)
                            .unitAmount("unit_amount")
                            .lastUnit(0.0)
                            .build()
                    )
                    .build()
            )
        assertThat(newPlanTieredPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newPlanTieredPrice.billedInAdvance()).contains(true)
        assertThat(newPlanTieredPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTieredPrice.conversionRate()).contains(0.0)
        assertThat(newPlanTieredPrice.conversionRateConfig())
            .contains(
                NewPlanTieredPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanTieredPrice.currency()).contains("currency")
        assertThat(newPlanTieredPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanTieredPrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanTieredPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanTieredPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanTieredPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTieredPrice.metadata())
            .contains(
                NewPlanTieredPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanTieredPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanTieredPrice =
            NewPlanTieredPrice.builder()
                .cadence(NewPlanTieredPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTieredPrice.ModelType.TIERED)
                .name("Annual fee")
                .tieredConfig(
                    TieredConfig.builder()
                        .addTier(
                            Tier.builder()
                                .firstUnit(0.0)
                                .unitAmount("unit_amount")
                                .lastUnit(0.0)
                                .build()
                        )
                        .build()
                )
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
                    NewPlanTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanTieredPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanTieredPrice),
                jacksonTypeRef<NewPlanTieredPrice>(),
            )

        assertThat(roundtrippedNewPlanTieredPrice).isEqualTo(newPlanTieredPrice)
    }
}
