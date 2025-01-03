// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomerCreditLedgerCreateEntryByExternalIdParams
constructor(
    private val externalCustomerId: String,
    private val body: CustomerCreditLedgerCreateEntryByExternalIdBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun externalCustomerId(): String = externalCustomerId

    fun addIncrementCreditLedgerEntryRequestParams():
        Optional<AddIncrementCreditLedgerEntryRequestParams> =
        body.addIncrementCreditLedgerEntryRequestParams()

    fun addDecrementCreditLedgerEntryRequestParams():
        Optional<AddDecrementCreditLedgerEntryRequestParams> =
        body.addDecrementCreditLedgerEntryRequestParams()

    fun addExpirationChangeCreditLedgerEntryRequestParams():
        Optional<AddExpirationChangeCreditLedgerEntryRequestParams> =
        body.addExpirationChangeCreditLedgerEntryRequestParams()

    fun addVoidCreditLedgerEntryRequestParams(): Optional<AddVoidCreditLedgerEntryRequestParams> =
        body.addVoidCreditLedgerEntryRequestParams()

    fun addAmendmentCreditLedgerEntryRequestParams():
        Optional<AddAmendmentCreditLedgerEntryRequestParams> =
        body.addAmendmentCreditLedgerEntryRequestParams()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): CustomerCreditLedgerCreateEntryByExternalIdBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalCustomerId
            else -> ""
        }
    }

    @JsonDeserialize(using = CustomerCreditLedgerCreateEntryByExternalIdBody.Deserializer::class)
    @JsonSerialize(using = CustomerCreditLedgerCreateEntryByExternalIdBody.Serializer::class)
    class CustomerCreditLedgerCreateEntryByExternalIdBody
    internal constructor(
        private val addIncrementCreditLedgerEntryRequestParams:
            AddIncrementCreditLedgerEntryRequestParams? =
            null,
        private val addDecrementCreditLedgerEntryRequestParams:
            AddDecrementCreditLedgerEntryRequestParams? =
            null,
        private val addExpirationChangeCreditLedgerEntryRequestParams:
            AddExpirationChangeCreditLedgerEntryRequestParams? =
            null,
        private val addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams? =
            null,
        private val addAmendmentCreditLedgerEntryRequestParams:
            AddAmendmentCreditLedgerEntryRequestParams? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun addIncrementCreditLedgerEntryRequestParams():
            Optional<AddIncrementCreditLedgerEntryRequestParams> =
            Optional.ofNullable(addIncrementCreditLedgerEntryRequestParams)

        fun addDecrementCreditLedgerEntryRequestParams():
            Optional<AddDecrementCreditLedgerEntryRequestParams> =
            Optional.ofNullable(addDecrementCreditLedgerEntryRequestParams)

        fun addExpirationChangeCreditLedgerEntryRequestParams():
            Optional<AddExpirationChangeCreditLedgerEntryRequestParams> =
            Optional.ofNullable(addExpirationChangeCreditLedgerEntryRequestParams)

        fun addVoidCreditLedgerEntryRequestParams():
            Optional<AddVoidCreditLedgerEntryRequestParams> =
            Optional.ofNullable(addVoidCreditLedgerEntryRequestParams)

        fun addAmendmentCreditLedgerEntryRequestParams():
            Optional<AddAmendmentCreditLedgerEntryRequestParams> =
            Optional.ofNullable(addAmendmentCreditLedgerEntryRequestParams)

        fun isAddIncrementCreditLedgerEntryRequestParams(): Boolean =
            addIncrementCreditLedgerEntryRequestParams != null

        fun isAddDecrementCreditLedgerEntryRequestParams(): Boolean =
            addDecrementCreditLedgerEntryRequestParams != null

        fun isAddExpirationChangeCreditLedgerEntryRequestParams(): Boolean =
            addExpirationChangeCreditLedgerEntryRequestParams != null

        fun isAddVoidCreditLedgerEntryRequestParams(): Boolean =
            addVoidCreditLedgerEntryRequestParams != null

        fun isAddAmendmentCreditLedgerEntryRequestParams(): Boolean =
            addAmendmentCreditLedgerEntryRequestParams != null

        fun asAddIncrementCreditLedgerEntryRequestParams():
            AddIncrementCreditLedgerEntryRequestParams =
            addIncrementCreditLedgerEntryRequestParams.getOrThrow(
                "addIncrementCreditLedgerEntryRequestParams"
            )

        fun asAddDecrementCreditLedgerEntryRequestParams():
            AddDecrementCreditLedgerEntryRequestParams =
            addDecrementCreditLedgerEntryRequestParams.getOrThrow(
                "addDecrementCreditLedgerEntryRequestParams"
            )

        fun asAddExpirationChangeCreditLedgerEntryRequestParams():
            AddExpirationChangeCreditLedgerEntryRequestParams =
            addExpirationChangeCreditLedgerEntryRequestParams.getOrThrow(
                "addExpirationChangeCreditLedgerEntryRequestParams"
            )

        fun asAddVoidCreditLedgerEntryRequestParams(): AddVoidCreditLedgerEntryRequestParams =
            addVoidCreditLedgerEntryRequestParams.getOrThrow(
                "addVoidCreditLedgerEntryRequestParams"
            )

        fun asAddAmendmentCreditLedgerEntryRequestParams():
            AddAmendmentCreditLedgerEntryRequestParams =
            addAmendmentCreditLedgerEntryRequestParams.getOrThrow(
                "addAmendmentCreditLedgerEntryRequestParams"
            )

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                addIncrementCreditLedgerEntryRequestParams != null ->
                    visitor.visitAddIncrementCreditLedgerEntryRequestParams(
                        addIncrementCreditLedgerEntryRequestParams
                    )
                addDecrementCreditLedgerEntryRequestParams != null ->
                    visitor.visitAddDecrementCreditLedgerEntryRequestParams(
                        addDecrementCreditLedgerEntryRequestParams
                    )
                addExpirationChangeCreditLedgerEntryRequestParams != null ->
                    visitor.visitAddExpirationChangeCreditLedgerEntryRequestParams(
                        addExpirationChangeCreditLedgerEntryRequestParams
                    )
                addVoidCreditLedgerEntryRequestParams != null ->
                    visitor.visitAddVoidCreditLedgerEntryRequestParams(
                        addVoidCreditLedgerEntryRequestParams
                    )
                addAmendmentCreditLedgerEntryRequestParams != null ->
                    visitor.visitAddAmendmentCreditLedgerEntryRequestParams(
                        addAmendmentCreditLedgerEntryRequestParams
                    )
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerCreditLedgerCreateEntryByExternalIdBody && addIncrementCreditLedgerEntryRequestParams == other.addIncrementCreditLedgerEntryRequestParams && addDecrementCreditLedgerEntryRequestParams == other.addDecrementCreditLedgerEntryRequestParams && addExpirationChangeCreditLedgerEntryRequestParams == other.addExpirationChangeCreditLedgerEntryRequestParams && addVoidCreditLedgerEntryRequestParams == other.addVoidCreditLedgerEntryRequestParams && addAmendmentCreditLedgerEntryRequestParams == other.addAmendmentCreditLedgerEntryRequestParams /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(addIncrementCreditLedgerEntryRequestParams, addDecrementCreditLedgerEntryRequestParams, addExpirationChangeCreditLedgerEntryRequestParams, addVoidCreditLedgerEntryRequestParams, addAmendmentCreditLedgerEntryRequestParams) /* spotless:on */

        override fun toString(): String =
            when {
                addIncrementCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryByExternalIdBody{addIncrementCreditLedgerEntryRequestParams=$addIncrementCreditLedgerEntryRequestParams}"
                addDecrementCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryByExternalIdBody{addDecrementCreditLedgerEntryRequestParams=$addDecrementCreditLedgerEntryRequestParams}"
                addExpirationChangeCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryByExternalIdBody{addExpirationChangeCreditLedgerEntryRequestParams=$addExpirationChangeCreditLedgerEntryRequestParams}"
                addVoidCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryByExternalIdBody{addVoidCreditLedgerEntryRequestParams=$addVoidCreditLedgerEntryRequestParams}"
                addAmendmentCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryByExternalIdBody{addAmendmentCreditLedgerEntryRequestParams=$addAmendmentCreditLedgerEntryRequestParams}"
                _json != null -> "CustomerCreditLedgerCreateEntryByExternalIdBody{_unknown=$_json}"
                else ->
                    throw IllegalStateException(
                        "Invalid CustomerCreditLedgerCreateEntryByExternalIdBody"
                    )
            }

        companion object {

            @JvmStatic
            fun ofAddIncrementCreditLedgerEntryRequestParams(
                addIncrementCreditLedgerEntryRequestParams:
                    AddIncrementCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryByExternalIdBody(
                    addIncrementCreditLedgerEntryRequestParams =
                        addIncrementCreditLedgerEntryRequestParams
                )

            @JvmStatic
            fun ofAddDecrementCreditLedgerEntryRequestParams(
                addDecrementCreditLedgerEntryRequestParams:
                    AddDecrementCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryByExternalIdBody(
                    addDecrementCreditLedgerEntryRequestParams =
                        addDecrementCreditLedgerEntryRequestParams
                )

            @JvmStatic
            fun ofAddExpirationChangeCreditLedgerEntryRequestParams(
                addExpirationChangeCreditLedgerEntryRequestParams:
                    AddExpirationChangeCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryByExternalIdBody(
                    addExpirationChangeCreditLedgerEntryRequestParams =
                        addExpirationChangeCreditLedgerEntryRequestParams
                )

            @JvmStatic
            fun ofAddVoidCreditLedgerEntryRequestParams(
                addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryByExternalIdBody(
                    addVoidCreditLedgerEntryRequestParams = addVoidCreditLedgerEntryRequestParams
                )

            @JvmStatic
            fun ofAddAmendmentCreditLedgerEntryRequestParams(
                addAmendmentCreditLedgerEntryRequestParams:
                    AddAmendmentCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryByExternalIdBody(
                    addAmendmentCreditLedgerEntryRequestParams =
                        addAmendmentCreditLedgerEntryRequestParams
                )
        }

        interface Visitor<out T> {

            fun visitAddIncrementCreditLedgerEntryRequestParams(
                addIncrementCreditLedgerEntryRequestParams:
                    AddIncrementCreditLedgerEntryRequestParams
            ): T

            fun visitAddDecrementCreditLedgerEntryRequestParams(
                addDecrementCreditLedgerEntryRequestParams:
                    AddDecrementCreditLedgerEntryRequestParams
            ): T

            fun visitAddExpirationChangeCreditLedgerEntryRequestParams(
                addExpirationChangeCreditLedgerEntryRequestParams:
                    AddExpirationChangeCreditLedgerEntryRequestParams
            ): T

            fun visitAddVoidCreditLedgerEntryRequestParams(
                addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams
            ): T

            fun visitAddAmendmentCreditLedgerEntryRequestParams(
                addAmendmentCreditLedgerEntryRequestParams:
                    AddAmendmentCreditLedgerEntryRequestParams
            ): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException(
                    "Unknown CustomerCreditLedgerCreateEntryByExternalIdBody: $json"
                )
            }
        }

        class Deserializer :
            BaseDeserializer<CustomerCreditLedgerCreateEntryByExternalIdBody>(
                CustomerCreditLedgerCreateEntryByExternalIdBody::class
            ) {

            override fun ObjectCodec.deserialize(
                node: JsonNode
            ): CustomerCreditLedgerCreateEntryByExternalIdBody {
                val json = JsonValue.fromJsonNode(node)
                val entryType =
                    json.asObject().getOrNull()?.get("entry_type")?.asString()?.getOrNull()

                when (entryType) {
                    "increment" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AddIncrementCreditLedgerEntryRequestParams>()
                            )
                            ?.let {
                                return CustomerCreditLedgerCreateEntryByExternalIdBody(
                                    addIncrementCreditLedgerEntryRequestParams = it,
                                    _json = json
                                )
                            }
                    }
                    "decrement" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AddDecrementCreditLedgerEntryRequestParams>()
                            )
                            ?.let {
                                return CustomerCreditLedgerCreateEntryByExternalIdBody(
                                    addDecrementCreditLedgerEntryRequestParams = it,
                                    _json = json
                                )
                            }
                    }
                    "expiration_change" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AddExpirationChangeCreditLedgerEntryRequestParams>()
                            )
                            ?.let {
                                return CustomerCreditLedgerCreateEntryByExternalIdBody(
                                    addExpirationChangeCreditLedgerEntryRequestParams = it,
                                    _json = json
                                )
                            }
                    }
                    "void" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AddVoidCreditLedgerEntryRequestParams>()
                            )
                            ?.let {
                                return CustomerCreditLedgerCreateEntryByExternalIdBody(
                                    addVoidCreditLedgerEntryRequestParams = it,
                                    _json = json
                                )
                            }
                    }
                    "amendment" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AddAmendmentCreditLedgerEntryRequestParams>()
                            )
                            ?.let {
                                return CustomerCreditLedgerCreateEntryByExternalIdBody(
                                    addAmendmentCreditLedgerEntryRequestParams = it,
                                    _json = json
                                )
                            }
                    }
                }

                return CustomerCreditLedgerCreateEntryByExternalIdBody(_json = json)
            }
        }

        class Serializer :
            BaseSerializer<CustomerCreditLedgerCreateEntryByExternalIdBody>(
                CustomerCreditLedgerCreateEntryByExternalIdBody::class
            ) {

            override fun serialize(
                value: CustomerCreditLedgerCreateEntryByExternalIdBody,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.addIncrementCreditLedgerEntryRequestParams != null ->
                        generator.writeObject(value.addIncrementCreditLedgerEntryRequestParams)
                    value.addDecrementCreditLedgerEntryRequestParams != null ->
                        generator.writeObject(value.addDecrementCreditLedgerEntryRequestParams)
                    value.addExpirationChangeCreditLedgerEntryRequestParams != null ->
                        generator.writeObject(
                            value.addExpirationChangeCreditLedgerEntryRequestParams
                        )
                    value.addVoidCreditLedgerEntryRequestParams != null ->
                        generator.writeObject(value.addVoidCreditLedgerEntryRequestParams)
                    value.addAmendmentCreditLedgerEntryRequestParams != null ->
                        generator.writeObject(value.addAmendmentCreditLedgerEntryRequestParams)
                    value._json != null -> generator.writeObject(value._json)
                    else ->
                        throw IllegalStateException(
                            "Invalid CustomerCreditLedgerCreateEntryByExternalIdBody"
                        )
                }
            }
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalCustomerId: String? = null
        private var body: CustomerCreditLedgerCreateEntryByExternalIdBody? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            customerCreditLedgerCreateEntryByExternalIdParams:
                CustomerCreditLedgerCreateEntryByExternalIdParams
        ) = apply {
            externalCustomerId =
                customerCreditLedgerCreateEntryByExternalIdParams.externalCustomerId
            body = customerCreditLedgerCreateEntryByExternalIdParams.body
            additionalHeaders =
                customerCreditLedgerCreateEntryByExternalIdParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerCreditLedgerCreateEntryByExternalIdParams.additionalQueryParams.toBuilder()
        }

        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        fun forAddIncrementCreditLedgerEntryRequestParams(
            addIncrementCreditLedgerEntryRequestParams: AddIncrementCreditLedgerEntryRequestParams
        ) = apply {
            body =
                CustomerCreditLedgerCreateEntryByExternalIdBody
                    .ofAddIncrementCreditLedgerEntryRequestParams(
                        addIncrementCreditLedgerEntryRequestParams
                    )
        }

        fun forAddDecrementCreditLedgerEntryRequestParams(
            addDecrementCreditLedgerEntryRequestParams: AddDecrementCreditLedgerEntryRequestParams
        ) = apply {
            body =
                CustomerCreditLedgerCreateEntryByExternalIdBody
                    .ofAddDecrementCreditLedgerEntryRequestParams(
                        addDecrementCreditLedgerEntryRequestParams
                    )
        }

        fun forAddExpirationChangeCreditLedgerEntryRequestParams(
            addExpirationChangeCreditLedgerEntryRequestParams:
                AddExpirationChangeCreditLedgerEntryRequestParams
        ) = apply {
            body =
                CustomerCreditLedgerCreateEntryByExternalIdBody
                    .ofAddExpirationChangeCreditLedgerEntryRequestParams(
                        addExpirationChangeCreditLedgerEntryRequestParams
                    )
        }

        fun forAddVoidCreditLedgerEntryRequestParams(
            addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams
        ) = apply {
            body =
                CustomerCreditLedgerCreateEntryByExternalIdBody
                    .ofAddVoidCreditLedgerEntryRequestParams(addVoidCreditLedgerEntryRequestParams)
        }

        fun forAddAmendmentCreditLedgerEntryRequestParams(
            addAmendmentCreditLedgerEntryRequestParams: AddAmendmentCreditLedgerEntryRequestParams
        ) = apply {
            body =
                CustomerCreditLedgerCreateEntryByExternalIdBody
                    .ofAddAmendmentCreditLedgerEntryRequestParams(
                        addAmendmentCreditLedgerEntryRequestParams
                    )
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

        fun build(): CustomerCreditLedgerCreateEntryByExternalIdParams =
            CustomerCreditLedgerCreateEntryByExternalIdParams(
                checkNotNull(externalCustomerId) {
                    "`externalCustomerId` is required but was not set"
                },
                body ?: CustomerCreditLedgerCreateEntryByExternalIdBody(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class AddIncrementCreditLedgerEntryRequestParams
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("currency") private val currency: String?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("entry_type") private val entryType: EntryType,
        @JsonProperty("amount") private val amount: Double,
        @JsonProperty("expiry_date") private val expiryDate: OffsetDateTime?,
        @JsonProperty("effective_date") private val effectiveDate: OffsetDateTime?,
        @JsonProperty("per_unit_cost_basis") private val perUnitCostBasis: String?,
        @JsonProperty("invoice_settings") private val invoiceSettings: InvoiceSettings?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") fun currency(): Optional<String> = Optional.ofNullable(currency)

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        @JsonProperty("entry_type") fun entryType(): EntryType = entryType

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        @JsonProperty("amount") fun amount(): Double = amount

        /** An ISO 8601 format date that denotes when this credit balance should expire. */
        @JsonProperty("expiry_date")
        fun expiryDate(): Optional<OffsetDateTime> = Optional.ofNullable(expiryDate)

        /**
         * An ISO 8601 format date that denotes when this credit balance should become available for
         * use.
         */
        @JsonProperty("effective_date")
        fun effectiveDate(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveDate)

        /**
         * Can only be specified when entry_type=increment. How much, in the customer's currency, a
         * customer paid for a single credit in this block
         */
        @JsonProperty("per_unit_cost_basis")
        fun perUnitCostBasis(): Optional<String> = Optional.ofNullable(perUnitCostBasis)

        /**
         * Passing `invoice_settings` automatically generates an invoice for the newly added
         * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as the
         * calculation of the invoice total is done on that basis.
         */
        @JsonProperty("invoice_settings")
        fun invoiceSettings(): Optional<InvoiceSettings> = Optional.ofNullable(invoiceSettings)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var currency: String? = null
            private var description: String? = null
            private var entryType: EntryType? = null
            private var amount: Double? = null
            private var expiryDate: OffsetDateTime? = null
            private var effectiveDate: OffsetDateTime? = null
            private var perUnitCostBasis: String? = null
            private var invoiceSettings: InvoiceSettings? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                addIncrementCreditLedgerEntryRequestParams:
                    AddIncrementCreditLedgerEntryRequestParams
            ) = apply {
                metadata = addIncrementCreditLedgerEntryRequestParams.metadata
                currency = addIncrementCreditLedgerEntryRequestParams.currency
                description = addIncrementCreditLedgerEntryRequestParams.description
                entryType = addIncrementCreditLedgerEntryRequestParams.entryType
                amount = addIncrementCreditLedgerEntryRequestParams.amount
                expiryDate = addIncrementCreditLedgerEntryRequestParams.expiryDate
                effectiveDate = addIncrementCreditLedgerEntryRequestParams.effectiveDate
                perUnitCostBasis = addIncrementCreditLedgerEntryRequestParams.perUnitCostBasis
                invoiceSettings = addIncrementCreditLedgerEntryRequestParams.invoiceSettings
                additionalProperties =
                    addIncrementCreditLedgerEntryRequestParams.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: String) = apply { this.description = description }

            fun entryType(entryType: EntryType) = apply { this.entryType = entryType }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: Double) = apply { this.amount = amount }

            /** An ISO 8601 format date that denotes when this credit balance should expire. */
            fun expiryDate(expiryDate: OffsetDateTime) = apply { this.expiryDate = expiryDate }

            /**
             * An ISO 8601 format date that denotes when this credit balance should become available
             * for use.
             */
            fun effectiveDate(effectiveDate: OffsetDateTime) = apply {
                this.effectiveDate = effectiveDate
            }

            /**
             * Can only be specified when entry_type=increment. How much, in the customer's
             * currency, a customer paid for a single credit in this block
             */
            fun perUnitCostBasis(perUnitCostBasis: String) = apply {
                this.perUnitCostBasis = perUnitCostBasis
            }

            /**
             * Passing `invoice_settings` automatically generates an invoice for the newly added
             * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as
             * the calculation of the invoice total is done on that basis.
             */
            fun invoiceSettings(invoiceSettings: InvoiceSettings) = apply {
                this.invoiceSettings = invoiceSettings
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

            fun build(): AddIncrementCreditLedgerEntryRequestParams =
                AddIncrementCreditLedgerEntryRequestParams(
                    metadata,
                    currency,
                    description,
                    checkNotNull(entryType) { "`entryType` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    expiryDate,
                    effectiveDate,
                    perUnitCostBasis,
                    invoiceSettings,
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val INCREMENT = of("increment")

                @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                INCREMENT,
            }

            enum class Value {
                INCREMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INCREMENT -> Value.INCREMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INCREMENT -> Known.INCREMENT
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Passing `invoice_settings` automatically generates an invoice for the newly added
         * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as the
         * calculation of the invoice total is done on that basis.
         */
        @NoAutoDetect
        class InvoiceSettings
        @JsonCreator
        private constructor(
            @JsonProperty("auto_collection") private val autoCollection: Boolean,
            @JsonProperty("net_terms") private val netTerms: Long,
            @JsonProperty("memo") private val memo: String?,
            @JsonProperty("require_successful_payment")
            private val requireSuccessfulPayment: Boolean?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Whether the credits purchase invoice should auto collect with the customer's saved
             * payment method.
             */
            @JsonProperty("auto_collection") fun autoCollection(): Boolean = autoCollection

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0.
             */
            @JsonProperty("net_terms") fun netTerms(): Long = netTerms

            /** An optional memo to display on the invoice. */
            @JsonProperty("memo") fun memo(): Optional<String> = Optional.ofNullable(memo)

            /**
             * If true, the new credit block will require that the corresponding invoice is paid
             * before it can be drawn down from.
             */
            @JsonProperty("require_successful_payment")
            fun requireSuccessfulPayment(): Optional<Boolean> =
                Optional.ofNullable(requireSuccessfulPayment)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var autoCollection: Boolean? = null
                private var netTerms: Long? = null
                private var memo: String? = null
                private var requireSuccessfulPayment: Boolean? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(invoiceSettings: InvoiceSettings) = apply {
                    autoCollection = invoiceSettings.autoCollection
                    netTerms = invoiceSettings.netTerms
                    memo = invoiceSettings.memo
                    requireSuccessfulPayment = invoiceSettings.requireSuccessfulPayment
                    additionalProperties = invoiceSettings.additionalProperties.toMutableMap()
                }

                /**
                 * Whether the credits purchase invoice should auto collect with the customer's
                 * saved payment method.
                 */
                fun autoCollection(autoCollection: Boolean) = apply {
                    this.autoCollection = autoCollection
                }

                /**
                 * The net terms determines the difference between the invoice date and the issue
                 * date for the invoice. If you intend the invoice to be due on issue, set this
                 * to 0.
                 */
                fun netTerms(netTerms: Long) = apply { this.netTerms = netTerms }

                /** An optional memo to display on the invoice. */
                fun memo(memo: String) = apply { this.memo = memo }

                /**
                 * If true, the new credit block will require that the corresponding invoice is paid
                 * before it can be drawn down from.
                 */
                fun requireSuccessfulPayment(requireSuccessfulPayment: Boolean) = apply {
                    this.requireSuccessfulPayment = requireSuccessfulPayment
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): InvoiceSettings =
                    InvoiceSettings(
                        checkNotNull(autoCollection) {
                            "`autoCollection` is required but was not set"
                        },
                        checkNotNull(netTerms) { "`netTerms` is required but was not set" },
                        memo,
                        requireSuccessfulPayment,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoiceSettings && autoCollection == other.autoCollection && netTerms == other.netTerms && memo == other.memo && requireSuccessfulPayment == other.requireSuccessfulPayment && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(autoCollection, netTerms, memo, requireSuccessfulPayment, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoiceSettings{autoCollection=$autoCollection, netTerms=$netTerms, memo=$memo, requireSuccessfulPayment=$requireSuccessfulPayment, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddIncrementCreditLedgerEntryRequestParams && metadata == other.metadata && currency == other.currency && description == other.description && entryType == other.entryType && amount == other.amount && expiryDate == other.expiryDate && effectiveDate == other.effectiveDate && perUnitCostBasis == other.perUnitCostBasis && invoiceSettings == other.invoiceSettings && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, currency, description, entryType, amount, expiryDate, effectiveDate, perUnitCostBasis, invoiceSettings, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddIncrementCreditLedgerEntryRequestParams{metadata=$metadata, currency=$currency, description=$description, entryType=$entryType, amount=$amount, expiryDate=$expiryDate, effectiveDate=$effectiveDate, perUnitCostBasis=$perUnitCostBasis, invoiceSettings=$invoiceSettings, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AddDecrementCreditLedgerEntryRequestParams
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("currency") private val currency: String?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("entry_type") private val entryType: EntryType,
        @JsonProperty("amount") private val amount: Double,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") fun currency(): Optional<String> = Optional.ofNullable(currency)

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        @JsonProperty("entry_type") fun entryType(): EntryType = entryType

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        @JsonProperty("amount") fun amount(): Double = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var currency: String? = null
            private var description: String? = null
            private var entryType: EntryType? = null
            private var amount: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                addDecrementCreditLedgerEntryRequestParams:
                    AddDecrementCreditLedgerEntryRequestParams
            ) = apply {
                metadata = addDecrementCreditLedgerEntryRequestParams.metadata
                currency = addDecrementCreditLedgerEntryRequestParams.currency
                description = addDecrementCreditLedgerEntryRequestParams.description
                entryType = addDecrementCreditLedgerEntryRequestParams.entryType
                amount = addDecrementCreditLedgerEntryRequestParams.amount
                additionalProperties =
                    addDecrementCreditLedgerEntryRequestParams.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: String) = apply { this.description = description }

            fun entryType(entryType: EntryType) = apply { this.entryType = entryType }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: Double) = apply { this.amount = amount }

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

            fun build(): AddDecrementCreditLedgerEntryRequestParams =
                AddDecrementCreditLedgerEntryRequestParams(
                    metadata,
                    currency,
                    description,
                    checkNotNull(entryType) { "`entryType` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DECREMENT = of("decrement")

                @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                DECREMENT,
            }

            enum class Value {
                DECREMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    DECREMENT -> Value.DECREMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    DECREMENT -> Known.DECREMENT
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddDecrementCreditLedgerEntryRequestParams && metadata == other.metadata && currency == other.currency && description == other.description && entryType == other.entryType && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, currency, description, entryType, amount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddDecrementCreditLedgerEntryRequestParams{metadata=$metadata, currency=$currency, description=$description, entryType=$entryType, amount=$amount, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AddExpirationChangeCreditLedgerEntryRequestParams
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("currency") private val currency: String?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("entry_type") private val entryType: EntryType,
        @JsonProperty("amount") private val amount: Double?,
        @JsonProperty("expiry_date") private val expiryDate: OffsetDateTime?,
        @JsonProperty("block_id") private val blockId: String?,
        @JsonProperty("target_expiry_date") private val targetExpiryDate: LocalDate,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") fun currency(): Optional<String> = Optional.ofNullable(currency)

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        @JsonProperty("entry_type") fun entryType(): EntryType = entryType

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        @JsonProperty("amount") fun amount(): Optional<Double> = Optional.ofNullable(amount)

        /** An ISO 8601 format date that identifies the origination credit block to expire */
        @JsonProperty("expiry_date")
        fun expiryDate(): Optional<OffsetDateTime> = Optional.ofNullable(expiryDate)

        /**
         * The ID of the block affected by an expiration_change, used to differentiate between
         * multiple blocks with the same `expiry_date`.
         */
        @JsonProperty("block_id") fun blockId(): Optional<String> = Optional.ofNullable(blockId)

        /**
         * A future date (specified in YYYY-MM-DD format) used for expiration change, denoting when
         * credits transferred (as part of a partial block expiration) should expire.
         */
        @JsonProperty("target_expiry_date") fun targetExpiryDate(): LocalDate = targetExpiryDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var currency: String? = null
            private var description: String? = null
            private var entryType: EntryType? = null
            private var amount: Double? = null
            private var expiryDate: OffsetDateTime? = null
            private var blockId: String? = null
            private var targetExpiryDate: LocalDate? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                addExpirationChangeCreditLedgerEntryRequestParams:
                    AddExpirationChangeCreditLedgerEntryRequestParams
            ) = apply {
                metadata = addExpirationChangeCreditLedgerEntryRequestParams.metadata
                currency = addExpirationChangeCreditLedgerEntryRequestParams.currency
                description = addExpirationChangeCreditLedgerEntryRequestParams.description
                entryType = addExpirationChangeCreditLedgerEntryRequestParams.entryType
                amount = addExpirationChangeCreditLedgerEntryRequestParams.amount
                expiryDate = addExpirationChangeCreditLedgerEntryRequestParams.expiryDate
                blockId = addExpirationChangeCreditLedgerEntryRequestParams.blockId
                targetExpiryDate =
                    addExpirationChangeCreditLedgerEntryRequestParams.targetExpiryDate
                additionalProperties =
                    addExpirationChangeCreditLedgerEntryRequestParams.additionalProperties
                        .toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: String) = apply { this.description = description }

            fun entryType(entryType: EntryType) = apply { this.entryType = entryType }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: Double) = apply { this.amount = amount }

            /** An ISO 8601 format date that identifies the origination credit block to expire */
            fun expiryDate(expiryDate: OffsetDateTime) = apply { this.expiryDate = expiryDate }

            /**
             * The ID of the block affected by an expiration_change, used to differentiate between
             * multiple blocks with the same `expiry_date`.
             */
            fun blockId(blockId: String) = apply { this.blockId = blockId }

            /**
             * A future date (specified in YYYY-MM-DD format) used for expiration change, denoting
             * when credits transferred (as part of a partial block expiration) should expire.
             */
            fun targetExpiryDate(targetExpiryDate: LocalDate) = apply {
                this.targetExpiryDate = targetExpiryDate
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

            fun build(): AddExpirationChangeCreditLedgerEntryRequestParams =
                AddExpirationChangeCreditLedgerEntryRequestParams(
                    metadata,
                    currency,
                    description,
                    checkNotNull(entryType) { "`entryType` is required but was not set" },
                    amount,
                    expiryDate,
                    blockId,
                    checkNotNull(targetExpiryDate) {
                        "`targetExpiryDate` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EXPIRATION_CHANGE = of("expiration_change")

                @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                EXPIRATION_CHANGE,
            }

            enum class Value {
                EXPIRATION_CHANGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EXPIRATION_CHANGE -> Value.EXPIRATION_CHANGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EXPIRATION_CHANGE -> Known.EXPIRATION_CHANGE
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddExpirationChangeCreditLedgerEntryRequestParams && metadata == other.metadata && currency == other.currency && description == other.description && entryType == other.entryType && amount == other.amount && expiryDate == other.expiryDate && blockId == other.blockId && targetExpiryDate == other.targetExpiryDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, currency, description, entryType, amount, expiryDate, blockId, targetExpiryDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddExpirationChangeCreditLedgerEntryRequestParams{metadata=$metadata, currency=$currency, description=$description, entryType=$entryType, amount=$amount, expiryDate=$expiryDate, blockId=$blockId, targetExpiryDate=$targetExpiryDate, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AddVoidCreditLedgerEntryRequestParams
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("currency") private val currency: String?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("entry_type") private val entryType: EntryType,
        @JsonProperty("block_id") private val blockId: String,
        @JsonProperty("void_reason") private val voidReason: VoidReason?,
        @JsonProperty("amount") private val amount: Double,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") fun currency(): Optional<String> = Optional.ofNullable(currency)

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        @JsonProperty("entry_type") fun entryType(): EntryType = entryType

        /** The ID of the block to void. */
        @JsonProperty("block_id") fun blockId(): String = blockId

        /** Can only be specified when `entry_type=void`. The reason for the void. */
        @JsonProperty("void_reason")
        fun voidReason(): Optional<VoidReason> = Optional.ofNullable(voidReason)

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        @JsonProperty("amount") fun amount(): Double = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var currency: String? = null
            private var description: String? = null
            private var entryType: EntryType? = null
            private var blockId: String? = null
            private var voidReason: VoidReason? = null
            private var amount: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams
            ) = apply {
                metadata = addVoidCreditLedgerEntryRequestParams.metadata
                currency = addVoidCreditLedgerEntryRequestParams.currency
                description = addVoidCreditLedgerEntryRequestParams.description
                entryType = addVoidCreditLedgerEntryRequestParams.entryType
                blockId = addVoidCreditLedgerEntryRequestParams.blockId
                voidReason = addVoidCreditLedgerEntryRequestParams.voidReason
                amount = addVoidCreditLedgerEntryRequestParams.amount
                additionalProperties =
                    addVoidCreditLedgerEntryRequestParams.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: String) = apply { this.description = description }

            fun entryType(entryType: EntryType) = apply { this.entryType = entryType }

            /** The ID of the block to void. */
            fun blockId(blockId: String) = apply { this.blockId = blockId }

            /** Can only be specified when `entry_type=void`. The reason for the void. */
            fun voidReason(voidReason: VoidReason) = apply { this.voidReason = voidReason }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: Double) = apply { this.amount = amount }

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

            fun build(): AddVoidCreditLedgerEntryRequestParams =
                AddVoidCreditLedgerEntryRequestParams(
                    metadata,
                    currency,
                    description,
                    checkNotNull(entryType) { "`entryType` is required but was not set" },
                    checkNotNull(blockId) { "`blockId` is required but was not set" },
                    voidReason,
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val VOID = of("void")

                @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                VOID,
            }

            enum class Value {
                VOID,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    VOID -> Value.VOID
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    VOID -> Known.VOID
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        class VoidReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val REFUND = of("refund")

                @JvmStatic fun of(value: String) = VoidReason(JsonField.of(value))
            }

            enum class Known {
                REFUND,
            }

            enum class Value {
                REFUND,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    REFUND -> Value.REFUND
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    REFUND -> Known.REFUND
                    else -> throw OrbInvalidDataException("Unknown VoidReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VoidReason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddVoidCreditLedgerEntryRequestParams && metadata == other.metadata && currency == other.currency && description == other.description && entryType == other.entryType && blockId == other.blockId && voidReason == other.voidReason && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, currency, description, entryType, blockId, voidReason, amount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddVoidCreditLedgerEntryRequestParams{metadata=$metadata, currency=$currency, description=$description, entryType=$entryType, blockId=$blockId, voidReason=$voidReason, amount=$amount, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AddAmendmentCreditLedgerEntryRequestParams
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("currency") private val currency: String?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("entry_type") private val entryType: EntryType,
        @JsonProperty("amount") private val amount: Double,
        @JsonProperty("block_id") private val blockId: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") fun currency(): Optional<String> = Optional.ofNullable(currency)

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        @JsonProperty("entry_type") fun entryType(): EntryType = entryType

        /**
         * The number of credits to effect. Note that this is required for increment, decrement or
         * void operations.
         */
        @JsonProperty("amount") fun amount(): Double = amount

        /** The ID of the block to reverse a decrement from. */
        @JsonProperty("block_id") fun blockId(): String = blockId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var currency: String? = null
            private var description: String? = null
            private var entryType: EntryType? = null
            private var amount: Double? = null
            private var blockId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                addAmendmentCreditLedgerEntryRequestParams:
                    AddAmendmentCreditLedgerEntryRequestParams
            ) = apply {
                metadata = addAmendmentCreditLedgerEntryRequestParams.metadata
                currency = addAmendmentCreditLedgerEntryRequestParams.currency
                description = addAmendmentCreditLedgerEntryRequestParams.description
                entryType = addAmendmentCreditLedgerEntryRequestParams.entryType
                amount = addAmendmentCreditLedgerEntryRequestParams.amount
                blockId = addAmendmentCreditLedgerEntryRequestParams.blockId
                additionalProperties =
                    addAmendmentCreditLedgerEntryRequestParams.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: String) = apply { this.description = description }

            fun entryType(entryType: EntryType) = apply { this.entryType = entryType }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement
             * or void operations.
             */
            fun amount(amount: Double) = apply { this.amount = amount }

            /** The ID of the block to reverse a decrement from. */
            fun blockId(blockId: String) = apply { this.blockId = blockId }

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

            fun build(): AddAmendmentCreditLedgerEntryRequestParams =
                AddAmendmentCreditLedgerEntryRequestParams(
                    metadata,
                    currency,
                    description,
                    checkNotNull(entryType) { "`entryType` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(blockId) { "`blockId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AMENDMENT = of("amendment")

                @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
            }

            enum class Known {
                AMENDMENT,
            }

            enum class Value {
                AMENDMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AMENDMENT -> Value.AMENDMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AMENDMENT -> Known.AMENDMENT
                    else -> throw OrbInvalidDataException("Unknown EntryType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddAmendmentCreditLedgerEntryRequestParams && metadata == other.metadata && currency == other.currency && description == other.description && entryType == other.entryType && amount == other.amount && blockId == other.blockId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, currency, description, entryType, amount, blockId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddAmendmentCreditLedgerEntryRequestParams{metadata=$metadata, currency=$currency, description=$description, entryType=$entryType, amount=$amount, blockId=$blockId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerCreateEntryByExternalIdParams && externalCustomerId == other.externalCustomerId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalCustomerId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerCreateEntryByExternalIdParams{externalCustomerId=$externalCustomerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
