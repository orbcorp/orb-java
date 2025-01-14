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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/**
 * This endpoint can be used to update the quantity for a fixed fee.
 *
 * To be eligible, the subscription must currently be active and the price specified must be a fixed
 * fee (not usage-based). This operation will immediately update the quantity for the fee, or if a
 * `effective_date` is passed in, will update the quantity on the requested date at midnight in the
 * customer's timezone.
 *
 * In order to change the fixed fee quantity as of the next draft invoice for this subscription,
 * pass `change_option=upcoming_invoice` without an `effective_date` specified.
 *
 * If the fee is an in-advance fixed fee, it will also issue an immediate invoice for the difference
 * for the remainder of the billing period.
 */
class SubscriptionUpdateFixedFeeQuantityParams
constructor(
    private val subscriptionId: String,
    private val body: SubscriptionUpdateFixedFeeQuantityBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun subscriptionId(): String = subscriptionId

    /** Price for which the quantity should be updated. Must be a fixed fee. */
    fun priceId(): String = body.priceId()

    fun quantity(): Double = body.quantity()

    /**
     * Determines when the change takes effect. Note that if `effective_date` is specified, this
     * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's explicitly
     * set to `upcoming_invoice.
     */
    fun changeOption(): Optional<ChangeOption> = body.changeOption()

    /**
     * The date that the quantity change should take effect, localized to the customer's timezone.
     * Ifthis parameter is not passed in, the quantity change is effective according to
     * `change_option`.
     */
    fun effectiveDate(): Optional<LocalDate> = body.effectiveDate()

    /** Price for which the quantity should be updated. Must be a fixed fee. */
    fun _priceId(): JsonField<String> = body._priceId()

    fun _quantity(): JsonField<Double> = body._quantity()

    /**
     * Determines when the change takes effect. Note that if `effective_date` is specified, this
     * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's explicitly
     * set to `upcoming_invoice.
     */
    fun _changeOption(): JsonField<ChangeOption> = body._changeOption()

    /**
     * The date that the quantity change should take effect, localized to the customer's timezone.
     * Ifthis parameter is not passed in, the quantity change is effective according to
     * `change_option`.
     */
    fun _effectiveDate(): JsonField<LocalDate> = body._effectiveDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): SubscriptionUpdateFixedFeeQuantityBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    @NoAutoDetect
    class SubscriptionUpdateFixedFeeQuantityBody
    @JsonCreator
    internal constructor(
        @JsonProperty("price_id")
        @ExcludeMissing
        private val priceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("change_option")
        @ExcludeMissing
        private val changeOption: JsonField<ChangeOption> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Price for which the quantity should be updated. Must be a fixed fee. */
        fun priceId(): String = priceId.getRequired("price_id")

        fun quantity(): Double = quantity.getRequired("quantity")

        /**
         * Determines when the change takes effect. Note that if `effective_date` is specified, this
         * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's
         * explicitly set to `upcoming_invoice.
         */
        fun changeOption(): Optional<ChangeOption> =
            Optional.ofNullable(changeOption.getNullable("change_option"))

        /**
         * The date that the quantity change should take effect, localized to the customer's
         * timezone. Ifthis parameter is not passed in, the quantity change is effective according
         * to `change_option`.
         */
        fun effectiveDate(): Optional<LocalDate> =
            Optional.ofNullable(effectiveDate.getNullable("effective_date"))

        /** Price for which the quantity should be updated. Must be a fixed fee. */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Determines when the change takes effect. Note that if `effective_date` is specified, this
         * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's
         * explicitly set to `upcoming_invoice.
         */
        @JsonProperty("change_option")
        @ExcludeMissing
        fun _changeOption(): JsonField<ChangeOption> = changeOption

        /**
         * The date that the quantity change should take effect, localized to the customer's
         * timezone. Ifthis parameter is not passed in, the quantity change is effective according
         * to `change_option`.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SubscriptionUpdateFixedFeeQuantityBody = apply {
            if (validated) {
                return@apply
            }

            priceId()
            quantity()
            changeOption()
            effectiveDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var priceId: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var changeOption: JsonField<ChangeOption> = JsonMissing.of()
            private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                subscriptionUpdateFixedFeeQuantityBody: SubscriptionUpdateFixedFeeQuantityBody
            ) = apply {
                priceId = subscriptionUpdateFixedFeeQuantityBody.priceId
                quantity = subscriptionUpdateFixedFeeQuantityBody.quantity
                changeOption = subscriptionUpdateFixedFeeQuantityBody.changeOption
                effectiveDate = subscriptionUpdateFixedFeeQuantityBody.effectiveDate
                additionalProperties =
                    subscriptionUpdateFixedFeeQuantityBody.additionalProperties.toMutableMap()
            }

            /** Price for which the quantity should be updated. Must be a fixed fee. */
            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            /** Price for which the quantity should be updated. Must be a fixed fee. */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /**
             * Determines when the change takes effect. Note that if `effective_date` is specified,
             * this defaults to `effective_date`. Otherwise, this defaults to `immediate` unless
             * it's explicitly set to `upcoming_invoice.
             */
            fun changeOption(changeOption: ChangeOption) = changeOption(JsonField.of(changeOption))

            /**
             * Determines when the change takes effect. Note that if `effective_date` is specified,
             * this defaults to `effective_date`. Otherwise, this defaults to `immediate` unless
             * it's explicitly set to `upcoming_invoice.
             */
            fun changeOption(changeOption: JsonField<ChangeOption>) = apply {
                this.changeOption = changeOption
            }

            /**
             * The date that the quantity change should take effect, localized to the customer's
             * timezone. Ifthis parameter is not passed in, the quantity change is effective
             * according to `change_option`.
             */
            fun effectiveDate(effectiveDate: LocalDate?) =
                effectiveDate(JsonField.ofNullable(effectiveDate))

            /**
             * The date that the quantity change should take effect, localized to the customer's
             * timezone. Ifthis parameter is not passed in, the quantity change is effective
             * according to `change_option`.
             */
            fun effectiveDate(effectiveDate: Optional<LocalDate>) =
                effectiveDate(effectiveDate.orElse(null))

            /**
             * The date that the quantity change should take effect, localized to the customer's
             * timezone. Ifthis parameter is not passed in, the quantity change is effective
             * according to `change_option`.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
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

            fun build(): SubscriptionUpdateFixedFeeQuantityBody =
                SubscriptionUpdateFixedFeeQuantityBody(
                    checkRequired("priceId", priceId),
                    checkRequired("quantity", quantity),
                    changeOption,
                    effectiveDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubscriptionUpdateFixedFeeQuantityBody && priceId == other.priceId && quantity == other.quantity && changeOption == other.changeOption && effectiveDate == other.effectiveDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(priceId, quantity, changeOption, effectiveDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionUpdateFixedFeeQuantityBody{priceId=$priceId, quantity=$quantity, changeOption=$changeOption, effectiveDate=$effectiveDate, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var body: SubscriptionUpdateFixedFeeQuantityBody.Builder =
            SubscriptionUpdateFixedFeeQuantityBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            subscriptionUpdateFixedFeeQuantityParams: SubscriptionUpdateFixedFeeQuantityParams
        ) = apply {
            subscriptionId = subscriptionUpdateFixedFeeQuantityParams.subscriptionId
            body = subscriptionUpdateFixedFeeQuantityParams.body.toBuilder()
            additionalHeaders =
                subscriptionUpdateFixedFeeQuantityParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                subscriptionUpdateFixedFeeQuantityParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /** Price for which the quantity should be updated. Must be a fixed fee. */
        fun priceId(priceId: String) = apply { body.priceId(priceId) }

        /** Price for which the quantity should be updated. Must be a fixed fee. */
        fun priceId(priceId: JsonField<String>) = apply { body.priceId(priceId) }

        fun quantity(quantity: Double) = apply { body.quantity(quantity) }

        fun quantity(quantity: JsonField<Double>) = apply { body.quantity(quantity) }

        /**
         * Determines when the change takes effect. Note that if `effective_date` is specified, this
         * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's
         * explicitly set to `upcoming_invoice.
         */
        fun changeOption(changeOption: ChangeOption) = apply { body.changeOption(changeOption) }

        /**
         * Determines when the change takes effect. Note that if `effective_date` is specified, this
         * defaults to `effective_date`. Otherwise, this defaults to `immediate` unless it's
         * explicitly set to `upcoming_invoice.
         */
        fun changeOption(changeOption: JsonField<ChangeOption>) = apply {
            body.changeOption(changeOption)
        }

        /**
         * The date that the quantity change should take effect, localized to the customer's
         * timezone. Ifthis parameter is not passed in, the quantity change is effective according
         * to `change_option`.
         */
        fun effectiveDate(effectiveDate: LocalDate?) = apply { body.effectiveDate(effectiveDate) }

        /**
         * The date that the quantity change should take effect, localized to the customer's
         * timezone. Ifthis parameter is not passed in, the quantity change is effective according
         * to `change_option`.
         */
        fun effectiveDate(effectiveDate: Optional<LocalDate>) =
            effectiveDate(effectiveDate.orElse(null))

        /**
         * The date that the quantity change should take effect, localized to the customer's
         * timezone. Ifthis parameter is not passed in, the quantity change is effective according
         * to `change_option`.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            body.effectiveDate(effectiveDate)
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

        fun build(): SubscriptionUpdateFixedFeeQuantityParams =
            SubscriptionUpdateFixedFeeQuantityParams(
                checkRequired("subscriptionId", subscriptionId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class ChangeOption
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val IMMEDIATE = of("immediate")

            @JvmField val UPCOMING_INVOICE = of("upcoming_invoice")

            @JvmField val EFFECTIVE_DATE = of("effective_date")

            @JvmStatic fun of(value: String) = ChangeOption(JsonField.of(value))
        }

        enum class Known {
            IMMEDIATE,
            UPCOMING_INVOICE,
            EFFECTIVE_DATE,
        }

        enum class Value {
            IMMEDIATE,
            UPCOMING_INVOICE,
            EFFECTIVE_DATE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                IMMEDIATE -> Value.IMMEDIATE
                UPCOMING_INVOICE -> Value.UPCOMING_INVOICE
                EFFECTIVE_DATE -> Value.EFFECTIVE_DATE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                IMMEDIATE -> Known.IMMEDIATE
                UPCOMING_INVOICE -> Known.UPCOMING_INVOICE
                EFFECTIVE_DATE -> Known.EFFECTIVE_DATE
                else -> throw OrbInvalidDataException("Unknown ChangeOption: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChangeOption && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionUpdateFixedFeeQuantityParams && subscriptionId == other.subscriptionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionUpdateFixedFeeQuantityParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
