// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * A dimensional price group is used to partition the result of a billable metric by a set of
 * dimensions. Prices in a price group must specify the parition used to derive their usage.
 */
@JsonDeserialize(builder = DimensionalPriceGroup.Builder::class)
@NoAutoDetect
class DimensionalPriceGroup
private constructor(
    private val metadata: JsonField<Metadata>,
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val externalDimensionalPriceGroupId: JsonField<String>,
    private val dimensions: JsonField<List<String>>,
    private val billableMetricId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun id(): String = id.getRequired("id")

    /** The name of the dimensional price group */
    fun name(): String = name.getRequired("name")

    /** An alias for the dimensional price group */
    fun externalDimensionalPriceGroupId(): Optional<String> =
        Optional.ofNullable(
            externalDimensionalPriceGroupId.getNullable("external_dimensional_price_group_id")
        )

    /** The dimensions that this dimensional price group is defined over */
    fun dimensions(): List<String> = dimensions.getRequired("dimensions")

    /**
     * The billable metric associated with this dimensional price group. All prices associated with
     * this dimensional price group will be computed using this billable metric.
     */
    fun billableMetricId(): String = billableMetricId.getRequired("billable_metric_id")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The name of the dimensional price group */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** An alias for the dimensional price group */
    @JsonProperty("external_dimensional_price_group_id")
    @ExcludeMissing
    fun _externalDimensionalPriceGroupId() = externalDimensionalPriceGroupId

    /** The dimensions that this dimensional price group is defined over */
    @JsonProperty("dimensions") @ExcludeMissing fun _dimensions() = dimensions

    /**
     * The billable metric associated with this dimensional price group. All prices associated with
     * this dimensional price group will be computed using this billable metric.
     */
    @JsonProperty("billable_metric_id") @ExcludeMissing fun _billableMetricId() = billableMetricId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DimensionalPriceGroup = apply {
        if (!validated) {
            metadata().validate()
            id()
            name()
            externalDimensionalPriceGroupId()
            dimensions()
            billableMetricId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var externalDimensionalPriceGroupId: JsonField<String> = JsonMissing.of()
        private var dimensions: JsonField<List<String>> = JsonMissing.of()
        private var billableMetricId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dimensionalPriceGroup: DimensionalPriceGroup) = apply {
            this.metadata = dimensionalPriceGroup.metadata
            this.id = dimensionalPriceGroup.id
            this.name = dimensionalPriceGroup.name
            this.externalDimensionalPriceGroupId =
                dimensionalPriceGroup.externalDimensionalPriceGroupId
            this.dimensions = dimensionalPriceGroup.dimensions
            this.billableMetricId = dimensionalPriceGroup.billableMetricId
            additionalProperties(dimensionalPriceGroup.additionalProperties)
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The name of the dimensional price group */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the dimensional price group */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** An alias for the dimensional price group */
        fun externalDimensionalPriceGroupId(externalDimensionalPriceGroupId: String) =
            externalDimensionalPriceGroupId(JsonField.of(externalDimensionalPriceGroupId))

        /** An alias for the dimensional price group */
        @JsonProperty("external_dimensional_price_group_id")
        @ExcludeMissing
        fun externalDimensionalPriceGroupId(externalDimensionalPriceGroupId: JsonField<String>) =
            apply {
                this.externalDimensionalPriceGroupId = externalDimensionalPriceGroupId
            }

        /** The dimensions that this dimensional price group is defined over */
        fun dimensions(dimensions: List<String>) = dimensions(JsonField.of(dimensions))

        /** The dimensions that this dimensional price group is defined over */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun dimensions(dimensions: JsonField<List<String>>) = apply { this.dimensions = dimensions }

        /**
         * The billable metric associated with this dimensional price group. All prices associated
         * with this dimensional price group will be computed using this billable metric.
         */
        fun billableMetricId(billableMetricId: String) =
            billableMetricId(JsonField.of(billableMetricId))

        /**
         * The billable metric associated with this dimensional price group. All prices associated
         * with this dimensional price group will be computed using this billable metric.
         */
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            this.billableMetricId = billableMetricId
        }

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

        fun build(): DimensionalPriceGroup =
            DimensionalPriceGroup(
                metadata,
                id,
                name,
                externalDimensionalPriceGroupId,
                dimensions.map { it.toImmutable() },
                billableMetricId,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DimensionalPriceGroup && metadata == other.metadata && id == other.id && name == other.name && externalDimensionalPriceGroupId == other.externalDimensionalPriceGroupId && dimensions == other.dimensions && billableMetricId == other.billableMetricId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(metadata, id, name, externalDimensionalPriceGroupId, dimensions, billableMetricId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DimensionalPriceGroup{metadata=$metadata, id=$id, name=$name, externalDimensionalPriceGroupId=$externalDimensionalPriceGroupId, dimensions=$dimensions, billableMetricId=$billableMetricId, additionalProperties=$additionalProperties}"
}
