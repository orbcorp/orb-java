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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Redeem a coupon effective at a given time. */
class SubscriptionRedeemCouponParams
private constructor(
    private val subscriptionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): Optional<String> = Optional.ofNullable(subscriptionId)

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun changeOption(): ChangeOption = body.changeOption()

    /**
     * If false, this request will fail if it would void an issued invoice or create a credit note.
     * Consider using this as a safety mechanism if you do not expect existing invoices to be
     * changed.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun allowInvoiceCreditOrVoid(): Optional<Boolean> = body.allowInvoiceCreditOrVoid()

    /**
     * The date that the coupon discount should take effect. This parameter can only be passed if
     * the `change_option` is `requested_date`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun changeDate(): Optional<OffsetDateTime> = body.changeDate()

    /**
     * Coupon ID to be redeemed for this subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun couponId(): Optional<String> = body.couponId()

    /**
     * Redemption code of the coupon to be redeemed for this subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun couponRedemptionCode(): Optional<String> = body.couponRedemptionCode()

    /**
     * Returns the raw JSON value of [changeOption].
     *
     * Unlike [changeOption], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _changeOption(): JsonField<ChangeOption> = body._changeOption()

    /**
     * Returns the raw JSON value of [allowInvoiceCreditOrVoid].
     *
     * Unlike [allowInvoiceCreditOrVoid], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _allowInvoiceCreditOrVoid(): JsonField<Boolean> = body._allowInvoiceCreditOrVoid()

    /**
     * Returns the raw JSON value of [changeDate].
     *
     * Unlike [changeDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _changeDate(): JsonField<OffsetDateTime> = body._changeDate()

    /**
     * Returns the raw JSON value of [couponId].
     *
     * Unlike [couponId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _couponId(): JsonField<String> = body._couponId()

    /**
     * Returns the raw JSON value of [couponRedemptionCode].
     *
     * Unlike [couponRedemptionCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _couponRedemptionCode(): JsonField<String> = body._couponRedemptionCode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionRedeemCouponParams].
         *
         * The following fields are required:
         * ```java
         * .changeOption()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionRedeemCouponParams]. */
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionRedeemCouponParams: SubscriptionRedeemCouponParams) = apply {
            subscriptionId = subscriptionRedeemCouponParams.subscriptionId
            body = subscriptionRedeemCouponParams.body.toBuilder()
            additionalHeaders = subscriptionRedeemCouponParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionRedeemCouponParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        /** Alias for calling [Builder.subscriptionId] with `subscriptionId.orElse(null)`. */
        fun subscriptionId(subscriptionId: Optional<String>) =
            subscriptionId(subscriptionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [changeOption]
         * - [allowInvoiceCreditOrVoid]
         * - [changeDate]
         * - [couponId]
         * - [couponRedemptionCode]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun changeOption(changeOption: ChangeOption) = apply { body.changeOption(changeOption) }

        /**
         * Sets [Builder.changeOption] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changeOption] with a well-typed [ChangeOption] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun changeOption(changeOption: JsonField<ChangeOption>) = apply {
            body.changeOption(changeOption)
        }

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean?) = apply {
            body.allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid)
        }

        /**
         * Alias for [Builder.allowInvoiceCreditOrVoid].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean) =
            allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid as Boolean?)

        /**
         * Alias for calling [Builder.allowInvoiceCreditOrVoid] with
         * `allowInvoiceCreditOrVoid.orElse(null)`.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Optional<Boolean>) =
            allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid.getOrNull())

        /**
         * Sets [Builder.allowInvoiceCreditOrVoid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowInvoiceCreditOrVoid] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: JsonField<Boolean>) = apply {
            body.allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid)
        }

        /**
         * The date that the coupon discount should take effect. This parameter can only be passed
         * if the `change_option` is `requested_date`.
         */
        fun changeDate(changeDate: OffsetDateTime?) = apply { body.changeDate(changeDate) }

        /** Alias for calling [Builder.changeDate] with `changeDate.orElse(null)`. */
        fun changeDate(changeDate: Optional<OffsetDateTime>) = changeDate(changeDate.getOrNull())

        /**
         * Sets [Builder.changeDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changeDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun changeDate(changeDate: JsonField<OffsetDateTime>) = apply {
            body.changeDate(changeDate)
        }

        /** Coupon ID to be redeemed for this subscription. */
        fun couponId(couponId: String?) = apply { body.couponId(couponId) }

        /** Alias for calling [Builder.couponId] with `couponId.orElse(null)`. */
        fun couponId(couponId: Optional<String>) = couponId(couponId.getOrNull())

        /**
         * Sets [Builder.couponId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.couponId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun couponId(couponId: JsonField<String>) = apply { body.couponId(couponId) }

        /** Redemption code of the coupon to be redeemed for this subscription. */
        fun couponRedemptionCode(couponRedemptionCode: String?) = apply {
            body.couponRedemptionCode(couponRedemptionCode)
        }

        /**
         * Alias for calling [Builder.couponRedemptionCode] with
         * `couponRedemptionCode.orElse(null)`.
         */
        fun couponRedemptionCode(couponRedemptionCode: Optional<String>) =
            couponRedemptionCode(couponRedemptionCode.getOrNull())

        /**
         * Sets [Builder.couponRedemptionCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.couponRedemptionCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun couponRedemptionCode(couponRedemptionCode: JsonField<String>) = apply {
            body.couponRedemptionCode(couponRedemptionCode)
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

        /**
         * Returns an immutable instance of [SubscriptionRedeemCouponParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .changeOption()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionRedeemCouponParams =
            SubscriptionRedeemCouponParams(
                subscriptionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val changeOption: JsonField<ChangeOption>,
        private val allowInvoiceCreditOrVoid: JsonField<Boolean>,
        private val changeDate: JsonField<OffsetDateTime>,
        private val couponId: JsonField<String>,
        private val couponRedemptionCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("change_option")
            @ExcludeMissing
            changeOption: JsonField<ChangeOption> = JsonMissing.of(),
            @JsonProperty("allow_invoice_credit_or_void")
            @ExcludeMissing
            allowInvoiceCreditOrVoid: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("change_date")
            @ExcludeMissing
            changeDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("coupon_id")
            @ExcludeMissing
            couponId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("coupon_redemption_code")
            @ExcludeMissing
            couponRedemptionCode: JsonField<String> = JsonMissing.of(),
        ) : this(
            changeOption,
            allowInvoiceCreditOrVoid,
            changeDate,
            couponId,
            couponRedemptionCode,
            mutableMapOf(),
        )

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun changeOption(): ChangeOption = changeOption.getRequired("change_option")

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowInvoiceCreditOrVoid(): Optional<Boolean> =
            allowInvoiceCreditOrVoid.getOptional("allow_invoice_credit_or_void")

        /**
         * The date that the coupon discount should take effect. This parameter can only be passed
         * if the `change_option` is `requested_date`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun changeDate(): Optional<OffsetDateTime> = changeDate.getOptional("change_date")

        /**
         * Coupon ID to be redeemed for this subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun couponId(): Optional<String> = couponId.getOptional("coupon_id")

        /**
         * Redemption code of the coupon to be redeemed for this subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun couponRedemptionCode(): Optional<String> =
            couponRedemptionCode.getOptional("coupon_redemption_code")

        /**
         * Returns the raw JSON value of [changeOption].
         *
         * Unlike [changeOption], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("change_option")
        @ExcludeMissing
        fun _changeOption(): JsonField<ChangeOption> = changeOption

        /**
         * Returns the raw JSON value of [allowInvoiceCreditOrVoid].
         *
         * Unlike [allowInvoiceCreditOrVoid], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_invoice_credit_or_void")
        @ExcludeMissing
        fun _allowInvoiceCreditOrVoid(): JsonField<Boolean> = allowInvoiceCreditOrVoid

        /**
         * Returns the raw JSON value of [changeDate].
         *
         * Unlike [changeDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("change_date")
        @ExcludeMissing
        fun _changeDate(): JsonField<OffsetDateTime> = changeDate

        /**
         * Returns the raw JSON value of [couponId].
         *
         * Unlike [couponId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("coupon_id") @ExcludeMissing fun _couponId(): JsonField<String> = couponId

        /**
         * Returns the raw JSON value of [couponRedemptionCode].
         *
         * Unlike [couponRedemptionCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("coupon_redemption_code")
        @ExcludeMissing
        fun _couponRedemptionCode(): JsonField<String> = couponRedemptionCode

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .changeOption()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var changeOption: JsonField<ChangeOption>? = null
            private var allowInvoiceCreditOrVoid: JsonField<Boolean> = JsonMissing.of()
            private var changeDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var couponId: JsonField<String> = JsonMissing.of()
            private var couponRedemptionCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                changeOption = body.changeOption
                allowInvoiceCreditOrVoid = body.allowInvoiceCreditOrVoid
                changeDate = body.changeDate
                couponId = body.couponId
                couponRedemptionCode = body.couponRedemptionCode
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun changeOption(changeOption: ChangeOption) = changeOption(JsonField.of(changeOption))

            /**
             * Sets [Builder.changeOption] to an arbitrary JSON value.
             *
             * You should usually call [Builder.changeOption] with a well-typed [ChangeOption] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun changeOption(changeOption: JsonField<ChangeOption>) = apply {
                this.changeOption = changeOption
            }

            /**
             * If false, this request will fail if it would void an issued invoice or create a
             * credit note. Consider using this as a safety mechanism if you do not expect existing
             * invoices to be changed.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean?) =
                allowInvoiceCreditOrVoid(JsonField.ofNullable(allowInvoiceCreditOrVoid))

            /**
             * Alias for [Builder.allowInvoiceCreditOrVoid].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean) =
                allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid as Boolean?)

            /**
             * Alias for calling [Builder.allowInvoiceCreditOrVoid] with
             * `allowInvoiceCreditOrVoid.orElse(null)`.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Optional<Boolean>) =
                allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid.getOrNull())

            /**
             * Sets [Builder.allowInvoiceCreditOrVoid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowInvoiceCreditOrVoid] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: JsonField<Boolean>) = apply {
                this.allowInvoiceCreditOrVoid = allowInvoiceCreditOrVoid
            }

            /**
             * The date that the coupon discount should take effect. This parameter can only be
             * passed if the `change_option` is `requested_date`.
             */
            fun changeDate(changeDate: OffsetDateTime?) =
                changeDate(JsonField.ofNullable(changeDate))

            /** Alias for calling [Builder.changeDate] with `changeDate.orElse(null)`. */
            fun changeDate(changeDate: Optional<OffsetDateTime>) =
                changeDate(changeDate.getOrNull())

            /**
             * Sets [Builder.changeDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.changeDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun changeDate(changeDate: JsonField<OffsetDateTime>) = apply {
                this.changeDate = changeDate
            }

            /** Coupon ID to be redeemed for this subscription. */
            fun couponId(couponId: String?) = couponId(JsonField.ofNullable(couponId))

            /** Alias for calling [Builder.couponId] with `couponId.orElse(null)`. */
            fun couponId(couponId: Optional<String>) = couponId(couponId.getOrNull())

            /**
             * Sets [Builder.couponId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.couponId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun couponId(couponId: JsonField<String>) = apply { this.couponId = couponId }

            /** Redemption code of the coupon to be redeemed for this subscription. */
            fun couponRedemptionCode(couponRedemptionCode: String?) =
                couponRedemptionCode(JsonField.ofNullable(couponRedemptionCode))

            /**
             * Alias for calling [Builder.couponRedemptionCode] with
             * `couponRedemptionCode.orElse(null)`.
             */
            fun couponRedemptionCode(couponRedemptionCode: Optional<String>) =
                couponRedemptionCode(couponRedemptionCode.getOrNull())

            /**
             * Sets [Builder.couponRedemptionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.couponRedemptionCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun couponRedemptionCode(couponRedemptionCode: JsonField<String>) = apply {
                this.couponRedemptionCode = couponRedemptionCode
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .changeOption()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("changeOption", changeOption),
                    allowInvoiceCreditOrVoid,
                    changeDate,
                    couponId,
                    couponRedemptionCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            changeOption().validate()
            allowInvoiceCreditOrVoid()
            changeDate()
            couponId()
            couponRedemptionCode()
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
            (changeOption.asKnown().getOrNull()?.validity() ?: 0) +
                (if (allowInvoiceCreditOrVoid.asKnown().isPresent) 1 else 0) +
                (if (changeDate.asKnown().isPresent) 1 else 0) +
                (if (couponId.asKnown().isPresent) 1 else 0) +
                (if (couponRedemptionCode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && changeOption == other.changeOption && allowInvoiceCreditOrVoid == other.allowInvoiceCreditOrVoid && changeDate == other.changeDate && couponId == other.couponId && couponRedemptionCode == other.couponRedemptionCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(changeOption, allowInvoiceCreditOrVoid, changeDate, couponId, couponRedemptionCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{changeOption=$changeOption, allowInvoiceCreditOrVoid=$allowInvoiceCreditOrVoid, changeDate=$changeDate, couponId=$couponId, couponRedemptionCode=$couponRedemptionCode, additionalProperties=$additionalProperties}"
    }

    class ChangeOption @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val REQUESTED_DATE = of("requested_date")

            @JvmField val END_OF_SUBSCRIPTION_TERM = of("end_of_subscription_term")

            @JvmField val IMMEDIATE = of("immediate")

            @JvmStatic fun of(value: String) = ChangeOption(JsonField.of(value))
        }

        /** An enum containing [ChangeOption]'s known values. */
        enum class Known {
            REQUESTED_DATE,
            END_OF_SUBSCRIPTION_TERM,
            IMMEDIATE,
        }

        /**
         * An enum containing [ChangeOption]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChangeOption] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REQUESTED_DATE,
            END_OF_SUBSCRIPTION_TERM,
            IMMEDIATE,
            /**
             * An enum member indicating that [ChangeOption] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                REQUESTED_DATE -> Value.REQUESTED_DATE
                END_OF_SUBSCRIPTION_TERM -> Value.END_OF_SUBSCRIPTION_TERM
                IMMEDIATE -> Value.IMMEDIATE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                REQUESTED_DATE -> Known.REQUESTED_DATE
                END_OF_SUBSCRIPTION_TERM -> Known.END_OF_SUBSCRIPTION_TERM
                IMMEDIATE -> Known.IMMEDIATE
                else -> throw OrbInvalidDataException("Unknown ChangeOption: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { OrbInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): ChangeOption = apply {
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

            return /* spotless:off */ other is ChangeOption && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionRedeemCouponParams && subscriptionId == other.subscriptionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionRedeemCouponParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
