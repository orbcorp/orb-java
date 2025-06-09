// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionMatrixPriceTest {

    @Test
    fun create() {
        val newSubscriptionMatrixPrice =
            NewSubscriptionMatrixPrice.builder()
                .cadence(NewSubscriptionMatrixPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .matrixConfig(
                    MatrixConfig.builder()
                        .defaultUnitAmount("default_unit_amount")
                        .addDimension("string")
                        .addMatrixValue(
                            MatrixValue.builder()
                                .addDimensionValue("string")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
                .modelType(NewSubscriptionMatrixPrice.ModelType.MATRIX)
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
                    NewSubscriptionMatrixPrice.ConversionRateConfig.Unit.UnitConfig.builder()
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
                    NewSubscriptionMatrixPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionMatrixPrice.cadence())
            .isEqualTo(NewSubscriptionMatrixPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionMatrixPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionMatrixPrice.matrixConfig())
            .isEqualTo(
                MatrixConfig.builder()
                    .defaultUnitAmount("default_unit_amount")
                    .addDimension("string")
                    .addMatrixValue(
                        MatrixValue.builder()
                            .addDimensionValue("string")
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .build()
            )
        assertThat(newSubscriptionMatrixPrice.modelType())
            .isEqualTo(NewSubscriptionMatrixPrice.ModelType.MATRIX)
        assertThat(newSubscriptionMatrixPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionMatrixPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newSubscriptionMatrixPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionMatrixPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMatrixPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionMatrixPrice.conversionRateConfig())
            .contains(
                NewSubscriptionMatrixPrice.ConversionRateConfig.ofUnit(
                    NewSubscriptionMatrixPrice.ConversionRateConfig.Unit.builder()
                        .unitConfig(
                            NewSubscriptionMatrixPrice.ConversionRateConfig.Unit.UnitConfig
                                .builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionMatrixPrice.currency()).contains("currency")
        assertThat(newSubscriptionMatrixPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionMatrixPrice.externalPriceId()).contains("external_price_id")
        assertThat(newSubscriptionMatrixPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionMatrixPrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionMatrixPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMatrixPrice.metadata())
            .contains(
                NewSubscriptionMatrixPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionMatrixPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionMatrixPrice =
            NewSubscriptionMatrixPrice.builder()
                .cadence(NewSubscriptionMatrixPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .matrixConfig(
                    MatrixConfig.builder()
                        .defaultUnitAmount("default_unit_amount")
                        .addDimension("string")
                        .addMatrixValue(
                            MatrixValue.builder()
                                .addDimensionValue("string")
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
                .modelType(NewSubscriptionMatrixPrice.ModelType.MATRIX)
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
                    NewSubscriptionMatrixPrice.ConversionRateConfig.Unit.UnitConfig.builder()
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
                    NewSubscriptionMatrixPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionMatrixPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionMatrixPrice),
                jacksonTypeRef<NewSubscriptionMatrixPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionMatrixPrice).isEqualTo(newSubscriptionMatrixPrice)
    }
}
