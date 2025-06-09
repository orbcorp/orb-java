// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanCumulativeGroupedBulkPriceTest {

    @Test
    fun create() {
        val newPlanCumulativeGroupedBulkPrice =
            NewPlanCumulativeGroupedBulkPrice.builder()
                .cadence(NewPlanCumulativeGroupedBulkPrice.Cadence.ANNUAL)
                .cumulativeGroupedBulkConfig(
                    NewPlanCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewPlanCumulativeGroupedBulkPrice.ModelType.CUMULATIVE_GROUPED_BULK)
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
                    NewPlanCumulativeGroupedBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanCumulativeGroupedBulkPrice.cadence())
            .isEqualTo(NewPlanCumulativeGroupedBulkPrice.Cadence.ANNUAL)
        assertThat(newPlanCumulativeGroupedBulkPrice.cumulativeGroupedBulkConfig())
            .isEqualTo(
                NewPlanCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanCumulativeGroupedBulkPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanCumulativeGroupedBulkPrice.modelType())
            .isEqualTo(NewPlanCumulativeGroupedBulkPrice.ModelType.CUMULATIVE_GROUPED_BULK)
        assertThat(newPlanCumulativeGroupedBulkPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanCumulativeGroupedBulkPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newPlanCumulativeGroupedBulkPrice.billedInAdvance()).contains(true)
        assertThat(newPlanCumulativeGroupedBulkPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanCumulativeGroupedBulkPrice.conversionRate()).contains(0.0)
        assertThat(newPlanCumulativeGroupedBulkPrice.conversionRateConfig())
            .contains(
                NewPlanCumulativeGroupedBulkPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanCumulativeGroupedBulkPrice.currency()).contains("currency")
        assertThat(newPlanCumulativeGroupedBulkPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanCumulativeGroupedBulkPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newPlanCumulativeGroupedBulkPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanCumulativeGroupedBulkPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanCumulativeGroupedBulkPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanCumulativeGroupedBulkPrice.metadata())
            .contains(
                NewPlanCumulativeGroupedBulkPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanCumulativeGroupedBulkPrice =
            NewPlanCumulativeGroupedBulkPrice.builder()
                .cadence(NewPlanCumulativeGroupedBulkPrice.Cadence.ANNUAL)
                .cumulativeGroupedBulkConfig(
                    NewPlanCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewPlanCumulativeGroupedBulkPrice.ModelType.CUMULATIVE_GROUPED_BULK)
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
                    NewPlanCumulativeGroupedBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanCumulativeGroupedBulkPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanCumulativeGroupedBulkPrice),
                jacksonTypeRef<NewPlanCumulativeGroupedBulkPrice>(),
            )

        assertThat(roundtrippedNewPlanCumulativeGroupedBulkPrice)
            .isEqualTo(newPlanCumulativeGroupedBulkPrice)
    }
}
