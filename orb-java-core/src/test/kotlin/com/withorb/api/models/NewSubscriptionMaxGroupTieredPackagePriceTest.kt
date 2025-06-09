// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionMaxGroupTieredPackagePriceTest {

    @Test
    fun create() {
        val newSubscriptionMaxGroupTieredPackagePrice =
            NewSubscriptionMaxGroupTieredPackagePrice.builder()
                .cadence(NewSubscriptionMaxGroupTieredPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .maxGroupTieredPackageConfig(
                    NewSubscriptionMaxGroupTieredPackagePrice.MaxGroupTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(
                    NewSubscriptionMaxGroupTieredPackagePrice.ModelType.MAX_GROUP_TIERED_PACKAGE
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
                    NewSubscriptionMaxGroupTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionMaxGroupTieredPackagePrice.cadence())
            .isEqualTo(NewSubscriptionMaxGroupTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.maxGroupTieredPackageConfig())
            .isEqualTo(
                NewSubscriptionMaxGroupTieredPackagePrice.MaxGroupTieredPackageConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.modelType())
            .isEqualTo(NewSubscriptionMaxGroupTieredPackagePrice.ModelType.MAX_GROUP_TIERED_PACKAGE)
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.conversionRateConfig())
            .contains(
                NewSubscriptionMaxGroupTieredPackagePrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.currency()).contains("currency")
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.metadata())
            .contains(
                NewSubscriptionMaxGroupTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionMaxGroupTieredPackagePrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionMaxGroupTieredPackagePrice =
            NewSubscriptionMaxGroupTieredPackagePrice.builder()
                .cadence(NewSubscriptionMaxGroupTieredPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .maxGroupTieredPackageConfig(
                    NewSubscriptionMaxGroupTieredPackagePrice.MaxGroupTieredPackageConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(
                    NewSubscriptionMaxGroupTieredPackagePrice.ModelType.MAX_GROUP_TIERED_PACKAGE
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
                    NewSubscriptionMaxGroupTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionMaxGroupTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionMaxGroupTieredPackagePrice),
                jacksonTypeRef<NewSubscriptionMaxGroupTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewSubscriptionMaxGroupTieredPackagePrice)
            .isEqualTo(newSubscriptionMaxGroupTieredPackagePrice)
    }
}
