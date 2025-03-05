// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillingCycleAnchorConfigurationModelTest {

    @Test
    fun createBillingCycleAnchorConfigurationModel() {
        val billingCycleAnchorConfigurationModel =
            BillingCycleAnchorConfigurationModel.builder().day(1L).month(1L).year(0L).build()
        assertThat(billingCycleAnchorConfigurationModel).isNotNull
        assertThat(billingCycleAnchorConfigurationModel.day()).isEqualTo(1L)
        assertThat(billingCycleAnchorConfigurationModel.month()).contains(1L)
        assertThat(billingCycleAnchorConfigurationModel.year()).contains(0L)
    }
}
