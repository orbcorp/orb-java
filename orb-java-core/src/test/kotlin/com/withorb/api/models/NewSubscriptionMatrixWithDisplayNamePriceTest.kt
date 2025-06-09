// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionMatrixWithDisplayNamePriceTest {

    @Test
    fun create() {
        val newSubscriptionMatrixWithDisplayNamePrice =
            NewSubscriptionMatrixWithDisplayNamePrice.builder()
                .cadence(NewSubscriptionMatrixWithDisplayNamePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .matrixWithDisplayNameConfig(
                    NewSubscriptionMatrixWithDisplayNamePrice.MatrixWithDisplayNameConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(
                    NewSubscriptionMatrixWithDisplayNamePrice.ModelType.MATRIX_WITH_DISPLAY_NAME
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
                .unitConversionRateConfig(
                    NewSubscriptionMatrixWithDisplayNamePrice.ConversionRateConfig.Unit.UnitConfig
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
                    NewSubscriptionMatrixWithDisplayNamePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionMatrixWithDisplayNamePrice.cadence())
            .isEqualTo(NewSubscriptionMatrixWithDisplayNamePrice.Cadence.ANNUAL)
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.matrixWithDisplayNameConfig())
            .isEqualTo(
                NewSubscriptionMatrixWithDisplayNamePrice.MatrixWithDisplayNameConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.modelType())
            .isEqualTo(NewSubscriptionMatrixWithDisplayNamePrice.ModelType.MATRIX_WITH_DISPLAY_NAME)
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.conversionRateConfig())
            .contains(
                NewSubscriptionMatrixWithDisplayNamePrice.ConversionRateConfig.ofUnit(
                    NewSubscriptionMatrixWithDisplayNamePrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewSubscriptionMatrixWithDisplayNamePrice.ConversionRateConfig.Unit
                                .UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.currency()).contains("currency")
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.metadata())
            .contains(
                NewSubscriptionMatrixWithDisplayNamePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionMatrixWithDisplayNamePrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionMatrixWithDisplayNamePrice =
            NewSubscriptionMatrixWithDisplayNamePrice.builder()
                .cadence(NewSubscriptionMatrixWithDisplayNamePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .matrixWithDisplayNameConfig(
                    NewSubscriptionMatrixWithDisplayNamePrice.MatrixWithDisplayNameConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(
                    NewSubscriptionMatrixWithDisplayNamePrice.ModelType.MATRIX_WITH_DISPLAY_NAME
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
                .unitConversionRateConfig(
                    NewSubscriptionMatrixWithDisplayNamePrice.ConversionRateConfig.Unit.UnitConfig
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
                    NewSubscriptionMatrixWithDisplayNamePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionMatrixWithDisplayNamePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionMatrixWithDisplayNamePrice),
                jacksonTypeRef<NewSubscriptionMatrixWithDisplayNamePrice>(),
            )

        assertThat(roundtrippedNewSubscriptionMatrixWithDisplayNamePrice)
            .isEqualTo(newSubscriptionMatrixWithDisplayNamePrice)
    }
}
