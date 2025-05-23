// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventBackfillCloseResponseTest {

    @Test
    fun create() {
        val eventBackfillCloseResponse =
            EventBackfillCloseResponse.builder()
                .id("id")
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .eventsIngested(0L)
                .replaceExistingEvents(true)
                .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventBackfillCloseResponse.Status.PENDING)
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                .build()

        assertThat(eventBackfillCloseResponse.id()).isEqualTo("id")
        assertThat(eventBackfillCloseResponse.closeTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCloseResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCloseResponse.customerId()).contains("customer_id")
        assertThat(eventBackfillCloseResponse.eventsIngested()).isEqualTo(0L)
        assertThat(eventBackfillCloseResponse.replaceExistingEvents()).isEqualTo(true)
        assertThat(eventBackfillCloseResponse.revertedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCloseResponse.status())
            .isEqualTo(EventBackfillCloseResponse.Status.PENDING)
        assertThat(eventBackfillCloseResponse.timeframeEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCloseResponse.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCloseResponse.deprecationFilter())
            .contains("my_numeric_property > 100 AND my_other_property = 'bar'")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventBackfillCloseResponse =
            EventBackfillCloseResponse.builder()
                .id("id")
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .eventsIngested(0L)
                .replaceExistingEvents(true)
                .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventBackfillCloseResponse.Status.PENDING)
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                .build()

        val roundtrippedEventBackfillCloseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventBackfillCloseResponse),
                jacksonTypeRef<EventBackfillCloseResponse>(),
            )

        assertThat(roundtrippedEventBackfillCloseResponse).isEqualTo(eventBackfillCloseResponse)
    }
}
