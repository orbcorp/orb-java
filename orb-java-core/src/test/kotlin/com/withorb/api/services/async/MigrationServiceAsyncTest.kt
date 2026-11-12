// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.MigrationCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MigrationServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationServiceAsync = client.migrations()

        val migrationFuture =
            migrationServiceAsync.create(
                MigrationCreateParams.builder()
                    .effectiveTime(MigrationCreateParams.EffectiveTime.IMMEDIATELY)
                    .targetPlanVersionNumber(0L)
                    .allowInvoiceCreditOrVoid(true)
                    .canDeferBilling(true)
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .addExcludedSubscriptionId("string")
                    .externalPlanId("external_plan_id")
                    .inTrial(true)
                    .addIncludedSubscriptionId("string")
                    .planId("plan_id")
                    .addPlanVersionNumber(0L)
                    .reason("reason")
                    .addStatus(MigrationCreateParams.Status.ACTIVE)
                    .build()
            )

        val migration = migrationFuture.get()
        migration.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationServiceAsync = client.migrations()

        val migrationFuture = migrationServiceAsync.retrieve("migration_id")

        val migration = migrationFuture.get()
        migration.validate()
    }

    @Test
    fun list() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationServiceAsync = client.migrations()

        val pageFuture = migrationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun cancel() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationServiceAsync = client.migrations()

        val responseFuture = migrationServiceAsync.cancel("migration_id")

        val response = responseFuture.get()
        response.validate()
    }
}
