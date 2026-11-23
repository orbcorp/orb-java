// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountBillingEntityCreateParamsTest {

    @Test
    fun create() {
        AccountBillingEntityCreateParams.builder()
            .address(
                AddressInput.builder()
                    .country("x")
                    .city("city")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
            .legalName("x")
            .name("x")
            .externalBillingEntityId("x")
            .invoiceSettings(
                AccountBillingEntityCreateParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .automaticTaxEnabled(true)
                    .emailDelivery(true)
                    .manualIssuance(true)
                    .memo("memo")
                    .netTerms(0L)
                    .build()
            )
            .addTaxRegistration(
                AccountBillingEntityCreateParams.TaxRegistration.builder()
                    .code("x")
                    .value("x")
                    .appliesTo("applies_to")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountBillingEntityCreateParams.builder()
                .address(
                    AddressInput.builder()
                        .country("x")
                        .city("city")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .legalName("x")
                .name("x")
                .externalBillingEntityId("x")
                .invoiceSettings(
                    AccountBillingEntityCreateParams.InvoiceSettings.builder()
                        .autoCollection(true)
                        .automaticTaxEnabled(true)
                        .emailDelivery(true)
                        .manualIssuance(true)
                        .memo("memo")
                        .netTerms(0L)
                        .build()
                )
                .addTaxRegistration(
                    AccountBillingEntityCreateParams.TaxRegistration.builder()
                        .code("x")
                        .value("x")
                        .appliesTo("applies_to")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.address())
            .isEqualTo(
                AddressInput.builder()
                    .country("x")
                    .city("city")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(body.legalName()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.externalBillingEntityId()).contains("x")
        assertThat(body.invoiceSettings())
            .contains(
                AccountBillingEntityCreateParams.InvoiceSettings.builder()
                    .autoCollection(true)
                    .automaticTaxEnabled(true)
                    .emailDelivery(true)
                    .manualIssuance(true)
                    .memo("memo")
                    .netTerms(0L)
                    .build()
            )
        assertThat(body.taxRegistrations().getOrNull())
            .containsExactly(
                AccountBillingEntityCreateParams.TaxRegistration.builder()
                    .code("x")
                    .value("x")
                    .appliesTo("applies_to")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountBillingEntityCreateParams.builder()
                .address(AddressInput.builder().country("x").build())
                .legalName("x")
                .name("x")
                .build()

        val body = params._body()

        assertThat(body.address()).isEqualTo(AddressInput.builder().country("x").build())
        assertThat(body.legalName()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
    }
}
