// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountBillingEntityUpdateByExternalIdParamsTest {

    @Test
    fun create() {
        AccountBillingEntityUpdateByExternalIdParams.builder()
            .externalBillingEntityId("external_billing_entity_id")
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
            .defaultPaymentGatewayConnectionId("default_payment_gateway_connection_id")
            .invoiceSettings(
                AccountBillingEntityUpdateByExternalIdParams.InvoiceSettings.builder()
                    .memo("memo")
                    .build()
            )
            .legalName("x")
            .name("x")
            .addPaymentGatewayConnection(
                AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection.builder()
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .paymentProviderType(
                        AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection
                            .PaymentProviderType
                            .STRIPE
                    )
                    .build()
            )
            .addTaxRegistration(
                AccountBillingEntityUpdateByExternalIdParams.TaxRegistration.builder()
                    .code("x")
                    .value("x")
                    .appliesTo("applies_to")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountBillingEntityUpdateByExternalIdParams.builder()
                .externalBillingEntityId("external_billing_entity_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_billing_entity_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountBillingEntityUpdateByExternalIdParams.builder()
                .externalBillingEntityId("external_billing_entity_id")
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
                .defaultPaymentGatewayConnectionId("default_payment_gateway_connection_id")
                .invoiceSettings(
                    AccountBillingEntityUpdateByExternalIdParams.InvoiceSettings.builder()
                        .memo("memo")
                        .build()
                )
                .legalName("x")
                .name("x")
                .addPaymentGatewayConnection(
                    AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection.builder()
                        .paymentGatewayConnectionId("payment_gateway_connection_id")
                        .paymentProviderType(
                            AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection
                                .PaymentProviderType
                                .STRIPE
                        )
                        .build()
                )
                .addTaxRegistration(
                    AccountBillingEntityUpdateByExternalIdParams.TaxRegistration.builder()
                        .code("x")
                        .value("x")
                        .appliesTo("applies_to")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.address())
            .contains(
                AddressInput.builder()
                    .country("x")
                    .city("city")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(body.defaultPaymentGatewayConnectionId())
            .contains("default_payment_gateway_connection_id")
        assertThat(body.invoiceSettings())
            .contains(
                AccountBillingEntityUpdateByExternalIdParams.InvoiceSettings.builder()
                    .memo("memo")
                    .build()
            )
        assertThat(body.legalName()).contains("x")
        assertThat(body.name()).contains("x")
        assertThat(body.paymentGatewayConnections().getOrNull())
            .containsExactly(
                AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection.builder()
                    .paymentGatewayConnectionId("payment_gateway_connection_id")
                    .paymentProviderType(
                        AccountBillingEntityUpdateByExternalIdParams.PaymentGatewayConnection
                            .PaymentProviderType
                            .STRIPE
                    )
                    .build()
            )
        assertThat(body.taxRegistrations().getOrNull())
            .containsExactly(
                AccountBillingEntityUpdateByExternalIdParams.TaxRegistration.builder()
                    .code("x")
                    .value("x")
                    .appliesTo("applies_to")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountBillingEntityUpdateByExternalIdParams.builder()
                .externalBillingEntityId("external_billing_entity_id")
                .build()

        val body = params._body()
    }
}
