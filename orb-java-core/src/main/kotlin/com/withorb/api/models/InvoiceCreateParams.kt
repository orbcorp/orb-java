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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class InvoiceCreateParams
constructor(
    private val currency: String,
    private val invoiceDate: OffsetDateTime,
    private val lineItems: List<LineItem>,
    private val netTerms: Long,
    private val customerId: String?,
    private val discount: Discount?,
    private val externalCustomerId: String?,
    private val memo: String?,
    private val metadata: Metadata?,
    private val willAutoIssue: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun currency(): String = currency

    fun invoiceDate(): OffsetDateTime = invoiceDate

    fun lineItems(): List<LineItem> = lineItems

    fun netTerms(): Long = netTerms

    fun customerId(): Optional<String> = Optional.ofNullable(customerId)

    fun discount(): Optional<Discount> = Optional.ofNullable(discount)

    fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId)

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun willAutoIssue(): Optional<Boolean> = Optional.ofNullable(willAutoIssue)

    @JvmSynthetic
    internal fun getBody(): InvoiceCreateBody {
        return InvoiceCreateBody(
            currency,
            invoiceDate,
            lineItems,
            netTerms,
            customerId,
            discount,
            externalCustomerId,
            memo,
            metadata,
            willAutoIssue,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = InvoiceCreateBody.Builder::class)
    @NoAutoDetect
    class InvoiceCreateBody
    internal constructor(
        private val currency: String?,
        private val invoiceDate: OffsetDateTime?,
        private val lineItems: List<LineItem>?,
        private val netTerms: Long?,
        private val customerId: String?,
        private val discount: Discount?,
        private val externalCustomerId: String?,
        private val memo: String?,
        private val metadata: Metadata?,
        private val willAutoIssue: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * An ISO 4217 currency string. Must be the same as the customer's currency if it is set.
         */
        @JsonProperty("currency") fun currency(): String? = currency

        /**
         * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set to
         * the current time in the customer's timezone.
         */
        @JsonProperty("invoice_date") fun invoiceDate(): OffsetDateTime? = invoiceDate

        @JsonProperty("line_items") fun lineItems(): List<LineItem>? = lineItems

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of '0' here represents that the invoice is due on issue,
         * whereas a value of 30 represents that the customer has 30 days to pay the invoice.
         */
        @JsonProperty("net_terms") fun netTerms(): Long? = netTerms

        /**
         * The id of the `Customer` to create this invoice for. One of `customer_id` and
         * `external_customer_id` are required.
         */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** An optional discount to attach to the invoice. */
        @JsonProperty("discount") fun discount(): Discount? = discount

        /**
         * The `external_customer_id` of the `Customer` to create this invoice for. One of
         * `customer_id` and `external_customer_id` are required.
         */
        @JsonProperty("external_customer_id") fun externalCustomerId(): String? = externalCustomerId

        /** An optional memo to attach to the invoice. */
        @JsonProperty("memo") fun memo(): String? = memo

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * When true, this invoice will automatically be issued upon creation. When false, the
         * resulting invoice will require manual review to issue. Defaulted to false.
         */
        @JsonProperty("will_auto_issue") fun willAutoIssue(): Boolean? = willAutoIssue

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var currency: String? = null
            private var invoiceDate: OffsetDateTime? = null
            private var lineItems: List<LineItem>? = null
            private var netTerms: Long? = null
            private var customerId: String? = null
            private var discount: Discount? = null
            private var externalCustomerId: String? = null
            private var memo: String? = null
            private var metadata: Metadata? = null
            private var willAutoIssue: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoiceCreateBody: InvoiceCreateBody) = apply {
                this.currency = invoiceCreateBody.currency
                this.invoiceDate = invoiceCreateBody.invoiceDate
                this.lineItems = invoiceCreateBody.lineItems
                this.netTerms = invoiceCreateBody.netTerms
                this.customerId = invoiceCreateBody.customerId
                this.discount = invoiceCreateBody.discount
                this.externalCustomerId = invoiceCreateBody.externalCustomerId
                this.memo = invoiceCreateBody.memo
                this.metadata = invoiceCreateBody.metadata
                this.willAutoIssue = invoiceCreateBody.willAutoIssue
                additionalProperties(invoiceCreateBody.additionalProperties)
            }

            /**
             * An ISO 4217 currency string. Must be the same as the customer's currency if it is
             * set.
             */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /**
             * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set
             * to the current time in the customer's timezone.
             */
            @JsonProperty("invoice_date")
            fun invoiceDate(invoiceDate: OffsetDateTime) = apply { this.invoiceDate = invoiceDate }

            @JsonProperty("line_items")
            fun lineItems(lineItems: List<LineItem>) = apply { this.lineItems = lineItems }

            /**
             * Determines the difference between the invoice issue date for subscription invoices as
             * the date that they are due. A value of '0' here represents that the invoice is due on
             * issue, whereas a value of 30 represents that the customer has 30 days to pay the
             * invoice.
             */
            @JsonProperty("net_terms")
            fun netTerms(netTerms: Long) = apply { this.netTerms = netTerms }

            /**
             * The id of the `Customer` to create this invoice for. One of `customer_id` and
             * `external_customer_id` are required.
             */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** An optional discount to attach to the invoice. */
            @JsonProperty("discount")
            fun discount(discount: Discount) = apply { this.discount = discount }

            /**
             * The `external_customer_id` of the `Customer` to create this invoice for. One of
             * `customer_id` and `external_customer_id` are required.
             */
            @JsonProperty("external_customer_id")
            fun externalCustomerId(externalCustomerId: String) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /** An optional memo to attach to the invoice. */
            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * When true, this invoice will automatically be issued upon creation. When false, the
             * resulting invoice will require manual review to issue. Defaulted to false.
             */
            @JsonProperty("will_auto_issue")
            fun willAutoIssue(willAutoIssue: Boolean) = apply { this.willAutoIssue = willAutoIssue }

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

            fun build(): InvoiceCreateBody =
                InvoiceCreateBody(
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(invoiceDate) { "`invoiceDate` is required but was not set" },
                    checkNotNull(lineItems) { "`lineItems` is required but was not set" }
                        .toImmutable(),
                    checkNotNull(netTerms) { "`netTerms` is required but was not set" },
                    customerId,
                    discount,
                    externalCustomerId,
                    memo,
                    metadata,
                    willAutoIssue,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceCreateBody && this.currency == other.currency && this.invoiceDate == other.invoiceDate && this.lineItems == other.lineItems && this.netTerms == other.netTerms && this.customerId == other.customerId && this.discount == other.discount && this.externalCustomerId == other.externalCustomerId && this.memo == other.memo && this.metadata == other.metadata && this.willAutoIssue == other.willAutoIssue && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(currency, invoiceDate, lineItems, netTerms, customerId, discount, externalCustomerId, memo, metadata, willAutoIssue, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InvoiceCreateBody{currency=$currency, invoiceDate=$invoiceDate, lineItems=$lineItems, netTerms=$netTerms, customerId=$customerId, discount=$discount, externalCustomerId=$externalCustomerId, memo=$memo, metadata=$metadata, willAutoIssue=$willAutoIssue, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceCreateParams && this.currency == other.currency && this.invoiceDate == other.invoiceDate && this.lineItems == other.lineItems && this.netTerms == other.netTerms && this.customerId == other.customerId && this.discount == other.discount && this.externalCustomerId == other.externalCustomerId && this.memo == other.memo && this.metadata == other.metadata && this.willAutoIssue == other.willAutoIssue && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(currency, invoiceDate, lineItems, netTerms, customerId, discount, externalCustomerId, memo, metadata, willAutoIssue, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "InvoiceCreateParams{currency=$currency, invoiceDate=$invoiceDate, lineItems=$lineItems, netTerms=$netTerms, customerId=$customerId, discount=$discount, externalCustomerId=$externalCustomerId, memo=$memo, metadata=$metadata, willAutoIssue=$willAutoIssue, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var currency: String? = null
        private var invoiceDate: OffsetDateTime? = null
        private var lineItems: MutableList<LineItem> = mutableListOf()
        private var netTerms: Long? = null
        private var customerId: String? = null
        private var discount: Discount? = null
        private var externalCustomerId: String? = null
        private var memo: String? = null
        private var metadata: Metadata? = null
        private var willAutoIssue: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invoiceCreateParams: InvoiceCreateParams) = apply {
            this.currency = invoiceCreateParams.currency
            this.invoiceDate = invoiceCreateParams.invoiceDate
            this.lineItems(invoiceCreateParams.lineItems)
            this.netTerms = invoiceCreateParams.netTerms
            this.customerId = invoiceCreateParams.customerId
            this.discount = invoiceCreateParams.discount
            this.externalCustomerId = invoiceCreateParams.externalCustomerId
            this.memo = invoiceCreateParams.memo
            this.metadata = invoiceCreateParams.metadata
            this.willAutoIssue = invoiceCreateParams.willAutoIssue
            additionalHeaders(invoiceCreateParams.additionalHeaders)
            additionalQueryParams(invoiceCreateParams.additionalQueryParams)
            additionalBodyProperties(invoiceCreateParams.additionalBodyProperties)
        }

        /**
         * An ISO 4217 currency string. Must be the same as the customer's currency if it is set.
         */
        fun currency(currency: String) = apply { this.currency = currency }

        /**
         * Optional invoice date to set. Must be in the past, if not set, `invoice_date` is set to
         * the current time in the customer's timezone.
         */
        fun invoiceDate(invoiceDate: OffsetDateTime) = apply { this.invoiceDate = invoiceDate }

        fun lineItems(lineItems: List<LineItem>) = apply {
            this.lineItems.clear()
            this.lineItems.addAll(lineItems)
        }

        fun addLineItem(lineItem: LineItem) = apply { this.lineItems.add(lineItem) }

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of '0' here represents that the invoice is due on issue,
         * whereas a value of 30 represents that the customer has 30 days to pay the invoice.
         */
        fun netTerms(netTerms: Long) = apply { this.netTerms = netTerms }

        /**
         * The id of the `Customer` to create this invoice for. One of `customer_id` and
         * `external_customer_id` are required.
         */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** An optional discount to attach to the invoice. */
        fun discount(discount: Discount) = apply { this.discount = discount }

        /** An optional discount to attach to the invoice. */
        fun discount(percentageDiscount: PercentageDiscount) = apply {
            this.discount = Discount.ofPercentageDiscount(percentageDiscount)
        }

        /** An optional discount to attach to the invoice. */
        fun discount(trialDiscount: TrialDiscount) = apply {
            this.discount = Discount.ofTrialDiscount(trialDiscount)
        }

        /** An optional discount to attach to the invoice. */
        fun discount(usageDiscount: Discount.UsageDiscount) = apply {
            this.discount = Discount.ofUsageDiscount(usageDiscount)
        }

        /** An optional discount to attach to the invoice. */
        fun discount(amountDiscount: AmountDiscount) = apply {
            this.discount = Discount.ofAmountDiscount(amountDiscount)
        }

        /**
         * The `external_customer_id` of the `Customer` to create this invoice for. One of
         * `customer_id` and `external_customer_id` are required.
         */
        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** An optional memo to attach to the invoice. */
        fun memo(memo: String) = apply { this.memo = memo }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * When true, this invoice will automatically be issued upon creation. When false, the
         * resulting invoice will require manual review to issue. Defaulted to false.
         */
        fun willAutoIssue(willAutoIssue: Boolean) = apply { this.willAutoIssue = willAutoIssue }

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

        fun build(): InvoiceCreateParams =
            InvoiceCreateParams(
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(invoiceDate) { "`invoiceDate` is required but was not set" },
                checkNotNull(lineItems) { "`lineItems` is required but was not set" }.toImmutable(),
                checkNotNull(netTerms) { "`netTerms` is required but was not set" },
                customerId,
                discount,
                externalCustomerId,
                memo,
                metadata,
                willAutoIssue,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = LineItem.Builder::class)
    @NoAutoDetect
    class LineItem
    private constructor(
        private val startDate: LocalDate?,
        private val endDate: LocalDate?,
        private val quantity: Double?,
        private val name: String?,
        private val itemId: String?,
        private val modelType: ModelType?,
        private val unitConfig: UnitConfig?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A date string to specify the line item's start date in the customer's timezone. */
        @JsonProperty("start_date") fun startDate(): LocalDate? = startDate

        /** A date string to specify the line item's end date in the customer's timezone. */
        @JsonProperty("end_date") fun endDate(): LocalDate? = endDate

        /** The number of units on the line item */
        @JsonProperty("quantity") fun quantity(): Double? = quantity

        /** The name of the line item. */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("item_id") fun itemId(): String? = itemId

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("unit_config") fun unitConfig(): UnitConfig? = unitConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var startDate: LocalDate? = null
            private var endDate: LocalDate? = null
            private var quantity: Double? = null
            private var name: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var unitConfig: UnitConfig? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                this.startDate = lineItem.startDate
                this.endDate = lineItem.endDate
                this.quantity = lineItem.quantity
                this.name = lineItem.name
                this.itemId = lineItem.itemId
                this.modelType = lineItem.modelType
                this.unitConfig = lineItem.unitConfig
                additionalProperties(lineItem.additionalProperties)
            }

            /** A date string to specify the line item's start date in the customer's timezone. */
            @JsonProperty("start_date")
            fun startDate(startDate: LocalDate) = apply { this.startDate = startDate }

            /** A date string to specify the line item's end date in the customer's timezone. */
            @JsonProperty("end_date")
            fun endDate(endDate: LocalDate) = apply { this.endDate = endDate }

            /** The number of units on the line item */
            @JsonProperty("quantity")
            fun quantity(quantity: Double) = apply { this.quantity = quantity }

            /** The name of the line item. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("unit_config")
            fun unitConfig(unitConfig: UnitConfig) = apply { this.unitConfig = unitConfig }

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
                    checkNotNull(startDate) { "`startDate` is required but was not set" },
                    checkNotNull(endDate) { "`endDate` is required but was not set" },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(unitConfig) { "`unitConfig` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val UNIT = ModelType(JsonField.of("unit"))

                @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                UNIT,
            }

            enum class Value {
                UNIT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    UNIT -> Value.UNIT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    UNIT -> Known.UNIT
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = UnitConfig.Builder::class)
        @NoAutoDetect
        class UnitConfig
        private constructor(
            private val unitAmount: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** Rate per unit of usage */
            @JsonProperty("unit_amount") fun unitAmount(): String? = unitAmount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var unitAmount: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unitConfig: UnitConfig) = apply {
                    this.unitAmount = unitConfig.unitAmount
                    additionalProperties(unitConfig.additionalProperties)
                }

                /** Rate per unit of usage */
                @JsonProperty("unit_amount")
                fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): UnitConfig =
                    UnitConfig(
                        checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                        additionalProperties.toImmutable()
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnitConfig && this.unitAmount == other.unitAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(unitAmount, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "UnitConfig{unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && this.startDate == other.startDate && this.endDate == other.endDate && this.quantity == other.quantity && this.name == other.name && this.itemId == other.itemId && this.modelType == other.modelType && this.unitConfig == other.unitConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(startDate, endDate, quantity, name, itemId, modelType, unitConfig, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LineItem{startDate=$startDate, endDate=$endDate, quantity=$quantity, name=$name, itemId=$itemId, modelType=$modelType, unitConfig=$unitConfig, additionalProperties=$additionalProperties}"
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }
}
