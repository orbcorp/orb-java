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
import com.withorb.api.models.EventBackfillCreateResponse

class EventBackfillCreateResponseTest {

    @Test
    fun createEventBackfillCreateResponse() {
      val eventBackfillCreateResponse = EventBackfillCreateResponse.builder()
          .id("id")
          .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .customerId("customer_id")
          .eventsIngested(123L)
          .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .status(EventBackfillCreateResponse.Status.PENDING)
          .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
          .build()
      assertThat(eventBackfillCreateResponse).isNotNull
      assertThat(eventBackfillCreateResponse.id()).isEqualTo("id")
      assertThat(eventBackfillCreateResponse.closeTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(eventBackfillCreateResponse.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(eventBackfillCreateResponse.customerId()).contains("customer_id")
      assertThat(eventBackfillCreateResponse.eventsIngested()).isEqualTo(123L)
      assertThat(eventBackfillCreateResponse.revertedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(eventBackfillCreateResponse.status()).isEqualTo(EventBackfillCreateResponse.Status.PENDING)
      assertThat(eventBackfillCreateResponse.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(eventBackfillCreateResponse.timeframeStart()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(eventBackfillCreateResponse.deprecationFilter()).contains("my_numeric_property > 100 AND my_other_property = 'bar'")
    }
}
