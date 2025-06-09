// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingCumulativeGroupedBulkPriceTest {

    @Test
    fun create() {
        val newFloatingCumulativeGroupedBulkPrice =
            NewFloatingCumulativeGroupedBulkPrice.builder()
                .cadence(NewFloatingCumulativeGroupedBulkPrice.Cadence.ANNUAL)
                .cumulativeGroupedBulkConfig(
                    NewFloatingCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingCumulativeGroupedBulkPrice.ModelType.CUMULATIVE_GROUPED_BULK)
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
                    NewFloatingCumulativeGroupedBulkPrice.ConversionRateConfig.Unit.UnitConfig
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
                    NewFloatingCumulativeGroupedBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingCumulativeGroupedBulkPrice.cadence())
            .isEqualTo(NewFloatingCumulativeGroupedBulkPrice.Cadence.ANNUAL)
        assertThat(newFloatingCumulativeGroupedBulkPrice.cumulativeGroupedBulkConfig())
            .isEqualTo(
                NewFloatingCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingCumulativeGroupedBulkPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingCumulativeGroupedBulkPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingCumulativeGroupedBulkPrice.modelType())
            .isEqualTo(NewFloatingCumulativeGroupedBulkPrice.ModelType.CUMULATIVE_GROUPED_BULK)
        assertThat(newFloatingCumulativeGroupedBulkPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingCumulativeGroupedBulkPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newFloatingCumulativeGroupedBulkPrice.billedInAdvance()).contains(true)
        assertThat(newFloatingCumulativeGroupedBulkPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingCumulativeGroupedBulkPrice.conversionRate()).contains(0.0)
        assertThat(newFloatingCumulativeGroupedBulkPrice.conversionRateConfig())
            .contains(
                NewFloatingCumulativeGroupedBulkPrice.ConversionRateConfig.ofUnit(
                    NewFloatingCumulativeGroupedBulkPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewFloatingCumulativeGroupedBulkPrice.ConversionRateConfig.Unit
                                .UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingCumulativeGroupedBulkPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingCumulativeGroupedBulkPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newFloatingCumulativeGroupedBulkPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newFloatingCumulativeGroupedBulkPrice.invoiceGroupingKey()).contains("x")
        assertThat(newFloatingCumulativeGroupedBulkPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingCumulativeGroupedBulkPrice.metadata())
            .contains(
                NewFloatingCumulativeGroupedBulkPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingCumulativeGroupedBulkPrice =
            NewFloatingCumulativeGroupedBulkPrice.builder()
                .cadence(NewFloatingCumulativeGroupedBulkPrice.Cadence.ANNUAL)
                .cumulativeGroupedBulkConfig(
                    NewFloatingCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingCumulativeGroupedBulkPrice.ModelType.CUMULATIVE_GROUPED_BULK)
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
                    NewFloatingCumulativeGroupedBulkPrice.ConversionRateConfig.Unit.UnitConfig
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
                    NewFloatingCumulativeGroupedBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingCumulativeGroupedBulkPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingCumulativeGroupedBulkPrice),
                jacksonTypeRef<NewFloatingCumulativeGroupedBulkPrice>(),
            )

        assertThat(roundtrippedNewFloatingCumulativeGroupedBulkPrice)
            .isEqualTo(newFloatingCumulativeGroupedBulkPrice)
    }
}
