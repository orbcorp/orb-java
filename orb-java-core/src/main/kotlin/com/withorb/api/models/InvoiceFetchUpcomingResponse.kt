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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InvoiceFetchUpcomingResponse
private constructor(
    private val id: JsonField<String>,
    private val amountDue: JsonField<String>,
    private val autoCollection: JsonField<AutoCollection>,
    private val billingAddress: JsonField<BillingAddress>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditNotes: JsonField<List<CreditNote>>,
    private val currency: JsonField<String>,
    private val customer: JsonField<Customer>,
    private val customerBalanceTransactions: JsonField<List<CustomerBalanceTransaction>>,
    private val customerTaxId: JsonField<CustomerTaxId>,
    private val discount: JsonValue,
    private val discounts: JsonField<List<InvoiceLevelDiscount>>,
    private val dueDate: JsonField<OffsetDateTime>,
    private val eligibleToIssueAt: JsonField<OffsetDateTime>,
    private val hostedInvoiceUrl: JsonField<String>,
    private val invoiceNumber: JsonField<String>,
    private val invoicePdf: JsonField<String>,
    private val invoiceSource: JsonField<InvoiceSource>,
    private val issueFailedAt: JsonField<OffsetDateTime>,
    private val issuedAt: JsonField<OffsetDateTime>,
    private val lineItems: JsonField<List<LineItem>>,
    private val maximum: JsonField<Maximum>,
    private val maximumAmount: JsonField<String>,
    private val memo: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val minimum: JsonField<Minimum>,
    private val minimumAmount: JsonField<String>,
    private val paidAt: JsonField<OffsetDateTime>,
    private val paymentAttempts: JsonField<List<PaymentAttempt>>,
    private val paymentFailedAt: JsonField<OffsetDateTime>,
    private val paymentStartedAt: JsonField<OffsetDateTime>,
    private val scheduledIssueAt: JsonField<OffsetDateTime>,
    private val shippingAddress: JsonField<ShippingAddress>,
    private val status: JsonField<Status>,
    private val subscription: JsonField<Subscription>,
    private val subtotal: JsonField<String>,
    private val syncFailedAt: JsonField<OffsetDateTime>,
    private val targetDate: JsonField<OffsetDateTime>,
    private val total: JsonField<String>,
    private val voidedAt: JsonField<OffsetDateTime>,
    private val willAutoIssue: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount_due") @ExcludeMissing amountDue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auto_collection")
        @ExcludeMissing
        autoCollection: JsonField<AutoCollection> = JsonMissing.of(),
        @JsonProperty("billing_address")
        @ExcludeMissing
        billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_notes")
        @ExcludeMissing
        creditNotes: JsonField<List<CreditNote>> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer") @ExcludeMissing customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("customer_balance_transactions")
        @ExcludeMissing
        customerBalanceTransactions: JsonField<List<CustomerBalanceTransaction>> = JsonMissing.of(),
        @JsonProperty("customer_tax_id")
        @ExcludeMissing
        customerTaxId: JsonField<CustomerTaxId> = JsonMissing.of(),
        @JsonProperty("discount") @ExcludeMissing discount: JsonValue = JsonMissing.of(),
        @JsonProperty("discounts")
        @ExcludeMissing
        discounts: JsonField<List<InvoiceLevelDiscount>> = JsonMissing.of(),
        @JsonProperty("due_date")
        @ExcludeMissing
        dueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eligible_to_issue_at")
        @ExcludeMissing
        eligibleToIssueAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hosted_invoice_url")
        @ExcludeMissing
        hostedInvoiceUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_number")
        @ExcludeMissing
        invoiceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_pdf")
        @ExcludeMissing
        invoicePdf: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_source")
        @ExcludeMissing
        invoiceSource: JsonField<InvoiceSource> = JsonMissing.of(),
        @JsonProperty("issue_failed_at")
        @ExcludeMissing
        issueFailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("issued_at")
        @ExcludeMissing
        issuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("line_items")
        @ExcludeMissing
        lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
        @JsonProperty("maximum") @ExcludeMissing maximum: JsonField<Maximum> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("minimum") @ExcludeMissing minimum: JsonField<Minimum> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("paid_at")
        @ExcludeMissing
        paidAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("payment_attempts")
        @ExcludeMissing
        paymentAttempts: JsonField<List<PaymentAttempt>> = JsonMissing.of(),
        @JsonProperty("payment_failed_at")
        @ExcludeMissing
        paymentFailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("payment_started_at")
        @ExcludeMissing
        paymentStartedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("scheduled_issue_at")
        @ExcludeMissing
        scheduledIssueAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("shipping_address")
        @ExcludeMissing
        shippingAddress: JsonField<ShippingAddress> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("subscription")
        @ExcludeMissing
        subscription: JsonField<Subscription> = JsonMissing.of(),
        @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sync_failed_at")
        @ExcludeMissing
        syncFailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("target_date")
        @ExcludeMissing
        targetDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
        @JsonProperty("voided_at")
        @ExcludeMissing
        voidedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("will_auto_issue")
        @ExcludeMissing
        willAutoIssue: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        amountDue,
        autoCollection,
        billingAddress,
        createdAt,
        creditNotes,
        currency,
        customer,
        customerBalanceTransactions,
        customerTaxId,
        discount,
        discounts,
        dueDate,
        eligibleToIssueAt,
        hostedInvoiceUrl,
        invoiceNumber,
        invoicePdf,
        invoiceSource,
        issueFailedAt,
        issuedAt,
        lineItems,
        maximum,
        maximumAmount,
        memo,
        metadata,
        minimum,
        minimumAmount,
        paidAt,
        paymentAttempts,
        paymentFailedAt,
        paymentStartedAt,
        scheduledIssueAt,
        shippingAddress,
        status,
        subscription,
        subtotal,
        syncFailedAt,
        targetDate,
        total,
        voidedAt,
        willAutoIssue,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * This is the final amount required to be charged to the customer and reflects the application
     * of the customer balance to the `total` of the invoice.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountDue(): String = amountDue.getRequired("amount_due")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun autoCollection(): AutoCollection = autoCollection.getRequired("auto_collection")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun billingAddress(): Optional<BillingAddress> = billingAddress.getOptional("billing_address")

    /**
     * The creation time of the resource in Orb.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * A list of credit notes associated with the invoice
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditNotes(): List<CreditNote> = creditNotes.getRequired("credit_notes")

    /**
     * An ISO 4217 currency string or `credits`
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): Customer = customer.getRequired("customer")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerBalanceTransactions(): List<CustomerBalanceTransaction> =
        customerBalanceTransactions.getRequired("customer_balance_transactions")

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
    fun customerTaxId(): Optional<CustomerTaxId> = customerTaxId.getOptional("customer_tax_id")

    /**
     * This field is deprecated in favor of `discounts`. If a `discounts` list is provided, the
     * first discount in the list will be returned. If the list is empty, `None` will be returned.
     */
    @Deprecated("deprecated")
    @JsonProperty("discount")
    @ExcludeMissing
    fun _discount(): JsonValue = discount

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discounts(): List<InvoiceLevelDiscount> = discounts.getRequired("discounts")

    /**
     * When the invoice payment is due. The due date is null if the invoice is not yet finalized.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun dueDate(): Optional<OffsetDateTime> = dueDate.getOptional("due_date")

    /**
     * If the invoice has a status of `draft`, this will be the time that the invoice will be
     * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice will
     * automatically begin issuing at this time.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun eligibleToIssueAt(): Optional<OffsetDateTime> =
        eligibleToIssueAt.getOptional("eligible_to_issue_at")

    /**
     * A URL for the customer-facing invoice portal. This URL expires 30 days after the invoice's
     * due date, or 60 days after being re-generated through the UI.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun hostedInvoiceUrl(): Optional<String> = hostedInvoiceUrl.getOptional("hosted_invoice_url")

    /**
     * Automatically generated invoice number to help track and reconcile invoices. Invoice numbers
     * have a prefix such as `RFOBWG`. These can be sequential per account or customer.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceNumber(): String = invoiceNumber.getRequired("invoice_number")

    /**
     * The link to download the PDF representation of the `Invoice`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invoicePdf(): Optional<String> = invoicePdf.getOptional("invoice_pdf")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceSource(): InvoiceSource = invoiceSource.getRequired("invoice_source")

    /**
     * If the invoice failed to issue, this will be the last time it failed to issue (even if it is
     * now in a different state.)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun issueFailedAt(): Optional<OffsetDateTime> = issueFailedAt.getOptional("issue_failed_at")

    /**
     * If the invoice has been issued, this will be the time it transitioned to `issued` (even if it
     * is now in a different state.)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun issuedAt(): Optional<OffsetDateTime> = issuedAt.getOptional("issued_at")

    /**
     * The breakdown of prices in this invoice.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun maximum(): Optional<Maximum> = maximum.getOptional("maximum")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun maximumAmount(): Optional<String> = maximumAmount.getOptional("maximum_amount")

    /**
     * Free-form text which is available on the invoice PDF and the Orb invoice portal.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun memo(): Optional<String> = memo.getOptional("memo")

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
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun minimum(): Optional<Minimum> = minimum.getOptional("minimum")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun minimumAmount(): Optional<String> = minimumAmount.getOptional("minimum_amount")

    /**
     * If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paidAt(): Optional<OffsetDateTime> = paidAt.getOptional("paid_at")

    /**
     * A list of payment attempts associated with the invoice
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentAttempts(): List<PaymentAttempt> = paymentAttempts.getRequired("payment_attempts")

    /**
     * If payment was attempted on this invoice but failed, this will be the time of the most recent
     * attempt.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paymentFailedAt(): Optional<OffsetDateTime> =
        paymentFailedAt.getOptional("payment_failed_at")

    /**
     * If payment was attempted on this invoice, this will be the start time of the most recent
     * attempt. This field is especially useful for delayed-notification payment mechanisms (like
     * bank transfers), where payment can take 3 days or more.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paymentStartedAt(): Optional<OffsetDateTime> =
        paymentStartedAt.getOptional("payment_started_at")

    /**
     * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to be
     * issued.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun scheduledIssueAt(): Optional<OffsetDateTime> =
        scheduledIssueAt.getOptional("scheduled_issue_at")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun shippingAddress(): Optional<ShippingAddress> =
        shippingAddress.getOptional("shipping_address")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun subscription(): Optional<Subscription> = subscription.getOptional("subscription")

    /**
     * The total before any discounts and minimums are applied.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /**
     * If the invoice failed to sync, this will be the last time an external invoicing provider sync
     * was attempted. This field will always be `null` for invoices using Orb Invoicing.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun syncFailedAt(): Optional<OffsetDateTime> = syncFailedAt.getOptional("sync_failed_at")

    /**
     * The scheduled date of the invoice
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetDate(): OffsetDateTime = targetDate.getRequired("target_date")

    /**
     * The total after any minimums and discounts have been applied.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): String = total.getRequired("total")

    /**
     * If the invoice has a status of `void`, this gives a timestamp when the invoice was voided.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun voidedAt(): Optional<OffsetDateTime> = voidedAt.getOptional("voided_at")

    /**
     * This is true if the invoice will be automatically issued in the future, and false otherwise.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun willAutoIssue(): Boolean = willAutoIssue.getRequired("will_auto_issue")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amountDue].
     *
     * Unlike [amountDue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue(): JsonField<String> = amountDue

    /**
     * Returns the raw JSON value of [autoCollection].
     *
     * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auto_collection")
    @ExcludeMissing
    fun _autoCollection(): JsonField<AutoCollection> = autoCollection

    /**
     * Returns the raw JSON value of [billingAddress].
     *
     * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_address")
    @ExcludeMissing
    fun _billingAddress(): JsonField<BillingAddress> = billingAddress

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [creditNotes].
     *
     * Unlike [creditNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_notes")
    @ExcludeMissing
    fun _creditNotes(): JsonField<List<CreditNote>> = creditNotes

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    /**
     * Returns the raw JSON value of [customerBalanceTransactions].
     *
     * Unlike [customerBalanceTransactions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("customer_balance_transactions")
    @ExcludeMissing
    fun _customerBalanceTransactions(): JsonField<List<CustomerBalanceTransaction>> =
        customerBalanceTransactions

    /**
     * Returns the raw JSON value of [customerTaxId].
     *
     * Unlike [customerTaxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_tax_id")
    @ExcludeMissing
    fun _customerTaxId(): JsonField<CustomerTaxId> = customerTaxId

    /**
     * Returns the raw JSON value of [discounts].
     *
     * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discounts")
    @ExcludeMissing
    fun _discounts(): JsonField<List<InvoiceLevelDiscount>> = discounts

    /**
     * Returns the raw JSON value of [dueDate].
     *
     * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("due_date") @ExcludeMissing fun _dueDate(): JsonField<OffsetDateTime> = dueDate

    /**
     * Returns the raw JSON value of [eligibleToIssueAt].
     *
     * Unlike [eligibleToIssueAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("eligible_to_issue_at")
    @ExcludeMissing
    fun _eligibleToIssueAt(): JsonField<OffsetDateTime> = eligibleToIssueAt

    /**
     * Returns the raw JSON value of [hostedInvoiceUrl].
     *
     * Unlike [hostedInvoiceUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hosted_invoice_url")
    @ExcludeMissing
    fun _hostedInvoiceUrl(): JsonField<String> = hostedInvoiceUrl

    /**
     * Returns the raw JSON value of [invoiceNumber].
     *
     * Unlike [invoiceNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_number")
    @ExcludeMissing
    fun _invoiceNumber(): JsonField<String> = invoiceNumber

    /**
     * Returns the raw JSON value of [invoicePdf].
     *
     * Unlike [invoicePdf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_pdf") @ExcludeMissing fun _invoicePdf(): JsonField<String> = invoicePdf

    /**
     * Returns the raw JSON value of [invoiceSource].
     *
     * Unlike [invoiceSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_source")
    @ExcludeMissing
    fun _invoiceSource(): JsonField<InvoiceSource> = invoiceSource

    /**
     * Returns the raw JSON value of [issueFailedAt].
     *
     * Unlike [issueFailedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issue_failed_at")
    @ExcludeMissing
    fun _issueFailedAt(): JsonField<OffsetDateTime> = issueFailedAt

    /**
     * Returns the raw JSON value of [issuedAt].
     *
     * Unlike [issuedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issued_at") @ExcludeMissing fun _issuedAt(): JsonField<OffsetDateTime> = issuedAt

    /**
     * Returns the raw JSON value of [lineItems].
     *
     * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line_items")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<LineItem>> = lineItems

    /**
     * Returns the raw JSON value of [maximum].
     *
     * Unlike [maximum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maximum") @ExcludeMissing fun _maximum(): JsonField<Maximum> = maximum

    /**
     * Returns the raw JSON value of [maximumAmount].
     *
     * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [minimum].
     *
     * Unlike [minimum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<Minimum> = minimum

    /**
     * Returns the raw JSON value of [minimumAmount].
     *
     * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

    /**
     * Returns the raw JSON value of [paidAt].
     *
     * Unlike [paidAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paid_at") @ExcludeMissing fun _paidAt(): JsonField<OffsetDateTime> = paidAt

    /**
     * Returns the raw JSON value of [paymentAttempts].
     *
     * Unlike [paymentAttempts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_attempts")
    @ExcludeMissing
    fun _paymentAttempts(): JsonField<List<PaymentAttempt>> = paymentAttempts

    /**
     * Returns the raw JSON value of [paymentFailedAt].
     *
     * Unlike [paymentFailedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_failed_at")
    @ExcludeMissing
    fun _paymentFailedAt(): JsonField<OffsetDateTime> = paymentFailedAt

    /**
     * Returns the raw JSON value of [paymentStartedAt].
     *
     * Unlike [paymentStartedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_started_at")
    @ExcludeMissing
    fun _paymentStartedAt(): JsonField<OffsetDateTime> = paymentStartedAt

    /**
     * Returns the raw JSON value of [scheduledIssueAt].
     *
     * Unlike [scheduledIssueAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("scheduled_issue_at")
    @ExcludeMissing
    fun _scheduledIssueAt(): JsonField<OffsetDateTime> = scheduledIssueAt

    /**
     * Returns the raw JSON value of [shippingAddress].
     *
     * Unlike [shippingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipping_address")
    @ExcludeMissing
    fun _shippingAddress(): JsonField<ShippingAddress> = shippingAddress

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [subscription].
     *
     * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<Subscription> = subscription

    /**
     * Returns the raw JSON value of [subtotal].
     *
     * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

    /**
     * Returns the raw JSON value of [syncFailedAt].
     *
     * Unlike [syncFailedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sync_failed_at")
    @ExcludeMissing
    fun _syncFailedAt(): JsonField<OffsetDateTime> = syncFailedAt

    /**
     * Returns the raw JSON value of [targetDate].
     *
     * Unlike [targetDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_date")
    @ExcludeMissing
    fun _targetDate(): JsonField<OffsetDateTime> = targetDate

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

    /**
     * Returns the raw JSON value of [voidedAt].
     *
     * Unlike [voidedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voided_at") @ExcludeMissing fun _voidedAt(): JsonField<OffsetDateTime> = voidedAt

    /**
     * Returns the raw JSON value of [willAutoIssue].
     *
     * Unlike [willAutoIssue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("will_auto_issue")
    @ExcludeMissing
    fun _willAutoIssue(): JsonField<Boolean> = willAutoIssue

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
         * Returns a mutable builder for constructing an instance of [InvoiceFetchUpcomingResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amountDue()
         * .autoCollection()
         * .billingAddress()
         * .createdAt()
         * .creditNotes()
         * .currency()
         * .customer()
         * .customerBalanceTransactions()
         * .customerTaxId()
         * .discount()
         * .discounts()
         * .dueDate()
         * .eligibleToIssueAt()
         * .hostedInvoiceUrl()
         * .invoiceNumber()
         * .invoicePdf()
         * .invoiceSource()
         * .issueFailedAt()
         * .issuedAt()
         * .lineItems()
         * .maximum()
         * .maximumAmount()
         * .memo()
         * .metadata()
         * .minimum()
         * .minimumAmount()
         * .paidAt()
         * .paymentAttempts()
         * .paymentFailedAt()
         * .paymentStartedAt()
         * .scheduledIssueAt()
         * .shippingAddress()
         * .status()
         * .subscription()
         * .subtotal()
         * .syncFailedAt()
         * .targetDate()
         * .total()
         * .voidedAt()
         * .willAutoIssue()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceFetchUpcomingResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amountDue: JsonField<String>? = null
        private var autoCollection: JsonField<AutoCollection>? = null
        private var billingAddress: JsonField<BillingAddress>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditNotes: JsonField<MutableList<CreditNote>>? = null
        private var currency: JsonField<String>? = null
        private var customer: JsonField<Customer>? = null
        private var customerBalanceTransactions:
            JsonField<MutableList<CustomerBalanceTransaction>>? =
            null
        private var customerTaxId: JsonField<CustomerTaxId>? = null
        private var discount: JsonValue? = null
        private var discounts: JsonField<MutableList<InvoiceLevelDiscount>>? = null
        private var dueDate: JsonField<OffsetDateTime>? = null
        private var eligibleToIssueAt: JsonField<OffsetDateTime>? = null
        private var hostedInvoiceUrl: JsonField<String>? = null
        private var invoiceNumber: JsonField<String>? = null
        private var invoicePdf: JsonField<String>? = null
        private var invoiceSource: JsonField<InvoiceSource>? = null
        private var issueFailedAt: JsonField<OffsetDateTime>? = null
        private var issuedAt: JsonField<OffsetDateTime>? = null
        private var lineItems: JsonField<MutableList<LineItem>>? = null
        private var maximum: JsonField<Maximum>? = null
        private var maximumAmount: JsonField<String>? = null
        private var memo: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var minimum: JsonField<Minimum>? = null
        private var minimumAmount: JsonField<String>? = null
        private var paidAt: JsonField<OffsetDateTime>? = null
        private var paymentAttempts: JsonField<MutableList<PaymentAttempt>>? = null
        private var paymentFailedAt: JsonField<OffsetDateTime>? = null
        private var paymentStartedAt: JsonField<OffsetDateTime>? = null
        private var scheduledIssueAt: JsonField<OffsetDateTime>? = null
        private var shippingAddress: JsonField<ShippingAddress>? = null
        private var status: JsonField<Status>? = null
        private var subscription: JsonField<Subscription>? = null
        private var subtotal: JsonField<String>? = null
        private var syncFailedAt: JsonField<OffsetDateTime>? = null
        private var targetDate: JsonField<OffsetDateTime>? = null
        private var total: JsonField<String>? = null
        private var voidedAt: JsonField<OffsetDateTime>? = null
        private var willAutoIssue: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invoiceFetchUpcomingResponse: InvoiceFetchUpcomingResponse) = apply {
            id = invoiceFetchUpcomingResponse.id
            amountDue = invoiceFetchUpcomingResponse.amountDue
            autoCollection = invoiceFetchUpcomingResponse.autoCollection
            billingAddress = invoiceFetchUpcomingResponse.billingAddress
            createdAt = invoiceFetchUpcomingResponse.createdAt
            creditNotes = invoiceFetchUpcomingResponse.creditNotes.map { it.toMutableList() }
            currency = invoiceFetchUpcomingResponse.currency
            customer = invoiceFetchUpcomingResponse.customer
            customerBalanceTransactions =
                invoiceFetchUpcomingResponse.customerBalanceTransactions.map { it.toMutableList() }
            customerTaxId = invoiceFetchUpcomingResponse.customerTaxId
            discount = invoiceFetchUpcomingResponse.discount
            discounts = invoiceFetchUpcomingResponse.discounts.map { it.toMutableList() }
            dueDate = invoiceFetchUpcomingResponse.dueDate
            eligibleToIssueAt = invoiceFetchUpcomingResponse.eligibleToIssueAt
            hostedInvoiceUrl = invoiceFetchUpcomingResponse.hostedInvoiceUrl
            invoiceNumber = invoiceFetchUpcomingResponse.invoiceNumber
            invoicePdf = invoiceFetchUpcomingResponse.invoicePdf
            invoiceSource = invoiceFetchUpcomingResponse.invoiceSource
            issueFailedAt = invoiceFetchUpcomingResponse.issueFailedAt
            issuedAt = invoiceFetchUpcomingResponse.issuedAt
            lineItems = invoiceFetchUpcomingResponse.lineItems.map { it.toMutableList() }
            maximum = invoiceFetchUpcomingResponse.maximum
            maximumAmount = invoiceFetchUpcomingResponse.maximumAmount
            memo = invoiceFetchUpcomingResponse.memo
            metadata = invoiceFetchUpcomingResponse.metadata
            minimum = invoiceFetchUpcomingResponse.minimum
            minimumAmount = invoiceFetchUpcomingResponse.minimumAmount
            paidAt = invoiceFetchUpcomingResponse.paidAt
            paymentAttempts =
                invoiceFetchUpcomingResponse.paymentAttempts.map { it.toMutableList() }
            paymentFailedAt = invoiceFetchUpcomingResponse.paymentFailedAt
            paymentStartedAt = invoiceFetchUpcomingResponse.paymentStartedAt
            scheduledIssueAt = invoiceFetchUpcomingResponse.scheduledIssueAt
            shippingAddress = invoiceFetchUpcomingResponse.shippingAddress
            status = invoiceFetchUpcomingResponse.status
            subscription = invoiceFetchUpcomingResponse.subscription
            subtotal = invoiceFetchUpcomingResponse.subtotal
            syncFailedAt = invoiceFetchUpcomingResponse.syncFailedAt
            targetDate = invoiceFetchUpcomingResponse.targetDate
            total = invoiceFetchUpcomingResponse.total
            voidedAt = invoiceFetchUpcomingResponse.voidedAt
            willAutoIssue = invoiceFetchUpcomingResponse.willAutoIssue
            additionalProperties = invoiceFetchUpcomingResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * This is the final amount required to be charged to the customer and reflects the
         * application of the customer balance to the `total` of the invoice.
         */
        fun amountDue(amountDue: String) = amountDue(JsonField.of(amountDue))

        /**
         * Sets [Builder.amountDue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountDue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountDue(amountDue: JsonField<String>) = apply { this.amountDue = amountDue }

        fun autoCollection(autoCollection: AutoCollection) =
            autoCollection(JsonField.of(autoCollection))

        /**
         * Sets [Builder.autoCollection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCollection] with a well-typed [AutoCollection] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoCollection(autoCollection: JsonField<AutoCollection>) = apply {
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
         * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
            this.billingAddress = billingAddress
        }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A list of credit notes associated with the invoice */
        fun creditNotes(creditNotes: List<CreditNote>) = creditNotes(JsonField.of(creditNotes))

        /**
         * Sets [Builder.creditNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditNotes] with a well-typed `List<CreditNote>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditNotes(creditNotes: JsonField<List<CreditNote>>) = apply {
            this.creditNotes = creditNotes.map { it.toMutableList() }
        }

        /**
         * Adds a single [CreditNote] to [creditNotes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditNote(creditNote: CreditNote) = apply {
            creditNotes =
                (creditNotes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("creditNotes", it).add(creditNote)
                }
        }

        /** An ISO 4217 currency string or `credits` */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun customer(customer: Customer) = customer(JsonField.of(customer))

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [Customer] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        fun customerBalanceTransactions(
            customerBalanceTransactions: List<CustomerBalanceTransaction>
        ) = customerBalanceTransactions(JsonField.of(customerBalanceTransactions))

        /**
         * Sets [Builder.customerBalanceTransactions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerBalanceTransactions] with a well-typed
         * `List<CustomerBalanceTransaction>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun customerBalanceTransactions(
            customerBalanceTransactions: JsonField<List<CustomerBalanceTransaction>>
        ) = apply {
            this.customerBalanceTransactions =
                customerBalanceTransactions.map { it.toMutableList() }
        }

        /**
         * Adds a single [CustomerBalanceTransaction] to [customerBalanceTransactions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomerBalanceTransaction(customerBalanceTransaction: CustomerBalanceTransaction) =
            apply {
                customerBalanceTransactions =
                    (customerBalanceTransactions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customerBalanceTransactions", it)
                            .add(customerBalanceTransaction)
                    }
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
        fun customerTaxId(customerTaxId: CustomerTaxId?) =
            customerTaxId(JsonField.ofNullable(customerTaxId))

        /** Alias for calling [Builder.customerTaxId] with `customerTaxId.orElse(null)`. */
        fun customerTaxId(customerTaxId: Optional<CustomerTaxId>) =
            customerTaxId(customerTaxId.getOrNull())

        /**
         * Sets [Builder.customerTaxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerTaxId] with a well-typed [CustomerTaxId] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerTaxId(customerTaxId: JsonField<CustomerTaxId>) = apply {
            this.customerTaxId = customerTaxId
        }

        /**
         * This field is deprecated in favor of `discounts`. If a `discounts` list is provided, the
         * first discount in the list will be returned. If the list is empty, `None` will be
         * returned.
         */
        @Deprecated("deprecated")
        fun discount(discount: JsonValue) = apply { this.discount = discount }

        fun discounts(discounts: List<InvoiceLevelDiscount>) = discounts(JsonField.of(discounts))

        /**
         * Sets [Builder.discounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discounts] with a well-typed
         * `List<InvoiceLevelDiscount>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun discounts(discounts: JsonField<List<InvoiceLevelDiscount>>) = apply {
            this.discounts = discounts.map { it.toMutableList() }
        }

        /**
         * Adds a single [InvoiceLevelDiscount] to [discounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDiscount(discount: InvoiceLevelDiscount) = apply {
            discounts =
                (discounts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("discounts", it).add(discount)
                }
        }

        /** Alias for calling [addDiscount] with `InvoiceLevelDiscount.ofPercentage(percentage)`. */
        fun addDiscount(percentage: PercentageDiscount) =
            addDiscount(InvoiceLevelDiscount.ofPercentage(percentage))

        /**
         * Alias for calling [addDiscount] with the following:
         * ```java
         * PercentageDiscount.builder()
         *     .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
         *     .percentageDiscount(percentageDiscount)
         *     .build()
         * ```
         */
        fun addPercentageDiscount(percentageDiscount: Double) =
            addDiscount(
                PercentageDiscount.builder()
                    .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                    .percentageDiscount(percentageDiscount)
                    .build()
            )

        /** Alias for calling [addDiscount] with `InvoiceLevelDiscount.ofAmount(amount)`. */
        fun addDiscount(amount: AmountDiscount) = addDiscount(InvoiceLevelDiscount.ofAmount(amount))

        /**
         * Alias for calling [addDiscount] with the following:
         * ```java
         * AmountDiscount.builder()
         *     .discountType(AmountDiscount.DiscountType.AMOUNT)
         *     .amountDiscount(amountDiscount)
         *     .build()
         * ```
         */
        fun addAmountDiscount(amountDiscount: String) =
            addDiscount(
                AmountDiscount.builder()
                    .discountType(AmountDiscount.DiscountType.AMOUNT)
                    .amountDiscount(amountDiscount)
                    .build()
            )

        /** Alias for calling [addDiscount] with `InvoiceLevelDiscount.ofTrial(trial)`. */
        fun addDiscount(trial: TrialDiscount) = addDiscount(InvoiceLevelDiscount.ofTrial(trial))

        /**
         * When the invoice payment is due. The due date is null if the invoice is not yet
         * finalized.
         */
        fun dueDate(dueDate: OffsetDateTime?) = dueDate(JsonField.ofNullable(dueDate))

        /** Alias for calling [Builder.dueDate] with `dueDate.orElse(null)`. */
        fun dueDate(dueDate: Optional<OffsetDateTime>) = dueDate(dueDate.getOrNull())

        /**
         * Sets [Builder.dueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

        /**
         * If the invoice has a status of `draft`, this will be the time that the invoice will be
         * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice
         * will automatically begin issuing at this time.
         */
        fun eligibleToIssueAt(eligibleToIssueAt: OffsetDateTime?) =
            eligibleToIssueAt(JsonField.ofNullable(eligibleToIssueAt))

        /** Alias for calling [Builder.eligibleToIssueAt] with `eligibleToIssueAt.orElse(null)`. */
        fun eligibleToIssueAt(eligibleToIssueAt: Optional<OffsetDateTime>) =
            eligibleToIssueAt(eligibleToIssueAt.getOrNull())

        /**
         * Sets [Builder.eligibleToIssueAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eligibleToIssueAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun eligibleToIssueAt(eligibleToIssueAt: JsonField<OffsetDateTime>) = apply {
            this.eligibleToIssueAt = eligibleToIssueAt
        }

        /**
         * A URL for the customer-facing invoice portal. This URL expires 30 days after the
         * invoice's due date, or 60 days after being re-generated through the UI.
         */
        fun hostedInvoiceUrl(hostedInvoiceUrl: String?) =
            hostedInvoiceUrl(JsonField.ofNullable(hostedInvoiceUrl))

        /** Alias for calling [Builder.hostedInvoiceUrl] with `hostedInvoiceUrl.orElse(null)`. */
        fun hostedInvoiceUrl(hostedInvoiceUrl: Optional<String>) =
            hostedInvoiceUrl(hostedInvoiceUrl.getOrNull())

        /**
         * Sets [Builder.hostedInvoiceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostedInvoiceUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hostedInvoiceUrl(hostedInvoiceUrl: JsonField<String>) = apply {
            this.hostedInvoiceUrl = hostedInvoiceUrl
        }

        /**
         * Automatically generated invoice number to help track and reconcile invoices. Invoice
         * numbers have a prefix such as `RFOBWG`. These can be sequential per account or customer.
         */
        fun invoiceNumber(invoiceNumber: String) = invoiceNumber(JsonField.of(invoiceNumber))

        /**
         * Sets [Builder.invoiceNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceNumber(invoiceNumber: JsonField<String>) = apply {
            this.invoiceNumber = invoiceNumber
        }

        /** The link to download the PDF representation of the `Invoice`. */
        fun invoicePdf(invoicePdf: String?) = invoicePdf(JsonField.ofNullable(invoicePdf))

        /** Alias for calling [Builder.invoicePdf] with `invoicePdf.orElse(null)`. */
        fun invoicePdf(invoicePdf: Optional<String>) = invoicePdf(invoicePdf.getOrNull())

        /**
         * Sets [Builder.invoicePdf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoicePdf] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoicePdf(invoicePdf: JsonField<String>) = apply { this.invoicePdf = invoicePdf }

        fun invoiceSource(invoiceSource: InvoiceSource) = invoiceSource(JsonField.of(invoiceSource))

        /**
         * Sets [Builder.invoiceSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceSource] with a well-typed [InvoiceSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoiceSource(invoiceSource: JsonField<InvoiceSource>) = apply {
            this.invoiceSource = invoiceSource
        }

        /**
         * If the invoice failed to issue, this will be the last time it failed to issue (even if it
         * is now in a different state.)
         */
        fun issueFailedAt(issueFailedAt: OffsetDateTime?) =
            issueFailedAt(JsonField.ofNullable(issueFailedAt))

        /** Alias for calling [Builder.issueFailedAt] with `issueFailedAt.orElse(null)`. */
        fun issueFailedAt(issueFailedAt: Optional<OffsetDateTime>) =
            issueFailedAt(issueFailedAt.getOrNull())

        /**
         * Sets [Builder.issueFailedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issueFailedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issueFailedAt(issueFailedAt: JsonField<OffsetDateTime>) = apply {
            this.issueFailedAt = issueFailedAt
        }

        /**
         * If the invoice has been issued, this will be the time it transitioned to `issued` (even
         * if it is now in a different state.)
         */
        fun issuedAt(issuedAt: OffsetDateTime?) = issuedAt(JsonField.ofNullable(issuedAt))

        /** Alias for calling [Builder.issuedAt] with `issuedAt.orElse(null)`. */
        fun issuedAt(issuedAt: Optional<OffsetDateTime>) = issuedAt(issuedAt.getOrNull())

        /**
         * Sets [Builder.issuedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { this.issuedAt = issuedAt }

        /** The breakdown of prices in this invoice. */
        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        /**
         * Sets [Builder.lineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItems] with a well-typed `List<LineItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [LineItem] to [lineItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLineItem(lineItem: LineItem) = apply {
            lineItems =
                (lineItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("lineItems", it).add(lineItem)
                }
        }

        fun maximum(maximum: Maximum?) = maximum(JsonField.ofNullable(maximum))

        /** Alias for calling [Builder.maximum] with `maximum.orElse(null)`. */
        fun maximum(maximum: Optional<Maximum>) = maximum(maximum.getOrNull())

        /**
         * Sets [Builder.maximum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximum] with a well-typed [Maximum] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

        fun maximumAmount(maximumAmount: String?) =
            maximumAmount(JsonField.ofNullable(maximumAmount))

        /** Alias for calling [Builder.maximumAmount] with `maximumAmount.orElse(null)`. */
        fun maximumAmount(maximumAmount: Optional<String>) =
            maximumAmount(maximumAmount.getOrNull())

        /**
         * Sets [Builder.maximumAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
        }

        /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
        fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

        /** Alias for calling [Builder.memo] with `memo.orElse(null)`. */
        fun memo(memo: Optional<String>) = memo(memo.getOrNull())

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

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

        fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

        /** Alias for calling [Builder.minimum] with `minimum.orElse(null)`. */
        fun minimum(minimum: Optional<Minimum>) = minimum(minimum.getOrNull())

        /**
         * Sets [Builder.minimum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimum] with a well-typed [Minimum] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

        fun minimumAmount(minimumAmount: String?) =
            minimumAmount(JsonField.ofNullable(minimumAmount))

        /** Alias for calling [Builder.minimumAmount] with `minimumAmount.orElse(null)`. */
        fun minimumAmount(minimumAmount: Optional<String>) =
            minimumAmount(minimumAmount.getOrNull())

        /**
         * Sets [Builder.minimumAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        /**
         * If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid.
         */
        fun paidAt(paidAt: OffsetDateTime?) = paidAt(JsonField.ofNullable(paidAt))

        /** Alias for calling [Builder.paidAt] with `paidAt.orElse(null)`. */
        fun paidAt(paidAt: Optional<OffsetDateTime>) = paidAt(paidAt.getOrNull())

        /**
         * Sets [Builder.paidAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paidAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paidAt(paidAt: JsonField<OffsetDateTime>) = apply { this.paidAt = paidAt }

        /** A list of payment attempts associated with the invoice */
        fun paymentAttempts(paymentAttempts: List<PaymentAttempt>) =
            paymentAttempts(JsonField.of(paymentAttempts))

        /**
         * Sets [Builder.paymentAttempts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentAttempts] with a well-typed
         * `List<PaymentAttempt>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun paymentAttempts(paymentAttempts: JsonField<List<PaymentAttempt>>) = apply {
            this.paymentAttempts = paymentAttempts.map { it.toMutableList() }
        }

        /**
         * Adds a single [PaymentAttempt] to [paymentAttempts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentAttempt(paymentAttempt: PaymentAttempt) = apply {
            paymentAttempts =
                (paymentAttempts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("paymentAttempts", it).add(paymentAttempt)
                }
        }

        /**
         * If payment was attempted on this invoice but failed, this will be the time of the most
         * recent attempt.
         */
        fun paymentFailedAt(paymentFailedAt: OffsetDateTime?) =
            paymentFailedAt(JsonField.ofNullable(paymentFailedAt))

        /** Alias for calling [Builder.paymentFailedAt] with `paymentFailedAt.orElse(null)`. */
        fun paymentFailedAt(paymentFailedAt: Optional<OffsetDateTime>) =
            paymentFailedAt(paymentFailedAt.getOrNull())

        /**
         * Sets [Builder.paymentFailedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentFailedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentFailedAt(paymentFailedAt: JsonField<OffsetDateTime>) = apply {
            this.paymentFailedAt = paymentFailedAt
        }

        /**
         * If payment was attempted on this invoice, this will be the start time of the most recent
         * attempt. This field is especially useful for delayed-notification payment mechanisms
         * (like bank transfers), where payment can take 3 days or more.
         */
        fun paymentStartedAt(paymentStartedAt: OffsetDateTime?) =
            paymentStartedAt(JsonField.ofNullable(paymentStartedAt))

        /** Alias for calling [Builder.paymentStartedAt] with `paymentStartedAt.orElse(null)`. */
        fun paymentStartedAt(paymentStartedAt: Optional<OffsetDateTime>) =
            paymentStartedAt(paymentStartedAt.getOrNull())

        /**
         * Sets [Builder.paymentStartedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentStartedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentStartedAt(paymentStartedAt: JsonField<OffsetDateTime>) = apply {
            this.paymentStartedAt = paymentStartedAt
        }

        /**
         * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to
         * be issued.
         */
        fun scheduledIssueAt(scheduledIssueAt: OffsetDateTime?) =
            scheduledIssueAt(JsonField.ofNullable(scheduledIssueAt))

        /** Alias for calling [Builder.scheduledIssueAt] with `scheduledIssueAt.orElse(null)`. */
        fun scheduledIssueAt(scheduledIssueAt: Optional<OffsetDateTime>) =
            scheduledIssueAt(scheduledIssueAt.getOrNull())

        /**
         * Sets [Builder.scheduledIssueAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledIssueAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun scheduledIssueAt(scheduledIssueAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledIssueAt = scheduledIssueAt
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
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun shippingAddress(shippingAddress: JsonField<ShippingAddress>) = apply {
            this.shippingAddress = shippingAddress
        }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun subscription(subscription: Subscription?) =
            subscription(JsonField.ofNullable(subscription))

        /** Alias for calling [Builder.subscription] with `subscription.orElse(null)`. */
        fun subscription(subscription: Optional<Subscription>) =
            subscription(subscription.getOrNull())

        /**
         * Sets [Builder.subscription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscription] with a well-typed [Subscription] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscription(subscription: JsonField<Subscription>) = apply {
            this.subscription = subscription
        }

        /** The total before any discounts and minimums are applied. */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /**
         * Sets [Builder.subtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtotal] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        /**
         * If the invoice failed to sync, this will be the last time an external invoicing provider
         * sync was attempted. This field will always be `null` for invoices using Orb Invoicing.
         */
        fun syncFailedAt(syncFailedAt: OffsetDateTime?) =
            syncFailedAt(JsonField.ofNullable(syncFailedAt))

        /** Alias for calling [Builder.syncFailedAt] with `syncFailedAt.orElse(null)`. */
        fun syncFailedAt(syncFailedAt: Optional<OffsetDateTime>) =
            syncFailedAt(syncFailedAt.getOrNull())

        /**
         * Sets [Builder.syncFailedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.syncFailedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun syncFailedAt(syncFailedAt: JsonField<OffsetDateTime>) = apply {
            this.syncFailedAt = syncFailedAt
        }

        /** The scheduled date of the invoice */
        fun targetDate(targetDate: OffsetDateTime) = targetDate(JsonField.of(targetDate))

        /**
         * Sets [Builder.targetDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetDate(targetDate: JsonField<OffsetDateTime>) = apply {
            this.targetDate = targetDate
        }

        /** The total after any minimums and discounts have been applied. */
        fun total(total: String) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<String>) = apply { this.total = total }

        /**
         * If the invoice has a status of `void`, this gives a timestamp when the invoice was
         * voided.
         */
        fun voidedAt(voidedAt: OffsetDateTime?) = voidedAt(JsonField.ofNullable(voidedAt))

        /** Alias for calling [Builder.voidedAt] with `voidedAt.orElse(null)`. */
        fun voidedAt(voidedAt: Optional<OffsetDateTime>) = voidedAt(voidedAt.getOrNull())

        /**
         * Sets [Builder.voidedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voidedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

        /**
         * This is true if the invoice will be automatically issued in the future, and false
         * otherwise.
         */
        fun willAutoIssue(willAutoIssue: Boolean) = willAutoIssue(JsonField.of(willAutoIssue))

        /**
         * Sets [Builder.willAutoIssue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.willAutoIssue] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun willAutoIssue(willAutoIssue: JsonField<Boolean>) = apply {
            this.willAutoIssue = willAutoIssue
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
         * Returns an immutable instance of [InvoiceFetchUpcomingResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amountDue()
         * .autoCollection()
         * .billingAddress()
         * .createdAt()
         * .creditNotes()
         * .currency()
         * .customer()
         * .customerBalanceTransactions()
         * .customerTaxId()
         * .discount()
         * .discounts()
         * .dueDate()
         * .eligibleToIssueAt()
         * .hostedInvoiceUrl()
         * .invoiceNumber()
         * .invoicePdf()
         * .invoiceSource()
         * .issueFailedAt()
         * .issuedAt()
         * .lineItems()
         * .maximum()
         * .maximumAmount()
         * .memo()
         * .metadata()
         * .minimum()
         * .minimumAmount()
         * .paidAt()
         * .paymentAttempts()
         * .paymentFailedAt()
         * .paymentStartedAt()
         * .scheduledIssueAt()
         * .shippingAddress()
         * .status()
         * .subscription()
         * .subtotal()
         * .syncFailedAt()
         * .targetDate()
         * .total()
         * .voidedAt()
         * .willAutoIssue()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceFetchUpcomingResponse =
            InvoiceFetchUpcomingResponse(
                checkRequired("id", id),
                checkRequired("amountDue", amountDue),
                checkRequired("autoCollection", autoCollection),
                checkRequired("billingAddress", billingAddress),
                checkRequired("createdAt", createdAt),
                checkRequired("creditNotes", creditNotes).map { it.toImmutable() },
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("customerBalanceTransactions", customerBalanceTransactions).map {
                    it.toImmutable()
                },
                checkRequired("customerTaxId", customerTaxId),
                checkRequired("discount", discount),
                checkRequired("discounts", discounts).map { it.toImmutable() },
                checkRequired("dueDate", dueDate),
                checkRequired("eligibleToIssueAt", eligibleToIssueAt),
                checkRequired("hostedInvoiceUrl", hostedInvoiceUrl),
                checkRequired("invoiceNumber", invoiceNumber),
                checkRequired("invoicePdf", invoicePdf),
                checkRequired("invoiceSource", invoiceSource),
                checkRequired("issueFailedAt", issueFailedAt),
                checkRequired("issuedAt", issuedAt),
                checkRequired("lineItems", lineItems).map { it.toImmutable() },
                checkRequired("maximum", maximum),
                checkRequired("maximumAmount", maximumAmount),
                checkRequired("memo", memo),
                checkRequired("metadata", metadata),
                checkRequired("minimum", minimum),
                checkRequired("minimumAmount", minimumAmount),
                checkRequired("paidAt", paidAt),
                checkRequired("paymentAttempts", paymentAttempts).map { it.toImmutable() },
                checkRequired("paymentFailedAt", paymentFailedAt),
                checkRequired("paymentStartedAt", paymentStartedAt),
                checkRequired("scheduledIssueAt", scheduledIssueAt),
                checkRequired("shippingAddress", shippingAddress),
                checkRequired("status", status),
                checkRequired("subscription", subscription),
                checkRequired("subtotal", subtotal),
                checkRequired("syncFailedAt", syncFailedAt),
                checkRequired("targetDate", targetDate),
                checkRequired("total", total),
                checkRequired("voidedAt", voidedAt),
                checkRequired("willAutoIssue", willAutoIssue),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InvoiceFetchUpcomingResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        amountDue()
        autoCollection().validate()
        billingAddress().ifPresent { it.validate() }
        createdAt()
        creditNotes().forEach { it.validate() }
        currency()
        customer().validate()
        customerBalanceTransactions().forEach { it.validate() }
        customerTaxId().ifPresent { it.validate() }
        discounts().forEach { it.validate() }
        dueDate()
        eligibleToIssueAt()
        hostedInvoiceUrl()
        invoiceNumber()
        invoicePdf()
        invoiceSource().validate()
        issueFailedAt()
        issuedAt()
        lineItems().forEach { it.validate() }
        maximum().ifPresent { it.validate() }
        maximumAmount()
        memo()
        metadata().validate()
        minimum().ifPresent { it.validate() }
        minimumAmount()
        paidAt()
        paymentAttempts().forEach { it.validate() }
        paymentFailedAt()
        paymentStartedAt()
        scheduledIssueAt()
        shippingAddress().ifPresent { it.validate() }
        status().validate()
        subscription().ifPresent { it.validate() }
        subtotal()
        syncFailedAt()
        targetDate()
        total()
        voidedAt()
        willAutoIssue()
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
            (if (amountDue.asKnown().isPresent) 1 else 0) +
            (autoCollection.asKnown().getOrNull()?.validity() ?: 0) +
            (billingAddress.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (creditNotes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (customer.asKnown().getOrNull()?.validity() ?: 0) +
            (customerBalanceTransactions.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (customerTaxId.asKnown().getOrNull()?.validity() ?: 0) +
            (discounts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (dueDate.asKnown().isPresent) 1 else 0) +
            (if (eligibleToIssueAt.asKnown().isPresent) 1 else 0) +
            (if (hostedInvoiceUrl.asKnown().isPresent) 1 else 0) +
            (if (invoiceNumber.asKnown().isPresent) 1 else 0) +
            (if (invoicePdf.asKnown().isPresent) 1 else 0) +
            (invoiceSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (issueFailedAt.asKnown().isPresent) 1 else 0) +
            (if (issuedAt.asKnown().isPresent) 1 else 0) +
            (lineItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (maximum.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maximumAmount.asKnown().isPresent) 1 else 0) +
            (if (memo.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (minimum.asKnown().getOrNull()?.validity() ?: 0) +
            (if (minimumAmount.asKnown().isPresent) 1 else 0) +
            (if (paidAt.asKnown().isPresent) 1 else 0) +
            (paymentAttempts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (paymentFailedAt.asKnown().isPresent) 1 else 0) +
            (if (paymentStartedAt.asKnown().isPresent) 1 else 0) +
            (if (scheduledIssueAt.asKnown().isPresent) 1 else 0) +
            (shippingAddress.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (subscription.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subtotal.asKnown().isPresent) 1 else 0) +
            (if (syncFailedAt.asKnown().isPresent) 1 else 0) +
            (if (targetDate.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0) +
            (if (voidedAt.asKnown().isPresent) 1 else 0) +
            (if (willAutoIssue.asKnown().isPresent) 1 else 0)

    class AutoCollection
    private constructor(
        private val enabled: JsonField<Boolean>,
        private val nextAttemptAt: JsonField<OffsetDateTime>,
        private val numAttempts: JsonField<Long>,
        private val previouslyAttemptedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("next_attempt_at")
            @ExcludeMissing
            nextAttemptAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("num_attempts")
            @ExcludeMissing
            numAttempts: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("previously_attempted_at")
            @ExcludeMissing
            previouslyAttemptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(enabled, nextAttemptAt, numAttempts, previouslyAttemptedAt, mutableMapOf())

        /**
         * True only if auto-collection is enabled for this invoice.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

        /**
         * If the invoice is scheduled for auto-collection, this field will reflect when the next
         * attempt will occur. If dunning has been exhausted, or auto-collection is not enabled for
         * this invoice, this field will be `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nextAttemptAt(): Optional<OffsetDateTime> = nextAttemptAt.getOptional("next_attempt_at")

        /**
         * Number of auto-collection payment attempts.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numAttempts(): Optional<Long> = numAttempts.getOptional("num_attempts")

        /**
         * If Orb has ever attempted payment auto-collection for this invoice, this field will
         * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can be
         * used to tell whether the invoice is currently in dunning (that is,
         * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
         * dunning has been exhausted (`previously_attempted_at` is non-null, but
         * `next_attempt_time` is null).
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previouslyAttemptedAt(): Optional<OffsetDateTime> =
            previouslyAttemptedAt.getOptional("previously_attempted_at")

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [nextAttemptAt].
         *
         * Unlike [nextAttemptAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("next_attempt_at")
        @ExcludeMissing
        fun _nextAttemptAt(): JsonField<OffsetDateTime> = nextAttemptAt

        /**
         * Returns the raw JSON value of [numAttempts].
         *
         * Unlike [numAttempts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_attempts")
        @ExcludeMissing
        fun _numAttempts(): JsonField<Long> = numAttempts

        /**
         * Returns the raw JSON value of [previouslyAttemptedAt].
         *
         * Unlike [previouslyAttemptedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("previously_attempted_at")
        @ExcludeMissing
        fun _previouslyAttemptedAt(): JsonField<OffsetDateTime> = previouslyAttemptedAt

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
             * Returns a mutable builder for constructing an instance of [AutoCollection].
             *
             * The following fields are required:
             * ```java
             * .enabled()
             * .nextAttemptAt()
             * .numAttempts()
             * .previouslyAttemptedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AutoCollection]. */
        class Builder internal constructor() {

            private var enabled: JsonField<Boolean>? = null
            private var nextAttemptAt: JsonField<OffsetDateTime>? = null
            private var numAttempts: JsonField<Long>? = null
            private var previouslyAttemptedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(autoCollection: AutoCollection) = apply {
                enabled = autoCollection.enabled
                nextAttemptAt = autoCollection.nextAttemptAt
                numAttempts = autoCollection.numAttempts
                previouslyAttemptedAt = autoCollection.previouslyAttemptedAt
                additionalProperties = autoCollection.additionalProperties.toMutableMap()
            }

            /** True only if auto-collection is enabled for this invoice. */
            fun enabled(enabled: Boolean?) = enabled(JsonField.ofNullable(enabled))

            /**
             * Alias for [Builder.enabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun enabled(enabled: Boolean) = enabled(enabled as Boolean?)

            /** Alias for calling [Builder.enabled] with `enabled.orElse(null)`. */
            fun enabled(enabled: Optional<Boolean>) = enabled(enabled.getOrNull())

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /**
             * If the invoice is scheduled for auto-collection, this field will reflect when the
             * next attempt will occur. If dunning has been exhausted, or auto-collection is not
             * enabled for this invoice, this field will be `null`.
             */
            fun nextAttemptAt(nextAttemptAt: OffsetDateTime?) =
                nextAttemptAt(JsonField.ofNullable(nextAttemptAt))

            /** Alias for calling [Builder.nextAttemptAt] with `nextAttemptAt.orElse(null)`. */
            fun nextAttemptAt(nextAttemptAt: Optional<OffsetDateTime>) =
                nextAttemptAt(nextAttemptAt.getOrNull())

            /**
             * Sets [Builder.nextAttemptAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextAttemptAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nextAttemptAt(nextAttemptAt: JsonField<OffsetDateTime>) = apply {
                this.nextAttemptAt = nextAttemptAt
            }

            /** Number of auto-collection payment attempts. */
            fun numAttempts(numAttempts: Long?) = numAttempts(JsonField.ofNullable(numAttempts))

            /**
             * Alias for [Builder.numAttempts].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numAttempts(numAttempts: Long) = numAttempts(numAttempts as Long?)

            /** Alias for calling [Builder.numAttempts] with `numAttempts.orElse(null)`. */
            fun numAttempts(numAttempts: Optional<Long>) = numAttempts(numAttempts.getOrNull())

            /**
             * Sets [Builder.numAttempts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numAttempts] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numAttempts(numAttempts: JsonField<Long>) = apply { this.numAttempts = numAttempts }

            /**
             * If Orb has ever attempted payment auto-collection for this invoice, this field will
             * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can
             * be used to tell whether the invoice is currently in dunning (that is,
             * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
             * dunning has been exhausted (`previously_attempted_at` is non-null, but
             * `next_attempt_time` is null).
             */
            fun previouslyAttemptedAt(previouslyAttemptedAt: OffsetDateTime?) =
                previouslyAttemptedAt(JsonField.ofNullable(previouslyAttemptedAt))

            /**
             * Alias for calling [Builder.previouslyAttemptedAt] with
             * `previouslyAttemptedAt.orElse(null)`.
             */
            fun previouslyAttemptedAt(previouslyAttemptedAt: Optional<OffsetDateTime>) =
                previouslyAttemptedAt(previouslyAttemptedAt.getOrNull())

            /**
             * Sets [Builder.previouslyAttemptedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previouslyAttemptedAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun previouslyAttemptedAt(previouslyAttemptedAt: JsonField<OffsetDateTime>) = apply {
                this.previouslyAttemptedAt = previouslyAttemptedAt
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
             * Returns an immutable instance of [AutoCollection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .enabled()
             * .nextAttemptAt()
             * .numAttempts()
             * .previouslyAttemptedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AutoCollection =
                AutoCollection(
                    checkRequired("enabled", enabled),
                    checkRequired("nextAttemptAt", nextAttemptAt),
                    checkRequired("numAttempts", numAttempts),
                    checkRequired("previouslyAttemptedAt", previouslyAttemptedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AutoCollection = apply {
            if (validated) {
                return@apply
            }

            enabled()
            nextAttemptAt()
            numAttempts()
            previouslyAttemptedAt()
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
            (if (enabled.asKnown().isPresent) 1 else 0) +
                (if (nextAttemptAt.asKnown().isPresent) 1 else 0) +
                (if (numAttempts.asKnown().isPresent) 1 else 0) +
                (if (previouslyAttemptedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AutoCollection && enabled == other.enabled && nextAttemptAt == other.nextAttemptAt && numAttempts == other.numAttempts && previouslyAttemptedAt == other.previouslyAttemptedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(enabled, nextAttemptAt, numAttempts, previouslyAttemptedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AutoCollection{enabled=$enabled, nextAttemptAt=$nextAttemptAt, numAttempts=$numAttempts, previouslyAttemptedAt=$previouslyAttemptedAt, additionalProperties=$additionalProperties}"
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

            /**
             * Returns a mutable builder for constructing an instance of [BillingAddress].
             *
             * The following fields are required:
             * ```java
             * .city()
             * .country()
             * .line1()
             * .line2()
             * .postalCode()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillingAddress]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var line2: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var state: JsonField<String>? = null
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
             *
             * The following fields are required:
             * ```java
             * .city()
             * .country()
             * .line1()
             * .line2()
             * .postalCode()
             * .state()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BillingAddress =
                BillingAddress(
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("line2", line2),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
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

    class CreditNote
    private constructor(
        private val id: JsonField<String>,
        private val creditNoteNumber: JsonField<String>,
        private val memo: JsonField<String>,
        private val reason: JsonField<String>,
        private val total: JsonField<String>,
        private val type: JsonField<String>,
        private val voidedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_note_number")
            @ExcludeMissing
            creditNoteNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voided_at")
            @ExcludeMissing
            voidedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, creditNoteNumber, memo, reason, total, type, voidedAt, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditNoteNumber(): String = creditNoteNumber.getRequired("credit_note_number")

        /**
         * An optional memo supplied on the credit note.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): Optional<String> = memo.getOptional("memo")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): String = reason.getRequired("reason")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun total(): String = total.getRequired("total")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * If the credit note has a status of `void`, this gives a timestamp when the credit note
         * was voided.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voidedAt(): Optional<OffsetDateTime> = voidedAt.getOptional("voided_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [creditNoteNumber].
         *
         * Unlike [creditNoteNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credit_note_number")
        @ExcludeMissing
        fun _creditNoteNumber(): JsonField<String> = creditNoteNumber

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [voidedAt].
         *
         * Unlike [voidedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voided_at")
        @ExcludeMissing
        fun _voidedAt(): JsonField<OffsetDateTime> = voidedAt

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
             * Returns a mutable builder for constructing an instance of [CreditNote].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creditNoteNumber()
             * .memo()
             * .reason()
             * .total()
             * .type()
             * .voidedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreditNote]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var creditNoteNumber: JsonField<String>? = null
            private var memo: JsonField<String>? = null
            private var reason: JsonField<String>? = null
            private var total: JsonField<String>? = null
            private var type: JsonField<String>? = null
            private var voidedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditNote: CreditNote) = apply {
                id = creditNote.id
                creditNoteNumber = creditNote.creditNoteNumber
                memo = creditNote.memo
                reason = creditNote.reason
                total = creditNote.total
                type = creditNote.type
                voidedAt = creditNote.voidedAt
                additionalProperties = creditNote.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun creditNoteNumber(creditNoteNumber: String) =
                creditNoteNumber(JsonField.of(creditNoteNumber))

            /**
             * Sets [Builder.creditNoteNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditNoteNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditNoteNumber(creditNoteNumber: JsonField<String>) = apply {
                this.creditNoteNumber = creditNoteNumber
            }

            /** An optional memo supplied on the credit note. */
            fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

            /** Alias for calling [Builder.memo] with `memo.orElse(null)`. */
            fun memo(memo: Optional<String>) = memo(memo.getOrNull())

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun total(total: String) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun total(total: JsonField<String>) = apply { this.total = total }

            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /**
             * If the credit note has a status of `void`, this gives a timestamp when the credit
             * note was voided.
             */
            fun voidedAt(voidedAt: OffsetDateTime?) = voidedAt(JsonField.ofNullable(voidedAt))

            /** Alias for calling [Builder.voidedAt] with `voidedAt.orElse(null)`. */
            fun voidedAt(voidedAt: Optional<OffsetDateTime>) = voidedAt(voidedAt.getOrNull())

            /**
             * Sets [Builder.voidedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voidedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

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
             * Returns an immutable instance of [CreditNote].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creditNoteNumber()
             * .memo()
             * .reason()
             * .total()
             * .type()
             * .voidedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditNote =
                CreditNote(
                    checkRequired("id", id),
                    checkRequired("creditNoteNumber", creditNoteNumber),
                    checkRequired("memo", memo),
                    checkRequired("reason", reason),
                    checkRequired("total", total),
                    checkRequired("type", type),
                    checkRequired("voidedAt", voidedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreditNote = apply {
            if (validated) {
                return@apply
            }

            id()
            creditNoteNumber()
            memo()
            reason()
            total()
            type()
            voidedAt()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (creditNoteNumber.asKnown().isPresent) 1 else 0) +
                (if (memo.asKnown().isPresent) 1 else 0) +
                (if (reason.asKnown().isPresent) 1 else 0) +
                (if (total.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (voidedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditNote && id == other.id && creditNoteNumber == other.creditNoteNumber && memo == other.memo && reason == other.reason && total == other.total && type == other.type && voidedAt == other.voidedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, creditNoteNumber, memo, reason, total, type, voidedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditNote{id=$id, creditNoteNumber=$creditNoteNumber, memo=$memo, reason=$reason, total=$total, type=$type, voidedAt=$voidedAt, additionalProperties=$additionalProperties}"
    }

    class Customer
    private constructor(
        private val id: JsonField<String>,
        private val externalCustomerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            externalCustomerId: JsonField<String> = JsonMissing.of(),
        ) : this(id, externalCustomerId, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalCustomerId(): Optional<String> =
            externalCustomerId.getOptional("external_customer_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [externalCustomerId].
         *
         * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

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
             * .externalCustomerId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Customer]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var externalCustomerId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customer: Customer) = apply {
                id = customer.id
                externalCustomerId = customer.externalCustomerId
                additionalProperties = customer.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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
             * .externalCustomerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Customer =
                Customer(
                    checkRequired("id", id),
                    checkRequired("externalCustomerId", externalCustomerId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Customer = apply {
            if (validated) {
                return@apply
            }

            id()
            externalCustomerId()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (externalCustomerId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Customer && id == other.id && externalCustomerId == other.externalCustomerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, externalCustomerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Customer{id=$id, externalCustomerId=$externalCustomerId, additionalProperties=$additionalProperties}"
    }

    class CustomerBalanceTransaction
    private constructor(
        private val id: JsonField<String>,
        private val action: JsonField<Action>,
        private val amount: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val creditNote: JsonField<CreditNote>,
        private val description: JsonField<String>,
        private val endingBalance: JsonField<String>,
        private val invoice: JsonField<Invoice>,
        private val startingBalance: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_note")
            @ExcludeMissing
            creditNote: JsonField<CreditNote> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_balance")
            @ExcludeMissing
            endingBalance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice") @ExcludeMissing invoice: JsonField<Invoice> = JsonMissing.of(),
            @JsonProperty("starting_balance")
            @ExcludeMissing
            startingBalance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            id,
            action,
            amount,
            createdAt,
            creditNote,
            description,
            endingBalance,
            invoice,
            startingBalance,
            type,
            mutableMapOf(),
        )

        /**
         * A unique id for this transaction.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun action(): Action = action.getRequired("action")

        /**
         * The value of the amount changed in the transaction.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String = amount.getRequired("amount")

        /**
         * The creation time of this transaction.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun creditNote(): Optional<CreditNote> = creditNote.getOptional("credit_note")

        /**
         * An optional description provided for manual customer balance adjustments.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The new value of the customer's balance prior to the transaction, in the customer's
         * currency.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endingBalance(): String = endingBalance.getRequired("ending_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoice(): Optional<Invoice> = invoice.getOptional("invoice")

        /**
         * The original value of the customer's balance prior to the transaction, in the customer's
         * currency.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingBalance(): String = startingBalance.getRequired("starting_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [creditNote].
         *
         * Unlike [creditNote], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_note")
        @ExcludeMissing
        fun _creditNote(): JsonField<CreditNote> = creditNote

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endingBalance].
         *
         * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<String> = endingBalance

        /**
         * Returns the raw JSON value of [invoice].
         *
         * Unlike [invoice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoice") @ExcludeMissing fun _invoice(): JsonField<Invoice> = invoice

        /**
         * Returns the raw JSON value of [startingBalance].
         *
         * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<String> = startingBalance

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * [CustomerBalanceTransaction].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .action()
             * .amount()
             * .createdAt()
             * .creditNote()
             * .description()
             * .endingBalance()
             * .invoice()
             * .startingBalance()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerBalanceTransaction]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var action: JsonField<Action>? = null
            private var amount: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var creditNote: JsonField<CreditNote>? = null
            private var description: JsonField<String>? = null
            private var endingBalance: JsonField<String>? = null
            private var invoice: JsonField<Invoice>? = null
            private var startingBalance: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerBalanceTransaction: CustomerBalanceTransaction) = apply {
                id = customerBalanceTransaction.id
                action = customerBalanceTransaction.action
                amount = customerBalanceTransaction.amount
                createdAt = customerBalanceTransaction.createdAt
                creditNote = customerBalanceTransaction.creditNote
                description = customerBalanceTransaction.description
                endingBalance = customerBalanceTransaction.endingBalance
                invoice = customerBalanceTransaction.invoice
                startingBalance = customerBalanceTransaction.startingBalance
                type = customerBalanceTransaction.type
                additionalProperties =
                    customerBalanceTransaction.additionalProperties.toMutableMap()
            }

            /** A unique id for this transaction. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun action(action: Action) = action(JsonField.of(action))

            /**
             * Sets [Builder.action] to an arbitrary JSON value.
             *
             * You should usually call [Builder.action] with a well-typed [Action] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun action(action: JsonField<Action>) = apply { this.action = action }

            /** The value of the amount changed in the transaction. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The creation time of this transaction. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditNote(creditNote: CreditNote?) = creditNote(JsonField.ofNullable(creditNote))

            /** Alias for calling [Builder.creditNote] with `creditNote.orElse(null)`. */
            fun creditNote(creditNote: Optional<CreditNote>) = creditNote(creditNote.getOrNull())

            /**
             * Sets [Builder.creditNote] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditNote] with a well-typed [CreditNote] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditNote(creditNote: JsonField<CreditNote>) = apply {
                this.creditNote = creditNote
            }

            /** An optional description provided for manual customer balance adjustments. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The new value of the customer's balance prior to the transaction, in the customer's
             * currency.
             */
            fun endingBalance(endingBalance: String) = endingBalance(JsonField.of(endingBalance))

            /**
             * Sets [Builder.endingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBalance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endingBalance(endingBalance: JsonField<String>) = apply {
                this.endingBalance = endingBalance
            }

            fun invoice(invoice: Invoice?) = invoice(JsonField.ofNullable(invoice))

            /** Alias for calling [Builder.invoice] with `invoice.orElse(null)`. */
            fun invoice(invoice: Optional<Invoice>) = invoice(invoice.getOrNull())

            /**
             * Sets [Builder.invoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoice] with a well-typed [Invoice] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoice(invoice: JsonField<Invoice>) = apply { this.invoice = invoice }

            /**
             * The original value of the customer's balance prior to the transaction, in the
             * customer's currency.
             */
            fun startingBalance(startingBalance: String) =
                startingBalance(JsonField.of(startingBalance))

            /**
             * Sets [Builder.startingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingBalance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingBalance(startingBalance: JsonField<String>) = apply {
                this.startingBalance = startingBalance
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [CustomerBalanceTransaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .action()
             * .amount()
             * .createdAt()
             * .creditNote()
             * .description()
             * .endingBalance()
             * .invoice()
             * .startingBalance()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CustomerBalanceTransaction =
                CustomerBalanceTransaction(
                    checkRequired("id", id),
                    checkRequired("action", action),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditNote", creditNote),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("invoice", invoice),
                    checkRequired("startingBalance", startingBalance),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CustomerBalanceTransaction = apply {
            if (validated) {
                return@apply
            }

            id()
            action().validate()
            amount()
            createdAt()
            creditNote().ifPresent { it.validate() }
            description()
            endingBalance()
            invoice().ifPresent { it.validate() }
            startingBalance()
            type().validate()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (action.asKnown().getOrNull()?.validity() ?: 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (creditNote.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (endingBalance.asKnown().isPresent) 1 else 0) +
                (invoice.asKnown().getOrNull()?.validity() ?: 0) +
                (if (startingBalance.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val APPLIED_TO_INVOICE = of("applied_to_invoice")

                @JvmField val MANUAL_ADJUSTMENT = of("manual_adjustment")

                @JvmField val PRORATED_REFUND = of("prorated_refund")

                @JvmField val REVERT_PRORATED_REFUND = of("revert_prorated_refund")

                @JvmField val RETURN_FROM_VOIDING = of("return_from_voiding")

                @JvmField val CREDIT_NOTE_APPLIED = of("credit_note_applied")

                @JvmField val CREDIT_NOTE_VOIDED = of("credit_note_voided")

                @JvmField val OVERPAYMENT_REFUND = of("overpayment_refund")

                @JvmField val EXTERNAL_PAYMENT = of("external_payment")

                @JvmStatic fun of(value: String) = Action(JsonField.of(value))
            }

            /** An enum containing [Action]'s known values. */
            enum class Known {
                APPLIED_TO_INVOICE,
                MANUAL_ADJUSTMENT,
                PRORATED_REFUND,
                REVERT_PRORATED_REFUND,
                RETURN_FROM_VOIDING,
                CREDIT_NOTE_APPLIED,
                CREDIT_NOTE_VOIDED,
                OVERPAYMENT_REFUND,
                EXTERNAL_PAYMENT,
            }

            /**
             * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Action] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPLIED_TO_INVOICE,
                MANUAL_ADJUSTMENT,
                PRORATED_REFUND,
                REVERT_PRORATED_REFUND,
                RETURN_FROM_VOIDING,
                CREDIT_NOTE_APPLIED,
                CREDIT_NOTE_VOIDED,
                OVERPAYMENT_REFUND,
                EXTERNAL_PAYMENT,
                /**
                 * An enum member indicating that [Action] was instantiated with an unknown value.
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
                    APPLIED_TO_INVOICE -> Value.APPLIED_TO_INVOICE
                    MANUAL_ADJUSTMENT -> Value.MANUAL_ADJUSTMENT
                    PRORATED_REFUND -> Value.PRORATED_REFUND
                    REVERT_PRORATED_REFUND -> Value.REVERT_PRORATED_REFUND
                    RETURN_FROM_VOIDING -> Value.RETURN_FROM_VOIDING
                    CREDIT_NOTE_APPLIED -> Value.CREDIT_NOTE_APPLIED
                    CREDIT_NOTE_VOIDED -> Value.CREDIT_NOTE_VOIDED
                    OVERPAYMENT_REFUND -> Value.OVERPAYMENT_REFUND
                    EXTERNAL_PAYMENT -> Value.EXTERNAL_PAYMENT
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
                    APPLIED_TO_INVOICE -> Known.APPLIED_TO_INVOICE
                    MANUAL_ADJUSTMENT -> Known.MANUAL_ADJUSTMENT
                    PRORATED_REFUND -> Known.PRORATED_REFUND
                    REVERT_PRORATED_REFUND -> Known.REVERT_PRORATED_REFUND
                    RETURN_FROM_VOIDING -> Known.RETURN_FROM_VOIDING
                    CREDIT_NOTE_APPLIED -> Known.CREDIT_NOTE_APPLIED
                    CREDIT_NOTE_VOIDED -> Known.CREDIT_NOTE_VOIDED
                    OVERPAYMENT_REFUND -> Known.OVERPAYMENT_REFUND
                    EXTERNAL_PAYMENT -> Known.EXTERNAL_PAYMENT
                    else -> throw OrbInvalidDataException("Unknown Action: $value")
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

            fun validate(): Action = apply {
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

                return /* spotless:off */ other is Action && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class CreditNote
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
            ) : this(id, mutableMapOf())

            /**
             * The id of the Credit note
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                 * Returns a mutable builder for constructing an instance of [CreditNote].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreditNote]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditNote: CreditNote) = apply {
                    id = creditNote.id
                    additionalProperties = creditNote.additionalProperties.toMutableMap()
                }

                /** The id of the Credit note */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

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
                 * Returns an immutable instance of [CreditNote].
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
                fun build(): CreditNote =
                    CreditNote(checkRequired("id", id), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): CreditNote = apply {
                if (validated) {
                    return@apply
                }

                id()
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
            @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreditNote && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditNote{id=$id, additionalProperties=$additionalProperties}"
        }

        class Invoice
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
            ) : this(id, mutableMapOf())

            /**
             * The Invoice id
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                 * Returns a mutable builder for constructing an instance of [Invoice].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Invoice]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(invoice: Invoice) = apply {
                    id = invoice.id
                    additionalProperties = invoice.additionalProperties.toMutableMap()
                }

                /** The Invoice id */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

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
                 * Returns an immutable instance of [Invoice].
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
                fun build(): Invoice =
                    Invoice(checkRequired("id", id), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Invoice = apply {
                if (validated) {
                    return@apply
                }

                id()
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
            @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Invoice && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Invoice{id=$id, additionalProperties=$additionalProperties}"
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

                @JvmField val INCREMENT = of("increment")

                @JvmField val DECREMENT = of("decrement")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                INCREMENT,
                DECREMENT,
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
                INCREMENT,
                DECREMENT,
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
                    INCREMENT -> Value.INCREMENT
                    DECREMENT -> Value.DECREMENT
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
                    INCREMENT -> Known.INCREMENT
                    DECREMENT -> Known.DECREMENT
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

            return /* spotless:off */ other is CustomerBalanceTransaction && id == other.id && action == other.action && amount == other.amount && createdAt == other.createdAt && creditNote == other.creditNote && description == other.description && endingBalance == other.endingBalance && invoice == other.invoice && startingBalance == other.startingBalance && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, action, amount, createdAt, creditNote, description, endingBalance, invoice, startingBalance, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerBalanceTransaction{id=$id, action=$action, amount=$amount, createdAt=$createdAt, creditNote=$creditNote, description=$description, endingBalance=$endingBalance, invoice=$invoice, startingBalance=$startingBalance, type=$type, additionalProperties=$additionalProperties}"
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
    class CustomerTaxId
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
             * Returns a mutable builder for constructing an instance of [CustomerTaxId].
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

        /** A builder for [CustomerTaxId]. */
        class Builder internal constructor() {

            private var country: JsonField<Country>? = null
            private var type: JsonField<Type>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerTaxId: CustomerTaxId) = apply {
                country = customerTaxId.country
                type = customerTaxId.type
                value = customerTaxId.value
                additionalProperties = customerTaxId.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CustomerTaxId].
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
            fun build(): CustomerTaxId =
                CustomerTaxId(
                    checkRequired("country", country),
                    checkRequired("type", type),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CustomerTaxId = apply {
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

            return /* spotless:off */ other is CustomerTaxId && country == other.country && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, type, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerTaxId{country=$country, type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    class InvoiceSource @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SUBSCRIPTION = of("subscription")

            @JvmField val PARTIAL = of("partial")

            @JvmField val ONE_OFF = of("one_off")

            @JvmStatic fun of(value: String) = InvoiceSource(JsonField.of(value))
        }

        /** An enum containing [InvoiceSource]'s known values. */
        enum class Known {
            SUBSCRIPTION,
            PARTIAL,
            ONE_OFF,
        }

        /**
         * An enum containing [InvoiceSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InvoiceSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUBSCRIPTION,
            PARTIAL,
            ONE_OFF,
            /**
             * An enum member indicating that [InvoiceSource] was instantiated with an unknown
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
                SUBSCRIPTION -> Value.SUBSCRIPTION
                PARTIAL -> Value.PARTIAL
                ONE_OFF -> Value.ONE_OFF
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
                SUBSCRIPTION -> Known.SUBSCRIPTION
                PARTIAL -> Known.PARTIAL
                ONE_OFF -> Known.ONE_OFF
                else -> throw OrbInvalidDataException("Unknown InvoiceSource: $value")
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

        fun validate(): InvoiceSource = apply {
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

            return /* spotless:off */ other is InvoiceSource && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class LineItem
    private constructor(
        private val id: JsonField<String>,
        private val adjustedSubtotal: JsonField<String>,
        private val adjustments: JsonField<List<Adjustment>>,
        private val amount: JsonField<String>,
        private val creditsApplied: JsonField<String>,
        private val discount: JsonField<Discount>,
        private val endDate: JsonField<OffsetDateTime>,
        private val filter: JsonField<String>,
        private val grouping: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val name: JsonField<String>,
        private val partiallyInvoicedAmount: JsonField<String>,
        private val price: JsonField<Price>,
        private val quantity: JsonField<Double>,
        private val startDate: JsonField<OffsetDateTime>,
        private val subLineItems: JsonField<List<SubLineItem>>,
        private val subtotal: JsonField<String>,
        private val taxAmounts: JsonField<List<TaxAmount>>,
        private val usageCustomerIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("adjusted_subtotal")
            @ExcludeMissing
            adjustedSubtotal: JsonField<String> = JsonMissing.of(),
            @JsonProperty("adjustments")
            @ExcludeMissing
            adjustments: JsonField<List<Adjustment>> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credits_applied")
            @ExcludeMissing
            creditsApplied: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount")
            @ExcludeMissing
            discount: JsonField<Discount> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grouping")
            @ExcludeMissing
            grouping: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maximum") @ExcludeMissing maximum: JsonField<Maximum> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            maximumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimum") @ExcludeMissing minimum: JsonField<Minimum> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            minimumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("partially_invoiced_amount")
            @ExcludeMissing
            partiallyInvoicedAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("sub_line_items")
            @ExcludeMissing
            subLineItems: JsonField<List<SubLineItem>> = JsonMissing.of(),
            @JsonProperty("subtotal")
            @ExcludeMissing
            subtotal: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_amounts")
            @ExcludeMissing
            taxAmounts: JsonField<List<TaxAmount>> = JsonMissing.of(),
            @JsonProperty("usage_customer_ids")
            @ExcludeMissing
            usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            id,
            adjustedSubtotal,
            adjustments,
            amount,
            creditsApplied,
            discount,
            endDate,
            filter,
            grouping,
            maximum,
            maximumAmount,
            minimum,
            minimumAmount,
            name,
            partiallyInvoicedAmount,
            price,
            quantity,
            startDate,
            subLineItems,
            subtotal,
            taxAmounts,
            usageCustomerIds,
            mutableMapOf(),
        )

        /**
         * A unique ID for this line item.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The line amount after any adjustments and before overage conversion, credits and partial
         * invoicing.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustedSubtotal(): String = adjustedSubtotal.getRequired("adjusted_subtotal")

        /**
         * All adjustments applied to the line item in the order they were applied based on invoice
         * calculations (ie. usage discounts -> amount discounts -> percentage discounts -> minimums
         * -> maximums).
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustments(): List<Adjustment> = adjustments.getRequired("adjustments")

        /**
         * The final amount for a line item after all adjustments and pre paid credits have been
         * applied.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String = amount.getRequired("amount")

        /**
         * The number of prepaid credits applied.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditsApplied(): String = creditsApplied.getRequired("credits_applied")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun discount(): Optional<Discount> = discount.getOptional("discount")

        /**
         * The end date of the range of time applied for this line item's price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endDate(): OffsetDateTime = endDate.getRequired("end_date")

        /**
         * An additional filter that was used to calculate the usage for this line item.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun grouping(): Optional<String> = grouping.getOptional("grouping")

        /**
         * This field is deprecated in favor of `adjustments`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun maximum(): Optional<Maximum> = maximum.getOptional("maximum")

        /**
         * This field is deprecated in favor of `adjustments`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun maximumAmount(): Optional<String> = maximumAmount.getOptional("maximum_amount")

        /**
         * This field is deprecated in favor of `adjustments`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun minimum(): Optional<Minimum> = minimum.getOptional("minimum")

        /**
         * This field is deprecated in favor of `adjustments`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun minimumAmount(): Optional<String> = minimumAmount.getOptional("minimum_amount")

        /**
         * The name of the price associated with this line item.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Any amount applied from a partial invoice
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun partiallyInvoicedAmount(): String =
            partiallyInvoicedAmount.getRequired("partially_invoiced_amount")

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun price(): Price = price.getRequired("price")

        /**
         * Either the fixed fee quantity or the usage during the service period.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Double = quantity.getRequired("quantity")

        /**
         * The start date of the range of time applied for this line item's price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subLineItems(): List<SubLineItem> = subLineItems.getRequired("sub_line_items")

        /**
         * The line amount before before any adjustments.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subtotal(): String = subtotal.getRequired("subtotal")

        /**
         * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
         * configured.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taxAmounts(): List<TaxAmount> = taxAmounts.getRequired("tax_amounts")

        /**
         * A list of customer ids that were used to calculate the usage for this line item.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageCustomerIds(): Optional<List<String>> =
            usageCustomerIds.getOptional("usage_customer_ids")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [adjustedSubtotal].
         *
         * Unlike [adjustedSubtotal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("adjusted_subtotal")
        @ExcludeMissing
        fun _adjustedSubtotal(): JsonField<String> = adjustedSubtotal

        /**
         * Returns the raw JSON value of [adjustments].
         *
         * Unlike [adjustments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("adjustments")
        @ExcludeMissing
        fun _adjustments(): JsonField<List<Adjustment>> = adjustments

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [creditsApplied].
         *
         * Unlike [creditsApplied], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credits_applied")
        @ExcludeMissing
        fun _creditsApplied(): JsonField<String> = creditsApplied

        /**
         * Returns the raw JSON value of [discount].
         *
         * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [grouping].
         *
         * Unlike [grouping], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("grouping") @ExcludeMissing fun _grouping(): JsonField<String> = grouping

        /**
         * Returns the raw JSON value of [maximum].
         *
         * Unlike [maximum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("maximum")
        @ExcludeMissing
        fun _maximum(): JsonField<Maximum> = maximum

        /**
         * Returns the raw JSON value of [maximumAmount].
         *
         * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /**
         * Returns the raw JSON value of [minimum].
         *
         * Unlike [minimum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("minimum")
        @ExcludeMissing
        fun _minimum(): JsonField<Minimum> = minimum

        /**
         * Returns the raw JSON value of [minimumAmount].
         *
         * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [partiallyInvoicedAmount].
         *
         * Unlike [partiallyInvoicedAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("partially_invoiced_amount")
        @ExcludeMissing
        fun _partiallyInvoicedAmount(): JsonField<String> = partiallyInvoicedAmount

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * Returns the raw JSON value of [subLineItems].
         *
         * Unlike [subLineItems], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sub_line_items")
        @ExcludeMissing
        fun _subLineItems(): JsonField<List<SubLineItem>> = subLineItems

        /**
         * Returns the raw JSON value of [subtotal].
         *
         * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

        /**
         * Returns the raw JSON value of [taxAmounts].
         *
         * Unlike [taxAmounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_amounts")
        @ExcludeMissing
        fun _taxAmounts(): JsonField<List<TaxAmount>> = taxAmounts

        /**
         * Returns the raw JSON value of [usageCustomerIds].
         *
         * Unlike [usageCustomerIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        fun _usageCustomerIds(): JsonField<List<String>> = usageCustomerIds

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
             * Returns a mutable builder for constructing an instance of [LineItem].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .adjustedSubtotal()
             * .adjustments()
             * .amount()
             * .creditsApplied()
             * .discount()
             * .endDate()
             * .filter()
             * .grouping()
             * .maximum()
             * .maximumAmount()
             * .minimum()
             * .minimumAmount()
             * .name()
             * .partiallyInvoicedAmount()
             * .price()
             * .quantity()
             * .startDate()
             * .subLineItems()
             * .subtotal()
             * .taxAmounts()
             * .usageCustomerIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LineItem]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var adjustedSubtotal: JsonField<String>? = null
            private var adjustments: JsonField<MutableList<Adjustment>>? = null
            private var amount: JsonField<String>? = null
            private var creditsApplied: JsonField<String>? = null
            private var discount: JsonField<Discount>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var filter: JsonField<String>? = null
            private var grouping: JsonField<String>? = null
            private var maximum: JsonField<Maximum>? = null
            private var maximumAmount: JsonField<String>? = null
            private var minimum: JsonField<Minimum>? = null
            private var minimumAmount: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var partiallyInvoicedAmount: JsonField<String>? = null
            private var price: JsonField<Price>? = null
            private var quantity: JsonField<Double>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var subLineItems: JsonField<MutableList<SubLineItem>>? = null
            private var subtotal: JsonField<String>? = null
            private var taxAmounts: JsonField<MutableList<TaxAmount>>? = null
            private var usageCustomerIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                id = lineItem.id
                adjustedSubtotal = lineItem.adjustedSubtotal
                adjustments = lineItem.adjustments.map { it.toMutableList() }
                amount = lineItem.amount
                creditsApplied = lineItem.creditsApplied
                discount = lineItem.discount
                endDate = lineItem.endDate
                filter = lineItem.filter
                grouping = lineItem.grouping
                maximum = lineItem.maximum
                maximumAmount = lineItem.maximumAmount
                minimum = lineItem.minimum
                minimumAmount = lineItem.minimumAmount
                name = lineItem.name
                partiallyInvoicedAmount = lineItem.partiallyInvoicedAmount
                price = lineItem.price
                quantity = lineItem.quantity
                startDate = lineItem.startDate
                subLineItems = lineItem.subLineItems.map { it.toMutableList() }
                subtotal = lineItem.subtotal
                taxAmounts = lineItem.taxAmounts.map { it.toMutableList() }
                usageCustomerIds = lineItem.usageCustomerIds.map { it.toMutableList() }
                additionalProperties = lineItem.additionalProperties.toMutableMap()
            }

            /** A unique ID for this line item. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The line amount after any adjustments and before overage conversion, credits and
             * partial invoicing.
             */
            fun adjustedSubtotal(adjustedSubtotal: String) =
                adjustedSubtotal(JsonField.of(adjustedSubtotal))

            /**
             * Sets [Builder.adjustedSubtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustedSubtotal] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adjustedSubtotal(adjustedSubtotal: JsonField<String>) = apply {
                this.adjustedSubtotal = adjustedSubtotal
            }

            /**
             * All adjustments applied to the line item in the order they were applied based on
             * invoice calculations (ie. usage discounts -> amount discounts -> percentage discounts
             * -> minimums -> maximums).
             */
            fun adjustments(adjustments: List<Adjustment>) = adjustments(JsonField.of(adjustments))

            /**
             * Sets [Builder.adjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustments] with a well-typed `List<Adjustment>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun adjustments(adjustments: JsonField<List<Adjustment>>) = apply {
                this.adjustments = adjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [Adjustment] to [adjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdjustment(adjustment: Adjustment) = apply {
                adjustments =
                    (adjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("adjustments", it).add(adjustment)
                    }
            }

            /**
             * Alias for calling [addAdjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`.
             */
            fun addAdjustment(usageDiscount: Adjustment.UsageDiscount) =
                addAdjustment(Adjustment.ofUsageDiscount(usageDiscount))

            /**
             * Alias for calling [addAdjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`.
             */
            fun addAdjustment(amountDiscount: Adjustment.AmountDiscount) =
                addAdjustment(Adjustment.ofAmountDiscount(amountDiscount))

            /**
             * Alias for calling [addAdjustment] with
             * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
             */
            fun addAdjustment(percentageDiscount: Adjustment.PercentageDiscount) =
                addAdjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

            /** Alias for calling [addAdjustment] with `Adjustment.ofMinimum(minimum)`. */
            fun addAdjustment(minimum: Adjustment.Minimum) =
                addAdjustment(Adjustment.ofMinimum(minimum))

            /** Alias for calling [addAdjustment] with `Adjustment.ofMaximum(maximum)`. */
            fun addAdjustment(maximum: Adjustment.Maximum) =
                addAdjustment(Adjustment.ofMaximum(maximum))

            /**
             * The final amount for a line item after all adjustments and pre paid credits have been
             * applied.
             */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The number of prepaid credits applied. */
            fun creditsApplied(creditsApplied: String) =
                creditsApplied(JsonField.of(creditsApplied))

            /**
             * Sets [Builder.creditsApplied] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditsApplied] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditsApplied(creditsApplied: JsonField<String>) = apply {
                this.creditsApplied = creditsApplied
            }

            fun discount(discount: Discount?) = discount(JsonField.ofNullable(discount))

            /** Alias for calling [Builder.discount] with `discount.orElse(null)`. */
            fun discount(discount: Optional<Discount>) = discount(discount.getOrNull())

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Discount] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            /** Alias for calling [discount] with `Discount.ofPercentage(percentage)`. */
            fun discount(percentage: PercentageDiscount) =
                discount(Discount.ofPercentage(percentage))

            /**
             * Alias for calling [discount] with the following:
             * ```java
             * PercentageDiscount.builder()
             *     .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
             *     .percentageDiscount(percentageDiscount)
             *     .build()
             * ```
             */
            fun percentageDiscount(percentageDiscount: Double) =
                discount(
                    PercentageDiscount.builder()
                        .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(percentageDiscount)
                        .build()
                )

            /** Alias for calling [discount] with `Discount.ofTrial(trial)`. */
            fun discount(trial: TrialDiscount) = discount(Discount.ofTrial(trial))

            /** Alias for calling [discount] with `Discount.ofUsage(usage)`. */
            fun discount(usage: UsageDiscount) = discount(Discount.ofUsage(usage))

            /**
             * Alias for calling [discount] with the following:
             * ```java
             * UsageDiscount.builder()
             *     .discountType(UsageDiscount.DiscountType.USAGE)
             *     .usageDiscount(usageDiscount)
             *     .build()
             * ```
             */
            fun usageDiscount(usageDiscount: Double) =
                discount(
                    UsageDiscount.builder()
                        .discountType(UsageDiscount.DiscountType.USAGE)
                        .usageDiscount(usageDiscount)
                        .build()
                )

            /** Alias for calling [discount] with `Discount.ofAmount(amount)`. */
            fun discount(amount: AmountDiscount) = discount(Discount.ofAmount(amount))

            /**
             * Alias for calling [discount] with the following:
             * ```java
             * AmountDiscount.builder()
             *     .discountType(AmountDiscount.DiscountType.AMOUNT)
             *     .amountDiscount(amountDiscount)
             *     .build()
             * ```
             */
            fun amountDiscount(amountDiscount: String) =
                discount(
                    AmountDiscount.builder()
                        .discountType(AmountDiscount.DiscountType.AMOUNT)
                        .amountDiscount(amountDiscount)
                        .build()
                )

            /** The end date of the range of time applied for this line item's price. */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** An additional filter that was used to calculate the usage for this line item. */
            fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

            /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
            fun filter(filter: Optional<String>) = filter(filter.getOrNull())

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /**
             * [DEPRECATED] For configured prices that are split by a grouping key, this will be
             * populated with the key and a value. The `amount` and `subtotal` will be the values
             * for this particular grouping.
             */
            fun grouping(grouping: String?) = grouping(JsonField.ofNullable(grouping))

            /** Alias for calling [Builder.grouping] with `grouping.orElse(null)`. */
            fun grouping(grouping: Optional<String>) = grouping(grouping.getOrNull())

            /**
             * Sets [Builder.grouping] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grouping] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grouping(grouping: JsonField<String>) = apply { this.grouping = grouping }

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun maximum(maximum: Maximum?) = maximum(JsonField.ofNullable(maximum))

            /** Alias for calling [Builder.maximum] with `maximum.orElse(null)`. */
            @Deprecated("deprecated")
            fun maximum(maximum: Optional<Maximum>) = maximum(maximum.getOrNull())

            /**
             * Sets [Builder.maximum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximum] with a well-typed [Maximum] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: String?) =
                maximumAmount(JsonField.ofNullable(maximumAmount))

            /** Alias for calling [Builder.maximumAmount] with `maximumAmount.orElse(null)`. */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: Optional<String>) =
                maximumAmount(maximumAmount.getOrNull())

            /**
             * Sets [Builder.maximumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

            /** Alias for calling [Builder.minimum] with `minimum.orElse(null)`. */
            @Deprecated("deprecated")
            fun minimum(minimum: Optional<Minimum>) = minimum(minimum.getOrNull())

            /**
             * Sets [Builder.minimum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimum] with a well-typed [Minimum] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: String?) =
                minimumAmount(JsonField.ofNullable(minimumAmount))

            /** Alias for calling [Builder.minimumAmount] with `minimumAmount.orElse(null)`. */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: Optional<String>) =
                minimumAmount(minimumAmount.getOrNull())

            /**
             * Sets [Builder.minimumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** The name of the price associated with this line item. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Any amount applied from a partial invoice */
            fun partiallyInvoicedAmount(partiallyInvoicedAmount: String) =
                partiallyInvoicedAmount(JsonField.of(partiallyInvoicedAmount))

            /**
             * Sets [Builder.partiallyInvoicedAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partiallyInvoicedAmount] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun partiallyInvoicedAmount(partiallyInvoicedAmount: JsonField<String>) = apply {
                this.partiallyInvoicedAmount = partiallyInvoicedAmount
            }

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(price: Price) = price(JsonField.of(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** Alias for calling [price] with `Price.ofUnit(unit)`. */
            fun price(unit: Price.Unit) = price(Price.ofUnit(unit))

            /** Alias for calling [price] with `Price.ofPackage(package_)`. */
            fun price(package_: Price.Package) = price(Price.ofPackage(package_))

            /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
            fun price(matrix: Price.Matrix) = price(Price.ofMatrix(matrix))

            /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
            fun price(tiered: Price.Tiered) = price(Price.ofTiered(tiered))

            /** Alias for calling [price] with `Price.ofTieredBps(tieredBps)`. */
            fun price(tieredBps: Price.TieredBps) = price(Price.ofTieredBps(tieredBps))

            /** Alias for calling [price] with `Price.ofBps(bps)`. */
            fun price(bps: Price.Bps) = price(Price.ofBps(bps))

            /** Alias for calling [price] with `Price.ofBulkBps(bulkBps)`. */
            fun price(bulkBps: Price.BulkBps) = price(Price.ofBulkBps(bulkBps))

            /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
            fun price(bulk: Price.Bulk) = price(Price.ofBulk(bulk))

            /**
             * Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
             */
            fun price(thresholdTotalAmount: Price.ThresholdTotalAmount) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
            fun price(tieredPackage: Price.TieredPackage) =
                price(Price.ofTieredPackage(tieredPackage))

            /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
            fun price(groupedTiered: Price.GroupedTiered) =
                price(Price.ofGroupedTiered(groupedTiered))

            /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
            fun price(tieredWithMinimum: Price.TieredWithMinimum) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
             */
            fun price(tieredPackageWithMinimum: Price.TieredPackageWithMinimum) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofPackageWithAllocation(packageWithAllocation)`.
             */
            fun price(packageWithAllocation: Price.PackageWithAllocation) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
            fun price(unitWithPercent: Price.UnitWithPercent) =
                price(Price.ofUnitWithPercent(unitWithPercent))

            /**
             * Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
             */
            fun price(matrixWithAllocation: Price.MatrixWithAllocation) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /**
             * Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`.
             */
            fun price(tieredWithProration: Price.TieredWithProration) =
                price(Price.ofTieredWithProration(tieredWithProration))

            /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
            fun price(unitWithProration: Price.UnitWithProration) =
                price(Price.ofUnitWithProration(unitWithProration))

            /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
            fun price(groupedAllocation: Price.GroupedAllocation) =
                price(Price.ofGroupedAllocation(groupedAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
             */
            fun price(groupedWithProratedMinimum: Price.GroupedWithProratedMinimum) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
             */
            fun price(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimum) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
             */
            fun price(matrixWithDisplayName: Price.MatrixWithDisplayName) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
            fun price(bulkWithProration: Price.BulkWithProration) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
             */
            fun price(groupedTieredPackage: Price.GroupedTieredPackage) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
             */
            fun price(maxGroupTieredPackage: Price.MaxGroupTieredPackage) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
             */
            fun price(scalableMatrixWithUnitPricing: Price.ScalableMatrixWithUnitPricing) =
                price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
             */
            fun price(scalableMatrixWithTieredPricing: Price.ScalableMatrixWithTieredPricing) =
                price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
             */
            fun price(cumulativeGroupedBulk: Price.CumulativeGroupedBulk) =
                price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

            /** Either the fixed fee quantity or the usage during the service period. */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** The start date of the range of time applied for this line item's price. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /**
             * For complex pricing structures, the line item can be broken down further in
             * `sub_line_items`.
             */
            fun subLineItems(subLineItems: List<SubLineItem>) =
                subLineItems(JsonField.of(subLineItems))

            /**
             * Sets [Builder.subLineItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subLineItems] with a well-typed `List<SubLineItem>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subLineItems(subLineItems: JsonField<List<SubLineItem>>) = apply {
                this.subLineItems = subLineItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [SubLineItem] to [subLineItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSubLineItem(subLineItem: SubLineItem) = apply {
                subLineItems =
                    (subLineItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("subLineItems", it).add(subLineItem)
                    }
            }

            /** Alias for calling [addSubLineItem] with `SubLineItem.ofMatrix(matrix)`. */
            fun addSubLineItem(matrix: SubLineItem.Matrix) =
                addSubLineItem(SubLineItem.ofMatrix(matrix))

            /** Alias for calling [addSubLineItem] with `SubLineItem.ofTier(tier)`. */
            fun addSubLineItem(tier: SubLineItem.Tier) = addSubLineItem(SubLineItem.ofTier(tier))

            /** Alias for calling [addSubLineItem] with `SubLineItem.ofNull(null_)`. */
            fun addSubLineItem(null_: SubLineItem.Null) = addSubLineItem(SubLineItem.ofNull(null_))

            /** The line amount before before any adjustments. */
            fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

            /**
             * Sets [Builder.subtotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtotal] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

            /**
             * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
             * configured.
             */
            fun taxAmounts(taxAmounts: List<TaxAmount>) = taxAmounts(JsonField.of(taxAmounts))

            /**
             * Sets [Builder.taxAmounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxAmounts] with a well-typed `List<TaxAmount>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun taxAmounts(taxAmounts: JsonField<List<TaxAmount>>) = apply {
                this.taxAmounts = taxAmounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [TaxAmount] to [taxAmounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTaxAmount(taxAmount: TaxAmount) = apply {
                taxAmounts =
                    (taxAmounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("taxAmounts", it).add(taxAmount)
                    }
            }

            /** A list of customer ids that were used to calculate the usage for this line item. */
            fun usageCustomerIds(usageCustomerIds: List<String>?) =
                usageCustomerIds(JsonField.ofNullable(usageCustomerIds))

            /**
             * Alias for calling [Builder.usageCustomerIds] with `usageCustomerIds.orElse(null)`.
             */
            fun usageCustomerIds(usageCustomerIds: Optional<List<String>>) =
                usageCustomerIds(usageCustomerIds.getOrNull())

            /**
             * Sets [Builder.usageCustomerIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageCustomerIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
                this.usageCustomerIds = usageCustomerIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [usageCustomerIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUsageCustomerId(usageCustomerId: String) = apply {
                usageCustomerIds =
                    (usageCustomerIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("usageCustomerIds", it).add(usageCustomerId)
                    }
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
             * Returns an immutable instance of [LineItem].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .adjustedSubtotal()
             * .adjustments()
             * .amount()
             * .creditsApplied()
             * .discount()
             * .endDate()
             * .filter()
             * .grouping()
             * .maximum()
             * .maximumAmount()
             * .minimum()
             * .minimumAmount()
             * .name()
             * .partiallyInvoicedAmount()
             * .price()
             * .quantity()
             * .startDate()
             * .subLineItems()
             * .subtotal()
             * .taxAmounts()
             * .usageCustomerIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LineItem =
                LineItem(
                    checkRequired("id", id),
                    checkRequired("adjustedSubtotal", adjustedSubtotal),
                    checkRequired("adjustments", adjustments).map { it.toImmutable() },
                    checkRequired("amount", amount),
                    checkRequired("creditsApplied", creditsApplied),
                    checkRequired("discount", discount),
                    checkRequired("endDate", endDate),
                    checkRequired("filter", filter),
                    checkRequired("grouping", grouping),
                    checkRequired("maximum", maximum),
                    checkRequired("maximumAmount", maximumAmount),
                    checkRequired("minimum", minimum),
                    checkRequired("minimumAmount", minimumAmount),
                    checkRequired("name", name),
                    checkRequired("partiallyInvoicedAmount", partiallyInvoicedAmount),
                    checkRequired("price", price),
                    checkRequired("quantity", quantity),
                    checkRequired("startDate", startDate),
                    checkRequired("subLineItems", subLineItems).map { it.toImmutable() },
                    checkRequired("subtotal", subtotal),
                    checkRequired("taxAmounts", taxAmounts).map { it.toImmutable() },
                    checkRequired("usageCustomerIds", usageCustomerIds).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LineItem = apply {
            if (validated) {
                return@apply
            }

            id()
            adjustedSubtotal()
            adjustments().forEach { it.validate() }
            amount()
            creditsApplied()
            discount().ifPresent { it.validate() }
            endDate()
            filter()
            grouping()
            maximum().ifPresent { it.validate() }
            maximumAmount()
            minimum().ifPresent { it.validate() }
            minimumAmount()
            name()
            partiallyInvoicedAmount()
            price().validate()
            quantity()
            startDate()
            subLineItems().forEach { it.validate() }
            subtotal()
            taxAmounts().forEach { it.validate() }
            usageCustomerIds()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (adjustedSubtotal.asKnown().isPresent) 1 else 0) +
                (adjustments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (creditsApplied.asKnown().isPresent) 1 else 0) +
                (discount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
                (if (grouping.asKnown().isPresent) 1 else 0) +
                (maximum.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maximumAmount.asKnown().isPresent) 1 else 0) +
                (minimum.asKnown().getOrNull()?.validity() ?: 0) +
                (if (minimumAmount.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (partiallyInvoicedAmount.asKnown().isPresent) 1 else 0) +
                (price.asKnown().getOrNull()?.validity() ?: 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (subLineItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (subtotal.asKnown().isPresent) 1 else 0) +
                (taxAmounts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (usageCustomerIds.asKnown().getOrNull()?.size ?: 0)

        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val usageDiscount: UsageDiscount? = null,
            private val amountDiscount: AmountDiscount? = null,
            private val percentageDiscount: PercentageDiscount? = null,
            private val minimum: Minimum? = null,
            private val maximum: Maximum? = null,
            private val _json: JsonValue? = null,
        ) {

            fun usageDiscount(): Optional<UsageDiscount> = Optional.ofNullable(usageDiscount)

            fun amountDiscount(): Optional<AmountDiscount> = Optional.ofNullable(amountDiscount)

            fun percentageDiscount(): Optional<PercentageDiscount> =
                Optional.ofNullable(percentageDiscount)

            fun minimum(): Optional<Minimum> = Optional.ofNullable(minimum)

            fun maximum(): Optional<Maximum> = Optional.ofNullable(maximum)

            fun isUsageDiscount(): Boolean = usageDiscount != null

            fun isAmountDiscount(): Boolean = amountDiscount != null

            fun isPercentageDiscount(): Boolean = percentageDiscount != null

            fun isMinimum(): Boolean = minimum != null

            fun isMaximum(): Boolean = maximum != null

            fun asUsageDiscount(): UsageDiscount = usageDiscount.getOrThrow("usageDiscount")

            fun asAmountDiscount(): AmountDiscount = amountDiscount.getOrThrow("amountDiscount")

            fun asPercentageDiscount(): PercentageDiscount =
                percentageDiscount.getOrThrow("percentageDiscount")

            fun asMinimum(): Minimum = minimum.getOrThrow("minimum")

            fun asMaximum(): Maximum = maximum.getOrThrow("maximum")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                    amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
                    percentageDiscount != null ->
                        visitor.visitPercentageDiscount(percentageDiscount)
                    minimum != null -> visitor.visitMinimum(minimum)
                    maximum != null -> visitor.visitMaximum(maximum)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Adjustment = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUsageDiscount(usageDiscount: UsageDiscount) {
                            usageDiscount.validate()
                        }

                        override fun visitAmountDiscount(amountDiscount: AmountDiscount) {
                            amountDiscount.validate()
                        }

                        override fun visitPercentageDiscount(
                            percentageDiscount: PercentageDiscount
                        ) {
                            percentageDiscount.validate()
                        }

                        override fun visitMinimum(minimum: Minimum) {
                            minimum.validate()
                        }

                        override fun visitMaximum(maximum: Maximum) {
                            maximum.validate()
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
                        override fun visitUsageDiscount(usageDiscount: UsageDiscount) =
                            usageDiscount.validity()

                        override fun visitAmountDiscount(amountDiscount: AmountDiscount) =
                            amountDiscount.validity()

                        override fun visitPercentageDiscount(
                            percentageDiscount: PercentageDiscount
                        ) = percentageDiscount.validity()

                        override fun visitMinimum(minimum: Minimum) = minimum.validity()

                        override fun visitMaximum(maximum: Maximum) = maximum.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Adjustment && usageDiscount == other.usageDiscount && amountDiscount == other.amountDiscount && percentageDiscount == other.percentageDiscount && minimum == other.minimum && maximum == other.maximum /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(usageDiscount, amountDiscount, percentageDiscount, minimum, maximum) /* spotless:on */

            override fun toString(): String =
                when {
                    usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                    amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                    percentageDiscount != null ->
                        "Adjustment{percentageDiscount=$percentageDiscount}"
                    minimum != null -> "Adjustment{minimum=$minimum}"
                    maximum != null -> "Adjustment{maximum=$maximum}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                @JvmStatic
                fun ofUsageDiscount(usageDiscount: UsageDiscount) =
                    Adjustment(usageDiscount = usageDiscount)

                @JvmStatic
                fun ofAmountDiscount(amountDiscount: AmountDiscount) =
                    Adjustment(amountDiscount = amountDiscount)

                @JvmStatic
                fun ofPercentageDiscount(percentageDiscount: PercentageDiscount) =
                    Adjustment(percentageDiscount = percentageDiscount)

                @JvmStatic fun ofMinimum(minimum: Minimum) = Adjustment(minimum = minimum)

                @JvmStatic fun ofMaximum(maximum: Maximum) = Adjustment(maximum = maximum)
            }

            /**
             * An interface that defines how to map each variant of [Adjustment] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitUsageDiscount(usageDiscount: UsageDiscount): T

                fun visitAmountDiscount(amountDiscount: AmountDiscount): T

                fun visitPercentageDiscount(percentageDiscount: PercentageDiscount): T

                fun visitMinimum(minimum: Minimum): T

                fun visitMaximum(maximum: Maximum): T

                /**
                 * Maps an unknown variant of [Adjustment] to a value of type [T].
                 *
                 * An instance of [Adjustment] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Adjustment: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Adjustment>(Adjustment::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Adjustment {
                    val json = JsonValue.fromJsonNode(node)
                    val adjustmentType =
                        json.asObject().getOrNull()?.get("adjustment_type")?.asString()?.getOrNull()

                    when (adjustmentType) {
                        "usage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<UsageDiscount>())?.let {
                                Adjustment(usageDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "amount_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<AmountDiscount>())?.let {
                                Adjustment(amountDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "percentage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<PercentageDiscount>())?.let {
                                Adjustment(percentageDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "minimum" -> {
                            return tryDeserialize(node, jacksonTypeRef<Minimum>())?.let {
                                Adjustment(minimum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "maximum" -> {
                            return tryDeserialize(node, jacksonTypeRef<Maximum>())?.let {
                                Adjustment(maximum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                    }

                    return Adjustment(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Adjustment>(Adjustment::class) {

                override fun serialize(
                    value: Adjustment,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                        value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                        value.percentageDiscount != null ->
                            generator.writeObject(value.percentageDiscount)
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value.maximum != null -> generator.writeObject(value.maximum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }

            class UsageDiscount
            private constructor(
                private val id: JsonField<String>,
                private val adjustmentType: JsonValue,
                private val amount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val filters: JsonField<List<Filter>>,
                private val isInvoiceLevel: JsonField<Boolean>,
                private val reason: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    adjustmentType: JsonValue = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("filters")
                    @ExcludeMissing
                    filters: JsonField<List<Filter>> = JsonMissing.of(),
                    @JsonProperty("is_invoice_level")
                    @ExcludeMissing
                    isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    usageDiscount: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    id,
                    adjustmentType,
                    amount,
                    appliesToPriceIds,
                    filters,
                    isInvoiceLevel,
                    reason,
                    usageDiscount,
                    mutableMapOf(),
                )

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("usage_discount")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonValue = adjustmentType

                /**
                 * The value applied by an adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): String = amount.getRequired("amount")

                /**
                 * The price IDs that this adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * The filters that determine which prices to apply this adjustment to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun filters(): List<Filter> = filters.getRequired("filters")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The reason for the adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun reason(): Optional<String> = reason.getOptional("reason")

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                /**
                 * Returns the raw JSON value of [appliesToPriceIds].
                 *
                 * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @Deprecated("deprecated")
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * Returns the raw JSON value of [filters].
                 *
                 * Unlike [filters], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("filters")
                @ExcludeMissing
                fun _filters(): JsonField<List<Filter>> = filters

                /**
                 * Returns the raw JSON value of [isInvoiceLevel].
                 *
                 * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * Returns the raw JSON value of [reason].
                 *
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                /**
                 * Returns the raw JSON value of [usageDiscount].
                 *
                 * Unlike [usageDiscount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("usage_discount")
                @ExcludeMissing
                fun _usageDiscount(): JsonField<Double> = usageDiscount

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
                     * Returns a mutable builder for constructing an instance of [UsageDiscount].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .amount()
                     * .appliesToPriceIds()
                     * .filters()
                     * .isInvoiceLevel()
                     * .reason()
                     * .usageDiscount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [UsageDiscount]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonValue = JsonValue.from("usage_discount")
                    private var amount: JsonField<String>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var filters: JsonField<MutableList<Filter>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var reason: JsonField<String>? = null
                    private var usageDiscount: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(usageDiscount: UsageDiscount) = apply {
                        id = usageDiscount.id
                        adjustmentType = usageDiscount.adjustmentType
                        amount = usageDiscount.amount
                        appliesToPriceIds =
                            usageDiscount.appliesToPriceIds.map { it.toMutableList() }
                        filters = usageDiscount.filters.map { it.toMutableList() }
                        isInvoiceLevel = usageDiscount.isInvoiceLevel
                        reason = usageDiscount.reason
                        this.usageDiscount = usageDiscount.usageDiscount
                        additionalProperties = usageDiscount.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("usage_discount")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun adjustmentType(adjustmentType: JsonValue) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The value applied by an adjustment. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    /** The price IDs that this adjustment applies to. */
                    @Deprecated("deprecated")
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.appliesToPriceIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    @Deprecated("deprecated")
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [appliesToPriceIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    @Deprecated("deprecated")
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                            }
                    }

                    /** The filters that determine which prices to apply this adjustment to. */
                    fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                    /**
                     * Sets [Builder.filters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.filters] with a well-typed `List<Filter>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun filters(filters: JsonField<List<Filter>>) = apply {
                        this.filters = filters.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Filter] to [filters].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addFilter(filter: Filter) = apply {
                        filters =
                            (filters ?: JsonField.of(mutableListOf())).also {
                                checkKnown("filters", it).add(filter)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
                    fun reason(reason: Optional<String>) = reason(reason.getOrNull())

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    /**
                     * The number of usage units by which to discount the price this adjustment
                     * applies to in a given billing period.
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Sets [Builder.usageDiscount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.usageDiscount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
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
                     * Returns an immutable instance of [UsageDiscount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .amount()
                     * .appliesToPriceIds()
                     * .filters()
                     * .isInvoiceLevel()
                     * .reason()
                     * .usageDiscount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): UsageDiscount =
                        UsageDiscount(
                            checkRequired("id", id),
                            adjustmentType,
                            checkRequired("amount", amount),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("filters", filters).map { it.toImmutable() },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("reason", reason),
                            checkRequired("usageDiscount", usageDiscount),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): UsageDiscount = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    _adjustmentType().let {
                        if (it != JsonValue.from("usage_discount")) {
                            throw OrbInvalidDataException(
                                "'adjustmentType' is invalid, received $it"
                            )
                        }
                    }
                    amount()
                    appliesToPriceIds()
                    filters().forEach { it.validate() }
                    isInvoiceLevel()
                    reason()
                    usageDiscount()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        adjustmentType.let {
                            if (it == JsonValue.from("usage_discount")) 1 else 0
                        } +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                        (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (isInvoiceLevel.asKnown().isPresent) 1 else 0) +
                        (if (reason.asKnown().isPresent) 1 else 0) +
                        (if (usageDiscount.asKnown().isPresent) 1 else 0)

                class Filter
                private constructor(
                    private val field: JsonField<Field>,
                    private val operator: JsonField<Operator>,
                    private val values: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("field")
                        @ExcludeMissing
                        field: JsonField<Field> = JsonMissing.of(),
                        @JsonProperty("operator")
                        @ExcludeMissing
                        operator: JsonField<Operator> = JsonMissing.of(),
                        @JsonProperty("values")
                        @ExcludeMissing
                        values: JsonField<List<String>> = JsonMissing.of(),
                    ) : this(field, operator, values, mutableMapOf())

                    /**
                     * The property of the price to filter on.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun field(): Field = field.getRequired("field")

                    /**
                     * Should prices that match the filter be included or excluded.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun operator(): Operator = operator.getRequired("operator")

                    /**
                     * The IDs or values that match this filter.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun values(): List<String> = values.getRequired("values")

                    /**
                     * Returns the raw JSON value of [field].
                     *
                     * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                    /**
                     * Returns the raw JSON value of [operator].
                     *
                     * Unlike [operator], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("operator")
                    @ExcludeMissing
                    fun _operator(): JsonField<Operator> = operator

                    /**
                     * Returns the raw JSON value of [values].
                     *
                     * Unlike [values], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("values")
                    @ExcludeMissing
                    fun _values(): JsonField<List<String>> = values

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
                         * Returns a mutable builder for constructing an instance of [Filter].
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .operator()
                         * .values()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Filter]. */
                    class Builder internal constructor() {

                        private var field: JsonField<Field>? = null
                        private var operator: JsonField<Operator>? = null
                        private var values: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(filter: Filter) = apply {
                            field = filter.field
                            operator = filter.operator
                            values = filter.values.map { it.toMutableList() }
                            additionalProperties = filter.additionalProperties.toMutableMap()
                        }

                        /** The property of the price to filter on. */
                        fun field(field: Field) = field(JsonField.of(field))

                        /**
                         * Sets [Builder.field] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.field] with a well-typed [Field] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun field(field: JsonField<Field>) = apply { this.field = field }

                        /** Should prices that match the filter be included or excluded. */
                        fun operator(operator: Operator) = operator(JsonField.of(operator))

                        /**
                         * Sets [Builder.operator] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.operator] with a well-typed [Operator]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun operator(operator: JsonField<Operator>) = apply {
                            this.operator = operator
                        }

                        /** The IDs or values that match this filter. */
                        fun values(values: List<String>) = values(JsonField.of(values))

                        /**
                         * Sets [Builder.values] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.values] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun values(values: JsonField<List<String>>) = apply {
                            this.values = values.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [values].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addValue(value: String) = apply {
                            values =
                                (values ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("values", it).add(value)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Filter].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .operator()
                         * .values()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Filter =
                            Filter(
                                checkRequired("field", field),
                                checkRequired("operator", operator),
                                checkRequired("values", values).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Filter = apply {
                        if (validated) {
                            return@apply
                        }

                        field().validate()
                        operator().validate()
                        values()
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
                        (field.asKnown().getOrNull()?.validity() ?: 0) +
                            (operator.asKnown().getOrNull()?.validity() ?: 0) +
                            (values.asKnown().getOrNull()?.size ?: 0)

                    /** The property of the price to filter on. */
                    class Field
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PRICE_ID = of("price_id")

                            @JvmField val ITEM_ID = of("item_id")

                            @JvmField val PRICE_TYPE = of("price_type")

                            @JvmField val CURRENCY = of("currency")

                            @JvmField val PRICING_UNIT_ID = of("pricing_unit_id")

                            @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                        }

                        /** An enum containing [Field]'s known values. */
                        enum class Known {
                            PRICE_ID,
                            ITEM_ID,
                            PRICE_TYPE,
                            CURRENCY,
                            PRICING_UNIT_ID,
                        }

                        /**
                         * An enum containing [Field]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Field] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PRICE_ID,
                            ITEM_ID,
                            PRICE_TYPE,
                            CURRENCY,
                            PRICING_UNIT_ID,
                            /**
                             * An enum member indicating that [Field] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PRICE_ID -> Value.PRICE_ID
                                ITEM_ID -> Value.ITEM_ID
                                PRICE_TYPE -> Value.PRICE_TYPE
                                CURRENCY -> Value.CURRENCY
                                PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OrbInvalidDataException if this class instance's value is a not a
                         *   known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PRICE_ID -> Known.PRICE_ID
                                ITEM_ID -> Known.ITEM_ID
                                PRICE_TYPE -> Known.PRICE_TYPE
                                CURRENCY -> Known.CURRENCY
                                PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                                else -> throw OrbInvalidDataException("Unknown Field: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OrbInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OrbInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Field = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /** Should prices that match the filter be included or excluded. */
                    class Operator
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val INCLUDES = of("includes")

                            @JvmField val EXCLUDES = of("excludes")

                            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                        }

                        /** An enum containing [Operator]'s known values. */
                        enum class Known {
                            INCLUDES,
                            EXCLUDES,
                        }

                        /**
                         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Operator] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            INCLUDES,
                            EXCLUDES,
                            /**
                             * An enum member indicating that [Operator] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                INCLUDES -> Value.INCLUDES
                                EXCLUDES -> Value.EXCLUDES
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OrbInvalidDataException if this class instance's value is a not a
                         *   known member.
                         */
                        fun known(): Known =
                            when (this) {
                                INCLUDES -> Known.INCLUDES
                                EXCLUDES -> Known.EXCLUDES
                                else -> throw OrbInvalidDataException("Unknown Operator: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OrbInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OrbInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Operator = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is UsageDiscount && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && isInvoiceLevel == other.isInvoiceLevel && reason == other.reason && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, appliesToPriceIds, filters, isInvoiceLevel, reason, usageDiscount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UsageDiscount{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, reason=$reason, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
            }

            class AmountDiscount
            private constructor(
                private val id: JsonField<String>,
                private val adjustmentType: JsonValue,
                private val amount: JsonField<String>,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val filters: JsonField<List<Filter>>,
                private val isInvoiceLevel: JsonField<Boolean>,
                private val reason: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    adjustmentType: JsonValue = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    amountDiscount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("filters")
                    @ExcludeMissing
                    filters: JsonField<List<Filter>> = JsonMissing.of(),
                    @JsonProperty("is_invoice_level")
                    @ExcludeMissing
                    isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    adjustmentType,
                    amount,
                    amountDiscount,
                    appliesToPriceIds,
                    filters,
                    isInvoiceLevel,
                    reason,
                    mutableMapOf(),
                )

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("amount_discount")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonValue = adjustmentType

                /**
                 * The value applied by an adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): String = amount.getRequired("amount")

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

                /**
                 * The price IDs that this adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * The filters that determine which prices to apply this adjustment to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun filters(): List<Filter> = filters.getRequired("filters")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The reason for the adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun reason(): Optional<String> = reason.getOptional("reason")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                /**
                 * Returns the raw JSON value of [amountDiscount].
                 *
                 * Unlike [amountDiscount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount(): JsonField<String> = amountDiscount

                /**
                 * Returns the raw JSON value of [appliesToPriceIds].
                 *
                 * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @Deprecated("deprecated")
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * Returns the raw JSON value of [filters].
                 *
                 * Unlike [filters], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("filters")
                @ExcludeMissing
                fun _filters(): JsonField<List<Filter>> = filters

                /**
                 * Returns the raw JSON value of [isInvoiceLevel].
                 *
                 * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * Returns the raw JSON value of [reason].
                 *
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                     * Returns a mutable builder for constructing an instance of [AmountDiscount].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .amount()
                     * .amountDiscount()
                     * .appliesToPriceIds()
                     * .filters()
                     * .isInvoiceLevel()
                     * .reason()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AmountDiscount]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonValue = JsonValue.from("amount_discount")
                    private var amount: JsonField<String>? = null
                    private var amountDiscount: JsonField<String>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var filters: JsonField<MutableList<Filter>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(amountDiscount: AmountDiscount) = apply {
                        id = amountDiscount.id
                        adjustmentType = amountDiscount.adjustmentType
                        amount = amountDiscount.amount
                        this.amountDiscount = amountDiscount.amountDiscount
                        appliesToPriceIds =
                            amountDiscount.appliesToPriceIds.map { it.toMutableList() }
                        filters = amountDiscount.filters.map { it.toMutableList() }
                        isInvoiceLevel = amountDiscount.isInvoiceLevel
                        reason = amountDiscount.reason
                        additionalProperties = amountDiscount.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("amount_discount")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun adjustmentType(adjustmentType: JsonValue) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The value applied by an adjustment. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    /**
                     * The amount by which to discount the prices this adjustment applies to in a
                     * given billing period.
                     */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /**
                     * Sets [Builder.amountDiscount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amountDiscount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /** The price IDs that this adjustment applies to. */
                    @Deprecated("deprecated")
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.appliesToPriceIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    @Deprecated("deprecated")
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [appliesToPriceIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    @Deprecated("deprecated")
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                            }
                    }

                    /** The filters that determine which prices to apply this adjustment to. */
                    fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                    /**
                     * Sets [Builder.filters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.filters] with a well-typed `List<Filter>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun filters(filters: JsonField<List<Filter>>) = apply {
                        this.filters = filters.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Filter] to [filters].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addFilter(filter: Filter) = apply {
                        filters =
                            (filters ?: JsonField.of(mutableListOf())).also {
                                checkKnown("filters", it).add(filter)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
                    fun reason(reason: Optional<String>) = reason(reason.getOrNull())

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                     * Returns an immutable instance of [AmountDiscount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .amount()
                     * .amountDiscount()
                     * .appliesToPriceIds()
                     * .filters()
                     * .isInvoiceLevel()
                     * .reason()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AmountDiscount =
                        AmountDiscount(
                            checkRequired("id", id),
                            adjustmentType,
                            checkRequired("amount", amount),
                            checkRequired("amountDiscount", amountDiscount),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("filters", filters).map { it.toImmutable() },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("reason", reason),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AmountDiscount = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    _adjustmentType().let {
                        if (it != JsonValue.from("amount_discount")) {
                            throw OrbInvalidDataException(
                                "'adjustmentType' is invalid, received $it"
                            )
                        }
                    }
                    amount()
                    amountDiscount()
                    appliesToPriceIds()
                    filters().forEach { it.validate() }
                    isInvoiceLevel()
                    reason()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        adjustmentType.let {
                            if (it == JsonValue.from("amount_discount")) 1 else 0
                        } +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (amountDiscount.asKnown().isPresent) 1 else 0) +
                        (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                        (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (isInvoiceLevel.asKnown().isPresent) 1 else 0) +
                        (if (reason.asKnown().isPresent) 1 else 0)

                class Filter
                private constructor(
                    private val field: JsonField<Field>,
                    private val operator: JsonField<Operator>,
                    private val values: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("field")
                        @ExcludeMissing
                        field: JsonField<Field> = JsonMissing.of(),
                        @JsonProperty("operator")
                        @ExcludeMissing
                        operator: JsonField<Operator> = JsonMissing.of(),
                        @JsonProperty("values")
                        @ExcludeMissing
                        values: JsonField<List<String>> = JsonMissing.of(),
                    ) : this(field, operator, values, mutableMapOf())

                    /**
                     * The property of the price to filter on.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun field(): Field = field.getRequired("field")

                    /**
                     * Should prices that match the filter be included or excluded.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun operator(): Operator = operator.getRequired("operator")

                    /**
                     * The IDs or values that match this filter.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun values(): List<String> = values.getRequired("values")

                    /**
                     * Returns the raw JSON value of [field].
                     *
                     * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                    /**
                     * Returns the raw JSON value of [operator].
                     *
                     * Unlike [operator], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("operator")
                    @ExcludeMissing
                    fun _operator(): JsonField<Operator> = operator

                    /**
                     * Returns the raw JSON value of [values].
                     *
                     * Unlike [values], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("values")
                    @ExcludeMissing
                    fun _values(): JsonField<List<String>> = values

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
                         * Returns a mutable builder for constructing an instance of [Filter].
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .operator()
                         * .values()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Filter]. */
                    class Builder internal constructor() {

                        private var field: JsonField<Field>? = null
                        private var operator: JsonField<Operator>? = null
                        private var values: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(filter: Filter) = apply {
                            field = filter.field
                            operator = filter.operator
                            values = filter.values.map { it.toMutableList() }
                            additionalProperties = filter.additionalProperties.toMutableMap()
                        }

                        /** The property of the price to filter on. */
                        fun field(field: Field) = field(JsonField.of(field))

                        /**
                         * Sets [Builder.field] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.field] with a well-typed [Field] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun field(field: JsonField<Field>) = apply { this.field = field }

                        /** Should prices that match the filter be included or excluded. */
                        fun operator(operator: Operator) = operator(JsonField.of(operator))

                        /**
                         * Sets [Builder.operator] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.operator] with a well-typed [Operator]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun operator(operator: JsonField<Operator>) = apply {
                            this.operator = operator
                        }

                        /** The IDs or values that match this filter. */
                        fun values(values: List<String>) = values(JsonField.of(values))

                        /**
                         * Sets [Builder.values] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.values] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun values(values: JsonField<List<String>>) = apply {
                            this.values = values.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [values].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addValue(value: String) = apply {
                            values =
                                (values ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("values", it).add(value)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Filter].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .operator()
                         * .values()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Filter =
                            Filter(
                                checkRequired("field", field),
                                checkRequired("operator", operator),
                                checkRequired("values", values).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Filter = apply {
                        if (validated) {
                            return@apply
                        }

                        field().validate()
                        operator().validate()
                        values()
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
                        (field.asKnown().getOrNull()?.validity() ?: 0) +
                            (operator.asKnown().getOrNull()?.validity() ?: 0) +
                            (values.asKnown().getOrNull()?.size ?: 0)

                    /** The property of the price to filter on. */
                    class Field
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PRICE_ID = of("price_id")

                            @JvmField val ITEM_ID = of("item_id")

                            @JvmField val PRICE_TYPE = of("price_type")

                            @JvmField val CURRENCY = of("currency")

                            @JvmField val PRICING_UNIT_ID = of("pricing_unit_id")

                            @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                        }

                        /** An enum containing [Field]'s known values. */
                        enum class Known {
                            PRICE_ID,
                            ITEM_ID,
                            PRICE_TYPE,
                            CURRENCY,
                            PRICING_UNIT_ID,
                        }

                        /**
                         * An enum containing [Field]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Field] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PRICE_ID,
                            ITEM_ID,
                            PRICE_TYPE,
                            CURRENCY,
                            PRICING_UNIT_ID,
                            /**
                             * An enum member indicating that [Field] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PRICE_ID -> Value.PRICE_ID
                                ITEM_ID -> Value.ITEM_ID
                                PRICE_TYPE -> Value.PRICE_TYPE
                                CURRENCY -> Value.CURRENCY
                                PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OrbInvalidDataException if this class instance's value is a not a
                         *   known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PRICE_ID -> Known.PRICE_ID
                                ITEM_ID -> Known.ITEM_ID
                                PRICE_TYPE -> Known.PRICE_TYPE
                                CURRENCY -> Known.CURRENCY
                                PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                                else -> throw OrbInvalidDataException("Unknown Field: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OrbInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OrbInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Field = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /** Should prices that match the filter be included or excluded. */
                    class Operator
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val INCLUDES = of("includes")

                            @JvmField val EXCLUDES = of("excludes")

                            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                        }

                        /** An enum containing [Operator]'s known values. */
                        enum class Known {
                            INCLUDES,
                            EXCLUDES,
                        }

                        /**
                         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Operator] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            INCLUDES,
                            EXCLUDES,
                            /**
                             * An enum member indicating that [Operator] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                INCLUDES -> Value.INCLUDES
                                EXCLUDES -> Value.EXCLUDES
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OrbInvalidDataException if this class instance's value is a not a
                         *   known member.
                         */
                        fun known(): Known =
                            when (this) {
                                INCLUDES -> Known.INCLUDES
                                EXCLUDES -> Known.EXCLUDES
                                else -> throw OrbInvalidDataException("Unknown Operator: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OrbInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OrbInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Operator = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AmountDiscount && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && isInvoiceLevel == other.isInvoiceLevel && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, amountDiscount, appliesToPriceIds, filters, isInvoiceLevel, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AmountDiscount{id=$id, adjustmentType=$adjustmentType, amount=$amount, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, reason=$reason, additionalProperties=$additionalProperties}"
            }

            class PercentageDiscount
            private constructor(
                private val id: JsonField<String>,
                private val adjustmentType: JsonValue,
                private val amount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val filters: JsonField<List<Filter>>,
                private val isInvoiceLevel: JsonField<Boolean>,
                private val percentageDiscount: JsonField<Double>,
                private val reason: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    adjustmentType: JsonValue = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("filters")
                    @ExcludeMissing
                    filters: JsonField<List<Filter>> = JsonMissing.of(),
                    @JsonProperty("is_invoice_level")
                    @ExcludeMissing
                    isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    percentageDiscount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    adjustmentType,
                    amount,
                    appliesToPriceIds,
                    filters,
                    isInvoiceLevel,
                    percentageDiscount,
                    reason,
                    mutableMapOf(),
                )

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("percentage_discount")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonValue = adjustmentType

                /**
                 * The value applied by an adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): String = amount.getRequired("amount")

                /**
                 * The price IDs that this adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * The filters that determine which prices to apply this adjustment to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun filters(): List<Filter> = filters.getRequired("filters")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun percentageDiscount(): Double =
                    percentageDiscount.getRequired("percentage_discount")

                /**
                 * The reason for the adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun reason(): Optional<String> = reason.getOptional("reason")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                /**
                 * Returns the raw JSON value of [appliesToPriceIds].
                 *
                 * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @Deprecated("deprecated")
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * Returns the raw JSON value of [filters].
                 *
                 * Unlike [filters], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("filters")
                @ExcludeMissing
                fun _filters(): JsonField<List<Filter>> = filters

                /**
                 * Returns the raw JSON value of [isInvoiceLevel].
                 *
                 * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * Returns the raw JSON value of [percentageDiscount].
                 *
                 * Unlike [percentageDiscount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount(): JsonField<Double> = percentageDiscount

                /**
                 * Returns the raw JSON value of [reason].
                 *
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                     * [PercentageDiscount].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .amount()
                     * .appliesToPriceIds()
                     * .filters()
                     * .isInvoiceLevel()
                     * .percentageDiscount()
                     * .reason()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PercentageDiscount]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonValue = JsonValue.from("percentage_discount")
                    private var amount: JsonField<String>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var filters: JsonField<MutableList<Filter>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var percentageDiscount: JsonField<Double>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(percentageDiscount: PercentageDiscount) = apply {
                        id = percentageDiscount.id
                        adjustmentType = percentageDiscount.adjustmentType
                        amount = percentageDiscount.amount
                        appliesToPriceIds =
                            percentageDiscount.appliesToPriceIds.map { it.toMutableList() }
                        filters = percentageDiscount.filters.map { it.toMutableList() }
                        isInvoiceLevel = percentageDiscount.isInvoiceLevel
                        this.percentageDiscount = percentageDiscount.percentageDiscount
                        reason = percentageDiscount.reason
                        additionalProperties =
                            percentageDiscount.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("percentage_discount")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun adjustmentType(adjustmentType: JsonValue) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The value applied by an adjustment. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    /** The price IDs that this adjustment applies to. */
                    @Deprecated("deprecated")
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.appliesToPriceIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    @Deprecated("deprecated")
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [appliesToPriceIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    @Deprecated("deprecated")
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                            }
                    }

                    /** The filters that determine which prices to apply this adjustment to. */
                    fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                    /**
                     * Sets [Builder.filters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.filters] with a well-typed `List<Filter>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun filters(filters: JsonField<List<Filter>>) = apply {
                        this.filters = filters.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Filter] to [filters].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addFilter(filter: Filter) = apply {
                        filters =
                            (filters ?: JsonField.of(mutableListOf())).also {
                                checkKnown("filters", it).add(filter)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /**
                     * The percentage (as a value between 0 and 1) by which to discount the price
                     * intervals this adjustment applies to in a given billing period.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Sets [Builder.percentageDiscount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentageDiscount] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
                    fun reason(reason: Optional<String>) = reason(reason.getOrNull())

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                     * Returns an immutable instance of [PercentageDiscount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .amount()
                     * .appliesToPriceIds()
                     * .filters()
                     * .isInvoiceLevel()
                     * .percentageDiscount()
                     * .reason()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PercentageDiscount =
                        PercentageDiscount(
                            checkRequired("id", id),
                            adjustmentType,
                            checkRequired("amount", amount),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("filters", filters).map { it.toImmutable() },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("percentageDiscount", percentageDiscount),
                            checkRequired("reason", reason),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): PercentageDiscount = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    _adjustmentType().let {
                        if (it != JsonValue.from("percentage_discount")) {
                            throw OrbInvalidDataException(
                                "'adjustmentType' is invalid, received $it"
                            )
                        }
                    }
                    amount()
                    appliesToPriceIds()
                    filters().forEach { it.validate() }
                    isInvoiceLevel()
                    percentageDiscount()
                    reason()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        adjustmentType.let {
                            if (it == JsonValue.from("percentage_discount")) 1 else 0
                        } +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                        (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (isInvoiceLevel.asKnown().isPresent) 1 else 0) +
                        (if (percentageDiscount.asKnown().isPresent) 1 else 0) +
                        (if (reason.asKnown().isPresent) 1 else 0)

                class Filter
                private constructor(
                    private val field: JsonField<Field>,
                    private val operator: JsonField<Operator>,
                    private val values: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("field")
                        @ExcludeMissing
                        field: JsonField<Field> = JsonMissing.of(),
                        @JsonProperty("operator")
                        @ExcludeMissing
                        operator: JsonField<Operator> = JsonMissing.of(),
                        @JsonProperty("values")
                        @ExcludeMissing
                        values: JsonField<List<String>> = JsonMissing.of(),
                    ) : this(field, operator, values, mutableMapOf())

                    /**
                     * The property of the price to filter on.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun field(): Field = field.getRequired("field")

                    /**
                     * Should prices that match the filter be included or excluded.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun operator(): Operator = operator.getRequired("operator")

                    /**
                     * The IDs or values that match this filter.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun values(): List<String> = values.getRequired("values")

                    /**
                     * Returns the raw JSON value of [field].
                     *
                     * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                    /**
                     * Returns the raw JSON value of [operator].
                     *
                     * Unlike [operator], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("operator")
                    @ExcludeMissing
                    fun _operator(): JsonField<Operator> = operator

                    /**
                     * Returns the raw JSON value of [values].
                     *
                     * Unlike [values], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("values")
                    @ExcludeMissing
                    fun _values(): JsonField<List<String>> = values

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
                         * Returns a mutable builder for constructing an instance of [Filter].
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .operator()
                         * .values()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Filter]. */
                    class Builder internal constructor() {

                        private var field: JsonField<Field>? = null
                        private var operator: JsonField<Operator>? = null
                        private var values: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(filter: Filter) = apply {
                            field = filter.field
                            operator = filter.operator
                            values = filter.values.map { it.toMutableList() }
                            additionalProperties = filter.additionalProperties.toMutableMap()
                        }

                        /** The property of the price to filter on. */
                        fun field(field: Field) = field(JsonField.of(field))

                        /**
                         * Sets [Builder.field] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.field] with a well-typed [Field] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun field(field: JsonField<Field>) = apply { this.field = field }

                        /** Should prices that match the filter be included or excluded. */
                        fun operator(operator: Operator) = operator(JsonField.of(operator))

                        /**
                         * Sets [Builder.operator] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.operator] with a well-typed [Operator]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun operator(operator: JsonField<Operator>) = apply {
                            this.operator = operator
                        }

                        /** The IDs or values that match this filter. */
                        fun values(values: List<String>) = values(JsonField.of(values))

                        /**
                         * Sets [Builder.values] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.values] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun values(values: JsonField<List<String>>) = apply {
                            this.values = values.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [values].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addValue(value: String) = apply {
                            values =
                                (values ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("values", it).add(value)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Filter].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .operator()
                         * .values()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Filter =
                            Filter(
                                checkRequired("field", field),
                                checkRequired("operator", operator),
                                checkRequired("values", values).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Filter = apply {
                        if (validated) {
                            return@apply
                        }

                        field().validate()
                        operator().validate()
                        values()
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
                        (field.asKnown().getOrNull()?.validity() ?: 0) +
                            (operator.asKnown().getOrNull()?.validity() ?: 0) +
                            (values.asKnown().getOrNull()?.size ?: 0)

                    /** The property of the price to filter on. */
                    class Field
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PRICE_ID = of("price_id")

                            @JvmField val ITEM_ID = of("item_id")

                            @JvmField val PRICE_TYPE = of("price_type")

                            @JvmField val CURRENCY = of("currency")

                            @JvmField val PRICING_UNIT_ID = of("pricing_unit_id")

                            @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                        }

                        /** An enum containing [Field]'s known values. */
                        enum class Known {
                            PRICE_ID,
                            ITEM_ID,
                            PRICE_TYPE,
                            CURRENCY,
                            PRICING_UNIT_ID,
                        }

                        /**
                         * An enum containing [Field]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Field] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PRICE_ID,
                            ITEM_ID,
                            PRICE_TYPE,
                            CURRENCY,
                            PRICING_UNIT_ID,
                            /**
                             * An enum member indicating that [Field] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PRICE_ID -> Value.PRICE_ID
                                ITEM_ID -> Value.ITEM_ID
                                PRICE_TYPE -> Value.PRICE_TYPE
                                CURRENCY -> Value.CURRENCY
                                PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OrbInvalidDataException if this class instance's value is a not a
                         *   known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PRICE_ID -> Known.PRICE_ID
                                ITEM_ID -> Known.ITEM_ID
                                PRICE_TYPE -> Known.PRICE_TYPE
                                CURRENCY -> Known.CURRENCY
                                PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                                else -> throw OrbInvalidDataException("Unknown Field: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OrbInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OrbInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Field = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /** Should prices that match the filter be included or excluded. */
                    class Operator
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val INCLUDES = of("includes")

                            @JvmField val EXCLUDES = of("excludes")

                            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                        }

                        /** An enum containing [Operator]'s known values. */
                        enum class Known {
                            INCLUDES,
                            EXCLUDES,
                        }

                        /**
                         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Operator] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            INCLUDES,
                            EXCLUDES,
                            /**
                             * An enum member indicating that [Operator] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                INCLUDES -> Value.INCLUDES
                                EXCLUDES -> Value.EXCLUDES
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OrbInvalidDataException if this class instance's value is a not a
                         *   known member.
                         */
                        fun known(): Known =
                            when (this) {
                                INCLUDES -> Known.INCLUDES
                                EXCLUDES -> Known.EXCLUDES
                                else -> throw OrbInvalidDataException("Unknown Operator: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OrbInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OrbInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Operator = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PercentageDiscount && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && isInvoiceLevel == other.isInvoiceLevel && percentageDiscount == other.percentageDiscount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, appliesToPriceIds, filters, isInvoiceLevel, percentageDiscount, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PercentageDiscount{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, percentageDiscount=$percentageDiscount, reason=$reason, additionalProperties=$additionalProperties}"
            }

            class Minimum
            private constructor(
                private val id: JsonField<String>,
                private val adjustmentType: JsonValue,
                private val amount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val filters: JsonField<List<Filter>>,
                private val isInvoiceLevel: JsonField<Boolean>,
                private val itemId: JsonField<String>,
                private val minimumAmount: JsonField<String>,
                private val reason: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    adjustmentType: JsonValue = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("filters")
                    @ExcludeMissing
                    filters: JsonField<List<Filter>> = JsonMissing.of(),
                    @JsonProperty("is_invoice_level")
                    @ExcludeMissing
                    isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    itemId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("minimum_amount")
                    @ExcludeMissing
                    minimumAmount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    adjustmentType,
                    amount,
                    appliesToPriceIds,
                    filters,
                    isInvoiceLevel,
                    itemId,
                    minimumAmount,
                    reason,
                    mutableMapOf(),
                )

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("minimum")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonValue = adjustmentType

                /**
                 * The value applied by an adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): String = amount.getRequired("amount")

                /**
                 * The price IDs that this adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * The filters that determine which prices to apply this adjustment to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun filters(): List<Filter> = filters.getRequired("filters")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The item ID that revenue from this minimum will be attributed to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                /**
                 * The reason for the adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun reason(): Optional<String> = reason.getOptional("reason")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                /**
                 * Returns the raw JSON value of [appliesToPriceIds].
                 *
                 * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @Deprecated("deprecated")
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * Returns the raw JSON value of [filters].
                 *
                 * Unlike [filters], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("filters")
                @ExcludeMissing
                fun _filters(): JsonField<List<Filter>> = filters

                /**
                 * Returns the raw JSON value of [isInvoiceLevel].
                 *
                 * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * Returns the raw JSON value of [itemId].
                 *
                 * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * Returns the raw JSON value of [minimumAmount].
                 *
                 * Unlike [minimumAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun _minimumAmount(): JsonField<String> = minimumAmount

                /**
                 * Returns the raw JSON value of [reason].
                 *
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                     * Returns a mutable builder for constructing an instance of [Minimum].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .amount()
                     * .appliesToPriceIds()
                     * .filters()
                     * .isInvoiceLevel()
                     * .itemId()
                     * .minimumAmount()
                     * .reason()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Minimum]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonValue = JsonValue.from("minimum")
                    private var amount: JsonField<String>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var filters: JsonField<MutableList<Filter>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var itemId: JsonField<String>? = null
                    private var minimumAmount: JsonField<String>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(minimum: Minimum) = apply {
                        id = minimum.id
                        adjustmentType = minimum.adjustmentType
                        amount = minimum.amount
                        appliesToPriceIds = minimum.appliesToPriceIds.map { it.toMutableList() }
                        filters = minimum.filters.map { it.toMutableList() }
                        isInvoiceLevel = minimum.isInvoiceLevel
                        itemId = minimum.itemId
                        minimumAmount = minimum.minimumAmount
                        reason = minimum.reason
                        additionalProperties = minimum.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("minimum")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun adjustmentType(adjustmentType: JsonValue) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The value applied by an adjustment. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    /** The price IDs that this adjustment applies to. */
                    @Deprecated("deprecated")
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.appliesToPriceIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    @Deprecated("deprecated")
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [appliesToPriceIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    @Deprecated("deprecated")
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                            }
                    }

                    /** The filters that determine which prices to apply this adjustment to. */
                    fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                    /**
                     * Sets [Builder.filters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.filters] with a well-typed `List<Filter>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun filters(filters: JsonField<List<Filter>>) = apply {
                        this.filters = filters.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Filter] to [filters].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addFilter(filter: Filter) = apply {
                        filters =
                            (filters ?: JsonField.of(mutableListOf())).also {
                                checkKnown("filters", it).add(filter)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The item ID that revenue from this minimum will be attributed to. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /**
                     * Sets [Builder.itemId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itemId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * The minimum amount to charge in a given billing period for the prices this
                     * adjustment applies to.
                     */
                    fun minimumAmount(minimumAmount: String) =
                        minimumAmount(JsonField.of(minimumAmount))

                    /**
                     * Sets [Builder.minimumAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.minimumAmount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                        this.minimumAmount = minimumAmount
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
                    fun reason(reason: Optional<String>) = reason(reason.getOrNull())

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                     * Returns an immutable instance of [Minimum].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .amount()
                     * .appliesToPriceIds()
                     * .filters()
                     * .isInvoiceLevel()
                     * .itemId()
                     * .minimumAmount()
                     * .reason()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Minimum =
                        Minimum(
                            checkRequired("id", id),
                            adjustmentType,
                            checkRequired("amount", amount),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("filters", filters).map { it.toImmutable() },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("itemId", itemId),
                            checkRequired("minimumAmount", minimumAmount),
                            checkRequired("reason", reason),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Minimum = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    _adjustmentType().let {
                        if (it != JsonValue.from("minimum")) {
                            throw OrbInvalidDataException(
                                "'adjustmentType' is invalid, received $it"
                            )
                        }
                    }
                    amount()
                    appliesToPriceIds()
                    filters().forEach { it.validate() }
                    isInvoiceLevel()
                    itemId()
                    minimumAmount()
                    reason()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        adjustmentType.let { if (it == JsonValue.from("minimum")) 1 else 0 } +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                        (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (isInvoiceLevel.asKnown().isPresent) 1 else 0) +
                        (if (itemId.asKnown().isPresent) 1 else 0) +
                        (if (minimumAmount.asKnown().isPresent) 1 else 0) +
                        (if (reason.asKnown().isPresent) 1 else 0)

                class Filter
                private constructor(
                    private val field: JsonField<Field>,
                    private val operator: JsonField<Operator>,
                    private val values: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("field")
                        @ExcludeMissing
                        field: JsonField<Field> = JsonMissing.of(),
                        @JsonProperty("operator")
                        @ExcludeMissing
                        operator: JsonField<Operator> = JsonMissing.of(),
                        @JsonProperty("values")
                        @ExcludeMissing
                        values: JsonField<List<String>> = JsonMissing.of(),
                    ) : this(field, operator, values, mutableMapOf())

                    /**
                     * The property of the price to filter on.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun field(): Field = field.getRequired("field")

                    /**
                     * Should prices that match the filter be included or excluded.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun operator(): Operator = operator.getRequired("operator")

                    /**
                     * The IDs or values that match this filter.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun values(): List<String> = values.getRequired("values")

                    /**
                     * Returns the raw JSON value of [field].
                     *
                     * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                    /**
                     * Returns the raw JSON value of [operator].
                     *
                     * Unlike [operator], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("operator")
                    @ExcludeMissing
                    fun _operator(): JsonField<Operator> = operator

                    /**
                     * Returns the raw JSON value of [values].
                     *
                     * Unlike [values], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("values")
                    @ExcludeMissing
                    fun _values(): JsonField<List<String>> = values

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
                         * Returns a mutable builder for constructing an instance of [Filter].
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .operator()
                         * .values()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Filter]. */
                    class Builder internal constructor() {

                        private var field: JsonField<Field>? = null
                        private var operator: JsonField<Operator>? = null
                        private var values: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(filter: Filter) = apply {
                            field = filter.field
                            operator = filter.operator
                            values = filter.values.map { it.toMutableList() }
                            additionalProperties = filter.additionalProperties.toMutableMap()
                        }

                        /** The property of the price to filter on. */
                        fun field(field: Field) = field(JsonField.of(field))

                        /**
                         * Sets [Builder.field] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.field] with a well-typed [Field] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun field(field: JsonField<Field>) = apply { this.field = field }

                        /** Should prices that match the filter be included or excluded. */
                        fun operator(operator: Operator) = operator(JsonField.of(operator))

                        /**
                         * Sets [Builder.operator] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.operator] with a well-typed [Operator]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun operator(operator: JsonField<Operator>) = apply {
                            this.operator = operator
                        }

                        /** The IDs or values that match this filter. */
                        fun values(values: List<String>) = values(JsonField.of(values))

                        /**
                         * Sets [Builder.values] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.values] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun values(values: JsonField<List<String>>) = apply {
                            this.values = values.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [values].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addValue(value: String) = apply {
                            values =
                                (values ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("values", it).add(value)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Filter].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .operator()
                         * .values()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Filter =
                            Filter(
                                checkRequired("field", field),
                                checkRequired("operator", operator),
                                checkRequired("values", values).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Filter = apply {
                        if (validated) {
                            return@apply
                        }

                        field().validate()
                        operator().validate()
                        values()
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
                        (field.asKnown().getOrNull()?.validity() ?: 0) +
                            (operator.asKnown().getOrNull()?.validity() ?: 0) +
                            (values.asKnown().getOrNull()?.size ?: 0)

                    /** The property of the price to filter on. */
                    class Field
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PRICE_ID = of("price_id")

                            @JvmField val ITEM_ID = of("item_id")

                            @JvmField val PRICE_TYPE = of("price_type")

                            @JvmField val CURRENCY = of("currency")

                            @JvmField val PRICING_UNIT_ID = of("pricing_unit_id")

                            @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                        }

                        /** An enum containing [Field]'s known values. */
                        enum class Known {
                            PRICE_ID,
                            ITEM_ID,
                            PRICE_TYPE,
                            CURRENCY,
                            PRICING_UNIT_ID,
                        }

                        /**
                         * An enum containing [Field]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Field] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PRICE_ID,
                            ITEM_ID,
                            PRICE_TYPE,
                            CURRENCY,
                            PRICING_UNIT_ID,
                            /**
                             * An enum member indicating that [Field] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PRICE_ID -> Value.PRICE_ID
                                ITEM_ID -> Value.ITEM_ID
                                PRICE_TYPE -> Value.PRICE_TYPE
                                CURRENCY -> Value.CURRENCY
                                PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OrbInvalidDataException if this class instance's value is a not a
                         *   known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PRICE_ID -> Known.PRICE_ID
                                ITEM_ID -> Known.ITEM_ID
                                PRICE_TYPE -> Known.PRICE_TYPE
                                CURRENCY -> Known.CURRENCY
                                PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                                else -> throw OrbInvalidDataException("Unknown Field: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OrbInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OrbInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Field = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /** Should prices that match the filter be included or excluded. */
                    class Operator
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val INCLUDES = of("includes")

                            @JvmField val EXCLUDES = of("excludes")

                            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                        }

                        /** An enum containing [Operator]'s known values. */
                        enum class Known {
                            INCLUDES,
                            EXCLUDES,
                        }

                        /**
                         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Operator] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            INCLUDES,
                            EXCLUDES,
                            /**
                             * An enum member indicating that [Operator] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                INCLUDES -> Value.INCLUDES
                                EXCLUDES -> Value.EXCLUDES
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OrbInvalidDataException if this class instance's value is a not a
                         *   known member.
                         */
                        fun known(): Known =
                            when (this) {
                                INCLUDES -> Known.INCLUDES
                                EXCLUDES -> Known.EXCLUDES
                                else -> throw OrbInvalidDataException("Unknown Operator: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OrbInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OrbInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Operator = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Minimum && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && isInvoiceLevel == other.isInvoiceLevel && itemId == other.itemId && minimumAmount == other.minimumAmount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, appliesToPriceIds, filters, isInvoiceLevel, itemId, minimumAmount, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Minimum{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, itemId=$itemId, minimumAmount=$minimumAmount, reason=$reason, additionalProperties=$additionalProperties}"
            }

            class Maximum
            private constructor(
                private val id: JsonField<String>,
                private val adjustmentType: JsonValue,
                private val amount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val filters: JsonField<List<Filter>>,
                private val isInvoiceLevel: JsonField<Boolean>,
                private val maximumAmount: JsonField<String>,
                private val reason: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    adjustmentType: JsonValue = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("filters")
                    @ExcludeMissing
                    filters: JsonField<List<Filter>> = JsonMissing.of(),
                    @JsonProperty("is_invoice_level")
                    @ExcludeMissing
                    isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("maximum_amount")
                    @ExcludeMissing
                    maximumAmount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    adjustmentType,
                    amount,
                    appliesToPriceIds,
                    filters,
                    isInvoiceLevel,
                    maximumAmount,
                    reason,
                    mutableMapOf(),
                )

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("maximum")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonValue = adjustmentType

                /**
                 * The value applied by an adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): String = amount.getRequired("amount")

                /**
                 * The price IDs that this adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * The filters that determine which prices to apply this adjustment to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun filters(): List<Filter> = filters.getRequired("filters")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

                /**
                 * The reason for the adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun reason(): Optional<String> = reason.getOptional("reason")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                /**
                 * Returns the raw JSON value of [appliesToPriceIds].
                 *
                 * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @Deprecated("deprecated")
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * Returns the raw JSON value of [filters].
                 *
                 * Unlike [filters], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("filters")
                @ExcludeMissing
                fun _filters(): JsonField<List<Filter>> = filters

                /**
                 * Returns the raw JSON value of [isInvoiceLevel].
                 *
                 * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * Returns the raw JSON value of [maximumAmount].
                 *
                 * Unlike [maximumAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun _maximumAmount(): JsonField<String> = maximumAmount

                /**
                 * Returns the raw JSON value of [reason].
                 *
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                     * Returns a mutable builder for constructing an instance of [Maximum].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .amount()
                     * .appliesToPriceIds()
                     * .filters()
                     * .isInvoiceLevel()
                     * .maximumAmount()
                     * .reason()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Maximum]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonValue = JsonValue.from("maximum")
                    private var amount: JsonField<String>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var filters: JsonField<MutableList<Filter>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var maximumAmount: JsonField<String>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(maximum: Maximum) = apply {
                        id = maximum.id
                        adjustmentType = maximum.adjustmentType
                        amount = maximum.amount
                        appliesToPriceIds = maximum.appliesToPriceIds.map { it.toMutableList() }
                        filters = maximum.filters.map { it.toMutableList() }
                        isInvoiceLevel = maximum.isInvoiceLevel
                        maximumAmount = maximum.maximumAmount
                        reason = maximum.reason
                        additionalProperties = maximum.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("maximum")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun adjustmentType(adjustmentType: JsonValue) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The value applied by an adjustment. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    /** The price IDs that this adjustment applies to. */
                    @Deprecated("deprecated")
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.appliesToPriceIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    @Deprecated("deprecated")
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [appliesToPriceIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    @Deprecated("deprecated")
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                            }
                    }

                    /** The filters that determine which prices to apply this adjustment to. */
                    fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                    /**
                     * Sets [Builder.filters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.filters] with a well-typed `List<Filter>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun filters(filters: JsonField<List<Filter>>) = apply {
                        this.filters = filters.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Filter] to [filters].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addFilter(filter: Filter) = apply {
                        filters =
                            (filters ?: JsonField.of(mutableListOf())).also {
                                checkKnown("filters", it).add(filter)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /**
                     * The maximum amount to charge in a given billing period for the prices this
                     * adjustment applies to.
                     */
                    fun maximumAmount(maximumAmount: String) =
                        maximumAmount(JsonField.of(maximumAmount))

                    /**
                     * Sets [Builder.maximumAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maximumAmount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
                    fun reason(reason: Optional<String>) = reason(reason.getOrNull())

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
                     * Returns an immutable instance of [Maximum].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .amount()
                     * .appliesToPriceIds()
                     * .filters()
                     * .isInvoiceLevel()
                     * .maximumAmount()
                     * .reason()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Maximum =
                        Maximum(
                            checkRequired("id", id),
                            adjustmentType,
                            checkRequired("amount", amount),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("filters", filters).map { it.toImmutable() },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("maximumAmount", maximumAmount),
                            checkRequired("reason", reason),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Maximum = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    _adjustmentType().let {
                        if (it != JsonValue.from("maximum")) {
                            throw OrbInvalidDataException(
                                "'adjustmentType' is invalid, received $it"
                            )
                        }
                    }
                    amount()
                    appliesToPriceIds()
                    filters().forEach { it.validate() }
                    isInvoiceLevel()
                    maximumAmount()
                    reason()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        adjustmentType.let { if (it == JsonValue.from("maximum")) 1 else 0 } +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                        (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (isInvoiceLevel.asKnown().isPresent) 1 else 0) +
                        (if (maximumAmount.asKnown().isPresent) 1 else 0) +
                        (if (reason.asKnown().isPresent) 1 else 0)

                class Filter
                private constructor(
                    private val field: JsonField<Field>,
                    private val operator: JsonField<Operator>,
                    private val values: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("field")
                        @ExcludeMissing
                        field: JsonField<Field> = JsonMissing.of(),
                        @JsonProperty("operator")
                        @ExcludeMissing
                        operator: JsonField<Operator> = JsonMissing.of(),
                        @JsonProperty("values")
                        @ExcludeMissing
                        values: JsonField<List<String>> = JsonMissing.of(),
                    ) : this(field, operator, values, mutableMapOf())

                    /**
                     * The property of the price to filter on.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun field(): Field = field.getRequired("field")

                    /**
                     * Should prices that match the filter be included or excluded.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun operator(): Operator = operator.getRequired("operator")

                    /**
                     * The IDs or values that match this filter.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun values(): List<String> = values.getRequired("values")

                    /**
                     * Returns the raw JSON value of [field].
                     *
                     * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                    /**
                     * Returns the raw JSON value of [operator].
                     *
                     * Unlike [operator], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("operator")
                    @ExcludeMissing
                    fun _operator(): JsonField<Operator> = operator

                    /**
                     * Returns the raw JSON value of [values].
                     *
                     * Unlike [values], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("values")
                    @ExcludeMissing
                    fun _values(): JsonField<List<String>> = values

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
                         * Returns a mutable builder for constructing an instance of [Filter].
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .operator()
                         * .values()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Filter]. */
                    class Builder internal constructor() {

                        private var field: JsonField<Field>? = null
                        private var operator: JsonField<Operator>? = null
                        private var values: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(filter: Filter) = apply {
                            field = filter.field
                            operator = filter.operator
                            values = filter.values.map { it.toMutableList() }
                            additionalProperties = filter.additionalProperties.toMutableMap()
                        }

                        /** The property of the price to filter on. */
                        fun field(field: Field) = field(JsonField.of(field))

                        /**
                         * Sets [Builder.field] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.field] with a well-typed [Field] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun field(field: JsonField<Field>) = apply { this.field = field }

                        /** Should prices that match the filter be included or excluded. */
                        fun operator(operator: Operator) = operator(JsonField.of(operator))

                        /**
                         * Sets [Builder.operator] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.operator] with a well-typed [Operator]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun operator(operator: JsonField<Operator>) = apply {
                            this.operator = operator
                        }

                        /** The IDs or values that match this filter. */
                        fun values(values: List<String>) = values(JsonField.of(values))

                        /**
                         * Sets [Builder.values] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.values] with a well-typed `List<String>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun values(values: JsonField<List<String>>) = apply {
                            this.values = values.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [values].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addValue(value: String) = apply {
                            values =
                                (values ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("values", it).add(value)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Filter].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .operator()
                         * .values()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Filter =
                            Filter(
                                checkRequired("field", field),
                                checkRequired("operator", operator),
                                checkRequired("values", values).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Filter = apply {
                        if (validated) {
                            return@apply
                        }

                        field().validate()
                        operator().validate()
                        values()
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
                        (field.asKnown().getOrNull()?.validity() ?: 0) +
                            (operator.asKnown().getOrNull()?.validity() ?: 0) +
                            (values.asKnown().getOrNull()?.size ?: 0)

                    /** The property of the price to filter on. */
                    class Field
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PRICE_ID = of("price_id")

                            @JvmField val ITEM_ID = of("item_id")

                            @JvmField val PRICE_TYPE = of("price_type")

                            @JvmField val CURRENCY = of("currency")

                            @JvmField val PRICING_UNIT_ID = of("pricing_unit_id")

                            @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                        }

                        /** An enum containing [Field]'s known values. */
                        enum class Known {
                            PRICE_ID,
                            ITEM_ID,
                            PRICE_TYPE,
                            CURRENCY,
                            PRICING_UNIT_ID,
                        }

                        /**
                         * An enum containing [Field]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Field] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PRICE_ID,
                            ITEM_ID,
                            PRICE_TYPE,
                            CURRENCY,
                            PRICING_UNIT_ID,
                            /**
                             * An enum member indicating that [Field] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PRICE_ID -> Value.PRICE_ID
                                ITEM_ID -> Value.ITEM_ID
                                PRICE_TYPE -> Value.PRICE_TYPE
                                CURRENCY -> Value.CURRENCY
                                PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OrbInvalidDataException if this class instance's value is a not a
                         *   known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PRICE_ID -> Known.PRICE_ID
                                ITEM_ID -> Known.ITEM_ID
                                PRICE_TYPE -> Known.PRICE_TYPE
                                CURRENCY -> Known.CURRENCY
                                PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                                else -> throw OrbInvalidDataException("Unknown Field: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OrbInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OrbInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Field = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /** Should prices that match the filter be included or excluded. */
                    class Operator
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val INCLUDES = of("includes")

                            @JvmField val EXCLUDES = of("excludes")

                            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                        }

                        /** An enum containing [Operator]'s known values. */
                        enum class Known {
                            INCLUDES,
                            EXCLUDES,
                        }

                        /**
                         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Operator] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            INCLUDES,
                            EXCLUDES,
                            /**
                             * An enum member indicating that [Operator] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                INCLUDES -> Value.INCLUDES
                                EXCLUDES -> Value.EXCLUDES
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OrbInvalidDataException if this class instance's value is a not a
                         *   known member.
                         */
                        fun known(): Known =
                            when (this) {
                                INCLUDES -> Known.INCLUDES
                                EXCLUDES -> Known.EXCLUDES
                                else -> throw OrbInvalidDataException("Unknown Operator: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OrbInvalidDataException if this class instance's value does not
                         *   have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OrbInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Operator = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Maximum && id == other.id && adjustmentType == other.adjustmentType && amount == other.amount && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && isInvoiceLevel == other.isInvoiceLevel && maximumAmount == other.maximumAmount && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amount, appliesToPriceIds, filters, isInvoiceLevel, maximumAmount, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Maximum{id=$id, adjustmentType=$adjustmentType, amount=$amount, appliesToPriceIds=$appliesToPriceIds, filters=$filters, isInvoiceLevel=$isInvoiceLevel, maximumAmount=$maximumAmount, reason=$reason, additionalProperties=$additionalProperties}"
            }
        }

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        class Maximum
        private constructor(
            private val appliesToPriceIds: JsonField<List<String>>,
            private val filters: JsonField<List<Filter>>,
            private val maximumAmount: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<List<Filter>> = JsonMissing.of(),
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                maximumAmount: JsonField<String> = JsonMissing.of(),
            ) : this(appliesToPriceIds, filters, maximumAmount, mutableMapOf())

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            @Deprecated("deprecated")
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * The filters that determine which prices to apply this maximum to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun filters(): List<Filter> = filters.getRequired("filters")

            /**
             * Maximum amount applied
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters")
            @ExcludeMissing
            fun _filters(): JsonField<List<Filter>> = filters

            /**
             * Returns the raw JSON value of [maximumAmount].
             *
             * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun _maximumAmount(): JsonField<String> = maximumAmount

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
                 * Returns a mutable builder for constructing an instance of [Maximum].
                 *
                 * The following fields are required:
                 * ```java
                 * .appliesToPriceIds()
                 * .filters()
                 * .maximumAmount()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Maximum]. */
            class Builder internal constructor() {

                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var filters: JsonField<MutableList<Filter>>? = null
                private var maximumAmount: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(maximum: Maximum) = apply {
                    appliesToPriceIds = maximum.appliesToPriceIds.map { it.toMutableList() }
                    filters = maximum.filters.map { it.toMutableList() }
                    maximumAmount = maximum.maximumAmount
                    additionalProperties = maximum.additionalProperties.toMutableMap()
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                @Deprecated("deprecated")
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The filters that determine which prices to apply this maximum to. */
                fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filters(filters: JsonField<List<Filter>>) = apply {
                    this.filters = filters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Filter] to [filters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFilter(filter: Filter) = apply {
                    filters =
                        (filters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("filters", it).add(filter)
                        }
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /**
                 * Sets [Builder.maximumAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maximumAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
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
                 * Returns an immutable instance of [Maximum].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .appliesToPriceIds()
                 * .filters()
                 * .maximumAmount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Maximum =
                    Maximum(
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("filters", filters).map { it.toImmutable() },
                        checkRequired("maximumAmount", maximumAmount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Maximum = apply {
                if (validated) {
                    return@apply
                }

                appliesToPriceIds()
                filters().forEach { it.validate() }
                maximumAmount()
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
                (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                    (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (maximumAmount.asKnown().isPresent) 1 else 0)

            class Filter
            private constructor(
                private val field: JsonField<Field>,
                private val operator: JsonField<Operator>,
                private val values: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("field")
                    @ExcludeMissing
                    field: JsonField<Field> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<Operator> = JsonMissing.of(),
                    @JsonProperty("values")
                    @ExcludeMissing
                    values: JsonField<List<String>> = JsonMissing.of(),
                ) : this(field, operator, values, mutableMapOf())

                /**
                 * The property of the price to filter on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun field(): Field = field.getRequired("field")

                /**
                 * Should prices that match the filter be included or excluded.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun operator(): Operator = operator.getRequired("operator")

                /**
                 * The IDs or values that match this filter.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun values(): List<String> = values.getRequired("values")

                /**
                 * Returns the raw JSON value of [field].
                 *
                 * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<Operator> = operator

                /**
                 * Returns the raw JSON value of [values].
                 *
                 * Unlike [values], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("values")
                @ExcludeMissing
                fun _values(): JsonField<List<String>> = values

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
                     * Returns a mutable builder for constructing an instance of [Filter].
                     *
                     * The following fields are required:
                     * ```java
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Filter]. */
                class Builder internal constructor() {

                    private var field: JsonField<Field>? = null
                    private var operator: JsonField<Operator>? = null
                    private var values: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(filter: Filter) = apply {
                        field = filter.field
                        operator = filter.operator
                        values = filter.values.map { it.toMutableList() }
                        additionalProperties = filter.additionalProperties.toMutableMap()
                    }

                    /** The property of the price to filter on. */
                    fun field(field: Field) = field(JsonField.of(field))

                    /**
                     * Sets [Builder.field] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.field] with a well-typed [Field] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun field(field: JsonField<Field>) = apply { this.field = field }

                    /** Should prices that match the filter be included or excluded. */
                    fun operator(operator: Operator) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [Operator] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                    /** The IDs or values that match this filter. */
                    fun values(values: List<String>) = values(JsonField.of(values))

                    /**
                     * Sets [Builder.values] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.values] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun values(values: JsonField<List<String>>) = apply {
                        this.values = values.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [values].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addValue(value: String) = apply {
                        values =
                            (values ?: JsonField.of(mutableListOf())).also {
                                checkKnown("values", it).add(value)
                            }
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
                     * Returns an immutable instance of [Filter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Filter =
                        Filter(
                            checkRequired("field", field),
                            checkRequired("operator", operator),
                            checkRequired("values", values).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Filter = apply {
                    if (validated) {
                        return@apply
                    }

                    field().validate()
                    operator().validate()
                    values()
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
                    (field.asKnown().getOrNull()?.validity() ?: 0) +
                        (operator.asKnown().getOrNull()?.validity() ?: 0) +
                        (values.asKnown().getOrNull()?.size ?: 0)

                /** The property of the price to filter on. */
                class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val PRICE_ID = of("price_id")

                        @JvmField val ITEM_ID = of("item_id")

                        @JvmField val PRICE_TYPE = of("price_type")

                        @JvmField val CURRENCY = of("currency")

                        @JvmField val PRICING_UNIT_ID = of("pricing_unit_id")

                        @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                    }

                    /** An enum containing [Field]'s known values. */
                    enum class Known {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                    }

                    /**
                     * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Field] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                        /**
                         * An enum member indicating that [Field] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PRICE_ID -> Value.PRICE_ID
                            ITEM_ID -> Value.ITEM_ID
                            PRICE_TYPE -> Value.PRICE_TYPE
                            CURRENCY -> Value.CURRENCY
                            PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PRICE_ID -> Known.PRICE_ID
                            ITEM_ID -> Known.ITEM_ID
                            PRICE_TYPE -> Known.PRICE_TYPE
                            CURRENCY -> Known.CURRENCY
                            PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                            else -> throw OrbInvalidDataException("Unknown Field: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            OrbInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Field = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Should prices that match the filter be included or excluded. */
                class Operator
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val INCLUDES = of("includes")

                        @JvmField val EXCLUDES = of("excludes")

                        @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                    }

                    /** An enum containing [Operator]'s known values. */
                    enum class Known {
                        INCLUDES,
                        EXCLUDES,
                    }

                    /**
                     * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Operator] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INCLUDES,
                        EXCLUDES,
                        /**
                         * An enum member indicating that [Operator] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INCLUDES -> Value.INCLUDES
                            EXCLUDES -> Value.EXCLUDES
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INCLUDES -> Known.INCLUDES
                            EXCLUDES -> Known.EXCLUDES
                            else -> throw OrbInvalidDataException("Unknown Operator: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            OrbInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Operator = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Maximum && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && maximumAmount == other.maximumAmount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, filters, maximumAmount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Maximum{appliesToPriceIds=$appliesToPriceIds, filters=$filters, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"
        }

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        class Minimum
        private constructor(
            private val appliesToPriceIds: JsonField<List<String>>,
            private val filters: JsonField<List<Filter>>,
            private val minimumAmount: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<List<Filter>> = JsonMissing.of(),
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                minimumAmount: JsonField<String> = JsonMissing.of(),
            ) : this(appliesToPriceIds, filters, minimumAmount, mutableMapOf())

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            @Deprecated("deprecated")
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * The filters that determine which prices to apply this minimum to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun filters(): List<Filter> = filters.getRequired("filters")

            /**
             * Minimum amount applied
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @Deprecated("deprecated")
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters")
            @ExcludeMissing
            fun _filters(): JsonField<List<Filter>> = filters

            /**
             * Returns the raw JSON value of [minimumAmount].
             *
             * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun _minimumAmount(): JsonField<String> = minimumAmount

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
                 * Returns a mutable builder for constructing an instance of [Minimum].
                 *
                 * The following fields are required:
                 * ```java
                 * .appliesToPriceIds()
                 * .filters()
                 * .minimumAmount()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Minimum]. */
            class Builder internal constructor() {

                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var filters: JsonField<MutableList<Filter>>? = null
                private var minimumAmount: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(minimum: Minimum) = apply {
                    appliesToPriceIds = minimum.appliesToPriceIds.map { it.toMutableList() }
                    filters = minimum.filters.map { it.toMutableList() }
                    minimumAmount = minimum.minimumAmount
                    additionalProperties = minimum.additionalProperties.toMutableMap()
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                @Deprecated("deprecated")
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                @Deprecated("deprecated")
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The filters that determine which prices to apply this minimum to. */
                fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filters(filters: JsonField<List<Filter>>) = apply {
                    this.filters = filters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Filter] to [filters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFilter(filter: Filter) = apply {
                    filters =
                        (filters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("filters", it).add(filter)
                        }
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /**
                 * Sets [Builder.minimumAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.minimumAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
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
                 * Returns an immutable instance of [Minimum].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .appliesToPriceIds()
                 * .filters()
                 * .minimumAmount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Minimum =
                    Minimum(
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("filters", filters).map { it.toImmutable() },
                        checkRequired("minimumAmount", minimumAmount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Minimum = apply {
                if (validated) {
                    return@apply
                }

                appliesToPriceIds()
                filters().forEach { it.validate() }
                minimumAmount()
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
                (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                    (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (minimumAmount.asKnown().isPresent) 1 else 0)

            class Filter
            private constructor(
                private val field: JsonField<Field>,
                private val operator: JsonField<Operator>,
                private val values: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("field")
                    @ExcludeMissing
                    field: JsonField<Field> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<Operator> = JsonMissing.of(),
                    @JsonProperty("values")
                    @ExcludeMissing
                    values: JsonField<List<String>> = JsonMissing.of(),
                ) : this(field, operator, values, mutableMapOf())

                /**
                 * The property of the price to filter on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun field(): Field = field.getRequired("field")

                /**
                 * Should prices that match the filter be included or excluded.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun operator(): Operator = operator.getRequired("operator")

                /**
                 * The IDs or values that match this filter.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun values(): List<String> = values.getRequired("values")

                /**
                 * Returns the raw JSON value of [field].
                 *
                 * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<Operator> = operator

                /**
                 * Returns the raw JSON value of [values].
                 *
                 * Unlike [values], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("values")
                @ExcludeMissing
                fun _values(): JsonField<List<String>> = values

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
                     * Returns a mutable builder for constructing an instance of [Filter].
                     *
                     * The following fields are required:
                     * ```java
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Filter]. */
                class Builder internal constructor() {

                    private var field: JsonField<Field>? = null
                    private var operator: JsonField<Operator>? = null
                    private var values: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(filter: Filter) = apply {
                        field = filter.field
                        operator = filter.operator
                        values = filter.values.map { it.toMutableList() }
                        additionalProperties = filter.additionalProperties.toMutableMap()
                    }

                    /** The property of the price to filter on. */
                    fun field(field: Field) = field(JsonField.of(field))

                    /**
                     * Sets [Builder.field] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.field] with a well-typed [Field] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun field(field: JsonField<Field>) = apply { this.field = field }

                    /** Should prices that match the filter be included or excluded. */
                    fun operator(operator: Operator) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [Operator] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                    /** The IDs or values that match this filter. */
                    fun values(values: List<String>) = values(JsonField.of(values))

                    /**
                     * Sets [Builder.values] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.values] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun values(values: JsonField<List<String>>) = apply {
                        this.values = values.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [values].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addValue(value: String) = apply {
                        values =
                            (values ?: JsonField.of(mutableListOf())).also {
                                checkKnown("values", it).add(value)
                            }
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
                     * Returns an immutable instance of [Filter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Filter =
                        Filter(
                            checkRequired("field", field),
                            checkRequired("operator", operator),
                            checkRequired("values", values).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Filter = apply {
                    if (validated) {
                        return@apply
                    }

                    field().validate()
                    operator().validate()
                    values()
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
                    (field.asKnown().getOrNull()?.validity() ?: 0) +
                        (operator.asKnown().getOrNull()?.validity() ?: 0) +
                        (values.asKnown().getOrNull()?.size ?: 0)

                /** The property of the price to filter on. */
                class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val PRICE_ID = of("price_id")

                        @JvmField val ITEM_ID = of("item_id")

                        @JvmField val PRICE_TYPE = of("price_type")

                        @JvmField val CURRENCY = of("currency")

                        @JvmField val PRICING_UNIT_ID = of("pricing_unit_id")

                        @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                    }

                    /** An enum containing [Field]'s known values. */
                    enum class Known {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                    }

                    /**
                     * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Field] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                        /**
                         * An enum member indicating that [Field] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PRICE_ID -> Value.PRICE_ID
                            ITEM_ID -> Value.ITEM_ID
                            PRICE_TYPE -> Value.PRICE_TYPE
                            CURRENCY -> Value.CURRENCY
                            PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PRICE_ID -> Known.PRICE_ID
                            ITEM_ID -> Known.ITEM_ID
                            PRICE_TYPE -> Known.PRICE_TYPE
                            CURRENCY -> Known.CURRENCY
                            PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                            else -> throw OrbInvalidDataException("Unknown Field: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            OrbInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Field = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Should prices that match the filter be included or excluded. */
                class Operator
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val INCLUDES = of("includes")

                        @JvmField val EXCLUDES = of("excludes")

                        @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                    }

                    /** An enum containing [Operator]'s known values. */
                    enum class Known {
                        INCLUDES,
                        EXCLUDES,
                    }

                    /**
                     * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Operator] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INCLUDES,
                        EXCLUDES,
                        /**
                         * An enum member indicating that [Operator] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INCLUDES -> Value.INCLUDES
                            EXCLUDES -> Value.EXCLUDES
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INCLUDES -> Known.INCLUDES
                            EXCLUDES -> Known.EXCLUDES
                            else -> throw OrbInvalidDataException("Unknown Operator: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            OrbInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Operator = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Minimum && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && minimumAmount == other.minimumAmount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, filters, minimumAmount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Minimum{appliesToPriceIds=$appliesToPriceIds, filters=$filters, minimumAmount=$minimumAmount, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(using = SubLineItem.Deserializer::class)
        @JsonSerialize(using = SubLineItem.Serializer::class)
        class SubLineItem
        private constructor(
            private val matrix: Matrix? = null,
            private val tier: Tier? = null,
            private val null_: Null? = null,
            private val _json: JsonValue? = null,
        ) {

            fun matrix(): Optional<Matrix> = Optional.ofNullable(matrix)

            fun tier(): Optional<Tier> = Optional.ofNullable(tier)

            fun null_(): Optional<Null> = Optional.ofNullable(null_)

            fun isMatrix(): Boolean = matrix != null

            fun isTier(): Boolean = tier != null

            fun isNull(): Boolean = null_ != null

            fun asMatrix(): Matrix = matrix.getOrThrow("matrix")

            fun asTier(): Tier = tier.getOrThrow("tier")

            fun asNull(): Null = null_.getOrThrow("null_")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    matrix != null -> visitor.visitMatrix(matrix)
                    tier != null -> visitor.visitTier(tier)
                    null_ != null -> visitor.visitNull(null_)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): SubLineItem = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitMatrix(matrix: Matrix) {
                            matrix.validate()
                        }

                        override fun visitTier(tier: Tier) {
                            tier.validate()
                        }

                        override fun visitNull(null_: Null) {
                            null_.validate()
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
                        override fun visitMatrix(matrix: Matrix) = matrix.validity()

                        override fun visitTier(tier: Tier) = tier.validity()

                        override fun visitNull(null_: Null) = null_.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SubLineItem && matrix == other.matrix && tier == other.tier && null_ == other.null_ /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(matrix, tier, null_) /* spotless:on */

            override fun toString(): String =
                when {
                    matrix != null -> "SubLineItem{matrix=$matrix}"
                    tier != null -> "SubLineItem{tier=$tier}"
                    null_ != null -> "SubLineItem{null_=$null_}"
                    _json != null -> "SubLineItem{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid SubLineItem")
                }

            companion object {

                @JvmStatic fun ofMatrix(matrix: Matrix) = SubLineItem(matrix = matrix)

                @JvmStatic fun ofTier(tier: Tier) = SubLineItem(tier = tier)

                @JvmStatic fun ofNull(null_: Null) = SubLineItem(null_ = null_)
            }

            /**
             * An interface that defines how to map each variant of [SubLineItem] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitMatrix(matrix: Matrix): T

                fun visitTier(tier: Tier): T

                fun visitNull(null_: Null): T

                /**
                 * Maps an unknown variant of [SubLineItem] to a value of type [T].
                 *
                 * An instance of [SubLineItem] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown SubLineItem: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<SubLineItem>(SubLineItem::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): SubLineItem {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                    when (type) {
                        "matrix" -> {
                            return tryDeserialize(node, jacksonTypeRef<Matrix>())?.let {
                                SubLineItem(matrix = it, _json = json)
                            } ?: SubLineItem(_json = json)
                        }
                        "tier" -> {
                            return tryDeserialize(node, jacksonTypeRef<Tier>())?.let {
                                SubLineItem(tier = it, _json = json)
                            } ?: SubLineItem(_json = json)
                        }
                        "'null'" -> {
                            return tryDeserialize(node, jacksonTypeRef<Null>())?.let {
                                SubLineItem(null_ = it, _json = json)
                            } ?: SubLineItem(_json = json)
                        }
                    }

                    return SubLineItem(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<SubLineItem>(SubLineItem::class) {

                override fun serialize(
                    value: SubLineItem,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.matrix != null -> generator.writeObject(value.matrix)
                        value.tier != null -> generator.writeObject(value.tier)
                        value.null_ != null -> generator.writeObject(value.null_)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid SubLineItem")
                    }
                }
            }

            class Matrix
            private constructor(
                private val amount: JsonField<String>,
                private val grouping: JsonField<Grouping>,
                private val matrixConfig: JsonField<MatrixConfig>,
                private val name: JsonField<String>,
                private val quantity: JsonField<Double>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("grouping")
                    @ExcludeMissing
                    grouping: JsonField<Grouping> = JsonMissing.of(),
                    @JsonProperty("matrix_config")
                    @ExcludeMissing
                    matrixConfig: JsonField<MatrixConfig> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(amount, grouping, matrixConfig, name, quantity, type, mutableMapOf())

                /**
                 * The total amount for this sub line item.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): String = amount.getRequired("amount")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun grouping(): Optional<Grouping> = grouping.getOptional("grouping")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun matrixConfig(): MatrixConfig = matrixConfig.getRequired("matrix_config")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun quantity(): Double = quantity.getRequired("quantity")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("matrix")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                /**
                 * Returns the raw JSON value of [grouping].
                 *
                 * Unlike [grouping], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("grouping")
                @ExcludeMissing
                fun _grouping(): JsonField<Grouping> = grouping

                /**
                 * Returns the raw JSON value of [matrixConfig].
                 *
                 * Unlike [matrixConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("matrix_config")
                @ExcludeMissing
                fun _matrixConfig(): JsonField<MatrixConfig> = matrixConfig

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

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
                     * Returns a mutable builder for constructing an instance of [Matrix].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .grouping()
                     * .matrixConfig()
                     * .name()
                     * .quantity()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Matrix]. */
                class Builder internal constructor() {

                    private var amount: JsonField<String>? = null
                    private var grouping: JsonField<Grouping>? = null
                    private var matrixConfig: JsonField<MatrixConfig>? = null
                    private var name: JsonField<String>? = null
                    private var quantity: JsonField<Double>? = null
                    private var type: JsonValue = JsonValue.from("matrix")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(matrix: Matrix) = apply {
                        amount = matrix.amount
                        grouping = matrix.grouping
                        matrixConfig = matrix.matrixConfig
                        name = matrix.name
                        quantity = matrix.quantity
                        type = matrix.type
                        additionalProperties = matrix.additionalProperties.toMutableMap()
                    }

                    /** The total amount for this sub line item. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                    /** Alias for calling [Builder.grouping] with `grouping.orElse(null)`. */
                    fun grouping(grouping: Optional<Grouping>) = grouping(grouping.getOrNull())

                    /**
                     * Sets [Builder.grouping] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.grouping] with a well-typed [Grouping] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                    fun matrixConfig(matrixConfig: MatrixConfig) =
                        matrixConfig(JsonField.of(matrixConfig))

                    /**
                     * Sets [Builder.matrixConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.matrixConfig] with a well-typed
                     * [MatrixConfig] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun matrixConfig(matrixConfig: JsonField<MatrixConfig>) = apply {
                        this.matrixConfig = matrixConfig
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("matrix")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [Matrix].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .grouping()
                     * .matrixConfig()
                     * .name()
                     * .quantity()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Matrix =
                        Matrix(
                            checkRequired("amount", amount),
                            checkRequired("grouping", grouping),
                            checkRequired("matrixConfig", matrixConfig),
                            checkRequired("name", name),
                            checkRequired("quantity", quantity),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Matrix = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    grouping().ifPresent { it.validate() }
                    matrixConfig().validate()
                    name()
                    quantity()
                    _type().let {
                        if (it != JsonValue.from("matrix")) {
                            throw OrbInvalidDataException("'type' is invalid, received $it")
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (grouping.asKnown().getOrNull()?.validity() ?: 0) +
                        (matrixConfig.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                        type.let { if (it == JsonValue.from("matrix")) 1 else 0 }

                class Grouping
                private constructor(
                    private val key: JsonField<String>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("key")
                        @ExcludeMissing
                        key: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(key, value, mutableMapOf())

                    /**
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun key(): String = key.getRequired("key")

                    /**
                     * No value indicates the default group
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [key].
                     *
                     * Unlike [key], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of [Grouping].
                         *
                         * The following fields are required:
                         * ```java
                         * .key()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Grouping]. */
                    class Builder internal constructor() {

                        private var key: JsonField<String>? = null
                        private var value: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(grouping: Grouping) = apply {
                            key = grouping.key
                            value = grouping.value
                            additionalProperties = grouping.additionalProperties.toMutableMap()
                        }

                        fun key(key: String) = key(JsonField.of(key))

                        /**
                         * Sets [Builder.key] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.key] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun key(key: JsonField<String>) = apply { this.key = key }

                        /** No value indicates the default group */
                        fun value(value: String?) = value(JsonField.ofNullable(value))

                        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
                        fun value(value: Optional<String>) = value(value.getOrNull())

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Grouping].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .key()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Grouping =
                            Grouping(
                                checkRequired("key", key),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Grouping = apply {
                        if (validated) {
                            return@apply
                        }

                        key()
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
                        (if (key.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Grouping && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Grouping{key=$key, value=$value, additionalProperties=$additionalProperties}"
                }

                class MatrixConfig
                private constructor(
                    private val dimensionValues: JsonField<List<String?>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("dimension_values")
                        @ExcludeMissing
                        dimensionValues: JsonField<List<String?>> = JsonMissing.of()
                    ) : this(dimensionValues, mutableMapOf())

                    /**
                     * The ordered dimension values for this line item.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun dimensionValues(): List<String?> =
                        dimensionValues.getRequired("dimension_values")

                    /**
                     * Returns the raw JSON value of [dimensionValues].
                     *
                     * Unlike [dimensionValues], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("dimension_values")
                    @ExcludeMissing
                    fun _dimensionValues(): JsonField<List<String?>> = dimensionValues

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
                         * Returns a mutable builder for constructing an instance of [MatrixConfig].
                         *
                         * The following fields are required:
                         * ```java
                         * .dimensionValues()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [MatrixConfig]. */
                    class Builder internal constructor() {

                        private var dimensionValues: JsonField<MutableList<String?>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(matrixConfig: MatrixConfig) = apply {
                            dimensionValues =
                                matrixConfig.dimensionValues.map { it.toMutableList() }
                            additionalProperties = matrixConfig.additionalProperties.toMutableMap()
                        }

                        /** The ordered dimension values for this line item. */
                        fun dimensionValues(dimensionValues: List<String?>) =
                            dimensionValues(JsonField.of(dimensionValues))

                        /**
                         * Sets [Builder.dimensionValues] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.dimensionValues] with a well-typed
                         * `List<String?>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                            this.dimensionValues = dimensionValues.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [dimensionValues].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addDimensionValue(dimensionValue: String) = apply {
                            dimensionValues =
                                (dimensionValues ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("dimensionValues", it).add(dimensionValue)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [MatrixConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .dimensionValues()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): MatrixConfig =
                            MatrixConfig(
                                checkRequired("dimensionValues", dimensionValues).map {
                                    it.toImmutable()
                                },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): MatrixConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        dimensionValues()
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
                        (dimensionValues.asKnown().getOrNull()?.sumOf {
                            (if (it == null) 0 else 1).toInt()
                        } ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is MatrixConfig && dimensionValues == other.dimensionValues && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(dimensionValues, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "MatrixConfig{dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Matrix && amount == other.amount && grouping == other.grouping && matrixConfig == other.matrixConfig && name == other.name && quantity == other.quantity && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, grouping, matrixConfig, name, quantity, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Matrix{amount=$amount, grouping=$grouping, matrixConfig=$matrixConfig, name=$name, quantity=$quantity, type=$type, additionalProperties=$additionalProperties}"
            }

            class Tier
            private constructor(
                private val amount: JsonField<String>,
                private val grouping: JsonField<Grouping>,
                private val name: JsonField<String>,
                private val quantity: JsonField<Double>,
                private val tierConfig: JsonField<TierConfig>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("grouping")
                    @ExcludeMissing
                    grouping: JsonField<Grouping> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("tier_config")
                    @ExcludeMissing
                    tierConfig: JsonField<TierConfig> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(amount, grouping, name, quantity, tierConfig, type, mutableMapOf())

                /**
                 * The total amount for this sub line item.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): String = amount.getRequired("amount")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun grouping(): Optional<Grouping> = grouping.getOptional("grouping")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun quantity(): Double = quantity.getRequired("quantity")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun tierConfig(): TierConfig = tierConfig.getRequired("tier_config")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("tier")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                /**
                 * Returns the raw JSON value of [grouping].
                 *
                 * Unlike [grouping], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("grouping")
                @ExcludeMissing
                fun _grouping(): JsonField<Grouping> = grouping

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [tierConfig].
                 *
                 * Unlike [tierConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tier_config")
                @ExcludeMissing
                fun _tierConfig(): JsonField<TierConfig> = tierConfig

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
                     * Returns a mutable builder for constructing an instance of [Tier].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .grouping()
                     * .name()
                     * .quantity()
                     * .tierConfig()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tier]. */
                class Builder internal constructor() {

                    private var amount: JsonField<String>? = null
                    private var grouping: JsonField<Grouping>? = null
                    private var name: JsonField<String>? = null
                    private var quantity: JsonField<Double>? = null
                    private var tierConfig: JsonField<TierConfig>? = null
                    private var type: JsonValue = JsonValue.from("tier")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tier: Tier) = apply {
                        amount = tier.amount
                        grouping = tier.grouping
                        name = tier.name
                        quantity = tier.quantity
                        tierConfig = tier.tierConfig
                        type = tier.type
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    /** The total amount for this sub line item. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                    /** Alias for calling [Builder.grouping] with `grouping.orElse(null)`. */
                    fun grouping(grouping: Optional<Grouping>) = grouping(grouping.getOrNull())

                    /**
                     * Sets [Builder.grouping] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.grouping] with a well-typed [Grouping] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun tierConfig(tierConfig: TierConfig) = tierConfig(JsonField.of(tierConfig))

                    /**
                     * Sets [Builder.tierConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tierConfig] with a well-typed [TierConfig]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun tierConfig(tierConfig: JsonField<TierConfig>) = apply {
                        this.tierConfig = tierConfig
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("tier")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [Tier].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .grouping()
                     * .name()
                     * .quantity()
                     * .tierConfig()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Tier =
                        Tier(
                            checkRequired("amount", amount),
                            checkRequired("grouping", grouping),
                            checkRequired("name", name),
                            checkRequired("quantity", quantity),
                            checkRequired("tierConfig", tierConfig),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Tier = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    grouping().ifPresent { it.validate() }
                    name()
                    quantity()
                    tierConfig().validate()
                    _type().let {
                        if (it != JsonValue.from("tier")) {
                            throw OrbInvalidDataException("'type' is invalid, received $it")
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (grouping.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                        (tierConfig.asKnown().getOrNull()?.validity() ?: 0) +
                        type.let { if (it == JsonValue.from("tier")) 1 else 0 }

                class Grouping
                private constructor(
                    private val key: JsonField<String>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("key")
                        @ExcludeMissing
                        key: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(key, value, mutableMapOf())

                    /**
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun key(): String = key.getRequired("key")

                    /**
                     * No value indicates the default group
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [key].
                     *
                     * Unlike [key], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of [Grouping].
                         *
                         * The following fields are required:
                         * ```java
                         * .key()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Grouping]. */
                    class Builder internal constructor() {

                        private var key: JsonField<String>? = null
                        private var value: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(grouping: Grouping) = apply {
                            key = grouping.key
                            value = grouping.value
                            additionalProperties = grouping.additionalProperties.toMutableMap()
                        }

                        fun key(key: String) = key(JsonField.of(key))

                        /**
                         * Sets [Builder.key] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.key] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun key(key: JsonField<String>) = apply { this.key = key }

                        /** No value indicates the default group */
                        fun value(value: String?) = value(JsonField.ofNullable(value))

                        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
                        fun value(value: Optional<String>) = value(value.getOrNull())

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Grouping].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .key()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Grouping =
                            Grouping(
                                checkRequired("key", key),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Grouping = apply {
                        if (validated) {
                            return@apply
                        }

                        key()
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
                        (if (key.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Grouping && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Grouping{key=$key, value=$value, additionalProperties=$additionalProperties}"
                }

                class TierConfig
                private constructor(
                    private val firstUnit: JsonField<Double>,
                    private val lastUnit: JsonField<Double>,
                    private val unitAmount: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("first_unit")
                        @ExcludeMissing
                        firstUnit: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("last_unit")
                        @ExcludeMissing
                        lastUnit: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        unitAmount: JsonField<String> = JsonMissing.of(),
                    ) : this(firstUnit, lastUnit, unitAmount, mutableMapOf())

                    /**
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun firstUnit(): Double = firstUnit.getRequired("first_unit")

                    /**
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun lastUnit(): Optional<Double> = lastUnit.getOptional("last_unit")

                    /**
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    /**
                     * Returns the raw JSON value of [firstUnit].
                     *
                     * Unlike [firstUnit], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("first_unit")
                    @ExcludeMissing
                    fun _firstUnit(): JsonField<Double> = firstUnit

                    /**
                     * Returns the raw JSON value of [lastUnit].
                     *
                     * Unlike [lastUnit], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("last_unit")
                    @ExcludeMissing
                    fun _lastUnit(): JsonField<Double> = lastUnit

                    /**
                     * Returns the raw JSON value of [unitAmount].
                     *
                     * Unlike [unitAmount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    fun _unitAmount(): JsonField<String> = unitAmount

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
                         * Returns a mutable builder for constructing an instance of [TierConfig].
                         *
                         * The following fields are required:
                         * ```java
                         * .firstUnit()
                         * .lastUnit()
                         * .unitAmount()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [TierConfig]. */
                    class Builder internal constructor() {

                        private var firstUnit: JsonField<Double>? = null
                        private var lastUnit: JsonField<Double>? = null
                        private var unitAmount: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tierConfig: TierConfig) = apply {
                            firstUnit = tierConfig.firstUnit
                            lastUnit = tierConfig.lastUnit
                            unitAmount = tierConfig.unitAmount
                            additionalProperties = tierConfig.additionalProperties.toMutableMap()
                        }

                        fun firstUnit(firstUnit: Double) = firstUnit(JsonField.of(firstUnit))

                        /**
                         * Sets [Builder.firstUnit] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.firstUnit] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun firstUnit(firstUnit: JsonField<Double>) = apply {
                            this.firstUnit = firstUnit
                        }

                        fun lastUnit(lastUnit: Double?) = lastUnit(JsonField.ofNullable(lastUnit))

                        /**
                         * Alias for [Builder.lastUnit].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun lastUnit(lastUnit: Double) = lastUnit(lastUnit as Double?)

                        /** Alias for calling [Builder.lastUnit] with `lastUnit.orElse(null)`. */
                        fun lastUnit(lastUnit: Optional<Double>) = lastUnit(lastUnit.getOrNull())

                        /**
                         * Sets [Builder.lastUnit] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lastUnit] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lastUnit(lastUnit: JsonField<Double>) = apply {
                            this.lastUnit = lastUnit
                        }

                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        /**
                         * Sets [Builder.unitAmount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unitAmount] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [TierConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .firstUnit()
                         * .lastUnit()
                         * .unitAmount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): TierConfig =
                            TierConfig(
                                checkRequired("firstUnit", firstUnit),
                                checkRequired("lastUnit", lastUnit),
                                checkRequired("unitAmount", unitAmount),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): TierConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        firstUnit()
                        lastUnit()
                        unitAmount()
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
                        (if (firstUnit.asKnown().isPresent) 1 else 0) +
                            (if (lastUnit.asKnown().isPresent) 1 else 0) +
                            (if (unitAmount.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is TierConfig && firstUnit == other.firstUnit && lastUnit == other.lastUnit && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(firstUnit, lastUnit, unitAmount, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TierConfig{firstUnit=$firstUnit, lastUnit=$lastUnit, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && amount == other.amount && grouping == other.grouping && name == other.name && quantity == other.quantity && tierConfig == other.tierConfig && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, grouping, name, quantity, tierConfig, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{amount=$amount, grouping=$grouping, name=$name, quantity=$quantity, tierConfig=$tierConfig, type=$type, additionalProperties=$additionalProperties}"
            }

            class Null
            private constructor(
                private val amount: JsonField<String>,
                private val grouping: JsonField<Grouping>,
                private val name: JsonField<String>,
                private val quantity: JsonField<Double>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("grouping")
                    @ExcludeMissing
                    grouping: JsonField<Grouping> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(amount, grouping, name, quantity, type, mutableMapOf())

                /**
                 * The total amount for this sub line item.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): String = amount.getRequired("amount")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun grouping(): Optional<Grouping> = grouping.getOptional("grouping")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun quantity(): Double = quantity.getRequired("quantity")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("'null'")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                /**
                 * Returns the raw JSON value of [grouping].
                 *
                 * Unlike [grouping], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("grouping")
                @ExcludeMissing
                fun _grouping(): JsonField<Grouping> = grouping

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

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
                     * Returns a mutable builder for constructing an instance of [Null].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .grouping()
                     * .name()
                     * .quantity()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Null]. */
                class Builder internal constructor() {

                    private var amount: JsonField<String>? = null
                    private var grouping: JsonField<Grouping>? = null
                    private var name: JsonField<String>? = null
                    private var quantity: JsonField<Double>? = null
                    private var type: JsonValue = JsonValue.from("'null'")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(null_: Null) = apply {
                        amount = null_.amount
                        grouping = null_.grouping
                        name = null_.name
                        quantity = null_.quantity
                        type = null_.type
                        additionalProperties = null_.additionalProperties.toMutableMap()
                    }

                    /** The total amount for this sub line item. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                    /** Alias for calling [Builder.grouping] with `grouping.orElse(null)`. */
                    fun grouping(grouping: Optional<Grouping>) = grouping(grouping.getOrNull())

                    /**
                     * Sets [Builder.grouping] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.grouping] with a well-typed [Grouping] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("'null'")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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
                     * Returns an immutable instance of [Null].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .grouping()
                     * .name()
                     * .quantity()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Null =
                        Null(
                            checkRequired("amount", amount),
                            checkRequired("grouping", grouping),
                            checkRequired("name", name),
                            checkRequired("quantity", quantity),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Null = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    grouping().ifPresent { it.validate() }
                    name()
                    quantity()
                    _type().let {
                        if (it != JsonValue.from("'null'")) {
                            throw OrbInvalidDataException("'type' is invalid, received $it")
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (grouping.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                        type.let { if (it == JsonValue.from("'null'")) 1 else 0 }

                class Grouping
                private constructor(
                    private val key: JsonField<String>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("key")
                        @ExcludeMissing
                        key: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(key, value, mutableMapOf())

                    /**
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun key(): String = key.getRequired("key")

                    /**
                     * No value indicates the default group
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [key].
                     *
                     * Unlike [key], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of [Grouping].
                         *
                         * The following fields are required:
                         * ```java
                         * .key()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Grouping]. */
                    class Builder internal constructor() {

                        private var key: JsonField<String>? = null
                        private var value: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(grouping: Grouping) = apply {
                            key = grouping.key
                            value = grouping.value
                            additionalProperties = grouping.additionalProperties.toMutableMap()
                        }

                        fun key(key: String) = key(JsonField.of(key))

                        /**
                         * Sets [Builder.key] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.key] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun key(key: JsonField<String>) = apply { this.key = key }

                        /** No value indicates the default group */
                        fun value(value: String?) = value(JsonField.ofNullable(value))

                        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
                        fun value(value: Optional<String>) = value(value.getOrNull())

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Grouping].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .key()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Grouping =
                            Grouping(
                                checkRequired("key", key),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Grouping = apply {
                        if (validated) {
                            return@apply
                        }

                        key()
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
                        (if (key.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Grouping && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Grouping{key=$key, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Null && amount == other.amount && grouping == other.grouping && name == other.name && quantity == other.quantity && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, grouping, name, quantity, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Null{amount=$amount, grouping=$grouping, name=$name, quantity=$quantity, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        class TaxAmount
        private constructor(
            private val amount: JsonField<String>,
            private val taxRateDescription: JsonField<String>,
            private val taxRatePercentage: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tax_rate_description")
                @ExcludeMissing
                taxRateDescription: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tax_rate_percentage")
                @ExcludeMissing
                taxRatePercentage: JsonField<String> = JsonMissing.of(),
            ) : this(amount, taxRateDescription, taxRatePercentage, mutableMapOf())

            /**
             * The amount of additional tax incurred by this tax rate.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): String = amount.getRequired("amount")

            /**
             * The human-readable description of the applied tax rate.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun taxRateDescription(): String =
                taxRateDescription.getRequired("tax_rate_description")

            /**
             * The tax rate percentage, out of 100.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun taxRatePercentage(): Optional<String> =
                taxRatePercentage.getOptional("tax_rate_percentage")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /**
             * Returns the raw JSON value of [taxRateDescription].
             *
             * Unlike [taxRateDescription], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("tax_rate_description")
            @ExcludeMissing
            fun _taxRateDescription(): JsonField<String> = taxRateDescription

            /**
             * Returns the raw JSON value of [taxRatePercentage].
             *
             * Unlike [taxRatePercentage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("tax_rate_percentage")
            @ExcludeMissing
            fun _taxRatePercentage(): JsonField<String> = taxRatePercentage

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
                 * Returns a mutable builder for constructing an instance of [TaxAmount].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .taxRateDescription()
                 * .taxRatePercentage()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TaxAmount]. */
            class Builder internal constructor() {

                private var amount: JsonField<String>? = null
                private var taxRateDescription: JsonField<String>? = null
                private var taxRatePercentage: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(taxAmount: TaxAmount) = apply {
                    amount = taxAmount.amount
                    taxRateDescription = taxAmount.taxRateDescription
                    taxRatePercentage = taxAmount.taxRatePercentage
                    additionalProperties = taxAmount.additionalProperties.toMutableMap()
                }

                /** The amount of additional tax incurred by this tax rate. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** The human-readable description of the applied tax rate. */
                fun taxRateDescription(taxRateDescription: String) =
                    taxRateDescription(JsonField.of(taxRateDescription))

                /**
                 * Sets [Builder.taxRateDescription] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxRateDescription] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taxRateDescription(taxRateDescription: JsonField<String>) = apply {
                    this.taxRateDescription = taxRateDescription
                }

                /** The tax rate percentage, out of 100. */
                fun taxRatePercentage(taxRatePercentage: String?) =
                    taxRatePercentage(JsonField.ofNullable(taxRatePercentage))

                /**
                 * Alias for calling [Builder.taxRatePercentage] with
                 * `taxRatePercentage.orElse(null)`.
                 */
                fun taxRatePercentage(taxRatePercentage: Optional<String>) =
                    taxRatePercentage(taxRatePercentage.getOrNull())

                /**
                 * Sets [Builder.taxRatePercentage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxRatePercentage] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taxRatePercentage(taxRatePercentage: JsonField<String>) = apply {
                    this.taxRatePercentage = taxRatePercentage
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
                 * Returns an immutable instance of [TaxAmount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .taxRateDescription()
                 * .taxRatePercentage()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TaxAmount =
                    TaxAmount(
                        checkRequired("amount", amount),
                        checkRequired("taxRateDescription", taxRateDescription),
                        checkRequired("taxRatePercentage", taxRatePercentage),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TaxAmount = apply {
                if (validated) {
                    return@apply
                }

                amount()
                taxRateDescription()
                taxRatePercentage()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (taxRateDescription.asKnown().isPresent) 1 else 0) +
                    (if (taxRatePercentage.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TaxAmount && amount == other.amount && taxRateDescription == other.taxRateDescription && taxRatePercentage == other.taxRatePercentage && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, taxRateDescription, taxRatePercentage, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TaxAmount{amount=$amount, taxRateDescription=$taxRateDescription, taxRatePercentage=$taxRatePercentage, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && id == other.id && adjustedSubtotal == other.adjustedSubtotal && adjustments == other.adjustments && amount == other.amount && creditsApplied == other.creditsApplied && discount == other.discount && endDate == other.endDate && filter == other.filter && grouping == other.grouping && maximum == other.maximum && maximumAmount == other.maximumAmount && minimum == other.minimum && minimumAmount == other.minimumAmount && name == other.name && partiallyInvoicedAmount == other.partiallyInvoicedAmount && price == other.price && quantity == other.quantity && startDate == other.startDate && subLineItems == other.subLineItems && subtotal == other.subtotal && taxAmounts == other.taxAmounts && usageCustomerIds == other.usageCustomerIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, adjustedSubtotal, adjustments, amount, creditsApplied, discount, endDate, filter, grouping, maximum, maximumAmount, minimum, minimumAmount, name, partiallyInvoicedAmount, price, quantity, startDate, subLineItems, subtotal, taxAmounts, usageCustomerIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{id=$id, adjustedSubtotal=$adjustedSubtotal, adjustments=$adjustments, amount=$amount, creditsApplied=$creditsApplied, discount=$discount, endDate=$endDate, filter=$filter, grouping=$grouping, maximum=$maximum, maximumAmount=$maximumAmount, minimum=$minimum, minimumAmount=$minimumAmount, name=$name, partiallyInvoicedAmount=$partiallyInvoicedAmount, price=$price, quantity=$quantity, startDate=$startDate, subLineItems=$subLineItems, subtotal=$subtotal, taxAmounts=$taxAmounts, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
    }

    class Maximum
    private constructor(
        private val appliesToPriceIds: JsonField<List<String>>,
        private val filters: JsonField<List<Filter>>,
        private val maximumAmount: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<Filter>> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            maximumAmount: JsonField<String> = JsonMissing.of(),
        ) : this(appliesToPriceIds, filters, maximumAmount, mutableMapOf())

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * The filters that determine which prices to apply this maximum to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filters(): List<Filter> = filters.getRequired("filters")

        /**
         * Maximum amount applied
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /**
         * Returns the raw JSON value of [appliesToPriceIds].
         *
         * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

        /**
         * Returns the raw JSON value of [maximumAmount].
         *
         * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

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
             * Returns a mutable builder for constructing an instance of [Maximum].
             *
             * The following fields are required:
             * ```java
             * .appliesToPriceIds()
             * .filters()
             * .maximumAmount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Maximum]. */
        class Builder internal constructor() {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var filters: JsonField<MutableList<Filter>>? = null
            private var maximumAmount: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(maximum: Maximum) = apply {
                appliesToPriceIds = maximum.appliesToPriceIds.map { it.toMutableList() }
                filters = maximum.filters.map { it.toMutableList() }
                maximumAmount = maximum.maximumAmount
                additionalProperties = maximum.additionalProperties.toMutableMap()
            }

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @Deprecated("deprecated")
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesToPriceIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated("deprecated")
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [appliesToPriceIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            @Deprecated("deprecated")
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /** The filters that determine which prices to apply this maximum to. */
            fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filters(filters: JsonField<List<Filter>>) = apply {
                this.filters = filters.map { it.toMutableList() }
            }

            /**
             * Adds a single [Filter] to [filters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFilter(filter: Filter) = apply {
                filters =
                    (filters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("filters", it).add(filter)
                    }
            }

            /** Maximum amount applied */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /**
             * Sets [Builder.maximumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
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
             * Returns an immutable instance of [Maximum].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .appliesToPriceIds()
             * .filters()
             * .maximumAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Maximum =
                Maximum(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("filters", filters).map { it.toImmutable() },
                    checkRequired("maximumAmount", maximumAmount),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Maximum = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            filters().forEach { it.validate() }
            maximumAmount()
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
            (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (maximumAmount.asKnown().isPresent) 1 else 0)

        class Filter
        private constructor(
            private val field: JsonField<Field>,
            private val operator: JsonField<Operator>,
            private val values: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("field") @ExcludeMissing field: JsonField<Field> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("values")
                @ExcludeMissing
                values: JsonField<List<String>> = JsonMissing.of(),
            ) : this(field, operator, values, mutableMapOf())

            /**
             * The property of the price to filter on.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun field(): Field = field.getRequired("field")

            /**
             * Should prices that match the filter be included or excluded.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * The IDs or values that match this filter.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun values(): List<String> = values.getRequired("values")

            /**
             * Returns the raw JSON value of [field].
             *
             * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [values].
             *
             * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
                 * Returns a mutable builder for constructing an instance of [Filter].
                 *
                 * The following fields are required:
                 * ```java
                 * .field()
                 * .operator()
                 * .values()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Filter]. */
            class Builder internal constructor() {

                private var field: JsonField<Field>? = null
                private var operator: JsonField<Operator>? = null
                private var values: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(filter: Filter) = apply {
                    field = filter.field
                    operator = filter.operator
                    values = filter.values.map { it.toMutableList() }
                    additionalProperties = filter.additionalProperties.toMutableMap()
                }

                /** The property of the price to filter on. */
                fun field(field: Field) = field(JsonField.of(field))

                /**
                 * Sets [Builder.field] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.field] with a well-typed [Field] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun field(field: JsonField<Field>) = apply { this.field = field }

                /** Should prices that match the filter be included or excluded. */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                /** The IDs or values that match this filter. */
                fun values(values: List<String>) = values(JsonField.of(values))

                /**
                 * Sets [Builder.values] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.values] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun values(values: JsonField<List<String>>) = apply {
                    this.values = values.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [values].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addValue(value: String) = apply {
                    values =
                        (values ?: JsonField.of(mutableListOf())).also {
                            checkKnown("values", it).add(value)
                        }
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
                 * Returns an immutable instance of [Filter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .field()
                 * .operator()
                 * .values()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Filter =
                    Filter(
                        checkRequired("field", field),
                        checkRequired("operator", operator),
                        checkRequired("values", values).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Filter = apply {
                if (validated) {
                    return@apply
                }

                field().validate()
                operator().validate()
                values()
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
                (field.asKnown().getOrNull()?.validity() ?: 0) +
                    (operator.asKnown().getOrNull()?.validity() ?: 0) +
                    (values.asKnown().getOrNull()?.size ?: 0)

            /** The property of the price to filter on. */
            class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val PRICE_ID = of("price_id")

                    @JvmField val ITEM_ID = of("item_id")

                    @JvmField val PRICE_TYPE = of("price_type")

                    @JvmField val CURRENCY = of("currency")

                    @JvmField val PRICING_UNIT_ID = of("pricing_unit_id")

                    @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                }

                /** An enum containing [Field]'s known values. */
                enum class Known {
                    PRICE_ID,
                    ITEM_ID,
                    PRICE_TYPE,
                    CURRENCY,
                    PRICING_UNIT_ID,
                }

                /**
                 * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Field] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PRICE_ID,
                    ITEM_ID,
                    PRICE_TYPE,
                    CURRENCY,
                    PRICING_UNIT_ID,
                    /**
                     * An enum member indicating that [Field] was instantiated with an unknown
                     * value.
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
                        PRICE_ID -> Value.PRICE_ID
                        ITEM_ID -> Value.ITEM_ID
                        PRICE_TYPE -> Value.PRICE_TYPE
                        CURRENCY -> Value.CURRENCY
                        PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
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
                        PRICE_ID -> Known.PRICE_ID
                        ITEM_ID -> Known.ITEM_ID
                        PRICE_TYPE -> Known.PRICE_TYPE
                        CURRENCY -> Known.CURRENCY
                        PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                        else -> throw OrbInvalidDataException("Unknown Field: $value")
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

                fun validate(): Field = apply {
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

                    return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Should prices that match the filter be included or excluded. */
            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val INCLUDES = of("includes")

                    @JvmField val EXCLUDES = of("excludes")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    INCLUDES,
                    EXCLUDES,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INCLUDES,
                    EXCLUDES,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
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
                        INCLUDES -> Value.INCLUDES
                        EXCLUDES -> Value.EXCLUDES
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
                        INCLUDES -> Known.INCLUDES
                        EXCLUDES -> Known.EXCLUDES
                        else -> throw OrbInvalidDataException("Unknown Operator: $value")
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

                fun validate(): Operator = apply {
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

                    return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Maximum && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && maximumAmount == other.maximumAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, filters, maximumAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Maximum{appliesToPriceIds=$appliesToPriceIds, filters=$filters, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"
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

    class Minimum
    private constructor(
        private val appliesToPriceIds: JsonField<List<String>>,
        private val filters: JsonField<List<Filter>>,
        private val minimumAmount: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<Filter>> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            minimumAmount: JsonField<String> = JsonMissing.of(),
        ) : this(appliesToPriceIds, filters, minimumAmount, mutableMapOf())

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * The filters that determine which prices to apply this minimum to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filters(): List<Filter> = filters.getRequired("filters")

        /**
         * Minimum amount applied
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /**
         * Returns the raw JSON value of [appliesToPriceIds].
         *
         * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

        /**
         * Returns the raw JSON value of [minimumAmount].
         *
         * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

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
             * Returns a mutable builder for constructing an instance of [Minimum].
             *
             * The following fields are required:
             * ```java
             * .appliesToPriceIds()
             * .filters()
             * .minimumAmount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Minimum]. */
        class Builder internal constructor() {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var filters: JsonField<MutableList<Filter>>? = null
            private var minimumAmount: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimum: Minimum) = apply {
                appliesToPriceIds = minimum.appliesToPriceIds.map { it.toMutableList() }
                filters = minimum.filters.map { it.toMutableList() }
                minimumAmount = minimum.minimumAmount
                additionalProperties = minimum.additionalProperties.toMutableMap()
            }

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @Deprecated("deprecated")
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesToPriceIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated("deprecated")
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [appliesToPriceIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            @Deprecated("deprecated")
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /** The filters that determine which prices to apply this minimum to. */
            fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filters(filters: JsonField<List<Filter>>) = apply {
                this.filters = filters.map { it.toMutableList() }
            }

            /**
             * Adds a single [Filter] to [filters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFilter(filter: Filter) = apply {
                filters =
                    (filters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("filters", it).add(filter)
                    }
            }

            /** Minimum amount applied */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /**
             * Sets [Builder.minimumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
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
             * Returns an immutable instance of [Minimum].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .appliesToPriceIds()
             * .filters()
             * .minimumAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Minimum =
                Minimum(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("filters", filters).map { it.toImmutable() },
                    checkRequired("minimumAmount", minimumAmount),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Minimum = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            filters().forEach { it.validate() }
            minimumAmount()
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
            (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (minimumAmount.asKnown().isPresent) 1 else 0)

        class Filter
        private constructor(
            private val field: JsonField<Field>,
            private val operator: JsonField<Operator>,
            private val values: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("field") @ExcludeMissing field: JsonField<Field> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("values")
                @ExcludeMissing
                values: JsonField<List<String>> = JsonMissing.of(),
            ) : this(field, operator, values, mutableMapOf())

            /**
             * The property of the price to filter on.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun field(): Field = field.getRequired("field")

            /**
             * Should prices that match the filter be included or excluded.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * The IDs or values that match this filter.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun values(): List<String> = values.getRequired("values")

            /**
             * Returns the raw JSON value of [field].
             *
             * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [values].
             *
             * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
                 * Returns a mutable builder for constructing an instance of [Filter].
                 *
                 * The following fields are required:
                 * ```java
                 * .field()
                 * .operator()
                 * .values()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Filter]. */
            class Builder internal constructor() {

                private var field: JsonField<Field>? = null
                private var operator: JsonField<Operator>? = null
                private var values: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(filter: Filter) = apply {
                    field = filter.field
                    operator = filter.operator
                    values = filter.values.map { it.toMutableList() }
                    additionalProperties = filter.additionalProperties.toMutableMap()
                }

                /** The property of the price to filter on. */
                fun field(field: Field) = field(JsonField.of(field))

                /**
                 * Sets [Builder.field] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.field] with a well-typed [Field] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun field(field: JsonField<Field>) = apply { this.field = field }

                /** Should prices that match the filter be included or excluded. */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                /** The IDs or values that match this filter. */
                fun values(values: List<String>) = values(JsonField.of(values))

                /**
                 * Sets [Builder.values] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.values] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun values(values: JsonField<List<String>>) = apply {
                    this.values = values.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [values].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addValue(value: String) = apply {
                    values =
                        (values ?: JsonField.of(mutableListOf())).also {
                            checkKnown("values", it).add(value)
                        }
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
                 * Returns an immutable instance of [Filter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .field()
                 * .operator()
                 * .values()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Filter =
                    Filter(
                        checkRequired("field", field),
                        checkRequired("operator", operator),
                        checkRequired("values", values).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Filter = apply {
                if (validated) {
                    return@apply
                }

                field().validate()
                operator().validate()
                values()
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
                (field.asKnown().getOrNull()?.validity() ?: 0) +
                    (operator.asKnown().getOrNull()?.validity() ?: 0) +
                    (values.asKnown().getOrNull()?.size ?: 0)

            /** The property of the price to filter on. */
            class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val PRICE_ID = of("price_id")

                    @JvmField val ITEM_ID = of("item_id")

                    @JvmField val PRICE_TYPE = of("price_type")

                    @JvmField val CURRENCY = of("currency")

                    @JvmField val PRICING_UNIT_ID = of("pricing_unit_id")

                    @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                }

                /** An enum containing [Field]'s known values. */
                enum class Known {
                    PRICE_ID,
                    ITEM_ID,
                    PRICE_TYPE,
                    CURRENCY,
                    PRICING_UNIT_ID,
                }

                /**
                 * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Field] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PRICE_ID,
                    ITEM_ID,
                    PRICE_TYPE,
                    CURRENCY,
                    PRICING_UNIT_ID,
                    /**
                     * An enum member indicating that [Field] was instantiated with an unknown
                     * value.
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
                        PRICE_ID -> Value.PRICE_ID
                        ITEM_ID -> Value.ITEM_ID
                        PRICE_TYPE -> Value.PRICE_TYPE
                        CURRENCY -> Value.CURRENCY
                        PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
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
                        PRICE_ID -> Known.PRICE_ID
                        ITEM_ID -> Known.ITEM_ID
                        PRICE_TYPE -> Known.PRICE_TYPE
                        CURRENCY -> Known.CURRENCY
                        PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                        else -> throw OrbInvalidDataException("Unknown Field: $value")
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

                fun validate(): Field = apply {
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

                    return /* spotless:off */ other is Field && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Should prices that match the filter be included or excluded. */
            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val INCLUDES = of("includes")

                    @JvmField val EXCLUDES = of("excludes")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    INCLUDES,
                    EXCLUDES,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INCLUDES,
                    EXCLUDES,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
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
                        INCLUDES -> Value.INCLUDES
                        EXCLUDES -> Value.EXCLUDES
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
                        INCLUDES -> Known.INCLUDES
                        EXCLUDES -> Known.EXCLUDES
                        else -> throw OrbInvalidDataException("Unknown Operator: $value")
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

                fun validate(): Operator = apply {
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

                    return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Filter && field == other.field && operator == other.operator && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(field, operator, values, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Minimum && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && minimumAmount == other.minimumAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, filters, minimumAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Minimum{appliesToPriceIds=$appliesToPriceIds, filters=$filters, minimumAmount=$minimumAmount, additionalProperties=$additionalProperties}"
    }

    class PaymentAttempt
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val paymentProvider: JsonField<PaymentProvider>,
        private val paymentProviderId: JsonField<String>,
        private val succeeded: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("payment_provider")
            @ExcludeMissing
            paymentProvider: JsonField<PaymentProvider> = JsonMissing.of(),
            @JsonProperty("payment_provider_id")
            @ExcludeMissing
            paymentProviderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("succeeded")
            @ExcludeMissing
            succeeded: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            createdAt,
            paymentProvider,
            paymentProviderId,
            succeeded,
            mutableMapOf(),
        )

        /**
         * The ID of the payment attempt.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The amount of the payment attempt.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String = amount.getRequired("amount")

        /**
         * The time at which the payment attempt was created.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The payment provider that attempted to collect the payment.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentProvider(): Optional<PaymentProvider> =
            paymentProvider.getOptional("payment_provider")

        /**
         * The ID of the payment attempt in the payment provider.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentProviderId(): Optional<String> =
            paymentProviderId.getOptional("payment_provider_id")

        /**
         * Whether the payment attempt succeeded.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun succeeded(): Boolean = succeeded.getRequired("succeeded")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns the raw JSON value of [succeeded].
         *
         * Unlike [succeeded], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("succeeded") @ExcludeMissing fun _succeeded(): JsonField<Boolean> = succeeded

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
             * Returns a mutable builder for constructing an instance of [PaymentAttempt].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .createdAt()
             * .paymentProvider()
             * .paymentProviderId()
             * .succeeded()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentAttempt]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var paymentProvider: JsonField<PaymentProvider>? = null
            private var paymentProviderId: JsonField<String>? = null
            private var succeeded: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentAttempt: PaymentAttempt) = apply {
                id = paymentAttempt.id
                amount = paymentAttempt.amount
                createdAt = paymentAttempt.createdAt
                paymentProvider = paymentAttempt.paymentProvider
                paymentProviderId = paymentAttempt.paymentProviderId
                succeeded = paymentAttempt.succeeded
                additionalProperties = paymentAttempt.additionalProperties.toMutableMap()
            }

            /** The ID of the payment attempt. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The amount of the payment attempt. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The time at which the payment attempt was created. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The payment provider that attempted to collect the payment. */
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

            /** The ID of the payment attempt in the payment provider. */
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

            /** Whether the payment attempt succeeded. */
            fun succeeded(succeeded: Boolean) = succeeded(JsonField.of(succeeded))

            /**
             * Sets [Builder.succeeded] to an arbitrary JSON value.
             *
             * You should usually call [Builder.succeeded] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun succeeded(succeeded: JsonField<Boolean>) = apply { this.succeeded = succeeded }

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
             * Returns an immutable instance of [PaymentAttempt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .createdAt()
             * .paymentProvider()
             * .paymentProviderId()
             * .succeeded()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentAttempt =
                PaymentAttempt(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("paymentProvider", paymentProvider),
                    checkRequired("paymentProviderId", paymentProviderId),
                    checkRequired("succeeded", succeeded),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PaymentAttempt = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            paymentProvider().ifPresent { it.validate() }
            paymentProviderId()
            succeeded()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (paymentProvider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (paymentProviderId.asKnown().isPresent) 1 else 0) +
                (if (succeeded.asKnown().isPresent) 1 else 0)

        /** The payment provider that attempted to collect the payment. */
        class PaymentProvider
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val STRIPE = of("stripe")

                @JvmStatic fun of(value: String) = PaymentProvider(JsonField.of(value))
            }

            /** An enum containing [PaymentProvider]'s known values. */
            enum class Known {
                STRIPE
            }

            /**
             * An enum containing [PaymentProvider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentProvider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STRIPE,
                /**
                 * An enum member indicating that [PaymentProvider] was instantiated with an unknown
                 * value.
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
                    STRIPE -> Value.STRIPE
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
                    STRIPE -> Known.STRIPE
                    else -> throw OrbInvalidDataException("Unknown PaymentProvider: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentAttempt && id == other.id && amount == other.amount && createdAt == other.createdAt && paymentProvider == other.paymentProvider && paymentProviderId == other.paymentProviderId && succeeded == other.succeeded && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, paymentProvider, paymentProviderId, succeeded, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentAttempt{id=$id, amount=$amount, createdAt=$createdAt, paymentProvider=$paymentProvider, paymentProviderId=$paymentProviderId, succeeded=$succeeded, additionalProperties=$additionalProperties}"
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

            /**
             * Returns a mutable builder for constructing an instance of [ShippingAddress].
             *
             * The following fields are required:
             * ```java
             * .city()
             * .country()
             * .line1()
             * .line2()
             * .postalCode()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ShippingAddress]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var line2: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var state: JsonField<String>? = null
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
             *
             * The following fields are required:
             * ```java
             * .city()
             * .country()
             * .line1()
             * .line2()
             * .postalCode()
             * .state()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ShippingAddress =
                ShippingAddress(
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("line2", line2),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
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

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ISSUED = of("issued")

            @JvmField val PAID = of("paid")

            @JvmField val SYNCED = of("synced")

            @JvmField val VOID = of("void")

            @JvmField val DRAFT = of("draft")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ISSUED,
            PAID,
            SYNCED,
            VOID,
            DRAFT,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ISSUED,
            PAID,
            SYNCED,
            VOID,
            DRAFT,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ISSUED -> Value.ISSUED
                PAID -> Value.PAID
                SYNCED -> Value.SYNCED
                VOID -> Value.VOID
                DRAFT -> Value.DRAFT
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
                ISSUED -> Known.ISSUED
                PAID -> Known.PAID
                SYNCED -> Known.SYNCED
                VOID -> Known.VOID
                DRAFT -> Known.DRAFT
                else -> throw OrbInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Subscription
    private constructor(
        private val id: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
        ) : this(id, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
             * Returns a mutable builder for constructing an instance of [Subscription].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Subscription]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscription: Subscription) = apply {
                id = subscription.id
                additionalProperties = subscription.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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
             * Returns an immutable instance of [Subscription].
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
            fun build(): Subscription =
                Subscription(checkRequired("id", id), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Subscription = apply {
            if (validated) {
                return@apply
            }

            id()
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
        @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Subscription && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Subscription{id=$id, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceFetchUpcomingResponse && id == other.id && amountDue == other.amountDue && autoCollection == other.autoCollection && billingAddress == other.billingAddress && createdAt == other.createdAt && creditNotes == other.creditNotes && currency == other.currency && customer == other.customer && customerBalanceTransactions == other.customerBalanceTransactions && customerTaxId == other.customerTaxId && discount == other.discount && discounts == other.discounts && dueDate == other.dueDate && eligibleToIssueAt == other.eligibleToIssueAt && hostedInvoiceUrl == other.hostedInvoiceUrl && invoiceNumber == other.invoiceNumber && invoicePdf == other.invoicePdf && invoiceSource == other.invoiceSource && issueFailedAt == other.issueFailedAt && issuedAt == other.issuedAt && lineItems == other.lineItems && maximum == other.maximum && maximumAmount == other.maximumAmount && memo == other.memo && metadata == other.metadata && minimum == other.minimum && minimumAmount == other.minimumAmount && paidAt == other.paidAt && paymentAttempts == other.paymentAttempts && paymentFailedAt == other.paymentFailedAt && paymentStartedAt == other.paymentStartedAt && scheduledIssueAt == other.scheduledIssueAt && shippingAddress == other.shippingAddress && status == other.status && subscription == other.subscription && subtotal == other.subtotal && syncFailedAt == other.syncFailedAt && targetDate == other.targetDate && total == other.total && voidedAt == other.voidedAt && willAutoIssue == other.willAutoIssue && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amountDue, autoCollection, billingAddress, createdAt, creditNotes, currency, customer, customerBalanceTransactions, customerTaxId, discount, discounts, dueDate, eligibleToIssueAt, hostedInvoiceUrl, invoiceNumber, invoicePdf, invoiceSource, issueFailedAt, issuedAt, lineItems, maximum, maximumAmount, memo, metadata, minimum, minimumAmount, paidAt, paymentAttempts, paymentFailedAt, paymentStartedAt, scheduledIssueAt, shippingAddress, status, subscription, subtotal, syncFailedAt, targetDate, total, voidedAt, willAutoIssue, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceFetchUpcomingResponse{id=$id, amountDue=$amountDue, autoCollection=$autoCollection, billingAddress=$billingAddress, createdAt=$createdAt, creditNotes=$creditNotes, currency=$currency, customer=$customer, customerBalanceTransactions=$customerBalanceTransactions, customerTaxId=$customerTaxId, discount=$discount, discounts=$discounts, dueDate=$dueDate, eligibleToIssueAt=$eligibleToIssueAt, hostedInvoiceUrl=$hostedInvoiceUrl, invoiceNumber=$invoiceNumber, invoicePdf=$invoicePdf, invoiceSource=$invoiceSource, issueFailedAt=$issueFailedAt, issuedAt=$issuedAt, lineItems=$lineItems, maximum=$maximum, maximumAmount=$maximumAmount, memo=$memo, metadata=$metadata, minimum=$minimum, minimumAmount=$minimumAmount, paidAt=$paidAt, paymentAttempts=$paymentAttempts, paymentFailedAt=$paymentFailedAt, paymentStartedAt=$paymentStartedAt, scheduledIssueAt=$scheduledIssueAt, shippingAddress=$shippingAddress, status=$status, subscription=$subscription, subtotal=$subtotal, syncFailedAt=$syncFailedAt, targetDate=$targetDate, total=$total, voidedAt=$voidedAt, willAutoIssue=$willAutoIssue, additionalProperties=$additionalProperties}"
}
