// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerHierarchyConfigTest {

    @Test
    fun create() {
        val customerHierarchyConfig =
            CustomerHierarchyConfig.builder()
                .addChildCustomerId("string")
                .parentCustomerId("parent_customer_id")
                .build()

        assertThat(customerHierarchyConfig.childCustomerIds().getOrNull()).containsExactly("string")
        assertThat(customerHierarchyConfig.parentCustomerId()).contains("parent_customer_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerHierarchyConfig =
            CustomerHierarchyConfig.builder()
                .addChildCustomerId("string")
                .parentCustomerId("parent_customer_id")
                .build()

        val roundtrippedCustomerHierarchyConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerHierarchyConfig),
                jacksonTypeRef<CustomerHierarchyConfig>(),
            )

        assertThat(roundtrippedCustomerHierarchyConfig).isEqualTo(customerHierarchyConfig)
    }
}
