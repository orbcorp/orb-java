// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionBulkWithProrationPriceTest {

    @Test
    fun create() {
        val newSubscriptionBulkWithProrationPrice =
            NewSubscriptionBulkWithProrationPrice.builder()
                .bulkWithProrationConfig(
                    NewSubscriptionBulkWithProrationPrice.BulkWithProrationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .cadence(NewSubscriptionBulkWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionBulkWithProrationPrice.ModelType.BULK_WITH_PRORATION)
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
                    ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                )
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
                    NewSubscriptionBulkWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionBulkWithProrationPrice.bulkWithProrationConfig())
            .isEqualTo(
                NewSubscriptionBulkWithProrationPrice.BulkWithProrationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionBulkWithProrationPrice.cadence())
            .isEqualTo(NewSubscriptionBulkWithProrationPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionBulkWithProrationPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionBulkWithProrationPrice.modelType())
            .isEqualTo(NewSubscriptionBulkWithProrationPrice.ModelType.BULK_WITH_PRORATION)
        assertThat(newSubscriptionBulkWithProrationPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionBulkWithProrationPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionBulkWithProrationPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionBulkWithProrationPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionBulkWithProrationPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionBulkWithProrationPrice.conversionRateConfig())
            .contains(
                NewSubscriptionBulkWithProrationPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionBulkWithProrationPrice.currency()).contains("currency")
        assertThat(newSubscriptionBulkWithProrationPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionBulkWithProrationPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionBulkWithProrationPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionBulkWithProrationPrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionBulkWithProrationPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionBulkWithProrationPrice.metadata())
            .contains(
                NewSubscriptionBulkWithProrationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionBulkWithProrationPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionBulkWithProrationPrice =
            NewSubscriptionBulkWithProrationPrice.builder()
                .bulkWithProrationConfig(
                    NewSubscriptionBulkWithProrationPrice.BulkWithProrationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .cadence(NewSubscriptionBulkWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionBulkWithProrationPrice.ModelType.BULK_WITH_PRORATION)
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
                    ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                )
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
                    NewSubscriptionBulkWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionBulkWithProrationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionBulkWithProrationPrice),
                jacksonTypeRef<NewSubscriptionBulkWithProrationPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionBulkWithProrationPrice)
            .isEqualTo(newSubscriptionBulkWithProrationPrice)
    }
}
