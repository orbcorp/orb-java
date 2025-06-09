// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionTierWithProrationPriceTest {

    @Test
    fun create() {
        val newSubscriptionTierWithProrationPrice =
            NewSubscriptionTierWithProrationPrice.builder()
                .cadence(NewSubscriptionTierWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionTierWithProrationPrice.ModelType.TIERED_WITH_PRORATION)
                .name("Annual fee")
                .tieredWithProrationConfig(
                    NewSubscriptionTierWithProrationPrice.TieredWithProrationConfig.builder()
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
                    NewSubscriptionTierWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionTierWithProrationPrice.cadence())
            .isEqualTo(NewSubscriptionTierWithProrationPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionTierWithProrationPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionTierWithProrationPrice.modelType())
            .isEqualTo(NewSubscriptionTierWithProrationPrice.ModelType.TIERED_WITH_PRORATION)
        assertThat(newSubscriptionTierWithProrationPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionTierWithProrationPrice.tieredWithProrationConfig())
            .isEqualTo(
                NewSubscriptionTierWithProrationPrice.TieredWithProrationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionTierWithProrationPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionTierWithProrationPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionTierWithProrationPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionTierWithProrationPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionTierWithProrationPrice.conversionRateConfig())
            .contains(
                NewSubscriptionTierWithProrationPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionTierWithProrationPrice.currency()).contains("currency")
        assertThat(newSubscriptionTierWithProrationPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionTierWithProrationPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionTierWithProrationPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionTierWithProrationPrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionTierWithProrationPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionTierWithProrationPrice.metadata())
            .contains(
                NewSubscriptionTierWithProrationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionTierWithProrationPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionTierWithProrationPrice =
            NewSubscriptionTierWithProrationPrice.builder()
                .cadence(NewSubscriptionTierWithProrationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionTierWithProrationPrice.ModelType.TIERED_WITH_PRORATION)
                .name("Annual fee")
                .tieredWithProrationConfig(
                    NewSubscriptionTierWithProrationPrice.TieredWithProrationConfig.builder()
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
                    NewSubscriptionTierWithProrationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionTierWithProrationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionTierWithProrationPrice),
                jacksonTypeRef<NewSubscriptionTierWithProrationPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionTierWithProrationPrice)
            .isEqualTo(newSubscriptionTierWithProrationPrice)
    }
}
