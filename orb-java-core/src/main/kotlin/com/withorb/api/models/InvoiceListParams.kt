// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint returns a list of all [`Invoice`](/core-concepts#invoice)s for an account in a list
 * format.
 *
 * The list of invoices is ordered starting from the most recently issued invoice date. The response
 * also includes [`pagination_metadata`](/api-reference/pagination), which lets the caller retrieve
 * the next page of results if they exist.
 *
 * By default, this only returns invoices that are `issued`, `paid`, or `synced`.
 *
 * When fetching any `draft` invoices, this returns the last-computed invoice values for each draft
 * invoice, which may not always be up-to-date since Orb regularly refreshes invoices
 * asynchronously.
 */
class InvoiceListParams
private constructor(
    private val amount: String?,
    private val amountGt: String?,
    private val amountLt: String?,
    private val cursor: String?,
    private val customerId: String?,
    private val dateType: DateType?,
    private val dueDate: LocalDate?,
    private val dueDateWindow: String?,
    private val dueDateGt: LocalDate?,
    private val dueDateLt: LocalDate?,
    private val externalCustomerId: String?,
    private val invoiceDateGt: OffsetDateTime?,
    private val invoiceDateGte: OffsetDateTime?,
    private val invoiceDateLt: OffsetDateTime?,
    private val invoiceDateLte: OffsetDateTime?,
    private val isRecurring: Boolean?,
    private val limit: Long?,
    private val status: List<Status>?,
    private val subscriptionId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun amount(): Optional<String> = Optional.ofNullable(amount)

    fun amountGt(): Optional<String> = Optional.ofNullable(amountGt)

    fun amountLt(): Optional<String> = Optional.ofNullable(amountLt)

    /**
     * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
     * initial request.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun customerId(): Optional<String> = Optional.ofNullable(customerId)

    fun dateType(): Optional<DateType> = Optional.ofNullable(dateType)

    fun dueDate(): Optional<LocalDate> = Optional.ofNullable(dueDate)

    /**
     * Filters invoices by their due dates within a specific time range in the past. Specify the
     * range as a number followed by 'd' (days) or 'm' (months). For example, '7d' filters invoices
     * due in the last 7 days, and '2m' filters those due in the last 2 months.
     */
    fun dueDateWindow(): Optional<String> = Optional.ofNullable(dueDateWindow)

    fun dueDateGt(): Optional<LocalDate> = Optional.ofNullable(dueDateGt)

    fun dueDateLt(): Optional<LocalDate> = Optional.ofNullable(dueDateLt)

    fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId)

    fun invoiceDateGt(): Optional<OffsetDateTime> = Optional.ofNullable(invoiceDateGt)

    fun invoiceDateGte(): Optional<OffsetDateTime> = Optional.ofNullable(invoiceDateGte)

    fun invoiceDateLt(): Optional<OffsetDateTime> = Optional.ofNullable(invoiceDateLt)

    fun invoiceDateLte(): Optional<OffsetDateTime> = Optional.ofNullable(invoiceDateLte)

    fun isRecurring(): Optional<Boolean> = Optional.ofNullable(isRecurring)

    /** The number of items to fetch. Defaults to 20. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun status(): Optional<List<Status>> = Optional.ofNullable(status)

    fun subscriptionId(): Optional<String> = Optional.ofNullable(subscriptionId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InvoiceListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [InvoiceListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceListParams]. */
    class Builder internal constructor() {

        private var amount: String? = null
        private var amountGt: String? = null
        private var amountLt: String? = null
        private var cursor: String? = null
        private var customerId: String? = null
        private var dateType: DateType? = null
        private var dueDate: LocalDate? = null
        private var dueDateWindow: String? = null
        private var dueDateGt: LocalDate? = null
        private var dueDateLt: LocalDate? = null
        private var externalCustomerId: String? = null
        private var invoiceDateGt: OffsetDateTime? = null
        private var invoiceDateGte: OffsetDateTime? = null
        private var invoiceDateLt: OffsetDateTime? = null
        private var invoiceDateLte: OffsetDateTime? = null
        private var isRecurring: Boolean? = null
        private var limit: Long? = null
        private var status: MutableList<Status>? = null
        private var subscriptionId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invoiceListParams: InvoiceListParams) = apply {
            amount = invoiceListParams.amount
            amountGt = invoiceListParams.amountGt
            amountLt = invoiceListParams.amountLt
            cursor = invoiceListParams.cursor
            customerId = invoiceListParams.customerId
            dateType = invoiceListParams.dateType
            dueDate = invoiceListParams.dueDate
            dueDateWindow = invoiceListParams.dueDateWindow
            dueDateGt = invoiceListParams.dueDateGt
            dueDateLt = invoiceListParams.dueDateLt
            externalCustomerId = invoiceListParams.externalCustomerId
            invoiceDateGt = invoiceListParams.invoiceDateGt
            invoiceDateGte = invoiceListParams.invoiceDateGte
            invoiceDateLt = invoiceListParams.invoiceDateLt
            invoiceDateLte = invoiceListParams.invoiceDateLte
            isRecurring = invoiceListParams.isRecurring
            limit = invoiceListParams.limit
            status = invoiceListParams.status?.toMutableList()
            subscriptionId = invoiceListParams.subscriptionId
            additionalHeaders = invoiceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceListParams.additionalQueryParams.toBuilder()
        }

        fun amount(amount: String?) = apply { this.amount = amount }

        /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
        fun amount(amount: Optional<String>) = amount(amount.getOrNull())

        fun amountGt(amountGt: String?) = apply { this.amountGt = amountGt }

        /** Alias for calling [Builder.amountGt] with `amountGt.orElse(null)`. */
        fun amountGt(amountGt: Optional<String>) = amountGt(amountGt.getOrNull())

        fun amountLt(amountLt: String?) = apply { this.amountLt = amountLt }

        /** Alias for calling [Builder.amountLt] with `amountLt.orElse(null)`. */
        fun amountLt(amountLt: Optional<String>) = amountLt(amountLt.getOrNull())

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** Alias for calling [Builder.customerId] with `customerId.orElse(null)`. */
        fun customerId(customerId: Optional<String>) = customerId(customerId.getOrNull())

        fun dateType(dateType: DateType?) = apply { this.dateType = dateType }

        /** Alias for calling [Builder.dateType] with `dateType.orElse(null)`. */
        fun dateType(dateType: Optional<DateType>) = dateType(dateType.getOrNull())

        fun dueDate(dueDate: LocalDate?) = apply { this.dueDate = dueDate }

        /** Alias for calling [Builder.dueDate] with `dueDate.orElse(null)`. */
        fun dueDate(dueDate: Optional<LocalDate>) = dueDate(dueDate.getOrNull())

        /**
         * Filters invoices by their due dates within a specific time range in the past. Specify the
         * range as a number followed by 'd' (days) or 'm' (months). For example, '7d' filters
         * invoices due in the last 7 days, and '2m' filters those due in the last 2 months.
         */
        fun dueDateWindow(dueDateWindow: String?) = apply { this.dueDateWindow = dueDateWindow }

        /** Alias for calling [Builder.dueDateWindow] with `dueDateWindow.orElse(null)`. */
        fun dueDateWindow(dueDateWindow: Optional<String>) =
            dueDateWindow(dueDateWindow.getOrNull())

        fun dueDateGt(dueDateGt: LocalDate?) = apply { this.dueDateGt = dueDateGt }

        /** Alias for calling [Builder.dueDateGt] with `dueDateGt.orElse(null)`. */
        fun dueDateGt(dueDateGt: Optional<LocalDate>) = dueDateGt(dueDateGt.getOrNull())

        fun dueDateLt(dueDateLt: LocalDate?) = apply { this.dueDateLt = dueDateLt }

        /** Alias for calling [Builder.dueDateLt] with `dueDateLt.orElse(null)`. */
        fun dueDateLt(dueDateLt: Optional<LocalDate>) = dueDateLt(dueDateLt.getOrNull())

        fun externalCustomerId(externalCustomerId: String?) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /**
         * Alias for calling [Builder.externalCustomerId] with `externalCustomerId.orElse(null)`.
         */
        fun externalCustomerId(externalCustomerId: Optional<String>) =
            externalCustomerId(externalCustomerId.getOrNull())

        fun invoiceDateGt(invoiceDateGt: OffsetDateTime?) = apply {
            this.invoiceDateGt = invoiceDateGt
        }

        /** Alias for calling [Builder.invoiceDateGt] with `invoiceDateGt.orElse(null)`. */
        fun invoiceDateGt(invoiceDateGt: Optional<OffsetDateTime>) =
            invoiceDateGt(invoiceDateGt.getOrNull())

        fun invoiceDateGte(invoiceDateGte: OffsetDateTime?) = apply {
            this.invoiceDateGte = invoiceDateGte
        }

        /** Alias for calling [Builder.invoiceDateGte] with `invoiceDateGte.orElse(null)`. */
        fun invoiceDateGte(invoiceDateGte: Optional<OffsetDateTime>) =
            invoiceDateGte(invoiceDateGte.getOrNull())

        fun invoiceDateLt(invoiceDateLt: OffsetDateTime?) = apply {
            this.invoiceDateLt = invoiceDateLt
        }

        /** Alias for calling [Builder.invoiceDateLt] with `invoiceDateLt.orElse(null)`. */
        fun invoiceDateLt(invoiceDateLt: Optional<OffsetDateTime>) =
            invoiceDateLt(invoiceDateLt.getOrNull())

        fun invoiceDateLte(invoiceDateLte: OffsetDateTime?) = apply {
            this.invoiceDateLte = invoiceDateLte
        }

        /** Alias for calling [Builder.invoiceDateLte] with `invoiceDateLte.orElse(null)`. */
        fun invoiceDateLte(invoiceDateLte: Optional<OffsetDateTime>) =
            invoiceDateLte(invoiceDateLte.getOrNull())

        fun isRecurring(isRecurring: Boolean?) = apply { this.isRecurring = isRecurring }

        /**
         * Alias for [Builder.isRecurring].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isRecurring(isRecurring: Boolean) = isRecurring(isRecurring as Boolean?)

        /** Alias for calling [Builder.isRecurring] with `isRecurring.orElse(null)`. */
        fun isRecurring(isRecurring: Optional<Boolean>) = isRecurring(isRecurring.getOrNull())

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

        fun status(status: List<Status>?) = apply { this.status = status?.toMutableList() }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<List<Status>>) = status(status.getOrNull())

        /**
         * Adds a single [Status] to [Builder.status].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: Status) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
        }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        /** Alias for calling [Builder.subscriptionId] with `subscriptionId.orElse(null)`. */
        fun subscriptionId(subscriptionId: Optional<String>) =
            subscriptionId(subscriptionId.getOrNull())

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
         * Returns an immutable instance of [InvoiceListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InvoiceListParams =
            InvoiceListParams(
                amount,
                amountGt,
                amountLt,
                cursor,
                customerId,
                dateType,
                dueDate,
                dueDateWindow,
                dueDateGt,
                dueDateLt,
                externalCustomerId,
                invoiceDateGt,
                invoiceDateGte,
                invoiceDateLt,
                invoiceDateLte,
                isRecurring,
                limit,
                status?.toImmutable(),
                subscriptionId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                amount?.let { put("amount", it) }
                amountGt?.let { put("amount[gt]", it) }
                amountLt?.let { put("amount[lt]", it) }
                cursor?.let { put("cursor", it) }
                customerId?.let { put("customer_id", it) }
                dateType?.let { put("date_type", it.toString()) }
                dueDate?.let { put("due_date", it.toString()) }
                dueDateWindow?.let { put("due_date_window", it) }
                dueDateGt?.let { put("due_date[gt]", it.toString()) }
                dueDateLt?.let { put("due_date[lt]", it.toString()) }
                externalCustomerId?.let { put("external_customer_id", it) }
                invoiceDateGt?.let {
                    put("invoice_date[gt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                invoiceDateGte?.let {
                    put("invoice_date[gte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                invoiceDateLt?.let {
                    put("invoice_date[lt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                invoiceDateLte?.let {
                    put("invoice_date[lte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                isRecurring?.let { put("is_recurring", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                status?.forEach { put("status[]", it.toString()) }
                subscriptionId?.let { put("subscription_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class DateType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DUE_DATE = of("due_date")

            @JvmField val INVOICE_DATE = of("invoice_date")

            @JvmStatic fun of(value: String) = DateType(JsonField.of(value))
        }

        /** An enum containing [DateType]'s known values. */
        enum class Known {
            DUE_DATE,
            INVOICE_DATE,
        }

        /**
         * An enum containing [DateType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DateType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DUE_DATE,
            INVOICE_DATE,
            /** An enum member indicating that [DateType] was instantiated with an unknown value. */
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
                DUE_DATE -> Value.DUE_DATE
                INVOICE_DATE -> Value.INVOICE_DATE
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
                DUE_DATE -> Known.DUE_DATE
                INVOICE_DATE -> Known.INVOICE_DATE
                else -> throw OrbInvalidDataException("Unknown DateType: $value")
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

            return /* spotless:off */ other is DateType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

            @JvmField val DRAFT = of("draft")

            @JvmField val ISSUED = of("issued")

            @JvmField val PAID = of("paid")

            @JvmField val SYNCED = of("synced")

            @JvmField val VOID = of("void")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            ISSUED,
            PAID,
            SYNCED,
            VOID,
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
            DRAFT,
            ISSUED,
            PAID,
            SYNCED,
            VOID,
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
                DRAFT -> Value.DRAFT
                ISSUED -> Value.ISSUED
                PAID -> Value.PAID
                SYNCED -> Value.SYNCED
                VOID -> Value.VOID
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
                DRAFT -> Known.DRAFT
                ISSUED -> Known.ISSUED
                PAID -> Known.PAID
                SYNCED -> Known.SYNCED
                VOID -> Known.VOID
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceListParams && amount == other.amount && amountGt == other.amountGt && amountLt == other.amountLt && cursor == other.cursor && customerId == other.customerId && dateType == other.dateType && dueDate == other.dueDate && dueDateWindow == other.dueDateWindow && dueDateGt == other.dueDateGt && dueDateLt == other.dueDateLt && externalCustomerId == other.externalCustomerId && invoiceDateGt == other.invoiceDateGt && invoiceDateGte == other.invoiceDateGte && invoiceDateLt == other.invoiceDateLt && invoiceDateLte == other.invoiceDateLte && isRecurring == other.isRecurring && limit == other.limit && status == other.status && subscriptionId == other.subscriptionId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(amount, amountGt, amountLt, cursor, customerId, dateType, dueDate, dueDateWindow, dueDateGt, dueDateLt, externalCustomerId, invoiceDateGt, invoiceDateGte, invoiceDateLt, invoiceDateLte, isRecurring, limit, status, subscriptionId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InvoiceListParams{amount=$amount, amountGt=$amountGt, amountLt=$amountLt, cursor=$cursor, customerId=$customerId, dateType=$dateType, dueDate=$dueDate, dueDateWindow=$dueDateWindow, dueDateGt=$dueDateGt, dueDateLt=$dueDateLt, externalCustomerId=$externalCustomerId, invoiceDateGt=$invoiceDateGt, invoiceDateGte=$invoiceDateGte, invoiceDateLt=$invoiceDateLt, invoiceDateLte=$invoiceDateLte, isRecurring=$isRecurring, limit=$limit, status=$status, subscriptionId=$subscriptionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
