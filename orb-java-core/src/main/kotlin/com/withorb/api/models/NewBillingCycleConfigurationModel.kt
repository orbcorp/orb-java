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
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

@NoAutoDetect
class NewBillingCycleConfigurationModel
@JsonCreator
private constructor(
    @JsonProperty("duration")
    @ExcludeMissing
    private val duration: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("duration_unit")
    @ExcludeMissing
    private val durationUnit: JsonField<DurationUnit> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The duration of the billing period. */
    fun duration(): Long = duration.getRequired("duration")

    /** The unit of billing period duration. */
    fun durationUnit(): DurationUnit = durationUnit.getRequired("duration_unit")

    /** The duration of the billing period. */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

    /** The unit of billing period duration. */
    @JsonProperty("duration_unit")
    @ExcludeMissing
    fun _durationUnit(): JsonField<DurationUnit> = durationUnit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): NewBillingCycleConfigurationModel = apply {
        if (validated) {
            return@apply
        }

        duration()
        durationUnit()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NewBillingCycleConfigurationModel].
         *
         * The following fields are required:
         * ```java
         * .duration()
         * .durationUnit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NewBillingCycleConfigurationModel]. */
    class Builder internal constructor() {

        private var duration: JsonField<Long>? = null
        private var durationUnit: JsonField<DurationUnit>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(newBillingCycleConfigurationModel: NewBillingCycleConfigurationModel) =
            apply {
                duration = newBillingCycleConfigurationModel.duration
                durationUnit = newBillingCycleConfigurationModel.durationUnit
                additionalProperties =
                    newBillingCycleConfigurationModel.additionalProperties.toMutableMap()
            }

        /** The duration of the billing period. */
        fun duration(duration: Long) = duration(JsonField.of(duration))

        /** The duration of the billing period. */
        fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

        /** The unit of billing period duration. */
        fun durationUnit(durationUnit: DurationUnit) = durationUnit(JsonField.of(durationUnit))

        /** The unit of billing period duration. */
        fun durationUnit(durationUnit: JsonField<DurationUnit>) = apply {
            this.durationUnit = durationUnit
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

        fun build(): NewBillingCycleConfigurationModel =
            NewBillingCycleConfigurationModel(
                checkRequired("duration", duration),
                checkRequired("durationUnit", durationUnit),
                additionalProperties.toImmutable(),
            )
    }

    /** The unit of billing period duration. */
    class DurationUnit @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val DAY = of("day")

            @JvmField val MONTH = of("month")

            @JvmStatic fun of(value: String) = DurationUnit(JsonField.of(value))
        }

        /** An enum containing [DurationUnit]'s known values. */
        enum class Known {
            DAY,
            MONTH,
        }

        /**
         * An enum containing [DurationUnit]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DurationUnit] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DAY,
            MONTH,
            /**
             * An enum member indicating that [DurationUnit] was instantiated with an unknown value.
             */
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
                DAY -> Value.DAY
                MONTH -> Value.MONTH
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
                DAY -> Known.DAY
                MONTH -> Known.MONTH
                else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
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

            return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NewBillingCycleConfigurationModel && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewBillingCycleConfigurationModel{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
}
