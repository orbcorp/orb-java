// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerCreateParamsTest {

    @Test
    fun create() {
        CustomerCreateParams.builder()
            .email("dev@stainless.com")
            .name("x")
            .accountingSyncConfiguration(
                NewAccountingSyncConfigurationModel.builder()
                    .addAccountingProvider(
                        NewAccountingSyncConfigurationModel.AccountingProvider.builder()
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
                AddressInputModel.builder()
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
                CustomerHierarchyConfigModel.builder()
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
            .reportingConfiguration(NewReportingConfigurationModel.builder().exempt(true).build())
            .shippingAddress(
                AddressInputModel.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
            .taxConfiguration(
                NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                    .taxExempt(true)
                    .taxProvider(
                        NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider.AVALARA
                    )
                    .taxExemptionCode("tax_exemption_code")
                    .build()
            )
            .taxId(
                CustomerTaxIdModel.builder()
                    .country(CustomerTaxIdModel.Country.AD)
                    .type(CustomerTaxIdModel.Type.AD_NRT)
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
                    NewAccountingSyncConfigurationModel.builder()
                        .addAccountingProvider(
                            NewAccountingSyncConfigurationModel.AccountingProvider.builder()
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
                    AddressInputModel.builder()
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
                    CustomerHierarchyConfigModel.builder()
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
                    NewReportingConfigurationModel.builder().exempt(true).build()
                )
                .shippingAddress(
                    AddressInputModel.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                        .taxExempt(true)
                        .taxProvider(
                            NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider.AVALARA
                        )
                        .taxExemptionCode("tax_exemption_code")
                        .build()
                )
                .taxId(
                    CustomerTaxIdModel.builder()
                        .country(CustomerTaxIdModel.Country.AD)
                        .type(CustomerTaxIdModel.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .timezone("timezone")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.accountingSyncConfiguration())
            .contains(
                NewAccountingSyncConfigurationModel.builder()
                    .addAccountingProvider(
                        NewAccountingSyncConfigurationModel.AccountingProvider.builder()
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
                AddressInputModel.builder()
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
                CustomerHierarchyConfigModel.builder()
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
            .contains(NewReportingConfigurationModel.builder().exempt(true).build())
        assertThat(body.shippingAddress())
            .contains(
                AddressInputModel.builder()
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
                NewTaxConfigurationModel.ofAvalaraTaxConfiguration(
                    NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                        .taxExempt(true)
                        .taxProvider(
                            NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider.AVALARA
                        )
                        .taxExemptionCode("tax_exemption_code")
                        .build()
                )
            )
        assertThat(body.taxId())
            .contains(
                CustomerTaxIdModel.builder()
                    .country(CustomerTaxIdModel.Country.AD)
                    .type(CustomerTaxIdModel.Type.AD_NRT)
                    .value("value")
                    .build()
            )
        assertThat(body.timezone()).contains("timezone")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerCreateParams.builder().email("dev@stainless.com").name("x").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.name()).isEqualTo("x")
    }
}
