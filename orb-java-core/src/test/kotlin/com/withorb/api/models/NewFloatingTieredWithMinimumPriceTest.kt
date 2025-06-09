// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingTieredWithMinimumPriceTest {

    @Test
    fun create() {
        val newFloatingTieredWithMinimumPrice =
            NewFloatingTieredWithMinimumPrice.builder()
                .cadence(NewFloatingTieredWithMinimumPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
                .name("Annual fee")
                .tieredWithMinimumConfig(
                    NewFloatingTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
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
                    NewFloatingTieredWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingTieredWithMinimumPrice.cadence())
            .isEqualTo(NewFloatingTieredWithMinimumPrice.Cadence.ANNUAL)
        assertThat(newFloatingTieredWithMinimumPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingTieredWithMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingTieredWithMinimumPrice.modelType())
            .isEqualTo(NewFloatingTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
        assertThat(newFloatingTieredWithMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingTieredWithMinimumPrice.tieredWithMinimumConfig())
            .isEqualTo(
                NewFloatingTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingTieredWithMinimumPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newFloatingTieredWithMinimumPrice.billedInAdvance()).contains(true)
        assertThat(newFloatingTieredWithMinimumPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredWithMinimumPrice.conversionRate()).contains(0.0)
        assertThat(newFloatingTieredWithMinimumPrice.conversionRateConfig())
            .contains(
                NewFloatingTieredWithMinimumPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingTieredWithMinimumPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingTieredWithMinimumPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newFloatingTieredWithMinimumPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newFloatingTieredWithMinimumPrice.invoiceGroupingKey()).contains("x")
        assertThat(newFloatingTieredWithMinimumPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingTieredWithMinimumPrice.metadata())
            .contains(
                NewFloatingTieredWithMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingTieredWithMinimumPrice =
            NewFloatingTieredWithMinimumPrice.builder()
                .cadence(NewFloatingTieredWithMinimumPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
                .name("Annual fee")
                .tieredWithMinimumConfig(
                    NewFloatingTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
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
                    NewFloatingTieredWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingTieredWithMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingTieredWithMinimumPrice),
                jacksonTypeRef<NewFloatingTieredWithMinimumPrice>(),
            )

        assertThat(roundtrippedNewFloatingTieredWithMinimumPrice)
            .isEqualTo(newFloatingTieredWithMinimumPrice)
    }
}
