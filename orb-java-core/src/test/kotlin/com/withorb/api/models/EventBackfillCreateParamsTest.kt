// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventBackfillCreateParamsTest {

    @Test
    fun create() {
        EventBackfillCreateParams.builder()
            .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .customerId("customer_id")
            .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
            .externalCustomerId("external_customer_id")
            .replaceExistingEvents(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            EventBackfillCreateParams.builder()
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerId("customer_id")
                .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                .externalCustomerId("external_customer_id")
                .replaceExistingEvents(true)
                .build()

        val body = params._body()

        assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.closeTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.customerId()).contains("customer_id")
        assertThat(body.deprecationFilter())
            .contains("my_numeric_property > 100 AND my_other_property = 'bar'")
        assertThat(body.externalCustomerId()).contains("external_customer_id")
        assertThat(body.replaceExistingEvents()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventBackfillCreateParams.builder()
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
