// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanTieredWithMinimumPriceTest {

    @Test
    fun create() {
        val newPlanTieredWithMinimumPrice =
            NewPlanTieredWithMinimumPrice.builder()
                .cadence(NewPlanTieredWithMinimumPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
                .name("Annual fee")
                .tieredWithMinimumConfig(
                    NewPlanTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
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
                    NewPlanTieredWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanTieredWithMinimumPrice.cadence())
            .isEqualTo(NewPlanTieredWithMinimumPrice.Cadence.ANNUAL)
        assertThat(newPlanTieredWithMinimumPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanTieredWithMinimumPrice.modelType())
            .isEqualTo(NewPlanTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
        assertThat(newPlanTieredWithMinimumPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanTieredWithMinimumPrice.tieredWithMinimumConfig())
            .isEqualTo(
                NewPlanTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanTieredWithMinimumPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newPlanTieredWithMinimumPrice.billedInAdvance()).contains(true)
        assertThat(newPlanTieredWithMinimumPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTieredWithMinimumPrice.conversionRate()).contains(0.0)
        assertThat(newPlanTieredWithMinimumPrice.currency()).contains("currency")
        assertThat(newPlanTieredWithMinimumPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanTieredWithMinimumPrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanTieredWithMinimumPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanTieredWithMinimumPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanTieredWithMinimumPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanTieredWithMinimumPrice.metadata())
            .contains(
                NewPlanTieredWithMinimumPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanTieredWithMinimumPrice =
            NewPlanTieredWithMinimumPrice.builder()
                .cadence(NewPlanTieredWithMinimumPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanTieredWithMinimumPrice.ModelType.TIERED_WITH_MINIMUM)
                .name("Annual fee")
                .tieredWithMinimumConfig(
                    NewPlanTieredWithMinimumPrice.TieredWithMinimumConfig.builder()
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
                    NewPlanTieredWithMinimumPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanTieredWithMinimumPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanTieredWithMinimumPrice),
                jacksonTypeRef<NewPlanTieredWithMinimumPrice>(),
            )

        assertThat(roundtrippedNewPlanTieredWithMinimumPrice)
            .isEqualTo(newPlanTieredWithMinimumPrice)
    }
}
