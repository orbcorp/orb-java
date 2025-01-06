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

class EventUpdateParams
constructor(
    private val eventId: String,
    private val body: EventUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun eventId(): String = eventId

    /** A name to meaningfully identify the action or event type. */
    fun eventName(): String = body.eventName()

    /**
     * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
     * strings. Nested dictionaries are disallowed.
     */
    fun properties(): JsonValue = body.properties()

    /**
     * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the time
     * that usage was recorded, and is particularly important to attribute usage to a given billing
     * period.
     */
    fun timestamp(): OffsetDateTime = body.timestamp()

    /** The Orb Customer identifier */
    fun customerId(): Optional<String> = body.customerId()

    /** An alias for the Orb customer, whose mapping is specified when creating the customer */
    fun externalCustomerId(): Optional<String> = body.externalCustomerId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): EventUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> eventId
            else -> ""
        }
    }

    @NoAutoDetect
    class EventUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("event_name") private val eventName: String,
        @JsonProperty("properties") private val properties: JsonValue,
        @JsonProperty("timestamp") private val timestamp: OffsetDateTime,
        @JsonProperty("customer_id") private val customerId: String?,
        @JsonProperty("external_customer_id") private val externalCustomerId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A name to meaningfully identify the action or event type. */
        @JsonProperty("event_name") fun eventName(): String = eventName

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         */
        @JsonProperty("properties") fun properties(): JsonValue = properties

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         */
        @JsonProperty("timestamp") fun timestamp(): OffsetDateTime = timestamp

        /** The Orb Customer identifier */
        @JsonProperty("customer_id")
        fun customerId(): Optional<String> = Optional.ofNullable(customerId)

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        @JsonProperty("external_customer_id")
        fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId)

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
                eventName = eventUpdateBody.eventName
                properties = eventUpdateBody.properties
                timestamp = eventUpdateBody.timestamp
                customerId = eventUpdateBody.customerId
                externalCustomerId = eventUpdateBody.externalCustomerId
                additionalProperties = eventUpdateBody.additionalProperties.toMutableMap()
            }

            /** A name to meaningfully identify the action or event type. */
            fun eventName(eventName: String) = apply { this.eventName = eventName }

            /**
             * A dictionary of custom properties. Values in this dictionary must be numeric,
             * boolean, or strings. Nested dictionaries are disallowed.
             */
            fun properties(properties: JsonValue) = apply { this.properties = properties }

            /**
             * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
             * time that usage was recorded, and is particularly important to attribute usage to a
             * given billing period.
             */
            fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

            /** The Orb Customer identifier */
            fun customerId(customerId: String?) = apply { this.customerId = customerId }

            /** The Orb Customer identifier */
            fun customerId(customerId: Optional<String>) = customerId(customerId.orElse(null))

            /**
             * An alias for the Orb customer, whose mapping is specified when creating the customer
             */
            fun externalCustomerId(externalCustomerId: String?) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /**
             * An alias for the Orb customer, whose mapping is specified when creating the customer
             */
            fun externalCustomerId(externalCustomerId: Optional<String>) =
                externalCustomerId(externalCustomerId.orElse(null))

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

            return /* spotless:off */ other is EventUpdateBody && eventName == other.eventName && properties == other.properties && timestamp == other.timestamp && customerId == other.customerId && externalCustomerId == other.externalCustomerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventName, properties, timestamp, customerId, externalCustomerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EventUpdateBody{eventName=$eventName, properties=$properties, timestamp=$timestamp, customerId=$customerId, externalCustomerId=$externalCustomerId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var eventId: String? = null
        private var body: EventUpdateBody.Builder = EventUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventUpdateParams: EventUpdateParams) = apply {
            eventId = eventUpdateParams.eventId
            body = eventUpdateParams.body.toBuilder()
            additionalHeaders = eventUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventUpdateParams.additionalQueryParams.toBuilder()
        }

        fun eventId(eventId: String) = apply { this.eventId = eventId }

        /** A name to meaningfully identify the action or event type. */
        fun eventName(eventName: String) = apply { body.eventName(eventName) }

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         */
        fun properties(properties: JsonValue) = apply { body.properties(properties) }

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         */
        fun timestamp(timestamp: OffsetDateTime) = apply { body.timestamp(timestamp) }

        /** The Orb Customer identifier */
        fun customerId(customerId: String?) = apply { body.customerId(customerId) }

        /** The Orb Customer identifier */
        fun customerId(customerId: Optional<String>) = customerId(customerId.orElse(null))

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        fun externalCustomerId(externalCustomerId: String?) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /** An alias for the Orb customer, whose mapping is specified when creating the customer */
        fun externalCustomerId(externalCustomerId: Optional<String>) =
            externalCustomerId(externalCustomerId.orElse(null))

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

        fun build(): EventUpdateParams =
            EventUpdateParams(
                checkNotNull(eventId) { "`eventId` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventUpdateParams && eventId == other.eventId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventUpdateParams{eventId=$eventId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
