// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.MetricCreateParams
import com.withorb.api.models.MetricFetchParams
import com.withorb.api.models.MetricListParams
import com.withorb.api.models.MetricUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MetricServiceAsyncTest {

    @Test
    fun create() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val metricServiceAsync = client.metrics()

      val billableMetricFuture = metricServiceAsync.create(MetricCreateParams.builder()
          .description("Sum of bytes downloaded in fast mode")
          .itemId("item_id")
          .name("Bytes downloaded")
          .sql("SELECT sum(bytes_downloaded) FROM events WHERE download_speed = 'fast'")
          .metadata(MetricCreateParams.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("string"))
              .build())
          .build())

      val billableMetric = billableMetricFuture.get()
      billableMetric.validate()
    }

    @Test
    fun update() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val metricServiceAsync = client.metrics()

      val billableMetricFuture = metricServiceAsync.update(MetricUpdateParams.builder()
          .metricId("metric_id")
          .metadata(MetricUpdateParams.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("string"))
              .build())
          .build())

      val billableMetric = billableMetricFuture.get()
      billableMetric.validate()
    }

    @Test
    fun list() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val metricServiceAsync = client.metrics()

      val pageFuture = metricServiceAsync.list()

      val page = pageFuture.get()
      page.response().validate()
    }

    @Test
    fun fetch() {
      val client = OrbOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val metricServiceAsync = client.metrics()

      val billableMetricFuture = metricServiceAsync.fetch(MetricFetchParams.builder()
          .metricId("metric_id")
          .build())

      val billableMetric = billableMetricFuture.get()
      billableMetric.validate()
    }
}
