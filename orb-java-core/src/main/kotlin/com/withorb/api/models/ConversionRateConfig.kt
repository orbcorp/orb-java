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
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = ConversionRateConfig.Deserializer::class)
@JsonSerialize(using = ConversionRateConfig.Serializer::class)
class ConversionRateConfig
private constructor(
    private val unit: UnitConversionRateConfig? = null,
    private val tiered: TieredConversionRateConfig? = null,
    private val _json: JsonValue? = null,
) {

    fun unit(): Optional<UnitConversionRateConfig> = Optional.ofNullable(unit)

    fun tiered(): Optional<TieredConversionRateConfig> = Optional.ofNullable(tiered)

    fun isUnit(): Boolean = unit != null

    fun isTiered(): Boolean = tiered != null

    fun asUnit(): UnitConversionRateConfig = unit.getOrThrow("unit")

    fun asTiered(): TieredConversionRateConfig = tiered.getOrThrow("tiered")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.withorb.api.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = conversionRateConfig.accept(new ConversionRateConfig.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitUnit(UnitConversionRateConfig unit) {
     *         return Optional.of(unit.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws OrbInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and the
     *   current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            unit != null -> visitor.visitUnit(unit)
            tiered != null -> visitor.visitTiered(tiered)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws OrbInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): ConversionRateConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUnit(unit: UnitConversionRateConfig) {
                    unit.validate()
                }

                override fun visitTiered(tiered: TieredConversionRateConfig) {
                    tiered.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitUnit(unit: UnitConversionRateConfig) = unit.validity()

                override fun visitTiered(tiered: TieredConversionRateConfig) = tiered.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConversionRateConfig && unit == other.unit && tiered == other.tiered
    }

    override fun hashCode(): Int = Objects.hash(unit, tiered)

    override fun toString(): String =
        when {
            unit != null -> "ConversionRateConfig{unit=$unit}"
            tiered != null -> "ConversionRateConfig{tiered=$tiered}"
            _json != null -> "ConversionRateConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ConversionRateConfig")
        }

    companion object {

        @JvmStatic fun ofUnit(unit: UnitConversionRateConfig) = ConversionRateConfig(unit = unit)

        @JvmStatic
        fun ofTiered(tiered: TieredConversionRateConfig) = ConversionRateConfig(tiered = tiered)
    }

    /**
     * An interface that defines how to map each variant of [ConversionRateConfig] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitUnit(unit: UnitConversionRateConfig): T

        fun visitTiered(tiered: TieredConversionRateConfig): T

        /**
         * Maps an unknown variant of [ConversionRateConfig] to a value of type [T].
         *
         * An instance of [ConversionRateConfig] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown ConversionRateConfig: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<ConversionRateConfig>(ConversionRateConfig::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ConversionRateConfig {
            val json = JsonValue.fromJsonNode(node)
            val conversionRateType =
                json.asObject().getOrNull()?.get("conversion_rate_type")?.asString()?.getOrNull()

            when (conversionRateType) {
                "unit" -> {
                    return tryDeserialize(node, jacksonTypeRef<UnitConversionRateConfig>())?.let {
                        ConversionRateConfig(unit = it, _json = json)
                    } ?: ConversionRateConfig(_json = json)
                }
                "tiered" -> {
                    return tryDeserialize(node, jacksonTypeRef<TieredConversionRateConfig>())?.let {
                        ConversionRateConfig(tiered = it, _json = json)
                    } ?: ConversionRateConfig(_json = json)
                }
            }

            return ConversionRateConfig(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<ConversionRateConfig>(ConversionRateConfig::class) {

        override fun serialize(
            value: ConversionRateConfig,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.unit != null -> generator.writeObject(value.unit)
                value.tiered != null -> generator.writeObject(value.tiered)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ConversionRateConfig")
            }
        }
    }
}
