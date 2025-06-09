// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanMatrixWithDisplayNamePriceTest {

    @Test
    fun create() {
        val newPlanMatrixWithDisplayNamePrice =
            NewPlanMatrixWithDisplayNamePrice.builder()
                .cadence(NewPlanMatrixWithDisplayNamePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .matrixWithDisplayNameConfig(
                    NewPlanMatrixWithDisplayNamePrice.MatrixWithDisplayNameConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(NewPlanMatrixWithDisplayNamePrice.ModelType.MATRIX_WITH_DISPLAY_NAME)
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
                    NewPlanMatrixWithDisplayNamePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanMatrixWithDisplayNamePrice.cadence())
            .isEqualTo(NewPlanMatrixWithDisplayNamePrice.Cadence.ANNUAL)
        assertThat(newPlanMatrixWithDisplayNamePrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanMatrixWithDisplayNamePrice.matrixWithDisplayNameConfig())
            .isEqualTo(
                NewPlanMatrixWithDisplayNamePrice.MatrixWithDisplayNameConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(newPlanMatrixWithDisplayNamePrice.modelType())
            .isEqualTo(NewPlanMatrixWithDisplayNamePrice.ModelType.MATRIX_WITH_DISPLAY_NAME)
        assertThat(newPlanMatrixWithDisplayNamePrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanMatrixWithDisplayNamePrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newPlanMatrixWithDisplayNamePrice.billedInAdvance()).contains(true)
        assertThat(newPlanMatrixWithDisplayNamePrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanMatrixWithDisplayNamePrice.conversionRate()).contains(0.0)
        assertThat(newPlanMatrixWithDisplayNamePrice.conversionRateConfig())
            .contains(
                NewPlanMatrixWithDisplayNamePrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanMatrixWithDisplayNamePrice.currency()).contains("currency")
        assertThat(newPlanMatrixWithDisplayNamePrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanMatrixWithDisplayNamePrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newPlanMatrixWithDisplayNamePrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanMatrixWithDisplayNamePrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanMatrixWithDisplayNamePrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanMatrixWithDisplayNamePrice.metadata())
            .contains(
                NewPlanMatrixWithDisplayNamePrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanMatrixWithDisplayNamePrice =
            NewPlanMatrixWithDisplayNamePrice.builder()
                .cadence(NewPlanMatrixWithDisplayNamePrice.Cadence.ANNUAL)
                .itemId("item_id")
                .matrixWithDisplayNameConfig(
                    NewPlanMatrixWithDisplayNamePrice.MatrixWithDisplayNameConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .modelType(NewPlanMatrixWithDisplayNamePrice.ModelType.MATRIX_WITH_DISPLAY_NAME)
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
                    NewPlanMatrixWithDisplayNamePrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanMatrixWithDisplayNamePrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanMatrixWithDisplayNamePrice),
                jacksonTypeRef<NewPlanMatrixWithDisplayNamePrice>(),
            )

        assertThat(roundtrippedNewPlanMatrixWithDisplayNamePrice)
            .isEqualTo(newPlanMatrixWithDisplayNamePrice)
    }
}
