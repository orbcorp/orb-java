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
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomerBalanceTransactionListResponse
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
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): Action = action.getRequired("action")

    /**
     * The value of the amount changed in the transaction.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): String = amount.getRequired("amount")

    /**
     * The creation time of this transaction.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun creditNote(): Optional<CreditNote> =
        Optional.ofNullable(creditNote.getNullable("credit_note"))

    /**
     * An optional description provided for manual customer balance adjustments.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /**
     * The new value of the customer's balance prior to the transaction, in the customer's currency.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endingBalance(): String = endingBalance.getRequired("ending_balance")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invoice(): Optional<Invoice> = Optional.ofNullable(invoice.getNullable("invoice"))

    /**
     * The original value of the customer's balance prior to the transaction, in the customer's
     * currency.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingBalance(): String = startingBalance.getRequired("starting_balance")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
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
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [endingBalance].
     *
     * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected type.
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
         * [CustomerBalanceTransactionListResponse].
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

    /** A builder for [CustomerBalanceTransactionListResponse]. */
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
        internal fun from(
            customerBalanceTransactionListResponse: CustomerBalanceTransactionListResponse
        ) = apply {
            id = customerBalanceTransactionListResponse.id
            action = customerBalanceTransactionListResponse.action
            amount = customerBalanceTransactionListResponse.amount
            createdAt = customerBalanceTransactionListResponse.createdAt
            creditNote = customerBalanceTransactionListResponse.creditNote
            description = customerBalanceTransactionListResponse.description
            endingBalance = customerBalanceTransactionListResponse.endingBalance
            invoice = customerBalanceTransactionListResponse.invoice
            startingBalance = customerBalanceTransactionListResponse.startingBalance
            type = customerBalanceTransactionListResponse.type
            additionalProperties =
                customerBalanceTransactionListResponse.additionalProperties.toMutableMap()
        }

        /** A unique id for this transaction. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun action(action: Action) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [Action] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<Action>) = apply { this.action = action }

        /** The value of the amount changed in the transaction. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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
        fun creditNote(creditNote: JsonField<CreditNote>) = apply { this.creditNote = creditNote }

        /** An optional description provided for manual customer balance adjustments. */
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

        /**
         * The new value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        fun endingBalance(endingBalance: String) = endingBalance(JsonField.of(endingBalance))

        /**
         * Sets [Builder.endingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBalance] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.invoice] with a well-typed [Invoice] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun invoice(invoice: JsonField<Invoice>) = apply { this.invoice = invoice }

        /**
         * The original value of the customer's balance prior to the transaction, in the customer's
         * currency.
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
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [CustomerBalanceTransactionListResponse].
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
        fun build(): CustomerBalanceTransactionListResponse =
            CustomerBalanceTransactionListResponse(
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

    fun validate(): CustomerBalanceTransactionListResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
            /** An enum member indicating that [Action] was instantiated with an unknown value. */
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
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

        override fun toString() = "CreditNote{id=$id, additionalProperties=$additionalProperties}"
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
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INCREMENT,
            DECREMENT,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                INCREMENT -> Value.INCREMENT
                DECREMENT -> Value.DECREMENT
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
                INCREMENT -> Known.INCREMENT
                DECREMENT -> Known.DECREMENT
                else -> throw OrbInvalidDataException("Unknown Type: $value")
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

        return /* spotless:off */ other is CustomerBalanceTransactionListResponse && id == other.id && action == other.action && amount == other.amount && createdAt == other.createdAt && creditNote == other.creditNote && description == other.description && endingBalance == other.endingBalance && invoice == other.invoice && startingBalance == other.startingBalance && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, action, amount, createdAt, creditNote, description, endingBalance, invoice, startingBalance, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerBalanceTransactionListResponse{id=$id, action=$action, amount=$amount, createdAt=$createdAt, creditNote=$creditNote, description=$description, endingBalance=$endingBalance, invoice=$invoice, startingBalance=$startingBalance, type=$type, additionalProperties=$additionalProperties}"
}
