// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * This endpoint is used to create alerts at the subscription level.
 *
 * Subscription level alerts can be one of two types: `usage_exceeded` or `cost_exceeded`. A
 * `usage_exceeded` alert is scoped to a particular metric and is triggered when the usage of that
 * metric exceeds predefined thresholds during the current billing cycle. A `cost_exceeded` alert is
 * triggered when the total amount due during the current billing cycle surpasses predefined
 * thresholds. `cost_exceeded` alerts do not include burndown of pre-purchase credits. Each
 * subscription can have one `cost_exceeded` alert and one `usage_exceeded` alert per metric that is
 * a part of the subscription. Alerts are triggered based on usage or cost conditions met during the
 * current billing cycle.
 */
class AlertCreateForSubscriptionParams
constructor(
    private val subscriptionId: String,
    private val body: AlertCreateForSubscriptionBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun subscriptionId(): String = subscriptionId

    /** The thresholds that define the values at which the alert will be triggered. */
    fun thresholds(): List<Threshold> = body.thresholds()

    /** The type of alert to create. This must be a valid alert type. */
    fun type(): Type = body.type()

    /** The metric to track usage for. */
    fun metricId(): Optional<String> = body.metricId()

    /** The thresholds that define the values at which the alert will be triggered. */
    fun _thresholds(): JsonField<List<Threshold>> = body._thresholds()

    /** The type of alert to create. This must be a valid alert type. */
    fun _type(): JsonField<Type> = body._type()

    /** The metric to track usage for. */
    fun _metricId(): JsonField<String> = body._metricId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): AlertCreateForSubscriptionBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    @NoAutoDetect
    class AlertCreateForSubscriptionBody
    @JsonCreator
    internal constructor(
        @JsonProperty("thresholds")
        @ExcludeMissing
        private val thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("metric_id")
        @ExcludeMissing
        private val metricId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The thresholds that define the values at which the alert will be triggered. */
        fun thresholds(): List<Threshold> = thresholds.getRequired("thresholds")

        /** The type of alert to create. This must be a valid alert type. */
        fun type(): Type = type.getRequired("type")

        /** The metric to track usage for. */
        fun metricId(): Optional<String> = Optional.ofNullable(metricId.getNullable("metric_id"))

        /** The thresholds that define the values at which the alert will be triggered. */
        @JsonProperty("thresholds")
        @ExcludeMissing
        fun _thresholds(): JsonField<List<Threshold>> = thresholds

        /** The type of alert to create. This must be a valid alert type. */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /** The metric to track usage for. */
        @JsonProperty("metric_id") @ExcludeMissing fun _metricId(): JsonField<String> = metricId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AlertCreateForSubscriptionBody = apply {
            if (validated) {
                return@apply
            }

            thresholds().forEach { it.validate() }
            type()
            metricId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var thresholds: JsonField<MutableList<Threshold>>? = null
            private var type: JsonField<Type>? = null
            private var metricId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(alertCreateForSubscriptionBody: AlertCreateForSubscriptionBody) =
                apply {
                    thresholds =
                        alertCreateForSubscriptionBody.thresholds.map { it.toMutableList() }
                    type = alertCreateForSubscriptionBody.type
                    metricId = alertCreateForSubscriptionBody.metricId
                    additionalProperties =
                        alertCreateForSubscriptionBody.additionalProperties.toMutableMap()
                }

            /** The thresholds that define the values at which the alert will be triggered. */
            fun thresholds(thresholds: List<Threshold>) = thresholds(JsonField.of(thresholds))

            /** The thresholds that define the values at which the alert will be triggered. */
            fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
                this.thresholds = thresholds.map { it.toMutableList() }
            }

            /** The thresholds that define the values at which the alert will be triggered. */
            fun addThreshold(threshold: Threshold) = apply {
                thresholds =
                    (thresholds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(threshold)
                    }
            }

            /** The type of alert to create. This must be a valid alert type. */
            fun type(type: Type) = type(JsonField.of(type))

            /** The type of alert to create. This must be a valid alert type. */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The metric to track usage for. */
            fun metricId(metricId: String?) = metricId(JsonField.ofNullable(metricId))

            /** The metric to track usage for. */
            fun metricId(metricId: Optional<String>) = metricId(metricId.orElse(null))

            /** The metric to track usage for. */
            fun metricId(metricId: JsonField<String>) = apply { this.metricId = metricId }

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

            fun build(): AlertCreateForSubscriptionBody =
                AlertCreateForSubscriptionBody(
                    checkRequired("thresholds", thresholds).map { it.toImmutable() },
                    checkRequired("type", type),
                    metricId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlertCreateForSubscriptionBody && thresholds == other.thresholds && type == other.type && metricId == other.metricId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(thresholds, type, metricId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AlertCreateForSubscriptionBody{thresholds=$thresholds, type=$type, metricId=$metricId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var body: AlertCreateForSubscriptionBody.Builder =
            AlertCreateForSubscriptionBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(alertCreateForSubscriptionParams: AlertCreateForSubscriptionParams) =
            apply {
                subscriptionId = alertCreateForSubscriptionParams.subscriptionId
                body = alertCreateForSubscriptionParams.body.toBuilder()
                additionalHeaders = alertCreateForSubscriptionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    alertCreateForSubscriptionParams.additionalQueryParams.toBuilder()
            }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /** The thresholds that define the values at which the alert will be triggered. */
        fun thresholds(thresholds: List<Threshold>) = apply { body.thresholds(thresholds) }

        /** The thresholds that define the values at which the alert will be triggered. */
        fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
            body.thresholds(thresholds)
        }

        /** The thresholds that define the values at which the alert will be triggered. */
        fun addThreshold(threshold: Threshold) = apply { body.addThreshold(threshold) }

        /** The type of alert to create. This must be a valid alert type. */
        fun type(type: Type) = apply { body.type(type) }

        /** The type of alert to create. This must be a valid alert type. */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** The metric to track usage for. */
        fun metricId(metricId: String?) = apply { body.metricId(metricId) }

        /** The metric to track usage for. */
        fun metricId(metricId: Optional<String>) = metricId(metricId.orElse(null))

        /** The metric to track usage for. */
        fun metricId(metricId: JsonField<String>) = apply { body.metricId(metricId) }

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

        fun build(): AlertCreateForSubscriptionParams =
            AlertCreateForSubscriptionParams(
                checkRequired("subscriptionId", subscriptionId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Thresholds are used to define the conditions under which an alert will be triggered. */
    @NoAutoDetect
    class Threshold
    @JsonCreator
    private constructor(
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The value at which an alert will fire. For credit balance alerts, the alert will fire at
         * or below this value. For usage and cost alerts, the alert will fire at or above this
         * value.
         */
        fun value(): Double = value.getRequired("value")

        /**
         * The value at which an alert will fire. For credit balance alerts, the alert will fire at
         * or below this value. For usage and cost alerts, the alert will fire at or above this
         * value.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Threshold = apply {
            if (validated) {
                return@apply
            }

            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var value: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(threshold: Threshold) = apply {
                value = threshold.value
                additionalProperties = threshold.additionalProperties.toMutableMap()
            }

            /**
             * The value at which an alert will fire. For credit balance alerts, the alert will fire
             * at or below this value. For usage and cost alerts, the alert will fire at or above
             * this value.
             */
            fun value(value: Double) = value(JsonField.of(value))

            /**
             * The value at which an alert will fire. For credit balance alerts, the alert will fire
             * at or below this value. For usage and cost alerts, the alert will fire at or above
             * this value.
             */
            fun value(value: JsonField<Double>) = apply { this.value = value }

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

            fun build(): Threshold =
                Threshold(checkRequired("value", value), additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Threshold && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Threshold{value=$value, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val USAGE_EXCEEDED = of("usage_exceeded")

            @JvmField val COST_EXCEEDED = of("cost_exceeded")

            @JvmField val CREDIT_BALANCE_DEPLETED = of("credit_balance_depleted")

            @JvmField val CREDIT_BALANCE_DROPPED = of("credit_balance_dropped")

            @JvmField val CREDIT_BALANCE_RECOVERED = of("credit_balance_recovered")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_DROPPED,
            CREDIT_BALANCE_RECOVERED,
        }

        enum class Value {
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_DROPPED,
            CREDIT_BALANCE_RECOVERED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USAGE_EXCEEDED -> Value.USAGE_EXCEEDED
                COST_EXCEEDED -> Value.COST_EXCEEDED
                CREDIT_BALANCE_DEPLETED -> Value.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_DROPPED -> Value.CREDIT_BALANCE_DROPPED
                CREDIT_BALANCE_RECOVERED -> Value.CREDIT_BALANCE_RECOVERED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USAGE_EXCEEDED -> Known.USAGE_EXCEEDED
                COST_EXCEEDED -> Known.COST_EXCEEDED
                CREDIT_BALANCE_DEPLETED -> Known.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_DROPPED -> Known.CREDIT_BALANCE_DROPPED
                CREDIT_BALANCE_RECOVERED -> Known.CREDIT_BALANCE_RECOVERED
                else -> throw OrbInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlertCreateForSubscriptionParams && subscriptionId == other.subscriptionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AlertCreateForSubscriptionParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
