// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewSubscriptionTieredBpsPriceTest {

    @Test
    fun create() {
        val newSubscriptionTieredBpsPrice =
            NewSubscriptionTieredBpsPrice.builder()
                .cadence(NewSubscriptionTieredBpsPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionTieredBpsPrice.ModelType.TIERED_BPS)
                .name("Annual fee")
                .tieredBpsConfig(
                    TieredBpsConfig.builder()
                        .addTier(
                            BpsTier.builder()
                                .bps(0.0)
                                .minimumAmount("minimum_amount")
                                .maximumAmount("maximum_amount")
                                .perUnitMaximum("per_unit_maximum")
                                .build()
                        )
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
                    NewSubscriptionTieredBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        assertThat(newSubscriptionTieredBpsPrice.cadence())
            .isEqualTo(NewSubscriptionTieredBpsPrice.Cadence.ANNUAL)
        assertThat(newSubscriptionTieredBpsPrice.itemId()).isEqualTo("item_id")
        assertThat(newSubscriptionTieredBpsPrice.modelType())
            .isEqualTo(NewSubscriptionTieredBpsPrice.ModelType.TIERED_BPS)
        assertThat(newSubscriptionTieredBpsPrice.name()).isEqualTo("Annual fee")
        assertThat(newSubscriptionTieredBpsPrice.tieredBpsConfig())
            .isEqualTo(
                TieredBpsConfig.builder()
                    .addTier(
                        BpsTier.builder()
                            .bps(0.0)
                            .minimumAmount("minimum_amount")
                            .maximumAmount("maximum_amount")
                            .perUnitMaximum("per_unit_maximum")
                            .build()
                    )
                    .build()
            )
        assertThat(newSubscriptionTieredBpsPrice.billableMetricId()).contains("billable_metric_id")
        assertThat(newSubscriptionTieredBpsPrice.billedInAdvance()).contains(true)
        assertThat(newSubscriptionTieredBpsPrice.billingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionTieredBpsPrice.conversionRate()).contains(0.0)
        assertThat(newSubscriptionTieredBpsPrice.conversionRateConfig())
            .contains(
                NewSubscriptionTieredBpsPrice.ConversionRateConfig.ofUnit(
                    UnitConversionRateConfig.builder()
                        .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                        .unitConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .build()
                )
            )
        assertThat(newSubscriptionTieredBpsPrice.currency()).contains("currency")
        assertThat(newSubscriptionTieredBpsPrice.dimensionalPriceConfiguration())
            .contains(
                NewDimensionalPriceConfiguration.builder()
                    .addDimensionValue("string")
                    .dimensionalPriceGroupId("dimensional_price_group_id")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .build()
            )
        assertThat(newSubscriptionTieredBpsPrice.externalPriceId()).contains("external_price_id")
        assertThat(newSubscriptionTieredBpsPrice.fixedPriceQuantity()).contains(0.0)
        assertThat(newSubscriptionTieredBpsPrice.invoiceGroupingKey()).contains("x")
        assertThat(newSubscriptionTieredBpsPrice.invoicingCycleConfiguration())
            .contains(
                NewBillingCycleConfiguration.builder()
                    .duration(0L)
                    .durationUnit(NewBillingCycleConfiguration.DurationUnit.DAY)
                    .build()
            )
        assertThat(newSubscriptionTieredBpsPrice.metadata())
            .contains(
                NewSubscriptionTieredBpsPrice.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(newSubscriptionTieredBpsPrice.referenceId()).contains("reference_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newSubscriptionTieredBpsPrice =
            NewSubscriptionTieredBpsPrice.builder()
                .cadence(NewSubscriptionTieredBpsPrice.Cadence.ANNUAL)
                .itemId("item_id")
                .modelType(NewSubscriptionTieredBpsPrice.ModelType.TIERED_BPS)
                .name("Annual fee")
                .tieredBpsConfig(
                    TieredBpsConfig.builder()
                        .addTier(
                            BpsTier.builder()
                                .bps(0.0)
                                .minimumAmount("minimum_amount")
                                .maximumAmount("maximum_amount")
                                .perUnitMaximum("per_unit_maximum")
                                .build()
                        )
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
                    NewSubscriptionTieredBpsPrice.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .referenceId("reference_id")
                .build()

        val roundtrippedNewSubscriptionTieredBpsPrice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newSubscriptionTieredBpsPrice),
                jacksonTypeRef<NewSubscriptionTieredBpsPrice>(),
            )

        assertThat(roundtrippedNewSubscriptionTieredBpsPrice)
            .isEqualTo(newSubscriptionTieredBpsPrice)
    }
}
