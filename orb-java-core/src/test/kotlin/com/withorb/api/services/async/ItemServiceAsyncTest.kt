// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.ItemCreateParams
import com.withorb.api.models.ItemUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ItemServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemServiceAsync = client.items()

        val itemFuture =
            itemServiceAsync.create(
                ItemCreateParams.builder()
                    .name("API requests")
                    .metadata(
                        ItemCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val item = itemFuture.get()
        item.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemServiceAsync = client.items()

        val itemFuture =
            itemServiceAsync.update(
                ItemUpdateParams.builder()
                    .itemId("item_id")
                    .addExternalConnection(
                        ItemUpdateParams.ExternalConnection.builder()
                            .externalConnectionName(
                                ItemUpdateParams.ExternalConnection.ExternalConnectionName.STRIPE
                            )
                            .externalEntityId("external_entity_id")
                            .build()
                    )
                    .metadata(
                        ItemUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        val item = itemFuture.get()
        item.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemServiceAsync = client.items()

        val pageFuture = itemServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemServiceAsync = client.items()

        val itemFuture = itemServiceAsync.archive("item_id")

        val item = itemFuture.get()
        item.validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemServiceAsync = client.items()

        val itemFuture = itemServiceAsync.fetch("item_id")

        val item = itemFuture.get()
        item.validate()
    }
}
