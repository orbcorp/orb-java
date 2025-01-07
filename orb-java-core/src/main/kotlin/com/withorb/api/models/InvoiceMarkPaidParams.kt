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
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/**
 * This endpoint allows an invoice's status to be set the `paid` status. This can only be done to
 * invoices that are in the `issued` status.
 */
class InvoiceMarkPaidParams
constructor(
    private val invoiceId: String,
    private val body: InvoiceMarkPaidBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun invoiceId(): String = invoiceId

    /** A date string to specify the date of the payment. */
    fun paymentReceivedDate(): LocalDate = body.paymentReceivedDate()

    /** An optional external ID to associate with the payment. */
    fun externalId(): Optional<String> = body.externalId()

    /** An optional note to associate with the payment. */
    fun notes(): Optional<String> = body.notes()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): InvoiceMarkPaidBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> invoiceId
            else -> ""
        }
    }

    @NoAutoDetect
    class InvoiceMarkPaidBody
    @JsonCreator
    internal constructor(
        @JsonProperty("payment_received_date") private val paymentReceivedDate: LocalDate,
        @JsonProperty("external_id") private val externalId: String?,
        @JsonProperty("notes") private val notes: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A date string to specify the date of the payment. */
        @JsonProperty("payment_received_date")
        fun paymentReceivedDate(): LocalDate = paymentReceivedDate

        /** An optional external ID to associate with the payment. */
        @JsonProperty("external_id")
        fun externalId(): Optional<String> = Optional.ofNullable(externalId)

        /** An optional note to associate with the payment. */
        @JsonProperty("notes") fun notes(): Optional<String> = Optional.ofNullable(notes)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var paymentReceivedDate: LocalDate? = null
            private var externalId: String? = null
            private var notes: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoiceMarkPaidBody: InvoiceMarkPaidBody) = apply {
                paymentReceivedDate = invoiceMarkPaidBody.paymentReceivedDate
                externalId = invoiceMarkPaidBody.externalId
                notes = invoiceMarkPaidBody.notes
                additionalProperties = invoiceMarkPaidBody.additionalProperties.toMutableMap()
            }

            /** A date string to specify the date of the payment. */
            fun paymentReceivedDate(paymentReceivedDate: LocalDate) = apply {
                this.paymentReceivedDate = paymentReceivedDate
            }

            /** An optional external ID to associate with the payment. */
            fun externalId(externalId: String?) = apply { this.externalId = externalId }

            /** An optional external ID to associate with the payment. */
            fun externalId(externalId: Optional<String>) = externalId(externalId.orElse(null))

            /** An optional note to associate with the payment. */
            fun notes(notes: String?) = apply { this.notes = notes }

            /** An optional note to associate with the payment. */
            fun notes(notes: Optional<String>) = notes(notes.orElse(null))

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

            fun build(): InvoiceMarkPaidBody =
                InvoiceMarkPaidBody(
                    checkNotNull(paymentReceivedDate) {
                        "`paymentReceivedDate` is required but was not set"
                    },
                    externalId,
                    notes,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceMarkPaidBody && paymentReceivedDate == other.paymentReceivedDate && externalId == other.externalId && notes == other.notes && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(paymentReceivedDate, externalId, notes, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceMarkPaidBody{paymentReceivedDate=$paymentReceivedDate, externalId=$externalId, notes=$notes, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var invoiceId: String? = null
        private var body: InvoiceMarkPaidBody.Builder = InvoiceMarkPaidBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invoiceMarkPaidParams: InvoiceMarkPaidParams) = apply {
            invoiceId = invoiceMarkPaidParams.invoiceId
            body = invoiceMarkPaidParams.body.toBuilder()
            additionalHeaders = invoiceMarkPaidParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceMarkPaidParams.additionalQueryParams.toBuilder()
        }

        fun invoiceId(invoiceId: String) = apply { this.invoiceId = invoiceId }

        /** A date string to specify the date of the payment. */
        fun paymentReceivedDate(paymentReceivedDate: LocalDate) = apply {
            body.paymentReceivedDate(paymentReceivedDate)
        }

        /** An optional external ID to associate with the payment. */
        fun externalId(externalId: String?) = apply { body.externalId(externalId) }

        /** An optional external ID to associate with the payment. */
        fun externalId(externalId: Optional<String>) = externalId(externalId.orElse(null))

        /** An optional note to associate with the payment. */
        fun notes(notes: String?) = apply { body.notes(notes) }

        /** An optional note to associate with the payment. */
        fun notes(notes: Optional<String>) = notes(notes.orElse(null))

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

        fun build(): InvoiceMarkPaidParams =
            InvoiceMarkPaidParams(
                checkNotNull(invoiceId) { "`invoiceId` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceMarkPaidParams && invoiceId == other.invoiceId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(invoiceId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InvoiceMarkPaidParams{invoiceId=$invoiceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
