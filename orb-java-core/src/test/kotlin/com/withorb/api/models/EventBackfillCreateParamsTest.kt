// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventBackfillCreateParamsTest {

    @Test
    fun createEventBackfillCreateParams() {
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
    fun getBody() {
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.closeTime()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.deprecationFilter())
            .isEqualTo("my_numeric_property > 100 AND my_other_property = 'bar'")
        assertThat(body.externalCustomerId()).isEqualTo("external_customer_id")
        assertThat(body.replaceExistingEvents()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EventBackfillCreateParams.builder()
                .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.timeframeEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.timeframeStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
