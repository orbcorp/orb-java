// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class EventBackfillCreateParams
constructor(
    private val body: EventBackfillCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The (exclusive) end of the usage timeframe affected by this backfill. */
    fun timeframeEnd(): OffsetDateTime = body.timeframeEnd()

    /** The (inclusive) start of the usage timeframe affected by this backfill. */
    fun timeframeStart(): OffsetDateTime = body.timeframeStart()

    /**
     * The time at which no more events will be accepted for this backfill. The backfill will
     * automatically begin reflecting throughout Orb at the close time. If not specified, it will
     * default to 1 day after the creation of the backfill.
     */
    fun closeTime(): Optional<OffsetDateTime> = body.closeTime()

    /**
     * The Orb-generated ID of the customer to which this backfill is scoped. Omitting this field
     * will scope the backfill to all customers.
     */
    fun customerId(): Optional<String> = body.customerId()

    /**
     * A boolean [computed property](../guides/extensibility/advanced-metrics#computed-properties)
     * used to filter the set of events to deprecate
     */
    fun deprecationFilter(): Optional<String> = body.deprecationFilter()

    /**
     * The external customer ID of the customer to which this backfill is scoped. Omitting this
     * field will scope the backfill to all customers.
     */
    fun externalCustomerId(): Optional<String> = body.externalCustomerId()

    /**
     * If true, replaces all existing events in the timeframe with the newly ingested events. If
     * false, adds the newly ingested events to the existing events.
     */
    fun replaceExistingEvents(): Optional<Boolean> = body.replaceExistingEvents()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): EventBackfillCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class EventBackfillCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("timeframe_end") private val timeframeEnd: OffsetDateTime,
        @JsonProperty("timeframe_start") private val timeframeStart: OffsetDateTime,
        @JsonProperty("close_time") private val closeTime: OffsetDateTime?,
        @JsonProperty("customer_id") private val customerId: String?,
        @JsonProperty("deprecation_filter") private val deprecationFilter: String?,
        @JsonProperty("external_customer_id") private val externalCustomerId: String?,
        @JsonProperty("replace_existing_events") private val replaceExistingEvents: Boolean?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The (exclusive) end of the usage timeframe affected by this backfill. */
        @JsonProperty("timeframe_end") fun timeframeEnd(): OffsetDateTime = timeframeEnd

        /** The (inclusive) start of the usage timeframe affected by this backfill. */
        @JsonProperty("timeframe_start") fun timeframeStart(): OffsetDateTime = timeframeStart

        /**
         * The time at which no more events will be accepted for this backfill. The backfill will
         * automatically begin reflecting throughout Orb at the close time. If not specified, it
         * will default to 1 day after the creation of the backfill.
         */
        @JsonProperty("close_time")
        fun closeTime(): Optional<OffsetDateTime> = Optional.ofNullable(closeTime)

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. Omitting this
         * field will scope the backfill to all customers.
         */
        @JsonProperty("customer_id")
        fun customerId(): Optional<String> = Optional.ofNullable(customerId)

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the set of events to deprecate
         */
        @JsonProperty("deprecation_filter")
        fun deprecationFilter(): Optional<String> = Optional.ofNullable(deprecationFilter)

        /**
         * The external customer ID of the customer to which this backfill is scoped. Omitting this
         * field will scope the backfill to all customers.
         */
        @JsonProperty("external_customer_id")
        fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId)

        /**
         * If true, replaces all existing events in the timeframe with the newly ingested events. If
         * false, adds the newly ingested events to the existing events.
         */
        @JsonProperty("replace_existing_events")
        fun replaceExistingEvents(): Optional<Boolean> = Optional.ofNullable(replaceExistingEvents)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var timeframeEnd: OffsetDateTime? = null
            private var timeframeStart: OffsetDateTime? = null
            private var closeTime: OffsetDateTime? = null
            private var customerId: String? = null
            private var deprecationFilter: String? = null
            private var externalCustomerId: String? = null
            private var replaceExistingEvents: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(eventBackfillCreateBody: EventBackfillCreateBody) = apply {
                timeframeEnd = eventBackfillCreateBody.timeframeEnd
                timeframeStart = eventBackfillCreateBody.timeframeStart
                closeTime = eventBackfillCreateBody.closeTime
                customerId = eventBackfillCreateBody.customerId
                deprecationFilter = eventBackfillCreateBody.deprecationFilter
                externalCustomerId = eventBackfillCreateBody.externalCustomerId
                replaceExistingEvents = eventBackfillCreateBody.replaceExistingEvents
                additionalProperties = eventBackfillCreateBody.additionalProperties.toMutableMap()
            }

            /** The (exclusive) end of the usage timeframe affected by this backfill. */
            fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply {
                this.timeframeEnd = timeframeEnd
            }

            /** The (inclusive) start of the usage timeframe affected by this backfill. */
            fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
                this.timeframeStart = timeframeStart
            }

            /**
             * The time at which no more events will be accepted for this backfill. The backfill
             * will automatically begin reflecting throughout Orb at the close time. If not
             * specified, it will default to 1 day after the creation of the backfill.
             */
            fun closeTime(closeTime: OffsetDateTime) = apply { this.closeTime = closeTime }

            /**
             * The Orb-generated ID of the customer to which this backfill is scoped. Omitting this
             * field will scope the backfill to all customers.
             */
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * A boolean
             * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
             * used to filter the set of events to deprecate
             */
            fun deprecationFilter(deprecationFilter: String) = apply {
                this.deprecationFilter = deprecationFilter
            }

            /**
             * The external customer ID of the customer to which this backfill is scoped. Omitting
             * this field will scope the backfill to all customers.
             */
            fun externalCustomerId(externalCustomerId: String) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /**
             * If true, replaces all existing events in the timeframe with the newly ingested
             * events. If false, adds the newly ingested events to the existing events.
             */
            fun replaceExistingEvents(replaceExistingEvents: Boolean) = apply {
                this.replaceExistingEvents = replaceExistingEvents
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

            fun build(): EventBackfillCreateBody =
                EventBackfillCreateBody(
                    checkNotNull(timeframeEnd) { "`timeframeEnd` is required but was not set" },
                    checkNotNull(timeframeStart) { "`timeframeStart` is required but was not set" },
                    closeTime,
                    customerId,
                    deprecationFilter,
                    externalCustomerId,
                    replaceExistingEvents,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventBackfillCreateBody && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && closeTime == other.closeTime && customerId == other.customerId && deprecationFilter == other.deprecationFilter && externalCustomerId == other.externalCustomerId && replaceExistingEvents == other.replaceExistingEvents && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(timeframeEnd, timeframeStart, closeTime, customerId, deprecationFilter, externalCustomerId, replaceExistingEvents, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EventBackfillCreateBody{timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, closeTime=$closeTime, customerId=$customerId, deprecationFilter=$deprecationFilter, externalCustomerId=$externalCustomerId, replaceExistingEvents=$replaceExistingEvents, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: EventBackfillCreateBody.Builder = EventBackfillCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventBackfillCreateParams: EventBackfillCreateParams) = apply {
            body = eventBackfillCreateParams.body.toBuilder()
            additionalHeaders = eventBackfillCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventBackfillCreateParams.additionalQueryParams.toBuilder()
        }

        /** The (exclusive) end of the usage timeframe affected by this backfill. */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { body.timeframeEnd(timeframeEnd) }

        /** The (inclusive) start of the usage timeframe affected by this backfill. */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            body.timeframeStart(timeframeStart)
        }

        /**
         * The time at which no more events will be accepted for this backfill. The backfill will
         * automatically begin reflecting throughout Orb at the close time. If not specified, it
         * will default to 1 day after the creation of the backfill.
         */
        fun closeTime(closeTime: OffsetDateTime) = apply { body.closeTime(closeTime) }

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. Omitting this
         * field will scope the backfill to all customers.
         */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the set of events to deprecate
         */
        fun deprecationFilter(deprecationFilter: String) = apply {
            body.deprecationFilter(deprecationFilter)
        }

        /**
         * The external customer ID of the customer to which this backfill is scoped. Omitting this
         * field will scope the backfill to all customers.
         */
        fun externalCustomerId(externalCustomerId: String) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /**
         * If true, replaces all existing events in the timeframe with the newly ingested events. If
         * false, adds the newly ingested events to the existing events.
         */
        fun replaceExistingEvents(replaceExistingEvents: Boolean) = apply {
            body.replaceExistingEvents(replaceExistingEvents)
        }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): EventBackfillCreateParams =
            EventBackfillCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventBackfillCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventBackfillCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
