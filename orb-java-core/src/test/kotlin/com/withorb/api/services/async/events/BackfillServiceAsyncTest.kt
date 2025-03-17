// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.events

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.EventBackfillCloseParams
import com.withorb.api.models.EventBackfillCreateParams
import com.withorb.api.models.EventBackfillFetchParams
import com.withorb.api.models.EventBackfillRevertParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BackfillServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillServiceAsync = client.events().backfills()

        val backfillFuture =
            backfillServiceAsync.create(
                EventBackfillCreateParams.builder()
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .closeTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .deprecationFilter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .externalCustomerId("external_customer_id")
                    .replaceExistingEvents(true)
                    .build()
            )

        val backfill = backfillFuture.get()
        backfill.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillServiceAsync = client.events().backfills()

        val pageFuture = backfillServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun close() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillServiceAsync = client.events().backfills()

        val responseFuture =
            backfillServiceAsync.close(
                EventBackfillCloseParams.builder().backfillId("backfill_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillServiceAsync = client.events().backfills()

        val responseFuture =
            backfillServiceAsync.fetch(
                EventBackfillFetchParams.builder().backfillId("backfill_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun revert() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val backfillServiceAsync = client.events().backfills()

        val responseFuture =
            backfillServiceAsync.revert(
                EventBackfillRevertParams.builder().backfillId("backfill_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
