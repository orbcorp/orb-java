// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.prices

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.PriceExternalPriceIdFetchParams
import com.withorb.api.models.PriceExternalPriceIdUpdateParams
import com.withorb.api.models.UpdatePriceRequestParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExternalPriceIdServiceAsyncTest {

    @Test
    fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPriceIdServiceAsync = client.prices().externalPriceId()

        val priceModelFuture =
            externalPriceIdServiceAsync.update(
                PriceExternalPriceIdUpdateParams.builder()
                    .externalPriceId("external_price_id")
                    .updatePriceRequestParams(
                        UpdatePriceRequestParams.builder()
                            .metadata(
                                UpdatePriceRequestParams.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val priceModel = priceModelFuture.get()
        priceModel.validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPriceIdServiceAsync = client.prices().externalPriceId()

        val priceModelFuture =
            externalPriceIdServiceAsync.fetch(
                PriceExternalPriceIdFetchParams.builder()
                    .externalPriceId("external_price_id")
                    .build()
            )

        val priceModel = priceModelFuture.get()
        priceModel.validate()
    }
}
