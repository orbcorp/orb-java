// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.LicenseCreateParams
import com.withorb.api.models.LicenseDeactivateParams
import com.withorb.api.models.LicenseListParams
import com.withorb.api.models.LicenseRetrieveByExternalIdParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LicenseServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        val licenseFuture =
            licenseServiceAsync.create(
                LicenseCreateParams.builder()
                    .externalLicenseId("external_license_id")
                    .licenseTypeId("license_type_id")
                    .subscriptionId("subscription_id")
                    .endDate(LocalDate.parse("2026-01-27"))
                    .startDate(LocalDate.parse("2026-01-27"))
                    .build()
            )

        val license = licenseFuture.get()
        license.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        val licenseFuture = licenseServiceAsync.retrieve("license_id")

        val license = licenseFuture.get()
        license.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        val pageFuture =
            licenseServiceAsync.list(
                LicenseListParams.builder().subscriptionId("subscription_id").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun deactivate() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        val responseFuture =
            licenseServiceAsync.deactivate(
                LicenseDeactivateParams.builder()
                    .licenseId("license_id")
                    .endDate(LocalDate.parse("2026-01-27"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun retrieveByExternalId() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val licenseServiceAsync = client.licenses()

        val responseFuture =
            licenseServiceAsync.retrieveByExternalId(
                LicenseRetrieveByExternalIdParams.builder()
                    .externalLicenseId("external_license_id")
                    .licenseTypeId("license_type_id")
                    .subscriptionId("subscription_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
