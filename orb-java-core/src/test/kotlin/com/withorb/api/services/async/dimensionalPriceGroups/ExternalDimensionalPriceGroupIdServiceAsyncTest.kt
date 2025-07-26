// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.dimensionalPriceGroups

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalDimensionalPriceGroupIdServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalDimensionalPriceGroupIdServiceAsync =
            client.dimensionalPriceGroups().externalDimensionalPriceGroupId()

        val dimensionalPriceGroupFuture =
            externalDimensionalPriceGroupIdServiceAsync.retrieve(
                "external_dimensional_price_group_id"
            )

        val dimensionalPriceGroup = dimensionalPriceGroupFuture.get()
        dimensionalPriceGroup.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalDimensionalPriceGroupIdServiceAsync =
            client.dimensionalPriceGroups().externalDimensionalPriceGroupId()

        val dimensionalPriceGroupFuture =
            externalDimensionalPriceGroupIdServiceAsync.update(
                DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.builder()
                    .pathExternalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .bodyExternalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .metadata(
                        DimensionalPriceGroupExternalDimensionalPriceGroupIdUpdateParams.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val dimensionalPriceGroup = dimensionalPriceGroupFuture.get()
        dimensionalPriceGroup.validate()
    }
}
