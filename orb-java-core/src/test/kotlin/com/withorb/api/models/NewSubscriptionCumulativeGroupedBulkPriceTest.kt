// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionCumulativeGroupedBulkPriceTest {

    @Test
    fun create() {
        val newSubscriptionCumulativeGroupedBulkPrice =
            NewSubscriptionCumulativeGroupedBulkPrice.builder()
                .cadence(NewSubscriptionCumulativeGroupedBulkPrice.Cadence.ANNUAL)
                .cumulativeGroupedBulkConfig(
                    NewSubscriptionCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewSubscriptionCumulativeGroupedBulkPrice.ModelType.CUMULATIVE_GROUPED_BULK
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
                    NewSubscriptionCumulativeGroupedBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionCumulativeGroupedBulkPrice.cadence())
            .isEqualTo(NewSubscriptionCumulativeGroupedBulkPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.cumulativeGroupedBulkConfig())
            .isEqualTo(
                NewSubscriptionCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.modelType())
            .isEqualTo(NewSubscriptionCumulativeGroupedBulkPrice.ModelType.CUMULATIVE_GROUPED_BULK)
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.currency()).contains("currency")
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.metadata())
            .contains(
                NewSubscriptionCumulativeGroupedBulkPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionCumulativeGroupedBulkPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionCumulativeGroupedBulkPrice =
            NewSubscriptionCumulativeGroupedBulkPrice.builder()
                .cadence(NewSubscriptionCumulativeGroupedBulkPrice.Cadence.ANNUAL)
                .cumulativeGroupedBulkConfig(
                    NewSubscriptionCumulativeGroupedBulkPrice.CumulativeGroupedBulkConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .itemId("item_id")
                .modelType(
                    NewSubscriptionCumulativeGroupedBulkPrice.ModelType.CUMULATIVE_GROUPED_BULK
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
                    NewSubscriptionCumulativeGroupedBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionCumulativeGroupedBulkPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionCumulativeGroupedBulkPrice),
                jacksonTypeRef<NewSubscriptionCumulativeGroupedBulkPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionCumulativeGroupedBulkPrice)
            .isEqualTo(newSubscriptionCumulativeGroupedBulkPrice)
    }
}
