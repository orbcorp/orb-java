// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.CreditBlockUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditBlockServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditBlockServiceAsync = client.creditBlocks()

        val creditBlockFuture = creditBlockServiceAsync.retrieve("block_id")

        val creditBlock = creditBlockFuture.get()
        creditBlock.validate()
    }

    @Test
    fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditBlockServiceAsync = client.creditBlocks()

        val creditBlockFuture =
            creditBlockServiceAsync.update(
                CreditBlockUpdateParams.builder()
                    .blockId("block_id")
                    .metadata(
                        CreditBlockUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val creditBlock = creditBlockFuture.get()
        creditBlock.validate()
    }

    @Test
    fun delete() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditBlockServiceAsync = client.creditBlocks()

        val future = creditBlockServiceAsync.delete("block_id")

        val response = future.get()
    }

    @Test
    fun listInvoices() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val creditBlockServiceAsync = client.creditBlocks()

        val responseFuture = creditBlockServiceAsync.listInvoices("block_id")

        val response = responseFuture.get()
        response.validate()
    }
}
