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

class PriceEvaluateParams
constructor(
    private val priceId: String,
    private val timeframeEnd: OffsetDateTime,
    private val timeframeStart: OffsetDateTime,
    private val customerId: String?,
    private val externalCustomerId: String?,
    private val filter: String?,
    private val groupingKeys: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun priceId(): String = priceId

    fun timeframeEnd(): OffsetDateTime = timeframeEnd

    fun timeframeStart(): OffsetDateTime = timeframeStart

    fun customerId(): Optional<String> = Optional.ofNullable(customerId)

    fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId)

    fun filter(): Optional<String> = Optional.ofNullable(filter)

    fun groupingKeys(): Optional<List<String>> = Optional.ofNullable(groupingKeys)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): PriceEvaluateBody {
        return PriceEvaluateBody(
            timeframeEnd,
            timeframeStart,
            customerId,
            externalCustomerId,
            filter,
            groupingKeys,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> priceId
            else -> ""
        }
    }

    @NoAutoDetect
    class PriceEvaluateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("timeframe_end") private val timeframeEnd: OffsetDateTime,
        @JsonProperty("timeframe_start") private val timeframeStart: OffsetDateTime,
        @JsonProperty("customer_id") private val customerId: String?,
        @JsonProperty("external_customer_id") private val externalCustomerId: String?,
        @JsonProperty("filter") private val filter: String?,
        @JsonProperty("grouping_keys") private val groupingKeys: List<String>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The exclusive upper bound for event timestamps */
        @JsonProperty("timeframe_end") fun timeframeEnd(): OffsetDateTime = timeframeEnd

        /** The inclusive lower bound for event timestamps */
        @JsonProperty("timeframe_start") fun timeframeStart(): OffsetDateTime = timeframeStart

        /** The ID of the customer to which this evaluation is scoped. */
        @JsonProperty("customer_id")
        fun customerId(): Optional<String> = Optional.ofNullable(customerId)

        /** The external customer ID of the customer to which this evaluation is scoped. */
        @JsonProperty("external_customer_id")
        fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId)

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the underlying billable metric
         */
        @JsonProperty("filter") fun filter(): Optional<String> = Optional.ofNullable(filter)

        /**
         * Properties (or
         * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used
         * to group the underlying billable metric
         */
        @JsonProperty("grouping_keys")
        fun groupingKeys(): Optional<List<String>> = Optional.ofNullable(groupingKeys)

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
            private var customerId: String? = null
            private var externalCustomerId: String? = null
            private var filter: String? = null
            private var groupingKeys: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(priceEvaluateBody: PriceEvaluateBody) = apply {
                timeframeEnd = priceEvaluateBody.timeframeEnd
                timeframeStart = priceEvaluateBody.timeframeStart
                customerId = priceEvaluateBody.customerId
                externalCustomerId = priceEvaluateBody.externalCustomerId
                filter = priceEvaluateBody.filter
                groupingKeys = priceEvaluateBody.groupingKeys?.toMutableList()
                additionalProperties = priceEvaluateBody.additionalProperties.toMutableMap()
            }

            /** The exclusive upper bound for event timestamps */
            fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply {
                this.timeframeEnd = timeframeEnd
            }

            /** The inclusive lower bound for event timestamps */
            fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
                this.timeframeStart = timeframeStart
            }

            /** The ID of the customer to which this evaluation is scoped. */
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** The external customer ID of the customer to which this evaluation is scoped. */
            fun externalCustomerId(externalCustomerId: String) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /**
             * A boolean
             * [computed property](../guides/extensibility/advanced-metrics#computed-properties)
             * used to filter the underlying billable metric
             */
            fun filter(filter: String) = apply { this.filter = filter }

            /**
             * Properties (or
             * [computed properties](../guides/extensibility/advanced-metrics#computed-properties))
             * used to group the underlying billable metric
             */
            fun groupingKeys(groupingKeys: List<String>) = apply {
                this.groupingKeys = groupingKeys
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

            fun build(): PriceEvaluateBody =
                PriceEvaluateBody(
                    checkNotNull(timeframeEnd) { "`timeframeEnd` is required but was not set" },
                    checkNotNull(timeframeStart) { "`timeframeStart` is required but was not set" },
                    customerId,
                    externalCustomerId,
                    filter,
                    groupingKeys?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PriceEvaluateBody && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && customerId == other.customerId && externalCustomerId == other.externalCustomerId && filter == other.filter && groupingKeys == other.groupingKeys && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(timeframeEnd, timeframeStart, customerId, externalCustomerId, filter, groupingKeys, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PriceEvaluateBody{timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, customerId=$customerId, externalCustomerId=$externalCustomerId, filter=$filter, groupingKeys=$groupingKeys, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var priceId: String? = null
        private var timeframeEnd: OffsetDateTime? = null
        private var timeframeStart: OffsetDateTime? = null
        private var customerId: String? = null
        private var externalCustomerId: String? = null
        private var filter: String? = null
        private var groupingKeys: MutableList<String> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(priceEvaluateParams: PriceEvaluateParams) = apply {
            priceId = priceEvaluateParams.priceId
            timeframeEnd = priceEvaluateParams.timeframeEnd
            timeframeStart = priceEvaluateParams.timeframeStart
            customerId = priceEvaluateParams.customerId
            externalCustomerId = priceEvaluateParams.externalCustomerId
            filter = priceEvaluateParams.filter
            groupingKeys = priceEvaluateParams.groupingKeys?.toMutableList() ?: mutableListOf()
            additionalHeaders = priceEvaluateParams.additionalHeaders.toBuilder()
            additionalQueryParams = priceEvaluateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = priceEvaluateParams.additionalBodyProperties.toMutableMap()
        }

        fun priceId(priceId: String) = apply { this.priceId = priceId }

        /** The exclusive upper bound for event timestamps */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { this.timeframeEnd = timeframeEnd }

        /** The inclusive lower bound for event timestamps */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            this.timeframeStart = timeframeStart
        }

        /** The ID of the customer to which this evaluation is scoped. */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** The external customer ID of the customer to which this evaluation is scoped. */
        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the underlying billable metric
         */
        fun filter(filter: String) = apply { this.filter = filter }

        /**
         * Properties (or
         * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used
         * to group the underlying billable metric
         */
        fun groupingKeys(groupingKeys: List<String>) = apply {
            this.groupingKeys.clear()
            this.groupingKeys.addAll(groupingKeys)
        }

        /**
         * Properties (or
         * [computed properties](../guides/extensibility/advanced-metrics#computed-properties)) used
         * to group the underlying billable metric
         */
        fun addGroupingKey(groupingKey: String) = apply { this.groupingKeys.add(groupingKey) }

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

        fun build(): PriceEvaluateParams =
            PriceEvaluateParams(
                checkNotNull(priceId) { "`priceId` is required but was not set" },
                checkNotNull(timeframeEnd) { "`timeframeEnd` is required but was not set" },
                checkNotNull(timeframeStart) { "`timeframeStart` is required but was not set" },
                customerId,
                externalCustomerId,
                filter,
                groupingKeys.toImmutable().ifEmpty { null },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceEvaluateParams && priceId == other.priceId && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && customerId == other.customerId && externalCustomerId == other.externalCustomerId && filter == other.filter && groupingKeys == other.groupingKeys && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(priceId, timeframeEnd, timeframeStart, customerId, externalCustomerId, filter, groupingKeys, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "PriceEvaluateParams{priceId=$priceId, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, customerId=$customerId, externalCustomerId=$externalCustomerId, filter=$filter, groupingKeys=$groupingKeys, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
