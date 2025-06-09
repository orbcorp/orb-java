// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingThresholdTotalAmountPriceTest {

    @Test
    fun create() {
        val newFloatingThresholdTotalAmountPrice =
            NewFloatingThresholdTotalAmountPrice.builder()
                .cadence(NewFloatingThresholdTotalAmountPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingThresholdTotalAmountPrice.ModelType.THRESHOLD_TOTAL_AMOUNT)
                .name("Annual fee")
                .thresholdTotalAmountConfig(
                    NewFloatingThresholdTotalAmountPrice.ThresholdTotalAmountConfig.builder()
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
                    NewFloatingThresholdTotalAmountPrice.ConversionRateConfig.Unit.UnitConfig
                        .builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewFloatingThresholdTotalAmountPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingThresholdTotalAmountPrice.cadence())
            .isEqualTo(NewFloatingThresholdTotalAmountPrice.Cadence.ANNUAL)
        assertThat(newFloatingThresholdTotalAmountPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingThresholdTotalAmountPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingThresholdTotalAmountPrice.modelType())
            .isEqualTo(NewFloatingThresholdTotalAmountPrice.ModelType.THRESHOLD_TOTAL_AMOUNT)
        assertThat(newFloatingThresholdTotalAmountPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingThresholdTotalAmountPrice.thresholdTotalAmountConfig())
            .isEqualTo(
                NewFloatingThresholdTotalAmountPrice.ThresholdTotalAmountConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingThresholdTotalAmountPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newFloatingThresholdTotalAmountPrice.billedInAdvance()).contains(true)
        assertThat(newFloatingThresholdTotalAmountPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingThresholdTotalAmountPrice.conversionRate()).contains(0.0)
        assertThat(newFloatingThresholdTotalAmountPrice.conversionRateConfig())
            .contains(
                NewFloatingThresholdTotalAmountPrice.ConversionRateConfig.ofUnit(
                    NewFloatingThresholdTotalAmountPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewFloatingThresholdTotalAmountPrice.ConversionRateConfig.Unit
                                .UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingThresholdTotalAmountPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingThresholdTotalAmountPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newFloatingThresholdTotalAmountPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newFloatingThresholdTotalAmountPrice.invoiceGroupingKey()).contains("x")
        assertThat(newFloatingThresholdTotalAmountPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingThresholdTotalAmountPrice.metadata())
            .contains(
                NewFloatingThresholdTotalAmountPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingThresholdTotalAmountPrice =
            NewFloatingThresholdTotalAmountPrice.builder()
                .cadence(NewFloatingThresholdTotalAmountPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingThresholdTotalAmountPrice.ModelType.THRESHOLD_TOTAL_AMOUNT)
                .name("Annual fee")
                .thresholdTotalAmountConfig(
                    NewFloatingThresholdTotalAmountPrice.ThresholdTotalAmountConfig.builder()
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
                    NewFloatingThresholdTotalAmountPrice.ConversionRateConfig.Unit.UnitConfig
                        .builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewFloatingThresholdTotalAmountPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingThresholdTotalAmountPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingThresholdTotalAmountPrice),
                jacksonTypeRef<NewFloatingThresholdTotalAmountPrice>(),
            )

        assertThat(roundtrippedNewFloatingThresholdTotalAmountPrice)
            .isEqualTo(newFloatingThresholdTotalAmountPrice)
    }
}
