// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.models.PlanMigrationCancelParams
import com.withorb.api.models.PlanMigrationRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MigrationServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationServiceAsync = client.plans().migrations()

        val migrationFuture =
            migrationServiceAsync.retrieve(
                PlanMigrationRetrieveParams.builder()
                    .planId("plan_id")
                    .migrationId("migration_id")
                    .build()
            )

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
        val migrationServiceAsync = client.plans().migrations()

        val pageFuture = migrationServiceAsync.list("plan_id")

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
        val migrationServiceAsync = client.plans().migrations()

        val responseFuture =
            migrationServiceAsync.cancel(
                PlanMigrationCancelParams.builder()
                    .planId("plan_id")
                    .migrationId("migration_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
