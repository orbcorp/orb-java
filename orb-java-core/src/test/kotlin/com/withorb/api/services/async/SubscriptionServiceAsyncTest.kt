// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.BillingCycleAnchorConfiguration
import com.withorb.api.models.CustomExpiration
import com.withorb.api.models.DiscountOverride
import com.withorb.api.models.NewAllocationPrice
import com.withorb.api.models.NewBillingCycleConfiguration
import com.withorb.api.models.NewDimensionalPriceConfiguration
import com.withorb.api.models.NewFloatingUnitPrice
import com.withorb.api.models.NewPercentageDiscount
import com.withorb.api.models.NewSubscriptionUnitPrice
import com.withorb.api.models.SubscriptionCancelParams
import com.withorb.api.models.SubscriptionCreateParams
import com.withorb.api.models.SubscriptionFetchCostsParams
import com.withorb.api.models.SubscriptionFetchUsageParams
import com.withorb.api.models.SubscriptionPriceIntervalsParams
import com.withorb.api.models.SubscriptionRedeemCouponParams
import com.withorb.api.models.SubscriptionSchedulePlanChangeParams
import com.withorb.api.models.SubscriptionTriggerPhaseParams
import com.withorb.api.models.SubscriptionUnscheduleFixedFeeQuantityUpdatesParams
import com.withorb.api.models.SubscriptionUpdateFixedFeeQuantityParams
import com.withorb.api.models.SubscriptionUpdateParams
import com.withorb.api.models.SubscriptionUpdateTrialParams
import com.withorb.api.models.TransformPriceFilter
import com.withorb.api.models.UnitConfig
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionFuture =
            subscriptionServiceAsync.create(
                SubscriptionCreateParams.builder()
                    .addAddAdjustment(
                        SubscriptionCreateParams.AddAdjustment.builder()
                            .adjustment(
                                NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT
                                    )
                                    .percentageDiscount(0.0)
                                    .appliesToAll(NewPercentageDiscount.AppliesToAll.TRUE)
                                    .addAppliesToItemId("item_1")
                                    .addAppliesToItemId("item_2")
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .currency("currency")
                                    .addFilter(
                                        TransformPriceFilter.builder()
                                            .field(TransformPriceFilter.Field.PRICE_ID)
                                            .operator(TransformPriceFilter.Operator.INCLUDES)
                                            .addValue("string")
                                            .build()
                                    )
                                    .isInvoiceLevel(true)
                                    .priceType(NewPercentageDiscount.PriceType.USAGE)
                                    .build()
                            )
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .planPhaseOrder(0L)
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addAddPrice(
                        SubscriptionCreateParams.AddPrice.builder()
                            .allocationPrice(
                                NewAllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPrice.Cadence.MONTHLY)
                                    .currency("USD")
                                    .customExpiration(
                                        CustomExpiration.builder()
                                            .duration(0L)
                                            .durationUnit(CustomExpiration.DurationUnit.DAY)
                                            .build()
                                    )
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addDiscount(
                                DiscountOverride.builder()
                                    .discountType(DiscountOverride.DiscountType.PERCENTAGE)
                                    .amountDiscount("amount_discount")
                                    .percentageDiscount(0.15)
                                    .usageDiscount(0.0)
                                    .build()
                            )
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .externalPriceId("external_price_id")
                            .maximumAmount("1.23")
                            .minimumAmount("1.23")
                            .planPhaseOrder(0L)
                            .price(
                                NewSubscriptionUnitPrice.builder()
                                    .cadence(NewSubscriptionUnitPrice.Cadence.ANNUAL)
                                    .itemId("item_id")
                                    .modelType(NewSubscriptionUnitPrice.ModelType.UNIT)
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder().unitAmount("unit_amount").build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        NewSubscriptionUnitPrice.ConversionRateConfig.Unit
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
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
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        NewSubscriptionUnitPrice.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .priceId("h74gfhdjvn7ujokd")
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .alignBillingWithSubscriptionStartDate(true)
                    .autoCollection(true)
                    .awsRegion("aws_region")
                    .billingCycleAnchorConfiguration(
                        BillingCycleAnchorConfiguration.builder().day(1L).month(1L).year(0L).build()
                    )
                    .couponRedemptionCode("coupon_redemption_code")
                    .creditsOverageRate(0.0)
                    .currency("currency")
                    .customerId("customer_id")
                    .defaultInvoiceMemo("default_invoice_memo")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalCustomerId("external_customer_id")
                    .externalMarketplace(SubscriptionCreateParams.ExternalMarketplace.GOOGLE)
                    .externalMarketplaceReportingId("external_marketplace_reporting_id")
                    .externalPlanId("ZMwNQefe7J3ecf7W")
                    .filter("my_property > 100 AND my_other_property = 'bar'")
                    .initialPhaseOrder(2L)
                    .invoicingThreshold("10.00")
                    .metadata(
                        SubscriptionCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .netTerms(0L)
                    .perCreditOverageAmount(0.0)
                    .planId("ZMwNQefe7J3ecf7W")
                    .planVersionNumber(0L)
                    .addPriceOverride(JsonValue.from(mapOf<String, Any>()))
                    .addRemoveAdjustment(
                        SubscriptionCreateParams.RemoveAdjustment.builder()
                            .adjustmentId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .addRemovePrice(
                        SubscriptionCreateParams.RemovePrice.builder()
                            .externalPriceId("external_price_id")
                            .priceId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .addReplaceAdjustment(
                        SubscriptionCreateParams.ReplaceAdjustment.builder()
                            .adjustment(
                                NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT
                                    )
                                    .percentageDiscount(0.0)
                                    .appliesToAll(NewPercentageDiscount.AppliesToAll.TRUE)
                                    .addAppliesToItemId("item_1")
                                    .addAppliesToItemId("item_2")
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .currency("currency")
                                    .addFilter(
                                        TransformPriceFilter.builder()
                                            .field(TransformPriceFilter.Field.PRICE_ID)
                                            .operator(TransformPriceFilter.Operator.INCLUDES)
                                            .addValue("string")
                                            .build()
                                    )
                                    .isInvoiceLevel(true)
                                    .priceType(NewPercentageDiscount.PriceType.USAGE)
                                    .build()
                            )
                            .replacesAdjustmentId("replaces_adjustment_id")
                            .build()
                    )
                    .addReplacePrice(
                        SubscriptionCreateParams.ReplacePrice.builder()
                            .replacesPriceId("replaces_price_id")
                            .allocationPrice(
                                NewAllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPrice.Cadence.MONTHLY)
                                    .currency("USD")
                                    .customExpiration(
                                        CustomExpiration.builder()
                                            .duration(0L)
                                            .durationUnit(CustomExpiration.DurationUnit.DAY)
                                            .build()
                                    )
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addDiscount(
                                DiscountOverride.builder()
                                    .discountType(DiscountOverride.DiscountType.PERCENTAGE)
                                    .amountDiscount("amount_discount")
                                    .percentageDiscount(0.15)
                                    .usageDiscount(0.0)
                                    .build()
                            )
                            .externalPriceId("external_price_id")
                            .fixedPriceQuantity(2.0)
                            .maximumAmount("1.23")
                            .minimumAmount("1.23")
                            .price(
                                NewSubscriptionUnitPrice.builder()
                                    .cadence(NewSubscriptionUnitPrice.Cadence.ANNUAL)
                                    .itemId("item_id")
                                    .modelType(NewSubscriptionUnitPrice.ModelType.UNIT)
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder().unitAmount("unit_amount").build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        NewSubscriptionUnitPrice.ConversionRateConfig.Unit
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
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
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        NewSubscriptionUnitPrice.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .priceId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .trialDurationDays(0L)
                    .addUsageCustomerId("string")
                    .build()
            )

        val mutatedSubscription = mutatedSubscriptionFuture.get()
        mutatedSubscription.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscriptionFuture =
            subscriptionServiceAsync.update(
                SubscriptionUpdateParams.builder()
                    .subscriptionId("subscription_id")
                    .autoCollection(true)
                    .defaultInvoiceMemo("default_invoice_memo")
                    .invoicingThreshold("10.00")
                    .metadata(
                        SubscriptionUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .netTerms(0L)
                    .build()
            )

        val subscription = subscriptionFuture.get()
        subscription.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val pageFuture = subscriptionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun cancel() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionFuture =
            subscriptionServiceAsync.cancel(
                SubscriptionCancelParams.builder()
                    .subscriptionId("subscription_id")
                    .cancelOption(SubscriptionCancelParams.CancelOption.END_OF_SUBSCRIPTION_TERM)
                    .allowInvoiceCreditOrVoid(true)
                    .cancellationDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val mutatedSubscription = mutatedSubscriptionFuture.get()
        mutatedSubscription.validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscriptionFuture = subscriptionServiceAsync.fetch("subscription_id")

        val subscription = subscriptionFuture.get()
        subscription.validate()
    }

    @Test
    fun fetchCosts() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val responseFuture =
            subscriptionServiceAsync.fetchCosts(
                SubscriptionFetchCostsParams.builder()
                    .subscriptionId("subscription_id")
                    .currency("currency")
                    .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                    .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                    .viewMode(SubscriptionFetchCostsParams.ViewMode.PERIODIC)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun fetchSchedule() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val pageFuture = subscriptionServiceAsync.fetchSchedule("subscription_id")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Incorrect example breaks Prism")
    @Test
    fun fetchUsage() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscriptionUsageFuture =
            subscriptionServiceAsync.fetchUsage(
                SubscriptionFetchUsageParams.builder()
                    .subscriptionId("subscription_id")
                    .billableMetricId("billable_metric_id")
                    .firstDimensionKey("first_dimension_key")
                    .firstDimensionValue("first_dimension_value")
                    .granularity(SubscriptionFetchUsageParams.Granularity.DAY)
                    .groupBy("group_by")
                    .secondDimensionKey("second_dimension_key")
                    .secondDimensionValue("second_dimension_value")
                    .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                    .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                    .viewMode(SubscriptionFetchUsageParams.ViewMode.PERIODIC)
                    .build()
            )

        val subscriptionUsage = subscriptionUsageFuture.get()
        subscriptionUsage.validate()
    }

    @Disabled("Incorrect example breaks Prism")
    @Test
    fun priceIntervals() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionFuture =
            subscriptionServiceAsync.priceIntervals(
                SubscriptionPriceIntervalsParams.builder()
                    .subscriptionId("subscription_id")
                    .addAdd(
                        SubscriptionPriceIntervalsParams.Add.builder()
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .allocationPrice(
                                NewAllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPrice.Cadence.MONTHLY)
                                    .currency("USD")
                                    .customExpiration(
                                        CustomExpiration.builder()
                                            .duration(0L)
                                            .durationUnit(CustomExpiration.DurationUnit.DAY)
                                            .build()
                                    )
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
                                NewFloatingUnitPrice.builder()
                                    .cadence(NewFloatingUnitPrice.Cadence.ANNUAL)
                                    .currency("currency")
                                    .itemId("item_id")
                                    .modelType(NewFloatingUnitPrice.ModelType.UNIT)
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder().unitAmount("unit_amount").build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        NewFloatingUnitPrice.ConversionRateConfig.Unit.UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
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
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        NewFloatingUnitPrice.Metadata.builder()
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
                                NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT
                                    )
                                    .percentageDiscount(0.0)
                                    .appliesToAll(NewPercentageDiscount.AppliesToAll.TRUE)
                                    .addAppliesToItemId("item_1")
                                    .addAppliesToItemId("item_2")
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .currency("currency")
                                    .addFilter(
                                        TransformPriceFilter.builder()
                                            .field(TransformPriceFilter.Field.PRICE_ID)
                                            .operator(TransformPriceFilter.Operator.INCLUDES)
                                            .addValue("string")
                                            .build()
                                    )
                                    .isInvoiceLevel(true)
                                    .priceType(NewPercentageDiscount.PriceType.USAGE)
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
            )

        val mutatedSubscription = mutatedSubscriptionFuture.get()
        mutatedSubscription.validate()
    }

    @Test
    fun redeemCoupon() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionFuture =
            subscriptionServiceAsync.redeemCoupon(
                SubscriptionRedeemCouponParams.builder()
                    .subscriptionId("subscription_id")
                    .changeOption(SubscriptionRedeemCouponParams.ChangeOption.REQUESTED_DATE)
                    .allowInvoiceCreditOrVoid(true)
                    .changeDate(OffsetDateTime.parse("2017-07-21T17:32:28Z"))
                    .couponId("coupon_id")
                    .couponRedemptionCode("coupon_redemption_code")
                    .build()
            )

        val mutatedSubscription = mutatedSubscriptionFuture.get()
        mutatedSubscription.validate()
    }

    @Test
    fun schedulePlanChange() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionFuture =
            subscriptionServiceAsync.schedulePlanChange(
                SubscriptionSchedulePlanChangeParams.builder()
                    .subscriptionId("subscription_id")
                    .changeOption(SubscriptionSchedulePlanChangeParams.ChangeOption.REQUESTED_DATE)
                    .addAddAdjustment(
                        SubscriptionSchedulePlanChangeParams.AddAdjustment.builder()
                            .adjustment(
                                NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT
                                    )
                                    .percentageDiscount(0.0)
                                    .appliesToAll(NewPercentageDiscount.AppliesToAll.TRUE)
                                    .addAppliesToItemId("item_1")
                                    .addAppliesToItemId("item_2")
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .currency("currency")
                                    .addFilter(
                                        TransformPriceFilter.builder()
                                            .field(TransformPriceFilter.Field.PRICE_ID)
                                            .operator(TransformPriceFilter.Operator.INCLUDES)
                                            .addValue("string")
                                            .build()
                                    )
                                    .isInvoiceLevel(true)
                                    .priceType(NewPercentageDiscount.PriceType.USAGE)
                                    .build()
                            )
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .planPhaseOrder(0L)
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .addAddPrice(
                        SubscriptionSchedulePlanChangeParams.AddPrice.builder()
                            .allocationPrice(
                                NewAllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPrice.Cadence.MONTHLY)
                                    .currency("USD")
                                    .customExpiration(
                                        CustomExpiration.builder()
                                            .duration(0L)
                                            .durationUnit(CustomExpiration.DurationUnit.DAY)
                                            .build()
                                    )
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addDiscount(
                                DiscountOverride.builder()
                                    .discountType(DiscountOverride.DiscountType.PERCENTAGE)
                                    .amountDiscount("amount_discount")
                                    .percentageDiscount(0.15)
                                    .usageDiscount(0.0)
                                    .build()
                            )
                            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .externalPriceId("external_price_id")
                            .maximumAmount("1.23")
                            .minimumAmount("1.23")
                            .planPhaseOrder(0L)
                            .price(
                                NewSubscriptionUnitPrice.builder()
                                    .cadence(NewSubscriptionUnitPrice.Cadence.ANNUAL)
                                    .itemId("item_id")
                                    .modelType(NewSubscriptionUnitPrice.ModelType.UNIT)
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder().unitAmount("unit_amount").build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        NewSubscriptionUnitPrice.ConversionRateConfig.Unit
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
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
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        NewSubscriptionUnitPrice.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .priceId("h74gfhdjvn7ujokd")
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .alignBillingWithPlanChangeDate(true)
                    .autoCollection(true)
                    .billingCycleAlignment(
                        SubscriptionSchedulePlanChangeParams.BillingCycleAlignment.UNCHANGED
                    )
                    .billingCycleAnchorConfiguration(
                        BillingCycleAnchorConfiguration.builder().day(1L).month(1L).year(0L).build()
                    )
                    .changeDate(OffsetDateTime.parse("2017-07-21T17:32:28Z"))
                    .couponRedemptionCode("coupon_redemption_code")
                    .creditsOverageRate(0.0)
                    .defaultInvoiceMemo("default_invoice_memo")
                    .externalPlanId("ZMwNQefe7J3ecf7W")
                    .filter("my_property > 100 AND my_other_property = 'bar'")
                    .initialPhaseOrder(2L)
                    .invoicingThreshold("10.00")
                    .netTerms(0L)
                    .perCreditOverageAmount(0.0)
                    .planId("ZMwNQefe7J3ecf7W")
                    .planVersionNumber(0L)
                    .addPriceOverride(JsonValue.from(mapOf<String, Any>()))
                    .addRemoveAdjustment(
                        SubscriptionSchedulePlanChangeParams.RemoveAdjustment.builder()
                            .adjustmentId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .addRemovePrice(
                        SubscriptionSchedulePlanChangeParams.RemovePrice.builder()
                            .externalPriceId("external_price_id")
                            .priceId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .addReplaceAdjustment(
                        SubscriptionSchedulePlanChangeParams.ReplaceAdjustment.builder()
                            .adjustment(
                                NewPercentageDiscount.builder()
                                    .adjustmentType(
                                        NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT
                                    )
                                    .percentageDiscount(0.0)
                                    .appliesToAll(NewPercentageDiscount.AppliesToAll.TRUE)
                                    .addAppliesToItemId("item_1")
                                    .addAppliesToItemId("item_2")
                                    .addAppliesToPriceId("price_1")
                                    .addAppliesToPriceId("price_2")
                                    .currency("currency")
                                    .addFilter(
                                        TransformPriceFilter.builder()
                                            .field(TransformPriceFilter.Field.PRICE_ID)
                                            .operator(TransformPriceFilter.Operator.INCLUDES)
                                            .addValue("string")
                                            .build()
                                    )
                                    .isInvoiceLevel(true)
                                    .priceType(NewPercentageDiscount.PriceType.USAGE)
                                    .build()
                            )
                            .replacesAdjustmentId("replaces_adjustment_id")
                            .build()
                    )
                    .addReplacePrice(
                        SubscriptionSchedulePlanChangeParams.ReplacePrice.builder()
                            .replacesPriceId("replaces_price_id")
                            .allocationPrice(
                                NewAllocationPrice.builder()
                                    .amount("10.00")
                                    .cadence(NewAllocationPrice.Cadence.MONTHLY)
                                    .currency("USD")
                                    .customExpiration(
                                        CustomExpiration.builder()
                                            .duration(0L)
                                            .durationUnit(CustomExpiration.DurationUnit.DAY)
                                            .build()
                                    )
                                    .expiresAtEndOfCadence(true)
                                    .build()
                            )
                            .addDiscount(
                                DiscountOverride.builder()
                                    .discountType(DiscountOverride.DiscountType.PERCENTAGE)
                                    .amountDiscount("amount_discount")
                                    .percentageDiscount(0.15)
                                    .usageDiscount(0.0)
                                    .build()
                            )
                            .externalPriceId("external_price_id")
                            .fixedPriceQuantity(2.0)
                            .maximumAmount("1.23")
                            .minimumAmount("1.23")
                            .price(
                                NewSubscriptionUnitPrice.builder()
                                    .cadence(NewSubscriptionUnitPrice.Cadence.ANNUAL)
                                    .itemId("item_id")
                                    .modelType(NewSubscriptionUnitPrice.ModelType.UNIT)
                                    .name("Annual fee")
                                    .unitConfig(
                                        UnitConfig.builder().unitAmount("unit_amount").build()
                                    )
                                    .billableMetricId("billable_metric_id")
                                    .billedInAdvance(true)
                                    .billingCycleConfiguration(
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .conversionRate(0.0)
                                    .unitConversionRateConfig(
                                        NewSubscriptionUnitPrice.ConversionRateConfig.Unit
                                            .UnitConfig
                                            .builder()
                                            .unitAmount("unit_amount")
                                            .build()
                                    )
                                    .currency("currency")
                                    .dimensionalPriceConfiguration(
                                        NewDimensionalPriceConfiguration.builder()
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
                                        NewBillingCycleConfiguration.builder()
                                            .duration(0L)
                                            .durationUnit(
                                                NewBillingCycleConfiguration.DurationUnit.DAY
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        NewSubscriptionUnitPrice.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .referenceId("reference_id")
                                    .build()
                            )
                            .priceId("h74gfhdjvn7ujokd")
                            .build()
                    )
                    .trialDurationDays(0L)
                    .addUsageCustomerId("string")
                    .build()
            )

        val mutatedSubscription = mutatedSubscriptionFuture.get()
        mutatedSubscription.validate()
    }

    @Test
    fun triggerPhase() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionFuture =
            subscriptionServiceAsync.triggerPhase(
                SubscriptionTriggerPhaseParams.builder()
                    .subscriptionId("subscription_id")
                    .allowInvoiceCreditOrVoid(true)
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val mutatedSubscription = mutatedSubscriptionFuture.get()
        mutatedSubscription.validate()
    }

    @Test
    fun unscheduleCancellation() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionFuture =
            subscriptionServiceAsync.unscheduleCancellation("subscription_id")

        val mutatedSubscription = mutatedSubscriptionFuture.get()
        mutatedSubscription.validate()
    }

    @Test
    fun unscheduleFixedFeeQuantityUpdates() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionFuture =
            subscriptionServiceAsync.unscheduleFixedFeeQuantityUpdates(
                SubscriptionUnscheduleFixedFeeQuantityUpdatesParams.builder()
                    .subscriptionId("subscription_id")
                    .priceId("price_id")
                    .build()
            )

        val mutatedSubscription = mutatedSubscriptionFuture.get()
        mutatedSubscription.validate()
    }

    @Test
    fun unschedulePendingPlanChanges() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionFuture =
            subscriptionServiceAsync.unschedulePendingPlanChanges("subscription_id")

        val mutatedSubscription = mutatedSubscriptionFuture.get()
        mutatedSubscription.validate()
    }

    @Test
    fun updateFixedFeeQuantity() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionFuture =
            subscriptionServiceAsync.updateFixedFeeQuantity(
                SubscriptionUpdateFixedFeeQuantityParams.builder()
                    .subscriptionId("subscription_id")
                    .priceId("price_id")
                    .quantity(0.0)
                    .allowInvoiceCreditOrVoid(true)
                    .changeOption(SubscriptionUpdateFixedFeeQuantityParams.ChangeOption.IMMEDIATE)
                    .effectiveDate(LocalDate.parse("2022-12-21"))
                    .build()
            )

        val mutatedSubscription = mutatedSubscriptionFuture.get()
        mutatedSubscription.validate()
    }

    @Test
    fun updateTrial() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val mutatedSubscriptionFuture =
            subscriptionServiceAsync.updateTrial(
                SubscriptionUpdateTrialParams.builder()
                    .subscriptionId("subscription_id")
                    .trialEndDate(OffsetDateTime.parse("2017-07-21T17:32:28Z"))
                    .shift(true)
                    .build()
            )

        val mutatedSubscription = mutatedSubscriptionFuture.get()
        mutatedSubscription.validate()
    }
}
