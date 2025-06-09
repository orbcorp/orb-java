// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewMinimumTest {

    @Test
    fun create() {
        val newMinimum =
            NewMinimum.builder()
                .adjustmentType(NewMinimum.AdjustmentType.MINIMUM)
                .itemId("item_id")
                .minimumAmount("minimum_amount")
                .appliesToAll(NewMinimum.AppliesToAll.TRUE)
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
                .priceType(NewMinimum.PriceType.USAGE)
                .build()

        assertThat(newMinimum.adjustmentType()).isEqualTo(NewMinimum.AdjustmentType.MINIMUM)
        assertThat(newMinimum.itemId()).isEqualTo("item_id")
        assertThat(newMinimum.minimumAmount()).isEqualTo("minimum_amount")
        assertThat(newMinimum.appliesToAll()).contains(NewMinimum.AppliesToAll.TRUE)
        assertThat(newMinimum.appliesToItemIds().getOrNull()).containsExactly("item_1", "item_2")
        assertThat(newMinimum.appliesToPriceIds().getOrNull()).containsExactly("price_1", "price_2")
        assertThat(newMinimum.currency()).contains("currency")
        assertThat(newMinimum.filters().getOrNull())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(newMinimum.isInvoiceLevel()).contains(true)
        assertThat(newMinimum.priceType()).contains(NewMinimum.PriceType.USAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newMinimum =
            NewMinimum.builder()
                .adjustmentType(NewMinimum.AdjustmentType.MINIMUM)
                .itemId("item_id")
                .minimumAmount("minimum_amount")
                .appliesToAll(NewMinimum.AppliesToAll.TRUE)
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
                .priceType(NewMinimum.PriceType.USAGE)
                .build()

        val roundtrippedNewMinimum =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newMinimum),
                jacksonTypeRef<NewMinimum>(),
            )

        assertThat(roundtrippedNewMinimum).isEqualTo(newMinimum)
    }
}
