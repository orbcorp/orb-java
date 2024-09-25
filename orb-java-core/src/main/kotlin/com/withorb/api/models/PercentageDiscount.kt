// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PercentageDiscount.Builder::class)
@NoAutoDetect
class PercentageDiscount
private constructor(
    private val discountType: JsonField<DiscountType>,
    private val appliesToPriceIds: JsonField<List<String>>,
    private val reason: JsonField<String>,
    private val percentageDiscount: JsonField<Double>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun discountType(): DiscountType = discountType.getRequired("discount_type")

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts, this can be a
     * subset of prices.
     */
    fun appliesToPriceIds(): List<String> = appliesToPriceIds.getRequired("applies_to_price_ids")

    fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

    /** Only available if discount_type is `percentage`. This is a number between 0 and 1. */
    fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

    @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts, this can be a
     * subset of prices.
     */
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    fun _appliesToPriceIds() = appliesToPriceIds

    @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

    /** Only available if discount_type is `percentage`. This is a number between 0 and 1. */
    @JsonProperty("percentage_discount")
    @ExcludeMissing
    fun _percentageDiscount() = percentageDiscount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PercentageDiscount = apply {
        if (!validated) {
            discountType()
            appliesToPriceIds()
            reason()
            percentageDiscount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PercentageDiscount &&
            this.discountType == other.discountType &&
            this.appliesToPriceIds == other.appliesToPriceIds &&
            this.reason == other.reason &&
            this.percentageDiscount == other.percentageDiscount &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    discountType,
                    appliesToPriceIds,
                    reason,
                    percentageDiscount,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PercentageDiscount{discountType=$discountType, appliesToPriceIds=$appliesToPriceIds, reason=$reason, percentageDiscount=$percentageDiscount, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var discountType: JsonField<DiscountType> = JsonMissing.of()
        private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var percentageDiscount: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(percentageDiscount: PercentageDiscount) = apply {
            this.discountType = percentageDiscount.discountType
            this.appliesToPriceIds = percentageDiscount.appliesToPriceIds
            this.reason = percentageDiscount.reason
            this.percentageDiscount = percentageDiscount.percentageDiscount
            additionalProperties(percentageDiscount.additionalProperties)
        }

        fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

        @JsonProperty("discount_type")
        @ExcludeMissing
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
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIds = appliesToPriceIds
        }

        fun reason(reason: String) = reason(JsonField.of(reason))

        @JsonProperty("reason")
        @ExcludeMissing
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** Only available if discount_type is `percentage`. This is a number between 0 and 1. */
        fun percentageDiscount(percentageDiscount: Double) =
            percentageDiscount(JsonField.of(percentageDiscount))

        /** Only available if discount_type is `percentage`. This is a number between 0 and 1. */
        @JsonProperty("percentage_discount")
        @ExcludeMissing
        fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
            this.percentageDiscount = percentageDiscount
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

        fun build(): PercentageDiscount =
            PercentageDiscount(
                discountType,
                appliesToPriceIds.map { it.toUnmodifiable() },
                reason,
                percentageDiscount,
                additionalProperties.toUnmodifiable(),
            )
    }

    class DiscountType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DiscountType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

            @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
        }

        enum class Known {
            PERCENTAGE,
        }

        enum class Value {
            PERCENTAGE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PERCENTAGE -> Value.PERCENTAGE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PERCENTAGE -> Known.PERCENTAGE
                else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
