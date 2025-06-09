// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanGroupedTieredPackagePriceTest {

    @Test
    fun create() {
        val newPlanGroupedTieredPackagePrice =
            NewPlanGroupedTieredPackagePrice.builder()
                .cadence(NewPlanGroupedTieredPackagePrice.Cadence.ANNUAL)
                .groupedTieredPackageConfig(
                    NewPlanGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewPlanGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE)
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
                    NewPlanGroupedTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanGroupedTieredPackagePrice.cadence())
            .isEqualTo(NewPlanGroupedTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newPlanGroupedTieredPackagePrice.groupedTieredPackageConfig())
            .isEqualTo(
                NewPlanGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanGroupedTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanGroupedTieredPackagePrice.modelType())
            .isEqualTo(NewPlanGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE)
        assertThat(newPlanGroupedTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanGroupedTieredPackagePrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newPlanGroupedTieredPackagePrice.billedInAdvance()).contains(true)
        assertThat(newPlanGroupedTieredPackagePrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedTieredPackagePrice.conversionRate()).contains(0.0)
        assertThat(newPlanGroupedTieredPackagePrice.currency()).contains("currency")
        assertThat(newPlanGroupedTieredPackagePrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanGroupedTieredPackagePrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanGroupedTieredPackagePrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanGroupedTieredPackagePrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanGroupedTieredPackagePrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanGroupedTieredPackagePrice.metadata())
            .contains(
                NewPlanGroupedTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanGroupedTieredPackagePrice =
            NewPlanGroupedTieredPackagePrice.builder()
                .cadence(NewPlanGroupedTieredPackagePrice.Cadence.ANNUAL)
                .groupedTieredPackageConfig(
                    NewPlanGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(NewPlanGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE)
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
                    NewPlanGroupedTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanGroupedTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanGroupedTieredPackagePrice),
                jacksonTypeRef<NewPlanGroupedTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewPlanGroupedTieredPackagePrice)
            .isEqualTo(newPlanGroupedTieredPackagePrice)
    }
}
