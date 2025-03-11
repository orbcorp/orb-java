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
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class AmountDiscount @JsonCreator private constructor(
    @JsonProperty("amount_discount") @ExcludeMissing private val amountDiscount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("applies_to_price_ids") @ExcludeMissing private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("discount_type") @ExcludeMissing private val discountType: JsonField<DiscountType> = JsonMissing.of(),
    @JsonProperty("reason") @ExcludeMissing private val reason: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** Only available if discount_type is `amount`. */
    fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts,
     * this can be a subset of prices.
     */
    fun appliesToPriceIds(): List<String> = appliesToPriceIds.getRequired("applies_to_price_ids")

    fun discountType(): DiscountType = discountType.getRequired("discount_type")

    fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

    /** Only available if discount_type is `amount`. */
    @JsonProperty("amount_discount")
    @ExcludeMissing
    fun _amountDiscount(): JsonField<String> = amountDiscount

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts,
     * this can be a subset of prices.
     */
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

    @JsonProperty("discount_type")
    @ExcludeMissing
    fun _discountType(): JsonField<DiscountType> = discountType

    @JsonProperty("reason")
    @ExcludeMissing
    fun _reason(): JsonField<String> = reason

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AmountDiscount =
        apply {
            if (validated) {
              return@apply
            }

            amountDiscount()
            appliesToPriceIds()
            discountType()
            reason()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AmountDiscount].
         *
         * The following fields are required:
         *
         * ```java
         * .amountDiscount()
         * .appliesToPriceIds()
         * .discountType()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [AmountDiscount]. */
    class Builder internal constructor() {

        private var amountDiscount: JsonField<String>? = null
        private var appliesToPriceIds: JsonField<MutableList<String>>? = null
        private var discountType: JsonField<DiscountType>? = null
        private var reason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(amountDiscount: AmountDiscount) =
            apply {
                this.amountDiscount = amountDiscount.amountDiscount
                appliesToPriceIds = amountDiscount.appliesToPriceIds.map { it.toMutableList() }
                discountType = amountDiscount.discountType
                reason = amountDiscount.reason
                additionalProperties = amountDiscount.additionalProperties.toMutableMap()
            }

        /** Only available if discount_type is `amount`. */
        fun amountDiscount(amountDiscount: String) = amountDiscount(JsonField.of(amountDiscount))

        /** Only available if discount_type is `amount`. */
        fun amountDiscount(amountDiscount: JsonField<String>) =
            apply {
                this.amountDiscount = amountDiscount
            }

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts,
         * this can be a subset of prices.
         */
        fun appliesToPriceIds(appliesToPriceIds: List<String>) = appliesToPriceIds(JsonField.of(appliesToPriceIds))

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts,
         * this can be a subset of prices.
         */
        fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) =
            apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts,
         * this can be a subset of prices.
         */
        fun addAppliesToPriceId(appliesToPriceId: String) =
            apply {
                appliesToPriceIds = (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                }
            }

        fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

        fun discountType(discountType: JsonField<DiscountType>) =
            apply {
                this.discountType = discountType
            }

        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        fun reason(reason: Optional<String>) = reason(reason.getOrNull())

        fun reason(reason: JsonField<String>) =
            apply {
                this.reason = reason
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        fun build(): AmountDiscount =
            AmountDiscount(
              checkRequired(
                "amountDiscount", amountDiscount
              ),
              checkRequired(
                "appliesToPriceIds", appliesToPriceIds
              ).map { it.toImmutable() },
              checkRequired(
                "discountType", discountType
              ),
              reason,
              additionalProperties.toImmutable(),
            )
    }

    class DiscountType @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AMOUNT = of("amount")

            @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
        }

        /** An enum containing [DiscountType]'s known values. */
        enum class Known {
            AMOUNT,
        }

        /**
         * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [DiscountType] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AMOUNT,
            /**
             * An enum member indicating that [DiscountType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AMOUNT -> Value.AMOUNT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known
         * member.
         */
        fun known(): Known =
            when (this) {
                AMOUNT -> Known.AMOUNT
                else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the
         * expected primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { OrbInvalidDataException("Value is not a String") }

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

      return /* spotless:off */ other is AmountDiscount && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && discountType == other.discountType && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amountDiscount, appliesToPriceIds, discountType, reason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "AmountDiscount{amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, discountType=$discountType, reason=$reason, additionalProperties=$additionalProperties}"
}
