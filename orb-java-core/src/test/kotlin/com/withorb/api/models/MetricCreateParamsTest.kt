// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MetricCreateParamsTest {

    @Test
    fun createMetricCreateParams() {
        MetricCreateParams.builder()
            .description("Sum of bytes downloaded in fast mode")
            .itemId("item_id")
            .name("Bytes downloaded")
            .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
            .metadata(MetricCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            MetricCreateParams.builder()
                .description("Sum of bytes downloaded in fast mode")
                .itemId("item_id")
                .name("Bytes downloaded")
                .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
                .metadata(MetricCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("Sum of bytes downloaded in fast mode")
        assertThat(body.itemId()).isEqualTo("item_id")
        assertThat(body.name()).isEqualTo("Bytes downloaded")
        assertThat(body.sql())
            .isEqualTo("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
        assertThat(body.metadata()).isEqualTo(MetricCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            MetricCreateParams.builder()
                .itemId("item_id")
                .name("Bytes downloaded")
                .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.itemId()).isEqualTo("item_id")
        assertThat(body.name()).isEqualTo("Bytes downloaded")
        assertThat(body.sql())
            .isEqualTo("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
    }
}
