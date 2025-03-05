// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.plans

import com.withorb.api.TestServerExtension
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync
import com.withorb.api.core.JsonValue
import com.withorb.api.models.EditPlanModel
import com.withorb.api.models.PlanExternalPlanIdFetchParams
import com.withorb.api.models.PlanExternalPlanIdUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExternalPlanIdServiceAsyncTest {

    @Test
    fun update() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPlanIdServiceAsync = client.plans().externalPlanId()

        val planModelFuture =
            externalPlanIdServiceAsync.update(
                PlanExternalPlanIdUpdateParams.builder()
                    .otherExternalPlanId("external_plan_id")
                    .editPlanModel(
                        EditPlanModel.builder()
                            .externalPlanId("external_plan_id")
                            .metadata(
                                EditPlanModel.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val planModel = planModelFuture.get()
        planModel.validate()
    }

    @Test
    fun fetch() {
        val client =
            OrbOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalPlanIdServiceAsync = client.plans().externalPlanId()

        val planModelFuture =
            externalPlanIdServiceAsync.fetch(
                PlanExternalPlanIdFetchParams.builder().externalPlanId("external_plan_id").build()
            )

        val planModel = planModelFuture.get()
        planModel.validate()
    }
}
