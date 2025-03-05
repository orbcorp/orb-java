// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddSubscriptionAdjustmentParamsTest {

    @Test
    fun createAddSubscriptionAdjustmentParams() {
        val addSubscriptionAdjustmentParams =
            AddSubscriptionAdjustmentParams.builder()
                .adjustment(
                    AddSubscriptionAdjustmentParams.Adjustment.NewPercentageDiscount.builder()
                        .adjustmentType(
                            AddSubscriptionAdjustmentParams.Adjustment.NewPercentageDiscount
                                .AdjustmentType
                                .PERCENTAGE_DISCOUNT
                        )
                        .addAppliesToPriceId("price_1")
                        .addAppliesToPriceId("price_2")
                        .percentageDiscount(0.0)
                        .isInvoiceLevel(true)
                        .build()
                )
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .planPhaseOrder(0L)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(addSubscriptionAdjustmentParams).isNotNull
        assertThat(addSubscriptionAdjustmentParams.adjustment())
            .isEqualTo(
                AddSubscriptionAdjustmentParams.Adjustment.ofNewPercentageDiscount(
                    AddSubscriptionAdjustmentParams.Adjustment.NewPercentageDiscount.builder()
                        .adjustmentType(
                            AddSubscriptionAdjustmentParams.Adjustment.NewPercentageDiscount
                                .AdjustmentType
                                .PERCENTAGE_DISCOUNT
                        )
                        .addAppliesToPriceId("price_1")
                        .addAppliesToPriceId("price_2")
                        .percentageDiscount(0.0)
                        .isInvoiceLevel(true)
                        .build()
                )
            )
        assertThat(addSubscriptionAdjustmentParams.endDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(addSubscriptionAdjustmentParams.planPhaseOrder()).contains(0L)
        assertThat(addSubscriptionAdjustmentParams.startDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
