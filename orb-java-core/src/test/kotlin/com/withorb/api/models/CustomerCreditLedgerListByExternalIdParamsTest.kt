// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditLedgerListByExternalIdParamsTest {

    @Test
    fun createCustomerCreditLedgerListByExternalIdParams() {
        CustomerCreditLedgerListByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .currency("currency")
            .cursor("cursor")
            .entryStatus(CustomerCreditLedgerListByExternalIdParams.EntryStatus.COMMITTED)
            .entryType(CustomerCreditLedgerListByExternalIdParams.EntryType.INCREMENT)
            .limit(123L)
            .minimumAmount("minimum_amount")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerCreditLedgerListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .cursor("cursor")
                .entryStatus(CustomerCreditLedgerListByExternalIdParams.EntryStatus.COMMITTED)
                .entryType(CustomerCreditLedgerListByExternalIdParams.EntryType.INCREMENT)
                .limit(123L)
                .minimumAmount("minimum_amount")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("created_at[gt]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at[gte]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at[lt]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at[lte]", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("currency", listOf("currency"))
        expected.put("cursor", listOf("cursor"))
        expected.put(
            "entry_status",
            listOf(CustomerCreditLedgerListByExternalIdParams.EntryStatus.COMMITTED.toString())
        )
        expected.put(
            "entry_type",
            listOf(CustomerCreditLedgerListByExternalIdParams.EntryType.INCREMENT.toString())
        )
        expected.put("limit", listOf("123"))
        expected.put("minimum_amount", listOf("minimum_amount"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CustomerCreditLedgerListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCreditLedgerListByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
