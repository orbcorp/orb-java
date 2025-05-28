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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PercentageDiscount
private constructor(
    private val discountType: JsonField<DiscountType>,
    private val percentageDiscount: JsonField<Double>,
    private val appliesToPriceIds: JsonField<List<String>>,
    private val reason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("discount_type")
        @ExcludeMissing
        discountType: JsonField<DiscountType> = JsonMissing.of(),
        @JsonProperty("percentage_discount")
        @ExcludeMissing
        percentageDiscount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
    ) : this(discountType, percentageDiscount, appliesToPriceIds, reason, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discountType(): DiscountType = discountType.getRequired("discount_type")

    /**
     * Only available if discount_type is `percentage`. This is a number between 0 and 1.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts, this can be a
     * subset of prices.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun appliesToPriceIds(): Optional<List<String>> =
        appliesToPriceIds.getOptional("applies_to_price_ids")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun reason(): Optional<String> = reason.getOptional("reason")

    /**
     * Returns the raw JSON value of [discountType].
     *
     * Unlike [discountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_type")
    @ExcludeMissing
    fun _discountType(): JsonField<DiscountType> = discountType

    /**
     * Returns the raw JSON value of [percentageDiscount].
     *
     * Unlike [percentageDiscount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("percentage_discount")
    @ExcludeMissing
    fun _percentageDiscount(): JsonField<Double> = percentageDiscount

    /**
     * Returns the raw JSON value of [appliesToPriceIds].
     *
     * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PercentageDiscount].
         *
         * The following fields are required:
         * ```java
         * .discountType()
         * .percentageDiscount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PercentageDiscount]. */
    class Builder internal constructor() {

        private var discountType: JsonField<DiscountType>? = null
        private var percentageDiscount: JsonField<Double>? = null
        private var appliesToPriceIds: JsonField<MutableList<String>>? = null
        private var reason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(percentageDiscount: PercentageDiscount) = apply {
            discountType = percentageDiscount.discountType
            this.percentageDiscount = percentageDiscount.percentageDiscount
            appliesToPriceIds = percentageDiscount.appliesToPriceIds.map { it.toMutableList() }
            reason = percentageDiscount.reason
            additionalProperties = percentageDiscount.additionalProperties.toMutableMap()
        }

        fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

        /**
         * Sets [Builder.discountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountType] with a well-typed [DiscountType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discountType(discountType: JsonField<DiscountType>) = apply {
            this.discountType = discountType
        }

        /** Only available if discount_type is `percentage`. This is a number between 0 and 1. */
        fun percentageDiscount(percentageDiscount: Double) =
            percentageDiscount(JsonField.of(percentageDiscount))

        /**
         * Sets [Builder.percentageDiscount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentageDiscount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
            this.percentageDiscount = percentageDiscount
        }

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts, this can
         * be a subset of prices.
         */
        fun appliesToPriceIds(appliesToPriceIds: List<String>?) =
            appliesToPriceIds(JsonField.ofNullable(appliesToPriceIds))

        /** Alias for calling [Builder.appliesToPriceIds] with `appliesToPriceIds.orElse(null)`. */
        fun appliesToPriceIds(appliesToPriceIds: Optional<List<String>>) =
            appliesToPriceIds(appliesToPriceIds.getOrNull())

        /**
         * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appliesToPriceIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [appliesToPriceIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAppliesToPriceId(appliesToPriceId: String) = apply {
            appliesToPriceIds =
                (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                }
        }

        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
        fun reason(reason: Optional<String>) = reason(reason.getOrNull())

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

        /**
         * Returns an immutable instance of [PercentageDiscount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .discountType()
         * .percentageDiscount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PercentageDiscount =
            PercentageDiscount(
                checkRequired("discountType", discountType),
                checkRequired("percentageDiscount", percentageDiscount),
                (appliesToPriceIds ?: JsonMissing.of()).map { it.toImmutable() },
                reason,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PercentageDiscount = apply {
        if (validated) {
            return@apply
        }

        discountType().validate()
        percentageDiscount()
        appliesToPriceIds()
        reason()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OrbInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (discountType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (percentageDiscount.asKnown().isPresent) 1 else 0) +
            (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
            (if (reason.asKnown().isPresent) 1 else 0)

    class DiscountType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val PERCENTAGE = of("percentage")

            @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
        }

        /** An enum containing [DiscountType]'s known values. */
        enum class Known {
            PERCENTAGE
        }

        /**
         * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DiscountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PERCENTAGE,
            /**
             * An enum member indicating that [DiscountType] was instantiated with an unknown value.
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
                PERCENTAGE -> Value.PERCENTAGE
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
                PERCENTAGE -> Known.PERCENTAGE
                else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
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

        private var validated: Boolean = false

        fun validate(): DiscountType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PercentageDiscount && discountType == other.discountType && percentageDiscount == other.percentageDiscount && appliesToPriceIds == other.appliesToPriceIds && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(discountType, percentageDiscount, appliesToPriceIds, reason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PercentageDiscount{discountType=$discountType, percentageDiscount=$percentageDiscount, appliesToPriceIds=$appliesToPriceIds, reason=$reason, additionalProperties=$additionalProperties}"
}
