// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingGroupedTieredPackagePriceTest {

    @Test
    fun create() {
        val newFloatingGroupedTieredPackagePrice =
            NewFloatingGroupedTieredPackagePrice.builder()
                .cadence(NewFloatingGroupedTieredPackagePrice.Cadence.ANNUAL)
                .currency("currency")
                .groupedTieredPackageConfig(
                    NewFloatingGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewFloatingGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE)
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
                    NewFloatingGroupedTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingGroupedTieredPackagePrice.cadence())
            .isEqualTo(NewFloatingGroupedTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newFloatingGroupedTieredPackagePrice.currency()).isEqualTo("currency")
        assertThat(newFloatingGroupedTieredPackagePrice.groupedTieredPackageConfig())
            .isEqualTo(
                NewFloatingGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingGroupedTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingGroupedTieredPackagePrice.modelType())
            .isEqualTo(NewFloatingGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE)
        assertThat(newFloatingGroupedTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingGroupedTieredPackagePrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newFloatingGroupedTieredPackagePrice.billedInAdvance()).contains(true)
        assertThat(newFloatingGroupedTieredPackagePrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingGroupedTieredPackagePrice.conversionRate()).contains(0.0)
        assertThat(newFloatingGroupedTieredPackagePrice.conversionRateConfig())
            .contains(
                NewFloatingGroupedTieredPackagePrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingGroupedTieredPackagePrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingGroupedTieredPackagePrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newFloatingGroupedTieredPackagePrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newFloatingGroupedTieredPackagePrice.invoiceGroupingKey()).contains("x")
        assertThat(newFloatingGroupedTieredPackagePrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingGroupedTieredPackagePrice.metadata())
            .contains(
                NewFloatingGroupedTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingGroupedTieredPackagePrice =
            NewFloatingGroupedTieredPackagePrice.builder()
                .cadence(NewFloatingGroupedTieredPackagePrice.Cadence.ANNUAL)
                .currency("currency")
                .groupedTieredPackageConfig(
                    NewFloatingGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewFloatingGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE)
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
                    NewFloatingGroupedTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingGroupedTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingGroupedTieredPackagePrice),
                jacksonTypeRef<NewFloatingGroupedTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewFloatingGroupedTieredPackagePrice)
            .isEqualTo(newFloatingGroupedTieredPackagePrice)
    }
}
