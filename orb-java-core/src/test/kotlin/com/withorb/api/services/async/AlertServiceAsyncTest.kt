// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.AlertCreateForCustomerParams
import com.withorb.api.models.AlertCreateForExternalCustomerParams
import com.withorb.api.models.AlertCreateForSubscriptionParams
import com.withorb.api.models.AlertDisableParams
import com.withorb.api.models.AlertEnableParams
import com.withorb.api.models.AlertUpdateParams
import com.withorb.api.models.Threshold
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AlertServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertServiceAsync = client.alerts()

        val alertFuture = alertServiceAsync.retrieve("alert_id")

        val alert = alertFuture.get()
        alert.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertServiceAsync = client.alerts()

        val alertFuture =
            alertServiceAsync.update(
                AlertUpdateParams.builder()
                    .alertConfigurationId("alert_configuration_id")
                    .addThreshold(Threshold.builder().value(0.0).build())
                    .build()
            )

        val alert = alertFuture.get()
        alert.validate()
    }

    @Disabled("plan_version=0 breaks Prism")
    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertServiceAsync = client.alerts()

        val pageFuture = alertServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun createForCustomer() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertServiceAsync = client.alerts()

        val alertFuture =
            alertServiceAsync.createForCustomer(
                AlertCreateForCustomerParams.builder()
                    .customerId("customer_id")
                    .currency("currency")
                    .type(AlertCreateForCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
                    .addThreshold(Threshold.builder().value(0.0).build())
                    .build()
            )

        val alert = alertFuture.get()
        alert.validate()
    }

    @Test
    fun createForExternalCustomer() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertServiceAsync = client.alerts()

        val alertFuture =
            alertServiceAsync.createForExternalCustomer(
                AlertCreateForExternalCustomerParams.builder()
                    .externalCustomerId("external_customer_id")
                    .currency("currency")
                    .type(AlertCreateForExternalCustomerParams.Type.CREDIT_BALANCE_DEPLETED)
                    .addThreshold(Threshold.builder().value(0.0).build())
                    .build()
            )

        val alert = alertFuture.get()
        alert.validate()
    }

    @Test
    fun createForSubscription() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertServiceAsync = client.alerts()

        val alertFuture =
            alertServiceAsync.createForSubscription(
                AlertCreateForSubscriptionParams.builder()
                    .subscriptionId("subscription_id")
                    .addThreshold(Threshold.builder().value(0.0).build())
                    .type(AlertCreateForSubscriptionParams.Type.USAGE_EXCEEDED)
                    .metricId("metric_id")
                    .build()
            )

        val alert = alertFuture.get()
        alert.validate()
    }

    @Test
    fun disable() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertServiceAsync = client.alerts()

        val alertFuture =
            alertServiceAsync.disable(
                AlertDisableParams.builder()
                    .alertConfigurationId("alert_configuration_id")
                    .subscriptionId("subscription_id")
                    .build()
            )

        val alert = alertFuture.get()
        alert.validate()
    }

    @Test
    fun enable() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val alertServiceAsync = client.alerts()

        val alertFuture =
            alertServiceAsync.enable(
                AlertEnableParams.builder()
                    .alertConfigurationId("alert_configuration_id")
                    .subscriptionId("subscription_id")
                    .build()
            )

        val alert = alertFuture.get()
        alert.validate()
    }
}
