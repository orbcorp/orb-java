// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionThresholdTotalAmountPriceTest {

    @Test
    fun create() {
        val newSubscriptionThresholdTotalAmountPrice =
            NewSubscriptionThresholdTotalAmountPrice.builder()
                .cadence(NewSubscriptionThresholdTotalAmountPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewSubscriptionThresholdTotalAmountPrice.ModelType.THRESHOLD_TOTAL_AMOUNT
                )
                .name("Annual fee")
                .thresholdTotalAmountConfig(
                    NewSubscriptionThresholdTotalAmountPrice.ThresholdTotalAmountConfig.builder()
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
                    NewSubscriptionThresholdTotalAmountPrice.ConversionRateConfig.Unit.UnitConfig
                        .builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewSubscriptionThresholdTotalAmountPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionThresholdTotalAmountPrice.cadence())
            .isEqualTo(NewSubscriptionThresholdTotalAmountPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionThresholdTotalAmountPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionThresholdTotalAmountPrice.modelType())
            .isEqualTo(NewSubscriptionThresholdTotalAmountPrice.ModelType.THRESHOLD_TOTAL_AMOUNT)
        assertThat(newSubscriptionThresholdTotalAmountPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionThresholdTotalAmountPrice.thresholdTotalAmountConfig())
            .isEqualTo(
                NewSubscriptionThresholdTotalAmountPrice.ThresholdTotalAmountConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionThresholdTotalAmountPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionThresholdTotalAmountPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionThresholdTotalAmountPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionThresholdTotalAmountPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionThresholdTotalAmountPrice.conversionRateConfig())
            .contains(
                NewSubscriptionThresholdTotalAmountPrice.ConversionRateConfig.ofUnit(
                    NewSubscriptionThresholdTotalAmountPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewSubscriptionThresholdTotalAmountPrice.ConversionRateConfig.Unit
                                .UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionThresholdTotalAmountPrice.currency()).contains("currency")
        assertThat(newSubscriptionThresholdTotalAmountPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionThresholdTotalAmountPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionThresholdTotalAmountPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionThresholdTotalAmountPrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionThresholdTotalAmountPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionThresholdTotalAmountPrice.metadata())
            .contains(
                NewSubscriptionThresholdTotalAmountPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionThresholdTotalAmountPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionThresholdTotalAmountPrice =
            NewSubscriptionThresholdTotalAmountPrice.builder()
                .cadence(NewSubscriptionThresholdTotalAmountPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewSubscriptionThresholdTotalAmountPrice.ModelType.THRESHOLD_TOTAL_AMOUNT
                )
                .name("Annual fee")
                .thresholdTotalAmountConfig(
                    NewSubscriptionThresholdTotalAmountPrice.ThresholdTotalAmountConfig.builder()
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
                    NewSubscriptionThresholdTotalAmountPrice.ConversionRateConfig.Unit.UnitConfig
                        .builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewSubscriptionThresholdTotalAmountPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionThresholdTotalAmountPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionThresholdTotalAmountPrice),
                jacksonTypeRef<NewSubscriptionThresholdTotalAmountPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionThresholdTotalAmountPrice)
            .isEqualTo(newSubscriptionThresholdTotalAmountPrice)
    }
}
