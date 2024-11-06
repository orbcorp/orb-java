// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.util.Objects
import java.util.Optional

class ItemUpdateParams
constructor(
    private val itemId: String,
    private val externalConnections: List<ExternalConnection>?,
    private val name: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun itemId(): String = itemId

    fun externalConnections(): Optional<List<ExternalConnection>> =
        Optional.ofNullable(externalConnections)

    fun name(): Optional<String> = Optional.ofNullable(name)

    @JvmSynthetic
    internal fun getBody(): ItemUpdateBody {
        return ItemUpdateBody(
            externalConnections,
            name,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> itemId
            else -> ""
        }
    }

    /**
     * A list of external connections to map an item to. Note that passing `null` will clear
     * existing mappings. Orb requires that you pass the full list of mappings; this list will
     * replace the existing item mappings.
     */
    @JsonDeserialize(builder = ItemUpdateBody.Builder::class)
    @NoAutoDetect
    class ItemUpdateBody
    internal constructor(
        private val externalConnections: List<ExternalConnection>?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("external_connections")
        fun externalConnections(): List<ExternalConnection>? = externalConnections

        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var externalConnections: List<ExternalConnection>? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(itemUpdateBody: ItemUpdateBody) = apply {
                this.externalConnections = itemUpdateBody.externalConnections
                this.name = itemUpdateBody.name
                additionalProperties(itemUpdateBody.additionalProperties)
            }

            @JsonProperty("external_connections")
            fun externalConnections(externalConnections: List<ExternalConnection>) = apply {
                this.externalConnections = externalConnections
            }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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

            fun build(): ItemUpdateBody =
                ItemUpdateBody(
                    externalConnections?.toImmutable(),
                    name,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ItemUpdateBody && this.externalConnections == other.externalConnections && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(externalConnections, name, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ItemUpdateBody{externalConnections=$externalConnections, name=$name, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ItemUpdateParams && this.itemId == other.itemId && this.externalConnections == other.externalConnections && this.name == other.name && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(itemId, externalConnections, name, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ItemUpdateParams{itemId=$itemId, externalConnections=$externalConnections, name=$name, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var itemId: String? = null
        private var externalConnections: MutableList<ExternalConnection> = mutableListOf()
        private var name: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(itemUpdateParams: ItemUpdateParams) = apply {
            this.itemId = itemUpdateParams.itemId
            this.externalConnections(itemUpdateParams.externalConnections ?: listOf())
            this.name = itemUpdateParams.name
            additionalHeaders(itemUpdateParams.additionalHeaders)
            additionalQueryParams(itemUpdateParams.additionalQueryParams)
            additionalBodyProperties(itemUpdateParams.additionalBodyProperties)
        }

        fun itemId(itemId: String) = apply { this.itemId = itemId }

        fun externalConnections(externalConnections: List<ExternalConnection>) = apply {
            this.externalConnections.clear()
            this.externalConnections.addAll(externalConnections)
        }

        fun addExternalConnection(externalConnection: ExternalConnection) = apply {
            this.externalConnections.add(externalConnection)
        }

        fun name(name: String) = apply { this.name = name }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): ItemUpdateParams =
            ItemUpdateParams(
                checkNotNull(itemId) { "`itemId` is required but was not set" },
                if (externalConnections.size == 0) null else externalConnections.toImmutable(),
                name,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = ExternalConnection.Builder::class)
    @NoAutoDetect
    class ExternalConnection
    private constructor(
        private val externalConnectionName: ExternalConnectionName?,
        private val externalEntityId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("external_connection_name")
        fun externalConnectionName(): ExternalConnectionName? = externalConnectionName

        @JsonProperty("external_entity_id") fun externalEntityId(): String? = externalEntityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var externalConnectionName: ExternalConnectionName? = null
            private var externalEntityId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalConnection: ExternalConnection) = apply {
                this.externalConnectionName = externalConnection.externalConnectionName
                this.externalEntityId = externalConnection.externalEntityId
                additionalProperties(externalConnection.additionalProperties)
            }

            @JsonProperty("external_connection_name")
            fun externalConnectionName(externalConnectionName: ExternalConnectionName) = apply {
                this.externalConnectionName = externalConnectionName
            }

            @JsonProperty("external_entity_id")
            fun externalEntityId(externalEntityId: String) = apply {
                this.externalEntityId = externalEntityId
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

            fun build(): ExternalConnection =
                ExternalConnection(
                    checkNotNull(externalConnectionName) {
                        "`externalConnectionName` is required but was not set"
                    },
                    checkNotNull(externalEntityId) {
                        "`externalEntityId` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        class ExternalConnectionName
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ExternalConnectionName && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val STRIPE = ExternalConnectionName(JsonField.of("stripe"))

                @JvmField val QUICKBOOKS = ExternalConnectionName(JsonField.of("quickbooks"))

                @JvmField val BILL_COM = ExternalConnectionName(JsonField.of("bill.com"))

                @JvmField val NETSUITE = ExternalConnectionName(JsonField.of("netsuite"))

                @JvmField val TAXJAR = ExternalConnectionName(JsonField.of("taxjar"))

                @JvmField val AVALARA = ExternalConnectionName(JsonField.of("avalara"))

                @JvmField val ANROK = ExternalConnectionName(JsonField.of("anrok"))

                @JvmStatic fun of(value: String) = ExternalConnectionName(JsonField.of(value))
            }

            enum class Known {
                STRIPE,
                QUICKBOOKS,
                BILL_COM,
                NETSUITE,
                TAXJAR,
                AVALARA,
                ANROK,
            }

            enum class Value {
                STRIPE,
                QUICKBOOKS,
                BILL_COM,
                NETSUITE,
                TAXJAR,
                AVALARA,
                ANROK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    STRIPE -> Value.STRIPE
                    QUICKBOOKS -> Value.QUICKBOOKS
                    BILL_COM -> Value.BILL_COM
                    NETSUITE -> Value.NETSUITE
                    TAXJAR -> Value.TAXJAR
                    AVALARA -> Value.AVALARA
                    ANROK -> Value.ANROK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    STRIPE -> Known.STRIPE
                    QUICKBOOKS -> Known.QUICKBOOKS
                    BILL_COM -> Known.BILL_COM
                    NETSUITE -> Known.NETSUITE
                    TAXJAR -> Known.TAXJAR
                    AVALARA -> Known.AVALARA
                    ANROK -> Known.ANROK
                    else -> throw OrbInvalidDataException("Unknown ExternalConnectionName: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalConnection && this.externalConnectionName == other.externalConnectionName && this.externalEntityId == other.externalEntityId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(externalConnectionName, externalEntityId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExternalConnection{externalConnectionName=$externalConnectionName, externalEntityId=$externalEntityId, additionalProperties=$additionalProperties}"
    }
}
