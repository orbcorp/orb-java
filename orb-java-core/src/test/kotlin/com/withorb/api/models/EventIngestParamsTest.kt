// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventIngestParamsTest {

    @Test
    fun create() {
        EventIngestParams.builder()
            .backfillId("backfill_id")
            .debug(true)
            .addEvent(
                EventIngestParams.Event.builder()
                    .eventName("event_name")
                    .idempotencyKey("idempotency_key")
                    .properties(
                        EventIngestParams.Event.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                    .customerId("customer_id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EventIngestParams.builder()
                .backfillId("backfill_id")
                .debug(true)
                .addEvent(
                    EventIngestParams.Event.builder()
                        .eventName("event_name")
                        .idempotencyKey("idempotency_key")
                        .properties(
                            EventIngestParams.Event.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .customerId("customer_id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("backfill_id", "backfill_id").put("debug", "true").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            EventIngestParams.builder()
                .addEvent(
                    EventIngestParams.Event.builder()
                        .eventName("event_name")
                        .idempotencyKey("idempotency_key")
                        .properties(
                            EventIngestParams.Event.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            EventIngestParams.builder()
                .backfillId("backfill_id")
                .debug(true)
                .addEvent(
                    EventIngestParams.Event.builder()
                        .eventName("event_name")
                        .idempotencyKey("idempotency_key")
                        .properties(
                            EventIngestParams.Event.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .customerId("customer_id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.events())
            .containsExactly(
                EventIngestParams.Event.builder()
                    .eventName("event_name")
                    .idempotencyKey("idempotency_key")
                    .properties(
                        EventIngestParams.Event.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                    .customerId("customer_id")
                    .externalCustomerId("external_customer_id")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventIngestParams.builder()
                .addEvent(
                    EventIngestParams.Event.builder()
                        .eventName("event_name")
                        .idempotencyKey("idempotency_key")
                        .properties(
                            EventIngestParams.Event.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.events())
            .containsExactly(
                EventIngestParams.Event.builder()
                    .eventName("event_name")
                    .idempotencyKey("idempotency_key")
                    .properties(
                        EventIngestParams.Event.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2020-12-09T16:09:53Z"))
                    .build()
            )
    }
}
