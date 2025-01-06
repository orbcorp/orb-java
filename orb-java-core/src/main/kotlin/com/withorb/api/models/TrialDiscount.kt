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
class TrialDiscount
@JsonCreator
private constructor(
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("discount_type")
    @ExcludeMissing
    private val discountType: JsonField<DiscountType> = JsonMissing.of(),
    @JsonProperty("reason")
    @ExcludeMissing
    private val reason: JsonField<String> = JsonMissing.of(),
    @JsonProperty("trial_amount_discount")
    @ExcludeMissing
    private val trialAmountDiscount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("trial_percentage_discount")
    @ExcludeMissing
    private val trialPercentageDiscount: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts, this can be a
     * subset of prices.
     */
    fun appliesToPriceIds(): List<String> = appliesToPriceIds.getRequired("applies_to_price_ids")

    fun discountType(): DiscountType = discountType.getRequired("discount_type")

    fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

    /** Only available if discount_type is `trial` */
    fun trialAmountDiscount(): Optional<String> =
        Optional.ofNullable(trialAmountDiscount.getNullable("trial_amount_discount"))

    /** Only available if discount_type is `trial` */
    fun trialPercentageDiscount(): Optional<Double> =
        Optional.ofNullable(trialPercentageDiscount.getNullable("trial_percentage_discount"))

    /**
     * List of price_ids that this discount applies to. For plan/plan phase discounts, this can be a
     * subset of prices.
     */
    @JsonProperty("applies_to_price_ids")
    @ExcludeMissing
    fun _appliesToPriceIds() = appliesToPriceIds

    @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

    @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

    /** Only available if discount_type is `trial` */
    @JsonProperty("trial_amount_discount")
    @ExcludeMissing
    fun _trialAmountDiscount() = trialAmountDiscount

    /** Only available if discount_type is `trial` */
    @JsonProperty("trial_percentage_discount")
    @ExcludeMissing
    fun _trialPercentageDiscount() = trialPercentageDiscount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TrialDiscount = apply {
        if (!validated) {
            appliesToPriceIds()
            discountType()
            reason()
            trialAmountDiscount()
            trialPercentageDiscount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
        private var discountType: JsonField<DiscountType> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var trialAmountDiscount: JsonField<String> = JsonMissing.of()
        private var trialPercentageDiscount: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(trialDiscount: TrialDiscount) = apply {
            appliesToPriceIds = trialDiscount.appliesToPriceIds
            discountType = trialDiscount.discountType
            reason = trialDiscount.reason
            trialAmountDiscount = trialDiscount.trialAmountDiscount
            trialPercentageDiscount = trialDiscount.trialPercentageDiscount
            additionalProperties = trialDiscount.additionalProperties.toMutableMap()
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

        fun discountType(discountType: DiscountType) = discountType(JsonField.of(discountType))

        fun discountType(discountType: JsonField<DiscountType>) = apply {
            this.discountType = discountType
        }

        fun reason(reason: String) = reason(JsonField.of(reason))

        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /** Only available if discount_type is `trial` */
        fun trialAmountDiscount(trialAmountDiscount: String) =
            trialAmountDiscount(JsonField.of(trialAmountDiscount))

        /** Only available if discount_type is `trial` */
        fun trialAmountDiscount(trialAmountDiscount: JsonField<String>) = apply {
            this.trialAmountDiscount = trialAmountDiscount
        }

        /** Only available if discount_type is `trial` */
        fun trialPercentageDiscount(trialPercentageDiscount: Double) =
            trialPercentageDiscount(JsonField.of(trialPercentageDiscount))

        /** Only available if discount_type is `trial` */
        fun trialPercentageDiscount(trialPercentageDiscount: JsonField<Double>) = apply {
            this.trialPercentageDiscount = trialPercentageDiscount
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

        fun build(): TrialDiscount =
            TrialDiscount(
                appliesToPriceIds.map { it.toImmutable() },
                discountType,
                reason,
                trialAmountDiscount,
                trialPercentageDiscount,
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

            @JvmField val TRIAL = of("trial")

            @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
        }

        enum class Known {
            TRIAL,
        }

        enum class Value {
            TRIAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TRIAL -> Value.TRIAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TRIAL -> Known.TRIAL
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

        return /* spotless:off */ other is TrialDiscount && appliesToPriceIds == other.appliesToPriceIds && discountType == other.discountType && reason == other.reason && trialAmountDiscount == other.trialAmountDiscount && trialPercentageDiscount == other.trialPercentageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, discountType, reason, trialAmountDiscount, trialPercentageDiscount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TrialDiscount{appliesToPriceIds=$appliesToPriceIds, discountType=$discountType, reason=$reason, trialAmountDiscount=$trialAmountDiscount, trialPercentageDiscount=$trialPercentageDiscount, additionalProperties=$additionalProperties}"
}
