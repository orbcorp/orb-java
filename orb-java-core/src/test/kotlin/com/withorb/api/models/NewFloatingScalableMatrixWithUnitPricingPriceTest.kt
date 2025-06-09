// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingScalableMatrixWithUnitPricingPriceTest {

    @Test
    fun create() {
        val newFloatingScalableMatrixWithUnitPricingPrice =
            NewFloatingScalableMatrixWithUnitPricingPrice.builder()
                .cadence(NewFloatingScalableMatrixWithUnitPricingPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(
                    NewFloatingScalableMatrixWithUnitPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_UNIT_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithUnitPricingConfig(
                    NewFloatingScalableMatrixWithUnitPricingPrice
                        .ScalableMatrixWithUnitPricingConfig
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
                    NewFloatingScalableMatrixWithUnitPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.cadence())
            .isEqualTo(NewFloatingScalableMatrixWithUnitPricingPrice.Cadence.ANNUAL)
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.modelType())
            .isEqualTo(
                NewFloatingScalableMatrixWithUnitPricingPrice.ModelType
                    .SCALABLE_MATRIX_WITH_UNIT_PRICING
            )
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.name()).isEqualTo("Annual fee")
        assertThat(
                newFloatingScalableMatrixWithUnitPricingPrice.scalableMatrixWithUnitPricingConfig()
            )
            .isEqualTo(
                NewFloatingScalableMatrixWithUnitPricingPrice.ScalableMatrixWithUnitPricingConfig
                    .builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.billedInAdvance()).contains(true)
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.conversionRate()).contains(0.0)
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.conversionRateConfig())
            .contains(
                NewFloatingScalableMatrixWithUnitPricingPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.invoiceGroupingKey()).contains("x")
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingScalableMatrixWithUnitPricingPrice.metadata())
            .contains(
                NewFloatingScalableMatrixWithUnitPricingPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingScalableMatrixWithUnitPricingPrice =
            NewFloatingScalableMatrixWithUnitPricingPrice.builder()
                .cadence(NewFloatingScalableMatrixWithUnitPricingPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(
                    NewFloatingScalableMatrixWithUnitPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_UNIT_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithUnitPricingConfig(
                    NewFloatingScalableMatrixWithUnitPricingPrice
                        .ScalableMatrixWithUnitPricingConfig
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
                    NewFloatingScalableMatrixWithUnitPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingScalableMatrixWithUnitPricingPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingScalableMatrixWithUnitPricingPrice),
                jacksonTypeRef<NewFloatingScalableMatrixWithUnitPricingPrice>(),
            )

        assertThat(roundtrippedNewFloatingScalableMatrixWithUnitPricingPrice)
            .isEqualTo(newFloatingScalableMatrixWithUnitPricingPrice)
    }
}
