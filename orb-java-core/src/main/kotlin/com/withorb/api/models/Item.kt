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
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * The Item resource represents a sellable product or good. Items are associated with all line
 * items, billable metrics, and prices and are used for defining external sync behavior for invoices
 * and tax calculation purposes.
 */
@JsonDeserialize(builder = Item.Builder::class)
@NoAutoDetect
class Item
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val externalConnections: JsonField<List<ExternalConnection>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun name(): String = name.getRequired("name")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun externalConnections(): List<ExternalConnection> =
        externalConnections.getRequired("external_connections")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("external_connections")
    @ExcludeMissing
    fun _externalConnections() = externalConnections

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Item = apply {
        if (!validated) {
            id()
            name()
            createdAt()
            externalConnections().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Item &&
            this.id == other.id &&
            this.name == other.name &&
            this.createdAt == other.createdAt &&
            this.externalConnections == other.externalConnections &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    name,
                    createdAt,
                    externalConnections,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Item{id=$id, name=$name, createdAt=$createdAt, externalConnections=$externalConnections, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalConnections: JsonField<List<ExternalConnection>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(item: Item) = apply {
            this.id = item.id
            this.name = item.name
            this.createdAt = item.createdAt
            this.externalConnections = item.externalConnections
            additionalProperties(item.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun externalConnections(externalConnections: List<ExternalConnection>) =
            externalConnections(JsonField.of(externalConnections))

        @JsonProperty("external_connections")
        @ExcludeMissing
        fun externalConnections(externalConnections: JsonField<List<ExternalConnection>>) = apply {
            this.externalConnections = externalConnections
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

        fun build(): Item =
            Item(
                id,
                name,
                createdAt,
                externalConnections.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = ExternalConnection.Builder::class)
    @NoAutoDetect
    class ExternalConnection
    private constructor(
        private val externalConnectionName: JsonField<ExternalConnectionName>,
        private val externalEntityId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun externalConnectionName(): ExternalConnectionName =
            externalConnectionName.getRequired("external_connection_name")

        fun externalEntityId(): String = externalEntityId.getRequired("external_entity_id")

        @JsonProperty("external_connection_name")
        @ExcludeMissing
        fun _externalConnectionName() = externalConnectionName

        @JsonProperty("external_entity_id")
        @ExcludeMissing
        fun _externalEntityId() = externalEntityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ExternalConnection = apply {
            if (!validated) {
                externalConnectionName()
                externalEntityId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExternalConnection &&
                this.externalConnectionName == other.externalConnectionName &&
                this.externalEntityId == other.externalEntityId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        externalConnectionName,
                        externalEntityId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExternalConnection{externalConnectionName=$externalConnectionName, externalEntityId=$externalEntityId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var externalConnectionName: JsonField<ExternalConnectionName> = JsonMissing.of()
            private var externalEntityId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalConnection: ExternalConnection) = apply {
                this.externalConnectionName = externalConnection.externalConnectionName
                this.externalEntityId = externalConnection.externalEntityId
                additionalProperties(externalConnection.additionalProperties)
            }

            fun externalConnectionName(externalConnectionName: ExternalConnectionName) =
                externalConnectionName(JsonField.of(externalConnectionName))

            @JsonProperty("external_connection_name")
            @ExcludeMissing
            fun externalConnectionName(externalConnectionName: JsonField<ExternalConnectionName>) =
                apply {
                    this.externalConnectionName = externalConnectionName
                }

            fun externalEntityId(externalEntityId: String) =
                externalEntityId(JsonField.of(externalEntityId))

            @JsonProperty("external_entity_id")
            @ExcludeMissing
            fun externalEntityId(externalEntityId: JsonField<String>) = apply {
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
                    externalConnectionName,
                    externalEntityId,
                    additionalProperties.toUnmodifiable(),
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

                return other is ExternalConnectionName && this.value == other.value
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
    }
}
