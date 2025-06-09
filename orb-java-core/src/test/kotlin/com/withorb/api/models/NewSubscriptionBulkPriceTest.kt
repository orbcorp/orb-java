// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionBulkPriceTest {

    @Test
    fun create() {
        val newSubscriptionBulkPrice =
            NewSubscriptionBulkPrice.builder()
                .bulkConfig(
                    BulkConfig.builder()
                        .addTier(
                            BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build()
                        )
                        .build()
                )
                .cadence(NewSubscriptionBulkPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionBulkPrice.ModelType.BULK)
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
                    NewSubscriptionBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionBulkPrice.bulkConfig())
            .isEqualTo(
                BulkConfig.builder()
                    .addTier(BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build())
                    .build()
            )
        assertThat(newSubscriptionBulkPrice.cadence())
            .isEqualTo(NewSubscriptionBulkPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionBulkPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionBulkPrice.modelType())
            .isEqualTo(NewSubscriptionBulkPrice.ModelType.BULK)
        assertThat(newSubscriptionBulkPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionBulkPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newSubscriptionBulkPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionBulkPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionBulkPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionBulkPrice.currency()).contains("currency")
        assertThat(newSubscriptionBulkPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionBulkPrice.externalPriceId()).contains("external_price_id")
        assertThat(newSubscriptionBulkPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionBulkPrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionBulkPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionBulkPrice.metadata())
            .contains(
                NewSubscriptionBulkPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionBulkPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionBulkPrice =
            NewSubscriptionBulkPrice.builder()
                .bulkConfig(
                    BulkConfig.builder()
                        .addTier(
                            BulkTier.builder().unitAmount("unit_amount").maximumUnits(0.0).build()
                        )
                        .build()
                )
                .cadence(NewSubscriptionBulkPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionBulkPrice.ModelType.BULK)
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
                    NewSubscriptionBulkPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionBulkPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionBulkPrice),
                jacksonTypeRef<NewSubscriptionBulkPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionBulkPrice).isEqualTo(newSubscriptionBulkPrice)
    }
}
