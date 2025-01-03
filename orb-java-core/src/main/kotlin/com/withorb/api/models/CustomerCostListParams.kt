// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class CustomerCostListParams
constructor(
    private val customerId: String,
    private val currency: String?,
    private val timeframeEnd: OffsetDateTime?,
    private val timeframeStart: OffsetDateTime?,
    private val viewMode: ViewMode?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    /** The currency or custom pricing unit to use. */
    fun currency(): Optional<String> = Optional.ofNullable(currency)

    /** Costs returned are exclusive of `timeframe_end`. */
    fun timeframeEnd(): Optional<OffsetDateTime> = Optional.ofNullable(timeframeEnd)

    /** Costs returned are inclusive of `timeframe_start`. */
    fun timeframeStart(): Optional<OffsetDateTime> = Optional.ofNullable(timeframeStart)

    /**
     * Controls whether Orb returns cumulative costs since the start of the billing period, or
     * incremental day-by-day costs. If your customer has minimums or discounts, it's strongly
     * recommended that you use the default cumulative behavior.
     */
    fun viewMode(): Optional<ViewMode> = Optional.ofNullable(viewMode)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.currency?.let { queryParams.put("currency", listOf(it.toString())) }
        this.timeframeEnd?.let {
            queryParams.put(
                "timeframe_end",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.timeframeStart?.let {
            queryParams.put(
                "timeframe_start",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.viewMode?.let { queryParams.put("view_mode", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var currency: String? = null
        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var viewMode: ViewMode? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerCostListParams: CustomerCostListParams) = apply {
            customerId = customerCostListParams.customerId
            currency = customerCostListParams.currency
            timeframeEnd = customerCostListParams.timeframeEnd
            timeframeStart = customerCostListParams.timeframeStart
            viewMode = customerCostListParams.viewMode
            additionalHeaders = customerCostListParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCostListParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** The currency or custom pricing unit to use. */
        fun currency(currency: String) = apply { this.currency = currency }

        /** Costs returned are exclusive of `timeframe_end`. */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { this.timeframeEnd = timeframeEnd }

        /** Costs returned are inclusive of `timeframe_start`. */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            this.timeframeStart = timeframeStart
        }

        /**
         * Controls whether Orb returns cumulative costs since the start of the billing period, or
         * incremental day-by-day costs. If your customer has minimums or discounts, it's strongly
         * recommended that you use the default cumulative behavior.
         */
        fun viewMode(viewMode: ViewMode) = apply { this.viewMode = viewMode }

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

        fun build(): CustomerCostListParams =
            CustomerCostListParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                currency,
                timeframeEnd,
                timeframeStart,
                viewMode,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class ViewMode
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PERIODIC = of("periodic")

            @JvmField val CUMULATIVE = of("cumulative")

            @JvmStatic fun of(value: String) = ViewMode(JsonField.of(value))
        }

        enum class Known {
            PERIODIC,
            CUMULATIVE,
        }

        enum class Value {
            PERIODIC,
            CUMULATIVE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PERIODIC -> Value.PERIODIC
                CUMULATIVE -> Value.CUMULATIVE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PERIODIC -> Known.PERIODIC
                CUMULATIVE -> Known.CUMULATIVE
                else -> throw OrbInvalidDataException("Unknown ViewMode: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ViewMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCostListParams && customerId == other.customerId && currency == other.currency && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && viewMode == other.viewMode && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, currency, timeframeEnd, timeframeStart, viewMode, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCostListParams{customerId=$customerId, currency=$currency, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, viewMode=$viewMode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
