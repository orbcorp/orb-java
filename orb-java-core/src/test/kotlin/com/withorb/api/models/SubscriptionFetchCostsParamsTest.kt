// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.http.QueryParams
import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionFetchCostsParamsTest {

    @Test
    fun createSubscriptionFetchCostsParams() {
        SubscriptionFetchCostsParams.builder()
            .subscriptionId("subscription_id")
            .currency("currency")
            .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
            .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
            .viewMode(SubscriptionFetchCostsParams.ViewMode.PERIODIC)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            SubscriptionFetchCostsParams.builder()
                .subscriptionId("subscription_id")
                .currency("currency")
                .timeframeEnd(OffsetDateTime.parse("2022-03-01T05:00:00Z"))
                .timeframeStart(OffsetDateTime.parse("2022-02-01T05:00:00Z"))
                .viewMode(SubscriptionFetchCostsParams.ViewMode.PERIODIC)
                .build()
        val expected = QueryParams.builder()
        expected.put("currency", "currency")
        expected.put("timeframe_end", "2022-03-01T05:00:00Z")
        expected.put("timeframe_start", "2022-02-01T05:00:00Z")
        expected.put("view_mode", SubscriptionFetchCostsParams.ViewMode.PERIODIC.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            SubscriptionFetchCostsParams.builder().subscriptionId("subscription_id").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            SubscriptionFetchCostsParams.builder().subscriptionId("subscription_id").build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
