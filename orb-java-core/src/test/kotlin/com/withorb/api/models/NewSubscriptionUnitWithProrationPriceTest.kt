// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionUnitWithProrationPriceTest {

    @Test
    fun create() {
        val newSubscriptionUnitWithProrationPrice =
            NewSubscriptionUnitWithProrationPrice.builder()
                .cadence(NewSubscriptionUnitWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
                .name("Annual fee")
                .unitWithProrationConfig(
                    NewSubscriptionUnitWithProrationPrice.UnitWithProrationConfig.builder()
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
                    NewSubscriptionUnitWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionUnitWithProrationPrice.cadence())
            .isEqualTo(NewSubscriptionUnitWithProrationPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionUnitWithProrationPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionUnitWithProrationPrice.modelType())
            .isEqualTo(NewSubscriptionUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
        assertThat(newSubscriptionUnitWithProrationPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionUnitWithProrationPrice.unitWithProrationConfig())
            .isEqualTo(
                NewSubscriptionUnitWithProrationPrice.UnitWithProrationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionUnitWithProrationPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionUnitWithProrationPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionUnitWithProrationPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionUnitWithProrationPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionUnitWithProrationPrice.currency()).contains("currency")
        assertThat(newSubscriptionUnitWithProrationPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionUnitWithProrationPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionUnitWithProrationPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionUnitWithProrationPrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionUnitWithProrationPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionUnitWithProrationPrice.metadata())
            .contains(
                NewSubscriptionUnitWithProrationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionUnitWithProrationPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionUnitWithProrationPrice =
            NewSubscriptionUnitWithProrationPrice.builder()
                .cadence(NewSubscriptionUnitWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionUnitWithProrationPrice.ModelType.UNIT_WITH_PRORATION)
                .name("Annual fee")
                .unitWithProrationConfig(
                    NewSubscriptionUnitWithProrationPrice.UnitWithProrationConfig.builder()
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
                    NewSubscriptionUnitWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionUnitWithProrationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionUnitWithProrationPrice),
                jacksonTypeRef<NewSubscriptionUnitWithProrationPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionUnitWithProrationPrice)
            .isEqualTo(newSubscriptionUnitWithProrationPrice)
    }
}
