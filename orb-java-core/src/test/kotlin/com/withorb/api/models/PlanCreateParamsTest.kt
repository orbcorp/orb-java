// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanCreateParamsTest {

    @Test
    fun create() {
        PlanCreateParams.builder()
            .currency("currency")
            .name("name")
            .addPrice(
                PlanCreateParams.Price.Unit.builder()
                    .cadence(PlanCreateParams.Price.Unit.Cadence.ANNUAL)
                    .itemId("item_id")
                    .name("Annual fee")
                    .unitConfig(
                        PlanCreateParams.Price.Unit.UnitConfig.builder()
                            .unitAmount("unit_amount")
                            .build()
                    )
                    .billableMetricId("billable_metric_id")
                    .billedInAdvance(true)
                    .billingCycleConfiguration(
                        PlanCreateParams.Price.Unit.BillingCycleConfiguration.builder()
                            .duration(0L)
                            .durationUnit(
                                PlanCreateParams.Price.Unit.BillingCycleConfiguration.DurationUnit
                                    .DAY
                            )
                            .build()
                    )
                    .conversionRate(0.0)
                    .currency("currency")
                    .dimensionalPriceConfiguration(
                        PlanCreateParams.Price.Unit.DimensionalPriceConfiguration.builder()
                            .addDimensionValue("string")
                            .dimensionalPriceGroupId("dimensional_price_group_id")
                            .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                            .build()
                    )
                    .externalPriceId("external_price_id")
                    .fixedPriceQuantity(0.0)
                    .invoiceGroupingKey("x")
                    .invoicingCycleConfiguration(
                        PlanCreateParams.Price.Unit.InvoicingCycleConfiguration.builder()
                            .duration(0L)
                            .durationUnit(
                                PlanCreateParams.Price.Unit.InvoicingCycleConfiguration.DurationUnit
                                    .DAY
                            )
                            .build()
                    )
                    .metadata(
                        PlanCreateParams.Price.Unit.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .defaultInvoiceMemo("default_invoice_memo")
            .externalPlanId("external_plan_id")
            .metadata(
                PlanCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .netTerms(0L)
            .status(PlanCreateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun body() {
        val params =
            PlanCreateParams.builder()
                .currency("currency")
                .name("name")
                .addPrice(
                    PlanCreateParams.Price.Unit.builder()
                        .cadence(PlanCreateParams.Price.Unit.Cadence.ANNUAL)
                        .itemId("item_id")
                        .name("Annual fee")
                        .unitConfig(
                            PlanCreateParams.Price.Unit.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            PlanCreateParams.Price.Unit.BillingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(
                                    PlanCreateParams.Price.Unit.BillingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .conversionRate(0.0)
                        .currency("currency")
                        .dimensionalPriceConfiguration(
                            PlanCreateParams.Price.Unit.DimensionalPriceConfiguration.builder()
                                .addDimensionValue("string")
                                .dimensionalPriceGroupId("dimensional_price_group_id")
                                .externalDimensionalPriceGroupId(
                                    "external_dimensional_price_group_id"
                                )
                                .build()
                        )
                        .externalPriceId("external_price_id")
                        .fixedPriceQuantity(0.0)
                        .invoiceGroupingKey("x")
                        .invoicingCycleConfiguration(
                            PlanCreateParams.Price.Unit.InvoicingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(
                                    PlanCreateParams.Price.Unit.InvoicingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .metadata(
                            PlanCreateParams.Price.Unit.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .defaultInvoiceMemo("default_invoice_memo")
                .externalPlanId("external_plan_id")
                .metadata(
                    PlanCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .netTerms(0L)
                .status(PlanCreateParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.prices())
            .containsExactly(
                PlanCreateParams.Price.ofUnit(
                    PlanCreateParams.Price.Unit.builder()
                        .cadence(PlanCreateParams.Price.Unit.Cadence.ANNUAL)
                        .itemId("item_id")
                        .name("Annual fee")
                        .unitConfig(
                            PlanCreateParams.Price.Unit.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .billableMetricId("billable_metric_id")
                        .billedInAdvance(true)
                        .billingCycleConfiguration(
                            PlanCreateParams.Price.Unit.BillingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(
                                    PlanCreateParams.Price.Unit.BillingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .conversionRate(0.0)
                        .currency("currency")
                        .dimensionalPriceConfiguration(
                            PlanCreateParams.Price.Unit.DimensionalPriceConfiguration.builder()
                                .addDimensionValue("string")
                                .dimensionalPriceGroupId("dimensional_price_group_id")
                                .externalDimensionalPriceGroupId(
                                    "external_dimensional_price_group_id"
                                )
                                .build()
                        )
                        .externalPriceId("external_price_id")
                        .fixedPriceQuantity(0.0)
                        .invoiceGroupingKey("x")
                        .invoicingCycleConfiguration(
                            PlanCreateParams.Price.Unit.InvoicingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(
                                    PlanCreateParams.Price.Unit.InvoicingCycleConfiguration
                                        .DurationUnit
                                        .DAY
                                )
                                .build()
                        )
                        .metadata(
                            PlanCreateParams.Price.Unit.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.defaultInvoiceMemo()).contains("default_invoice_memo")
        assertThat(body.externalPlanId()).contains("external_plan_id")
        assertThat(body.metadata())
            .contains(
                PlanCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.netTerms()).contains(0L)
        assertThat(body.status()).contains(PlanCreateParams.Status.ACTIVE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanCreateParams.builder()
                .currency("currency")
                .name("name")
                .addPrice(
                    PlanCreateParams.Price.Unit.builder()
                        .cadence(PlanCreateParams.Price.Unit.Cadence.ANNUAL)
                        .itemId("item_id")
                        .name("Annual fee")
                        .unitConfig(
                            PlanCreateParams.Price.Unit.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.prices())
            .containsExactly(
                PlanCreateParams.Price.ofUnit(
                    PlanCreateParams.Price.Unit.builder()
                        .cadence(PlanCreateParams.Price.Unit.Cadence.ANNUAL)
                        .itemId("item_id")
                        .name("Annual fee")
                        .unitConfig(
                            PlanCreateParams.Price.Unit.UnitConfig.builder()
                                .unitAmount("unit_amount")
                                .build()
                        )
                        .build()
                )
            )
    }
}
