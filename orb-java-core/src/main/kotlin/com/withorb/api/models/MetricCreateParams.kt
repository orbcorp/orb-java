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

class MetricCreateParams constructor(
  private val description: String?,
  private val itemId: String,
  private val name: String,
  private val sql: String,
  private val metadata: Metadata?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun itemId(): String = itemId

    fun name(): String = name

    fun sql(): String = sql

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    @JvmSynthetic
    internal fun getBody(): MetricCreateBody {
      return MetricCreateBody(
          description,
          itemId,
          name,
          sql,
          metadata,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = MetricCreateBody.Builder::class)
    @NoAutoDetect
    class MetricCreateBody internal constructor(
      private val description: String?,
      private val itemId: String?,
      private val name: String?,
      private val sql: String?,
      private val metadata: Metadata?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /** A description of the metric. */
        @JsonProperty("description")
        fun description(): String? = description

        /** The id of the item */
        @JsonProperty("item_id")
        fun itemId(): String? = itemId

        /** The name of the metric. */
        @JsonProperty("name")
        fun name(): String? = name

        /** A sql string defining the metric. */
        @JsonProperty("sql")
        fun sql(): String? = sql

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed
         * by setting the value to `null`, and the entire metadata mapping can be cleared
         * by setting `metadata` to `null`.
         */
        @JsonProperty("metadata")
        fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is MetricCreateBody &&
              this.description == other.description &&
              this.itemId == other.itemId &&
              this.name == other.name &&
              this.sql == other.sql &&
              this.metadata == other.metadata &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                description,
                itemId,
                name,
                sql,
                metadata,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "MetricCreateBody{description=$description, itemId=$itemId, name=$name, sql=$sql, metadata=$metadata, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var itemId: String? = null
            private var name: String? = null
            private var sql: String? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metricCreateBody: MetricCreateBody) = apply {
                this.description = metricCreateBody.description
                this.itemId = metricCreateBody.itemId
                this.name = metricCreateBody.name
                this.sql = metricCreateBody.sql
                this.metadata = metricCreateBody.metadata
                additionalProperties(metricCreateBody.additionalProperties)
            }

            /** A description of the metric. */
            @JsonProperty("description")
            fun description(description: String) = apply {
                this.description = description
            }

            /** The id of the item */
            @JsonProperty("item_id")
            fun itemId(itemId: String) = apply {
                this.itemId = itemId
            }

            /** The name of the metric. */
            @JsonProperty("name")
            fun name(name: String) = apply {
                this.name = name
            }

            /** A sql string defining the metric. */
            @JsonProperty("sql")
            fun sql(sql: String) = apply {
                this.sql = sql
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed
             * by setting the value to `null`, and the entire metadata mapping can be cleared
             * by setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply {
                this.metadata = metadata
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

            fun build(): MetricCreateBody = MetricCreateBody(
                description,
                checkNotNull(itemId) {
                    "`itemId` is required but was not set"
                },
                checkNotNull(name) {
                    "`name` is required but was not set"
                },
                checkNotNull(sql) {
                    "`sql` is required but was not set"
                },
                metadata,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is MetricCreateParams &&
          this.description == other.description &&
          this.itemId == other.itemId &&
          this.name == other.name &&
          this.sql == other.sql &&
          this.metadata == other.metadata &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          description,
          itemId,
          name,
          sql,
          metadata,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "MetricCreateParams{description=$description, itemId=$itemId, name=$name, sql=$sql, metadata=$metadata, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var description: String? = null
        private var itemId: String? = null
        private var name: String? = null
        private var sql: String? = null
        private var metadata: Metadata? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(metricCreateParams: MetricCreateParams) = apply {
            this.description = metricCreateParams.description
            this.itemId = metricCreateParams.itemId
            this.name = metricCreateParams.name
            this.sql = metricCreateParams.sql
            this.metadata = metricCreateParams.metadata
            additionalQueryParams(metricCreateParams.additionalQueryParams)
            additionalHeaders(metricCreateParams.additionalHeaders)
            additionalBodyProperties(metricCreateParams.additionalBodyProperties)
        }

        /** A description of the metric. */
        fun description(description: String) = apply {
            this.description = description
        }

        /** The id of the item */
        fun itemId(itemId: String) = apply {
            this.itemId = itemId
        }

        /** The name of the metric. */
        fun name(name: String) = apply {
            this.name = name
        }

        /** A sql string defining the metric. */
        fun sql(sql: String) = apply {
            this.sql = sql
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed
         * by setting the value to `null`, and the entire metadata mapping can be cleared
         * by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = apply {
            this.metadata = metadata
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): MetricCreateParams = MetricCreateParams(
            description,
            checkNotNull(itemId) {
                "`itemId` is required but was not set"
            },
            checkNotNull(name) {
                "`name` is required but was not set"
            },
            checkNotNull(sql) {
                "`sql` is required but was not set"
            },
            metadata,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed
     * by setting the value to `null`, and the entire metadata mapping can be cleared
     * by setting `metadata` to `null`.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata private constructor(private val additionalProperties: Map<String, JsonValue>, ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Metadata &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }
}
