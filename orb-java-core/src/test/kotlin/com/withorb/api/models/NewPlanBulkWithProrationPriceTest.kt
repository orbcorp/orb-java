// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanBulkWithProrationPriceTest {

    @Test
    fun create() {
        val newPlanBulkWithProrationPrice =
            NewPlanBulkWithProrationPrice.builder()
                .bulkWithProrationConfig(
                    NewPlanBulkWithProrationPrice.BulkWithProrationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .cadence(NewPlanBulkWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanBulkWithProrationPrice.ModelType.BULK_WITH_PRORATION)
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
                    NewPlanBulkWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanBulkWithProrationPrice.bulkWithProrationConfig())
            .isEqualTo(
                NewPlanBulkWithProrationPrice.BulkWithProrationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanBulkWithProrationPrice.cadence())
            .isEqualTo(NewPlanBulkWithProrationPrice.Cadence.ANNUAL)
        assertThat(newPlanBulkWithProrationPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanBulkWithProrationPrice.modelType())
            .isEqualTo(NewPlanBulkWithProrationPrice.ModelType.BULK_WITH_PRORATION)
        assertThat(newPlanBulkWithProrationPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanBulkWithProrationPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newPlanBulkWithProrationPrice.billedInAdvance()).contains(true)
        assertThat(newPlanBulkWithProrationPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanBulkWithProrationPrice.conversionRate()).contains(0.0)
        assertThat(newPlanBulkWithProrationPrice.currency()).contains("currency")
        assertThat(newPlanBulkWithProrationPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanBulkWithProrationPrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanBulkWithProrationPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanBulkWithProrationPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanBulkWithProrationPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanBulkWithProrationPrice.metadata())
            .contains(
                NewPlanBulkWithProrationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanBulkWithProrationPrice =
            NewPlanBulkWithProrationPrice.builder()
                .bulkWithProrationConfig(
                    NewPlanBulkWithProrationPrice.BulkWithProrationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .cadence(NewPlanBulkWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanBulkWithProrationPrice.ModelType.BULK_WITH_PRORATION)
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
                    NewPlanBulkWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanBulkWithProrationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanBulkWithProrationPrice),
                jacksonTypeRef<NewPlanBulkWithProrationPrice>(),
            )

        assertThat(roundtrippedNewPlanBulkWithProrationPrice)
            .isEqualTo(newPlanBulkWithProrationPrice)
    }
}
