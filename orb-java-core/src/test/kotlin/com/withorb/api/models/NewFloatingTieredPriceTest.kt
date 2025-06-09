// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingTieredPriceTest {

    @Test
    fun create() {
        val newFloatingTieredPrice =
            NewFloatingTieredPrice.builder()
                .cadence(NewFloatingTieredPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredPrice.ModelType.TIERED)
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
                    NewFloatingTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingTieredPrice.cadence())
            .isEqualTo(NewFloatingTieredPrice.Cadence.ANNUAL)
        assertThat(newFloatingTieredPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingTieredPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingTieredPrice.modelType())
            .isEqualTo(NewFloatingTieredPrice.ModelType.TIERED)
        assertThat(newFloatingTieredPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingTieredPrice.tieredConfig())
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
        assertThat(newFloatingTieredPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newFloatingTieredPrice.billedInAdvance()).contains(true)
        assertThat(newFloatingTieredPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredPrice.conversionRate()).contains(0.0)
        assertThat(newFloatingTieredPrice.conversionRateConfig())
            .contains(
                NewFloatingTieredPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingTieredPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingTieredPrice.externalPriceId()).contains("external_price_id")
        assertThat(newFloatingTieredPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newFloatingTieredPrice.invoiceGroupingKey()).contains("x")
        assertThat(newFloatingTieredPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredPrice.metadata())
            .contains(
                NewFloatingTieredPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingTieredPrice =
            NewFloatingTieredPrice.builder()
                .cadence(NewFloatingTieredPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredPrice.ModelType.TIERED)
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
                    NewFloatingTieredPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingTieredPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingTieredPrice),
                jacksonTypeRef<NewFloatingTieredPrice>(),
            )

        assertThat(roundtrippedNewFloatingTieredPrice).isEqualTo(newFloatingTieredPrice)
    }
}
