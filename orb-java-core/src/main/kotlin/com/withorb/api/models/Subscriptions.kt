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
import com.withorb.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = Subscriptions.Builder::class)
@NoAutoDetect
class Subscriptions
private constructor(
    private val data: JsonField<List<Subscription>>,
    private val paginationMetadata: JsonField<PaginationMetadata>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): List<Subscription> = data.getRequired("data")

    fun paginationMetadata(): PaginationMetadata =
        paginationMetadata.getRequired("pagination_metadata")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("pagination_metadata")
    @ExcludeMissing
    fun _paginationMetadata() = paginationMetadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Subscriptions = apply {
        if (!validated) {
            data().forEach { it.validate() }
            paginationMetadata().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Subscriptions &&
            this.data == other.data &&
            this.paginationMetadata == other.paginationMetadata &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    data,
                    paginationMetadata,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Subscriptions{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Subscription>> = JsonMissing.of()
        private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptions: Subscriptions) = apply {
            this.data = subscriptions.data
            this.paginationMetadata = subscriptions.paginationMetadata
            additionalProperties(subscriptions.additionalProperties)
        }

        fun data(data: List<Subscription>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Subscription>>) = apply { this.data = data }

        fun paginationMetadata(paginationMetadata: PaginationMetadata) =
            paginationMetadata(JsonField.of(paginationMetadata))

        @JsonProperty("pagination_metadata")
        @ExcludeMissing
        fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply {
            this.paginationMetadata = paginationMetadata
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

        fun build(): Subscriptions =
            Subscriptions(
                data.map { it.toUnmodifiable() },
                paginationMetadata,
                additionalProperties.toUnmodifiable(),
            )
    }
}
