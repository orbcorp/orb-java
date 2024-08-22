// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AlertEnableParamsTest {

    @Test
    fun createAlertEnableParams() {
        AlertEnableParams.builder().alertConfigurationId("alert_configuration_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            AlertEnableParams.builder().alertConfigurationId("alert_configuration_id").build()
        assertThat(params).isNotNull
        // path param "alertConfigurationId"
        assertThat(params.getPathParam(0)).isEqualTo("alert_configuration_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
