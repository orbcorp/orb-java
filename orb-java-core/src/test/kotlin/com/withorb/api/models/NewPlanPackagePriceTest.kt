// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanPackagePriceTest {

    @Test
    fun create() {
        val newPlanPackagePrice =
            NewPlanPackagePrice.builder()
                .cadence(NewPlanPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanPackagePrice.ModelType.PACKAGE)
                .name("Annual fee")
                .packageConfig(
                    PackageConfig.builder().packageAmount("package_amount").packageSize(0L).build()
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
                    NewPlanPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanPackagePrice.cadence()).isEqualTo(NewPlanPackagePrice.Cadence.ANNUAL)
        assertThat(newPlanPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanPackagePrice.modelType()).isEqualTo(NewPlanPackagePrice.ModelType.PACKAGE)
        assertThat(newPlanPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanPackagePrice.packageConfig())
            .isEqualTo(
                PackageConfig.builder().packageAmount("package_amount").packageSize(0L).build()
            )
        assertThat(newPlanPackagePrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newPlanPackagePrice.billedInAdvance()).contains(true)
        assertThat(newPlanPackagePrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanPackagePrice.conversionRate()).contains(0.0)
        assertThat(newPlanPackagePrice.currency()).contains("currency")
        assertThat(newPlanPackagePrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanPackagePrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanPackagePrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanPackagePrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanPackagePrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanPackagePrice.metadata())
            .contains(
                NewPlanPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanPackagePrice =
            NewPlanPackagePrice.builder()
                .cadence(NewPlanPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanPackagePrice.ModelType.PACKAGE)
                .name("Annual fee")
                .packageConfig(
                    PackageConfig.builder().packageAmount("package_amount").packageSize(0L).build()
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
                    NewPlanPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanPackagePrice),
                jacksonTypeRef<NewPlanPackagePrice>(),
            )

        assertThat(roundtrippedNewPlanPackagePrice).isEqualTo(newPlanPackagePrice)
    }
}
