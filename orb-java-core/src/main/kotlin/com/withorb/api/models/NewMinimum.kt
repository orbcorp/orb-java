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

class NewMinimum
private constructor(
    private val adjustmentType: JsonField<AdjustmentType>,
    private val itemId: JsonField<String>,
    private val minimumAmount: JsonField<String>,
    private val appliesToAll: JsonField<AppliesToAll>,
    private val appliesToItemIds: JsonField<List<String>>,
    private val appliesToPriceIds: JsonField<List<String>>,
    private val currency: JsonField<String>,
    private val filters: JsonField<List<TransformPriceFilter>>,
    private val isInvoiceLevel: JsonField<Boolean>,
    private val priceType: JsonField<PriceType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("adjustment_type")
        @ExcludeMissing
        adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
        @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applies_to_all")
        @ExcludeMissing
        appliesToAll: JsonField<AppliesToAll> = JsonMissing.of(),
        @JsonProperty("applies_to_item_ids")
        @ExcludeMissing
        appliesToItemIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<TransformPriceFilter>> = JsonMissing.of(),
        @JsonProperty("is_invoice_level")
        @ExcludeMissing
        isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("price_type")
        @ExcludeMissing
        priceType: JsonField<PriceType> = JsonMissing.of(),
    ) : this(
        adjustmentType,
        itemId,
        minimumAmount,
        appliesToAll,
        appliesToItemIds,
        appliesToPriceIds,
        currency,
        filters,
        isInvoiceLevel,
        priceType,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

    /**
     * The item ID that revenue from this minimum will be attributed to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun itemId(): String = itemId.getRequired("item_id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

    /**
     * If set, the adjustment will apply to every price on the subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun appliesToAll(): Optional<AppliesToAll> = appliesToAll.getOptional("applies_to_all")

    /**
     * The set of item IDs to which this adjustment applies.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun appliesToItemIds(): Optional<List<String>> =
        appliesToItemIds.getOptional("applies_to_item_ids")

    /**
     * The set of price IDs to which this adjustment applies.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun appliesToPriceIds(): Optional<List<String>> =
        appliesToPriceIds.getOptional("applies_to_price_ids")

    /**
     * If set, only prices in the specified currency will have the adjustment applied.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * A list of filters that determine which prices this adjustment will apply to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun filters(): Optional<List<TransformPriceFilter>> = filters.getOptional("filters")

    /**
     * When false, this adjustment will be applied to a single price. Otherwise, it will be applied
     * at the invoice level, possibly to multiple prices.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun isInvoiceLevel(): Optional<Boolean> = isInvoiceLevel.getOptional("is_invoice_level")

    /**
     * If set, only prices of the specified type will have the adjustment applied.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun priceType(): Optional<PriceType> = priceType.getOptional("price_type")

    /**
     * Returns the raw JSON value of [adjustmentType].
     *
     * Unlike [adjustmentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("adjustment_type")
    @ExcludeMissing
    fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

    /**
     * Returns the raw JSON value of [itemId].
     *
     * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

    /**
     * Returns the raw JSON value of [minimumAmount].
     *
     * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

    /**
     * Returns the raw JSON value of [appliesToAll].
     *
     * Unlike [appliesToAll], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("applies_to_all")
    @ExcludeMissing
    fun _appliesToAll(): JsonField<AppliesToAll> = appliesToAll

    /**
     * Returns the raw JSON value of [appliesToItemIds].
     *
     * Unlike [appliesToItemIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("applies_to_item_ids")
    @ExcludeMissing
    fun _appliesToItemIds(): JsonField<List<String>> = appliesToItemIds

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
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters")
    @ExcludeMissing
    fun _filters(): JsonField<List<TransformPriceFilter>> = filters

    /**
     * Returns the raw JSON value of [isInvoiceLevel].
     *
     * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_invoice_level")
    @ExcludeMissing
    fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

    /**
     * Returns the raw JSON value of [priceType].
     *
     * Unlike [priceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_type") @ExcludeMissing fun _priceType(): JsonField<PriceType> = priceType

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
         * Returns a mutable builder for constructing an instance of [NewMinimum].
         *
         * The following fields are required:
         * ```java
         * .adjustmentType()
         * .itemId()
         * .minimumAmount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NewMinimum]. */
    class Builder internal constructor() {

        private var adjustmentType: JsonField<AdjustmentType>? = null
        private var itemId: JsonField<String>? = null
        private var minimumAmount: JsonField<String>? = null
        private var appliesToAll: JsonField<AppliesToAll> = JsonMissing.of()
        private var appliesToItemIds: JsonField<MutableList<String>>? = null
        private var appliesToPriceIds: JsonField<MutableList<String>>? = null
        private var currency: JsonField<String> = JsonMissing.of()
        private var filters: JsonField<MutableList<TransformPriceFilter>>? = null
        private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
        private var priceType: JsonField<PriceType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(newMinimum: NewMinimum) = apply {
            adjustmentType = newMinimum.adjustmentType
            itemId = newMinimum.itemId
            minimumAmount = newMinimum.minimumAmount
            appliesToAll = newMinimum.appliesToAll
            appliesToItemIds = newMinimum.appliesToItemIds.map { it.toMutableList() }
            appliesToPriceIds = newMinimum.appliesToPriceIds.map { it.toMutableList() }
            currency = newMinimum.currency
            filters = newMinimum.filters.map { it.toMutableList() }
            isInvoiceLevel = newMinimum.isInvoiceLevel
            priceType = newMinimum.priceType
            additionalProperties = newMinimum.additionalProperties.toMutableMap()
        }

        fun adjustmentType(adjustmentType: AdjustmentType) =
            adjustmentType(JsonField.of(adjustmentType))

        /**
         * Sets [Builder.adjustmentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustmentType] with a well-typed [AdjustmentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
            this.adjustmentType = adjustmentType
        }

        /** The item ID that revenue from this minimum will be attributed to. */
        fun itemId(itemId: String) = itemId(JsonField.of(itemId))

        /**
         * Sets [Builder.itemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itemId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

        fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

        /**
         * Sets [Builder.minimumAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        /** If set, the adjustment will apply to every price on the subscription. */
        fun appliesToAll(appliesToAll: AppliesToAll?) =
            appliesToAll(JsonField.ofNullable(appliesToAll))

        /** Alias for calling [Builder.appliesToAll] with `appliesToAll.orElse(null)`. */
        fun appliesToAll(appliesToAll: Optional<AppliesToAll>) =
            appliesToAll(appliesToAll.getOrNull())

        /**
         * Sets [Builder.appliesToAll] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appliesToAll] with a well-typed [AppliesToAll] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun appliesToAll(appliesToAll: JsonField<AppliesToAll>) = apply {
            this.appliesToAll = appliesToAll
        }

        /** The set of item IDs to which this adjustment applies. */
        fun appliesToItemIds(appliesToItemIds: List<String>?) =
            appliesToItemIds(JsonField.ofNullable(appliesToItemIds))

        /** Alias for calling [Builder.appliesToItemIds] with `appliesToItemIds.orElse(null)`. */
        fun appliesToItemIds(appliesToItemIds: Optional<List<String>>) =
            appliesToItemIds(appliesToItemIds.getOrNull())

        /**
         * Sets [Builder.appliesToItemIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appliesToItemIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun appliesToItemIds(appliesToItemIds: JsonField<List<String>>) = apply {
            this.appliesToItemIds = appliesToItemIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [appliesToItemIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAppliesToItemId(appliesToItemId: String) = apply {
            appliesToItemIds =
                (appliesToItemIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToItemIds", it).add(appliesToItemId)
                }
        }

        /** The set of price IDs to which this adjustment applies. */
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

        /** If set, only prices in the specified currency will have the adjustment applied. */
        fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** A list of filters that determine which prices this adjustment will apply to. */
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

        /**
         * When false, this adjustment will be applied to a single price. Otherwise, it will be
         * applied at the invoice level, possibly to multiple prices.
         */
        fun isInvoiceLevel(isInvoiceLevel: Boolean) = isInvoiceLevel(JsonField.of(isInvoiceLevel))

        /**
         * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
            this.isInvoiceLevel = isInvoiceLevel
        }

        /** If set, only prices of the specified type will have the adjustment applied. */
        fun priceType(priceType: PriceType?) = priceType(JsonField.ofNullable(priceType))

        /** Alias for calling [Builder.priceType] with `priceType.orElse(null)`. */
        fun priceType(priceType: Optional<PriceType>) = priceType(priceType.getOrNull())

        /**
         * Sets [Builder.priceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceType] with a well-typed [PriceType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun priceType(priceType: JsonField<PriceType>) = apply { this.priceType = priceType }

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
         * Returns an immutable instance of [NewMinimum].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .adjustmentType()
         * .itemId()
         * .minimumAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NewMinimum =
            NewMinimum(
                checkRequired("adjustmentType", adjustmentType),
                checkRequired("itemId", itemId),
                checkRequired("minimumAmount", minimumAmount),
                appliesToAll,
                (appliesToItemIds ?: JsonMissing.of()).map { it.toImmutable() },
                (appliesToPriceIds ?: JsonMissing.of()).map { it.toImmutable() },
                currency,
                (filters ?: JsonMissing.of()).map { it.toImmutable() },
                isInvoiceLevel,
                priceType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NewMinimum = apply {
        if (validated) {
            return@apply
        }

        adjustmentType().validate()
        itemId()
        minimumAmount()
        appliesToAll().ifPresent { it.validate() }
        appliesToItemIds()
        appliesToPriceIds()
        currency()
        filters().ifPresent { it.forEach { it.validate() } }
        isInvoiceLevel()
        priceType().ifPresent { it.validate() }
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
        (adjustmentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (itemId.asKnown().isPresent) 1 else 0) +
            (if (minimumAmount.asKnown().isPresent) 1 else 0) +
            (appliesToAll.asKnown().getOrNull()?.validity() ?: 0) +
            (appliesToItemIds.asKnown().getOrNull()?.size ?: 0) +
            (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (isInvoiceLevel.asKnown().isPresent) 1 else 0) +
            (priceType.asKnown().getOrNull()?.validity() ?: 0)

    class AdjustmentType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val MINIMUM = of("minimum")

            @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
        }

        /** An enum containing [AdjustmentType]'s known values. */
        enum class Known {
            MINIMUM
        }

        /**
         * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AdjustmentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MINIMUM,
            /**
             * An enum member indicating that [AdjustmentType] was instantiated with an unknown
             * value.
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
                MINIMUM -> Value.MINIMUM
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
                MINIMUM -> Known.MINIMUM
                else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

        fun validate(): AdjustmentType = apply {
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

            return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** If set, the adjustment will apply to every price on the subscription. */
    class AppliesToAll @JsonCreator private constructor(private val value: JsonField<Boolean>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            @JvmField val TRUE = of(true)

            @JvmStatic fun of(value: Boolean) = AppliesToAll(JsonField.of(value))
        }

        /** An enum containing [AppliesToAll]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [AppliesToAll]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AppliesToAll] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /**
             * An enum member indicating that [AppliesToAll] was instantiated with an unknown value.
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
                TRUE -> Value.TRUE
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
                TRUE -> Known.TRUE
                else -> throw OrbInvalidDataException("Unknown AppliesToAll: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asBoolean(): Boolean =
            _value().asBoolean().orElseThrow { OrbInvalidDataException("Value is not a Boolean") }

        private var validated: Boolean = false

        fun validate(): AppliesToAll = apply {
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

            return /* spotless:off */ other is AppliesToAll && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** If set, only prices of the specified type will have the adjustment applied. */
    class PriceType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val USAGE = of("usage")

            @JvmField val FIXED_IN_ADVANCE = of("fixed_in_advance")

            @JvmField val FIXED_IN_ARREARS = of("fixed_in_arrears")

            @JvmField val FIXED = of("fixed")

            @JvmField val IN_ARREARS = of("in_arrears")

            @JvmStatic fun of(value: String) = PriceType(JsonField.of(value))
        }

        /** An enum containing [PriceType]'s known values. */
        enum class Known {
            USAGE,
            FIXED_IN_ADVANCE,
            FIXED_IN_ARREARS,
            FIXED,
            IN_ARREARS,
        }

        /**
         * An enum containing [PriceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PriceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USAGE,
            FIXED_IN_ADVANCE,
            FIXED_IN_ARREARS,
            FIXED,
            IN_ARREARS,
            /**
             * An enum member indicating that [PriceType] was instantiated with an unknown value.
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
                USAGE -> Value.USAGE
                FIXED_IN_ADVANCE -> Value.FIXED_IN_ADVANCE
                FIXED_IN_ARREARS -> Value.FIXED_IN_ARREARS
                FIXED -> Value.FIXED
                IN_ARREARS -> Value.IN_ARREARS
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
                USAGE -> Known.USAGE
                FIXED_IN_ADVANCE -> Known.FIXED_IN_ADVANCE
                FIXED_IN_ARREARS -> Known.FIXED_IN_ARREARS
                FIXED -> Known.FIXED
                IN_ARREARS -> Known.IN_ARREARS
                else -> throw OrbInvalidDataException("Unknown PriceType: $value")
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

        fun validate(): PriceType = apply {
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

            return /* spotless:off */ other is PriceType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NewMinimum && adjustmentType == other.adjustmentType && itemId == other.itemId && minimumAmount == other.minimumAmount && appliesToAll == other.appliesToAll && appliesToItemIds == other.appliesToItemIds && appliesToPriceIds == other.appliesToPriceIds && currency == other.currency && filters == other.filters && isInvoiceLevel == other.isInvoiceLevel && priceType == other.priceType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(adjustmentType, itemId, minimumAmount, appliesToAll, appliesToItemIds, appliesToPriceIds, currency, filters, isInvoiceLevel, priceType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewMinimum{adjustmentType=$adjustmentType, itemId=$itemId, minimumAmount=$minimumAmount, appliesToAll=$appliesToAll, appliesToItemIds=$appliesToItemIds, appliesToPriceIds=$appliesToPriceIds, currency=$currency, filters=$filters, isInvoiceLevel=$isInvoiceLevel, priceType=$priceType, additionalProperties=$additionalProperties}"
}
