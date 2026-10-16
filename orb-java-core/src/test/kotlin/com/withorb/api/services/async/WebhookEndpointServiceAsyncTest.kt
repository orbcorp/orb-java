// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.WebhookEndpointCreateParams
import com.withorb.api.models.WebhookEndpointUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookEndpointServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val webhookEndpointWithSecretFuture =
            webhookEndpointServiceAsync.create(
                WebhookEndpointCreateParams.builder()
                    .url("url")
                    .addEnabledEventType("string")
                    .build()
            )

        val webhookEndpointWithSecret = webhookEndpointWithSecretFuture.get()
        webhookEndpointWithSecret.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val webhookEndpointFuture = webhookEndpointServiceAsync.retrieve("webhook_endpoint_id")

        val webhookEndpoint = webhookEndpointFuture.get()
        webhookEndpoint.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val webhookEndpointFuture =
            webhookEndpointServiceAsync.update(
                WebhookEndpointUpdateParams.builder()
                    .webhookEndpointId("webhook_endpoint_id")
                    .addEnabledEventType("string")
                    .url("url")
                    .build()
            )

        val webhookEndpoint = webhookEndpointFuture.get()
        webhookEndpoint.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val pageFuture = webhookEndpointServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val future = webhookEndpointServiceAsync.delete("webhook_endpoint_id")

        val response = future.get()
    }

    @Test
    fun disable() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val webhookEndpointFuture = webhookEndpointServiceAsync.disable("webhook_endpoint_id")

        val webhookEndpoint = webhookEndpointFuture.get()
        webhookEndpoint.validate()
    }

    @Test
    fun enable() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookEndpointServiceAsync = client.webhookEndpoints()

        val webhookEndpointFuture = webhookEndpointServiceAsync.enable("webhook_endpoint_id")

        val webhookEndpoint = webhookEndpointFuture.get()
        webhookEndpoint.validate()
    }
}
