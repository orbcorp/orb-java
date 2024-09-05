// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.models.SubscriptionFetchScheduleResponse

class SubscriptionFetchScheduleResponseTest {

    @Test
    fun createSubscriptionFetchScheduleResponse() {
      val subscriptionFetchScheduleResponse = SubscriptionFetchScheduleResponse.builder()
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .plan(SubscriptionFetchScheduleResponse.Plan.builder()
              .id("m2t5akQeh2obwxeU")
              .externalPlanId("m2t5akQeh2obwxeU")
              .name("Example plan")
              .build())
          .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
      assertThat(subscriptionFetchScheduleResponse).isNotNull
      assertThat(subscriptionFetchScheduleResponse.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(subscriptionFetchScheduleResponse.endDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(subscriptionFetchScheduleResponse.plan()).isEqualTo(SubscriptionFetchScheduleResponse.Plan.builder()
          .id("m2t5akQeh2obwxeU")
          .externalPlanId("m2t5akQeh2obwxeU")
          .name("Example plan")
          .build())
      assertThat(subscriptionFetchScheduleResponse.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
