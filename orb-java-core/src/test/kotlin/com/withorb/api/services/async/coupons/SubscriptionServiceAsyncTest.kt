// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.coupons

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.CouponSubscriptionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.coupons().subscriptions()

        val pageFuture =
            subscriptionServiceAsync.list(
                CouponSubscriptionListParams.builder().couponId("coupon_id").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
