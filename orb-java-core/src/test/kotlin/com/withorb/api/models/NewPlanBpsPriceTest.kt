// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanBpsPriceTest {

    @Test
    fun create() {
        val newPlanBpsPrice =
            NewPlanBpsPrice.builder()
                .bpsConfig(BpsConfig.builder().bps(0.0).perUnitMaximum("per_unit_maximum").build())
                .cadence(NewPlanBpsPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanBpsPrice.ModelType.BPS)
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
                    NewPlanBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanBpsPrice.bpsConfig())
            .isEqualTo(BpsConfig.builder().bps(0.0).perUnitMaximum("per_unit_maximum").build())
        assertThat(newPlanBpsPrice.cadence()).isEqualTo(NewPlanBpsPrice.Cadence.ANNUAL)
        assertThat(newPlanBpsPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanBpsPrice.modelType()).isEqualTo(NewPlanBpsPrice.ModelType.BPS)
        assertThat(newPlanBpsPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanBpsPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newPlanBpsPrice.billedInAdvance()).contains(true)
        assertThat(newPlanBpsPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanBpsPrice.conversionRate()).contains(0.0)
        assertThat(newPlanBpsPrice.currency()).contains("currency")
        assertThat(newPlanBpsPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanBpsPrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanBpsPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanBpsPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanBpsPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanBpsPrice.metadata())
            .contains(
                NewPlanBpsPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanBpsPrice =
            NewPlanBpsPrice.builder()
                .bpsConfig(BpsConfig.builder().bps(0.0).perUnitMaximum("per_unit_maximum").build())
                .cadence(NewPlanBpsPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanBpsPrice.ModelType.BPS)
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
                    NewPlanBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanBpsPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanBpsPrice),
                jacksonTypeRef<NewPlanBpsPrice>(),
            )

        assertThat(roundtrippedNewPlanBpsPrice).isEqualTo(newPlanBpsPrice)
    }
}
