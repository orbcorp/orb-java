// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceLineItemCreateResponseTest {

    @Test
    fun create() {
        val invoiceLineItemCreateResponse =
            InvoiceLineItemCreateResponse.builder()
                .id("id")
                .adjustedSubtotal("5.00")
                .addAdjustment(
                    MonetaryUsageDiscountAdjustment.builder()
                        .id("id")
                        .adjustmentType(
                            MonetaryUsageDiscountAdjustment.AdjustmentType.USAGE_DISCOUNT
                        )
                        .amount("amount")
                        .addAppliesToPriceId("string")
                        .addFilter(
                            TransformPriceFilter.builder()
                                .field(TransformPriceFilter.Field.PRICE_ID)
                                .operator(TransformPriceFilter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
                        .isInvoiceLevel(true)
                        .reason("reason")
                        .replacesAdjustmentId("replaces_adjustment_id")
                        .usageDiscount(0.0)
                        .build()
                )
                .amount("7.00")
                .creditsApplied("6.00")
                .discount(
                    PercentageDiscount.builder()
                        .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(0.15)
                        .addAppliesToPriceId("h74gfhdjvn7ujokd")
                        .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                        .addFilter(
                            TransformPriceFilter.builder()
                                .field(TransformPriceFilter.Field.PRICE_ID)
                                .operator(TransformPriceFilter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
                        .reason("reason")
                        .build()
                )
                .endDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
                .filter("filter")
                .grouping("grouping")
                .maximum(
                    Maximum.builder()
                        .addAppliesToPriceId("string")
                        .addFilter(
                            TransformPriceFilter.builder()
                                .field(TransformPriceFilter.Field.PRICE_ID)
                                .operator(TransformPriceFilter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
                        .maximumAmount("maximum_amount")
                        .build()
                )
                .maximumAmount("maximum_amount")
                .minimum(
                    Minimum.builder()
                        .addAppliesToPriceId("string")
                        .addFilter(
                            TransformPriceFilter.builder()
                                .field(TransformPriceFilter.Field.PRICE_ID)
                                .operator(TransformPriceFilter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
                        .minimumAmount("minimum_amount")
                        .build()
                )
                .minimumAmount("minimum_amount")
                .name("Fixed Fee")
                .partiallyInvoicedAmount("4.00")
                .price(
                    Price.Unit.builder()
                        .id("id")
                        .billableMetric(BillableMetricTiny.builder().id("id").build())
                        .billingCycleConfiguration(
                            BillingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(BillingCycleConfiguration.DurationUnit.DAY)
                                .build()
                        )
                        .cadence(Price.Unit.Cadence.ONE_TIME)
                        .conversionRate(0.0)
                        .unitConversionRateConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditAllocation(
                            Allocation.builder()
                                .allowsRollover(true)
                                .currency("currency")
                                .customExpiration(
                                    CustomExpiration.builder()
                                        .duration(0L)
                                        .durationUnit(CustomExpiration.DurationUnit.DAY)
                                        .build()
                                )
                                .build()
                        )
                        .currency("currency")
                        .discount(
                            PercentageDiscount.builder()
                                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                                .percentageDiscount(0.15)
                                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                                .addFilter(
                                    TransformPriceFilter.builder()
                                        .field(TransformPriceFilter.Field.PRICE_ID)
                                        .operator(TransformPriceFilter.Operator.INCLUDES)
                                        .addValue("string")
                                        .build()
                                )
                                .reason("reason")
                                .build()
                        )
                        .externalPriceId("external_price_id")
                        .fixedPriceQuantity(0.0)
                        .invoicingCycleConfiguration(
                            BillingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(BillingCycleConfiguration.DurationUnit.DAY)
                                .build()
                        )
                        .item(ItemSlim.builder().id("id").name("name").build())
                        .maximum(
                            Maximum.builder()
                                .addAppliesToPriceId("string")
                                .addFilter(
                                    TransformPriceFilter.builder()
                                        .field(TransformPriceFilter.Field.PRICE_ID)
                                        .operator(TransformPriceFilter.Operator.INCLUDES)
                                        .addValue("string")
                                        .build()
                                )
                                .maximumAmount("maximum_amount")
                                .build()
                        )
                        .maximumAmount("maximum_amount")
                        .metadata(
                            Price.Unit.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .minimum(
                            Minimum.builder()
                                .addAppliesToPriceId("string")
                                .addFilter(
                                    TransformPriceFilter.builder()
                                        .field(TransformPriceFilter.Field.PRICE_ID)
                                        .operator(TransformPriceFilter.Operator.INCLUDES)
                                        .addValue("string")
                                        .build()
                                )
                                .minimumAmount("minimum_amount")
                                .build()
                        )
                        .minimumAmount("minimum_amount")
                        .name("name")
                        .planPhaseOrder(0L)
                        .priceType(Price.Unit.PriceType.USAGE_PRICE)
                        .replacesPriceId("replaces_price_id")
                        .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                        .dimensionalPriceConfiguration(
                            DimensionalPriceConfiguration.builder()
                                .addDimensionValue("string")
                                .dimensionalPriceGroupId("dimensional_price_group_id")
                                .build()
                        )
                        .build()
                )
                .quantity(1.0)
                .startDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
                .addSubLineItem(
                    MatrixSubLineItem.builder()
                        .amount("9.00")
                        .grouping(SubLineItemGrouping.builder().key("region").value("west").build())
                        .matrixConfig(
                            SubLineItemMatrixConfig.builder().addDimensionValue("string").build()
                        )
                        .name("Tier One")
                        .quantity(5.0)
                        .type(MatrixSubLineItem.Type.MATRIX)
                        .build()
                )
                .subtotal("9.00")
                .addTaxAmount(
                    TaxAmount.builder()
                        .amount("amount")
                        .taxRateDescription("tax_rate_description")
                        .taxRatePercentage("tax_rate_percentage")
                        .build()
                )
                .addUsageCustomerId("string")
                .build()

        assertThat(invoiceLineItemCreateResponse.id()).isEqualTo("id")
        assertThat(invoiceLineItemCreateResponse.adjustedSubtotal()).isEqualTo("5.00")
        assertThat(invoiceLineItemCreateResponse.adjustments())
            .containsExactly(
                InvoiceLineItemCreateResponse.Adjustment.ofUsageDiscount(
                    MonetaryUsageDiscountAdjustment.builder()
                        .id("id")
                        .adjustmentType(
                            MonetaryUsageDiscountAdjustment.AdjustmentType.USAGE_DISCOUNT
                        )
                        .amount("amount")
                        .addAppliesToPriceId("string")
                        .addFilter(
                            TransformPriceFilter.builder()
                                .field(TransformPriceFilter.Field.PRICE_ID)
                                .operator(TransformPriceFilter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
                        .isInvoiceLevel(true)
                        .reason("reason")
                        .replacesAdjustmentId("replaces_adjustment_id")
                        .usageDiscount(0.0)
                        .build()
                )
            )
        assertThat(invoiceLineItemCreateResponse.amount()).isEqualTo("7.00")
        assertThat(invoiceLineItemCreateResponse.creditsApplied()).isEqualTo("6.00")
        assertThat(invoiceLineItemCreateResponse.discount())
            .contains(
                Discount.ofPercentage(
                    PercentageDiscount.builder()
                        .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(0.15)
                        .addAppliesToPriceId("h74gfhdjvn7ujokd")
                        .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                        .addFilter(
                            TransformPriceFilter.builder()
                                .field(TransformPriceFilter.Field.PRICE_ID)
                                .operator(TransformPriceFilter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
                        .reason("reason")
                        .build()
                )
            )
        assertThat(invoiceLineItemCreateResponse.endDate())
            .isEqualTo(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
        assertThat(invoiceLineItemCreateResponse.filter()).contains("filter")
        assertThat(invoiceLineItemCreateResponse.grouping()).contains("grouping")
        assertThat(invoiceLineItemCreateResponse.maximum())
            .contains(
                Maximum.builder()
                    .addAppliesToPriceId("string")
                    .addFilter(
                        TransformPriceFilter.builder()
                            .field(TransformPriceFilter.Field.PRICE_ID)
                            .operator(TransformPriceFilter.Operator.INCLUDES)
                            .addValue("string")
                            .build()
                    )
                    .maximumAmount("maximum_amount")
                    .build()
            )
        assertThat(invoiceLineItemCreateResponse.maximumAmount()).contains("maximum_amount")
        assertThat(invoiceLineItemCreateResponse.minimum())
            .contains(
                Minimum.builder()
                    .addAppliesToPriceId("string")
                    .addFilter(
                        TransformPriceFilter.builder()
                            .field(TransformPriceFilter.Field.PRICE_ID)
                            .operator(TransformPriceFilter.Operator.INCLUDES)
                            .addValue("string")
                            .build()
                    )
                    .minimumAmount("minimum_amount")
                    .build()
            )
        assertThat(invoiceLineItemCreateResponse.minimumAmount()).contains("minimum_amount")
        assertThat(invoiceLineItemCreateResponse.name()).isEqualTo("Fixed Fee")
        assertThat(invoiceLineItemCreateResponse.partiallyInvoicedAmount()).isEqualTo("4.00")
        assertThat(invoiceLineItemCreateResponse.price())
            .isEqualTo(
                Price.ofUnit(
                    Price.Unit.builder()
                        .id("id")
                        .billableMetric(BillableMetricTiny.builder().id("id").build())
                        .billingCycleConfiguration(
                            BillingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(BillingCycleConfiguration.DurationUnit.DAY)
                                .build()
                        )
                        .cadence(Price.Unit.Cadence.ONE_TIME)
                        .conversionRate(0.0)
                        .unitConversionRateConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditAllocation(
                            Allocation.builder()
                                .allowsRollover(true)
                                .currency("currency")
                                .customExpiration(
                                    CustomExpiration.builder()
                                        .duration(0L)
                                        .durationUnit(CustomExpiration.DurationUnit.DAY)
                                        .build()
                                )
                                .build()
                        )
                        .currency("currency")
                        .discount(
                            PercentageDiscount.builder()
                                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                                .percentageDiscount(0.15)
                                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                                .addFilter(
                                    TransformPriceFilter.builder()
                                        .field(TransformPriceFilter.Field.PRICE_ID)
                                        .operator(TransformPriceFilter.Operator.INCLUDES)
                                        .addValue("string")
                                        .build()
                                )
                                .reason("reason")
                                .build()
                        )
                        .externalPriceId("external_price_id")
                        .fixedPriceQuantity(0.0)
                        .invoicingCycleConfiguration(
                            BillingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(BillingCycleConfiguration.DurationUnit.DAY)
                                .build()
                        )
                        .item(ItemSlim.builder().id("id").name("name").build())
                        .maximum(
                            Maximum.builder()
                                .addAppliesToPriceId("string")
                                .addFilter(
                                    TransformPriceFilter.builder()
                                        .field(TransformPriceFilter.Field.PRICE_ID)
                                        .operator(TransformPriceFilter.Operator.INCLUDES)
                                        .addValue("string")
                                        .build()
                                )
                                .maximumAmount("maximum_amount")
                                .build()
                        )
                        .maximumAmount("maximum_amount")
                        .metadata(
                            Price.Unit.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .minimum(
                            Minimum.builder()
                                .addAppliesToPriceId("string")
                                .addFilter(
                                    TransformPriceFilter.builder()
                                        .field(TransformPriceFilter.Field.PRICE_ID)
                                        .operator(TransformPriceFilter.Operator.INCLUDES)
                                        .addValue("string")
                                        .build()
                                )
                                .minimumAmount("minimum_amount")
                                .build()
                        )
                        .minimumAmount("minimum_amount")
                        .name("name")
                        .planPhaseOrder(0L)
                        .priceType(Price.Unit.PriceType.USAGE_PRICE)
                        .replacesPriceId("replaces_price_id")
                        .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                        .dimensionalPriceConfiguration(
                            DimensionalPriceConfiguration.builder()
                                .addDimensionValue("string")
                                .dimensionalPriceGroupId("dimensional_price_group_id")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(invoiceLineItemCreateResponse.quantity()).isEqualTo(1.0)
        assertThat(invoiceLineItemCreateResponse.startDate())
            .isEqualTo(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
        assertThat(invoiceLineItemCreateResponse.subLineItems())
            .containsExactly(
                InvoiceLineItemCreateResponse.SubLineItem.ofMatrix(
                    MatrixSubLineItem.builder()
                        .amount("9.00")
                        .grouping(SubLineItemGrouping.builder().key("region").value("west").build())
                        .matrixConfig(
                            SubLineItemMatrixConfig.builder().addDimensionValue("string").build()
                        )
                        .name("Tier One")
                        .quantity(5.0)
                        .type(MatrixSubLineItem.Type.MATRIX)
                        .build()
                )
            )
        assertThat(invoiceLineItemCreateResponse.subtotal()).isEqualTo("9.00")
        assertThat(invoiceLineItemCreateResponse.taxAmounts())
            .containsExactly(
                TaxAmount.builder()
                    .amount("amount")
                    .taxRateDescription("tax_rate_description")
                    .taxRatePercentage("tax_rate_percentage")
                    .build()
            )
        assertThat(invoiceLineItemCreateResponse.usageCustomerIds().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceLineItemCreateResponse =
            InvoiceLineItemCreateResponse.builder()
                .id("id")
                .adjustedSubtotal("5.00")
                .addAdjustment(
                    MonetaryUsageDiscountAdjustment.builder()
                        .id("id")
                        .adjustmentType(
                            MonetaryUsageDiscountAdjustment.AdjustmentType.USAGE_DISCOUNT
                        )
                        .amount("amount")
                        .addAppliesToPriceId("string")
                        .addFilter(
                            TransformPriceFilter.builder()
                                .field(TransformPriceFilter.Field.PRICE_ID)
                                .operator(TransformPriceFilter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
                        .isInvoiceLevel(true)
                        .reason("reason")
                        .replacesAdjustmentId("replaces_adjustment_id")
                        .usageDiscount(0.0)
                        .build()
                )
                .amount("7.00")
                .creditsApplied("6.00")
                .discount(
                    PercentageDiscount.builder()
                        .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(0.15)
                        .addAppliesToPriceId("h74gfhdjvn7ujokd")
                        .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                        .addFilter(
                            TransformPriceFilter.builder()
                                .field(TransformPriceFilter.Field.PRICE_ID)
                                .operator(TransformPriceFilter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
                        .reason("reason")
                        .build()
                )
                .endDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
                .filter("filter")
                .grouping("grouping")
                .maximum(
                    Maximum.builder()
                        .addAppliesToPriceId("string")
                        .addFilter(
                            TransformPriceFilter.builder()
                                .field(TransformPriceFilter.Field.PRICE_ID)
                                .operator(TransformPriceFilter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
                        .maximumAmount("maximum_amount")
                        .build()
                )
                .maximumAmount("maximum_amount")
                .minimum(
                    Minimum.builder()
                        .addAppliesToPriceId("string")
                        .addFilter(
                            TransformPriceFilter.builder()
                                .field(TransformPriceFilter.Field.PRICE_ID)
                                .operator(TransformPriceFilter.Operator.INCLUDES)
                                .addValue("string")
                                .build()
                        )
                        .minimumAmount("minimum_amount")
                        .build()
                )
                .minimumAmount("minimum_amount")
                .name("Fixed Fee")
                .partiallyInvoicedAmount("4.00")
                .price(
                    Price.Unit.builder()
                        .id("id")
                        .billableMetric(BillableMetricTiny.builder().id("id").build())
                        .billingCycleConfiguration(
                            BillingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(BillingCycleConfiguration.DurationUnit.DAY)
                                .build()
                        )
                        .cadence(Price.Unit.Cadence.ONE_TIME)
                        .conversionRate(0.0)
                        .unitConversionRateConfig(
                            ConversionRateUnitConfig.builder().unitAmount("unit_amount").build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditAllocation(
                            Allocation.builder()
                                .allowsRollover(true)
                                .currency("currency")
                                .customExpiration(
                                    CustomExpiration.builder()
                                        .duration(0L)
                                        .durationUnit(CustomExpiration.DurationUnit.DAY)
                                        .build()
                                )
                                .build()
                        )
                        .currency("currency")
                        .discount(
                            PercentageDiscount.builder()
                                .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                                .percentageDiscount(0.15)
                                .addAppliesToPriceId("h74gfhdjvn7ujokd")
                                .addAppliesToPriceId("7hfgtgjnbvc3ujkl")
                                .addFilter(
                                    TransformPriceFilter.builder()
                                        .field(TransformPriceFilter.Field.PRICE_ID)
                                        .operator(TransformPriceFilter.Operator.INCLUDES)
                                        .addValue("string")
                                        .build()
                                )
                                .reason("reason")
                                .build()
                        )
                        .externalPriceId("external_price_id")
                        .fixedPriceQuantity(0.0)
                        .invoicingCycleConfiguration(
                            BillingCycleConfiguration.builder()
                                .duration(0L)
                                .durationUnit(BillingCycleConfiguration.DurationUnit.DAY)
                                .build()
                        )
                        .item(ItemSlim.builder().id("id").name("name").build())
                        .maximum(
                            Maximum.builder()
                                .addAppliesToPriceId("string")
                                .addFilter(
                                    TransformPriceFilter.builder()
                                        .field(TransformPriceFilter.Field.PRICE_ID)
                                        .operator(TransformPriceFilter.Operator.INCLUDES)
                                        .addValue("string")
                                        .build()
                                )
                                .maximumAmount("maximum_amount")
                                .build()
                        )
                        .maximumAmount("maximum_amount")
                        .metadata(
                            Price.Unit.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .minimum(
                            Minimum.builder()
                                .addAppliesToPriceId("string")
                                .addFilter(
                                    TransformPriceFilter.builder()
                                        .field(TransformPriceFilter.Field.PRICE_ID)
                                        .operator(TransformPriceFilter.Operator.INCLUDES)
                                        .addValue("string")
                                        .build()
                                )
                                .minimumAmount("minimum_amount")
                                .build()
                        )
                        .minimumAmount("minimum_amount")
                        .name("name")
                        .planPhaseOrder(0L)
                        .priceType(Price.Unit.PriceType.USAGE_PRICE)
                        .replacesPriceId("replaces_price_id")
                        .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                        .dimensionalPriceConfiguration(
                            DimensionalPriceConfiguration.builder()
                                .addDimensionValue("string")
                                .dimensionalPriceGroupId("dimensional_price_group_id")
                                .build()
                        )
                        .build()
                )
                .quantity(1.0)
                .startDate(OffsetDateTime.parse("2022-02-01T08:00:00+00:00"))
                .addSubLineItem(
                    MatrixSubLineItem.builder()
                        .amount("9.00")
                        .grouping(SubLineItemGrouping.builder().key("region").value("west").build())
                        .matrixConfig(
                            SubLineItemMatrixConfig.builder().addDimensionValue("string").build()
                        )
                        .name("Tier One")
                        .quantity(5.0)
                        .type(MatrixSubLineItem.Type.MATRIX)
                        .build()
                )
                .subtotal("9.00")
                .addTaxAmount(
                    TaxAmount.builder()
                        .amount("amount")
                        .taxRateDescription("tax_rate_description")
                        .taxRatePercentage("tax_rate_percentage")
                        .build()
                )
                .addUsageCustomerId("string")
                .build()

        val roundtrippedInvoiceLineItemCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceLineItemCreateResponse),
                jacksonTypeRef<InvoiceLineItemCreateResponse>(),
            )

        assertThat(roundtrippedInvoiceLineItemCreateResponse)
            .isEqualTo(invoiceLineItemCreateResponse)
    }
}
