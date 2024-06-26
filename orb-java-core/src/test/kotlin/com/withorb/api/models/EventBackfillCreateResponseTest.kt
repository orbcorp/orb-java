// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventBackfillCreateResponseTest {

    @Test
    fun createEventBackfillCreateResponse() {
        val eventBackfillCreateResponse =
            EventBackfillCreateResponse.builder()
                .id("string")
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("string")
                .eventsIngested(123L)
                .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventBackfillCreateResponse.Status.PENDING)
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(eventBackfillCreateResponse).isNotNull
        assertThat(eventBackfillCreateResponse.id()).isEqualTo("string")
        assertThat(eventBackfillCreateResponse.closeTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCreateResponse.customerId()).contains("string")
        assertThat(eventBackfillCreateResponse.eventsIngested()).isEqualTo(123L)
        assertThat(eventBackfillCreateResponse.revertedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCreateResponse.status())
            .isEqualTo(EventBackfillCreateResponse.Status.PENDING)
        assertThat(eventBackfillCreateResponse.timeframeEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillCreateResponse.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
