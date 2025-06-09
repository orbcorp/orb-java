// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingBpsPriceTest {

    @Test
    fun create() {
        val newFloatingBpsPrice =
            NewFloatingBpsPrice.builder()
                .bpsConfig(BpsConfig.builder().bps(0.0).perUnitMaximum("per_unit_maximum").build())
                .cadence(NewFloatingBpsPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingBpsPrice.ModelType.BPS)
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
                    NewFloatingBpsPrice.ConversionRateConfig.Unit.UnitConfig.builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewFloatingBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingBpsPrice.bpsConfig())
            .isEqualTo(BpsConfig.builder().bps(0.0).perUnitMaximum("per_unit_maximum").build())
        assertThat(newFloatingBpsPrice.cadence()).isEqualTo(NewFloatingBpsPrice.Cadence.ANNUAL)
        assertThat(newFloatingBpsPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingBpsPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingBpsPrice.modelType()).isEqualTo(NewFloatingBpsPrice.ModelType.BPS)
        assertThat(newFloatingBpsPrice.name()).isEqualTo("Annual fee")
        assertThat(newFloatingBpsPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newFloatingBpsPrice.billedInAdvance()).contains(true)
        assertThat(newFloatingBpsPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingBpsPrice.conversionRate()).contains(0.0)
        assertThat(newFloatingBpsPrice.conversionRateConfig())
            .contains(
                NewFloatingBpsPrice.ConversionRateConfig.ofUnit(
                    NewFloatingBpsPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewFloatingBpsPrice.ConversionRateConfig.Unit.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newFloatingBpsPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingBpsPrice.externalPriceId()).contains("external_price_id")
        assertThat(newFloatingBpsPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newFloatingBpsPrice.invoiceGroupingKey()).contains("x")
        assertThat(newFloatingBpsPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingBpsPrice.metadata())
            .contains(
                NewFloatingBpsPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingBpsPrice =
            NewFloatingBpsPrice.builder()
                .bpsConfig(BpsConfig.builder().bps(0.0).perUnitMaximum("per_unit_maximum").build())
                .cadence(NewFloatingBpsPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(NewFloatingBpsPrice.ModelType.BPS)
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
                    NewFloatingBpsPrice.ConversionRateConfig.Unit.UnitConfig.builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewFloatingBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingBpsPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingBpsPrice),
                jacksonTypeRef<NewFloatingBpsPrice>(),
            )

        assertThat(roundtrippedNewFloatingBpsPrice).isEqualTo(newFloatingBpsPrice)
    }
}
