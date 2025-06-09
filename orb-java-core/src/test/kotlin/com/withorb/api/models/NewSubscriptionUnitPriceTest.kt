// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionUnitPriceTest {

    @Test
    fun create() {
        val newSubscriptionUnitPrice =
            NewSubscriptionUnitPrice.builder()
                .cadence(NewSubscriptionUnitPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionUnitPrice.ModelType.UNIT)
                .name("Annual fee")
                .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
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
                    NewSubscriptionUnitPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionUnitPrice.cadence())
            .isEqualTo(NewSubscriptionUnitPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionUnitPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionUnitPrice.modelType())
            .isEqualTo(NewSubscriptionUnitPrice.ModelType.UNIT)
        assertThat(newSubscriptionUnitPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionUnitPrice.unitConfig())
            .isEqualTo(UnitConfig.builder().unitAmount("unit_amount").build())
        assertThat(newSubscriptionUnitPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newSubscriptionUnitPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionUnitPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionUnitPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionUnitPrice.conversionRateConfig())
            .contains(
                NewSubscriptionUnitPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionUnitPrice.currency()).contains("currency")
        assertThat(newSubscriptionUnitPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionUnitPrice.externalPriceId()).contains("external_price_id")
        assertThat(newSubscriptionUnitPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionUnitPrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionUnitPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionUnitPrice.metadata())
            .contains(
                NewSubscriptionUnitPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionUnitPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionUnitPrice =
            NewSubscriptionUnitPrice.builder()
                .cadence(NewSubscriptionUnitPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionUnitPrice.ModelType.UNIT)
                .name("Annual fee")
                .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
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
                    NewSubscriptionUnitPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionUnitPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionUnitPrice),
                jacksonTypeRef<NewSubscriptionUnitPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionUnitPrice).isEqualTo(newSubscriptionUnitPrice)
    }
}
