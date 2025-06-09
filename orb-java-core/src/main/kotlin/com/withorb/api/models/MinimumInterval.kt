// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MinimumInterval
private constructor(
    private val appliesToPriceIntervalIds: JsonField<List<String>>,
    private val endDate: JsonField<OffsetDateTime>,
    private val filters: JsonField<List<TransformPriceFilter>>,
    private val minimumAmount: JsonField<String>,
    private val startDate: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filters")
        @ExcludeMissing
        filters: JsonField<List<TransformPriceFilter>> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(appliesToPriceIntervalIds, endDate, filters, minimumAmount, startDate, mutableMapOf())

    /**
     * The price interval ids that this minimum interval applies to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun appliesToPriceIntervalIds(): List<String> =
        appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

    /**
     * The end date of the minimum interval.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

    /**
     * The filters that determine which prices this minimum interval applies to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filters(): List<TransformPriceFilter> = filters.getRequired("filters")

    /**
     * The minimum amount to charge in a given billing period for the price intervals this minimum
     * applies to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

    /**
     * The start date of the minimum interval.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /**
     * Returns the raw JSON value of [appliesToPriceIntervalIds].
     *
     * Unlike [appliesToPriceIntervalIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("applies_to_price_interval_ids")
    @ExcludeMissing
    fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters")
    @ExcludeMissing
    fun _filters(): JsonField<List<TransformPriceFilter>> = filters

    /**
     * Returns the raw JSON value of [minimumAmount].
     *
     * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

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
         * Returns a mutable builder for constructing an instance of [MinimumInterval].
         *
         * The following fields are required:
         * ```java
         * .appliesToPriceIntervalIds()
         * .endDate()
         * .filters()
         * .minimumAmount()
         * .startDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MinimumInterval]. */
    class Builder internal constructor() {

        private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var filters: JsonField<MutableList<TransformPriceFilter>>? = null
        private var minimumAmount: JsonField<String>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(minimumInterval: MinimumInterval) = apply {
            appliesToPriceIntervalIds =
                minimumInterval.appliesToPriceIntervalIds.map { it.toMutableList() }
            endDate = minimumInterval.endDate
            filters = minimumInterval.filters.map { it.toMutableList() }
            minimumAmount = minimumInterval.minimumAmount
            startDate = minimumInterval.startDate
            additionalProperties = minimumInterval.additionalProperties.toMutableMap()
        }

        /** The price interval ids that this minimum interval applies to. */
        fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
            appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

        /**
         * Sets [Builder.appliesToPriceIntervalIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appliesToPriceIntervalIds] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) = apply {
            this.appliesToPriceIntervalIds = appliesToPriceIntervalIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [appliesToPriceIntervalIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
            appliesToPriceIntervalIds =
                (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("appliesToPriceIntervalIds", it).add(appliesToPriceIntervalId)
                }
        }

        /** The end date of the minimum interval. */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /** The filters that determine which prices this minimum interval applies to. */
        fun filters(filters: List<TransformPriceFilter>) = filters(JsonField.of(filters))

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
         * The minimum amount to charge in a given billing period for the price intervals this
         * minimum applies to.
         */
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

        /** The start date of the minimum interval. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

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
         * Returns an immutable instance of [MinimumInterval].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appliesToPriceIntervalIds()
         * .endDate()
         * .filters()
         * .minimumAmount()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MinimumInterval =
            MinimumInterval(
                checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                    it.toImmutable()
                },
                checkRequired("endDate", endDate),
                checkRequired("filters", filters).map { it.toImmutable() },
                checkRequired("minimumAmount", minimumAmount),
                checkRequired("startDate", startDate),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MinimumInterval = apply {
        if (validated) {
            return@apply
        }

        appliesToPriceIntervalIds()
        endDate()
        filters().forEach { it.validate() }
        minimumAmount()
        startDate()
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
        (appliesToPriceIntervalIds.asKnown().getOrNull()?.size ?: 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (minimumAmount.asKnown().isPresent) 1 else 0) +
            (if (startDate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MinimumInterval && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && endDate == other.endDate && filters == other.filters && minimumAmount == other.minimumAmount && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(appliesToPriceIntervalIds, endDate, filters, minimumAmount, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MinimumInterval{appliesToPriceIntervalIds=$appliesToPriceIntervalIds, endDate=$endDate, filters=$filters, minimumAmount=$minimumAmount, startDate=$startDate, additionalProperties=$additionalProperties}"
}
