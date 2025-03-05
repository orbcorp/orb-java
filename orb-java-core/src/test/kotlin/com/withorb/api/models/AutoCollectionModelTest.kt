// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AutoCollectionModelTest {

    @Test
    fun createAutoCollectionModel() {
        val autoCollectionModel =
            AutoCollectionModel.builder()
                .enabled(true)
                .nextAttemptAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .numAttempts(0L)
                .previouslyAttemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(autoCollectionModel).isNotNull
        assertThat(autoCollectionModel.enabled()).contains(true)
        assertThat(autoCollectionModel.nextAttemptAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(autoCollectionModel.numAttempts()).contains(0L)
        assertThat(autoCollectionModel.previouslyAttemptedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
