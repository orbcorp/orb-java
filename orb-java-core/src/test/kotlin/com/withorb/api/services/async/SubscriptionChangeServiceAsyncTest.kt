// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.SubscriptionChangeApplyParams
import com.withorb.api.models.SubscriptionChangeCancelParams
import com.withorb.api.models.SubscriptionChangeRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionChangeServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionChangeServiceAsync = client.subscriptionChanges()

        val subscriptionChangeFuture =
            subscriptionChangeServiceAsync.retrieve(
                SubscriptionChangeRetrieveParams.builder()
                    .subscriptionChangeId("subscription_change_id")
                    .build()
            )

        val subscriptionChange = subscriptionChangeFuture.get()
        subscriptionChange.validate()
    }

    @Test
    fun apply() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionChangeServiceAsync = client.subscriptionChanges()

        val responseFuture =
            subscriptionChangeServiceAsync.apply(
                SubscriptionChangeApplyParams.builder()
                    .subscriptionChangeId("subscription_change_id")
                    .description("description")
                    .previouslyCollectedAmount("previously_collected_amount")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun cancel() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionChangeServiceAsync = client.subscriptionChanges()

        val responseFuture =
            subscriptionChangeServiceAsync.cancel(
                SubscriptionChangeCancelParams.builder()
                    .subscriptionChangeId("subscription_change_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
