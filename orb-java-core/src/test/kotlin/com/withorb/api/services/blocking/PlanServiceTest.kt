// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.withorb.api.TestServerExtension
import com.withorb.api.client.OrbClient
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonString
import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.BinaryResponseContent
import com.withorb.api.services.blocking.PlanService
import com.withorb.api.models.PlanListPage
import com.withorb.api.models.PlanListParams
import com.withorb.api.models.*

@ExtendWith(TestServerExtension::class)
class PlanServiceTest {

    @Test
    fun callCreate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val planService = client.plans()
      val plan = planService.create(PlanCreateParams.builder()
          .currency("currency")
          .name("name")
          .prices(listOf(PlanCreateParams.Price.ofNewPlanUnitPrice(PlanCreateParams.Price.NewPlanUnitPrice.builder()
              .cadence(PlanCreateParams.Price.NewPlanUnitPrice.Cadence.ANNUAL)
              .itemId("item_id")
              .modelType(PlanCreateParams.Price.NewPlanUnitPrice.ModelType.UNIT)
              .name("Annual fee")
              .unitConfig(PlanCreateParams.Price.NewPlanUnitPrice.UnitConfig.builder()
                  .unitAmount("unit_amount")
                  .build())
              .billableMetricId("billable_metric_id")
              .billedInAdvance(true)
              .billingCycleConfiguration(PlanCreateParams.Price.NewPlanUnitPrice.BillingCycleConfiguration.builder()
                  .duration(123L)
                  .durationUnit(PlanCreateParams.Price.NewPlanUnitPrice.BillingCycleConfiguration.DurationUnit.DAY)
                  .build())
              .conversionRate(42.23)
              .currency("currency")
              .externalPriceId("external_price_id")
              .fixedPriceQuantity(42.23)
              .invoiceGroupingKey("invoice_grouping_key")
              .invoicingCycleConfiguration(PlanCreateParams.Price.NewPlanUnitPrice.InvoicingCycleConfiguration.builder()
                  .duration(123L)
                  .durationUnit(PlanCreateParams.Price.NewPlanUnitPrice.InvoicingCycleConfiguration.DurationUnit.DAY)
                  .build())
              .metadata(PlanCreateParams.Price.NewPlanUnitPrice.Metadata.builder().build())
              .build())))
          .defaultInvoiceMemo("default_invoice_memo")
          .externalPlanId("external_plan_id")
          .metadata(PlanCreateParams.Metadata.builder().build())
          .netTerms(123L)
          .status(PlanCreateParams.Status.ACTIVE)
          .build())
      println(plan)
      plan.validate()
    }

    @Test
    fun callUpdate() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val planService = client.plans()
      val plan = planService.update(PlanUpdateParams.builder()
          .planId("plan_id")
          .externalPlanId("external_plan_id")
          .metadata(PlanUpdateParams.Metadata.builder().build())
          .build())
      println(plan)
      plan.validate()
    }

    @Test
    fun callList() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val planService = client.plans()
      val plans = planService.list(PlanListParams.builder().build())
      println(plans)
      plans.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callFetch() {
      val client = OrbOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val planService = client.plans()
      val plan = planService.fetch(PlanFetchParams.builder()
          .planId("plan_id")
          .build())
      println(plan)
      plan.validate()
    }
}
