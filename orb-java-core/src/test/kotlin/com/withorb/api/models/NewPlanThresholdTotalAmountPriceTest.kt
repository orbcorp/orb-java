// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanThresholdTotalAmountPriceTest {

    @Test
    fun create() {
        val newPlanThresholdTotalAmountPrice =
            NewPlanThresholdTotalAmountPrice.builder()
                .cadence(NewPlanThresholdTotalAmountPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanThresholdTotalAmountPrice.ModelType.THRESHOLD_TOTAL_AMOUNT)
                .name("Annual fee")
                .thresholdTotalAmountConfig(
                    NewPlanThresholdTotalAmountPrice.ThresholdTotalAmountConfig.builder()
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
                    NewPlanThresholdTotalAmountPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newPlanThresholdTotalAmountPrice.cadence())
            .isEqualTo(NewPlanThresholdTotalAmountPrice.Cadence.ANNUAL)
        assertThat(newPlanThresholdTotalAmountPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanThresholdTotalAmountPrice.modelType())
            .isEqualTo(NewPlanThresholdTotalAmountPrice.ModelType.THRESHOLD_TOTAL_AMOUNT)
        assertThat(newPlanThresholdTotalAmountPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanThresholdTotalAmountPrice.thresholdTotalAmountConfig())
            .isEqualTo(
                NewPlanThresholdTotalAmountPrice.ThresholdTotalAmountConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanThresholdTotalAmountPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newPlanThresholdTotalAmountPrice.billedInAdvance()).contains(true)
        assertThat(newPlanThresholdTotalAmountPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanThresholdTotalAmountPrice.conversionRate()).contains(0.0)
        assertThat(newPlanThresholdTotalAmountPrice.conversionRateConfig())
            .contains(
                NewPlanThresholdTotalAmountPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanThresholdTotalAmountPrice.currency()).contains("currency")
        assertThat(newPlanThresholdTotalAmountPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanThresholdTotalAmountPrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanThresholdTotalAmountPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanThresholdTotalAmountPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanThresholdTotalAmountPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanThresholdTotalAmountPrice.metadata())
            .contains(
                NewPlanThresholdTotalAmountPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newPlanThresholdTotalAmountPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanThresholdTotalAmountPrice =
            NewPlanThresholdTotalAmountPrice.builder()
                .cadence(NewPlanThresholdTotalAmountPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanThresholdTotalAmountPrice.ModelType.THRESHOLD_TOTAL_AMOUNT)
                .name("Annual fee")
                .thresholdTotalAmountConfig(
                    NewPlanThresholdTotalAmountPrice.ThresholdTotalAmountConfig.builder()
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
                    NewPlanThresholdTotalAmountPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewPlanThresholdTotalAmountPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanThresholdTotalAmountPrice),
                jacksonTypeRef<NewPlanThresholdTotalAmountPrice>(),
            )

        assertThat(roundtrippedNewPlanThresholdTotalAmountPrice)
            .isEqualTo(newPlanThresholdTotalAmountPrice)
    }
}
