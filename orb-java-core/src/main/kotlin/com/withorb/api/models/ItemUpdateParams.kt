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
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** This endpoint can be used to update properties on the Item. */
class ItemUpdateParams
private constructor(
    private val itemId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun itemId(): String = itemId

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalConnections(): Optional<List<ExternalConnection>> = body.externalConnections()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Returns the raw JSON value of [externalConnections].
     *
     * Unlike [externalConnections], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalConnections(): JsonField<List<ExternalConnection>> = body._externalConnections()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ItemUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .itemId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ItemUpdateParams]. */
    class Builder internal constructor() {

        private var itemId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(itemUpdateParams: ItemUpdateParams) = apply {
            itemId = itemUpdateParams.itemId
            body = itemUpdateParams.body.toBuilder()
            additionalHeaders = itemUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = itemUpdateParams.additionalQueryParams.toBuilder()
        }

        fun itemId(itemId: String) = apply { this.itemId = itemId }

        fun externalConnections(externalConnections: List<ExternalConnection>?) = apply {
            body.externalConnections(externalConnections)
        }

        /**
         * Alias for calling [Builder.externalConnections] with `externalConnections.orElse(null)`.
         */
        fun externalConnections(externalConnections: Optional<List<ExternalConnection>>) =
            externalConnections(externalConnections.getOrNull())

        /**
         * Sets [Builder.externalConnections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalConnections] with a well-typed
         * `List<ExternalConnection>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun externalConnections(externalConnections: JsonField<List<ExternalConnection>>) = apply {
            body.externalConnections(externalConnections)
        }

        /**
         * Adds a single [ExternalConnection] to [externalConnections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExternalConnection(externalConnection: ExternalConnection) = apply {
            body.addExternalConnection(externalConnection)
        }

        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        /**
         * Returns an immutable instance of [ItemUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .itemId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ItemUpdateParams =
            ItemUpdateParams(
                checkRequired("itemId", itemId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> itemId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * A list of external connections to map an item to. Note that passing `null` will clear
     * existing mappings. Orb requires that you pass the full list of mappings; this list will
     * replace the existing item mappings.
     */
    class Body
    private constructor(
        private val externalConnections: JsonField<List<ExternalConnection>>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("external_connections")
            @ExcludeMissing
            externalConnections: JsonField<List<ExternalConnection>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(externalConnections, name, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalConnections(): Optional<List<ExternalConnection>> =
            Optional.ofNullable(externalConnections.getNullable("external_connections"))

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * Returns the raw JSON value of [externalConnections].
         *
         * Unlike [externalConnections], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_connections")
        @ExcludeMissing
        fun _externalConnections(): JsonField<List<ExternalConnection>> = externalConnections

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var externalConnections: JsonField<MutableList<ExternalConnection>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                externalConnections = body.externalConnections.map { it.toMutableList() }
                name = body.name
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun externalConnections(externalConnections: List<ExternalConnection>?) =
                externalConnections(JsonField.ofNullable(externalConnections))

            /**
             * Alias for calling [Builder.externalConnections] with
             * `externalConnections.orElse(null)`.
             */
            fun externalConnections(externalConnections: Optional<List<ExternalConnection>>) =
                externalConnections(externalConnections.getOrNull())

            /**
             * Sets [Builder.externalConnections] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalConnections] with a well-typed
             * `List<ExternalConnection>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun externalConnections(externalConnections: JsonField<List<ExternalConnection>>) =
                apply {
                    this.externalConnections = externalConnections.map { it.toMutableList() }
                }

            /**
             * Adds a single [ExternalConnection] to [externalConnections].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExternalConnection(externalConnection: ExternalConnection) = apply {
                externalConnections =
                    (externalConnections ?: JsonField.of(mutableListOf())).also {
                        checkKnown("externalConnections", it).add(externalConnection)
                    }
            }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (externalConnections ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            externalConnections().ifPresent { it.forEach { it.validate() } }
            name()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (externalConnections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && externalConnections == other.externalConnections && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(externalConnections, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{externalConnections=$externalConnections, name=$name, additionalProperties=$additionalProperties}"
    }

    class ExternalConnection
    private constructor(
        private val externalConnectionName: JsonField<ExternalConnectionName>,
        private val externalEntityId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("external_connection_name")
            @ExcludeMissing
            externalConnectionName: JsonField<ExternalConnectionName> = JsonMissing.of(),
            @JsonProperty("external_entity_id")
            @ExcludeMissing
            externalEntityId: JsonField<String> = JsonMissing.of(),
        ) : this(externalConnectionName, externalEntityId, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalConnectionName(): ExternalConnectionName =
            externalConnectionName.getRequired("external_connection_name")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalEntityId(): String = externalEntityId.getRequired("external_entity_id")

        /**
         * Returns the raw JSON value of [externalConnectionName].
         *
         * Unlike [externalConnectionName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_connection_name")
        @ExcludeMissing
        fun _externalConnectionName(): JsonField<ExternalConnectionName> = externalConnectionName

        /**
         * Returns the raw JSON value of [externalEntityId].
         *
         * Unlike [externalEntityId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_entity_id")
        @ExcludeMissing
        fun _externalEntityId(): JsonField<String> = externalEntityId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ExternalConnection].
             *
             * The following fields are required:
             * ```java
             * .externalConnectionName()
             * .externalEntityId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExternalConnection]. */
        class Builder internal constructor() {

            private var externalConnectionName: JsonField<ExternalConnectionName>? = null
            private var externalEntityId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalConnection: ExternalConnection) = apply {
                externalConnectionName = externalConnection.externalConnectionName
                externalEntityId = externalConnection.externalEntityId
                additionalProperties = externalConnection.additionalProperties.toMutableMap()
            }

            fun externalConnectionName(externalConnectionName: ExternalConnectionName) =
                externalConnectionName(JsonField.of(externalConnectionName))

            /**
             * Sets [Builder.externalConnectionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalConnectionName] with a well-typed
             * [ExternalConnectionName] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun externalConnectionName(externalConnectionName: JsonField<ExternalConnectionName>) =
                apply {
                    this.externalConnectionName = externalConnectionName
                }

            fun externalEntityId(externalEntityId: String) =
                externalEntityId(JsonField.of(externalEntityId))

            /**
             * Sets [Builder.externalEntityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalEntityId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [ExternalConnection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .externalConnectionName()
             * .externalEntityId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ExternalConnection =
                ExternalConnection(
                    checkRequired("externalConnectionName", externalConnectionName),
                    checkRequired("externalEntityId", externalEntityId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ExternalConnection = apply {
            if (validated) {
                return@apply
            }

            externalConnectionName().validate()
            externalEntityId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (externalConnectionName.asKnown().getOrNull()?.validity() ?: 0) +
                (if (externalEntityId.asKnown().isPresent) 1 else 0)

        class ExternalConnectionName
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
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

            /** An enum containing [ExternalConnectionName]'s known values. */
            enum class Known {
                STRIPE,
                QUICKBOOKS,
                BILL_COM,
                NETSUITE,
                TAXJAR,
                AVALARA,
                ANROK,
            }

            /**
             * An enum containing [ExternalConnectionName]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ExternalConnectionName] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STRIPE,
                QUICKBOOKS,
                BILL_COM,
                NETSUITE,
                TAXJAR,
                AVALARA,
                ANROK,
                /**
                 * An enum member indicating that [ExternalConnectionName] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OrbInvalidDataException if this class instance's value is a not a known
             *   member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OrbInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow { OrbInvalidDataException("Value is not a String") }

            private var validated: Boolean = false

            fun validate(): ExternalConnectionName = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OrbInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

        return /* spotless:off */ other is ItemUpdateParams && itemId == other.itemId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(itemId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ItemUpdateParams{itemId=$itemId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
