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

@JsonDeserialize(builder = PaginationMetadata.Builder::class)
@NoAutoDetect
class PaginationMetadata
private constructor(
    private val hasMore: JsonField<Boolean>,
    private val nextCursor: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun hasMore(): Boolean = hasMore.getRequired("has_more")

    fun nextCursor(): Optional<String> = Optional.ofNullable(nextCursor.getNullable("next_cursor"))

    @JsonProperty("has_more") @ExcludeMissing fun _hasMore() = hasMore

    @JsonProperty("next_cursor") @ExcludeMissing fun _nextCursor() = nextCursor

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PaginationMetadata = apply {
        if (!validated) {
            hasMore()
            nextCursor()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var hasMore: JsonField<Boolean> = JsonMissing.of()
        private var nextCursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paginationMetadata: PaginationMetadata) = apply {
            this.hasMore = paginationMetadata.hasMore
            this.nextCursor = paginationMetadata.nextCursor
            additionalProperties(paginationMetadata.additionalProperties)
        }

        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        @JsonProperty("has_more")
        @ExcludeMissing
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

        @JsonProperty("next_cursor")
        @ExcludeMissing
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

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

        fun build(): PaginationMetadata =
            PaginationMetadata(
                hasMore,
                nextCursor,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaginationMetadata && hasMore == other.hasMore && nextCursor == other.nextCursor && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(hasMore, nextCursor, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaginationMetadata{hasMore=$hasMore, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"
}
