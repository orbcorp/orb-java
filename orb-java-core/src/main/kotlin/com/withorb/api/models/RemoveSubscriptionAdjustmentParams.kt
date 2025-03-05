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
import java.util.Objects

@NoAutoDetect
class RemoveSubscriptionAdjustmentParams
@JsonCreator
private constructor(
    @JsonProperty("adjustment_id")
    @ExcludeMissing
    private val adjustmentId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The id of the adjustment to remove on the subscription. */
    fun adjustmentId(): String = adjustmentId.getRequired("adjustment_id")

    /** The id of the adjustment to remove on the subscription. */
    @JsonProperty("adjustment_id")
    @ExcludeMissing
    fun _adjustmentId(): JsonField<String> = adjustmentId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RemoveSubscriptionAdjustmentParams = apply {
        if (validated) {
            return@apply
        }

        adjustmentId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RemoveSubscriptionAdjustmentParams].
         *
         * The following fields are required:
         * ```java
         * .adjustmentId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RemoveSubscriptionAdjustmentParams]. */
    class Builder internal constructor() {

        private var adjustmentId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(removeSubscriptionAdjustmentParams: RemoveSubscriptionAdjustmentParams) =
            apply {
                adjustmentId = removeSubscriptionAdjustmentParams.adjustmentId
                additionalProperties =
                    removeSubscriptionAdjustmentParams.additionalProperties.toMutableMap()
            }

        /** The id of the adjustment to remove on the subscription. */
        fun adjustmentId(adjustmentId: String) = adjustmentId(JsonField.of(adjustmentId))

        /** The id of the adjustment to remove on the subscription. */
        fun adjustmentId(adjustmentId: JsonField<String>) = apply {
            this.adjustmentId = adjustmentId
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

        fun build(): RemoveSubscriptionAdjustmentParams =
            RemoveSubscriptionAdjustmentParams(
                checkRequired("adjustmentId", adjustmentId),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RemoveSubscriptionAdjustmentParams && adjustmentId == other.adjustmentId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(adjustmentId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RemoveSubscriptionAdjustmentParams{adjustmentId=$adjustmentId, additionalProperties=$additionalProperties}"
}
