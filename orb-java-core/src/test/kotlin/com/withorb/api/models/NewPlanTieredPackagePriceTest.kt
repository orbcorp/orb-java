// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanTieredPackagePriceTest {

    @Test
    fun create() {
        val newPlanTieredPackagePrice =
            NewPlanTieredPackagePrice.builder()
                .cadence(NewPlanTieredPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTieredPackagePrice.ModelType.TIERED_PACKAGE)
                .name("Annual fee")
                .tieredPackageConfig(
                    NewPlanTieredPackagePrice.TieredPackageConfig.builder()
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
                    NewPlanTieredPackagePrice.ConversionRateConfig.Unit.UnitConfig.builder()
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
                    NewPlanTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanTieredPackagePrice.cadence())
            .isEqualTo(NewPlanTieredPackagePrice.Cadence.ANNUAL)
        assertThat(newPlanTieredPackagePrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanTieredPackagePrice.modelType())
            .isEqualTo(NewPlanTieredPackagePrice.ModelType.TIERED_PACKAGE)
        assertThat(newPlanTieredPackagePrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanTieredPackagePrice.tieredPackageConfig())
            .isEqualTo(
                NewPlanTieredPackagePrice.TieredPackageConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanTieredPackagePrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newPlanTieredPackagePrice.billedInAdvance()).contains(true)
        assertThat(newPlanTieredPackagePrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTieredPackagePrice.conversionRate()).contains(0.0)
        assertThat(newPlanTieredPackagePrice.conversionRateConfig())
            .contains(
                NewPlanTieredPackagePrice.ConversionRateConfig.ofUnit(
                    NewPlanTieredPackagePrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewPlanTieredPackagePrice.ConversionRateConfig.Unit.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newPlanTieredPackagePrice.currency()).contains("currency")
        assertThat(newPlanTieredPackagePrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanTieredPackagePrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanTieredPackagePrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanTieredPackagePrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanTieredPackagePrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTieredPackagePrice.metadata())
            .contains(
                NewPlanTieredPackagePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanTieredPackagePrice =
            NewPlanTieredPackagePrice.builder()
                .cadence(NewPlanTieredPackagePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTieredPackagePrice.ModelType.TIERED_PACKAGE)
                .name("Annual fee")
                .tieredPackageConfig(
                    NewPlanTieredPackagePrice.TieredPackageConfig.builder()
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
                    NewPlanTieredPackagePrice.ConversionRateConfig.Unit.UnitConfig.builder()
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
                    NewPlanTieredPackagePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanTieredPackagePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanTieredPackagePrice),
                jacksonTypeRef<NewPlanTieredPackagePrice>(),
            )

        assertThat(roundtrippedNewPlanTieredPackagePrice).isEqualTo(newPlanTieredPackagePrice)
    }
}
