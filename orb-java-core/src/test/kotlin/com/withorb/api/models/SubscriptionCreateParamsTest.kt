// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionCreateParamsTest {

    @Test
    fun createSubscriptionCreateParams() {
        SubscriptionCreateParams.builder()
            .alignBillingWithSubscriptionStartDate(true)
            .autoCollection(true)
            .awsRegion("string")
            .couponRedemptionCode("string")
            .creditsOverageRate(42.23)
            .customerId("string")
            .defaultInvoiceMemo("string")
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .externalCustomerId("string")
            .externalMarketplace(SubscriptionCreateParams.ExternalMarketplace.GOOGLE)
            .externalMarketplaceReportingId("string")
            .externalPlanId("ZMwNQefe7J3ecf7W")
            .initialPhaseOrder(123L)
            .invoicingThreshold("string")
            .metadata(SubscriptionCreateParams.Metadata.builder().build())
            .netTerms(123L)
            .perCreditOverageAmount(42.23)
            .planId("ZMwNQefe7J3ecf7W")
            .priceOverrides(
                listOf(
                    SubscriptionCreateParams.PriceOverride.ofOverrideUnitPrice(
                        SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.builder()
                            .id("string")
                            .modelType(
                                SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.ModelType
                                    .UNIT
                            )
                            .unitConfig(
                                SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.UnitConfig
                                    .builder()
                                    .unitAmount("string")
                                    .build()
                            )
                            .conversionRate(42.23)
                            .currency("string")
                            .discount(
                                SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.Discount
                                    .builder()
                                    .discountType(
                                        SubscriptionCreateParams.PriceOverride.OverrideUnitPrice
                                            .Discount
                                            .DiscountType
                                            .PERCENTAGE
                                    )
                                    .amountDiscount("string")
                                    .appliesToPriceIds(listOf("string"))
                                    .percentageDiscount(42.23)
                                    .trialAmountDiscount("string")
                                    .usageDiscount(42.23)
                                    .build()
                            )
                            .fixedPriceQuantity(42.23)
                            .maximumAmount("1.23")
                            .minimumAmount("1.23")
                            .build()
                    )
                )
            )
            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SubscriptionCreateParams.builder()
                .alignBillingWithSubscriptionStartDate(true)
                .autoCollection(true)
                .awsRegion("string")
                .couponRedemptionCode("string")
                .creditsOverageRate(42.23)
                .customerId("string")
                .defaultInvoiceMemo("string")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalCustomerId("string")
                .externalMarketplace(SubscriptionCreateParams.ExternalMarketplace.GOOGLE)
                .externalMarketplaceReportingId("string")
                .externalPlanId("ZMwNQefe7J3ecf7W")
                .initialPhaseOrder(123L)
                .invoicingThreshold("string")
                .metadata(SubscriptionCreateParams.Metadata.builder().build())
                .netTerms(123L)
                .perCreditOverageAmount(42.23)
                .planId("ZMwNQefe7J3ecf7W")
                .priceOverrides(
                    listOf(
                        SubscriptionCreateParams.PriceOverride.ofOverrideUnitPrice(
                            SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.builder()
                                .id("string")
                                .modelType(
                                    SubscriptionCreateParams.PriceOverride.OverrideUnitPrice
                                        .ModelType
                                        .UNIT
                                )
                                .unitConfig(
                                    SubscriptionCreateParams.PriceOverride.OverrideUnitPrice
                                        .UnitConfig
                                        .builder()
                                        .unitAmount("string")
                                        .build()
                                )
                                .conversionRate(42.23)
                                .currency("string")
                                .discount(
                                    SubscriptionCreateParams.PriceOverride.OverrideUnitPrice
                                        .Discount
                                        .builder()
                                        .discountType(
                                            SubscriptionCreateParams.PriceOverride.OverrideUnitPrice
                                                .Discount
                                                .DiscountType
                                                .PERCENTAGE
                                        )
                                        .amountDiscount("string")
                                        .appliesToPriceIds(listOf("string"))
                                        .percentageDiscount(42.23)
                                        .trialAmountDiscount("string")
                                        .usageDiscount(42.23)
                                        .build()
                                )
                                .fixedPriceQuantity(42.23)
                                .maximumAmount("1.23")
                                .minimumAmount("1.23")
                                .build()
                        )
                    )
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.alignBillingWithSubscriptionStartDate()).isEqualTo(true)
        assertThat(body.autoCollection()).isEqualTo(true)
        assertThat(body.awsRegion()).isEqualTo("string")
        assertThat(body.couponRedemptionCode()).isEqualTo("string")
        assertThat(body.creditsOverageRate()).isEqualTo(42.23)
        assertThat(body.customerId()).isEqualTo("string")
        assertThat(body.defaultInvoiceMemo()).isEqualTo("string")
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.externalCustomerId()).isEqualTo("string")
        assertThat(body.externalMarketplace())
            .isEqualTo(SubscriptionCreateParams.ExternalMarketplace.GOOGLE)
        assertThat(body.externalMarketplaceReportingId()).isEqualTo("string")
        assertThat(body.externalPlanId()).isEqualTo("ZMwNQefe7J3ecf7W")
        assertThat(body.initialPhaseOrder()).isEqualTo(123L)
        assertThat(body.invoicingThreshold()).isEqualTo("string")
        assertThat(body.metadata()).isEqualTo(SubscriptionCreateParams.Metadata.builder().build())
        assertThat(body.netTerms()).isEqualTo(123L)
        assertThat(body.perCreditOverageAmount()).isEqualTo(42.23)
        assertThat(body.planId()).isEqualTo("ZMwNQefe7J3ecf7W")
        assertThat(body.priceOverrides())
            .isEqualTo(
                listOf(
                    SubscriptionCreateParams.PriceOverride.ofOverrideUnitPrice(
                        SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.builder()
                            .id("string")
                            .modelType(
                                SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.ModelType
                                    .UNIT
                            )
                            .unitConfig(
                                SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.UnitConfig
                                    .builder()
                                    .unitAmount("string")
                                    .build()
                            )
                            .conversionRate(42.23)
                            .currency("string")
                            .discount(
                                SubscriptionCreateParams.PriceOverride.OverrideUnitPrice.Discount
                                    .builder()
                                    .discountType(
                                        SubscriptionCreateParams.PriceOverride.OverrideUnitPrice
                                            .Discount
                                            .DiscountType
                                            .PERCENTAGE
                                    )
                                    .amountDiscount("string")
                                    .appliesToPriceIds(listOf("string"))
                                    .percentageDiscount(42.23)
                                    .trialAmountDiscount("string")
                                    .usageDiscount(42.23)
                                    .build()
                            )
                            .fixedPriceQuantity(42.23)
                            .maximumAmount("1.23")
                            .minimumAmount("1.23")
                            .build()
                    )
                )
            )
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SubscriptionCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
