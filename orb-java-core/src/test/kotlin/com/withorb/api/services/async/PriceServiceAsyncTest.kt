// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.PriceCreateParams
import com.withorb.api.models.PriceEvaluateParams
import com.withorb.api.models.PriceUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PriceServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val priceFuture =
            priceServiceAsync.create(
                PriceCreateParams.builder()
                    .body(
                        PriceCreateParams.Body.Unit.builder()
                            .cadence(PriceCreateParams.Body.Unit.Cadence.ANNUAL)
                            .currency("currency")
                            .itemId("item_id")
                            .name("Annual fee")
                            .unitConfig(
                                PriceCreateParams.Body.Unit.UnitConfig.builder()
                                    .unitAmount("unit_amount")
                                    .build()
                            )
                            .billableMetricId("billable_metric_id")
                            .billedInAdvance(true)
                            .billingCycleConfiguration(
                                PriceCreateParams.Body.Unit.BillingCycleConfiguration.builder()
                                    .duration(0L)
                                    .durationUnit(
                                        PriceCreateParams.Body.Unit.BillingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .conversionRate(0.0)
                            .externalPriceId("external_price_id")
                            .fixedPriceQuantity(0.0)
                            .invoiceGroupingKey("invoice_grouping_key")
                            .invoicingCycleConfiguration(
                                PriceCreateParams.Body.Unit.InvoicingCycleConfiguration.builder()
                                    .duration(0L)
                                    .durationUnit(
                                        PriceCreateParams.Body.Unit.InvoicingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .metadata(
                                PriceCreateParams.Body.Unit.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val price = priceFuture.get()
        price.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val priceFuture =
            priceServiceAsync.update(
                PriceUpdateParams.builder()
                    .priceId("price_id")
                    .metadata(
                        PriceUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val price = priceFuture.get()
        price.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val pageFuture = priceServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun evaluate() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val priceServiceAsync = client.prices()

        val responseFuture =
            priceServiceAsync.evaluate(
                PriceEvaluateParams.builder()
                    .priceId("price_id")
                    .timeframeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .timeframeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customerId("customer_id")
                    .externalCustomerId("external_customer_id")
                    .filter("my_numeric_property > 100 AND my_other_property = 'bar'")
                    .addGroupingKey("case when my_event_type = 'foo' then true else false end")
                    .build()
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
        val priceServiceAsync = client.prices()

        val priceFuture = priceServiceAsync.fetch("price_id")

        val price = priceFuture.get()
        price.validate()
    }
}
