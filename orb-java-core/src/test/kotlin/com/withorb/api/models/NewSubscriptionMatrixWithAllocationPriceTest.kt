// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionMatrixWithAllocationPriceTest {

    @Test
    fun create() {
        val newSubscriptionMatrixWithAllocationPrice =
            NewSubscriptionMatrixWithAllocationPrice.builder()
                .cadence(NewSubscriptionMatrixWithAllocationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .matrixWithAllocationConfig(
                    MatrixWithAllocationConfig.builder()
                        .allocation(0.0)
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
                .modelType(
                    NewSubscriptionMatrixWithAllocationPrice.ModelType.MATRIX_WITH_ALLOCATION
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
                    NewSubscriptionMatrixWithAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionMatrixWithAllocationPrice.cadence())
            .isEqualTo(NewSubscriptionMatrixWithAllocationPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionMatrixWithAllocationPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionMatrixWithAllocationPrice.matrixWithAllocationConfig())
            .isEqualTo(
                MatrixWithAllocationConfig.builder()
                    .allocation(0.0)
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
        assertThat(newSubscriptionMatrixWithAllocationPrice.modelType())
            .isEqualTo(NewSubscriptionMatrixWithAllocationPrice.ModelType.MATRIX_WITH_ALLOCATION)
        assertThat(newSubscriptionMatrixWithAllocationPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionMatrixWithAllocationPrice.billableMetricId())
            .contains("billable_metric_id")
        assertThat(newSubscriptionMatrixWithAllocationPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionMatrixWithAllocationPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMatrixWithAllocationPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionMatrixWithAllocationPrice.conversionRateConfig())
            .contains(
                NewSubscriptionMatrixWithAllocationPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionMatrixWithAllocationPrice.currency()).contains("currency")
        assertThat(newSubscriptionMatrixWithAllocationPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionMatrixWithAllocationPrice.externalPriceId())
            .contains("external_price_id")
        assertThat(newSubscriptionMatrixWithAllocationPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionMatrixWithAllocationPrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionMatrixWithAllocationPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionMatrixWithAllocationPrice.metadata())
            .contains(
                NewSubscriptionMatrixWithAllocationPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionMatrixWithAllocationPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionMatrixWithAllocationPrice =
            NewSubscriptionMatrixWithAllocationPrice.builder()
                .cadence(NewSubscriptionMatrixWithAllocationPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .matrixWithAllocationConfig(
                    MatrixWithAllocationConfig.builder()
                        .allocation(0.0)
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
                .modelType(
                    NewSubscriptionMatrixWithAllocationPrice.ModelType.MATRIX_WITH_ALLOCATION
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
                    NewSubscriptionMatrixWithAllocationPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionMatrixWithAllocationPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionMatrixWithAllocationPrice),
                jacksonTypeRef<NewSubscriptionMatrixWithAllocationPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionMatrixWithAllocationPrice)
            .isEqualTo(newSubscriptionMatrixWithAllocationPrice)
    }
}
