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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class EvaluatePriceGroup @JsonCreator private constructor(
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("grouping_values") @ExcludeMissing private val groupingValues: JsonField<List<GroupingValue>> = JsonMissing.of(),
    @JsonProperty("quantity") @ExcludeMissing private val quantity: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    /** The price's output for the group */
    fun amount(): String = amount.getRequired("amount")

    /** The values for the group in the order specified by `grouping_keys` */
    fun groupingValues(): List<GroupingValue> = groupingValues.getRequired("grouping_values")

    /** The price's usage quantity for the group */
    fun quantity(): Double = quantity.getRequired("quantity")

    /** The price's output for the group */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount(): JsonField<String> = amount

    /** The values for the group in the order specified by `grouping_keys` */
    @JsonProperty("grouping_values")
    @ExcludeMissing
    fun _groupingValues(): JsonField<List<GroupingValue>> = groupingValues

    /** The price's usage quantity for the group */
    @JsonProperty("quantity")
    @ExcludeMissing
    fun _quantity(): JsonField<Double> = quantity

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EvaluatePriceGroup =
        apply {
            if (validated) {
              return@apply
            }

            amount()
            groupingValues().forEach { it.validate() }
            quantity()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EvaluatePriceGroup].
         *
         * The following fields are required:
         *
         * ```java
         * .amount()
         * .groupingValues()
         * .quantity()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [EvaluatePriceGroup]. */
    class Builder internal constructor() {

        private var amount: JsonField<String>? = null
        private var groupingValues: JsonField<MutableList<GroupingValue>>? = null
        private var quantity: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(evaluatePriceGroup: EvaluatePriceGroup) =
            apply {
                amount = evaluatePriceGroup.amount
                groupingValues = evaluatePriceGroup.groupingValues.map { it.toMutableList() }
                quantity = evaluatePriceGroup.quantity
                additionalProperties = evaluatePriceGroup.additionalProperties.toMutableMap()
            }

        /** The price's output for the group */
        fun amount(amount: String) = amount(JsonField.of(amount))

        /** The price's output for the group */
        fun amount(amount: JsonField<String>) =
            apply {
                this.amount = amount
            }

        /** The values for the group in the order specified by `grouping_keys` */
        fun groupingValues(groupingValues: List<GroupingValue>) = groupingValues(JsonField.of(groupingValues))

        /** The values for the group in the order specified by `grouping_keys` */
        fun groupingValues(groupingValues: JsonField<List<GroupingValue>>) =
            apply {
                this.groupingValues = groupingValues.map { it.toMutableList() }
            }

        /** The values for the group in the order specified by `grouping_keys` */
        fun addGroupingValue(groupingValue: GroupingValue) =
            apply {
                groupingValues = (groupingValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groupingValues", it).add(groupingValue)
                }
            }

        /** The values for the group in the order specified by `grouping_keys` */
        fun addGroupingValue(string: String) = addGroupingValue(GroupingValue.ofString(string))

        /** The values for the group in the order specified by `grouping_keys` */
        fun addGroupingValue(number: Double) = addGroupingValue(GroupingValue.ofNumber(number))

        /** The values for the group in the order specified by `grouping_keys` */
        fun addGroupingValue(bool: Boolean) = addGroupingValue(GroupingValue.ofBool(bool))

        /** The price's usage quantity for the group */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /** The price's usage quantity for the group */
        fun quantity(quantity: JsonField<Double>) =
            apply {
                this.quantity = quantity
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        fun build(): EvaluatePriceGroup =
            EvaluatePriceGroup(
              checkRequired(
                "amount", amount
              ),
              checkRequired(
                "groupingValues", groupingValues
              ).map { it.toImmutable() },
              checkRequired(
                "quantity", quantity
              ),
              additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = GroupingValue.Deserializer::class)
    @JsonSerialize(using = GroupingValue.Serializer::class)
    class GroupingValue private constructor(
        private val string: String? = null,
        private val number: Double? = null,
        private val bool: Boolean? = null,
        private val _json: JsonValue? = null,

    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun isString(): Boolean = string != null

        fun isNumber(): Boolean = number != null

        fun isBool(): Boolean = bool != null

        fun asString(): String = string.getOrThrow("string")

        fun asNumber(): Double = number.getOrThrow("number")

        fun asBool(): Boolean = bool.getOrThrow("bool")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
          return when {
              string != null -> visitor.visitString(string)
              number != null -> visitor.visitNumber(number)
              bool != null -> visitor.visitBool(bool)
              else -> visitor.unknown(_json)
          }
        }

        private var validated: Boolean = false

        fun validate(): GroupingValue =
            apply {
                if (validated) {
                  return@apply
                }

                accept(object : Visitor<Unit> {
                    override fun visitString(string: String) {

                    }

                    override fun visitNumber(number: Double) {

                    }

                    override fun visitBool(bool: Boolean) {

                    }
                })
                validated = true
            }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is GroupingValue && string == other.string && number == other.number && bool == other.bool /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, number, bool) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "GroupingValue{string=$string}"
                number != null -> "GroupingValue{number=$number}"
                bool != null -> "GroupingValue{bool=$bool}"
                _json != null -> "GroupingValue{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid GroupingValue")
            }

        companion object {

            @JvmStatic
            fun ofString(string: String) = GroupingValue(string = string)

            @JvmStatic
            fun ofNumber(number: Double) = GroupingValue(number = number)

            @JvmStatic
            fun ofBool(bool: Boolean) = GroupingValue(bool = bool)
        }

        /**
         * An interface that defines how to map each variant of [GroupingValue] to a value
         * of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitNumber(number: Double): T

            fun visitBool(bool: Boolean): T

            /**
             * Maps an unknown variant of [GroupingValue] to a value of type [T].
             *
             * An instance of [GroupingValue] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the
             * SDK is on an older version than the API, then the API may respond with new
             * variants that the SDK is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
              throw OrbInvalidDataException("Unknown GroupingValue: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<GroupingValue>(GroupingValue::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): GroupingValue {
              val json = JsonValue.fromJsonNode(node)

              tryDeserialize(node, jacksonTypeRef<String>())?.let {
                  return GroupingValue(string = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                  return GroupingValue(number = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                  return GroupingValue(bool = it, _json = json)
              }

              return GroupingValue(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<GroupingValue>(GroupingValue::class) {

            override fun serialize(value: GroupingValue, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.string != null -> generator.writeObject(value.string)
                  value.number != null -> generator.writeObject(value.number)
                  value.bool != null -> generator.writeObject(value.bool)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid GroupingValue")
              }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is EvaluatePriceGroup && amount == other.amount && groupingValues == other.groupingValues && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, groupingValues, quantity, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "EvaluatePriceGroup{amount=$amount, groupingValues=$groupingValues, quantity=$quantity, additionalProperties=$additionalProperties}"
}
