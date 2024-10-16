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
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class SubscriptionSchedulePlanChangeParams
constructor(
    private val subscriptionId: String,
    private val changeOption: ChangeOption,
    private val alignBillingWithPlanChangeDate: Boolean?,
    private val autoCollection: Boolean?,
    private val billingCycleAlignment: BillingCycleAlignment?,
    private val changeDate: OffsetDateTime?,
    private val couponRedemptionCode: String?,
    private val creditsOverageRate: Double?,
    private val defaultInvoiceMemo: String?,
    private val externalPlanId: String?,
    private val initialPhaseOrder: Long?,
    private val invoicingThreshold: String?,
    private val netTerms: Long?,
    private val perCreditOverageAmount: Double?,
    private val planId: String?,
    private val priceOverrides: List<PriceOverride>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun subscriptionId(): String = subscriptionId

    fun changeOption(): ChangeOption = changeOption

    fun alignBillingWithPlanChangeDate(): Optional<Boolean> =
        Optional.ofNullable(alignBillingWithPlanChangeDate)

    fun autoCollection(): Optional<Boolean> = Optional.ofNullable(autoCollection)

    fun billingCycleAlignment(): Optional<BillingCycleAlignment> =
        Optional.ofNullable(billingCycleAlignment)

    fun changeDate(): Optional<OffsetDateTime> = Optional.ofNullable(changeDate)

    fun couponRedemptionCode(): Optional<String> = Optional.ofNullable(couponRedemptionCode)

    fun creditsOverageRate(): Optional<Double> = Optional.ofNullable(creditsOverageRate)

    fun defaultInvoiceMemo(): Optional<String> = Optional.ofNullable(defaultInvoiceMemo)

    fun externalPlanId(): Optional<String> = Optional.ofNullable(externalPlanId)

    fun initialPhaseOrder(): Optional<Long> = Optional.ofNullable(initialPhaseOrder)

    fun invoicingThreshold(): Optional<String> = Optional.ofNullable(invoicingThreshold)

    fun netTerms(): Optional<Long> = Optional.ofNullable(netTerms)

    fun perCreditOverageAmount(): Optional<Double> = Optional.ofNullable(perCreditOverageAmount)

    fun planId(): Optional<String> = Optional.ofNullable(planId)

    fun priceOverrides(): Optional<List<PriceOverride>> = Optional.ofNullable(priceOverrides)

    @JvmSynthetic
    internal fun getBody(): SubscriptionSchedulePlanChangeBody {
        return SubscriptionSchedulePlanChangeBody(
            changeOption,
            alignBillingWithPlanChangeDate,
            autoCollection,
            billingCycleAlignment,
            changeDate,
            couponRedemptionCode,
            creditsOverageRate,
            defaultInvoiceMemo,
            externalPlanId,
            initialPhaseOrder,
            invoicingThreshold,
            netTerms,
            perCreditOverageAmount,
            planId,
            priceOverrides,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SubscriptionSchedulePlanChangeBody.Builder::class)
    @NoAutoDetect
    class SubscriptionSchedulePlanChangeBody
    internal constructor(
        private val changeOption: ChangeOption?,
        private val alignBillingWithPlanChangeDate: Boolean?,
        private val autoCollection: Boolean?,
        private val billingCycleAlignment: BillingCycleAlignment?,
        private val changeDate: OffsetDateTime?,
        private val couponRedemptionCode: String?,
        private val creditsOverageRate: Double?,
        private val defaultInvoiceMemo: String?,
        private val externalPlanId: String?,
        private val initialPhaseOrder: Long?,
        private val invoicingThreshold: String?,
        private val netTerms: Long?,
        private val perCreditOverageAmount: Double?,
        private val planId: String?,
        private val priceOverrides: List<PriceOverride>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("change_option") fun changeOption(): ChangeOption? = changeOption

        /**
         * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
         * with the plan change's effective date.
         */
        @JsonProperty("align_billing_with_plan_change_date")
        fun alignBillingWithPlanChangeDate(): Boolean? = alignBillingWithPlanChangeDate

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. If not specified, this defaults to the
         * behavior configured for this customer.
         */
        @JsonProperty("auto_collection") fun autoCollection(): Boolean? = autoCollection

        /**
         * Reset billing periods to be aligned with the plan change's effective date or start of the
         * month. Defaults to `unchanged` which keeps subscription's existing billing cycle
         * alignment.
         */
        @JsonProperty("billing_cycle_alignment")
        fun billingCycleAlignment(): BillingCycleAlignment? = billingCycleAlignment

        /**
         * The date that the plan change should take effect. This parameter can only be passed if
         * the `change_option` is `requested_date`.
         */
        @JsonProperty("change_date") fun changeDate(): OffsetDateTime? = changeDate

        /**
         * Redemption code to be used for this subscription. If the coupon cannot be found by its
         * redemption code, or cannot be redeemed, an error response will be returned and the
         * subscription creation or plan change will not be scheduled.
         */
        @JsonProperty("coupon_redemption_code")
        fun couponRedemptionCode(): String? = couponRedemptionCode

        @JsonProperty("credits_overage_rate") fun creditsOverageRate(): Double? = creditsOverageRate

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        @JsonProperty("default_invoice_memo") fun defaultInvoiceMemo(): String? = defaultInvoiceMemo

        /**
         * The external_plan_id of the plan that the given subscription should be switched to. Note
         * that either this property or `plan_id` must be specified.
         */
        @JsonProperty("external_plan_id") fun externalPlanId(): String? = externalPlanId

        /** The phase of the plan to start with */
        @JsonProperty("initial_phase_order") fun initialPhaseOrder(): Long? = initialPhaseOrder

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will be issued
         * for the subscription. If not specified, invoices will only be issued at the end of the
         * billing period.
         */
        @JsonProperty("invoicing_threshold") fun invoicingThreshold(): String? = invoicingThreshold

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0. If not
         * provided, this defaults to the value specified in the plan.
         */
        @JsonProperty("net_terms") fun netTerms(): Long? = netTerms

        @JsonProperty("per_credit_overage_amount")
        fun perCreditOverageAmount(): Double? = perCreditOverageAmount

        /**
         * The plan that the given subscription should be switched to. Note that either this
         * property or `external_plan_id` must be specified.
         */
        @JsonProperty("plan_id") fun planId(): String? = planId

        /** Optionally provide a list of overrides for prices on the plan */
        @JsonProperty("price_overrides") fun priceOverrides(): List<PriceOverride>? = priceOverrides

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var changeOption: ChangeOption? = null
            private var alignBillingWithPlanChangeDate: Boolean? = null
            private var autoCollection: Boolean? = null
            private var billingCycleAlignment: BillingCycleAlignment? = null
            private var changeDate: OffsetDateTime? = null
            private var couponRedemptionCode: String? = null
            private var creditsOverageRate: Double? = null
            private var defaultInvoiceMemo: String? = null
            private var externalPlanId: String? = null
            private var initialPhaseOrder: Long? = null
            private var invoicingThreshold: String? = null
            private var netTerms: Long? = null
            private var perCreditOverageAmount: Double? = null
            private var planId: String? = null
            private var priceOverrides: List<PriceOverride>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                subscriptionSchedulePlanChangeBody: SubscriptionSchedulePlanChangeBody
            ) = apply {
                this.changeOption = subscriptionSchedulePlanChangeBody.changeOption
                this.alignBillingWithPlanChangeDate =
                    subscriptionSchedulePlanChangeBody.alignBillingWithPlanChangeDate
                this.autoCollection = subscriptionSchedulePlanChangeBody.autoCollection
                this.billingCycleAlignment =
                    subscriptionSchedulePlanChangeBody.billingCycleAlignment
                this.changeDate = subscriptionSchedulePlanChangeBody.changeDate
                this.couponRedemptionCode = subscriptionSchedulePlanChangeBody.couponRedemptionCode
                this.creditsOverageRate = subscriptionSchedulePlanChangeBody.creditsOverageRate
                this.defaultInvoiceMemo = subscriptionSchedulePlanChangeBody.defaultInvoiceMemo
                this.externalPlanId = subscriptionSchedulePlanChangeBody.externalPlanId
                this.initialPhaseOrder = subscriptionSchedulePlanChangeBody.initialPhaseOrder
                this.invoicingThreshold = subscriptionSchedulePlanChangeBody.invoicingThreshold
                this.netTerms = subscriptionSchedulePlanChangeBody.netTerms
                this.perCreditOverageAmount =
                    subscriptionSchedulePlanChangeBody.perCreditOverageAmount
                this.planId = subscriptionSchedulePlanChangeBody.planId
                this.priceOverrides = subscriptionSchedulePlanChangeBody.priceOverrides
                additionalProperties(subscriptionSchedulePlanChangeBody.additionalProperties)
            }

            @JsonProperty("change_option")
            fun changeOption(changeOption: ChangeOption) = apply {
                this.changeOption = changeOption
            }

            /**
             * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
             * with the plan change's effective date.
             */
            @JsonProperty("align_billing_with_plan_change_date")
            fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: Boolean) = apply {
                this.alignBillingWithPlanChangeDate = alignBillingWithPlanChangeDate
            }

            /**
             * Determines whether issued invoices for this subscription will automatically be
             * charged with the saved payment method on the due date. If not specified, this
             * defaults to the behavior configured for this customer.
             */
            @JsonProperty("auto_collection")
            fun autoCollection(autoCollection: Boolean) = apply {
                this.autoCollection = autoCollection
            }

            /**
             * Reset billing periods to be aligned with the plan change's effective date or start of
             * the month. Defaults to `unchanged` which keeps subscription's existing billing cycle
             * alignment.
             */
            @JsonProperty("billing_cycle_alignment")
            fun billingCycleAlignment(billingCycleAlignment: BillingCycleAlignment) = apply {
                this.billingCycleAlignment = billingCycleAlignment
            }

            /**
             * The date that the plan change should take effect. This parameter can only be passed
             * if the `change_option` is `requested_date`.
             */
            @JsonProperty("change_date")
            fun changeDate(changeDate: OffsetDateTime) = apply { this.changeDate = changeDate }

            /**
             * Redemption code to be used for this subscription. If the coupon cannot be found by
             * its redemption code, or cannot be redeemed, an error response will be returned and
             * the subscription creation or plan change will not be scheduled.
             */
            @JsonProperty("coupon_redemption_code")
            fun couponRedemptionCode(couponRedemptionCode: String) = apply {
                this.couponRedemptionCode = couponRedemptionCode
            }

            @JsonProperty("credits_overage_rate")
            fun creditsOverageRate(creditsOverageRate: Double) = apply {
                this.creditsOverageRate = creditsOverageRate
            }

            /**
             * Determines the default memo on this subscription's invoices. Note that if this is not
             * provided, it is determined by the plan configuration.
             */
            @JsonProperty("default_invoice_memo")
            fun defaultInvoiceMemo(defaultInvoiceMemo: String) = apply {
                this.defaultInvoiceMemo = defaultInvoiceMemo
            }

            /**
             * The external_plan_id of the plan that the given subscription should be switched to.
             * Note that either this property or `plan_id` must be specified.
             */
            @JsonProperty("external_plan_id")
            fun externalPlanId(externalPlanId: String) = apply {
                this.externalPlanId = externalPlanId
            }

            /** The phase of the plan to start with */
            @JsonProperty("initial_phase_order")
            fun initialPhaseOrder(initialPhaseOrder: Long) = apply {
                this.initialPhaseOrder = initialPhaseOrder
            }

            /**
             * When this subscription's accrued usage reaches this threshold, an invoice will be
             * issued for the subscription. If not specified, invoices will only be issued at the
             * end of the billing period.
             */
            @JsonProperty("invoicing_threshold")
            fun invoicingThreshold(invoicingThreshold: String) = apply {
                this.invoicingThreshold = invoicingThreshold
            }

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0. If not
             * provided, this defaults to the value specified in the plan.
             */
            @JsonProperty("net_terms")
            fun netTerms(netTerms: Long) = apply { this.netTerms = netTerms }

            @JsonProperty("per_credit_overage_amount")
            fun perCreditOverageAmount(perCreditOverageAmount: Double) = apply {
                this.perCreditOverageAmount = perCreditOverageAmount
            }

            /**
             * The plan that the given subscription should be switched to. Note that either this
             * property or `external_plan_id` must be specified.
             */
            @JsonProperty("plan_id") fun planId(planId: String) = apply { this.planId = planId }

            /** Optionally provide a list of overrides for prices on the plan */
            @JsonProperty("price_overrides")
            fun priceOverrides(priceOverrides: List<PriceOverride>) = apply {
                this.priceOverrides = priceOverrides
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

            fun build(): SubscriptionSchedulePlanChangeBody =
                SubscriptionSchedulePlanChangeBody(
                    checkNotNull(changeOption) { "`changeOption` is required but was not set" },
                    alignBillingWithPlanChangeDate,
                    autoCollection,
                    billingCycleAlignment,
                    changeDate,
                    couponRedemptionCode,
                    creditsOverageRate,
                    defaultInvoiceMemo,
                    externalPlanId,
                    initialPhaseOrder,
                    invoicingThreshold,
                    netTerms,
                    perCreditOverageAmount,
                    planId,
                    priceOverrides?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubscriptionSchedulePlanChangeBody && this.changeOption == other.changeOption && this.alignBillingWithPlanChangeDate == other.alignBillingWithPlanChangeDate && this.autoCollection == other.autoCollection && this.billingCycleAlignment == other.billingCycleAlignment && this.changeDate == other.changeDate && this.couponRedemptionCode == other.couponRedemptionCode && this.creditsOverageRate == other.creditsOverageRate && this.defaultInvoiceMemo == other.defaultInvoiceMemo && this.externalPlanId == other.externalPlanId && this.initialPhaseOrder == other.initialPhaseOrder && this.invoicingThreshold == other.invoicingThreshold && this.netTerms == other.netTerms && this.perCreditOverageAmount == other.perCreditOverageAmount && this.planId == other.planId && this.priceOverrides == other.priceOverrides && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(changeOption, alignBillingWithPlanChangeDate, autoCollection, billingCycleAlignment, changeDate, couponRedemptionCode, creditsOverageRate, defaultInvoiceMemo, externalPlanId, initialPhaseOrder, invoicingThreshold, netTerms, perCreditOverageAmount, planId, priceOverrides, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SubscriptionSchedulePlanChangeBody{changeOption=$changeOption, alignBillingWithPlanChangeDate=$alignBillingWithPlanChangeDate, autoCollection=$autoCollection, billingCycleAlignment=$billingCycleAlignment, changeDate=$changeDate, couponRedemptionCode=$couponRedemptionCode, creditsOverageRate=$creditsOverageRate, defaultInvoiceMemo=$defaultInvoiceMemo, externalPlanId=$externalPlanId, initialPhaseOrder=$initialPhaseOrder, invoicingThreshold=$invoicingThreshold, netTerms=$netTerms, perCreditOverageAmount=$perCreditOverageAmount, planId=$planId, priceOverrides=$priceOverrides, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionSchedulePlanChangeParams && this.subscriptionId == other.subscriptionId && this.changeOption == other.changeOption && this.alignBillingWithPlanChangeDate == other.alignBillingWithPlanChangeDate && this.autoCollection == other.autoCollection && this.billingCycleAlignment == other.billingCycleAlignment && this.changeDate == other.changeDate && this.couponRedemptionCode == other.couponRedemptionCode && this.creditsOverageRate == other.creditsOverageRate && this.defaultInvoiceMemo == other.defaultInvoiceMemo && this.externalPlanId == other.externalPlanId && this.initialPhaseOrder == other.initialPhaseOrder && this.invoicingThreshold == other.invoicingThreshold && this.netTerms == other.netTerms && this.perCreditOverageAmount == other.perCreditOverageAmount && this.planId == other.planId && this.priceOverrides == other.priceOverrides && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(subscriptionId, changeOption, alignBillingWithPlanChangeDate, autoCollection, billingCycleAlignment, changeDate, couponRedemptionCode, creditsOverageRate, defaultInvoiceMemo, externalPlanId, initialPhaseOrder, invoicingThreshold, netTerms, perCreditOverageAmount, planId, priceOverrides, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SubscriptionSchedulePlanChangeParams{subscriptionId=$subscriptionId, changeOption=$changeOption, alignBillingWithPlanChangeDate=$alignBillingWithPlanChangeDate, autoCollection=$autoCollection, billingCycleAlignment=$billingCycleAlignment, changeDate=$changeDate, couponRedemptionCode=$couponRedemptionCode, creditsOverageRate=$creditsOverageRate, defaultInvoiceMemo=$defaultInvoiceMemo, externalPlanId=$externalPlanId, initialPhaseOrder=$initialPhaseOrder, invoicingThreshold=$invoicingThreshold, netTerms=$netTerms, perCreditOverageAmount=$perCreditOverageAmount, planId=$planId, priceOverrides=$priceOverrides, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var changeOption: ChangeOption? = null
        private var alignBillingWithPlanChangeDate: Boolean? = null
        private var autoCollection: Boolean? = null
        private var billingCycleAlignment: BillingCycleAlignment? = null
        private var changeDate: OffsetDateTime? = null
        private var couponRedemptionCode: String? = null
        private var creditsOverageRate: Double? = null
        private var defaultInvoiceMemo: String? = null
        private var externalPlanId: String? = null
        private var initialPhaseOrder: Long? = null
        private var invoicingThreshold: String? = null
        private var netTerms: Long? = null
        private var perCreditOverageAmount: Double? = null
        private var planId: String? = null
        private var priceOverrides: MutableList<PriceOverride> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            subscriptionSchedulePlanChangeParams: SubscriptionSchedulePlanChangeParams
        ) = apply {
            this.subscriptionId = subscriptionSchedulePlanChangeParams.subscriptionId
            this.changeOption = subscriptionSchedulePlanChangeParams.changeOption
            this.alignBillingWithPlanChangeDate =
                subscriptionSchedulePlanChangeParams.alignBillingWithPlanChangeDate
            this.autoCollection = subscriptionSchedulePlanChangeParams.autoCollection
            this.billingCycleAlignment = subscriptionSchedulePlanChangeParams.billingCycleAlignment
            this.changeDate = subscriptionSchedulePlanChangeParams.changeDate
            this.couponRedemptionCode = subscriptionSchedulePlanChangeParams.couponRedemptionCode
            this.creditsOverageRate = subscriptionSchedulePlanChangeParams.creditsOverageRate
            this.defaultInvoiceMemo = subscriptionSchedulePlanChangeParams.defaultInvoiceMemo
            this.externalPlanId = subscriptionSchedulePlanChangeParams.externalPlanId
            this.initialPhaseOrder = subscriptionSchedulePlanChangeParams.initialPhaseOrder
            this.invoicingThreshold = subscriptionSchedulePlanChangeParams.invoicingThreshold
            this.netTerms = subscriptionSchedulePlanChangeParams.netTerms
            this.perCreditOverageAmount =
                subscriptionSchedulePlanChangeParams.perCreditOverageAmount
            this.planId = subscriptionSchedulePlanChangeParams.planId
            this.priceOverrides(subscriptionSchedulePlanChangeParams.priceOverrides ?: listOf())
            additionalQueryParams(subscriptionSchedulePlanChangeParams.additionalQueryParams)
            additionalHeaders(subscriptionSchedulePlanChangeParams.additionalHeaders)
            additionalBodyProperties(subscriptionSchedulePlanChangeParams.additionalBodyProperties)
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        fun changeOption(changeOption: ChangeOption) = apply { this.changeOption = changeOption }

        /**
         * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
         * with the plan change's effective date.
         */
        fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: Boolean) = apply {
            this.alignBillingWithPlanChangeDate = alignBillingWithPlanChangeDate
        }

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. If not specified, this defaults to the
         * behavior configured for this customer.
         */
        fun autoCollection(autoCollection: Boolean) = apply { this.autoCollection = autoCollection }

        /**
         * Reset billing periods to be aligned with the plan change's effective date or start of the
         * month. Defaults to `unchanged` which keeps subscription's existing billing cycle
         * alignment.
         */
        fun billingCycleAlignment(billingCycleAlignment: BillingCycleAlignment) = apply {
            this.billingCycleAlignment = billingCycleAlignment
        }

        /**
         * The date that the plan change should take effect. This parameter can only be passed if
         * the `change_option` is `requested_date`.
         */
        fun changeDate(changeDate: OffsetDateTime) = apply { this.changeDate = changeDate }

        /**
         * Redemption code to be used for this subscription. If the coupon cannot be found by its
         * redemption code, or cannot be redeemed, an error response will be returned and the
         * subscription creation or plan change will not be scheduled.
         */
        fun couponRedemptionCode(couponRedemptionCode: String) = apply {
            this.couponRedemptionCode = couponRedemptionCode
        }

        fun creditsOverageRate(creditsOverageRate: Double) = apply {
            this.creditsOverageRate = creditsOverageRate
        }

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String) = apply {
            this.defaultInvoiceMemo = defaultInvoiceMemo
        }

        /**
         * The external_plan_id of the plan that the given subscription should be switched to. Note
         * that either this property or `plan_id` must be specified.
         */
        fun externalPlanId(externalPlanId: String) = apply { this.externalPlanId = externalPlanId }

        /** The phase of the plan to start with */
        fun initialPhaseOrder(initialPhaseOrder: Long) = apply {
            this.initialPhaseOrder = initialPhaseOrder
        }

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will be issued
         * for the subscription. If not specified, invoices will only be issued at the end of the
         * billing period.
         */
        fun invoicingThreshold(invoicingThreshold: String) = apply {
            this.invoicingThreshold = invoicingThreshold
        }

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0. If not
         * provided, this defaults to the value specified in the plan.
         */
        fun netTerms(netTerms: Long) = apply { this.netTerms = netTerms }

        fun perCreditOverageAmount(perCreditOverageAmount: Double) = apply {
            this.perCreditOverageAmount = perCreditOverageAmount
        }

        /**
         * The plan that the given subscription should be switched to. Note that either this
         * property or `external_plan_id` must be specified.
         */
        fun planId(planId: String) = apply { this.planId = planId }

        /** Optionally provide a list of overrides for prices on the plan */
        fun priceOverrides(priceOverrides: List<PriceOverride>) = apply {
            this.priceOverrides.clear()
            this.priceOverrides.addAll(priceOverrides)
        }

        /** Optionally provide a list of overrides for prices on the plan */
        fun addPriceOverride(priceOverride: PriceOverride) = apply {
            this.priceOverrides.add(priceOverride)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

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

        fun build(): SubscriptionSchedulePlanChangeParams =
            SubscriptionSchedulePlanChangeParams(
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
                checkNotNull(changeOption) { "`changeOption` is required but was not set" },
                alignBillingWithPlanChangeDate,
                autoCollection,
                billingCycleAlignment,
                changeDate,
                couponRedemptionCode,
                creditsOverageRate,
                defaultInvoiceMemo,
                externalPlanId,
                initialPhaseOrder,
                invoicingThreshold,
                netTerms,
                perCreditOverageAmount,
                planId,
                if (priceOverrides.size == 0) null else priceOverrides.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class ChangeOption
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChangeOption && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val REQUESTED_DATE = ChangeOption(JsonField.of("requested_date"))

            @JvmField
            val END_OF_SUBSCRIPTION_TERM = ChangeOption(JsonField.of("end_of_subscription_term"))

            @JvmField val IMMEDIATE = ChangeOption(JsonField.of("immediate"))

            @JvmStatic fun of(value: String) = ChangeOption(JsonField.of(value))
        }

        enum class Known {
            REQUESTED_DATE,
            END_OF_SUBSCRIPTION_TERM,
            IMMEDIATE,
        }

        enum class Value {
            REQUESTED_DATE,
            END_OF_SUBSCRIPTION_TERM,
            IMMEDIATE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                REQUESTED_DATE -> Value.REQUESTED_DATE
                END_OF_SUBSCRIPTION_TERM -> Value.END_OF_SUBSCRIPTION_TERM
                IMMEDIATE -> Value.IMMEDIATE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                REQUESTED_DATE -> Known.REQUESTED_DATE
                END_OF_SUBSCRIPTION_TERM -> Known.END_OF_SUBSCRIPTION_TERM
                IMMEDIATE -> Known.IMMEDIATE
                else -> throw OrbInvalidDataException("Unknown ChangeOption: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class BillingCycleAlignment
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingCycleAlignment && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val UNCHANGED = BillingCycleAlignment(JsonField.of("unchanged"))

            @JvmField val PLAN_CHANGE_DATE = BillingCycleAlignment(JsonField.of("plan_change_date"))

            @JvmField val START_OF_MONTH = BillingCycleAlignment(JsonField.of("start_of_month"))

            @JvmStatic fun of(value: String) = BillingCycleAlignment(JsonField.of(value))
        }

        enum class Known {
            UNCHANGED,
            PLAN_CHANGE_DATE,
            START_OF_MONTH,
        }

        enum class Value {
            UNCHANGED,
            PLAN_CHANGE_DATE,
            START_OF_MONTH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                UNCHANGED -> Value.UNCHANGED
                PLAN_CHANGE_DATE -> Value.PLAN_CHANGE_DATE
                START_OF_MONTH -> Value.START_OF_MONTH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                UNCHANGED -> Known.UNCHANGED
                PLAN_CHANGE_DATE -> Known.PLAN_CHANGE_DATE
                START_OF_MONTH -> Known.START_OF_MONTH
                else -> throw OrbInvalidDataException("Unknown BillingCycleAlignment: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(using = PriceOverride.Deserializer::class)
    @JsonSerialize(using = PriceOverride.Serializer::class)
    class PriceOverride
    private constructor(
        private val overrideUnitPrice: OverrideUnitPrice? = null,
        private val overridePackagePrice: OverridePackagePrice? = null,
        private val overrideMatrixPrice: OverrideMatrixPrice? = null,
        private val overrideTieredPrice: OverrideTieredPrice? = null,
        private val overrideTieredBpsPrice: OverrideTieredBpsPrice? = null,
        private val overrideBpsPrice: OverrideBpsPrice? = null,
        private val overrideBulkBpsPrice: OverrideBulkBpsPrice? = null,
        private val overrideBulkPrice: OverrideBulkPrice? = null,
        private val overrideThresholdTotalAmountPrice: OverrideThresholdTotalAmountPrice? = null,
        private val overrideTieredPackagePrice: OverrideTieredPackagePrice? = null,
        private val overrideTieredWithMinimumPrice: OverrideTieredWithMinimumPrice? = null,
        private val overridePackageWithAllocationPrice: OverridePackageWithAllocationPrice? = null,
        private val overrideUnitWithPercentPrice: OverrideUnitWithPercentPrice? = null,
        private val overrideGroupedAllocationPrice: OverrideGroupedAllocationPrice? = null,
        private val overrideGroupedWithProratedMinimumPrice:
            OverrideGroupedWithProratedMinimumPrice? =
            null,
        private val overrideGroupedWithMeteredMinimumPrice:
            OverrideGroupedWithMeteredMinimumPrice? =
            null,
        private val overrideBulkWithProrationPrice: OverrideBulkWithProrationPrice? = null,
        private val overrideUnitWithProrationPrice: OverrideUnitWithProrationPrice? = null,
        private val overrideTieredWithProrationPrice: OverrideTieredWithProrationPrice? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun overrideUnitPrice(): Optional<OverrideUnitPrice> =
            Optional.ofNullable(overrideUnitPrice)

        fun overridePackagePrice(): Optional<OverridePackagePrice> =
            Optional.ofNullable(overridePackagePrice)

        fun overrideMatrixPrice(): Optional<OverrideMatrixPrice> =
            Optional.ofNullable(overrideMatrixPrice)

        fun overrideTieredPrice(): Optional<OverrideTieredPrice> =
            Optional.ofNullable(overrideTieredPrice)

        fun overrideTieredBpsPrice(): Optional<OverrideTieredBpsPrice> =
            Optional.ofNullable(overrideTieredBpsPrice)

        fun overrideBpsPrice(): Optional<OverrideBpsPrice> = Optional.ofNullable(overrideBpsPrice)

        fun overrideBulkBpsPrice(): Optional<OverrideBulkBpsPrice> =
            Optional.ofNullable(overrideBulkBpsPrice)

        fun overrideBulkPrice(): Optional<OverrideBulkPrice> =
            Optional.ofNullable(overrideBulkPrice)

        fun overrideThresholdTotalAmountPrice(): Optional<OverrideThresholdTotalAmountPrice> =
            Optional.ofNullable(overrideThresholdTotalAmountPrice)

        fun overrideTieredPackagePrice(): Optional<OverrideTieredPackagePrice> =
            Optional.ofNullable(overrideTieredPackagePrice)

        fun overrideTieredWithMinimumPrice(): Optional<OverrideTieredWithMinimumPrice> =
            Optional.ofNullable(overrideTieredWithMinimumPrice)

        fun overridePackageWithAllocationPrice(): Optional<OverridePackageWithAllocationPrice> =
            Optional.ofNullable(overridePackageWithAllocationPrice)

        fun overrideUnitWithPercentPrice(): Optional<OverrideUnitWithPercentPrice> =
            Optional.ofNullable(overrideUnitWithPercentPrice)

        fun overrideGroupedAllocationPrice(): Optional<OverrideGroupedAllocationPrice> =
            Optional.ofNullable(overrideGroupedAllocationPrice)

        fun overrideGroupedWithProratedMinimumPrice():
            Optional<OverrideGroupedWithProratedMinimumPrice> =
            Optional.ofNullable(overrideGroupedWithProratedMinimumPrice)

        fun overrideGroupedWithMeteredMinimumPrice():
            Optional<OverrideGroupedWithMeteredMinimumPrice> =
            Optional.ofNullable(overrideGroupedWithMeteredMinimumPrice)

        fun overrideBulkWithProrationPrice(): Optional<OverrideBulkWithProrationPrice> =
            Optional.ofNullable(overrideBulkWithProrationPrice)

        fun overrideUnitWithProrationPrice(): Optional<OverrideUnitWithProrationPrice> =
            Optional.ofNullable(overrideUnitWithProrationPrice)

        fun overrideTieredWithProrationPrice(): Optional<OverrideTieredWithProrationPrice> =
            Optional.ofNullable(overrideTieredWithProrationPrice)

        fun isOverrideUnitPrice(): Boolean = overrideUnitPrice != null

        fun isOverridePackagePrice(): Boolean = overridePackagePrice != null

        fun isOverrideMatrixPrice(): Boolean = overrideMatrixPrice != null

        fun isOverrideTieredPrice(): Boolean = overrideTieredPrice != null

        fun isOverrideTieredBpsPrice(): Boolean = overrideTieredBpsPrice != null

        fun isOverrideBpsPrice(): Boolean = overrideBpsPrice != null

        fun isOverrideBulkBpsPrice(): Boolean = overrideBulkBpsPrice != null

        fun isOverrideBulkPrice(): Boolean = overrideBulkPrice != null

        fun isOverrideThresholdTotalAmountPrice(): Boolean =
            overrideThresholdTotalAmountPrice != null

        fun isOverrideTieredPackagePrice(): Boolean = overrideTieredPackagePrice != null

        fun isOverrideTieredWithMinimumPrice(): Boolean = overrideTieredWithMinimumPrice != null

        fun isOverridePackageWithAllocationPrice(): Boolean =
            overridePackageWithAllocationPrice != null

        fun isOverrideUnitWithPercentPrice(): Boolean = overrideUnitWithPercentPrice != null

        fun isOverrideGroupedAllocationPrice(): Boolean = overrideGroupedAllocationPrice != null

        fun isOverrideGroupedWithProratedMinimumPrice(): Boolean =
            overrideGroupedWithProratedMinimumPrice != null

        fun isOverrideGroupedWithMeteredMinimumPrice(): Boolean =
            overrideGroupedWithMeteredMinimumPrice != null

        fun isOverrideBulkWithProrationPrice(): Boolean = overrideBulkWithProrationPrice != null

        fun isOverrideUnitWithProrationPrice(): Boolean = overrideUnitWithProrationPrice != null

        fun isOverrideTieredWithProrationPrice(): Boolean = overrideTieredWithProrationPrice != null

        fun asOverrideUnitPrice(): OverrideUnitPrice =
            overrideUnitPrice.getOrThrow("overrideUnitPrice")

        fun asOverridePackagePrice(): OverridePackagePrice =
            overridePackagePrice.getOrThrow("overridePackagePrice")

        fun asOverrideMatrixPrice(): OverrideMatrixPrice =
            overrideMatrixPrice.getOrThrow("overrideMatrixPrice")

        fun asOverrideTieredPrice(): OverrideTieredPrice =
            overrideTieredPrice.getOrThrow("overrideTieredPrice")

        fun asOverrideTieredBpsPrice(): OverrideTieredBpsPrice =
            overrideTieredBpsPrice.getOrThrow("overrideTieredBpsPrice")

        fun asOverrideBpsPrice(): OverrideBpsPrice = overrideBpsPrice.getOrThrow("overrideBpsPrice")

        fun asOverrideBulkBpsPrice(): OverrideBulkBpsPrice =
            overrideBulkBpsPrice.getOrThrow("overrideBulkBpsPrice")

        fun asOverrideBulkPrice(): OverrideBulkPrice =
            overrideBulkPrice.getOrThrow("overrideBulkPrice")

        fun asOverrideThresholdTotalAmountPrice(): OverrideThresholdTotalAmountPrice =
            overrideThresholdTotalAmountPrice.getOrThrow("overrideThresholdTotalAmountPrice")

        fun asOverrideTieredPackagePrice(): OverrideTieredPackagePrice =
            overrideTieredPackagePrice.getOrThrow("overrideTieredPackagePrice")

        fun asOverrideTieredWithMinimumPrice(): OverrideTieredWithMinimumPrice =
            overrideTieredWithMinimumPrice.getOrThrow("overrideTieredWithMinimumPrice")

        fun asOverridePackageWithAllocationPrice(): OverridePackageWithAllocationPrice =
            overridePackageWithAllocationPrice.getOrThrow("overridePackageWithAllocationPrice")

        fun asOverrideUnitWithPercentPrice(): OverrideUnitWithPercentPrice =
            overrideUnitWithPercentPrice.getOrThrow("overrideUnitWithPercentPrice")

        fun asOverrideGroupedAllocationPrice(): OverrideGroupedAllocationPrice =
            overrideGroupedAllocationPrice.getOrThrow("overrideGroupedAllocationPrice")

        fun asOverrideGroupedWithProratedMinimumPrice(): OverrideGroupedWithProratedMinimumPrice =
            overrideGroupedWithProratedMinimumPrice.getOrThrow(
                "overrideGroupedWithProratedMinimumPrice"
            )

        fun asOverrideGroupedWithMeteredMinimumPrice(): OverrideGroupedWithMeteredMinimumPrice =
            overrideGroupedWithMeteredMinimumPrice.getOrThrow(
                "overrideGroupedWithMeteredMinimumPrice"
            )

        fun asOverrideBulkWithProrationPrice(): OverrideBulkWithProrationPrice =
            overrideBulkWithProrationPrice.getOrThrow("overrideBulkWithProrationPrice")

        fun asOverrideUnitWithProrationPrice(): OverrideUnitWithProrationPrice =
            overrideUnitWithProrationPrice.getOrThrow("overrideUnitWithProrationPrice")

        fun asOverrideTieredWithProrationPrice(): OverrideTieredWithProrationPrice =
            overrideTieredWithProrationPrice.getOrThrow("overrideTieredWithProrationPrice")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                overrideUnitPrice != null -> visitor.visitOverrideUnitPrice(overrideUnitPrice)
                overridePackagePrice != null ->
                    visitor.visitOverridePackagePrice(overridePackagePrice)
                overrideMatrixPrice != null -> visitor.visitOverrideMatrixPrice(overrideMatrixPrice)
                overrideTieredPrice != null -> visitor.visitOverrideTieredPrice(overrideTieredPrice)
                overrideTieredBpsPrice != null ->
                    visitor.visitOverrideTieredBpsPrice(overrideTieredBpsPrice)
                overrideBpsPrice != null -> visitor.visitOverrideBpsPrice(overrideBpsPrice)
                overrideBulkBpsPrice != null ->
                    visitor.visitOverrideBulkBpsPrice(overrideBulkBpsPrice)
                overrideBulkPrice != null -> visitor.visitOverrideBulkPrice(overrideBulkPrice)
                overrideThresholdTotalAmountPrice != null ->
                    visitor.visitOverrideThresholdTotalAmountPrice(
                        overrideThresholdTotalAmountPrice
                    )
                overrideTieredPackagePrice != null ->
                    visitor.visitOverrideTieredPackagePrice(overrideTieredPackagePrice)
                overrideTieredWithMinimumPrice != null ->
                    visitor.visitOverrideTieredWithMinimumPrice(overrideTieredWithMinimumPrice)
                overridePackageWithAllocationPrice != null ->
                    visitor.visitOverridePackageWithAllocationPrice(
                        overridePackageWithAllocationPrice
                    )
                overrideUnitWithPercentPrice != null ->
                    visitor.visitOverrideUnitWithPercentPrice(overrideUnitWithPercentPrice)
                overrideGroupedAllocationPrice != null ->
                    visitor.visitOverrideGroupedAllocationPrice(overrideGroupedAllocationPrice)
                overrideGroupedWithProratedMinimumPrice != null ->
                    visitor.visitOverrideGroupedWithProratedMinimumPrice(
                        overrideGroupedWithProratedMinimumPrice
                    )
                overrideGroupedWithMeteredMinimumPrice != null ->
                    visitor.visitOverrideGroupedWithMeteredMinimumPrice(
                        overrideGroupedWithMeteredMinimumPrice
                    )
                overrideBulkWithProrationPrice != null ->
                    visitor.visitOverrideBulkWithProrationPrice(overrideBulkWithProrationPrice)
                overrideUnitWithProrationPrice != null ->
                    visitor.visitOverrideUnitWithProrationPrice(overrideUnitWithProrationPrice)
                overrideTieredWithProrationPrice != null ->
                    visitor.visitOverrideTieredWithProrationPrice(overrideTieredWithProrationPrice)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): PriceOverride = apply {
            if (!validated) {
                if (
                    overrideUnitPrice == null &&
                        overridePackagePrice == null &&
                        overrideMatrixPrice == null &&
                        overrideTieredPrice == null &&
                        overrideTieredBpsPrice == null &&
                        overrideBpsPrice == null &&
                        overrideBulkBpsPrice == null &&
                        overrideBulkPrice == null &&
                        overrideThresholdTotalAmountPrice == null &&
                        overrideTieredPackagePrice == null &&
                        overrideTieredWithMinimumPrice == null &&
                        overridePackageWithAllocationPrice == null &&
                        overrideUnitWithPercentPrice == null &&
                        overrideGroupedAllocationPrice == null &&
                        overrideGroupedWithProratedMinimumPrice == null &&
                        overrideGroupedWithMeteredMinimumPrice == null &&
                        overrideBulkWithProrationPrice == null &&
                        overrideUnitWithProrationPrice == null &&
                        overrideTieredWithProrationPrice == null
                ) {
                    throw OrbInvalidDataException("Unknown PriceOverride: $_json")
                }
                overrideUnitPrice?.validate()
                overridePackagePrice?.validate()
                overrideMatrixPrice?.validate()
                overrideTieredPrice?.validate()
                overrideTieredBpsPrice?.validate()
                overrideBpsPrice?.validate()
                overrideBulkBpsPrice?.validate()
                overrideBulkPrice?.validate()
                overrideThresholdTotalAmountPrice?.validate()
                overrideTieredPackagePrice?.validate()
                overrideTieredWithMinimumPrice?.validate()
                overridePackageWithAllocationPrice?.validate()
                overrideUnitWithPercentPrice?.validate()
                overrideGroupedAllocationPrice?.validate()
                overrideGroupedWithProratedMinimumPrice?.validate()
                overrideGroupedWithMeteredMinimumPrice?.validate()
                overrideBulkWithProrationPrice?.validate()
                overrideUnitWithProrationPrice?.validate()
                overrideTieredWithProrationPrice?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PriceOverride && this.overrideUnitPrice == other.overrideUnitPrice && this.overridePackagePrice == other.overridePackagePrice && this.overrideMatrixPrice == other.overrideMatrixPrice && this.overrideTieredPrice == other.overrideTieredPrice && this.overrideTieredBpsPrice == other.overrideTieredBpsPrice && this.overrideBpsPrice == other.overrideBpsPrice && this.overrideBulkBpsPrice == other.overrideBulkBpsPrice && this.overrideBulkPrice == other.overrideBulkPrice && this.overrideThresholdTotalAmountPrice == other.overrideThresholdTotalAmountPrice && this.overrideTieredPackagePrice == other.overrideTieredPackagePrice && this.overrideTieredWithMinimumPrice == other.overrideTieredWithMinimumPrice && this.overridePackageWithAllocationPrice == other.overridePackageWithAllocationPrice && this.overrideUnitWithPercentPrice == other.overrideUnitWithPercentPrice && this.overrideGroupedAllocationPrice == other.overrideGroupedAllocationPrice && this.overrideGroupedWithProratedMinimumPrice == other.overrideGroupedWithProratedMinimumPrice && this.overrideGroupedWithMeteredMinimumPrice == other.overrideGroupedWithMeteredMinimumPrice && this.overrideBulkWithProrationPrice == other.overrideBulkWithProrationPrice && this.overrideUnitWithProrationPrice == other.overrideUnitWithProrationPrice && this.overrideTieredWithProrationPrice == other.overrideTieredWithProrationPrice /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(overrideUnitPrice, overridePackagePrice, overrideMatrixPrice, overrideTieredPrice, overrideTieredBpsPrice, overrideBpsPrice, overrideBulkBpsPrice, overrideBulkPrice, overrideThresholdTotalAmountPrice, overrideTieredPackagePrice, overrideTieredWithMinimumPrice, overridePackageWithAllocationPrice, overrideUnitWithPercentPrice, overrideGroupedAllocationPrice, overrideGroupedWithProratedMinimumPrice, overrideGroupedWithMeteredMinimumPrice, overrideBulkWithProrationPrice, overrideUnitWithProrationPrice, overrideTieredWithProrationPrice) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                overrideUnitPrice != null -> "PriceOverride{overrideUnitPrice=$overrideUnitPrice}"
                overridePackagePrice != null ->
                    "PriceOverride{overridePackagePrice=$overridePackagePrice}"
                overrideMatrixPrice != null ->
                    "PriceOverride{overrideMatrixPrice=$overrideMatrixPrice}"
                overrideTieredPrice != null ->
                    "PriceOverride{overrideTieredPrice=$overrideTieredPrice}"
                overrideTieredBpsPrice != null ->
                    "PriceOverride{overrideTieredBpsPrice=$overrideTieredBpsPrice}"
                overrideBpsPrice != null -> "PriceOverride{overrideBpsPrice=$overrideBpsPrice}"
                overrideBulkBpsPrice != null ->
                    "PriceOverride{overrideBulkBpsPrice=$overrideBulkBpsPrice}"
                overrideBulkPrice != null -> "PriceOverride{overrideBulkPrice=$overrideBulkPrice}"
                overrideThresholdTotalAmountPrice != null ->
                    "PriceOverride{overrideThresholdTotalAmountPrice=$overrideThresholdTotalAmountPrice}"
                overrideTieredPackagePrice != null ->
                    "PriceOverride{overrideTieredPackagePrice=$overrideTieredPackagePrice}"
                overrideTieredWithMinimumPrice != null ->
                    "PriceOverride{overrideTieredWithMinimumPrice=$overrideTieredWithMinimumPrice}"
                overridePackageWithAllocationPrice != null ->
                    "PriceOverride{overridePackageWithAllocationPrice=$overridePackageWithAllocationPrice}"
                overrideUnitWithPercentPrice != null ->
                    "PriceOverride{overrideUnitWithPercentPrice=$overrideUnitWithPercentPrice}"
                overrideGroupedAllocationPrice != null ->
                    "PriceOverride{overrideGroupedAllocationPrice=$overrideGroupedAllocationPrice}"
                overrideGroupedWithProratedMinimumPrice != null ->
                    "PriceOverride{overrideGroupedWithProratedMinimumPrice=$overrideGroupedWithProratedMinimumPrice}"
                overrideGroupedWithMeteredMinimumPrice != null ->
                    "PriceOverride{overrideGroupedWithMeteredMinimumPrice=$overrideGroupedWithMeteredMinimumPrice}"
                overrideBulkWithProrationPrice != null ->
                    "PriceOverride{overrideBulkWithProrationPrice=$overrideBulkWithProrationPrice}"
                overrideUnitWithProrationPrice != null ->
                    "PriceOverride{overrideUnitWithProrationPrice=$overrideUnitWithProrationPrice}"
                overrideTieredWithProrationPrice != null ->
                    "PriceOverride{overrideTieredWithProrationPrice=$overrideTieredWithProrationPrice}"
                _json != null -> "PriceOverride{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid PriceOverride")
            }
        }

        companion object {

            @JvmStatic
            fun ofOverrideUnitPrice(overrideUnitPrice: OverrideUnitPrice) =
                PriceOverride(overrideUnitPrice = overrideUnitPrice)

            @JvmStatic
            fun ofOverridePackagePrice(overridePackagePrice: OverridePackagePrice) =
                PriceOverride(overridePackagePrice = overridePackagePrice)

            @JvmStatic
            fun ofOverrideMatrixPrice(overrideMatrixPrice: OverrideMatrixPrice) =
                PriceOverride(overrideMatrixPrice = overrideMatrixPrice)

            @JvmStatic
            fun ofOverrideTieredPrice(overrideTieredPrice: OverrideTieredPrice) =
                PriceOverride(overrideTieredPrice = overrideTieredPrice)

            @JvmStatic
            fun ofOverrideTieredBpsPrice(overrideTieredBpsPrice: OverrideTieredBpsPrice) =
                PriceOverride(overrideTieredBpsPrice = overrideTieredBpsPrice)

            @JvmStatic
            fun ofOverrideBpsPrice(overrideBpsPrice: OverrideBpsPrice) =
                PriceOverride(overrideBpsPrice = overrideBpsPrice)

            @JvmStatic
            fun ofOverrideBulkBpsPrice(overrideBulkBpsPrice: OverrideBulkBpsPrice) =
                PriceOverride(overrideBulkBpsPrice = overrideBulkBpsPrice)

            @JvmStatic
            fun ofOverrideBulkPrice(overrideBulkPrice: OverrideBulkPrice) =
                PriceOverride(overrideBulkPrice = overrideBulkPrice)

            @JvmStatic
            fun ofOverrideThresholdTotalAmountPrice(
                overrideThresholdTotalAmountPrice: OverrideThresholdTotalAmountPrice
            ) = PriceOverride(overrideThresholdTotalAmountPrice = overrideThresholdTotalAmountPrice)

            @JvmStatic
            fun ofOverrideTieredPackagePrice(
                overrideTieredPackagePrice: OverrideTieredPackagePrice
            ) = PriceOverride(overrideTieredPackagePrice = overrideTieredPackagePrice)

            @JvmStatic
            fun ofOverrideTieredWithMinimumPrice(
                overrideTieredWithMinimumPrice: OverrideTieredWithMinimumPrice
            ) = PriceOverride(overrideTieredWithMinimumPrice = overrideTieredWithMinimumPrice)

            @JvmStatic
            fun ofOverridePackageWithAllocationPrice(
                overridePackageWithAllocationPrice: OverridePackageWithAllocationPrice
            ) =
                PriceOverride(
                    overridePackageWithAllocationPrice = overridePackageWithAllocationPrice
                )

            @JvmStatic
            fun ofOverrideUnitWithPercentPrice(
                overrideUnitWithPercentPrice: OverrideUnitWithPercentPrice
            ) = PriceOverride(overrideUnitWithPercentPrice = overrideUnitWithPercentPrice)

            @JvmStatic
            fun ofOverrideGroupedAllocationPrice(
                overrideGroupedAllocationPrice: OverrideGroupedAllocationPrice
            ) = PriceOverride(overrideGroupedAllocationPrice = overrideGroupedAllocationPrice)

            @JvmStatic
            fun ofOverrideGroupedWithProratedMinimumPrice(
                overrideGroupedWithProratedMinimumPrice: OverrideGroupedWithProratedMinimumPrice
            ) =
                PriceOverride(
                    overrideGroupedWithProratedMinimumPrice =
                        overrideGroupedWithProratedMinimumPrice
                )

            @JvmStatic
            fun ofOverrideGroupedWithMeteredMinimumPrice(
                overrideGroupedWithMeteredMinimumPrice: OverrideGroupedWithMeteredMinimumPrice
            ) =
                PriceOverride(
                    overrideGroupedWithMeteredMinimumPrice = overrideGroupedWithMeteredMinimumPrice
                )

            @JvmStatic
            fun ofOverrideBulkWithProrationPrice(
                overrideBulkWithProrationPrice: OverrideBulkWithProrationPrice
            ) = PriceOverride(overrideBulkWithProrationPrice = overrideBulkWithProrationPrice)

            @JvmStatic
            fun ofOverrideUnitWithProrationPrice(
                overrideUnitWithProrationPrice: OverrideUnitWithProrationPrice
            ) = PriceOverride(overrideUnitWithProrationPrice = overrideUnitWithProrationPrice)

            @JvmStatic
            fun ofOverrideTieredWithProrationPrice(
                overrideTieredWithProrationPrice: OverrideTieredWithProrationPrice
            ) = PriceOverride(overrideTieredWithProrationPrice = overrideTieredWithProrationPrice)
        }

        interface Visitor<out T> {

            fun visitOverrideUnitPrice(overrideUnitPrice: OverrideUnitPrice): T

            fun visitOverridePackagePrice(overridePackagePrice: OverridePackagePrice): T

            fun visitOverrideMatrixPrice(overrideMatrixPrice: OverrideMatrixPrice): T

            fun visitOverrideTieredPrice(overrideTieredPrice: OverrideTieredPrice): T

            fun visitOverrideTieredBpsPrice(overrideTieredBpsPrice: OverrideTieredBpsPrice): T

            fun visitOverrideBpsPrice(overrideBpsPrice: OverrideBpsPrice): T

            fun visitOverrideBulkBpsPrice(overrideBulkBpsPrice: OverrideBulkBpsPrice): T

            fun visitOverrideBulkPrice(overrideBulkPrice: OverrideBulkPrice): T

            fun visitOverrideThresholdTotalAmountPrice(
                overrideThresholdTotalAmountPrice: OverrideThresholdTotalAmountPrice
            ): T

            fun visitOverrideTieredPackagePrice(
                overrideTieredPackagePrice: OverrideTieredPackagePrice
            ): T

            fun visitOverrideTieredWithMinimumPrice(
                overrideTieredWithMinimumPrice: OverrideTieredWithMinimumPrice
            ): T

            fun visitOverridePackageWithAllocationPrice(
                overridePackageWithAllocationPrice: OverridePackageWithAllocationPrice
            ): T

            fun visitOverrideUnitWithPercentPrice(
                overrideUnitWithPercentPrice: OverrideUnitWithPercentPrice
            ): T

            fun visitOverrideGroupedAllocationPrice(
                overrideGroupedAllocationPrice: OverrideGroupedAllocationPrice
            ): T

            fun visitOverrideGroupedWithProratedMinimumPrice(
                overrideGroupedWithProratedMinimumPrice: OverrideGroupedWithProratedMinimumPrice
            ): T

            fun visitOverrideGroupedWithMeteredMinimumPrice(
                overrideGroupedWithMeteredMinimumPrice: OverrideGroupedWithMeteredMinimumPrice
            ): T

            fun visitOverrideBulkWithProrationPrice(
                overrideBulkWithProrationPrice: OverrideBulkWithProrationPrice
            ): T

            fun visitOverrideUnitWithProrationPrice(
                overrideUnitWithProrationPrice: OverrideUnitWithProrationPrice
            ): T

            fun visitOverrideTieredWithProrationPrice(
                overrideTieredWithProrationPrice: OverrideTieredWithProrationPrice
            ): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown PriceOverride: $json")
            }
        }

        class Deserializer : BaseDeserializer<PriceOverride>(PriceOverride::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): PriceOverride {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<OverrideUnitPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideUnitPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverridePackagePrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overridePackagePrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideMatrixPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideMatrixPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideTieredPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideTieredPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideTieredBpsPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideTieredBpsPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideBpsPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideBpsPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideBulkBpsPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideBulkBpsPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideBulkPrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideBulkPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideThresholdTotalAmountPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(overrideThresholdTotalAmountPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideTieredPackagePrice>()) { it.validate() }
                    ?.let {
                        return PriceOverride(overrideTieredPackagePrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideTieredWithMinimumPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(overrideTieredWithMinimumPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverridePackageWithAllocationPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(overridePackageWithAllocationPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideUnitWithPercentPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(overrideUnitWithPercentPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideGroupedAllocationPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(overrideGroupedAllocationPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideGroupedWithProratedMinimumPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(
                            overrideGroupedWithProratedMinimumPrice = it,
                            _json = json
                        )
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideGroupedWithMeteredMinimumPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(
                            overrideGroupedWithMeteredMinimumPrice = it,
                            _json = json
                        )
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideBulkWithProrationPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(overrideBulkWithProrationPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideUnitWithProrationPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(overrideUnitWithProrationPrice = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<OverrideTieredWithProrationPrice>()) {
                        it.validate()
                    }
                    ?.let {
                        return PriceOverride(overrideTieredWithProrationPrice = it, _json = json)
                    }

                return PriceOverride(_json = json)
            }
        }

        class Serializer : BaseSerializer<PriceOverride>(PriceOverride::class) {

            override fun serialize(
                value: PriceOverride,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.overrideUnitPrice != null ->
                        generator.writeObject(value.overrideUnitPrice)
                    value.overridePackagePrice != null ->
                        generator.writeObject(value.overridePackagePrice)
                    value.overrideMatrixPrice != null ->
                        generator.writeObject(value.overrideMatrixPrice)
                    value.overrideTieredPrice != null ->
                        generator.writeObject(value.overrideTieredPrice)
                    value.overrideTieredBpsPrice != null ->
                        generator.writeObject(value.overrideTieredBpsPrice)
                    value.overrideBpsPrice != null -> generator.writeObject(value.overrideBpsPrice)
                    value.overrideBulkBpsPrice != null ->
                        generator.writeObject(value.overrideBulkBpsPrice)
                    value.overrideBulkPrice != null ->
                        generator.writeObject(value.overrideBulkPrice)
                    value.overrideThresholdTotalAmountPrice != null ->
                        generator.writeObject(value.overrideThresholdTotalAmountPrice)
                    value.overrideTieredPackagePrice != null ->
                        generator.writeObject(value.overrideTieredPackagePrice)
                    value.overrideTieredWithMinimumPrice != null ->
                        generator.writeObject(value.overrideTieredWithMinimumPrice)
                    value.overridePackageWithAllocationPrice != null ->
                        generator.writeObject(value.overridePackageWithAllocationPrice)
                    value.overrideUnitWithPercentPrice != null ->
                        generator.writeObject(value.overrideUnitWithPercentPrice)
                    value.overrideGroupedAllocationPrice != null ->
                        generator.writeObject(value.overrideGroupedAllocationPrice)
                    value.overrideGroupedWithProratedMinimumPrice != null ->
                        generator.writeObject(value.overrideGroupedWithProratedMinimumPrice)
                    value.overrideGroupedWithMeteredMinimumPrice != null ->
                        generator.writeObject(value.overrideGroupedWithMeteredMinimumPrice)
                    value.overrideBulkWithProrationPrice != null ->
                        generator.writeObject(value.overrideBulkWithProrationPrice)
                    value.overrideUnitWithProrationPrice != null ->
                        generator.writeObject(value.overrideUnitWithProrationPrice)
                    value.overrideTieredWithProrationPrice != null ->
                        generator.writeObject(value.overrideTieredWithProrationPrice)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid PriceOverride")
                }
            }
        }

        @JsonDeserialize(builder = OverrideUnitPrice.Builder::class)
        @NoAutoDetect
        class OverrideUnitPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val unitConfig: JsonField<UnitConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun unitConfig(): UnitConfig = unitConfig.getRequired("unit_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("unit_config") @ExcludeMissing fun _unitConfig() = unitConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideUnitPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    unitConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var unitConfig: JsonField<UnitConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideUnitPrice: OverrideUnitPrice) = apply {
                    this.id = overrideUnitPrice.id
                    this.modelType = overrideUnitPrice.modelType
                    this.minimumAmount = overrideUnitPrice.minimumAmount
                    this.maximumAmount = overrideUnitPrice.maximumAmount
                    this.currency = overrideUnitPrice.currency
                    this.conversionRate = overrideUnitPrice.conversionRate
                    this.discount = overrideUnitPrice.discount
                    this.fixedPriceQuantity = overrideUnitPrice.fixedPriceQuantity
                    this.unitConfig = overrideUnitPrice.unitConfig
                    additionalProperties(overrideUnitPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun unitConfig(unitConfig: UnitConfig) = unitConfig(JsonField.of(unitConfig))

                @JsonProperty("unit_config")
                @ExcludeMissing
                fun unitConfig(unitConfig: JsonField<UnitConfig>) = apply {
                    this.unitConfig = unitConfig
                }

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

                fun build(): OverrideUnitPrice =
                    OverrideUnitPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        unitConfig,
                        additionalProperties.toUnmodifiable(),
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
                private val unitAmount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** Rate per unit of usage */
                fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                /** Rate per unit of usage */
                @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): UnitConfig = apply {
                    if (!validated) {
                        unitAmount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var unitAmount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(unitConfig: UnitConfig) = apply {
                        this.unitAmount = unitConfig.unitAmount
                        additionalProperties(unitConfig.additionalProperties)
                    }

                    /** Rate per unit of usage */
                    fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                    /** Rate per unit of usage */
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    fun unitAmount(unitAmount: JsonField<String>) = apply {
                        this.unitAmount = unitAmount
                    }

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
                        UnitConfig(unitAmount, additionalProperties.toUnmodifiable())
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

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideUnitPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.unitConfig == other.unitConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, unitConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideUnitPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, unitConfig=$unitConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverridePackagePrice.Builder::class)
        @NoAutoDetect
        class OverridePackagePrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val packageConfig: JsonField<PackageConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun packageConfig(): PackageConfig = packageConfig.getRequired("package_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("package_config") @ExcludeMissing fun _packageConfig() = packageConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverridePackagePrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    packageConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var packageConfig: JsonField<PackageConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overridePackagePrice: OverridePackagePrice) = apply {
                    this.id = overridePackagePrice.id
                    this.modelType = overridePackagePrice.modelType
                    this.minimumAmount = overridePackagePrice.minimumAmount
                    this.maximumAmount = overridePackagePrice.maximumAmount
                    this.currency = overridePackagePrice.currency
                    this.conversionRate = overridePackagePrice.conversionRate
                    this.discount = overridePackagePrice.discount
                    this.fixedPriceQuantity = overridePackagePrice.fixedPriceQuantity
                    this.packageConfig = overridePackagePrice.packageConfig
                    additionalProperties(overridePackagePrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun packageConfig(packageConfig: PackageConfig) =
                    packageConfig(JsonField.of(packageConfig))

                @JsonProperty("package_config")
                @ExcludeMissing
                fun packageConfig(packageConfig: JsonField<PackageConfig>) = apply {
                    this.packageConfig = packageConfig
                }

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

                fun build(): OverridePackagePrice =
                    OverridePackagePrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        packageConfig,
                        additionalProperties.toUnmodifiable(),
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

                    @JvmField val PACKAGE = ModelType(JsonField.of("package"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    PACKAGE,
                }

                enum class Value {
                    PACKAGE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PACKAGE -> Value.PACKAGE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PACKAGE -> Known.PACKAGE
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = PackageConfig.Builder::class)
            @NoAutoDetect
            class PackageConfig
            private constructor(
                private val packageAmount: JsonField<String>,
                private val packageSize: JsonField<Long>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** A currency amount to rate usage by */
                fun packageAmount(): String = packageAmount.getRequired("package_amount")

                /**
                 * An integer amount to represent package size. For example, 1000 here would divide
                 * usage by 1000 before multiplying by package_amount in rating
                 */
                fun packageSize(): Long = packageSize.getRequired("package_size")

                /** A currency amount to rate usage by */
                @JsonProperty("package_amount") @ExcludeMissing fun _packageAmount() = packageAmount

                /**
                 * An integer amount to represent package size. For example, 1000 here would divide
                 * usage by 1000 before multiplying by package_amount in rating
                 */
                @JsonProperty("package_size") @ExcludeMissing fun _packageSize() = packageSize

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PackageConfig = apply {
                    if (!validated) {
                        packageAmount()
                        packageSize()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var packageAmount: JsonField<String> = JsonMissing.of()
                    private var packageSize: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(packageConfig: PackageConfig) = apply {
                        this.packageAmount = packageConfig.packageAmount
                        this.packageSize = packageConfig.packageSize
                        additionalProperties(packageConfig.additionalProperties)
                    }

                    /** A currency amount to rate usage by */
                    fun packageAmount(packageAmount: String) =
                        packageAmount(JsonField.of(packageAmount))

                    /** A currency amount to rate usage by */
                    @JsonProperty("package_amount")
                    @ExcludeMissing
                    fun packageAmount(packageAmount: JsonField<String>) = apply {
                        this.packageAmount = packageAmount
                    }

                    /**
                     * An integer amount to represent package size. For example, 1000 here would
                     * divide usage by 1000 before multiplying by package_amount in rating
                     */
                    fun packageSize(packageSize: Long) = packageSize(JsonField.of(packageSize))

                    /**
                     * An integer amount to represent package size. For example, 1000 here would
                     * divide usage by 1000 before multiplying by package_amount in rating
                     */
                    @JsonProperty("package_size")
                    @ExcludeMissing
                    fun packageSize(packageSize: JsonField<Long>) = apply {
                        this.packageSize = packageSize
                    }

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

                    fun build(): PackageConfig =
                        PackageConfig(
                            packageAmount,
                            packageSize,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PackageConfig && this.packageAmount == other.packageAmount && this.packageSize == other.packageSize && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(packageAmount, packageSize, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "PackageConfig{packageAmount=$packageAmount, packageSize=$packageSize, additionalProperties=$additionalProperties}"
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverridePackagePrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.packageConfig == other.packageConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, packageConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverridePackagePrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, packageConfig=$packageConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideMatrixPrice.Builder::class)
        @NoAutoDetect
        class OverrideMatrixPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val matrixConfig: JsonField<MatrixConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun matrixConfig(): MatrixConfig = matrixConfig.getRequired("matrix_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("matrix_config") @ExcludeMissing fun _matrixConfig() = matrixConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideMatrixPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    matrixConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var matrixConfig: JsonField<MatrixConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideMatrixPrice: OverrideMatrixPrice) = apply {
                    this.id = overrideMatrixPrice.id
                    this.modelType = overrideMatrixPrice.modelType
                    this.minimumAmount = overrideMatrixPrice.minimumAmount
                    this.maximumAmount = overrideMatrixPrice.maximumAmount
                    this.currency = overrideMatrixPrice.currency
                    this.conversionRate = overrideMatrixPrice.conversionRate
                    this.discount = overrideMatrixPrice.discount
                    this.fixedPriceQuantity = overrideMatrixPrice.fixedPriceQuantity
                    this.matrixConfig = overrideMatrixPrice.matrixConfig
                    additionalProperties(overrideMatrixPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun matrixConfig(matrixConfig: MatrixConfig) =
                    matrixConfig(JsonField.of(matrixConfig))

                @JsonProperty("matrix_config")
                @ExcludeMissing
                fun matrixConfig(matrixConfig: JsonField<MatrixConfig>) = apply {
                    this.matrixConfig = matrixConfig
                }

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

                fun build(): OverrideMatrixPrice =
                    OverrideMatrixPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        matrixConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = MatrixConfig.Builder::class)
            @NoAutoDetect
            class MatrixConfig
            private constructor(
                private val dimensions: JsonField<List<String?>>,
                private val defaultUnitAmount: JsonField<String>,
                private val matrixValues: JsonField<List<MatrixValue>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** One or two event property values to evaluate matrix groups by */
                fun dimensions(): List<String?> = dimensions.getRequired("dimensions")

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                fun defaultUnitAmount(): String =
                    defaultUnitAmount.getRequired("default_unit_amount")

                /** Matrix values for specified matrix grouping keys */
                fun matrixValues(): List<MatrixValue> = matrixValues.getRequired("matrix_values")

                /** One or two event property values to evaluate matrix groups by */
                @JsonProperty("dimensions") @ExcludeMissing fun _dimensions() = dimensions

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                @JsonProperty("default_unit_amount")
                @ExcludeMissing
                fun _defaultUnitAmount() = defaultUnitAmount

                /** Matrix values for specified matrix grouping keys */
                @JsonProperty("matrix_values") @ExcludeMissing fun _matrixValues() = matrixValues

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): MatrixConfig = apply {
                    if (!validated) {
                        dimensions()
                        defaultUnitAmount()
                        matrixValues().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var dimensions: JsonField<List<String?>> = JsonMissing.of()
                    private var defaultUnitAmount: JsonField<String> = JsonMissing.of()
                    private var matrixValues: JsonField<List<MatrixValue>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(matrixConfig: MatrixConfig) = apply {
                        this.dimensions = matrixConfig.dimensions
                        this.defaultUnitAmount = matrixConfig.defaultUnitAmount
                        this.matrixValues = matrixConfig.matrixValues
                        additionalProperties(matrixConfig.additionalProperties)
                    }

                    /** One or two event property values to evaluate matrix groups by */
                    fun dimensions(dimensions: List<String?>) = dimensions(JsonField.of(dimensions))

                    /** One or two event property values to evaluate matrix groups by */
                    @JsonProperty("dimensions")
                    @ExcludeMissing
                    fun dimensions(dimensions: JsonField<List<String?>>) = apply {
                        this.dimensions = dimensions
                    }

                    /**
                     * Default per unit rate for any usage not bucketed into a specified
                     * matrix_value
                     */
                    fun defaultUnitAmount(defaultUnitAmount: String) =
                        defaultUnitAmount(JsonField.of(defaultUnitAmount))

                    /**
                     * Default per unit rate for any usage not bucketed into a specified
                     * matrix_value
                     */
                    @JsonProperty("default_unit_amount")
                    @ExcludeMissing
                    fun defaultUnitAmount(defaultUnitAmount: JsonField<String>) = apply {
                        this.defaultUnitAmount = defaultUnitAmount
                    }

                    /** Matrix values for specified matrix grouping keys */
                    fun matrixValues(matrixValues: List<MatrixValue>) =
                        matrixValues(JsonField.of(matrixValues))

                    /** Matrix values for specified matrix grouping keys */
                    @JsonProperty("matrix_values")
                    @ExcludeMissing
                    fun matrixValues(matrixValues: JsonField<List<MatrixValue>>) = apply {
                        this.matrixValues = matrixValues
                    }

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

                    fun build(): MatrixConfig =
                        MatrixConfig(
                            dimensions.map { it.toUnmodifiable() },
                            defaultUnitAmount,
                            matrixValues.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = MatrixValue.Builder::class)
                @NoAutoDetect
                class MatrixValue
                private constructor(
                    private val unitAmount: JsonField<String>,
                    private val dimensionValues: JsonField<List<String?>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** Unit price for the specified dimension_values */
                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    fun dimensionValues(): List<String?> =
                        dimensionValues.getRequired("dimension_values")

                    /** Unit price for the specified dimension_values */
                    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    @JsonProperty("dimension_values")
                    @ExcludeMissing
                    fun _dimensionValues() = dimensionValues

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): MatrixValue = apply {
                        if (!validated) {
                            unitAmount()
                            dimensionValues()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var unitAmount: JsonField<String> = JsonMissing.of()
                        private var dimensionValues: JsonField<List<String?>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(matrixValue: MatrixValue) = apply {
                            this.unitAmount = matrixValue.unitAmount
                            this.dimensionValues = matrixValue.dimensionValues
                            additionalProperties(matrixValue.additionalProperties)
                        }

                        /** Unit price for the specified dimension_values */
                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        /** Unit price for the specified dimension_values */
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        /**
                         * One or two matrix keys to filter usage to this Matrix value by. For
                         * example, ["region", "tier"] could be used to filter cloud usage by a
                         * cloud region and an instance tier.
                         */
                        fun dimensionValues(dimensionValues: List<String?>) =
                            dimensionValues(JsonField.of(dimensionValues))

                        /**
                         * One or two matrix keys to filter usage to this Matrix value by. For
                         * example, ["region", "tier"] could be used to filter cloud usage by a
                         * cloud region and an instance tier.
                         */
                        @JsonProperty("dimension_values")
                        @ExcludeMissing
                        fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                            this.dimensionValues = dimensionValues
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): MatrixValue =
                            MatrixValue(
                                unitAmount,
                                dimensionValues.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is MatrixValue && this.unitAmount == other.unitAmount && this.dimensionValues == other.dimensionValues && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(unitAmount, dimensionValues, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "MatrixValue{unitAmount=$unitAmount, dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MatrixConfig && this.dimensions == other.dimensions && this.defaultUnitAmount == other.defaultUnitAmount && this.matrixValues == other.matrixValues && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(dimensions, defaultUnitAmount, matrixValues, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "MatrixConfig{dimensions=$dimensions, defaultUnitAmount=$defaultUnitAmount, matrixValues=$matrixValues, additionalProperties=$additionalProperties}"
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

                    @JvmField val MATRIX = ModelType(JsonField.of("matrix"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    MATRIX,
                }

                enum class Value {
                    MATRIX,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        MATRIX -> Value.MATRIX
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        MATRIX -> Known.MATRIX
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideMatrixPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.matrixConfig == other.matrixConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, matrixConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideMatrixPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, matrixConfig=$matrixConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideTieredPrice.Builder::class)
        @NoAutoDetect
        class OverrideTieredPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val tieredConfig: JsonField<TieredConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun tieredConfig(): TieredConfig = tieredConfig.getRequired("tiered_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("tiered_config") @ExcludeMissing fun _tieredConfig() = tieredConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideTieredPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    tieredConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var tieredConfig: JsonField<TieredConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideTieredPrice: OverrideTieredPrice) = apply {
                    this.id = overrideTieredPrice.id
                    this.modelType = overrideTieredPrice.modelType
                    this.minimumAmount = overrideTieredPrice.minimumAmount
                    this.maximumAmount = overrideTieredPrice.maximumAmount
                    this.currency = overrideTieredPrice.currency
                    this.conversionRate = overrideTieredPrice.conversionRate
                    this.discount = overrideTieredPrice.discount
                    this.fixedPriceQuantity = overrideTieredPrice.fixedPriceQuantity
                    this.tieredConfig = overrideTieredPrice.tieredConfig
                    additionalProperties(overrideTieredPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun tieredConfig(tieredConfig: TieredConfig) =
                    tieredConfig(JsonField.of(tieredConfig))

                @JsonProperty("tiered_config")
                @ExcludeMissing
                fun tieredConfig(tieredConfig: JsonField<TieredConfig>) = apply {
                    this.tieredConfig = tieredConfig
                }

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

                fun build(): OverrideTieredPrice =
                    OverrideTieredPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        tieredConfig,
                        additionalProperties.toUnmodifiable(),
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

                    @JvmField val TIERED = ModelType(JsonField.of("tiered"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    TIERED,
                }

                enum class Value {
                    TIERED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TIERED -> Value.TIERED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TIERED -> Known.TIERED
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = TieredConfig.Builder::class)
            @NoAutoDetect
            class TieredConfig
            private constructor(
                private val tiers: JsonField<List<Tier>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** Tiers for rating based on total usage quantities into the specified tier */
                fun tiers(): List<Tier> = tiers.getRequired("tiers")

                /** Tiers for rating based on total usage quantities into the specified tier */
                @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): TieredConfig = apply {
                    if (!validated) {
                        tiers().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tieredConfig: TieredConfig) = apply {
                        this.tiers = tieredConfig.tiers
                        additionalProperties(tieredConfig.additionalProperties)
                    }

                    /** Tiers for rating based on total usage quantities into the specified tier */
                    fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                    /** Tiers for rating based on total usage quantities into the specified tier */
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

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

                    fun build(): TieredConfig =
                        TieredConfig(
                            tiers.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable()
                        )
                }

                @JsonDeserialize(builder = Tier.Builder::class)
                @NoAutoDetect
                class Tier
                private constructor(
                    private val firstUnit: JsonField<Double>,
                    private val lastUnit: JsonField<Double>,
                    private val unitAmount: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** Inclusive tier starting value */
                    fun firstUnit(): Double = firstUnit.getRequired("first_unit")

                    /** Exclusive tier ending value. If null, this is treated as the last tier */
                    fun lastUnit(): Optional<Double> =
                        Optional.ofNullable(lastUnit.getNullable("last_unit"))

                    /** Amount per unit */
                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    /** Inclusive tier starting value */
                    @JsonProperty("first_unit") @ExcludeMissing fun _firstUnit() = firstUnit

                    /** Exclusive tier ending value. If null, this is treated as the last tier */
                    @JsonProperty("last_unit") @ExcludeMissing fun _lastUnit() = lastUnit

                    /** Amount per unit */
                    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Tier = apply {
                        if (!validated) {
                            firstUnit()
                            lastUnit()
                            unitAmount()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var firstUnit: JsonField<Double> = JsonMissing.of()
                        private var lastUnit: JsonField<Double> = JsonMissing.of()
                        private var unitAmount: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tier: Tier) = apply {
                            this.firstUnit = tier.firstUnit
                            this.lastUnit = tier.lastUnit
                            this.unitAmount = tier.unitAmount
                            additionalProperties(tier.additionalProperties)
                        }

                        /** Inclusive tier starting value */
                        fun firstUnit(firstUnit: Double) = firstUnit(JsonField.of(firstUnit))

                        /** Inclusive tier starting value */
                        @JsonProperty("first_unit")
                        @ExcludeMissing
                        fun firstUnit(firstUnit: JsonField<Double>) = apply {
                            this.firstUnit = firstUnit
                        }

                        /**
                         * Exclusive tier ending value. If null, this is treated as the last tier
                         */
                        fun lastUnit(lastUnit: Double) = lastUnit(JsonField.of(lastUnit))

                        /**
                         * Exclusive tier ending value. If null, this is treated as the last tier
                         */
                        @JsonProperty("last_unit")
                        @ExcludeMissing
                        fun lastUnit(lastUnit: JsonField<Double>) = apply {
                            this.lastUnit = lastUnit
                        }

                        /** Amount per unit */
                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        /** Amount per unit */
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Tier =
                            Tier(
                                firstUnit,
                                lastUnit,
                                unitAmount,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Tier && this.firstUnit == other.firstUnit && this.lastUnit == other.lastUnit && this.unitAmount == other.unitAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(firstUnit, lastUnit, unitAmount, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Tier{firstUnit=$firstUnit, lastUnit=$lastUnit, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TieredConfig && this.tiers == other.tiers && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(tiers, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "TieredConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideTieredPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.tieredConfig == other.tieredConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, tieredConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideTieredPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, tieredConfig=$tieredConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideTieredBpsPrice.Builder::class)
        @NoAutoDetect
        class OverrideTieredBpsPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val tieredBpsConfig: JsonField<TieredBpsConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun tieredBpsConfig(): TieredBpsConfig =
                tieredBpsConfig.getRequired("tiered_bps_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("tiered_bps_config")
            @ExcludeMissing
            fun _tieredBpsConfig() = tieredBpsConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideTieredBpsPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    tieredBpsConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var tieredBpsConfig: JsonField<TieredBpsConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideTieredBpsPrice: OverrideTieredBpsPrice) = apply {
                    this.id = overrideTieredBpsPrice.id
                    this.modelType = overrideTieredBpsPrice.modelType
                    this.minimumAmount = overrideTieredBpsPrice.minimumAmount
                    this.maximumAmount = overrideTieredBpsPrice.maximumAmount
                    this.currency = overrideTieredBpsPrice.currency
                    this.conversionRate = overrideTieredBpsPrice.conversionRate
                    this.discount = overrideTieredBpsPrice.discount
                    this.fixedPriceQuantity = overrideTieredBpsPrice.fixedPriceQuantity
                    this.tieredBpsConfig = overrideTieredBpsPrice.tieredBpsConfig
                    additionalProperties(overrideTieredBpsPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun tieredBpsConfig(tieredBpsConfig: TieredBpsConfig) =
                    tieredBpsConfig(JsonField.of(tieredBpsConfig))

                @JsonProperty("tiered_bps_config")
                @ExcludeMissing
                fun tieredBpsConfig(tieredBpsConfig: JsonField<TieredBpsConfig>) = apply {
                    this.tieredBpsConfig = tieredBpsConfig
                }

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

                fun build(): OverrideTieredBpsPrice =
                    OverrideTieredBpsPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        tieredBpsConfig,
                        additionalProperties.toUnmodifiable(),
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

                    @JvmField val TIERED_BPS = ModelType(JsonField.of("tiered_bps"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    TIERED_BPS,
                }

                enum class Value {
                    TIERED_BPS,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TIERED_BPS -> Value.TIERED_BPS
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TIERED_BPS -> Known.TIERED_BPS
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = TieredBpsConfig.Builder::class)
            @NoAutoDetect
            class TieredBpsConfig
            private constructor(
                private val tiers: JsonField<List<Tier>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /**
                 * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified
                 * tiers
                 */
                fun tiers(): List<Tier> = tiers.getRequired("tiers")

                /**
                 * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified
                 * tiers
                 */
                @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): TieredBpsConfig = apply {
                    if (!validated) {
                        tiers().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tieredBpsConfig: TieredBpsConfig) = apply {
                        this.tiers = tieredBpsConfig.tiers
                        additionalProperties(tieredBpsConfig.additionalProperties)
                    }

                    /**
                     * Tiers for a Graduated BPS pricing model, where usage is bucketed into
                     * specified tiers
                     */
                    fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                    /**
                     * Tiers for a Graduated BPS pricing model, where usage is bucketed into
                     * specified tiers
                     */
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

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

                    fun build(): TieredBpsConfig =
                        TieredBpsConfig(
                            tiers.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable()
                        )
                }

                @JsonDeserialize(builder = Tier.Builder::class)
                @NoAutoDetect
                class Tier
                private constructor(
                    private val minimumAmount: JsonField<String>,
                    private val maximumAmount: JsonField<String>,
                    private val bps: JsonField<Double>,
                    private val perUnitMaximum: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** Inclusive tier starting value */
                    fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                    /** Exclusive tier ending value */
                    fun maximumAmount(): Optional<String> =
                        Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

                    /** Per-event basis point rate */
                    fun bps(): Double = bps.getRequired("bps")

                    /** Per unit maximum to charge */
                    fun perUnitMaximum(): Optional<String> =
                        Optional.ofNullable(perUnitMaximum.getNullable("per_unit_maximum"))

                    /** Inclusive tier starting value */
                    @JsonProperty("minimum_amount")
                    @ExcludeMissing
                    fun _minimumAmount() = minimumAmount

                    /** Exclusive tier ending value */
                    @JsonProperty("maximum_amount")
                    @ExcludeMissing
                    fun _maximumAmount() = maximumAmount

                    /** Per-event basis point rate */
                    @JsonProperty("bps") @ExcludeMissing fun _bps() = bps

                    /** Per unit maximum to charge */
                    @JsonProperty("per_unit_maximum")
                    @ExcludeMissing
                    fun _perUnitMaximum() = perUnitMaximum

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Tier = apply {
                        if (!validated) {
                            minimumAmount()
                            maximumAmount()
                            bps()
                            perUnitMaximum()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var minimumAmount: JsonField<String> = JsonMissing.of()
                        private var maximumAmount: JsonField<String> = JsonMissing.of()
                        private var bps: JsonField<Double> = JsonMissing.of()
                        private var perUnitMaximum: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tier: Tier) = apply {
                            this.minimumAmount = tier.minimumAmount
                            this.maximumAmount = tier.maximumAmount
                            this.bps = tier.bps
                            this.perUnitMaximum = tier.perUnitMaximum
                            additionalProperties(tier.additionalProperties)
                        }

                        /** Inclusive tier starting value */
                        fun minimumAmount(minimumAmount: String) =
                            minimumAmount(JsonField.of(minimumAmount))

                        /** Inclusive tier starting value */
                        @JsonProperty("minimum_amount")
                        @ExcludeMissing
                        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                            this.minimumAmount = minimumAmount
                        }

                        /** Exclusive tier ending value */
                        fun maximumAmount(maximumAmount: String) =
                            maximumAmount(JsonField.of(maximumAmount))

                        /** Exclusive tier ending value */
                        @JsonProperty("maximum_amount")
                        @ExcludeMissing
                        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                            this.maximumAmount = maximumAmount
                        }

                        /** Per-event basis point rate */
                        fun bps(bps: Double) = bps(JsonField.of(bps))

                        /** Per-event basis point rate */
                        @JsonProperty("bps")
                        @ExcludeMissing
                        fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

                        /** Per unit maximum to charge */
                        fun perUnitMaximum(perUnitMaximum: String) =
                            perUnitMaximum(JsonField.of(perUnitMaximum))

                        /** Per unit maximum to charge */
                        @JsonProperty("per_unit_maximum")
                        @ExcludeMissing
                        fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                            this.perUnitMaximum = perUnitMaximum
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Tier =
                            Tier(
                                minimumAmount,
                                maximumAmount,
                                bps,
                                perUnitMaximum,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Tier && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.bps == other.bps && this.perUnitMaximum == other.perUnitMaximum && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(minimumAmount, maximumAmount, bps, perUnitMaximum, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Tier{minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TieredBpsConfig && this.tiers == other.tiers && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(tiers, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "TieredBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideTieredBpsPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.tieredBpsConfig == other.tieredBpsConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, tieredBpsConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideTieredBpsPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, tieredBpsConfig=$tieredBpsConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideBpsPrice.Builder::class)
        @NoAutoDetect
        class OverrideBpsPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val bpsConfig: JsonField<BpsConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun bpsConfig(): BpsConfig = bpsConfig.getRequired("bps_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("bps_config") @ExcludeMissing fun _bpsConfig() = bpsConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideBpsPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    bpsConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var bpsConfig: JsonField<BpsConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideBpsPrice: OverrideBpsPrice) = apply {
                    this.id = overrideBpsPrice.id
                    this.modelType = overrideBpsPrice.modelType
                    this.minimumAmount = overrideBpsPrice.minimumAmount
                    this.maximumAmount = overrideBpsPrice.maximumAmount
                    this.currency = overrideBpsPrice.currency
                    this.conversionRate = overrideBpsPrice.conversionRate
                    this.discount = overrideBpsPrice.discount
                    this.fixedPriceQuantity = overrideBpsPrice.fixedPriceQuantity
                    this.bpsConfig = overrideBpsPrice.bpsConfig
                    additionalProperties(overrideBpsPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun bpsConfig(bpsConfig: BpsConfig) = bpsConfig(JsonField.of(bpsConfig))

                @JsonProperty("bps_config")
                @ExcludeMissing
                fun bpsConfig(bpsConfig: JsonField<BpsConfig>) = apply {
                    this.bpsConfig = bpsConfig
                }

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

                fun build(): OverrideBpsPrice =
                    OverrideBpsPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        bpsConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = BpsConfig.Builder::class)
            @NoAutoDetect
            class BpsConfig
            private constructor(
                private val bps: JsonField<Double>,
                private val perUnitMaximum: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** Basis point take rate per event */
                fun bps(): Double = bps.getRequired("bps")

                /** Optional currency amount maximum to cap spend per event */
                fun perUnitMaximum(): Optional<String> =
                    Optional.ofNullable(perUnitMaximum.getNullable("per_unit_maximum"))

                /** Basis point take rate per event */
                @JsonProperty("bps") @ExcludeMissing fun _bps() = bps

                /** Optional currency amount maximum to cap spend per event */
                @JsonProperty("per_unit_maximum")
                @ExcludeMissing
                fun _perUnitMaximum() = perUnitMaximum

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): BpsConfig = apply {
                    if (!validated) {
                        bps()
                        perUnitMaximum()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var bps: JsonField<Double> = JsonMissing.of()
                    private var perUnitMaximum: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(bpsConfig: BpsConfig) = apply {
                        this.bps = bpsConfig.bps
                        this.perUnitMaximum = bpsConfig.perUnitMaximum
                        additionalProperties(bpsConfig.additionalProperties)
                    }

                    /** Basis point take rate per event */
                    fun bps(bps: Double) = bps(JsonField.of(bps))

                    /** Basis point take rate per event */
                    @JsonProperty("bps")
                    @ExcludeMissing
                    fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

                    /** Optional currency amount maximum to cap spend per event */
                    fun perUnitMaximum(perUnitMaximum: String) =
                        perUnitMaximum(JsonField.of(perUnitMaximum))

                    /** Optional currency amount maximum to cap spend per event */
                    @JsonProperty("per_unit_maximum")
                    @ExcludeMissing
                    fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                        this.perUnitMaximum = perUnitMaximum
                    }

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

                    fun build(): BpsConfig =
                        BpsConfig(
                            bps,
                            perUnitMaximum,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BpsConfig && this.bps == other.bps && this.perUnitMaximum == other.perUnitMaximum && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(bps, perUnitMaximum, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "BpsConfig{bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
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

                    @JvmField val BPS = ModelType(JsonField.of("bps"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    BPS,
                }

                enum class Value {
                    BPS,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BPS -> Value.BPS
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BPS -> Known.BPS
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideBpsPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.bpsConfig == other.bpsConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, bpsConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideBpsPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, bpsConfig=$bpsConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideBulkBpsPrice.Builder::class)
        @NoAutoDetect
        class OverrideBulkBpsPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val bulkBpsConfig: JsonField<BulkBpsConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun bulkBpsConfig(): BulkBpsConfig = bulkBpsConfig.getRequired("bulk_bps_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("bulk_bps_config") @ExcludeMissing fun _bulkBpsConfig() = bulkBpsConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideBulkBpsPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    bulkBpsConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var bulkBpsConfig: JsonField<BulkBpsConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideBulkBpsPrice: OverrideBulkBpsPrice) = apply {
                    this.id = overrideBulkBpsPrice.id
                    this.modelType = overrideBulkBpsPrice.modelType
                    this.minimumAmount = overrideBulkBpsPrice.minimumAmount
                    this.maximumAmount = overrideBulkBpsPrice.maximumAmount
                    this.currency = overrideBulkBpsPrice.currency
                    this.conversionRate = overrideBulkBpsPrice.conversionRate
                    this.discount = overrideBulkBpsPrice.discount
                    this.fixedPriceQuantity = overrideBulkBpsPrice.fixedPriceQuantity
                    this.bulkBpsConfig = overrideBulkBpsPrice.bulkBpsConfig
                    additionalProperties(overrideBulkBpsPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun bulkBpsConfig(bulkBpsConfig: BulkBpsConfig) =
                    bulkBpsConfig(JsonField.of(bulkBpsConfig))

                @JsonProperty("bulk_bps_config")
                @ExcludeMissing
                fun bulkBpsConfig(bulkBpsConfig: JsonField<BulkBpsConfig>) = apply {
                    this.bulkBpsConfig = bulkBpsConfig
                }

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

                fun build(): OverrideBulkBpsPrice =
                    OverrideBulkBpsPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        bulkBpsConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = BulkBpsConfig.Builder::class)
            @NoAutoDetect
            class BulkBpsConfig
            private constructor(
                private val tiers: JsonField<List<Tier>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /**
                 * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
                 * based on total volume
                 */
                fun tiers(): List<Tier> = tiers.getRequired("tiers")

                /**
                 * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
                 * based on total volume
                 */
                @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): BulkBpsConfig = apply {
                    if (!validated) {
                        tiers().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(bulkBpsConfig: BulkBpsConfig) = apply {
                        this.tiers = bulkBpsConfig.tiers
                        additionalProperties(bulkBpsConfig.additionalProperties)
                    }

                    /**
                     * Tiers for a bulk BPS pricing model where all usage is aggregated to a single
                     * tier based on total volume
                     */
                    fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                    /**
                     * Tiers for a bulk BPS pricing model where all usage is aggregated to a single
                     * tier based on total volume
                     */
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

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

                    fun build(): BulkBpsConfig =
                        BulkBpsConfig(
                            tiers.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable()
                        )
                }

                @JsonDeserialize(builder = Tier.Builder::class)
                @NoAutoDetect
                class Tier
                private constructor(
                    private val maximumAmount: JsonField<String>,
                    private val bps: JsonField<Double>,
                    private val perUnitMaximum: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** Upper bound for tier */
                    fun maximumAmount(): Optional<String> =
                        Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

                    /** Basis points to rate on */
                    fun bps(): Double = bps.getRequired("bps")

                    /** The maximum amount to charge for any one event */
                    fun perUnitMaximum(): Optional<String> =
                        Optional.ofNullable(perUnitMaximum.getNullable("per_unit_maximum"))

                    /** Upper bound for tier */
                    @JsonProperty("maximum_amount")
                    @ExcludeMissing
                    fun _maximumAmount() = maximumAmount

                    /** Basis points to rate on */
                    @JsonProperty("bps") @ExcludeMissing fun _bps() = bps

                    /** The maximum amount to charge for any one event */
                    @JsonProperty("per_unit_maximum")
                    @ExcludeMissing
                    fun _perUnitMaximum() = perUnitMaximum

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Tier = apply {
                        if (!validated) {
                            maximumAmount()
                            bps()
                            perUnitMaximum()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var maximumAmount: JsonField<String> = JsonMissing.of()
                        private var bps: JsonField<Double> = JsonMissing.of()
                        private var perUnitMaximum: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tier: Tier) = apply {
                            this.maximumAmount = tier.maximumAmount
                            this.bps = tier.bps
                            this.perUnitMaximum = tier.perUnitMaximum
                            additionalProperties(tier.additionalProperties)
                        }

                        /** Upper bound for tier */
                        fun maximumAmount(maximumAmount: String) =
                            maximumAmount(JsonField.of(maximumAmount))

                        /** Upper bound for tier */
                        @JsonProperty("maximum_amount")
                        @ExcludeMissing
                        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                            this.maximumAmount = maximumAmount
                        }

                        /** Basis points to rate on */
                        fun bps(bps: Double) = bps(JsonField.of(bps))

                        /** Basis points to rate on */
                        @JsonProperty("bps")
                        @ExcludeMissing
                        fun bps(bps: JsonField<Double>) = apply { this.bps = bps }

                        /** The maximum amount to charge for any one event */
                        fun perUnitMaximum(perUnitMaximum: String) =
                            perUnitMaximum(JsonField.of(perUnitMaximum))

                        /** The maximum amount to charge for any one event */
                        @JsonProperty("per_unit_maximum")
                        @ExcludeMissing
                        fun perUnitMaximum(perUnitMaximum: JsonField<String>) = apply {
                            this.perUnitMaximum = perUnitMaximum
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Tier =
                            Tier(
                                maximumAmount,
                                bps,
                                perUnitMaximum,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Tier && this.maximumAmount == other.maximumAmount && this.bps == other.bps && this.perUnitMaximum == other.perUnitMaximum && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(maximumAmount, bps, perUnitMaximum, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Tier{maximumAmount=$maximumAmount, bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BulkBpsConfig && this.tiers == other.tiers && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(tiers, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "BulkBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
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

                    @JvmField val BULK_BPS = ModelType(JsonField.of("bulk_bps"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    BULK_BPS,
                }

                enum class Value {
                    BULK_BPS,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BULK_BPS -> Value.BULK_BPS
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BULK_BPS -> Known.BULK_BPS
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideBulkBpsPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.bulkBpsConfig == other.bulkBpsConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, bulkBpsConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideBulkBpsPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, bulkBpsConfig=$bulkBpsConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideBulkPrice.Builder::class)
        @NoAutoDetect
        class OverrideBulkPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val bulkConfig: JsonField<BulkConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun bulkConfig(): BulkConfig = bulkConfig.getRequired("bulk_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("bulk_config") @ExcludeMissing fun _bulkConfig() = bulkConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideBulkPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    bulkConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var bulkConfig: JsonField<BulkConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideBulkPrice: OverrideBulkPrice) = apply {
                    this.id = overrideBulkPrice.id
                    this.modelType = overrideBulkPrice.modelType
                    this.minimumAmount = overrideBulkPrice.minimumAmount
                    this.maximumAmount = overrideBulkPrice.maximumAmount
                    this.currency = overrideBulkPrice.currency
                    this.conversionRate = overrideBulkPrice.conversionRate
                    this.discount = overrideBulkPrice.discount
                    this.fixedPriceQuantity = overrideBulkPrice.fixedPriceQuantity
                    this.bulkConfig = overrideBulkPrice.bulkConfig
                    additionalProperties(overrideBulkPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun bulkConfig(bulkConfig: BulkConfig) = bulkConfig(JsonField.of(bulkConfig))

                @JsonProperty("bulk_config")
                @ExcludeMissing
                fun bulkConfig(bulkConfig: JsonField<BulkConfig>) = apply {
                    this.bulkConfig = bulkConfig
                }

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

                fun build(): OverrideBulkPrice =
                    OverrideBulkPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        bulkConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = BulkConfig.Builder::class)
            @NoAutoDetect
            class BulkConfig
            private constructor(
                private val tiers: JsonField<List<Tier>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** Bulk tiers for rating based on total usage volume */
                fun tiers(): List<Tier> = tiers.getRequired("tiers")

                /** Bulk tiers for rating based on total usage volume */
                @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): BulkConfig = apply {
                    if (!validated) {
                        tiers().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(bulkConfig: BulkConfig) = apply {
                        this.tiers = bulkConfig.tiers
                        additionalProperties(bulkConfig.additionalProperties)
                    }

                    /** Bulk tiers for rating based on total usage volume */
                    fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                    /** Bulk tiers for rating based on total usage volume */
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

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

                    fun build(): BulkConfig =
                        BulkConfig(
                            tiers.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable()
                        )
                }

                @JsonDeserialize(builder = Tier.Builder::class)
                @NoAutoDetect
                class Tier
                private constructor(
                    private val maximumUnits: JsonField<Double>,
                    private val unitAmount: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** Upper bound for this tier */
                    fun maximumUnits(): Optional<Double> =
                        Optional.ofNullable(maximumUnits.getNullable("maximum_units"))

                    /** Amount per unit */
                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    /** Upper bound for this tier */
                    @JsonProperty("maximum_units")
                    @ExcludeMissing
                    fun _maximumUnits() = maximumUnits

                    /** Amount per unit */
                    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Tier = apply {
                        if (!validated) {
                            maximumUnits()
                            unitAmount()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var maximumUnits: JsonField<Double> = JsonMissing.of()
                        private var unitAmount: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tier: Tier) = apply {
                            this.maximumUnits = tier.maximumUnits
                            this.unitAmount = tier.unitAmount
                            additionalProperties(tier.additionalProperties)
                        }

                        /** Upper bound for this tier */
                        fun maximumUnits(maximumUnits: Double) =
                            maximumUnits(JsonField.of(maximumUnits))

                        /** Upper bound for this tier */
                        @JsonProperty("maximum_units")
                        @ExcludeMissing
                        fun maximumUnits(maximumUnits: JsonField<Double>) = apply {
                            this.maximumUnits = maximumUnits
                        }

                        /** Amount per unit */
                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        /** Amount per unit */
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Tier =
                            Tier(
                                maximumUnits,
                                unitAmount,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Tier && this.maximumUnits == other.maximumUnits && this.unitAmount == other.unitAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(maximumUnits, unitAmount, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Tier{maximumUnits=$maximumUnits, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BulkConfig && this.tiers == other.tiers && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(tiers, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "BulkConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
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

                    @JvmField val BULK = ModelType(JsonField.of("bulk"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    BULK,
                }

                enum class Value {
                    BULK,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BULK -> Value.BULK
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BULK -> Known.BULK
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideBulkPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.bulkConfig == other.bulkConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, bulkConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideBulkPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, bulkConfig=$bulkConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideThresholdTotalAmountPrice.Builder::class)
        @NoAutoDetect
        class OverrideThresholdTotalAmountPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val thresholdTotalAmountConfig: JsonField<ThresholdTotalAmountConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun thresholdTotalAmountConfig(): ThresholdTotalAmountConfig =
                thresholdTotalAmountConfig.getRequired("threshold_total_amount_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("threshold_total_amount_config")
            @ExcludeMissing
            fun _thresholdTotalAmountConfig() = thresholdTotalAmountConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideThresholdTotalAmountPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    thresholdTotalAmountConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var thresholdTotalAmountConfig: JsonField<ThresholdTotalAmountConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    overrideThresholdTotalAmountPrice: OverrideThresholdTotalAmountPrice
                ) = apply {
                    this.id = overrideThresholdTotalAmountPrice.id
                    this.modelType = overrideThresholdTotalAmountPrice.modelType
                    this.minimumAmount = overrideThresholdTotalAmountPrice.minimumAmount
                    this.maximumAmount = overrideThresholdTotalAmountPrice.maximumAmount
                    this.currency = overrideThresholdTotalAmountPrice.currency
                    this.conversionRate = overrideThresholdTotalAmountPrice.conversionRate
                    this.discount = overrideThresholdTotalAmountPrice.discount
                    this.fixedPriceQuantity = overrideThresholdTotalAmountPrice.fixedPriceQuantity
                    this.thresholdTotalAmountConfig =
                        overrideThresholdTotalAmountPrice.thresholdTotalAmountConfig
                    additionalProperties(overrideThresholdTotalAmountPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun thresholdTotalAmountConfig(
                    thresholdTotalAmountConfig: ThresholdTotalAmountConfig
                ) = thresholdTotalAmountConfig(JsonField.of(thresholdTotalAmountConfig))

                @JsonProperty("threshold_total_amount_config")
                @ExcludeMissing
                fun thresholdTotalAmountConfig(
                    thresholdTotalAmountConfig: JsonField<ThresholdTotalAmountConfig>
                ) = apply { this.thresholdTotalAmountConfig = thresholdTotalAmountConfig }

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

                fun build(): OverrideThresholdTotalAmountPrice =
                    OverrideThresholdTotalAmountPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        thresholdTotalAmountConfig,
                        additionalProperties.toUnmodifiable(),
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

                    @JvmField
                    val THRESHOLD_TOTAL_AMOUNT = ModelType(JsonField.of("threshold_total_amount"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    THRESHOLD_TOTAL_AMOUNT,
                }

                enum class Value {
                    THRESHOLD_TOTAL_AMOUNT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        THRESHOLD_TOTAL_AMOUNT -> Value.THRESHOLD_TOTAL_AMOUNT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        THRESHOLD_TOTAL_AMOUNT -> Known.THRESHOLD_TOTAL_AMOUNT
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = ThresholdTotalAmountConfig.Builder::class)
            @NoAutoDetect
            class ThresholdTotalAmountConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ThresholdTotalAmountConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(thresholdTotalAmountConfig: ThresholdTotalAmountConfig) =
                        apply {
                            additionalProperties(thresholdTotalAmountConfig.additionalProperties)
                        }

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

                    fun build(): ThresholdTotalAmountConfig =
                        ThresholdTotalAmountConfig(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ThresholdTotalAmountConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "ThresholdTotalAmountConfig{additionalProperties=$additionalProperties}"
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideThresholdTotalAmountPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.thresholdTotalAmountConfig == other.thresholdTotalAmountConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, thresholdTotalAmountConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideThresholdTotalAmountPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, thresholdTotalAmountConfig=$thresholdTotalAmountConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideTieredPackagePrice.Builder::class)
        @NoAutoDetect
        class OverrideTieredPackagePrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val tieredPackageConfig: JsonField<TieredPackageConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun tieredPackageConfig(): TieredPackageConfig =
                tieredPackageConfig.getRequired("tiered_package_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("tiered_package_config")
            @ExcludeMissing
            fun _tieredPackageConfig() = tieredPackageConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideTieredPackagePrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    tieredPackageConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var tieredPackageConfig: JsonField<TieredPackageConfig> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideTieredPackagePrice: OverrideTieredPackagePrice) = apply {
                    this.id = overrideTieredPackagePrice.id
                    this.modelType = overrideTieredPackagePrice.modelType
                    this.minimumAmount = overrideTieredPackagePrice.minimumAmount
                    this.maximumAmount = overrideTieredPackagePrice.maximumAmount
                    this.currency = overrideTieredPackagePrice.currency
                    this.conversionRate = overrideTieredPackagePrice.conversionRate
                    this.discount = overrideTieredPackagePrice.discount
                    this.fixedPriceQuantity = overrideTieredPackagePrice.fixedPriceQuantity
                    this.tieredPackageConfig = overrideTieredPackagePrice.tieredPackageConfig
                    additionalProperties(overrideTieredPackagePrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun tieredPackageConfig(tieredPackageConfig: TieredPackageConfig) =
                    tieredPackageConfig(JsonField.of(tieredPackageConfig))

                @JsonProperty("tiered_package_config")
                @ExcludeMissing
                fun tieredPackageConfig(tieredPackageConfig: JsonField<TieredPackageConfig>) =
                    apply {
                        this.tieredPackageConfig = tieredPackageConfig
                    }

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

                fun build(): OverrideTieredPackagePrice =
                    OverrideTieredPackagePrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        tieredPackageConfig,
                        additionalProperties.toUnmodifiable(),
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

                    @JvmField val TIERED_PACKAGE = ModelType(JsonField.of("tiered_package"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    TIERED_PACKAGE,
                }

                enum class Value {
                    TIERED_PACKAGE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TIERED_PACKAGE -> Value.TIERED_PACKAGE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TIERED_PACKAGE -> Known.TIERED_PACKAGE
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = TieredPackageConfig.Builder::class)
            @NoAutoDetect
            class TieredPackageConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): TieredPackageConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tieredPackageConfig: TieredPackageConfig) = apply {
                        additionalProperties(tieredPackageConfig.additionalProperties)
                    }

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

                    fun build(): TieredPackageConfig =
                        TieredPackageConfig(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TieredPackageConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "TieredPackageConfig{additionalProperties=$additionalProperties}"
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideTieredPackagePrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.tieredPackageConfig == other.tieredPackageConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, tieredPackageConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideTieredPackagePrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, tieredPackageConfig=$tieredPackageConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideTieredWithMinimumPrice.Builder::class)
        @NoAutoDetect
        class OverrideTieredWithMinimumPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val tieredWithMinimumConfig: JsonField<TieredWithMinimumConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun tieredWithMinimumConfig(): TieredWithMinimumConfig =
                tieredWithMinimumConfig.getRequired("tiered_with_minimum_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("tiered_with_minimum_config")
            @ExcludeMissing
            fun _tieredWithMinimumConfig() = tieredWithMinimumConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideTieredWithMinimumPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    tieredWithMinimumConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var tieredWithMinimumConfig: JsonField<TieredWithMinimumConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideTieredWithMinimumPrice: OverrideTieredWithMinimumPrice) =
                    apply {
                        this.id = overrideTieredWithMinimumPrice.id
                        this.modelType = overrideTieredWithMinimumPrice.modelType
                        this.minimumAmount = overrideTieredWithMinimumPrice.minimumAmount
                        this.maximumAmount = overrideTieredWithMinimumPrice.maximumAmount
                        this.currency = overrideTieredWithMinimumPrice.currency
                        this.conversionRate = overrideTieredWithMinimumPrice.conversionRate
                        this.discount = overrideTieredWithMinimumPrice.discount
                        this.fixedPriceQuantity = overrideTieredWithMinimumPrice.fixedPriceQuantity
                        this.tieredWithMinimumConfig =
                            overrideTieredWithMinimumPrice.tieredWithMinimumConfig
                        additionalProperties(overrideTieredWithMinimumPrice.additionalProperties)
                    }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun tieredWithMinimumConfig(tieredWithMinimumConfig: TieredWithMinimumConfig) =
                    tieredWithMinimumConfig(JsonField.of(tieredWithMinimumConfig))

                @JsonProperty("tiered_with_minimum_config")
                @ExcludeMissing
                fun tieredWithMinimumConfig(
                    tieredWithMinimumConfig: JsonField<TieredWithMinimumConfig>
                ) = apply { this.tieredWithMinimumConfig = tieredWithMinimumConfig }

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

                fun build(): OverrideTieredWithMinimumPrice =
                    OverrideTieredWithMinimumPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        tieredWithMinimumConfig,
                        additionalProperties.toUnmodifiable(),
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

                    @JvmField
                    val TIERED_WITH_MINIMUM = ModelType(JsonField.of("tiered_with_minimum"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    TIERED_WITH_MINIMUM,
                }

                enum class Value {
                    TIERED_WITH_MINIMUM,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TIERED_WITH_MINIMUM -> Value.TIERED_WITH_MINIMUM
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TIERED_WITH_MINIMUM -> Known.TIERED_WITH_MINIMUM
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = TieredWithMinimumConfig.Builder::class)
            @NoAutoDetect
            class TieredWithMinimumConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): TieredWithMinimumConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tieredWithMinimumConfig: TieredWithMinimumConfig) = apply {
                        additionalProperties(tieredWithMinimumConfig.additionalProperties)
                    }

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

                    fun build(): TieredWithMinimumConfig =
                        TieredWithMinimumConfig(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TieredWithMinimumConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "TieredWithMinimumConfig{additionalProperties=$additionalProperties}"
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideTieredWithMinimumPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.tieredWithMinimumConfig == other.tieredWithMinimumConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, tieredWithMinimumConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideTieredWithMinimumPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, tieredWithMinimumConfig=$tieredWithMinimumConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverridePackageWithAllocationPrice.Builder::class)
        @NoAutoDetect
        class OverridePackageWithAllocationPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val packageWithAllocationConfig: JsonField<PackageWithAllocationConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun packageWithAllocationConfig(): PackageWithAllocationConfig =
                packageWithAllocationConfig.getRequired("package_with_allocation_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("package_with_allocation_config")
            @ExcludeMissing
            fun _packageWithAllocationConfig() = packageWithAllocationConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverridePackageWithAllocationPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    packageWithAllocationConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var packageWithAllocationConfig: JsonField<PackageWithAllocationConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    overridePackageWithAllocationPrice: OverridePackageWithAllocationPrice
                ) = apply {
                    this.id = overridePackageWithAllocationPrice.id
                    this.modelType = overridePackageWithAllocationPrice.modelType
                    this.minimumAmount = overridePackageWithAllocationPrice.minimumAmount
                    this.maximumAmount = overridePackageWithAllocationPrice.maximumAmount
                    this.currency = overridePackageWithAllocationPrice.currency
                    this.conversionRate = overridePackageWithAllocationPrice.conversionRate
                    this.discount = overridePackageWithAllocationPrice.discount
                    this.fixedPriceQuantity = overridePackageWithAllocationPrice.fixedPriceQuantity
                    this.packageWithAllocationConfig =
                        overridePackageWithAllocationPrice.packageWithAllocationConfig
                    additionalProperties(overridePackageWithAllocationPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun packageWithAllocationConfig(
                    packageWithAllocationConfig: PackageWithAllocationConfig
                ) = packageWithAllocationConfig(JsonField.of(packageWithAllocationConfig))

                @JsonProperty("package_with_allocation_config")
                @ExcludeMissing
                fun packageWithAllocationConfig(
                    packageWithAllocationConfig: JsonField<PackageWithAllocationConfig>
                ) = apply { this.packageWithAllocationConfig = packageWithAllocationConfig }

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

                fun build(): OverridePackageWithAllocationPrice =
                    OverridePackageWithAllocationPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        packageWithAllocationConfig,
                        additionalProperties.toUnmodifiable(),
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

                    @JvmField
                    val PACKAGE_WITH_ALLOCATION = ModelType(JsonField.of("package_with_allocation"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    PACKAGE_WITH_ALLOCATION,
                }

                enum class Value {
                    PACKAGE_WITH_ALLOCATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PACKAGE_WITH_ALLOCATION -> Value.PACKAGE_WITH_ALLOCATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PACKAGE_WITH_ALLOCATION -> Known.PACKAGE_WITH_ALLOCATION
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = PackageWithAllocationConfig.Builder::class)
            @NoAutoDetect
            class PackageWithAllocationConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PackageWithAllocationConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(packageWithAllocationConfig: PackageWithAllocationConfig) =
                        apply {
                            additionalProperties(packageWithAllocationConfig.additionalProperties)
                        }

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

                    fun build(): PackageWithAllocationConfig =
                        PackageWithAllocationConfig(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PackageWithAllocationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "PackageWithAllocationConfig{additionalProperties=$additionalProperties}"
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverridePackageWithAllocationPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.packageWithAllocationConfig == other.packageWithAllocationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, packageWithAllocationConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverridePackageWithAllocationPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, packageWithAllocationConfig=$packageWithAllocationConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideUnitWithPercentPrice.Builder::class)
        @NoAutoDetect
        class OverrideUnitWithPercentPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val unitWithPercentConfig: JsonField<UnitWithPercentConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun unitWithPercentConfig(): UnitWithPercentConfig =
                unitWithPercentConfig.getRequired("unit_with_percent_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("unit_with_percent_config")
            @ExcludeMissing
            fun _unitWithPercentConfig() = unitWithPercentConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideUnitWithPercentPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    unitWithPercentConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var unitWithPercentConfig: JsonField<UnitWithPercentConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideUnitWithPercentPrice: OverrideUnitWithPercentPrice) =
                    apply {
                        this.id = overrideUnitWithPercentPrice.id
                        this.modelType = overrideUnitWithPercentPrice.modelType
                        this.minimumAmount = overrideUnitWithPercentPrice.minimumAmount
                        this.maximumAmount = overrideUnitWithPercentPrice.maximumAmount
                        this.currency = overrideUnitWithPercentPrice.currency
                        this.conversionRate = overrideUnitWithPercentPrice.conversionRate
                        this.discount = overrideUnitWithPercentPrice.discount
                        this.fixedPriceQuantity = overrideUnitWithPercentPrice.fixedPriceQuantity
                        this.unitWithPercentConfig =
                            overrideUnitWithPercentPrice.unitWithPercentConfig
                        additionalProperties(overrideUnitWithPercentPrice.additionalProperties)
                    }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun unitWithPercentConfig(unitWithPercentConfig: UnitWithPercentConfig) =
                    unitWithPercentConfig(JsonField.of(unitWithPercentConfig))

                @JsonProperty("unit_with_percent_config")
                @ExcludeMissing
                fun unitWithPercentConfig(unitWithPercentConfig: JsonField<UnitWithPercentConfig>) =
                    apply {
                        this.unitWithPercentConfig = unitWithPercentConfig
                    }

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

                fun build(): OverrideUnitWithPercentPrice =
                    OverrideUnitWithPercentPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        unitWithPercentConfig,
                        additionalProperties.toUnmodifiable(),
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

                    @JvmField val UNIT_WITH_PERCENT = ModelType(JsonField.of("unit_with_percent"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    UNIT_WITH_PERCENT,
                }

                enum class Value {
                    UNIT_WITH_PERCENT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        UNIT_WITH_PERCENT -> Value.UNIT_WITH_PERCENT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        UNIT_WITH_PERCENT -> Known.UNIT_WITH_PERCENT
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = UnitWithPercentConfig.Builder::class)
            @NoAutoDetect
            class UnitWithPercentConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): UnitWithPercentConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(unitWithPercentConfig: UnitWithPercentConfig) = apply {
                        additionalProperties(unitWithPercentConfig.additionalProperties)
                    }

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

                    fun build(): UnitWithPercentConfig =
                        UnitWithPercentConfig(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is UnitWithPercentConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "UnitWithPercentConfig{additionalProperties=$additionalProperties}"
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideUnitWithPercentPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.unitWithPercentConfig == other.unitWithPercentConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, unitWithPercentConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideUnitWithPercentPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, unitWithPercentConfig=$unitWithPercentConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideGroupedAllocationPrice.Builder::class)
        @NoAutoDetect
        class OverrideGroupedAllocationPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val groupedAllocationConfig: JsonField<GroupedAllocationConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun groupedAllocationConfig(): GroupedAllocationConfig =
                groupedAllocationConfig.getRequired("grouped_allocation_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("grouped_allocation_config")
            @ExcludeMissing
            fun _groupedAllocationConfig() = groupedAllocationConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideGroupedAllocationPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    groupedAllocationConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var groupedAllocationConfig: JsonField<GroupedAllocationConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideGroupedAllocationPrice: OverrideGroupedAllocationPrice) =
                    apply {
                        this.id = overrideGroupedAllocationPrice.id
                        this.modelType = overrideGroupedAllocationPrice.modelType
                        this.minimumAmount = overrideGroupedAllocationPrice.minimumAmount
                        this.maximumAmount = overrideGroupedAllocationPrice.maximumAmount
                        this.currency = overrideGroupedAllocationPrice.currency
                        this.conversionRate = overrideGroupedAllocationPrice.conversionRate
                        this.discount = overrideGroupedAllocationPrice.discount
                        this.fixedPriceQuantity = overrideGroupedAllocationPrice.fixedPriceQuantity
                        this.groupedAllocationConfig =
                            overrideGroupedAllocationPrice.groupedAllocationConfig
                        additionalProperties(overrideGroupedAllocationPrice.additionalProperties)
                    }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun groupedAllocationConfig(groupedAllocationConfig: GroupedAllocationConfig) =
                    groupedAllocationConfig(JsonField.of(groupedAllocationConfig))

                @JsonProperty("grouped_allocation_config")
                @ExcludeMissing
                fun groupedAllocationConfig(
                    groupedAllocationConfig: JsonField<GroupedAllocationConfig>
                ) = apply { this.groupedAllocationConfig = groupedAllocationConfig }

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

                fun build(): OverrideGroupedAllocationPrice =
                    OverrideGroupedAllocationPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        groupedAllocationConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = GroupedAllocationConfig.Builder::class)
            @NoAutoDetect
            class GroupedAllocationConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): GroupedAllocationConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(groupedAllocationConfig: GroupedAllocationConfig) = apply {
                        additionalProperties(groupedAllocationConfig.additionalProperties)
                    }

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

                    fun build(): GroupedAllocationConfig =
                        GroupedAllocationConfig(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is GroupedAllocationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "GroupedAllocationConfig{additionalProperties=$additionalProperties}"
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

                    @JvmField val GROUPED_ALLOCATION = ModelType(JsonField.of("grouped_allocation"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    GROUPED_ALLOCATION,
                }

                enum class Value {
                    GROUPED_ALLOCATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        GROUPED_ALLOCATION -> Value.GROUPED_ALLOCATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        GROUPED_ALLOCATION -> Known.GROUPED_ALLOCATION
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideGroupedAllocationPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.groupedAllocationConfig == other.groupedAllocationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, groupedAllocationConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideGroupedAllocationPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, groupedAllocationConfig=$groupedAllocationConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideGroupedWithProratedMinimumPrice.Builder::class)
        @NoAutoDetect
        class OverrideGroupedWithProratedMinimumPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val groupedWithProratedMinimumConfig:
                JsonField<GroupedWithProratedMinimumConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun groupedWithProratedMinimumConfig(): GroupedWithProratedMinimumConfig =
                groupedWithProratedMinimumConfig.getRequired("grouped_with_prorated_minimum_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("grouped_with_prorated_minimum_config")
            @ExcludeMissing
            fun _groupedWithProratedMinimumConfig() = groupedWithProratedMinimumConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideGroupedWithProratedMinimumPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    groupedWithProratedMinimumConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var groupedWithProratedMinimumConfig:
                    JsonField<GroupedWithProratedMinimumConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    overrideGroupedWithProratedMinimumPrice: OverrideGroupedWithProratedMinimumPrice
                ) = apply {
                    this.id = overrideGroupedWithProratedMinimumPrice.id
                    this.modelType = overrideGroupedWithProratedMinimumPrice.modelType
                    this.minimumAmount = overrideGroupedWithProratedMinimumPrice.minimumAmount
                    this.maximumAmount = overrideGroupedWithProratedMinimumPrice.maximumAmount
                    this.currency = overrideGroupedWithProratedMinimumPrice.currency
                    this.conversionRate = overrideGroupedWithProratedMinimumPrice.conversionRate
                    this.discount = overrideGroupedWithProratedMinimumPrice.discount
                    this.fixedPriceQuantity =
                        overrideGroupedWithProratedMinimumPrice.fixedPriceQuantity
                    this.groupedWithProratedMinimumConfig =
                        overrideGroupedWithProratedMinimumPrice.groupedWithProratedMinimumConfig
                    additionalProperties(
                        overrideGroupedWithProratedMinimumPrice.additionalProperties
                    )
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun groupedWithProratedMinimumConfig(
                    groupedWithProratedMinimumConfig: GroupedWithProratedMinimumConfig
                ) = groupedWithProratedMinimumConfig(JsonField.of(groupedWithProratedMinimumConfig))

                @JsonProperty("grouped_with_prorated_minimum_config")
                @ExcludeMissing
                fun groupedWithProratedMinimumConfig(
                    groupedWithProratedMinimumConfig: JsonField<GroupedWithProratedMinimumConfig>
                ) = apply {
                    this.groupedWithProratedMinimumConfig = groupedWithProratedMinimumConfig
                }

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

                fun build(): OverrideGroupedWithProratedMinimumPrice =
                    OverrideGroupedWithProratedMinimumPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        groupedWithProratedMinimumConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = GroupedWithProratedMinimumConfig.Builder::class)
            @NoAutoDetect
            class GroupedWithProratedMinimumConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): GroupedWithProratedMinimumConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        groupedWithProratedMinimumConfig: GroupedWithProratedMinimumConfig
                    ) = apply {
                        additionalProperties(groupedWithProratedMinimumConfig.additionalProperties)
                    }

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

                    fun build(): GroupedWithProratedMinimumConfig =
                        GroupedWithProratedMinimumConfig(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is GroupedWithProratedMinimumConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "GroupedWithProratedMinimumConfig{additionalProperties=$additionalProperties}"
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

                    @JvmField
                    val GROUPED_WITH_PRORATED_MINIMUM =
                        ModelType(JsonField.of("grouped_with_prorated_minimum"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    GROUPED_WITH_PRORATED_MINIMUM,
                }

                enum class Value {
                    GROUPED_WITH_PRORATED_MINIMUM,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        GROUPED_WITH_PRORATED_MINIMUM -> Value.GROUPED_WITH_PRORATED_MINIMUM
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        GROUPED_WITH_PRORATED_MINIMUM -> Known.GROUPED_WITH_PRORATED_MINIMUM
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideGroupedWithProratedMinimumPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.groupedWithProratedMinimumConfig == other.groupedWithProratedMinimumConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, groupedWithProratedMinimumConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideGroupedWithProratedMinimumPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, groupedWithProratedMinimumConfig=$groupedWithProratedMinimumConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideGroupedWithMeteredMinimumPrice.Builder::class)
        @NoAutoDetect
        class OverrideGroupedWithMeteredMinimumPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val groupedWithMeteredMinimumConfig: JsonField<GroupedWithMeteredMinimumConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun groupedWithMeteredMinimumConfig(): GroupedWithMeteredMinimumConfig =
                groupedWithMeteredMinimumConfig.getRequired("grouped_with_metered_minimum_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("grouped_with_metered_minimum_config")
            @ExcludeMissing
            fun _groupedWithMeteredMinimumConfig() = groupedWithMeteredMinimumConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideGroupedWithMeteredMinimumPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    groupedWithMeteredMinimumConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var groupedWithMeteredMinimumConfig:
                    JsonField<GroupedWithMeteredMinimumConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    overrideGroupedWithMeteredMinimumPrice: OverrideGroupedWithMeteredMinimumPrice
                ) = apply {
                    this.id = overrideGroupedWithMeteredMinimumPrice.id
                    this.modelType = overrideGroupedWithMeteredMinimumPrice.modelType
                    this.minimumAmount = overrideGroupedWithMeteredMinimumPrice.minimumAmount
                    this.maximumAmount = overrideGroupedWithMeteredMinimumPrice.maximumAmount
                    this.currency = overrideGroupedWithMeteredMinimumPrice.currency
                    this.conversionRate = overrideGroupedWithMeteredMinimumPrice.conversionRate
                    this.discount = overrideGroupedWithMeteredMinimumPrice.discount
                    this.fixedPriceQuantity =
                        overrideGroupedWithMeteredMinimumPrice.fixedPriceQuantity
                    this.groupedWithMeteredMinimumConfig =
                        overrideGroupedWithMeteredMinimumPrice.groupedWithMeteredMinimumConfig
                    additionalProperties(
                        overrideGroupedWithMeteredMinimumPrice.additionalProperties
                    )
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun groupedWithMeteredMinimumConfig(
                    groupedWithMeteredMinimumConfig: GroupedWithMeteredMinimumConfig
                ) = groupedWithMeteredMinimumConfig(JsonField.of(groupedWithMeteredMinimumConfig))

                @JsonProperty("grouped_with_metered_minimum_config")
                @ExcludeMissing
                fun groupedWithMeteredMinimumConfig(
                    groupedWithMeteredMinimumConfig: JsonField<GroupedWithMeteredMinimumConfig>
                ) = apply { this.groupedWithMeteredMinimumConfig = groupedWithMeteredMinimumConfig }

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

                fun build(): OverrideGroupedWithMeteredMinimumPrice =
                    OverrideGroupedWithMeteredMinimumPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        groupedWithMeteredMinimumConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = GroupedWithMeteredMinimumConfig.Builder::class)
            @NoAutoDetect
            class GroupedWithMeteredMinimumConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): GroupedWithMeteredMinimumConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        groupedWithMeteredMinimumConfig: GroupedWithMeteredMinimumConfig
                    ) = apply {
                        additionalProperties(groupedWithMeteredMinimumConfig.additionalProperties)
                    }

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

                    fun build(): GroupedWithMeteredMinimumConfig =
                        GroupedWithMeteredMinimumConfig(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is GroupedWithMeteredMinimumConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "GroupedWithMeteredMinimumConfig{additionalProperties=$additionalProperties}"
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

                    @JvmField
                    val GROUPED_WITH_METERED_MINIMUM =
                        ModelType(JsonField.of("grouped_with_metered_minimum"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    GROUPED_WITH_METERED_MINIMUM,
                }

                enum class Value {
                    GROUPED_WITH_METERED_MINIMUM,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        GROUPED_WITH_METERED_MINIMUM -> Value.GROUPED_WITH_METERED_MINIMUM
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        GROUPED_WITH_METERED_MINIMUM -> Known.GROUPED_WITH_METERED_MINIMUM
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideGroupedWithMeteredMinimumPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.groupedWithMeteredMinimumConfig == other.groupedWithMeteredMinimumConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, groupedWithMeteredMinimumConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideGroupedWithMeteredMinimumPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, groupedWithMeteredMinimumConfig=$groupedWithMeteredMinimumConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideBulkWithProrationPrice.Builder::class)
        @NoAutoDetect
        class OverrideBulkWithProrationPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val bulkWithProrationConfig: JsonField<BulkWithProrationConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun bulkWithProrationConfig(): BulkWithProrationConfig =
                bulkWithProrationConfig.getRequired("bulk_with_proration_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("bulk_with_proration_config")
            @ExcludeMissing
            fun _bulkWithProrationConfig() = bulkWithProrationConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideBulkWithProrationPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    bulkWithProrationConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var bulkWithProrationConfig: JsonField<BulkWithProrationConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideBulkWithProrationPrice: OverrideBulkWithProrationPrice) =
                    apply {
                        this.id = overrideBulkWithProrationPrice.id
                        this.modelType = overrideBulkWithProrationPrice.modelType
                        this.minimumAmount = overrideBulkWithProrationPrice.minimumAmount
                        this.maximumAmount = overrideBulkWithProrationPrice.maximumAmount
                        this.currency = overrideBulkWithProrationPrice.currency
                        this.conversionRate = overrideBulkWithProrationPrice.conversionRate
                        this.discount = overrideBulkWithProrationPrice.discount
                        this.fixedPriceQuantity = overrideBulkWithProrationPrice.fixedPriceQuantity
                        this.bulkWithProrationConfig =
                            overrideBulkWithProrationPrice.bulkWithProrationConfig
                        additionalProperties(overrideBulkWithProrationPrice.additionalProperties)
                    }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun bulkWithProrationConfig(bulkWithProrationConfig: BulkWithProrationConfig) =
                    bulkWithProrationConfig(JsonField.of(bulkWithProrationConfig))

                @JsonProperty("bulk_with_proration_config")
                @ExcludeMissing
                fun bulkWithProrationConfig(
                    bulkWithProrationConfig: JsonField<BulkWithProrationConfig>
                ) = apply { this.bulkWithProrationConfig = bulkWithProrationConfig }

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

                fun build(): OverrideBulkWithProrationPrice =
                    OverrideBulkWithProrationPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        bulkWithProrationConfig,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = BulkWithProrationConfig.Builder::class)
            @NoAutoDetect
            class BulkWithProrationConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): BulkWithProrationConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(bulkWithProrationConfig: BulkWithProrationConfig) = apply {
                        additionalProperties(bulkWithProrationConfig.additionalProperties)
                    }

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

                    fun build(): BulkWithProrationConfig =
                        BulkWithProrationConfig(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BulkWithProrationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "BulkWithProrationConfig{additionalProperties=$additionalProperties}"
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

                    @JvmField
                    val BULK_WITH_PRORATION = ModelType(JsonField.of("bulk_with_proration"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    BULK_WITH_PRORATION,
                }

                enum class Value {
                    BULK_WITH_PRORATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BULK_WITH_PRORATION -> Value.BULK_WITH_PRORATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BULK_WITH_PRORATION -> Known.BULK_WITH_PRORATION
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideBulkWithProrationPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.bulkWithProrationConfig == other.bulkWithProrationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, bulkWithProrationConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideBulkWithProrationPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, bulkWithProrationConfig=$bulkWithProrationConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideUnitWithProrationPrice.Builder::class)
        @NoAutoDetect
        class OverrideUnitWithProrationPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val unitWithProrationConfig: JsonField<UnitWithProrationConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun unitWithProrationConfig(): UnitWithProrationConfig =
                unitWithProrationConfig.getRequired("unit_with_proration_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("unit_with_proration_config")
            @ExcludeMissing
            fun _unitWithProrationConfig() = unitWithProrationConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideUnitWithProrationPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    unitWithProrationConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var unitWithProrationConfig: JsonField<UnitWithProrationConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideUnitWithProrationPrice: OverrideUnitWithProrationPrice) =
                    apply {
                        this.id = overrideUnitWithProrationPrice.id
                        this.modelType = overrideUnitWithProrationPrice.modelType
                        this.minimumAmount = overrideUnitWithProrationPrice.minimumAmount
                        this.maximumAmount = overrideUnitWithProrationPrice.maximumAmount
                        this.currency = overrideUnitWithProrationPrice.currency
                        this.conversionRate = overrideUnitWithProrationPrice.conversionRate
                        this.discount = overrideUnitWithProrationPrice.discount
                        this.fixedPriceQuantity = overrideUnitWithProrationPrice.fixedPriceQuantity
                        this.unitWithProrationConfig =
                            overrideUnitWithProrationPrice.unitWithProrationConfig
                        additionalProperties(overrideUnitWithProrationPrice.additionalProperties)
                    }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun unitWithProrationConfig(unitWithProrationConfig: UnitWithProrationConfig) =
                    unitWithProrationConfig(JsonField.of(unitWithProrationConfig))

                @JsonProperty("unit_with_proration_config")
                @ExcludeMissing
                fun unitWithProrationConfig(
                    unitWithProrationConfig: JsonField<UnitWithProrationConfig>
                ) = apply { this.unitWithProrationConfig = unitWithProrationConfig }

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

                fun build(): OverrideUnitWithProrationPrice =
                    OverrideUnitWithProrationPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        unitWithProrationConfig,
                        additionalProperties.toUnmodifiable(),
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

                    @JvmField
                    val UNIT_WITH_PRORATION = ModelType(JsonField.of("unit_with_proration"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    UNIT_WITH_PRORATION,
                }

                enum class Value {
                    UNIT_WITH_PRORATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        UNIT_WITH_PRORATION -> Value.UNIT_WITH_PRORATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        UNIT_WITH_PRORATION -> Known.UNIT_WITH_PRORATION
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = UnitWithProrationConfig.Builder::class)
            @NoAutoDetect
            class UnitWithProrationConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): UnitWithProrationConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(unitWithProrationConfig: UnitWithProrationConfig) = apply {
                        additionalProperties(unitWithProrationConfig.additionalProperties)
                    }

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

                    fun build(): UnitWithProrationConfig =
                        UnitWithProrationConfig(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is UnitWithProrationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "UnitWithProrationConfig{additionalProperties=$additionalProperties}"
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideUnitWithProrationPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.unitWithProrationConfig == other.unitWithProrationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, unitWithProrationConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideUnitWithProrationPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, unitWithProrationConfig=$unitWithProrationConfig, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = OverrideTieredWithProrationPrice.Builder::class)
        @NoAutoDetect
        class OverrideTieredWithProrationPrice
        private constructor(
            private val id: JsonField<String>,
            private val modelType: JsonField<ModelType>,
            private val minimumAmount: JsonField<String>,
            private val maximumAmount: JsonField<String>,
            private val currency: JsonField<String>,
            private val conversionRate: JsonField<Double>,
            private val discount: JsonField<Discount>,
            private val fixedPriceQuantity: JsonField<Double>,
            private val tieredWithProrationConfig: JsonField<TieredWithProrationConfig>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun modelType(): ModelType = modelType.getRequired("model_type")

            /** The subscription's override minimum amount for the plan. */
            fun minimumAmount(): Optional<String> =
                Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

            /** The subscription's override maximum amount for the plan. */
            fun maximumAmount(): Optional<String> =
                Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(): Optional<Double> =
                Optional.ofNullable(conversionRate.getNullable("conversion_rate"))

            /** The subscription's override discount for the plan. */
            fun discount(): Optional<Discount> =
                Optional.ofNullable(discount.getNullable("discount"))

            /** The starting quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(): Optional<Double> =
                Optional.ofNullable(fixedPriceQuantity.getNullable("fixed_price_quantity"))

            fun tieredWithProrationConfig(): TieredWithProrationConfig =
                tieredWithProrationConfig.getRequired("tiered_with_proration_config")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("model_type") @ExcludeMissing fun _modelType() = modelType

            /** The subscription's override minimum amount for the plan. */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /** The subscription's override maximum amount for the plan. */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * The currency of the price. If not provided, the currency of the plan will be used.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /** The subscription's override discount for the plan. */
            @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

            /** The starting quantity of the price, if the price is a fixed price. */
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fun _fixedPriceQuantity() = fixedPriceQuantity

            @JsonProperty("tiered_with_proration_config")
            @ExcludeMissing
            fun _tieredWithProrationConfig() = tieredWithProrationConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): OverrideTieredWithProrationPrice = apply {
                if (!validated) {
                    id()
                    modelType()
                    minimumAmount()
                    maximumAmount()
                    currency()
                    conversionRate()
                    discount().map { it.validate() }
                    fixedPriceQuantity()
                    tieredWithProrationConfig().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var modelType: JsonField<ModelType> = JsonMissing.of()
                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<String> = JsonMissing.of()
                private var conversionRate: JsonField<Double> = JsonMissing.of()
                private var discount: JsonField<Discount> = JsonMissing.of()
                private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                private var tieredWithProrationConfig: JsonField<TieredWithProrationConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    overrideTieredWithProrationPrice: OverrideTieredWithProrationPrice
                ) = apply {
                    this.id = overrideTieredWithProrationPrice.id
                    this.modelType = overrideTieredWithProrationPrice.modelType
                    this.minimumAmount = overrideTieredWithProrationPrice.minimumAmount
                    this.maximumAmount = overrideTieredWithProrationPrice.maximumAmount
                    this.currency = overrideTieredWithProrationPrice.currency
                    this.conversionRate = overrideTieredWithProrationPrice.conversionRate
                    this.discount = overrideTieredWithProrationPrice.discount
                    this.fixedPriceQuantity = overrideTieredWithProrationPrice.fixedPriceQuantity
                    this.tieredWithProrationConfig =
                        overrideTieredWithProrationPrice.tieredWithProrationConfig
                    additionalProperties(overrideTieredWithProrationPrice.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

                @JsonProperty("model_type")
                @ExcludeMissing
                fun modelType(modelType: JsonField<ModelType>) = apply {
                    this.modelType = modelType
                }

                /** The subscription's override minimum amount for the plan. */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** The subscription's override minimum amount for the plan. */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /** The subscription's override maximum amount for the plan. */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** The subscription's override maximum amount for the plan. */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * The currency of the price. If not provided, the currency of the plan will be
                 * used.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                fun conversionRate(conversionRate: Double) =
                    conversionRate(JsonField.of(conversionRate))

                /** The per unit conversion rate of the price currency to the invoicing currency. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<Double>) = apply {
                    this.conversionRate = conversionRate
                }

                /** The subscription's override discount for the plan. */
                fun discount(discount: Discount) = discount(JsonField.of(discount))

                /** The subscription's override discount for the plan. */
                @JsonProperty("discount")
                @ExcludeMissing
                fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

                /** The starting quantity of the price, if the price is a fixed price. */
                fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                    fixedPriceQuantity(JsonField.of(fixedPriceQuantity))

                /** The starting quantity of the price, if the price is a fixed price. */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                    this.fixedPriceQuantity = fixedPriceQuantity
                }

                fun tieredWithProrationConfig(
                    tieredWithProrationConfig: TieredWithProrationConfig
                ) = tieredWithProrationConfig(JsonField.of(tieredWithProrationConfig))

                @JsonProperty("tiered_with_proration_config")
                @ExcludeMissing
                fun tieredWithProrationConfig(
                    tieredWithProrationConfig: JsonField<TieredWithProrationConfig>
                ) = apply { this.tieredWithProrationConfig = tieredWithProrationConfig }

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

                fun build(): OverrideTieredWithProrationPrice =
                    OverrideTieredWithProrationPrice(
                        id,
                        modelType,
                        minimumAmount,
                        maximumAmount,
                        currency,
                        conversionRate,
                        discount,
                        fixedPriceQuantity,
                        tieredWithProrationConfig,
                        additionalProperties.toUnmodifiable(),
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

                    @JvmField
                    val TIERED_WITH_PRORATION = ModelType(JsonField.of("tiered_with_proration"))

                    @JvmStatic fun of(value: String) = ModelType(JsonField.of(value))
                }

                enum class Known {
                    TIERED_WITH_PRORATION,
                }

                enum class Value {
                    TIERED_WITH_PRORATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TIERED_WITH_PRORATION -> Value.TIERED_WITH_PRORATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TIERED_WITH_PRORATION -> Known.TIERED_WITH_PRORATION
                        else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(builder = TieredWithProrationConfig.Builder::class)
            @NoAutoDetect
            class TieredWithProrationConfig
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): TieredWithProrationConfig = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tieredWithProrationConfig: TieredWithProrationConfig) =
                        apply {
                            additionalProperties(tieredWithProrationConfig.additionalProperties)
                        }

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

                    fun build(): TieredWithProrationConfig =
                        TieredWithProrationConfig(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TieredWithProrationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "TieredWithProrationConfig{additionalProperties=$additionalProperties}"
            }

            /** The subscription's override discount for the plan. */
            @JsonDeserialize(builder = Discount.Builder::class)
            @NoAutoDetect
            class Discount
            private constructor(
                private val discountType: JsonField<DiscountType>,
                private val percentageDiscount: JsonField<Double>,
                private val usageDiscount: JsonField<Double>,
                private val amountDiscount: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Optional<Double> =
                    Optional.ofNullable(percentageDiscount.getNullable("percentage_discount"))

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                fun usageDiscount(): Optional<Double> =
                    Optional.ofNullable(usageDiscount.getNullable("usage_discount"))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Optional<String> =
                    Optional.ofNullable(amountDiscount.getNullable("amount_discount"))

                @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Discount = apply {
                    if (!validated) {
                        discountType()
                        percentageDiscount()
                        usageDiscount()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var discountType: JsonField<DiscountType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discount: Discount) = apply {
                        this.discountType = discount.discountType
                        this.percentageDiscount = discount.percentageDiscount
                        this.usageDiscount = discount.usageDiscount
                        this.amountDiscount = discount.amountDiscount
                        additionalProperties(discount.additionalProperties)
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for
                     */
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

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

                    fun build(): Discount =
                        Discount(
                            discountType,
                            percentageDiscount,
                            usageDiscount,
                            amountDiscount,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class DiscountType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val PERCENTAGE = DiscountType(JsonField.of("percentage"))

                        @JvmField val TRIAL = DiscountType(JsonField.of("trial"))

                        @JvmField val USAGE = DiscountType(JsonField.of("usage"))

                        @JvmField val AMOUNT = DiscountType(JsonField.of("amount"))

                        @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                    }

                    enum class Value {
                        PERCENTAGE,
                        TRIAL,
                        USAGE,
                        AMOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE -> Value.PERCENTAGE
                            TRIAL -> Value.TRIAL
                            USAGE -> Value.USAGE
                            AMOUNT -> Value.AMOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE -> Known.PERCENTAGE
                            TRIAL -> Known.TRIAL
                            USAGE -> Known.USAGE
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Discount && this.discountType == other.discountType && this.percentageDiscount == other.percentageDiscount && this.usageDiscount == other.usageDiscount && this.amountDiscount == other.amountDiscount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(discountType, percentageDiscount, usageDiscount, amountDiscount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Discount{discountType=$discountType, percentageDiscount=$percentageDiscount, usageDiscount=$usageDiscount, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideTieredWithProrationPrice && this.id == other.id && this.modelType == other.modelType && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.currency == other.currency && this.conversionRate == other.conversionRate && this.discount == other.discount && this.fixedPriceQuantity == other.fixedPriceQuantity && this.tieredWithProrationConfig == other.tieredWithProrationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, modelType, minimumAmount, maximumAmount, currency, conversionRate, discount, fixedPriceQuantity, tieredWithProrationConfig, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideTieredWithProrationPrice{id=$id, modelType=$modelType, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, currency=$currency, conversionRate=$conversionRate, discount=$discount, fixedPriceQuantity=$fixedPriceQuantity, tieredWithProrationConfig=$tieredWithProrationConfig, additionalProperties=$additionalProperties}"
        }
    }
}
