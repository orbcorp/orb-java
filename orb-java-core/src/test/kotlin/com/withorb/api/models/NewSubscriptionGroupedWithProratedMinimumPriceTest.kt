// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionGroupedWithProratedMinimumPriceTest {

    @Test
    fun create() {
        val newSubscriptionGroupedWithProratedMinimumPrice =
            NewSubscriptionGroupedWithProratedMinimumPrice.builder()
                .cadence(NewSubscriptionGroupedWithProratedMinimumPrice.Cadence.ANNUAL)
                .groupedWithProratedMinimumConfig(
                    NewSubscriptionGroupedWithProratedMinimumPrice.GroupedWithProratedMinimumConfig
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewSubscriptionGroupedWithProratedMinimumPrice.ModelType
                        .GROUPED_WITH_PRORATED_MINIMUM
                )
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
                    NewSubscriptionGroupedWithProratedMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.cadence())
            .isEqualTo(NewSubscriptionGroupedWithProratedMinimumPrice.Cadence.ANNUAL)
        assertThat(
                newSubscriptionGroupedWithProratedMinimumPrice.groupedWithProratedMinimumConfig()
            )
            .isEqualTo(
                NewSubscriptionGroupedWithProratedMinimumPrice.GroupedWithProratedMinimumConfig
                    .builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.modelType())
            .isEqualTo(
                NewSubscriptionGroupedWithProratedMinimumPrice.ModelType
                    .GROUPED_WITH_PRORATED_MINIMUM
            )
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.conversionRateConfig())
            .contains(
                NewSubscriptionGroupedWithProratedMinimumPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.currency()).contains("currency")
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.fixedPriceQuantity())
            .contains(0.0)
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.invoiceGroupingKey())
            .contains("x")
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.metadata())
            .contains(
                NewSubscriptionGroupedWithProratedMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionGroupedWithProratedMinimumPrice.referenceId())
            .contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionGroupedWithProratedMinimumPrice =
            NewSubscriptionGroupedWithProratedMinimumPrice.builder()
                .cadence(NewSubscriptionGroupedWithProratedMinimumPrice.Cadence.ANNUAL)
                .groupedWithProratedMinimumConfig(
                    NewSubscriptionGroupedWithProratedMinimumPrice.GroupedWithProratedMinimumConfig
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewSubscriptionGroupedWithProratedMinimumPrice.ModelType
                        .GROUPED_WITH_PRORATED_MINIMUM
                )
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
                    NewSubscriptionGroupedWithProratedMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionGroupedWithProratedMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionGroupedWithProratedMinimumPrice),
                jacksonTypeRef<NewSubscriptionGroupedWithProratedMinimumPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionGroupedWithProratedMinimumPrice)
            .isEqualTo(newSubscriptionGroupedWithProratedMinimumPrice)
    }
}
