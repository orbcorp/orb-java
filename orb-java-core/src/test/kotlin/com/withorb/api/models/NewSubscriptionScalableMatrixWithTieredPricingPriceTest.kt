// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionScalableMatrixWithTieredPricingPriceTest {

    @Test
    fun create() {
        val newSubscriptionScalableMatrixWithTieredPricingPrice =
            NewSubscriptionScalableMatrixWithTieredPricingPrice.builder()
                .cadence(NewSubscriptionScalableMatrixWithTieredPricingPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewSubscriptionScalableMatrixWithTieredPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_TIERED_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithTieredPricingConfig(
                    NewSubscriptionScalableMatrixWithTieredPricingPrice
                        .ScalableMatrixWithTieredPricingConfig
                        .builder()
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
                    NewSubscriptionScalableMatrixWithTieredPricingPrice.ConversionRateConfig.Unit
                        .UnitConfig
                        .builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewSubscriptionScalableMatrixWithTieredPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.cadence())
            .isEqualTo(NewSubscriptionScalableMatrixWithTieredPricingPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.itemId())
            .isEqualTo("item_id")
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.modelType())
            .isEqualTo(
                NewSubscriptionScalableMatrixWithTieredPricingPrice.ModelType
                    .SCALABLE_MATRIX_WITH_TIERED_PRICING
            )
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.name())
            .isEqualTo("Annual fee")
        assertThat(
                newSubscriptionScalableMatrixWithTieredPricingPrice
                    .scalableMatrixWithTieredPricingConfig()
            )
            .isEqualTo(
                NewSubscriptionScalableMatrixWithTieredPricingPrice
                    .ScalableMatrixWithTieredPricingConfig
                    .builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.billedInAdvance())
            .contains(true)
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.conversionRate())
            .contains(0.0)
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.conversionRateConfig())
            .contains(
                NewSubscriptionScalableMatrixWithTieredPricingPrice.ConversionRateConfig.ofUnit(
                    NewSubscriptionScalableMatrixWithTieredPricingPrice.ConversionRateConfig.Unit
                        .builder()
                        .unitConfig(
                            NewSubscriptionScalableMatrixWithTieredPricingPrice.ConversionRateConfig
                                .Unit
                                .UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.currency())
            .contains("currency")
        assertThat(
                newSubscriptionScalableMatrixWithTieredPricingPrice.dimensionalPriceConfiguration()
            )
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.fixedPriceQuantity())
            .contains(0.0)
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.invoiceGroupingKey())
            .contains("x")
        assertThat(
                newSubscriptionScalableMatrixWithTieredPricingPrice.invoicingCycleConfiguration()
            )
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.metadata())
            .contains(
                NewSubscriptionScalableMatrixWithTieredPricingPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionScalableMatrixWithTieredPricingPrice.referenceId())
            .contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionScalableMatrixWithTieredPricingPrice =
            NewSubscriptionScalableMatrixWithTieredPricingPrice.builder()
                .cadence(NewSubscriptionScalableMatrixWithTieredPricingPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewSubscriptionScalableMatrixWithTieredPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_TIERED_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithTieredPricingConfig(
                    NewSubscriptionScalableMatrixWithTieredPricingPrice
                        .ScalableMatrixWithTieredPricingConfig
                        .builder()
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
                    NewSubscriptionScalableMatrixWithTieredPricingPrice.ConversionRateConfig.Unit
                        .UnitConfig
                        .builder()
                        .unitAmount("unit_amount")
                        .build()
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
                    NewSubscriptionScalableMatrixWithTieredPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionScalableMatrixWithTieredPricingPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionScalableMatrixWithTieredPricingPrice),
                jacksonTypeRef<NewSubscriptionScalableMatrixWithTieredPricingPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionScalableMatrixWithTieredPricingPrice)
            .isEqualTo(newSubscriptionScalableMatrixWithTieredPricingPrice)
    }
}
