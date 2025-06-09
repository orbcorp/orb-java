// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionScalableMatrixWithUnitPricingPriceTest {

    @Test
    fun create() {
        val newSubscriptionScalableMatrixWithUnitPricingPrice =
            NewSubscriptionScalableMatrixWithUnitPricingPrice.builder()
                .cadence(NewSubscriptionScalableMatrixWithUnitPricingPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewSubscriptionScalableMatrixWithUnitPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_UNIT_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithUnitPricingConfig(
                    NewSubscriptionScalableMatrixWithUnitPricingPrice
                        .ScalableMatrixWithUnitPricingConfig
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
                    NewSubscriptionScalableMatrixWithUnitPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.cadence())
            .isEqualTo(NewSubscriptionScalableMatrixWithUnitPricingPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.modelType())
            .isEqualTo(
                NewSubscriptionScalableMatrixWithUnitPricingPrice.ModelType
                    .SCALABLE_MATRIX_WITH_UNIT_PRICING
            )
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.name()).isEqualTo("Annual fee")
        assertThat(
                newSubscriptionScalableMatrixWithUnitPricingPrice
                    .scalableMatrixWithUnitPricingConfig()
            )
            .isEqualTo(
                NewSubscriptionScalableMatrixWithUnitPricingPrice
                    .ScalableMatrixWithUnitPricingConfig
                    .builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.billedInAdvance())
            .contains(true)
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.conversionRateConfig())
            .contains(
                NewSubscriptionScalableMatrixWithUnitPricingPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.currency())
            .contains("currency")
        assertThat(
                newSubscriptionScalableMatrixWithUnitPricingPrice.dimensionalPriceConfiguration()
            )
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.fixedPriceQuantity())
            .contains(0.0)
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.invoiceGroupingKey())
            .contains("x")
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.metadata())
            .contains(
                NewSubscriptionScalableMatrixWithUnitPricingPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionScalableMatrixWithUnitPricingPrice.referenceId())
            .contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionScalableMatrixWithUnitPricingPrice =
            NewSubscriptionScalableMatrixWithUnitPricingPrice.builder()
                .cadence(NewSubscriptionScalableMatrixWithUnitPricingPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(
                    NewSubscriptionScalableMatrixWithUnitPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_UNIT_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithUnitPricingConfig(
                    NewSubscriptionScalableMatrixWithUnitPricingPrice
                        .ScalableMatrixWithUnitPricingConfig
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
                    NewSubscriptionScalableMatrixWithUnitPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionScalableMatrixWithUnitPricingPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionScalableMatrixWithUnitPricingPrice),
                jacksonTypeRef<NewSubscriptionScalableMatrixWithUnitPricingPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionScalableMatrixWithUnitPricingPrice)
            .isEqualTo(newSubscriptionScalableMatrixWithUnitPricingPrice)
    }
}
