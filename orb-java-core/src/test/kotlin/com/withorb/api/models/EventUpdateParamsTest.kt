// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventUpdateParamsTest {

    @Test
    fun createEventUpdateParams() {
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
    fun getBody() {
        val params =
            EventUpdateParams.builder()
                .eventId("event_id")
                .eventName("event_name")
                .properties(JsonValue.from(mapOf<String, Any>()))
                .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                .customerId("customer_id")
                .externalCustomerId("external_customer_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.eventName()).isEqualTo("event_name")
        assertThat(body.properties()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.timestamp()).isEqualTo(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EventUpdateParams.builder()
                .eventId("event_id")
                .eventName("event_name")
                .properties(JsonValue.from(mapOf<String, Any>()))
                .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.eventName()).isEqualTo("event_name")
        assertThat(body.properties()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.timestamp()).isEqualTo(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
    }

    @Test
    fun getPathParam() {
        val params =
            EventUpdateParams.builder()
                .eventId("event_id")
                .eventName("event_name")
                .properties(JsonValue.from(mapOf<String, Any>()))
                .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                .build()
        assertThat(params).isNotNull
        // path param "eventId"
        assertThat(params.getPathParam(0)).isEqualTo("event_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
