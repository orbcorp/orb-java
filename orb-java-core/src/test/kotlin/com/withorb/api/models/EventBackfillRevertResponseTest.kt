// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventBackfillRevertResponseTest {

    @Test
    fun createEventBackfillRevertResponse() {
        val eventBackfillRevertResponse =
            EventBackfillRevertResponse.builder()
                .id("id")
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .eventsIngested(123L)
                .revertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(EventBackfillRevertResponse.Status.PENDING)
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(eventBackfillRevertResponse).isNotNull
        assertThat(eventBackfillRevertResponse.id()).isEqualTo("id")
        assertThat(eventBackfillRevertResponse.closeTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillRevertResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillRevertResponse.customerId()).contains("customer_id")
        assertThat(eventBackfillRevertResponse.eventsIngested()).isEqualTo(123L)
        assertThat(eventBackfillRevertResponse.revertedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillRevertResponse.status())
            .isEqualTo(EventBackfillRevertResponse.Status.PENDING)
        assertThat(eventBackfillRevertResponse.timeframeEnd())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventBackfillRevertResponse.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
