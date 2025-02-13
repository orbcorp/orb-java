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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CustomerCostListResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Data>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): List<Data> = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerCostListResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerCostListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCostListResponse: CustomerCostListResponse) = apply {
            data = customerCostListResponse.data.map { it.toMutableList() }
            additionalProperties = customerCostListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(data)
                }
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

        fun build(): CustomerCostListResponse =
            CustomerCostListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toImmutable()
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("per_price_costs")
        @ExcludeMissing
        private val perPriceCosts: JsonField<List<PerPriceCost>> = JsonMissing.of(),
        @JsonProperty("subtotal")
        @ExcludeMissing
        private val subtotal: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("total")
        @ExcludeMissing
        private val total: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun perPriceCosts(): List<PerPriceCost> = perPriceCosts.getRequired("per_price_costs")

        /** Total costs for the timeframe, excluding any minimums and discounts. */
        fun subtotal(): String = subtotal.getRequired("subtotal")

        fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

        fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

        /** Total costs for the timeframe, including any minimums and discounts. */
        fun total(): String = total.getRequired("total")

        @JsonProperty("per_price_costs")
        @ExcludeMissing
        fun _perPriceCosts(): JsonField<List<PerPriceCost>> = perPriceCosts

        /** Total costs for the timeframe, excluding any minimums and discounts. */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

        /** Total costs for the timeframe, including any minimums and discounts. */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            perPriceCosts().forEach { it.validate() }
            subtotal()
            timeframeEnd()
            timeframeStart()
            total()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var perPriceCosts: JsonField<MutableList<PerPriceCost>>? = null
            private var subtotal: JsonField<String>? = null
            private var timeframeEnd: JsonField<OffsetDateTime>? = null
            private var timeframeStart: JsonField<OffsetDateTime>? = null
            private var total: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                perPriceCosts = data.perPriceCosts.map { it.toMutableList() }
                subtotal = data.subtotal
                timeframeEnd = data.timeframeEnd
                timeframeStart = data.timeframeStart
                total = data.total
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun perPriceCosts(perPriceCosts: List<PerPriceCost>) =
                perPriceCosts(JsonField.of(perPriceCosts))

            fun perPriceCosts(perPriceCosts: JsonField<List<PerPriceCost>>) = apply {
                this.perPriceCosts = perPriceCosts.map { it.toMutableList() }
            }

            fun addPerPriceCost(perPriceCost: PerPriceCost) = apply {
                perPriceCosts =
                    (perPriceCosts ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(perPriceCost)
                    }
            }

            /** Total costs for the timeframe, excluding any minimums and discounts. */
            fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

            /** Total costs for the timeframe, excluding any minimums and discounts. */
            fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

            fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                timeframeEnd(JsonField.of(timeframeEnd))

            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                this.timeframeEnd = timeframeEnd
            }

            fun timeframeStart(timeframeStart: OffsetDateTime) =
                timeframeStart(JsonField.of(timeframeStart))

            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                this.timeframeStart = timeframeStart
            }

            /** Total costs for the timeframe, including any minimums and discounts. */
            fun total(total: String) = total(JsonField.of(total))

            /** Total costs for the timeframe, including any minimums and discounts. */
            fun total(total: JsonField<String>) = apply { this.total = total }

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

            fun build(): Data =
                Data(
                    checkRequired("perPriceCosts", perPriceCosts).map { it.toImmutable() },
                    checkRequired("subtotal", subtotal),
                    checkRequired("timeframeEnd", timeframeEnd),
                    checkRequired("timeframeStart", timeframeStart),
                    checkRequired("total", total),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class PerPriceCost
        @JsonCreator
        private constructor(
            @JsonProperty("price")
            @ExcludeMissing
            private val price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("price_id")
            @ExcludeMissing
            private val priceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subtotal")
            @ExcludeMissing
            private val subtotal: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total")
            @ExcludeMissing
            private val total: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The price object */
            fun price(): Price = price.getRequired("price")

            /** The price the cost is associated with */
            fun priceId(): String = priceId.getRequired("price_id")

            /** Price's contributions for the timeframe, excluding any minimums and discounts. */
            fun subtotal(): String = subtotal.getRequired("subtotal")

            /** Price's contributions for the timeframe, including minimums and discounts. */
            fun total(): String = total.getRequired("total")

            /** The price's quantity for the timeframe */
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

            /** The price object */
            @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

            /** The price the cost is associated with */
            @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

            /** Price's contributions for the timeframe, excluding any minimums and discounts. */
            @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

            /** Price's contributions for the timeframe, including minimums and discounts. */
            @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

            /** The price's quantity for the timeframe */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PerPriceCost = apply {
                if (validated) {
                    return@apply
                }

                price().validate()
                priceId()
                subtotal()
                total()
                quantity()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PerPriceCost]. */
            class Builder internal constructor() {

                private var price: JsonField<Price>? = null
                private var priceId: JsonField<String>? = null
                private var subtotal: JsonField<String>? = null
                private var total: JsonField<String>? = null
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(perPriceCost: PerPriceCost) = apply {
                    price = perPriceCost.price
                    priceId = perPriceCost.priceId
                    subtotal = perPriceCost.subtotal
                    total = perPriceCost.total
                    quantity = perPriceCost.quantity
                    additionalProperties = perPriceCost.additionalProperties.toMutableMap()
                }

                /** The price object */
                fun price(price: Price) = price(JsonField.of(price))

                /** The price object */
                fun price(price: JsonField<Price>) = apply { this.price = price }

                /** The price object */
                fun price(unit: Price.UnitPrice) = price(Price.ofUnit(unit))

                /** The price object */
                fun price(packagePrice: Price.PackagePrice) =
                    price(Price.ofPackagePrice(packagePrice))

                /** The price object */
                fun price(matrix: Price.MatrixPrice) = price(Price.ofMatrix(matrix))

                /** The price object */
                fun price(tiered: Price.TieredPrice) = price(Price.ofTiered(tiered))

                /** The price object */
                fun price(tieredBps: Price.TieredBpsPrice) = price(Price.ofTieredBps(tieredBps))

                /** The price object */
                fun price(bps: Price.BpsPrice) = price(Price.ofBps(bps))

                /** The price object */
                fun price(bulkBps: Price.BulkBpsPrice) = price(Price.ofBulkBps(bulkBps))

                /** The price object */
                fun price(bulk: Price.BulkPrice) = price(Price.ofBulk(bulk))

                /** The price object */
                fun price(thresholdTotalAmount: Price.ThresholdTotalAmountPrice) =
                    price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

                /** The price object */
                fun price(tieredPackage: Price.TieredPackagePrice) =
                    price(Price.ofTieredPackage(tieredPackage))

                /** The price object */
                fun price(groupedTiered: Price.GroupedTieredPrice) =
                    price(Price.ofGroupedTiered(groupedTiered))

                /** The price object */
                fun price(tieredWithMinimum: Price.TieredWithMinimumPrice) =
                    price(Price.ofTieredWithMinimum(tieredWithMinimum))

                /** The price object */
                fun price(tieredPackageWithMinimum: Price.TieredPackageWithMinimumPrice) =
                    price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

                /** The price object */
                fun price(packageWithAllocation: Price.PackageWithAllocationPrice) =
                    price(Price.ofPackageWithAllocation(packageWithAllocation))

                /** The price object */
                fun price(unitWithPercent: Price.UnitWithPercentPrice) =
                    price(Price.ofUnitWithPercent(unitWithPercent))

                /** The price object */
                fun price(matrixWithAllocation: Price.MatrixWithAllocationPrice) =
                    price(Price.ofMatrixWithAllocation(matrixWithAllocation))

                /** The price object */
                fun price(tieredWithProration: Price.TieredWithProrationPrice) =
                    price(Price.ofTieredWithProration(tieredWithProration))

                /** The price object */
                fun price(unitWithProration: Price.UnitWithProrationPrice) =
                    price(Price.ofUnitWithProration(unitWithProration))

                /** The price object */
                fun price(groupedAllocation: Price.GroupedAllocationPrice) =
                    price(Price.ofGroupedAllocation(groupedAllocation))

                /** The price object */
                fun price(groupedWithProratedMinimum: Price.GroupedWithProratedMinimumPrice) =
                    price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

                /** The price object */
                fun price(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimumPrice) =
                    price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

                /** The price object */
                fun price(matrixWithDisplayName: Price.MatrixWithDisplayNamePrice) =
                    price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

                /** The price object */
                fun price(bulkWithProration: Price.BulkWithProrationPrice) =
                    price(Price.ofBulkWithProration(bulkWithProration))

                /** The price object */
                fun price(groupedTieredPackage: Price.GroupedTieredPackagePrice) =
                    price(Price.ofGroupedTieredPackage(groupedTieredPackage))

                /** The price object */
                fun price(maxGroupTieredPackage: Price.MaxGroupTieredPackagePrice) =
                    price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

                /** The price object */
                fun price(scalableMatrixWithUnitPricing: Price.ScalableMatrixWithUnitPricingPrice) =
                    price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

                /** The price object */
                fun price(
                    scalableMatrixWithTieredPricing: Price.ScalableMatrixWithTieredPricingPrice
                ) = price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

                /** The price object */
                fun price(cumulativeGroupedBulk: Price.CumulativeGroupedBulkPrice) =
                    price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

                /** The price the cost is associated with */
                fun priceId(priceId: String) = priceId(JsonField.of(priceId))

                /** The price the cost is associated with */
                fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

                /**
                 * Price's contributions for the timeframe, excluding any minimums and discounts.
                 */
                fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

                /**
                 * Price's contributions for the timeframe, excluding any minimums and discounts.
                 */
                fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

                /** Price's contributions for the timeframe, including minimums and discounts. */
                fun total(total: String) = total(JsonField.of(total))

                /** Price's contributions for the timeframe, including minimums and discounts. */
                fun total(total: JsonField<String>) = apply { this.total = total }

                /** The price's quantity for the timeframe */
                fun quantity(quantity: Double?) = quantity(JsonField.ofNullable(quantity))

                /** The price's quantity for the timeframe */
                fun quantity(quantity: Double) = quantity(quantity as Double?)

                /** The price's quantity for the timeframe */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun quantity(quantity: Optional<Double>) =
                    quantity(quantity.orElse(null) as Double?)

                /** The price's quantity for the timeframe */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): PerPriceCost =
                    PerPriceCost(
                        checkRequired("price", price),
                        checkRequired("priceId", priceId),
                        checkRequired("subtotal", subtotal),
                        checkRequired("total", total),
                        quantity,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PerPriceCost && price == other.price && priceId == other.priceId && subtotal == other.subtotal && total == other.total && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(price, priceId, subtotal, total, quantity, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PerPriceCost{price=$price, priceId=$priceId, subtotal=$subtotal, total=$total, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && perPriceCosts == other.perPriceCosts && subtotal == other.subtotal && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && total == other.total && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(perPriceCosts, subtotal, timeframeEnd, timeframeStart, total, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{perPriceCosts=$perPriceCosts, subtotal=$subtotal, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, total=$total, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCostListResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerCostListResponse{data=$data, additionalProperties=$additionalProperties}"
}
