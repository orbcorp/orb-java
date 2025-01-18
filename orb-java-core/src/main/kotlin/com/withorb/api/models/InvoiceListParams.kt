// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

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
constructor(
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
) {

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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.amount?.let { queryParams.put("amount", listOf(it.toString())) }
        this.amountGt?.let { queryParams.put("amount[gt]", listOf(it.toString())) }
        this.amountLt?.let { queryParams.put("amount[lt]", listOf(it.toString())) }
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.customerId?.let { queryParams.put("customer_id", listOf(it.toString())) }
        this.dateType?.let { queryParams.put("date_type", listOf(it.toString())) }
        this.dueDate?.let { queryParams.put("due_date", listOf(it.toString())) }
        this.dueDateWindow?.let { queryParams.put("due_date_window", listOf(it.toString())) }
        this.dueDateGt?.let { queryParams.put("due_date[gt]", listOf(it.toString())) }
        this.dueDateLt?.let { queryParams.put("due_date[lt]", listOf(it.toString())) }
        this.externalCustomerId?.let {
            queryParams.put("external_customer_id", listOf(it.toString()))
        }
        this.invoiceDateGt?.let {
            queryParams.put(
                "invoice_date[gt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.invoiceDateGte?.let {
            queryParams.put(
                "invoice_date[gte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.invoiceDateLt?.let {
            queryParams.put(
                "invoice_date[lt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.invoiceDateLte?.let {
            queryParams.put(
                "invoice_date[lte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.isRecurring?.let { queryParams.put("is_recurring", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.status?.let { queryParams.put("status[]", it.map(Any::toString)) }
        this.subscriptionId?.let { queryParams.put("subscription_id", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

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

        fun amount(amount: Optional<String>) = amount(amount.orElse(null))

        fun amountGt(amountGt: String?) = apply { this.amountGt = amountGt }

        fun amountGt(amountGt: Optional<String>) = amountGt(amountGt.orElse(null))

        fun amountLt(amountLt: String?) = apply { this.amountLt = amountLt }

        fun amountLt(amountLt: Optional<String>) = amountLt(amountLt.orElse(null))

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: Optional<String>) = cursor(cursor.orElse(null))

        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        fun customerId(customerId: Optional<String>) = customerId(customerId.orElse(null))

        fun dateType(dateType: DateType?) = apply { this.dateType = dateType }

        fun dateType(dateType: Optional<DateType>) = dateType(dateType.orElse(null))

        fun dueDate(dueDate: LocalDate?) = apply { this.dueDate = dueDate }

        fun dueDate(dueDate: Optional<LocalDate>) = dueDate(dueDate.orElse(null))

        /**
         * Filters invoices by their due dates within a specific time range in the past. Specify the
         * range as a number followed by 'd' (days) or 'm' (months). For example, '7d' filters
         * invoices due in the last 7 days, and '2m' filters those due in the last 2 months.
         */
        fun dueDateWindow(dueDateWindow: String?) = apply { this.dueDateWindow = dueDateWindow }

        /**
         * Filters invoices by their due dates within a specific time range in the past. Specify the
         * range as a number followed by 'd' (days) or 'm' (months). For example, '7d' filters
         * invoices due in the last 7 days, and '2m' filters those due in the last 2 months.
         */
        fun dueDateWindow(dueDateWindow: Optional<String>) =
            dueDateWindow(dueDateWindow.orElse(null))

        fun dueDateGt(dueDateGt: LocalDate?) = apply { this.dueDateGt = dueDateGt }

        fun dueDateGt(dueDateGt: Optional<LocalDate>) = dueDateGt(dueDateGt.orElse(null))

        fun dueDateLt(dueDateLt: LocalDate?) = apply { this.dueDateLt = dueDateLt }

        fun dueDateLt(dueDateLt: Optional<LocalDate>) = dueDateLt(dueDateLt.orElse(null))

        fun externalCustomerId(externalCustomerId: String?) = apply {
            this.externalCustomerId = externalCustomerId
        }

        fun externalCustomerId(externalCustomerId: Optional<String>) =
            externalCustomerId(externalCustomerId.orElse(null))

        fun invoiceDateGt(invoiceDateGt: OffsetDateTime?) = apply {
            this.invoiceDateGt = invoiceDateGt
        }

        fun invoiceDateGt(invoiceDateGt: Optional<OffsetDateTime>) =
            invoiceDateGt(invoiceDateGt.orElse(null))

        fun invoiceDateGte(invoiceDateGte: OffsetDateTime?) = apply {
            this.invoiceDateGte = invoiceDateGte
        }

        fun invoiceDateGte(invoiceDateGte: Optional<OffsetDateTime>) =
            invoiceDateGte(invoiceDateGte.orElse(null))

        fun invoiceDateLt(invoiceDateLt: OffsetDateTime?) = apply {
            this.invoiceDateLt = invoiceDateLt
        }

        fun invoiceDateLt(invoiceDateLt: Optional<OffsetDateTime>) =
            invoiceDateLt(invoiceDateLt.orElse(null))

        fun invoiceDateLte(invoiceDateLte: OffsetDateTime?) = apply {
            this.invoiceDateLte = invoiceDateLte
        }

        fun invoiceDateLte(invoiceDateLte: Optional<OffsetDateTime>) =
            invoiceDateLte(invoiceDateLte.orElse(null))

        fun isRecurring(isRecurring: Boolean?) = apply { this.isRecurring = isRecurring }

        fun isRecurring(isRecurring: Boolean) = isRecurring(isRecurring as Boolean?)

        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun isRecurring(isRecurring: Optional<Boolean>) =
            isRecurring(isRecurring.orElse(null) as Boolean?)

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = limit(limit as Long?)

        /** The number of items to fetch. Defaults to 20. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

        fun status(status: List<Status>?) = apply { this.status = status?.toMutableList() }

        fun status(status: Optional<List<Status>>) = status(status.orElse(null))

        fun addStatus(status: Status) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
        }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        fun subscriptionId(subscriptionId: Optional<String>) =
            subscriptionId(subscriptionId.orElse(null))

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

    class DateType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DUE_DATE = of("due_date")

            @JvmField val INVOICE_DATE = of("invoice_date")

            @JvmStatic fun of(value: String) = DateType(JsonField.of(value))
        }

        enum class Known {
            DUE_DATE,
            INVOICE_DATE,
        }

        enum class Value {
            DUE_DATE,
            INVOICE_DATE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DUE_DATE -> Value.DUE_DATE
                INVOICE_DATE -> Value.INVOICE_DATE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DUE_DATE -> Known.DUE_DATE
                INVOICE_DATE -> Known.INVOICE_DATE
                else -> throw OrbInvalidDataException("Unknown DateType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DateType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DRAFT = of("draft")

            @JvmField val ISSUED = of("issued")

            @JvmField val PAID = of("paid")

            @JvmField val SYNCED = of("synced")

            @JvmField val VOID = of("void")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DRAFT,
            ISSUED,
            PAID,
            SYNCED,
            VOID,
        }

        enum class Value {
            DRAFT,
            ISSUED,
            PAID,
            SYNCED,
            VOID,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DRAFT -> Value.DRAFT
                ISSUED -> Value.ISSUED
                PAID -> Value.PAID
                SYNCED -> Value.SYNCED
                VOID -> Value.VOID
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DRAFT -> Known.DRAFT
                ISSUED -> Known.ISSUED
                PAID -> Known.PAID
                SYNCED -> Known.SYNCED
                VOID -> Known.VOID
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
