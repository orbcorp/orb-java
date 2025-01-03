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
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AmountDiscount
@JsonCreator
private constructor(
    @JsonProperty("discount_type")
    @ExcludeMissing
    private val discountType: JsonField<DiscountType> = JsonMissing.of(),
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("reason")
    @ExcludeMissing
    private val reason: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount_discount")
    @ExcludeMissing
    private val amountDiscount: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun discountType(): DiscountType = discountType.getRequired("discount_type")

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts, this can be a
     * subset of prices.
     */
    fun appliesToPriceIds(): List<String> = appliesToPriceIds.getRequired("applies_to_price_ids")

    fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

    /** Only available if discount_type is `amount`. */
    fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

    @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts, this can be a
     * subset of prices.
     */
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    fun _appliesToPriceIds() = appliesToPriceIds

    @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

    /** Only available if discount_type is `amount`. */
    @JsonProperty("amount_discount") @ExcludeMissing fun _amountDiscount() = amountDiscount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AmountDiscount = apply {
        if (!validated) {
            discountType()
            appliesToPriceIds()
            reason()
            amountDiscount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var discountType: JsonField<DiscountType> = JsonMissing.of()
        private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var amountDiscount: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(amountDiscount: AmountDiscount) = apply {
            discountType = amountDiscount.discountType
            appliesToPriceIds = amountDiscount.appliesToPriceIds
            reason = amountDiscount.reason
            this.amountDiscount = amountDiscount.amountDiscount
            additionalProperties = amountDiscount.additionalProperties.toMutableMap()
        }

        fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

        fun discountType(discountType: JsonField<DiscountType>) = apply {
            this.discountType = discountType
        }

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts, this can
         * be a subset of prices.
         */
        fun appliesToPriceIds(appliesToPriceIds: List<String>) =
            appliesToPriceIds(JsonField.of(appliesToPriceIds))

        /**
         * List of price_ids that this discount applies to. For plan/plan phase discounts, this can
         * be a subset of prices.
         */
        fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIds = appliesToPriceIds
        }

        fun reason(reason: String) = reason(JsonField.of(reason))

        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** Only available if discount_type is `amount`. */
        fun amountDiscount(amountDiscount: String) = amountDiscount(JsonField.of(amountDiscount))

        /** Only available if discount_type is `amount`. */
        fun amountDiscount(amountDiscount: JsonField<String>) = apply {
            this.amountDiscount = amountDiscount
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

        fun build(): AmountDiscount =
            AmountDiscount(
                discountType,
                appliesToPriceIds.map { it.toImmutable() },
                reason,
                amountDiscount,
                additionalProperties.toImmutable(),
            )
    }

    class DiscountType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AMOUNT = of("amount")

            @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
        }

        enum class Known {
            AMOUNT,
        }

        enum class Value {
            AMOUNT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AMOUNT -> Value.AMOUNT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AMOUNT -> Known.AMOUNT
                else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is AmountDiscount && discountType == other.discountType && appliesToPriceIds == other.appliesToPriceIds && reason == other.reason && amountDiscount == other.amountDiscount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(discountType, appliesToPriceIds, reason, amountDiscount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AmountDiscount{discountType=$discountType, appliesToPriceIds=$appliesToPriceIds, reason=$reason, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
}
