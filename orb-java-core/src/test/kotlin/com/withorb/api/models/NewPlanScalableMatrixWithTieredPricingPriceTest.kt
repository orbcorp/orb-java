// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanScalableMatrixWithTieredPricingPriceTest {

    @Test
    fun create() {
        val newPlanScalableMatrixWithTieredPricingPrice =
            NewPlanScalableMatrixWithTieredPricingPrice.builder()
                .cadence(NewPlanScalableMatrixWithTieredPricingPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewPlanScalableMatrixWithTieredPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_TIERED_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithTieredPricingConfig(
                    NewPlanScalableMatrixWithTieredPricingPrice
                        .ScalableMatrixWithTieredPricingConfig
                        .builder()
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
                    NewPlanScalableMatrixWithTieredPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanScalableMatrixWithTieredPricingPrice.cadence())
            .isEqualTo(NewPlanScalableMatrixWithTieredPricingPrice.Cadence.ANNUAL)
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.modelType())
            .isEqualTo(
                NewPlanScalableMatrixWithTieredPricingPrice.ModelType
                    .SCALABLE_MATRIX_WITH_TIERED_PRICING
            )
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.name()).isEqualTo("Annual fee")
        assertThat(
                newPlanScalableMatrixWithTieredPricingPrice.scalableMatrixWithTieredPricingConfig()
            )
            .isEqualTo(
                NewPlanScalableMatrixWithTieredPricingPrice.ScalableMatrixWithTieredPricingConfig
                    .builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.billedInAdvance()).contains(true)
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.conversionRate()).contains(0.0)
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.conversionRateConfig())
            .contains(
                NewPlanScalableMatrixWithTieredPricingPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.currency()).contains("currency")
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanScalableMatrixWithTieredPricingPrice.metadata())
            .contains(
                NewPlanScalableMatrixWithTieredPricingPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanScalableMatrixWithTieredPricingPrice =
            NewPlanScalableMatrixWithTieredPricingPrice.builder()
                .cadence(NewPlanScalableMatrixWithTieredPricingPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewPlanScalableMatrixWithTieredPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_TIERED_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithTieredPricingConfig(
                    NewPlanScalableMatrixWithTieredPricingPrice
                        .ScalableMatrixWithTieredPricingConfig
                        .builder()
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
                    NewPlanScalableMatrixWithTieredPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanScalableMatrixWithTieredPricingPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanScalableMatrixWithTieredPricingPrice),
                jacksonTypeRef<NewPlanScalableMatrixWithTieredPricingPrice>(),
            )

        assertThat(roundtrippedNewPlanScalableMatrixWithTieredPricingPrice)
            .isEqualTo(newPlanScalableMatrixWithTieredPricingPrice)
    }
}
