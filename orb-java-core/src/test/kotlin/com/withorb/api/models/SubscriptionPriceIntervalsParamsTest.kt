// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionPriceIntervalsParamsTest {

    @Test
    fun create() {
        SubscriptionPriceIntervalsParams.builder()
            .subscriptionId("subscription_id")
            .addAdd(
                SubscriptionPriceIntervalsParams.Add.builder()
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .allocationPrice(
                        SubscriptionPriceIntervalsParams.Add.AllocationPrice.builder()
                            .amount("10.00")
                            .cadence(
                                SubscriptionPriceIntervalsParams.Add.AllocationPrice.Cadence.MONTHLY
                            )
                            .currency("USD")
                            .expiresAtEndOfCadence(true)
                            .build()
                    )
                    .addAmountDiscount(0.0)
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalPriceId("external_price_id")
                    .filter("my_property > 100 AND my_other_property = 'bar'")
                    .addFixedFeeQuantityTransition(
                        SubscriptionPriceIntervalsParams.Add.FixedFeeQuantityTransition.builder()
                            .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .quantity(5L)
                            .build()
                    )
                    .maximumAmount(0.0)
                    .minimumAmount(0.0)
                    .price(
                        SubscriptionPriceIntervalsParams.Add.Price.Unit.builder()
                            .cadence(SubscriptionPriceIntervalsParams.Add.Price.Unit.Cadence.ANNUAL)
                            .currency("currency")
                            .itemId("item_id")
                            .name("Annual fee")
                            .unitConfig(
                                SubscriptionPriceIntervalsParams.Add.Price.Unit.UnitConfig.builder()
                                    .unitAmount("unit_amount")
                                    .build()
                            )
                            .billableMetricId("billable_metric_id")
                            .billedInAdvance(true)
                            .billingCycleConfiguration(
                                SubscriptionPriceIntervalsParams.Add.Price.Unit
                                    .BillingCycleConfiguration
                                    .builder()
                                    .duration(0L)
                                    .durationUnit(
                                        SubscriptionPriceIntervalsParams.Add.Price.Unit
                                            .BillingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .conversionRate(0.0)
                            .externalPriceId("external_price_id")
                            .fixedPriceQuantity(0.0)
                            .invoiceGroupingKey("invoice_grouping_key")
                            .invoicingCycleConfiguration(
                                SubscriptionPriceIntervalsParams.Add.Price.Unit
                                    .InvoicingCycleConfiguration
                                    .builder()
                                    .duration(0L)
                                    .durationUnit(
                                        SubscriptionPriceIntervalsParams.Add.Price.Unit
                                            .InvoicingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .metadata(
                                SubscriptionPriceIntervalsParams.Add.Price.Unit.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .priceId("h74gfhdjvn7ujokd")
                    .addUsageCustomerId("string")
                    .build()
            )
            .addAddAdjustment(
                SubscriptionPriceIntervalsParams.AddAdjustment.builder()
                    .adjustment(
                        SubscriptionPriceIntervalsParams.AddAdjustment.Adjustment.PercentageDiscount
                            .builder()
                            .addAppliesToPriceId("price_1")
                            .addAppliesToPriceId("price_2")
                            .percentageDiscount(0.0)
                            .isInvoiceLevel(true)
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .allowInvoiceCreditOrVoid(true)
            .addEdit(
                SubscriptionPriceIntervalsParams.Edit.builder()
                    .priceIntervalId("sdfs6wdjvn7ujokd")
                    .billingCycleDay(0L)
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filter("my_property > 100 AND my_other_property = 'bar'")
                    .addFixedFeeQuantityTransition(
                        SubscriptionPriceIntervalsParams.Edit.FixedFeeQuantityTransition.builder()
                            .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .quantity(5L)
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addUsageCustomerId("string")
                    .build()
            )
            .addEditAdjustment(
                SubscriptionPriceIntervalsParams.EditAdjustment.builder()
                    .adjustmentIntervalId("sdfs6wdjvn7ujokd")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionPriceIntervalsParams.builder().subscriptionId("subscription_id").build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionPriceIntervalsParams.builder()
                .subscriptionId("subscription_id")
                .addAdd(
                    SubscriptionPriceIntervalsParams.Add.builder()
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .allocationPrice(
                            SubscriptionPriceIntervalsParams.Add.AllocationPrice.builder()
                                .amount("10.00")
                                .cadence(
                                    SubscriptionPriceIntervalsParams.Add.AllocationPrice.Cadence
                                        .MONTHLY
                                )
                                .currency("USD")
                                .expiresAtEndOfCadence(true)
                                .build()
                        )
                        .addAmountDiscount(0.0)
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .externalPriceId("external_price_id")
                        .filter("my_property > 100 AND my_other_property = 'bar'")
                        .addFixedFeeQuantityTransition(
                            SubscriptionPriceIntervalsParams.Add.FixedFeeQuantityTransition
                                .builder()
                                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .quantity(5L)
                                .build()
                        )
                        .maximumAmount(0.0)
                        .minimumAmount(0.0)
                        .price(
                            SubscriptionPriceIntervalsParams.Add.Price.Unit.builder()
                                .cadence(
                                    SubscriptionPriceIntervalsParams.Add.Price.Unit.Cadence.ANNUAL
                                )
                                .currency("currency")
                                .itemId("item_id")
                                .name("Annual fee")
                                .unitConfig(
                                    SubscriptionPriceIntervalsParams.Add.Price.Unit.UnitConfig
                                        .builder()
                                        .unitAmount("unit_amount")
                                        .build()
                                )
                                .billableMetricId("billable_metric_id")
                                .billedInAdvance(true)
                                .billingCycleConfiguration(
                                    SubscriptionPriceIntervalsParams.Add.Price.Unit
                                        .BillingCycleConfiguration
                                        .builder()
                                        .duration(0L)
                                        .durationUnit(
                                            SubscriptionPriceIntervalsParams.Add.Price.Unit
                                                .BillingCycleConfiguration
                                                .DurationUnit
                                                .DAY
                                        )
                                        .build()
                                )
                                .conversionRate(0.0)
                                .externalPriceId("external_price_id")
                                .fixedPriceQuantity(0.0)
                                .invoiceGroupingKey("invoice_grouping_key")
                                .invoicingCycleConfiguration(
                                    SubscriptionPriceIntervalsParams.Add.Price.Unit
                                        .InvoicingCycleConfiguration
                                        .builder()
                                        .duration(0L)
                                        .durationUnit(
                                            SubscriptionPriceIntervalsParams.Add.Price.Unit
                                                .InvoicingCycleConfiguration
                                                .DurationUnit
                                                .DAY
                                        )
                                        .build()
                                )
                                .metadata(
                                    SubscriptionPriceIntervalsParams.Add.Price.Unit.Metadata
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .priceId("h74gfhdjvn7ujokd")
                        .addUsageCustomerId("string")
                        .build()
                )
                .addAddAdjustment(
                    SubscriptionPriceIntervalsParams.AddAdjustment.builder()
                        .adjustment(
                            SubscriptionPriceIntervalsParams.AddAdjustment.Adjustment
                                .PercentageDiscount
                                .builder()
                                .addAppliesToPriceId("price_1")
                                .addAppliesToPriceId("price_2")
                                .percentageDiscount(0.0)
                                .isInvoiceLevel(true)
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .allowInvoiceCreditOrVoid(true)
                .addEdit(
                    SubscriptionPriceIntervalsParams.Edit.builder()
                        .priceIntervalId("sdfs6wdjvn7ujokd")
                        .billingCycleDay(0L)
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filter("my_property > 100 AND my_other_property = 'bar'")
                        .addFixedFeeQuantityTransition(
                            SubscriptionPriceIntervalsParams.Edit.FixedFeeQuantityTransition
                                .builder()
                                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .quantity(5L)
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addUsageCustomerId("string")
                        .build()
                )
                .addEditAdjustment(
                    SubscriptionPriceIntervalsParams.EditAdjustment.builder()
                        .adjustmentIntervalId("sdfs6wdjvn7ujokd")
                        .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.add().getOrNull())
            .containsExactly(
                SubscriptionPriceIntervalsParams.Add.builder()
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .allocationPrice(
                        SubscriptionPriceIntervalsParams.Add.AllocationPrice.builder()
                            .amount("10.00")
                            .cadence(
                                SubscriptionPriceIntervalsParams.Add.AllocationPrice.Cadence.MONTHLY
                            )
                            .currency("USD")
                            .expiresAtEndOfCadence(true)
                            .build()
                    )
                    .addAmountDiscount(0.0)
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalPriceId("external_price_id")
                    .filter("my_property > 100 AND my_other_property = 'bar'")
                    .addFixedFeeQuantityTransition(
                        SubscriptionPriceIntervalsParams.Add.FixedFeeQuantityTransition.builder()
                            .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .quantity(5L)
                            .build()
                    )
                    .maximumAmount(0.0)
                    .minimumAmount(0.0)
                    .price(
                        SubscriptionPriceIntervalsParams.Add.Price.Unit.builder()
                            .cadence(SubscriptionPriceIntervalsParams.Add.Price.Unit.Cadence.ANNUAL)
                            .currency("currency")
                            .itemId("item_id")
                            .name("Annual fee")
                            .unitConfig(
                                SubscriptionPriceIntervalsParams.Add.Price.Unit.UnitConfig.builder()
                                    .unitAmount("unit_amount")
                                    .build()
                            )
                            .billableMetricId("billable_metric_id")
                            .billedInAdvance(true)
                            .billingCycleConfiguration(
                                SubscriptionPriceIntervalsParams.Add.Price.Unit
                                    .BillingCycleConfiguration
                                    .builder()
                                    .duration(0L)
                                    .durationUnit(
                                        SubscriptionPriceIntervalsParams.Add.Price.Unit
                                            .BillingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .conversionRate(0.0)
                            .externalPriceId("external_price_id")
                            .fixedPriceQuantity(0.0)
                            .invoiceGroupingKey("invoice_grouping_key")
                            .invoicingCycleConfiguration(
                                SubscriptionPriceIntervalsParams.Add.Price.Unit
                                    .InvoicingCycleConfiguration
                                    .builder()
                                    .duration(0L)
                                    .durationUnit(
                                        SubscriptionPriceIntervalsParams.Add.Price.Unit
                                            .InvoicingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .metadata(
                                SubscriptionPriceIntervalsParams.Add.Price.Unit.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .priceId("h74gfhdjvn7ujokd")
                    .addUsageCustomerId("string")
                    .build()
            )
        assertThat(body.addAdjustments().getOrNull())
            .containsExactly(
                SubscriptionPriceIntervalsParams.AddAdjustment.builder()
                    .adjustment(
                        SubscriptionPriceIntervalsParams.AddAdjustment.Adjustment.PercentageDiscount
                            .builder()
                            .addAppliesToPriceId("price_1")
                            .addAppliesToPriceId("price_2")
                            .percentageDiscount(0.0)
                            .isInvoiceLevel(true)
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(body.allowInvoiceCreditOrVoid()).contains(true)
        assertThat(body.edit().getOrNull())
            .containsExactly(
                SubscriptionPriceIntervalsParams.Edit.builder()
                    .priceIntervalId("sdfs6wdjvn7ujokd")
                    .billingCycleDay(0L)
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filter("my_property > 100 AND my_other_property = 'bar'")
                    .addFixedFeeQuantityTransition(
                        SubscriptionPriceIntervalsParams.Edit.FixedFeeQuantityTransition.builder()
                            .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .quantity(5L)
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addUsageCustomerId("string")
                    .build()
            )
        assertThat(body.editAdjustments().getOrNull())
            .containsExactly(
                SubscriptionPriceIntervalsParams.EditAdjustment.builder()
                    .adjustmentIntervalId("sdfs6wdjvn7ujokd")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionPriceIntervalsParams.builder().subscriptionId("subscription_id").build()

        val body = params._body()
    }
}
