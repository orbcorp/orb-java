// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceCreateParamsTest {

    @Test
    fun create() {
        InvoiceCreateParams.builder()
            .currency("USD")
            .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addLineItem(
                InvoiceCreateParams.LineItem.builder()
                    .endDate(LocalDate.parse("2023-09-22"))
                    .itemId("4khy3nwzktxv7")
                    .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                    .name("Line Item Name")
                    .quantity(1.0)
                    .startDate(LocalDate.parse("2023-09-22"))
                    .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                    .build()
            )
            .customerId("4khy3nwzktxv7")
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
            .externalCustomerId("external-customer-id")
            .memo("An optional memo for my invoice.")
            .metadata(
                InvoiceCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .netTerms(0L)
            .willAutoIssue(false)
            .build()
    }

    @Test
    fun body() {
        val params =
            InvoiceCreateParams.builder()
                .currency("USD")
                .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addLineItem(
                    InvoiceCreateParams.LineItem.builder()
                        .endDate(LocalDate.parse("2023-09-22"))
                        .itemId("4khy3nwzktxv7")
                        .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                        .name("Line Item Name")
                        .quantity(1.0)
                        .startDate(LocalDate.parse("2023-09-22"))
                        .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                        .build()
                )
                .customerId("4khy3nwzktxv7")
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
                .externalCustomerId("external-customer-id")
                .memo("An optional memo for my invoice.")
                .metadata(
                    InvoiceCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .netTerms(0L)
                .willAutoIssue(false)
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.invoiceDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.lineItems())
            .containsExactly(
                InvoiceCreateParams.LineItem.builder()
                    .endDate(LocalDate.parse("2023-09-22"))
                    .itemId("4khy3nwzktxv7")
                    .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                    .name("Line Item Name")
                    .quantity(1.0)
                    .startDate(LocalDate.parse("2023-09-22"))
                    .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                    .build()
            )
        assertThat(body.customerId()).contains("4khy3nwzktxv7")
        assertThat(body.discount())
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
        assertThat(body.externalCustomerId()).contains("external-customer-id")
        assertThat(body.memo()).contains("An optional memo for my invoice.")
        assertThat(body.metadata())
            .contains(
                InvoiceCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.netTerms()).contains(0L)
        assertThat(body.willAutoIssue()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvoiceCreateParams.builder()
                .currency("USD")
                .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addLineItem(
                    InvoiceCreateParams.LineItem.builder()
                        .endDate(LocalDate.parse("2023-09-22"))
                        .itemId("4khy3nwzktxv7")
                        .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                        .name("Line Item Name")
                        .quantity(1.0)
                        .startDate(LocalDate.parse("2023-09-22"))
                        .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.invoiceDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.lineItems())
            .containsExactly(
                InvoiceCreateParams.LineItem.builder()
                    .endDate(LocalDate.parse("2023-09-22"))
                    .itemId("4khy3nwzktxv7")
                    .modelType(InvoiceCreateParams.LineItem.ModelType.UNIT)
                    .name("Line Item Name")
                    .quantity(1.0)
                    .startDate(LocalDate.parse("2023-09-22"))
                    .unitConfig(UnitConfig.builder().unitAmount("unit_amount").build())
                    .build()
            )
    }
}
