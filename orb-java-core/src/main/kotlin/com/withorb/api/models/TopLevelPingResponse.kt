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
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

@NoAutoDetect
class TopLevelPingResponse
@JsonCreator
private constructor(
    @JsonProperty("response")
    @ExcludeMissing
    private val response: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun response(): String = response.getRequired("response")

    /**
     * Returns the raw JSON value of [response].
     *
     * Unlike [response], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response") @ExcludeMissing fun _response(): JsonField<String> = response

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TopLevelPingResponse = apply {
        if (validated) {
            return@apply
        }

        response()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TopLevelPingResponse].
         *
         * The following fields are required:
         * ```java
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TopLevelPingResponse]. */
    class Builder internal constructor() {

        private var response: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(topLevelPingResponse: TopLevelPingResponse) = apply {
            response = topLevelPingResponse.response
            additionalProperties = topLevelPingResponse.additionalProperties.toMutableMap()
        }

        fun response(response: String) = response(JsonField.of(response))

        /**
         * Sets [Builder.response] to an arbitrary JSON value.
         *
         * You should usually call [Builder.response] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun response(response: JsonField<String>) = apply { this.response = response }

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

        /**
         * Returns an immutable instance of [TopLevelPingResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TopLevelPingResponse =
            TopLevelPingResponse(
                checkRequired("response", response),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TopLevelPingResponse && response == other.response && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(response, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TopLevelPingResponse{response=$response, additionalProperties=$additionalProperties}"
}
