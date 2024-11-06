// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class CustomerCreditLedgerListParams
constructor(
    private val customerId: String,
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
) {

    fun customerId(): String = customerId

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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.createdAtGt?.let {
            queryParams.put(
                "created_at[gt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.createdAtGte?.let {
            queryParams.put(
                "created_at[gte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.createdAtLt?.let {
            queryParams.put(
                "created_at[lt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.createdAtLte?.let {
            queryParams.put(
                "created_at[lte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.currency?.let { queryParams.put("currency", listOf(it.toString())) }
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.entryStatus?.let { queryParams.put("entry_status", listOf(it.toString())) }
        this.entryType?.let { queryParams.put("entry_type", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.minimumAmount?.let { queryParams.put("minimum_amount", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListParams && this.customerId == other.customerId && this.createdAtGt == other.createdAtGt && this.createdAtGte == other.createdAtGte && this.createdAtLt == other.createdAtLt && this.createdAtLte == other.createdAtLte && this.currency == other.currency && this.cursor == other.cursor && this.entryStatus == other.entryStatus && this.entryType == other.entryType && this.limit == other.limit && this.minimumAmount == other.minimumAmount && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, createdAtGt, createdAtGte, createdAtLt, createdAtLte, currency, cursor, entryStatus, entryType, limit, minimumAmount, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "CustomerCreditLedgerListParams{customerId=$customerId, createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, currency=$currency, cursor=$cursor, entryStatus=$entryStatus, entryType=$entryType, limit=$limit, minimumAmount=$minimumAmount, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
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
        internal fun from(customerCreditLedgerListParams: CustomerCreditLedgerListParams) = apply {
            this.customerId = customerCreditLedgerListParams.customerId
            this.createdAtGt = customerCreditLedgerListParams.createdAtGt
            this.createdAtGte = customerCreditLedgerListParams.createdAtGte
            this.createdAtLt = customerCreditLedgerListParams.createdAtLt
            this.createdAtLte = customerCreditLedgerListParams.createdAtLte
            this.currency = customerCreditLedgerListParams.currency
            this.cursor = customerCreditLedgerListParams.cursor
            this.entryStatus = customerCreditLedgerListParams.entryStatus
            this.entryType = customerCreditLedgerListParams.entryType
            this.limit = customerCreditLedgerListParams.limit
            this.minimumAmount = customerCreditLedgerListParams.minimumAmount
            additionalHeaders(customerCreditLedgerListParams.additionalHeaders)
            additionalQueryParams(customerCreditLedgerListParams.additionalQueryParams)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

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

        fun build(): CustomerCreditLedgerListParams =
            CustomerCreditLedgerListParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
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
