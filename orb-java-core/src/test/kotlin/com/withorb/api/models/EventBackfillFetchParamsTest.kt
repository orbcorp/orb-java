// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventBackfillFetchParamsTest {

    @Test
    fun createEventBackfillFetchParams() {
        EventBackfillFetchParams.builder().backfillId("backfill_id").build()
    }

    @Test
    fun getPathParam() {
        val params = EventBackfillFetchParams.builder().backfillId("backfill_id").build()
        assertThat(params).isNotNull
        // path param "backfillId"
        assertThat(params.getPathParam(0)).isEqualTo("backfill_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
