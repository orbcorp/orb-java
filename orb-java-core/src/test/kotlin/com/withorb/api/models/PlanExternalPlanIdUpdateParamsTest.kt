// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanExternalPlanIdUpdateParamsTest {

    @Test
    fun create() {
        PlanExternalPlanIdUpdateParams.builder()
            .otherExternalPlanId("external_plan_id")
            .externalPlanId("external_plan_id")
            .metadata(
                PlanExternalPlanIdUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanExternalPlanIdUpdateParams.builder().otherExternalPlanId("external_plan_id").build()

        assertThat(params._pathParam(0)).isEqualTo("external_plan_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlanExternalPlanIdUpdateParams.builder()
                .otherExternalPlanId("external_plan_id")
                .externalPlanId("external_plan_id")
                .metadata(
                    PlanExternalPlanIdUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.externalPlanId()).contains("external_plan_id")
        assertThat(body.metadata())
            .contains(
                PlanExternalPlanIdUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanExternalPlanIdUpdateParams.builder().otherExternalPlanId("external_plan_id").build()

        val body = params._body()

        assertNotNull(body)
    }
}
