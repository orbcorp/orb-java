// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressTest {

    @Test
    fun create() {
        val address =
            Address.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .postalCode("postal_code")
                .state("state")
                .build()

        assertThat(address.city()).contains("city")
        assertThat(address.country()).contains("country")
        assertThat(address.line1()).contains("line1")
        assertThat(address.line2()).contains("line2")
        assertThat(address.postalCode()).contains("postal_code")
        assertThat(address.state()).contains("state")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val address =
            Address.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .postalCode("postal_code")
                .state("state")
                .build()

        val roundtrippedAddress =
            jsonMapper.readValue(jsonMapper.writeValueAsString(address), jacksonTypeRef<Address>())

        assertThat(roundtrippedAddress).isEqualTo(address)
    }
}
