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
 * This endpoint is used to update customer details given an `external_customer_id` (see
 * [Customer ID Aliases](/events-and-metrics/customer-aliases)). Note that the resource and
 * semantics of this endpoint exactly mirror [Update Customer](update-customer).
 */
class CustomerUpdateByExternalIdParams
private constructor(
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun accountingSyncConfiguration(): Optional<AccountingSyncConfiguration> =
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
    fun billingAddress(): Optional<BillingAddress> = body.billingAddress()

    /**
     * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
     * creation time, will be set at subscription creation time.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currency(): Optional<String> = body.currency()

    /**
     * A valid customer email, to be used for invoicing and notifications.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun email(): Optional<String> = body.email()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun emailDelivery(): Optional<Boolean> = body.emailDelivery()

    /**
     * The external customer ID. This can only be set if empty and the customer has no past or
     * current subscriptions.
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
    fun hierarchy(): Optional<Hierarchy> = body.hierarchy()

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
     * The full name of the customer
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * This is used for creating charges or invoices in an external system via Orb. When not in test
     * mode:
     * - the connection must first be configured in the Orb webapp.
     * - if the provider is an invoicing provider (`stripe_invoice`, `quickbooks`, `bill.com`,
     *   `netsuite`), any product mappings must first be configured with the Orb team.
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
    fun reportingConfiguration(): Optional<ReportingConfiguration> = body.reportingConfiguration()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun shippingAddress(): Optional<ShippingAddress> = body.shippingAddress()

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
    fun taxId(): Optional<TaxId> = body.taxId()

    /**
     * Returns the raw JSON value of [accountingSyncConfiguration].
     *
     * Unlike [accountingSyncConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _accountingSyncConfiguration(): JsonField<AccountingSyncConfiguration> =
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
    fun _billingAddress(): JsonField<BillingAddress> = body._billingAddress()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

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
    fun _hierarchy(): JsonField<Hierarchy> = body._hierarchy()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

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
    fun _reportingConfiguration(): JsonField<ReportingConfiguration> =
        body._reportingConfiguration()

    /**
     * Returns the raw JSON value of [shippingAddress].
     *
     * Unlike [shippingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shippingAddress(): JsonField<ShippingAddress> = body._shippingAddress()

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
    fun _taxId(): JsonField<TaxId> = body._taxId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerUpdateByExternalIdParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerUpdateByExternalIdParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerUpdateByExternalIdParams: CustomerUpdateByExternalIdParams) =
            apply {
                id = customerUpdateByExternalIdParams.id
                body = customerUpdateByExternalIdParams.body.toBuilder()
                additionalHeaders = customerUpdateByExternalIdParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    customerUpdateByExternalIdParams.additionalQueryParams.toBuilder()
            }

        fun id(id: String) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountingSyncConfiguration]
         * - [additionalEmails]
         * - [autoCollection]
         * - [billingAddress]
         * - [currency]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun accountingSyncConfiguration(accountingSyncConfiguration: AccountingSyncConfiguration?) =
            apply {
                body.accountingSyncConfiguration(accountingSyncConfiguration)
            }

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

        fun billingAddress(billingAddress: BillingAddress?) = apply {
            body.billingAddress(billingAddress)
        }

        /** Alias for calling [Builder.billingAddress] with `billingAddress.orElse(null)`. */
        fun billingAddress(billingAddress: Optional<BillingAddress>) =
            billingAddress(billingAddress.getOrNull())

        /**
         * Sets [Builder.billingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
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

        /** A valid customer email, to be used for invoicing and notifications. */
        fun email(email: String?) = apply { body.email(email) }

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

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
         * The external customer ID. This can only be set if empty and the customer has no past or
         * current subscriptions.
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
        fun hierarchy(hierarchy: Hierarchy?) = apply { body.hierarchy(hierarchy) }

        /** Alias for calling [Builder.hierarchy] with `hierarchy.orElse(null)`. */
        fun hierarchy(hierarchy: Optional<Hierarchy>) = hierarchy(hierarchy.getOrNull())

        /**
         * Sets [Builder.hierarchy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hierarchy] with a well-typed [Hierarchy] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hierarchy(hierarchy: JsonField<Hierarchy>) = apply { body.hierarchy(hierarchy) }

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

        /** The full name of the customer */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode:
         * - the connection must first be configured in the Orb webapp.
         * - if the provider is an invoicing provider (`stripe_invoice`, `quickbooks`, `bill.com`,
         *   `netsuite`), any product mappings must first be configured with the Orb team.
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

        fun reportingConfiguration(reportingConfiguration: ReportingConfiguration?) = apply {
            body.reportingConfiguration(reportingConfiguration)
        }

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
                body.reportingConfiguration(reportingConfiguration)
            }

        fun shippingAddress(shippingAddress: ShippingAddress?) = apply {
            body.shippingAddress(shippingAddress)
        }

        /** Alias for calling [Builder.shippingAddress] with `shippingAddress.orElse(null)`. */
        fun shippingAddress(shippingAddress: Optional<ShippingAddress>) =
            shippingAddress(shippingAddress.getOrNull())

        /**
         * Sets [Builder.shippingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shippingAddress] with a well-typed [ShippingAddress]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun shippingAddress(shippingAddress: JsonField<ShippingAddress>) = apply {
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

        /**
         * Alias for calling [taxConfiguration] with `TaxConfiguration.ofNewAvalara(newAvalara)`.
         */
        fun taxConfiguration(newAvalara: TaxConfiguration.NewAvalaraTaxConfiguration) = apply {
            body.taxConfiguration(newAvalara)
        }

        /**
         * Alias for calling [taxConfiguration] with the following:
         * ```java
         * TaxConfiguration.NewAvalaraTaxConfiguration.builder()
         *     .taxExempt(taxExempt)
         *     .build()
         * ```
         */
        fun newAvalaraTaxConfiguration(taxExempt: Boolean) = apply {
            body.newAvalaraTaxConfiguration(taxExempt)
        }

        /** Alias for calling [taxConfiguration] with `TaxConfiguration.ofNewTaxJar(newTaxJar)`. */
        fun taxConfiguration(newTaxJar: TaxConfiguration.NewTaxJarConfiguration) = apply {
            body.taxConfiguration(newTaxJar)
        }

        /**
         * Alias for calling [taxConfiguration] with the following:
         * ```java
         * TaxConfiguration.NewTaxJarConfiguration.builder()
         *     .taxExempt(taxExempt)
         *     .build()
         * ```
         */
        fun newTaxJarTaxConfiguration(taxExempt: Boolean) = apply {
            body.newTaxJarTaxConfiguration(taxExempt)
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
        fun taxId(taxId: TaxId?) = apply { body.taxId(taxId) }

        /** Alias for calling [Builder.taxId] with `taxId.orElse(null)`. */
        fun taxId(taxId: Optional<TaxId>) = taxId(taxId.getOrNull())

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [TaxId] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxId(taxId: JsonField<TaxId>) = apply { body.taxId(taxId) }

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
         * Returns an immutable instance of [CustomerUpdateByExternalIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerUpdateByExternalIdParams =
            CustomerUpdateByExternalIdParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val accountingSyncConfiguration: JsonField<AccountingSyncConfiguration>,
        private val additionalEmails: JsonField<List<String>>,
        private val autoCollection: JsonField<Boolean>,
        private val billingAddress: JsonField<BillingAddress>,
        private val currency: JsonField<String>,
        private val email: JsonField<String>,
        private val emailDelivery: JsonField<Boolean>,
        private val externalCustomerId: JsonField<String>,
        private val hierarchy: JsonField<Hierarchy>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val paymentProvider: JsonField<PaymentProvider>,
        private val paymentProviderId: JsonField<String>,
        private val reportingConfiguration: JsonField<ReportingConfiguration>,
        private val shippingAddress: JsonField<ShippingAddress>,
        private val taxConfiguration: JsonField<TaxConfiguration>,
        private val taxId: JsonField<TaxId>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accounting_sync_configuration")
            @ExcludeMissing
            accountingSyncConfiguration: JsonField<AccountingSyncConfiguration> = JsonMissing.of(),
            @JsonProperty("additional_emails")
            @ExcludeMissing
            additionalEmails: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("auto_collection")
            @ExcludeMissing
            autoCollection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("billing_address")
            @ExcludeMissing
            billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email_delivery")
            @ExcludeMissing
            emailDelivery: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hierarchy")
            @ExcludeMissing
            hierarchy: JsonField<Hierarchy> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_provider")
            @ExcludeMissing
            paymentProvider: JsonField<PaymentProvider> = JsonMissing.of(),
            @JsonProperty("payment_provider_id")
            @ExcludeMissing
            paymentProviderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reporting_configuration")
            @ExcludeMissing
            reportingConfiguration: JsonField<ReportingConfiguration> = JsonMissing.of(),
            @JsonProperty("shipping_address")
            @ExcludeMissing
            shippingAddress: JsonField<ShippingAddress> = JsonMissing.of(),
            @JsonProperty("tax_configuration")
            @ExcludeMissing
            taxConfiguration: JsonField<TaxConfiguration> = JsonMissing.of(),
            @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<TaxId> = JsonMissing.of(),
        ) : this(
            accountingSyncConfiguration,
            additionalEmails,
            autoCollection,
            billingAddress,
            currency,
            email,
            emailDelivery,
            externalCustomerId,
            hierarchy,
            metadata,
            name,
            paymentProvider,
            paymentProviderId,
            reportingConfiguration,
            shippingAddress,
            taxConfiguration,
            taxId,
            mutableMapOf(),
        )

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountingSyncConfiguration(): Optional<AccountingSyncConfiguration> =
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
        fun billingAddress(): Optional<BillingAddress> =
            billingAddress.getOptional("billing_address")

        /**
         * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
         * creation time, will be set at subscription creation time.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * A valid customer email, to be used for invoicing and notifications.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emailDelivery(): Optional<Boolean> = emailDelivery.getOptional("email_delivery")

        /**
         * The external customer ID. This can only be set if empty and the customer has no past or
         * current subscriptions.
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
        fun hierarchy(): Optional<Hierarchy> = hierarchy.getOptional("hierarchy")

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
         * The full name of the customer
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode:
         * - the connection must first be configured in the Orb webapp.
         * - if the provider is an invoicing provider (`stripe_invoice`, `quickbooks`, `bill.com`,
         *   `netsuite`), any product mappings must first be configured with the Orb team.
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
        fun reportingConfiguration(): Optional<ReportingConfiguration> =
            reportingConfiguration.getOptional("reporting_configuration")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shippingAddress(): Optional<ShippingAddress> =
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
        fun taxId(): Optional<TaxId> = taxId.getOptional("tax_id")

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
        fun _billingAddress(): JsonField<BillingAddress> = billingAddress

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
        fun _hierarchy(): JsonField<Hierarchy> = hierarchy

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
        fun _reportingConfiguration(): JsonField<ReportingConfiguration> = reportingConfiguration

        /**
         * Returns the raw JSON value of [shippingAddress].
         *
         * Unlike [shippingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_address")
        @ExcludeMissing
        fun _shippingAddress(): JsonField<ShippingAddress> = shippingAddress

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
        @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<TaxId> = taxId

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountingSyncConfiguration: JsonField<AccountingSyncConfiguration> =
                JsonMissing.of()
            private var additionalEmails: JsonField<MutableList<String>>? = null
            private var autoCollection: JsonField<Boolean> = JsonMissing.of()
            private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var emailDelivery: JsonField<Boolean> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var hierarchy: JsonField<Hierarchy> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var paymentProvider: JsonField<PaymentProvider> = JsonMissing.of()
            private var paymentProviderId: JsonField<String> = JsonMissing.of()
            private var reportingConfiguration: JsonField<ReportingConfiguration> = JsonMissing.of()
            private var shippingAddress: JsonField<ShippingAddress> = JsonMissing.of()
            private var taxConfiguration: JsonField<TaxConfiguration> = JsonMissing.of()
            private var taxId: JsonField<TaxId> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountingSyncConfiguration = body.accountingSyncConfiguration
                additionalEmails = body.additionalEmails.map { it.toMutableList() }
                autoCollection = body.autoCollection
                billingAddress = body.billingAddress
                currency = body.currency
                email = body.email
                emailDelivery = body.emailDelivery
                externalCustomerId = body.externalCustomerId
                hierarchy = body.hierarchy
                metadata = body.metadata
                name = body.name
                paymentProvider = body.paymentProvider
                paymentProviderId = body.paymentProviderId
                reportingConfiguration = body.reportingConfiguration
                shippingAddress = body.shippingAddress
                taxConfiguration = body.taxConfiguration
                taxId = body.taxId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun accountingSyncConfiguration(
                accountingSyncConfiguration: AccountingSyncConfiguration?
            ) = accountingSyncConfiguration(JsonField.ofNullable(accountingSyncConfiguration))

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

            fun billingAddress(billingAddress: BillingAddress?) =
                billingAddress(JsonField.ofNullable(billingAddress))

            /** Alias for calling [Builder.billingAddress] with `billingAddress.orElse(null)`. */
            fun billingAddress(billingAddress: Optional<BillingAddress>) =
                billingAddress(billingAddress.getOrNull())

            /**
             * Sets [Builder.billingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
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

            /** A valid customer email, to be used for invoicing and notifications. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** Alias for calling [Builder.email] with `email.orElse(null)`. */
            fun email(email: Optional<String>) = email(email.getOrNull())

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

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
             * The external customer ID. This can only be set if empty and the customer has no past
             * or current subscriptions.
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
            fun hierarchy(hierarchy: Hierarchy?) = hierarchy(JsonField.ofNullable(hierarchy))

            /** Alias for calling [Builder.hierarchy] with `hierarchy.orElse(null)`. */
            fun hierarchy(hierarchy: Optional<Hierarchy>) = hierarchy(hierarchy.getOrNull())

            /**
             * Sets [Builder.hierarchy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hierarchy] with a well-typed [Hierarchy] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hierarchy(hierarchy: JsonField<Hierarchy>) = apply { this.hierarchy = hierarchy }

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

            /** The full name of the customer */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * This is used for creating charges or invoices in an external system via Orb. When not
             * in test mode:
             * - the connection must first be configured in the Orb webapp.
             * - if the provider is an invoicing provider (`stripe_invoice`, `quickbooks`,
             *   `bill.com`, `netsuite`), any product mappings must first be configured with the Orb
             *   team.
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
             * [ReportingConfiguration] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun reportingConfiguration(reportingConfiguration: JsonField<ReportingConfiguration>) =
                apply {
                    this.reportingConfiguration = reportingConfiguration
                }

            fun shippingAddress(shippingAddress: ShippingAddress?) =
                shippingAddress(JsonField.ofNullable(shippingAddress))

            /** Alias for calling [Builder.shippingAddress] with `shippingAddress.orElse(null)`. */
            fun shippingAddress(shippingAddress: Optional<ShippingAddress>) =
                shippingAddress(shippingAddress.getOrNull())

            /**
             * Sets [Builder.shippingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingAddress] with a well-typed [ShippingAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun shippingAddress(shippingAddress: JsonField<ShippingAddress>) = apply {
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

            /**
             * Alias for calling [taxConfiguration] with
             * `TaxConfiguration.ofNewAvalara(newAvalara)`.
             */
            fun taxConfiguration(newAvalara: TaxConfiguration.NewAvalaraTaxConfiguration) =
                taxConfiguration(TaxConfiguration.ofNewAvalara(newAvalara))

            /**
             * Alias for calling [taxConfiguration] with the following:
             * ```java
             * TaxConfiguration.NewAvalaraTaxConfiguration.builder()
             *     .taxExempt(taxExempt)
             *     .build()
             * ```
             */
            fun newAvalaraTaxConfiguration(taxExempt: Boolean) =
                taxConfiguration(
                    TaxConfiguration.NewAvalaraTaxConfiguration.builder()
                        .taxExempt(taxExempt)
                        .build()
                )

            /**
             * Alias for calling [taxConfiguration] with `TaxConfiguration.ofNewTaxJar(newTaxJar)`.
             */
            fun taxConfiguration(newTaxJar: TaxConfiguration.NewTaxJarConfiguration) =
                taxConfiguration(TaxConfiguration.ofNewTaxJar(newTaxJar))

            /**
             * Alias for calling [taxConfiguration] with the following:
             * ```java
             * TaxConfiguration.NewTaxJarConfiguration.builder()
             *     .taxExempt(taxExempt)
             *     .build()
             * ```
             */
            fun newTaxJarTaxConfiguration(taxExempt: Boolean) =
                taxConfiguration(
                    TaxConfiguration.NewTaxJarConfiguration.builder().taxExempt(taxExempt).build()
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
            fun taxId(taxId: TaxId?) = taxId(JsonField.ofNullable(taxId))

            /** Alias for calling [Builder.taxId] with `taxId.orElse(null)`. */
            fun taxId(taxId: Optional<TaxId>) = taxId(taxId.getOrNull())

            /**
             * Sets [Builder.taxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxId] with a well-typed [TaxId] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun taxId(taxId: JsonField<TaxId>) = apply { this.taxId = taxId }

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
             */
            fun build(): Body =
                Body(
                    accountingSyncConfiguration,
                    (additionalEmails ?: JsonMissing.of()).map { it.toImmutable() },
                    autoCollection,
                    billingAddress,
                    currency,
                    email,
                    emailDelivery,
                    externalCustomerId,
                    hierarchy,
                    metadata,
                    name,
                    paymentProvider,
                    paymentProviderId,
                    reportingConfiguration,
                    shippingAddress,
                    taxConfiguration,
                    taxId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountingSyncConfiguration().ifPresent { it.validate() }
            additionalEmails()
            autoCollection()
            billingAddress().ifPresent { it.validate() }
            currency()
            email()
            emailDelivery()
            externalCustomerId()
            hierarchy().ifPresent { it.validate() }
            metadata().ifPresent { it.validate() }
            name()
            paymentProvider().ifPresent { it.validate() }
            paymentProviderId()
            reportingConfiguration().ifPresent { it.validate() }
            shippingAddress().ifPresent { it.validate() }
            taxConfiguration().ifPresent { it.validate() }
            taxId().ifPresent { it.validate() }
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
            (accountingSyncConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (additionalEmails.asKnown().getOrNull()?.size ?: 0) +
                (if (autoCollection.asKnown().isPresent) 1 else 0) +
                (billingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (emailDelivery.asKnown().isPresent) 1 else 0) +
                (if (externalCustomerId.asKnown().isPresent) 1 else 0) +
                (hierarchy.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (paymentProvider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (paymentProviderId.asKnown().isPresent) 1 else 0) +
                (reportingConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (shippingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (taxConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (taxId.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountingSyncConfiguration == other.accountingSyncConfiguration && additionalEmails == other.additionalEmails && autoCollection == other.autoCollection && billingAddress == other.billingAddress && currency == other.currency && email == other.email && emailDelivery == other.emailDelivery && externalCustomerId == other.externalCustomerId && hierarchy == other.hierarchy && metadata == other.metadata && name == other.name && paymentProvider == other.paymentProvider && paymentProviderId == other.paymentProviderId && reportingConfiguration == other.reportingConfiguration && shippingAddress == other.shippingAddress && taxConfiguration == other.taxConfiguration && taxId == other.taxId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountingSyncConfiguration, additionalEmails, autoCollection, billingAddress, currency, email, emailDelivery, externalCustomerId, hierarchy, metadata, name, paymentProvider, paymentProviderId, reportingConfiguration, shippingAddress, taxConfiguration, taxId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountingSyncConfiguration=$accountingSyncConfiguration, additionalEmails=$additionalEmails, autoCollection=$autoCollection, billingAddress=$billingAddress, currency=$currency, email=$email, emailDelivery=$emailDelivery, externalCustomerId=$externalCustomerId, hierarchy=$hierarchy, metadata=$metadata, name=$name, paymentProvider=$paymentProvider, paymentProviderId=$paymentProviderId, reportingConfiguration=$reportingConfiguration, shippingAddress=$shippingAddress, taxConfiguration=$taxConfiguration, taxId=$taxId, additionalProperties=$additionalProperties}"
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
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountingProviders(): Optional<List<AccountingProvider>> =
            accountingProviders.getOptional("accounting_providers")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun excluded(): Optional<Boolean> = excluded.getOptional("excluded")

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
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountingSyncConfiguration]. */
        class Builder internal constructor() {

            private var accountingProviders: JsonField<MutableList<AccountingProvider>>? = null
            private var excluded: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountingSyncConfiguration: AccountingSyncConfiguration) = apply {
                accountingProviders =
                    accountingSyncConfiguration.accountingProviders.map { it.toMutableList() }
                excluded = accountingSyncConfiguration.excluded
                additionalProperties =
                    accountingSyncConfiguration.additionalProperties.toMutableMap()
            }

            fun accountingProviders(accountingProviders: List<AccountingProvider>?) =
                accountingProviders(JsonField.ofNullable(accountingProviders))

            /**
             * Alias for calling [Builder.accountingProviders] with
             * `accountingProviders.orElse(null)`.
             */
            fun accountingProviders(accountingProviders: Optional<List<AccountingProvider>>) =
                accountingProviders(accountingProviders.getOrNull())

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

            fun excluded(excluded: Boolean?) = excluded(JsonField.ofNullable(excluded))

            /**
             * Alias for [Builder.excluded].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun excluded(excluded: Boolean) = excluded(excluded as Boolean?)

            /** Alias for calling [Builder.excluded] with `excluded.orElse(null)`. */
            fun excluded(excluded: Optional<Boolean>) = excluded(excluded.getOrNull())

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
             */
            fun build(): AccountingSyncConfiguration =
                AccountingSyncConfiguration(
                    (accountingProviders ?: JsonMissing.of()).map { it.toImmutable() },
                    excluded,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountingSyncConfiguration = apply {
            if (validated) {
                return@apply
            }

            accountingProviders().ifPresent { it.forEach { it.validate() } }
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
            private val providerType: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("external_provider_id")
                @ExcludeMissing
                externalProviderId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provider_type")
                @ExcludeMissing
                providerType: JsonField<String> = JsonMissing.of(),
            ) : this(externalProviderId, providerType, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun externalProviderId(): String =
                externalProviderId.getRequired("external_provider_id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun providerType(): String = providerType.getRequired("provider_type")

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
            fun _providerType(): JsonField<String> = providerType

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
                private var providerType: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accountingProvider: AccountingProvider) = apply {
                    externalProviderId = accountingProvider.externalProviderId
                    providerType = accountingProvider.providerType
                    additionalProperties = accountingProvider.additionalProperties.toMutableMap()
                }

                fun externalProviderId(externalProviderId: String) =
                    externalProviderId(JsonField.of(externalProviderId))

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

                fun providerType(providerType: String) = providerType(JsonField.of(providerType))

                /**
                 * Sets [Builder.providerType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.providerType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun providerType(providerType: JsonField<String>) = apply {
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
                providerType()
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
                    (if (providerType.asKnown().isPresent) 1 else 0)

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

    class BillingAddress
    private constructor(
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        ) : this(city, country, line1, line2, postalCode, state, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun city(): Optional<String> = city.getOptional("city")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun line1(): Optional<String> = line1.getOptional("line1")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun line2(): Optional<String> = line2.getOptional("line2")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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

            /** Returns a mutable builder for constructing an instance of [BillingAddress]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillingAddress]. */
        class Builder internal constructor() {

            private var city: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingAddress: BillingAddress) = apply {
                city = billingAddress.city
                country = billingAddress.country
                line1 = billingAddress.line1
                line2 = billingAddress.line2
                postalCode = billingAddress.postalCode
                state = billingAddress.state
                additionalProperties = billingAddress.additionalProperties.toMutableMap()
            }

            fun city(city: String?) = city(JsonField.ofNullable(city))

            /** Alias for calling [Builder.city] with `city.orElse(null)`. */
            fun city(city: Optional<String>) = city(city.getOrNull())

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            fun country(country: String?) = country(JsonField.ofNullable(country))

            /** Alias for calling [Builder.country] with `country.orElse(null)`. */
            fun country(country: Optional<String>) = country(country.getOrNull())

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

            /** Alias for calling [Builder.line1] with `line1.orElse(null)`. */
            fun line1(line1: Optional<String>) = line1(line1.getOrNull())

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
            fun line2(line2: Optional<String>) = line2(line2.getOrNull())

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

            /** Alias for calling [Builder.postalCode] with `postalCode.orElse(null)`. */
            fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.getOrNull())

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            fun state(state: String?) = state(JsonField.ofNullable(state))

            /** Alias for calling [Builder.state] with `state.orElse(null)`. */
            fun state(state: Optional<String>) = state(state.getOrNull())

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

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
             * Returns an immutable instance of [BillingAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BillingAddress =
                BillingAddress(
                    city,
                    country,
                    line1,
                    line2,
                    postalCode,
                    state,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BillingAddress = apply {
            if (validated) {
                return@apply
            }

            city()
            country()
            line1()
            line2()
            postalCode()
            state()
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
            (if (city.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0) +
                (if (line2.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingAddress && city == other.city && country == other.country && line1 == other.line1 && line2 == other.line2 && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(city, country, line1, line2, postalCode, state, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingAddress{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
    }

    /** The hierarchical relationships for this customer. */
    class Hierarchy
    private constructor(
        private val childCustomerIds: JsonField<List<String>>,
        private val parentCustomerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("child_customer_ids")
            @ExcludeMissing
            childCustomerIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("parent_customer_id")
            @ExcludeMissing
            parentCustomerId: JsonField<String> = JsonMissing.of(),
        ) : this(childCustomerIds, parentCustomerId, mutableMapOf())

        /**
         * A list of child customer IDs to add to the hierarchy. The desired child customers must
         * not already be part of another hierarchy.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun childCustomerIds(): Optional<List<String>> =
            childCustomerIds.getOptional("child_customer_ids")

        /**
         * The ID of the parent customer in the hierarchy. The desired parent customer must not be a
         * child of another customer.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parentCustomerId(): Optional<String> =
            parentCustomerId.getOptional("parent_customer_id")

        /**
         * Returns the raw JSON value of [childCustomerIds].
         *
         * Unlike [childCustomerIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("child_customer_ids")
        @ExcludeMissing
        fun _childCustomerIds(): JsonField<List<String>> = childCustomerIds

        /**
         * Returns the raw JSON value of [parentCustomerId].
         *
         * Unlike [parentCustomerId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parent_customer_id")
        @ExcludeMissing
        fun _parentCustomerId(): JsonField<String> = parentCustomerId

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

            /** Returns a mutable builder for constructing an instance of [Hierarchy]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Hierarchy]. */
        class Builder internal constructor() {

            private var childCustomerIds: JsonField<MutableList<String>>? = null
            private var parentCustomerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(hierarchy: Hierarchy) = apply {
                childCustomerIds = hierarchy.childCustomerIds.map { it.toMutableList() }
                parentCustomerId = hierarchy.parentCustomerId
                additionalProperties = hierarchy.additionalProperties.toMutableMap()
            }

            /**
             * A list of child customer IDs to add to the hierarchy. The desired child customers
             * must not already be part of another hierarchy.
             */
            fun childCustomerIds(childCustomerIds: List<String>) =
                childCustomerIds(JsonField.of(childCustomerIds))

            /**
             * Sets [Builder.childCustomerIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.childCustomerIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun childCustomerIds(childCustomerIds: JsonField<List<String>>) = apply {
                this.childCustomerIds = childCustomerIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [childCustomerIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addChildCustomerId(childCustomerId: String) = apply {
                childCustomerIds =
                    (childCustomerIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("childCustomerIds", it).add(childCustomerId)
                    }
            }

            /**
             * The ID of the parent customer in the hierarchy. The desired parent customer must not
             * be a child of another customer.
             */
            fun parentCustomerId(parentCustomerId: String?) =
                parentCustomerId(JsonField.ofNullable(parentCustomerId))

            /**
             * Alias for calling [Builder.parentCustomerId] with `parentCustomerId.orElse(null)`.
             */
            fun parentCustomerId(parentCustomerId: Optional<String>) =
                parentCustomerId(parentCustomerId.getOrNull())

            /**
             * Sets [Builder.parentCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentCustomerId(parentCustomerId: JsonField<String>) = apply {
                this.parentCustomerId = parentCustomerId
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
             * Returns an immutable instance of [Hierarchy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Hierarchy =
                Hierarchy(
                    (childCustomerIds ?: JsonMissing.of()).map { it.toImmutable() },
                    parentCustomerId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Hierarchy = apply {
            if (validated) {
                return@apply
            }

            childCustomerIds()
            parentCustomerId()
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
            (childCustomerIds.asKnown().getOrNull()?.size ?: 0) +
                (if (parentCustomerId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Hierarchy && childCustomerIds == other.childCustomerIds && parentCustomerId == other.parentCustomerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(childCustomerIds, parentCustomerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Hierarchy{childCustomerIds=$childCustomerIds, parentCustomerId=$parentCustomerId, additionalProperties=$additionalProperties}"
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
     * mode:
     * - the connection must first be configured in the Orb webapp.
     * - if the provider is an invoicing provider (`stripe_invoice`, `quickbooks`, `bill.com`,
     *   `netsuite`), any product mappings must first be configured with the Orb team.
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

    class ShippingAddress
    private constructor(
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        ) : this(city, country, line1, line2, postalCode, state, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun city(): Optional<String> = city.getOptional("city")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun line1(): Optional<String> = line1.getOptional("line1")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun line2(): Optional<String> = line2.getOptional("line2")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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

            /** Returns a mutable builder for constructing an instance of [ShippingAddress]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ShippingAddress]. */
        class Builder internal constructor() {

            private var city: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(shippingAddress: ShippingAddress) = apply {
                city = shippingAddress.city
                country = shippingAddress.country
                line1 = shippingAddress.line1
                line2 = shippingAddress.line2
                postalCode = shippingAddress.postalCode
                state = shippingAddress.state
                additionalProperties = shippingAddress.additionalProperties.toMutableMap()
            }

            fun city(city: String?) = city(JsonField.ofNullable(city))

            /** Alias for calling [Builder.city] with `city.orElse(null)`. */
            fun city(city: Optional<String>) = city(city.getOrNull())

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            fun country(country: String?) = country(JsonField.ofNullable(country))

            /** Alias for calling [Builder.country] with `country.orElse(null)`. */
            fun country(country: Optional<String>) = country(country.getOrNull())

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

            /** Alias for calling [Builder.line1] with `line1.orElse(null)`. */
            fun line1(line1: Optional<String>) = line1(line1.getOrNull())

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
            fun line2(line2: Optional<String>) = line2(line2.getOrNull())

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

            /** Alias for calling [Builder.postalCode] with `postalCode.orElse(null)`. */
            fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.getOrNull())

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            fun state(state: String?) = state(JsonField.ofNullable(state))

            /** Alias for calling [Builder.state] with `state.orElse(null)`. */
            fun state(state: Optional<String>) = state(state.getOrNull())

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

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
             * Returns an immutable instance of [ShippingAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ShippingAddress =
                ShippingAddress(
                    city,
                    country,
                    line1,
                    line2,
                    postalCode,
                    state,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ShippingAddress = apply {
            if (validated) {
                return@apply
            }

            city()
            country()
            line1()
            line2()
            postalCode()
            state()
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
            (if (city.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0) +
                (if (line2.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ShippingAddress && city == other.city && country == other.country && line1 == other.line1 && line2 == other.line2 && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(city, country, line1, line2, postalCode, state, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ShippingAddress{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = TaxConfiguration.Deserializer::class)
    @JsonSerialize(using = TaxConfiguration.Serializer::class)
    class TaxConfiguration
    private constructor(
        private val newAvalara: NewAvalaraTaxConfiguration? = null,
        private val newTaxJar: NewTaxJarConfiguration? = null,
        private val _json: JsonValue? = null,
    ) {

        fun newAvalara(): Optional<NewAvalaraTaxConfiguration> = Optional.ofNullable(newAvalara)

        fun newTaxJar(): Optional<NewTaxJarConfiguration> = Optional.ofNullable(newTaxJar)

        fun isNewAvalara(): Boolean = newAvalara != null

        fun isNewTaxJar(): Boolean = newTaxJar != null

        fun asNewAvalara(): NewAvalaraTaxConfiguration = newAvalara.getOrThrow("newAvalara")

        fun asNewTaxJar(): NewTaxJarConfiguration = newTaxJar.getOrThrow("newTaxJar")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                newAvalara != null -> visitor.visitNewAvalara(newAvalara)
                newTaxJar != null -> visitor.visitNewTaxJar(newTaxJar)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): TaxConfiguration = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNewAvalara(newAvalara: NewAvalaraTaxConfiguration) {
                        newAvalara.validate()
                    }

                    override fun visitNewTaxJar(newTaxJar: NewTaxJarConfiguration) {
                        newTaxJar.validate()
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
                    override fun visitNewAvalara(newAvalara: NewAvalaraTaxConfiguration) =
                        newAvalara.validity()

                    override fun visitNewTaxJar(newTaxJar: NewTaxJarConfiguration) =
                        newTaxJar.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaxConfiguration && newAvalara == other.newAvalara && newTaxJar == other.newTaxJar /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(newAvalara, newTaxJar) /* spotless:on */

        override fun toString(): String =
            when {
                newAvalara != null -> "TaxConfiguration{newAvalara=$newAvalara}"
                newTaxJar != null -> "TaxConfiguration{newTaxJar=$newTaxJar}"
                _json != null -> "TaxConfiguration{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TaxConfiguration")
            }

        companion object {

            @JvmStatic
            fun ofNewAvalara(newAvalara: NewAvalaraTaxConfiguration) =
                TaxConfiguration(newAvalara = newAvalara)

            @JvmStatic
            fun ofNewTaxJar(newTaxJar: NewTaxJarConfiguration) =
                TaxConfiguration(newTaxJar = newTaxJar)
        }

        /**
         * An interface that defines how to map each variant of [TaxConfiguration] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitNewAvalara(newAvalara: NewAvalaraTaxConfiguration): T

            fun visitNewTaxJar(newTaxJar: NewTaxJarConfiguration): T

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
                            ?.let { TaxConfiguration(newAvalara = it, _json = json) }
                            ?: TaxConfiguration(_json = json)
                    }
                    "taxjar" -> {
                        return tryDeserialize(node, jacksonTypeRef<NewTaxJarConfiguration>())?.let {
                            TaxConfiguration(newTaxJar = it, _json = json)
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
                    value.newAvalara != null -> generator.writeObject(value.newAvalara)
                    value.newTaxJar != null -> generator.writeObject(value.newTaxJar)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TaxConfiguration")
                }
            }
        }

        class NewAvalaraTaxConfiguration
        private constructor(
            private val taxExempt: JsonField<Boolean>,
            private val taxProvider: JsonValue,
            private val taxExemptionCode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("tax_exempt")
                @ExcludeMissing
                taxExempt: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("tax_provider")
                @ExcludeMissing
                taxProvider: JsonValue = JsonMissing.of(),
                @JsonProperty("tax_exemption_code")
                @ExcludeMissing
                taxExemptionCode: JsonField<String> = JsonMissing.of(),
            ) : this(taxExempt, taxProvider, taxExemptionCode, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun taxExempt(): Boolean = taxExempt.getRequired("tax_exempt")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("avalara")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("tax_provider")
            @ExcludeMissing
            fun _taxProvider(): JsonValue = taxProvider

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun taxExemptionCode(): Optional<String> =
                taxExemptionCode.getOptional("tax_exemption_code")

            /**
             * Returns the raw JSON value of [taxExempt].
             *
             * Unlike [taxExempt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tax_exempt")
            @ExcludeMissing
            fun _taxExempt(): JsonField<Boolean> = taxExempt

            /**
             * Returns the raw JSON value of [taxExemptionCode].
             *
             * Unlike [taxExemptionCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("tax_exemption_code")
            @ExcludeMissing
            fun _taxExemptionCode(): JsonField<String> = taxExemptionCode

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
                 * [NewAvalaraTaxConfiguration].
                 *
                 * The following fields are required:
                 * ```java
                 * .taxExempt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NewAvalaraTaxConfiguration]. */
            class Builder internal constructor() {

                private var taxExempt: JsonField<Boolean>? = null
                private var taxProvider: JsonValue = JsonValue.from("avalara")
                private var taxExemptionCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(newAvalaraTaxConfiguration: NewAvalaraTaxConfiguration) = apply {
                    taxExempt = newAvalaraTaxConfiguration.taxExempt
                    taxProvider = newAvalaraTaxConfiguration.taxProvider
                    taxExemptionCode = newAvalaraTaxConfiguration.taxExemptionCode
                    additionalProperties =
                        newAvalaraTaxConfiguration.additionalProperties.toMutableMap()
                }

                fun taxExempt(taxExempt: Boolean) = taxExempt(JsonField.of(taxExempt))

                /**
                 * Sets [Builder.taxExempt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxExempt] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taxExempt(taxExempt: JsonField<Boolean>) = apply { this.taxExempt = taxExempt }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("avalara")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun taxProvider(taxProvider: JsonValue) = apply { this.taxProvider = taxProvider }

                fun taxExemptionCode(taxExemptionCode: String?) =
                    taxExemptionCode(JsonField.ofNullable(taxExemptionCode))

                /**
                 * Alias for calling [Builder.taxExemptionCode] with
                 * `taxExemptionCode.orElse(null)`.
                 */
                fun taxExemptionCode(taxExemptionCode: Optional<String>) =
                    taxExemptionCode(taxExemptionCode.getOrNull())

                /**
                 * Sets [Builder.taxExemptionCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxExemptionCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taxExemptionCode(taxExemptionCode: JsonField<String>) = apply {
                    this.taxExemptionCode = taxExemptionCode
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
                 * Returns an immutable instance of [NewAvalaraTaxConfiguration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .taxExempt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NewAvalaraTaxConfiguration =
                    NewAvalaraTaxConfiguration(
                        checkRequired("taxExempt", taxExempt),
                        taxProvider,
                        taxExemptionCode,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): NewAvalaraTaxConfiguration = apply {
                if (validated) {
                    return@apply
                }

                taxExempt()
                _taxProvider().let {
                    if (it != JsonValue.from("avalara")) {
                        throw OrbInvalidDataException("'taxProvider' is invalid, received $it")
                    }
                }
                taxExemptionCode()
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
                (if (taxExempt.asKnown().isPresent) 1 else 0) +
                    taxProvider.let { if (it == JsonValue.from("avalara")) 1 else 0 } +
                    (if (taxExemptionCode.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewAvalaraTaxConfiguration && taxExempt == other.taxExempt && taxProvider == other.taxProvider && taxExemptionCode == other.taxExemptionCode && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(taxExempt, taxProvider, taxExemptionCode, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewAvalaraTaxConfiguration{taxExempt=$taxExempt, taxProvider=$taxProvider, taxExemptionCode=$taxExemptionCode, additionalProperties=$additionalProperties}"
        }

        class NewTaxJarConfiguration
        private constructor(
            private val taxExempt: JsonField<Boolean>,
            private val taxProvider: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("tax_exempt")
                @ExcludeMissing
                taxExempt: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("tax_provider")
                @ExcludeMissing
                taxProvider: JsonValue = JsonMissing.of(),
            ) : this(taxExempt, taxProvider, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun taxExempt(): Boolean = taxExempt.getRequired("tax_exempt")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("taxjar")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("tax_provider")
            @ExcludeMissing
            fun _taxProvider(): JsonValue = taxProvider

            /**
             * Returns the raw JSON value of [taxExempt].
             *
             * Unlike [taxExempt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tax_exempt")
            @ExcludeMissing
            fun _taxExempt(): JsonField<Boolean> = taxExempt

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
                 * [NewTaxJarConfiguration].
                 *
                 * The following fields are required:
                 * ```java
                 * .taxExempt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NewTaxJarConfiguration]. */
            class Builder internal constructor() {

                private var taxExempt: JsonField<Boolean>? = null
                private var taxProvider: JsonValue = JsonValue.from("taxjar")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(newTaxJarConfiguration: NewTaxJarConfiguration) = apply {
                    taxExempt = newTaxJarConfiguration.taxExempt
                    taxProvider = newTaxJarConfiguration.taxProvider
                    additionalProperties =
                        newTaxJarConfiguration.additionalProperties.toMutableMap()
                }

                fun taxExempt(taxExempt: Boolean) = taxExempt(JsonField.of(taxExempt))

                /**
                 * Sets [Builder.taxExempt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxExempt] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taxExempt(taxExempt: JsonField<Boolean>) = apply { this.taxExempt = taxExempt }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("taxjar")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun taxProvider(taxProvider: JsonValue) = apply { this.taxProvider = taxProvider }

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
                 * Returns an immutable instance of [NewTaxJarConfiguration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .taxExempt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NewTaxJarConfiguration =
                    NewTaxJarConfiguration(
                        checkRequired("taxExempt", taxExempt),
                        taxProvider,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): NewTaxJarConfiguration = apply {
                if (validated) {
                    return@apply
                }

                taxExempt()
                _taxProvider().let {
                    if (it != JsonValue.from("taxjar")) {
                        throw OrbInvalidDataException("'taxProvider' is invalid, received $it")
                    }
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
                (if (taxExempt.asKnown().isPresent) 1 else 0) +
                    taxProvider.let { if (it == JsonValue.from("taxjar")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewTaxJarConfiguration && taxExempt == other.taxExempt && taxProvider == other.taxProvider && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(taxExempt, taxProvider, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewTaxJarConfiguration{taxExempt=$taxExempt, taxProvider=$taxProvider, additionalProperties=$additionalProperties}"
        }
    }

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
     */
    class TaxId
    private constructor(
        private val country: JsonField<Country>,
        private val type: JsonField<Type>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country") @ExcludeMissing country: JsonField<Country> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(country, type, value, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): Country = country.getRequired("country")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<Country> = country

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [TaxId].
             *
             * The following fields are required:
             * ```java
             * .country()
             * .type()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TaxId]. */
        class Builder internal constructor() {

            private var country: JsonField<Country>? = null
            private var type: JsonField<Type>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(taxId: TaxId) = apply {
                country = taxId.country
                type = taxId.type
                value = taxId.value
                additionalProperties = taxId.additionalProperties.toMutableMap()
            }

            fun country(country: Country) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [Country] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<Country>) = apply { this.country = country }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [TaxId].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .country()
             * .type()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TaxId =
                TaxId(
                    checkRequired("country", country),
                    checkRequired("type", type),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TaxId = apply {
            if (validated) {
                return@apply
            }

            country().validate()
            type().validate()
            value()
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
            (country.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        class Country @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AD = of("AD")

                @JvmField val AE = of("AE")

                @JvmField val AR = of("AR")

                @JvmField val AT = of("AT")

                @JvmField val AU = of("AU")

                @JvmField val BE = of("BE")

                @JvmField val BG = of("BG")

                @JvmField val BH = of("BH")

                @JvmField val BO = of("BO")

                @JvmField val BR = of("BR")

                @JvmField val CA = of("CA")

                @JvmField val CH = of("CH")

                @JvmField val CL = of("CL")

                @JvmField val CN = of("CN")

                @JvmField val CO = of("CO")

                @JvmField val CR = of("CR")

                @JvmField val CY = of("CY")

                @JvmField val CZ = of("CZ")

                @JvmField val DE = of("DE")

                @JvmField val DK = of("DK")

                @JvmField val EE = of("EE")

                @JvmField val DO = of("DO")

                @JvmField val EC = of("EC")

                @JvmField val EG = of("EG")

                @JvmField val ES = of("ES")

                @JvmField val EU = of("EU")

                @JvmField val FI = of("FI")

                @JvmField val FR = of("FR")

                @JvmField val GB = of("GB")

                @JvmField val GE = of("GE")

                @JvmField val GR = of("GR")

                @JvmField val HK = of("HK")

                @JvmField val HR = of("HR")

                @JvmField val HU = of("HU")

                @JvmField val ID = of("ID")

                @JvmField val IE = of("IE")

                @JvmField val IL = of("IL")

                @JvmField val IN = of("IN")

                @JvmField val IS = of("IS")

                @JvmField val IT = of("IT")

                @JvmField val JP = of("JP")

                @JvmField val KE = of("KE")

                @JvmField val KR = of("KR")

                @JvmField val KZ = of("KZ")

                @JvmField val LI = of("LI")

                @JvmField val LT = of("LT")

                @JvmField val LU = of("LU")

                @JvmField val LV = of("LV")

                @JvmField val MT = of("MT")

                @JvmField val MX = of("MX")

                @JvmField val MY = of("MY")

                @JvmField val NG = of("NG")

                @JvmField val NL = of("NL")

                @JvmField val NO = of("NO")

                @JvmField val NZ = of("NZ")

                @JvmField val OM = of("OM")

                @JvmField val PE = of("PE")

                @JvmField val PH = of("PH")

                @JvmField val PL = of("PL")

                @JvmField val PT = of("PT")

                @JvmField val RO = of("RO")

                @JvmField val RS = of("RS")

                @JvmField val RU = of("RU")

                @JvmField val SA = of("SA")

                @JvmField val SE = of("SE")

                @JvmField val SG = of("SG")

                @JvmField val SI = of("SI")

                @JvmField val SK = of("SK")

                @JvmField val SV = of("SV")

                @JvmField val TH = of("TH")

                @JvmField val TR = of("TR")

                @JvmField val TW = of("TW")

                @JvmField val UA = of("UA")

                @JvmField val US = of("US")

                @JvmField val UY = of("UY")

                @JvmField val VE = of("VE")

                @JvmField val VN = of("VN")

                @JvmField val ZA = of("ZA")

                @JvmStatic fun of(value: String) = Country(JsonField.of(value))
            }

            /** An enum containing [Country]'s known values. */
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

            /**
             * An enum containing [Country]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Country] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                /**
                 * An enum member indicating that [Country] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
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
                _value().asString().orElseThrow { OrbInvalidDataException("Value is not a String") }

            private var validated: Boolean = false

            fun validate(): Country = apply {
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

                return /* spotless:off */ other is Country && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AD_NRT = of("ad_nrt")

                @JvmField val AE_TRN = of("ae_trn")

                @JvmField val AR_CUIT = of("ar_cuit")

                @JvmField val EU_VAT = of("eu_vat")

                @JvmField val AU_ABN = of("au_abn")

                @JvmField val AU_ARN = of("au_arn")

                @JvmField val BG_UIC = of("bg_uic")

                @JvmField val BH_VAT = of("bh_vat")

                @JvmField val BO_TIN = of("bo_tin")

                @JvmField val BR_CNPJ = of("br_cnpj")

                @JvmField val BR_CPF = of("br_cpf")

                @JvmField val CA_BN = of("ca_bn")

                @JvmField val CA_GST_HST = of("ca_gst_hst")

                @JvmField val CA_PST_BC = of("ca_pst_bc")

                @JvmField val CA_PST_MB = of("ca_pst_mb")

                @JvmField val CA_PST_SK = of("ca_pst_sk")

                @JvmField val CA_QST = of("ca_qst")

                @JvmField val CH_VAT = of("ch_vat")

                @JvmField val CL_TIN = of("cl_tin")

                @JvmField val CN_TIN = of("cn_tin")

                @JvmField val CO_NIT = of("co_nit")

                @JvmField val CR_TIN = of("cr_tin")

                @JvmField val DO_RCN = of("do_rcn")

                @JvmField val EC_RUC = of("ec_ruc")

                @JvmField val EG_TIN = of("eg_tin")

                @JvmField val ES_CIF = of("es_cif")

                @JvmField val EU_OSS_VAT = of("eu_oss_vat")

                @JvmField val GB_VAT = of("gb_vat")

                @JvmField val GE_VAT = of("ge_vat")

                @JvmField val HK_BR = of("hk_br")

                @JvmField val HU_TIN = of("hu_tin")

                @JvmField val ID_NPWP = of("id_npwp")

                @JvmField val IL_VAT = of("il_vat")

                @JvmField val IN_GST = of("in_gst")

                @JvmField val IS_VAT = of("is_vat")

                @JvmField val JP_CN = of("jp_cn")

                @JvmField val JP_RN = of("jp_rn")

                @JvmField val JP_TRN = of("jp_trn")

                @JvmField val KE_PIN = of("ke_pin")

                @JvmField val KR_BRN = of("kr_brn")

                @JvmField val KZ_BIN = of("kz_bin")

                @JvmField val LI_UID = of("li_uid")

                @JvmField val MX_RFC = of("mx_rfc")

                @JvmField val MY_FRP = of("my_frp")

                @JvmField val MY_ITN = of("my_itn")

                @JvmField val MY_SST = of("my_sst")

                @JvmField val NG_TIN = of("ng_tin")

                @JvmField val NO_VAT = of("no_vat")

                @JvmField val NO_VOEC = of("no_voec")

                @JvmField val NZ_GST = of("nz_gst")

                @JvmField val OM_VAT = of("om_vat")

                @JvmField val PE_RUC = of("pe_ruc")

                @JvmField val PH_TIN = of("ph_tin")

                @JvmField val RO_TIN = of("ro_tin")

                @JvmField val RS_PIB = of("rs_pib")

                @JvmField val RU_INN = of("ru_inn")

                @JvmField val RU_KPP = of("ru_kpp")

                @JvmField val SA_VAT = of("sa_vat")

                @JvmField val SG_GST = of("sg_gst")

                @JvmField val SG_UEN = of("sg_uen")

                @JvmField val SI_TIN = of("si_tin")

                @JvmField val SV_NIT = of("sv_nit")

                @JvmField val TH_VAT = of("th_vat")

                @JvmField val TR_TIN = of("tr_tin")

                @JvmField val TW_VAT = of("tw_vat")

                @JvmField val UA_VAT = of("ua_vat")

                @JvmField val US_EIN = of("us_ein")

                @JvmField val UY_RUC = of("uy_ruc")

                @JvmField val VE_RIF = of("ve_rif")

                @JvmField val VN_TIN = of("vn_tin")

                @JvmField val ZA_VAT = of("za_vat")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
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

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
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
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
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
                _value().asString().orElseThrow { OrbInvalidDataException("Value is not a String") }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaxId && country == other.country && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, type, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TaxId{country=$country, type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerUpdateByExternalIdParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerUpdateByExternalIdParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
