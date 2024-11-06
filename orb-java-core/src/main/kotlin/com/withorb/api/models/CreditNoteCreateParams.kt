// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.util.Objects
import java.util.Optional

class CreditNoteCreateParams
constructor(
    private val lineItems: List<LineItem>,
    private val memo: String?,
    private val reason: Reason?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun lineItems(): List<LineItem> = lineItems

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    fun reason(): Optional<Reason> = Optional.ofNullable(reason)

    @JvmSynthetic
    internal fun getBody(): CreditNoteCreateBody {
        return CreditNoteCreateBody(
            lineItems,
            memo,
            reason,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = CreditNoteCreateBody.Builder::class)
    @NoAutoDetect
    class CreditNoteCreateBody
    internal constructor(
        private val lineItems: List<LineItem>?,
        private val memo: String?,
        private val reason: Reason?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("line_items") fun lineItems(): List<LineItem>? = lineItems

        /** An optional memo to attach to the credit note. */
        @JsonProperty("memo") fun memo(): String? = memo

        /** An optional reason for the credit note. */
        @JsonProperty("reason") fun reason(): Reason? = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var lineItems: List<LineItem>? = null
            private var memo: String? = null
            private var reason: Reason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditNoteCreateBody: CreditNoteCreateBody) = apply {
                this.lineItems = creditNoteCreateBody.lineItems
                this.memo = creditNoteCreateBody.memo
                this.reason = creditNoteCreateBody.reason
                additionalProperties(creditNoteCreateBody.additionalProperties)
            }

            @JsonProperty("line_items")
            fun lineItems(lineItems: List<LineItem>) = apply { this.lineItems = lineItems }

            /** An optional memo to attach to the credit note. */
            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

            /** An optional reason for the credit note. */
            @JsonProperty("reason") fun reason(reason: Reason) = apply { this.reason = reason }

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

            fun build(): CreditNoteCreateBody =
                CreditNoteCreateBody(
                    checkNotNull(lineItems) { "`lineItems` is required but was not set" }
                        .toImmutable(),
                    memo,
                    reason,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditNoteCreateBody && this.lineItems == other.lineItems && this.memo == other.memo && this.reason == other.reason && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(lineItems, memo, reason, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CreditNoteCreateBody{lineItems=$lineItems, memo=$memo, reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNoteCreateParams && this.lineItems == other.lineItems && this.memo == other.memo && this.reason == other.reason && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(lineItems, memo, reason, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CreditNoteCreateParams{lineItems=$lineItems, memo=$memo, reason=$reason, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var lineItems: MutableList<LineItem> = mutableListOf()
        private var memo: String? = null
        private var reason: Reason? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(creditNoteCreateParams: CreditNoteCreateParams) = apply {
            this.lineItems(creditNoteCreateParams.lineItems)
            this.memo = creditNoteCreateParams.memo
            this.reason = creditNoteCreateParams.reason
            additionalHeaders(creditNoteCreateParams.additionalHeaders)
            additionalQueryParams(creditNoteCreateParams.additionalQueryParams)
            additionalBodyProperties(creditNoteCreateParams.additionalBodyProperties)
        }

        fun lineItems(lineItems: List<LineItem>) = apply {
            this.lineItems.clear()
            this.lineItems.addAll(lineItems)
        }

        fun addLineItem(lineItem: LineItem) = apply { this.lineItems.add(lineItem) }

        /** An optional memo to attach to the credit note. */
        fun memo(memo: String) = apply { this.memo = memo }

        /** An optional reason for the credit note. */
        fun reason(reason: Reason) = apply { this.reason = reason }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CreditNoteCreateParams =
            CreditNoteCreateParams(
                checkNotNull(lineItems) { "`lineItems` is required but was not set" }.toImmutable(),
                memo,
                reason,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = LineItem.Builder::class)
    @NoAutoDetect
    class LineItem
    private constructor(
        private val invoiceLineItemId: String?,
        private val amount: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The ID of the line item to credit. */
        @JsonProperty("invoice_line_item_id") fun invoiceLineItemId(): String? = invoiceLineItemId

        /** The total amount in the invoice's currency to credit this line item. */
        @JsonProperty("amount") fun amount(): String? = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var invoiceLineItemId: String? = null
            private var amount: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                this.invoiceLineItemId = lineItem.invoiceLineItemId
                this.amount = lineItem.amount
                additionalProperties(lineItem.additionalProperties)
            }

            /** The ID of the line item to credit. */
            @JsonProperty("invoice_line_item_id")
            fun invoiceLineItemId(invoiceLineItemId: String) = apply {
                this.invoiceLineItemId = invoiceLineItemId
            }

            /** The total amount in the invoice's currency to credit this line item. */
            @JsonProperty("amount") fun amount(amount: String) = apply { this.amount = amount }

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

            fun build(): LineItem =
                LineItem(
                    checkNotNull(invoiceLineItemId) {
                        "`invoiceLineItemId` is required but was not set"
                    },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && this.invoiceLineItemId == other.invoiceLineItemId && this.amount == other.amount && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(invoiceLineItemId, amount, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LineItem{invoiceLineItemId=$invoiceLineItemId, amount=$amount, additionalProperties=$additionalProperties}"
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DUPLICATE = Reason(JsonField.of("duplicate"))

            @JvmField val FRAUDULENT = Reason(JsonField.of("fraudulent"))

            @JvmField val ORDER_CHANGE = Reason(JsonField.of("order_change"))

            @JvmField val PRODUCT_UNSATISFACTORY = Reason(JsonField.of("product_unsatisfactory"))

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            DUPLICATE,
            FRAUDULENT,
            ORDER_CHANGE,
            PRODUCT_UNSATISFACTORY,
        }

        enum class Value {
            DUPLICATE,
            FRAUDULENT,
            ORDER_CHANGE,
            PRODUCT_UNSATISFACTORY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DUPLICATE -> Value.DUPLICATE
                FRAUDULENT -> Value.FRAUDULENT
                ORDER_CHANGE -> Value.ORDER_CHANGE
                PRODUCT_UNSATISFACTORY -> Value.PRODUCT_UNSATISFACTORY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DUPLICATE -> Known.DUPLICATE
                FRAUDULENT -> Known.FRAUDULENT
                ORDER_CHANGE -> Known.ORDER_CHANGE
                PRODUCT_UNSATISFACTORY -> Known.PRODUCT_UNSATISFACTORY
                else -> throw OrbInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
