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
import com.withorb.api.core.Enum
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

@NoAutoDetect
class InvoiceLineItemCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discount")
    @ExcludeMissing
    private val discount: JsonField<Discount> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("grouping")
    @ExcludeMissing
    private val grouping: JsonField<String> = JsonMissing.of(),
    @JsonProperty("maximum")
    @ExcludeMissing
    private val maximum: JsonField<Maximum> = JsonMissing.of(),
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    private val maximumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("minimum")
    @ExcludeMissing
    private val minimum: JsonField<Minimum> = JsonMissing.of(),
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    private val minimumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("price") @ExcludeMissing private val price: JsonField<Price> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("sub_line_items")
    @ExcludeMissing
    private val subLineItems: JsonField<List<SubLineItem>> = JsonMissing.of(),
    @JsonProperty("subtotal")
    @ExcludeMissing
    private val subtotal: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tax_amounts")
    @ExcludeMissing
    private val taxAmounts: JsonField<List<TaxAmount>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A unique ID for this line item. */
    fun id(): String = id.getRequired("id")

    /** The final amount after any discounts or minimums. */
    fun amount(): String = amount.getRequired("amount")

    fun discount(): Optional<Discount> = Optional.ofNullable(discount.getNullable("discount"))

    /** The end date of the range of time applied for this line item's price. */
    fun endDate(): OffsetDateTime = endDate.getRequired("end_date")

    /**
     * [DEPRECATED] For configured prices that are split by a grouping key, this will be populated
     * with the key and a value. The `amount` and `subtotal` will be the values for this particular
     * grouping.
     */
    fun grouping(): Optional<String> = Optional.ofNullable(grouping.getNullable("grouping"))

    fun maximum(): Optional<Maximum> = Optional.ofNullable(maximum.getNullable("maximum"))

    fun maximumAmount(): Optional<String> =
        Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

    fun minimum(): Optional<Minimum> = Optional.ofNullable(minimum.getNullable("minimum"))

    fun minimumAmount(): Optional<String> =
        Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

    /** The name of the price associated with this line item. */
    fun name(): String = name.getRequired("name")

    /**
     * The Price resource represents a price that can be billed on a subscription, resulting in a
     * charge on an invoice in the form of an invoice line item. Prices take a quantity and
     * determine an amount to bill.
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given Price object. The model_type field determines the key for
     * the configuration object that is present.
     *
     * For more on the types of prices, see
     * [the core concepts documentation](/core-concepts#plan-and-price)
     */
    fun price(): Optional<Price> = Optional.ofNullable(price.getNullable("price"))

    fun quantity(): Double = quantity.getRequired("quantity")

    /** The start date of the range of time applied for this line item's price. */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /**
     * For complex pricing structures, the line item can be broken down further in `sub_line_items`.
     */
    fun subLineItems(): List<SubLineItem> = subLineItems.getRequired("sub_line_items")

    /** The line amount before any line item-specific discounts or minimums. */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /**
     * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
     * configured.
     */
    fun taxAmounts(): List<TaxAmount> = taxAmounts.getRequired("tax_amounts")

    /** A unique ID for this line item. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The final amount after any discounts or minimums. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

    /** The end date of the range of time applied for this line item's price. */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * [DEPRECATED] For configured prices that are split by a grouping key, this will be populated
     * with the key and a value. The `amount` and `subtotal` will be the values for this particular
     * grouping.
     */
    @JsonProperty("grouping") @ExcludeMissing fun _grouping(): JsonField<String> = grouping

    @JsonProperty("maximum") @ExcludeMissing fun _maximum(): JsonField<Maximum> = maximum

    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

    @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<Minimum> = minimum

    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

    /** The name of the price associated with this line item. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * The Price resource represents a price that can be billed on a subscription, resulting in a
     * charge on an invoice in the form of an invoice line item. Prices take a quantity and
     * determine an amount to bill.
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given Price object. The model_type field determines the key for
     * the configuration object that is present.
     *
     * For more on the types of prices, see
     * [the core concepts documentation](/core-concepts#plan-and-price)
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    /** The start date of the range of time applied for this line item's price. */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * For complex pricing structures, the line item can be broken down further in `sub_line_items`.
     */
    @JsonProperty("sub_line_items")
    @ExcludeMissing
    fun _subLineItems(): JsonField<List<SubLineItem>> = subLineItems

    /** The line amount before any line item-specific discounts or minimums. */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

    /**
     * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
     * configured.
     */
    @JsonProperty("tax_amounts")
    @ExcludeMissing
    fun _taxAmounts(): JsonField<List<TaxAmount>> = taxAmounts

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InvoiceLineItemCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        discount().ifPresent { it.validate() }
        endDate()
        grouping()
        maximum().ifPresent { it.validate() }
        maximumAmount()
        minimum().ifPresent { it.validate() }
        minimumAmount()
        name()
        price().ifPresent { it.validate() }
        quantity()
        startDate()
        subLineItems().forEach { it.validate() }
        subtotal()
        taxAmounts().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var amount: JsonField<String>? = null
        private var discount: JsonField<Discount>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var grouping: JsonField<String>? = null
        private var maximum: JsonField<Maximum>? = null
        private var maximumAmount: JsonField<String>? = null
        private var minimum: JsonField<Minimum>? = null
        private var minimumAmount: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var price: JsonField<Price>? = null
        private var quantity: JsonField<Double>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var subLineItems: JsonField<MutableList<SubLineItem>>? = null
        private var subtotal: JsonField<String>? = null
        private var taxAmounts: JsonField<MutableList<TaxAmount>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invoiceLineItemCreateResponse: InvoiceLineItemCreateResponse) = apply {
            id = invoiceLineItemCreateResponse.id
            amount = invoiceLineItemCreateResponse.amount
            discount = invoiceLineItemCreateResponse.discount
            endDate = invoiceLineItemCreateResponse.endDate
            grouping = invoiceLineItemCreateResponse.grouping
            maximum = invoiceLineItemCreateResponse.maximum
            maximumAmount = invoiceLineItemCreateResponse.maximumAmount
            minimum = invoiceLineItemCreateResponse.minimum
            minimumAmount = invoiceLineItemCreateResponse.minimumAmount
            name = invoiceLineItemCreateResponse.name
            price = invoiceLineItemCreateResponse.price
            quantity = invoiceLineItemCreateResponse.quantity
            startDate = invoiceLineItemCreateResponse.startDate
            subLineItems = invoiceLineItemCreateResponse.subLineItems.map { it.toMutableList() }
            subtotal = invoiceLineItemCreateResponse.subtotal
            taxAmounts = invoiceLineItemCreateResponse.taxAmounts.map { it.toMutableList() }
            additionalProperties = invoiceLineItemCreateResponse.additionalProperties.toMutableMap()
        }

        /** A unique ID for this line item. */
        fun id(id: String) = id(JsonField.of(id))

        /** A unique ID for this line item. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The final amount after any discounts or minimums. */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /** The final amount after any discounts or minimums. */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        fun discount(discount: Discount?) = discount(JsonField.ofNullable(discount))

        fun discount(discount: Optional<Discount>) = discount(discount.orElse(null))

        fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

        fun discount(percentageDiscount: PercentageDiscount) =
            discount(Discount.ofPercentageDiscount(percentageDiscount))

        fun discount(trialDiscount: TrialDiscount) =
            discount(Discount.ofTrialDiscount(trialDiscount))

        fun discount(usageDiscount: Discount.UsageDiscount) =
            discount(Discount.ofUsageDiscount(usageDiscount))

        fun discount(amountDiscount: AmountDiscount) =
            discount(Discount.ofAmountDiscount(amountDiscount))

        /** The end date of the range of time applied for this line item's price. */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /** The end date of the range of time applied for this line item's price. */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         */
        fun grouping(grouping: String?) = grouping(JsonField.ofNullable(grouping))

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         */
        fun grouping(grouping: Optional<String>) = grouping(grouping.orElse(null))

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         */
        fun grouping(grouping: JsonField<String>) = apply { this.grouping = grouping }

        fun maximum(maximum: Maximum?) = maximum(JsonField.ofNullable(maximum))

        fun maximum(maximum: Optional<Maximum>) = maximum(maximum.orElse(null))

        fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

        fun maximumAmount(maximumAmount: String?) =
            maximumAmount(JsonField.ofNullable(maximumAmount))

        fun maximumAmount(maximumAmount: Optional<String>) =
            maximumAmount(maximumAmount.orElse(null))

        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
        }

        fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

        fun minimum(minimum: Optional<Minimum>) = minimum(minimum.orElse(null))

        fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

        fun minimumAmount(minimumAmount: String?) =
            minimumAmount(JsonField.ofNullable(minimumAmount))

        fun minimumAmount(minimumAmount: Optional<String>) =
            minimumAmount(minimumAmount.orElse(null))

        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        /** The name of the price associated with this line item. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the price associated with this line item. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(price: Price?) = price(JsonField.ofNullable(price))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(price: Optional<Price>) = price(price.orElse(null))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(price: JsonField<Price>) = apply { this.price = price }

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(unitPrice: Price.UnitPrice) = price(Price.ofUnitPrice(unitPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(packagePrice: Price.PackagePrice) = price(Price.ofPackagePrice(packagePrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(matrixPrice: Price.MatrixPrice) = price(Price.ofMatrixPrice(matrixPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(tieredPrice: Price.TieredPrice) = price(Price.ofTieredPrice(tieredPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(tieredBpsPrice: Price.TieredBpsPrice) =
            price(Price.ofTieredBpsPrice(tieredBpsPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(bpsPrice: Price.BpsPrice) = price(Price.ofBpsPrice(bpsPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(bulkBpsPrice: Price.BulkBpsPrice) = price(Price.ofBulkBpsPrice(bulkBpsPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(bulkPrice: Price.BulkPrice) = price(Price.ofBulkPrice(bulkPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(thresholdTotalAmountPrice: Price.ThresholdTotalAmountPrice) =
            price(Price.ofThresholdTotalAmountPrice(thresholdTotalAmountPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(tieredPackagePrice: Price.TieredPackagePrice) =
            price(Price.ofTieredPackagePrice(tieredPackagePrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(groupedTieredPrice: Price.GroupedTieredPrice) =
            price(Price.ofGroupedTieredPrice(groupedTieredPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(tieredWithMinimumPrice: Price.TieredWithMinimumPrice) =
            price(Price.ofTieredWithMinimumPrice(tieredWithMinimumPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(tieredPackageWithMinimumPrice: Price.TieredPackageWithMinimumPrice) =
            price(Price.ofTieredPackageWithMinimumPrice(tieredPackageWithMinimumPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(packageWithAllocationPrice: Price.PackageWithAllocationPrice) =
            price(Price.ofPackageWithAllocationPrice(packageWithAllocationPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(unitWithPercentPrice: Price.UnitWithPercentPrice) =
            price(Price.ofUnitWithPercentPrice(unitWithPercentPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(matrixWithAllocationPrice: Price.MatrixWithAllocationPrice) =
            price(Price.ofMatrixWithAllocationPrice(matrixWithAllocationPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(tieredWithProrationPrice: Price.TieredWithProrationPrice) =
            price(Price.ofTieredWithProrationPrice(tieredWithProrationPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(unitWithProrationPrice: Price.UnitWithProrationPrice) =
            price(Price.ofUnitWithProrationPrice(unitWithProrationPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(groupedAllocationPrice: Price.GroupedAllocationPrice) =
            price(Price.ofGroupedAllocationPrice(groupedAllocationPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(groupedWithProratedMinimumPrice: Price.GroupedWithProratedMinimumPrice) =
            price(Price.ofGroupedWithProratedMinimumPrice(groupedWithProratedMinimumPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(groupedWithMeteredMinimumPrice: Price.GroupedWithMeteredMinimumPrice) =
            price(Price.ofGroupedWithMeteredMinimumPrice(groupedWithMeteredMinimumPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(matrixWithDisplayNamePrice: Price.MatrixWithDisplayNamePrice) =
            price(Price.ofMatrixWithDisplayNamePrice(matrixWithDisplayNamePrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(bulkWithProrationPrice: Price.BulkWithProrationPrice) =
            price(Price.ofBulkWithProrationPrice(bulkWithProrationPrice))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(groupedTieredPackagePrice: Price.GroupedTieredPackagePrice) =
            price(Price.ofGroupedTieredPackagePrice(groupedTieredPackagePrice))

        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /** The start date of the range of time applied for this line item's price. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /** The start date of the range of time applied for this line item's price. */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun subLineItems(subLineItems: List<SubLineItem>) = subLineItems(JsonField.of(subLineItems))

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun subLineItems(subLineItems: JsonField<List<SubLineItem>>) = apply {
            this.subLineItems = subLineItems.map { it.toMutableList() }
        }

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun addSubLineItem(subLineItem: SubLineItem) = apply {
            subLineItems =
                (subLineItems ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(subLineItem)
                }
        }

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun addSubLineItem(matrixSubLineItem: SubLineItem.MatrixSubLineItem) =
            addSubLineItem(SubLineItem.ofMatrixSubLineItem(matrixSubLineItem))

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun addSubLineItem(tierSubLineItem: SubLineItem.TierSubLineItem) =
            addSubLineItem(SubLineItem.ofTierSubLineItem(tierSubLineItem))

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun addSubLineItem(otherSubLineItem: SubLineItem.OtherSubLineItem) =
            addSubLineItem(SubLineItem.ofOtherSubLineItem(otherSubLineItem))

        /** The line amount before any line item-specific discounts or minimums. */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /** The line amount before any line item-specific discounts or minimums. */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        /**
         * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
         * configured.
         */
        fun taxAmounts(taxAmounts: List<TaxAmount>) = taxAmounts(JsonField.of(taxAmounts))

        /**
         * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
         * configured.
         */
        fun taxAmounts(taxAmounts: JsonField<List<TaxAmount>>) = apply {
            this.taxAmounts = taxAmounts.map { it.toMutableList() }
        }

        /**
         * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
         * configured.
         */
        fun addTaxAmount(taxAmount: TaxAmount) = apply {
            taxAmounts =
                (taxAmounts ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(taxAmount)
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

        fun build(): InvoiceLineItemCreateResponse =
            InvoiceLineItemCreateResponse(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("discount", discount),
                checkRequired("endDate", endDate),
                checkRequired("grouping", grouping),
                checkRequired("maximum", maximum),
                checkRequired("maximumAmount", maximumAmount),
                checkRequired("minimum", minimum),
                checkRequired("minimumAmount", minimumAmount),
                checkRequired("name", name),
                checkRequired("price", price),
                checkRequired("quantity", quantity),
                checkRequired("startDate", startDate),
                checkRequired("subLineItems", subLineItems).map { it.toImmutable() },
                checkRequired("subtotal", subtotal),
                checkRequired("taxAmounts", taxAmounts).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Maximum
    @JsonCreator
    private constructor(
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** Maximum amount applied */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /** Maximum amount applied */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Maximum = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            maximumAmount()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var maximumAmount: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(maximum: Maximum) = apply {
                appliesToPriceIds = maximum.appliesToPriceIds.map { it.toMutableList() }
                maximumAmount = maximum.maximumAmount
                additionalProperties = maximum.additionalProperties.toMutableMap()
            }

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(appliesToPriceId)
                    }
            }

            /** Maximum amount applied */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /** Maximum amount applied */
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
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

            fun build(): Maximum =
                Maximum(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("maximumAmount", maximumAmount),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Maximum && appliesToPriceIds == other.appliesToPriceIds && maximumAmount == other.maximumAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, maximumAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Maximum{appliesToPriceIds=$appliesToPriceIds, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Minimum
    @JsonCreator
    private constructor(
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** Minimum amount applied */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /** Minimum amount applied */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Minimum = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            minimumAmount()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var minimumAmount: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimum: Minimum) = apply {
                appliesToPriceIds = minimum.appliesToPriceIds.map { it.toMutableList() }
                minimumAmount = minimum.minimumAmount
                additionalProperties = minimum.additionalProperties.toMutableMap()
            }

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(appliesToPriceId)
                    }
            }

            /** Minimum amount applied */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /** Minimum amount applied */
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
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

            fun build(): Minimum =
                Minimum(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("minimumAmount", minimumAmount),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Minimum && appliesToPriceIds == other.appliesToPriceIds && minimumAmount == other.minimumAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, minimumAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Minimum{appliesToPriceIds=$appliesToPriceIds, minimumAmount=$minimumAmount, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = SubLineItem.Deserializer::class)
    @JsonSerialize(using = SubLineItem.Serializer::class)
    class SubLineItem
    private constructor(
        private val matrixSubLineItem: MatrixSubLineItem? = null,
        private val tierSubLineItem: TierSubLineItem? = null,
        private val otherSubLineItem: OtherSubLineItem? = null,
        private val _json: JsonValue? = null,
    ) {

        fun matrixSubLineItem(): Optional<MatrixSubLineItem> =
            Optional.ofNullable(matrixSubLineItem)

        fun tierSubLineItem(): Optional<TierSubLineItem> = Optional.ofNullable(tierSubLineItem)

        fun otherSubLineItem(): Optional<OtherSubLineItem> = Optional.ofNullable(otherSubLineItem)

        fun isMatrixSubLineItem(): Boolean = matrixSubLineItem != null

        fun isTierSubLineItem(): Boolean = tierSubLineItem != null

        fun isOtherSubLineItem(): Boolean = otherSubLineItem != null

        fun asMatrixSubLineItem(): MatrixSubLineItem =
            matrixSubLineItem.getOrThrow("matrixSubLineItem")

        fun asTierSubLineItem(): TierSubLineItem = tierSubLineItem.getOrThrow("tierSubLineItem")

        fun asOtherSubLineItem(): OtherSubLineItem = otherSubLineItem.getOrThrow("otherSubLineItem")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                matrixSubLineItem != null -> visitor.visitMatrixSubLineItem(matrixSubLineItem)
                tierSubLineItem != null -> visitor.visitTierSubLineItem(tierSubLineItem)
                otherSubLineItem != null -> visitor.visitOtherSubLineItem(otherSubLineItem)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): SubLineItem = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitMatrixSubLineItem(matrixSubLineItem: MatrixSubLineItem) {
                        matrixSubLineItem.validate()
                    }

                    override fun visitTierSubLineItem(tierSubLineItem: TierSubLineItem) {
                        tierSubLineItem.validate()
                    }

                    override fun visitOtherSubLineItem(otherSubLineItem: OtherSubLineItem) {
                        otherSubLineItem.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubLineItem && matrixSubLineItem == other.matrixSubLineItem && tierSubLineItem == other.tierSubLineItem && otherSubLineItem == other.otherSubLineItem /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(matrixSubLineItem, tierSubLineItem, otherSubLineItem) /* spotless:on */

        override fun toString(): String =
            when {
                matrixSubLineItem != null -> "SubLineItem{matrixSubLineItem=$matrixSubLineItem}"
                tierSubLineItem != null -> "SubLineItem{tierSubLineItem=$tierSubLineItem}"
                otherSubLineItem != null -> "SubLineItem{otherSubLineItem=$otherSubLineItem}"
                _json != null -> "SubLineItem{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid SubLineItem")
            }

        companion object {

            @JvmStatic
            fun ofMatrixSubLineItem(matrixSubLineItem: MatrixSubLineItem) =
                SubLineItem(matrixSubLineItem = matrixSubLineItem)

            @JvmStatic
            fun ofTierSubLineItem(tierSubLineItem: TierSubLineItem) =
                SubLineItem(tierSubLineItem = tierSubLineItem)

            @JvmStatic
            fun ofOtherSubLineItem(otherSubLineItem: OtherSubLineItem) =
                SubLineItem(otherSubLineItem = otherSubLineItem)
        }

        interface Visitor<out T> {

            fun visitMatrixSubLineItem(matrixSubLineItem: MatrixSubLineItem): T

            fun visitTierSubLineItem(tierSubLineItem: TierSubLineItem): T

            fun visitOtherSubLineItem(otherSubLineItem: OtherSubLineItem): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown SubLineItem: $json")
            }
        }

        class Deserializer : BaseDeserializer<SubLineItem>(SubLineItem::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): SubLineItem {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "matrix" -> {
                        tryDeserialize(node, jacksonTypeRef<MatrixSubLineItem>()) { it.validate() }
                            ?.let {
                                return SubLineItem(matrixSubLineItem = it, _json = json)
                            }
                    }
                    "tier" -> {
                        tryDeserialize(node, jacksonTypeRef<TierSubLineItem>()) { it.validate() }
                            ?.let {
                                return SubLineItem(tierSubLineItem = it, _json = json)
                            }
                    }
                    "'null'" -> {
                        tryDeserialize(node, jacksonTypeRef<OtherSubLineItem>()) { it.validate() }
                            ?.let {
                                return SubLineItem(otherSubLineItem = it, _json = json)
                            }
                    }
                }

                return SubLineItem(_json = json)
            }
        }

        class Serializer : BaseSerializer<SubLineItem>(SubLineItem::class) {

            override fun serialize(
                value: SubLineItem,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.matrixSubLineItem != null ->
                        generator.writeObject(value.matrixSubLineItem)
                    value.tierSubLineItem != null -> generator.writeObject(value.tierSubLineItem)
                    value.otherSubLineItem != null -> generator.writeObject(value.otherSubLineItem)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid SubLineItem")
                }
            }
        }

        @NoAutoDetect
        class MatrixSubLineItem
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grouping")
            @ExcludeMissing
            private val grouping: JsonField<Grouping> = JsonMissing.of(),
            @JsonProperty("matrix_config")
            @ExcludeMissing
            private val matrixConfig: JsonField<MatrixConfig> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The total amount for this sub line item. */
            fun amount(): String = amount.getRequired("amount")

            fun grouping(): Optional<Grouping> =
                Optional.ofNullable(grouping.getNullable("grouping"))

            fun matrixConfig(): MatrixConfig = matrixConfig.getRequired("matrix_config")

            fun name(): String = name.getRequired("name")

            fun quantity(): Double = quantity.getRequired("quantity")

            fun type(): Type = type.getRequired("type")

            /** The total amount for this sub line item. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            @JsonProperty("grouping")
            @ExcludeMissing
            fun _grouping(): JsonField<Grouping> = grouping

            @JsonProperty("matrix_config")
            @ExcludeMissing
            fun _matrixConfig(): JsonField<MatrixConfig> = matrixConfig

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): MatrixSubLineItem = apply {
                if (validated) {
                    return@apply
                }

                amount()
                grouping().ifPresent { it.validate() }
                matrixConfig().validate()
                name()
                quantity()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<String>? = null
                private var grouping: JsonField<Grouping>? = null
                private var matrixConfig: JsonField<MatrixConfig>? = null
                private var name: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(matrixSubLineItem: MatrixSubLineItem) = apply {
                    amount = matrixSubLineItem.amount
                    grouping = matrixSubLineItem.grouping
                    matrixConfig = matrixSubLineItem.matrixConfig
                    name = matrixSubLineItem.name
                    quantity = matrixSubLineItem.quantity
                    type = matrixSubLineItem.type
                    additionalProperties = matrixSubLineItem.additionalProperties.toMutableMap()
                }

                /** The total amount for this sub line item. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The total amount for this sub line item. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                fun grouping(grouping: Optional<Grouping>) = grouping(grouping.orElse(null))

                fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                fun matrixConfig(matrixConfig: MatrixConfig) =
                    matrixConfig(JsonField.of(matrixConfig))

                fun matrixConfig(matrixConfig: JsonField<MatrixConfig>) = apply {
                    this.matrixConfig = matrixConfig
                }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): MatrixSubLineItem =
                    MatrixSubLineItem(
                        checkRequired("amount", amount),
                        checkRequired("grouping", grouping),
                        checkRequired("matrixConfig", matrixConfig),
                        checkRequired("name", name),
                        checkRequired("quantity", quantity),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Grouping
            @JsonCreator
            private constructor(
                @JsonProperty("key")
                @ExcludeMissing
                private val key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value")
                @ExcludeMissing
                private val value: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun key(): String = key.getRequired("key")

                /** No value indicates the default group */
                fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /** No value indicates the default group */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Grouping = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
                    value()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var key: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(grouping: Grouping) = apply {
                        key = grouping.key
                        value = grouping.value
                        additionalProperties = grouping.additionalProperties.toMutableMap()
                    }

                    fun key(key: String) = key(JsonField.of(key))

                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** No value indicates the default group */
                    fun value(value: String?) = value(JsonField.ofNullable(value))

                    /** No value indicates the default group */
                    fun value(value: Optional<String>) = value(value.orElse(null))

                    /** No value indicates the default group */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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

                    fun build(): Grouping =
                        Grouping(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Grouping && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Grouping{key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class MatrixConfig
            @JsonCreator
            private constructor(
                @JsonProperty("dimension_values")
                @ExcludeMissing
                private val dimensionValues: JsonField<List<String?>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The ordered dimension values for this line item. */
                fun dimensionValues(): List<String?> =
                    dimensionValues.getRequired("dimension_values")

                /** The ordered dimension values for this line item. */
                @JsonProperty("dimension_values")
                @ExcludeMissing
                fun _dimensionValues(): JsonField<List<String?>> = dimensionValues

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MatrixConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    dimensionValues()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var dimensionValues: JsonField<MutableList<String?>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(matrixConfig: MatrixConfig) = apply {
                        dimensionValues = matrixConfig.dimensionValues.map { it.toMutableList() }
                        additionalProperties = matrixConfig.additionalProperties.toMutableMap()
                    }

                    /** The ordered dimension values for this line item. */
                    fun dimensionValues(dimensionValues: List<String?>) =
                        dimensionValues(JsonField.of(dimensionValues))

                    /** The ordered dimension values for this line item. */
                    fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                        this.dimensionValues = dimensionValues.map { it.toMutableList() }
                    }

                    /** The ordered dimension values for this line item. */
                    fun addDimensionValue(dimensionValue: String) = apply {
                        dimensionValues =
                            (dimensionValues ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(dimensionValue)
                            }
                    }

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

                    fun build(): MatrixConfig =
                        MatrixConfig(
                            checkRequired("dimensionValues", dimensionValues).map {
                                it.toImmutable()
                            },
                            additionalProperties.toImmutable()
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MatrixConfig && dimensionValues == other.dimensionValues && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(dimensionValues, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MatrixConfig{dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MATRIX = of("matrix")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    MATRIX,
                }

                enum class Value {
                    MATRIX,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        MATRIX -> Value.MATRIX
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        MATRIX -> Known.MATRIX
                        else -> throw OrbInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MatrixSubLineItem && amount == other.amount && grouping == other.grouping && matrixConfig == other.matrixConfig && name == other.name && quantity == other.quantity && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, grouping, matrixConfig, name, quantity, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MatrixSubLineItem{amount=$amount, grouping=$grouping, matrixConfig=$matrixConfig, name=$name, quantity=$quantity, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TierSubLineItem
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grouping")
            @ExcludeMissing
            private val grouping: JsonField<Grouping> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tier_config")
            @ExcludeMissing
            private val tierConfig: JsonField<TierConfig> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The total amount for this sub line item. */
            fun amount(): String = amount.getRequired("amount")

            fun grouping(): Optional<Grouping> =
                Optional.ofNullable(grouping.getNullable("grouping"))

            fun name(): String = name.getRequired("name")

            fun quantity(): Double = quantity.getRequired("quantity")

            fun tierConfig(): TierConfig = tierConfig.getRequired("tier_config")

            fun type(): Type = type.getRequired("type")

            /** The total amount for this sub line item. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            @JsonProperty("grouping")
            @ExcludeMissing
            fun _grouping(): JsonField<Grouping> = grouping

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonProperty("tier_config")
            @ExcludeMissing
            fun _tierConfig(): JsonField<TierConfig> = tierConfig

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TierSubLineItem = apply {
                if (validated) {
                    return@apply
                }

                amount()
                grouping().ifPresent { it.validate() }
                name()
                quantity()
                tierConfig().validate()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<String>? = null
                private var grouping: JsonField<Grouping>? = null
                private var name: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var tierConfig: JsonField<TierConfig>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tierSubLineItem: TierSubLineItem) = apply {
                    amount = tierSubLineItem.amount
                    grouping = tierSubLineItem.grouping
                    name = tierSubLineItem.name
                    quantity = tierSubLineItem.quantity
                    tierConfig = tierSubLineItem.tierConfig
                    type = tierSubLineItem.type
                    additionalProperties = tierSubLineItem.additionalProperties.toMutableMap()
                }

                /** The total amount for this sub line item. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The total amount for this sub line item. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                fun grouping(grouping: Optional<Grouping>) = grouping(grouping.orElse(null))

                fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun tierConfig(tierConfig: TierConfig) = tierConfig(JsonField.of(tierConfig))

                fun tierConfig(tierConfig: JsonField<TierConfig>) = apply {
                    this.tierConfig = tierConfig
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): TierSubLineItem =
                    TierSubLineItem(
                        checkRequired("amount", amount),
                        checkRequired("grouping", grouping),
                        checkRequired("name", name),
                        checkRequired("quantity", quantity),
                        checkRequired("tierConfig", tierConfig),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Grouping
            @JsonCreator
            private constructor(
                @JsonProperty("key")
                @ExcludeMissing
                private val key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value")
                @ExcludeMissing
                private val value: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun key(): String = key.getRequired("key")

                /** No value indicates the default group */
                fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /** No value indicates the default group */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Grouping = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
                    value()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var key: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(grouping: Grouping) = apply {
                        key = grouping.key
                        value = grouping.value
                        additionalProperties = grouping.additionalProperties.toMutableMap()
                    }

                    fun key(key: String) = key(JsonField.of(key))

                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** No value indicates the default group */
                    fun value(value: String?) = value(JsonField.ofNullable(value))

                    /** No value indicates the default group */
                    fun value(value: Optional<String>) = value(value.orElse(null))

                    /** No value indicates the default group */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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

                    fun build(): Grouping =
                        Grouping(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Grouping && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Grouping{key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class TierConfig
            @JsonCreator
            private constructor(
                @JsonProperty("first_unit")
                @ExcludeMissing
                private val firstUnit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("last_unit")
                @ExcludeMissing
                private val lastUnit: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_amount")
                @ExcludeMissing
                private val unitAmount: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun firstUnit(): Double = firstUnit.getRequired("first_unit")

                fun lastUnit(): Optional<Double> =
                    Optional.ofNullable(lastUnit.getNullable("last_unit"))

                fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                @JsonProperty("first_unit")
                @ExcludeMissing
                fun _firstUnit(): JsonField<Double> = firstUnit

                @JsonProperty("last_unit")
                @ExcludeMissing
                fun _lastUnit(): JsonField<Double> = lastUnit

                @JsonProperty("unit_amount")
                @ExcludeMissing
                fun _unitAmount(): JsonField<String> = unitAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): TierConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    firstUnit()
                    lastUnit()
                    unitAmount()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var firstUnit: JsonField<Double>? = null
                    private var lastUnit: JsonField<Double>? = null
                    private var unitAmount: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tierConfig: TierConfig) = apply {
                        firstUnit = tierConfig.firstUnit
                        lastUnit = tierConfig.lastUnit
                        unitAmount = tierConfig.unitAmount
                        additionalProperties = tierConfig.additionalProperties.toMutableMap()
                    }

                    fun firstUnit(firstUnit: Double) = firstUnit(JsonField.of(firstUnit))

                    fun firstUnit(firstUnit: JsonField<Double>) = apply {
                        this.firstUnit = firstUnit
                    }

                    fun lastUnit(lastUnit: Double?) = lastUnit(JsonField.ofNullable(lastUnit))

                    fun lastUnit(lastUnit: Double) = lastUnit(lastUnit as Double?)

                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun lastUnit(lastUnit: Optional<Double>) =
                        lastUnit(lastUnit.orElse(null) as Double?)

                    fun lastUnit(lastUnit: JsonField<Double>) = apply { this.lastUnit = lastUnit }

                    fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                    fun unitAmount(unitAmount: JsonField<String>) = apply {
                        this.unitAmount = unitAmount
                    }

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

                    fun build(): TierConfig =
                        TierConfig(
                            checkRequired("firstUnit", firstUnit),
                            checkRequired("lastUnit", lastUnit),
                            checkRequired("unitAmount", unitAmount),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TierConfig && firstUnit == other.firstUnit && lastUnit == other.lastUnit && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(firstUnit, lastUnit, unitAmount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TierConfig{firstUnit=$firstUnit, lastUnit=$lastUnit, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TIER = of("tier")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    TIER,
                }

                enum class Value {
                    TIER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TIER -> Value.TIER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TIER -> Known.TIER
                        else -> throw OrbInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TierSubLineItem && amount == other.amount && grouping == other.grouping && name == other.name && quantity == other.quantity && tierConfig == other.tierConfig && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, grouping, name, quantity, tierConfig, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TierSubLineItem{amount=$amount, grouping=$grouping, name=$name, quantity=$quantity, tierConfig=$tierConfig, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class OtherSubLineItem
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grouping")
            @ExcludeMissing
            private val grouping: JsonField<Grouping> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The total amount for this sub line item. */
            fun amount(): String = amount.getRequired("amount")

            fun grouping(): Optional<Grouping> =
                Optional.ofNullable(grouping.getNullable("grouping"))

            fun name(): String = name.getRequired("name")

            fun quantity(): Double = quantity.getRequired("quantity")

            fun type(): Type = type.getRequired("type")

            /** The total amount for this sub line item. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            @JsonProperty("grouping")
            @ExcludeMissing
            fun _grouping(): JsonField<Grouping> = grouping

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OtherSubLineItem = apply {
                if (validated) {
                    return@apply
                }

                amount()
                grouping().ifPresent { it.validate() }
                name()
                quantity()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<String>? = null
                private var grouping: JsonField<Grouping>? = null
                private var name: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(otherSubLineItem: OtherSubLineItem) = apply {
                    amount = otherSubLineItem.amount
                    grouping = otherSubLineItem.grouping
                    name = otherSubLineItem.name
                    quantity = otherSubLineItem.quantity
                    type = otherSubLineItem.type
                    additionalProperties = otherSubLineItem.additionalProperties.toMutableMap()
                }

                /** The total amount for this sub line item. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The total amount for this sub line item. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun grouping(grouping: Grouping?) = grouping(JsonField.ofNullable(grouping))

                fun grouping(grouping: Optional<Grouping>) = grouping(grouping.orElse(null))

                fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): OtherSubLineItem =
                    OtherSubLineItem(
                        checkRequired("amount", amount),
                        checkRequired("grouping", grouping),
                        checkRequired("name", name),
                        checkRequired("quantity", quantity),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Grouping
            @JsonCreator
            private constructor(
                @JsonProperty("key")
                @ExcludeMissing
                private val key: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value")
                @ExcludeMissing
                private val value: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun key(): String = key.getRequired("key")

                /** No value indicates the default group */
                fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

                @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                /** No value indicates the default group */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Grouping = apply {
                    if (validated) {
                        return@apply
                    }

                    key()
                    value()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var key: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(grouping: Grouping) = apply {
                        key = grouping.key
                        value = grouping.value
                        additionalProperties = grouping.additionalProperties.toMutableMap()
                    }

                    fun key(key: String) = key(JsonField.of(key))

                    fun key(key: JsonField<String>) = apply { this.key = key }

                    /** No value indicates the default group */
                    fun value(value: String?) = value(JsonField.ofNullable(value))

                    /** No value indicates the default group */
                    fun value(value: Optional<String>) = value(value.orElse(null))

                    /** No value indicates the default group */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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

                    fun build(): Grouping =
                        Grouping(
                            checkRequired("key", key),
                            checkRequired("value", value),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Grouping && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Grouping{key=$key, value=$value, additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NULL = of("'null'")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    NULL,
                }

                enum class Value {
                    NULL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        NULL -> Value.NULL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        NULL -> Known.NULL
                        else -> throw OrbInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OtherSubLineItem && amount == other.amount && grouping == other.grouping && name == other.name && quantity == other.quantity && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, grouping, name, quantity, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OtherSubLineItem{amount=$amount, grouping=$grouping, name=$name, quantity=$quantity, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    @NoAutoDetect
    class TaxAmount
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_rate_description")
        @ExcludeMissing
        private val taxRateDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_rate_percentage")
        @ExcludeMissing
        private val taxRatePercentage: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The amount of additional tax incurred by this tax rate. */
        fun amount(): String = amount.getRequired("amount")

        /** The human-readable description of the applied tax rate. */
        fun taxRateDescription(): String = taxRateDescription.getRequired("tax_rate_description")

        /** The tax rate percentage, out of 100. */
        fun taxRatePercentage(): Optional<String> =
            Optional.ofNullable(taxRatePercentage.getNullable("tax_rate_percentage"))

        /** The amount of additional tax incurred by this tax rate. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /** The human-readable description of the applied tax rate. */
        @JsonProperty("tax_rate_description")
        @ExcludeMissing
        fun _taxRateDescription(): JsonField<String> = taxRateDescription

        /** The tax rate percentage, out of 100. */
        @JsonProperty("tax_rate_percentage")
        @ExcludeMissing
        fun _taxRatePercentage(): JsonField<String> = taxRatePercentage

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TaxAmount = apply {
            if (validated) {
                return@apply
            }

            amount()
            taxRateDescription()
            taxRatePercentage()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<String>? = null
            private var taxRateDescription: JsonField<String>? = null
            private var taxRatePercentage: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(taxAmount: TaxAmount) = apply {
                amount = taxAmount.amount
                taxRateDescription = taxAmount.taxRateDescription
                taxRatePercentage = taxAmount.taxRatePercentage
                additionalProperties = taxAmount.additionalProperties.toMutableMap()
            }

            /** The amount of additional tax incurred by this tax rate. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /** The amount of additional tax incurred by this tax rate. */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The human-readable description of the applied tax rate. */
            fun taxRateDescription(taxRateDescription: String) =
                taxRateDescription(JsonField.of(taxRateDescription))

            /** The human-readable description of the applied tax rate. */
            fun taxRateDescription(taxRateDescription: JsonField<String>) = apply {
                this.taxRateDescription = taxRateDescription
            }

            /** The tax rate percentage, out of 100. */
            fun taxRatePercentage(taxRatePercentage: String?) =
                taxRatePercentage(JsonField.ofNullable(taxRatePercentage))

            /** The tax rate percentage, out of 100. */
            fun taxRatePercentage(taxRatePercentage: Optional<String>) =
                taxRatePercentage(taxRatePercentage.orElse(null))

            /** The tax rate percentage, out of 100. */
            fun taxRatePercentage(taxRatePercentage: JsonField<String>) = apply {
                this.taxRatePercentage = taxRatePercentage
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

            fun build(): TaxAmount =
                TaxAmount(
                    checkRequired("amount", amount),
                    checkRequired("taxRateDescription", taxRateDescription),
                    checkRequired("taxRatePercentage", taxRatePercentage),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaxAmount && amount == other.amount && taxRateDescription == other.taxRateDescription && taxRatePercentage == other.taxRatePercentage && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, taxRateDescription, taxRatePercentage, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TaxAmount{amount=$amount, taxRateDescription=$taxRateDescription, taxRatePercentage=$taxRatePercentage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceLineItemCreateResponse && id == other.id && amount == other.amount && discount == other.discount && endDate == other.endDate && grouping == other.grouping && maximum == other.maximum && maximumAmount == other.maximumAmount && minimum == other.minimum && minimumAmount == other.minimumAmount && name == other.name && price == other.price && quantity == other.quantity && startDate == other.startDate && subLineItems == other.subLineItems && subtotal == other.subtotal && taxAmounts == other.taxAmounts && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, discount, endDate, grouping, maximum, maximumAmount, minimum, minimumAmount, name, price, quantity, startDate, subLineItems, subtotal, taxAmounts, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceLineItemCreateResponse{id=$id, amount=$amount, discount=$discount, endDate=$endDate, grouping=$grouping, maximum=$maximum, maximumAmount=$maximumAmount, minimum=$minimum, minimumAmount=$minimumAmount, name=$name, price=$price, quantity=$quantity, startDate=$startDate, subLineItems=$subLineItems, subtotal=$subtotal, taxAmounts=$taxAmounts, additionalProperties=$additionalProperties}"
}
