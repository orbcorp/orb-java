// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanUnitWithPercentPriceTest {

    @Test
    fun create() {
        val newPlanUnitWithPercentPrice =
            NewPlanUnitWithPercentPrice.builder()
                .cadence(NewPlanUnitWithPercentPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanUnitWithPercentPrice.ModelType.UNIT_WITH_PERCENT)
                .name("Annual fee")
                .unitWithPercentConfig(
                    NewPlanUnitWithPercentPrice.UnitWithPercentConfig.builder()
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
                    NewPlanUnitWithPercentPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanUnitWithPercentPrice.cadence())
            .isEqualTo(NewPlanUnitWithPercentPrice.Cadence.ANNUAL)
        assertThat(newPlanUnitWithPercentPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanUnitWithPercentPrice.modelType())
            .isEqualTo(NewPlanUnitWithPercentPrice.ModelType.UNIT_WITH_PERCENT)
        assertThat(newPlanUnitWithPercentPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanUnitWithPercentPrice.unitWithPercentConfig())
            .isEqualTo(
                NewPlanUnitWithPercentPrice.UnitWithPercentConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanUnitWithPercentPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newPlanUnitWithPercentPrice.billedInAdvance()).contains(true)
        assertThat(newPlanUnitWithPercentPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanUnitWithPercentPrice.conversionRate()).contains(0.0)
        assertThat(newPlanUnitWithPercentPrice.currency()).contains("currency")
        assertThat(newPlanUnitWithPercentPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanUnitWithPercentPrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanUnitWithPercentPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanUnitWithPercentPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanUnitWithPercentPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanUnitWithPercentPrice.metadata())
            .contains(
                NewPlanUnitWithPercentPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanUnitWithPercentPrice =
            NewPlanUnitWithPercentPrice.builder()
                .cadence(NewPlanUnitWithPercentPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanUnitWithPercentPrice.ModelType.UNIT_WITH_PERCENT)
                .name("Annual fee")
                .unitWithPercentConfig(
                    NewPlanUnitWithPercentPrice.UnitWithPercentConfig.builder()
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
                    NewPlanUnitWithPercentPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanUnitWithPercentPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanUnitWithPercentPrice),
                jacksonTypeRef<NewPlanUnitWithPercentPrice>(),
            )

        assertThat(roundtrippedNewPlanUnitWithPercentPrice).isEqualTo(newPlanUnitWithPercentPrice)
    }
}
