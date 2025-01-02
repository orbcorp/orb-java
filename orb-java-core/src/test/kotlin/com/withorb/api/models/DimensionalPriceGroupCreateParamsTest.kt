// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DimensionalPriceGroupCreateParamsTest {

    @Test
    fun createDimensionalPriceGroupCreateParams() {
        DimensionalPriceGroupCreateParams.builder()
            .billableMetricId("billable_metric_id")
            .dimensions(listOf("region", "instance_type"))
            .name("name")
            .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
            .metadata(
                DimensionalPriceGroupCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DimensionalPriceGroupCreateParams.builder()
                .billableMetricId("billable_metric_id")
                .dimensions(listOf("region", "instance_type"))
                .name("name")
                .externalDimensionalPriceGroupId("external_dimensional_price_group_id")
                .metadata(
                    DimensionalPriceGroupCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(body.dimensions()).isEqualTo(listOf("region", "instance_type"))
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.externalDimensionalPriceGroupId())
            .isEqualTo("external_dimensional_price_group_id")
        assertThat(body.metadata())
            .isEqualTo(
                DimensionalPriceGroupCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DimensionalPriceGroupCreateParams.builder()
                .billableMetricId("billable_metric_id")
                .dimensions(listOf("region", "instance_type"))
                .name("name")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.billableMetricId()).isEqualTo("billable_metric_id")
        assertThat(body.dimensions()).isEqualTo(listOf("region", "instance_type"))
        assertThat(body.name()).isEqualTo("name")
    }
}
