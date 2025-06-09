// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionGroupedTieredPackagePriceTest {

    @Test
    fun create() {
        val newSubscriptionGroupedTieredPackagePrice =
            NewSubscriptionGroupedTieredPackagePrice.builder()
                .cadence(NewSubscriptionGroupedTieredPackagePrice.Cadence.ANNUAL)
                .groupedTieredPackageConfig(
                    NewSubscriptionGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewSubscriptionGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE
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
                    NewSubscriptionGroupedTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionGroupedTieredPackagePrice.cadence())
            .isEqualTo(NewSubscriptionGroupedTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newSubscriptionGroupedTieredPackagePrice.groupedTieredPackageConfig())
            .isEqualTo(
                NewSubscriptionGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionGroupedTieredPackagePrice.modelType())
            .isEqualTo(NewSubscriptionGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE)
        assertThat(newSubscriptionGroupedTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionGroupedTieredPackagePrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionGroupedTieredPackagePrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionGroupedTieredPackagePrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPackagePrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionGroupedTieredPackagePrice.currency()).contains("currency")
        assertThat(newSubscriptionGroupedTieredPackagePrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPackagePrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionGroupedTieredPackagePrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionGroupedTieredPackagePrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionGroupedTieredPackagePrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPackagePrice.metadata())
            .contains(
                NewSubscriptionGroupedTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionGroupedTieredPackagePrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionGroupedTieredPackagePrice =
            NewSubscriptionGroupedTieredPackagePrice.builder()
                .cadence(NewSubscriptionGroupedTieredPackagePrice.Cadence.ANNUAL)
                .groupedTieredPackageConfig(
                    NewSubscriptionGroupedTieredPackagePrice.GroupedTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewSubscriptionGroupedTieredPackagePrice.ModelType.GROUPED_TIERED_PACKAGE
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
                    NewSubscriptionGroupedTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionGroupedTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionGroupedTieredPackagePrice),
                jacksonTypeRef<NewSubscriptionGroupedTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewSubscriptionGroupedTieredPackagePrice)
            .isEqualTo(newSubscriptionGroupedTieredPackagePrice)
    }
}
