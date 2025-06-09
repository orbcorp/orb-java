// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingTieredPackageWithMinimumPriceTest {

    @Test
    fun create() {
        val newFloatingTieredPackageWithMinimumPrice =
            NewFloatingTieredPackageWithMinimumPrice.builder()
                .cadence(NewFloatingTieredPackageWithMinimumPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(
                    NewFloatingTieredPackageWithMinimumPrice.ModelType.TIERED_PACKAGE_WITH_MINIMUM
                )
                .name("Annual fee")
                .tieredPackageWithMinimumConfig(
                    NewFloatingTieredPackageWithMinimumPrice.TieredPackageWithMinimumConfig
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
                    NewFloatingTieredPackageWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingTieredPackageWithMinimumPrice.cadence())
            .isEqualTo(NewFloatingTieredPackageWithMinimumPrice.Cadence.ANNUAL)
        assertThat(newFloatingTieredPackageWithMinimumPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingTieredPackageWithMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingTieredPackageWithMinimumPrice.modelType())
            .isEqualTo(
                NewFloatingTieredPackageWithMinimumPrice.ModelType.TIERED_PACKAGE_WITH_MINIMUM
            )
        assertThat(newFloatingTieredPackageWithMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingTieredPackageWithMinimumPrice.tieredPackageWithMinimumConfig())
            .isEqualTo(
                NewFloatingTieredPackageWithMinimumPrice.TieredPackageWithMinimumConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingTieredPackageWithMinimumPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newFloatingTieredPackageWithMinimumPrice.billedInAdvance()).contains(true)
        assertThat(newFloatingTieredPackageWithMinimumPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredPackageWithMinimumPrice.conversionRate()).contains(0.0)
        assertThat(newFloatingTieredPackageWithMinimumPrice.conversionRateConfig())
            .contains(
                NewFloatingTieredPackageWithMinimumPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingTieredPackageWithMinimumPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingTieredPackageWithMinimumPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newFloatingTieredPackageWithMinimumPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newFloatingTieredPackageWithMinimumPrice.invoiceGroupingKey()).contains("x")
        assertThat(newFloatingTieredPackageWithMinimumPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredPackageWithMinimumPrice.metadata())
            .contains(
                NewFloatingTieredPackageWithMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingTieredPackageWithMinimumPrice =
            NewFloatingTieredPackageWithMinimumPrice.builder()
                .cadence(NewFloatingTieredPackageWithMinimumPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(
                    NewFloatingTieredPackageWithMinimumPrice.ModelType.TIERED_PACKAGE_WITH_MINIMUM
                )
                .name("Annual fee")
                .tieredPackageWithMinimumConfig(
                    NewFloatingTieredPackageWithMinimumPrice.TieredPackageWithMinimumConfig
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
                    NewFloatingTieredPackageWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingTieredPackageWithMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingTieredPackageWithMinimumPrice),
                jacksonTypeRef<NewFloatingTieredPackageWithMinimumPrice>(),
            )

        assertThat(roundtrippedNewFloatingTieredPackageWithMinimumPrice)
            .isEqualTo(newFloatingTieredPackageWithMinimumPrice)
    }
}
