// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUpdateByExternalIdParamsTest {

    @Test
    fun create() {
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
            .email("dev@stainless.com")
            .emailDelivery(true)
            .externalCustomerId("external_customer_id")
            .hierarchy(
                CustomerUpdateByExternalIdParams.Hierarchy.builder()
                    .addChildCustomerId("string")
                    .parentCustomerId("parent_customer_id")
                    .build()
            )
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
                CustomerUpdateByExternalIdParams.TaxConfiguration.NewAvalaraTaxConfiguration
                    .builder()
                    .taxExempt(true)
                    .taxProvider(
                        CustomerUpdateByExternalIdParams.TaxConfiguration.NewAvalaraTaxConfiguration
                            .TaxProvider
                            .AVALARA
                    )
                    .taxExemptionCode("tax_exemption_code")
                    .build()
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
    fun pathParams() {
        val params = CustomerUpdateByExternalIdParams.builder().id("external_customer_id").build()

        assertThat(params._pathParam(0)).isEqualTo("external_customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
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
                .email("dev@stainless.com")
                .emailDelivery(true)
                .externalCustomerId("external_customer_id")
                .hierarchy(
                    CustomerUpdateByExternalIdParams.Hierarchy.builder()
                        .addChildCustomerId("string")
                        .parentCustomerId("parent_customer_id")
                        .build()
                )
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
                .taxId(
                    CustomerUpdateByExternalIdParams.TaxId.builder()
                        .country(CustomerUpdateByExternalIdParams.TaxId.Country.AD)
                        .type(CustomerUpdateByExternalIdParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
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
        assertThat(body.additionalEmails().getOrNull()).containsExactly("string")
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
        assertThat(body.email()).contains("dev@stainless.com")
        assertThat(body.emailDelivery()).contains(true)
        assertThat(body.externalCustomerId()).contains("external_customer_id")
        assertThat(body.hierarchy())
            .contains(
                CustomerUpdateByExternalIdParams.Hierarchy.builder()
                    .addChildCustomerId("string")
                    .parentCustomerId("parent_customer_id")
                    .build()
            )
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
                CustomerUpdateByExternalIdParams.TaxConfiguration.ofNewAvalara(
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
    fun bodyWithoutOptionalFields() {
        val params = CustomerUpdateByExternalIdParams.builder().id("external_customer_id").build()

        val body = params._body()

        assertNotNull(body)
    }
}
