// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerUpdateParamsTest {

    @Test
    fun create() {
        CustomerUpdateParams.builder()
            .customerId("customer_id")
            .accountingSyncConfiguration(
                CustomerUpdateParams.AccountingSyncConfiguration.builder()
                    .addAccountingProvider(
                        CustomerUpdateParams.AccountingSyncConfiguration.AccountingProvider
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
                CustomerUpdateParams.BillingAddress.builder()
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
                CustomerUpdateParams.Hierarchy.builder()
                    .addChildCustomerId("string")
                    .parentCustomerId("parent_customer_id")
                    .build()
            )
            .metadata(
                CustomerUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .paymentProvider(CustomerUpdateParams.PaymentProvider.QUICKBOOKS)
            .paymentProviderId("payment_provider_id")
            .reportingConfiguration(
                CustomerUpdateParams.ReportingConfiguration.builder().exempt(true).build()
            )
            .shippingAddress(
                CustomerUpdateParams.ShippingAddress.builder()
                    .city("city")
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .postalCode("postal_code")
                    .state("state")
                    .build()
            )
            .taxConfiguration(
                CustomerUpdateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                    .taxExempt(true)
                    .taxProvider(
                        CustomerUpdateParams.TaxConfiguration.NewAvalaraTaxConfiguration.TaxProvider
                            .AVALARA
                    )
                    .taxExemptionCode("tax_exemption_code")
                    .build()
            )
            .taxId(
                CustomerUpdateParams.TaxId.builder()
                    .country(CustomerUpdateParams.TaxId.Country.AD)
                    .type(CustomerUpdateParams.TaxId.Type.AD_NRT)
                    .value("value")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = CustomerUpdateParams.builder().customerId("customer_id").build()

        assertThat(params._pathParam(0)).isEqualTo("customer_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerUpdateParams.builder()
                .customerId("customer_id")
                .accountingSyncConfiguration(
                    CustomerUpdateParams.AccountingSyncConfiguration.builder()
                        .addAccountingProvider(
                            CustomerUpdateParams.AccountingSyncConfiguration.AccountingProvider
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
                    CustomerUpdateParams.BillingAddress.builder()
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
                    CustomerUpdateParams.Hierarchy.builder()
                        .addChildCustomerId("string")
                        .parentCustomerId("parent_customer_id")
                        .build()
                )
                .metadata(
                    CustomerUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .paymentProvider(CustomerUpdateParams.PaymentProvider.QUICKBOOKS)
                .paymentProviderId("payment_provider_id")
                .reportingConfiguration(
                    CustomerUpdateParams.ReportingConfiguration.builder().exempt(true).build()
                )
                .shippingAddress(
                    CustomerUpdateParams.ShippingAddress.builder()
                        .city("city")
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .postalCode("postal_code")
                        .state("state")
                        .build()
                )
                .taxConfiguration(
                    CustomerUpdateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                        .taxExempt(true)
                        .taxProvider(
                            CustomerUpdateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                .TaxProvider
                                .AVALARA
                        )
                        .taxExemptionCode("tax_exemption_code")
                        .build()
                )
                .taxId(
                    CustomerUpdateParams.TaxId.builder()
                        .country(CustomerUpdateParams.TaxId.Country.AD)
                        .type(CustomerUpdateParams.TaxId.Type.AD_NRT)
                        .value("value")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.accountingSyncConfiguration())
            .contains(
                CustomerUpdateParams.AccountingSyncConfiguration.builder()
                    .addAccountingProvider(
                        CustomerUpdateParams.AccountingSyncConfiguration.AccountingProvider
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
                CustomerUpdateParams.BillingAddress.builder()
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
                CustomerUpdateParams.Hierarchy.builder()
                    .addChildCustomerId("string")
                    .parentCustomerId("parent_customer_id")
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                CustomerUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.paymentProvider()).contains(CustomerUpdateParams.PaymentProvider.QUICKBOOKS)
        assertThat(body.paymentProviderId()).contains("payment_provider_id")
        assertThat(body.reportingConfiguration())
            .contains(CustomerUpdateParams.ReportingConfiguration.builder().exempt(true).build())
        assertThat(body.shippingAddress())
            .contains(
                CustomerUpdateParams.ShippingAddress.builder()
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
                CustomerUpdateParams.TaxConfiguration.ofNewAvalara(
                    CustomerUpdateParams.TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                        .taxExempt(true)
                        .taxProvider(
                            CustomerUpdateParams.TaxConfiguration.NewAvalaraTaxConfiguration
                                .TaxProvider
                                .AVALARA
                        )
                        .taxExemptionCode("tax_exemption_code")
                        .build()
                )
            )
        assertThat(body.taxId())
            .contains(
                CustomerUpdateParams.TaxId.builder()
                    .country(CustomerUpdateParams.TaxId.Country.AD)
                    .type(CustomerUpdateParams.TaxId.Type.AD_NRT)
                    .value("value")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CustomerUpdateParams.builder().customerId("customer_id").build()

        val body = params._body()
    }
}
