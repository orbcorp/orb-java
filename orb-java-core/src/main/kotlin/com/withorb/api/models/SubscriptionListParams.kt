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
import org.apache.hc.core5.http.ContentType
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
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.MultipartFormValue
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Enum
import com.withorb.api.core.ContentTypes
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*

class SubscriptionListParams constructor(
  private val createdAtGt: OffsetDateTime?,
  private val createdAtGte: OffsetDateTime?,
  private val createdAtLt: OffsetDateTime?,
  private val createdAtLte: OffsetDateTime?,
  private val cursor: String?,
  private val customerId: List<String>?,
  private val externalCustomerId: String?,
  private val limit: Long?,
  private val status: Status?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,

) {

    fun createdAtGt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGt)

    fun createdAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGte)

    fun createdAtLt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLt)

    fun createdAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLte)

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun customerId(): Optional<List<String>> = Optional.ofNullable(customerId)

    fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.createdAtGt?.let {
          params.put("created_at[gt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.createdAtGte?.let {
          params.put("created_at[gte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.createdAtLt?.let {
          params.put("created_at[lt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.createdAtLte?.let {
          params.put("created_at[lte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
      }
      this.cursor?.let {
          params.put("cursor", listOf(it.toString()))
      }
      this.customerId?.let {
          params.put("customer_id[]", it.map(Any::toString))
      }
      this.externalCustomerId?.let {
          params.put("external_customer_id", listOf(it.toString()))
      }
      this.limit?.let {
          params.put("limit", listOf(it.toString()))
      }
      this.status?.let {
          params.put("status", listOf(it.toString()))
      }
      params.putAll(additionalQueryParams)
      return params.toUnmodifiable()
    }

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is SubscriptionListParams &&
          this.createdAtGt == other.createdAtGt &&
          this.createdAtGte == other.createdAtGte &&
          this.createdAtLt == other.createdAtLt &&
          this.createdAtLte == other.createdAtLte &&
          this.cursor == other.cursor &&
          this.customerId == other.customerId &&
          this.externalCustomerId == other.externalCustomerId &&
          this.limit == other.limit &&
          this.status == other.status &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
      return Objects.hash(
          createdAtGt,
          createdAtGte,
          createdAtLt,
          createdAtLte,
          cursor,
          customerId,
          externalCustomerId,
          limit,
          status,
          additionalQueryParams,
          additionalHeaders,
      )
    }

    override fun toString() = "SubscriptionListParams{createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, cursor=$cursor, customerId=$customerId, externalCustomerId=$externalCustomerId, limit=$limit, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var createdAtGt: OffsetDateTime? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLt: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var cursor: String? = null
        private var customerId: MutableList<String> = mutableListOf()
        private var externalCustomerId: String? = null
        private var limit: Long? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionListParams: SubscriptionListParams) = apply {
            this.createdAtGt = subscriptionListParams.createdAtGt
            this.createdAtGte = subscriptionListParams.createdAtGte
            this.createdAtLt = subscriptionListParams.createdAtLt
            this.createdAtLte = subscriptionListParams.createdAtLte
            this.cursor = subscriptionListParams.cursor
            this.customerId(subscriptionListParams.customerId ?: listOf())
            this.externalCustomerId = subscriptionListParams.externalCustomerId
            this.limit = subscriptionListParams.limit
            this.status = subscriptionListParams.status
            additionalQueryParams(subscriptionListParams.additionalQueryParams)
            additionalHeaders(subscriptionListParams.additionalHeaders)
        }

        fun createdAtGt(createdAtGt: OffsetDateTime) = apply {
            this.createdAtGt = createdAtGt
        }

        fun createdAtGte(createdAtGte: OffsetDateTime) = apply {
            this.createdAtGte = createdAtGte
        }

        fun createdAtLt(createdAtLt: OffsetDateTime) = apply {
            this.createdAtLt = createdAtLt
        }

        fun createdAtLte(createdAtLte: OffsetDateTime) = apply {
            this.createdAtLte = createdAtLte
        }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned
         * from the initial request.
         */
        fun cursor(cursor: String) = apply {
            this.cursor = cursor
        }

        fun customerId(customerId: List<String>) = apply {
            this.customerId.clear()
            this.customerId.addAll(customerId)
        }

        fun addCustomerId(customerId: String) = apply {
            this.customerId.add(customerId)
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply {
            this.limit = limit
        }

        fun status(status: Status) = apply {
            this.status = status
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun build(): SubscriptionListParams = SubscriptionListParams(
            createdAtGt,
            createdAtGte,
            createdAtLt,
            createdAtLte,
            cursor,
            if(customerId.size == 0) null else customerId.toUnmodifiable(),
            externalCustomerId,
            limit,
            status,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
        )
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACTIVE = Status(JsonField.of("active"))

            @JvmField val ENDED = Status(JsonField.of("ended"))

            @JvmField val UPCOMING = Status(JsonField.of("upcoming"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            ENDED,
            UPCOMING,
        }

        enum class Value {
            ACTIVE,
            ENDED,
            UPCOMING,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACTIVE -> Value.ACTIVE
            ENDED -> Value.ENDED
            UPCOMING -> Value.UPCOMING
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACTIVE -> Known.ACTIVE
            ENDED -> Known.ENDED
            UPCOMING -> Known.UPCOMING
            else -> throw OrbInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
