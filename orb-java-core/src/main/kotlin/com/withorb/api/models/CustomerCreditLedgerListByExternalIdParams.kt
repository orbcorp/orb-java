// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class CustomerCreditLedgerListByExternalIdParams
constructor(
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun externalCustomerId(): String = externalCustomerId

    fun createdAtGt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGt)

    fun createdAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGte)

    fun createdAtLt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLt)

    fun createdAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLte)

    fun currency(): Optional<String> = Optional.ofNullable(currency)

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun entryStatus(): Optional<EntryStatus> = Optional.ofNullable(entryStatus)

    fun entryType(): Optional<EntryType> = Optional.ofNullable(entryType)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun minimumAmount(): Optional<String> = Optional.ofNullable(minimumAmount)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.createdAtGt?.let {
            params.put("created_at[gt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.createdAtGte?.let {
            params.put("created_at[gte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.createdAtLt?.let {
            params.put("created_at[lt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.createdAtLte?.let {
            params.put("created_at[lte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.currency?.let { params.put("currency", listOf(it.toString())) }
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.entryStatus?.let { params.put("entry_status", listOf(it.toString())) }
        this.entryType?.let { params.put("entry_type", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.minimumAmount?.let { params.put("minimum_amount", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalCustomerId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListByExternalIdParams && this.externalCustomerId == other.externalCustomerId && this.createdAtGt == other.createdAtGt && this.createdAtGte == other.createdAtGte && this.createdAtLt == other.createdAtLt && this.createdAtLte == other.createdAtLte && this.currency == other.currency && this.cursor == other.cursor && this.entryStatus == other.entryStatus && this.entryType == other.entryType && this.limit == other.limit && this.minimumAmount == other.minimumAmount && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(externalCustomerId, createdAtGt, createdAtGte, createdAtLt, createdAtLte, currency, cursor, entryStatus, entryType, limit, minimumAmount, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "CustomerCreditLedgerListByExternalIdParams{externalCustomerId=$externalCustomerId, createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, currency=$currency, cursor=$cursor, entryStatus=$entryStatus, entryType=$entryType, limit=$limit, minimumAmount=$minimumAmount, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            customerCreditLedgerListByExternalIdParams: CustomerCreditLedgerListByExternalIdParams
        ) = apply {
            this.externalCustomerId = customerCreditLedgerListByExternalIdParams.externalCustomerId
            this.createdAtGt = customerCreditLedgerListByExternalIdParams.createdAtGt
            this.createdAtGte = customerCreditLedgerListByExternalIdParams.createdAtGte
            this.createdAtLt = customerCreditLedgerListByExternalIdParams.createdAtLt
            this.createdAtLte = customerCreditLedgerListByExternalIdParams.createdAtLte
            this.currency = customerCreditLedgerListByExternalIdParams.currency
            this.cursor = customerCreditLedgerListByExternalIdParams.cursor
            this.entryStatus = customerCreditLedgerListByExternalIdParams.entryStatus
            this.entryType = customerCreditLedgerListByExternalIdParams.entryType
            this.limit = customerCreditLedgerListByExternalIdParams.limit
            this.minimumAmount = customerCreditLedgerListByExternalIdParams.minimumAmount
            additionalQueryParams(customerCreditLedgerListByExternalIdParams.additionalQueryParams)
            additionalHeaders(customerCreditLedgerListByExternalIdParams.additionalHeaders)
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        fun createdAtGt(createdAtGt: OffsetDateTime) = apply { this.createdAtGt = createdAtGt }

        fun createdAtGte(createdAtGte: OffsetDateTime) = apply { this.createdAtGte = createdAtGte }

        fun createdAtLt(createdAtLt: OffsetDateTime) = apply { this.createdAtLt = createdAtLt }

        fun createdAtLte(createdAtLte: OffsetDateTime) = apply { this.createdAtLte = createdAtLte }

        /** The ledger currency or custom pricing unit to use. */
        fun currency(currency: String) = apply { this.currency = currency }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        fun entryStatus(entryStatus: EntryStatus) = apply { this.entryStatus = entryStatus }

        fun entryType(entryType: EntryType) = apply { this.entryType = entryType }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply { this.limit = limit }

        fun minimumAmount(minimumAmount: String) = apply { this.minimumAmount = minimumAmount }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): CustomerCreditLedgerListByExternalIdParams =
            CustomerCreditLedgerListByExternalIdParams(
                checkNotNull(externalCustomerId) {
                    "`externalCustomerId` is required but was not set"
                },
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
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
            )
    }

    class EntryStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EntryStatus && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val COMMITTED = EntryStatus(JsonField.of("committed"))

            @JvmField val PENDING = EntryStatus(JsonField.of("pending"))

            @JvmStatic fun of(value: String) = EntryStatus(JsonField.of(value))
        }

        enum class Known {
            COMMITTED,
            PENDING,
        }

        enum class Value {
            COMMITTED,
            PENDING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMMITTED -> Value.COMMITTED
                PENDING -> Value.PENDING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMMITTED -> Known.COMMITTED
                PENDING -> Known.PENDING
                else -> throw OrbInvalidDataException("Unknown EntryStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class EntryType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EntryType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INCREMENT = EntryType(JsonField.of("increment"))

            @JvmField val DECREMENT = EntryType(JsonField.of("decrement"))

            @JvmField val EXPIRATION_CHANGE = EntryType(JsonField.of("expiration_change"))

            @JvmField val CREDIT_BLOCK_EXPIRY = EntryType(JsonField.of("credit_block_expiry"))

            @JvmField val VOID = EntryType(JsonField.of("void"))

            @JvmField val VOID_INITIATED = EntryType(JsonField.of("void_initiated"))

            @JvmField val AMENDMENT = EntryType(JsonField.of("amendment"))

            @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
        }

        enum class Known {
            INCREMENT,
            DECREMENT,
            EXPIRATION_CHANGE,
            CREDIT_BLOCK_EXPIRY,
            VOID,
            VOID_INITIATED,
            AMENDMENT,
        }

        enum class Value {
            INCREMENT,
            DECREMENT,
            EXPIRATION_CHANGE,
            CREDIT_BLOCK_EXPIRY,
            VOID,
            VOID_INITIATED,
            AMENDMENT,
            _UNKNOWN,
        }

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

        fun asString(): String = _value().asStringOrThrow()
    }
}
