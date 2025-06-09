// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionTieredPackageWithMinimumPriceTest {

    @Test
    fun create() {
        val newSubscriptionTieredPackageWithMinimumPrice =
            NewSubscriptionTieredPackageWithMinimumPrice.builder()
                .cadence(NewSubscriptionTieredPackageWithMinimumPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewSubscriptionTieredPackageWithMinimumPrice.ModelType
                        .TIERED_PACKAGE_WITH_MINIMUM
                )
                .name("Annual fee")
                .tieredPackageWithMinimumConfig(
                    NewSubscriptionTieredPackageWithMinimumPrice.TieredPackageWithMinimumConfig
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
                    NewSubscriptionTieredPackageWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionTieredPackageWithMinimumPrice.cadence())
            .isEqualTo(NewSubscriptionTieredPackageWithMinimumPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.modelType())
            .isEqualTo(
                NewSubscriptionTieredPackageWithMinimumPrice.ModelType.TIERED_PACKAGE_WITH_MINIMUM
            )
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.tieredPackageWithMinimumConfig())
            .isEqualTo(
                NewSubscriptionTieredPackageWithMinimumPrice.TieredPackageWithMinimumConfig
                    .builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.currency()).contains("currency")
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.metadata())
            .contains(
                NewSubscriptionTieredPackageWithMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionTieredPackageWithMinimumPrice.referenceId())
            .contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionTieredPackageWithMinimumPrice =
            NewSubscriptionTieredPackageWithMinimumPrice.builder()
                .cadence(NewSubscriptionTieredPackageWithMinimumPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewSubscriptionTieredPackageWithMinimumPrice.ModelType
                        .TIERED_PACKAGE_WITH_MINIMUM
                )
                .name("Annual fee")
                .tieredPackageWithMinimumConfig(
                    NewSubscriptionTieredPackageWithMinimumPrice.TieredPackageWithMinimumConfig
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
                    NewSubscriptionTieredPackageWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionTieredPackageWithMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionTieredPackageWithMinimumPrice),
                jacksonTypeRef<NewSubscriptionTieredPackageWithMinimumPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionTieredPackageWithMinimumPrice)
            .isEqualTo(newSubscriptionTieredPackageWithMinimumPrice)
    }
}
