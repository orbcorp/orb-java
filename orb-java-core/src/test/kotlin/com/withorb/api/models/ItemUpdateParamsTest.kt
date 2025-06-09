// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params = ItemUpdateParams.builder().itemId("item_id").build()

        assertThat(params._pathParam(0)).isEqualTo("item_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.externalConnections().getOrNull())
            .containsExactly(
                ItemUpdateParams.ExternalConnection.builder()
                    .externalConnectionName(
                        ItemUpdateParams.ExternalConnection.ExternalConnectionName.STRIPE
                    )
                    .externalEntityId("external_entity_id")
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                ItemUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ItemUpdateParams.builder().itemId("item_id").build()

        val body = params._body()
    }
}
