// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewFloatingScalableMatrixWithTieredPricingPriceTest {

    @Test
    fun create() {
        val newFloatingScalableMatrixWithTieredPricingPrice =
            NewFloatingScalableMatrixWithTieredPricingPrice.builder()
                .cadence(NewFloatingScalableMatrixWithTieredPricingPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(
                    NewFloatingScalableMatrixWithTieredPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_TIERED_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithTieredPricingConfig(
                    NewFloatingScalableMatrixWithTieredPricingPrice
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
                    NewFloatingScalableMatrixWithTieredPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.cadence())
            .isEqualTo(NewFloatingScalableMatrixWithTieredPricingPrice.Cadence.ANNUAL)
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.currency()).isEqualTo("currency")
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.itemId()).isEqualTo("item_id")
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.modelType())
            .isEqualTo(
                NewFloatingScalableMatrixWithTieredPricingPrice.ModelType
                    .SCALABLE_MATRIX_WITH_TIERED_PRICING
            )
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.name()).isEqualTo("Annual fee")
        assertThat(
                newFloatingScalableMatrixWithTieredPricingPrice
                    .scalableMatrixWithTieredPricingConfig()
            )
            .isEqualTo(
                NewFloatingScalableMatrixWithTieredPricingPrice
                    .ScalableMatrixWithTieredPricingConfig
                    .builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.billedInAdvance()).contains(true)
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.conversionRate()).contains(0.0)
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.fixedPriceQuantity())
            .contains(0.0)
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.invoiceGroupingKey())
            .contains("x")
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newFloatingScalableMatrixWithTieredPricingPrice.metadata())
            .contains(
                NewFloatingScalableMatrixWithTieredPricingPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newFloatingScalableMatrixWithTieredPricingPrice =
            NewFloatingScalableMatrixWithTieredPricingPrice.builder()
                .cadence(NewFloatingScalableMatrixWithTieredPricingPrice.Cadence.ANNUAL)
                .currency("currency")
                .itemId("item_id")
                .modelType(
                    NewFloatingScalableMatrixWithTieredPricingPrice.ModelType
                        .SCALABLE_MATRIX_WITH_TIERED_PRICING
                )
                .name("Annual fee")
                .scalableMatrixWithTieredPricingConfig(
                    NewFloatingScalableMatrixWithTieredPricingPrice
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
                    NewFloatingScalableMatrixWithTieredPricingPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewFloatingScalableMatrixWithTieredPricingPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newFloatingScalableMatrixWithTieredPricingPrice),
                jacksonTypeRef<NewFloatingScalableMatrixWithTieredPricingPrice>(),
            )

        assertThat(roundtrippedNewFloatingScalableMatrixWithTieredPricingPrice)
            .isEqualTo(newFloatingScalableMatrixWithTieredPricingPrice)
    }
}
