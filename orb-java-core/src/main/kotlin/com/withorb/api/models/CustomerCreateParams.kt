// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * This operation is used to create an Orb customer, who is party to the core billing relationship.
 * See [Customer](/core-concepts##customer) for an overview of the customer resource.
 *
 * This endpoint is critical in the following Orb functionality:
 * - Automated charges can be configured by setting `payment_provider` and `payment_provider_id` to
 *   automatically issue invoices
 * - [Customer ID Aliases](/events-and-metrics/customer-aliases) can be configured by setting
 *   `external_customer_id`
 * - [Timezone localization](/essentials/timezones) can be configured on a per-customer basis by
 *   setting the `timezone` parameter
 */
class CustomerCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A valid customer email, to be used for notifications. When Orb triggers payment through a
     * payment gateway, this email will be used for any automatically issued receipts.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = body.email()

    /**
     * The full name of the customer
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun accountingSyncConfiguration(): Optional<NewAccountingSyncConfiguration> =
        body.accountingSyncConfiguration()

    /**
     * Additional email addresses for this customer. If populated, these email addresses will be
     * CC'd for customer communications.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun additionalEmails(): Optional<List<String>> = body.additionalEmails()

    /**
     * Used to determine if invoices for this customer will automatically attempt to charge a saved
     * payment method, if available. This parameter defaults to `True` when a payment provider is
     * provided on customer creation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun autoCollection(): Optional<Boolean> = body.autoCollection()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun billingAddress(): Optional<AddressInput> = body.billingAddress()

    /**
     * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
     * creation time, will be set at subscription creation time.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currency(): Optional<String> = body.currency()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun emailDelivery(): Optional<Boolean> = body.emailDelivery()

    /**
     * An optional user-defined ID for this customer resource, used throughout the system as an
     * alias for this Customer. Use this field to identify a customer by an existing identifier in
     * your system.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalCustomerId(): Optional<String> = body.externalCustomerId()

    /**
     * The hierarchical relationships for this customer.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun hierarchy(): Optional<CustomerHierarchyConfig> = body.hierarchy()

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * This is used for creating charges or invoices in an external system via Orb. When not in test
     * mode, the connection must first be configured in the Orb webapp.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paymentProvider(): Optional<PaymentProvider> = body.paymentProvider()

    /**
     * The ID of this customer in an external payments solution, such as Stripe. This is used for
     * creating charges or invoices in the external system via Orb.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paymentProviderId(): Optional<String> = body.paymentProviderId()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun reportingConfiguration(): Optional<NewReportingConfiguration> =
        body.reportingConfiguration()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun shippingAddress(): Optional<AddressInput> = body.shippingAddress()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun taxConfiguration(): Optional<TaxConfiguration> = body.taxConfiguration()

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
    fun taxId(): Optional<CustomerTaxId> = body.taxId()

    /**
     * A timezone identifier from the IANA timezone database, such as `"America/Los_Angeles"`. This
     * defaults to your account's timezone if not set. This cannot be changed after customer
     * creation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun timezone(): Optional<String> = body.timezone()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [accountingSyncConfiguration].
     *
     * Unlike [accountingSyncConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _accountingSyncConfiguration(): JsonField<NewAccountingSyncConfiguration> =
        body._accountingSyncConfiguration()

    /**
     * Returns the raw JSON value of [additionalEmails].
     *
     * Unlike [additionalEmails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _additionalEmails(): JsonField<List<String>> = body._additionalEmails()

    /**
     * Returns the raw JSON value of [autoCollection].
     *
     * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoCollection(): JsonField<Boolean> = body._autoCollection()

    /**
     * Returns the raw JSON value of [billingAddress].
     *
     * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingAddress(): JsonField<AddressInput> = body._billingAddress()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [emailDelivery].
     *
     * Unlike [emailDelivery], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _emailDelivery(): JsonField<Boolean> = body._emailDelivery()

    /**
     * Returns the raw JSON value of [externalCustomerId].
     *
     * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalCustomerId(): JsonField<String> = body._externalCustomerId()

    /**
     * Returns the raw JSON value of [hierarchy].
     *
     * Unlike [hierarchy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hierarchy(): JsonField<CustomerHierarchyConfig> = body._hierarchy()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [paymentProvider].
     *
     * Unlike [paymentProvider], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentProvider(): JsonField<PaymentProvider> = body._paymentProvider()

    /**
     * Returns the raw JSON value of [paymentProviderId].
     *
     * Unlike [paymentProviderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _paymentProviderId(): JsonField<String> = body._paymentProviderId()

    /**
     * Returns the raw JSON value of [reportingConfiguration].
     *
     * Unlike [reportingConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _reportingConfiguration(): JsonField<NewReportingConfiguration> =
        body._reportingConfiguration()

    /**
     * Returns the raw JSON value of [shippingAddress].
     *
     * Unlike [shippingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shippingAddress(): JsonField<AddressInput> = body._shippingAddress()

    /**
     * Returns the raw JSON value of [taxConfiguration].
     *
     * Unlike [taxConfiguration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _taxConfiguration(): JsonField<TaxConfiguration> = body._taxConfiguration()

    /**
     * Returns the raw JSON value of [taxId].
     *
     * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _taxId(): JsonField<CustomerTaxId> = body._taxId()

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timezone(): JsonField<String> = body._timezone()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerCreateParams].
         *
         * The following fields are required:
         * ```java
         * .email()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerCreateParams: CustomerCreateParams) = apply {
            body = customerCreateParams.body.toBuilder()
            additionalHeaders = customerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [email]
         * - [name]
         * - [accountingSyncConfiguration]
         * - [additionalEmails]
         * - [autoCollection]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment through a
         * payment gateway, this email will be used for any automatically issued receipts.
         */
        fun email(email: String) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** The full name of the customer */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun accountingSyncConfiguration(
            accountingSyncConfiguration: NewAccountingSyncConfiguration?
        ) = apply { body.accountingSyncConfiguration(accountingSyncConfiguration) }

        /**
         * Alias for calling [Builder.accountingSyncConfiguration] with
         * `accountingSyncConfiguration.orElse(null)`.
         */
        fun accountingSyncConfiguration(
            accountingSyncConfiguration: Optional<NewAccountingSyncConfiguration>
        ) = accountingSyncConfiguration(accountingSyncConfiguration.getOrNull())

        /**
         * Sets [Builder.accountingSyncConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingSyncConfiguration] with a well-typed
         * [NewAccountingSyncConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun accountingSyncConfiguration(
            accountingSyncConfiguration: JsonField<NewAccountingSyncConfiguration>
        ) = apply { body.accountingSyncConfiguration(accountingSyncConfiguration) }

        /**
         * Additional email addresses for this customer. If populated, these email addresses will be
         * CC'd for customer communications.
         */
        fun additionalEmails(additionalEmails: List<String>?) = apply {
            body.additionalEmails(additionalEmails)
        }

        /** Alias for calling [Builder.additionalEmails] with `additionalEmails.orElse(null)`. */
        fun additionalEmails(additionalEmails: Optional<List<String>>) =
            additionalEmails(additionalEmails.getOrNull())

        /**
         * Sets [Builder.additionalEmails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalEmails] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun additionalEmails(additionalEmails: JsonField<List<String>>) = apply {
            body.additionalEmails(additionalEmails)
        }

        /**
         * Adds a single [String] to [additionalEmails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdditionalEmail(additionalEmail: String) = apply {
            body.addAdditionalEmail(additionalEmail)
        }

        /**
         * Used to determine if invoices for this customer will automatically attempt to charge a
         * saved payment method, if available. This parameter defaults to `True` when a payment
         * provider is provided on customer creation.
         */
        fun autoCollection(autoCollection: Boolean?) = apply { body.autoCollection(autoCollection) }

        /**
         * Alias for [Builder.autoCollection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

        /** Alias for calling [Builder.autoCollection] with `autoCollection.orElse(null)`. */
        fun autoCollection(autoCollection: Optional<Boolean>) =
            autoCollection(autoCollection.getOrNull())

        /**
         * Sets [Builder.autoCollection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCollection] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            body.autoCollection(autoCollection)
        }

        fun billingAddress(billingAddress: AddressInput?) = apply {
            body.billingAddress(billingAddress)
        }

        /** Alias for calling [Builder.billingAddress] with `billingAddress.orElse(null)`. */
        fun billingAddress(billingAddress: Optional<AddressInput>) =
            billingAddress(billingAddress.getOrNull())

        /**
         * Sets [Builder.billingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddress] with a well-typed [AddressInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAddress(billingAddress: JsonField<AddressInput>) = apply {
            body.billingAddress(billingAddress)
        }

        /**
         * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
         * creation time, will be set at subscription creation time.
         */
        fun currency(currency: String?) = apply { body.currency(currency) }

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        fun emailDelivery(emailDelivery: Boolean?) = apply { body.emailDelivery(emailDelivery) }

        /**
         * Alias for [Builder.emailDelivery].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun emailDelivery(emailDelivery: Boolean) = emailDelivery(emailDelivery as Boolean?)

        /** Alias for calling [Builder.emailDelivery] with `emailDelivery.orElse(null)`. */
        fun emailDelivery(emailDelivery: Optional<Boolean>) =
            emailDelivery(emailDelivery.getOrNull())

        /**
         * Sets [Builder.emailDelivery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailDelivery] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailDelivery(emailDelivery: JsonField<Boolean>) = apply {
            body.emailDelivery(emailDelivery)
        }

        /**
         * An optional user-defined ID for this customer resource, used throughout the system as an
         * alias for this Customer. Use this field to identify a customer by an existing identifier
         * in your system.
         */
        fun externalCustomerId(externalCustomerId: String?) = apply {
            body.externalCustomerId(externalCustomerId)
        }

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
            body.externalCustomerId(externalCustomerId)
        }

        /** The hierarchical relationships for this customer. */
        fun hierarchy(hierarchy: CustomerHierarchyConfig?) = apply { body.hierarchy(hierarchy) }

        /** Alias for calling [Builder.hierarchy] with `hierarchy.orElse(null)`. */
        fun hierarchy(hierarchy: Optional<CustomerHierarchyConfig>) =
            hierarchy(hierarchy.getOrNull())

        /**
         * Sets [Builder.hierarchy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hierarchy] with a well-typed [CustomerHierarchyConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun hierarchy(hierarchy: JsonField<CustomerHierarchyConfig>) = apply {
            body.hierarchy(hierarchy)
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode, the connection must first be configured in the Orb webapp.
         */
        fun paymentProvider(paymentProvider: PaymentProvider?) = apply {
            body.paymentProvider(paymentProvider)
        }

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
            body.paymentProvider(paymentProvider)
        }

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This is used
         * for creating charges or invoices in the external system via Orb.
         */
        fun paymentProviderId(paymentProviderId: String?) = apply {
            body.paymentProviderId(paymentProviderId)
        }

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
            body.paymentProviderId(paymentProviderId)
        }

        fun reportingConfiguration(reportingConfiguration: NewReportingConfiguration?) = apply {
            body.reportingConfiguration(reportingConfiguration)
        }

        /**
         * Alias for calling [Builder.reportingConfiguration] with
         * `reportingConfiguration.orElse(null)`.
         */
        fun reportingConfiguration(reportingConfiguration: Optional<NewReportingConfiguration>) =
            reportingConfiguration(reportingConfiguration.getOrNull())

        /**
         * Sets [Builder.reportingConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportingConfiguration] with a well-typed
         * [NewReportingConfiguration] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun reportingConfiguration(reportingConfiguration: JsonField<NewReportingConfiguration>) =
            apply {
                body.reportingConfiguration(reportingConfiguration)
            }

        fun shippingAddress(shippingAddress: AddressInput?) = apply {
            body.shippingAddress(shippingAddress)
        }

        /** Alias for calling [Builder.shippingAddress] with `shippingAddress.orElse(null)`. */
        fun shippingAddress(shippingAddress: Optional<AddressInput>) =
            shippingAddress(shippingAddress.getOrNull())

        /**
         * Sets [Builder.shippingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shippingAddress] with a well-typed [AddressInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shippingAddress(shippingAddress: JsonField<AddressInput>) = apply {
            body.shippingAddress(shippingAddress)
        }

        fun taxConfiguration(taxConfiguration: TaxConfiguration?) = apply {
            body.taxConfiguration(taxConfiguration)
        }

        /** Alias for calling [Builder.taxConfiguration] with `taxConfiguration.orElse(null)`. */
        fun taxConfiguration(taxConfiguration: Optional<TaxConfiguration>) =
            taxConfiguration(taxConfiguration.getOrNull())

        /**
         * Sets [Builder.taxConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxConfiguration] with a well-typed [TaxConfiguration]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun taxConfiguration(taxConfiguration: JsonField<TaxConfiguration>) = apply {
            body.taxConfiguration(taxConfiguration)
        }

        /** Alias for calling [taxConfiguration] with `TaxConfiguration.ofAvalara(avalara)`. */
        fun taxConfiguration(avalara: NewAvalaraTaxConfiguration) = apply {
            body.taxConfiguration(avalara)
        }

        /**
         * Alias for calling [taxConfiguration] with the following:
         * ```java
         * NewAvalaraTaxConfiguration.builder()
         *     .taxProvider(NewAvalaraTaxConfiguration.TaxProvider.AVALARA)
         *     .taxExempt(taxExempt)
         *     .build()
         * ```
         */
        fun avalaraTaxConfiguration(taxExempt: Boolean) = apply {
            body.avalaraTaxConfiguration(taxExempt)
        }

        /** Alias for calling [taxConfiguration] with `TaxConfiguration.ofTaxjar(taxjar)`. */
        fun taxConfiguration(taxjar: NewTaxJarConfiguration) = apply {
            body.taxConfiguration(taxjar)
        }

        /**
         * Alias for calling [taxConfiguration] with the following:
         * ```java
         * NewTaxJarConfiguration.builder()
         *     .taxProvider(NewTaxJarConfiguration.TaxProvider.TAXJAR)
         *     .taxExempt(taxExempt)
         *     .build()
         * ```
         */
        fun taxjarTaxConfiguration(taxExempt: Boolean) = apply {
            body.taxjarTaxConfiguration(taxExempt)
        }

        /** Alias for calling [taxConfiguration] with `TaxConfiguration.ofSphere(sphere)`. */
        fun taxConfiguration(sphere: NewSphereConfiguration) = apply {
            body.taxConfiguration(sphere)
        }

        /**
         * Alias for calling [taxConfiguration] with the following:
         * ```java
         * NewSphereConfiguration.builder()
         *     .taxProvider(NewSphereConfiguration.TaxProvider.SPHERE)
         *     .taxExempt(taxExempt)
         *     .build()
         * ```
         */
        fun sphereTaxConfiguration(taxExempt: Boolean) = apply {
            body.sphereTaxConfiguration(taxExempt)
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
        fun taxId(taxId: CustomerTaxId?) = apply { body.taxId(taxId) }

        /** Alias for calling [Builder.taxId] with `taxId.orElse(null)`. */
        fun taxId(taxId: Optional<CustomerTaxId>) = taxId(taxId.getOrNull())

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [CustomerTaxId] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxId(taxId: JsonField<CustomerTaxId>) = apply { body.taxId(taxId) }

        /**
         * A timezone identifier from the IANA timezone database, such as `"America/Los_Angeles"`.
         * This defaults to your account's timezone if not set. This cannot be changed after
         * customer creation.
         */
        fun timezone(timezone: String?) = apply { body.timezone(timezone) }

        /** Alias for calling [Builder.timezone] with `timezone.orElse(null)`. */
        fun timezone(timezone: Optional<String>) = timezone(timezone.getOrNull())

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { body.timezone(timezone) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CustomerCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .email()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerCreateParams =
            CustomerCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val email: JsonField<String>,
        private val name: JsonField<String>,
        private val accountingSyncConfiguration: JsonField<NewAccountingSyncConfiguration>,
        private val additionalEmails: JsonField<List<String>>,
        private val autoCollection: JsonField<Boolean>,
        private val billingAddress: JsonField<AddressInput>,
        private val currency: JsonField<String>,
        private val emailDelivery: JsonField<Boolean>,
        private val externalCustomerId: JsonField<String>,
        private val hierarchy: JsonField<CustomerHierarchyConfig>,
        private val metadata: JsonField<Metadata>,
        private val paymentProvider: JsonField<PaymentProvider>,
        private val paymentProviderId: JsonField<String>,
        private val reportingConfiguration: JsonField<NewReportingConfiguration>,
        private val shippingAddress: JsonField<AddressInput>,
        private val taxConfiguration: JsonField<TaxConfiguration>,
        private val taxId: JsonField<CustomerTaxId>,
        private val timezone: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accounting_sync_configuration")
            @ExcludeMissing
            accountingSyncConfiguration: JsonField<NewAccountingSyncConfiguration> =
                JsonMissing.of(),
            @JsonProperty("additional_emails")
            @ExcludeMissing
            additionalEmails: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("auto_collection")
            @ExcludeMissing
            autoCollection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("billing_address")
            @ExcludeMissing
            billingAddress: JsonField<AddressInput> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email_delivery")
            @ExcludeMissing
            emailDelivery: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hierarchy")
            @ExcludeMissing
            hierarchy: JsonField<CustomerHierarchyConfig> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("payment_provider")
            @ExcludeMissing
            paymentProvider: JsonField<PaymentProvider> = JsonMissing.of(),
            @JsonProperty("payment_provider_id")
            @ExcludeMissing
            paymentProviderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reporting_configuration")
            @ExcludeMissing
            reportingConfiguration: JsonField<NewReportingConfiguration> = JsonMissing.of(),
            @JsonProperty("shipping_address")
            @ExcludeMissing
            shippingAddress: JsonField<AddressInput> = JsonMissing.of(),
            @JsonProperty("tax_configuration")
            @ExcludeMissing
            taxConfiguration: JsonField<TaxConfiguration> = JsonMissing.of(),
            @JsonProperty("tax_id")
            @ExcludeMissing
            taxId: JsonField<CustomerTaxId> = JsonMissing.of(),
            @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        ) : this(
            email,
            name,
            accountingSyncConfiguration,
            additionalEmails,
            autoCollection,
            billingAddress,
            currency,
            emailDelivery,
            externalCustomerId,
            hierarchy,
            metadata,
            paymentProvider,
            paymentProviderId,
            reportingConfiguration,
            shippingAddress,
            taxConfiguration,
            taxId,
            timezone,
            mutableMapOf(),
        )

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment through a
         * payment gateway, this email will be used for any automatically issued receipts.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * The full name of the customer
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountingSyncConfiguration(): Optional<NewAccountingSyncConfiguration> =
            accountingSyncConfiguration.getOptional("accounting_sync_configuration")

        /**
         * Additional email addresses for this customer. If populated, these email addresses will be
         * CC'd for customer communications.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun additionalEmails(): Optional<List<String>> =
            additionalEmails.getOptional("additional_emails")

        /**
         * Used to determine if invoices for this customer will automatically attempt to charge a
         * saved payment method, if available. This parameter defaults to `True` when a payment
         * provider is provided on customer creation.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoCollection(): Optional<Boolean> = autoCollection.getOptional("auto_collection")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingAddress(): Optional<AddressInput> = billingAddress.getOptional("billing_address")

        /**
         * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
         * creation time, will be set at subscription creation time.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emailDelivery(): Optional<Boolean> = emailDelivery.getOptional("email_delivery")

        /**
         * An optional user-defined ID for this customer resource, used throughout the system as an
         * alias for this Customer. Use this field to identify a customer by an existing identifier
         * in your system.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalCustomerId(): Optional<String> =
            externalCustomerId.getOptional("external_customer_id")

        /**
         * The hierarchical relationships for this customer.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hierarchy(): Optional<CustomerHierarchyConfig> = hierarchy.getOptional("hierarchy")

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode, the connection must first be configured in the Orb webapp.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentProvider(): Optional<PaymentProvider> =
            paymentProvider.getOptional("payment_provider")

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This is used
         * for creating charges or invoices in the external system via Orb.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentProviderId(): Optional<String> =
            paymentProviderId.getOptional("payment_provider_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reportingConfiguration(): Optional<NewReportingConfiguration> =
            reportingConfiguration.getOptional("reporting_configuration")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shippingAddress(): Optional<AddressInput> =
            shippingAddress.getOptional("shipping_address")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun taxConfiguration(): Optional<TaxConfiguration> =
            taxConfiguration.getOptional("tax_configuration")

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
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun taxId(): Optional<CustomerTaxId> = taxId.getOptional("tax_id")

        /**
         * A timezone identifier from the IANA timezone database, such as `"America/Los_Angeles"`.
         * This defaults to your account's timezone if not set. This cannot be changed after
         * customer creation.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timezone(): Optional<String> = timezone.getOptional("timezone")

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [accountingSyncConfiguration].
         *
         * Unlike [accountingSyncConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("accounting_sync_configuration")
        @ExcludeMissing
        fun _accountingSyncConfiguration(): JsonField<NewAccountingSyncConfiguration> =
            accountingSyncConfiguration

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
         * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_collection")
        @ExcludeMissing
        fun _autoCollection(): JsonField<Boolean> = autoCollection

        /**
         * Returns the raw JSON value of [billingAddress].
         *
         * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_address")
        @ExcludeMissing
        fun _billingAddress(): JsonField<AddressInput> = billingAddress

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [emailDelivery].
         *
         * Unlike [emailDelivery], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("email_delivery")
        @ExcludeMissing
        fun _emailDelivery(): JsonField<Boolean> = emailDelivery

        /**
         * Returns the raw JSON value of [externalCustomerId].
         *
         * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        /**
         * Returns the raw JSON value of [hierarchy].
         *
         * Unlike [hierarchy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hierarchy")
        @ExcludeMissing
        fun _hierarchy(): JsonField<CustomerHierarchyConfig> = hierarchy

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [paymentProvider].
         *
         * Unlike [paymentProvider], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [reportingConfiguration].
         *
         * Unlike [reportingConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reporting_configuration")
        @ExcludeMissing
        fun _reportingConfiguration(): JsonField<NewReportingConfiguration> = reportingConfiguration

        /**
         * Returns the raw JSON value of [shippingAddress].
         *
         * Unlike [shippingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_address")
        @ExcludeMissing
        fun _shippingAddress(): JsonField<AddressInput> = shippingAddress

        /**
         * Returns the raw JSON value of [taxConfiguration].
         *
         * Unlike [taxConfiguration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_configuration")
        @ExcludeMissing
        fun _taxConfiguration(): JsonField<TaxConfiguration> = taxConfiguration

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .email()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var email: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var accountingSyncConfiguration: JsonField<NewAccountingSyncConfiguration> =
                JsonMissing.of()
            private var additionalEmails: JsonField<MutableList<String>>? = null
            private var autoCollection: JsonField<Boolean> = JsonMissing.of()
            private var billingAddress: JsonField<AddressInput> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var emailDelivery: JsonField<Boolean> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var hierarchy: JsonField<CustomerHierarchyConfig> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var paymentProvider: JsonField<PaymentProvider> = JsonMissing.of()
            private var paymentProviderId: JsonField<String> = JsonMissing.of()
            private var reportingConfiguration: JsonField<NewReportingConfiguration> =
                JsonMissing.of()
            private var shippingAddress: JsonField<AddressInput> = JsonMissing.of()
            private var taxConfiguration: JsonField<TaxConfiguration> = JsonMissing.of()
            private var taxId: JsonField<CustomerTaxId> = JsonMissing.of()
            private var timezone: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                email = body.email
                name = body.name
                accountingSyncConfiguration = body.accountingSyncConfiguration
                additionalEmails = body.additionalEmails.map { it.toMutableList() }
                autoCollection = body.autoCollection
                billingAddress = body.billingAddress
                currency = body.currency
                emailDelivery = body.emailDelivery
                externalCustomerId = body.externalCustomerId
                hierarchy = body.hierarchy
                metadata = body.metadata
                paymentProvider = body.paymentProvider
                paymentProviderId = body.paymentProviderId
                reportingConfiguration = body.reportingConfiguration
                shippingAddress = body.shippingAddress
                taxConfiguration = body.taxConfiguration
                taxId = body.taxId
                timezone = body.timezone
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A valid customer email, to be used for notifications. When Orb triggers payment
             * through a payment gateway, this email will be used for any automatically issued
             * receipts.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** The full name of the customer */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun accountingSyncConfiguration(
                accountingSyncConfiguration: NewAccountingSyncConfiguration?
            ) = accountingSyncConfiguration(JsonField.ofNullable(accountingSyncConfiguration))

            /**
             * Alias for calling [Builder.accountingSyncConfiguration] with
             * `accountingSyncConfiguration.orElse(null)`.
             */
            fun accountingSyncConfiguration(
                accountingSyncConfiguration: Optional<NewAccountingSyncConfiguration>
            ) = accountingSyncConfiguration(accountingSyncConfiguration.getOrNull())

            /**
             * Sets [Builder.accountingSyncConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountingSyncConfiguration] with a well-typed
             * [NewAccountingSyncConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun accountingSyncConfiguration(
                accountingSyncConfiguration: JsonField<NewAccountingSyncConfiguration>
            ) = apply { this.accountingSyncConfiguration = accountingSyncConfiguration }

            /**
             * Additional email addresses for this customer. If populated, these email addresses
             * will be CC'd for customer communications.
             */
            fun additionalEmails(additionalEmails: List<String>?) =
                additionalEmails(JsonField.ofNullable(additionalEmails))

            /**
             * Alias for calling [Builder.additionalEmails] with `additionalEmails.orElse(null)`.
             */
            fun additionalEmails(additionalEmails: Optional<List<String>>) =
                additionalEmails(additionalEmails.getOrNull())

            /**
             * Sets [Builder.additionalEmails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.additionalEmails] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /**
             * Used to determine if invoices for this customer will automatically attempt to charge
             * a saved payment method, if available. This parameter defaults to `True` when a
             * payment provider is provided on customer creation.
             */
            fun autoCollection(autoCollection: Boolean?) =
                autoCollection(JsonField.ofNullable(autoCollection))

            /**
             * Alias for [Builder.autoCollection].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

            /** Alias for calling [Builder.autoCollection] with `autoCollection.orElse(null)`. */
            fun autoCollection(autoCollection: Optional<Boolean>) =
                autoCollection(autoCollection.getOrNull())

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

            fun billingAddress(billingAddress: AddressInput?) =
                billingAddress(JsonField.ofNullable(billingAddress))

            /** Alias for calling [Builder.billingAddress] with `billingAddress.orElse(null)`. */
            fun billingAddress(billingAddress: Optional<AddressInput>) =
                billingAddress(billingAddress.getOrNull())

            /**
             * Sets [Builder.billingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingAddress] with a well-typed [AddressInput]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingAddress(billingAddress: JsonField<AddressInput>) = apply {
                this.billingAddress = billingAddress
            }

            /**
             * An ISO 4217 currency string used for the customer's invoices and balance. If not set
             * at creation time, will be set at subscription creation time.
             */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
            fun currency(currency: Optional<String>) = currency(currency.getOrNull())

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun emailDelivery(emailDelivery: Boolean?) =
                emailDelivery(JsonField.ofNullable(emailDelivery))

            /**
             * Alias for [Builder.emailDelivery].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun emailDelivery(emailDelivery: Boolean) = emailDelivery(emailDelivery as Boolean?)

            /** Alias for calling [Builder.emailDelivery] with `emailDelivery.orElse(null)`. */
            fun emailDelivery(emailDelivery: Optional<Boolean>) =
                emailDelivery(emailDelivery.getOrNull())

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

            /**
             * An optional user-defined ID for this customer resource, used throughout the system as
             * an alias for this Customer. Use this field to identify a customer by an existing
             * identifier in your system.
             */
            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            /**
             * Alias for calling [Builder.externalCustomerId] with
             * `externalCustomerId.orElse(null)`.
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
            fun hierarchy(hierarchy: CustomerHierarchyConfig?) =
                hierarchy(JsonField.ofNullable(hierarchy))

            /** Alias for calling [Builder.hierarchy] with `hierarchy.orElse(null)`. */
            fun hierarchy(hierarchy: Optional<CustomerHierarchyConfig>) =
                hierarchy(hierarchy.getOrNull())

            /**
             * Sets [Builder.hierarchy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hierarchy] with a well-typed
             * [CustomerHierarchyConfig] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun hierarchy(hierarchy: JsonField<CustomerHierarchyConfig>) = apply {
                this.hierarchy = hierarchy
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * This is used for creating charges or invoices in an external system via Orb. When not
             * in test mode, the connection must first be configured in the Orb webapp.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentProvider(paymentProvider: JsonField<PaymentProvider>) = apply {
                this.paymentProvider = paymentProvider
            }

            /**
             * The ID of this customer in an external payments solution, such as Stripe. This is
             * used for creating charges or invoices in the external system via Orb.
             */
            fun paymentProviderId(paymentProviderId: String?) =
                paymentProviderId(JsonField.ofNullable(paymentProviderId))

            /**
             * Alias for calling [Builder.paymentProviderId] with `paymentProviderId.orElse(null)`.
             */
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

            fun reportingConfiguration(reportingConfiguration: NewReportingConfiguration?) =
                reportingConfiguration(JsonField.ofNullable(reportingConfiguration))

            /**
             * Alias for calling [Builder.reportingConfiguration] with
             * `reportingConfiguration.orElse(null)`.
             */
            fun reportingConfiguration(
                reportingConfiguration: Optional<NewReportingConfiguration>
            ) = reportingConfiguration(reportingConfiguration.getOrNull())

            /**
             * Sets [Builder.reportingConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportingConfiguration] with a well-typed
             * [NewReportingConfiguration] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun reportingConfiguration(
                reportingConfiguration: JsonField<NewReportingConfiguration>
            ) = apply { this.reportingConfiguration = reportingConfiguration }

            fun shippingAddress(shippingAddress: AddressInput?) =
                shippingAddress(JsonField.ofNullable(shippingAddress))

            /** Alias for calling [Builder.shippingAddress] with `shippingAddress.orElse(null)`. */
            fun shippingAddress(shippingAddress: Optional<AddressInput>) =
                shippingAddress(shippingAddress.getOrNull())

            /**
             * Sets [Builder.shippingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingAddress] with a well-typed [AddressInput]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun shippingAddress(shippingAddress: JsonField<AddressInput>) = apply {
                this.shippingAddress = shippingAddress
            }

            fun taxConfiguration(taxConfiguration: TaxConfiguration?) =
                taxConfiguration(JsonField.ofNullable(taxConfiguration))

            /**
             * Alias for calling [Builder.taxConfiguration] with `taxConfiguration.orElse(null)`.
             */
            fun taxConfiguration(taxConfiguration: Optional<TaxConfiguration>) =
                taxConfiguration(taxConfiguration.getOrNull())

            /**
             * Sets [Builder.taxConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxConfiguration] with a well-typed
             * [TaxConfiguration] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun taxConfiguration(taxConfiguration: JsonField<TaxConfiguration>) = apply {
                this.taxConfiguration = taxConfiguration
            }

            /** Alias for calling [taxConfiguration] with `TaxConfiguration.ofAvalara(avalara)`. */
            fun taxConfiguration(avalara: NewAvalaraTaxConfiguration) =
                taxConfiguration(TaxConfiguration.ofAvalara(avalara))

            /**
             * Alias for calling [taxConfiguration] with the following:
             * ```java
             * NewAvalaraTaxConfiguration.builder()
             *     .taxProvider(NewAvalaraTaxConfiguration.TaxProvider.AVALARA)
             *     .taxExempt(taxExempt)
             *     .build()
             * ```
             */
            fun avalaraTaxConfiguration(taxExempt: Boolean) =
                taxConfiguration(
                    NewAvalaraTaxConfiguration.builder()
                        .taxProvider(NewAvalaraTaxConfiguration.TaxProvider.AVALARA)
                        .taxExempt(taxExempt)
                        .build()
                )

            /** Alias for calling [taxConfiguration] with `TaxConfiguration.ofTaxjar(taxjar)`. */
            fun taxConfiguration(taxjar: NewTaxJarConfiguration) =
                taxConfiguration(TaxConfiguration.ofTaxjar(taxjar))

            /**
             * Alias for calling [taxConfiguration] with the following:
             * ```java
             * NewTaxJarConfiguration.builder()
             *     .taxProvider(NewTaxJarConfiguration.TaxProvider.TAXJAR)
             *     .taxExempt(taxExempt)
             *     .build()
             * ```
             */
            fun taxjarTaxConfiguration(taxExempt: Boolean) =
                taxConfiguration(
                    NewTaxJarConfiguration.builder()
                        .taxProvider(NewTaxJarConfiguration.TaxProvider.TAXJAR)
                        .taxExempt(taxExempt)
                        .build()
                )

            /** Alias for calling [taxConfiguration] with `TaxConfiguration.ofSphere(sphere)`. */
            fun taxConfiguration(sphere: NewSphereConfiguration) =
                taxConfiguration(TaxConfiguration.ofSphere(sphere))

            /**
             * Alias for calling [taxConfiguration] with the following:
             * ```java
             * NewSphereConfiguration.builder()
             *     .taxProvider(NewSphereConfiguration.TaxProvider.SPHERE)
             *     .taxExempt(taxExempt)
             *     .build()
             * ```
             */
            fun sphereTaxConfiguration(taxExempt: Boolean) =
                taxConfiguration(
                    NewSphereConfiguration.builder()
                        .taxProvider(NewSphereConfiguration.TaxProvider.SPHERE)
                        .taxExempt(taxExempt)
                        .build()
                )

            /**
             * Tax IDs are commonly required to be displayed on customer invoices, which are added
             * to the headers of invoices.
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
             * You should usually call [Builder.taxId] with a well-typed [CustomerTaxId] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxId(taxId: JsonField<CustomerTaxId>) = apply { this.taxId = taxId }

            /**
             * A timezone identifier from the IANA timezone database, such as
             * `"America/Los_Angeles"`. This defaults to your account's timezone if not set. This
             * cannot be changed after customer creation.
             */
            fun timezone(timezone: String?) = timezone(JsonField.ofNullable(timezone))

            /** Alias for calling [Builder.timezone] with `timezone.orElse(null)`. */
            fun timezone(timezone: Optional<String>) = timezone(timezone.getOrNull())

            /**
             * Sets [Builder.timezone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .email()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("email", email),
                    checkRequired("name", name),
                    accountingSyncConfiguration,
                    (additionalEmails ?: JsonMissing.of()).map { it.toImmutable() },
                    autoCollection,
                    billingAddress,
                    currency,
                    emailDelivery,
                    externalCustomerId,
                    hierarchy,
                    metadata,
                    paymentProvider,
                    paymentProviderId,
                    reportingConfiguration,
                    shippingAddress,
                    taxConfiguration,
                    taxId,
                    timezone,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            email()
            name()
            accountingSyncConfiguration().ifPresent { it.validate() }
            additionalEmails()
            autoCollection()
            billingAddress().ifPresent { it.validate() }
            currency()
            emailDelivery()
            externalCustomerId()
            hierarchy().ifPresent { it.validate() }
            metadata().ifPresent { it.validate() }
            paymentProvider().ifPresent { it.validate() }
            paymentProviderId()
            reportingConfiguration().ifPresent { it.validate() }
            shippingAddress().ifPresent { it.validate() }
            taxConfiguration().ifPresent { it.validate() }
            taxId().ifPresent { it.validate() }
            timezone()
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
            (if (email.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (accountingSyncConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (additionalEmails.asKnown().getOrNull()?.size ?: 0) +
                (if (autoCollection.asKnown().isPresent) 1 else 0) +
                (billingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (emailDelivery.asKnown().isPresent) 1 else 0) +
                (if (externalCustomerId.asKnown().isPresent) 1 else 0) +
                (hierarchy.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (paymentProvider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (paymentProviderId.asKnown().isPresent) 1 else 0) +
                (reportingConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (shippingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (taxConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (taxId.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timezone.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && email == other.email && name == other.name && accountingSyncConfiguration == other.accountingSyncConfiguration && additionalEmails == other.additionalEmails && autoCollection == other.autoCollection && billingAddress == other.billingAddress && currency == other.currency && emailDelivery == other.emailDelivery && externalCustomerId == other.externalCustomerId && hierarchy == other.hierarchy && metadata == other.metadata && paymentProvider == other.paymentProvider && paymentProviderId == other.paymentProviderId && reportingConfiguration == other.reportingConfiguration && shippingAddress == other.shippingAddress && taxConfiguration == other.taxConfiguration && taxId == other.taxId && timezone == other.timezone && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(email, name, accountingSyncConfiguration, additionalEmails, autoCollection, billingAddress, currency, emailDelivery, externalCustomerId, hierarchy, metadata, paymentProvider, paymentProviderId, reportingConfiguration, shippingAddress, taxConfiguration, taxId, timezone, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{email=$email, name=$name, accountingSyncConfiguration=$accountingSyncConfiguration, additionalEmails=$additionalEmails, autoCollection=$autoCollection, billingAddress=$billingAddress, currency=$currency, emailDelivery=$emailDelivery, externalCustomerId=$externalCustomerId, hierarchy=$hierarchy, metadata=$metadata, paymentProvider=$paymentProvider, paymentProviderId=$paymentProviderId, reportingConfiguration=$reportingConfiguration, shippingAddress=$shippingAddress, taxConfiguration=$taxConfiguration, taxId=$taxId, timezone=$timezone, additionalProperties=$additionalProperties}"
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
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

    @JsonDeserialize(using = TaxConfiguration.Deserializer::class)
    @JsonSerialize(using = TaxConfiguration.Serializer::class)
    class TaxConfiguration
    private constructor(
        private val avalara: NewAvalaraTaxConfiguration? = null,
        private val taxjar: NewTaxJarConfiguration? = null,
        private val sphere: NewSphereConfiguration? = null,
        private val _json: JsonValue? = null,
    ) {

        fun avalara(): Optional<NewAvalaraTaxConfiguration> = Optional.ofNullable(avalara)

        fun taxjar(): Optional<NewTaxJarConfiguration> = Optional.ofNullable(taxjar)

        fun sphere(): Optional<NewSphereConfiguration> = Optional.ofNullable(sphere)

        fun isAvalara(): Boolean = avalara != null

        fun isTaxjar(): Boolean = taxjar != null

        fun isSphere(): Boolean = sphere != null

        fun asAvalara(): NewAvalaraTaxConfiguration = avalara.getOrThrow("avalara")

        fun asTaxjar(): NewTaxJarConfiguration = taxjar.getOrThrow("taxjar")

        fun asSphere(): NewSphereConfiguration = sphere.getOrThrow("sphere")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                avalara != null -> visitor.visitAvalara(avalara)
                taxjar != null -> visitor.visitTaxjar(taxjar)
                sphere != null -> visitor.visitSphere(sphere)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): TaxConfiguration = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAvalara(avalara: NewAvalaraTaxConfiguration) {
                        avalara.validate()
                    }

                    override fun visitTaxjar(taxjar: NewTaxJarConfiguration) {
                        taxjar.validate()
                    }

                    override fun visitSphere(sphere: NewSphereConfiguration) {
                        sphere.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitAvalara(avalara: NewAvalaraTaxConfiguration) =
                        avalara.validity()

                    override fun visitTaxjar(taxjar: NewTaxJarConfiguration) = taxjar.validity()

                    override fun visitSphere(sphere: NewSphereConfiguration) = sphere.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaxConfiguration && avalara == other.avalara && taxjar == other.taxjar && sphere == other.sphere /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(avalara, taxjar, sphere) /* spotless:on */

        override fun toString(): String =
            when {
                avalara != null -> "TaxConfiguration{avalara=$avalara}"
                taxjar != null -> "TaxConfiguration{taxjar=$taxjar}"
                sphere != null -> "TaxConfiguration{sphere=$sphere}"
                _json != null -> "TaxConfiguration{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TaxConfiguration")
            }

        companion object {

            @JvmStatic
            fun ofAvalara(avalara: NewAvalaraTaxConfiguration) = TaxConfiguration(avalara = avalara)

            @JvmStatic
            fun ofTaxjar(taxjar: NewTaxJarConfiguration) = TaxConfiguration(taxjar = taxjar)

            @JvmStatic
            fun ofSphere(sphere: NewSphereConfiguration) = TaxConfiguration(sphere = sphere)
        }

        /**
         * An interface that defines how to map each variant of [TaxConfiguration] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitAvalara(avalara: NewAvalaraTaxConfiguration): T

            fun visitTaxjar(taxjar: NewTaxJarConfiguration): T

            fun visitSphere(sphere: NewSphereConfiguration): T

            /**
             * Maps an unknown variant of [TaxConfiguration] to a value of type [T].
             *
             * An instance of [TaxConfiguration] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown TaxConfiguration: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<TaxConfiguration>(TaxConfiguration::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TaxConfiguration {
                val json = JsonValue.fromJsonNode(node)
                val taxProvider =
                    json.asObject().getOrNull()?.get("tax_provider")?.asString()?.getOrNull()

                when (taxProvider) {
                    "avalara" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewAvalaraTaxConfiguration>())
                            ?.let { TaxConfiguration(avalara = it, _json = json) }
                            ?: TaxConfiguration(_json = json)
                    }
                    "taxjar" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewTaxJarConfiguration>())?.let {
                            TaxConfiguration(taxjar = it, _json = json)
                        } ?: TaxConfiguration(_json = json)
                    }
                    "sphere" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewSphereConfiguration>())?.let {
                            TaxConfiguration(sphere = it, _json = json)
                        } ?: TaxConfiguration(_json = json)
                    }
                }

                return TaxConfiguration(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<TaxConfiguration>(TaxConfiguration::class) {

            override fun serialize(
                value: TaxConfiguration,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.avalara != null -> generator.writeObject(value.avalara)
                    value.taxjar != null -> generator.writeObject(value.taxjar)
                    value.sphere != null -> generator.writeObject(value.sphere)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TaxConfiguration")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
