// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreditTopUpCreateByExternalIdParamsTest {

    @Test
    fun create() {
        CustomerCreditTopUpCreateByExternalIdParams.builder()
            .externalCustomerId("external_customer_id")
            .amount("amount")
            .currency("currency")
            .invoiceSettings(
                CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(0L)
                    .memo("memo")
                    .requireSuccessfulPayment(true)
                    .build()
            )
            .perUnitCostBasis("per_unit_cost_basis")
            .threshold("threshold")
            .expiresAfter(0L)
            .expiresAfterUnit(CustomerCreditTopUpCreateByExternalIdParams.ExpiresAfterUnit.DAY)
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreditTopUpCreateByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .amount("amount")
                .currency("currency")
                .invoiceSettings(
                    CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(0L)
                        .memo("memo")
                        .requireSuccessfulPayment(true)
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .threshold("threshold")
                .expiresAfter(0L)
                .expiresAfterUnit(CustomerCreditTopUpCreateByExternalIdParams.ExpiresAfterUnit.DAY)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(0L)
                    .memo("memo")
                    .requireSuccessfulPayment(true)
                    .build()
            )
        assertThat(body.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
        assertThat(body.threshold()).isEqualTo("threshold")
        assertThat(body.expiresAfter()).contains(0L)
        assertThat(body.expiresAfterUnit())
            .contains(CustomerCreditTopUpCreateByExternalIdParams.ExpiresAfterUnit.DAY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreditTopUpCreateByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .amount("amount")
                .currency("currency")
                .invoiceSettings(
                    CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(0L)
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .threshold("threshold")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo("amount")
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.invoiceSettings())
            .isEqualTo(
                CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .netTerms(0L)
                    .build()
            )
        assertThat(body.perUnitCostBasis()).isEqualTo("per_unit_cost_basis")
        assertThat(body.threshold()).isEqualTo("threshold")
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerCreditTopUpCreateByExternalIdParams.builder()
                .externalCustomerId("external_customer_id")
                .amount("amount")
                .currency("currency")
                .invoiceSettings(
                    CustomerCreditTopUpCreateByExternalIdParams.InvoiceSettings.builder()
                        .autoCollection(true)
                        .netTerms(0L)
                        .build()
                )
                .perUnitCostBasis("per_unit_cost_basis")
                .threshold("threshold")
                .build()
        assertThat(params).isNotNull
        // path param "externalCustomerId"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
