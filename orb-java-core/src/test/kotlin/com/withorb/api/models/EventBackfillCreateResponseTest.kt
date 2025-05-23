// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventBackfillCreateResponseTest {

    @Test
    fun create() {
        val eventBackfillCreateResponse =
            EventBackfillCreateResponse.builder()
                .id("id")
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .eventsIngested(0L)
                .replaceExistingEvents(true)
                .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventBackfillCreateResponse.Status.PENDING)
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                .build()

        assertThat(eventBackfillCreateResponse.id()).isEqualTo("id")
        assertThat(eventBackfillCreateResponse.closeTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCreateResponse.customerId()).contains("customer_id")
        assertThat(eventBackfillCreateResponse.eventsIngested()).isEqualTo(0L)
        assertThat(eventBackfillCreateResponse.replaceExistingEvents()).isEqualTo(true)
        assertThat(eventBackfillCreateResponse.revertedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCreateResponse.status())
            .isEqualTo(EventBackfillCreateResponse.Status.PENDING)
        assertThat(eventBackfillCreateResponse.timeframeEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCreateResponse.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCreateResponse.deprecationFilter())
            .contains("my_numeric_property > 100 AND my_other_property = 'bar'")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventBackfillCreateResponse =
            EventBackfillCreateResponse.builder()
                .id("id")
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .eventsIngested(0L)
                .replaceExistingEvents(true)
                .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventBackfillCreateResponse.Status.PENDING)
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                .build()

        val roundtrippedEventBackfillCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventBackfillCreateResponse),
                jacksonTypeRef<EventBackfillCreateResponse>(),
            )

        assertThat(roundtrippedEventBackfillCreateResponse).isEqualTo(eventBackfillCreateResponse)
    }
}
