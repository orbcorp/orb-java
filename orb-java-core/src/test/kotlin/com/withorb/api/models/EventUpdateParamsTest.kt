// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventUpdateParamsTest {

    @Test
    fun create() {
        EventUpdateParams.builder()
            .eventId("event_id")
            .eventName("event_name")
            .properties(JsonValue.from(mapOf<String, Any>()))
            .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
            .customerId("customer_id")
            .externalCustomerId("external_customer_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EventUpdateParams.builder()
                .eventId("event_id")
                .eventName("event_name")
                .properties(JsonValue.from(mapOf<String, Any>()))
                .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("event_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EventUpdateParams.builder()
                .eventId("event_id")
                .eventName("event_name")
                .properties(JsonValue.from(mapOf<String, Any>()))
                .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                .customerId("customer_id")
                .externalCustomerId("external_customer_id")
                .build()

        val body = params._body()

        assertThat(body.eventName()).isEqualTo("event_name")
        assertThat(body._properties()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.timestamp()).isEqualTo(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
        assertThat(body.customerId()).contains("customer_id")
        assertThat(body.externalCustomerId()).contains("external_customer_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventUpdateParams.builder()
                .eventId("event_id")
                .eventName("event_name")
                .properties(JsonValue.from(mapOf<String, Any>()))
                .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                .build()

        val body = params._body()

        assertThat(body.eventName()).isEqualTo("event_name")
        assertThat(body._properties()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.timestamp()).isEqualTo(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
    }
}
