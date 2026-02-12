// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.LicenseTypeCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LicenseTypeServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseTypeServiceAsync = client.licenseTypes()

        val licenseTypeFuture =
            licenseTypeServiceAsync.create(
                LicenseTypeCreateParams.builder().groupingKey("grouping_key").name("name").build()
            )

        val licenseType = licenseTypeFuture.get()
        licenseType.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseTypeServiceAsync = client.licenseTypes()

        val licenseTypeFuture = licenseTypeServiceAsync.retrieve("license_type_id")

        val licenseType = licenseTypeFuture.get()
        licenseType.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseTypeServiceAsync = client.licenseTypes()

        val pageFuture = licenseTypeServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
