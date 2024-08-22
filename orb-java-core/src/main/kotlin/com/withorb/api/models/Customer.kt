// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonField
import com.withorb.api.core.Enum
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException

/**
 * A customer is a buyer of your products, and the other party to the billing
 * relationship.
 *
 * In Orb, customers are assigned system generated identifiers automatically, but
 * it's often desirable to have these match existing identifiers in your system. To
 * avoid having to denormalize Orb ID information, you can pass in an
 * `external_customer_id` with your own identifier. See
 * [Customer ID Aliases](../guides/events-and-metrics/customer-aliases) for further
 * information about how these aliases work in Orb.
 *
 * In addition to having an identifier in your system, a customer may exist in a
 * payment provider solution like Stripe. Use the `payment_provider_id` and the
 * `payment_provider` enum field to express this mapping.
 *
 * A customer also has a timezone (from the standard
 * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to
 * your account's timezone. See
 * [Timezone localization](../guides/product-catalog/timezones.md) for information
 * on what this timezone parameter influences within Orb.
 */
@JsonDeserialize(builder = Customer.Builder::class)
@NoAutoDetect
class Customer private constructor(
  private val metadata: JsonField<Metadata>,
  private val id: JsonField<String>,
  private val externalCustomerId: JsonField<String>,
  private val name: JsonField<String>,
  private val email: JsonField<String>,
  private val timezone: JsonField<String>,
  private val paymentProviderId: JsonField<String>,
  private val paymentProvider: JsonField<PaymentProvider>,
  private val createdAt: JsonField<OffsetDateTime>,
  private val shippingAddress: JsonField<ShippingAddress>,
  private val billingAddress: JsonField<BillingAddress>,
  private val balance: JsonField<String>,
  private val currency: JsonField<String>,
  private val taxId: JsonField<TaxId>,
  private val autoCollection: JsonField<Boolean>,
  private val emailDelivery: JsonField<Boolean>,
  private val additionalEmails: JsonField<List<String>>,
  private val portalUrl: JsonField<String>,
  private val accountingSyncConfiguration: JsonField<AccountingSyncConfiguration>,
  private val reportingConfiguration: JsonField<ReportingConfiguration>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * User specified key-value pairs for the resource. If not present, this defaults
     * to an empty dictionary. Individual keys can be removed by setting the value to
     * `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun id(): String = id.getRequired("id")

    /**
     * An optional user-defined ID for this customer resource, used throughout the
     * system as an alias for this Customer. Use this field to identify a customer by
     * an existing identifier in your system.
     */
    fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId.getNullable("external_customer_id"))

    /** The full name of the customer */
    fun name(): String = name.getRequired("name")

    /**
     * A valid customer email, to be used for notifications. When Orb triggers payment
     * through a payment gateway, this email will be used for any automatically issued
     * receipts.
     */
    fun email(): String = email.getRequired("email")

    /**
     * A timezone identifier from the IANA timezone database, such as
     * "America/Los_Angeles". This "defaults to your account's timezone if not set.
     * This cannot be changed after customer creation.
     */
    fun timezone(): String = timezone.getRequired("timezone")

    /**
     * The ID of this customer in an external payments solution, such as Stripe. This
     * is used for creating charges or invoices in the external system via Orb.
     */
    fun paymentProviderId(): Optional<String> = Optional.ofNullable(paymentProviderId.getNullable("payment_provider_id"))

    /**
     * This is used for creating charges or invoices in an external system via Orb.
     * When not in test mode, the connection must first be configured in the Orb
     * webapp.
     */
    fun paymentProvider(): Optional<PaymentProvider> = Optional.ofNullable(paymentProvider.getNullable("payment_provider"))

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun shippingAddress(): Optional<ShippingAddress> = Optional.ofNullable(shippingAddress.getNullable("shipping_address"))

    fun billingAddress(): Optional<BillingAddress> = Optional.ofNullable(billingAddress.getNullable("billing_address"))

    /** The customer's current balance in their currency. */
    fun balance(): String = balance.getRequired("balance")

    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    /**
     * Tax IDs are commonly required to be displayed on customer invoices, which are
     * added to the headers of invoices.
     *
     * ### Supported Tax ID Countries and Types
     *
     * | Country              | Type         | Description                                                                                             |
     * | -------------------- | ------------ | ------------------------------------------------------------------------------------------------------- |
     * | Andorra              | `ad_nrt`     | Andorran NRT Number                                                                                     |
     * | Argentina            | `ar_cuit`    | Argentinian Tax ID Number                                                                               |
     * | Australia            | `au_abn`     | Australian Business Number (AU ABN)                                                                     |
     * | Australia            | `au_arn`     | Australian Taxation Office Reference Number                                                             |
     * | Austria              | `eu_vat`     | European VAT Number                                                                                     |
     * | Bahrain              | `bh_vat`     | Bahraini VAT Number                                                                                     |
     * | Belgium              | `eu_vat`     | European VAT Number                                                                                     |
     * | Bolivia              | `bo_tin`     | Bolivian Tax ID                                                                                         |
     * | Brazil               | `br_cnpj`    | Brazilian CNPJ Number                                                                                   |
     * | Brazil               | `br_cpf`     | Brazilian CPF Number                                                                                    |
     * | Bulgaria             | `bg_uic`     | Bulgaria Unified Identification Code                                                                    |
     * | Bulgaria             | `eu_vat`     | European VAT Number                                                                                     |
     * | Canada               | `ca_bn`      | Canadian BN                                                                                             |
     * | Canada               | `ca_gst_hst` | Canadian GST/HST Number                                                                                 |
     * | Canada               | `ca_pst_bc`  | Canadian PST Number (British Columbia)                                                                  |
     * | Canada               | `ca_pst_mb`  | Canadian PST Number (Manitoba)                                                                          |
     * | Canada               | `ca_pst_sk`  | Canadian PST Number (Saskatchewan)                                                                      |
     * | Canada               | `ca_qst`     | Canadian QST Number (Québec)                                                                            |
     * | Chile                | `cl_tin`     | Chilean TIN                                                                                             |
     * | China                | `cn_tin`     | Chinese Tax ID                                                                                          |
     * | Colombia             | `co_nit`     | Colombian NIT Number                                                                                    |
     * | Costa Rica           | `cr_tin`     | Costa Rican Tax ID                                                                                      |
     * | Croatia              | `eu_vat`     | European VAT Number                                                                                     |
     * | Cyprus               | `eu_vat`     | European VAT Number                                                                                     |
     * | Czech Republic       | `eu_vat`     | European VAT Number                                                                                     |
     * | Denmark              | `eu_vat`     | European VAT Number                                                                                     |
     * | Dominican Republic   | `do_rcn`     | Dominican RCN Number                                                                                    |
     * | Ecuador              | `ec_ruc`     | Ecuadorian RUC Number                                                                                   |
     * | Egypt                | `eg_tin`     | Egyptian Tax Identification Number                                                                      |
     * | El Salvador          | `sv_nit`     | El Salvadorian NIT Number                                                                               |
     * | Estonia              | `eu_vat`     | European VAT Number                                                                                     |
     * | EU                   | `eu_oss_vat` | European One Stop Shop VAT Number for non-Union scheme                                                  |
     * | Finland              | `eu_vat`     | European VAT Number                                                                                     |
     * | France               | `eu_vat`     | European VAT Number                                                                                     |
     * | Georgia              | `ge_vat`     | Georgian VAT                                                                                            |
     * | Germany              | `eu_vat`     | European VAT Number                                                                                     |
     * | Greece               | `eu_vat`     | European VAT Number                                                                                     |
     * | Hong Kong            | `hk_br`      | Hong Kong BR Number                                                                                     |
     * | Hungary              | `eu_vat`     | European VAT Number                                                                                     |
     * | Hungary              | `hu_tin`     | Hungary Tax Number (adószám)                                                                            |
     * | Iceland              | `is_vat`     | Icelandic VAT                                                                                           |
     * | India                | `in_gst`     | Indian GST Number                                                                                       |
     * | Indonesia            | `id_npwp`    | Indonesian NPWP Number                                                                                  |
     * | Ireland              | `eu_vat`     | European VAT Number                                                                                     |
     * | Israel               | `il_vat`     | Israel VAT                                                                                              |
     * | Italy                | `eu_vat`     | European VAT Number                                                                                     |
     * | Japan                | `jp_cn`      | Japanese Corporate Number (_Hōjin Bangō_)                                                               |
     * | Japan                | `jp_rn`      | Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_) |
     * | Japan                | `jp_trn`     | Japanese Tax Registration Number (_Tōroku Bangō_)                                                       |
     * | Kazakhstan           | `kz_bin`     | Kazakhstani Business Identification Number                                                              |
     * | Kenya                | `ke_pin`     | Kenya Revenue Authority Personal Identification Number                                                  |
     * | Latvia               | `eu_vat`     | European VAT Number                                                                                     |
     * | Liechtenstein        | `li_uid`     | Liechtensteinian UID Number                                                                             |
     * | Lithuania            | `eu_vat`     | European VAT Number                                                                                     |
     * | Luxembourg           | `eu_vat`     | European VAT Number                                                                                     |
     * | Malaysia             | `my_frp`     | Malaysian FRP Number                                                                                    |
     * | Malaysia             | `my_itn`     | Malaysian ITN                                                                                           |
     * | Malaysia             | `my_sst`     | Malaysian SST Number                                                                                    |
     * | Malta                | `eu_vat `    | European VAT Number                                                                                     |
     * | Mexico               | `mx_rfc`     | Mexican RFC Number                                                                                      |
     * | Netherlands          | `eu_vat`     | European VAT Number                                                                                     |
     * | New Zealand          | `nz_gst`     | New Zealand GST Number                                                                                  |
     * | Nigeria              | `ng_tin`     | Nigerian Tax Identification Number                                                                      |
     * | Norway               | `no_vat`     | Norwegian VAT Number                                                                                    |
     * | Norway               | `no_voec`    | Norwegian VAT on e-commerce Number                                                                      |
     * | Oman                 | `om_vat`     | Omani VAT Number                                                                                        |
     * | Peru                 | `pe_ruc`     | Peruvian RUC Number                                                                                     |
     * | Philippines          | `ph_tin `    | Philippines Tax Identification Number                                                                   |
     * | Poland               | `eu_vat`     | European VAT Number                                                                                     |
     * | Portugal             | `eu_vat`     | European VAT Number                                                                                     |
     * | Romania              | `eu_vat`     | European VAT Number                                                                                     |
     * | Romania              | `ro_tin`     | Romanian Tax ID Number                                                                                  |
     * | Russia               | `ru_inn`     | Russian INN                                                                                             |
     * | Russia               | `ru_kpp`     | Russian KPP                                                                                             |
     * | Saudi Arabia         | `sa_vat`     | Saudi Arabia VAT                                                                                        |
     * | Serbia               | `rs_pib`     | Serbian PIB Number                                                                                      |
     * | Singapore            | `sg_gst`     | Singaporean GST                                                                                         |
     * | Singapore            | `sg_uen`     | Singaporean UEN                                                                                         |
     * | Slovakia             | `eu_vat`     | European VAT Number                                                                                     |
     * | Slovenia             | `eu_vat`     | European VAT Number                                                                                     |
     * | Slovenia             | `si_tin`     | Slovenia Tax Number (davčna številka)                                                                   |
     * | South Africa         | `za_vat`     | South African VAT Number                                                                                |
     * | South Korea          | `kr_brn`     | Korean BRN                                                                                              |
     * | Spain                | `es_cif`     | Spanish NIF Number (previously Spanish CIF Number)                                                      |
     * | Spain                | `eu_vat`     | European VAT Number                                                                                     |
     * | Sweden               | `eu_vat`     | European VAT Number                                                                                     |
     * | Switzerland          | `ch_vat`     | Switzerland VAT Number                                                                                  |
     * | Taiwan               | `tw_vat`     | Taiwanese VAT                                                                                           |
     * | Thailand             | `th_vat`     | Thai VAT                                                                                                |
     * | Turkey               | `tr_tin`     | Turkish Tax Identification Number                                                                       |
     * | Ukraine              | `ua_vat`     | Ukrainian VAT                                                                                           |
     * | United Arab Emirates | `ae_trn`     | United Arab Emirates TRN                                                                                |
     * | United Kingdom       | `eu_vat`     | Northern Ireland VAT Number                                                                             |
     * | United Kingdom       | `gb_vat`     | United Kingdom VAT Number                                                                               |
     * | United States        | `us_ein`     | United States EIN                                                                                       |
     * | Uruguay              | `uy_ruc`     | Uruguayan RUC Number                                                                                    |
     * | Venezuela            | `ve_rif`     | Venezuelan RIF Number                                                                                   |
     * | Vietnam              | `vn_tin`     | Vietnamese Tax ID Number                                                                                |
     */
    fun taxId(): Optional<TaxId> = Optional.ofNullable(taxId.getNullable("tax_id"))

    fun autoCollection(): Boolean = autoCollection.getRequired("auto_collection")

    fun emailDelivery(): Boolean = emailDelivery.getRequired("email_delivery")

    fun additionalEmails(): List<String> = additionalEmails.getRequired("additional_emails")

    fun portalUrl(): Optional<String> = Optional.ofNullable(portalUrl.getNullable("portal_url"))

    fun accountingSyncConfiguration(): Optional<AccountingSyncConfiguration> = Optional.ofNullable(accountingSyncConfiguration.getNullable("accounting_sync_configuration"))

    fun reportingConfiguration(): Optional<ReportingConfiguration> = Optional.ofNullable(reportingConfiguration.getNullable("reporting_configuration"))

    /**
     * User specified key-value pairs for the resource. If not present, this defaults
     * to an empty dictionary. Individual keys can be removed by setting the value to
     * `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    @JsonProperty("metadata")
    @ExcludeMissing
    fun _metadata() = metadata

    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /**
     * An optional user-defined ID for this customer resource, used throughout the
     * system as an alias for this Customer. Use this field to identify a customer by
     * an existing identifier in your system.
     */
    @JsonProperty("external_customer_id")
    @ExcludeMissing
    fun _externalCustomerId() = externalCustomerId

    /** The full name of the customer */
    @JsonProperty("name")
    @ExcludeMissing
    fun _name() = name

    /**
     * A valid customer email, to be used for notifications. When Orb triggers payment
     * through a payment gateway, this email will be used for any automatically issued
     * receipts.
     */
    @JsonProperty("email")
    @ExcludeMissing
    fun _email() = email

    /**
     * A timezone identifier from the IANA timezone database, such as
     * "America/Los_Angeles". This "defaults to your account's timezone if not set.
     * This cannot be changed after customer creation.
     */
    @JsonProperty("timezone")
    @ExcludeMissing
    fun _timezone() = timezone

    /**
     * The ID of this customer in an external payments solution, such as Stripe. This
     * is used for creating charges or invoices in the external system via Orb.
     */
    @JsonProperty("payment_provider_id")
    @ExcludeMissing
    fun _paymentProviderId() = paymentProviderId

    /**
     * This is used for creating charges or invoices in an external system via Orb.
     * When not in test mode, the connection must first be configured in the Orb
     * webapp.
     */
    @JsonProperty("payment_provider")
    @ExcludeMissing
    fun _paymentProvider() = paymentProvider

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    @JsonProperty("shipping_address")
    @ExcludeMissing
    fun _shippingAddress() = shippingAddress

    @JsonProperty("billing_address")
    @ExcludeMissing
    fun _billingAddress() = billingAddress

    /** The customer's current balance in their currency. */
    @JsonProperty("balance")
    @ExcludeMissing
    fun _balance() = balance

    @JsonProperty("currency")
    @ExcludeMissing
    fun _currency() = currency

    /**
     * Tax IDs are commonly required to be displayed on customer invoices, which are
     * added to the headers of invoices.
     *
     * ### Supported Tax ID Countries and Types
     *
     * | Country              | Type         | Description                                                                                             |
     * | -------------------- | ------------ | ------------------------------------------------------------------------------------------------------- |
     * | Andorra              | `ad_nrt`     | Andorran NRT Number                                                                                     |
     * | Argentina            | `ar_cuit`    | Argentinian Tax ID Number                                                                               |
     * | Australia            | `au_abn`     | Australian Business Number (AU ABN)                                                                     |
     * | Australia            | `au_arn`     | Australian Taxation Office Reference Number                                                             |
     * | Austria              | `eu_vat`     | European VAT Number                                                                                     |
     * | Bahrain              | `bh_vat`     | Bahraini VAT Number                                                                                     |
     * | Belgium              | `eu_vat`     | European VAT Number                                                                                     |
     * | Bolivia              | `bo_tin`     | Bolivian Tax ID                                                                                         |
     * | Brazil               | `br_cnpj`    | Brazilian CNPJ Number                                                                                   |
     * | Brazil               | `br_cpf`     | Brazilian CPF Number                                                                                    |
     * | Bulgaria             | `bg_uic`     | Bulgaria Unified Identification Code                                                                    |
     * | Bulgaria             | `eu_vat`     | European VAT Number                                                                                     |
     * | Canada               | `ca_bn`      | Canadian BN                                                                                             |
     * | Canada               | `ca_gst_hst` | Canadian GST/HST Number                                                                                 |
     * | Canada               | `ca_pst_bc`  | Canadian PST Number (British Columbia)                                                                  |
     * | Canada               | `ca_pst_mb`  | Canadian PST Number (Manitoba)                                                                          |
     * | Canada               | `ca_pst_sk`  | Canadian PST Number (Saskatchewan)                                                                      |
     * | Canada               | `ca_qst`     | Canadian QST Number (Québec)                                                                            |
     * | Chile                | `cl_tin`     | Chilean TIN                                                                                             |
     * | China                | `cn_tin`     | Chinese Tax ID                                                                                          |
     * | Colombia             | `co_nit`     | Colombian NIT Number                                                                                    |
     * | Costa Rica           | `cr_tin`     | Costa Rican Tax ID                                                                                      |
     * | Croatia              | `eu_vat`     | European VAT Number                                                                                     |
     * | Cyprus               | `eu_vat`     | European VAT Number                                                                                     |
     * | Czech Republic       | `eu_vat`     | European VAT Number                                                                                     |
     * | Denmark              | `eu_vat`     | European VAT Number                                                                                     |
     * | Dominican Republic   | `do_rcn`     | Dominican RCN Number                                                                                    |
     * | Ecuador              | `ec_ruc`     | Ecuadorian RUC Number                                                                                   |
     * | Egypt                | `eg_tin`     | Egyptian Tax Identification Number                                                                      |
     * | El Salvador          | `sv_nit`     | El Salvadorian NIT Number                                                                               |
     * | Estonia              | `eu_vat`     | European VAT Number                                                                                     |
     * | EU                   | `eu_oss_vat` | European One Stop Shop VAT Number for non-Union scheme                                                  |
     * | Finland              | `eu_vat`     | European VAT Number                                                                                     |
     * | France               | `eu_vat`     | European VAT Number                                                                                     |
     * | Georgia              | `ge_vat`     | Georgian VAT                                                                                            |
     * | Germany              | `eu_vat`     | European VAT Number                                                                                     |
     * | Greece               | `eu_vat`     | European VAT Number                                                                                     |
     * | Hong Kong            | `hk_br`      | Hong Kong BR Number                                                                                     |
     * | Hungary              | `eu_vat`     | European VAT Number                                                                                     |
     * | Hungary              | `hu_tin`     | Hungary Tax Number (adószám)                                                                            |
     * | Iceland              | `is_vat`     | Icelandic VAT                                                                                           |
     * | India                | `in_gst`     | Indian GST Number                                                                                       |
     * | Indonesia            | `id_npwp`    | Indonesian NPWP Number                                                                                  |
     * | Ireland              | `eu_vat`     | European VAT Number                                                                                     |
     * | Israel               | `il_vat`     | Israel VAT                                                                                              |
     * | Italy                | `eu_vat`     | European VAT Number                                                                                     |
     * | Japan                | `jp_cn`      | Japanese Corporate Number (_Hōjin Bangō_)                                                               |
     * | Japan                | `jp_rn`      | Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_) |
     * | Japan                | `jp_trn`     | Japanese Tax Registration Number (_Tōroku Bangō_)                                                       |
     * | Kazakhstan           | `kz_bin`     | Kazakhstani Business Identification Number                                                              |
     * | Kenya                | `ke_pin`     | Kenya Revenue Authority Personal Identification Number                                                  |
     * | Latvia               | `eu_vat`     | European VAT Number                                                                                     |
     * | Liechtenstein        | `li_uid`     | Liechtensteinian UID Number                                                                             |
     * | Lithuania            | `eu_vat`     | European VAT Number                                                                                     |
     * | Luxembourg           | `eu_vat`     | European VAT Number                                                                                     |
     * | Malaysia             | `my_frp`     | Malaysian FRP Number                                                                                    |
     * | Malaysia             | `my_itn`     | Malaysian ITN                                                                                           |
     * | Malaysia             | `my_sst`     | Malaysian SST Number                                                                                    |
     * | Malta                | `eu_vat `    | European VAT Number                                                                                     |
     * | Mexico               | `mx_rfc`     | Mexican RFC Number                                                                                      |
     * | Netherlands          | `eu_vat`     | European VAT Number                                                                                     |
     * | New Zealand          | `nz_gst`     | New Zealand GST Number                                                                                  |
     * | Nigeria              | `ng_tin`     | Nigerian Tax Identification Number                                                                      |
     * | Norway               | `no_vat`     | Norwegian VAT Number                                                                                    |
     * | Norway               | `no_voec`    | Norwegian VAT on e-commerce Number                                                                      |
     * | Oman                 | `om_vat`     | Omani VAT Number                                                                                        |
     * | Peru                 | `pe_ruc`     | Peruvian RUC Number                                                                                     |
     * | Philippines          | `ph_tin `    | Philippines Tax Identification Number                                                                   |
     * | Poland               | `eu_vat`     | European VAT Number                                                                                     |
     * | Portugal             | `eu_vat`     | European VAT Number                                                                                     |
     * | Romania              | `eu_vat`     | European VAT Number                                                                                     |
     * | Romania              | `ro_tin`     | Romanian Tax ID Number                                                                                  |
     * | Russia               | `ru_inn`     | Russian INN                                                                                             |
     * | Russia               | `ru_kpp`     | Russian KPP                                                                                             |
     * | Saudi Arabia         | `sa_vat`     | Saudi Arabia VAT                                                                                        |
     * | Serbia               | `rs_pib`     | Serbian PIB Number                                                                                      |
     * | Singapore            | `sg_gst`     | Singaporean GST                                                                                         |
     * | Singapore            | `sg_uen`     | Singaporean UEN                                                                                         |
     * | Slovakia             | `eu_vat`     | European VAT Number                                                                                     |
     * | Slovenia             | `eu_vat`     | European VAT Number                                                                                     |
     * | Slovenia             | `si_tin`     | Slovenia Tax Number (davčna številka)                                                                   |
     * | South Africa         | `za_vat`     | South African VAT Number                                                                                |
     * | South Korea          | `kr_brn`     | Korean BRN                                                                                              |
     * | Spain                | `es_cif`     | Spanish NIF Number (previously Spanish CIF Number)                                                      |
     * | Spain                | `eu_vat`     | European VAT Number                                                                                     |
     * | Sweden               | `eu_vat`     | European VAT Number                                                                                     |
     * | Switzerland          | `ch_vat`     | Switzerland VAT Number                                                                                  |
     * | Taiwan               | `tw_vat`     | Taiwanese VAT                                                                                           |
     * | Thailand             | `th_vat`     | Thai VAT                                                                                                |
     * | Turkey               | `tr_tin`     | Turkish Tax Identification Number                                                                       |
     * | Ukraine              | `ua_vat`     | Ukrainian VAT                                                                                           |
     * | United Arab Emirates | `ae_trn`     | United Arab Emirates TRN                                                                                |
     * | United Kingdom       | `eu_vat`     | Northern Ireland VAT Number                                                                             |
     * | United Kingdom       | `gb_vat`     | United Kingdom VAT Number                                                                               |
     * | United States        | `us_ein`     | United States EIN                                                                                       |
     * | Uruguay              | `uy_ruc`     | Uruguayan RUC Number                                                                                    |
     * | Venezuela            | `ve_rif`     | Venezuelan RIF Number                                                                                   |
     * | Vietnam              | `vn_tin`     | Vietnamese Tax ID Number                                                                                |
     */
    @JsonProperty("tax_id")
    @ExcludeMissing
    fun _taxId() = taxId

    @JsonProperty("auto_collection")
    @ExcludeMissing
    fun _autoCollection() = autoCollection

    @JsonProperty("email_delivery")
    @ExcludeMissing
    fun _emailDelivery() = emailDelivery

    @JsonProperty("additional_emails")
    @ExcludeMissing
    fun _additionalEmails() = additionalEmails

    @JsonProperty("portal_url")
    @ExcludeMissing
    fun _portalUrl() = portalUrl

    @JsonProperty("accounting_sync_configuration")
    @ExcludeMissing
    fun _accountingSyncConfiguration() = accountingSyncConfiguration

    @JsonProperty("reporting_configuration")
    @ExcludeMissing
    fun _reportingConfiguration() = reportingConfiguration

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Customer = apply {
        if (!validated) {
          metadata().validate()
          id()
          externalCustomerId()
          name()
          email()
          timezone()
          paymentProviderId()
          paymentProvider()
          createdAt()
          shippingAddress().map { it.validate() }
          billingAddress().map { it.validate() }
          balance()
          currency()
          taxId().map { it.validate() }
          autoCollection()
          emailDelivery()
          additionalEmails()
          portalUrl()
          accountingSyncConfiguration().map { it.validate() }
          reportingConfiguration().map { it.validate() }
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is Customer &&
          this.metadata == other.metadata &&
          this.id == other.id &&
          this.externalCustomerId == other.externalCustomerId &&
          this.name == other.name &&
          this.email == other.email &&
          this.timezone == other.timezone &&
          this.paymentProviderId == other.paymentProviderId &&
          this.paymentProvider == other.paymentProvider &&
          this.createdAt == other.createdAt &&
          this.shippingAddress == other.shippingAddress &&
          this.billingAddress == other.billingAddress &&
          this.balance == other.balance &&
          this.currency == other.currency &&
          this.taxId == other.taxId &&
          this.autoCollection == other.autoCollection &&
          this.emailDelivery == other.emailDelivery &&
          this.additionalEmails == other.additionalEmails &&
          this.portalUrl == other.portalUrl &&
          this.accountingSyncConfiguration == other.accountingSyncConfiguration &&
          this.reportingConfiguration == other.reportingConfiguration &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            metadata,
            id,
            externalCustomerId,
            name,
            email,
            timezone,
            paymentProviderId,
            paymentProvider,
            createdAt,
            shippingAddress,
            billingAddress,
            balance,
            currency,
            taxId,
            autoCollection,
            emailDelivery,
            additionalEmails,
            portalUrl,
            accountingSyncConfiguration,
            reportingConfiguration,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "Customer{metadata=$metadata, id=$id, externalCustomerId=$externalCustomerId, name=$name, email=$email, timezone=$timezone, paymentProviderId=$paymentProviderId, paymentProvider=$paymentProvider, createdAt=$createdAt, shippingAddress=$shippingAddress, billingAddress=$billingAddress, balance=$balance, currency=$currency, taxId=$taxId, autoCollection=$autoCollection, emailDelivery=$emailDelivery, additionalEmails=$additionalEmails, portalUrl=$portalUrl, accountingSyncConfiguration=$accountingSyncConfiguration, reportingConfiguration=$reportingConfiguration, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var externalCustomerId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var timezone: JsonField<String> = JsonMissing.of()
        private var paymentProviderId: JsonField<String> = JsonMissing.of()
        private var paymentProvider: JsonField<PaymentProvider> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var shippingAddress: JsonField<ShippingAddress> = JsonMissing.of()
        private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
        private var balance: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var taxId: JsonField<TaxId> = JsonMissing.of()
        private var autoCollection: JsonField<Boolean> = JsonMissing.of()
        private var emailDelivery: JsonField<Boolean> = JsonMissing.of()
        private var additionalEmails: JsonField<List<String>> = JsonMissing.of()
        private var portalUrl: JsonField<String> = JsonMissing.of()
        private var accountingSyncConfiguration: JsonField<AccountingSyncConfiguration> = JsonMissing.of()
        private var reportingConfiguration: JsonField<ReportingConfiguration> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customer: Customer) = apply {
            this.metadata = customer.metadata
            this.id = customer.id
            this.externalCustomerId = customer.externalCustomerId
            this.name = customer.name
            this.email = customer.email
            this.timezone = customer.timezone
            this.paymentProviderId = customer.paymentProviderId
            this.paymentProvider = customer.paymentProvider
            this.createdAt = customer.createdAt
            this.shippingAddress = customer.shippingAddress
            this.billingAddress = customer.billingAddress
            this.balance = customer.balance
            this.currency = customer.currency
            this.taxId = customer.taxId
            this.autoCollection = customer.autoCollection
            this.emailDelivery = customer.emailDelivery
            this.additionalEmails = customer.additionalEmails
            this.portalUrl = customer.portalUrl
            this.accountingSyncConfiguration = customer.accountingSyncConfiguration
            this.reportingConfiguration = customer.reportingConfiguration
            additionalProperties(customer.additionalProperties)
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults
         * to an empty dictionary. Individual keys can be removed by setting the value to
         * `null`, and the entire metadata mapping can be cleared by setting `metadata` to
         * `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * User specified key-value pairs for the resource. If not present, this defaults
         * to an empty dictionary. Individual keys can be removed by setting the value to
         * `null`, and the entire metadata mapping can be cleared by setting `metadata` to
         * `null`.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply {
            this.metadata = metadata
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /**
         * An optional user-defined ID for this customer resource, used throughout the
         * system as an alias for this Customer. Use this field to identify a customer by
         * an existing identifier in your system.
         */
        fun externalCustomerId(externalCustomerId: String) = externalCustomerId(JsonField.of(externalCustomerId))

        /**
         * An optional user-defined ID for this customer resource, used throughout the
         * system as an alias for this Customer. Use this field to identify a customer by
         * an existing identifier in your system.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** The full name of the customer */
        fun name(name: String) = name(JsonField.of(name))

        /** The full name of the customer */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply {
            this.name = name
        }

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment
         * through a payment gateway, this email will be used for any automatically issued
         * receipts.
         */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment
         * through a payment gateway, this email will be used for any automatically issued
         * receipts.
         */
        @JsonProperty("email")
        @ExcludeMissing
        fun email(email: JsonField<String>) = apply {
            this.email = email
        }

        /**
         * A timezone identifier from the IANA timezone database, such as
         * "America/Los_Angeles". This "defaults to your account's timezone if not set.
         * This cannot be changed after customer creation.
         */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * A timezone identifier from the IANA timezone database, such as
         * "America/Los_Angeles". This "defaults to your account's timezone if not set.
         * This cannot be changed after customer creation.
         */
        @JsonProperty("timezone")
        @ExcludeMissing
        fun timezone(timezone: JsonField<String>) = apply {
            this.timezone = timezone
        }

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This
         * is used for creating charges or invoices in the external system via Orb.
         */
        fun paymentProviderId(paymentProviderId: String) = paymentProviderId(JsonField.of(paymentProviderId))

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This
         * is used for creating charges or invoices in the external system via Orb.
         */
        @JsonProperty("payment_provider_id")
        @ExcludeMissing
        fun paymentProviderId(paymentProviderId: JsonField<String>) = apply {
            this.paymentProviderId = paymentProviderId
        }

        /**
         * This is used for creating charges or invoices in an external system via Orb.
         * When not in test mode, the connection must first be configured in the Orb
         * webapp.
         */
        fun paymentProvider(paymentProvider: PaymentProvider) = paymentProvider(JsonField.of(paymentProvider))

        /**
         * This is used for creating charges or invoices in an external system via Orb.
         * When not in test mode, the connection must first be configured in the Orb
         * webapp.
         */
        @JsonProperty("payment_provider")
        @ExcludeMissing
        fun paymentProvider(paymentProvider: JsonField<PaymentProvider>) = apply {
            this.paymentProvider = paymentProvider
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        fun shippingAddress(shippingAddress: ShippingAddress) = shippingAddress(JsonField.of(shippingAddress))

        @JsonProperty("shipping_address")
        @ExcludeMissing
        fun shippingAddress(shippingAddress: JsonField<ShippingAddress>) = apply {
            this.shippingAddress = shippingAddress
        }

        fun billingAddress(billingAddress: BillingAddress) = billingAddress(JsonField.of(billingAddress))

        @JsonProperty("billing_address")
        @ExcludeMissing
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
            this.billingAddress = billingAddress
        }

        /** The customer's current balance in their currency. */
        fun balance(balance: String) = balance(JsonField.of(balance))

        /** The customer's current balance in their currency. */
        @JsonProperty("balance")
        @ExcludeMissing
        fun balance(balance: JsonField<String>) = apply {
            this.balance = balance
        }

        fun currency(currency: String) = currency(JsonField.of(currency))

        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply {
            this.currency = currency
        }

        /**
         * Tax IDs are commonly required to be displayed on customer invoices, which are
         * added to the headers of invoices.
         *
         * ### Supported Tax ID Countries and Types
         *
         * | Country              | Type         | Description                                                                                             |
         * | -------------------- | ------------ | ------------------------------------------------------------------------------------------------------- |
         * | Andorra              | `ad_nrt`     | Andorran NRT Number                                                                                     |
         * | Argentina            | `ar_cuit`    | Argentinian Tax ID Number                                                                               |
         * | Australia            | `au_abn`     | Australian Business Number (AU ABN)                                                                     |
         * | Australia            | `au_arn`     | Australian Taxation Office Reference Number                                                             |
         * | Austria              | `eu_vat`     | European VAT Number                                                                                     |
         * | Bahrain              | `bh_vat`     | Bahraini VAT Number                                                                                     |
         * | Belgium              | `eu_vat`     | European VAT Number                                                                                     |
         * | Bolivia              | `bo_tin`     | Bolivian Tax ID                                                                                         |
         * | Brazil               | `br_cnpj`    | Brazilian CNPJ Number                                                                                   |
         * | Brazil               | `br_cpf`     | Brazilian CPF Number                                                                                    |
         * | Bulgaria             | `bg_uic`     | Bulgaria Unified Identification Code                                                                    |
         * | Bulgaria             | `eu_vat`     | European VAT Number                                                                                     |
         * | Canada               | `ca_bn`      | Canadian BN                                                                                             |
         * | Canada               | `ca_gst_hst` | Canadian GST/HST Number                                                                                 |
         * | Canada               | `ca_pst_bc`  | Canadian PST Number (British Columbia)                                                                  |
         * | Canada               | `ca_pst_mb`  | Canadian PST Number (Manitoba)                                                                          |
         * | Canada               | `ca_pst_sk`  | Canadian PST Number (Saskatchewan)                                                                      |
         * | Canada               | `ca_qst`     | Canadian QST Number (Québec)                                                                            |
         * | Chile                | `cl_tin`     | Chilean TIN                                                                                             |
         * | China                | `cn_tin`     | Chinese Tax ID                                                                                          |
         * | Colombia             | `co_nit`     | Colombian NIT Number                                                                                    |
         * | Costa Rica           | `cr_tin`     | Costa Rican Tax ID                                                                                      |
         * | Croatia              | `eu_vat`     | European VAT Number                                                                                     |
         * | Cyprus               | `eu_vat`     | European VAT Number                                                                                     |
         * | Czech Republic       | `eu_vat`     | European VAT Number                                                                                     |
         * | Denmark              | `eu_vat`     | European VAT Number                                                                                     |
         * | Dominican Republic   | `do_rcn`     | Dominican RCN Number                                                                                    |
         * | Ecuador              | `ec_ruc`     | Ecuadorian RUC Number                                                                                   |
         * | Egypt                | `eg_tin`     | Egyptian Tax Identification Number                                                                      |
         * | El Salvador          | `sv_nit`     | El Salvadorian NIT Number                                                                               |
         * | Estonia              | `eu_vat`     | European VAT Number                                                                                     |
         * | EU                   | `eu_oss_vat` | European One Stop Shop VAT Number for non-Union scheme                                                  |
         * | Finland              | `eu_vat`     | European VAT Number                                                                                     |
         * | France               | `eu_vat`     | European VAT Number                                                                                     |
         * | Georgia              | `ge_vat`     | Georgian VAT                                                                                            |
         * | Germany              | `eu_vat`     | European VAT Number                                                                                     |
         * | Greece               | `eu_vat`     | European VAT Number                                                                                     |
         * | Hong Kong            | `hk_br`      | Hong Kong BR Number                                                                                     |
         * | Hungary              | `eu_vat`     | European VAT Number                                                                                     |
         * | Hungary              | `hu_tin`     | Hungary Tax Number (adószám)                                                                            |
         * | Iceland              | `is_vat`     | Icelandic VAT                                                                                           |
         * | India                | `in_gst`     | Indian GST Number                                                                                       |
         * | Indonesia            | `id_npwp`    | Indonesian NPWP Number                                                                                  |
         * | Ireland              | `eu_vat`     | European VAT Number                                                                                     |
         * | Israel               | `il_vat`     | Israel VAT                                                                                              |
         * | Italy                | `eu_vat`     | European VAT Number                                                                                     |
         * | Japan                | `jp_cn`      | Japanese Corporate Number (_Hōjin Bangō_)                                                               |
         * | Japan                | `jp_rn`      | Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_) |
         * | Japan                | `jp_trn`     | Japanese Tax Registration Number (_Tōroku Bangō_)                                                       |
         * | Kazakhstan           | `kz_bin`     | Kazakhstani Business Identification Number                                                              |
         * | Kenya                | `ke_pin`     | Kenya Revenue Authority Personal Identification Number                                                  |
         * | Latvia               | `eu_vat`     | European VAT Number                                                                                     |
         * | Liechtenstein        | `li_uid`     | Liechtensteinian UID Number                                                                             |
         * | Lithuania            | `eu_vat`     | European VAT Number                                                                                     |
         * | Luxembourg           | `eu_vat`     | European VAT Number                                                                                     |
         * | Malaysia             | `my_frp`     | Malaysian FRP Number                                                                                    |
         * | Malaysia             | `my_itn`     | Malaysian ITN                                                                                           |
         * | Malaysia             | `my_sst`     | Malaysian SST Number                                                                                    |
         * | Malta                | `eu_vat `    | European VAT Number                                                                                     |
         * | Mexico               | `mx_rfc`     | Mexican RFC Number                                                                                      |
         * | Netherlands          | `eu_vat`     | European VAT Number                                                                                     |
         * | New Zealand          | `nz_gst`     | New Zealand GST Number                                                                                  |
         * | Nigeria              | `ng_tin`     | Nigerian Tax Identification Number                                                                      |
         * | Norway               | `no_vat`     | Norwegian VAT Number                                                                                    |
         * | Norway               | `no_voec`    | Norwegian VAT on e-commerce Number                                                                      |
         * | Oman                 | `om_vat`     | Omani VAT Number                                                                                        |
         * | Peru                 | `pe_ruc`     | Peruvian RUC Number                                                                                     |
         * | Philippines          | `ph_tin `    | Philippines Tax Identification Number                                                                   |
         * | Poland               | `eu_vat`     | European VAT Number                                                                                     |
         * | Portugal             | `eu_vat`     | European VAT Number                                                                                     |
         * | Romania              | `eu_vat`     | European VAT Number                                                                                     |
         * | Romania              | `ro_tin`     | Romanian Tax ID Number                                                                                  |
         * | Russia               | `ru_inn`     | Russian INN                                                                                             |
         * | Russia               | `ru_kpp`     | Russian KPP                                                                                             |
         * | Saudi Arabia         | `sa_vat`     | Saudi Arabia VAT                                                                                        |
         * | Serbia               | `rs_pib`     | Serbian PIB Number                                                                                      |
         * | Singapore            | `sg_gst`     | Singaporean GST                                                                                         |
         * | Singapore            | `sg_uen`     | Singaporean UEN                                                                                         |
         * | Slovakia             | `eu_vat`     | European VAT Number                                                                                     |
         * | Slovenia             | `eu_vat`     | European VAT Number                                                                                     |
         * | Slovenia             | `si_tin`     | Slovenia Tax Number (davčna številka)                                                                   |
         * | South Africa         | `za_vat`     | South African VAT Number                                                                                |
         * | South Korea          | `kr_brn`     | Korean BRN                                                                                              |
         * | Spain                | `es_cif`     | Spanish NIF Number (previously Spanish CIF Number)                                                      |
         * | Spain                | `eu_vat`     | European VAT Number                                                                                     |
         * | Sweden               | `eu_vat`     | European VAT Number                                                                                     |
         * | Switzerland          | `ch_vat`     | Switzerland VAT Number                                                                                  |
         * | Taiwan               | `tw_vat`     | Taiwanese VAT                                                                                           |
         * | Thailand             | `th_vat`     | Thai VAT                                                                                                |
         * | Turkey               | `tr_tin`     | Turkish Tax Identification Number                                                                       |
         * | Ukraine              | `ua_vat`     | Ukrainian VAT                                                                                           |
         * | United Arab Emirates | `ae_trn`     | United Arab Emirates TRN                                                                                |
         * | United Kingdom       | `eu_vat`     | Northern Ireland VAT Number                                                                             |
         * | United Kingdom       | `gb_vat`     | United Kingdom VAT Number                                                                               |
         * | United States        | `us_ein`     | United States EIN                                                                                       |
         * | Uruguay              | `uy_ruc`     | Uruguayan RUC Number                                                                                    |
         * | Venezuela            | `ve_rif`     | Venezuelan RIF Number                                                                                   |
         * | Vietnam              | `vn_tin`     | Vietnamese Tax ID Number                                                                                |
         */
        fun taxId(taxId: TaxId) = taxId(JsonField.of(taxId))

        /**
         * Tax IDs are commonly required to be displayed on customer invoices, which are
         * added to the headers of invoices.
         *
         * ### Supported Tax ID Countries and Types
         *
         * | Country              | Type         | Description                                                                                             |
         * | -------------------- | ------------ | ------------------------------------------------------------------------------------------------------- |
         * | Andorra              | `ad_nrt`     | Andorran NRT Number                                                                                     |
         * | Argentina            | `ar_cuit`    | Argentinian Tax ID Number                                                                               |
         * | Australia            | `au_abn`     | Australian Business Number (AU ABN)                                                                     |
         * | Australia            | `au_arn`     | Australian Taxation Office Reference Number                                                             |
         * | Austria              | `eu_vat`     | European VAT Number                                                                                     |
         * | Bahrain              | `bh_vat`     | Bahraini VAT Number                                                                                     |
         * | Belgium              | `eu_vat`     | European VAT Number                                                                                     |
         * | Bolivia              | `bo_tin`     | Bolivian Tax ID                                                                                         |
         * | Brazil               | `br_cnpj`    | Brazilian CNPJ Number                                                                                   |
         * | Brazil               | `br_cpf`     | Brazilian CPF Number                                                                                    |
         * | Bulgaria             | `bg_uic`     | Bulgaria Unified Identification Code                                                                    |
         * | Bulgaria             | `eu_vat`     | European VAT Number                                                                                     |
         * | Canada               | `ca_bn`      | Canadian BN                                                                                             |
         * | Canada               | `ca_gst_hst` | Canadian GST/HST Number                                                                                 |
         * | Canada               | `ca_pst_bc`  | Canadian PST Number (British Columbia)                                                                  |
         * | Canada               | `ca_pst_mb`  | Canadian PST Number (Manitoba)                                                                          |
         * | Canada               | `ca_pst_sk`  | Canadian PST Number (Saskatchewan)                                                                      |
         * | Canada               | `ca_qst`     | Canadian QST Number (Québec)                                                                            |
         * | Chile                | `cl_tin`     | Chilean TIN                                                                                             |
         * | China                | `cn_tin`     | Chinese Tax ID                                                                                          |
         * | Colombia             | `co_nit`     | Colombian NIT Number                                                                                    |
         * | Costa Rica           | `cr_tin`     | Costa Rican Tax ID                                                                                      |
         * | Croatia              | `eu_vat`     | European VAT Number                                                                                     |
         * | Cyprus               | `eu_vat`     | European VAT Number                                                                                     |
         * | Czech Republic       | `eu_vat`     | European VAT Number                                                                                     |
         * | Denmark              | `eu_vat`     | European VAT Number                                                                                     |
         * | Dominican Republic   | `do_rcn`     | Dominican RCN Number                                                                                    |
         * | Ecuador              | `ec_ruc`     | Ecuadorian RUC Number                                                                                   |
         * | Egypt                | `eg_tin`     | Egyptian Tax Identification Number                                                                      |
         * | El Salvador          | `sv_nit`     | El Salvadorian NIT Number                                                                               |
         * | Estonia              | `eu_vat`     | European VAT Number                                                                                     |
         * | EU                   | `eu_oss_vat` | European One Stop Shop VAT Number for non-Union scheme                                                  |
         * | Finland              | `eu_vat`     | European VAT Number                                                                                     |
         * | France               | `eu_vat`     | European VAT Number                                                                                     |
         * | Georgia              | `ge_vat`     | Georgian VAT                                                                                            |
         * | Germany              | `eu_vat`     | European VAT Number                                                                                     |
         * | Greece               | `eu_vat`     | European VAT Number                                                                                     |
         * | Hong Kong            | `hk_br`      | Hong Kong BR Number                                                                                     |
         * | Hungary              | `eu_vat`     | European VAT Number                                                                                     |
         * | Hungary              | `hu_tin`     | Hungary Tax Number (adószám)                                                                            |
         * | Iceland              | `is_vat`     | Icelandic VAT                                                                                           |
         * | India                | `in_gst`     | Indian GST Number                                                                                       |
         * | Indonesia            | `id_npwp`    | Indonesian NPWP Number                                                                                  |
         * | Ireland              | `eu_vat`     | European VAT Number                                                                                     |
         * | Israel               | `il_vat`     | Israel VAT                                                                                              |
         * | Italy                | `eu_vat`     | European VAT Number                                                                                     |
         * | Japan                | `jp_cn`      | Japanese Corporate Number (_Hōjin Bangō_)                                                               |
         * | Japan                | `jp_rn`      | Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_) |
         * | Japan                | `jp_trn`     | Japanese Tax Registration Number (_Tōroku Bangō_)                                                       |
         * | Kazakhstan           | `kz_bin`     | Kazakhstani Business Identification Number                                                              |
         * | Kenya                | `ke_pin`     | Kenya Revenue Authority Personal Identification Number                                                  |
         * | Latvia               | `eu_vat`     | European VAT Number                                                                                     |
         * | Liechtenstein        | `li_uid`     | Liechtensteinian UID Number                                                                             |
         * | Lithuania            | `eu_vat`     | European VAT Number                                                                                     |
         * | Luxembourg           | `eu_vat`     | European VAT Number                                                                                     |
         * | Malaysia             | `my_frp`     | Malaysian FRP Number                                                                                    |
         * | Malaysia             | `my_itn`     | Malaysian ITN                                                                                           |
         * | Malaysia             | `my_sst`     | Malaysian SST Number                                                                                    |
         * | Malta                | `eu_vat `    | European VAT Number                                                                                     |
         * | Mexico               | `mx_rfc`     | Mexican RFC Number                                                                                      |
         * | Netherlands          | `eu_vat`     | European VAT Number                                                                                     |
         * | New Zealand          | `nz_gst`     | New Zealand GST Number                                                                                  |
         * | Nigeria              | `ng_tin`     | Nigerian Tax Identification Number                                                                      |
         * | Norway               | `no_vat`     | Norwegian VAT Number                                                                                    |
         * | Norway               | `no_voec`    | Norwegian VAT on e-commerce Number                                                                      |
         * | Oman                 | `om_vat`     | Omani VAT Number                                                                                        |
         * | Peru                 | `pe_ruc`     | Peruvian RUC Number                                                                                     |
         * | Philippines          | `ph_tin `    | Philippines Tax Identification Number                                                                   |
         * | Poland               | `eu_vat`     | European VAT Number                                                                                     |
         * | Portugal             | `eu_vat`     | European VAT Number                                                                                     |
         * | Romania              | `eu_vat`     | European VAT Number                                                                                     |
         * | Romania              | `ro_tin`     | Romanian Tax ID Number                                                                                  |
         * | Russia               | `ru_inn`     | Russian INN                                                                                             |
         * | Russia               | `ru_kpp`     | Russian KPP                                                                                             |
         * | Saudi Arabia         | `sa_vat`     | Saudi Arabia VAT                                                                                        |
         * | Serbia               | `rs_pib`     | Serbian PIB Number                                                                                      |
         * | Singapore            | `sg_gst`     | Singaporean GST                                                                                         |
         * | Singapore            | `sg_uen`     | Singaporean UEN                                                                                         |
         * | Slovakia             | `eu_vat`     | European VAT Number                                                                                     |
         * | Slovenia             | `eu_vat`     | European VAT Number                                                                                     |
         * | Slovenia             | `si_tin`     | Slovenia Tax Number (davčna številka)                                                                   |
         * | South Africa         | `za_vat`     | South African VAT Number                                                                                |
         * | South Korea          | `kr_brn`     | Korean BRN                                                                                              |
         * | Spain                | `es_cif`     | Spanish NIF Number (previously Spanish CIF Number)                                                      |
         * | Spain                | `eu_vat`     | European VAT Number                                                                                     |
         * | Sweden               | `eu_vat`     | European VAT Number                                                                                     |
         * | Switzerland          | `ch_vat`     | Switzerland VAT Number                                                                                  |
         * | Taiwan               | `tw_vat`     | Taiwanese VAT                                                                                           |
         * | Thailand             | `th_vat`     | Thai VAT                                                                                                |
         * | Turkey               | `tr_tin`     | Turkish Tax Identification Number                                                                       |
         * | Ukraine              | `ua_vat`     | Ukrainian VAT                                                                                           |
         * | United Arab Emirates | `ae_trn`     | United Arab Emirates TRN                                                                                |
         * | United Kingdom       | `eu_vat`     | Northern Ireland VAT Number                                                                             |
         * | United Kingdom       | `gb_vat`     | United Kingdom VAT Number                                                                               |
         * | United States        | `us_ein`     | United States EIN                                                                                       |
         * | Uruguay              | `uy_ruc`     | Uruguayan RUC Number                                                                                    |
         * | Venezuela            | `ve_rif`     | Venezuelan RIF Number                                                                                   |
         * | Vietnam              | `vn_tin`     | Vietnamese Tax ID Number                                                                                |
         */
        @JsonProperty("tax_id")
        @ExcludeMissing
        fun taxId(taxId: JsonField<TaxId>) = apply {
            this.taxId = taxId
        }

        fun autoCollection(autoCollection: Boolean) = autoCollection(JsonField.of(autoCollection))

        @JsonProperty("auto_collection")
        @ExcludeMissing
        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            this.autoCollection = autoCollection
        }

        fun emailDelivery(emailDelivery: Boolean) = emailDelivery(JsonField.of(emailDelivery))

        @JsonProperty("email_delivery")
        @ExcludeMissing
        fun emailDelivery(emailDelivery: JsonField<Boolean>) = apply {
            this.emailDelivery = emailDelivery
        }

        fun additionalEmails(additionalEmails: List<String>) = additionalEmails(JsonField.of(additionalEmails))

        @JsonProperty("additional_emails")
        @ExcludeMissing
        fun additionalEmails(additionalEmails: JsonField<List<String>>) = apply {
            this.additionalEmails = additionalEmails
        }

        fun portalUrl(portalUrl: String) = portalUrl(JsonField.of(portalUrl))

        @JsonProperty("portal_url")
        @ExcludeMissing
        fun portalUrl(portalUrl: JsonField<String>) = apply {
            this.portalUrl = portalUrl
        }

        fun accountingSyncConfiguration(accountingSyncConfiguration: AccountingSyncConfiguration) = accountingSyncConfiguration(JsonField.of(accountingSyncConfiguration))

        @JsonProperty("accounting_sync_configuration")
        @ExcludeMissing
        fun accountingSyncConfiguration(accountingSyncConfiguration: JsonField<AccountingSyncConfiguration>) = apply {
            this.accountingSyncConfiguration = accountingSyncConfiguration
        }

        fun reportingConfiguration(reportingConfiguration: ReportingConfiguration) = reportingConfiguration(JsonField.of(reportingConfiguration))

        @JsonProperty("reporting_configuration")
        @ExcludeMissing
        fun reportingConfiguration(reportingConfiguration: JsonField<ReportingConfiguration>) = apply {
            this.reportingConfiguration = reportingConfiguration
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Customer = Customer(
            metadata,
            id,
            externalCustomerId,
            name,
            email,
            timezone,
            paymentProviderId,
            paymentProvider,
            createdAt,
            shippingAddress,
            billingAddress,
            balance,
            currency,
            taxId,
            autoCollection,
            emailDelivery,
            additionalEmails.map { it.toUnmodifiable() },
            portalUrl,
            accountingSyncConfiguration,
            reportingConfiguration,
            additionalProperties.toUnmodifiable(),
        )
    }

    @JsonDeserialize(builder = BillingAddress.Builder::class)
    @NoAutoDetect
    class BillingAddress private constructor(
      private val line1: JsonField<String>,
      private val line2: JsonField<String>,
      private val city: JsonField<String>,
      private val state: JsonField<String>,
      private val postalCode: JsonField<String>,
      private val country: JsonField<String>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

        fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

        fun postalCode(): Optional<String> = Optional.ofNullable(postalCode.getNullable("postal_code"))

        fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

        @JsonProperty("line1")
        @ExcludeMissing
        fun _line1() = line1

        @JsonProperty("line2")
        @ExcludeMissing
        fun _line2() = line2

        @JsonProperty("city")
        @ExcludeMissing
        fun _city() = city

        @JsonProperty("state")
        @ExcludeMissing
        fun _state() = state

        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode() = postalCode

        @JsonProperty("country")
        @ExcludeMissing
        fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): BillingAddress = apply {
            if (!validated) {
              line1()
              line2()
              city()
              state()
              postalCode()
              country()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is BillingAddress &&
              this.line1 == other.line1 &&
              this.line2 == other.line2 &&
              this.city == other.city &&
              this.state == other.state &&
              this.postalCode == other.postalCode &&
              this.country == other.country &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                line1,
                line2,
                city,
                state,
                postalCode,
                country,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "BillingAddress{line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingAddress: BillingAddress) = apply {
                this.line1 = billingAddress.line1
                this.line2 = billingAddress.line2
                this.city = billingAddress.city
                this.state = billingAddress.state
                this.postalCode = billingAddress.postalCode
                this.country = billingAddress.country
                additionalProperties(billingAddress.additionalProperties)
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply {
                this.line1 = line1
            }

            fun line2(line2: String) = line2(JsonField.of(line2))

            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply {
                this.line2 = line2
            }

            fun city(city: String) = city(JsonField.of(city))

            @JsonProperty("city")
            @ExcludeMissing
            fun city(city: JsonField<String>) = apply {
                this.city = city
            }

            fun state(state: String) = state(JsonField.of(state))

            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<String>) = apply {
                this.state = state
            }

            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply {
                this.postalCode = postalCode
            }

            fun country(country: String) = country(JsonField.of(country))

            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply {
                this.country = country
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): BillingAddress = BillingAddress(
                line1,
                line2,
                city,
                state,
                postalCode,
                country,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults
     * to an empty dictionary. Individual keys can be removed by setting the value to
     * `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata private constructor(private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Metadata &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }

    class PaymentProvider @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is PaymentProvider &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val QUICKBOOKS = PaymentProvider(JsonField.of("quickbooks"))

            @JvmField val BILL_COM = PaymentProvider(JsonField.of("bill.com"))

            @JvmField val STRIPE_CHARGE = PaymentProvider(JsonField.of("stripe_charge"))

            @JvmField val STRIPE_INVOICE = PaymentProvider(JsonField.of("stripe_invoice"))

            @JvmField val NETSUITE = PaymentProvider(JsonField.of("netsuite"))

            @JvmStatic fun of(value: String) = PaymentProvider(JsonField.of(value))
        }

        enum class Known {
            QUICKBOOKS,
            BILL_COM,
            STRIPE_CHARGE,
            STRIPE_INVOICE,
            NETSUITE,
        }

        enum class Value {
            QUICKBOOKS,
            BILL_COM,
            STRIPE_CHARGE,
            STRIPE_INVOICE,
            NETSUITE,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            QUICKBOOKS -> Value.QUICKBOOKS
            BILL_COM -> Value.BILL_COM
            STRIPE_CHARGE -> Value.STRIPE_CHARGE
            STRIPE_INVOICE -> Value.STRIPE_INVOICE
            NETSUITE -> Value.NETSUITE
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            QUICKBOOKS -> Known.QUICKBOOKS
            BILL_COM -> Known.BILL_COM
            STRIPE_CHARGE -> Known.STRIPE_CHARGE
            STRIPE_INVOICE -> Known.STRIPE_INVOICE
            NETSUITE -> Known.NETSUITE
            else -> throw OrbInvalidDataException("Unknown PaymentProvider: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = ShippingAddress.Builder::class)
    @NoAutoDetect
    class ShippingAddress private constructor(
      private val line1: JsonField<String>,
      private val line2: JsonField<String>,
      private val city: JsonField<String>,
      private val state: JsonField<String>,
      private val postalCode: JsonField<String>,
      private val country: JsonField<String>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

        fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

        fun postalCode(): Optional<String> = Optional.ofNullable(postalCode.getNullable("postal_code"))

        fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

        @JsonProperty("line1")
        @ExcludeMissing
        fun _line1() = line1

        @JsonProperty("line2")
        @ExcludeMissing
        fun _line2() = line2

        @JsonProperty("city")
        @ExcludeMissing
        fun _city() = city

        @JsonProperty("state")
        @ExcludeMissing
        fun _state() = state

        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode() = postalCode

        @JsonProperty("country")
        @ExcludeMissing
        fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ShippingAddress = apply {
            if (!validated) {
              line1()
              line2()
              city()
              state()
              postalCode()
              country()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ShippingAddress &&
              this.line1 == other.line1 &&
              this.line2 == other.line2 &&
              this.city == other.city &&
              this.state == other.state &&
              this.postalCode == other.postalCode &&
              this.country == other.country &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                line1,
                line2,
                city,
                state,
                postalCode,
                country,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "ShippingAddress{line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(shippingAddress: ShippingAddress) = apply {
                this.line1 = shippingAddress.line1
                this.line2 = shippingAddress.line2
                this.city = shippingAddress.city
                this.state = shippingAddress.state
                this.postalCode = shippingAddress.postalCode
                this.country = shippingAddress.country
                additionalProperties(shippingAddress.additionalProperties)
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply {
                this.line1 = line1
            }

            fun line2(line2: String) = line2(JsonField.of(line2))

            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply {
                this.line2 = line2
            }

            fun city(city: String) = city(JsonField.of(city))

            @JsonProperty("city")
            @ExcludeMissing
            fun city(city: JsonField<String>) = apply {
                this.city = city
            }

            fun state(state: String) = state(JsonField.of(state))

            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<String>) = apply {
                this.state = state
            }

            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply {
                this.postalCode = postalCode
            }

            fun country(country: String) = country(JsonField.of(country))

            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply {
                this.country = country
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ShippingAddress = ShippingAddress(
                line1,
                line2,
                city,
                state,
                postalCode,
                country,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    /**
     * Tax IDs are commonly required to be displayed on customer invoices, which are
     * added to the headers of invoices.
     *
     * ### Supported Tax ID Countries and Types
     *
     * | Country              | Type         | Description                                                                                             |
     * | -------------------- | ------------ | ------------------------------------------------------------------------------------------------------- |
     * | Andorra              | `ad_nrt`     | Andorran NRT Number                                                                                     |
     * | Argentina            | `ar_cuit`    | Argentinian Tax ID Number                                                                               |
     * | Australia            | `au_abn`     | Australian Business Number (AU ABN)                                                                     |
     * | Australia            | `au_arn`     | Australian Taxation Office Reference Number                                                             |
     * | Austria              | `eu_vat`     | European VAT Number                                                                                     |
     * | Bahrain              | `bh_vat`     | Bahraini VAT Number                                                                                     |
     * | Belgium              | `eu_vat`     | European VAT Number                                                                                     |
     * | Bolivia              | `bo_tin`     | Bolivian Tax ID                                                                                         |
     * | Brazil               | `br_cnpj`    | Brazilian CNPJ Number                                                                                   |
     * | Brazil               | `br_cpf`     | Brazilian CPF Number                                                                                    |
     * | Bulgaria             | `bg_uic`     | Bulgaria Unified Identification Code                                                                    |
     * | Bulgaria             | `eu_vat`     | European VAT Number                                                                                     |
     * | Canada               | `ca_bn`      | Canadian BN                                                                                             |
     * | Canada               | `ca_gst_hst` | Canadian GST/HST Number                                                                                 |
     * | Canada               | `ca_pst_bc`  | Canadian PST Number (British Columbia)                                                                  |
     * | Canada               | `ca_pst_mb`  | Canadian PST Number (Manitoba)                                                                          |
     * | Canada               | `ca_pst_sk`  | Canadian PST Number (Saskatchewan)                                                                      |
     * | Canada               | `ca_qst`     | Canadian QST Number (Québec)                                                                            |
     * | Chile                | `cl_tin`     | Chilean TIN                                                                                             |
     * | China                | `cn_tin`     | Chinese Tax ID                                                                                          |
     * | Colombia             | `co_nit`     | Colombian NIT Number                                                                                    |
     * | Costa Rica           | `cr_tin`     | Costa Rican Tax ID                                                                                      |
     * | Croatia              | `eu_vat`     | European VAT Number                                                                                     |
     * | Cyprus               | `eu_vat`     | European VAT Number                                                                                     |
     * | Czech Republic       | `eu_vat`     | European VAT Number                                                                                     |
     * | Denmark              | `eu_vat`     | European VAT Number                                                                                     |
     * | Dominican Republic   | `do_rcn`     | Dominican RCN Number                                                                                    |
     * | Ecuador              | `ec_ruc`     | Ecuadorian RUC Number                                                                                   |
     * | Egypt                | `eg_tin`     | Egyptian Tax Identification Number                                                                      |
     * | El Salvador          | `sv_nit`     | El Salvadorian NIT Number                                                                               |
     * | Estonia              | `eu_vat`     | European VAT Number                                                                                     |
     * | EU                   | `eu_oss_vat` | European One Stop Shop VAT Number for non-Union scheme                                                  |
     * | Finland              | `eu_vat`     | European VAT Number                                                                                     |
     * | France               | `eu_vat`     | European VAT Number                                                                                     |
     * | Georgia              | `ge_vat`     | Georgian VAT                                                                                            |
     * | Germany              | `eu_vat`     | European VAT Number                                                                                     |
     * | Greece               | `eu_vat`     | European VAT Number                                                                                     |
     * | Hong Kong            | `hk_br`      | Hong Kong BR Number                                                                                     |
     * | Hungary              | `eu_vat`     | European VAT Number                                                                                     |
     * | Hungary              | `hu_tin`     | Hungary Tax Number (adószám)                                                                            |
     * | Iceland              | `is_vat`     | Icelandic VAT                                                                                           |
     * | India                | `in_gst`     | Indian GST Number                                                                                       |
     * | Indonesia            | `id_npwp`    | Indonesian NPWP Number                                                                                  |
     * | Ireland              | `eu_vat`     | European VAT Number                                                                                     |
     * | Israel               | `il_vat`     | Israel VAT                                                                                              |
     * | Italy                | `eu_vat`     | European VAT Number                                                                                     |
     * | Japan                | `jp_cn`      | Japanese Corporate Number (_Hōjin Bangō_)                                                               |
     * | Japan                | `jp_rn`      | Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_) |
     * | Japan                | `jp_trn`     | Japanese Tax Registration Number (_Tōroku Bangō_)                                                       |
     * | Kazakhstan           | `kz_bin`     | Kazakhstani Business Identification Number                                                              |
     * | Kenya                | `ke_pin`     | Kenya Revenue Authority Personal Identification Number                                                  |
     * | Latvia               | `eu_vat`     | European VAT Number                                                                                     |
     * | Liechtenstein        | `li_uid`     | Liechtensteinian UID Number                                                                             |
     * | Lithuania            | `eu_vat`     | European VAT Number                                                                                     |
     * | Luxembourg           | `eu_vat`     | European VAT Number                                                                                     |
     * | Malaysia             | `my_frp`     | Malaysian FRP Number                                                                                    |
     * | Malaysia             | `my_itn`     | Malaysian ITN                                                                                           |
     * | Malaysia             | `my_sst`     | Malaysian SST Number                                                                                    |
     * | Malta                | `eu_vat `    | European VAT Number                                                                                     |
     * | Mexico               | `mx_rfc`     | Mexican RFC Number                                                                                      |
     * | Netherlands          | `eu_vat`     | European VAT Number                                                                                     |
     * | New Zealand          | `nz_gst`     | New Zealand GST Number                                                                                  |
     * | Nigeria              | `ng_tin`     | Nigerian Tax Identification Number                                                                      |
     * | Norway               | `no_vat`     | Norwegian VAT Number                                                                                    |
     * | Norway               | `no_voec`    | Norwegian VAT on e-commerce Number                                                                      |
     * | Oman                 | `om_vat`     | Omani VAT Number                                                                                        |
     * | Peru                 | `pe_ruc`     | Peruvian RUC Number                                                                                     |
     * | Philippines          | `ph_tin `    | Philippines Tax Identification Number                                                                   |
     * | Poland               | `eu_vat`     | European VAT Number                                                                                     |
     * | Portugal             | `eu_vat`     | European VAT Number                                                                                     |
     * | Romania              | `eu_vat`     | European VAT Number                                                                                     |
     * | Romania              | `ro_tin`     | Romanian Tax ID Number                                                                                  |
     * | Russia               | `ru_inn`     | Russian INN                                                                                             |
     * | Russia               | `ru_kpp`     | Russian KPP                                                                                             |
     * | Saudi Arabia         | `sa_vat`     | Saudi Arabia VAT                                                                                        |
     * | Serbia               | `rs_pib`     | Serbian PIB Number                                                                                      |
     * | Singapore            | `sg_gst`     | Singaporean GST                                                                                         |
     * | Singapore            | `sg_uen`     | Singaporean UEN                                                                                         |
     * | Slovakia             | `eu_vat`     | European VAT Number                                                                                     |
     * | Slovenia             | `eu_vat`     | European VAT Number                                                                                     |
     * | Slovenia             | `si_tin`     | Slovenia Tax Number (davčna številka)                                                                   |
     * | South Africa         | `za_vat`     | South African VAT Number                                                                                |
     * | South Korea          | `kr_brn`     | Korean BRN                                                                                              |
     * | Spain                | `es_cif`     | Spanish NIF Number (previously Spanish CIF Number)                                                      |
     * | Spain                | `eu_vat`     | European VAT Number                                                                                     |
     * | Sweden               | `eu_vat`     | European VAT Number                                                                                     |
     * | Switzerland          | `ch_vat`     | Switzerland VAT Number                                                                                  |
     * | Taiwan               | `tw_vat`     | Taiwanese VAT                                                                                           |
     * | Thailand             | `th_vat`     | Thai VAT                                                                                                |
     * | Turkey               | `tr_tin`     | Turkish Tax Identification Number                                                                       |
     * | Ukraine              | `ua_vat`     | Ukrainian VAT                                                                                           |
     * | United Arab Emirates | `ae_trn`     | United Arab Emirates TRN                                                                                |
     * | United Kingdom       | `eu_vat`     | Northern Ireland VAT Number                                                                             |
     * | United Kingdom       | `gb_vat`     | United Kingdom VAT Number                                                                               |
     * | United States        | `us_ein`     | United States EIN                                                                                       |
     * | Uruguay              | `uy_ruc`     | Uruguayan RUC Number                                                                                    |
     * | Venezuela            | `ve_rif`     | Venezuelan RIF Number                                                                                   |
     * | Vietnam              | `vn_tin`     | Vietnamese Tax ID Number                                                                                |
     */
    @JsonDeserialize(builder = TaxId.Builder::class)
    @NoAutoDetect
    class TaxId private constructor(
      private val country: JsonField<Country>,
      private val type: JsonField<Type>,
      private val value: JsonField<String>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun country(): Country = country.getRequired("country")

        fun type(): Type = type.getRequired("type")

        fun value(): String = value.getRequired("value")

        @JsonProperty("country")
        @ExcludeMissing
        fun _country() = country

        @JsonProperty("type")
        @ExcludeMissing
        fun _type() = type

        @JsonProperty("value")
        @ExcludeMissing
        fun _value() = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TaxId = apply {
            if (!validated) {
              country()
              type()
              value()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is TaxId &&
              this.country == other.country &&
              this.type == other.type &&
              this.value == other.value &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                country,
                type,
                value,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "TaxId{country=$country, type=$type, value=$value, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var country: JsonField<Country> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(taxId: TaxId) = apply {
                this.country = taxId.country
                this.type = taxId.type
                this.value = taxId.value
                additionalProperties(taxId.additionalProperties)
            }

            fun country(country: Country) = country(JsonField.of(country))

            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<Country>) = apply {
                this.country = country
            }

            fun type(type: Type) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply {
                this.type = type
            }

            fun value(value: String) = value(JsonField.of(value))

            @JsonProperty("value")
            @ExcludeMissing
            fun value(value: JsonField<String>) = apply {
                this.value = value
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): TaxId = TaxId(
                country,
                type,
                value,
                additionalProperties.toUnmodifiable(),
            )
        }

        class Country @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Country &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AD = Country(JsonField.of("AD"))

                @JvmField val AE = Country(JsonField.of("AE"))

                @JvmField val AR = Country(JsonField.of("AR"))

                @JvmField val AT = Country(JsonField.of("AT"))

                @JvmField val AU = Country(JsonField.of("AU"))

                @JvmField val BE = Country(JsonField.of("BE"))

                @JvmField val BG = Country(JsonField.of("BG"))

                @JvmField val BH = Country(JsonField.of("BH"))

                @JvmField val BO = Country(JsonField.of("BO"))

                @JvmField val BR = Country(JsonField.of("BR"))

                @JvmField val CA = Country(JsonField.of("CA"))

                @JvmField val CH = Country(JsonField.of("CH"))

                @JvmField val CL = Country(JsonField.of("CL"))

                @JvmField val CN = Country(JsonField.of("CN"))

                @JvmField val CO = Country(JsonField.of("CO"))

                @JvmField val CR = Country(JsonField.of("CR"))

                @JvmField val CY = Country(JsonField.of("CY"))

                @JvmField val CZ = Country(JsonField.of("CZ"))

                @JvmField val DE = Country(JsonField.of("DE"))

                @JvmField val DK = Country(JsonField.of("DK"))

                @JvmField val EE = Country(JsonField.of("EE"))

                @JvmField val DO = Country(JsonField.of("DO"))

                @JvmField val EC = Country(JsonField.of("EC"))

                @JvmField val EG = Country(JsonField.of("EG"))

                @JvmField val ES = Country(JsonField.of("ES"))

                @JvmField val EU = Country(JsonField.of("EU"))

                @JvmField val FI = Country(JsonField.of("FI"))

                @JvmField val FR = Country(JsonField.of("FR"))

                @JvmField val GB = Country(JsonField.of("GB"))

                @JvmField val GE = Country(JsonField.of("GE"))

                @JvmField val GR = Country(JsonField.of("GR"))

                @JvmField val HK = Country(JsonField.of("HK"))

                @JvmField val HR = Country(JsonField.of("HR"))

                @JvmField val HU = Country(JsonField.of("HU"))

                @JvmField val ID = Country(JsonField.of("ID"))

                @JvmField val IE = Country(JsonField.of("IE"))

                @JvmField val IL = Country(JsonField.of("IL"))

                @JvmField val IN = Country(JsonField.of("IN"))

                @JvmField val IS = Country(JsonField.of("IS"))

                @JvmField val IT = Country(JsonField.of("IT"))

                @JvmField val JP = Country(JsonField.of("JP"))

                @JvmField val KE = Country(JsonField.of("KE"))

                @JvmField val KR = Country(JsonField.of("KR"))

                @JvmField val KZ = Country(JsonField.of("KZ"))

                @JvmField val LI = Country(JsonField.of("LI"))

                @JvmField val LT = Country(JsonField.of("LT"))

                @JvmField val LU = Country(JsonField.of("LU"))

                @JvmField val LV = Country(JsonField.of("LV"))

                @JvmField val MT = Country(JsonField.of("MT"))

                @JvmField val MX = Country(JsonField.of("MX"))

                @JvmField val MY = Country(JsonField.of("MY"))

                @JvmField val NG = Country(JsonField.of("NG"))

                @JvmField val NL = Country(JsonField.of("NL"))

                @JvmField val NO = Country(JsonField.of("NO"))

                @JvmField val NZ = Country(JsonField.of("NZ"))

                @JvmField val OM = Country(JsonField.of("OM"))

                @JvmField val PE = Country(JsonField.of("PE"))

                @JvmField val PH = Country(JsonField.of("PH"))

                @JvmField val PL = Country(JsonField.of("PL"))

                @JvmField val PT = Country(JsonField.of("PT"))

                @JvmField val RO = Country(JsonField.of("RO"))

                @JvmField val RS = Country(JsonField.of("RS"))

                @JvmField val RU = Country(JsonField.of("RU"))

                @JvmField val SA = Country(JsonField.of("SA"))

                @JvmField val SE = Country(JsonField.of("SE"))

                @JvmField val SG = Country(JsonField.of("SG"))

                @JvmField val SI = Country(JsonField.of("SI"))

                @JvmField val SK = Country(JsonField.of("SK"))

                @JvmField val SV = Country(JsonField.of("SV"))

                @JvmField val TH = Country(JsonField.of("TH"))

                @JvmField val TR = Country(JsonField.of("TR"))

                @JvmField val TW = Country(JsonField.of("TW"))

                @JvmField val UA = Country(JsonField.of("UA"))

                @JvmField val US = Country(JsonField.of("US"))

                @JvmField val UY = Country(JsonField.of("UY"))

                @JvmField val VE = Country(JsonField.of("VE"))

                @JvmField val VN = Country(JsonField.of("VN"))

                @JvmField val ZA = Country(JsonField.of("ZA"))

                @JvmStatic fun of(value: String) = Country(JsonField.of(value))
            }

            enum class Known {
                AD,
                AE,
                AR,
                AT,
                AU,
                BE,
                BG,
                BH,
                BO,
                BR,
                CA,
                CH,
                CL,
                CN,
                CO,
                CR,
                CY,
                CZ,
                DE,
                DK,
                EE,
                DO,
                EC,
                EG,
                ES,
                EU,
                FI,
                FR,
                GB,
                GE,
                GR,
                HK,
                HR,
                HU,
                ID,
                IE,
                IL,
                IN,
                IS,
                IT,
                JP,
                KE,
                KR,
                KZ,
                LI,
                LT,
                LU,
                LV,
                MT,
                MX,
                MY,
                NG,
                NL,
                NO,
                NZ,
                OM,
                PE,
                PH,
                PL,
                PT,
                RO,
                RS,
                RU,
                SA,
                SE,
                SG,
                SI,
                SK,
                SV,
                TH,
                TR,
                TW,
                UA,
                US,
                UY,
                VE,
                VN,
                ZA,
            }

            enum class Value {
                AD,
                AE,
                AR,
                AT,
                AU,
                BE,
                BG,
                BH,
                BO,
                BR,
                CA,
                CH,
                CL,
                CN,
                CO,
                CR,
                CY,
                CZ,
                DE,
                DK,
                EE,
                DO,
                EC,
                EG,
                ES,
                EU,
                FI,
                FR,
                GB,
                GE,
                GR,
                HK,
                HR,
                HU,
                ID,
                IE,
                IL,
                IN,
                IS,
                IT,
                JP,
                KE,
                KR,
                KZ,
                LI,
                LT,
                LU,
                LV,
                MT,
                MX,
                MY,
                NG,
                NL,
                NO,
                NZ,
                OM,
                PE,
                PH,
                PL,
                PT,
                RO,
                RS,
                RU,
                SA,
                SE,
                SG,
                SI,
                SK,
                SV,
                TH,
                TR,
                TW,
                UA,
                US,
                UY,
                VE,
                VN,
                ZA,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                AD -> Value.AD
                AE -> Value.AE
                AR -> Value.AR
                AT -> Value.AT
                AU -> Value.AU
                BE -> Value.BE
                BG -> Value.BG
                BH -> Value.BH
                BO -> Value.BO
                BR -> Value.BR
                CA -> Value.CA
                CH -> Value.CH
                CL -> Value.CL
                CN -> Value.CN
                CO -> Value.CO
                CR -> Value.CR
                CY -> Value.CY
                CZ -> Value.CZ
                DE -> Value.DE
                DK -> Value.DK
                EE -> Value.EE
                DO -> Value.DO
                EC -> Value.EC
                EG -> Value.EG
                ES -> Value.ES
                EU -> Value.EU
                FI -> Value.FI
                FR -> Value.FR
                GB -> Value.GB
                GE -> Value.GE
                GR -> Value.GR
                HK -> Value.HK
                HR -> Value.HR
                HU -> Value.HU
                ID -> Value.ID
                IE -> Value.IE
                IL -> Value.IL
                IN -> Value.IN
                IS -> Value.IS
                IT -> Value.IT
                JP -> Value.JP
                KE -> Value.KE
                KR -> Value.KR
                KZ -> Value.KZ
                LI -> Value.LI
                LT -> Value.LT
                LU -> Value.LU
                LV -> Value.LV
                MT -> Value.MT
                MX -> Value.MX
                MY -> Value.MY
                NG -> Value.NG
                NL -> Value.NL
                NO -> Value.NO
                NZ -> Value.NZ
                OM -> Value.OM
                PE -> Value.PE
                PH -> Value.PH
                PL -> Value.PL
                PT -> Value.PT
                RO -> Value.RO
                RS -> Value.RS
                RU -> Value.RU
                SA -> Value.SA
                SE -> Value.SE
                SG -> Value.SG
                SI -> Value.SI
                SK -> Value.SK
                SV -> Value.SV
                TH -> Value.TH
                TR -> Value.TR
                TW -> Value.TW
                UA -> Value.UA
                US -> Value.US
                UY -> Value.UY
                VE -> Value.VE
                VN -> Value.VN
                ZA -> Value.ZA
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                AD -> Known.AD
                AE -> Known.AE
                AR -> Known.AR
                AT -> Known.AT
                AU -> Known.AU
                BE -> Known.BE
                BG -> Known.BG
                BH -> Known.BH
                BO -> Known.BO
                BR -> Known.BR
                CA -> Known.CA
                CH -> Known.CH
                CL -> Known.CL
                CN -> Known.CN
                CO -> Known.CO
                CR -> Known.CR
                CY -> Known.CY
                CZ -> Known.CZ
                DE -> Known.DE
                DK -> Known.DK
                EE -> Known.EE
                DO -> Known.DO
                EC -> Known.EC
                EG -> Known.EG
                ES -> Known.ES
                EU -> Known.EU
                FI -> Known.FI
                FR -> Known.FR
                GB -> Known.GB
                GE -> Known.GE
                GR -> Known.GR
                HK -> Known.HK
                HR -> Known.HR
                HU -> Known.HU
                ID -> Known.ID
                IE -> Known.IE
                IL -> Known.IL
                IN -> Known.IN
                IS -> Known.IS
                IT -> Known.IT
                JP -> Known.JP
                KE -> Known.KE
                KR -> Known.KR
                KZ -> Known.KZ
                LI -> Known.LI
                LT -> Known.LT
                LU -> Known.LU
                LV -> Known.LV
                MT -> Known.MT
                MX -> Known.MX
                MY -> Known.MY
                NG -> Known.NG
                NL -> Known.NL
                NO -> Known.NO
                NZ -> Known.NZ
                OM -> Known.OM
                PE -> Known.PE
                PH -> Known.PH
                PL -> Known.PL
                PT -> Known.PT
                RO -> Known.RO
                RS -> Known.RS
                RU -> Known.RU
                SA -> Known.SA
                SE -> Known.SE
                SG -> Known.SG
                SI -> Known.SI
                SK -> Known.SK
                SV -> Known.SV
                TH -> Known.TH
                TR -> Known.TR
                TW -> Known.TW
                UA -> Known.UA
                US -> Known.US
                UY -> Known.UY
                VE -> Known.VE
                VN -> Known.VN
                ZA -> Known.ZA
                else -> throw OrbInvalidDataException("Unknown Country: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is Type &&
                  this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AD_NRT = Type(JsonField.of("ad_nrt"))

                @JvmField val AE_TRN = Type(JsonField.of("ae_trn"))

                @JvmField val AR_CUIT = Type(JsonField.of("ar_cuit"))

                @JvmField val EU_VAT = Type(JsonField.of("eu_vat"))

                @JvmField val AU_ABN = Type(JsonField.of("au_abn"))

                @JvmField val AU_ARN = Type(JsonField.of("au_arn"))

                @JvmField val BG_UIC = Type(JsonField.of("bg_uic"))

                @JvmField val BH_VAT = Type(JsonField.of("bh_vat"))

                @JvmField val BO_TIN = Type(JsonField.of("bo_tin"))

                @JvmField val BR_CNPJ = Type(JsonField.of("br_cnpj"))

                @JvmField val BR_CPF = Type(JsonField.of("br_cpf"))

                @JvmField val CA_BN = Type(JsonField.of("ca_bn"))

                @JvmField val CA_GST_HST = Type(JsonField.of("ca_gst_hst"))

                @JvmField val CA_PST_BC = Type(JsonField.of("ca_pst_bc"))

                @JvmField val CA_PST_MB = Type(JsonField.of("ca_pst_mb"))

                @JvmField val CA_PST_SK = Type(JsonField.of("ca_pst_sk"))

                @JvmField val CA_QST = Type(JsonField.of("ca_qst"))

                @JvmField val CH_VAT = Type(JsonField.of("ch_vat"))

                @JvmField val CL_TIN = Type(JsonField.of("cl_tin"))

                @JvmField val CN_TIN = Type(JsonField.of("cn_tin"))

                @JvmField val CO_NIT = Type(JsonField.of("co_nit"))

                @JvmField val CR_TIN = Type(JsonField.of("cr_tin"))

                @JvmField val DO_RCN = Type(JsonField.of("do_rcn"))

                @JvmField val EC_RUC = Type(JsonField.of("ec_ruc"))

                @JvmField val EG_TIN = Type(JsonField.of("eg_tin"))

                @JvmField val ES_CIF = Type(JsonField.of("es_cif"))

                @JvmField val EU_OSS_VAT = Type(JsonField.of("eu_oss_vat"))

                @JvmField val GB_VAT = Type(JsonField.of("gb_vat"))

                @JvmField val GE_VAT = Type(JsonField.of("ge_vat"))

                @JvmField val HK_BR = Type(JsonField.of("hk_br"))

                @JvmField val HU_TIN = Type(JsonField.of("hu_tin"))

                @JvmField val ID_NPWP = Type(JsonField.of("id_npwp"))

                @JvmField val IL_VAT = Type(JsonField.of("il_vat"))

                @JvmField val IN_GST = Type(JsonField.of("in_gst"))

                @JvmField val IS_VAT = Type(JsonField.of("is_vat"))

                @JvmField val JP_CN = Type(JsonField.of("jp_cn"))

                @JvmField val JP_RN = Type(JsonField.of("jp_rn"))

                @JvmField val JP_TRN = Type(JsonField.of("jp_trn"))

                @JvmField val KE_PIN = Type(JsonField.of("ke_pin"))

                @JvmField val KR_BRN = Type(JsonField.of("kr_brn"))

                @JvmField val KZ_BIN = Type(JsonField.of("kz_bin"))

                @JvmField val LI_UID = Type(JsonField.of("li_uid"))

                @JvmField val MX_RFC = Type(JsonField.of("mx_rfc"))

                @JvmField val MY_FRP = Type(JsonField.of("my_frp"))

                @JvmField val MY_ITN = Type(JsonField.of("my_itn"))

                @JvmField val MY_SST = Type(JsonField.of("my_sst"))

                @JvmField val NG_TIN = Type(JsonField.of("ng_tin"))

                @JvmField val NO_VAT = Type(JsonField.of("no_vat"))

                @JvmField val NO_VOEC = Type(JsonField.of("no_voec"))

                @JvmField val NZ_GST = Type(JsonField.of("nz_gst"))

                @JvmField val OM_VAT = Type(JsonField.of("om_vat"))

                @JvmField val PE_RUC = Type(JsonField.of("pe_ruc"))

                @JvmField val PH_TIN = Type(JsonField.of("ph_tin"))

                @JvmField val RO_TIN = Type(JsonField.of("ro_tin"))

                @JvmField val RS_PIB = Type(JsonField.of("rs_pib"))

                @JvmField val RU_INN = Type(JsonField.of("ru_inn"))

                @JvmField val RU_KPP = Type(JsonField.of("ru_kpp"))

                @JvmField val SA_VAT = Type(JsonField.of("sa_vat"))

                @JvmField val SG_GST = Type(JsonField.of("sg_gst"))

                @JvmField val SG_UEN = Type(JsonField.of("sg_uen"))

                @JvmField val SI_TIN = Type(JsonField.of("si_tin"))

                @JvmField val SV_NIT = Type(JsonField.of("sv_nit"))

                @JvmField val TH_VAT = Type(JsonField.of("th_vat"))

                @JvmField val TR_TIN = Type(JsonField.of("tr_tin"))

                @JvmField val TW_VAT = Type(JsonField.of("tw_vat"))

                @JvmField val UA_VAT = Type(JsonField.of("ua_vat"))

                @JvmField val US_EIN = Type(JsonField.of("us_ein"))

                @JvmField val UY_RUC = Type(JsonField.of("uy_ruc"))

                @JvmField val VE_RIF = Type(JsonField.of("ve_rif"))

                @JvmField val VN_TIN = Type(JsonField.of("vn_tin"))

                @JvmField val ZA_VAT = Type(JsonField.of("za_vat"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                AD_NRT,
                AE_TRN,
                AR_CUIT,
                EU_VAT,
                AU_ABN,
                AU_ARN,
                BG_UIC,
                BH_VAT,
                BO_TIN,
                BR_CNPJ,
                BR_CPF,
                CA_BN,
                CA_GST_HST,
                CA_PST_BC,
                CA_PST_MB,
                CA_PST_SK,
                CA_QST,
                CH_VAT,
                CL_TIN,
                CN_TIN,
                CO_NIT,
                CR_TIN,
                DO_RCN,
                EC_RUC,
                EG_TIN,
                ES_CIF,
                EU_OSS_VAT,
                GB_VAT,
                GE_VAT,
                HK_BR,
                HU_TIN,
                ID_NPWP,
                IL_VAT,
                IN_GST,
                IS_VAT,
                JP_CN,
                JP_RN,
                JP_TRN,
                KE_PIN,
                KR_BRN,
                KZ_BIN,
                LI_UID,
                MX_RFC,
                MY_FRP,
                MY_ITN,
                MY_SST,
                NG_TIN,
                NO_VAT,
                NO_VOEC,
                NZ_GST,
                OM_VAT,
                PE_RUC,
                PH_TIN,
                RO_TIN,
                RS_PIB,
                RU_INN,
                RU_KPP,
                SA_VAT,
                SG_GST,
                SG_UEN,
                SI_TIN,
                SV_NIT,
                TH_VAT,
                TR_TIN,
                TW_VAT,
                UA_VAT,
                US_EIN,
                UY_RUC,
                VE_RIF,
                VN_TIN,
                ZA_VAT,
            }

            enum class Value {
                AD_NRT,
                AE_TRN,
                AR_CUIT,
                EU_VAT,
                AU_ABN,
                AU_ARN,
                BG_UIC,
                BH_VAT,
                BO_TIN,
                BR_CNPJ,
                BR_CPF,
                CA_BN,
                CA_GST_HST,
                CA_PST_BC,
                CA_PST_MB,
                CA_PST_SK,
                CA_QST,
                CH_VAT,
                CL_TIN,
                CN_TIN,
                CO_NIT,
                CR_TIN,
                DO_RCN,
                EC_RUC,
                EG_TIN,
                ES_CIF,
                EU_OSS_VAT,
                GB_VAT,
                GE_VAT,
                HK_BR,
                HU_TIN,
                ID_NPWP,
                IL_VAT,
                IN_GST,
                IS_VAT,
                JP_CN,
                JP_RN,
                JP_TRN,
                KE_PIN,
                KR_BRN,
                KZ_BIN,
                LI_UID,
                MX_RFC,
                MY_FRP,
                MY_ITN,
                MY_SST,
                NG_TIN,
                NO_VAT,
                NO_VOEC,
                NZ_GST,
                OM_VAT,
                PE_RUC,
                PH_TIN,
                RO_TIN,
                RS_PIB,
                RU_INN,
                RU_KPP,
                SA_VAT,
                SG_GST,
                SG_UEN,
                SI_TIN,
                SV_NIT,
                TH_VAT,
                TR_TIN,
                TW_VAT,
                UA_VAT,
                US_EIN,
                UY_RUC,
                VE_RIF,
                VN_TIN,
                ZA_VAT,
                _UNKNOWN,
            }

            fun value(): Value = when (this) {
                AD_NRT -> Value.AD_NRT
                AE_TRN -> Value.AE_TRN
                AR_CUIT -> Value.AR_CUIT
                EU_VAT -> Value.EU_VAT
                AU_ABN -> Value.AU_ABN
                AU_ARN -> Value.AU_ARN
                BG_UIC -> Value.BG_UIC
                BH_VAT -> Value.BH_VAT
                BO_TIN -> Value.BO_TIN
                BR_CNPJ -> Value.BR_CNPJ
                BR_CPF -> Value.BR_CPF
                CA_BN -> Value.CA_BN
                CA_GST_HST -> Value.CA_GST_HST
                CA_PST_BC -> Value.CA_PST_BC
                CA_PST_MB -> Value.CA_PST_MB
                CA_PST_SK -> Value.CA_PST_SK
                CA_QST -> Value.CA_QST
                CH_VAT -> Value.CH_VAT
                CL_TIN -> Value.CL_TIN
                CN_TIN -> Value.CN_TIN
                CO_NIT -> Value.CO_NIT
                CR_TIN -> Value.CR_TIN
                DO_RCN -> Value.DO_RCN
                EC_RUC -> Value.EC_RUC
                EG_TIN -> Value.EG_TIN
                ES_CIF -> Value.ES_CIF
                EU_OSS_VAT -> Value.EU_OSS_VAT
                GB_VAT -> Value.GB_VAT
                GE_VAT -> Value.GE_VAT
                HK_BR -> Value.HK_BR
                HU_TIN -> Value.HU_TIN
                ID_NPWP -> Value.ID_NPWP
                IL_VAT -> Value.IL_VAT
                IN_GST -> Value.IN_GST
                IS_VAT -> Value.IS_VAT
                JP_CN -> Value.JP_CN
                JP_RN -> Value.JP_RN
                JP_TRN -> Value.JP_TRN
                KE_PIN -> Value.KE_PIN
                KR_BRN -> Value.KR_BRN
                KZ_BIN -> Value.KZ_BIN
                LI_UID -> Value.LI_UID
                MX_RFC -> Value.MX_RFC
                MY_FRP -> Value.MY_FRP
                MY_ITN -> Value.MY_ITN
                MY_SST -> Value.MY_SST
                NG_TIN -> Value.NG_TIN
                NO_VAT -> Value.NO_VAT
                NO_VOEC -> Value.NO_VOEC
                NZ_GST -> Value.NZ_GST
                OM_VAT -> Value.OM_VAT
                PE_RUC -> Value.PE_RUC
                PH_TIN -> Value.PH_TIN
                RO_TIN -> Value.RO_TIN
                RS_PIB -> Value.RS_PIB
                RU_INN -> Value.RU_INN
                RU_KPP -> Value.RU_KPP
                SA_VAT -> Value.SA_VAT
                SG_GST -> Value.SG_GST
                SG_UEN -> Value.SG_UEN
                SI_TIN -> Value.SI_TIN
                SV_NIT -> Value.SV_NIT
                TH_VAT -> Value.TH_VAT
                TR_TIN -> Value.TR_TIN
                TW_VAT -> Value.TW_VAT
                UA_VAT -> Value.UA_VAT
                US_EIN -> Value.US_EIN
                UY_RUC -> Value.UY_RUC
                VE_RIF -> Value.VE_RIF
                VN_TIN -> Value.VN_TIN
                ZA_VAT -> Value.ZA_VAT
                else -> Value._UNKNOWN
            }

            fun known(): Known = when (this) {
                AD_NRT -> Known.AD_NRT
                AE_TRN -> Known.AE_TRN
                AR_CUIT -> Known.AR_CUIT
                EU_VAT -> Known.EU_VAT
                AU_ABN -> Known.AU_ABN
                AU_ARN -> Known.AU_ARN
                BG_UIC -> Known.BG_UIC
                BH_VAT -> Known.BH_VAT
                BO_TIN -> Known.BO_TIN
                BR_CNPJ -> Known.BR_CNPJ
                BR_CPF -> Known.BR_CPF
                CA_BN -> Known.CA_BN
                CA_GST_HST -> Known.CA_GST_HST
                CA_PST_BC -> Known.CA_PST_BC
                CA_PST_MB -> Known.CA_PST_MB
                CA_PST_SK -> Known.CA_PST_SK
                CA_QST -> Known.CA_QST
                CH_VAT -> Known.CH_VAT
                CL_TIN -> Known.CL_TIN
                CN_TIN -> Known.CN_TIN
                CO_NIT -> Known.CO_NIT
                CR_TIN -> Known.CR_TIN
                DO_RCN -> Known.DO_RCN
                EC_RUC -> Known.EC_RUC
                EG_TIN -> Known.EG_TIN
                ES_CIF -> Known.ES_CIF
                EU_OSS_VAT -> Known.EU_OSS_VAT
                GB_VAT -> Known.GB_VAT
                GE_VAT -> Known.GE_VAT
                HK_BR -> Known.HK_BR
                HU_TIN -> Known.HU_TIN
                ID_NPWP -> Known.ID_NPWP
                IL_VAT -> Known.IL_VAT
                IN_GST -> Known.IN_GST
                IS_VAT -> Known.IS_VAT
                JP_CN -> Known.JP_CN
                JP_RN -> Known.JP_RN
                JP_TRN -> Known.JP_TRN
                KE_PIN -> Known.KE_PIN
                KR_BRN -> Known.KR_BRN
                KZ_BIN -> Known.KZ_BIN
                LI_UID -> Known.LI_UID
                MX_RFC -> Known.MX_RFC
                MY_FRP -> Known.MY_FRP
                MY_ITN -> Known.MY_ITN
                MY_SST -> Known.MY_SST
                NG_TIN -> Known.NG_TIN
                NO_VAT -> Known.NO_VAT
                NO_VOEC -> Known.NO_VOEC
                NZ_GST -> Known.NZ_GST
                OM_VAT -> Known.OM_VAT
                PE_RUC -> Known.PE_RUC
                PH_TIN -> Known.PH_TIN
                RO_TIN -> Known.RO_TIN
                RS_PIB -> Known.RS_PIB
                RU_INN -> Known.RU_INN
                RU_KPP -> Known.RU_KPP
                SA_VAT -> Known.SA_VAT
                SG_GST -> Known.SG_GST
                SG_UEN -> Known.SG_UEN
                SI_TIN -> Known.SI_TIN
                SV_NIT -> Known.SV_NIT
                TH_VAT -> Known.TH_VAT
                TR_TIN -> Known.TR_TIN
                TW_VAT -> Known.TW_VAT
                UA_VAT -> Known.UA_VAT
                US_EIN -> Known.US_EIN
                UY_RUC -> Known.UY_RUC
                VE_RIF -> Known.VE_RIF
                VN_TIN -> Known.VN_TIN
                ZA_VAT -> Known.ZA_VAT
                else -> throw OrbInvalidDataException("Unknown Type: $value")
            }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = AccountingSyncConfiguration.Builder::class)
    @NoAutoDetect
    class AccountingSyncConfiguration private constructor(private val excluded: JsonField<Boolean>, private val accountingProviders: JsonField<List<AccountingProvider>>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun excluded(): Boolean = excluded.getRequired("excluded")

        fun accountingProviders(): List<AccountingProvider> = accountingProviders.getRequired("accounting_providers")

        @JsonProperty("excluded")
        @ExcludeMissing
        fun _excluded() = excluded

        @JsonProperty("accounting_providers")
        @ExcludeMissing
        fun _accountingProviders() = accountingProviders

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AccountingSyncConfiguration = apply {
            if (!validated) {
              excluded()
              accountingProviders().forEach { it.validate() }
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is AccountingSyncConfiguration &&
              this.excluded == other.excluded &&
              this.accountingProviders == other.accountingProviders &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                excluded,
                accountingProviders,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "AccountingSyncConfiguration{excluded=$excluded, accountingProviders=$accountingProviders, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var excluded: JsonField<Boolean> = JsonMissing.of()
            private var accountingProviders: JsonField<List<AccountingProvider>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountingSyncConfiguration: AccountingSyncConfiguration) = apply {
                this.excluded = accountingSyncConfiguration.excluded
                this.accountingProviders = accountingSyncConfiguration.accountingProviders
                additionalProperties(accountingSyncConfiguration.additionalProperties)
            }

            fun excluded(excluded: Boolean) = excluded(JsonField.of(excluded))

            @JsonProperty("excluded")
            @ExcludeMissing
            fun excluded(excluded: JsonField<Boolean>) = apply {
                this.excluded = excluded
            }

            fun accountingProviders(accountingProviders: List<AccountingProvider>) = accountingProviders(JsonField.of(accountingProviders))

            @JsonProperty("accounting_providers")
            @ExcludeMissing
            fun accountingProviders(accountingProviders: JsonField<List<AccountingProvider>>) = apply {
                this.accountingProviders = accountingProviders
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): AccountingSyncConfiguration = AccountingSyncConfiguration(
                excluded,
                accountingProviders.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
        }

        @JsonDeserialize(builder = AccountingProvider.Builder::class)
        @NoAutoDetect
        class AccountingProvider private constructor(private val providerType: JsonField<ProviderType>, private val externalProviderId: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun providerType(): ProviderType = providerType.getRequired("provider_type")

            fun externalProviderId(): Optional<String> = Optional.ofNullable(externalProviderId.getNullable("external_provider_id"))

            @JsonProperty("provider_type")
            @ExcludeMissing
            fun _providerType() = providerType

            @JsonProperty("external_provider_id")
            @ExcludeMissing
            fun _externalProviderId() = externalProviderId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AccountingProvider = apply {
                if (!validated) {
                  providerType()
                  externalProviderId()
                  validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return other is AccountingProvider &&
                  this.providerType == other.providerType &&
                  this.externalProviderId == other.externalProviderId &&
                  this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
              if (hashCode == 0) {
                hashCode = Objects.hash(
                    providerType,
                    externalProviderId,
                    additionalProperties,
                )
              }
              return hashCode
            }

            override fun toString() = "AccountingProvider{providerType=$providerType, externalProviderId=$externalProviderId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic
                fun builder() = Builder()
            }

            class Builder {

                private var providerType: JsonField<ProviderType> = JsonMissing.of()
                private var externalProviderId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accountingProvider: AccountingProvider) = apply {
                    this.providerType = accountingProvider.providerType
                    this.externalProviderId = accountingProvider.externalProviderId
                    additionalProperties(accountingProvider.additionalProperties)
                }

                fun providerType(providerType: ProviderType) = providerType(JsonField.of(providerType))

                @JsonProperty("provider_type")
                @ExcludeMissing
                fun providerType(providerType: JsonField<ProviderType>) = apply {
                    this.providerType = providerType
                }

                fun externalProviderId(externalProviderId: String) = externalProviderId(JsonField.of(externalProviderId))

                @JsonProperty("external_provider_id")
                @ExcludeMissing
                fun externalProviderId(externalProviderId: JsonField<String>) = apply {
                    this.externalProviderId = externalProviderId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

                fun build(): AccountingProvider = AccountingProvider(
                    providerType,
                    externalProviderId,
                    additionalProperties.toUnmodifiable(),
                )
            }

            class ProviderType @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue
                fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return other is ProviderType &&
                      this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val QUICKBOOKS = ProviderType(JsonField.of("quickbooks"))

                    @JvmField val NETSUITE = ProviderType(JsonField.of("netsuite"))

                    @JvmStatic fun of(value: String) = ProviderType(JsonField.of(value))
                }

                enum class Known {
                    QUICKBOOKS,
                    NETSUITE,
                }

                enum class Value {
                    QUICKBOOKS,
                    NETSUITE,
                    _UNKNOWN,
                }

                fun value(): Value = when (this) {
                    QUICKBOOKS -> Value.QUICKBOOKS
                    NETSUITE -> Value.NETSUITE
                    else -> Value._UNKNOWN
                }

                fun known(): Known = when (this) {
                    QUICKBOOKS -> Known.QUICKBOOKS
                    NETSUITE -> Known.NETSUITE
                    else -> throw OrbInvalidDataException("Unknown ProviderType: $value")
                }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }

    @JsonDeserialize(builder = ReportingConfiguration.Builder::class)
    @NoAutoDetect
    class ReportingConfiguration private constructor(private val exempt: JsonField<Boolean>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun exempt(): Boolean = exempt.getRequired("exempt")

        @JsonProperty("exempt")
        @ExcludeMissing
        fun _exempt() = exempt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ReportingConfiguration = apply {
            if (!validated) {
              exempt()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ReportingConfiguration &&
              this.exempt == other.exempt &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(exempt, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "ReportingConfiguration{exempt=$exempt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var exempt: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reportingConfiguration: ReportingConfiguration) = apply {
                this.exempt = reportingConfiguration.exempt
                additionalProperties(reportingConfiguration.additionalProperties)
            }

            fun exempt(exempt: Boolean) = exempt(JsonField.of(exempt))

            @JsonProperty("exempt")
            @ExcludeMissing
            fun exempt(exempt: JsonField<Boolean>) = apply {
                this.exempt = exempt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ReportingConfiguration = ReportingConfiguration(exempt, additionalProperties.toUnmodifiable())
        }
    }
}
