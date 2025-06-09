// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPlanBulkBpsPriceTest {

    @Test
    fun create() {
        val newPlanBulkBpsPrice =
            NewPlanBulkBpsPrice.builder()
                .bulkBpsConfig(
                    BulkBpsConfig.builder()
                        .addTier(
                            BulkBpsTier.builder()
                                .bps(0.0)
                                .maximumAmount("maximum_amount")
                                .perUnitMaximum("per_unit_maximum")
                                .build()
                        )
                        .build()
                )
                .cadence(NewPlanBulkBpsPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanBulkBpsPrice.ModelType.BULK_BPS)
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
                    NewPlanBulkBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(newPlanBulkBpsPrice.bulkBpsConfig())
            .isEqualTo(
                BulkBpsConfig.builder()
                    .addTier(
                        BulkBpsTier.builder()
                            .bps(0.0)
                            .maximumAmount("maximum_amount")
                            .perUnitMaximum("per_unit_maximum")
                            .build()
                    )
                    .build()
            )
        assertThat(newPlanBulkBpsPrice.cadence()).isEqualTo(NewPlanBulkBpsPrice.Cadence.ANNUAL)
        assertThat(newPlanBulkBpsPrice.itemId()).isEqualTo("item_id")
        assertThat(newPlanBulkBpsPrice.modelType())
            .isEqualTo(NewPlanBulkBpsPrice.ModelType.BULK_BPS)
        assertThat(newPlanBulkBpsPrice.name()).isEqualTo("Annual fee")
        assertThat(newPlanBulkBpsPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newPlanBulkBpsPrice.billedInAdvance()).contains(true)
        assertThat(newPlanBulkBpsPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanBulkBpsPrice.conversionRate()).contains(0.0)
        assertThat(newPlanBulkBpsPrice.conversionRateConfig())
            .contains(
                NewPlanBulkBpsPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newPlanBulkBpsPrice.currency()).contains("currency")
        assertThat(newPlanBulkBpsPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newPlanBulkBpsPrice.externalPriceId()).contains("external_price_id")
        assertThat(newPlanBulkBpsPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newPlanBulkBpsPrice.invoiceGroupingKey()).contains("x")
        assertThat(newPlanBulkBpsPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newPlanBulkBpsPrice.metadata())
            .contains(
                NewPlanBulkBpsPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPlanBulkBpsPrice =
            NewPlanBulkBpsPrice.builder()
                .bulkBpsConfig(
                    BulkBpsConfig.builder()
                        .addTier(
                            BulkBpsTier.builder()
                                .bps(0.0)
                                .maximumAmount("maximum_amount")
                                .perUnitMaximum("per_unit_maximum")
                                .build()
                        )
                        .build()
                )
                .cadence(NewPlanBulkBpsPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewPlanBulkBpsPrice.ModelType.BULK_BPS)
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
                    NewPlanBulkBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNewPlanBulkBpsPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPlanBulkBpsPrice),
                jacksonTypeRef<NewPlanBulkBpsPrice>(),
            )

        assertThat(roundtrippedNewPlanBulkBpsPrice).isEqualTo(newPlanBulkBpsPrice)
    }
}
