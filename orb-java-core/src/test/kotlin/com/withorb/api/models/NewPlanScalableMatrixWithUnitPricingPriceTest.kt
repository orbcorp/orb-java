// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanScalableMatrixWithUnitPricingPriceTest {

    @Test
    fun create() {
        val newPlanScalableMatrixWithUnitPricingPrice =
            NewPlanScalableMatrixWithUnitPricingPrice.builder()
                .cadence(NewPlanScalableMatrixWithUnitPricingPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewPlanScalableMatrixWithUnitPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_UNIT_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithUnitPricingConfig(
                    NewPlanScalableMatrixWithUnitPricingPrice.ScalableMatrixWithUnitPricingConfig
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
                    NewPlanScalableMatrixWithUnitPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanScalableMatrixWithUnitPricingPrice.cadence())
            .isEqualTo(NewPlanScalableMatrixWithUnitPricingPrice.Cadence.ANNUAL)
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.modelType())
            .isEqualTo(
                NewPlanScalableMatrixWithUnitPricingPrice.ModelType
                    .SCALABLE_MATRIX_WITH_UNIT_PRICING
            )
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.scalableMatrixWithUnitPricingConfig())
            .isEqualTo(
                NewPlanScalableMatrixWithUnitPricingPrice.ScalableMatrixWithUnitPricingConfig
                    .builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.billedInAdvance()).contains(true)
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.conversionRate()).contains(0.0)
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.conversionRateConfig())
            .contains(
                NewPlanScalableMatrixWithUnitPricingPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.currency()).contains("currency")
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.metadata())
            .contains(
                NewPlanScalableMatrixWithUnitPricingPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanScalableMatrixWithUnitPricingPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanScalableMatrixWithUnitPricingPrice =
            NewPlanScalableMatrixWithUnitPricingPrice.builder()
                .cadence(NewPlanScalableMatrixWithUnitPricingPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewPlanScalableMatrixWithUnitPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_UNIT_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithUnitPricingConfig(
                    NewPlanScalableMatrixWithUnitPricingPrice.ScalableMatrixWithUnitPricingConfig
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
                    NewPlanScalableMatrixWithUnitPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanScalableMatrixWithUnitPricingPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanScalableMatrixWithUnitPricingPrice),
                jacksonTypeRef<NewPlanScalableMatrixWithUnitPricingPrice>(),
            )

        assertThat(roundtrippedNewPlanScalableMatrixWithUnitPricingPrice)
            .isEqualTo(newPlanScalableMatrixWithUnitPricingPrice)
    }
}
