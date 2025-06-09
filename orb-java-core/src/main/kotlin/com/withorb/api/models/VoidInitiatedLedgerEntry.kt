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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VoidInitiatedLedgerEntry
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditBlock: JsonField<AffectedBlock>,
    private val currency: JsonField<String>,
    private val customer: JsonField<CustomerMinified>,
    private val description: JsonField<String>,
    private val endingBalance: JsonField<Double>,
    private val entryStatus: JsonField<EntryStatus>,
    private val entryType: JsonField<EntryType>,
    private val ledgerSequenceNumber: JsonField<Long>,
    private val metadata: JsonField<Metadata>,
    private val newBlockExpiryDate: JsonField<OffsetDateTime>,
    private val startingBalance: JsonField<Double>,
    private val voidAmount: JsonField<Double>,
    private val voidReason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_block")
        @ExcludeMissing
        creditBlock: JsonField<AffectedBlock> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        customer: JsonField<CustomerMinified> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        endingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("entry_status")
        @ExcludeMissing
        entryStatus: JsonField<EntryStatus> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("ledger_sequence_number")
        @ExcludeMissing
        ledgerSequenceNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("new_block_expiry_date")
        @ExcludeMissing
        newBlockExpiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        startingBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("void_amount")
        @ExcludeMissing
        voidAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("void_reason")
        @ExcludeMissing
        voidReason: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        createdAt,
        creditBlock,
        currency,
        customer,
        description,
        endingBalance,
        entryStatus,
        entryType,
        ledgerSequenceNumber,
        metadata,
        newBlockExpiryDate,
        startingBalance,
        voidAmount,
        voidReason,
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
    fun amount(): Double = amount.getRequired("amount")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditBlock(): AffectedBlock = creditBlock.getRequired("credit_block")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): CustomerMinified = customer.getRequired("customer")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endingBalance(): Double = endingBalance.getRequired("ending_balance")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entryStatus(): EntryStatus = entryStatus.getRequired("entry_status")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entryType(): EntryType = entryType.getRequired("entry_type")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerSequenceNumber(): Long = ledgerSequenceNumber.getRequired("ledger_sequence_number")

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
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun newBlockExpiryDate(): OffsetDateTime =
        newBlockExpiryDate.getRequired("new_block_expiry_date")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingBalance(): Double = startingBalance.getRequired("starting_balance")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun voidAmount(): Double = voidAmount.getRequired("void_amount")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun voidReason(): Optional<String> = voidReason.getOptional("void_reason")

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
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [creditBlock].
     *
     * Unlike [creditBlock], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_block")
    @ExcludeMissing
    fun _creditBlock(): JsonField<AffectedBlock> = creditBlock

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
    @JsonProperty("customer")
    @ExcludeMissing
    fun _customer(): JsonField<CustomerMinified> = customer

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [endingBalance].
     *
     * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_balance")
    @ExcludeMissing
    fun _endingBalance(): JsonField<Double> = endingBalance

    /**
     * Returns the raw JSON value of [entryStatus].
     *
     * Unlike [entryStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entry_status")
    @ExcludeMissing
    fun _entryStatus(): JsonField<EntryStatus> = entryStatus

    /**
     * Returns the raw JSON value of [entryType].
     *
     * Unlike [entryType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entry_type") @ExcludeMissing fun _entryType(): JsonField<EntryType> = entryType

    /**
     * Returns the raw JSON value of [ledgerSequenceNumber].
     *
     * Unlike [ledgerSequenceNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ledger_sequence_number")
    @ExcludeMissing
    fun _ledgerSequenceNumber(): JsonField<Long> = ledgerSequenceNumber

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [newBlockExpiryDate].
     *
     * Unlike [newBlockExpiryDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("new_block_expiry_date")
    @ExcludeMissing
    fun _newBlockExpiryDate(): JsonField<OffsetDateTime> = newBlockExpiryDate

    /**
     * Returns the raw JSON value of [startingBalance].
     *
     * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_balance")
    @ExcludeMissing
    fun _startingBalance(): JsonField<Double> = startingBalance

    /**
     * Returns the raw JSON value of [voidAmount].
     *
     * Unlike [voidAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("void_amount") @ExcludeMissing fun _voidAmount(): JsonField<Double> = voidAmount

    /**
     * Returns the raw JSON value of [voidReason].
     *
     * Unlike [voidReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("void_reason") @ExcludeMissing fun _voidReason(): JsonField<String> = voidReason

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
         * Returns a mutable builder for constructing an instance of [VoidInitiatedLedgerEntry].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .createdAt()
         * .creditBlock()
         * .currency()
         * .customer()
         * .description()
         * .endingBalance()
         * .entryStatus()
         * .entryType()
         * .ledgerSequenceNumber()
         * .metadata()
         * .newBlockExpiryDate()
         * .startingBalance()
         * .voidAmount()
         * .voidReason()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VoidInitiatedLedgerEntry]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Double>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditBlock: JsonField<AffectedBlock>? = null
        private var currency: JsonField<String>? = null
        private var customer: JsonField<CustomerMinified>? = null
        private var description: JsonField<String>? = null
        private var endingBalance: JsonField<Double>? = null
        private var entryStatus: JsonField<EntryStatus>? = null
        private var entryType: JsonField<EntryType>? = null
        private var ledgerSequenceNumber: JsonField<Long>? = null
        private var metadata: JsonField<Metadata>? = null
        private var newBlockExpiryDate: JsonField<OffsetDateTime>? = null
        private var startingBalance: JsonField<Double>? = null
        private var voidAmount: JsonField<Double>? = null
        private var voidReason: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(voidInitiatedLedgerEntry: VoidInitiatedLedgerEntry) = apply {
            id = voidInitiatedLedgerEntry.id
            amount = voidInitiatedLedgerEntry.amount
            createdAt = voidInitiatedLedgerEntry.createdAt
            creditBlock = voidInitiatedLedgerEntry.creditBlock
            currency = voidInitiatedLedgerEntry.currency
            customer = voidInitiatedLedgerEntry.customer
            description = voidInitiatedLedgerEntry.description
            endingBalance = voidInitiatedLedgerEntry.endingBalance
            entryStatus = voidInitiatedLedgerEntry.entryStatus
            entryType = voidInitiatedLedgerEntry.entryType
            ledgerSequenceNumber = voidInitiatedLedgerEntry.ledgerSequenceNumber
            metadata = voidInitiatedLedgerEntry.metadata
            newBlockExpiryDate = voidInitiatedLedgerEntry.newBlockExpiryDate
            startingBalance = voidInitiatedLedgerEntry.startingBalance
            voidAmount = voidInitiatedLedgerEntry.voidAmount
            voidReason = voidInitiatedLedgerEntry.voidReason
            additionalProperties = voidInitiatedLedgerEntry.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun creditBlock(creditBlock: AffectedBlock) = creditBlock(JsonField.of(creditBlock))

        /**
         * Sets [Builder.creditBlock] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditBlock] with a well-typed [AffectedBlock] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditBlock(creditBlock: JsonField<AffectedBlock>) = apply {
            this.creditBlock = creditBlock
        }

        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun customer(customer: CustomerMinified) = customer(JsonField.of(customer))

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [CustomerMinified] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customer(customer: JsonField<CustomerMinified>) = apply { this.customer = customer }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun endingBalance(endingBalance: Double) = endingBalance(JsonField.of(endingBalance))

        /**
         * Sets [Builder.endingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBalance] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endingBalance(endingBalance: JsonField<Double>) = apply {
            this.endingBalance = endingBalance
        }

        fun entryStatus(entryStatus: EntryStatus) = entryStatus(JsonField.of(entryStatus))

        /**
         * Sets [Builder.entryStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entryStatus] with a well-typed [EntryStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entryStatus(entryStatus: JsonField<EntryStatus>) = apply {
            this.entryStatus = entryStatus
        }

        fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

        /**
         * Sets [Builder.entryType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entryType] with a well-typed [EntryType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

        fun ledgerSequenceNumber(ledgerSequenceNumber: Long) =
            ledgerSequenceNumber(JsonField.of(ledgerSequenceNumber))

        /**
         * Sets [Builder.ledgerSequenceNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerSequenceNumber] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerSequenceNumber(ledgerSequenceNumber: JsonField<Long>) = apply {
            this.ledgerSequenceNumber = ledgerSequenceNumber
        }

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

        fun newBlockExpiryDate(newBlockExpiryDate: OffsetDateTime) =
            newBlockExpiryDate(JsonField.of(newBlockExpiryDate))

        /**
         * Sets [Builder.newBlockExpiryDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newBlockExpiryDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun newBlockExpiryDate(newBlockExpiryDate: JsonField<OffsetDateTime>) = apply {
            this.newBlockExpiryDate = newBlockExpiryDate
        }

        fun startingBalance(startingBalance: Double) =
            startingBalance(JsonField.of(startingBalance))

        /**
         * Sets [Builder.startingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingBalance] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startingBalance(startingBalance: JsonField<Double>) = apply {
            this.startingBalance = startingBalance
        }

        fun voidAmount(voidAmount: Double) = voidAmount(JsonField.of(voidAmount))

        /**
         * Sets [Builder.voidAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voidAmount] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voidAmount(voidAmount: JsonField<Double>) = apply { this.voidAmount = voidAmount }

        fun voidReason(voidReason: String?) = voidReason(JsonField.ofNullable(voidReason))

        /** Alias for calling [Builder.voidReason] with `voidReason.orElse(null)`. */
        fun voidReason(voidReason: Optional<String>) = voidReason(voidReason.getOrNull())

        /**
         * Sets [Builder.voidReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voidReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voidReason(voidReason: JsonField<String>) = apply { this.voidReason = voidReason }

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
         * Returns an immutable instance of [VoidInitiatedLedgerEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .createdAt()
         * .creditBlock()
         * .currency()
         * .customer()
         * .description()
         * .endingBalance()
         * .entryStatus()
         * .entryType()
         * .ledgerSequenceNumber()
         * .metadata()
         * .newBlockExpiryDate()
         * .startingBalance()
         * .voidAmount()
         * .voidReason()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VoidInitiatedLedgerEntry =
            VoidInitiatedLedgerEntry(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("createdAt", createdAt),
                checkRequired("creditBlock", creditBlock),
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("description", description),
                checkRequired("endingBalance", endingBalance),
                checkRequired("entryStatus", entryStatus),
                checkRequired("entryType", entryType),
                checkRequired("ledgerSequenceNumber", ledgerSequenceNumber),
                checkRequired("metadata", metadata),
                checkRequired("newBlockExpiryDate", newBlockExpiryDate),
                checkRequired("startingBalance", startingBalance),
                checkRequired("voidAmount", voidAmount),
                checkRequired("voidReason", voidReason),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VoidInitiatedLedgerEntry = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        createdAt()
        creditBlock().validate()
        currency()
        customer().validate()
        description()
        endingBalance()
        entryStatus().validate()
        entryType().validate()
        ledgerSequenceNumber()
        metadata().validate()
        newBlockExpiryDate()
        startingBalance()
        voidAmount()
        voidReason()
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
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (creditBlock.asKnown().getOrNull()?.validity() ?: 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (customer.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (endingBalance.asKnown().isPresent) 1 else 0) +
            (entryStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (entryType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ledgerSequenceNumber.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (newBlockExpiryDate.asKnown().isPresent) 1 else 0) +
            (if (startingBalance.asKnown().isPresent) 1 else 0) +
            (if (voidAmount.asKnown().isPresent) 1 else 0) +
            (if (voidReason.asKnown().isPresent) 1 else 0)

    class EntryStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val COMMITTED = of("committed")

            @JvmField val PENDING = of("pending")

            @JvmStatic fun of(value: String) = EntryStatus(JsonField.of(value))
        }

        /** An enum containing [EntryStatus]'s known values. */
        enum class Known {
            COMMITTED,
            PENDING,
        }

        /**
         * An enum containing [EntryStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EntryStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMMITTED,
            PENDING,
            /**
             * An enum member indicating that [EntryStatus] was instantiated with an unknown value.
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
                COMMITTED -> Value.COMMITTED
                PENDING -> Value.PENDING
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
                COMMITTED -> Known.COMMITTED
                PENDING -> Known.PENDING
                else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
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

        fun validate(): EntryStatus = apply {
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

            return /* spotless:off */ other is EntryStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class EntryType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val VOID_INITIATED = of("void_initiated")

            @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
        }

        /** An enum containing [EntryType]'s known values. */
        enum class Known {
            VOID_INITIATED
        }

        /**
         * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EntryType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VOID_INITIATED,
            /**
             * An enum member indicating that [EntryType] was instantiated with an unknown value.
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
                VOID_INITIATED -> Value.VOID_INITIATED
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
                VOID_INITIATED -> Known.VOID_INITIATED
                else -> throw OrbInvalidDataException("Unknown EntryType: $value")
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

        fun validate(): EntryType = apply {
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

            return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VoidInitiatedLedgerEntry && id == other.id && amount == other.amount && createdAt == other.createdAt && creditBlock == other.creditBlock && currency == other.currency && customer == other.customer && description == other.description && endingBalance == other.endingBalance && entryStatus == other.entryStatus && entryType == other.entryType && ledgerSequenceNumber == other.ledgerSequenceNumber && metadata == other.metadata && newBlockExpiryDate == other.newBlockExpiryDate && startingBalance == other.startingBalance && voidAmount == other.voidAmount && voidReason == other.voidReason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, creditBlock, currency, customer, description, endingBalance, entryStatus, entryType, ledgerSequenceNumber, metadata, newBlockExpiryDate, startingBalance, voidAmount, voidReason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VoidInitiatedLedgerEntry{id=$id, amount=$amount, createdAt=$createdAt, creditBlock=$creditBlock, currency=$currency, customer=$customer, description=$description, endingBalance=$endingBalance, entryStatus=$entryStatus, entryType=$entryType, ledgerSequenceNumber=$ledgerSequenceNumber, metadata=$metadata, newBlockExpiryDate=$newBlockExpiryDate, startingBalance=$startingBalance, voidAmount=$voidAmount, voidReason=$voidReason, additionalProperties=$additionalProperties}"
}
