// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects
import java.util.Optional

class SubscriptionUpdateParams
constructor(
    private val subscriptionId: String,
    private val body: SubscriptionUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun subscriptionId(): String = subscriptionId

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. This property defaults to the plan's behavior.
     */
    fun autoCollection(): Optional<Boolean> = body.autoCollection()

    /**
     * Determines the default memo on this subscription's invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    fun defaultInvoiceMemo(): Optional<String> = body.defaultInvoiceMemo()

    /**
     * When this subscription's accrued usage reaches this threshold, an invoice will be issued for
     * the subscription. If not specified, invoices will only be issued at the end of the billing
     * period.
     */
    fun invoicingThreshold(): Optional<String> = body.invoicingThreshold()

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of `0` here represents that the invoice is due on issue,
     * whereas a value of `30` represents that the customer has a month to pay the invoice.
     */
    fun netTerms(): Optional<Long> = body.netTerms()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): SubscriptionUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    @NoAutoDetect
    class SubscriptionUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("auto_collection") private val autoCollection: Boolean?,
        @JsonProperty("default_invoice_memo") private val defaultInvoiceMemo: String?,
        @JsonProperty("invoicing_threshold") private val invoicingThreshold: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("net_terms") private val netTerms: Long?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior.
         */
        @JsonProperty("auto_collection")
        fun autoCollection(): Optional<Boolean> = Optional.ofNullable(autoCollection)

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        @JsonProperty("default_invoice_memo")
        fun defaultInvoiceMemo(): Optional<String> = Optional.ofNullable(defaultInvoiceMemo)

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will be issued
         * for the subscription. If not specified, invoices will only be issued at the end of the
         * billing period.
         */
        @JsonProperty("invoicing_threshold")
        fun invoicingThreshold(): Optional<String> = Optional.ofNullable(invoicingThreshold)

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of `0` here represents that the invoice is due on issue,
         * whereas a value of `30` represents that the customer has a month to pay the invoice.
         */
        @JsonProperty("net_terms") fun netTerms(): Optional<Long> = Optional.ofNullable(netTerms)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var autoCollection: Boolean? = null
            private var defaultInvoiceMemo: String? = null
            private var invoicingThreshold: String? = null
            private var metadata: Metadata? = null
            private var netTerms: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscriptionUpdateBody: SubscriptionUpdateBody) = apply {
                autoCollection = subscriptionUpdateBody.autoCollection
                defaultInvoiceMemo = subscriptionUpdateBody.defaultInvoiceMemo
                invoicingThreshold = subscriptionUpdateBody.invoicingThreshold
                metadata = subscriptionUpdateBody.metadata
                netTerms = subscriptionUpdateBody.netTerms
                additionalProperties = subscriptionUpdateBody.additionalProperties.toMutableMap()
            }

            /**
             * Determines whether issued invoices for this subscription will automatically be
             * charged with the saved payment method on the due date. This property defaults to the
             * plan's behavior.
             */
            fun autoCollection(autoCollection: Boolean?) = apply {
                this.autoCollection = autoCollection
            }

            /**
             * Determines whether issued invoices for this subscription will automatically be
             * charged with the saved payment method on the due date. This property defaults to the
             * plan's behavior.
             */
            fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

            /**
             * Determines whether issued invoices for this subscription will automatically be
             * charged with the saved payment method on the due date. This property defaults to the
             * plan's behavior.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun autoCollection(autoCollection: Optional<Boolean>) =
                autoCollection(autoCollection.orElse(null) as Boolean?)

            /**
             * Determines the default memo on this subscription's invoices. Note that if this is not
             * provided, it is determined by the plan configuration.
             */
            fun defaultInvoiceMemo(defaultInvoiceMemo: String?) = apply {
                this.defaultInvoiceMemo = defaultInvoiceMemo
            }

            /**
             * Determines the default memo on this subscription's invoices. Note that if this is not
             * provided, it is determined by the plan configuration.
             */
            fun defaultInvoiceMemo(defaultInvoiceMemo: Optional<String>) =
                defaultInvoiceMemo(defaultInvoiceMemo.orElse(null))

            /**
             * When this subscription's accrued usage reaches this threshold, an invoice will be
             * issued for the subscription. If not specified, invoices will only be issued at the
             * end of the billing period.
             */
            fun invoicingThreshold(invoicingThreshold: String?) = apply {
                this.invoicingThreshold = invoicingThreshold
            }

            /**
             * When this subscription's accrued usage reaches this threshold, an invoice will be
             * issued for the subscription. If not specified, invoices will only be issued at the
             * end of the billing period.
             */
            fun invoicingThreshold(invoicingThreshold: Optional<String>) =
                invoicingThreshold(invoicingThreshold.orElse(null))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            /**
             * Determines the difference between the invoice issue date for subscription invoices as
             * the date that they are due. A value of `0` here represents that the invoice is due on
             * issue, whereas a value of `30` represents that the customer has a month to pay the
             * invoice.
             */
            fun netTerms(netTerms: Long?) = apply { this.netTerms = netTerms }

            /**
             * Determines the difference between the invoice issue date for subscription invoices as
             * the date that they are due. A value of `0` here represents that the invoice is due on
             * issue, whereas a value of `30` represents that the customer has a month to pay the
             * invoice.
             */
            fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

            /**
             * Determines the difference between the invoice issue date for subscription invoices as
             * the date that they are due. A value of `0` here represents that the invoice is due on
             * issue, whereas a value of `30` represents that the customer has a month to pay the
             * invoice.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun netTerms(netTerms: Optional<Long>) = netTerms(netTerms.orElse(null) as Long?)

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

            fun build(): SubscriptionUpdateBody =
                SubscriptionUpdateBody(
                    autoCollection,
                    defaultInvoiceMemo,
                    invoicingThreshold,
                    metadata,
                    netTerms,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubscriptionUpdateBody && autoCollection == other.autoCollection && defaultInvoiceMemo == other.defaultInvoiceMemo && invoicingThreshold == other.invoicingThreshold && metadata == other.metadata && netTerms == other.netTerms && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(autoCollection, defaultInvoiceMemo, invoicingThreshold, metadata, netTerms, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionUpdateBody{autoCollection=$autoCollection, defaultInvoiceMemo=$defaultInvoiceMemo, invoicingThreshold=$invoicingThreshold, metadata=$metadata, netTerms=$netTerms, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var body: SubscriptionUpdateBody.Builder = SubscriptionUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionUpdateParams: SubscriptionUpdateParams) = apply {
            subscriptionId = subscriptionUpdateParams.subscriptionId
            body = subscriptionUpdateParams.body.toBuilder()
            additionalHeaders = subscriptionUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionUpdateParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior.
         */
        fun autoCollection(autoCollection: Boolean?) = apply { body.autoCollection(autoCollection) }

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior.
         */
        fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun autoCollection(autoCollection: Optional<Boolean>) =
            autoCollection(autoCollection.orElse(null) as Boolean?)

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String?) = apply {
            body.defaultInvoiceMemo(defaultInvoiceMemo)
        }

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: Optional<String>) =
            defaultInvoiceMemo(defaultInvoiceMemo.orElse(null))

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will be issued
         * for the subscription. If not specified, invoices will only be issued at the end of the
         * billing period.
         */
        fun invoicingThreshold(invoicingThreshold: String?) = apply {
            body.invoicingThreshold(invoicingThreshold)
        }

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will be issued
         * for the subscription. If not specified, invoices will only be issued at the end of the
         * billing period.
         */
        fun invoicingThreshold(invoicingThreshold: Optional<String>) =
            invoicingThreshold(invoicingThreshold.orElse(null))

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of `0` here represents that the invoice is due on issue,
         * whereas a value of `30` represents that the customer has a month to pay the invoice.
         */
        fun netTerms(netTerms: Long?) = apply { body.netTerms(netTerms) }

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of `0` here represents that the invoice is due on issue,
         * whereas a value of `30` represents that the customer has a month to pay the invoice.
         */
        fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of `0` here represents that the invoice is due on issue,
         * whereas a value of `30` represents that the customer has a month to pay the invoice.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun netTerms(netTerms: Optional<Long>) = netTerms(netTerms.orElse(null) as Long?)

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

        fun build(): SubscriptionUpdateParams =
            SubscriptionUpdateParams(
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        return /* spotless:off */ other is SubscriptionUpdateParams && subscriptionId == other.subscriptionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionUpdateParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
