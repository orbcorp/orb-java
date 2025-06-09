// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AffectedBlockTest {

    @Test
    fun create() {
        val affectedBlock =
            AffectedBlock.builder()
                .id("id")
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .perUnitCostBasis("per_unit_cost_basis")
                .build()

        assertThat(affectedBlock.id()).isEqualTo("id")
        assertThat(affectedBlock.expiryDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(affectedBlock.perUnitCostBasis()).contains("per_unit_cost_basis")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val affectedBlock =
            AffectedBlock.builder()
                .id("id")
                .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .perUnitCostBasis("per_unit_cost_basis")
                .build()

        val roundtrippedAffectedBlock =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(affectedBlock),
                jacksonTypeRef<AffectedBlock>(),
            )

        assertThat(roundtrippedAffectedBlock).isEqualTo(affectedBlock)
    }
}
