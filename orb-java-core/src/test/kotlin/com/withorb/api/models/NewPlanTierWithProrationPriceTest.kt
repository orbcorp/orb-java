// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanTierWithProrationPriceTest {

    @Test
    fun create() {
        val newPlanTierWithProrationPrice =
            NewPlanTierWithProrationPrice.builder()
                .cadence(NewPlanTierWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTierWithProrationPrice.ModelType.TIERED_WITH_PRORATION)
                .name("Annual fee")
                .tieredWithProrationConfig(
                    NewPlanTierWithProrationPrice.TieredWithProrationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                    NewPlanTierWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanTierWithProrationPrice.cadence())
            .isEqualTo(NewPlanTierWithProrationPrice.Cadence.ANNUAL)
        assertThat(newPlanTierWithProrationPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanTierWithProrationPrice.modelType())
            .isEqualTo(NewPlanTierWithProrationPrice.ModelType.TIERED_WITH_PRORATION)
        assertThat(newPlanTierWithProrationPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanTierWithProrationPrice.tieredWithProrationConfig())
            .isEqualTo(
                NewPlanTierWithProrationPrice.TieredWithProrationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanTierWithProrationPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newPlanTierWithProrationPrice.billedInAdvance()).contains(true)
        assertThat(newPlanTierWithProrationPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTierWithProrationPrice.conversionRate()).contains(0.0)
        assertThat(newPlanTierWithProrationPrice.conversionRateConfig())
            .contains(
                NewPlanTierWithProrationPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanTierWithProrationPrice.currency()).contains("currency")
        assertThat(newPlanTierWithProrationPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanTierWithProrationPrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanTierWithProrationPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanTierWithProrationPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanTierWithProrationPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTierWithProrationPrice.metadata())
            .contains(
                NewPlanTierWithProrationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanTierWithProrationPrice =
            NewPlanTierWithProrationPrice.builder()
                .cadence(NewPlanTierWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTierWithProrationPrice.ModelType.TIERED_WITH_PRORATION)
                .name("Annual fee")
                .tieredWithProrationConfig(
                    NewPlanTierWithProrationPrice.TieredWithProrationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                    NewPlanTierWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanTierWithProrationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanTierWithProrationPrice),
                jacksonTypeRef<NewPlanTierWithProrationPrice>(),
            )

        assertThat(roundtrippedNewPlanTierWithProrationPrice)
            .isEqualTo(newPlanTierWithProrationPrice)
    }
}
