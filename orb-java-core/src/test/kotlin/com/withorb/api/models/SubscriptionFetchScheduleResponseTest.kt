// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionFetchScheduleResponseTest {

    @Test
    fun create() {
        val subscriptionFetchScheduleResponse =
            SubscriptionFetchScheduleResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .plan(
                    SubscriptionFetchScheduleResponse.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(subscriptionFetchScheduleResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionFetchScheduleResponse.endDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionFetchScheduleResponse.plan())
            .contains(
                SubscriptionFetchScheduleResponse.Plan.builder()
                    .id("m2t5akQeh2obwxeU")
                    .externalPlanId("m2t5akQeh2obwxeU")
                    .name("Example plan")
                    .build()
            )
        assertThat(subscriptionFetchScheduleResponse.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionFetchScheduleResponse =
            SubscriptionFetchScheduleResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .plan(
                    SubscriptionFetchScheduleResponse.Plan.builder()
                        .id("m2t5akQeh2obwxeU")
                        .externalPlanId("m2t5akQeh2obwxeU")
                        .name("Example plan")
                        .build()
                )
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSubscriptionFetchScheduleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionFetchScheduleResponse),
                jacksonTypeRef<SubscriptionFetchScheduleResponse>(),
            )

        assertThat(roundtrippedSubscriptionFetchScheduleResponse)
            .isEqualTo(subscriptionFetchScheduleResponse)
    }
}
