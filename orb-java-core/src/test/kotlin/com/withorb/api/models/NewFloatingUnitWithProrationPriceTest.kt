// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingUnitWithProrationPriceTest {

    @Test
    fun create() {
        val newFloatingUnitWithProrationPrice =
            NewFloatingUnitWithProrationPrice.builder()
                .cadence(NewFloatingUnitWithProrationPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
                .name("Annual fee")
                .unitWithProrationConfig(
                    NewFloatingUnitWithProrationPrice.UnitWithProrationConfig.builder()
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
                    NewFloatingUnitWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingUnitWithProrationPrice.cadence())
            .isEqualTo(NewFloatingUnitWithProrationPrice.Cadence.ANNUAL)
        assertThat(newFloatingUnitWithProrationPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingUnitWithProrationPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingUnitWithProrationPrice.modelType())
            .isEqualTo(NewFloatingUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
        assertThat(newFloatingUnitWithProrationPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingUnitWithProrationPrice.unitWithProrationConfig())
            .isEqualTo(
                NewFloatingUnitWithProrationPrice.UnitWithProrationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingUnitWithProrationPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newFloatingUnitWithProrationPrice.billedInAdvance()).contains(true)
        assertThat(newFloatingUnitWithProrationPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingUnitWithProrationPrice.conversionRate()).contains(0.0)
        assertThat(newFloatingUnitWithProrationPrice.conversionRateConfig())
            .contains(
                NewFloatingUnitWithProrationPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingUnitWithProrationPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingUnitWithProrationPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newFloatingUnitWithProrationPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newFloatingUnitWithProrationPrice.invoiceGroupingKey()).contains("x")
        assertThat(newFloatingUnitWithProrationPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingUnitWithProrationPrice.metadata())
            .contains(
                NewFloatingUnitWithProrationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingUnitWithProrationPrice =
            NewFloatingUnitWithProrationPrice.builder()
                .cadence(NewFloatingUnitWithProrationPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
                .name("Annual fee")
                .unitWithProrationConfig(
                    NewFloatingUnitWithProrationPrice.UnitWithProrationConfig.builder()
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
                    NewFloatingUnitWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingUnitWithProrationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingUnitWithProrationPrice),
                jacksonTypeRef<NewFloatingUnitWithProrationPrice>(),
            )

        assertThat(roundtrippedNewFloatingUnitWithProrationPrice)
            .isEqualTo(newFloatingUnitWithProrationPrice)
    }
}
