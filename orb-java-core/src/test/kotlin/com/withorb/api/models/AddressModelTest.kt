// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddressModelTest {

    @Test
    fun createAddressModel() {
        val addressModel =
            AddressModel.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .postalCode("postal_code")
                .state("state")
                .build()
        assertThat(addressModel).isNotNull
        assertThat(addressModel.city()).contains("city")
        assertThat(addressModel.country()).contains("country")
        assertThat(addressModel.line1()).contains("line1")
        assertThat(addressModel.line2()).contains("line2")
        assertThat(addressModel.postalCode()).contains("postal_code")
        assertThat(addressModel.state()).contains("state")
    }
}
