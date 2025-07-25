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

class AmountDiscount
private constructor(
    private val amountDiscount: JsonField<String>,
    private val discountType: JsonField<DiscountType>,
    private val appliesToPriceIds: JsonField<List<String>>,
    private val filters: JsonField<List<TransformPriceFilter>>,
    private val reason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount_discount")
        @ExcludeMissing
        amountDiscount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_type")
        @ExcludeMissing
        discountType: JsonField<DiscountType> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<TransformPriceFilter>> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
    ) : this(amountDiscount, discountType, appliesToPriceIds, filters, reason, mutableMapOf())

    /**
     * Only available if discount_type is `amount`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discountType(): DiscountType = discountType.getRequired("discount_type")

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
     * The filters that determine which prices to apply this discount to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun filters(): Optional<List<TransformPriceFilter>> = filters.getOptional("filters")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun reason(): Optional<String> = reason.getOptional("reason")

    /**
     * Returns the raw JSON value of [amountDiscount].
     *
     * Unlike [amountDiscount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_discount")
    @ExcludeMissing
    fun _amountDiscount(): JsonField<String> = amountDiscount

    /**
     * Returns the raw JSON value of [discountType].
     *
     * Unlike [discountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_type")
    @ExcludeMissing
    fun _discountType(): JsonField<DiscountType> = discountType

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
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters")
    @ExcludeMissing
    fun _filters(): JsonField<List<TransformPriceFilter>> = filters

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
         * Returns a mutable builder for constructing an instance of [AmountDiscount].
         *
         * The following fields are required:
         * ```java
         * .amountDiscount()
         * .discountType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AmountDiscount]. */
    class Builder internal constructor() {

        private var amountDiscount: JsonField<String>? = null
        private var discountType: JsonField<DiscountType>? = null
        private var appliesToPriceIds: JsonField<MutableList<String>>? = null
        private var filters: JsonField<MutableList<TransformPriceFilter>>? = null
        private var reason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(amountDiscount: AmountDiscount) = apply {
            this.amountDiscount = amountDiscount.amountDiscount
            discountType = amountDiscount.discountType
            appliesToPriceIds = amountDiscount.appliesToPriceIds.map { it.toMutableList() }
            filters = amountDiscount.filters.map { it.toMutableList() }
            reason = amountDiscount.reason
            additionalProperties = amountDiscount.additionalProperties.toMutableMap()
        }

        /** Only available if discount_type is `amount`. */
        fun amountDiscount(amountDiscount: String) = amountDiscount(JsonField.of(amountDiscount))

        /**
         * Sets [Builder.amountDiscount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountDiscount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountDiscount(amountDiscount: JsonField<String>) = apply {
            this.amountDiscount = amountDiscount
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

        /** The filters that determine which prices to apply this discount to. */
        fun filters(filters: List<TransformPriceFilter>?) = filters(JsonField.ofNullable(filters))

        /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
        fun filters(filters: Optional<List<TransformPriceFilter>>) = filters(filters.getOrNull())

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed `List<TransformPriceFilter>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun filters(filters: JsonField<List<TransformPriceFilter>>) = apply {
            this.filters = filters.map { it.toMutableList() }
        }

        /**
         * Adds a single [TransformPriceFilter] to [filters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFilter(filter: TransformPriceFilter) = apply {
            filters =
                (filters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filters", it).add(filter)
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
         * Returns an immutable instance of [AmountDiscount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amountDiscount()
         * .discountType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AmountDiscount =
            AmountDiscount(
                checkRequired("amountDiscount", amountDiscount),
                checkRequired("discountType", discountType),
                (appliesToPriceIds ?: JsonMissing.of()).map { it.toImmutable() },
                (filters ?: JsonMissing.of()).map { it.toImmutable() },
                reason,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AmountDiscount = apply {
        if (validated) {
            return@apply
        }

        amountDiscount()
        discountType().validate()
        appliesToPriceIds()
        filters().ifPresent { it.forEach { it.validate() } }
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
        (if (amountDiscount.asKnown().isPresent) 1 else 0) +
            (discountType.asKnown().getOrNull()?.validity() ?: 0) +
            (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
            (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
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

            @JvmField val AMOUNT = of("amount")

            @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
        }

        /** An enum containing [DiscountType]'s known values. */
        enum class Known {
            AMOUNT
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
            AMOUNT,
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
                AMOUNT -> Value.AMOUNT
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
                AMOUNT -> Known.AMOUNT
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

        return /* spotless:off */ other is AmountDiscount && amountDiscount == other.amountDiscount && discountType == other.discountType && appliesToPriceIds == other.appliesToPriceIds && filters == other.filters && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amountDiscount, discountType, appliesToPriceIds, filters, reason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AmountDiscount{amountDiscount=$amountDiscount, discountType=$discountType, appliesToPriceIds=$appliesToPriceIds, filters=$filters, reason=$reason, additionalProperties=$additionalProperties}"
}
