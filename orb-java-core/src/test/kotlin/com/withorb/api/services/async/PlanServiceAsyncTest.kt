// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlanServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planServiceAsync = client.plans()

        val planFuture =
            planServiceAsync.create(
                PlanCreateParams.builder()
                    .currency("currency")
                    .name("name")
                    .addPrice(
                        PlanCreateParams.Price.Unit.builder()
                            .cadence(PlanCreateParams.Price.Unit.Cadence.ANNUAL)
                            .itemId("item_id")
                            .name("Annual fee")
                            .unitConfig(
                                PlanCreateParams.Price.Unit.UnitConfig.builder()
                                    .unitAmount("unit_amount")
                                    .build()
                            )
                            .billableMetricId("billable_metric_id")
                            .billedInAdvance(true)
                            .billingCycleConfiguration(
                                PlanCreateParams.Price.Unit.BillingCycleConfiguration.builder()
                                    .duration(0L)
                                    .durationUnit(
                                        PlanCreateParams.Price.Unit.BillingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .conversionRate(0.0)
                            .currency("currency")
                            .externalPriceId("external_price_id")
                            .fixedPriceQuantity(0.0)
                            .invoiceGroupingKey("invoice_grouping_key")
                            .invoicingCycleConfiguration(
                                PlanCreateParams.Price.Unit.InvoicingCycleConfiguration.builder()
                                    .duration(0L)
                                    .durationUnit(
                                        PlanCreateParams.Price.Unit.InvoicingCycleConfiguration
                                            .DurationUnit
                                            .DAY
                                    )
                                    .build()
                            )
                            .metadata(
                                PlanCreateParams.Price.Unit.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .defaultInvoiceMemo("default_invoice_memo")
                    .externalPlanId("external_plan_id")
                    .metadata(
                        PlanCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .netTerms(0L)
                    .status(PlanCreateParams.Status.ACTIVE)
                    .build()
            )

        val plan = planFuture.get()
        plan.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planServiceAsync = client.plans()

        val planFuture =
            planServiceAsync.update(
                PlanUpdateParams.builder()
                    .planId("plan_id")
                    .externalPlanId("external_plan_id")
                    .metadata(
                        PlanUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val plan = planFuture.get()
        plan.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planServiceAsync = client.plans()

        val pageFuture = planServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val planServiceAsync = client.plans()

        val planFuture = planServiceAsync.fetch("plan_id")

        val plan = planFuture.get()
        plan.validate()
    }
}
