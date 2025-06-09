// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewPercentageDiscountTest {

    @Test
    fun create() {
        val newPercentageDiscount =
            NewPercentageDiscount.builder()
                .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
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

        assertThat(newPercentageDiscount.adjustmentType())
            .isEqualTo(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
        assertThat(newPercentageDiscount.percentageDiscount()).isEqualTo(0.0)
        assertThat(newPercentageDiscount.appliesToAll())
            .contains(NewPercentageDiscount.AppliesToAll.TRUE)
        assertThat(newPercentageDiscount.appliesToItemIds().getOrNull())
            .containsExactly("item_1", "item_2")
        assertThat(newPercentageDiscount.appliesToPriceIds().getOrNull())
            .containsExactly("price_1", "price_2")
        assertThat(newPercentageDiscount.currency()).contains("currency")
        assertThat(newPercentageDiscount.filters().getOrNull())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(newPercentageDiscount.isInvoiceLevel()).contains(true)
        assertThat(newPercentageDiscount.priceType())
            .contains(NewPercentageDiscount.PriceType.USAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newPercentageDiscount =
            NewPercentageDiscount.builder()
                .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
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

        val roundtrippedNewPercentageDiscount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newPercentageDiscount),
                jacksonTypeRef<NewPercentageDiscount>(),
            )

        assertThat(roundtrippedNewPercentageDiscount).isEqualTo(newPercentageDiscount)
    }
}
