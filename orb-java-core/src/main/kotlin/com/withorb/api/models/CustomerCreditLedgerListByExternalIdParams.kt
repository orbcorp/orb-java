// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * The credits ledger provides _auditing_ functionality over Orb's credits system with a list of
 * actions that have taken place to modify a customer's credit balance. This
 * [paginated endpoint](/api-reference/pagination) lists these entries, starting from the most
 * recent ledger entry.
 *
 * More details on using Orb's real-time credit feature are [here](/product-catalog/prepurchase).
 *
 * There are four major types of modifications to credit balance, detailed below.
 *
 * ## Increment
 *
 * Credits (which optionally expire on a future date) can be added via the API ([Add Ledger
 * Entry](create-ledger-entry)). The ledger entry for such an action will always contain the total
 * eligible starting and ending balance for the customer at the time the entry was added to the
 * ledger.
 *
 * ## Decrement
 *
 * Deductions can occur as a result of an API call to create a ledger entry (see
 * [Add Ledger Entry](create-ledger-entry)), or automatically as a result of incurring usage. Both
 * ledger entries present the `decrement` entry type.
 *
 * As usage for a customer is reported into Orb, credits may be deducted according to the customer's
 * plan configuration. An automated deduction of this type will result in a ledger entry, also with
 * a starting and ending balance. In order to provide better tracing capabilities for automatic
 * deductions, Orb always associates each automatic deduction with the `event_id` at the time of
 * ingestion, used to pinpoint _why_ credit deduction took place and to ensure that credits are
 * never deducted without an associated usage event.
 *
 * By default, Orb uses an algorithm that automatically deducts from the _soonest expiring credit
 * block_ first in order to ensure that all credits are utilized appropriately. As an example, if
 * trial credits with an expiration date of 2 weeks from now are present for a customer, they will
 * be used before any deductions take place from a non-expiring credit block.
 *
 * If there are multiple blocks with the same expiration date, Orb will deduct from the block with
 * the _lower cost basis_ first (e.g. trial credits with a $0 cost basis before paid credits with a
 * $5.00 cost basis).
 *
 * It's also possible for a single usage event's deduction to _span_ credit blocks. In this case,
 * Orb will deduct from the next block, ending at the credit block which consists of unexpiring
 * credits. Each of these deductions will lead to a _separate_ ledger entry, one per credit block
 * that is deducted from. By default, the customer's total credit balance in Orb can be negative as
 * a result of a decrement.
 *
 * ## Expiration change
 *
 * The expiry of credits can be changed as a result of the API (See
 * [Add Ledger Entry](create-ledger-entry)). This will create a ledger entry that specifies the
 * balance as well as the initial and target expiry dates.
 *
 * Note that for this entry type, `starting_balance` will equal `ending_balance`, and the `amount`
 * represents the balance transferred. The credit block linked to the ledger entry is the source
 * credit block from which there was an expiration change
 *
 * ## Credits expiry
 *
 * When a set of credits expire on pre-set expiration date, the customer's balance automatically
 * reflects this change and adds an entry to the ledger indicating this event. Note that credit
 * expiry should always happen close to a date boundary in the customer's timezone.
 *
 * ## Void initiated
 *
 * Credit blocks can be voided via the API. The `amount` on this entry corresponds to the number of
 * credits that were remaining in the block at time of void. `void_reason` will be populated if the
 * void is created with a reason.
 *
 * ## Void
 *
 * When a set of credits is voided, the customer's balance automatically reflects this change and
 * adds an entry to the ledger indicating this event.
 *
 * ## Amendment
 *
 * When credits are added to a customer's balance as a result of a correction, this entry will be
 * added to the ledger to indicate the adjustment of credits.
 */
class CustomerCreditLedgerListByExternalIdParams
private constructor(
    private val externalCustomerId: String,
    private val createdAtGt: OffsetDateTime?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLt: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val currency: String?,
    private val cursor: String?,
    private val entryStatus: EntryStatus?,
    private val entryType: EntryType?,
    private val limit: Long?,
    private val minimumAmount: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalCustomerId(): String = externalCustomerId

    fun createdAtGt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGt)

    fun createdAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGte)

    fun createdAtLt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLt)

    fun createdAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLte)

    /** The ledger currency or custom pricing unit to use. */
    fun currency(): Optional<String> = Optional.ofNullable(currency)

    /**
     * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
     * initial request.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun entryStatus(): Optional<EntryStatus> = Optional.ofNullable(entryStatus)

    fun entryType(): Optional<EntryType> = Optional.ofNullable(entryType)

    /** The number of items to fetch. Defaults to 20. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun minimumAmount(): Optional<String> = Optional.ofNullable(minimumAmount)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditLedgerListByExternalIdParams].
         *
         * The following fields are required:
         * ```java
         * .externalCustomerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerCreditLedgerListByExternalIdParams]. */
    class Builder internal constructor() {

        private var externalCustomerId: String? = null
        private var createdAtGt: OffsetDateTime? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLt: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var currency: String? = null
        private var cursor: String? = null
        private var entryStatus: EntryStatus? = null
        private var entryType: EntryType? = null
        private var limit: Long? = null
        private var minimumAmount: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            customerCreditLedgerListByExternalIdParams: CustomerCreditLedgerListByExternalIdParams
        ) = apply {
            externalCustomerId = customerCreditLedgerListByExternalIdParams.externalCustomerId
            createdAtGt = customerCreditLedgerListByExternalIdParams.createdAtGt
            createdAtGte = customerCreditLedgerListByExternalIdParams.createdAtGte
            createdAtLt = customerCreditLedgerListByExternalIdParams.createdAtLt
            createdAtLte = customerCreditLedgerListByExternalIdParams.createdAtLte
            currency = customerCreditLedgerListByExternalIdParams.currency
            cursor = customerCreditLedgerListByExternalIdParams.cursor
            entryStatus = customerCreditLedgerListByExternalIdParams.entryStatus
            entryType = customerCreditLedgerListByExternalIdParams.entryType
            limit = customerCreditLedgerListByExternalIdParams.limit
            minimumAmount = customerCreditLedgerListByExternalIdParams.minimumAmount
            additionalHeaders =
                customerCreditLedgerListByExternalIdParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerCreditLedgerListByExternalIdParams.additionalQueryParams.toBuilder()
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        fun createdAtGt(createdAtGt: OffsetDateTime?) = apply { this.createdAtGt = createdAtGt }

        /** Alias for calling [Builder.createdAtGt] with `createdAtGt.orElse(null)`. */
        fun createdAtGt(createdAtGt: Optional<OffsetDateTime>) =
            createdAtGt(createdAtGt.getOrNull())

        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        /** Alias for calling [Builder.createdAtGte] with `createdAtGte.orElse(null)`. */
        fun createdAtGte(createdAtGte: Optional<OffsetDateTime>) =
            createdAtGte(createdAtGte.getOrNull())

        fun createdAtLt(createdAtLt: OffsetDateTime?) = apply { this.createdAtLt = createdAtLt }

        /** Alias for calling [Builder.createdAtLt] with `createdAtLt.orElse(null)`. */
        fun createdAtLt(createdAtLt: Optional<OffsetDateTime>) =
            createdAtLt(createdAtLt.getOrNull())

        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        /** Alias for calling [Builder.createdAtLte] with `createdAtLte.orElse(null)`. */
        fun createdAtLte(createdAtLte: Optional<OffsetDateTime>) =
            createdAtLte(createdAtLte.getOrNull())

        /** The ledger currency or custom pricing unit to use. */
        fun currency(currency: String?) = apply { this.currency = currency }

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        fun entryStatus(entryStatus: EntryStatus?) = apply { this.entryStatus = entryStatus }

        /** Alias for calling [Builder.entryStatus] with `entryStatus.orElse(null)`. */
        fun entryStatus(entryStatus: Optional<EntryStatus>) = entryStatus(entryStatus.getOrNull())

        fun entryType(entryType: EntryType?) = apply { this.entryType = entryType }

        /** Alias for calling [Builder.entryType] with `entryType.orElse(null)`. */
        fun entryType(entryType: Optional<EntryType>) = entryType(entryType.getOrNull())

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun minimumAmount(minimumAmount: String?) = apply { this.minimumAmount = minimumAmount }

        /** Alias for calling [Builder.minimumAmount] with `minimumAmount.orElse(null)`. */
        fun minimumAmount(minimumAmount: Optional<String>) =
            minimumAmount(minimumAmount.getOrNull())

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
         * Returns an immutable instance of [CustomerCreditLedgerListByExternalIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .externalCustomerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerCreditLedgerListByExternalIdParams =
            CustomerCreditLedgerListByExternalIdParams(
                checkRequired("externalCustomerId", externalCustomerId),
                createdAtGt,
                createdAtGte,
                createdAtLt,
                createdAtLte,
                currency,
                cursor,
                entryStatus,
                entryType,
                limit,
                minimumAmount,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalCustomerId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                createdAtGt?.let {
                    put("created_at[gt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtGte?.let {
                    put("created_at[gte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtLt?.let {
                    put("created_at[lt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtLte?.let {
                    put("created_at[lte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                currency?.let { put("currency", it) }
                cursor?.let { put("cursor", it) }
                entryStatus?.let { put("entry_status", it.toString()) }
                entryType?.let { put("entry_type", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                minimumAmount?.let { put("minimum_amount", it) }
                putAll(additionalQueryParams)
            }
            .build()

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

            @JvmField val INCREMENT = of("increment")

            @JvmField val DECREMENT = of("decrement")

            @JvmField val EXPIRATION_CHANGE = of("expiration_change")

            @JvmField val CREDIT_BLOCK_EXPIRY = of("credit_block_expiry")

            @JvmField val VOID = of("void")

            @JvmField val VOID_INITIATED = of("void_initiated")

            @JvmField val AMENDMENT = of("amendment")

            @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
        }

        /** An enum containing [EntryType]'s known values. */
        enum class Known {
            INCREMENT,
            DECREMENT,
            EXPIRATION_CHANGE,
            CREDIT_BLOCK_EXPIRY,
            VOID,
            VOID_INITIATED,
            AMENDMENT,
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
            INCREMENT,
            DECREMENT,
            EXPIRATION_CHANGE,
            CREDIT_BLOCK_EXPIRY,
            VOID,
            VOID_INITIATED,
            AMENDMENT,
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
                INCREMENT -> Value.INCREMENT
                DECREMENT -> Value.DECREMENT
                EXPIRATION_CHANGE -> Value.EXPIRATION_CHANGE
                CREDIT_BLOCK_EXPIRY -> Value.CREDIT_BLOCK_EXPIRY
                VOID -> Value.VOID
                VOID_INITIATED -> Value.VOID_INITIATED
                AMENDMENT -> Value.AMENDMENT
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
                EXPIRATION_CHANGE -> Known.EXPIRATION_CHANGE
                CREDIT_BLOCK_EXPIRY -> Known.CREDIT_BLOCK_EXPIRY
                VOID -> Known.VOID
                VOID_INITIATED -> Known.VOID_INITIATED
                AMENDMENT -> Known.AMENDMENT
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListByExternalIdParams && externalCustomerId == other.externalCustomerId && createdAtGt == other.createdAtGt && createdAtGte == other.createdAtGte && createdAtLt == other.createdAtLt && createdAtLte == other.createdAtLte && currency == other.currency && cursor == other.cursor && entryStatus == other.entryStatus && entryType == other.entryType && limit == other.limit && minimumAmount == other.minimumAmount && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalCustomerId, createdAtGt, createdAtGte, createdAtLt, createdAtLte, currency, cursor, entryStatus, entryType, limit, minimumAmount, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerListByExternalIdParams{externalCustomerId=$externalCustomerId, createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, currency=$currency, cursor=$cursor, entryStatus=$entryStatus, entryType=$entryType, limit=$limit, minimumAmount=$minimumAmount, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
