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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class BulkBpsConfigModel
@JsonCreator
private constructor(
    @JsonProperty("tiers")
    @ExcludeMissing
    private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier based on
     * total volume
     */
    fun tiers(): List<Tier> = tiers.getRequired("tiers")

    /**
     * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier based on
     * total volume
     */
    @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BulkBpsConfigModel = apply {
        if (validated) {
            return@apply
        }

        tiers().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BulkBpsConfigModel].
         *
         * The following fields are required:
         * ```java
         * .tiers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkBpsConfigModel]. */
    class Builder internal constructor() {

        private var tiers: JsonField<MutableList<Tier>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bulkBpsConfigModel: BulkBpsConfigModel) = apply {
            tiers = bulkBpsConfigModel.tiers.map { it.toMutableList() }
            additionalProperties = bulkBpsConfigModel.additionalProperties.toMutableMap()
        }

        /**
         * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier based
         * on total volume
         */
        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

        /**
         * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier based
         * on total volume
         */
        fun tiers(tiers: JsonField<List<Tier>>) = apply {
            this.tiers = tiers.map { it.toMutableList() }
        }

        /**
         * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier based
         * on total volume
         */
        fun addTier(tier: Tier) = apply {
            tiers =
                (tiers ?: JsonField.of(mutableListOf())).also { checkKnown("tiers", it).add(tier) }
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

        fun build(): BulkBpsConfigModel =
            BulkBpsConfigModel(
                checkRequired("tiers", tiers).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Tier
    @JsonCreator
    private constructor(
        @JsonProperty("bps") @ExcludeMissing private val bps: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("per_unit_maximum")
        @ExcludeMissing
        private val perUnitMaximum: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Basis points to rate on */
        fun bps(): Double = bps.getRequired("bps")

        /** Upper bound for tier */
        fun maximumAmount(): Optional<String> =
            Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

        /** The maximum amount to charge for any one event */
        fun perUnitMaximum(): Optional<String> =
            Optional.ofNullable(perUnitMaximum.getNullable("per_unit_maximum"))

        /** Basis points to rate on */
        @JsonProperty("bps") @ExcludeMissing fun _bps(): JsonField<Double> = bps

        /** Upper bound for tier */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /** The maximum amount to charge for any one event */
        @JsonProperty("per_unit_maximum")
        @ExcludeMissing
        fun _perUnitMaximum(): JsonField<String> = perUnitMaximum

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Tier = apply {
            if (validated) {
                return@apply
            }

            bps()
            maximumAmount()
            perUnitMaximum()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Tier].
             *
             * The following fields are required:
             * ```java
             * .bps()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Tier]. */
        class Builder internal constructor() {

            private var bps: JsonField<Double>? = null
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var perUnitMaximum: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tier: Tier) = apply {
                bps = tier.bps
                maximumAmount = tier.maximumAmount
                perUnitMaximum = tier.perUnitMaximum
                additionalProperties = tier.additionalProperties.toMutableMap()
            }

            /** Basis points to rate on */
            fun bps(bps: Double) = bps(JsonField.of(bps))

            /** Basis points to rate on */
            fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

            /** Upper bound for tier */
            fun maximumAmount(maximumAmount: String?) =
                maximumAmount(JsonField.ofNullable(maximumAmount))

            /** Upper bound for tier */
            fun maximumAmount(maximumAmount: Optional<String>) =
                maximumAmount(maximumAmount.orElse(null))

            /** Upper bound for tier */
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /** The maximum amount to charge for any one event */
            fun perUnitMaximum(perUnitMaximum: String?) =
                perUnitMaximum(JsonField.ofNullable(perUnitMaximum))

            /** The maximum amount to charge for any one event */
            fun perUnitMaximum(perUnitMaximum: Optional<String>) =
                perUnitMaximum(perUnitMaximum.orElse(null))

            /** The maximum amount to charge for any one event */
            fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                this.perUnitMaximum = perUnitMaximum
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

            fun build(): Tier =
                Tier(
                    checkRequired("bps", bps),
                    maximumAmount,
                    perUnitMaximum,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tier && bps == other.bps && maximumAmount == other.maximumAmount && perUnitMaximum == other.perUnitMaximum && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(bps, maximumAmount, perUnitMaximum, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tier{bps=$bps, maximumAmount=$maximumAmount, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkBpsConfigModel && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(tiers, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkBpsConfigModel{tiers=$tiers, additionalProperties=$additionalProperties}"
}
