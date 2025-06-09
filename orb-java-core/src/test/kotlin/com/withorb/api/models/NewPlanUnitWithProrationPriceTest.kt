// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanUnitWithProrationPriceTest {

    @Test
    fun create() {
        val newPlanUnitWithProrationPrice =
            NewPlanUnitWithProrationPrice.builder()
                .cadence(NewPlanUnitWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
                .name("Annual fee")
                .unitWithProrationConfig(
                    NewPlanUnitWithProrationPrice.UnitWithProrationConfig.builder()
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
                    NewPlanUnitWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanUnitWithProrationPrice.cadence())
            .isEqualTo(NewPlanUnitWithProrationPrice.Cadence.ANNUAL)
        assertThat(newPlanUnitWithProrationPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanUnitWithProrationPrice.modelType())
            .isEqualTo(NewPlanUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
        assertThat(newPlanUnitWithProrationPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanUnitWithProrationPrice.unitWithProrationConfig())
            .isEqualTo(
                NewPlanUnitWithProrationPrice.UnitWithProrationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanUnitWithProrationPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newPlanUnitWithProrationPrice.billedInAdvance()).contains(true)
        assertThat(newPlanUnitWithProrationPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanUnitWithProrationPrice.conversionRate()).contains(0.0)
        assertThat(newPlanUnitWithProrationPrice.currency()).contains("currency")
        assertThat(newPlanUnitWithProrationPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanUnitWithProrationPrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanUnitWithProrationPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanUnitWithProrationPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanUnitWithProrationPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanUnitWithProrationPrice.metadata())
            .contains(
                NewPlanUnitWithProrationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanUnitWithProrationPrice =
            NewPlanUnitWithProrationPrice.builder()
                .cadence(NewPlanUnitWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
                .name("Annual fee")
                .unitWithProrationConfig(
                    NewPlanUnitWithProrationPrice.UnitWithProrationConfig.builder()
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
                    NewPlanUnitWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanUnitWithProrationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanUnitWithProrationPrice),
                jacksonTypeRef<NewPlanUnitWithProrationPrice>(),
            )

        assertThat(roundtrippedNewPlanUnitWithProrationPrice)
            .isEqualTo(newPlanUnitWithProrationPrice)
    }
}
