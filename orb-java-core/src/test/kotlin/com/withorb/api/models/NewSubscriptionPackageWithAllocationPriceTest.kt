// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionPackageWithAllocationPriceTest {

    @Test
    fun create() {
        val newSubscriptionPackageWithAllocationPrice =
            NewSubscriptionPackageWithAllocationPrice.builder()
                .cadence(NewSubscriptionPackageWithAllocationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewSubscriptionPackageWithAllocationPrice.ModelType.PACKAGE_WITH_ALLOCATION
                )
                .name("Annual fee")
                .packageWithAllocationConfig(
                    NewSubscriptionPackageWithAllocationPrice.PackageWithAllocationConfig.builder()
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
                    NewSubscriptionPackageWithAllocationPrice.ConversionRateConfig.Unit.UnitConfig
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
                    NewSubscriptionPackageWithAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionPackageWithAllocationPrice.cadence())
            .isEqualTo(NewSubscriptionPackageWithAllocationPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionPackageWithAllocationPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionPackageWithAllocationPrice.modelType())
            .isEqualTo(NewSubscriptionPackageWithAllocationPrice.ModelType.PACKAGE_WITH_ALLOCATION)
        assertThat(newSubscriptionPackageWithAllocationPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionPackageWithAllocationPrice.packageWithAllocationConfig())
            .isEqualTo(
                NewSubscriptionPackageWithAllocationPrice.PackageWithAllocationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionPackageWithAllocationPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionPackageWithAllocationPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionPackageWithAllocationPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionPackageWithAllocationPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionPackageWithAllocationPrice.conversionRateConfig())
            .contains(
                NewSubscriptionPackageWithAllocationPrice.ConversionRateConfig.ofUnit(
                    NewSubscriptionPackageWithAllocationPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewSubscriptionPackageWithAllocationPrice.ConversionRateConfig.Unit
                                .UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionPackageWithAllocationPrice.currency()).contains("currency")
        assertThat(newSubscriptionPackageWithAllocationPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionPackageWithAllocationPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionPackageWithAllocationPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionPackageWithAllocationPrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionPackageWithAllocationPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionPackageWithAllocationPrice.metadata())
            .contains(
                NewSubscriptionPackageWithAllocationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionPackageWithAllocationPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionPackageWithAllocationPrice =
            NewSubscriptionPackageWithAllocationPrice.builder()
                .cadence(NewSubscriptionPackageWithAllocationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewSubscriptionPackageWithAllocationPrice.ModelType.PACKAGE_WITH_ALLOCATION
                )
                .name("Annual fee")
                .packageWithAllocationConfig(
                    NewSubscriptionPackageWithAllocationPrice.PackageWithAllocationConfig.builder()
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
                    NewSubscriptionPackageWithAllocationPrice.ConversionRateConfig.Unit.UnitConfig
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
                    NewSubscriptionPackageWithAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionPackageWithAllocationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionPackageWithAllocationPrice),
                jacksonTypeRef<NewSubscriptionPackageWithAllocationPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionPackageWithAllocationPrice)
            .isEqualTo(newSubscriptionPackageWithAllocationPrice)
    }
}
