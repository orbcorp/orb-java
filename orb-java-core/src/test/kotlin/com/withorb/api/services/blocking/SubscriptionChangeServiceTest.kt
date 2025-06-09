// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClient
import com.withorb.api.models.SubscriptionChangeApplyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionChangeServiceTest {

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionChangeService = client.subscriptionChanges()

        val subscriptionChange = subscriptionChangeService.retrieve("subscription_change_id")

        subscriptionChange.validate()
    }

    @Test
    fun apply() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionChangeService = client.subscriptionChanges()

        val response =
            subscriptionChangeService.apply(
                SubscriptionChangeApplyParams.builder()
                    .subscriptionChangeId("subscription_change_id")
                    .description("description")
                    .previouslyCollectedAmount("previously_collected_amount")
                    .build()
            )

        response.validate()
    }

    @Test
    fun cancel() {
        val client =
            OrbOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionChangeService = client.subscriptionChanges()

        val response = subscriptionChangeService.cancel("subscription_change_id")

        response.validate()
    }
}
