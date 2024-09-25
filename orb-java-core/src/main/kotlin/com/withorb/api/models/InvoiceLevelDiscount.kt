// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.JsonValue
import com.withorb.api.core.getOrThrow
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = InvoiceLevelDiscount.Deserializer::class)
@JsonSerialize(using = InvoiceLevelDiscount.Serializer::class)
class InvoiceLevelDiscount
private constructor(
    private val percentageDiscount: PercentageDiscount? = null,
    private val amountDiscount: AmountDiscount? = null,
    private val trialDiscount: TrialDiscount? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun percentageDiscount(): Optional<PercentageDiscount> = Optional.ofNullable(percentageDiscount)

    fun amountDiscount(): Optional<AmountDiscount> = Optional.ofNullable(amountDiscount)

    fun trialDiscount(): Optional<TrialDiscount> = Optional.ofNullable(trialDiscount)

    fun isPercentageDiscount(): Boolean = percentageDiscount != null

    fun isAmountDiscount(): Boolean = amountDiscount != null

    fun isTrialDiscount(): Boolean = trialDiscount != null

    fun asPercentageDiscount(): PercentageDiscount =
        percentageDiscount.getOrThrow("percentageDiscount")

    fun asAmountDiscount(): AmountDiscount = amountDiscount.getOrThrow("amountDiscount")

    fun asTrialDiscount(): TrialDiscount = trialDiscount.getOrThrow("trialDiscount")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            percentageDiscount != null -> visitor.visitPercentageDiscount(percentageDiscount)
            amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
            trialDiscount != null -> visitor.visitTrialDiscount(trialDiscount)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): InvoiceLevelDiscount = apply {
        if (!validated) {
            if (percentageDiscount == null && amountDiscount == null && trialDiscount == null) {
                throw OrbInvalidDataException("Unknown InvoiceLevelDiscount: $_json")
            }
            percentageDiscount?.validate()
            amountDiscount?.validate()
            trialDiscount?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceLevelDiscount &&
            this.percentageDiscount == other.percentageDiscount &&
            this.amountDiscount == other.amountDiscount &&
            this.trialDiscount == other.trialDiscount
    }

    override fun hashCode(): Int {
        return Objects.hash(
            percentageDiscount,
            amountDiscount,
            trialDiscount,
        )
    }

    override fun toString(): String {
        return when {
            percentageDiscount != null ->
                "InvoiceLevelDiscount{percentageDiscount=$percentageDiscount}"
            amountDiscount != null -> "InvoiceLevelDiscount{amountDiscount=$amountDiscount}"
            trialDiscount != null -> "InvoiceLevelDiscount{trialDiscount=$trialDiscount}"
            _json != null -> "InvoiceLevelDiscount{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InvoiceLevelDiscount")
        }
    }

    companion object {

        @JvmStatic
        fun ofPercentageDiscount(percentageDiscount: PercentageDiscount) =
            InvoiceLevelDiscount(percentageDiscount = percentageDiscount)

        @JvmStatic
        fun ofAmountDiscount(amountDiscount: AmountDiscount) =
            InvoiceLevelDiscount(amountDiscount = amountDiscount)

        @JvmStatic
        fun ofTrialDiscount(trialDiscount: TrialDiscount) =
            InvoiceLevelDiscount(trialDiscount = trialDiscount)
    }

    interface Visitor<out T> {

        fun visitPercentageDiscount(percentageDiscount: PercentageDiscount): T

        fun visitAmountDiscount(amountDiscount: AmountDiscount): T

        fun visitTrialDiscount(trialDiscount: TrialDiscount): T

        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown InvoiceLevelDiscount: $json")
        }
    }

    class Deserializer : BaseDeserializer<InvoiceLevelDiscount>(InvoiceLevelDiscount::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): InvoiceLevelDiscount {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<PercentageDiscount>()) { it.validate() }
                ?.let {
                    return InvoiceLevelDiscount(percentageDiscount = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<AmountDiscount>()) { it.validate() }
                ?.let {
                    return InvoiceLevelDiscount(amountDiscount = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<TrialDiscount>()) { it.validate() }
                ?.let {
                    return InvoiceLevelDiscount(trialDiscount = it, _json = json)
                }

            return InvoiceLevelDiscount(_json = json)
        }
    }

    class Serializer : BaseSerializer<InvoiceLevelDiscount>(InvoiceLevelDiscount::class) {

        override fun serialize(
            value: InvoiceLevelDiscount,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.percentageDiscount != null -> generator.writeObject(value.percentageDiscount)
                value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                value.trialDiscount != null -> generator.writeObject(value.trialDiscount)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InvoiceLevelDiscount")
            }
        }
    }
}
