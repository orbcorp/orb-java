// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * The Item resource represents a sellable product or good. Items are associated with all line
 * items, billable metrics, and prices and are used for defining external sync behavior for invoices
 * and tax calculation purposes.
 */
@NoAutoDetect
class Item
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("external_connections")
    @ExcludeMissing
    private val externalConnections: JsonField<List<ExternalConnection>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    private var validated: Boolean = false

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
            id = item.id
            name = item.name
            createdAt = item.createdAt
            externalConnections = item.externalConnections
            additionalProperties = item.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun externalConnections(externalConnections: List<ExternalConnection>) =
            externalConnections(JsonField.of(externalConnections))

        fun externalConnections(externalConnections: JsonField<List<ExternalConnection>>) = apply {
            this.externalConnections = externalConnections
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

        fun build(): Item =
            Item(
                id,
                name,
                createdAt,
                externalConnections.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ExternalConnection
    @JsonCreator
    private constructor(
        @JsonProperty("external_connection_name")
        @ExcludeMissing
        private val externalConnectionName: JsonField<ExternalConnectionName> = JsonMissing.of(),
        @JsonProperty("external_entity_id")
        @ExcludeMissing
        private val externalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

        private var validated: Boolean = false

        fun validate(): ExternalConnection = apply {
            if (!validated) {
                externalConnectionName()
                externalEntityId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var externalConnectionName: JsonField<ExternalConnectionName> = JsonMissing.of()
            private var externalEntityId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalConnection: ExternalConnection) = apply {
                externalConnectionName = externalConnection.externalConnectionName
                externalEntityId = externalConnection.externalEntityId
                additionalProperties = externalConnection.additionalProperties.toMutableMap()
            }

            fun externalConnectionName(externalConnectionName: ExternalConnectionName) =
                externalConnectionName(JsonField.of(externalConnectionName))

            fun externalConnectionName(externalConnectionName: JsonField<ExternalConnectionName>) =
                apply {
                    this.externalConnectionName = externalConnectionName
                }

            fun externalEntityId(externalEntityId: String) =
                externalEntityId(JsonField.of(externalEntityId))

            fun externalEntityId(externalEntityId: JsonField<String>) = apply {
                this.externalEntityId = externalEntityId
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

            fun build(): ExternalConnection =
                ExternalConnection(
                    externalConnectionName,
                    externalEntityId,
                    additionalProperties.toImmutable(),
                )
        }

        class ExternalConnectionName
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val STRIPE = of("stripe")

                @JvmField val QUICKBOOKS = of("quickbooks")

                @JvmField val BILL_COM = of("bill.com")

                @JvmField val NETSUITE = of("netsuite")

                @JvmField val TAXJAR = of("taxjar")

                @JvmField val AVALARA = of("avalara")

                @JvmField val ANROK = of("anrok")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ExternalConnectionName && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalConnection && externalConnectionName == other.externalConnectionName && externalEntityId == other.externalEntityId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(externalConnectionName, externalEntityId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalConnection{externalConnectionName=$externalConnectionName, externalEntityId=$externalEntityId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Item && id == other.id && name == other.name && createdAt == other.createdAt && externalConnections == other.externalConnections && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, createdAt, externalConnections, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Item{id=$id, name=$name, createdAt=$createdAt, externalConnections=$externalConnections, additionalProperties=$additionalProperties}"
}
