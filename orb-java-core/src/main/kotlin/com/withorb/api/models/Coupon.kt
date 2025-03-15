// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A coupon represents a reusable discount configuration that can be applied either as a fixed or
 * percentage amount to an invoice or subscription. Coupons are activated using a redemption code,
 * which applies the discount to a subscription or invoice. The duration of a coupon determines how
 * long it remains available for use by end users.
 */
@NoAutoDetect
class Coupon
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("archived_at")
    @ExcludeMissing
    private val archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discount")
    @ExcludeMissing
    private val discount: JsonField<Discount> = JsonMissing.of(),
    @JsonProperty("duration_in_months")
    @ExcludeMissing
    private val durationInMonths: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("max_redemptions")
    @ExcludeMissing
    private val maxRedemptions: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("redemption_code")
    @ExcludeMissing
    private val redemptionCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("times_redeemed")
    @ExcludeMissing
    private val timesRedeemed: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Also referred to as coupon_id in this documentation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * An archived coupon can no longer be redeemed. Active coupons will have a value of null for
     * `archived_at`; this field will be non-null for archived coupons.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun archivedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(archivedAt.getNullable("archived_at"))

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discount(): Discount = discount.getRequired("discount")

    /**
     * This allows for a coupon's discount to apply for a limited time (determined in months); a
     * `null` value here means "unlimited time".
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun durationInMonths(): Optional<Long> =
        Optional.ofNullable(durationInMonths.getNullable("duration_in_months"))

    /**
     * The maximum number of redemptions allowed for this coupon before it is exhausted; `null` here
     * means "unlimited".
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun maxRedemptions(): Optional<Long> =
        Optional.ofNullable(maxRedemptions.getNullable("max_redemptions"))

    /**
     * This string can be used to redeem this coupon for a given subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun redemptionCode(): String = redemptionCode.getRequired("redemption_code")

    /**
     * The number of times this coupon has been redeemed.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timesRedeemed(): Long = timesRedeemed.getRequired("times_redeemed")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived_at")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    /**
     * Returns the raw JSON value of [discount].
     *
     * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

    /**
     * Returns the raw JSON value of [durationInMonths].
     *
     * Unlike [durationInMonths], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("duration_in_months")
    @ExcludeMissing
    fun _durationInMonths(): JsonField<Long> = durationInMonths

    /**
     * Returns the raw JSON value of [maxRedemptions].
     *
     * Unlike [maxRedemptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_redemptions")
    @ExcludeMissing
    fun _maxRedemptions(): JsonField<Long> = maxRedemptions

    /**
     * Returns the raw JSON value of [redemptionCode].
     *
     * Unlike [redemptionCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redemption_code")
    @ExcludeMissing
    fun _redemptionCode(): JsonField<String> = redemptionCode

    /**
     * Returns the raw JSON value of [timesRedeemed].
     *
     * Unlike [timesRedeemed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("times_redeemed")
    @ExcludeMissing
    fun _timesRedeemed(): JsonField<Long> = timesRedeemed

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Coupon = apply {
        if (validated) {
            return@apply
        }

        id()
        archivedAt()
        discount().validate()
        durationInMonths()
        maxRedemptions()
        redemptionCode()
        timesRedeemed()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Coupon].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archivedAt()
         * .discount()
         * .durationInMonths()
         * .maxRedemptions()
         * .redemptionCode()
         * .timesRedeemed()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Coupon]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var archivedAt: JsonField<OffsetDateTime>? = null
        private var discount: JsonField<Discount>? = null
        private var durationInMonths: JsonField<Long>? = null
        private var maxRedemptions: JsonField<Long>? = null
        private var redemptionCode: JsonField<String>? = null
        private var timesRedeemed: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(coupon: Coupon) = apply {
            id = coupon.id
            archivedAt = coupon.archivedAt
            discount = coupon.discount
            durationInMonths = coupon.durationInMonths
            maxRedemptions = coupon.maxRedemptions
            redemptionCode = coupon.redemptionCode
            timesRedeemed = coupon.timesRedeemed
            additionalProperties = coupon.additionalProperties.toMutableMap()
        }

        /** Also referred to as coupon_id in this documentation. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * An archived coupon can no longer be redeemed. Active coupons will have a value of null
         * for `archived_at`; this field will be non-null for archived coupons.
         */
        fun archivedAt(archivedAt: OffsetDateTime?) = archivedAt(JsonField.ofNullable(archivedAt))

        /** Alias for calling [Builder.archivedAt] with `archivedAt.orElse(null)`. */
        fun archivedAt(archivedAt: Optional<OffsetDateTime>) = archivedAt(archivedAt.getOrNull())

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
        }

        fun discount(discount: Discount) = discount(JsonField.of(discount))

        /**
         * Sets [Builder.discount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discount] with a well-typed [Discount] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

        /** Alias for calling [discount] with `Discount.ofPercentage(percentage)`. */
        fun discount(percentage: PercentageDiscount) = discount(Discount.ofPercentage(percentage))

        /** Alias for calling [discount] with `Discount.ofAmount(amount)`. */
        fun discount(amount: AmountDiscount) = discount(Discount.ofAmount(amount))

        /**
         * This allows for a coupon's discount to apply for a limited time (determined in months); a
         * `null` value here means "unlimited time".
         */
        fun durationInMonths(durationInMonths: Long?) =
            durationInMonths(JsonField.ofNullable(durationInMonths))

        /**
         * Alias for [Builder.durationInMonths].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun durationInMonths(durationInMonths: Long) = durationInMonths(durationInMonths as Long?)

        /** Alias for calling [Builder.durationInMonths] with `durationInMonths.orElse(null)`. */
        fun durationInMonths(durationInMonths: Optional<Long>) =
            durationInMonths(durationInMonths.getOrNull())

        /**
         * Sets [Builder.durationInMonths] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationInMonths] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun durationInMonths(durationInMonths: JsonField<Long>) = apply {
            this.durationInMonths = durationInMonths
        }

        /**
         * The maximum number of redemptions allowed for this coupon before it is exhausted; `null`
         * here means "unlimited".
         */
        fun maxRedemptions(maxRedemptions: Long?) =
            maxRedemptions(JsonField.ofNullable(maxRedemptions))

        /**
         * Alias for [Builder.maxRedemptions].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxRedemptions(maxRedemptions: Long) = maxRedemptions(maxRedemptions as Long?)

        /** Alias for calling [Builder.maxRedemptions] with `maxRedemptions.orElse(null)`. */
        fun maxRedemptions(maxRedemptions: Optional<Long>) =
            maxRedemptions(maxRedemptions.getOrNull())

        /**
         * Sets [Builder.maxRedemptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRedemptions] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxRedemptions(maxRedemptions: JsonField<Long>) = apply {
            this.maxRedemptions = maxRedemptions
        }

        /** This string can be used to redeem this coupon for a given subscription. */
        fun redemptionCode(redemptionCode: String) = redemptionCode(JsonField.of(redemptionCode))

        /**
         * Sets [Builder.redemptionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redemptionCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun redemptionCode(redemptionCode: JsonField<String>) = apply {
            this.redemptionCode = redemptionCode
        }

        /** The number of times this coupon has been redeemed. */
        fun timesRedeemed(timesRedeemed: Long) = timesRedeemed(JsonField.of(timesRedeemed))

        /**
         * Sets [Builder.timesRedeemed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timesRedeemed] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timesRedeemed(timesRedeemed: JsonField<Long>) = apply {
            this.timesRedeemed = timesRedeemed
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

        fun build(): Coupon =
            Coupon(
                checkRequired("id", id),
                checkRequired("archivedAt", archivedAt),
                checkRequired("discount", discount),
                checkRequired("durationInMonths", durationInMonths),
                checkRequired("maxRedemptions", maxRedemptions),
                checkRequired("redemptionCode", redemptionCode),
                checkRequired("timesRedeemed", timesRedeemed),
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = Discount.Deserializer::class)
    @JsonSerialize(using = Discount.Serializer::class)
    class Discount
    private constructor(
        private val percentage: PercentageDiscount? = null,
        private val amount: AmountDiscount? = null,
        private val _json: JsonValue? = null,
    ) {

        fun percentage(): Optional<PercentageDiscount> = Optional.ofNullable(percentage)

        fun amount(): Optional<AmountDiscount> = Optional.ofNullable(amount)

        fun isPercentage(): Boolean = percentage != null

        fun isAmount(): Boolean = amount != null

        fun asPercentage(): PercentageDiscount = percentage.getOrThrow("percentage")

        fun asAmount(): AmountDiscount = amount.getOrThrow("amount")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                percentage != null -> visitor.visitPercentage(percentage)
                amount != null -> visitor.visitAmount(amount)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Discount = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPercentage(percentage: PercentageDiscount) {
                        percentage.validate()
                    }

                    override fun visitAmount(amount: AmountDiscount) {
                        amount.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Discount && percentage == other.percentage && amount == other.amount /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(percentage, amount) /* spotless:on */

        override fun toString(): String =
            when {
                percentage != null -> "Discount{percentage=$percentage}"
                amount != null -> "Discount{amount=$amount}"
                _json != null -> "Discount{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Discount")
            }

        companion object {

            @JvmStatic
            fun ofPercentage(percentage: PercentageDiscount) = Discount(percentage = percentage)

            @JvmStatic fun ofAmount(amount: AmountDiscount) = Discount(amount = amount)
        }

        /**
         * An interface that defines how to map each variant of [Discount] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitPercentage(percentage: PercentageDiscount): T

            fun visitAmount(amount: AmountDiscount): T

            /**
             * Maps an unknown variant of [Discount] to a value of type [T].
             *
             * An instance of [Discount] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown Discount: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Discount>(Discount::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Discount {
                val json = JsonValue.fromJsonNode(node)
                val discountType =
                    json.asObject().getOrNull()?.get("discount_type")?.asString()?.getOrNull()

                when (discountType) {
                    "percentage" -> {
                        tryDeserialize(node, jacksonTypeRef<PercentageDiscount>()) { it.validate() }
                            ?.let {
                                return Discount(percentage = it, _json = json)
                            }
                    }
                    "amount" -> {
                        tryDeserialize(node, jacksonTypeRef<AmountDiscount>()) { it.validate() }
                            ?.let {
                                return Discount(amount = it, _json = json)
                            }
                    }
                }

                return Discount(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Discount>(Discount::class) {

            override fun serialize(
                value: Discount,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.percentage != null -> generator.writeObject(value.percentage)
                    value.amount != null -> generator.writeObject(value.amount)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Discount")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Coupon && id == other.id && archivedAt == other.archivedAt && discount == other.discount && durationInMonths == other.durationInMonths && maxRedemptions == other.maxRedemptions && redemptionCode == other.redemptionCode && timesRedeemed == other.timesRedeemed && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, archivedAt, discount, durationInMonths, maxRedemptions, redemptionCode, timesRedeemed, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Coupon{id=$id, archivedAt=$archivedAt, discount=$discount, durationInMonths=$durationInMonths, maxRedemptions=$maxRedemptions, redemptionCode=$redemptionCode, timesRedeemed=$timesRedeemed, additionalProperties=$additionalProperties}"
}
