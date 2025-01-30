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
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
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

/**
 * This endpoint allows you to create a new ledger entry for a specified customer's balance. This
 * can be used to increment balance, deduct credits, and change the expiry date of existing credits.
 *
 * ## Effects of adding a ledger entry
 * 1. After calling this endpoint, [Fetch Credit Balance](fetch-customer-credits) will return a
 *    credit block that represents the changes (i.e. balance changes or transfers).
 * 2. A ledger entry will be added to the credits ledger for this customer, and therefore returned
 *    in the [View Credits Ledger](fetch-customer-credits-ledger) response as well as serialized in
 *    the response to this request. In the case of deductions without a specified block, multiple
 *    ledger entries may be created if the deduction spans credit blocks.
 * 3. If `invoice_settings` is specified, an invoice will be created that reflects the cost of the
 *    credits (based on `amount` and `per_unit_cost_basis`).
 *
 * ## Adding credits
 *
 * Adding credits is done by creating an entry of type `increment`. This requires the caller to
 * specify a number of credits as well as an optional expiry date in `YYYY-MM-DD` format. Orb also
 * recommends specifying a description to assist with auditing. When adding credits, the caller can
 * also specify a cost basis per-credit, to indicate how much in USD a customer paid for a single
 * credit in a block. This can later be used for revenue recognition.
 *
 * The following snippet illustrates a sample request body to increment credits which will expire in
 * January of 2022.
 *
 * ```json
 * {
 *   "entry_type": "increment",
 *   "amount": 100,
 *   "expiry_date": "2022-12-28",
 *   "per_unit_cost_basis": "0.20",
 *   "description": "Purchased 100 credits"
 * }
 * ```
 *
 * Note that by default, Orb will always first increment any _negative_ balance in existing blocks
 * before adding the remaining amount to the desired credit block.
 *
 * ### Invoicing for credits
 *
 * By default, Orb manipulates the credit ledger but does not charge for credits. However, if you
 * pass `invoice_settings` in the body of this request, Orb will also generate a one-off invoice for
 * the customer for the credits pre-purchase. Note that you _must_ provide the
 * `per_unit_cost_basis`, since the total charges on the invoice are calculated by multiplying the
 * cost basis with the number of credit units added.
 *
 * ## Deducting Credits
 *
 * Orb allows you to deduct credits from a customer by creating an entry of type `decrement`. Orb
 * matches the algorithm for automatic deductions for determining which credit blocks to decrement
 * from. In the case that the deduction leads to multiple ledger entries, the response from this
 * endpoint will be the final deduction. Orb also optionally allows specifying a description to
 * assist with auditing.
 *
 * The following snippet illustrates a sample request body to decrement credits.
 *
 * ```json
 * {
 *   "entry_type": "decrement",
 *   "amount": 20,
 *   "description": "Removing excess credits"
 * }
 * ```
 *
 * ## Changing credits expiry
 *
 * If you'd like to change when existing credits expire, you should create a ledger entry of type
 * `expiration_change`. For this entry, the required parameter `expiry_date` identifies the
 * _originating_ block, and the required parameter `target_expiry_date` identifies when the
 * transferred credits should now expire. A new credit block will be created with expiry date
 * `target_expiry_date`, with the same cost basis data as the original credit block, if present.
 *
 * Note that the balance of the block with the given `expiry_date` must be at least equal to the
 * desired transfer amount determined by the `amount` parameter.
 *
 * The following snippet illustrates a sample request body to extend the expiration date of credits
 * by one year:
 * ```json
 * {
 *   "entry_type": "expiration_change",
 *   "amount": 10,
 *   "expiry_date": "2022-12-28",
 *   "block_id": "UiUhFWeLHPrBY4Ad",
 *   "target_expiry_date": "2023-12-28",
 *   "description": "Extending credit validity"
 * }
 * ```
 *
 * ## Voiding credits
 *
 * If you'd like to void a credit block, create a ledger entry of type `void`. For this entry,
 * `block_id` is required to identify the block, and `amount` indicates how many credits to void, up
 * to the block's initial balance. Pass in a `void_reason` of `refund` if the void is due to a
 * refund.
 *
 * ## Amendment
 *
 * If you'd like to undo a decrement on a credit block, create a ledger entry of type `amendment`.
 * For this entry, `block_id` is required to identify the block that was originally decremented
 * from, and `amount` indicates how many credits to return to the customer, up to the block's
 * initial balance.
 */
class CustomerCreditLedgerCreateEntryParams
private constructor(
    private val customerId: String,
    private val body: CustomerCreditLedgerCreateEntryBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

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

    @JvmSynthetic internal fun _body(): CustomerCreditLedgerCreateEntryBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    @JsonDeserialize(using = CustomerCreditLedgerCreateEntryBody.Deserializer::class)
    @JsonSerialize(using = CustomerCreditLedgerCreateEntryBody.Serializer::class)
    class CustomerCreditLedgerCreateEntryBody
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

            return /* spotless:off */ other is CustomerCreditLedgerCreateEntryBody && addIncrementCreditLedgerEntryRequestParams == other.addIncrementCreditLedgerEntryRequestParams && addDecrementCreditLedgerEntryRequestParams == other.addDecrementCreditLedgerEntryRequestParams && addExpirationChangeCreditLedgerEntryRequestParams == other.addExpirationChangeCreditLedgerEntryRequestParams && addVoidCreditLedgerEntryRequestParams == other.addVoidCreditLedgerEntryRequestParams && addAmendmentCreditLedgerEntryRequestParams == other.addAmendmentCreditLedgerEntryRequestParams /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(addIncrementCreditLedgerEntryRequestParams, addDecrementCreditLedgerEntryRequestParams, addExpirationChangeCreditLedgerEntryRequestParams, addVoidCreditLedgerEntryRequestParams, addAmendmentCreditLedgerEntryRequestParams) /* spotless:on */

        override fun toString(): String =
            when {
                addIncrementCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryBody{addIncrementCreditLedgerEntryRequestParams=$addIncrementCreditLedgerEntryRequestParams}"
                addDecrementCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryBody{addDecrementCreditLedgerEntryRequestParams=$addDecrementCreditLedgerEntryRequestParams}"
                addExpirationChangeCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryBody{addExpirationChangeCreditLedgerEntryRequestParams=$addExpirationChangeCreditLedgerEntryRequestParams}"
                addVoidCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryBody{addVoidCreditLedgerEntryRequestParams=$addVoidCreditLedgerEntryRequestParams}"
                addAmendmentCreditLedgerEntryRequestParams != null ->
                    "CustomerCreditLedgerCreateEntryBody{addAmendmentCreditLedgerEntryRequestParams=$addAmendmentCreditLedgerEntryRequestParams}"
                _json != null -> "CustomerCreditLedgerCreateEntryBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CustomerCreditLedgerCreateEntryBody")
            }

        companion object {

            @JvmStatic
            fun ofAddIncrementCreditLedgerEntryRequestParams(
                addIncrementCreditLedgerEntryRequestParams:
                    AddIncrementCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryBody(
                    addIncrementCreditLedgerEntryRequestParams =
                        addIncrementCreditLedgerEntryRequestParams
                )

            @JvmStatic
            fun ofAddDecrementCreditLedgerEntryRequestParams(
                addDecrementCreditLedgerEntryRequestParams:
                    AddDecrementCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryBody(
                    addDecrementCreditLedgerEntryRequestParams =
                        addDecrementCreditLedgerEntryRequestParams
                )

            @JvmStatic
            fun ofAddExpirationChangeCreditLedgerEntryRequestParams(
                addExpirationChangeCreditLedgerEntryRequestParams:
                    AddExpirationChangeCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryBody(
                    addExpirationChangeCreditLedgerEntryRequestParams =
                        addExpirationChangeCreditLedgerEntryRequestParams
                )

            @JvmStatic
            fun ofAddVoidCreditLedgerEntryRequestParams(
                addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryBody(
                    addVoidCreditLedgerEntryRequestParams = addVoidCreditLedgerEntryRequestParams
                )

            @JvmStatic
            fun ofAddAmendmentCreditLedgerEntryRequestParams(
                addAmendmentCreditLedgerEntryRequestParams:
                    AddAmendmentCreditLedgerEntryRequestParams
            ) =
                CustomerCreditLedgerCreateEntryBody(
                    addAmendmentCreditLedgerEntryRequestParams =
                        addAmendmentCreditLedgerEntryRequestParams
                )
        }

        /**
         * An interface that defines how to map each variant of
         * [CustomerCreditLedgerCreateEntryBody] to a value of type [T].
         */
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

            /**
             * Maps an unknown variant of [CustomerCreditLedgerCreateEntryBody] to a value of type
             * [T].
             *
             * An instance of [CustomerCreditLedgerCreateEntryBody] can contain an unknown variant
             * if it was deserialized from data that doesn't match any known variant. For example,
             * if the SDK is on an older version than the API, then the API may respond with new
             * variants that the SDK is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown CustomerCreditLedgerCreateEntryBody: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<CustomerCreditLedgerCreateEntryBody>(
                CustomerCreditLedgerCreateEntryBody::class
            ) {

            override fun ObjectCodec.deserialize(
                node: JsonNode
            ): CustomerCreditLedgerCreateEntryBody {
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
                                return CustomerCreditLedgerCreateEntryBody(
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
                                return CustomerCreditLedgerCreateEntryBody(
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
                                return CustomerCreditLedgerCreateEntryBody(
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
                                return CustomerCreditLedgerCreateEntryBody(
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
                                return CustomerCreditLedgerCreateEntryBody(
                                    addAmendmentCreditLedgerEntryRequestParams = it,
                                    _json = json
                                )
                            }
                    }
                }

                return CustomerCreditLedgerCreateEntryBody(_json = json)
            }
        }

        internal class Serializer :
            BaseSerializer<CustomerCreditLedgerCreateEntryBody>(
                CustomerCreditLedgerCreateEntryBody::class
            ) {

            override fun serialize(
                value: CustomerCreditLedgerCreateEntryBody,
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
                        throw IllegalStateException("Invalid CustomerCreditLedgerCreateEntryBody")
                }
            }
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerCreditLedgerCreateEntryParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var customerId: String? = null
        private var body: CustomerCreditLedgerCreateEntryBody? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            customerCreditLedgerCreateEntryParams: CustomerCreditLedgerCreateEntryParams
        ) = apply {
            customerId = customerCreditLedgerCreateEntryParams.customerId
            body = customerCreditLedgerCreateEntryParams.body
            additionalHeaders = customerCreditLedgerCreateEntryParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerCreditLedgerCreateEntryParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun forAddIncrementCreditLedgerEntryRequestParams(
            addIncrementCreditLedgerEntryRequestParams: AddIncrementCreditLedgerEntryRequestParams
        ) = apply {
            body =
                CustomerCreditLedgerCreateEntryBody.ofAddIncrementCreditLedgerEntryRequestParams(
                    addIncrementCreditLedgerEntryRequestParams
                )
        }

        fun forAddDecrementCreditLedgerEntryRequestParams(
            addDecrementCreditLedgerEntryRequestParams: AddDecrementCreditLedgerEntryRequestParams
        ) = apply {
            body =
                CustomerCreditLedgerCreateEntryBody.ofAddDecrementCreditLedgerEntryRequestParams(
                    addDecrementCreditLedgerEntryRequestParams
                )
        }

        fun forAddExpirationChangeCreditLedgerEntryRequestParams(
            addExpirationChangeCreditLedgerEntryRequestParams:
                AddExpirationChangeCreditLedgerEntryRequestParams
        ) = apply {
            body =
                CustomerCreditLedgerCreateEntryBody
                    .ofAddExpirationChangeCreditLedgerEntryRequestParams(
                        addExpirationChangeCreditLedgerEntryRequestParams
                    )
        }

        fun forAddVoidCreditLedgerEntryRequestParams(
            addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams
        ) = apply {
            body =
                CustomerCreditLedgerCreateEntryBody.ofAddVoidCreditLedgerEntryRequestParams(
                    addVoidCreditLedgerEntryRequestParams
                )
        }

        fun forAddAmendmentCreditLedgerEntryRequestParams(
            addAmendmentCreditLedgerEntryRequestParams: AddAmendmentCreditLedgerEntryRequestParams
        ) = apply {
            body =
                CustomerCreditLedgerCreateEntryBody.ofAddAmendmentCreditLedgerEntryRequestParams(
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

        fun build(): CustomerCreditLedgerCreateEntryParams =
            CustomerCreditLedgerCreateEntryParams(
                checkRequired("customerId", customerId),
                body ?: CustomerCreditLedgerCreateEntryBody(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class AddIncrementCreditLedgerEntryRequestParams
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        private val effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expiry_date")
        @ExcludeMissing
        private val expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("invoice_settings")
        @ExcludeMissing
        private val invoiceSettings: JsonField<InvoiceSettings> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("per_unit_cost_basis")
        @ExcludeMissing
        private val perUnitCostBasis: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        fun amount(): Double = amount.getRequired("amount")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * An ISO 8601 format date that denotes when this credit balance should become available for
         * use.
         */
        fun effectiveDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveDate.getNullable("effective_date"))

        /** An ISO 8601 format date that denotes when this credit balance should expire. */
        fun expiryDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(expiryDate.getNullable("expiry_date"))

        /**
         * Passing `invoice_settings` automatically generates an invoice for the newly added
         * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as the
         * calculation of the invoice total is done on that basis.
         */
        fun invoiceSettings(): Optional<InvoiceSettings> =
            Optional.ofNullable(invoiceSettings.getNullable("invoice_settings"))

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /**
         * Can only be specified when entry_type=increment. How much, in the customer's currency, a
         * customer paid for a single credit in this block
         */
        fun perUnitCostBasis(): Optional<String> =
            Optional.ofNullable(perUnitCostBasis.getNullable("per_unit_cost_basis"))

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        @JsonProperty("entry_type")
        @ExcludeMissing
        fun _entryType(): JsonField<EntryType> = entryType

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * An ISO 8601 format date that denotes when this credit balance should become available for
         * use.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

        /** An ISO 8601 format date that denotes when this credit balance should expire. */
        @JsonProperty("expiry_date")
        @ExcludeMissing
        fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

        /**
         * Passing `invoice_settings` automatically generates an invoice for the newly added
         * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as the
         * calculation of the invoice total is done on that basis.
         */
        @JsonProperty("invoice_settings")
        @ExcludeMissing
        fun _invoiceSettings(): JsonField<InvoiceSettings> = invoiceSettings

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Can only be specified when entry_type=increment. How much, in the customer's currency, a
         * customer paid for a single credit in this block
         */
        @JsonProperty("per_unit_cost_basis")
        @ExcludeMissing
        fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AddIncrementCreditLedgerEntryRequestParams = apply {
            if (validated) {
                return@apply
            }

            amount()
            entryType()
            currency()
            description()
            effectiveDate()
            expiryDate()
            invoiceSettings().ifPresent { it.validate() }
            metadata().ifPresent { it.validate() }
            perUnitCostBasis()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AddIncrementCreditLedgerEntryRequestParams]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var entryType: JsonField<EntryType>? = null
            private var currency: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var invoiceSettings: JsonField<InvoiceSettings> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                addIncrementCreditLedgerEntryRequestParams:
                    AddIncrementCreditLedgerEntryRequestParams
            ) = apply {
                amount = addIncrementCreditLedgerEntryRequestParams.amount
                entryType = addIncrementCreditLedgerEntryRequestParams.entryType
                currency = addIncrementCreditLedgerEntryRequestParams.currency
                description = addIncrementCreditLedgerEntryRequestParams.description
                effectiveDate = addIncrementCreditLedgerEntryRequestParams.effectiveDate
                expiryDate = addIncrementCreditLedgerEntryRequestParams.expiryDate
                invoiceSettings = addIncrementCreditLedgerEntryRequestParams.invoiceSettings
                metadata = addIncrementCreditLedgerEntryRequestParams.metadata
                perUnitCostBasis = addIncrementCreditLedgerEntryRequestParams.perUnitCostBasis
                additionalProperties =
                    addIncrementCreditLedgerEntryRequestParams.additionalProperties.toMutableMap()
            }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: Optional<String>) = currency(currency.orElse(null))

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * An ISO 8601 format date that denotes when this credit balance should become available
             * for use.
             */
            fun effectiveDate(effectiveDate: OffsetDateTime?) =
                effectiveDate(JsonField.ofNullable(effectiveDate))

            /**
             * An ISO 8601 format date that denotes when this credit balance should become available
             * for use.
             */
            fun effectiveDate(effectiveDate: Optional<OffsetDateTime>) =
                effectiveDate(effectiveDate.orElse(null))

            /**
             * An ISO 8601 format date that denotes when this credit balance should become available
             * for use.
             */
            fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
                this.effectiveDate = effectiveDate
            }

            /** An ISO 8601 format date that denotes when this credit balance should expire. */
            fun expiryDate(expiryDate: OffsetDateTime?) =
                expiryDate(JsonField.ofNullable(expiryDate))

            /** An ISO 8601 format date that denotes when this credit balance should expire. */
            fun expiryDate(expiryDate: Optional<OffsetDateTime>) =
                expiryDate(expiryDate.orElse(null))

            /** An ISO 8601 format date that denotes when this credit balance should expire. */
            fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                this.expiryDate = expiryDate
            }

            /**
             * Passing `invoice_settings` automatically generates an invoice for the newly added
             * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as
             * the calculation of the invoice total is done on that basis.
             */
            fun invoiceSettings(invoiceSettings: InvoiceSettings?) =
                invoiceSettings(JsonField.ofNullable(invoiceSettings))

            /**
             * Passing `invoice_settings` automatically generates an invoice for the newly added
             * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as
             * the calculation of the invoice total is done on that basis.
             */
            fun invoiceSettings(invoiceSettings: Optional<InvoiceSettings>) =
                invoiceSettings(invoiceSettings.orElse(null))

            /**
             * Passing `invoice_settings` automatically generates an invoice for the newly added
             * credits. If `invoice_settings` is passed, you must specify per_unit_cost_basis, as
             * the calculation of the invoice total is done on that basis.
             */
            fun invoiceSettings(invoiceSettings: JsonField<InvoiceSettings>) = apply {
                this.invoiceSettings = invoiceSettings
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * Can only be specified when entry_type=increment. How much, in the customer's
             * currency, a customer paid for a single credit in this block
             */
            fun perUnitCostBasis(perUnitCostBasis: String?) =
                perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

            /**
             * Can only be specified when entry_type=increment. How much, in the customer's
             * currency, a customer paid for a single credit in this block
             */
            fun perUnitCostBasis(perUnitCostBasis: Optional<String>) =
                perUnitCostBasis(perUnitCostBasis.orElse(null))

            /**
             * Can only be specified when entry_type=increment. How much, in the customer's
             * currency, a customer paid for a single credit in this block
             */
            fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                this.perUnitCostBasis = perUnitCostBasis
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
                    checkRequired("amount", amount),
                    checkRequired("entryType", entryType),
                    currency,
                    description,
                    effectiveDate,
                    expiryDate,
                    invoiceSettings,
                    metadata,
                    perUnitCostBasis,
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val INCREMENT = of("increment")

                @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
            }

            /** An enum containing [EntryType]'s known values. */
            enum class Known {
                INCREMENT,
            }

            /**
             * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INCREMENT,
                /**
                 * An enum member indicating that [EntryType] was instantiated with an unknown
                 * value.
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
                    INCREMENT -> Value.INCREMENT
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
            @JsonProperty("auto_collection")
            @ExcludeMissing
            private val autoCollection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("net_terms")
            @ExcludeMissing
            private val netTerms: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("memo")
            @ExcludeMissing
            private val memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("require_successful_payment")
            @ExcludeMissing
            private val requireSuccessfulPayment: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Whether the credits purchase invoice should auto collect with the customer's saved
             * payment method.
             */
            fun autoCollection(): Boolean = autoCollection.getRequired("auto_collection")

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0.
             */
            fun netTerms(): Long = netTerms.getRequired("net_terms")

            /** An optional memo to display on the invoice. */
            fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

            /**
             * If true, the new credit block will require that the corresponding invoice is paid
             * before it can be drawn down from.
             */
            fun requireSuccessfulPayment(): Optional<Boolean> =
                Optional.ofNullable(
                    requireSuccessfulPayment.getNullable("require_successful_payment")
                )

            /**
             * Whether the credits purchase invoice should auto collect with the customer's saved
             * payment method.
             */
            @JsonProperty("auto_collection")
            @ExcludeMissing
            fun _autoCollection(): JsonField<Boolean> = autoCollection

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0.
             */
            @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

            /** An optional memo to display on the invoice. */
            @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

            /**
             * If true, the new credit block will require that the corresponding invoice is paid
             * before it can be drawn down from.
             */
            @JsonProperty("require_successful_payment")
            @ExcludeMissing
            fun _requireSuccessfulPayment(): JsonField<Boolean> = requireSuccessfulPayment

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): InvoiceSettings = apply {
                if (validated) {
                    return@apply
                }

                autoCollection()
                netTerms()
                memo()
                requireSuccessfulPayment()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InvoiceSettings]. */
            class Builder internal constructor() {

                private var autoCollection: JsonField<Boolean>? = null
                private var netTerms: JsonField<Long>? = null
                private var memo: JsonField<String> = JsonMissing.of()
                private var requireSuccessfulPayment: JsonField<Boolean> = JsonMissing.of()
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
                fun autoCollection(autoCollection: Boolean) =
                    autoCollection(JsonField.of(autoCollection))

                /**
                 * Whether the credits purchase invoice should auto collect with the customer's
                 * saved payment method.
                 */
                fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
                    this.autoCollection = autoCollection
                }

                /**
                 * The net terms determines the difference between the invoice date and the issue
                 * date for the invoice. If you intend the invoice to be due on issue, set this
                 * to 0.
                 */
                fun netTerms(netTerms: Long) = netTerms(JsonField.of(netTerms))

                /**
                 * The net terms determines the difference between the invoice date and the issue
                 * date for the invoice. If you intend the invoice to be due on issue, set this
                 * to 0.
                 */
                fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

                /** An optional memo to display on the invoice. */
                fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

                /** An optional memo to display on the invoice. */
                fun memo(memo: Optional<String>) = memo(memo.orElse(null))

                /** An optional memo to display on the invoice. */
                fun memo(memo: JsonField<String>) = apply { this.memo = memo }

                /**
                 * If true, the new credit block will require that the corresponding invoice is paid
                 * before it can be drawn down from.
                 */
                fun requireSuccessfulPayment(requireSuccessfulPayment: Boolean) =
                    requireSuccessfulPayment(JsonField.of(requireSuccessfulPayment))

                /**
                 * If true, the new credit block will require that the corresponding invoice is paid
                 * before it can be drawn down from.
                 */
                fun requireSuccessfulPayment(requireSuccessfulPayment: JsonField<Boolean>) = apply {
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
                        checkRequired("autoCollection", autoCollection),
                        checkRequired("netTerms", netTerms),
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

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

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

            return /* spotless:off */ other is AddIncrementCreditLedgerEntryRequestParams && amount == other.amount && entryType == other.entryType && currency == other.currency && description == other.description && effectiveDate == other.effectiveDate && expiryDate == other.expiryDate && invoiceSettings == other.invoiceSettings && metadata == other.metadata && perUnitCostBasis == other.perUnitCostBasis && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, entryType, currency, description, effectiveDate, expiryDate, invoiceSettings, metadata, perUnitCostBasis, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddIncrementCreditLedgerEntryRequestParams{amount=$amount, entryType=$entryType, currency=$currency, description=$description, effectiveDate=$effectiveDate, expiryDate=$expiryDate, invoiceSettings=$invoiceSettings, metadata=$metadata, perUnitCostBasis=$perUnitCostBasis, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AddDecrementCreditLedgerEntryRequestParams
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        fun amount(): Double = amount.getRequired("amount")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        @JsonProperty("entry_type")
        @ExcludeMissing
        fun _entryType(): JsonField<EntryType> = entryType

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AddDecrementCreditLedgerEntryRequestParams = apply {
            if (validated) {
                return@apply
            }

            amount()
            entryType()
            currency()
            description()
            metadata().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AddDecrementCreditLedgerEntryRequestParams]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var entryType: JsonField<EntryType>? = null
            private var currency: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                addDecrementCreditLedgerEntryRequestParams:
                    AddDecrementCreditLedgerEntryRequestParams
            ) = apply {
                amount = addDecrementCreditLedgerEntryRequestParams.amount
                entryType = addDecrementCreditLedgerEntryRequestParams.entryType
                currency = addDecrementCreditLedgerEntryRequestParams.currency
                description = addDecrementCreditLedgerEntryRequestParams.description
                metadata = addDecrementCreditLedgerEntryRequestParams.metadata
                additionalProperties =
                    addDecrementCreditLedgerEntryRequestParams.additionalProperties.toMutableMap()
            }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: Optional<String>) = currency(currency.orElse(null))

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                    checkRequired("amount", amount),
                    checkRequired("entryType", entryType),
                    currency,
                    description,
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val DECREMENT = of("decrement")

                @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
            }

            /** An enum containing [EntryType]'s known values. */
            enum class Known {
                DECREMENT,
            }

            /**
             * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DECREMENT,
                /**
                 * An enum member indicating that [EntryType] was instantiated with an unknown
                 * value.
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
                    DECREMENT -> Value.DECREMENT
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

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

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

            return /* spotless:off */ other is AddDecrementCreditLedgerEntryRequestParams && amount == other.amount && entryType == other.entryType && currency == other.currency && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, entryType, currency, description, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddDecrementCreditLedgerEntryRequestParams{amount=$amount, entryType=$entryType, currency=$currency, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AddExpirationChangeCreditLedgerEntryRequestParams
    @JsonCreator
    private constructor(
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("expiry_date")
        @ExcludeMissing
        private val expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("target_expiry_date")
        @ExcludeMissing
        private val targetExpiryDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("block_id")
        @ExcludeMissing
        private val blockId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        /** An ISO 8601 format date that identifies the origination credit block to expire */
        fun expiryDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(expiryDate.getNullable("expiry_date"))

        /**
         * A future date (specified in YYYY-MM-DD format) used for expiration change, denoting when
         * credits transferred (as part of a partial block expiration) should expire.
         */
        fun targetExpiryDate(): LocalDate = targetExpiryDate.getRequired("target_expiry_date")

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

        /**
         * The ID of the block affected by an expiration_change, used to differentiate between
         * multiple blocks with the same `expiry_date`.
         */
        fun blockId(): Optional<String> = Optional.ofNullable(blockId.getNullable("block_id"))

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        @JsonProperty("entry_type")
        @ExcludeMissing
        fun _entryType(): JsonField<EntryType> = entryType

        /** An ISO 8601 format date that identifies the origination credit block to expire */
        @JsonProperty("expiry_date")
        @ExcludeMissing
        fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

        /**
         * A future date (specified in YYYY-MM-DD format) used for expiration change, denoting when
         * credits transferred (as part of a partial block expiration) should expire.
         */
        @JsonProperty("target_expiry_date")
        @ExcludeMissing
        fun _targetExpiryDate(): JsonField<LocalDate> = targetExpiryDate

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * The ID of the block affected by an expiration_change, used to differentiate between
         * multiple blocks with the same `expiry_date`.
         */
        @JsonProperty("block_id") @ExcludeMissing fun _blockId(): JsonField<String> = blockId

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AddExpirationChangeCreditLedgerEntryRequestParams = apply {
            if (validated) {
                return@apply
            }

            entryType()
            expiryDate()
            targetExpiryDate()
            amount()
            blockId()
            currency()
            description()
            metadata().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AddExpirationChangeCreditLedgerEntryRequestParams]. */
        class Builder internal constructor() {

            private var entryType: JsonField<EntryType>? = null
            private var expiryDate: JsonField<OffsetDateTime>? = null
            private var targetExpiryDate: JsonField<LocalDate>? = null
            private var amount: JsonField<Double> = JsonMissing.of()
            private var blockId: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                addExpirationChangeCreditLedgerEntryRequestParams:
                    AddExpirationChangeCreditLedgerEntryRequestParams
            ) = apply {
                entryType = addExpirationChangeCreditLedgerEntryRequestParams.entryType
                expiryDate = addExpirationChangeCreditLedgerEntryRequestParams.expiryDate
                targetExpiryDate =
                    addExpirationChangeCreditLedgerEntryRequestParams.targetExpiryDate
                amount = addExpirationChangeCreditLedgerEntryRequestParams.amount
                blockId = addExpirationChangeCreditLedgerEntryRequestParams.blockId
                currency = addExpirationChangeCreditLedgerEntryRequestParams.currency
                description = addExpirationChangeCreditLedgerEntryRequestParams.description
                metadata = addExpirationChangeCreditLedgerEntryRequestParams.metadata
                additionalProperties =
                    addExpirationChangeCreditLedgerEntryRequestParams.additionalProperties
                        .toMutableMap()
            }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            /** An ISO 8601 format date that identifies the origination credit block to expire */
            fun expiryDate(expiryDate: OffsetDateTime?) =
                expiryDate(JsonField.ofNullable(expiryDate))

            /** An ISO 8601 format date that identifies the origination credit block to expire */
            fun expiryDate(expiryDate: Optional<OffsetDateTime>) =
                expiryDate(expiryDate.orElse(null))

            /** An ISO 8601 format date that identifies the origination credit block to expire */
            fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                this.expiryDate = expiryDate
            }

            /**
             * A future date (specified in YYYY-MM-DD format) used for expiration change, denoting
             * when credits transferred (as part of a partial block expiration) should expire.
             */
            fun targetExpiryDate(targetExpiryDate: LocalDate) =
                targetExpiryDate(JsonField.of(targetExpiryDate))

            /**
             * A future date (specified in YYYY-MM-DD format) used for expiration change, denoting
             * when credits transferred (as part of a partial block expiration) should expire.
             */
            fun targetExpiryDate(targetExpiryDate: JsonField<LocalDate>) = apply {
                this.targetExpiryDate = targetExpiryDate
            }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: Double?) = amount(JsonField.ofNullable(amount))

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: Double) = amount(amount as Double?)

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun amount(amount: Optional<Double>) = amount(amount.orElse(null) as Double?)

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /**
             * The ID of the block affected by an expiration_change, used to differentiate between
             * multiple blocks with the same `expiry_date`.
             */
            fun blockId(blockId: String?) = blockId(JsonField.ofNullable(blockId))

            /**
             * The ID of the block affected by an expiration_change, used to differentiate between
             * multiple blocks with the same `expiry_date`.
             */
            fun blockId(blockId: Optional<String>) = blockId(blockId.orElse(null))

            /**
             * The ID of the block affected by an expiration_change, used to differentiate between
             * multiple blocks with the same `expiry_date`.
             */
            fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: Optional<String>) = currency(currency.orElse(null))

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                    checkRequired("entryType", entryType),
                    checkRequired("expiryDate", expiryDate),
                    checkRequired("targetExpiryDate", targetExpiryDate),
                    amount,
                    blockId,
                    currency,
                    description,
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val EXPIRATION_CHANGE = of("expiration_change")

                @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
            }

            /** An enum containing [EntryType]'s known values. */
            enum class Known {
                EXPIRATION_CHANGE,
            }

            /**
             * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EXPIRATION_CHANGE,
                /**
                 * An enum member indicating that [EntryType] was instantiated with an unknown
                 * value.
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
                    EXPIRATION_CHANGE -> Value.EXPIRATION_CHANGE
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

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

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

            return /* spotless:off */ other is AddExpirationChangeCreditLedgerEntryRequestParams && entryType == other.entryType && expiryDate == other.expiryDate && targetExpiryDate == other.targetExpiryDate && amount == other.amount && blockId == other.blockId && currency == other.currency && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entryType, expiryDate, targetExpiryDate, amount, blockId, currency, description, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddExpirationChangeCreditLedgerEntryRequestParams{entryType=$entryType, expiryDate=$expiryDate, targetExpiryDate=$targetExpiryDate, amount=$amount, blockId=$blockId, currency=$currency, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AddVoidCreditLedgerEntryRequestParams
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("block_id")
        @ExcludeMissing
        private val blockId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("void_reason")
        @ExcludeMissing
        private val voidReason: JsonField<VoidReason> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        fun amount(): Double = amount.getRequired("amount")

        /** The ID of the block to void. */
        fun blockId(): String = blockId.getRequired("block_id")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** Can only be specified when `entry_type=void`. The reason for the void. */
        fun voidReason(): Optional<VoidReason> =
            Optional.ofNullable(voidReason.getNullable("void_reason"))

        /**
         * The number of credits to effect. Note that this is required for increment, decrement,
         * void, or undo operations.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /** The ID of the block to void. */
        @JsonProperty("block_id") @ExcludeMissing fun _blockId(): JsonField<String> = blockId

        @JsonProperty("entry_type")
        @ExcludeMissing
        fun _entryType(): JsonField<EntryType> = entryType

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** Can only be specified when `entry_type=void`. The reason for the void. */
        @JsonProperty("void_reason")
        @ExcludeMissing
        fun _voidReason(): JsonField<VoidReason> = voidReason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AddVoidCreditLedgerEntryRequestParams = apply {
            if (validated) {
                return@apply
            }

            amount()
            blockId()
            entryType()
            currency()
            description()
            metadata().ifPresent { it.validate() }
            voidReason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AddVoidCreditLedgerEntryRequestParams]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var blockId: JsonField<String>? = null
            private var entryType: JsonField<EntryType>? = null
            private var currency: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var voidReason: JsonField<VoidReason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                addVoidCreditLedgerEntryRequestParams: AddVoidCreditLedgerEntryRequestParams
            ) = apply {
                amount = addVoidCreditLedgerEntryRequestParams.amount
                blockId = addVoidCreditLedgerEntryRequestParams.blockId
                entryType = addVoidCreditLedgerEntryRequestParams.entryType
                currency = addVoidCreditLedgerEntryRequestParams.currency
                description = addVoidCreditLedgerEntryRequestParams.description
                metadata = addVoidCreditLedgerEntryRequestParams.metadata
                voidReason = addVoidCreditLedgerEntryRequestParams.voidReason
                additionalProperties =
                    addVoidCreditLedgerEntryRequestParams.additionalProperties.toMutableMap()
            }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * The number of credits to effect. Note that this is required for increment, decrement,
             * void, or undo operations.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** The ID of the block to void. */
            fun blockId(blockId: String) = blockId(JsonField.of(blockId))

            /** The ID of the block to void. */
            fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: Optional<String>) = currency(currency.orElse(null))

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Can only be specified when `entry_type=void`. The reason for the void. */
            fun voidReason(voidReason: VoidReason?) = voidReason(JsonField.ofNullable(voidReason))

            /** Can only be specified when `entry_type=void`. The reason for the void. */
            fun voidReason(voidReason: Optional<VoidReason>) = voidReason(voidReason.orElse(null))

            /** Can only be specified when `entry_type=void`. The reason for the void. */
            fun voidReason(voidReason: JsonField<VoidReason>) = apply {
                this.voidReason = voidReason
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

            fun build(): AddVoidCreditLedgerEntryRequestParams =
                AddVoidCreditLedgerEntryRequestParams(
                    checkRequired("amount", amount),
                    checkRequired("blockId", blockId),
                    checkRequired("entryType", entryType),
                    currency,
                    description,
                    metadata,
                    voidReason,
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val VOID = of("void")

                @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
            }

            /** An enum containing [EntryType]'s known values. */
            enum class Known {
                VOID,
            }

            /**
             * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VOID,
                /**
                 * An enum member indicating that [EntryType] was instantiated with an unknown
                 * value.
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
                    VOID -> Value.VOID
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

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

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

        /** Can only be specified when `entry_type=void`. The reason for the void. */
        class VoidReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val REFUND = of("refund")

                @JvmStatic fun of(value: String) = VoidReason(JsonField.of(value))
            }

            /** An enum containing [VoidReason]'s known values. */
            enum class Known {
                REFUND,
            }

            /**
             * An enum containing [VoidReason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [VoidReason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REFUND,
                /**
                 * An enum member indicating that [VoidReason] was instantiated with an unknown
                 * value.
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
                    REFUND -> Value.REFUND
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

            return /* spotless:off */ other is AddVoidCreditLedgerEntryRequestParams && amount == other.amount && blockId == other.blockId && entryType == other.entryType && currency == other.currency && description == other.description && metadata == other.metadata && voidReason == other.voidReason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, blockId, entryType, currency, description, metadata, voidReason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddVoidCreditLedgerEntryRequestParams{amount=$amount, blockId=$blockId, entryType=$entryType, currency=$currency, description=$description, metadata=$metadata, voidReason=$voidReason, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AddAmendmentCreditLedgerEntryRequestParams
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("block_id")
        @ExcludeMissing
        private val blockId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entry_type")
        @ExcludeMissing
        private val entryType: JsonField<EntryType> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The number of credits to effect. Note that this is required for increment, decrement or
         * void operations.
         */
        fun amount(): Double = amount.getRequired("amount")

        /** The ID of the block to reverse a decrement from. */
        fun blockId(): String = blockId.getRequired("block_id")

        fun entryType(): EntryType = entryType.getRequired("entry_type")

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /**
         * The number of credits to effect. Note that this is required for increment, decrement or
         * void operations.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /** The ID of the block to reverse a decrement from. */
        @JsonProperty("block_id") @ExcludeMissing fun _blockId(): JsonField<String> = blockId

        @JsonProperty("entry_type")
        @ExcludeMissing
        fun _entryType(): JsonField<EntryType> = entryType

        /**
         * The currency or custom pricing unit to use for this ledger entry. If this is a real-world
         * currency, it must match the customer's invoicing currency.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Optional metadata that can be specified when adding ledger results via the API. For
         * example, this can be used to note an increment refers to trial credits, or for noting
         * corrections as a result of an incident, etc.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AddAmendmentCreditLedgerEntryRequestParams = apply {
            if (validated) {
                return@apply
            }

            amount()
            blockId()
            entryType()
            currency()
            description()
            metadata().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AddAmendmentCreditLedgerEntryRequestParams]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var blockId: JsonField<String>? = null
            private var entryType: JsonField<EntryType>? = null
            private var currency: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                addAmendmentCreditLedgerEntryRequestParams:
                    AddAmendmentCreditLedgerEntryRequestParams
            ) = apply {
                amount = addAmendmentCreditLedgerEntryRequestParams.amount
                blockId = addAmendmentCreditLedgerEntryRequestParams.blockId
                entryType = addAmendmentCreditLedgerEntryRequestParams.entryType
                currency = addAmendmentCreditLedgerEntryRequestParams.currency
                description = addAmendmentCreditLedgerEntryRequestParams.description
                metadata = addAmendmentCreditLedgerEntryRequestParams.metadata
                additionalProperties =
                    addAmendmentCreditLedgerEntryRequestParams.additionalProperties.toMutableMap()
            }

            /**
             * The number of credits to effect. Note that this is required for increment, decrement
             * or void operations.
             */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * The number of credits to effect. Note that this is required for increment, decrement
             * or void operations.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** The ID of the block to reverse a decrement from. */
            fun blockId(blockId: String) = blockId(JsonField.of(blockId))

            /** The ID of the block to reverse a decrement from. */
            fun blockId(blockId: JsonField<String>) = apply { this.blockId = blockId }

            fun entryType(entryType: EntryType) = entryType(JsonField.of(entryType))

            fun entryType(entryType: JsonField<EntryType>) = apply { this.entryType = entryType }

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: Optional<String>) = currency(currency.orElse(null))

            /**
             * The currency or custom pricing unit to use for this ledger entry. If this is a
             * real-world currency, it must match the customer's invoicing currency.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /**
             * Optional metadata that can be specified when adding ledger results via the API. For
             * example, this can be used to note an increment refers to trial credits, or for noting
             * corrections as a result of an incident, etc.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                    checkRequired("amount", amount),
                    checkRequired("blockId", blockId),
                    checkRequired("entryType", entryType),
                    currency,
                    description,
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        class EntryType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val AMENDMENT = of("amendment")

                @JvmStatic fun of(value: String) = EntryType(JsonField.of(value))
            }

            /** An enum containing [EntryType]'s known values. */
            enum class Known {
                AMENDMENT,
            }

            /**
             * An enum containing [EntryType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntryType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AMENDMENT,
                /**
                 * An enum member indicating that [EntryType] was instantiated with an unknown
                 * value.
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
                    AMENDMENT -> Value.AMENDMENT
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

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

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

            return /* spotless:off */ other is AddAmendmentCreditLedgerEntryRequestParams && amount == other.amount && blockId == other.blockId && entryType == other.entryType && currency == other.currency && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, blockId, entryType, currency, description, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddAmendmentCreditLedgerEntryRequestParams{amount=$amount, blockId=$blockId, entryType=$entryType, currency=$currency, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerCreateEntryParams && customerId == other.customerId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerCreateEntryParams{customerId=$customerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
