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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CreateCustomerAlertRequest
@JsonCreator
private constructor(
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("thresholds")
    @ExcludeMissing
    private val thresholds: JsonField<List<ThresholdModel>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The case sensitive currency or custom pricing unit to use for this alert. */
    fun currency(): String = currency.getRequired("currency")

    /** The type of alert to create. This must be a valid alert type. */
    fun type(): Type = type.getRequired("type")

    /** The thresholds that define the values at which the alert will be triggered. */
    fun thresholds(): Optional<List<ThresholdModel>> =
        Optional.ofNullable(thresholds.getNullable("thresholds"))

    /** The case sensitive currency or custom pricing unit to use for this alert. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /** The type of alert to create. This must be a valid alert type. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** The thresholds that define the values at which the alert will be triggered. */
    @JsonProperty("thresholds")
    @ExcludeMissing
    fun _thresholds(): JsonField<List<ThresholdModel>> = thresholds

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CreateCustomerAlertRequest = apply {
        if (validated) {
            return@apply
        }

        currency()
        type()
        thresholds().ifPresent { it.forEach { it.validate() } }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreateCustomerAlertRequest].
         *
         * The following fields are required:
         * ```java
         * .currency()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateCustomerAlertRequest]. */
    class Builder internal constructor() {

        private var currency: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var thresholds: JsonField<MutableList<ThresholdModel>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createCustomerAlertRequest: CreateCustomerAlertRequest) = apply {
            currency = createCustomerAlertRequest.currency
            type = createCustomerAlertRequest.type
            thresholds = createCustomerAlertRequest.thresholds.map { it.toMutableList() }
            additionalProperties = createCustomerAlertRequest.additionalProperties.toMutableMap()
        }

        /** The case sensitive currency or custom pricing unit to use for this alert. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The case sensitive currency or custom pricing unit to use for this alert. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The type of alert to create. This must be a valid alert type. */
        fun type(type: Type) = type(JsonField.of(type))

        /** The type of alert to create. This must be a valid alert type. */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The thresholds that define the values at which the alert will be triggered. */
        fun thresholds(thresholds: List<ThresholdModel>?) =
            thresholds(JsonField.ofNullable(thresholds))

        /** The thresholds that define the values at which the alert will be triggered. */
        fun thresholds(thresholds: Optional<List<ThresholdModel>>) =
            thresholds(thresholds.orElse(null))

        /** The thresholds that define the values at which the alert will be triggered. */
        fun thresholds(thresholds: JsonField<List<ThresholdModel>>) = apply {
            this.thresholds = thresholds.map { it.toMutableList() }
        }

        /** The thresholds that define the values at which the alert will be triggered. */
        fun addThreshold(threshold: ThresholdModel) = apply {
            thresholds =
                (thresholds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("thresholds", it).add(threshold)
                }
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

        fun build(): CreateCustomerAlertRequest =
            CreateCustomerAlertRequest(
                checkRequired("currency", currency),
                checkRequired("type", type),
                (thresholds ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /** The type of alert to create. This must be a valid alert type. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val USAGE_EXCEEDED = of("usage_exceeded")

            @JvmField val COST_EXCEEDED = of("cost_exceeded")

            @JvmField val CREDIT_BALANCE_DEPLETED = of("credit_balance_depleted")

            @JvmField val CREDIT_BALANCE_DROPPED = of("credit_balance_dropped")

            @JvmField val CREDIT_BALANCE_RECOVERED = of("credit_balance_recovered")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_DROPPED,
            CREDIT_BALANCE_RECOVERED,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_DROPPED,
            CREDIT_BALANCE_RECOVERED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                USAGE_EXCEEDED -> Value.USAGE_EXCEEDED
                COST_EXCEEDED -> Value.COST_EXCEEDED
                CREDIT_BALANCE_DEPLETED -> Value.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_DROPPED -> Value.CREDIT_BALANCE_DROPPED
                CREDIT_BALANCE_RECOVERED -> Value.CREDIT_BALANCE_RECOVERED
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
                USAGE_EXCEEDED -> Known.USAGE_EXCEEDED
                COST_EXCEEDED -> Known.COST_EXCEEDED
                CREDIT_BALANCE_DEPLETED -> Known.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_DROPPED -> Known.CREDIT_BALANCE_DROPPED
                CREDIT_BALANCE_RECOVERED -> Known.CREDIT_BALANCE_RECOVERED
                else -> throw OrbInvalidDataException("Unknown Type: $value")
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreateCustomerAlertRequest && currency == other.currency && type == other.type && thresholds == other.thresholds && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(currency, type, thresholds, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateCustomerAlertRequest{currency=$currency, type=$type, thresholds=$thresholds, additionalProperties=$additionalProperties}"
}
