// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreditLedgerCreateEntryParamsTest {

    @Test
    fun create() {
        CustomerCreditLedgerCreateEntryParams.builder()
            .customerId("customer_id")
            .body(
                CustomerCreditLedgerCreateEntryParams.Body.Increment.builder()
                    .amount(0.0)
                    .currency("currency")
                    .description("description")
                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .invoiceSettings(
                        CustomerCreditLedgerCreateEntryParams.Body.Increment.InvoiceSettings
                            .builder()
                            .autoCollection(true)
                            .netTerms(0L)
                            .invoiceDate(LocalDate.parse("2019-12-27"))
                            .memo("memo")
                            .requireSuccessfulPayment(true)
                            .build()
                    )
                    .metadata(
                        CustomerCreditLedgerCreateEntryParams.Body.Increment.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .perUnitCostBasis("per_unit_cost_basis")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerCreditLedgerCreateEntryParams.builder()
                .customerId("customer_id")
                .incrementBody(0.0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerCreditLedgerCreateEntryParams.builder()
                .customerId("customer_id")
                .body(
                    CustomerCreditLedgerCreateEntryParams.Body.Increment.builder()
                        .amount(0.0)
                        .currency("currency")
                        .description("description")
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .invoiceSettings(
                            CustomerCreditLedgerCreateEntryParams.Body.Increment.InvoiceSettings
                                .builder()
                                .autoCollection(true)
                                .netTerms(0L)
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .memo("memo")
                                .requireSuccessfulPayment(true)
                                .build()
                        )
                        .metadata(
                            CustomerCreditLedgerCreateEntryParams.Body.Increment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerCreditLedgerCreateEntryParams.Body.ofIncrement(
                    CustomerCreditLedgerCreateEntryParams.Body.Increment.builder()
                        .amount(0.0)
                        .currency("currency")
                        .description("description")
                        .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .invoiceSettings(
                            CustomerCreditLedgerCreateEntryParams.Body.Increment.InvoiceSettings
                                .builder()
                                .autoCollection(true)
                                .netTerms(0L)
                                .invoiceDate(LocalDate.parse("2019-12-27"))
                                .memo("memo")
                                .requireSuccessfulPayment(true)
                                .build()
                        )
                        .metadata(
                            CustomerCreditLedgerCreateEntryParams.Body.Increment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerCreditLedgerCreateEntryParams.builder()
                .customerId("customer_id")
                .incrementBody(0.0)
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomerCreditLedgerCreateEntryParams.Body.ofIncrement(
                    CustomerCreditLedgerCreateEntryParams.Body.Increment.builder()
                        .amount(0.0)
                        .build()
                )
            )
    }
}
