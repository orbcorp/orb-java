// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.beta

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.BetaExternalPlanIdCreatePlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdFetchPlanVersionParams
import com.withorb.api.models.BetaExternalPlanIdSetDefaultPlanVersionParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalPlanIdServiceAsyncTest {

    @Test
    fun createPlanVersion() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPlanIdServiceAsync = client.beta().externalPlanId()

        val planVersionFuture =
            externalPlanIdServiceAsync.createPlanVersion(
                BetaExternalPlanIdCreatePlanVersionParams.builder()
                    .externalPlanId("external_plan_id")
                    .version(0L)
                    .addAddAdjustment(
                        BetaExternalPlanIdCreatePlanVersionParams.AddAdjustment.builder()
                            .adjustment(
                                BetaExternalPlanIdCreatePlanVersionParams.AddAdjustment.Adjustment
                                    .PercentageDiscount
                                    .builder()
                                    .percentageDiscount(0.0)
                                    .appliesToAll(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddAdjustment
                                            .Adjustment
                                            .PercentageDiscount
                                            .AppliesToAll
                                            .TRUE
                                    )
                                    .addAppliesToItemId("item_1")
                                    .addAppliesToItemId("item_2")
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .currency("currency")
                                    .addFilter(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddAdjustment
                                            .Adjustment
                                            .PercentageDiscount
                                            .Filter
                                            .builder()
                                            .field(
                                                BetaExternalPlanIdCreatePlanVersionParams
                                                    .AddAdjustment
                                                    .Adjustment
                                                    .PercentageDiscount
                                                    .Filter
                                                    .Field
                                                    .PRICE_ID
                                            )
                                            .operator(
                                                BetaExternalPlanIdCreatePlanVersionParams
                                                    .AddAdjustment
                                                    .Adjustment
                                                    .PercentageDiscount
                                                    .Filter
                                                    .Operator
                                                    .INCLUDES
                                            )
                                            .addValue("string")
                                            .build()
                                    )
                                    .isInvoiceLevel(true)
                                    .priceType(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddAdjustment
                                            .Adjustment
                                            .PercentageDiscount
                                            .PriceType
                                            .USAGE
                                    )
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addAddPrice(
                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.builder()
                            .allocationPrice(
                                BetaExternalPlanIdCreatePlanVersionParams.AddPrice.AllocationPrice
                                    .builder()
                                    .amount("10.00")
                                    .cadence(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice
                                            .AllocationPrice
                                            .Cadence
                                            .MONTHLY
                                    )
                                    .currency("USD")
                                    .customExpiration(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice
                                            .AllocationPrice
                                            .CustomExpiration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaExternalPlanIdCreatePlanVersionParams.AddPrice
                                                    .AllocationPrice
                                                    .CustomExpiration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .price(
                                BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price.Unit
                                    .builder()
                                    .cadence(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price
                                            .Unit
                                            .Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .name("Annual fee")
                                    .unitConfig(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price
                                            .Unit
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price
                                            .Unit
                                            .BillingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaExternalPlanIdCreatePlanVersionParams.AddPrice
                                                    .Price
                                                    .Unit
                                                    .BillingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price
                                            .Unit
                                            .DimensionalPriceConfiguration
                                            .builder()
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
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price
                                            .Unit
                                            .InvoicingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaExternalPlanIdCreatePlanVersionParams.AddPrice
                                                    .Price
                                                    .Unit
                                                    .InvoicingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        BetaExternalPlanIdCreatePlanVersionParams.AddPrice.Price
                                            .Unit
                                            .Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .addRemoveAdjustment(
                        BetaExternalPlanIdCreatePlanVersionParams.RemoveAdjustment.builder()
                            .adjustmentId("adjustment_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addRemovePrice(
                        BetaExternalPlanIdCreatePlanVersionParams.RemovePrice.builder()
                            .priceId("price_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addReplaceAdjustment(
                        BetaExternalPlanIdCreatePlanVersionParams.ReplaceAdjustment.builder()
                            .adjustment(
                                BetaExternalPlanIdCreatePlanVersionParams.ReplaceAdjustment
                                    .Adjustment
                                    .PercentageDiscount
                                    .builder()
                                    .percentageDiscount(0.0)
                                    .appliesToAll(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplaceAdjustment
                                            .Adjustment
                                            .PercentageDiscount
                                            .AppliesToAll
                                            .TRUE
                                    )
                                    .addAppliesToItemId("item_1")
                                    .addAppliesToItemId("item_2")
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .currency("currency")
                                    .addFilter(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplaceAdjustment
                                            .Adjustment
                                            .PercentageDiscount
                                            .Filter
                                            .builder()
                                            .field(
                                                BetaExternalPlanIdCreatePlanVersionParams
                                                    .ReplaceAdjustment
                                                    .Adjustment
                                                    .PercentageDiscount
                                                    .Filter
                                                    .Field
                                                    .PRICE_ID
                                            )
                                            .operator(
                                                BetaExternalPlanIdCreatePlanVersionParams
                                                    .ReplaceAdjustment
                                                    .Adjustment
                                                    .PercentageDiscount
                                                    .Filter
                                                    .Operator
                                                    .INCLUDES
                                            )
                                            .addValue("string")
                                            .build()
                                    )
                                    .isInvoiceLevel(true)
                                    .priceType(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplaceAdjustment
                                            .Adjustment
                                            .PercentageDiscount
                                            .PriceType
                                            .USAGE
                                    )
                                    .build()
                            )
                            .replacesAdjustmentId("replaces_adjustment_id")
                            .planPhaseOrder(0L)
                            .build()
                    )
                    .addReplacePrice(
                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.builder()
                            .replacesPriceId("replaces_price_id")
                            .allocationPrice(
                                BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice
                                    .AllocationPrice
                                    .builder()
                                    .amount("10.00")
                                    .cadence(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice
                                            .AllocationPrice
                                            .Cadence
                                            .MONTHLY
                                    )
                                    .currency("USD")
                                    .customExpiration(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice
                                            .AllocationPrice
                                            .CustomExpiration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaExternalPlanIdCreatePlanVersionParams
                                                    .ReplacePrice
                                                    .AllocationPrice
                                                    .CustomExpiration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .planPhaseOrder(0L)
                            .price(
                                BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price.Unit
                                    .builder()
                                    .cadence(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price
                                            .Unit
                                            .Cadence
                                            .ANNUAL
                                    )
                                    .itemId("item_id")
                                    .name("Annual fee")
                                    .unitConfig(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price
                                            .Unit
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price
                                            .Unit
                                            .BillingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaExternalPlanIdCreatePlanVersionParams
                                                    .ReplacePrice
                                                    .Price
                                                    .Unit
                                                    .BillingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price
                                            .Unit
                                            .DimensionalPriceConfiguration
                                            .builder()
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
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price
                                            .Unit
                                            .InvoicingCycleConfiguration
                                            .builder()
                                            .duration(0L)
                                            .durationUnit(
                                                BetaExternalPlanIdCreatePlanVersionParams
                                                    .ReplacePrice
                                                    .Price
                                                    .Unit
                                                    .InvoicingCycleConfiguration
                                                    .DurationUnit
                                                    .DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        BetaExternalPlanIdCreatePlanVersionParams.ReplacePrice.Price
                                            .Unit
                                            .Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .setAsDefault(true)
                    .build()
            )

        val planVersion = planVersionFuture.get()
        planVersion.validate()
    }

    @Test
    fun fetchPlanVersion() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPlanIdServiceAsync = client.beta().externalPlanId()

        val planVersionFuture =
            externalPlanIdServiceAsync.fetchPlanVersion(
                BetaExternalPlanIdFetchPlanVersionParams.builder()
                    .externalPlanId("external_plan_id")
                    .version("version")
                    .build()
            )

        val planVersion = planVersionFuture.get()
        planVersion.validate()
    }

    @Test
    fun setDefaultPlanVersion() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPlanIdServiceAsync = client.beta().externalPlanId()

        val planFuture =
            externalPlanIdServiceAsync.setDefaultPlanVersion(
                BetaExternalPlanIdSetDefaultPlanVersionParams.builder()
                    .externalPlanId("external_plan_id")
                    .version(0L)
                    .build()
            )

        val plan = planFuture.get()
        plan.validate()
    }
}
