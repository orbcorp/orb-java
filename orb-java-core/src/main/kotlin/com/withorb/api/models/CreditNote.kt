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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * The [Credit Note](/guides/invoicing/credit-notes) resource represents a credit that has been
 * applied to a particular invoice.
 */
@NoAutoDetect
class CreditNote
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("voided_at")
    @ExcludeMissing
    private val voidedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("credit_note_number")
    @ExcludeMissing
    private val creditNoteNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice_id")
    @ExcludeMissing
    private val invoiceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("memo") @ExcludeMissing private val memo: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reason")
    @ExcludeMissing
    private val reason: JsonField<Reason> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("subtotal")
    @ExcludeMissing
    private val subtotal: JsonField<String> = JsonMissing.of(),
    @JsonProperty("total") @ExcludeMissing private val total: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<Customer> = JsonMissing.of(),
    @JsonProperty("credit_note_pdf")
    @ExcludeMissing
    private val creditNotePdf: JsonField<String> = JsonMissing.of(),
    @JsonProperty("minimum_amount_refunded")
    @ExcludeMissing
    private val minimumAmountRefunded: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discounts")
    @ExcludeMissing
    private val discounts: JsonField<List<Discount>> = JsonMissing.of(),
    @JsonProperty("maximum_amount_adjustment")
    @ExcludeMissing
    private val maximumAmountAdjustment: JsonField<MaximumAmountAdjustment> = JsonMissing.of(),
    @JsonProperty("line_items")
    @ExcludeMissing
    private val lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Orb id of this credit note. */
    fun id(): String = id.getRequired("id")

    /** The creation time of the resource in Orb. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The time at which the credit note was voided in Orb, if applicable. */
    fun voidedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(voidedAt.getNullable("voided_at"))

    /** The unique identifier for credit notes. */
    fun creditNoteNumber(): String = creditNoteNumber.getRequired("credit_note_number")

    /** The id of the invoice resource that this credit note is applied to. */
    fun invoiceId(): String = invoiceId.getRequired("invoice_id")

    /** An optional memo supplied on the credit note. */
    fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

    fun reason(): Optional<Reason> = Optional.ofNullable(reason.getNullable("reason"))

    fun type(): Type = type.getRequired("type")

    /** The total prior to any creditable invoice-level discounts or minimums. */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /** The total including creditable invoice-level discounts or minimums, and tax. */
    fun total(): String = total.getRequired("total")

    fun customer(): Customer = customer.getRequired("customer")

    /** A URL to a PDF of the credit note. */
    fun creditNotePdf(): Optional<String> =
        Optional.ofNullable(creditNotePdf.getNullable("credit_note_pdf"))

    /** Any credited amount from the applied minimum on the invoice. */
    fun minimumAmountRefunded(): Optional<String> =
        Optional.ofNullable(minimumAmountRefunded.getNullable("minimum_amount_refunded"))

    /** Any discounts applied on the original invoice. */
    fun discounts(): Optional<List<Discount>> =
        Optional.ofNullable(discounts.getNullable("discounts"))

    /** The maximum amount applied on the original invoice */
    fun maximumAmountAdjustment(): Optional<MaximumAmountAdjustment> =
        Optional.ofNullable(maximumAmountAdjustment.getNullable("maximum_amount_adjustment"))

    /** All of the line items associated with this credit note. */
    fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

    /** The Orb id of this credit note. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The creation time of the resource in Orb. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The time at which the credit note was voided in Orb, if applicable. */
    @JsonProperty("voided_at") @ExcludeMissing fun _voidedAt() = voidedAt

    /** The unique identifier for credit notes. */
    @JsonProperty("credit_note_number") @ExcludeMissing fun _creditNoteNumber() = creditNoteNumber

    /** The id of the invoice resource that this credit note is applied to. */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

    /** An optional memo supplied on the credit note. */
    @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

    @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** The total prior to any creditable invoice-level discounts or minimums. */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

    /** The total including creditable invoice-level discounts or minimums, and tax. */
    @JsonProperty("total") @ExcludeMissing fun _total() = total

    @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

    /** A URL to a PDF of the credit note. */
    @JsonProperty("credit_note_pdf") @ExcludeMissing fun _creditNotePdf() = creditNotePdf

    /** Any credited amount from the applied minimum on the invoice. */
    @JsonProperty("minimum_amount_refunded")
    @ExcludeMissing
    fun _minimumAmountRefunded() = minimumAmountRefunded

    /** Any discounts applied on the original invoice. */
    @JsonProperty("discounts") @ExcludeMissing fun _discounts() = discounts

    /** The maximum amount applied on the original invoice */
    @JsonProperty("maximum_amount_adjustment")
    @ExcludeMissing
    fun _maximumAmountAdjustment() = maximumAmountAdjustment

    /** All of the line items associated with this credit note. */
    @JsonProperty("line_items") @ExcludeMissing fun _lineItems() = lineItems

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CreditNote = apply {
        if (!validated) {
            id()
            createdAt()
            voidedAt()
            creditNoteNumber()
            invoiceId()
            memo()
            reason()
            type()
            subtotal()
            total()
            customer().validate()
            creditNotePdf()
            minimumAmountRefunded()
            discounts().map { it.forEach { it.validate() } }
            maximumAmountAdjustment().map { it.validate() }
            lineItems().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var voidedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var creditNoteNumber: JsonField<String> = JsonMissing.of()
        private var invoiceId: JsonField<String> = JsonMissing.of()
        private var memo: JsonField<String> = JsonMissing.of()
        private var reason: JsonField<Reason> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var subtotal: JsonField<String> = JsonMissing.of()
        private var total: JsonField<String> = JsonMissing.of()
        private var customer: JsonField<Customer> = JsonMissing.of()
        private var creditNotePdf: JsonField<String> = JsonMissing.of()
        private var minimumAmountRefunded: JsonField<String> = JsonMissing.of()
        private var discounts: JsonField<List<Discount>> = JsonMissing.of()
        private var maximumAmountAdjustment: JsonField<MaximumAmountAdjustment> = JsonMissing.of()
        private var lineItems: JsonField<List<LineItem>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditNote: CreditNote) = apply {
            id = creditNote.id
            createdAt = creditNote.createdAt
            voidedAt = creditNote.voidedAt
            creditNoteNumber = creditNote.creditNoteNumber
            invoiceId = creditNote.invoiceId
            memo = creditNote.memo
            reason = creditNote.reason
            type = creditNote.type
            subtotal = creditNote.subtotal
            total = creditNote.total
            customer = creditNote.customer
            creditNotePdf = creditNote.creditNotePdf
            minimumAmountRefunded = creditNote.minimumAmountRefunded
            discounts = creditNote.discounts
            maximumAmountAdjustment = creditNote.maximumAmountAdjustment
            lineItems = creditNote.lineItems
            additionalProperties = creditNote.additionalProperties.toMutableMap()
        }

        /** The Orb id of this credit note. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Orb id of this credit note. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The time at which the credit note was voided in Orb, if applicable. */
        fun voidedAt(voidedAt: OffsetDateTime) = voidedAt(JsonField.of(voidedAt))

        /** The time at which the credit note was voided in Orb, if applicable. */
        fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

        /** The unique identifier for credit notes. */
        fun creditNoteNumber(creditNoteNumber: String) =
            creditNoteNumber(JsonField.of(creditNoteNumber))

        /** The unique identifier for credit notes. */
        fun creditNoteNumber(creditNoteNumber: JsonField<String>) = apply {
            this.creditNoteNumber = creditNoteNumber
        }

        /** The id of the invoice resource that this credit note is applied to. */
        fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

        /** The id of the invoice resource that this credit note is applied to. */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        /** An optional memo supplied on the credit note. */
        fun memo(memo: String) = memo(JsonField.of(memo))

        /** An optional memo supplied on the credit note. */
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        fun reason(reason: Reason) = reason(JsonField.of(reason))

        fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The total prior to any creditable invoice-level discounts or minimums. */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /** The total prior to any creditable invoice-level discounts or minimums. */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        /** The total including creditable invoice-level discounts or minimums, and tax. */
        fun total(total: String) = total(JsonField.of(total))

        /** The total including creditable invoice-level discounts or minimums, and tax. */
        fun total(total: JsonField<String>) = apply { this.total = total }

        fun customer(customer: Customer) = customer(JsonField.of(customer))

        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /** A URL to a PDF of the credit note. */
        fun creditNotePdf(creditNotePdf: String) = creditNotePdf(JsonField.of(creditNotePdf))

        /** A URL to a PDF of the credit note. */
        fun creditNotePdf(creditNotePdf: JsonField<String>) = apply {
            this.creditNotePdf = creditNotePdf
        }

        /** Any credited amount from the applied minimum on the invoice. */
        fun minimumAmountRefunded(minimumAmountRefunded: String) =
            minimumAmountRefunded(JsonField.of(minimumAmountRefunded))

        /** Any credited amount from the applied minimum on the invoice. */
        fun minimumAmountRefunded(minimumAmountRefunded: JsonField<String>) = apply {
            this.minimumAmountRefunded = minimumAmountRefunded
        }

        /** Any discounts applied on the original invoice. */
        fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

        /** Any discounts applied on the original invoice. */
        fun discounts(discounts: JsonField<List<Discount>>) = apply { this.discounts = discounts }

        /** The maximum amount applied on the original invoice */
        fun maximumAmountAdjustment(maximumAmountAdjustment: MaximumAmountAdjustment) =
            maximumAmountAdjustment(JsonField.of(maximumAmountAdjustment))

        /** The maximum amount applied on the original invoice */
        fun maximumAmountAdjustment(maximumAmountAdjustment: JsonField<MaximumAmountAdjustment>) =
            apply {
                this.maximumAmountAdjustment = maximumAmountAdjustment
            }

        /** All of the line items associated with this credit note. */
        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        /** All of the line items associated with this credit note. */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply { this.lineItems = lineItems }

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
                id,
                createdAt,
                voidedAt,
                creditNoteNumber,
                invoiceId,
                memo,
                reason,
                type,
                subtotal,
                total,
                customer,
                creditNotePdf,
                minimumAmountRefunded,
                discounts.map { it.toImmutable() },
                maximumAmountAdjustment,
                lineItems.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
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

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId() = externalCustomerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Customer = apply {
            if (!validated) {
                id()
                externalCustomerId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customer: Customer) = apply {
                id = customer.id
                externalCustomerId = customer.externalCustomerId
                additionalProperties = customer.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun externalCustomerId(externalCustomerId: String) =
                externalCustomerId(JsonField.of(externalCustomerId))

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
                    id,
                    externalCustomerId,
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
    class LineItem
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subtotal")
        @ExcludeMissing
        private val subtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("discounts")
        @ExcludeMissing
        private val discounts: JsonField<List<Discount>> = JsonMissing.of(),
        @JsonProperty("tax_amounts")
        @ExcludeMissing
        private val taxAmounts: JsonField<List<TaxAmount>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Orb id of this resource. */
        fun id(): String = id.getRequired("id")

        /** The name of the corresponding invoice line item. */
        fun name(): String = name.getRequired("name")

        /** The amount of the line item, excluding any line item minimums and discounts. */
        fun subtotal(): String = subtotal.getRequired("subtotal")

        /** The amount of the line item, including any line item minimums and discounts. */
        fun amount(): String = amount.getRequired("amount")

        /** An optional quantity credited. */
        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        /** Any line item discounts from the invoice's line item. */
        fun discounts(): Optional<List<Discount>> =
            Optional.ofNullable(discounts.getNullable("discounts"))

        /** Any tax amounts applied onto the line item. */
        fun taxAmounts(): List<TaxAmount> = taxAmounts.getRequired("tax_amounts")

        /** The Orb id of this resource. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The name of the corresponding invoice line item. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The amount of the line item, excluding any line item minimums and discounts. */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

        /** The amount of the line item, including any line item minimums and discounts. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** An optional quantity credited. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        /** Any line item discounts from the invoice's line item. */
        @JsonProperty("discounts") @ExcludeMissing fun _discounts() = discounts

        /** Any tax amounts applied onto the line item. */
        @JsonProperty("tax_amounts") @ExcludeMissing fun _taxAmounts() = taxAmounts

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LineItem = apply {
            if (!validated) {
                id()
                name()
                subtotal()
                amount()
                quantity()
                discounts().map { it.forEach { it.validate() } }
                taxAmounts().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var subtotal: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<String> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var discounts: JsonField<List<Discount>> = JsonMissing.of()
            private var taxAmounts: JsonField<List<TaxAmount>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                id = lineItem.id
                name = lineItem.name
                subtotal = lineItem.subtotal
                amount = lineItem.amount
                quantity = lineItem.quantity
                discounts = lineItem.discounts
                taxAmounts = lineItem.taxAmounts
                additionalProperties = lineItem.additionalProperties.toMutableMap()
            }

            /** The Orb id of this resource. */
            fun id(id: String) = id(JsonField.of(id))

            /** The Orb id of this resource. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The name of the corresponding invoice line item. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the corresponding invoice line item. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The amount of the line item, excluding any line item minimums and discounts. */
            fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

            /** The amount of the line item, excluding any line item minimums and discounts. */
            fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

            /** The amount of the line item, including any line item minimums and discounts. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /** The amount of the line item, including any line item minimums and discounts. */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** An optional quantity credited. */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /** An optional quantity credited. */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** Any line item discounts from the invoice's line item. */
            fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

            /** Any line item discounts from the invoice's line item. */
            fun discounts(discounts: JsonField<List<Discount>>) = apply {
                this.discounts = discounts
            }

            /** Any tax amounts applied onto the line item. */
            fun taxAmounts(taxAmounts: List<TaxAmount>) = taxAmounts(JsonField.of(taxAmounts))

            /** Any tax amounts applied onto the line item. */
            fun taxAmounts(taxAmounts: JsonField<List<TaxAmount>>) = apply {
                this.taxAmounts = taxAmounts
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
                    id,
                    name,
                    subtotal,
                    amount,
                    quantity,
                    discounts.map { it.toImmutable() },
                    taxAmounts.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class TaxAmount
        @JsonCreator
        private constructor(
            @JsonProperty("tax_rate_description")
            @ExcludeMissing
            private val taxRateDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_rate_percentage")
            @ExcludeMissing
            private val taxRatePercentage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The human-readable description of the applied tax rate. */
            fun taxRateDescription(): String =
                taxRateDescription.getRequired("tax_rate_description")

            /** The tax rate percentage, out of 100. */
            fun taxRatePercentage(): Optional<String> =
                Optional.ofNullable(taxRatePercentage.getNullable("tax_rate_percentage"))

            /** The amount of additional tax incurred by this tax rate. */
            fun amount(): String = amount.getRequired("amount")

            /** The human-readable description of the applied tax rate. */
            @JsonProperty("tax_rate_description")
            @ExcludeMissing
            fun _taxRateDescription() = taxRateDescription

            /** The tax rate percentage, out of 100. */
            @JsonProperty("tax_rate_percentage")
            @ExcludeMissing
            fun _taxRatePercentage() = taxRatePercentage

            /** The amount of additional tax incurred by this tax rate. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TaxAmount = apply {
                if (!validated) {
                    taxRateDescription()
                    taxRatePercentage()
                    amount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var taxRateDescription: JsonField<String> = JsonMissing.of()
                private var taxRatePercentage: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(taxAmount: TaxAmount) = apply {
                    taxRateDescription = taxAmount.taxRateDescription
                    taxRatePercentage = taxAmount.taxRatePercentage
                    amount = taxAmount.amount
                    additionalProperties = taxAmount.additionalProperties.toMutableMap()
                }

                /** The human-readable description of the applied tax rate. */
                fun taxRateDescription(taxRateDescription: String) =
                    taxRateDescription(JsonField.of(taxRateDescription))

                /** The human-readable description of the applied tax rate. */
                fun taxRateDescription(taxRateDescription: JsonField<String>) = apply {
                    this.taxRateDescription = taxRateDescription
                }

                /** The tax rate percentage, out of 100. */
                fun taxRatePercentage(taxRatePercentage: String) =
                    taxRatePercentage(JsonField.of(taxRatePercentage))

                /** The tax rate percentage, out of 100. */
                fun taxRatePercentage(taxRatePercentage: JsonField<String>) = apply {
                    this.taxRatePercentage = taxRatePercentage
                }

                /** The amount of additional tax incurred by this tax rate. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The amount of additional tax incurred by this tax rate. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

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
                        taxRateDescription,
                        taxRatePercentage,
                        amount,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TaxAmount && taxRateDescription == other.taxRateDescription && taxRatePercentage == other.taxRatePercentage && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(taxRateDescription, taxRatePercentage, amount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TaxAmount{taxRateDescription=$taxRateDescription, taxRatePercentage=$taxRatePercentage, amount=$amount, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Discount
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount_type")
            @ExcludeMissing
            private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("amount_discount")
            @ExcludeMissing
            private val amountDiscount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount_applied")
            @ExcludeMissing
            private val amountApplied: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            fun amountDiscount(): Optional<String> =
                Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

            fun amountApplied(): String = amountApplied.getRequired("amount_applied")

            fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount() = percentageDiscount

            @JsonProperty("amount_discount") @ExcludeMissing fun _amountDiscount() = amountDiscount

            @JsonProperty("amount_applied") @ExcludeMissing fun _amountApplied() = amountApplied

            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Discount = apply {
                if (!validated) {
                    id()
                    discountType()
                    percentageDiscount()
                    amountDiscount()
                    amountApplied()
                    reason()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var discountType: JsonField<DiscountType> = JsonMissing.of()
                private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                private var amountDiscount: JsonField<String> = JsonMissing.of()
                private var amountApplied: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(discount: Discount) = apply {
                    id = discount.id
                    discountType = discount.discountType
                    percentageDiscount = discount.percentageDiscount
                    amountDiscount = discount.amountDiscount
                    amountApplied = discount.amountApplied
                    reason = discount.reason
                    appliesToPriceIds = discount.appliesToPriceIds
                    additionalProperties = discount.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                fun percentageDiscount(percentageDiscount: Double) =
                    percentageDiscount(JsonField.of(percentageDiscount))

                fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                    this.percentageDiscount = percentageDiscount
                }

                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                fun amountApplied(amountApplied: String) =
                    amountApplied(JsonField.of(amountApplied))

                fun amountApplied(amountApplied: JsonField<String>) = apply {
                    this.amountApplied = amountApplied
                }

                fun reason(reason: String) = reason(JsonField.of(reason))

                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
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

                fun build(): Discount =
                    Discount(
                        id,
                        discountType,
                        percentageDiscount,
                        amountDiscount,
                        amountApplied,
                        reason,
                        appliesToPriceIds.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PERCENTAGE = of("percentage")

                    @JvmField val AMOUNT = of("amount")

                    @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                }

                enum class Known {
                    PERCENTAGE,
                    AMOUNT,
                }

                enum class Value {
                    PERCENTAGE,
                    AMOUNT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PERCENTAGE -> Value.PERCENTAGE
                        AMOUNT -> Value.AMOUNT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PERCENTAGE -> Known.PERCENTAGE
                        AMOUNT -> Known.AMOUNT
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Discount && id == other.id && discountType == other.discountType && percentageDiscount == other.percentageDiscount && amountDiscount == other.amountDiscount && amountApplied == other.amountApplied && reason == other.reason && appliesToPriceIds == other.appliesToPriceIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, discountType, percentageDiscount, amountDiscount, amountApplied, reason, appliesToPriceIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Discount{id=$id, discountType=$discountType, percentageDiscount=$percentageDiscount, amountDiscount=$amountDiscount, amountApplied=$amountApplied, reason=$reason, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && id == other.id && name == other.name && subtotal == other.subtotal && amount == other.amount && quantity == other.quantity && discounts == other.discounts && taxAmounts == other.taxAmounts && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, name, subtotal, amount, quantity, discounts, taxAmounts, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{id=$id, name=$name, subtotal=$subtotal, amount=$amount, quantity=$quantity, discounts=$discounts, taxAmounts=$taxAmounts, additionalProperties=$additionalProperties}"
    }

    /** The maximum amount applied on the original invoice */
    @NoAutoDetect
    class MaximumAmountAdjustment
    @JsonCreator
    private constructor(
        @JsonProperty("discount_type")
        @ExcludeMissing
        private val discountType: JsonField<DiscountType> = JsonMissing.of(),
        @JsonProperty("percentage_discount")
        @ExcludeMissing
        private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount_applied")
        @ExcludeMissing
        private val amountApplied: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applies_to_prices")
        @ExcludeMissing
        private val appliesToPrices: JsonField<List<AppliesToPrice>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun discountType(): DiscountType = discountType.getRequired("discount_type")

        fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

        fun amountApplied(): String = amountApplied.getRequired("amount_applied")

        fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

        fun appliesToPrices(): Optional<List<AppliesToPrice>> =
            Optional.ofNullable(appliesToPrices.getNullable("applies_to_prices"))

        @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

        @JsonProperty("percentage_discount")
        @ExcludeMissing
        fun _percentageDiscount() = percentageDiscount

        @JsonProperty("amount_applied") @ExcludeMissing fun _amountApplied() = amountApplied

        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonProperty("applies_to_prices") @ExcludeMissing fun _appliesToPrices() = appliesToPrices

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): MaximumAmountAdjustment = apply {
            if (!validated) {
                discountType()
                percentageDiscount()
                amountApplied()
                reason()
                appliesToPrices().map { it.forEach { it.validate() } }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var discountType: JsonField<DiscountType> = JsonMissing.of()
            private var percentageDiscount: JsonField<Double> = JsonMissing.of()
            private var amountApplied: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var appliesToPrices: JsonField<List<AppliesToPrice>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(maximumAmountAdjustment: MaximumAmountAdjustment) = apply {
                discountType = maximumAmountAdjustment.discountType
                percentageDiscount = maximumAmountAdjustment.percentageDiscount
                amountApplied = maximumAmountAdjustment.amountApplied
                reason = maximumAmountAdjustment.reason
                appliesToPrices = maximumAmountAdjustment.appliesToPrices
                additionalProperties = maximumAmountAdjustment.additionalProperties.toMutableMap()
            }

            fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

            fun discountType(discountType: JsonField<DiscountType>) = apply {
                this.discountType = discountType
            }

            fun percentageDiscount(percentageDiscount: Double) =
                percentageDiscount(JsonField.of(percentageDiscount))

            fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                this.percentageDiscount = percentageDiscount
            }

            fun amountApplied(amountApplied: String) = amountApplied(JsonField.of(amountApplied))

            fun amountApplied(amountApplied: JsonField<String>) = apply {
                this.amountApplied = amountApplied
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun appliesToPrices(appliesToPrices: List<AppliesToPrice>) =
                appliesToPrices(JsonField.of(appliesToPrices))

            fun appliesToPrices(appliesToPrices: JsonField<List<AppliesToPrice>>) = apply {
                this.appliesToPrices = appliesToPrices
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

            fun build(): MaximumAmountAdjustment =
                MaximumAmountAdjustment(
                    discountType,
                    percentageDiscount,
                    amountApplied,
                    reason,
                    appliesToPrices.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class DiscountType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PERCENTAGE = of("percentage")

                @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
            }

            enum class Known {
                PERCENTAGE,
            }

            enum class Value {
                PERCENTAGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PERCENTAGE -> Value.PERCENTAGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PERCENTAGE -> Known.PERCENTAGE
                    else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class AppliesToPrice
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AppliesToPrice = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(appliesToPrice: AppliesToPrice) = apply {
                    id = appliesToPrice.id
                    name = appliesToPrice.name
                    additionalProperties = appliesToPrice.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): AppliesToPrice =
                    AppliesToPrice(
                        id,
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AppliesToPrice && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AppliesToPrice{id=$id, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MaximumAmountAdjustment && discountType == other.discountType && percentageDiscount == other.percentageDiscount && amountApplied == other.amountApplied && reason == other.reason && appliesToPrices == other.appliesToPrices && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(discountType, percentageDiscount, amountApplied, reason, appliesToPrices, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MaximumAmountAdjustment{discountType=$discountType, percentageDiscount=$percentageDiscount, amountApplied=$amountApplied, reason=$reason, appliesToPrices=$appliesToPrices, additionalProperties=$additionalProperties}"
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DUPLICATE = of("Duplicate")

            @JvmField val FRAUDULENT = of("Fraudulent")

            @JvmField val ORDER_CHANGE = of("Order change")

            @JvmField val PRODUCT_UNSATISFACTORY = of("Product unsatisfactory")

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            DUPLICATE,
            FRAUDULENT,
            ORDER_CHANGE,
            PRODUCT_UNSATISFACTORY,
        }

        enum class Value {
            DUPLICATE,
            FRAUDULENT,
            ORDER_CHANGE,
            PRODUCT_UNSATISFACTORY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DUPLICATE -> Value.DUPLICATE
                FRAUDULENT -> Value.FRAUDULENT
                ORDER_CHANGE -> Value.ORDER_CHANGE
                PRODUCT_UNSATISFACTORY -> Value.PRODUCT_UNSATISFACTORY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DUPLICATE -> Known.DUPLICATE
                FRAUDULENT -> Known.FRAUDULENT
                ORDER_CHANGE -> Known.ORDER_CHANGE
                PRODUCT_UNSATISFACTORY -> Known.PRODUCT_UNSATISFACTORY
                else -> throw OrbInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val REFUND = of("refund")

            @JvmField val ADJUSTMENT = of("adjustment")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            REFUND,
            ADJUSTMENT,
        }

        enum class Value {
            REFUND,
            ADJUSTMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                REFUND -> Value.REFUND
                ADJUSTMENT -> Value.ADJUSTMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                REFUND -> Known.REFUND
                ADJUSTMENT -> Known.ADJUSTMENT
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

    @NoAutoDetect
    class Discount
    @JsonCreator
    private constructor(
        @JsonProperty("discount_type")
        @ExcludeMissing
        private val discountType: JsonField<DiscountType> = JsonMissing.of(),
        @JsonProperty("percentage_discount")
        @ExcludeMissing
        private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount_applied")
        @ExcludeMissing
        private val amountApplied: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applies_to_prices")
        @ExcludeMissing
        private val appliesToPrices: JsonField<List<AppliesToPrice>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun discountType(): DiscountType = discountType.getRequired("discount_type")

        fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

        fun amountApplied(): String = amountApplied.getRequired("amount_applied")

        fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

        fun appliesToPrices(): Optional<List<AppliesToPrice>> =
            Optional.ofNullable(appliesToPrices.getNullable("applies_to_prices"))

        @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

        @JsonProperty("percentage_discount")
        @ExcludeMissing
        fun _percentageDiscount() = percentageDiscount

        @JsonProperty("amount_applied") @ExcludeMissing fun _amountApplied() = amountApplied

        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonProperty("applies_to_prices") @ExcludeMissing fun _appliesToPrices() = appliesToPrices

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Discount = apply {
            if (!validated) {
                discountType()
                percentageDiscount()
                amountApplied()
                reason()
                appliesToPrices().map { it.forEach { it.validate() } }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var discountType: JsonField<DiscountType> = JsonMissing.of()
            private var percentageDiscount: JsonField<Double> = JsonMissing.of()
            private var amountApplied: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var appliesToPrices: JsonField<List<AppliesToPrice>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(discount: Discount) = apply {
                discountType = discount.discountType
                percentageDiscount = discount.percentageDiscount
                amountApplied = discount.amountApplied
                reason = discount.reason
                appliesToPrices = discount.appliesToPrices
                additionalProperties = discount.additionalProperties.toMutableMap()
            }

            fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

            fun discountType(discountType: JsonField<DiscountType>) = apply {
                this.discountType = discountType
            }

            fun percentageDiscount(percentageDiscount: Double) =
                percentageDiscount(JsonField.of(percentageDiscount))

            fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                this.percentageDiscount = percentageDiscount
            }

            fun amountApplied(amountApplied: String) = amountApplied(JsonField.of(amountApplied))

            fun amountApplied(amountApplied: JsonField<String>) = apply {
                this.amountApplied = amountApplied
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun appliesToPrices(appliesToPrices: List<AppliesToPrice>) =
                appliesToPrices(JsonField.of(appliesToPrices))

            fun appliesToPrices(appliesToPrices: JsonField<List<AppliesToPrice>>) = apply {
                this.appliesToPrices = appliesToPrices
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

            fun build(): Discount =
                Discount(
                    discountType,
                    percentageDiscount,
                    amountApplied,
                    reason,
                    appliesToPrices.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class DiscountType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PERCENTAGE = of("percentage")

                @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
            }

            enum class Known {
                PERCENTAGE,
            }

            enum class Value {
                PERCENTAGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PERCENTAGE -> Value.PERCENTAGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PERCENTAGE -> Known.PERCENTAGE
                    else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class AppliesToPrice
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun name(): String = name.getRequired("name")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AppliesToPrice = apply {
                if (!validated) {
                    id()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(appliesToPrice: AppliesToPrice) = apply {
                    id = appliesToPrice.id
                    name = appliesToPrice.name
                    additionalProperties = appliesToPrice.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): AppliesToPrice =
                    AppliesToPrice(
                        id,
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AppliesToPrice && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AppliesToPrice{id=$id, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Discount && discountType == other.discountType && percentageDiscount == other.percentageDiscount && amountApplied == other.amountApplied && reason == other.reason && appliesToPrices == other.appliesToPrices && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(discountType, percentageDiscount, amountApplied, reason, appliesToPrices, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, amountApplied=$amountApplied, reason=$reason, appliesToPrices=$appliesToPrices, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNote && id == other.id && createdAt == other.createdAt && voidedAt == other.voidedAt && creditNoteNumber == other.creditNoteNumber && invoiceId == other.invoiceId && memo == other.memo && reason == other.reason && type == other.type && subtotal == other.subtotal && total == other.total && customer == other.customer && creditNotePdf == other.creditNotePdf && minimumAmountRefunded == other.minimumAmountRefunded && discounts == other.discounts && maximumAmountAdjustment == other.maximumAmountAdjustment && lineItems == other.lineItems && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, voidedAt, creditNoteNumber, invoiceId, memo, reason, type, subtotal, total, customer, creditNotePdf, minimumAmountRefunded, discounts, maximumAmountAdjustment, lineItems, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditNote{id=$id, createdAt=$createdAt, voidedAt=$voidedAt, creditNoteNumber=$creditNoteNumber, invoiceId=$invoiceId, memo=$memo, reason=$reason, type=$type, subtotal=$subtotal, total=$total, customer=$customer, creditNotePdf=$creditNotePdf, minimumAmountRefunded=$minimumAmountRefunded, discounts=$discounts, maximumAmountAdjustment=$maximumAmountAdjustment, lineItems=$lineItems, additionalProperties=$additionalProperties}"
}
