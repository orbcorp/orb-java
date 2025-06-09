// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingTieredPackagePriceTest {

    @Test
    fun create() {
        val newFloatingTieredPackagePrice =
            NewFloatingTieredPackagePrice.builder()
                .cadence(NewFloatingTieredPackagePrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredPackagePrice.ModelType.TIERED_PACKAGE)
                .name("Annual fee")
                .tieredPackageConfig(
                    NewFloatingTieredPackagePrice.TieredPackageConfig.builder()
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
                    NewFloatingTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingTieredPackagePrice.cadence())
            .isEqualTo(NewFloatingTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newFloatingTieredPackagePrice.currency()).isEqualTo("currency")
        assertThat(newFloatingTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingTieredPackagePrice.modelType())
            .isEqualTo(NewFloatingTieredPackagePrice.ModelType.TIERED_PACKAGE)
        assertThat(newFloatingTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingTieredPackagePrice.tieredPackageConfig())
            .isEqualTo(
                NewFloatingTieredPackagePrice.TieredPackageConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingTieredPackagePrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newFloatingTieredPackagePrice.billedInAdvance()).contains(true)
        assertThat(newFloatingTieredPackagePrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredPackagePrice.conversionRate()).contains(0.0)
        assertThat(newFloatingTieredPackagePrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingTieredPackagePrice.externalPriceId()).contains("external_price_id")
        assertThat(newFloatingTieredPackagePrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newFloatingTieredPackagePrice.invoiceGroupingKey()).contains("x")
        assertThat(newFloatingTieredPackagePrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredPackagePrice.metadata())
            .contains(
                NewFloatingTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingTieredPackagePrice =
            NewFloatingTieredPackagePrice.builder()
                .cadence(NewFloatingTieredPackagePrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredPackagePrice.ModelType.TIERED_PACKAGE)
                .name("Annual fee")
                .tieredPackageConfig(
                    NewFloatingTieredPackagePrice.TieredPackageConfig.builder()
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
                    NewFloatingTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingTieredPackagePrice),
                jacksonTypeRef<NewFloatingTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewFloatingTieredPackagePrice)
            .isEqualTo(newFloatingTieredPackagePrice)
    }
}
