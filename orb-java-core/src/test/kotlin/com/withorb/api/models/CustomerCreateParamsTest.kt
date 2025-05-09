// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerCreateParamsTest {

    @Test
    fun create() {
        CustomerCreateParams.builder()
            .email("dev@stainless.com")
            .name("x")
            .accountingSyncConfiguration(
                CustomerCreateParams.AccountingSyncConfiguration.builder()
                    .addAccountingProvider(
                        CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                            .builder()
                            .externalProviderId("external_provider_id")
                            .providerType("provider_type")
                            .build()
                    )
                    .excluded(true)
                    .build()
            )
            .addAdditionalEmail("dev@stainless.com")
            .autoCollection(true)
            .billingAddress(
                CustomerCreateParams.BillingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
            .currency("currency")
            .emailDelivery(true)
            .externalCustomerId("external_customer_id")
            .hierarchy(
                CustomerCreateParams.Hierarchy.builder()
                    .addChildCustomerId("string")
                    .parentCustomerId("parent_customer_id")
                    .build()
            )
            .metadata(
                CustomerCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
            .paymentProviderId("payment_provider_id")
            .reportingConfiguration(
                CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
            )
            .shippingAddress(
                CustomerCreateParams.ShippingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
            .taxConfiguration(
                CustomerCreateParams.TaxConfiguration.Avalara.builder()
                    .taxExempt(true)
                    .taxExemptionCode("tax_exemption_code")
                    .build()
            )
            .taxId(
                CustomerCreateParams.TaxId.builder()
                    .country(CustomerCreateParams.TaxId.Country.AD)
                    .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                    .value("value")
                    .build()
            )
            .timezone("timezone")
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerCreateParams.builder()
                .email("dev@stainless.com")
                .name("x")
                .accountingSyncConfiguration(
                    CustomerCreateParams.AccountingSyncConfiguration.builder()
                        .addAccountingProvider(
                            CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                                .builder()
                                .externalProviderId("external_provider_id")
                                .providerType("provider_type")
                                .build()
                        )
                        .excluded(true)
                        .build()
                )
                .addAdditionalEmail("dev@stainless.com")
                .autoCollection(true)
                .billingAddress(
                    CustomerCreateParams.BillingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .currency("currency")
                .emailDelivery(true)
                .externalCustomerId("external_customer_id")
                .hierarchy(
                    CustomerCreateParams.Hierarchy.builder()
                        .addChildCustomerId("string")
                        .parentCustomerId("parent_customer_id")
                        .build()
                )
                .metadata(
                    CustomerCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentProvider(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerCreateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerCreateParams.TaxConfiguration.Avalara.builder()
                        .taxExempt(true)
                        .taxExemptionCode("tax_exemption_code")
                        .build()
                )
                .taxId(
                    CustomerCreateParams.TaxId.builder()
                        .country(CustomerCreateParams.TaxId.Country.AD)
                        .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.accountingSyncConfiguration())
            .contains(
                CustomerCreateParams.AccountingSyncConfiguration.builder()
                    .addAccountingProvider(
                        CustomerCreateParams.AccountingSyncConfiguration.AccountingProvider
                            .builder()
                            .externalProviderId("external_provider_id")
                            .providerType("provider_type")
                            .build()
                    )
                    .excluded(true)
                    .build()
            )
        assertThat(body.additionalEmails().getOrNull()).containsExactly("dev@stainless.com")
        assertThat(body.autoCollection()).contains(true)
        assertThat(body.billingAddress())
            .contains(
                CustomerCreateParams.BillingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(body.currency()).contains("currency")
        assertThat(body.emailDelivery()).contains(true)
        assertThat(body.externalCustomerId()).contains("external_customer_id")
        assertThat(body.hierarchy())
            .contains(
                CustomerCreateParams.Hierarchy.builder()
                    .addChildCustomerId("string")
                    .parentCustomerId("parent_customer_id")
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                CustomerCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.paymentProvider()).contains(CustomerCreateParams.PaymentProvider.QUICKBOOKS)
        assertThat(body.paymentProviderId()).contains("payment_provider_id")
        assertThat(body.reportingConfiguration())
            .contains(CustomerCreateParams.ReportingConfiguration.builder().exempt(true).build())
        assertThat(body.shippingAddress())
            .contains(
                CustomerCreateParams.ShippingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(body.taxConfiguration())
            .contains(
                CustomerCreateParams.TaxConfiguration.ofAvalara(
                    CustomerCreateParams.TaxConfiguration.Avalara.builder()
                        .taxExempt(true)
                        .taxExemptionCode("tax_exemption_code")
                        .build()
                )
            )
        assertThat(body.taxId())
            .contains(
                CustomerCreateParams.TaxId.builder()
                    .country(CustomerCreateParams.TaxId.Country.AD)
                    .type(CustomerCreateParams.TaxId.Type.AD_NRT)
                    .value("value")
                    .build()
            )
        assertThat(body.timezone()).contains("timezone")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerCreateParams.builder().email("dev@stainless.com").name("x").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.name()).isEqualTo("x")
    }
}
