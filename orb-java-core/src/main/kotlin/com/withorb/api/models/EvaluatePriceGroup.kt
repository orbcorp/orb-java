// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
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
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = EvaluatePriceGroup.Builder::class)
@NoAutoDetect
class EvaluatePriceGroup
private constructor(
    private val groupingValues: JsonField<List<GroupingValue>>,
    private val quantity: JsonField<Double>,
    private val amount: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The values for the group in the order specified by `grouping_keys` */
    fun groupingValues(): List<GroupingValue> = groupingValues.getRequired("grouping_values")

    /** The price's usage quantity for the group */
    fun quantity(): Double = quantity.getRequired("quantity")

    /** The price's output for the group */
    fun amount(): String = amount.getRequired("amount")

    /** The values for the group in the order specified by `grouping_keys` */
    @JsonProperty("grouping_values") @ExcludeMissing fun _groupingValues() = groupingValues

    /** The price's usage quantity for the group */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    /** The price's output for the group */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EvaluatePriceGroup = apply {
        if (!validated) {
            groupingValues()
            quantity()
            amount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EvaluatePriceGroup &&
            this.groupingValues == other.groupingValues &&
            this.quantity == other.quantity &&
            this.amount == other.amount &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    groupingValues,
                    quantity,
                    amount,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "EvaluatePriceGroup{groupingValues=$groupingValues, quantity=$quantity, amount=$amount, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var groupingValues: JsonField<List<GroupingValue>> = JsonMissing.of()
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var amount: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(evaluatePriceGroup: EvaluatePriceGroup) = apply {
            this.groupingValues = evaluatePriceGroup.groupingValues
            this.quantity = evaluatePriceGroup.quantity
            this.amount = evaluatePriceGroup.amount
            additionalProperties(evaluatePriceGroup.additionalProperties)
        }

        /** The values for the group in the order specified by `grouping_keys` */
        fun groupingValues(groupingValues: List<GroupingValue>) =
            groupingValues(JsonField.of(groupingValues))

        /** The values for the group in the order specified by `grouping_keys` */
        @JsonProperty("grouping_values")
        @ExcludeMissing
        fun groupingValues(groupingValues: JsonField<List<GroupingValue>>) = apply {
            this.groupingValues = groupingValues
        }

        /** The price's usage quantity for the group */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /** The price's usage quantity for the group */
        @JsonProperty("quantity")
        @ExcludeMissing
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /** The price's output for the group */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /** The price's output for the group */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

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

        fun build(): EvaluatePriceGroup =
            EvaluatePriceGroup(
                groupingValues.map { it.toUnmodifiable() },
                quantity,
                amount,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = GroupingValue.Deserializer::class)
    @JsonSerialize(using = GroupingValue.Serializer::class)
    class GroupingValue
    private constructor(
        private val string: String? = null,
        private val double: Double? = null,
        private val boolean: Boolean? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun double(): Optional<Double> = Optional.ofNullable(double)

        fun boolean(): Optional<Boolean> = Optional.ofNullable(boolean)

        fun isString(): Boolean = string != null

        fun isDouble(): Boolean = double != null

        fun isBoolean(): Boolean = boolean != null

        fun asString(): String = string.getOrThrow("string")

        fun asDouble(): Double = double.getOrThrow("double")

        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                double != null -> visitor.visitDouble(double)
                boolean != null -> visitor.visitBoolean(boolean)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): GroupingValue = apply {
            if (!validated) {
                if (string == null && double == null && boolean == null) {
                    throw OrbInvalidDataException("Unknown GroupingValue: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GroupingValue &&
                this.string == other.string &&
                this.double == other.double &&
                this.boolean == other.boolean
        }

        override fun hashCode(): Int {
            return Objects.hash(
                string,
                double,
                boolean,
            )
        }

        override fun toString(): String {
            return when {
                string != null -> "GroupingValue{string=$string}"
                double != null -> "GroupingValue{double=$double}"
                boolean != null -> "GroupingValue{boolean=$boolean}"
                _json != null -> "GroupingValue{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid GroupingValue")
            }
        }

        companion object {

            @JvmStatic fun ofString(string: String) = GroupingValue(string = string)

            @JvmStatic fun ofDouble(double: Double) = GroupingValue(double = double)

            @JvmStatic fun ofBoolean(boolean: Boolean) = GroupingValue(boolean = boolean)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitDouble(double: Double): T

            fun visitBoolean(boolean: Boolean): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown GroupingValue: $json")
            }
        }

        class Deserializer : BaseDeserializer<GroupingValue>(GroupingValue::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): GroupingValue {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return GroupingValue(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                    return GroupingValue(double = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                    return GroupingValue(boolean = it, _json = json)
                }

                return GroupingValue(_json = json)
            }
        }

        class Serializer : BaseSerializer<GroupingValue>(GroupingValue::class) {

            override fun serialize(
                value: GroupingValue,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.double != null -> generator.writeObject(value.double)
                    value.boolean != null -> generator.writeObject(value.boolean)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid GroupingValue")
                }
            }
        }
    }
}
