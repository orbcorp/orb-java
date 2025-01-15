// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerUpdateByExternalIdParamsTest {

    @Test
    fun createCustomerUpdateByExternalIdParams() {
        CustomerUpdateByExternalIdParams.builder()
            .id("external_customer_id")
            .accountingSyncConfiguration(
                CustomerUpdateByExternalIdParams.AccountingSyncConfiguration.builder()
                    .addAccountingProvider(
                        CustomerUpdateByExternalIdParams.AccountingSyncConfiguration
                            .AccountingProvider
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
                CustomerUpdateByExternalIdParams.BillingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
            .currency("currency")
            .email("dev@stainlessapi.com")
            .emailDelivery(true)
            .externalCustomerId("external_customer_id")
            .metadata(
                CustomerUpdateByExternalIdParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .paymentProvider(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
            .paymentProviderId("payment_provider_id")
            .reportingConfiguration(
                CustomerUpdateByExternalIdParams.ReportingConfiguration.builder()
                    .exempt(true)
                    .build()
            )
            .shippingAddress(
                CustomerUpdateByExternalIdParams.ShippingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
            .taxConfiguration(
                CustomerUpdateByExternalIdParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                    CustomerUpdateByExternalIdParams.TaxConfiguration.NewAvalaraTaxConfiguration
                        .builder()
                        .taxExempt(true)
                        .taxProvider(
                            CustomerUpdateByExternalIdParams.TaxConfiguration
                                .NewAvalaraTaxConfiguration
                                .TaxProvider
                                .AVALARA
                        )
                        .taxExemptionCode("tax_exemption_code")
                        .build()
                )
            )
            .taxId(
                CustomerUpdateByExternalIdParams.TaxId.builder()
                    .country(CustomerUpdateByExternalIdParams.TaxId.Country.AD)
                    .type(CustomerUpdateByExternalIdParams.TaxId.Type.AD_NRT)
                    .value("value")
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerUpdateByExternalIdParams.builder()
                .id("external_customer_id")
                .accountingSyncConfiguration(
                    CustomerUpdateByExternalIdParams.AccountingSyncConfiguration.builder()
                        .addAccountingProvider(
                            CustomerUpdateByExternalIdParams.AccountingSyncConfiguration
                                .AccountingProvider
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
                    CustomerUpdateByExternalIdParams.BillingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .currency("currency")
                .email("dev@stainlessapi.com")
                .emailDelivery(true)
                .externalCustomerId("external_customer_id")
                .metadata(
                    CustomerUpdateByExternalIdParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .paymentProvider(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerUpdateByExternalIdParams.ReportingConfiguration.builder()
                        .exempt(true)
                        .build()
                )
                .shippingAddress(
                    CustomerUpdateByExternalIdParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerUpdateByExternalIdParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                        CustomerUpdateByExternalIdParams.TaxConfiguration.NewAvalaraTaxConfiguration
                            .builder()
                            .taxExempt(true)
                            .taxProvider(
                                CustomerUpdateByExternalIdParams.TaxConfiguration
                                    .NewAvalaraTaxConfiguration
                                    .TaxProvider
                                    .AVALARA
                            )
                            .taxExemptionCode("tax_exemption_code")
                            .build()
                    )
                )
                .taxId(
                    CustomerUpdateByExternalIdParams.TaxId.builder()
                        .country(CustomerUpdateByExternalIdParams.TaxId.Country.AD)
                        .type(CustomerUpdateByExternalIdParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountingSyncConfiguration())
            .contains(
                CustomerUpdateByExternalIdParams.AccountingSyncConfiguration.builder()
                    .addAccountingProvider(
                        CustomerUpdateByExternalIdParams.AccountingSyncConfiguration
                            .AccountingProvider
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
                CustomerUpdateByExternalIdParams.BillingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
        assertThat(body.currency()).contains("currency")
        assertThat(body.email()).contains("dev@stainlessapi.com")
        assertThat(body.emailDelivery()).contains(true)
        assertThat(body.externalCustomerId()).contains("external_customer_id")
        assertThat(body.metadata())
            .contains(
                CustomerUpdateByExternalIdParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.paymentProvider())
            .contains(CustomerUpdateByExternalIdParams.PaymentProvider.QUICKBOOKS)
        assertThat(body.paymentProviderId()).contains("payment_provider_id")
        assertThat(body.reportingConfiguration())
            .contains(
                CustomerUpdateByExternalIdParams.ReportingConfiguration.builder()
                    .exempt(true)
                    .build()
            )
        assertThat(body.shippingAddress())
            .contains(
                CustomerUpdateByExternalIdParams.ShippingAddress.builder()
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
                CustomerUpdateByExternalIdParams.TaxConfiguration.ofNewAvalaraTaxConfiguration(
                    CustomerUpdateByExternalIdParams.TaxConfiguration.NewAvalaraTaxConfiguration
                        .builder()
                        .taxExempt(true)
                        .taxProvider(
                            CustomerUpdateByExternalIdParams.TaxConfiguration
                                .NewAvalaraTaxConfiguration
                                .TaxProvider
                                .AVALARA
                        )
                        .taxExemptionCode("tax_exemption_code")
                        .build()
                )
            )
        assertThat(body.taxId())
            .contains(
                CustomerUpdateByExternalIdParams.TaxId.builder()
                    .country(CustomerUpdateByExternalIdParams.TaxId.Country.AD)
                    .type(CustomerUpdateByExternalIdParams.TaxId.Type.AD_NRT)
                    .value("value")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CustomerUpdateByExternalIdParams.builder().id("external_customer_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = CustomerUpdateByExternalIdParams.builder().id("external_customer_id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
