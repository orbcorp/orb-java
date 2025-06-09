// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingPackageWithAllocationPriceTest {

    @Test
    fun create() {
        val newFloatingPackageWithAllocationPrice =
            NewFloatingPackageWithAllocationPrice.builder()
                .cadence(NewFloatingPackageWithAllocationPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingPackageWithAllocationPrice.ModelType.PACKAGE_WITH_ALLOCATION)
                .name("Annual fee")
                .packageWithAllocationConfig(
                    NewFloatingPackageWithAllocationPrice.PackageWithAllocationConfig.builder()
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
                    NewFloatingPackageWithAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingPackageWithAllocationPrice.cadence())
            .isEqualTo(NewFloatingPackageWithAllocationPrice.Cadence.ANNUAL)
        assertThat(newFloatingPackageWithAllocationPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingPackageWithAllocationPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingPackageWithAllocationPrice.modelType())
            .isEqualTo(NewFloatingPackageWithAllocationPrice.ModelType.PACKAGE_WITH_ALLOCATION)
        assertThat(newFloatingPackageWithAllocationPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingPackageWithAllocationPrice.packageWithAllocationConfig())
            .isEqualTo(
                NewFloatingPackageWithAllocationPrice.PackageWithAllocationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingPackageWithAllocationPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newFloatingPackageWithAllocationPrice.billedInAdvance()).contains(true)
        assertThat(newFloatingPackageWithAllocationPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingPackageWithAllocationPrice.conversionRate()).contains(0.0)
        assertThat(newFloatingPackageWithAllocationPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingPackageWithAllocationPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newFloatingPackageWithAllocationPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newFloatingPackageWithAllocationPrice.invoiceGroupingKey()).contains("x")
        assertThat(newFloatingPackageWithAllocationPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingPackageWithAllocationPrice.metadata())
            .contains(
                NewFloatingPackageWithAllocationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingPackageWithAllocationPrice =
            NewFloatingPackageWithAllocationPrice.builder()
                .cadence(NewFloatingPackageWithAllocationPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingPackageWithAllocationPrice.ModelType.PACKAGE_WITH_ALLOCATION)
                .name("Annual fee")
                .packageWithAllocationConfig(
                    NewFloatingPackageWithAllocationPrice.PackageWithAllocationConfig.builder()
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
                    NewFloatingPackageWithAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingPackageWithAllocationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingPackageWithAllocationPrice),
                jacksonTypeRef<NewFloatingPackageWithAllocationPrice>(),
            )

        assertThat(roundtrippedNewFloatingPackageWithAllocationPrice)
            .isEqualTo(newFloatingPackageWithAllocationPrice)
    }
}
