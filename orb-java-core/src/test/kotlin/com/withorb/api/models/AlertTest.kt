// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertTest {

    @Test
    fun createAlert() {
      val alert = Alert.builder()
          .id("XuxCbt7x9L82yyeF")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .currency("currency")
          .customer(Alert.Customer.builder()
              .id("id")
              .externalCustomerId("external_customer_id")
              .build())
          .enabled(true)
          .metric(Alert.Metric.builder()
              .id("id")
              .build())
          .plan(Alert.Plan.builder()
              .id("m2t5akQeh2obwxeU")
              .externalPlanId("m2t5akQeh2obwxeU")
              .name("Example plan")
              .planVersion("plan_version")
              .build())
          .subscription(Alert.Subscription.builder()
              .id("VDGsT23osdLb84KD")
              .build())
          .addThreshold(Alert.Threshold.builder()
              .value(0.0)
              .build())
          .type(Alert.Type.CREDIT_BALANCE_DEPLETED)
          .build()
      assertThat(alert).isNotNull
      assertThat(alert.id()).isEqualTo("XuxCbt7x9L82yyeF")
      assertThat(alert.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(alert.currency()).contains("currency")
      assertThat(alert.customer()).contains(Alert.Customer.builder()
          .id("id")
          .externalCustomerId("external_customer_id")
          .build())
      assertThat(alert.enabled()).isEqualTo(true)
      assertThat(alert.metric()).contains(Alert.Metric.builder()
          .id("id")
          .build())
      assertThat(alert.plan()).contains(Alert.Plan.builder()
          .id("m2t5akQeh2obwxeU")
          .externalPlanId("m2t5akQeh2obwxeU")
          .name("Example plan")
          .planVersion("plan_version")
          .build())
      assertThat(alert.subscription()).contains(Alert.Subscription.builder()
          .id("VDGsT23osdLb84KD")
          .build())
      assertThat(alert.thresholds().get()).containsExactly(Alert.Threshold.builder()
          .value(0.0)
          .build())
      assertThat(alert.type()).isEqualTo(Alert.Type.CREDIT_BALANCE_DEPLETED)
    }
}
