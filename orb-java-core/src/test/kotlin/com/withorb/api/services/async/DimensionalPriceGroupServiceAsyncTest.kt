// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.DimensionalPriceGroupCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DimensionalPriceGroupServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dimensionalPriceGroupServiceAsync = client.dimensionalPriceGroups()

        val dimensionalPriceGroupFuture =
            dimensionalPriceGroupServiceAsync.create(
                DimensionalPriceGroupCreateParams.builder()
                    .billableMetricId("billable_metric_id")
                    .addDimension("region")
                    .addDimension("instance_type")
                    .name("name")
                    .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                    .metadata(
                        DimensionalPriceGroupCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val dimensionalPriceGroup = dimensionalPriceGroupFuture.get()
        dimensionalPriceGroup.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dimensionalPriceGroupServiceAsync = client.dimensionalPriceGroups()

        val dimensionalPriceGroupFuture =
            dimensionalPriceGroupServiceAsync.retrieve("dimensional_price_group_id")

        val dimensionalPriceGroup = dimensionalPriceGroupFuture.get()
        dimensionalPriceGroup.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dimensionalPriceGroupServiceAsync = client.dimensionalPriceGroups()

        val pageFuture = dimensionalPriceGroupServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
