// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewMaximumTest {

    @Test
    fun create() {
        val newMaximum =
            NewMaximum.builder()
                .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
                .maximumAmount("maximum_amount")
                .appliesToAll(NewMaximum.AppliesToAll.TRUE)
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
                .priceType(NewMaximum.PriceType.USAGE)
                .build()

        assertThat(newMaximum.adjustmentType()).isEqualTo(NewMaximum.AdjustmentType.MAXIMUM)
        assertThat(newMaximum.maximumAmount()).isEqualTo("maximum_amount")
        assertThat(newMaximum.appliesToAll()).contains(NewMaximum.AppliesToAll.TRUE)
        assertThat(newMaximum.appliesToItemIds().getOrNull()).containsExactly("item_1", "item_2")
        assertThat(newMaximum.appliesToPriceIds().getOrNull()).containsExactly("price_1", "price_2")
        assertThat(newMaximum.currency()).contains("currency")
        assertThat(newMaximum.filters().getOrNull())
            .containsExactly(
                TransformPriceFilter.builder()
                    .field(TransformPriceFilter.Field.PRICE_ID)
                    .operator(TransformPriceFilter.Operator.INCLUDES)
                    .addValue("string")
                    .build()
            )
        assertThat(newMaximum.isInvoiceLevel()).contains(true)
        assertThat(newMaximum.priceType()).contains(NewMaximum.PriceType.USAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newMaximum =
            NewMaximum.builder()
                .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
                .maximumAmount("maximum_amount")
                .appliesToAll(NewMaximum.AppliesToAll.TRUE)
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
                .priceType(NewMaximum.PriceType.USAGE)
                .build()

        val roundtrippedNewMaximum =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newMaximum),
                jacksonTypeRef<NewMaximum>(),
            )

        assertThat(roundtrippedNewMaximum).isEqualTo(newMaximum)
    }
}
