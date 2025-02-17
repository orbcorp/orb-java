// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreateParamsTest {

    @Test
    fun create() {
        CustomerCreateParams.builder()
            .email("dev@stainlessapi.com")
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
            .addAdditionalEmail("string")
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
                CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                    .taxExempt(true)
                    .taxProvider(
                        CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.TaxProvider
                            .AVALARA
                    )
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
                .email("dev@stainlessapi.com")
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
                .addAdditionalEmail("string")
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
                    CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                        .taxExempt(true)
                        .taxProvider(
                            CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                .TaxProvider
                                .AVALARA
                        )
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

        assertThat(body).isNotNull
        assertThat(body.email()).isEqualTo("dev@stainlessapi.com")
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
        assertThat(body.additionalEmails()).contains(listOf("string"))
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
                CustomerCreateParams.TaxConfiguration.ofNewAvalara(
                    CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                        .taxExempt(true)
                        .taxProvider(
                            CustomerCreateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                .TaxProvider
                                .AVALARA
                        )
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
        val params = CustomerCreateParams.builder().email("dev@stainlessapi.com").name("x").build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.email()).isEqualTo("dev@stainlessapi.com")
        assertThat(body.name()).isEqualTo("x")
    }
}
