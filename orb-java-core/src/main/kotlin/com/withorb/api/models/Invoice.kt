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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the request
 * for payment for a single subscription. This includes a set of line items, which correspond to
 * prices in the subscription's plan and can represent fixed recurring fees or usage-based fees.
 * They are generated at the end of a billing period, or as the result of an action, such as a
 * cancellation.
 */
@NoAutoDetect
class Invoice
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount_due")
    @ExcludeMissing
    private val amountDue: JsonField<String> = JsonMissing.of(),
    @JsonProperty("auto_collection")
    @ExcludeMissing
    private val autoCollection: JsonField<AutoCollection> = JsonMissing.of(),
    @JsonProperty("billing_address")
    @ExcludeMissing
    private val billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("credit_notes")
    @ExcludeMissing
    private val creditNotes: JsonField<List<CreditNote>> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<Customer> = JsonMissing.of(),
    @JsonProperty("customer_balance_transactions")
    @ExcludeMissing
    private val customerBalanceTransactions: JsonField<List<CustomerBalanceTransaction>> =
        JsonMissing.of(),
    @JsonProperty("customer_tax_id")
    @ExcludeMissing
    private val customerTaxId: JsonField<CustomerTaxId> = JsonMissing.of(),
    @JsonProperty("discount") @ExcludeMissing private val discount: JsonValue = JsonMissing.of(),
    @JsonProperty("discounts")
    @ExcludeMissing
    private val discounts: JsonField<List<InvoiceLevelDiscount>> = JsonMissing.of(),
    @JsonProperty("due_date")
    @ExcludeMissing
    private val dueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("eligible_to_issue_at")
    @ExcludeMissing
    private val eligibleToIssueAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("hosted_invoice_url")
    @ExcludeMissing
    private val hostedInvoiceUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice_date")
    @ExcludeMissing
    private val invoiceDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("invoice_number")
    @ExcludeMissing
    private val invoiceNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice_pdf")
    @ExcludeMissing
    private val invoicePdf: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice_source")
    @ExcludeMissing
    private val invoiceSource: JsonField<InvoiceSource> = JsonMissing.of(),
    @JsonProperty("issue_failed_at")
    @ExcludeMissing
    private val issueFailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("issued_at")
    @ExcludeMissing
    private val issuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("line_items")
    @ExcludeMissing
    private val lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
    @JsonProperty("maximum")
    @ExcludeMissing
    private val maximum: JsonField<Maximum> = JsonMissing.of(),
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    private val maximumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("memo") @ExcludeMissing private val memo: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("minimum")
    @ExcludeMissing
    private val minimum: JsonField<Minimum> = JsonMissing.of(),
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    private val minimumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("paid_at")
    @ExcludeMissing
    private val paidAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("payment_attempts")
    @ExcludeMissing
    private val paymentAttempts: JsonField<List<PaymentAttempt>> = JsonMissing.of(),
    @JsonProperty("payment_failed_at")
    @ExcludeMissing
    private val paymentFailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("payment_started_at")
    @ExcludeMissing
    private val paymentStartedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("scheduled_issue_at")
    @ExcludeMissing
    private val scheduledIssueAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("shipping_address")
    @ExcludeMissing
    private val shippingAddress: JsonField<ShippingAddress> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("subscription")
    @ExcludeMissing
    private val subscription: JsonField<Subscription> = JsonMissing.of(),
    @JsonProperty("subtotal")
    @ExcludeMissing
    private val subtotal: JsonField<String> = JsonMissing.of(),
    @JsonProperty("sync_failed_at")
    @ExcludeMissing
    private val syncFailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("total") @ExcludeMissing private val total: JsonField<String> = JsonMissing.of(),
    @JsonProperty("voided_at")
    @ExcludeMissing
    private val voidedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("will_auto_issue")
    @ExcludeMissing
    private val willAutoIssue: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /**
     * This is the final amount required to be charged to the customer and reflects the application
     * of the customer balance to the `total` of the invoice.
     */
    fun amountDue(): String = amountDue.getRequired("amount_due")

    fun autoCollection(): AutoCollection = autoCollection.getRequired("auto_collection")

    fun billingAddress(): Optional<BillingAddress> =
        Optional.ofNullable(billingAddress.getNullable("billing_address"))

    /** The creation time of the resource in Orb. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** A list of credit notes associated with the invoice */
    fun creditNotes(): List<CreditNote> = creditNotes.getRequired("credit_notes")

    /** An ISO 4217 currency string or `credits` */
    fun currency(): String = currency.getRequired("currency")

    fun customer(): Customer = customer.getRequired("customer")

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
     * |Philippines         |`ph_tin `   |Philippines Tax Identification Number                                                                  |
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
    fun customerTaxId(): Optional<CustomerTaxId> =
        Optional.ofNullable(customerTaxId.getNullable("customer_tax_id"))

    /**
     * This field is deprecated in favor of `discounts`. If a `discounts` list is provided, the
     * first discount in the list will be returned. If the list is empty, `None` will be returned.
     */
    @Deprecated("deprecated")
    @JsonProperty("discount")
    @ExcludeMissing
    fun _discount(): JsonValue = discount

    fun discounts(): List<InvoiceLevelDiscount> = discounts.getRequired("discounts")

    /**
     * When the invoice payment is due. The due date is null if the invoice is not yet finalized.
     */
    fun dueDate(): Optional<OffsetDateTime> = Optional.ofNullable(dueDate.getNullable("due_date"))

    /**
     * If the invoice has a status of `draft`, this will be the time that the invoice will be
     * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice will
     * automatically begin issuing at this time.
     */
    fun eligibleToIssueAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(eligibleToIssueAt.getNullable("eligible_to_issue_at"))

    /**
     * A URL for the customer-facing invoice portal. This URL expires 30 days after the invoice's
     * due date, or 60 days after being re-generated through the UI.
     */
    fun hostedInvoiceUrl(): Optional<String> =
        Optional.ofNullable(hostedInvoiceUrl.getNullable("hosted_invoice_url"))

    /** The scheduled date of the invoice */
    fun invoiceDate(): OffsetDateTime = invoiceDate.getRequired("invoice_date")

    /**
     * Automatically generated invoice number to help track and reconcile invoices. Invoice numbers
     * have a prefix such as `RFOBWG`. These can be sequential per account or customer.
     */
    fun invoiceNumber(): String = invoiceNumber.getRequired("invoice_number")

    /** The link to download the PDF representation of the `Invoice`. */
    fun invoicePdf(): Optional<String> = Optional.ofNullable(invoicePdf.getNullable("invoice_pdf"))

    fun invoiceSource(): InvoiceSource = invoiceSource.getRequired("invoice_source")

    /**
     * If the invoice failed to issue, this will be the last time it failed to issue (even if it is
     * now in a different state.)
     */
    fun issueFailedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(issueFailedAt.getNullable("issue_failed_at"))

    /**
     * If the invoice has been issued, this will be the time it transitioned to `issued` (even if it
     * is now in a different state.)
     */
    fun issuedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(issuedAt.getNullable("issued_at"))

    /** The breakdown of prices in this invoice. */
    fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

    fun maximum(): Optional<Maximum> = Optional.ofNullable(maximum.getNullable("maximum"))

    fun maximumAmount(): Optional<String> =
        Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

    /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
    fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun minimum(): Optional<Minimum> = Optional.ofNullable(minimum.getNullable("minimum"))

    fun minimumAmount(): Optional<String> =
        Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

    /** If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid. */
    fun paidAt(): Optional<OffsetDateTime> = Optional.ofNullable(paidAt.getNullable("paid_at"))

    /** A list of payment attempts associated with the invoice */
    fun paymentAttempts(): List<PaymentAttempt> = paymentAttempts.getRequired("payment_attempts")

    /**
     * If payment was attempted on this invoice but failed, this will be the time of the most recent
     * attempt.
     */
    fun paymentFailedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(paymentFailedAt.getNullable("payment_failed_at"))

    /**
     * If payment was attempted on this invoice, this will be the start time of the most recent
     * attempt. This field is especially useful for delayed-notification payment mechanisms (like
     * bank transfers), where payment can take 3 days or more.
     */
    fun paymentStartedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(paymentStartedAt.getNullable("payment_started_at"))

    /**
     * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to be
     * issued.
     */
    fun scheduledIssueAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(scheduledIssueAt.getNullable("scheduled_issue_at"))

    fun shippingAddress(): Optional<ShippingAddress> =
        Optional.ofNullable(shippingAddress.getNullable("shipping_address"))

    fun status(): Status = status.getRequired("status")

    fun subscription(): Optional<Subscription> =
        Optional.ofNullable(subscription.getNullable("subscription"))

    /** The total before any discounts and minimums are applied. */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /**
     * If the invoice failed to sync, this will be the last time an external invoicing provider sync
     * was attempted. This field will always be `null` for invoices using Orb Invoicing.
     */
    fun syncFailedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(syncFailedAt.getNullable("sync_failed_at"))

    /** The total after any minimums and discounts have been applied. */
    fun total(): String = total.getRequired("total")

    /**
     * If the invoice has a status of `void`, this gives a timestamp when the invoice was voided.
     */
    fun voidedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(voidedAt.getNullable("voided_at"))

    /**
     * This is true if the invoice will be automatically issued in the future, and false otherwise.
     */
    fun willAutoIssue(): Boolean = willAutoIssue.getRequired("will_auto_issue")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * This is the final amount required to be charged to the customer and reflects the application
     * of the customer balance to the `total` of the invoice.
     */
    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue(): JsonField<String> = amountDue

    @JsonProperty("auto_collection")
    @ExcludeMissing
    fun _autoCollection(): JsonField<AutoCollection> = autoCollection

    @JsonProperty("billing_address")
    @ExcludeMissing
    fun _billingAddress(): JsonField<BillingAddress> = billingAddress

    /** The creation time of the resource in Orb. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** A list of credit notes associated with the invoice */
    @JsonProperty("credit_notes")
    @ExcludeMissing
    fun _creditNotes(): JsonField<List<CreditNote>> = creditNotes

    /** An ISO 4217 currency string or `credits` */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    @JsonProperty("customer_balance_transactions")
    @ExcludeMissing
    fun _customerBalanceTransactions(): JsonField<List<CustomerBalanceTransaction>> =
        customerBalanceTransactions

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
     * |Philippines         |`ph_tin `   |Philippines Tax Identification Number                                                                  |
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
    @JsonProperty("customer_tax_id")
    @ExcludeMissing
    fun _customerTaxId(): JsonField<CustomerTaxId> = customerTaxId

    @JsonProperty("discounts")
    @ExcludeMissing
    fun _discounts(): JsonField<List<InvoiceLevelDiscount>> = discounts

    /**
     * When the invoice payment is due. The due date is null if the invoice is not yet finalized.
     */
    @JsonProperty("due_date") @ExcludeMissing fun _dueDate(): JsonField<OffsetDateTime> = dueDate

    /**
     * If the invoice has a status of `draft`, this will be the time that the invoice will be
     * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice will
     * automatically begin issuing at this time.
     */
    @JsonProperty("eligible_to_issue_at")
    @ExcludeMissing
    fun _eligibleToIssueAt(): JsonField<OffsetDateTime> = eligibleToIssueAt

    /**
     * A URL for the customer-facing invoice portal. This URL expires 30 days after the invoice's
     * due date, or 60 days after being re-generated through the UI.
     */
    @JsonProperty("hosted_invoice_url")
    @ExcludeMissing
    fun _hostedInvoiceUrl(): JsonField<String> = hostedInvoiceUrl

    /** The scheduled date of the invoice */
    @JsonProperty("invoice_date")
    @ExcludeMissing
    fun _invoiceDate(): JsonField<OffsetDateTime> = invoiceDate

    /**
     * Automatically generated invoice number to help track and reconcile invoices. Invoice numbers
     * have a prefix such as `RFOBWG`. These can be sequential per account or customer.
     */
    @JsonProperty("invoice_number")
    @ExcludeMissing
    fun _invoiceNumber(): JsonField<String> = invoiceNumber

    /** The link to download the PDF representation of the `Invoice`. */
    @JsonProperty("invoice_pdf") @ExcludeMissing fun _invoicePdf(): JsonField<String> = invoicePdf

    @JsonProperty("invoice_source")
    @ExcludeMissing
    fun _invoiceSource(): JsonField<InvoiceSource> = invoiceSource

    /**
     * If the invoice failed to issue, this will be the last time it failed to issue (even if it is
     * now in a different state.)
     */
    @JsonProperty("issue_failed_at")
    @ExcludeMissing
    fun _issueFailedAt(): JsonField<OffsetDateTime> = issueFailedAt

    /**
     * If the invoice has been issued, this will be the time it transitioned to `issued` (even if it
     * is now in a different state.)
     */
    @JsonProperty("issued_at") @ExcludeMissing fun _issuedAt(): JsonField<OffsetDateTime> = issuedAt

    /** The breakdown of prices in this invoice. */
    @JsonProperty("line_items")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<LineItem>> = lineItems

    @JsonProperty("maximum") @ExcludeMissing fun _maximum(): JsonField<Maximum> = maximum

    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

    /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
    @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<Minimum> = minimum

    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

    /** If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid. */
    @JsonProperty("paid_at") @ExcludeMissing fun _paidAt(): JsonField<OffsetDateTime> = paidAt

    /** A list of payment attempts associated with the invoice */
    @JsonProperty("payment_attempts")
    @ExcludeMissing
    fun _paymentAttempts(): JsonField<List<PaymentAttempt>> = paymentAttempts

    /**
     * If payment was attempted on this invoice but failed, this will be the time of the most recent
     * attempt.
     */
    @JsonProperty("payment_failed_at")
    @ExcludeMissing
    fun _paymentFailedAt(): JsonField<OffsetDateTime> = paymentFailedAt

    /**
     * If payment was attempted on this invoice, this will be the start time of the most recent
     * attempt. This field is especially useful for delayed-notification payment mechanisms (like
     * bank transfers), where payment can take 3 days or more.
     */
    @JsonProperty("payment_started_at")
    @ExcludeMissing
    fun _paymentStartedAt(): JsonField<OffsetDateTime> = paymentStartedAt

    /**
     * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to be
     * issued.
     */
    @JsonProperty("scheduled_issue_at")
    @ExcludeMissing
    fun _scheduledIssueAt(): JsonField<OffsetDateTime> = scheduledIssueAt

    @JsonProperty("shipping_address")
    @ExcludeMissing
    fun _shippingAddress(): JsonField<ShippingAddress> = shippingAddress

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<Subscription> = subscription

    /** The total before any discounts and minimums are applied. */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

    /**
     * If the invoice failed to sync, this will be the last time an external invoicing provider sync
     * was attempted. This field will always be `null` for invoices using Orb Invoicing.
     */
    @JsonProperty("sync_failed_at")
    @ExcludeMissing
    fun _syncFailedAt(): JsonField<OffsetDateTime> = syncFailedAt

    /** The total after any minimums and discounts have been applied. */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

    /**
     * If the invoice has a status of `void`, this gives a timestamp when the invoice was voided.
     */
    @JsonProperty("voided_at") @ExcludeMissing fun _voidedAt(): JsonField<OffsetDateTime> = voidedAt

    /**
     * This is true if the invoice will be automatically issued in the future, and false otherwise.
     */
    @JsonProperty("will_auto_issue")
    @ExcludeMissing
    fun _willAutoIssue(): JsonField<Boolean> = willAutoIssue

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Invoice = apply {
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
        invoiceDate()
        invoiceNumber()
        invoicePdf()
        invoiceSource()
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
        status()
        subscription().ifPresent { it.validate() }
        subtotal()
        syncFailedAt()
        total()
        voidedAt()
        willAutoIssue()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Invoice]. */
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
        private var invoiceDate: JsonField<OffsetDateTime>? = null
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
        private var total: JsonField<String>? = null
        private var voidedAt: JsonField<OffsetDateTime>? = null
        private var willAutoIssue: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invoice: Invoice) = apply {
            id = invoice.id
            amountDue = invoice.amountDue
            autoCollection = invoice.autoCollection
            billingAddress = invoice.billingAddress
            createdAt = invoice.createdAt
            creditNotes = invoice.creditNotes.map { it.toMutableList() }
            currency = invoice.currency
            customer = invoice.customer
            customerBalanceTransactions =
                invoice.customerBalanceTransactions.map { it.toMutableList() }
            customerTaxId = invoice.customerTaxId
            discount = invoice.discount
            discounts = invoice.discounts.map { it.toMutableList() }
            dueDate = invoice.dueDate
            eligibleToIssueAt = invoice.eligibleToIssueAt
            hostedInvoiceUrl = invoice.hostedInvoiceUrl
            invoiceDate = invoice.invoiceDate
            invoiceNumber = invoice.invoiceNumber
            invoicePdf = invoice.invoicePdf
            invoiceSource = invoice.invoiceSource
            issueFailedAt = invoice.issueFailedAt
            issuedAt = invoice.issuedAt
            lineItems = invoice.lineItems.map { it.toMutableList() }
            maximum = invoice.maximum
            maximumAmount = invoice.maximumAmount
            memo = invoice.memo
            metadata = invoice.metadata
            minimum = invoice.minimum
            minimumAmount = invoice.minimumAmount
            paidAt = invoice.paidAt
            paymentAttempts = invoice.paymentAttempts.map { it.toMutableList() }
            paymentFailedAt = invoice.paymentFailedAt
            paymentStartedAt = invoice.paymentStartedAt
            scheduledIssueAt = invoice.scheduledIssueAt
            shippingAddress = invoice.shippingAddress
            status = invoice.status
            subscription = invoice.subscription
            subtotal = invoice.subtotal
            syncFailedAt = invoice.syncFailedAt
            total = invoice.total
            voidedAt = invoice.voidedAt
            willAutoIssue = invoice.willAutoIssue
            additionalProperties = invoice.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * This is the final amount required to be charged to the customer and reflects the
         * application of the customer balance to the `total` of the invoice.
         */
        fun amountDue(amountDue: String) = amountDue(JsonField.of(amountDue))

        /**
         * This is the final amount required to be charged to the customer and reflects the
         * application of the customer balance to the `total` of the invoice.
         */
        fun amountDue(amountDue: JsonField<String>) = apply { this.amountDue = amountDue }

        fun autoCollection(autoCollection: AutoCollection) =
            autoCollection(JsonField.of(autoCollection))

        fun autoCollection(autoCollection: JsonField<AutoCollection>) = apply {
            this.autoCollection = autoCollection
        }

        fun billingAddress(billingAddress: BillingAddress?) =
            billingAddress(JsonField.ofNullable(billingAddress))

        fun billingAddress(billingAddress: Optional<BillingAddress>) =
            billingAddress(billingAddress.orElse(null))

        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
            this.billingAddress = billingAddress
        }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A list of credit notes associated with the invoice */
        fun creditNotes(creditNotes: List<CreditNote>) = creditNotes(JsonField.of(creditNotes))

        /** A list of credit notes associated with the invoice */
        fun creditNotes(creditNotes: JsonField<List<CreditNote>>) = apply {
            this.creditNotes = creditNotes.map { it.toMutableList() }
        }

        /** A list of credit notes associated with the invoice */
        fun addCreditNote(creditNote: CreditNote) = apply {
            creditNotes =
                (creditNotes ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(creditNote)
                }
        }

        /** An ISO 4217 currency string or `credits` */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** An ISO 4217 currency string or `credits` */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun customer(customer: Customer) = customer(JsonField.of(customer))

        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        fun customerBalanceTransactions(
            customerBalanceTransactions: List<CustomerBalanceTransaction>
        ) = customerBalanceTransactions(JsonField.of(customerBalanceTransactions))

        fun customerBalanceTransactions(
            customerBalanceTransactions: JsonField<List<CustomerBalanceTransaction>>
        ) = apply {
            this.customerBalanceTransactions =
                customerBalanceTransactions.map { it.toMutableList() }
        }

        fun addCustomerBalanceTransaction(customerBalanceTransaction: CustomerBalanceTransaction) =
            apply {
                customerBalanceTransactions =
                    (customerBalanceTransactions ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
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
         * |Philippines         |`ph_tin `   |Philippines Tax Identification Number                                                                  |
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
         * |Philippines         |`ph_tin `   |Philippines Tax Identification Number                                                                  |
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
        fun customerTaxId(customerTaxId: Optional<CustomerTaxId>) =
            customerTaxId(customerTaxId.orElse(null))

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
         * |Philippines         |`ph_tin `   |Philippines Tax Identification Number                                                                  |
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

        fun discounts(discounts: JsonField<List<InvoiceLevelDiscount>>) = apply {
            this.discounts = discounts.map { it.toMutableList() }
        }

        fun addDiscount(discount: InvoiceLevelDiscount) = apply {
            discounts =
                (discounts ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(discount)
                }
        }

        fun addDiscount(percentage: PercentageDiscount) =
            addDiscount(InvoiceLevelDiscount.ofPercentage(percentage))

        fun addDiscount(amount: AmountDiscount) = addDiscount(InvoiceLevelDiscount.ofAmount(amount))

        fun addDiscount(trial: TrialDiscount) = addDiscount(InvoiceLevelDiscount.ofTrial(trial))

        fun addTrialDiscount(appliesToPriceIds: List<String>) =
            addDiscount(
                TrialDiscount.builder()
                    .discountType(TrialDiscount.DiscountType.TRIAL)
                    .appliesToPriceIds(appliesToPriceIds)
                    .build()
            )

        /**
         * When the invoice payment is due. The due date is null if the invoice is not yet
         * finalized.
         */
        fun dueDate(dueDate: OffsetDateTime?) = dueDate(JsonField.ofNullable(dueDate))

        /**
         * When the invoice payment is due. The due date is null if the invoice is not yet
         * finalized.
         */
        fun dueDate(dueDate: Optional<OffsetDateTime>) = dueDate(dueDate.orElse(null))

        /**
         * When the invoice payment is due. The due date is null if the invoice is not yet
         * finalized.
         */
        fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

        /**
         * If the invoice has a status of `draft`, this will be the time that the invoice will be
         * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice
         * will automatically begin issuing at this time.
         */
        fun eligibleToIssueAt(eligibleToIssueAt: OffsetDateTime?) =
            eligibleToIssueAt(JsonField.ofNullable(eligibleToIssueAt))

        /**
         * If the invoice has a status of `draft`, this will be the time that the invoice will be
         * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice
         * will automatically begin issuing at this time.
         */
        fun eligibleToIssueAt(eligibleToIssueAt: Optional<OffsetDateTime>) =
            eligibleToIssueAt(eligibleToIssueAt.orElse(null))

        /**
         * If the invoice has a status of `draft`, this will be the time that the invoice will be
         * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice
         * will automatically begin issuing at this time.
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

        /**
         * A URL for the customer-facing invoice portal. This URL expires 30 days after the
         * invoice's due date, or 60 days after being re-generated through the UI.
         */
        fun hostedInvoiceUrl(hostedInvoiceUrl: Optional<String>) =
            hostedInvoiceUrl(hostedInvoiceUrl.orElse(null))

        /**
         * A URL for the customer-facing invoice portal. This URL expires 30 days after the
         * invoice's due date, or 60 days after being re-generated through the UI.
         */
        fun hostedInvoiceUrl(hostedInvoiceUrl: JsonField<String>) = apply {
            this.hostedInvoiceUrl = hostedInvoiceUrl
        }

        /** The scheduled date of the invoice */
        fun invoiceDate(invoiceDate: OffsetDateTime) = invoiceDate(JsonField.of(invoiceDate))

        /** The scheduled date of the invoice */
        fun invoiceDate(invoiceDate: JsonField<OffsetDateTime>) = apply {
            this.invoiceDate = invoiceDate
        }

        /**
         * Automatically generated invoice number to help track and reconcile invoices. Invoice
         * numbers have a prefix such as `RFOBWG`. These can be sequential per account or customer.
         */
        fun invoiceNumber(invoiceNumber: String) = invoiceNumber(JsonField.of(invoiceNumber))

        /**
         * Automatically generated invoice number to help track and reconcile invoices. Invoice
         * numbers have a prefix such as `RFOBWG`. These can be sequential per account or customer.
         */
        fun invoiceNumber(invoiceNumber: JsonField<String>) = apply {
            this.invoiceNumber = invoiceNumber
        }

        /** The link to download the PDF representation of the `Invoice`. */
        fun invoicePdf(invoicePdf: String?) = invoicePdf(JsonField.ofNullable(invoicePdf))

        /** The link to download the PDF representation of the `Invoice`. */
        fun invoicePdf(invoicePdf: Optional<String>) = invoicePdf(invoicePdf.orElse(null))

        /** The link to download the PDF representation of the `Invoice`. */
        fun invoicePdf(invoicePdf: JsonField<String>) = apply { this.invoicePdf = invoicePdf }

        fun invoiceSource(invoiceSource: InvoiceSource) = invoiceSource(JsonField.of(invoiceSource))

        fun invoiceSource(invoiceSource: JsonField<InvoiceSource>) = apply {
            this.invoiceSource = invoiceSource
        }

        /**
         * If the invoice failed to issue, this will be the last time it failed to issue (even if it
         * is now in a different state.)
         */
        fun issueFailedAt(issueFailedAt: OffsetDateTime?) =
            issueFailedAt(JsonField.ofNullable(issueFailedAt))

        /**
         * If the invoice failed to issue, this will be the last time it failed to issue (even if it
         * is now in a different state.)
         */
        fun issueFailedAt(issueFailedAt: Optional<OffsetDateTime>) =
            issueFailedAt(issueFailedAt.orElse(null))

        /**
         * If the invoice failed to issue, this will be the last time it failed to issue (even if it
         * is now in a different state.)
         */
        fun issueFailedAt(issueFailedAt: JsonField<OffsetDateTime>) = apply {
            this.issueFailedAt = issueFailedAt
        }

        /**
         * If the invoice has been issued, this will be the time it transitioned to `issued` (even
         * if it is now in a different state.)
         */
        fun issuedAt(issuedAt: OffsetDateTime?) = issuedAt(JsonField.ofNullable(issuedAt))

        /**
         * If the invoice has been issued, this will be the time it transitioned to `issued` (even
         * if it is now in a different state.)
         */
        fun issuedAt(issuedAt: Optional<OffsetDateTime>) = issuedAt(issuedAt.orElse(null))

        /**
         * If the invoice has been issued, this will be the time it transitioned to `issued` (even
         * if it is now in a different state.)
         */
        fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { this.issuedAt = issuedAt }

        /** The breakdown of prices in this invoice. */
        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        /** The breakdown of prices in this invoice. */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        /** The breakdown of prices in this invoice. */
        fun addLineItem(lineItem: LineItem) = apply {
            lineItems =
                (lineItems ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(lineItem)
                }
        }

        fun maximum(maximum: Maximum?) = maximum(JsonField.ofNullable(maximum))

        fun maximum(maximum: Optional<Maximum>) = maximum(maximum.orElse(null))

        fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

        fun maximumAmount(maximumAmount: String?) =
            maximumAmount(JsonField.ofNullable(maximumAmount))

        fun maximumAmount(maximumAmount: Optional<String>) =
            maximumAmount(maximumAmount.orElse(null))

        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
        }

        /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
        fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

        /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
        fun memo(memo: Optional<String>) = memo(memo.orElse(null))

        /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

        fun minimum(minimum: Optional<Minimum>) = minimum(minimum.orElse(null))

        fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

        fun minimumAmount(minimumAmount: String?) =
            minimumAmount(JsonField.ofNullable(minimumAmount))

        fun minimumAmount(minimumAmount: Optional<String>) =
            minimumAmount(minimumAmount.orElse(null))

        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        /**
         * If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid.
         */
        fun paidAt(paidAt: OffsetDateTime?) = paidAt(JsonField.ofNullable(paidAt))

        /**
         * If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid.
         */
        fun paidAt(paidAt: Optional<OffsetDateTime>) = paidAt(paidAt.orElse(null))

        /**
         * If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid.
         */
        fun paidAt(paidAt: JsonField<OffsetDateTime>) = apply { this.paidAt = paidAt }

        /** A list of payment attempts associated with the invoice */
        fun paymentAttempts(paymentAttempts: List<PaymentAttempt>) =
            paymentAttempts(JsonField.of(paymentAttempts))

        /** A list of payment attempts associated with the invoice */
        fun paymentAttempts(paymentAttempts: JsonField<List<PaymentAttempt>>) = apply {
            this.paymentAttempts = paymentAttempts.map { it.toMutableList() }
        }

        /** A list of payment attempts associated with the invoice */
        fun addPaymentAttempt(paymentAttempt: PaymentAttempt) = apply {
            paymentAttempts =
                (paymentAttempts ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(paymentAttempt)
                }
        }

        /**
         * If payment was attempted on this invoice but failed, this will be the time of the most
         * recent attempt.
         */
        fun paymentFailedAt(paymentFailedAt: OffsetDateTime?) =
            paymentFailedAt(JsonField.ofNullable(paymentFailedAt))

        /**
         * If payment was attempted on this invoice but failed, this will be the time of the most
         * recent attempt.
         */
        fun paymentFailedAt(paymentFailedAt: Optional<OffsetDateTime>) =
            paymentFailedAt(paymentFailedAt.orElse(null))

        /**
         * If payment was attempted on this invoice but failed, this will be the time of the most
         * recent attempt.
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

        /**
         * If payment was attempted on this invoice, this will be the start time of the most recent
         * attempt. This field is especially useful for delayed-notification payment mechanisms
         * (like bank transfers), where payment can take 3 days or more.
         */
        fun paymentStartedAt(paymentStartedAt: Optional<OffsetDateTime>) =
            paymentStartedAt(paymentStartedAt.orElse(null))

        /**
         * If payment was attempted on this invoice, this will be the start time of the most recent
         * attempt. This field is especially useful for delayed-notification payment mechanisms
         * (like bank transfers), where payment can take 3 days or more.
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

        /**
         * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to
         * be issued.
         */
        fun scheduledIssueAt(scheduledIssueAt: Optional<OffsetDateTime>) =
            scheduledIssueAt(scheduledIssueAt.orElse(null))

        /**
         * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to
         * be issued.
         */
        fun scheduledIssueAt(scheduledIssueAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledIssueAt = scheduledIssueAt
        }

        fun shippingAddress(shippingAddress: ShippingAddress?) =
            shippingAddress(JsonField.ofNullable(shippingAddress))

        fun shippingAddress(shippingAddress: Optional<ShippingAddress>) =
            shippingAddress(shippingAddress.orElse(null))

        fun shippingAddress(shippingAddress: JsonField<ShippingAddress>) = apply {
            this.shippingAddress = shippingAddress
        }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun subscription(subscription: Subscription?) =
            subscription(JsonField.ofNullable(subscription))

        fun subscription(subscription: Optional<Subscription>) =
            subscription(subscription.orElse(null))

        fun subscription(subscription: JsonField<Subscription>) = apply {
            this.subscription = subscription
        }

        /** The total before any discounts and minimums are applied. */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /** The total before any discounts and minimums are applied. */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        /**
         * If the invoice failed to sync, this will be the last time an external invoicing provider
         * sync was attempted. This field will always be `null` for invoices using Orb Invoicing.
         */
        fun syncFailedAt(syncFailedAt: OffsetDateTime?) =
            syncFailedAt(JsonField.ofNullable(syncFailedAt))

        /**
         * If the invoice failed to sync, this will be the last time an external invoicing provider
         * sync was attempted. This field will always be `null` for invoices using Orb Invoicing.
         */
        fun syncFailedAt(syncFailedAt: Optional<OffsetDateTime>) =
            syncFailedAt(syncFailedAt.orElse(null))

        /**
         * If the invoice failed to sync, this will be the last time an external invoicing provider
         * sync was attempted. This field will always be `null` for invoices using Orb Invoicing.
         */
        fun syncFailedAt(syncFailedAt: JsonField<OffsetDateTime>) = apply {
            this.syncFailedAt = syncFailedAt
        }

        /** The total after any minimums and discounts have been applied. */
        fun total(total: String) = total(JsonField.of(total))

        /** The total after any minimums and discounts have been applied. */
        fun total(total: JsonField<String>) = apply { this.total = total }

        /**
         * If the invoice has a status of `void`, this gives a timestamp when the invoice was
         * voided.
         */
        fun voidedAt(voidedAt: OffsetDateTime?) = voidedAt(JsonField.ofNullable(voidedAt))

        /**
         * If the invoice has a status of `void`, this gives a timestamp when the invoice was
         * voided.
         */
        fun voidedAt(voidedAt: Optional<OffsetDateTime>) = voidedAt(voidedAt.orElse(null))

        /**
         * If the invoice has a status of `void`, this gives a timestamp when the invoice was
         * voided.
         */
        fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

        /**
         * This is true if the invoice will be automatically issued in the future, and false
         * otherwise.
         */
        fun willAutoIssue(willAutoIssue: Boolean) = willAutoIssue(JsonField.of(willAutoIssue))

        /**
         * This is true if the invoice will be automatically issued in the future, and false
         * otherwise.
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

        fun build(): Invoice =
            Invoice(
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
                checkRequired("invoiceDate", invoiceDate),
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
                checkRequired("total", total),
                checkRequired("voidedAt", voidedAt),
                checkRequired("willAutoIssue", willAutoIssue),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class AutoCollection
    @JsonCreator
    private constructor(
        @JsonProperty("enabled")
        @ExcludeMissing
        private val enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("next_attempt_at")
        @ExcludeMissing
        private val nextAttemptAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("num_attempts")
        @ExcludeMissing
        private val numAttempts: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("previously_attempted_at")
        @ExcludeMissing
        private val previouslyAttemptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** True only if auto-collection is enabled for this invoice. */
        fun enabled(): Optional<Boolean> = Optional.ofNullable(enabled.getNullable("enabled"))

        /**
         * If the invoice is scheduled for auto-collection, this field will reflect when the next
         * attempt will occur. If dunning has been exhausted, or auto-collection is not enabled for
         * this invoice, this field will be `null`.
         */
        fun nextAttemptAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(nextAttemptAt.getNullable("next_attempt_at"))

        /** Number of auto-collection payment attempts. */
        fun numAttempts(): Optional<Long> =
            Optional.ofNullable(numAttempts.getNullable("num_attempts"))

        /**
         * If Orb has ever attempted payment auto-collection for this invoice, this field will
         * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can be
         * used to tell whether the invoice is currently in dunning (that is,
         * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
         * dunning has been exhausted (`previously_attempted_at` is non-null, but
         * `next_attempt_time` is null).
         */
        fun previouslyAttemptedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(previouslyAttemptedAt.getNullable("previously_attempted_at"))

        /** True only if auto-collection is enabled for this invoice. */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * If the invoice is scheduled for auto-collection, this field will reflect when the next
         * attempt will occur. If dunning has been exhausted, or auto-collection is not enabled for
         * this invoice, this field will be `null`.
         */
        @JsonProperty("next_attempt_at")
        @ExcludeMissing
        fun _nextAttemptAt(): JsonField<OffsetDateTime> = nextAttemptAt

        /** Number of auto-collection payment attempts. */
        @JsonProperty("num_attempts")
        @ExcludeMissing
        fun _numAttempts(): JsonField<Long> = numAttempts

        /**
         * If Orb has ever attempted payment auto-collection for this invoice, this field will
         * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can be
         * used to tell whether the invoice is currently in dunning (that is,
         * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
         * dunning has been exhausted (`previously_attempted_at` is non-null, but
         * `next_attempt_time` is null).
         */
        @JsonProperty("previously_attempted_at")
        @ExcludeMissing
        fun _previouslyAttemptedAt(): JsonField<OffsetDateTime> = previouslyAttemptedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** True only if auto-collection is enabled for this invoice. */
            fun enabled(enabled: Boolean) = enabled(enabled as Boolean?)

            /** True only if auto-collection is enabled for this invoice. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun enabled(enabled: Optional<Boolean>) = enabled(enabled.orElse(null) as Boolean?)

            /** True only if auto-collection is enabled for this invoice. */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /**
             * If the invoice is scheduled for auto-collection, this field will reflect when the
             * next attempt will occur. If dunning has been exhausted, or auto-collection is not
             * enabled for this invoice, this field will be `null`.
             */
            fun nextAttemptAt(nextAttemptAt: OffsetDateTime?) =
                nextAttemptAt(JsonField.ofNullable(nextAttemptAt))

            /**
             * If the invoice is scheduled for auto-collection, this field will reflect when the
             * next attempt will occur. If dunning has been exhausted, or auto-collection is not
             * enabled for this invoice, this field will be `null`.
             */
            fun nextAttemptAt(nextAttemptAt: Optional<OffsetDateTime>) =
                nextAttemptAt(nextAttemptAt.orElse(null))

            /**
             * If the invoice is scheduled for auto-collection, this field will reflect when the
             * next attempt will occur. If dunning has been exhausted, or auto-collection is not
             * enabled for this invoice, this field will be `null`.
             */
            fun nextAttemptAt(nextAttemptAt: JsonField<OffsetDateTime>) = apply {
                this.nextAttemptAt = nextAttemptAt
            }

            /** Number of auto-collection payment attempts. */
            fun numAttempts(numAttempts: Long?) = numAttempts(JsonField.ofNullable(numAttempts))

            /** Number of auto-collection payment attempts. */
            fun numAttempts(numAttempts: Long) = numAttempts(numAttempts as Long?)

            /** Number of auto-collection payment attempts. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun numAttempts(numAttempts: Optional<Long>) =
                numAttempts(numAttempts.orElse(null) as Long?)

            /** Number of auto-collection payment attempts. */
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
             * If Orb has ever attempted payment auto-collection for this invoice, this field will
             * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can
             * be used to tell whether the invoice is currently in dunning (that is,
             * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
             * dunning has been exhausted (`previously_attempted_at` is non-null, but
             * `next_attempt_time` is null).
             */
            fun previouslyAttemptedAt(previouslyAttemptedAt: Optional<OffsetDateTime>) =
                previouslyAttemptedAt(previouslyAttemptedAt.orElse(null))

            /**
             * If Orb has ever attempted payment auto-collection for this invoice, this field will
             * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can
             * be used to tell whether the invoice is currently in dunning (that is,
             * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
             * dunning has been exhausted (`previously_attempted_at` is non-null, but
             * `next_attempt_time` is null).
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

            fun build(): AutoCollection =
                AutoCollection(
                    checkRequired("enabled", enabled),
                    checkRequired("nextAttemptAt", nextAttemptAt),
                    checkRequired("numAttempts", numAttempts),
                    checkRequired("previouslyAttemptedAt", previouslyAttemptedAt),
                    additionalProperties.toImmutable(),
                )
        }

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

    @NoAutoDetect
    class BillingAddress
    @JsonCreator
    private constructor(
        @JsonProperty("city")
        @ExcludeMissing
        private val city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

        fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

        fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        fun postalCode(): Optional<String> =
            Optional.ofNullable(postalCode.getNullable("postal_code"))

        fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun city(city: Optional<String>) = city(city.orElse(null))

            fun city(city: JsonField<String>) = apply { this.city = city }

            fun country(country: String?) = country(JsonField.ofNullable(country))

            fun country(country: Optional<String>) = country(country.orElse(null))

            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

            fun line1(line1: Optional<String>) = line1(line1.orElse(null))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            fun line2(line2: Optional<String>) = line2(line2.orElse(null))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

            fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.orElse(null))

            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            fun state(state: String?) = state(JsonField.ofNullable(state))

            fun state(state: Optional<String>) = state(state.orElse(null))

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

            fun build(): BillingAddress =
                BillingAddress(
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("line2", line2),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
                    additionalProperties.toImmutable(),
                )
        }

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

    @NoAutoDetect
    class CreditNote
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_note_number")
        @ExcludeMissing
        private val creditNoteNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memo")
        @ExcludeMissing
        private val memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total")
        @ExcludeMissing
        private val total: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("voided_at")
        @ExcludeMissing
        private val voidedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun creditNoteNumber(): String = creditNoteNumber.getRequired("credit_note_number")

        /** An optional memo supplied on the credit note. */
        fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

        fun reason(): String = reason.getRequired("reason")

        fun total(): String = total.getRequired("total")

        fun type(): String = type.getRequired("type")

        /**
         * If the credit note has a status of `void`, this gives a timestamp when the credit note
         * was voided.
         */
        fun voidedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(voidedAt.getNullable("voided_at"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("credit_note_number")
        @ExcludeMissing
        fun _creditNoteNumber(): JsonField<String> = creditNoteNumber

        /** An optional memo supplied on the credit note. */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * If the credit note has a status of `void`, this gives a timestamp when the credit note
         * was voided.
         */
        @JsonProperty("voided_at")
        @ExcludeMissing
        fun _voidedAt(): JsonField<OffsetDateTime> = voidedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun creditNoteNumber(creditNoteNumber: String) =
                creditNoteNumber(JsonField.of(creditNoteNumber))

            fun creditNoteNumber(creditNoteNumber: JsonField<String>) = apply {
                this.creditNoteNumber = creditNoteNumber
            }

            /** An optional memo supplied on the credit note. */
            fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

            /** An optional memo supplied on the credit note. */
            fun memo(memo: Optional<String>) = memo(memo.orElse(null))

            /** An optional memo supplied on the credit note. */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun reason(reason: String) = reason(JsonField.of(reason))

            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun total(total: String) = total(JsonField.of(total))

            fun total(total: JsonField<String>) = apply { this.total = total }

            fun type(type: String) = type(JsonField.of(type))

            fun type(type: JsonField<String>) = apply { this.type = type }

            /**
             * If the credit note has a status of `void`, this gives a timestamp when the credit
             * note was voided.
             */
            fun voidedAt(voidedAt: OffsetDateTime?) = voidedAt(JsonField.ofNullable(voidedAt))

            /**
             * If the credit note has a status of `void`, this gives a timestamp when the credit
             * note was voided.
             */
            fun voidedAt(voidedAt: Optional<OffsetDateTime>) = voidedAt(voidedAt.orElse(null))

            /**
             * If the credit note has a status of `void`, this gives a timestamp when the credit
             * note was voided.
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

            fun build(): CreditNote =
                CreditNote(
                    checkRequired("id", id),
                    checkRequired("creditNoteNumber", creditNoteNumber),
                    checkRequired("memo", memo),
                    checkRequired("reason", reason),
                    checkRequired("total", total),
                    checkRequired("type", type),
                    checkRequired("voidedAt", voidedAt),
                    additionalProperties.toImmutable(),
                )
        }

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

    @NoAutoDetect
    class Customer
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        private val externalCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun externalCustomerId(): Optional<String> =
            Optional.ofNullable(externalCustomerId.getNullable("external_customer_id"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Customer = apply {
            if (validated) {
                return@apply
            }

            id()
            externalCustomerId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            fun externalCustomerId(externalCustomerId: Optional<String>) =
                externalCustomerId(externalCustomerId.orElse(null))

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

            fun build(): Customer =
                Customer(
                    checkRequired("id", id),
                    checkRequired("externalCustomerId", externalCustomerId),
                    additionalProperties.toImmutable(),
                )
        }

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

    @NoAutoDetect
    class CustomerBalanceTransaction
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("action")
        @ExcludeMissing
        private val action: JsonField<Action> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_note")
        @ExcludeMissing
        private val creditNote: JsonField<CreditNote> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        private val endingBalance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice")
        @ExcludeMissing
        private val invoice: JsonField<InnerInvoice> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        private val startingBalance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A unique id for this transaction. */
        fun id(): String = id.getRequired("id")

        fun action(): Action = action.getRequired("action")

        /** The value of the amount changed in the transaction. */
        fun amount(): String = amount.getRequired("amount")

        /** The creation time of this transaction. */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun creditNote(): Optional<CreditNote> =
            Optional.ofNullable(creditNote.getNullable("credit_note"))

        /** An optional description provided for manual customer balance adjustments. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * The new value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        fun endingBalance(): String = endingBalance.getRequired("ending_balance")

        fun invoice(): Optional<InnerInvoice> = Optional.ofNullable(invoice.getNullable("invoice"))

        /**
         * The original value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        fun startingBalance(): String = startingBalance.getRequired("starting_balance")

        fun type(): Type = type.getRequired("type")

        /** A unique id for this transaction. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

        /** The value of the amount changed in the transaction. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /** The creation time of this transaction. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonProperty("credit_note")
        @ExcludeMissing
        fun _creditNote(): JsonField<CreditNote> = creditNote

        /** An optional description provided for manual customer balance adjustments. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * The new value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<String> = endingBalance

        @JsonProperty("invoice") @ExcludeMissing fun _invoice(): JsonField<InnerInvoice> = invoice

        /**
         * The original value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<String> = startingBalance

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomerBalanceTransaction = apply {
            if (validated) {
                return@apply
            }

            id()
            action()
            amount()
            createdAt()
            creditNote().ifPresent { it.validate() }
            description()
            endingBalance()
            invoice().ifPresent { it.validate() }
            startingBalance()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
            private var invoice: JsonField<InnerInvoice>? = null
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

            /** A unique id for this transaction. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun action(action: Action) = action(JsonField.of(action))

            fun action(action: JsonField<Action>) = apply { this.action = action }

            /** The value of the amount changed in the transaction. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /** The value of the amount changed in the transaction. */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The creation time of this transaction. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /** The creation time of this transaction. */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditNote(creditNote: CreditNote?) = creditNote(JsonField.ofNullable(creditNote))

            fun creditNote(creditNote: Optional<CreditNote>) = creditNote(creditNote.orElse(null))

            fun creditNote(creditNote: JsonField<CreditNote>) = apply {
                this.creditNote = creditNote
            }

            /** An optional description provided for manual customer balance adjustments. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** An optional description provided for manual customer balance adjustments. */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /** An optional description provided for manual customer balance adjustments. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The new value of the customer's balance prior to the transaction, in the customer's
             * currency.
             */
            fun endingBalance(endingBalance: String) = endingBalance(JsonField.of(endingBalance))

            /**
             * The new value of the customer's balance prior to the transaction, in the customer's
             * currency.
             */
            fun endingBalance(endingBalance: JsonField<String>) = apply {
                this.endingBalance = endingBalance
            }

            fun invoice(invoice: InnerInvoice?) = invoice(JsonField.ofNullable(invoice))

            fun invoice(invoice: Optional<InnerInvoice>) = invoice(invoice.orElse(null))

            fun invoice(invoice: JsonField<InnerInvoice>) = apply { this.invoice = invoice }

            /**
             * The original value of the customer's balance prior to the transaction, in the
             * customer's currency.
             */
            fun startingBalance(startingBalance: String) =
                startingBalance(JsonField.of(startingBalance))

            /**
             * The original value of the customer's balance prior to the transaction, in the
             * customer's currency.
             */
            fun startingBalance(startingBalance: JsonField<String>) = apply {
                this.startingBalance = startingBalance
            }

            fun type(type: Type) = type(JsonField.of(type))

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
                    additionalProperties.toImmutable(),
                )
        }

        class Action
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
                    else -> throw OrbInvalidDataException("Unknown Action: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Action && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class CreditNote
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The id of the Credit note */
            fun id(): String = id.getRequired("id")

            /** The id of the Credit note */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreditNote = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                /** The id of the Credit note */
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

                fun build(): CreditNote =
                    CreditNote(checkRequired("id", id), additionalProperties.toImmutable())
            }

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

        @NoAutoDetect
        class InnerInvoice
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The Invoice id */
            fun id(): String = id.getRequired("id")

            /** The Invoice id */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): InnerInvoice = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InnerInvoice]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(innerInvoice: InnerInvoice) = apply {
                    id = innerInvoice.id
                    additionalProperties = innerInvoice.additionalProperties.toMutableMap()
                }

                /** The Invoice id */
                fun id(id: String) = id(JsonField.of(id))

                /** The Invoice id */
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

                fun build(): InnerInvoice =
                    InnerInvoice(checkRequired("id", id), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InnerInvoice && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InnerInvoice{id=$id, additionalProperties=$additionalProperties}"
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            fun asString(): String = _value().asStringOrThrow()

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
     * |Philippines         |`ph_tin `   |Philippines Tax Identification Number                                                                  |
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
    @NoAutoDetect
    class CustomerTaxId
    @JsonCreator
    private constructor(
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<Country> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun country(): Country = country.getRequired("country")

        fun type(): Type = type.getRequired("type")

        fun value(): String = value.getRequired("value")

        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<Country> = country

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomerTaxId = apply {
            if (validated) {
                return@apply
            }

            country()
            type()
            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun country(country: JsonField<Country>) = apply { this.country = country }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun value(value: String) = value(JsonField.of(value))

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

            fun build(): CustomerTaxId =
                CustomerTaxId(
                    checkRequired("country", country),
                    checkRequired("type", type),
                    checkRequired("value", value),
                    additionalProperties.toImmutable(),
                )
        }

        class Country
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Country && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            fun asString(): String = _value().asStringOrThrow()

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

    class InvoiceSource
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceSource && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class LineItem
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjusted_subtotal")
        @ExcludeMissing
        private val adjustedSubtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustments")
        @ExcludeMissing
        private val adjustments: JsonField<List<Adjustment>> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credits_applied")
        @ExcludeMissing
        private val creditsApplied: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount")
        @ExcludeMissing
        private val discount: JsonField<Discount> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("grouping")
        @ExcludeMissing
        private val grouping: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maximum")
        @ExcludeMissing
        private val maximum: JsonField<Maximum> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minimum")
        @ExcludeMissing
        private val minimum: JsonField<Minimum> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("partially_invoiced_amount")
        @ExcludeMissing
        private val partiallyInvoicedAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price")
        @ExcludeMissing
        private val price: JsonField<Price> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sub_line_items")
        @ExcludeMissing
        private val subLineItems: JsonField<List<SubLineItem>> = JsonMissing.of(),
        @JsonProperty("subtotal")
        @ExcludeMissing
        private val subtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_amounts")
        @ExcludeMissing
        private val taxAmounts: JsonField<List<TaxAmount>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A unique ID for this line item. */
        fun id(): String = id.getRequired("id")

        /**
         * The line amount after any adjustments, before overage conversion, credits and partial
         * invoicing.
         */
        fun adjustedSubtotal(): String = adjustedSubtotal.getRequired("adjusted_subtotal")

        /** All adjustments applied to the line item. */
        fun adjustments(): List<Adjustment> = adjustments.getRequired("adjustments")

        /** The final amount after any discounts or minimums. */
        fun amount(): String = amount.getRequired("amount")

        /** The number of credits used */
        fun creditsApplied(): String = creditsApplied.getRequired("credits_applied")

        fun discount(): Optional<Discount> = Optional.ofNullable(discount.getNullable("discount"))

        /** The end date of the range of time applied for this line item's price. */
        fun endDate(): OffsetDateTime = endDate.getRequired("end_date")

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         */
        fun grouping(): Optional<String> = Optional.ofNullable(grouping.getNullable("grouping"))

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun maximum(): Optional<Maximum> = Optional.ofNullable(maximum.getNullable("maximum"))

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun maximumAmount(): Optional<String> =
            Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun minimum(): Optional<Minimum> = Optional.ofNullable(minimum.getNullable("minimum"))

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        fun minimumAmount(): Optional<String> =
            Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

        /** The name of the price associated with this line item. */
        fun name(): String = name.getRequired("name")

        /** Any amount applied from a partial invoice */
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
         */
        fun price(): Optional<Price> = Optional.ofNullable(price.getNullable("price"))

        fun quantity(): Double = quantity.getRequired("quantity")

        /** The start date of the range of time applied for this line item's price. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun subLineItems(): List<SubLineItem> = subLineItems.getRequired("sub_line_items")

        /** The line amount before any line item-specific discounts or minimums. */
        fun subtotal(): String = subtotal.getRequired("subtotal")

        /**
         * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
         * configured.
         */
        fun taxAmounts(): List<TaxAmount> = taxAmounts.getRequired("tax_amounts")

        /** A unique ID for this line item. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * The line amount after any adjustments, before overage conversion, credits and partial
         * invoicing.
         */
        @JsonProperty("adjusted_subtotal")
        @ExcludeMissing
        fun _adjustedSubtotal(): JsonField<String> = adjustedSubtotal

        /** All adjustments applied to the line item. */
        @JsonProperty("adjustments")
        @ExcludeMissing
        fun _adjustments(): JsonField<List<Adjustment>> = adjustments

        /** The final amount after any discounts or minimums. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /** The number of credits used */
        @JsonProperty("credits_applied")
        @ExcludeMissing
        fun _creditsApplied(): JsonField<String> = creditsApplied

        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

        /** The end date of the range of time applied for this line item's price. */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         */
        @JsonProperty("grouping") @ExcludeMissing fun _grouping(): JsonField<String> = grouping

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        @JsonProperty("maximum")
        @ExcludeMissing
        fun _maximum(): JsonField<Maximum> = maximum

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        @JsonProperty("minimum")
        @ExcludeMissing
        fun _minimum(): JsonField<Minimum> = minimum

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        /** The name of the price associated with this line item. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** Any amount applied from a partial invoice */
        @JsonProperty("partially_invoiced_amount")
        @ExcludeMissing
        fun _partiallyInvoicedAmount(): JsonField<String> = partiallyInvoicedAmount

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
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /** The start date of the range of time applied for this line item's price. */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        @JsonProperty("sub_line_items")
        @ExcludeMissing
        fun _subLineItems(): JsonField<List<SubLineItem>> = subLineItems

        /** The line amount before any line item-specific discounts or minimums. */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

        /**
         * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
         * configured.
         */
        @JsonProperty("tax_amounts")
        @ExcludeMissing
        fun _taxAmounts(): JsonField<List<TaxAmount>> = taxAmounts

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            grouping()
            maximum().ifPresent { it.validate() }
            maximumAmount()
            minimum().ifPresent { it.validate() }
            minimumAmount()
            name()
            partiallyInvoicedAmount()
            price().ifPresent { it.validate() }
            quantity()
            startDate()
            subLineItems().forEach { it.validate() }
            subtotal()
            taxAmounts().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
                additionalProperties = lineItem.additionalProperties.toMutableMap()
            }

            /** A unique ID for this line item. */
            fun id(id: String) = id(JsonField.of(id))

            /** A unique ID for this line item. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The line amount after any adjustments, before overage conversion, credits and partial
             * invoicing.
             */
            fun adjustedSubtotal(adjustedSubtotal: String) =
                adjustedSubtotal(JsonField.of(adjustedSubtotal))

            /**
             * The line amount after any adjustments, before overage conversion, credits and partial
             * invoicing.
             */
            fun adjustedSubtotal(adjustedSubtotal: JsonField<String>) = apply {
                this.adjustedSubtotal = adjustedSubtotal
            }

            /** All adjustments applied to the line item. */
            fun adjustments(adjustments: List<Adjustment>) = adjustments(JsonField.of(adjustments))

            /** All adjustments applied to the line item. */
            fun adjustments(adjustments: JsonField<List<Adjustment>>) = apply {
                this.adjustments = adjustments.map { it.toMutableList() }
            }

            /** All adjustments applied to the line item. */
            fun addAdjustment(adjustment: Adjustment) = apply {
                adjustments =
                    (adjustments ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(adjustment)
                    }
            }

            /** All adjustments applied to the line item. */
            fun addAdjustment(amountDiscount: Adjustment.AmountDiscountAdjustment) =
                addAdjustment(Adjustment.ofAmountDiscount(amountDiscount))

            /** All adjustments applied to the line item. */
            fun addAdjustment(percentageDiscount: Adjustment.PercentageDiscountAdjustment) =
                addAdjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

            /** All adjustments applied to the line item. */
            fun addAdjustment(usageDiscount: Adjustment.UsageDiscountAdjustment) =
                addAdjustment(Adjustment.ofUsageDiscount(usageDiscount))

            /** All adjustments applied to the line item. */
            fun addAdjustment(minimum: Adjustment.MinimumAdjustment) =
                addAdjustment(Adjustment.ofMinimum(minimum))

            /** All adjustments applied to the line item. */
            fun addAdjustment(maximum: Adjustment.MaximumAdjustment) =
                addAdjustment(Adjustment.ofMaximum(maximum))

            /** The final amount after any discounts or minimums. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /** The final amount after any discounts or minimums. */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The number of credits used */
            fun creditsApplied(creditsApplied: String) =
                creditsApplied(JsonField.of(creditsApplied))

            /** The number of credits used */
            fun creditsApplied(creditsApplied: JsonField<String>) = apply {
                this.creditsApplied = creditsApplied
            }

            fun discount(discount: Discount?) = discount(JsonField.ofNullable(discount))

            fun discount(discount: Optional<Discount>) = discount(discount.orElse(null))

            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            fun discount(percentage: PercentageDiscount) =
                discount(Discount.ofPercentage(percentage))

            fun discount(trial: TrialDiscount) = discount(Discount.ofTrial(trial))

            fun trialDiscount(appliesToPriceIds: List<String>) =
                discount(
                    TrialDiscount.builder()
                        .discountType(TrialDiscount.DiscountType.TRIAL)
                        .appliesToPriceIds(appliesToPriceIds)
                        .build()
                )

            fun discount(usage: Discount.UsageDiscount) = discount(Discount.ofUsage(usage))

            fun discount(amount: AmountDiscount) = discount(Discount.ofAmount(amount))

            /** The end date of the range of time applied for this line item's price. */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /** The end date of the range of time applied for this line item's price. */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * [DEPRECATED] For configured prices that are split by a grouping key, this will be
             * populated with the key and a value. The `amount` and `subtotal` will be the values
             * for this particular grouping.
             */
            fun grouping(grouping: String?) = grouping(JsonField.ofNullable(grouping))

            /**
             * [DEPRECATED] For configured prices that are split by a grouping key, this will be
             * populated with the key and a value. The `amount` and `subtotal` will be the values
             * for this particular grouping.
             */
            fun grouping(grouping: Optional<String>) = grouping(grouping.orElse(null))

            /**
             * [DEPRECATED] For configured prices that are split by a grouping key, this will be
             * populated with the key and a value. The `amount` and `subtotal` will be the values
             * for this particular grouping.
             */
            fun grouping(grouping: JsonField<String>) = apply { this.grouping = grouping }

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun maximum(maximum: Maximum?) = maximum(JsonField.ofNullable(maximum))

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun maximum(maximum: Optional<Maximum>) = maximum(maximum.orElse(null))

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: String?) =
                maximumAmount(JsonField.ofNullable(maximumAmount))

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: Optional<String>) =
                maximumAmount(maximumAmount.orElse(null))

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun minimum(minimum: Optional<Minimum>) = minimum(minimum.orElse(null))

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: String?) =
                minimumAmount(JsonField.ofNullable(minimumAmount))

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: Optional<String>) =
                minimumAmount(minimumAmount.orElse(null))

            /** This field is deprecated in favor of `adjustments`. */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** The name of the price associated with this line item. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the price associated with this line item. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Any amount applied from a partial invoice */
            fun partiallyInvoicedAmount(partiallyInvoicedAmount: String) =
                partiallyInvoicedAmount(JsonField.of(partiallyInvoicedAmount))

            /** Any amount applied from a partial invoice */
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
            fun price(price: Price?) = price(JsonField.ofNullable(price))

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
            fun price(price: Optional<Price>) = price(price.orElse(null))

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
            fun price(price: JsonField<Price>) = apply { this.price = price }

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
            fun price(unit: Price.UnitPrice) = price(Price.ofUnit(unit))

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
            fun price(packagePrice: Price.PackagePrice) = price(Price.ofPackagePrice(packagePrice))

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
            fun price(matrix: Price.MatrixPrice) = price(Price.ofMatrix(matrix))

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
            fun price(tiered: Price.TieredPrice) = price(Price.ofTiered(tiered))

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
            fun price(tieredBps: Price.TieredBpsPrice) = price(Price.ofTieredBps(tieredBps))

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
            fun price(bps: Price.BpsPrice) = price(Price.ofBps(bps))

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
            fun price(bulkBps: Price.BulkBpsPrice) = price(Price.ofBulkBps(bulkBps))

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
            fun price(bulk: Price.BulkPrice) = price(Price.ofBulk(bulk))

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
            fun price(thresholdTotalAmount: Price.ThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

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
            fun price(tieredPackage: Price.TieredPackagePrice) =
                price(Price.ofTieredPackage(tieredPackage))

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
            fun price(groupedTiered: Price.GroupedTieredPrice) =
                price(Price.ofGroupedTiered(groupedTiered))

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
            fun price(tieredWithMinimum: Price.TieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

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
            fun price(tieredPackageWithMinimum: Price.TieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

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
            fun price(packageWithAllocation: Price.PackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

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
            fun price(unitWithPercent: Price.UnitWithPercentPrice) =
                price(Price.ofUnitWithPercent(unitWithPercent))

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
            fun price(matrixWithAllocation: Price.MatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

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
            fun price(tieredWithProration: Price.TieredWithProrationPrice) =
                price(Price.ofTieredWithProration(tieredWithProration))

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
            fun price(unitWithProration: Price.UnitWithProrationPrice) =
                price(Price.ofUnitWithProration(unitWithProration))

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
            fun price(groupedAllocation: Price.GroupedAllocationPrice) =
                price(Price.ofGroupedAllocation(groupedAllocation))

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
            fun price(groupedWithProratedMinimum: Price.GroupedWithProratedMinimumPrice) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

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
            fun price(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimumPrice) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

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
            fun price(matrixWithDisplayName: Price.MatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

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
            fun price(bulkWithProration: Price.BulkWithProrationPrice) =
                price(Price.ofBulkWithProration(bulkWithProration))

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
            fun price(groupedTieredPackage: Price.GroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

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
            fun price(maxGroupTieredPackage: Price.MaxGroupTieredPackagePrice) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

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
            fun price(scalableMatrixWithUnitPricing: Price.ScalableMatrixWithUnitPricingPrice) =
                price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

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
            fun price(scalableMatrixWithTieredPricing: Price.ScalableMatrixWithTieredPricingPrice) =
                price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** The start date of the range of time applied for this line item's price. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the range of time applied for this line item's price. */
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
             * For complex pricing structures, the line item can be broken down further in
             * `sub_line_items`.
             */
            fun subLineItems(subLineItems: JsonField<List<SubLineItem>>) = apply {
                this.subLineItems = subLineItems.map { it.toMutableList() }
            }

            /**
             * For complex pricing structures, the line item can be broken down further in
             * `sub_line_items`.
             */
            fun addSubLineItem(subLineItem: SubLineItem) = apply {
                subLineItems =
                    (subLineItems ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(subLineItem)
                    }
            }

            /**
             * For complex pricing structures, the line item can be broken down further in
             * `sub_line_items`.
             */
            fun addSubLineItem(matrix: SubLineItem.MatrixSubLineItem) =
                addSubLineItem(SubLineItem.ofMatrix(matrix))

            /**
             * For complex pricing structures, the line item can be broken down further in
             * `sub_line_items`.
             */
            fun addSubLineItem(tier: SubLineItem.TierSubLineItem) =
                addSubLineItem(SubLineItem.ofTier(tier))

            /**
             * For complex pricing structures, the line item can be broken down further in
             * `sub_line_items`.
             */
            fun addSubLineItem(other: SubLineItem.OtherSubLineItem) =
                addSubLineItem(SubLineItem.ofOther(other))

            /** The line amount before any line item-specific discounts or minimums. */
            fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

            /** The line amount before any line item-specific discounts or minimums. */
            fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

            /**
             * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
             * configured.
             */
            fun taxAmounts(taxAmounts: List<TaxAmount>) = taxAmounts(JsonField.of(taxAmounts))

            /**
             * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
             * configured.
             */
            fun taxAmounts(taxAmounts: JsonField<List<TaxAmount>>) = apply {
                this.taxAmounts = taxAmounts.map { it.toMutableList() }
            }

            /**
             * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
             * configured.
             */
            fun addTaxAmount(taxAmount: TaxAmount) = apply {
                taxAmounts =
                    (taxAmounts ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(taxAmount)
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

            fun build(): LineItem =
                LineItem(
                    checkRequired("id", id),
                    checkRequired("adjustedSubtotal", adjustedSubtotal),
                    checkRequired("adjustments", adjustments).map { it.toImmutable() },
                    checkRequired("amount", amount),
                    checkRequired("creditsApplied", creditsApplied),
                    checkRequired("discount", discount),
                    checkRequired("endDate", endDate),
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
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val amountDiscount: AmountDiscountAdjustment? = null,
            private val percentageDiscount: PercentageDiscountAdjustment? = null,
            private val usageDiscount: UsageDiscountAdjustment? = null,
            private val minimum: MinimumAdjustment? = null,
            private val maximum: MaximumAdjustment? = null,
            private val _json: JsonValue? = null,
        ) {

            fun amountDiscount(): Optional<AmountDiscountAdjustment> =
                Optional.ofNullable(amountDiscount)

            fun percentageDiscount(): Optional<PercentageDiscountAdjustment> =
                Optional.ofNullable(percentageDiscount)

            fun usageDiscount(): Optional<UsageDiscountAdjustment> =
                Optional.ofNullable(usageDiscount)

            fun minimum(): Optional<MinimumAdjustment> = Optional.ofNullable(minimum)

            fun maximum(): Optional<MaximumAdjustment> = Optional.ofNullable(maximum)

            fun isAmountDiscount(): Boolean = amountDiscount != null

            fun isPercentageDiscount(): Boolean = percentageDiscount != null

            fun isUsageDiscount(): Boolean = usageDiscount != null

            fun isMinimum(): Boolean = minimum != null

            fun isMaximum(): Boolean = maximum != null

            fun asAmountDiscount(): AmountDiscountAdjustment =
                amountDiscount.getOrThrow("amountDiscount")

            fun asPercentageDiscount(): PercentageDiscountAdjustment =
                percentageDiscount.getOrThrow("percentageDiscount")

            fun asUsageDiscount(): UsageDiscountAdjustment =
                usageDiscount.getOrThrow("usageDiscount")

            fun asMinimum(): MinimumAdjustment = minimum.getOrThrow("minimum")

            fun asMaximum(): MaximumAdjustment = maximum.getOrThrow("maximum")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
                    percentageDiscount != null ->
                        visitor.visitPercentageDiscount(percentageDiscount)
                    usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                    minimum != null -> visitor.visitMinimum(minimum)
                    maximum != null -> visitor.visitMaximum(maximum)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): Adjustment = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitAmountDiscount(amountDiscount: AmountDiscountAdjustment) {
                            amountDiscount.validate()
                        }

                        override fun visitPercentageDiscount(
                            percentageDiscount: PercentageDiscountAdjustment
                        ) {
                            percentageDiscount.validate()
                        }

                        override fun visitUsageDiscount(usageDiscount: UsageDiscountAdjustment) {
                            usageDiscount.validate()
                        }

                        override fun visitMinimum(minimum: MinimumAdjustment) {
                            minimum.validate()
                        }

                        override fun visitMaximum(maximum: MaximumAdjustment) {
                            maximum.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Adjustment && amountDiscount == other.amountDiscount && percentageDiscount == other.percentageDiscount && usageDiscount == other.usageDiscount && minimum == other.minimum && maximum == other.maximum /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(amountDiscount, percentageDiscount, usageDiscount, minimum, maximum) /* spotless:on */

            override fun toString(): String =
                when {
                    amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                    percentageDiscount != null ->
                        "Adjustment{percentageDiscount=$percentageDiscount}"
                    usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                    minimum != null -> "Adjustment{minimum=$minimum}"
                    maximum != null -> "Adjustment{maximum=$maximum}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                @JvmStatic
                fun ofAmountDiscount(amountDiscount: AmountDiscountAdjustment) =
                    Adjustment(amountDiscount = amountDiscount)

                @JvmStatic
                fun ofPercentageDiscount(percentageDiscount: PercentageDiscountAdjustment) =
                    Adjustment(percentageDiscount = percentageDiscount)

                @JvmStatic
                fun ofUsageDiscount(usageDiscount: UsageDiscountAdjustment) =
                    Adjustment(usageDiscount = usageDiscount)

                @JvmStatic fun ofMinimum(minimum: MinimumAdjustment) = Adjustment(minimum = minimum)

                @JvmStatic fun ofMaximum(maximum: MaximumAdjustment) = Adjustment(maximum = maximum)
            }

            /**
             * An interface that defines how to map each variant of [Adjustment] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitAmountDiscount(amountDiscount: AmountDiscountAdjustment): T

                fun visitPercentageDiscount(percentageDiscount: PercentageDiscountAdjustment): T

                fun visitUsageDiscount(usageDiscount: UsageDiscountAdjustment): T

                fun visitMinimum(minimum: MinimumAdjustment): T

                fun visitMaximum(maximum: MaximumAdjustment): T

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
                        "amount_discount" -> {
                            tryDeserialize(node, jacksonTypeRef<AmountDiscountAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(amountDiscount = it, _json = json)
                                }
                        }
                        "percentage_discount" -> {
                            tryDeserialize(node, jacksonTypeRef<PercentageDiscountAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(percentageDiscount = it, _json = json)
                                }
                        }
                        "usage_discount" -> {
                            tryDeserialize(node, jacksonTypeRef<UsageDiscountAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(usageDiscount = it, _json = json)
                                }
                        }
                        "minimum" -> {
                            tryDeserialize(node, jacksonTypeRef<MinimumAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(minimum = it, _json = json)
                                }
                        }
                        "maximum" -> {
                            tryDeserialize(node, jacksonTypeRef<MaximumAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(maximum = it, _json = json)
                                }
                        }
                    }

                    return Adjustment(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Adjustment>(Adjustment::class) {

                override fun serialize(
                    value: Adjustment,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                        value.percentageDiscount != null ->
                            generator.writeObject(value.percentageDiscount)
                        value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value.maximum != null -> generator.writeObject(value.maximum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }

            @NoAutoDetect
            class AmountDiscountAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("amount_discount")
                @ExcludeMissing
                private val amountDiscount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount(): JsonField<String> = amountDiscount

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): AmountDiscountAdjustment = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    adjustmentType()
                    amountDiscount()
                    appliesToPriceIds()
                    isInvoiceLevel()
                    planPhaseOrder()
                    reason()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AmountDiscountAdjustment]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var amountDiscount: JsonField<String>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(amountDiscountAdjustment: AmountDiscountAdjustment) = apply {
                        id = amountDiscountAdjustment.id
                        adjustmentType = amountDiscountAdjustment.adjustmentType
                        amountDiscount = amountDiscountAdjustment.amountDiscount
                        appliesToPriceIds =
                            amountDiscountAdjustment.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = amountDiscountAdjustment.isInvoiceLevel
                        planPhaseOrder = amountDiscountAdjustment.planPhaseOrder
                        reason = amountDiscountAdjustment.reason
                        additionalProperties =
                            amountDiscountAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /**
                     * The amount by which to discount the prices this adjustment applies to in a
                     * given billing period.
                     */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /**
                     * The amount by which to discount the prices this adjustment applies to in a
                     * given billing period.
                     */
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.orElse(null) as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: Optional<String>) = reason(reason.orElse(null))

                    /** The reason for the adjustment. */
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

                    fun build(): AmountDiscountAdjustment =
                        AmountDiscountAdjustment(
                            checkRequired("id", id),
                            checkRequired("adjustmentType", adjustmentType),
                            checkRequired("amountDiscount", amountDiscount),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                        @JvmField val AMOUNT_DISCOUNT = of("amount_discount")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    /** An enum containing [AdjustmentType]'s known values. */
                    enum class Known {
                        AMOUNT_DISCOUNT,
                    }

                    /**
                     * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AdjustmentType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        AMOUNT_DISCOUNT,
                        /**
                         * An enum member indicating that [AdjustmentType] was instantiated with an
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
                            AMOUNT_DISCOUNT -> Value.AMOUNT_DISCOUNT
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
                            AMOUNT_DISCOUNT -> Known.AMOUNT_DISCOUNT
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AmountDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amountDiscount, appliesToPriceIds, isInvoiceLevel, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AmountDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PercentageDiscountAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                fun percentageDiscount(): Double =
                    percentageDiscount.getRequired("percentage_discount")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount(): JsonField<Double> = percentageDiscount

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PercentageDiscountAdjustment = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    adjustmentType()
                    appliesToPriceIds()
                    isInvoiceLevel()
                    percentageDiscount()
                    planPhaseOrder()
                    reason()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PercentageDiscountAdjustment]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var percentageDiscount: JsonField<Double>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(percentageDiscountAdjustment: PercentageDiscountAdjustment) =
                        apply {
                            id = percentageDiscountAdjustment.id
                            adjustmentType = percentageDiscountAdjustment.adjustmentType
                            appliesToPriceIds =
                                percentageDiscountAdjustment.appliesToPriceIds.map {
                                    it.toMutableList()
                                }
                            isInvoiceLevel = percentageDiscountAdjustment.isInvoiceLevel
                            percentageDiscount = percentageDiscountAdjustment.percentageDiscount
                            planPhaseOrder = percentageDiscountAdjustment.planPhaseOrder
                            reason = percentageDiscountAdjustment.reason
                            additionalProperties =
                                percentageDiscountAdjustment.additionalProperties.toMutableMap()
                        }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
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
                     * The percentage (as a value between 0 and 1) by which to discount the price
                     * intervals this adjustment applies to in a given billing period.
                     */
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.orElse(null) as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: Optional<String>) = reason(reason.orElse(null))

                    /** The reason for the adjustment. */
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

                    fun build(): PercentageDiscountAdjustment =
                        PercentageDiscountAdjustment(
                            checkRequired("id", id),
                            checkRequired("adjustmentType", adjustmentType),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("percentageDiscount", percentageDiscount),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                        @JvmField val PERCENTAGE_DISCOUNT = of("percentage_discount")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    /** An enum containing [AdjustmentType]'s known values. */
                    enum class Known {
                        PERCENTAGE_DISCOUNT,
                    }

                    /**
                     * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AdjustmentType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PERCENTAGE_DISCOUNT,
                        /**
                         * An enum member indicating that [AdjustmentType] was instantiated with an
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
                            PERCENTAGE_DISCOUNT -> Value.PERCENTAGE_DISCOUNT
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
                            PERCENTAGE_DISCOUNT -> Known.PERCENTAGE_DISCOUNT
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PercentageDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && percentageDiscount == other.percentageDiscount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, percentageDiscount, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PercentageDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, percentageDiscount=$percentageDiscount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class UsageDiscountAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("usage_discount")
                @ExcludeMissing
                private val usageDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                @JsonProperty("usage_discount")
                @ExcludeMissing
                fun _usageDiscount(): JsonField<Double> = usageDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): UsageDiscountAdjustment = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    adjustmentType()
                    appliesToPriceIds()
                    isInvoiceLevel()
                    planPhaseOrder()
                    reason()
                    usageDiscount()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [UsageDiscountAdjustment]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var usageDiscount: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(usageDiscountAdjustment: UsageDiscountAdjustment) = apply {
                        id = usageDiscountAdjustment.id
                        adjustmentType = usageDiscountAdjustment.adjustmentType
                        appliesToPriceIds =
                            usageDiscountAdjustment.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = usageDiscountAdjustment.isInvoiceLevel
                        planPhaseOrder = usageDiscountAdjustment.planPhaseOrder
                        reason = usageDiscountAdjustment.reason
                        usageDiscount = usageDiscountAdjustment.usageDiscount
                        additionalProperties =
                            usageDiscountAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.orElse(null) as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: Optional<String>) = reason(reason.orElse(null))

                    /** The reason for the adjustment. */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    /**
                     * The number of usage units by which to discount the price this adjustment
                     * applies to in a given billing period.
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * The number of usage units by which to discount the price this adjustment
                     * applies to in a given billing period.
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

                    fun build(): UsageDiscountAdjustment =
                        UsageDiscountAdjustment(
                            checkRequired("id", id),
                            checkRequired("adjustmentType", adjustmentType),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            checkRequired("usageDiscount", usageDiscount),
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                        @JvmField val USAGE_DISCOUNT = of("usage_discount")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    /** An enum containing [AdjustmentType]'s known values. */
                    enum class Known {
                        USAGE_DISCOUNT,
                    }

                    /**
                     * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AdjustmentType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        USAGE_DISCOUNT,
                        /**
                         * An enum member indicating that [AdjustmentType] was instantiated with an
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
                            USAGE_DISCOUNT -> Value.USAGE_DISCOUNT
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
                            USAGE_DISCOUNT -> Known.USAGE_DISCOUNT
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is UsageDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && reason == other.reason && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, planPhaseOrder, reason, usageDiscount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UsageDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class MinimumAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                private val itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                private val minimumAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /** The item ID that revenue from this minimum will be attributed to. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /** The item ID that revenue from this minimum will be attributed to. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun _minimumAmount(): JsonField<String> = minimumAmount

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MinimumAdjustment = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    adjustmentType()
                    appliesToPriceIds()
                    isInvoiceLevel()
                    itemId()
                    minimumAmount()
                    planPhaseOrder()
                    reason()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [MinimumAdjustment]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var itemId: JsonField<String>? = null
                    private var minimumAmount: JsonField<String>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(minimumAdjustment: MinimumAdjustment) = apply {
                        id = minimumAdjustment.id
                        adjustmentType = minimumAdjustment.adjustmentType
                        appliesToPriceIds =
                            minimumAdjustment.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = minimumAdjustment.isInvoiceLevel
                        itemId = minimumAdjustment.itemId
                        minimumAmount = minimumAdjustment.minimumAmount
                        planPhaseOrder = minimumAdjustment.planPhaseOrder
                        reason = minimumAdjustment.reason
                        additionalProperties = minimumAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The item ID that revenue from this minimum will be attributed to. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The item ID that revenue from this minimum will be attributed to. */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * The minimum amount to charge in a given billing period for the prices this
                     * adjustment applies to.
                     */
                    fun minimumAmount(minimumAmount: String) =
                        minimumAmount(JsonField.of(minimumAmount))

                    /**
                     * The minimum amount to charge in a given billing period for the prices this
                     * adjustment applies to.
                     */
                    fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                        this.minimumAmount = minimumAmount
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.orElse(null) as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: Optional<String>) = reason(reason.orElse(null))

                    /** The reason for the adjustment. */
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

                    fun build(): MinimumAdjustment =
                        MinimumAdjustment(
                            checkRequired("id", id),
                            checkRequired("adjustmentType", adjustmentType),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("itemId", itemId),
                            checkRequired("minimumAmount", minimumAmount),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                        @JvmField val MINIMUM = of("minimum")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    /** An enum containing [AdjustmentType]'s known values. */
                    enum class Known {
                        MINIMUM,
                    }

                    /**
                     * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AdjustmentType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MINIMUM,
                        /**
                         * An enum member indicating that [AdjustmentType] was instantiated with an
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
                            MINIMUM -> Value.MINIMUM
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
                            MINIMUM -> Known.MINIMUM
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MinimumAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && itemId == other.itemId && minimumAmount == other.minimumAmount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, itemId, minimumAmount, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MinimumAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, itemId=$itemId, minimumAmount=$minimumAmount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class MaximumAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                private val maximumAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun _maximumAmount(): JsonField<String> = maximumAmount

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MaximumAdjustment = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    adjustmentType()
                    appliesToPriceIds()
                    isInvoiceLevel()
                    maximumAmount()
                    planPhaseOrder()
                    reason()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [MaximumAdjustment]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var maximumAmount: JsonField<String>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(maximumAdjustment: MaximumAdjustment) = apply {
                        id = maximumAdjustment.id
                        adjustmentType = maximumAdjustment.adjustmentType
                        appliesToPriceIds =
                            maximumAdjustment.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = maximumAdjustment.isInvoiceLevel
                        maximumAmount = maximumAdjustment.maximumAmount
                        planPhaseOrder = maximumAdjustment.planPhaseOrder
                        reason = maximumAdjustment.reason
                        additionalProperties = maximumAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
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
                     * The maximum amount to charge in a given billing period for the prices this
                     * adjustment applies to.
                     */
                    fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.orElse(null) as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: Optional<String>) = reason(reason.orElse(null))

                    /** The reason for the adjustment. */
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

                    fun build(): MaximumAdjustment =
                        MaximumAdjustment(
                            checkRequired("id", id),
                            checkRequired("adjustmentType", adjustmentType),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("maximumAmount", maximumAmount),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                        @JvmField val MAXIMUM = of("maximum")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    /** An enum containing [AdjustmentType]'s known values. */
                    enum class Known {
                        MAXIMUM,
                    }

                    /**
                     * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AdjustmentType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MAXIMUM,
                        /**
                         * An enum member indicating that [AdjustmentType] was instantiated with an
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
                            MAXIMUM -> Value.MAXIMUM
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
                            MAXIMUM -> Known.MAXIMUM
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MaximumAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && maximumAmount == other.maximumAmount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, maximumAmount, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MaximumAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, maximumAmount=$maximumAmount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }
        }

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        @NoAutoDetect
        class Maximum
        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            private val maximumAmount: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /** Maximum amount applied */
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun _maximumAmount(): JsonField<String> = maximumAmount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Maximum = apply {
                if (validated) {
                    return@apply
                }

                appliesToPriceIds()
                maximumAmount()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Maximum]. */
            class Builder internal constructor() {

                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var maximumAmount: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(maximum: Maximum) = apply {
                    appliesToPriceIds = maximum.appliesToPriceIds.map { it.toMutableList() }
                    maximumAmount = maximum.maximumAmount
                    additionalProperties = maximum.additionalProperties.toMutableMap()
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(appliesToPriceId)
                        }
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
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

                fun build(): Maximum =
                    Maximum(
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("maximumAmount", maximumAmount),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Maximum && appliesToPriceIds == other.appliesToPriceIds && maximumAmount == other.maximumAmount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, maximumAmount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Maximum{appliesToPriceIds=$appliesToPriceIds, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"
        }

        /** This field is deprecated in favor of `adjustments`. */
        @Deprecated("deprecated")
        @NoAutoDetect
        class Minimum
        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            private val minimumAmount: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /** Minimum amount applied */
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun _minimumAmount(): JsonField<String> = minimumAmount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Minimum = apply {
                if (validated) {
                    return@apply
                }

                appliesToPriceIds()
                minimumAmount()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Minimum]. */
            class Builder internal constructor() {

                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var minimumAmount: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(minimum: Minimum) = apply {
                    appliesToPriceIds = minimum.appliesToPriceIds.map { it.toMutableList() }
                    minimumAmount = minimum.minimumAmount
                    additionalProperties = minimum.additionalProperties.toMutableMap()
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(appliesToPriceId)
                        }
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
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

                fun build(): Minimum =
                    Minimum(
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("minimumAmount", minimumAmount),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Minimum && appliesToPriceIds == other.appliesToPriceIds && minimumAmount == other.minimumAmount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, minimumAmount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Minimum{appliesToPriceIds=$appliesToPriceIds, minimumAmount=$minimumAmount, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(using = SubLineItem.Deserializer::class)
        @JsonSerialize(using = SubLineItem.Serializer::class)
        class SubLineItem
        private constructor(
            private val matrix: MatrixSubLineItem? = null,
            private val tier: TierSubLineItem? = null,
            private val other: OtherSubLineItem? = null,
            private val _json: JsonValue? = null,
        ) {

            fun matrix(): Optional<MatrixSubLineItem> = Optional.ofNullable(matrix)

            fun tier(): Optional<TierSubLineItem> = Optional.ofNullable(tier)

            fun other(): Optional<OtherSubLineItem> = Optional.ofNullable(other)

            fun isMatrix(): Boolean = matrix != null

            fun isTier(): Boolean = tier != null

            fun isOther(): Boolean = other != null

            fun asMatrix(): MatrixSubLineItem = matrix.getOrThrow("matrix")

            fun asTier(): TierSubLineItem = tier.getOrThrow("tier")

            fun asOther(): OtherSubLineItem = other.getOrThrow("other")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    matrix != null -> visitor.visitMatrix(matrix)
                    tier != null -> visitor.visitTier(tier)
                    other != null -> visitor.visitOther(other)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): SubLineItem = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitMatrix(matrix: MatrixSubLineItem) {
                            matrix.validate()
                        }

                        override fun visitTier(tier: TierSubLineItem) {
                            tier.validate()
                        }

                        override fun visitOther(other: OtherSubLineItem) {
                            other.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SubLineItem && matrix == other.matrix && tier == other.tier && this.other == other.other /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(matrix, tier, other) /* spotless:on */

            override fun toString(): String =
                when {
                    matrix != null -> "SubLineItem{matrix=$matrix}"
                    tier != null -> "SubLineItem{tier=$tier}"
                    other != null -> "SubLineItem{other=$other}"
                    _json != null -> "SubLineItem{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid SubLineItem")
                }

            companion object {

                @JvmStatic fun ofMatrix(matrix: MatrixSubLineItem) = SubLineItem(matrix = matrix)

                @JvmStatic fun ofTier(tier: TierSubLineItem) = SubLineItem(tier = tier)

                @JvmStatic fun ofOther(other: OtherSubLineItem) = SubLineItem(other = other)
            }

            /**
             * An interface that defines how to map each variant of [SubLineItem] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitMatrix(matrix: MatrixSubLineItem): T

                fun visitTier(tier: TierSubLineItem): T

                fun visitOther(other: OtherSubLineItem): T

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
                            tryDeserialize(node, jacksonTypeRef<MatrixSubLineItem>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return SubLineItem(matrix = it, _json = json)
                                }
                        }
                        "tier" -> {
                            tryDeserialize(node, jacksonTypeRef<TierSubLineItem>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return SubLineItem(tier = it, _json = json)
                                }
                        }
                        "'null'" -> {
                            tryDeserialize(node, jacksonTypeRef<OtherSubLineItem>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return SubLineItem(other = it, _json = json)
                                }
                        }
                    }

                    return SubLineItem(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<SubLineItem>(SubLineItem::class) {

                override fun serialize(
                    value: SubLineItem,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.matrix != null -> generator.writeObject(value.matrix)
                        value.tier != null -> generator.writeObject(value.tier)
                        value.other != null -> generator.writeObject(value.other)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid SubLineItem")
                    }
                }
            }

            @NoAutoDetect
            class MatrixSubLineItem
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("grouping")
                @ExcludeMissing
                private val grouping: JsonField<Grouping> = JsonMissing.of(),
                @JsonProperty("matrix_config")
                @ExcludeMissing
                private val matrixConfig: JsonField<MatrixConfig> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The total amount for this sub line item. */
                fun amount(): String = amount.getRequired("amount")

                fun grouping(): Optional<Grouping> =
                    Optional.ofNullable(grouping.getNullable("grouping"))

                fun matrixConfig(): MatrixConfig = matrixConfig.getRequired("matrix_config")

                fun name(): String = name.getRequired("name")

                fun quantity(): Double = quantity.getRequired("quantity")

                fun type(): Type = type.getRequired("type")

                /** The total amount for this sub line item. */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                @JsonProperty("grouping")
                @ExcludeMissing
                fun _grouping(): JsonField<Grouping> = grouping

                @JsonProperty("matrix_config")
                @ExcludeMissing
                fun _matrixConfig(): JsonField<MatrixConfig> = matrixConfig

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MatrixSubLineItem = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    grouping().ifPresent { it.validate() }
                    matrixConfig().validate()
                    name()
                    quantity()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [MatrixSubLineItem]. */
                class Builder internal constructor() {

                    private var amount: JsonField<String>? = null
                    private var grouping: JsonField<Grouping>? = null
                    private var matrixConfig: JsonField<MatrixConfig>? = null
                    private var name: JsonField<String>? = null
                    private var quantity: JsonField<Double>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(matrixSubLineItem: MatrixSubLineItem) = apply {
                        amount = matrixSubLineItem.amount
                        grouping = matrixSubLineItem.grouping
                        matrixConfig = matrixSubLineItem.matrixConfig
                        name = matrixSubLineItem.name
                        quantity = matrixSubLineItem.quantity
                        type = matrixSubLineItem.type
                        additionalProperties = matrixSubLineItem.additionalProperties.toMutableMap()
                    }

                    /** The total amount for this sub line item. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /** The total amount for this sub line item. */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                    fun grouping(grouping: Optional<Grouping>) = grouping(grouping.orElse(null))

                    fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                    fun matrixConfig(matrixConfig: MatrixConfig) =
                        matrixConfig(JsonField.of(matrixConfig))

                    fun matrixConfig(matrixConfig: JsonField<MatrixConfig>) = apply {
                        this.matrixConfig = matrixConfig
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

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

                    fun build(): MatrixSubLineItem =
                        MatrixSubLineItem(
                            checkRequired("amount", amount),
                            checkRequired("grouping", grouping),
                            checkRequired("matrixConfig", matrixConfig),
                            checkRequired("name", name),
                            checkRequired("quantity", quantity),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class Grouping
                @JsonCreator
                private constructor(
                    @JsonProperty("key")
                    @ExcludeMissing
                    private val key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    private val value: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun key(): String = key.getRequired("key")

                    /** No value indicates the default group */
                    fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

                    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                    /** No value indicates the default group */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Grouping = apply {
                        if (validated) {
                            return@apply
                        }

                        key()
                        value()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

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

                        fun key(key: JsonField<String>) = apply { this.key = key }

                        /** No value indicates the default group */
                        fun value(value: String?) = value(JsonField.ofNullable(value))

                        /** No value indicates the default group */
                        fun value(value: Optional<String>) = value(value.orElse(null))

                        /** No value indicates the default group */
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

                        fun build(): Grouping =
                            Grouping(
                                checkRequired("key", key),
                                checkRequired("value", value),
                                additionalProperties.toImmutable(),
                            )
                    }

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

                @NoAutoDetect
                class MatrixConfig
                @JsonCreator
                private constructor(
                    @JsonProperty("dimension_values")
                    @ExcludeMissing
                    private val dimensionValues: JsonField<List<String?>> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The ordered dimension values for this line item. */
                    fun dimensionValues(): List<String?> =
                        dimensionValues.getRequired("dimension_values")

                    /** The ordered dimension values for this line item. */
                    @JsonProperty("dimension_values")
                    @ExcludeMissing
                    fun _dimensionValues(): JsonField<List<String?>> = dimensionValues

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): MatrixConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        dimensionValues()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

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

                        /** The ordered dimension values for this line item. */
                        fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                            this.dimensionValues = dimensionValues.map { it.toMutableList() }
                        }

                        /** The ordered dimension values for this line item. */
                        fun addDimensionValue(dimensionValue: String) = apply {
                            dimensionValues =
                                (dimensionValues ?: JsonField.of(mutableListOf())).apply {
                                    asKnown()
                                        .orElseThrow {
                                            IllegalStateException(
                                                "Field was set to non-list type: ${javaClass.simpleName}"
                                            )
                                        }
                                        .add(dimensionValue)
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

                        fun build(): MatrixConfig =
                            MatrixConfig(
                                checkRequired("dimensionValues", dimensionValues).map {
                                    it.toImmutable()
                                },
                                additionalProperties.toImmutable()
                            )
                    }

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

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                        @JvmField val MATRIX = of("matrix")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        MATRIX,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MATRIX,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
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
                            MATRIX -> Value.MATRIX
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
                            MATRIX -> Known.MATRIX
                            else -> throw OrbInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is MatrixSubLineItem && amount == other.amount && grouping == other.grouping && matrixConfig == other.matrixConfig && name == other.name && quantity == other.quantity && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, grouping, matrixConfig, name, quantity, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MatrixSubLineItem{amount=$amount, grouping=$grouping, matrixConfig=$matrixConfig, name=$name, quantity=$quantity, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class TierSubLineItem
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("grouping")
                @ExcludeMissing
                private val grouping: JsonField<Grouping> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("tier_config")
                @ExcludeMissing
                private val tierConfig: JsonField<TierConfig> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The total amount for this sub line item. */
                fun amount(): String = amount.getRequired("amount")

                fun grouping(): Optional<Grouping> =
                    Optional.ofNullable(grouping.getNullable("grouping"))

                fun name(): String = name.getRequired("name")

                fun quantity(): Double = quantity.getRequired("quantity")

                fun tierConfig(): TierConfig = tierConfig.getRequired("tier_config")

                fun type(): Type = type.getRequired("type")

                /** The total amount for this sub line item. */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                @JsonProperty("grouping")
                @ExcludeMissing
                fun _grouping(): JsonField<Grouping> = grouping

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                @JsonProperty("tier_config")
                @ExcludeMissing
                fun _tierConfig(): JsonField<TierConfig> = tierConfig

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): TierSubLineItem = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    grouping().ifPresent { it.validate() }
                    name()
                    quantity()
                    tierConfig().validate()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TierSubLineItem]. */
                class Builder internal constructor() {

                    private var amount: JsonField<String>? = null
                    private var grouping: JsonField<Grouping>? = null
                    private var name: JsonField<String>? = null
                    private var quantity: JsonField<Double>? = null
                    private var tierConfig: JsonField<TierConfig>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tierSubLineItem: TierSubLineItem) = apply {
                        amount = tierSubLineItem.amount
                        grouping = tierSubLineItem.grouping
                        name = tierSubLineItem.name
                        quantity = tierSubLineItem.quantity
                        tierConfig = tierSubLineItem.tierConfig
                        type = tierSubLineItem.type
                        additionalProperties = tierSubLineItem.additionalProperties.toMutableMap()
                    }

                    /** The total amount for this sub line item. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /** The total amount for this sub line item. */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                    fun grouping(grouping: Optional<Grouping>) = grouping(grouping.orElse(null))

                    fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun tierConfig(tierConfig: TierConfig) = tierConfig(JsonField.of(tierConfig))

                    fun tierConfig(tierConfig: JsonField<TierConfig>) = apply {
                        this.tierConfig = tierConfig
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

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

                    fun build(): TierSubLineItem =
                        TierSubLineItem(
                            checkRequired("amount", amount),
                            checkRequired("grouping", grouping),
                            checkRequired("name", name),
                            checkRequired("quantity", quantity),
                            checkRequired("tierConfig", tierConfig),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class Grouping
                @JsonCreator
                private constructor(
                    @JsonProperty("key")
                    @ExcludeMissing
                    private val key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    private val value: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun key(): String = key.getRequired("key")

                    /** No value indicates the default group */
                    fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

                    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                    /** No value indicates the default group */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Grouping = apply {
                        if (validated) {
                            return@apply
                        }

                        key()
                        value()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

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

                        fun key(key: JsonField<String>) = apply { this.key = key }

                        /** No value indicates the default group */
                        fun value(value: String?) = value(JsonField.ofNullable(value))

                        /** No value indicates the default group */
                        fun value(value: Optional<String>) = value(value.orElse(null))

                        /** No value indicates the default group */
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

                        fun build(): Grouping =
                            Grouping(
                                checkRequired("key", key),
                                checkRequired("value", value),
                                additionalProperties.toImmutable(),
                            )
                    }

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

                @NoAutoDetect
                class TierConfig
                @JsonCreator
                private constructor(
                    @JsonProperty("first_unit")
                    @ExcludeMissing
                    private val firstUnit: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("last_unit")
                    @ExcludeMissing
                    private val lastUnit: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    private val unitAmount: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun firstUnit(): Double = firstUnit.getRequired("first_unit")

                    fun lastUnit(): Optional<Double> =
                        Optional.ofNullable(lastUnit.getNullable("last_unit"))

                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    @JsonProperty("first_unit")
                    @ExcludeMissing
                    fun _firstUnit(): JsonField<Double> = firstUnit

                    @JsonProperty("last_unit")
                    @ExcludeMissing
                    fun _lastUnit(): JsonField<Double> = lastUnit

                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    fun _unitAmount(): JsonField<String> = unitAmount

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    fun toBuilder() = Builder().from(this)

                    companion object {

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

                        fun firstUnit(firstUnit: JsonField<Double>) = apply {
                            this.firstUnit = firstUnit
                        }

                        fun lastUnit(lastUnit: Double?) = lastUnit(JsonField.ofNullable(lastUnit))

                        fun lastUnit(lastUnit: Double) = lastUnit(lastUnit as Double?)

                        @Suppress(
                            "USELESS_CAST"
                        ) // See https://youtrack.jetbrains.com/issue/KT-74228
                        fun lastUnit(lastUnit: Optional<Double>) =
                            lastUnit(lastUnit.orElse(null) as Double?)

                        fun lastUnit(lastUnit: JsonField<Double>) = apply {
                            this.lastUnit = lastUnit
                        }

                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

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

                        fun build(): TierConfig =
                            TierConfig(
                                checkRequired("firstUnit", firstUnit),
                                checkRequired("lastUnit", lastUnit),
                                checkRequired("unitAmount", unitAmount),
                                additionalProperties.toImmutable(),
                            )
                    }

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

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                        @JvmField val TIER = of("tier")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        TIER,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        TIER,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
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
                            TIER -> Value.TIER
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
                            TIER -> Known.TIER
                            else -> throw OrbInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is TierSubLineItem && amount == other.amount && grouping == other.grouping && name == other.name && quantity == other.quantity && tierConfig == other.tierConfig && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, grouping, name, quantity, tierConfig, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TierSubLineItem{amount=$amount, grouping=$grouping, name=$name, quantity=$quantity, tierConfig=$tierConfig, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class OtherSubLineItem
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("grouping")
                @ExcludeMissing
                private val grouping: JsonField<Grouping> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The total amount for this sub line item. */
                fun amount(): String = amount.getRequired("amount")

                fun grouping(): Optional<Grouping> =
                    Optional.ofNullable(grouping.getNullable("grouping"))

                fun name(): String = name.getRequired("name")

                fun quantity(): Double = quantity.getRequired("quantity")

                fun type(): Type = type.getRequired("type")

                /** The total amount for this sub line item. */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

                @JsonProperty("grouping")
                @ExcludeMissing
                fun _grouping(): JsonField<Grouping> = grouping

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): OtherSubLineItem = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    grouping().ifPresent { it.validate() }
                    name()
                    quantity()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [OtherSubLineItem]. */
                class Builder internal constructor() {

                    private var amount: JsonField<String>? = null
                    private var grouping: JsonField<Grouping>? = null
                    private var name: JsonField<String>? = null
                    private var quantity: JsonField<Double>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(otherSubLineItem: OtherSubLineItem) = apply {
                        amount = otherSubLineItem.amount
                        grouping = otherSubLineItem.grouping
                        name = otherSubLineItem.name
                        quantity = otherSubLineItem.quantity
                        type = otherSubLineItem.type
                        additionalProperties = otherSubLineItem.additionalProperties.toMutableMap()
                    }

                    /** The total amount for this sub line item. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /** The total amount for this sub line item. */
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                    fun grouping(grouping: Optional<Grouping>) = grouping(grouping.orElse(null))

                    fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

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

                    fun build(): OtherSubLineItem =
                        OtherSubLineItem(
                            checkRequired("amount", amount),
                            checkRequired("grouping", grouping),
                            checkRequired("name", name),
                            checkRequired("quantity", quantity),
                            checkRequired("type", type),
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class Grouping
                @JsonCreator
                private constructor(
                    @JsonProperty("key")
                    @ExcludeMissing
                    private val key: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    private val value: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun key(): String = key.getRequired("key")

                    /** No value indicates the default group */
                    fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

                    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                    /** No value indicates the default group */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Grouping = apply {
                        if (validated) {
                            return@apply
                        }

                        key()
                        value()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

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

                        fun key(key: JsonField<String>) = apply { this.key = key }

                        /** No value indicates the default group */
                        fun value(value: String?) = value(JsonField.ofNullable(value))

                        /** No value indicates the default group */
                        fun value(value: Optional<String>) = value(value.orElse(null))

                        /** No value indicates the default group */
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

                        fun build(): Grouping =
                            Grouping(
                                checkRequired("key", key),
                                checkRequired("value", value),
                                additionalProperties.toImmutable(),
                            )
                    }

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

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

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

                        @JvmField val NULL = of("'null'")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        NULL,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        NULL,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
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
                            NULL -> Value.NULL
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
                            NULL -> Known.NULL
                            else -> throw OrbInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is OtherSubLineItem && amount == other.amount && grouping == other.grouping && name == other.name && quantity == other.quantity && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, grouping, name, quantity, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OtherSubLineItem{amount=$amount, grouping=$grouping, name=$name, quantity=$quantity, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        @NoAutoDetect
        class TaxAmount
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_rate_description")
            @ExcludeMissing
            private val taxRateDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_rate_percentage")
            @ExcludeMissing
            private val taxRatePercentage: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The amount of additional tax incurred by this tax rate. */
            fun amount(): String = amount.getRequired("amount")

            /** The human-readable description of the applied tax rate. */
            fun taxRateDescription(): String =
                taxRateDescription.getRequired("tax_rate_description")

            /** The tax rate percentage, out of 100. */
            fun taxRatePercentage(): Optional<String> =
                Optional.ofNullable(taxRatePercentage.getNullable("tax_rate_percentage"))

            /** The amount of additional tax incurred by this tax rate. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /** The human-readable description of the applied tax rate. */
            @JsonProperty("tax_rate_description")
            @ExcludeMissing
            fun _taxRateDescription(): JsonField<String> = taxRateDescription

            /** The tax rate percentage, out of 100. */
            @JsonProperty("tax_rate_percentage")
            @ExcludeMissing
            fun _taxRatePercentage(): JsonField<String> = taxRatePercentage

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                /** The amount of additional tax incurred by this tax rate. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** The human-readable description of the applied tax rate. */
                fun taxRateDescription(taxRateDescription: String) =
                    taxRateDescription(JsonField.of(taxRateDescription))

                /** The human-readable description of the applied tax rate. */
                fun taxRateDescription(taxRateDescription: JsonField<String>) = apply {
                    this.taxRateDescription = taxRateDescription
                }

                /** The tax rate percentage, out of 100. */
                fun taxRatePercentage(taxRatePercentage: String?) =
                    taxRatePercentage(JsonField.ofNullable(taxRatePercentage))

                /** The tax rate percentage, out of 100. */
                fun taxRatePercentage(taxRatePercentage: Optional<String>) =
                    taxRatePercentage(taxRatePercentage.orElse(null))

                /** The tax rate percentage, out of 100. */
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

                fun build(): TaxAmount =
                    TaxAmount(
                        checkRequired("amount", amount),
                        checkRequired("taxRateDescription", taxRateDescription),
                        checkRequired("taxRatePercentage", taxRatePercentage),
                        additionalProperties.toImmutable(),
                    )
            }

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

            return /* spotless:off */ other is LineItem && id == other.id && adjustedSubtotal == other.adjustedSubtotal && adjustments == other.adjustments && amount == other.amount && creditsApplied == other.creditsApplied && discount == other.discount && endDate == other.endDate && grouping == other.grouping && maximum == other.maximum && maximumAmount == other.maximumAmount && minimum == other.minimum && minimumAmount == other.minimumAmount && name == other.name && partiallyInvoicedAmount == other.partiallyInvoicedAmount && price == other.price && quantity == other.quantity && startDate == other.startDate && subLineItems == other.subLineItems && subtotal == other.subtotal && taxAmounts == other.taxAmounts && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, adjustedSubtotal, adjustments, amount, creditsApplied, discount, endDate, grouping, maximum, maximumAmount, minimum, minimumAmount, name, partiallyInvoicedAmount, price, quantity, startDate, subLineItems, subtotal, taxAmounts, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{id=$id, adjustedSubtotal=$adjustedSubtotal, adjustments=$adjustments, amount=$amount, creditsApplied=$creditsApplied, discount=$discount, endDate=$endDate, grouping=$grouping, maximum=$maximum, maximumAmount=$maximumAmount, minimum=$minimum, minimumAmount=$minimumAmount, name=$name, partiallyInvoicedAmount=$partiallyInvoicedAmount, price=$price, quantity=$quantity, startDate=$startDate, subLineItems=$subLineItems, subtotal=$subtotal, taxAmounts=$taxAmounts, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Maximum
    @JsonCreator
    private constructor(
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** Maximum amount applied */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /** Maximum amount applied */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Maximum = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            maximumAmount()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Maximum]. */
        class Builder internal constructor() {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var maximumAmount: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(maximum: Maximum) = apply {
                appliesToPriceIds = maximum.appliesToPriceIds.map { it.toMutableList() }
                maximumAmount = maximum.maximumAmount
                additionalProperties = maximum.additionalProperties.toMutableMap()
            }

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(appliesToPriceId)
                    }
            }

            /** Maximum amount applied */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /** Maximum amount applied */
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

            fun build(): Maximum =
                Maximum(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("maximumAmount", maximumAmount),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Maximum && appliesToPriceIds == other.appliesToPriceIds && maximumAmount == other.maximumAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, maximumAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Maximum{appliesToPriceIds=$appliesToPriceIds, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

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

    @NoAutoDetect
    class Minimum
    @JsonCreator
    private constructor(
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** Minimum amount applied */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /** Minimum amount applied */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Minimum = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            minimumAmount()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Minimum]. */
        class Builder internal constructor() {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var minimumAmount: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimum: Minimum) = apply {
                appliesToPriceIds = minimum.appliesToPriceIds.map { it.toMutableList() }
                minimumAmount = minimum.minimumAmount
                additionalProperties = minimum.additionalProperties.toMutableMap()
            }

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(appliesToPriceId)
                    }
            }

            /** Minimum amount applied */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /** Minimum amount applied */
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

            fun build(): Minimum =
                Minimum(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("minimumAmount", minimumAmount),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Minimum && appliesToPriceIds == other.appliesToPriceIds && minimumAmount == other.minimumAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, minimumAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Minimum{appliesToPriceIds=$appliesToPriceIds, minimumAmount=$minimumAmount, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class PaymentAttempt
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("payment_provider")
        @ExcludeMissing
        private val paymentProvider: JsonField<PaymentProvider> = JsonMissing.of(),
        @JsonProperty("payment_provider_id")
        @ExcludeMissing
        private val paymentProviderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("succeeded")
        @ExcludeMissing
        private val succeeded: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID of the payment attempt. */
        fun id(): String = id.getRequired("id")

        /** The amount of the payment attempt. */
        fun amount(): String = amount.getRequired("amount")

        /** The time at which the payment attempt was created. */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** The payment provider that attempted to collect the payment. */
        fun paymentProvider(): Optional<PaymentProvider> =
            Optional.ofNullable(paymentProvider.getNullable("payment_provider"))

        /** The ID of the payment attempt in the payment provider. */
        fun paymentProviderId(): Optional<String> =
            Optional.ofNullable(paymentProviderId.getNullable("payment_provider_id"))

        /** Whether the payment attempt succeeded. */
        fun succeeded(): Boolean = succeeded.getRequired("succeeded")

        /** The ID of the payment attempt. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The amount of the payment attempt. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /** The time at which the payment attempt was created. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /** The payment provider that attempted to collect the payment. */
        @JsonProperty("payment_provider")
        @ExcludeMissing
        fun _paymentProvider(): JsonField<PaymentProvider> = paymentProvider

        /** The ID of the payment attempt in the payment provider. */
        @JsonProperty("payment_provider_id")
        @ExcludeMissing
        fun _paymentProviderId(): JsonField<String> = paymentProviderId

        /** Whether the payment attempt succeeded. */
        @JsonProperty("succeeded") @ExcludeMissing fun _succeeded(): JsonField<Boolean> = succeeded

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentAttempt = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            paymentProvider()
            paymentProviderId()
            succeeded()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** The ID of the payment attempt. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The amount of the payment attempt. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /** The amount of the payment attempt. */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The time at which the payment attempt was created. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /** The time at which the payment attempt was created. */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The payment provider that attempted to collect the payment. */
            fun paymentProvider(paymentProvider: PaymentProvider?) =
                paymentProvider(JsonField.ofNullable(paymentProvider))

            /** The payment provider that attempted to collect the payment. */
            fun paymentProvider(paymentProvider: Optional<PaymentProvider>) =
                paymentProvider(paymentProvider.orElse(null))

            /** The payment provider that attempted to collect the payment. */
            fun paymentProvider(paymentProvider: JsonField<PaymentProvider>) = apply {
                this.paymentProvider = paymentProvider
            }

            /** The ID of the payment attempt in the payment provider. */
            fun paymentProviderId(paymentProviderId: String?) =
                paymentProviderId(JsonField.ofNullable(paymentProviderId))

            /** The ID of the payment attempt in the payment provider. */
            fun paymentProviderId(paymentProviderId: Optional<String>) =
                paymentProviderId(paymentProviderId.orElse(null))

            /** The ID of the payment attempt in the payment provider. */
            fun paymentProviderId(paymentProviderId: JsonField<String>) = apply {
                this.paymentProviderId = paymentProviderId
            }

            /** Whether the payment attempt succeeded. */
            fun succeeded(succeeded: Boolean) = succeeded(JsonField.of(succeeded))

            /** Whether the payment attempt succeeded. */
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

            fun build(): PaymentAttempt =
                PaymentAttempt(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("paymentProvider", paymentProvider),
                    checkRequired("paymentProviderId", paymentProviderId),
                    checkRequired("succeeded", succeeded),
                    additionalProperties.toImmutable(),
                )
        }

        /** The payment provider that attempted to collect the payment. */
        class PaymentProvider
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
                STRIPE,
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

            fun asString(): String = _value().asStringOrThrow()

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

    @NoAutoDetect
    class ShippingAddress
    @JsonCreator
    private constructor(
        @JsonProperty("city")
        @ExcludeMissing
        private val city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

        fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

        fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        fun postalCode(): Optional<String> =
            Optional.ofNullable(postalCode.getNullable("postal_code"))

        fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun city(city: Optional<String>) = city(city.orElse(null))

            fun city(city: JsonField<String>) = apply { this.city = city }

            fun country(country: String?) = country(JsonField.ofNullable(country))

            fun country(country: Optional<String>) = country(country.orElse(null))

            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

            fun line1(line1: Optional<String>) = line1(line1.orElse(null))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            fun line2(line2: Optional<String>) = line2(line2.orElse(null))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

            fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.orElse(null))

            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            fun state(state: String?) = state(JsonField.ofNullable(state))

            fun state(state: Optional<String>) = state(state.orElse(null))

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

            fun build(): ShippingAddress =
                ShippingAddress(
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("line2", line2),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
                    additionalProperties.toImmutable(),
                )
        }

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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Subscription
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Subscription = apply {
            if (validated) {
                return@apply
            }

            id()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): Subscription =
                Subscription(checkRequired("id", id), additionalProperties.toImmutable())
        }

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

        return /* spotless:off */ other is Invoice && id == other.id && amountDue == other.amountDue && autoCollection == other.autoCollection && billingAddress == other.billingAddress && createdAt == other.createdAt && creditNotes == other.creditNotes && currency == other.currency && customer == other.customer && customerBalanceTransactions == other.customerBalanceTransactions && customerTaxId == other.customerTaxId && discount == other.discount && discounts == other.discounts && dueDate == other.dueDate && eligibleToIssueAt == other.eligibleToIssueAt && hostedInvoiceUrl == other.hostedInvoiceUrl && invoiceDate == other.invoiceDate && invoiceNumber == other.invoiceNumber && invoicePdf == other.invoicePdf && invoiceSource == other.invoiceSource && issueFailedAt == other.issueFailedAt && issuedAt == other.issuedAt && lineItems == other.lineItems && maximum == other.maximum && maximumAmount == other.maximumAmount && memo == other.memo && metadata == other.metadata && minimum == other.minimum && minimumAmount == other.minimumAmount && paidAt == other.paidAt && paymentAttempts == other.paymentAttempts && paymentFailedAt == other.paymentFailedAt && paymentStartedAt == other.paymentStartedAt && scheduledIssueAt == other.scheduledIssueAt && shippingAddress == other.shippingAddress && status == other.status && subscription == other.subscription && subtotal == other.subtotal && syncFailedAt == other.syncFailedAt && total == other.total && voidedAt == other.voidedAt && willAutoIssue == other.willAutoIssue && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amountDue, autoCollection, billingAddress, createdAt, creditNotes, currency, customer, customerBalanceTransactions, customerTaxId, discount, discounts, dueDate, eligibleToIssueAt, hostedInvoiceUrl, invoiceDate, invoiceNumber, invoicePdf, invoiceSource, issueFailedAt, issuedAt, lineItems, maximum, maximumAmount, memo, metadata, minimum, minimumAmount, paidAt, paymentAttempts, paymentFailedAt, paymentStartedAt, scheduledIssueAt, shippingAddress, status, subscription, subtotal, syncFailedAt, total, voidedAt, willAutoIssue, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Invoice{id=$id, amountDue=$amountDue, autoCollection=$autoCollection, billingAddress=$billingAddress, createdAt=$createdAt, creditNotes=$creditNotes, currency=$currency, customer=$customer, customerBalanceTransactions=$customerBalanceTransactions, customerTaxId=$customerTaxId, discount=$discount, discounts=$discounts, dueDate=$dueDate, eligibleToIssueAt=$eligibleToIssueAt, hostedInvoiceUrl=$hostedInvoiceUrl, invoiceDate=$invoiceDate, invoiceNumber=$invoiceNumber, invoicePdf=$invoicePdf, invoiceSource=$invoiceSource, issueFailedAt=$issueFailedAt, issuedAt=$issuedAt, lineItems=$lineItems, maximum=$maximum, maximumAmount=$maximumAmount, memo=$memo, metadata=$metadata, minimum=$minimum, minimumAmount=$minimumAmount, paidAt=$paidAt, paymentAttempts=$paymentAttempts, paymentFailedAt=$paymentFailedAt, paymentStartedAt=$paymentStartedAt, scheduledIssueAt=$scheduledIssueAt, shippingAddress=$shippingAddress, status=$status, subscription=$subscription, subtotal=$subtotal, syncFailedAt=$syncFailedAt, total=$total, voidedAt=$voidedAt, willAutoIssue=$willAutoIssue, additionalProperties=$additionalProperties}"
}
