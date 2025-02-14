// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.AlertCreateForCustomerParams
import com.withorb.api.models.AlertCreateForExternalCustomerParams
import com.withorb.api.models.AlertCreateForSubscriptionParams
import com.withorb.api.models.AlertDisableParams
import com.withorb.api.models.AlertEnableParams
import com.withorb.api.models.AlertListParams
import com.withorb.api.models.AlertRetrieveParams
import com.withorb.api.models.AlertUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AlertServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert = alertService.retrieve(AlertRetrieveParams.builder().alertId("alert_id").build())
        println(alert)
        alert.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert =
            alertService.update(
                AlertUpdateParams.builder()
                    .alertConfigurationId("alert_configuration_id")
                    .addThreshold(AlertUpdateParams.Threshold.builder().value(0.0).build())
                    .build()
            )
        println(alert)
        alert.validate()
    }

    @Disabled("plan_version=0 breaks Prism")
    @Test
    fun callList() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alerts = alertService.list(AlertListParams.builder().build())
        println(alerts)
        alerts.data().forEach { it.validate() }
    }

    @Test
    fun callCreateForCustomer() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert =
            alertService.createForCustomer(
                AlertCreateForCustomerParams.builder()
                    .customerId("customer_id")
                    .currency("currency")
                    .type(AlertCreateForCustomerParams.Type.USAGE_EXCEEDED)
                    .addThreshold(
                        AlertCreateForCustomerParams.Threshold.builder().value(0.0).build()
                    )
                    .build()
            )
        println(alert)
        alert.validate()
    }

    @Test
    fun callCreateForExternalCustomer() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert =
            alertService.createForExternalCustomer(
                AlertCreateForExternalCustomerParams.builder()
                    .externalCustomerId("external_customer_id")
                    .currency("currency")
                    .type(AlertCreateForExternalCustomerParams.Type.USAGE_EXCEEDED)
                    .addThreshold(
                        AlertCreateForExternalCustomerParams.Threshold.builder().value(0.0).build()
                    )
                    .build()
            )
        println(alert)
        alert.validate()
    }

    @Test
    fun callCreateForSubscription() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert =
            alertService.createForSubscription(
                AlertCreateForSubscriptionParams.builder()
                    .subscriptionId("subscription_id")
                    .addThreshold(
                        AlertCreateForSubscriptionParams.Threshold.builder().value(0.0).build()
                    )
                    .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
                    .metricId("metric_id")
                    .build()
            )
        println(alert)
        alert.validate()
    }

    @Test
    fun callDisable() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert =
            alertService.disable(
                AlertDisableParams.builder()
                    .alertConfigurationId("alert_configuration_id")
                    .subscriptionId("subscription_id")
                    .build()
            )
        println(alert)
        alert.validate()
    }

    @Test
    fun callEnable() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertService = client.alerts()
        val alert =
            alertService.enable(
                AlertEnableParams.builder()
                    .alertConfigurationId("alert_configuration_id")
                    .subscriptionId("subscription_id")
                    .build()
            )
        println(alert)
        alert.validate()
    }
}
