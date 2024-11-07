// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class EventUpdateParams
constructor(
    private val eventId: String,
    private val eventName: String,
    private val properties: JsonValue,
    private val timestamp: OffsetDateTime,
    private val customerId: String?,
    private val externalCustomerId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun eventId(): String = eventId

    fun eventName(): String = eventName

    fun properties(): JsonValue = properties

    fun timestamp(): OffsetDateTime = timestamp

    fun customerId(): Optional<String> = Optional.ofNullable(customerId)

    fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId)

    @JvmSynthetic
    internal fun getBody(): EventUpdateBody {
        return EventUpdateBody(
            eventName,
            properties,
            timestamp,
            customerId,
            externalCustomerId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> eventId
            else -> ""
        }
    }

    @JsonDeserialize(builder = EventUpdateBody.Builder::class)
    @NoAutoDetect
    class EventUpdateBody
    internal constructor(
        private val eventName: String?,
        private val properties: JsonValue?,
        private val timestamp: OffsetDateTime?,
        private val customerId: String?,
        private val externalCustomerId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A name to meaningfully identify the action or event type. */
        @JsonProperty("event_name") fun eventName(): String? = eventName

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         */
        @JsonProperty("properties") fun properties(): JsonValue? = properties

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         */
        @JsonProperty("timestamp") fun timestamp(): OffsetDateTime? = timestamp

        /** The Orb Customer identifier */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        @JsonProperty("external_customer_id") fun externalCustomerId(): String? = externalCustomerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var eventName: String? = null
            private var properties: JsonValue? = null
            private var timestamp: OffsetDateTime? = null
            private var customerId: String? = null
            private var externalCustomerId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(eventUpdateBody: EventUpdateBody) = apply {
                this.eventName = eventUpdateBody.eventName
                this.properties = eventUpdateBody.properties
                this.timestamp = eventUpdateBody.timestamp
                this.customerId = eventUpdateBody.customerId
                this.externalCustomerId = eventUpdateBody.externalCustomerId
                additionalProperties(eventUpdateBody.additionalProperties)
            }

            /** A name to meaningfully identify the action or event type. */
            @JsonProperty("event_name")
            fun eventName(eventName: String) = apply { this.eventName = eventName }

            /**
             * A dictionary of custom properties. Values in this dictionary must be numeric,
             * boolean, or strings. Nested dictionaries are disallowed.
             */
            @JsonProperty("properties")
            fun properties(properties: JsonValue) = apply { this.properties = properties }

            /**
             * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
             * time that usage was recorded, and is particularly important to attribute usage to a
             * given billing period.
             */
            @JsonProperty("timestamp")
            fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

            /** The Orb Customer identifier */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * An alias for the Orb customer, whose mapping is specified when creating the customer
             */
            @JsonProperty("external_customer_id")
            fun externalCustomerId(externalCustomerId: String) = apply {
                this.externalCustomerId = externalCustomerId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): EventUpdateBody =
                EventUpdateBody(
                    checkNotNull(eventName) { "`eventName` is required but was not set" },
                    checkNotNull(properties) { "`properties` is required but was not set" },
                    checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                    customerId,
                    externalCustomerId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EventUpdateBody && this.eventName == other.eventName && this.properties == other.properties && this.timestamp == other.timestamp && this.customerId == other.customerId && this.externalCustomerId == other.externalCustomerId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(eventName, properties, timestamp, customerId, externalCustomerId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "EventUpdateBody{eventName=$eventName, properties=$properties, timestamp=$timestamp, customerId=$customerId, externalCustomerId=$externalCustomerId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventUpdateParams && this.eventId == other.eventId && this.eventName == other.eventName && this.properties == other.properties && this.timestamp == other.timestamp && this.customerId == other.customerId && this.externalCustomerId == other.externalCustomerId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(eventId, eventName, properties, timestamp, customerId, externalCustomerId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "EventUpdateParams{eventId=$eventId, eventName=$eventName, properties=$properties, timestamp=$timestamp, customerId=$customerId, externalCustomerId=$externalCustomerId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var eventId: String? = null
        private var eventName: String? = null
        private var properties: JsonValue? = null
        private var timestamp: OffsetDateTime? = null
        private var customerId: String? = null
        private var externalCustomerId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventUpdateParams: EventUpdateParams) = apply {
            this.eventId = eventUpdateParams.eventId
            this.eventName = eventUpdateParams.eventName
            this.properties = eventUpdateParams.properties
            this.timestamp = eventUpdateParams.timestamp
            this.customerId = eventUpdateParams.customerId
            this.externalCustomerId = eventUpdateParams.externalCustomerId
            additionalHeaders(eventUpdateParams.additionalHeaders)
            additionalQueryParams(eventUpdateParams.additionalQueryParams)
            additionalBodyProperties(eventUpdateParams.additionalBodyProperties)
        }

        fun eventId(eventId: String) = apply { this.eventId = eventId }

        /** A name to meaningfully identify the action or event type. */
        fun eventName(eventName: String) = apply { this.eventName = eventName }

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         */
        fun properties(properties: JsonValue) = apply { this.properties = properties }

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         */
        fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

        /** The Orb Customer identifier */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): EventUpdateParams =
            EventUpdateParams(
                checkNotNull(eventId) { "`eventId` is required but was not set" },
                checkNotNull(eventName) { "`eventName` is required but was not set" },
                checkNotNull(properties) { "`properties` is required but was not set" },
                checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                customerId,
                externalCustomerId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
