// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpListByExternalIdResponseTest {

    @Test
    fun createCustomerCreditTopUpListByExternalIdResponse() {
        val customerCreditTopUpListByExternalIdResponse =
            CustomerCreditTopUpListByExternalIdResponse.builder()
                .id("id")
                .amount("amount")
                .currency("currency")
                .invoiceSettings(
                    CustomerCreditTopUpListByExternalIdResponse.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(123L)
                        .memo("memo")
                        .requireSuccessfulPayment(true)
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .threshold("threshold")
                .expiresAfter(123L)
                .expiresAfterUnit(CustomerCreditTopUpListByExternalIdResponse.ExpiresAfterUnit.DAY)
                .build()
        assertThat(customerCreditTopUpListByExternalIdResponse).isNotNull
        assertThat(customerCreditTopUpListByExternalIdResponse.id()).isEqualTo("id")
        assertThat(customerCreditTopUpListByExternalIdResponse.amount()).isEqualTo("amount")
        assertThat(customerCreditTopUpListByExternalIdResponse.currency()).isEqualTo("currency")
        assertThat(customerCreditTopUpListByExternalIdResponse.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpListByExternalIdResponse.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(123L)
                    .memo("memo")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(customerCreditTopUpListByExternalIdResponse.perUnitCostBasis())
            .isEqualTo("per_unit_cost_basis")
        assertThat(customerCreditTopUpListByExternalIdResponse.threshold()).isEqualTo("threshold")
        assertThat(customerCreditTopUpListByExternalIdResponse.expiresAfter()).contains(123L)
        assertThat(customerCreditTopUpListByExternalIdResponse.expiresAfterUnit())
            .contains(CustomerCreditTopUpListByExternalIdResponse.ExpiresAfterUnit.DAY)
    }
}
