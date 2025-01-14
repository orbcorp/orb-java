// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

/**
 * This endpoint is used to fetch a day-by-day snapshot of a customer's costs in Orb, calculated by
 * applying pricing information to the underlying usage (see the
 * [subscription usage endpoint](fetch-subscription-usage.api.mdx) to fetch usage per metric, in
 * usage units rather than a currency).
 *
 * This endpoint can be leveraged for internal tooling and to provide a more transparent billing
 * experience for your end users:
 * 1. Understand the cost breakdown per line item historically and in real-time for the current
 *    billing period.
 * 2. Provide customer visibility into how different services are contributing to the overall
 *    invoice with a per-day timeseries (as compared to the
 *    [upcoming invoice](fetch-upcoming-invoice) resource, which represents a snapshot for the
 *    current period).
 * 3. Assess how minimums and discounts affect your customers by teasing apart costs directly as a
 *    result of usage, as opposed to minimums and discounts at the plan and price level.
 * 4. Gain insight into key customer health metrics, such as the percent utilization of the minimum
 *    committed spend.
 *
 * ## Fetching subscriptions
 *
 * By default, this endpoint fetches the currently active subscription for the customer, and returns
 * cost information for the subscription's current billing period, broken down by each participating
 * price. If there are no currently active subscriptions, this will instead default to the most
 * recently active subscription or return an empty series if none are found. For example, if your
 * plan charges for compute hours, job runs, and data syncs, then this endpoint would provide a
 * daily breakdown of your customer's cost for each of those axes.
 *
 * If timeframe bounds are specified, Orb fetches all subscriptions that were active in that
 * timeframe. If two subscriptions overlap on a single day, costs from each price will be summed,
 * and prices for both subscriptions will be included in the breakdown.
 *
 * ## Prepaid plans
 *
 * For plans that include prices which deduct credits rather than accrue in-arrears charges in a
 * billable currency, this endpoint will return the total deduction amount, in credits, for the
 * specified timeframe.
 *
 * ## Cumulative subtotals and totals
 *
 * Since the subtotal and total must factor in any billing-period level discounts and minimums, it's
 * most meaningful to consider costs relative to the start of the subscription's billing period. As
 * a result, by default this endpoint returns cumulative totals since the beginning of the billing
 * period. In particular, the `timeframe_start` of a returned timeframe window is _always_ the
 * beginning of the billing period and `timeframe_end` is incremented one day at a time to build the
 * result.
 *
 * A customer that uses a few API calls a day but has a minimum commitment might exhibit the
 * following pattern for their subtotal and total in the first few days of the month. Here, we
 * assume that each API call is $2.50, the customer's plan has a monthly minimum of $50 for this
 * price, and that the subscription's billing period bounds are aligned to the first of the month:
 *
 * | timeframe_start | timeframe_end | Cumulative usage | Subtotal | Total (incl. commitment) |
 * |-----------------|---------------|------------------|----------|--------------------------|
 * | 2023-02-01      | 2023-02-02    | 9                | $22.50   | $50.00                   |
 * | 2023-02-01      | 2023-02-03    | 19               | $47.50   | $50.00                   |
 * | 2023-02-01      | 2023-02-04    | 20               | $50.00   | $50.00                   |
 * | 2023-02-01      | 2023-02-05    | 28               | $70.00   | $70.00                   |
 * | 2023-02-01      | 2023-02-06    | 36               | $90.00   | $90.00                   |
 *
 * ### Periodic values
 *
 * When the query parameter `view_mode=periodic` is specified, Orb will return an incremental
 * day-by-day view of costs. In this case, there will always be a one-day difference between
 * `timeframe_start` and `timeframe_end` for the timeframes returned. This is a transform on top of
 * the cumulative costs, calculated by taking the difference of each timeframe with the last. Note
 * that in the above example, the `Total` value would be 0 for the second two data points, since the
 * minimum commitment has not yet been hit and each day is not contributing anything to the total
 * cost.
 *
 * ## Timeframe bounds
 *
 * For an active subscription, both timeframes should be specified in the request. If a subscription
 * starts or ends within the timeframe, the response will only include windows where the
 * subscription is active. If a subscription has ended, no timeframe bounds need to be specified and
 * the response will default to the billing period when the subscription was last active.
 *
 * As noted above, `timeframe_start` for a given cumulative datapoint is always the beginning of the
 * billing period, and `timeframe_end` is incremented one day at a time to construct the response.
 * When a timeframe is passed in that is not aligned to the current subscription's billing period,
 * the response will contain cumulative totals from multiple billing periods.
 *
 * Suppose the queried customer has a subscription aligned to the 15th of every month. If this
 * endpoint is queried with the date range `2023-06-01` - `2023-07-01`, the first data point will
 * represent about half a billing period's worth of costs, accounting for accruals from the start of
 * the billing period and inclusive of the first day of the timeframe (`timeframe_start = 2023-05-15
 * 00:00:00`, `timeframe_end = 2023-06-02 00:00:00`)
 *
 * | datapoint index | timeframe_start | timeframe_end |
 * |-----------------|-----------------|---------------|
 * | 0               | 2023-05-15      | 2023-06-02    |
 * | 1               | 2023-05-15      | 2023-06-03    |
 * | 2               | ...             | ...           |
 * | 3               | 2023-05-15      | 2023-06-14    |
 * | 4               | 2023-06-15      | 2023-06-16    |
 * | 5               | 2023-06-15      | 2023-06-17    |
 * | 6               | ...             | ...           |
 * | 7               | 2023-06-15      | 2023-07-01    |
 *
 * You can see this sliced timeframe visualized [here](https://i.imgur.com/TXhYgme.png).
 *
 * ### Matrix prices
 *
 * When a price uses matrix pricing, it's important to view costs grouped by those matrix
 * dimensions. Orb will return `price_groups` with the `grouping_key` and `secondary_grouping_key`
 * based on the matrix price definition, for each `grouping_value` and `secondary_grouping_value`
 * available.
 */
class CustomerCostListByExternalIdParams
constructor(
    private val externalCustomerId: String,
    private val currency: String?,
    private val timeframeEnd: OffsetDateTime?,
    private val timeframeStart: OffsetDateTime?,
    private val viewMode: ViewMode?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun externalCustomerId(): String = externalCustomerId

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
            0 -> externalCustomerId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalCustomerId: String? = null
        private var currency: String? = null
        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var viewMode: ViewMode? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerCostListByExternalIdParams: CustomerCostListByExternalIdParams) =
            apply {
                externalCustomerId = customerCostListByExternalIdParams.externalCustomerId
                currency = customerCostListByExternalIdParams.currency
                timeframeEnd = customerCostListByExternalIdParams.timeframeEnd
                timeframeStart = customerCostListByExternalIdParams.timeframeStart
                viewMode = customerCostListByExternalIdParams.viewMode
                additionalHeaders = customerCostListByExternalIdParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    customerCostListByExternalIdParams.additionalQueryParams.toBuilder()
            }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** The currency or custom pricing unit to use. */
        fun currency(currency: String?) = apply { this.currency = currency }

        /** The currency or custom pricing unit to use. */
        fun currency(currency: Optional<String>) = currency(currency.orElse(null))

        /** Costs returned are exclusive of `timeframe_end`. */
        fun timeframeEnd(timeframeEnd: OffsetDateTime?) = apply { this.timeframeEnd = timeframeEnd }

        /** Costs returned are exclusive of `timeframe_end`. */
        fun timeframeEnd(timeframeEnd: Optional<OffsetDateTime>) =
            timeframeEnd(timeframeEnd.orElse(null))

        /** Costs returned are inclusive of `timeframe_start`. */
        fun timeframeStart(timeframeStart: OffsetDateTime?) = apply {
            this.timeframeStart = timeframeStart
        }

        /** Costs returned are inclusive of `timeframe_start`. */
        fun timeframeStart(timeframeStart: Optional<OffsetDateTime>) =
            timeframeStart(timeframeStart.orElse(null))

        /**
         * Controls whether Orb returns cumulative costs since the start of the billing period, or
         * incremental day-by-day costs. If your customer has minimums or discounts, it's strongly
         * recommended that you use the default cumulative behavior.
         */
        fun viewMode(viewMode: ViewMode?) = apply { this.viewMode = viewMode }

        /**
         * Controls whether Orb returns cumulative costs since the start of the billing period, or
         * incremental day-by-day costs. If your customer has minimums or discounts, it's strongly
         * recommended that you use the default cumulative behavior.
         */
        fun viewMode(viewMode: Optional<ViewMode>) = viewMode(viewMode.orElse(null))

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

        fun build(): CustomerCostListByExternalIdParams =
            CustomerCostListByExternalIdParams(
                checkRequired("externalCustomerId", externalCustomerId),
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

        return /* spotless:off */ other is CustomerCostListByExternalIdParams && externalCustomerId == other.externalCustomerId && currency == other.currency && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && viewMode == other.viewMode && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalCustomerId, currency, timeframeEnd, timeframeStart, viewMode, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCostListByExternalIdParams{externalCustomerId=$externalCustomerId, currency=$currency, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, viewMode=$viewMode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
