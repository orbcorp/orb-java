// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddressInputModelTest {

    @Test
    fun createAddressInputModel() {
        val addressInputModel =
            AddressInputModel.builder()
                .city("city")
                .country("country")
                .line1("line1")
                .line2("line2")
                .postalCode("postal_code")
                .state("state")
                .build()
        assertThat(addressInputModel).isNotNull
        assertThat(addressInputModel.city()).contains("city")
        assertThat(addressInputModel.country()).contains("country")
        assertThat(addressInputModel.line1()).contains("line1")
        assertThat(addressInputModel.line2()).contains("line2")
        assertThat(addressInputModel.postalCode()).contains("postal_code")
        assertThat(addressInputModel.state()).contains("state")
    }
}
