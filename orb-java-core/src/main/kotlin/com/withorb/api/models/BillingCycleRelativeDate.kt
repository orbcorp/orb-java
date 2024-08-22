// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonField
import com.withorb.api.core.Enum
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException

class BillingCycleRelativeDate @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue
    fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is BillingCycleRelativeDate &&
          this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val START_OF_TERM = BillingCycleRelativeDate(JsonField.of("start_of_term"))

        @JvmField val END_OF_TERM = BillingCycleRelativeDate(JsonField.of("end_of_term"))

        @JvmStatic fun of(value: String) = BillingCycleRelativeDate(JsonField.of(value))
    }

    enum class Known {
        START_OF_TERM,
        END_OF_TERM,
    }

    enum class Value {
        START_OF_TERM,
        END_OF_TERM,
        _UNKNOWN,
    }

    fun value(): Value = when (this) {
        START_OF_TERM -> Value.START_OF_TERM
        END_OF_TERM -> Value.END_OF_TERM
        else -> Value._UNKNOWN
    }

    fun known(): Known = when (this) {
        START_OF_TERM -> Known.START_OF_TERM
        END_OF_TERM -> Known.END_OF_TERM
        else -> throw OrbInvalidDataException("Unknown BillingCycleRelativeDate: $value")
    }

    fun asString(): String = _value().asStringOrThrow()
}
