// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A customer is a buyer of your products, and the other party to the billing relationship.
 *
 * In Orb, customers are assigned system generated identifiers automatically, but it's often
 * desirable to have these match existing identifiers in your system. To avoid having to denormalize
 * Orb ID information, you can pass in an `external_customer_id` with your own identifier. See
 * [Customer ID Aliases](/events-and-metrics/customer-aliases) for further information about how
 * these aliases work in Orb.
 *
 * In addition to having an identifier in your system, a customer may exist in a payment provider
 * solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum field to
 * express this mapping.
 *
 * A customer also has a timezone (from the standard
 * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
 * timezone. See [Timezone localization](/essentials/timezones) for information on what this
 * timezone parameter influences within Orb.
 */
class Customer
private constructor(
    private val id: JsonField<String>,
    private val additionalEmails: JsonField<List<String>>,
    private val autoCollection: JsonField<Boolean>,
    private val balance: JsonField<String>,
    private val billingAddress: JsonField<Address>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val email: JsonField<String>,
    private val emailDelivery: JsonField<Boolean>,
    private val exemptFromAutomatedTax: JsonField<Boolean>,
    private val externalCustomerId: JsonField<String>,
    private val hierarchy: JsonField<Hierarchy>,
    private val metadata: JsonField<Metadata>,
    private val name: JsonField<String>,
    private val paymentProvider: JsonField<PaymentProvider>,
    private val paymentProviderId: JsonField<String>,
    private val portalUrl: JsonField<String>,
    private val shippingAddress: JsonField<Address>,
    private val taxId: JsonField<CustomerTaxId>,
    private val timezone: JsonField<String>,
    private val accountingSyncConfiguration: JsonField<AccountingSyncConfiguration>,
    private val reportingConfiguration: JsonField<ReportingConfiguration>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("additional_emails")
        @ExcludeMissing
        additionalEmails: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("auto_collection")
        @ExcludeMissing
        autoCollection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("balance") @ExcludeMissing balance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_address")
        @ExcludeMissing
        billingAddress: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email_delivery")
        @ExcludeMissing
        emailDelivery: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("exempt_from_automated_tax")
        @ExcludeMissing
        exemptFromAutomatedTax: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        externalCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hierarchy")
        @ExcludeMissing
        hierarchy: JsonField<Hierarchy> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_provider")
        @ExcludeMissing
        paymentProvider: JsonField<PaymentProvider> = JsonMissing.of(),
        @JsonProperty("payment_provider_id")
        @ExcludeMissing
        paymentProviderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("portal_url") @ExcludeMissing portalUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipping_address")
        @ExcludeMissing
        shippingAddress: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<CustomerTaxId> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accounting_sync_configuration")
        @ExcludeMissing
        accountingSyncConfiguration: JsonField<AccountingSyncConfiguration> = JsonMissing.of(),
        @JsonProperty("reporting_configuration")
        @ExcludeMissing
        reportingConfiguration: JsonField<ReportingConfiguration> = JsonMissing.of(),
    ) : this(
        id,
        additionalEmails,
        autoCollection,
        balance,
        billingAddress,
        createdAt,
        currency,
        email,
        emailDelivery,
        exemptFromAutomatedTax,
        externalCustomerId,
        hierarchy,
        metadata,
        name,
        paymentProvider,
        paymentProviderId,
        portalUrl,
        shippingAddress,
        taxId,
        timezone,
        accountingSyncConfiguration,
        reportingConfiguration,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun additionalEmails(): List<String> = additionalEmails.getRequired("additional_emails")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun autoCollection(): Boolean = autoCollection.getRequired("auto_collection")

    /**
     * The customer's current balance in their currency.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun balance(): String = balance.getRequired("balance")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun billingAddress(): Optional<Address> = billingAddress.getOptional("billing_address")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * A valid customer email, to be used for notifications. When Orb triggers payment through a
     * payment gateway, this email will be used for any automatically issued receipts.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailDelivery(): Boolean = emailDelivery.getRequired("email_delivery")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun exemptFromAutomatedTax(): Optional<Boolean> =
        exemptFromAutomatedTax.getOptional("exempt_from_automated_tax")

    /**
     * An optional user-defined ID for this customer resource, used throughout the system as an
     * alias for this Customer. Use this field to identify a customer by an existing identifier in
     * your system.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalCustomerId(): Optional<String> =
        externalCustomerId.getOptional("external_customer_id")

    /**
     * The hierarchical relationships for this customer.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hierarchy(): Hierarchy = hierarchy.getRequired("hierarchy")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * The full name of the customer
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * This is used for creating charges or invoices in an external system via Orb. When not in test
     * mode, the connection must first be configured in the Orb webapp.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paymentProvider(): Optional<PaymentProvider> =
        paymentProvider.getOptional("payment_provider")

    /**
     * The ID of this customer in an external payments solution, such as Stripe. This is used for
     * creating charges or invoices in the external system via Orb.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paymentProviderId(): Optional<String> = paymentProviderId.getOptional("payment_provider_id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun portalUrl(): Optional<String> = portalUrl.getOptional("portal_url")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun shippingAddress(): Optional<Address> = shippingAddress.getOptional("shipping_address")

    /**
     * Tax IDs are commonly required to be displayed on customer invoices, which are added to the
     * headers of invoices.
     *
     * ### Supported Tax ID Countries and Types
     * |Country             |Type        |Description                                                                                            |
     * |--------------------|------------|-------------------------------------------------------------------------------------------------------|
     * |Andorra             |`ad_nrt`    |Andorran NRT Number                                                                                    |
     * |Argentina           |`ar_cuit`   |Argentinian Tax ID Number                                                                              |
     * |Australia           |`au_abn`    |Australian Business Number (AU ABN)                                                                    |
     * |Australia           |`au_arn`    |Australian Taxation Office Reference Number                                                            |
     * |Austria             |`eu_vat`    |European VAT Number                                                                                    |
     * |Bahrain             |`bh_vat`    |Bahraini VAT Number                                                                                    |
     * |Belgium             |`eu_vat`    |European VAT Number                                                                                    |
     * |Bolivia             |`bo_tin`    |Bolivian Tax ID                                                                                        |
     * |Brazil              |`br_cnpj`   |Brazilian CNPJ Number                                                                                  |
     * |Brazil              |`br_cpf`    |Brazilian CPF Number                                                                                   |
     * |Bulgaria            |`bg_uic`    |Bulgaria Unified Identification Code                                                                   |
     * |Bulgaria            |`eu_vat`    |European VAT Number                                                                                    |
     * |Canada              |`ca_bn`     |Canadian BN                                                                                            |
     * |Canada              |`ca_gst_hst`|Canadian GST/HST Number                                                                                |
     * |Canada              |`ca_pst_bc` |Canadian PST Number (British Columbia)                                                                 |
     * |Canada              |`ca_pst_mb` |Canadian PST Number (Manitoba)                                                                         |
     * |Canada              |`ca_pst_sk` |Canadian PST Number (Saskatchewan)                                                                     |
     * |Canada              |`ca_qst`    |Canadian QST Number (Québec)                                                                           |
     * |Chile               |`cl_tin`    |Chilean TIN                                                                                            |
     * |China               |`cn_tin`    |Chinese Tax ID                                                                                         |
     * |Colombia            |`co_nit`    |Colombian NIT Number                                                                                   |
     * |Costa Rica          |`cr_tin`    |Costa Rican Tax ID                                                                                     |
     * |Croatia             |`eu_vat`    |European VAT Number                                                                                    |
     * |Cyprus              |`eu_vat`    |European VAT Number                                                                                    |
     * |Czech Republic      |`eu_vat`    |European VAT Number                                                                                    |
     * |Denmark             |`eu_vat`    |European VAT Number                                                                                    |
     * |Dominican Republic  |`do_rcn`    |Dominican RCN Number                                                                                   |
     * |Ecuador             |`ec_ruc`    |Ecuadorian RUC Number                                                                                  |
     * |Egypt               |`eg_tin`    |Egyptian Tax Identification Number                                                                     |
     * |El Salvador         |`sv_nit`    |El Salvadorian NIT Number                                                                              |
     * |Estonia             |`eu_vat`    |European VAT Number                                                                                    |
     * |EU                  |`eu_oss_vat`|European One Stop Shop VAT Number for non-Union scheme                                                 |
     * |Finland             |`eu_vat`    |European VAT Number                                                                                    |
     * |France              |`eu_vat`    |European VAT Number                                                                                    |
     * |Georgia             |`ge_vat`    |Georgian VAT                                                                                           |
     * |Germany             |`eu_vat`    |European VAT Number                                                                                    |
     * |Greece              |`eu_vat`    |European VAT Number                                                                                    |
     * |Hong Kong           |`hk_br`     |Hong Kong BR Number                                                                                    |
     * |Hungary             |`eu_vat`    |European VAT Number                                                                                    |
     * |Hungary             |`hu_tin`    |Hungary Tax Number (adószám)                                                                           |
     * |Iceland             |`is_vat`    |Icelandic VAT                                                                                          |
     * |India               |`in_gst`    |Indian GST Number                                                                                      |
     * |Indonesia           |`id_npwp`   |Indonesian NPWP Number                                                                                 |
     * |Ireland             |`eu_vat`    |European VAT Number                                                                                    |
     * |Israel              |`il_vat`    |Israel VAT                                                                                             |
     * |Italy               |`eu_vat`    |European VAT Number                                                                                    |
     * |Japan               |`jp_cn`     |Japanese Corporate Number (_Hōjin Bangō_)                                                              |
     * |Japan               |`jp_rn`     |Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_)|
     * |Japan               |`jp_trn`    |Japanese Tax Registration Number (_Tōroku Bangō_)                                                      |
     * |Kazakhstan          |`kz_bin`    |Kazakhstani Business Identification Number                                                             |
     * |Kenya               |`ke_pin`    |Kenya Revenue Authority Personal Identification Number                                                 |
     * |Latvia              |`eu_vat`    |European VAT Number                                                                                    |
     * |Liechtenstein       |`li_uid`    |Liechtensteinian UID Number                                                                            |
     * |Lithuania           |`eu_vat`    |European VAT Number                                                                                    |
     * |Luxembourg          |`eu_vat`    |European VAT Number                                                                                    |
     * |Malaysia            |`my_frp`    |Malaysian FRP Number                                                                                   |
     * |Malaysia            |`my_itn`    |Malaysian ITN                                                                                          |
     * |Malaysia            |`my_sst`    |Malaysian SST Number                                                                                   |
     * |Malta               |`eu_vat `   |European VAT Number                                                                                    |
     * |Mexico              |`mx_rfc`    |Mexican RFC Number                                                                                     |
     * |Netherlands         |`eu_vat`    |European VAT Number                                                                                    |
     * |New Zealand         |`nz_gst`    |New Zealand GST Number                                                                                 |
     * |Nigeria             |`ng_tin`    |Nigerian Tax Identification Number                                                                     |
     * |Norway              |`no_vat`    |Norwegian VAT Number                                                                                   |
     * |Norway              |`no_voec`   |Norwegian VAT on e-commerce Number                                                                     |
     * |Oman                |`om_vat`    |Omani VAT Number                                                                                       |
     * |Peru                |`pe_ruc`    |Peruvian RUC Number                                                                                    |
     * |Philippines         |`ph_tin   ` |Philippines Tax Identification Number                                                                  |
     * |Poland              |`eu_vat`    |European VAT Number                                                                                    |
     * |Portugal            |`eu_vat`    |European VAT Number                                                                                    |
     * |Romania             |`eu_vat`    |European VAT Number                                                                                    |
     * |Romania             |`ro_tin`    |Romanian Tax ID Number                                                                                 |
     * |Russia              |`ru_inn`    |Russian INN                                                                                            |
     * |Russia              |`ru_kpp`    |Russian KPP                                                                                            |
     * |Saudi Arabia        |`sa_vat`    |Saudi Arabia VAT                                                                                       |
     * |Serbia              |`rs_pib`    |Serbian PIB Number                                                                                     |
     * |Singapore           |`sg_gst`    |Singaporean GST                                                                                        |
     * |Singapore           |`sg_uen`    |Singaporean UEN                                                                                        |
     * |Slovakia            |`eu_vat`    |European VAT Number                                                                                    |
     * |Slovenia            |`eu_vat`    |European VAT Number                                                                                    |
     * |Slovenia            |`si_tin`    |Slovenia Tax Number (davčna številka)                                                                  |
     * |South Africa        |`za_vat`    |South African VAT Number                                                                               |
     * |South Korea         |`kr_brn`    |Korean BRN                                                                                             |
     * |Spain               |`es_cif`    |Spanish NIF Number (previously Spanish CIF Number)                                                     |
     * |Spain               |`eu_vat`    |European VAT Number                                                                                    |
     * |Sweden              |`eu_vat`    |European VAT Number                                                                                    |
     * |Switzerland         |`ch_vat`    |Switzerland VAT Number                                                                                 |
     * |Taiwan              |`tw_vat`    |Taiwanese VAT                                                                                          |
     * |Thailand            |`th_vat`    |Thai VAT                                                                                               |
     * |Turkey              |`tr_tin`    |Turkish Tax Identification Number                                                                      |
     * |Ukraine             |`ua_vat`    |Ukrainian VAT                                                                                          |
     * |United Arab Emirates|`ae_trn`    |United Arab Emirates TRN                                                                               |
     * |United Kingdom      |`eu_vat`    |Northern Ireland VAT Number                                                                            |
     * |United Kingdom      |`gb_vat`    |United Kingdom VAT Number                                                                              |
     * |United States       |`us_ein`    |United States EIN                                                                                      |
     * |Uruguay             |`uy_ruc`    |Uruguayan RUC Number                                                                                   |
     * |Venezuela           |`ve_rif`    |Venezuelan RIF Number                                                                                  |
     * |Vietnam             |`vn_tin`    |Vietnamese Tax ID Number                                                                               |
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun taxId(): Optional<CustomerTaxId> = taxId.getOptional("tax_id")

    /**
     * A timezone identifier from the IANA timezone database, such as "America/Los_Angeles". This
     * "defaults to your account's timezone if not set. This cannot be changed after customer
     * creation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timezone(): String = timezone.getRequired("timezone")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun accountingSyncConfiguration(): Optional<AccountingSyncConfiguration> =
        accountingSyncConfiguration.getOptional("accounting_sync_configuration")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun reportingConfiguration(): Optional<ReportingConfiguration> =
        reportingConfiguration.getOptional("reporting_configuration")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [additionalEmails].
     *
     * Unlike [additionalEmails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("additional_emails")
    @ExcludeMissing
    fun _additionalEmails(): JsonField<List<String>> = additionalEmails

    /**
     * Returns the raw JSON value of [autoCollection].
     *
     * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auto_collection")
    @ExcludeMissing
    fun _autoCollection(): JsonField<Boolean> = autoCollection

    /**
     * Returns the raw JSON value of [balance].
     *
     * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<String> = balance

    /**
     * Returns the raw JSON value of [billingAddress].
     *
     * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_address")
    @ExcludeMissing
    fun _billingAddress(): JsonField<Address> = billingAddress

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [emailDelivery].
     *
     * Unlike [emailDelivery], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email_delivery")
    @ExcludeMissing
    fun _emailDelivery(): JsonField<Boolean> = emailDelivery

    /**
     * Returns the raw JSON value of [exemptFromAutomatedTax].
     *
     * Unlike [exemptFromAutomatedTax], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("exempt_from_automated_tax")
    @ExcludeMissing
    fun _exemptFromAutomatedTax(): JsonField<Boolean> = exemptFromAutomatedTax

    /**
     * Returns the raw JSON value of [externalCustomerId].
     *
     * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_customer_id")
    @ExcludeMissing
    fun _externalCustomerId(): JsonField<String> = externalCustomerId

    /**
     * Returns the raw JSON value of [hierarchy].
     *
     * Unlike [hierarchy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hierarchy") @ExcludeMissing fun _hierarchy(): JsonField<Hierarchy> = hierarchy

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [paymentProvider].
     *
     * Unlike [paymentProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_provider")
    @ExcludeMissing
    fun _paymentProvider(): JsonField<PaymentProvider> = paymentProvider

    /**
     * Returns the raw JSON value of [paymentProviderId].
     *
     * Unlike [paymentProviderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_provider_id")
    @ExcludeMissing
    fun _paymentProviderId(): JsonField<String> = paymentProviderId

    /**
     * Returns the raw JSON value of [portalUrl].
     *
     * Unlike [portalUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portal_url") @ExcludeMissing fun _portalUrl(): JsonField<String> = portalUrl

    /**
     * Returns the raw JSON value of [shippingAddress].
     *
     * Unlike [shippingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipping_address")
    @ExcludeMissing
    fun _shippingAddress(): JsonField<Address> = shippingAddress

    /**
     * Returns the raw JSON value of [taxId].
     *
     * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<CustomerTaxId> = taxId

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

    /**
     * Returns the raw JSON value of [accountingSyncConfiguration].
     *
     * Unlike [accountingSyncConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("accounting_sync_configuration")
    @ExcludeMissing
    fun _accountingSyncConfiguration(): JsonField<AccountingSyncConfiguration> =
        accountingSyncConfiguration

    /**
     * Returns the raw JSON value of [reportingConfiguration].
     *
     * Unlike [reportingConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("reporting_configuration")
    @ExcludeMissing
    fun _reportingConfiguration(): JsonField<ReportingConfiguration> = reportingConfiguration

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Customer].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .additionalEmails()
         * .autoCollection()
         * .balance()
         * .billingAddress()
         * .createdAt()
         * .currency()
         * .email()
         * .emailDelivery()
         * .exemptFromAutomatedTax()
         * .externalCustomerId()
         * .hierarchy()
         * .metadata()
         * .name()
         * .paymentProvider()
         * .paymentProviderId()
         * .portalUrl()
         * .shippingAddress()
         * .taxId()
         * .timezone()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Customer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var additionalEmails: JsonField<MutableList<String>>? = null
        private var autoCollection: JsonField<Boolean>? = null
        private var balance: JsonField<String>? = null
        private var billingAddress: JsonField<Address>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var emailDelivery: JsonField<Boolean>? = null
        private var exemptFromAutomatedTax: JsonField<Boolean>? = null
        private var externalCustomerId: JsonField<String>? = null
        private var hierarchy: JsonField<Hierarchy>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var paymentProvider: JsonField<PaymentProvider>? = null
        private var paymentProviderId: JsonField<String>? = null
        private var portalUrl: JsonField<String>? = null
        private var shippingAddress: JsonField<Address>? = null
        private var taxId: JsonField<CustomerTaxId>? = null
        private var timezone: JsonField<String>? = null
        private var accountingSyncConfiguration: JsonField<AccountingSyncConfiguration> =
            JsonMissing.of()
        private var reportingConfiguration: JsonField<ReportingConfiguration> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customer: Customer) = apply {
            id = customer.id
            additionalEmails = customer.additionalEmails.map { it.toMutableList() }
            autoCollection = customer.autoCollection
            balance = customer.balance
            billingAddress = customer.billingAddress
            createdAt = customer.createdAt
            currency = customer.currency
            email = customer.email
            emailDelivery = customer.emailDelivery
            exemptFromAutomatedTax = customer.exemptFromAutomatedTax
            externalCustomerId = customer.externalCustomerId
            hierarchy = customer.hierarchy
            metadata = customer.metadata
            name = customer.name
            paymentProvider = customer.paymentProvider
            paymentProviderId = customer.paymentProviderId
            portalUrl = customer.portalUrl
            shippingAddress = customer.shippingAddress
            taxId = customer.taxId
            timezone = customer.timezone
            accountingSyncConfiguration = customer.accountingSyncConfiguration
            reportingConfiguration = customer.reportingConfiguration
            additionalProperties = customer.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun additionalEmails(additionalEmails: List<String>) =
            additionalEmails(JsonField.of(additionalEmails))

        /**
         * Sets [Builder.additionalEmails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalEmails] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun additionalEmails(additionalEmails: JsonField<List<String>>) = apply {
            this.additionalEmails = additionalEmails.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [additionalEmails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdditionalEmail(additionalEmail: String) = apply {
            additionalEmails =
                (additionalEmails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("additionalEmails", it).add(additionalEmail)
                }
        }

        fun autoCollection(autoCollection: Boolean) = autoCollection(JsonField.of(autoCollection))

        /**
         * Sets [Builder.autoCollection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCollection] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            this.autoCollection = autoCollection
        }

        /** The customer's current balance in their currency. */
        fun balance(balance: String) = balance(JsonField.of(balance))

        /**
         * Sets [Builder.balance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balance] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun balance(balance: JsonField<String>) = apply { this.balance = balance }

        fun billingAddress(billingAddress: Address?) =
            billingAddress(JsonField.ofNullable(billingAddress))

        /** Alias for calling [Builder.billingAddress] with `billingAddress.orElse(null)`. */
        fun billingAddress(billingAddress: Optional<Address>) =
            billingAddress(billingAddress.getOrNull())

        /**
         * Sets [Builder.billingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddress] with a well-typed [Address] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAddress(billingAddress: JsonField<Address>) = apply {
            this.billingAddress = billingAddress
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment through a
         * payment gateway, this email will be used for any automatically issued receipts.
         */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun emailDelivery(emailDelivery: Boolean) = emailDelivery(JsonField.of(emailDelivery))

        /**
         * Sets [Builder.emailDelivery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailDelivery] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailDelivery(emailDelivery: JsonField<Boolean>) = apply {
            this.emailDelivery = emailDelivery
        }

        fun exemptFromAutomatedTax(exemptFromAutomatedTax: Boolean?) =
            exemptFromAutomatedTax(JsonField.ofNullable(exemptFromAutomatedTax))

        /**
         * Alias for [Builder.exemptFromAutomatedTax].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun exemptFromAutomatedTax(exemptFromAutomatedTax: Boolean) =
            exemptFromAutomatedTax(exemptFromAutomatedTax as Boolean?)

        /**
         * Alias for calling [Builder.exemptFromAutomatedTax] with
         * `exemptFromAutomatedTax.orElse(null)`.
         */
        fun exemptFromAutomatedTax(exemptFromAutomatedTax: Optional<Boolean>) =
            exemptFromAutomatedTax(exemptFromAutomatedTax.getOrNull())

        /**
         * Sets [Builder.exemptFromAutomatedTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exemptFromAutomatedTax] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun exemptFromAutomatedTax(exemptFromAutomatedTax: JsonField<Boolean>) = apply {
            this.exemptFromAutomatedTax = exemptFromAutomatedTax
        }

        /**
         * An optional user-defined ID for this customer resource, used throughout the system as an
         * alias for this Customer. Use this field to identify a customer by an existing identifier
         * in your system.
         */
        fun externalCustomerId(externalCustomerId: String?) =
            externalCustomerId(JsonField.ofNullable(externalCustomerId))

        /**
         * Alias for calling [Builder.externalCustomerId] with `externalCustomerId.orElse(null)`.
         */
        fun externalCustomerId(externalCustomerId: Optional<String>) =
            externalCustomerId(externalCustomerId.getOrNull())

        /**
         * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** The hierarchical relationships for this customer. */
        fun hierarchy(hierarchy: Hierarchy) = hierarchy(JsonField.of(hierarchy))

        /**
         * Sets [Builder.hierarchy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hierarchy] with a well-typed [Hierarchy] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hierarchy(hierarchy: JsonField<Hierarchy>) = apply { this.hierarchy = hierarchy }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The full name of the customer */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode, the connection must first be configured in the Orb webapp.
         */
        fun paymentProvider(paymentProvider: PaymentProvider?) =
            paymentProvider(JsonField.ofNullable(paymentProvider))

        /** Alias for calling [Builder.paymentProvider] with `paymentProvider.orElse(null)`. */
        fun paymentProvider(paymentProvider: Optional<PaymentProvider>) =
            paymentProvider(paymentProvider.getOrNull())

        /**
         * Sets [Builder.paymentProvider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentProvider] with a well-typed [PaymentProvider]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentProvider(paymentProvider: JsonField<PaymentProvider>) = apply {
            this.paymentProvider = paymentProvider
        }

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This is used
         * for creating charges or invoices in the external system via Orb.
         */
        fun paymentProviderId(paymentProviderId: String?) =
            paymentProviderId(JsonField.ofNullable(paymentProviderId))

        /** Alias for calling [Builder.paymentProviderId] with `paymentProviderId.orElse(null)`. */
        fun paymentProviderId(paymentProviderId: Optional<String>) =
            paymentProviderId(paymentProviderId.getOrNull())

        /**
         * Sets [Builder.paymentProviderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentProviderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentProviderId(paymentProviderId: JsonField<String>) = apply {
            this.paymentProviderId = paymentProviderId
        }

        fun portalUrl(portalUrl: String?) = portalUrl(JsonField.ofNullable(portalUrl))

        /** Alias for calling [Builder.portalUrl] with `portalUrl.orElse(null)`. */
        fun portalUrl(portalUrl: Optional<String>) = portalUrl(portalUrl.getOrNull())

        /**
         * Sets [Builder.portalUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun portalUrl(portalUrl: JsonField<String>) = apply { this.portalUrl = portalUrl }

        fun shippingAddress(shippingAddress: Address?) =
            shippingAddress(JsonField.ofNullable(shippingAddress))

        /** Alias for calling [Builder.shippingAddress] with `shippingAddress.orElse(null)`. */
        fun shippingAddress(shippingAddress: Optional<Address>) =
            shippingAddress(shippingAddress.getOrNull())

        /**
         * Sets [Builder.shippingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shippingAddress] with a well-typed [Address] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shippingAddress(shippingAddress: JsonField<Address>) = apply {
            this.shippingAddress = shippingAddress
        }

        /**
         * Tax IDs are commonly required to be displayed on customer invoices, which are added to
         * the headers of invoices.
         *
         * ### Supported Tax ID Countries and Types
         * |Country             |Type        |Description                                                                                            |
         * |--------------------|------------|-------------------------------------------------------------------------------------------------------|
         * |Andorra             |`ad_nrt`    |Andorran NRT Number                                                                                    |
         * |Argentina           |`ar_cuit`   |Argentinian Tax ID Number                                                                              |
         * |Australia           |`au_abn`    |Australian Business Number (AU ABN)                                                                    |
         * |Australia           |`au_arn`    |Australian Taxation Office Reference Number                                                            |
         * |Austria             |`eu_vat`    |European VAT Number                                                                                    |
         * |Bahrain             |`bh_vat`    |Bahraini VAT Number                                                                                    |
         * |Belgium             |`eu_vat`    |European VAT Number                                                                                    |
         * |Bolivia             |`bo_tin`    |Bolivian Tax ID                                                                                        |
         * |Brazil              |`br_cnpj`   |Brazilian CNPJ Number                                                                                  |
         * |Brazil              |`br_cpf`    |Brazilian CPF Number                                                                                   |
         * |Bulgaria            |`bg_uic`    |Bulgaria Unified Identification Code                                                                   |
         * |Bulgaria            |`eu_vat`    |European VAT Number                                                                                    |
         * |Canada              |`ca_bn`     |Canadian BN                                                                                            |
         * |Canada              |`ca_gst_hst`|Canadian GST/HST Number                                                                                |
         * |Canada              |`ca_pst_bc` |Canadian PST Number (British Columbia)                                                                 |
         * |Canada              |`ca_pst_mb` |Canadian PST Number (Manitoba)                                                                         |
         * |Canada              |`ca_pst_sk` |Canadian PST Number (Saskatchewan)                                                                     |
         * |Canada              |`ca_qst`    |Canadian QST Number (Québec)                                                                           |
         * |Chile               |`cl_tin`    |Chilean TIN                                                                                            |
         * |China               |`cn_tin`    |Chinese Tax ID                                                                                         |
         * |Colombia            |`co_nit`    |Colombian NIT Number                                                                                   |
         * |Costa Rica          |`cr_tin`    |Costa Rican Tax ID                                                                                     |
         * |Croatia             |`eu_vat`    |European VAT Number                                                                                    |
         * |Cyprus              |`eu_vat`    |European VAT Number                                                                                    |
         * |Czech Republic      |`eu_vat`    |European VAT Number                                                                                    |
         * |Denmark             |`eu_vat`    |European VAT Number                                                                                    |
         * |Dominican Republic  |`do_rcn`    |Dominican RCN Number                                                                                   |
         * |Ecuador             |`ec_ruc`    |Ecuadorian RUC Number                                                                                  |
         * |Egypt               |`eg_tin`    |Egyptian Tax Identification Number                                                                     |
         * |El Salvador         |`sv_nit`    |El Salvadorian NIT Number                                                                              |
         * |Estonia             |`eu_vat`    |European VAT Number                                                                                    |
         * |EU                  |`eu_oss_vat`|European One Stop Shop VAT Number for non-Union scheme                                                 |
         * |Finland             |`eu_vat`    |European VAT Number                                                                                    |
         * |France              |`eu_vat`    |European VAT Number                                                                                    |
         * |Georgia             |`ge_vat`    |Georgian VAT                                                                                           |
         * |Germany             |`eu_vat`    |European VAT Number                                                                                    |
         * |Greece              |`eu_vat`    |European VAT Number                                                                                    |
         * |Hong Kong           |`hk_br`     |Hong Kong BR Number                                                                                    |
         * |Hungary             |`eu_vat`    |European VAT Number                                                                                    |
         * |Hungary             |`hu_tin`    |Hungary Tax Number (adószám)                                                                           |
         * |Iceland             |`is_vat`    |Icelandic VAT                                                                                          |
         * |India               |`in_gst`    |Indian GST Number                                                                                      |
         * |Indonesia           |`id_npwp`   |Indonesian NPWP Number                                                                                 |
         * |Ireland             |`eu_vat`    |European VAT Number                                                                                    |
         * |Israel              |`il_vat`    |Israel VAT                                                                                             |
         * |Italy               |`eu_vat`    |European VAT Number                                                                                    |
         * |Japan               |`jp_cn`     |Japanese Corporate Number (_Hōjin Bangō_)                                                              |
         * |Japan               |`jp_rn`     |Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_)|
         * |Japan               |`jp_trn`    |Japanese Tax Registration Number (_Tōroku Bangō_)                                                      |
         * |Kazakhstan          |`kz_bin`    |Kazakhstani Business Identification Number                                                             |
         * |Kenya               |`ke_pin`    |Kenya Revenue Authority Personal Identification Number                                                 |
         * |Latvia              |`eu_vat`    |European VAT Number                                                                                    |
         * |Liechtenstein       |`li_uid`    |Liechtensteinian UID Number                                                                            |
         * |Lithuania           |`eu_vat`    |European VAT Number                                                                                    |
         * |Luxembourg          |`eu_vat`    |European VAT Number                                                                                    |
         * |Malaysia            |`my_frp`    |Malaysian FRP Number                                                                                   |
         * |Malaysia            |`my_itn`    |Malaysian ITN                                                                                          |
         * |Malaysia            |`my_sst`    |Malaysian SST Number                                                                                   |
         * |Malta               |`eu_vat `   |European VAT Number                                                                                    |
         * |Mexico              |`mx_rfc`    |Mexican RFC Number                                                                                     |
         * |Netherlands         |`eu_vat`    |European VAT Number                                                                                    |
         * |New Zealand         |`nz_gst`    |New Zealand GST Number                                                                                 |
         * |Nigeria             |`ng_tin`    |Nigerian Tax Identification Number                                                                     |
         * |Norway              |`no_vat`    |Norwegian VAT Number                                                                                   |
         * |Norway              |`no_voec`   |Norwegian VAT on e-commerce Number                                                                     |
         * |Oman                |`om_vat`    |Omani VAT Number                                                                                       |
         * |Peru                |`pe_ruc`    |Peruvian RUC Number                                                                                    |
         * |Philippines         |`ph_tin   ` |Philippines Tax Identification Number                                                                  |
         * |Poland              |`eu_vat`    |European VAT Number                                                                                    |
         * |Portugal            |`eu_vat`    |European VAT Number                                                                                    |
         * |Romania             |`eu_vat`    |European VAT Number                                                                                    |
         * |Romania             |`ro_tin`    |Romanian Tax ID Number                                                                                 |
         * |Russia              |`ru_inn`    |Russian INN                                                                                            |
         * |Russia              |`ru_kpp`    |Russian KPP                                                                                            |
         * |Saudi Arabia        |`sa_vat`    |Saudi Arabia VAT                                                                                       |
         * |Serbia              |`rs_pib`    |Serbian PIB Number                                                                                     |
         * |Singapore           |`sg_gst`    |Singaporean GST                                                                                        |
         * |Singapore           |`sg_uen`    |Singaporean UEN                                                                                        |
         * |Slovakia            |`eu_vat`    |European VAT Number                                                                                    |
         * |Slovenia            |`eu_vat`    |European VAT Number                                                                                    |
         * |Slovenia            |`si_tin`    |Slovenia Tax Number (davčna številka)                                                                  |
         * |South Africa        |`za_vat`    |South African VAT Number                                                                               |
         * |South Korea         |`kr_brn`    |Korean BRN                                                                                             |
         * |Spain               |`es_cif`    |Spanish NIF Number (previously Spanish CIF Number)                                                     |
         * |Spain               |`eu_vat`    |European VAT Number                                                                                    |
         * |Sweden              |`eu_vat`    |European VAT Number                                                                                    |
         * |Switzerland         |`ch_vat`    |Switzerland VAT Number                                                                                 |
         * |Taiwan              |`tw_vat`    |Taiwanese VAT                                                                                          |
         * |Thailand            |`th_vat`    |Thai VAT                                                                                               |
         * |Turkey              |`tr_tin`    |Turkish Tax Identification Number                                                                      |
         * |Ukraine             |`ua_vat`    |Ukrainian VAT                                                                                          |
         * |United Arab Emirates|`ae_trn`    |United Arab Emirates TRN                                                                               |
         * |United Kingdom      |`eu_vat`    |Northern Ireland VAT Number                                                                            |
         * |United Kingdom      |`gb_vat`    |United Kingdom VAT Number                                                                              |
         * |United States       |`us_ein`    |United States EIN                                                                                      |
         * |Uruguay             |`uy_ruc`    |Uruguayan RUC Number                                                                                   |
         * |Venezuela           |`ve_rif`    |Venezuelan RIF Number                                                                                  |
         * |Vietnam             |`vn_tin`    |Vietnamese Tax ID Number                                                                               |
         */
        fun taxId(taxId: CustomerTaxId?) = taxId(JsonField.ofNullable(taxId))

        /** Alias for calling [Builder.taxId] with `taxId.orElse(null)`. */
        fun taxId(taxId: Optional<CustomerTaxId>) = taxId(taxId.getOrNull())

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [CustomerTaxId] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxId(taxId: JsonField<CustomerTaxId>) = apply { this.taxId = taxId }

        /**
         * A timezone identifier from the IANA timezone database, such as "America/Los_Angeles".
         * This "defaults to your account's timezone if not set. This cannot be changed after
         * customer creation.
         */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

        fun accountingSyncConfiguration(accountingSyncConfiguration: AccountingSyncConfiguration?) =
            accountingSyncConfiguration(JsonField.ofNullable(accountingSyncConfiguration))

        /**
         * Alias for calling [Builder.accountingSyncConfiguration] with
         * `accountingSyncConfiguration.orElse(null)`.
         */
        fun accountingSyncConfiguration(
            accountingSyncConfiguration: Optional<AccountingSyncConfiguration>
        ) = accountingSyncConfiguration(accountingSyncConfiguration.getOrNull())

        /**
         * Sets [Builder.accountingSyncConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingSyncConfiguration] with a well-typed
         * [AccountingSyncConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun accountingSyncConfiguration(
            accountingSyncConfiguration: JsonField<AccountingSyncConfiguration>
        ) = apply { this.accountingSyncConfiguration = accountingSyncConfiguration }

        fun reportingConfiguration(reportingConfiguration: ReportingConfiguration?) =
            reportingConfiguration(JsonField.ofNullable(reportingConfiguration))

        /**
         * Alias for calling [Builder.reportingConfiguration] with
         * `reportingConfiguration.orElse(null)`.
         */
        fun reportingConfiguration(reportingConfiguration: Optional<ReportingConfiguration>) =
            reportingConfiguration(reportingConfiguration.getOrNull())

        /**
         * Sets [Builder.reportingConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportingConfiguration] with a well-typed
         * [ReportingConfiguration] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun reportingConfiguration(reportingConfiguration: JsonField<ReportingConfiguration>) =
            apply {
                this.reportingConfiguration = reportingConfiguration
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Customer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .additionalEmails()
         * .autoCollection()
         * .balance()
         * .billingAddress()
         * .createdAt()
         * .currency()
         * .email()
         * .emailDelivery()
         * .exemptFromAutomatedTax()
         * .externalCustomerId()
         * .hierarchy()
         * .metadata()
         * .name()
         * .paymentProvider()
         * .paymentProviderId()
         * .portalUrl()
         * .shippingAddress()
         * .taxId()
         * .timezone()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Customer =
            Customer(
                checkRequired("id", id),
                checkRequired("additionalEmails", additionalEmails).map { it.toImmutable() },
                checkRequired("autoCollection", autoCollection),
                checkRequired("balance", balance),
                checkRequired("billingAddress", billingAddress),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("email", email),
                checkRequired("emailDelivery", emailDelivery),
                checkRequired("exemptFromAutomatedTax", exemptFromAutomatedTax),
                checkRequired("externalCustomerId", externalCustomerId),
                checkRequired("hierarchy", hierarchy),
                checkRequired("metadata", metadata),
                checkRequired("name", name),
                checkRequired("paymentProvider", paymentProvider),
                checkRequired("paymentProviderId", paymentProviderId),
                checkRequired("portalUrl", portalUrl),
                checkRequired("shippingAddress", shippingAddress),
                checkRequired("taxId", taxId),
                checkRequired("timezone", timezone),
                accountingSyncConfiguration,
                reportingConfiguration,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Customer = apply {
        if (validated) {
            return@apply
        }

        id()
        additionalEmails()
        autoCollection()
        balance()
        billingAddress().ifPresent { it.validate() }
        createdAt()
        currency()
        email()
        emailDelivery()
        exemptFromAutomatedTax()
        externalCustomerId()
        hierarchy().validate()
        metadata().validate()
        name()
        paymentProvider().ifPresent { it.validate() }
        paymentProviderId()
        portalUrl()
        shippingAddress().ifPresent { it.validate() }
        taxId().ifPresent { it.validate() }
        timezone()
        accountingSyncConfiguration().ifPresent { it.validate() }
        reportingConfiguration().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OrbInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (additionalEmails.asKnown().getOrNull()?.size ?: 0) +
            (if (autoCollection.asKnown().isPresent) 1 else 0) +
            (if (balance.asKnown().isPresent) 1 else 0) +
            (billingAddress.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (emailDelivery.asKnown().isPresent) 1 else 0) +
            (if (exemptFromAutomatedTax.asKnown().isPresent) 1 else 0) +
            (if (externalCustomerId.asKnown().isPresent) 1 else 0) +
            (hierarchy.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (paymentProvider.asKnown().getOrNull()?.validity() ?: 0) +
            (if (paymentProviderId.asKnown().isPresent) 1 else 0) +
            (if (portalUrl.asKnown().isPresent) 1 else 0) +
            (shippingAddress.asKnown().getOrNull()?.validity() ?: 0) +
            (taxId.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timezone.asKnown().isPresent) 1 else 0) +
            (accountingSyncConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (reportingConfiguration.asKnown().getOrNull()?.validity() ?: 0)

    /** The hierarchical relationships for this customer. */
    class Hierarchy
    private constructor(
        private val children: JsonField<List<CustomerMinified>>,
        private val parent: JsonField<CustomerMinified>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("children")
            @ExcludeMissing
            children: JsonField<List<CustomerMinified>> = JsonMissing.of(),
            @JsonProperty("parent")
            @ExcludeMissing
            parent: JsonField<CustomerMinified> = JsonMissing.of(),
        ) : this(children, parent, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun children(): List<CustomerMinified> = children.getRequired("children")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parent(): Optional<CustomerMinified> = parent.getOptional("parent")

        /**
         * Returns the raw JSON value of [children].
         *
         * Unlike [children], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("children")
        @ExcludeMissing
        fun _children(): JsonField<List<CustomerMinified>> = children

        /**
         * Returns the raw JSON value of [parent].
         *
         * Unlike [parent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<CustomerMinified> = parent

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Hierarchy].
             *
             * The following fields are required:
             * ```java
             * .children()
             * .parent()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Hierarchy]. */
        class Builder internal constructor() {

            private var children: JsonField<MutableList<CustomerMinified>>? = null
            private var parent: JsonField<CustomerMinified>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(hierarchy: Hierarchy) = apply {
                children = hierarchy.children.map { it.toMutableList() }
                parent = hierarchy.parent
                additionalProperties = hierarchy.additionalProperties.toMutableMap()
            }

            fun children(children: List<CustomerMinified>) = children(JsonField.of(children))

            /**
             * Sets [Builder.children] to an arbitrary JSON value.
             *
             * You should usually call [Builder.children] with a well-typed `List<CustomerMinified>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun children(children: JsonField<List<CustomerMinified>>) = apply {
                this.children = children.map { it.toMutableList() }
            }

            /**
             * Adds a single [CustomerMinified] to [children].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addChild(child: CustomerMinified) = apply {
                children =
                    (children ?: JsonField.of(mutableListOf())).also {
                        checkKnown("children", it).add(child)
                    }
            }

            fun parent(parent: CustomerMinified?) = parent(JsonField.ofNullable(parent))

            /** Alias for calling [Builder.parent] with `parent.orElse(null)`. */
            fun parent(parent: Optional<CustomerMinified>) = parent(parent.getOrNull())

            /**
             * Sets [Builder.parent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parent] with a well-typed [CustomerMinified] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parent(parent: JsonField<CustomerMinified>) = apply { this.parent = parent }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Hierarchy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .children()
             * .parent()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Hierarchy =
                Hierarchy(
                    checkRequired("children", children).map { it.toImmutable() },
                    checkRequired("parent", parent),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Hierarchy = apply {
            if (validated) {
                return@apply
            }

            children().forEach { it.validate() }
            parent().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (children.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (parent.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Hierarchy && children == other.children && parent == other.parent && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(children, parent, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Hierarchy{children=$children, parent=$parent, additionalProperties=$additionalProperties}"
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /**
     * This is used for creating charges or invoices in an external system via Orb. When not in test
     * mode, the connection must first be configured in the Orb webapp.
     */
    class PaymentProvider @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val QUICKBOOKS = of("quickbooks")

            @JvmField val BILL_COM = of("bill.com")

            @JvmField val STRIPE_CHARGE = of("stripe_charge")

            @JvmField val STRIPE_INVOICE = of("stripe_invoice")

            @JvmField val NETSUITE = of("netsuite")

            @JvmStatic fun of(value: String) = PaymentProvider(JsonField.of(value))
        }

        /** An enum containing [PaymentProvider]'s known values. */
        enum class Known {
            QUICKBOOKS,
            BILL_COM,
            STRIPE_CHARGE,
            STRIPE_INVOICE,
            NETSUITE,
        }

        /**
         * An enum containing [PaymentProvider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentProvider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUICKBOOKS,
            BILL_COM,
            STRIPE_CHARGE,
            STRIPE_INVOICE,
            NETSUITE,
            /**
             * An enum member indicating that [PaymentProvider] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                QUICKBOOKS -> Value.QUICKBOOKS
                BILL_COM -> Value.BILL_COM
                STRIPE_CHARGE -> Value.STRIPE_CHARGE
                STRIPE_INVOICE -> Value.STRIPE_INVOICE
                NETSUITE -> Value.NETSUITE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                QUICKBOOKS -> Known.QUICKBOOKS
                BILL_COM -> Known.BILL_COM
                STRIPE_CHARGE -> Known.STRIPE_CHARGE
                STRIPE_INVOICE -> Known.STRIPE_INVOICE
                NETSUITE -> Known.NETSUITE
                else -> throw OrbInvalidDataException("Unknown PaymentProvider: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { OrbInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): PaymentProvider = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentProvider && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class AccountingSyncConfiguration
    private constructor(
        private val accountingProviders: JsonField<List<AccountingProvider>>,
        private val excluded: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accounting_providers")
            @ExcludeMissing
            accountingProviders: JsonField<List<AccountingProvider>> = JsonMissing.of(),
            @JsonProperty("excluded")
            @ExcludeMissing
            excluded: JsonField<Boolean> = JsonMissing.of(),
        ) : this(accountingProviders, excluded, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountingProviders(): List<AccountingProvider> =
            accountingProviders.getRequired("accounting_providers")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun excluded(): Boolean = excluded.getRequired("excluded")

        /**
         * Returns the raw JSON value of [accountingProviders].
         *
         * Unlike [accountingProviders], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("accounting_providers")
        @ExcludeMissing
        fun _accountingProviders(): JsonField<List<AccountingProvider>> = accountingProviders

        /**
         * Returns the raw JSON value of [excluded].
         *
         * Unlike [excluded], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("excluded") @ExcludeMissing fun _excluded(): JsonField<Boolean> = excluded

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [AccountingSyncConfiguration].
             *
             * The following fields are required:
             * ```java
             * .accountingProviders()
             * .excluded()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountingSyncConfiguration]. */
        class Builder internal constructor() {

            private var accountingProviders: JsonField<MutableList<AccountingProvider>>? = null
            private var excluded: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountingSyncConfiguration: AccountingSyncConfiguration) = apply {
                accountingProviders =
                    accountingSyncConfiguration.accountingProviders.map { it.toMutableList() }
                excluded = accountingSyncConfiguration.excluded
                additionalProperties =
                    accountingSyncConfiguration.additionalProperties.toMutableMap()
            }

            fun accountingProviders(accountingProviders: List<AccountingProvider>) =
                accountingProviders(JsonField.of(accountingProviders))

            /**
             * Sets [Builder.accountingProviders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountingProviders] with a well-typed
             * `List<AccountingProvider>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun accountingProviders(accountingProviders: JsonField<List<AccountingProvider>>) =
                apply {
                    this.accountingProviders = accountingProviders.map { it.toMutableList() }
                }

            /**
             * Adds a single [AccountingProvider] to [accountingProviders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAccountingProvider(accountingProvider: AccountingProvider) = apply {
                accountingProviders =
                    (accountingProviders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("accountingProviders", it).add(accountingProvider)
                    }
            }

            fun excluded(excluded: Boolean) = excluded(JsonField.of(excluded))

            /**
             * Sets [Builder.excluded] to an arbitrary JSON value.
             *
             * You should usually call [Builder.excluded] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun excluded(excluded: JsonField<Boolean>) = apply { this.excluded = excluded }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [AccountingSyncConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountingProviders()
             * .excluded()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountingSyncConfiguration =
                AccountingSyncConfiguration(
                    checkRequired("accountingProviders", accountingProviders).map {
                        it.toImmutable()
                    },
                    checkRequired("excluded", excluded),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountingSyncConfiguration = apply {
            if (validated) {
                return@apply
            }

            accountingProviders().forEach { it.validate() }
            excluded()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (accountingProviders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (excluded.asKnown().isPresent) 1 else 0)

        class AccountingProvider
        private constructor(
            private val externalProviderId: JsonField<String>,
            private val providerType: JsonField<ProviderType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("external_provider_id")
                @ExcludeMissing
                externalProviderId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider_type")
                @ExcludeMissing
                providerType: JsonField<ProviderType> = JsonMissing.of(),
            ) : this(externalProviderId, providerType, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalProviderId(): Optional<String> =
                externalProviderId.getOptional("external_provider_id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun providerType(): ProviderType = providerType.getRequired("provider_type")

            /**
             * Returns the raw JSON value of [externalProviderId].
             *
             * Unlike [externalProviderId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_provider_id")
            @ExcludeMissing
            fun _externalProviderId(): JsonField<String> = externalProviderId

            /**
             * Returns the raw JSON value of [providerType].
             *
             * Unlike [providerType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider_type")
            @ExcludeMissing
            fun _providerType(): JsonField<ProviderType> = providerType

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AccountingProvider].
                 *
                 * The following fields are required:
                 * ```java
                 * .externalProviderId()
                 * .providerType()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccountingProvider]. */
            class Builder internal constructor() {

                private var externalProviderId: JsonField<String>? = null
                private var providerType: JsonField<ProviderType>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accountingProvider: AccountingProvider) = apply {
                    externalProviderId = accountingProvider.externalProviderId
                    providerType = accountingProvider.providerType
                    additionalProperties = accountingProvider.additionalProperties.toMutableMap()
                }

                fun externalProviderId(externalProviderId: String?) =
                    externalProviderId(JsonField.ofNullable(externalProviderId))

                /**
                 * Alias for calling [Builder.externalProviderId] with
                 * `externalProviderId.orElse(null)`.
                 */
                fun externalProviderId(externalProviderId: Optional<String>) =
                    externalProviderId(externalProviderId.getOrNull())

                /**
                 * Sets [Builder.externalProviderId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalProviderId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalProviderId(externalProviderId: JsonField<String>) = apply {
                    this.externalProviderId = externalProviderId
                }

                fun providerType(providerType: ProviderType) =
                    providerType(JsonField.of(providerType))

                /**
                 * Sets [Builder.providerType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.providerType] with a well-typed [ProviderType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun providerType(providerType: JsonField<ProviderType>) = apply {
                    this.providerType = providerType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AccountingProvider].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .externalProviderId()
                 * .providerType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AccountingProvider =
                    AccountingProvider(
                        checkRequired("externalProviderId", externalProviderId),
                        checkRequired("providerType", providerType),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AccountingProvider = apply {
                if (validated) {
                    return@apply
                }

                externalProviderId()
                providerType().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OrbInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (externalProviderId.asKnown().isPresent) 1 else 0) +
                    (providerType.asKnown().getOrNull()?.validity() ?: 0)

            class ProviderType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val QUICKBOOKS = of("quickbooks")

                    @JvmField val NETSUITE = of("netsuite")

                    @JvmStatic fun of(value: String) = ProviderType(JsonField.of(value))
                }

                /** An enum containing [ProviderType]'s known values. */
                enum class Known {
                    QUICKBOOKS,
                    NETSUITE,
                }

                /**
                 * An enum containing [ProviderType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ProviderType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    QUICKBOOKS,
                    NETSUITE,
                    /**
                     * An enum member indicating that [ProviderType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        QUICKBOOKS -> Value.QUICKBOOKS
                        NETSUITE -> Value.NETSUITE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        QUICKBOOKS -> Known.QUICKBOOKS
                        NETSUITE -> Known.NETSUITE
                        else -> throw OrbInvalidDataException("Unknown ProviderType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OrbInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): ProviderType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: OrbInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ProviderType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccountingProvider && externalProviderId == other.externalProviderId && providerType == other.providerType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(externalProviderId, providerType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountingProvider{externalProviderId=$externalProviderId, providerType=$providerType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountingSyncConfiguration && accountingProviders == other.accountingProviders && excluded == other.excluded && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountingProviders, excluded, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountingSyncConfiguration{accountingProviders=$accountingProviders, excluded=$excluded, additionalProperties=$additionalProperties}"
    }

    class ReportingConfiguration
    private constructor(
        private val exempt: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("exempt") @ExcludeMissing exempt: JsonField<Boolean> = JsonMissing.of()
        ) : this(exempt, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun exempt(): Boolean = exempt.getRequired("exempt")

        /**
         * Returns the raw JSON value of [exempt].
         *
         * Unlike [exempt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("exempt") @ExcludeMissing fun _exempt(): JsonField<Boolean> = exempt

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ReportingConfiguration].
             *
             * The following fields are required:
             * ```java
             * .exempt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ReportingConfiguration]. */
        class Builder internal constructor() {

            private var exempt: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reportingConfiguration: ReportingConfiguration) = apply {
                exempt = reportingConfiguration.exempt
                additionalProperties = reportingConfiguration.additionalProperties.toMutableMap()
            }

            fun exempt(exempt: Boolean) = exempt(JsonField.of(exempt))

            /**
             * Sets [Builder.exempt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exempt] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exempt(exempt: JsonField<Boolean>) = apply { this.exempt = exempt }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ReportingConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .exempt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ReportingConfiguration =
                ReportingConfiguration(
                    checkRequired("exempt", exempt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ReportingConfiguration = apply {
            if (validated) {
                return@apply
            }

            exempt()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (if (exempt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReportingConfiguration && exempt == other.exempt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(exempt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReportingConfiguration{exempt=$exempt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Customer && id == other.id && additionalEmails == other.additionalEmails && autoCollection == other.autoCollection && balance == other.balance && billingAddress == other.billingAddress && createdAt == other.createdAt && currency == other.currency && email == other.email && emailDelivery == other.emailDelivery && exemptFromAutomatedTax == other.exemptFromAutomatedTax && externalCustomerId == other.externalCustomerId && hierarchy == other.hierarchy && metadata == other.metadata && name == other.name && paymentProvider == other.paymentProvider && paymentProviderId == other.paymentProviderId && portalUrl == other.portalUrl && shippingAddress == other.shippingAddress && taxId == other.taxId && timezone == other.timezone && accountingSyncConfiguration == other.accountingSyncConfiguration && reportingConfiguration == other.reportingConfiguration && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, additionalEmails, autoCollection, balance, billingAddress, createdAt, currency, email, emailDelivery, exemptFromAutomatedTax, externalCustomerId, hierarchy, metadata, name, paymentProvider, paymentProviderId, portalUrl, shippingAddress, taxId, timezone, accountingSyncConfiguration, reportingConfiguration, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Customer{id=$id, additionalEmails=$additionalEmails, autoCollection=$autoCollection, balance=$balance, billingAddress=$billingAddress, createdAt=$createdAt, currency=$currency, email=$email, emailDelivery=$emailDelivery, exemptFromAutomatedTax=$exemptFromAutomatedTax, externalCustomerId=$externalCustomerId, hierarchy=$hierarchy, metadata=$metadata, name=$name, paymentProvider=$paymentProvider, paymentProviderId=$paymentProviderId, portalUrl=$portalUrl, shippingAddress=$shippingAddress, taxId=$taxId, timezone=$timezone, accountingSyncConfiguration=$accountingSyncConfiguration, reportingConfiguration=$reportingConfiguration, additionalProperties=$additionalProperties}"
}
