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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class SubscriptionUpdateFixedFeeQuantityResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("active_plan_phase_order")
    @ExcludeMissing
    private val activePlanPhaseOrder: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("adjustment_intervals")
    @ExcludeMissing
    private val adjustmentIntervals: JsonField<List<AdjustmentInterval>> = JsonMissing.of(),
    @JsonProperty("auto_collection")
    @ExcludeMissing
    private val autoCollection: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("billing_cycle_anchor_configuration")
    @ExcludeMissing
    private val billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration> =
        JsonMissing.of(),
    @JsonProperty("billing_cycle_day")
    @ExcludeMissing
    private val billingCycleDay: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("current_billing_period_end_date")
    @ExcludeMissing
    private val currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("current_billing_period_start_date")
    @ExcludeMissing
    private val currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<Customer> = JsonMissing.of(),
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    private val defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discount_intervals")
    @ExcludeMissing
    private val discountIntervals: JsonField<List<DiscountInterval>> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("fixed_fee_quantity_schedule")
    @ExcludeMissing
    private val fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>> =
        JsonMissing.of(),
    @JsonProperty("invoicing_threshold")
    @ExcludeMissing
    private val invoicingThreshold: JsonField<String> = JsonMissing.of(),
    @JsonProperty("maximum_intervals")
    @ExcludeMissing
    private val maximumIntervals: JsonField<List<MaximumInterval>> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("minimum_intervals")
    @ExcludeMissing
    private val minimumIntervals: JsonField<List<MinimumInterval>> = JsonMissing.of(),
    @JsonProperty("net_terms")
    @ExcludeMissing
    private val netTerms: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("plan") @ExcludeMissing private val plan: JsonField<Plan> = JsonMissing.of(),
    @JsonProperty("price_intervals")
    @ExcludeMissing
    private val priceIntervals: JsonField<List<PriceInterval>> = JsonMissing.of(),
    @JsonProperty("redeemed_coupon")
    @ExcludeMissing
    private val redeemedCoupon: JsonField<RedeemedCoupon> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("trial_info")
    @ExcludeMissing
    private val trialInfo: JsonField<TrialInfo> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** The current plan phase that is active, only if the subscription's plan has phases. */
    fun activePlanPhaseOrder(): Optional<Long> =
        Optional.ofNullable(activePlanPhaseOrder.getNullable("active_plan_phase_order"))

    /** The adjustment intervals for this subscription. */
    fun adjustmentIntervals(): List<AdjustmentInterval> =
        adjustmentIntervals.getRequired("adjustment_intervals")

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. This property defaults to the plan's behavior. If
     * null, defaults to the customer's setting.
     */
    fun autoCollection(): Optional<Boolean> =
        Optional.ofNullable(autoCollection.getNullable("auto_collection"))

    fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfiguration =
        billingCycleAnchorConfiguration.getRequired("billing_cycle_anchor_configuration")

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     */
    fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is not part of the billing period. Set to null for subscriptions that are not
     * currently active.
     */
    fun currentBillingPeriodEndDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(
            currentBillingPeriodEndDate.getNullable("current_billing_period_end_date")
        )

    /**
     * The start date of the current billing period. This is an inclusive timestamp; the instant
     * returned is exactly the beginning of the billing period. Set to null if the subscription is
     * not currently active.
     */
    fun currentBillingPeriodStartDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(
            currentBillingPeriodStartDate.getNullable("current_billing_period_start_date")
        )

    /**
     * A customer is a buyer of your products, and the other party to the billing relationship.
     *
     * In Orb, customers are assigned system generated identifiers automatically, but it's often
     * desirable to have these match existing identifiers in your system. To avoid having to
     * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
     * identifier. See [Customer ID Aliases](/events-and-metrics/customer-aliases) for further
     * information about how these aliases work in Orb.
     *
     * In addition to having an identifier in your system, a customer may exist in a payment
     * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum
     * field to express this mapping.
     *
     * A customer also has a timezone (from the standard
     * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
     * timezone. See [Timezone localization](/essentials/timezones) for information on what this
     * timezone parameter influences within Orb.
     */
    fun customer(): Customer = customer.getRequired("customer")

    /**
     * Determines the default memo on this subscriptions' invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    fun defaultInvoiceMemo(): Optional<String> =
        Optional.ofNullable(defaultInvoiceMemo.getNullable("default_invoice_memo"))

    /** The discount intervals for this subscription. */
    fun discountIntervals(): List<DiscountInterval> =
        discountIntervals.getRequired("discount_intervals")

    /** The date Orb stops billing for this subscription. */
    fun endDate(): Optional<OffsetDateTime> = Optional.ofNullable(endDate.getNullable("end_date"))

    fun fixedFeeQuantitySchedule(): List<FixedFeeQuantitySchedule> =
        fixedFeeQuantitySchedule.getRequired("fixed_fee_quantity_schedule")

    fun invoicingThreshold(): Optional<String> =
        Optional.ofNullable(invoicingThreshold.getNullable("invoicing_threshold"))

    /** The maximum intervals for this subscription. */
    fun maximumIntervals(): List<MaximumInterval> =
        maximumIntervals.getRequired("maximum_intervals")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The minimum intervals for this subscription. */
    fun minimumIntervals(): List<MinimumInterval> =
        minimumIntervals.getRequired("minimum_intervals")

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of `0` here represents that the invoice is due on issue,
     * whereas a value of `30` represents that the customer has a month to pay the invoice.
     */
    fun netTerms(): Long = netTerms.getRequired("net_terms")

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    fun plan(): Plan = plan.getRequired("plan")

    /** The price intervals for this subscription. */
    fun priceIntervals(): List<PriceInterval> = priceIntervals.getRequired("price_intervals")

    fun redeemedCoupon(): Optional<RedeemedCoupon> =
        Optional.ofNullable(redeemedCoupon.getNullable("redeemed_coupon"))

    /** The date Orb starts billing for this subscription. */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    fun status(): Status = status.getRequired("status")

    fun trialInfo(): TrialInfo = trialInfo.getRequired("trial_info")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The current plan phase that is active, only if the subscription's plan has phases. */
    @JsonProperty("active_plan_phase_order")
    @ExcludeMissing
    fun _activePlanPhaseOrder(): JsonField<Long> = activePlanPhaseOrder

    /** The adjustment intervals for this subscription. */
    @JsonProperty("adjustment_intervals")
    @ExcludeMissing
    fun _adjustmentIntervals(): JsonField<List<AdjustmentInterval>> = adjustmentIntervals

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. This property defaults to the plan's behavior. If
     * null, defaults to the customer's setting.
     */
    @JsonProperty("auto_collection")
    @ExcludeMissing
    fun _autoCollection(): JsonField<Boolean> = autoCollection

    @JsonProperty("billing_cycle_anchor_configuration")
    @ExcludeMissing
    fun _billingCycleAnchorConfiguration(): JsonField<BillingCycleAnchorConfiguration> =
        billingCycleAnchorConfiguration

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     */
    @JsonProperty("billing_cycle_day")
    @ExcludeMissing
    fun _billingCycleDay(): JsonField<Long> = billingCycleDay

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is not part of the billing period. Set to null for subscriptions that are not
     * currently active.
     */
    @JsonProperty("current_billing_period_end_date")
    @ExcludeMissing
    fun _currentBillingPeriodEndDate(): JsonField<OffsetDateTime> = currentBillingPeriodEndDate

    /**
     * The start date of the current billing period. This is an inclusive timestamp; the instant
     * returned is exactly the beginning of the billing period. Set to null if the subscription is
     * not currently active.
     */
    @JsonProperty("current_billing_period_start_date")
    @ExcludeMissing
    fun _currentBillingPeriodStartDate(): JsonField<OffsetDateTime> = currentBillingPeriodStartDate

    /**
     * A customer is a buyer of your products, and the other party to the billing relationship.
     *
     * In Orb, customers are assigned system generated identifiers automatically, but it's often
     * desirable to have these match existing identifiers in your system. To avoid having to
     * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
     * identifier. See [Customer ID Aliases](/events-and-metrics/customer-aliases) for further
     * information about how these aliases work in Orb.
     *
     * In addition to having an identifier in your system, a customer may exist in a payment
     * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum
     * field to express this mapping.
     *
     * A customer also has a timezone (from the standard
     * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
     * timezone. See [Timezone localization](/essentials/timezones) for information on what this
     * timezone parameter influences within Orb.
     */
    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    /**
     * Determines the default memo on this subscriptions' invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    fun _defaultInvoiceMemo(): JsonField<String> = defaultInvoiceMemo

    /** The discount intervals for this subscription. */
    @JsonProperty("discount_intervals")
    @ExcludeMissing
    fun _discountIntervals(): JsonField<List<DiscountInterval>> = discountIntervals

    /** The date Orb stops billing for this subscription. */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    @JsonProperty("fixed_fee_quantity_schedule")
    @ExcludeMissing
    fun _fixedFeeQuantitySchedule(): JsonField<List<FixedFeeQuantitySchedule>> =
        fixedFeeQuantitySchedule

    @JsonProperty("invoicing_threshold")
    @ExcludeMissing
    fun _invoicingThreshold(): JsonField<String> = invoicingThreshold

    /** The maximum intervals for this subscription. */
    @JsonProperty("maximum_intervals")
    @ExcludeMissing
    fun _maximumIntervals(): JsonField<List<MaximumInterval>> = maximumIntervals

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** The minimum intervals for this subscription. */
    @JsonProperty("minimum_intervals")
    @ExcludeMissing
    fun _minimumIntervals(): JsonField<List<MinimumInterval>> = minimumIntervals

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of `0` here represents that the invoice is due on issue,
     * whereas a value of `30` represents that the customer has a month to pay the invoice.
     */
    @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

    /** The price intervals for this subscription. */
    @JsonProperty("price_intervals")
    @ExcludeMissing
    fun _priceIntervals(): JsonField<List<PriceInterval>> = priceIntervals

    @JsonProperty("redeemed_coupon")
    @ExcludeMissing
    fun _redeemedCoupon(): JsonField<RedeemedCoupon> = redeemedCoupon

    /** The date Orb starts billing for this subscription. */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonProperty("trial_info") @ExcludeMissing fun _trialInfo(): JsonField<TrialInfo> = trialInfo

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SubscriptionUpdateFixedFeeQuantityResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        activePlanPhaseOrder()
        adjustmentIntervals().forEach { it.validate() }
        autoCollection()
        billingCycleAnchorConfiguration().validate()
        billingCycleDay()
        createdAt()
        currentBillingPeriodEndDate()
        currentBillingPeriodStartDate()
        customer().validate()
        defaultInvoiceMemo()
        discountIntervals().forEach { it.validate() }
        endDate()
        fixedFeeQuantitySchedule().forEach { it.validate() }
        invoicingThreshold()
        maximumIntervals().forEach { it.validate() }
        metadata().validate()
        minimumIntervals().forEach { it.validate() }
        netTerms()
        plan().validate()
        priceIntervals().forEach { it.validate() }
        redeemedCoupon().ifPresent { it.validate() }
        startDate()
        status()
        trialInfo().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionUpdateFixedFeeQuantityResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var activePlanPhaseOrder: JsonField<Long>? = null
        private var adjustmentIntervals: JsonField<MutableList<AdjustmentInterval>>? = null
        private var autoCollection: JsonField<Boolean>? = null
        private var billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>? =
            null
        private var billingCycleDay: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currentBillingPeriodEndDate: JsonField<OffsetDateTime>? = null
        private var currentBillingPeriodStartDate: JsonField<OffsetDateTime>? = null
        private var customer: JsonField<Customer>? = null
        private var defaultInvoiceMemo: JsonField<String>? = null
        private var discountIntervals: JsonField<MutableList<DiscountInterval>>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var fixedFeeQuantitySchedule: JsonField<MutableList<FixedFeeQuantitySchedule>>? =
            null
        private var invoicingThreshold: JsonField<String>? = null
        private var maximumIntervals: JsonField<MutableList<MaximumInterval>>? = null
        private var metadata: JsonField<Metadata>? = null
        private var minimumIntervals: JsonField<MutableList<MinimumInterval>>? = null
        private var netTerms: JsonField<Long>? = null
        private var plan: JsonField<Plan>? = null
        private var priceIntervals: JsonField<MutableList<PriceInterval>>? = null
        private var redeemedCoupon: JsonField<RedeemedCoupon>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var trialInfo: JsonField<TrialInfo>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            subscriptionUpdateFixedFeeQuantityResponse: SubscriptionUpdateFixedFeeQuantityResponse
        ) = apply {
            id = subscriptionUpdateFixedFeeQuantityResponse.id
            activePlanPhaseOrder = subscriptionUpdateFixedFeeQuantityResponse.activePlanPhaseOrder
            adjustmentIntervals =
                subscriptionUpdateFixedFeeQuantityResponse.adjustmentIntervals.map {
                    it.toMutableList()
                }
            autoCollection = subscriptionUpdateFixedFeeQuantityResponse.autoCollection
            billingCycleAnchorConfiguration =
                subscriptionUpdateFixedFeeQuantityResponse.billingCycleAnchorConfiguration
            billingCycleDay = subscriptionUpdateFixedFeeQuantityResponse.billingCycleDay
            createdAt = subscriptionUpdateFixedFeeQuantityResponse.createdAt
            currentBillingPeriodEndDate =
                subscriptionUpdateFixedFeeQuantityResponse.currentBillingPeriodEndDate
            currentBillingPeriodStartDate =
                subscriptionUpdateFixedFeeQuantityResponse.currentBillingPeriodStartDate
            customer = subscriptionUpdateFixedFeeQuantityResponse.customer
            defaultInvoiceMemo = subscriptionUpdateFixedFeeQuantityResponse.defaultInvoiceMemo
            discountIntervals =
                subscriptionUpdateFixedFeeQuantityResponse.discountIntervals.map {
                    it.toMutableList()
                }
            endDate = subscriptionUpdateFixedFeeQuantityResponse.endDate
            fixedFeeQuantitySchedule =
                subscriptionUpdateFixedFeeQuantityResponse.fixedFeeQuantitySchedule.map {
                    it.toMutableList()
                }
            invoicingThreshold = subscriptionUpdateFixedFeeQuantityResponse.invoicingThreshold
            maximumIntervals =
                subscriptionUpdateFixedFeeQuantityResponse.maximumIntervals.map {
                    it.toMutableList()
                }
            metadata = subscriptionUpdateFixedFeeQuantityResponse.metadata
            minimumIntervals =
                subscriptionUpdateFixedFeeQuantityResponse.minimumIntervals.map {
                    it.toMutableList()
                }
            netTerms = subscriptionUpdateFixedFeeQuantityResponse.netTerms
            plan = subscriptionUpdateFixedFeeQuantityResponse.plan
            priceIntervals =
                subscriptionUpdateFixedFeeQuantityResponse.priceIntervals.map { it.toMutableList() }
            redeemedCoupon = subscriptionUpdateFixedFeeQuantityResponse.redeemedCoupon
            startDate = subscriptionUpdateFixedFeeQuantityResponse.startDate
            status = subscriptionUpdateFixedFeeQuantityResponse.status
            trialInfo = subscriptionUpdateFixedFeeQuantityResponse.trialInfo
            additionalProperties =
                subscriptionUpdateFixedFeeQuantityResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        fun activePlanPhaseOrder(activePlanPhaseOrder: Long?) =
            activePlanPhaseOrder(JsonField.ofNullable(activePlanPhaseOrder))

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        fun activePlanPhaseOrder(activePlanPhaseOrder: Long) =
            activePlanPhaseOrder(activePlanPhaseOrder as Long?)

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun activePlanPhaseOrder(activePlanPhaseOrder: Optional<Long>) =
            activePlanPhaseOrder(activePlanPhaseOrder.orElse(null) as Long?)

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        fun activePlanPhaseOrder(activePlanPhaseOrder: JsonField<Long>) = apply {
            this.activePlanPhaseOrder = activePlanPhaseOrder
        }

        /** The adjustment intervals for this subscription. */
        fun adjustmentIntervals(adjustmentIntervals: List<AdjustmentInterval>) =
            adjustmentIntervals(JsonField.of(adjustmentIntervals))

        /** The adjustment intervals for this subscription. */
        fun adjustmentIntervals(adjustmentIntervals: JsonField<List<AdjustmentInterval>>) = apply {
            this.adjustmentIntervals = adjustmentIntervals.map { it.toMutableList() }
        }

        /** The adjustment intervals for this subscription. */
        fun addAdjustmentInterval(adjustmentInterval: AdjustmentInterval) = apply {
            adjustmentIntervals =
                (adjustmentIntervals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("adjustmentIntervals", it).add(adjustmentInterval)
                }
        }

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior. If null, defaults to the customer's setting.
         */
        fun autoCollection(autoCollection: Boolean?) =
            autoCollection(JsonField.ofNullable(autoCollection))

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior. If null, defaults to the customer's setting.
         */
        fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior. If null, defaults to the customer's setting.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun autoCollection(autoCollection: Optional<Boolean>) =
            autoCollection(autoCollection.orElse(null) as Boolean?)

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior. If null, defaults to the customer's setting.
         */
        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            this.autoCollection = autoCollection
        }

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration
        ) = billingCycleAnchorConfiguration(JsonField.of(billingCycleAnchorConfiguration))

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>
        ) = apply { this.billingCycleAnchorConfiguration = billingCycleAnchorConfiguration }

        /**
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         */
        fun billingCycleDay(billingCycleDay: Long) = billingCycleDay(JsonField.of(billingCycleDay))

        /**
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         */
        fun billingCycleDay(billingCycleDay: JsonField<Long>) = apply {
            this.billingCycleDay = billingCycleDay
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is not part of the billing period. Set to null for subscriptions that
         * are not currently active.
         */
        fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: OffsetDateTime?) =
            currentBillingPeriodEndDate(JsonField.ofNullable(currentBillingPeriodEndDate))

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is not part of the billing period. Set to null for subscriptions that
         * are not currently active.
         */
        fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: Optional<OffsetDateTime>) =
            currentBillingPeriodEndDate(currentBillingPeriodEndDate.orElse(null))

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is not part of the billing period. Set to null for subscriptions that
         * are not currently active.
         */
        fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: JsonField<OffsetDateTime>) =
            apply {
                this.currentBillingPeriodEndDate = currentBillingPeriodEndDate
            }

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if the subscription
         * is not currently active.
         */
        fun currentBillingPeriodStartDate(currentBillingPeriodStartDate: OffsetDateTime?) =
            currentBillingPeriodStartDate(JsonField.ofNullable(currentBillingPeriodStartDate))

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if the subscription
         * is not currently active.
         */
        fun currentBillingPeriodStartDate(currentBillingPeriodStartDate: Optional<OffsetDateTime>) =
            currentBillingPeriodStartDate(currentBillingPeriodStartDate.orElse(null))

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if the subscription
         * is not currently active.
         */
        fun currentBillingPeriodStartDate(
            currentBillingPeriodStartDate: JsonField<OffsetDateTime>
        ) = apply { this.currentBillingPeriodStartDate = currentBillingPeriodStartDate }

        /**
         * A customer is a buyer of your products, and the other party to the billing relationship.
         *
         * In Orb, customers are assigned system generated identifiers automatically, but it's often
         * desirable to have these match existing identifiers in your system. To avoid having to
         * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
         * identifier. See [Customer ID Aliases](/events-and-metrics/customer-aliases) for further
         * information about how these aliases work in Orb.
         *
         * In addition to having an identifier in your system, a customer may exist in a payment
         * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider`
         * enum field to express this mapping.
         *
         * A customer also has a timezone (from the standard
         * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your
         * account's timezone. See [Timezone localization](/essentials/timezones) for information on
         * what this timezone parameter influences within Orb.
         */
        fun customer(customer: Customer) = customer(JsonField.of(customer))

        /**
         * A customer is a buyer of your products, and the other party to the billing relationship.
         *
         * In Orb, customers are assigned system generated identifiers automatically, but it's often
         * desirable to have these match existing identifiers in your system. To avoid having to
         * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
         * identifier. See [Customer ID Aliases](/events-and-metrics/customer-aliases) for further
         * information about how these aliases work in Orb.
         *
         * In addition to having an identifier in your system, a customer may exist in a payment
         * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider`
         * enum field to express this mapping.
         *
         * A customer also has a timezone (from the standard
         * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your
         * account's timezone. See [Timezone localization](/essentials/timezones) for information on
         * what this timezone parameter influences within Orb.
         */
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /**
         * Determines the default memo on this subscriptions' invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String?) =
            defaultInvoiceMemo(JsonField.ofNullable(defaultInvoiceMemo))

        /**
         * Determines the default memo on this subscriptions' invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: Optional<String>) =
            defaultInvoiceMemo(defaultInvoiceMemo.orElse(null))

        /**
         * Determines the default memo on this subscriptions' invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: JsonField<String>) = apply {
            this.defaultInvoiceMemo = defaultInvoiceMemo
        }

        /** The discount intervals for this subscription. */
        fun discountIntervals(discountIntervals: List<DiscountInterval>) =
            discountIntervals(JsonField.of(discountIntervals))

        /** The discount intervals for this subscription. */
        fun discountIntervals(discountIntervals: JsonField<List<DiscountInterval>>) = apply {
            this.discountIntervals = discountIntervals.map { it.toMutableList() }
        }

        /** The discount intervals for this subscription. */
        fun addDiscountInterval(discountInterval: DiscountInterval) = apply {
            discountIntervals =
                (discountIntervals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("discountIntervals", it).add(discountInterval)
                }
        }

        /** The discount intervals for this subscription. */
        fun addDiscountInterval(amount: DiscountInterval.AmountDiscountInterval) =
            addDiscountInterval(DiscountInterval.ofAmount(amount))

        /** The discount intervals for this subscription. */
        fun addDiscountInterval(percentage: DiscountInterval.PercentageDiscountInterval) =
            addDiscountInterval(DiscountInterval.ofPercentage(percentage))

        /** The discount intervals for this subscription. */
        fun addDiscountInterval(usage: DiscountInterval.UsageDiscountInterval) =
            addDiscountInterval(DiscountInterval.ofUsage(usage))

        /** The date Orb stops billing for this subscription. */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /** The date Orb stops billing for this subscription. */
        fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.orElse(null))

        /** The date Orb stops billing for this subscription. */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        fun fixedFeeQuantitySchedule(fixedFeeQuantitySchedule: List<FixedFeeQuantitySchedule>) =
            fixedFeeQuantitySchedule(JsonField.of(fixedFeeQuantitySchedule))

        fun fixedFeeQuantitySchedule(
            fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>>
        ) = apply {
            this.fixedFeeQuantitySchedule = fixedFeeQuantitySchedule.map { it.toMutableList() }
        }

        fun addFixedFeeQuantitySchedule(fixedFeeQuantitySchedule: FixedFeeQuantitySchedule) =
            apply {
                this.fixedFeeQuantitySchedule =
                    (this.fixedFeeQuantitySchedule ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fixedFeeQuantitySchedule", it).add(fixedFeeQuantitySchedule)
                    }
            }

        fun invoicingThreshold(invoicingThreshold: String?) =
            invoicingThreshold(JsonField.ofNullable(invoicingThreshold))

        fun invoicingThreshold(invoicingThreshold: Optional<String>) =
            invoicingThreshold(invoicingThreshold.orElse(null))

        fun invoicingThreshold(invoicingThreshold: JsonField<String>) = apply {
            this.invoicingThreshold = invoicingThreshold
        }

        /** The maximum intervals for this subscription. */
        fun maximumIntervals(maximumIntervals: List<MaximumInterval>) =
            maximumIntervals(JsonField.of(maximumIntervals))

        /** The maximum intervals for this subscription. */
        fun maximumIntervals(maximumIntervals: JsonField<List<MaximumInterval>>) = apply {
            this.maximumIntervals = maximumIntervals.map { it.toMutableList() }
        }

        /** The maximum intervals for this subscription. */
        fun addMaximumInterval(maximumInterval: MaximumInterval) = apply {
            maximumIntervals =
                (maximumIntervals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("maximumIntervals", it).add(maximumInterval)
                }
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The minimum intervals for this subscription. */
        fun minimumIntervals(minimumIntervals: List<MinimumInterval>) =
            minimumIntervals(JsonField.of(minimumIntervals))

        /** The minimum intervals for this subscription. */
        fun minimumIntervals(minimumIntervals: JsonField<List<MinimumInterval>>) = apply {
            this.minimumIntervals = minimumIntervals.map { it.toMutableList() }
        }

        /** The minimum intervals for this subscription. */
        fun addMinimumInterval(minimumInterval: MinimumInterval) = apply {
            minimumIntervals =
                (minimumIntervals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("minimumIntervals", it).add(minimumInterval)
                }
        }

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of `0` here represents that the invoice is due on issue,
         * whereas a value of `30` represents that the customer has a month to pay the invoice.
         */
        fun netTerms(netTerms: Long) = netTerms(JsonField.of(netTerms))

        /**
         * Determines the difference between the invoice issue date for subscription invoices as the
         * date that they are due. A value of `0` here represents that the invoice is due on issue,
         * whereas a value of `30` represents that the customer has a month to pay the invoice.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        fun plan(plan: Plan) = plan(JsonField.of(plan))

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** The price intervals for this subscription. */
        fun priceIntervals(priceIntervals: List<PriceInterval>) =
            priceIntervals(JsonField.of(priceIntervals))

        /** The price intervals for this subscription. */
        fun priceIntervals(priceIntervals: JsonField<List<PriceInterval>>) = apply {
            this.priceIntervals = priceIntervals.map { it.toMutableList() }
        }

        /** The price intervals for this subscription. */
        fun addPriceInterval(priceInterval: PriceInterval) = apply {
            priceIntervals =
                (priceIntervals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("priceIntervals", it).add(priceInterval)
                }
        }

        fun redeemedCoupon(redeemedCoupon: RedeemedCoupon?) =
            redeemedCoupon(JsonField.ofNullable(redeemedCoupon))

        fun redeemedCoupon(redeemedCoupon: Optional<RedeemedCoupon>) =
            redeemedCoupon(redeemedCoupon.orElse(null))

        fun redeemedCoupon(redeemedCoupon: JsonField<RedeemedCoupon>) = apply {
            this.redeemedCoupon = redeemedCoupon
        }

        /** The date Orb starts billing for this subscription. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /** The date Orb starts billing for this subscription. */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun trialInfo(trialInfo: TrialInfo) = trialInfo(JsonField.of(trialInfo))

        fun trialInfo(trialInfo: JsonField<TrialInfo>) = apply { this.trialInfo = trialInfo }

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

        fun build(): SubscriptionUpdateFixedFeeQuantityResponse =
            SubscriptionUpdateFixedFeeQuantityResponse(
                checkRequired("id", id),
                checkRequired("activePlanPhaseOrder", activePlanPhaseOrder),
                checkRequired("adjustmentIntervals", adjustmentIntervals).map { it.toImmutable() },
                checkRequired("autoCollection", autoCollection),
                checkRequired("billingCycleAnchorConfiguration", billingCycleAnchorConfiguration),
                checkRequired("billingCycleDay", billingCycleDay),
                checkRequired("createdAt", createdAt),
                checkRequired("currentBillingPeriodEndDate", currentBillingPeriodEndDate),
                checkRequired("currentBillingPeriodStartDate", currentBillingPeriodStartDate),
                checkRequired("customer", customer),
                checkRequired("defaultInvoiceMemo", defaultInvoiceMemo),
                checkRequired("discountIntervals", discountIntervals).map { it.toImmutable() },
                checkRequired("endDate", endDate),
                checkRequired("fixedFeeQuantitySchedule", fixedFeeQuantitySchedule).map {
                    it.toImmutable()
                },
                checkRequired("invoicingThreshold", invoicingThreshold),
                checkRequired("maximumIntervals", maximumIntervals).map { it.toImmutable() },
                checkRequired("metadata", metadata),
                checkRequired("minimumIntervals", minimumIntervals).map { it.toImmutable() },
                checkRequired("netTerms", netTerms),
                checkRequired("plan", plan),
                checkRequired("priceIntervals", priceIntervals).map { it.toImmutable() },
                checkRequired("redeemedCoupon", redeemedCoupon),
                checkRequired("startDate", startDate),
                checkRequired("status", status),
                checkRequired("trialInfo", trialInfo),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class AdjustmentInterval
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustment")
        @ExcludeMissing
        private val adjustment: JsonField<Adjustment> = JsonMissing.of(),
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

        /** The price interval IDs that this adjustment applies to. */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /** The end date of the adjustment interval. */
        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        /** The start date of the adjustment interval. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("adjustment")
        @ExcludeMissing
        fun _adjustment(): JsonField<Adjustment> = adjustment

        /** The price interval IDs that this adjustment applies to. */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

        /** The end date of the adjustment interval. */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /** The start date of the adjustment interval. */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AdjustmentInterval = apply {
            if (validated) {
                return@apply
            }

            id()
            adjustment().validate()
            appliesToPriceIntervalIds()
            endDate()
            startDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AdjustmentInterval]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var adjustment: JsonField<Adjustment>? = null
            private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(adjustmentInterval: AdjustmentInterval) = apply {
                id = adjustmentInterval.id
                adjustment = adjustmentInterval.adjustment
                appliesToPriceIntervalIds =
                    adjustmentInterval.appliesToPriceIntervalIds.map { it.toMutableList() }
                endDate = adjustmentInterval.endDate
                startDate = adjustmentInterval.startDate
                additionalProperties = adjustmentInterval.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun adjustment(adjustment: Adjustment) = adjustment(JsonField.of(adjustment))

            fun adjustment(adjustment: JsonField<Adjustment>) = apply {
                this.adjustment = adjustment
            }

            fun adjustment(planPhaseUsageDiscount: Adjustment.PlanPhaseUsageDiscountAdjustment) =
                adjustment(Adjustment.ofPlanPhaseUsageDiscount(planPhaseUsageDiscount))

            fun adjustment(planPhaseAmountDiscount: Adjustment.PlanPhaseAmountDiscountAdjustment) =
                adjustment(Adjustment.ofPlanPhaseAmountDiscount(planPhaseAmountDiscount))

            fun adjustment(
                planPhasePercentageDiscount: Adjustment.PlanPhasePercentageDiscountAdjustment
            ) = adjustment(Adjustment.ofPlanPhasePercentageDiscount(planPhasePercentageDiscount))

            fun adjustment(planPhaseMinimum: Adjustment.PlanPhaseMinimumAdjustment) =
                adjustment(Adjustment.ofPlanPhaseMinimum(planPhaseMinimum))

            fun adjustment(planPhaseMaximum: Adjustment.PlanPhaseMaximumAdjustment) =
                adjustment(Adjustment.ofPlanPhaseMaximum(planPhaseMaximum))

            /** The price interval IDs that this adjustment applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /** The price interval IDs that this adjustment applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds =
                        appliesToPriceIntervalIds.map { it.toMutableList() }
                }

            /** The price interval IDs that this adjustment applies to. */
            fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                appliesToPriceIntervalIds =
                    (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIntervalIds", it).add(appliesToPriceIntervalId)
                    }
            }

            /** The end date of the adjustment interval. */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /** The end date of the adjustment interval. */
            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.orElse(null))

            /** The end date of the adjustment interval. */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The start date of the adjustment interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the adjustment interval. */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
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

            fun build(): AdjustmentInterval =
                AdjustmentInterval(
                    checkRequired("id", id),
                    checkRequired("adjustment", adjustment),
                    checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                        it.toImmutable()
                    },
                    checkRequired("endDate", endDate),
                    checkRequired("startDate", startDate),
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val planPhaseUsageDiscount: PlanPhaseUsageDiscountAdjustment? = null,
            private val planPhaseAmountDiscount: PlanPhaseAmountDiscountAdjustment? = null,
            private val planPhasePercentageDiscount: PlanPhasePercentageDiscountAdjustment? = null,
            private val planPhaseMinimum: PlanPhaseMinimumAdjustment? = null,
            private val planPhaseMaximum: PlanPhaseMaximumAdjustment? = null,
            private val _json: JsonValue? = null,
        ) {

            fun planPhaseUsageDiscount(): Optional<PlanPhaseUsageDiscountAdjustment> =
                Optional.ofNullable(planPhaseUsageDiscount)

            fun planPhaseAmountDiscount(): Optional<PlanPhaseAmountDiscountAdjustment> =
                Optional.ofNullable(planPhaseAmountDiscount)

            fun planPhasePercentageDiscount(): Optional<PlanPhasePercentageDiscountAdjustment> =
                Optional.ofNullable(planPhasePercentageDiscount)

            fun planPhaseMinimum(): Optional<PlanPhaseMinimumAdjustment> =
                Optional.ofNullable(planPhaseMinimum)

            fun planPhaseMaximum(): Optional<PlanPhaseMaximumAdjustment> =
                Optional.ofNullable(planPhaseMaximum)

            fun isPlanPhaseUsageDiscount(): Boolean = planPhaseUsageDiscount != null

            fun isPlanPhaseAmountDiscount(): Boolean = planPhaseAmountDiscount != null

            fun isPlanPhasePercentageDiscount(): Boolean = planPhasePercentageDiscount != null

            fun isPlanPhaseMinimum(): Boolean = planPhaseMinimum != null

            fun isPlanPhaseMaximum(): Boolean = planPhaseMaximum != null

            fun asPlanPhaseUsageDiscount(): PlanPhaseUsageDiscountAdjustment =
                planPhaseUsageDiscount.getOrThrow("planPhaseUsageDiscount")

            fun asPlanPhaseAmountDiscount(): PlanPhaseAmountDiscountAdjustment =
                planPhaseAmountDiscount.getOrThrow("planPhaseAmountDiscount")

            fun asPlanPhasePercentageDiscount(): PlanPhasePercentageDiscountAdjustment =
                planPhasePercentageDiscount.getOrThrow("planPhasePercentageDiscount")

            fun asPlanPhaseMinimum(): PlanPhaseMinimumAdjustment =
                planPhaseMinimum.getOrThrow("planPhaseMinimum")

            fun asPlanPhaseMaximum(): PlanPhaseMaximumAdjustment =
                planPhaseMaximum.getOrThrow("planPhaseMaximum")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    planPhaseUsageDiscount != null ->
                        visitor.visitPlanPhaseUsageDiscount(planPhaseUsageDiscount)
                    planPhaseAmountDiscount != null ->
                        visitor.visitPlanPhaseAmountDiscount(planPhaseAmountDiscount)
                    planPhasePercentageDiscount != null ->
                        visitor.visitPlanPhasePercentageDiscount(planPhasePercentageDiscount)
                    planPhaseMinimum != null -> visitor.visitPlanPhaseMinimum(planPhaseMinimum)
                    planPhaseMaximum != null -> visitor.visitPlanPhaseMaximum(planPhaseMaximum)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): Adjustment = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitPlanPhaseUsageDiscount(
                            planPhaseUsageDiscount: PlanPhaseUsageDiscountAdjustment
                        ) {
                            planPhaseUsageDiscount.validate()
                        }

                        override fun visitPlanPhaseAmountDiscount(
                            planPhaseAmountDiscount: PlanPhaseAmountDiscountAdjustment
                        ) {
                            planPhaseAmountDiscount.validate()
                        }

                        override fun visitPlanPhasePercentageDiscount(
                            planPhasePercentageDiscount: PlanPhasePercentageDiscountAdjustment
                        ) {
                            planPhasePercentageDiscount.validate()
                        }

                        override fun visitPlanPhaseMinimum(
                            planPhaseMinimum: PlanPhaseMinimumAdjustment
                        ) {
                            planPhaseMinimum.validate()
                        }

                        override fun visitPlanPhaseMaximum(
                            planPhaseMaximum: PlanPhaseMaximumAdjustment
                        ) {
                            planPhaseMaximum.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Adjustment && planPhaseUsageDiscount == other.planPhaseUsageDiscount && planPhaseAmountDiscount == other.planPhaseAmountDiscount && planPhasePercentageDiscount == other.planPhasePercentageDiscount && planPhaseMinimum == other.planPhaseMinimum && planPhaseMaximum == other.planPhaseMaximum /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(planPhaseUsageDiscount, planPhaseAmountDiscount, planPhasePercentageDiscount, planPhaseMinimum, planPhaseMaximum) /* spotless:on */

            override fun toString(): String =
                when {
                    planPhaseUsageDiscount != null ->
                        "Adjustment{planPhaseUsageDiscount=$planPhaseUsageDiscount}"
                    planPhaseAmountDiscount != null ->
                        "Adjustment{planPhaseAmountDiscount=$planPhaseAmountDiscount}"
                    planPhasePercentageDiscount != null ->
                        "Adjustment{planPhasePercentageDiscount=$planPhasePercentageDiscount}"
                    planPhaseMinimum != null -> "Adjustment{planPhaseMinimum=$planPhaseMinimum}"
                    planPhaseMaximum != null -> "Adjustment{planPhaseMaximum=$planPhaseMaximum}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                @JvmStatic
                fun ofPlanPhaseUsageDiscount(
                    planPhaseUsageDiscount: PlanPhaseUsageDiscountAdjustment
                ) = Adjustment(planPhaseUsageDiscount = planPhaseUsageDiscount)

                @JvmStatic
                fun ofPlanPhaseAmountDiscount(
                    planPhaseAmountDiscount: PlanPhaseAmountDiscountAdjustment
                ) = Adjustment(planPhaseAmountDiscount = planPhaseAmountDiscount)

                @JvmStatic
                fun ofPlanPhasePercentageDiscount(
                    planPhasePercentageDiscount: PlanPhasePercentageDiscountAdjustment
                ) = Adjustment(planPhasePercentageDiscount = planPhasePercentageDiscount)

                @JvmStatic
                fun ofPlanPhaseMinimum(planPhaseMinimum: PlanPhaseMinimumAdjustment) =
                    Adjustment(planPhaseMinimum = planPhaseMinimum)

                @JvmStatic
                fun ofPlanPhaseMaximum(planPhaseMaximum: PlanPhaseMaximumAdjustment) =
                    Adjustment(planPhaseMaximum = planPhaseMaximum)
            }

            /**
             * An interface that defines how to map each variant of [Adjustment] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitPlanPhaseUsageDiscount(
                    planPhaseUsageDiscount: PlanPhaseUsageDiscountAdjustment
                ): T

                fun visitPlanPhaseAmountDiscount(
                    planPhaseAmountDiscount: PlanPhaseAmountDiscountAdjustment
                ): T

                fun visitPlanPhasePercentageDiscount(
                    planPhasePercentageDiscount: PlanPhasePercentageDiscountAdjustment
                ): T

                fun visitPlanPhaseMinimum(planPhaseMinimum: PlanPhaseMinimumAdjustment): T

                fun visitPlanPhaseMaximum(planPhaseMaximum: PlanPhaseMaximumAdjustment): T

                /**
                 * Maps an unknown variant of [Adjustment] to a value of type [T].
                 *
                 * An instance of [Adjustment] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Adjustment: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Adjustment>(Adjustment::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Adjustment {
                    val json = JsonValue.fromJsonNode(node)
                    val adjustmentType =
                        json.asObject().getOrNull()?.get("adjustment_type")?.asString()?.getOrNull()

                    when (adjustmentType) {
                        "usage_discount" -> {
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PlanPhaseUsageDiscountAdjustment>(),
                                ) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(planPhaseUsageDiscount = it, _json = json)
                                }
                        }
                        "amount_discount" -> {
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PlanPhaseAmountDiscountAdjustment>(),
                                ) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(planPhaseAmountDiscount = it, _json = json)
                                }
                        }
                        "percentage_discount" -> {
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PlanPhasePercentageDiscountAdjustment>(),
                                ) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(
                                        planPhasePercentageDiscount = it,
                                        _json = json,
                                    )
                                }
                        }
                        "minimum" -> {
                            tryDeserialize(node, jacksonTypeRef<PlanPhaseMinimumAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(planPhaseMinimum = it, _json = json)
                                }
                        }
                        "maximum" -> {
                            tryDeserialize(node, jacksonTypeRef<PlanPhaseMaximumAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(planPhaseMaximum = it, _json = json)
                                }
                        }
                    }

                    return Adjustment(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Adjustment>(Adjustment::class) {

                override fun serialize(
                    value: Adjustment,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.planPhaseUsageDiscount != null ->
                            generator.writeObject(value.planPhaseUsageDiscount)
                        value.planPhaseAmountDiscount != null ->
                            generator.writeObject(value.planPhaseAmountDiscount)
                        value.planPhasePercentageDiscount != null ->
                            generator.writeObject(value.planPhasePercentageDiscount)
                        value.planPhaseMinimum != null ->
                            generator.writeObject(value.planPhaseMinimum)
                        value.planPhaseMaximum != null ->
                            generator.writeObject(value.planPhaseMaximum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }

            @NoAutoDetect
            class PlanPhaseUsageDiscountAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("usage_discount")
                @ExcludeMissing
                private val usageDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                @JsonProperty("usage_discount")
                @ExcludeMissing
                fun _usageDiscount(): JsonField<Double> = usageDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PlanPhaseUsageDiscountAdjustment = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    adjustmentType()
                    appliesToPriceIds()
                    isInvoiceLevel()
                    planPhaseOrder()
                    reason()
                    usageDiscount()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PlanPhaseUsageDiscountAdjustment]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var usageDiscount: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        planPhaseUsageDiscountAdjustment: PlanPhaseUsageDiscountAdjustment
                    ) = apply {
                        id = planPhaseUsageDiscountAdjustment.id
                        adjustmentType = planPhaseUsageDiscountAdjustment.adjustmentType
                        appliesToPriceIds =
                            planPhaseUsageDiscountAdjustment.appliesToPriceIds.map {
                                it.toMutableList()
                            }
                        isInvoiceLevel = planPhaseUsageDiscountAdjustment.isInvoiceLevel
                        planPhaseOrder = planPhaseUsageDiscountAdjustment.planPhaseOrder
                        reason = planPhaseUsageDiscountAdjustment.reason
                        usageDiscount = planPhaseUsageDiscountAdjustment.usageDiscount
                        additionalProperties =
                            planPhaseUsageDiscountAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.orElse(null) as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: Optional<String>) = reason(reason.orElse(null))

                    /** The reason for the adjustment. */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    /**
                     * The number of usage units by which to discount the price this adjustment
                     * applies to in a given billing period.
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * The number of usage units by which to discount the price this adjustment
                     * applies to in a given billing period.
                     */
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
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

                    fun build(): PlanPhaseUsageDiscountAdjustment =
                        PlanPhaseUsageDiscountAdjustment(
                            checkRequired("id", id),
                            checkRequired("adjustmentType", adjustmentType),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            checkRequired("usageDiscount", usageDiscount),
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val USAGE_DISCOUNT = of("usage_discount")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    /** An enum containing [AdjustmentType]'s known values. */
                    enum class Known {
                        USAGE_DISCOUNT
                    }

                    /**
                     * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AdjustmentType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        USAGE_DISCOUNT,
                        /**
                         * An enum member indicating that [AdjustmentType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            USAGE_DISCOUNT -> Value.USAGE_DISCOUNT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            USAGE_DISCOUNT -> Known.USAGE_DISCOUNT
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            OrbInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PlanPhaseUsageDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && reason == other.reason && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, planPhaseOrder, reason, usageDiscount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PlanPhaseUsageDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PlanPhaseAmountDiscountAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("amount_discount")
                @ExcludeMissing
                private val amountDiscount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount(): JsonField<String> = amountDiscount

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PlanPhaseAmountDiscountAdjustment = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    adjustmentType()
                    amountDiscount()
                    appliesToPriceIds()
                    isInvoiceLevel()
                    planPhaseOrder()
                    reason()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PlanPhaseAmountDiscountAdjustment]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var amountDiscount: JsonField<String>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        planPhaseAmountDiscountAdjustment: PlanPhaseAmountDiscountAdjustment
                    ) = apply {
                        id = planPhaseAmountDiscountAdjustment.id
                        adjustmentType = planPhaseAmountDiscountAdjustment.adjustmentType
                        amountDiscount = planPhaseAmountDiscountAdjustment.amountDiscount
                        appliesToPriceIds =
                            planPhaseAmountDiscountAdjustment.appliesToPriceIds.map {
                                it.toMutableList()
                            }
                        isInvoiceLevel = planPhaseAmountDiscountAdjustment.isInvoiceLevel
                        planPhaseOrder = planPhaseAmountDiscountAdjustment.planPhaseOrder
                        reason = planPhaseAmountDiscountAdjustment.reason
                        additionalProperties =
                            planPhaseAmountDiscountAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /**
                     * The amount by which to discount the prices this adjustment applies to in a
                     * given billing period.
                     */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /**
                     * The amount by which to discount the prices this adjustment applies to in a
                     * given billing period.
                     */
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.orElse(null) as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: Optional<String>) = reason(reason.orElse(null))

                    /** The reason for the adjustment. */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

                    fun build(): PlanPhaseAmountDiscountAdjustment =
                        PlanPhaseAmountDiscountAdjustment(
                            checkRequired("id", id),
                            checkRequired("adjustmentType", adjustmentType),
                            checkRequired("amountDiscount", amountDiscount),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val AMOUNT_DISCOUNT = of("amount_discount")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    /** An enum containing [AdjustmentType]'s known values. */
                    enum class Known {
                        AMOUNT_DISCOUNT
                    }

                    /**
                     * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AdjustmentType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        AMOUNT_DISCOUNT,
                        /**
                         * An enum member indicating that [AdjustmentType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            AMOUNT_DISCOUNT -> Value.AMOUNT_DISCOUNT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            AMOUNT_DISCOUNT -> Known.AMOUNT_DISCOUNT
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            OrbInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PlanPhaseAmountDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amountDiscount, appliesToPriceIds, isInvoiceLevel, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PlanPhaseAmountDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PlanPhasePercentageDiscountAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                fun percentageDiscount(): Double =
                    percentageDiscount.getRequired("percentage_discount")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount(): JsonField<Double> = percentageDiscount

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PlanPhasePercentageDiscountAdjustment = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    adjustmentType()
                    appliesToPriceIds()
                    isInvoiceLevel()
                    percentageDiscount()
                    planPhaseOrder()
                    reason()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PlanPhasePercentageDiscountAdjustment]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var percentageDiscount: JsonField<Double>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        planPhasePercentageDiscountAdjustment: PlanPhasePercentageDiscountAdjustment
                    ) = apply {
                        id = planPhasePercentageDiscountAdjustment.id
                        adjustmentType = planPhasePercentageDiscountAdjustment.adjustmentType
                        appliesToPriceIds =
                            planPhasePercentageDiscountAdjustment.appliesToPriceIds.map {
                                it.toMutableList()
                            }
                        isInvoiceLevel = planPhasePercentageDiscountAdjustment.isInvoiceLevel
                        percentageDiscount =
                            planPhasePercentageDiscountAdjustment.percentageDiscount
                        planPhaseOrder = planPhasePercentageDiscountAdjustment.planPhaseOrder
                        reason = planPhasePercentageDiscountAdjustment.reason
                        additionalProperties =
                            planPhasePercentageDiscountAdjustment.additionalProperties
                                .toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /**
                     * The percentage (as a value between 0 and 1) by which to discount the price
                     * intervals this adjustment applies to in a given billing period.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * The percentage (as a value between 0 and 1) by which to discount the price
                     * intervals this adjustment applies to in a given billing period.
                     */
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.orElse(null) as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: Optional<String>) = reason(reason.orElse(null))

                    /** The reason for the adjustment. */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

                    fun build(): PlanPhasePercentageDiscountAdjustment =
                        PlanPhasePercentageDiscountAdjustment(
                            checkRequired("id", id),
                            checkRequired("adjustmentType", adjustmentType),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("percentageDiscount", percentageDiscount),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val PERCENTAGE_DISCOUNT = of("percentage_discount")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    /** An enum containing [AdjustmentType]'s known values. */
                    enum class Known {
                        PERCENTAGE_DISCOUNT
                    }

                    /**
                     * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AdjustmentType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PERCENTAGE_DISCOUNT,
                        /**
                         * An enum member indicating that [AdjustmentType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PERCENTAGE_DISCOUNT -> Value.PERCENTAGE_DISCOUNT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PERCENTAGE_DISCOUNT -> Known.PERCENTAGE_DISCOUNT
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            OrbInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PlanPhasePercentageDiscountAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && percentageDiscount == other.percentageDiscount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, percentageDiscount, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PlanPhasePercentageDiscountAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, percentageDiscount=$percentageDiscount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PlanPhaseMinimumAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                private val itemId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                private val minimumAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /** The item ID that revenue from this minimum will be attributed to. */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /** The item ID that revenue from this minimum will be attributed to. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun _minimumAmount(): JsonField<String> = minimumAmount

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PlanPhaseMinimumAdjustment = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    adjustmentType()
                    appliesToPriceIds()
                    isInvoiceLevel()
                    itemId()
                    minimumAmount()
                    planPhaseOrder()
                    reason()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PlanPhaseMinimumAdjustment]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var itemId: JsonField<String>? = null
                    private var minimumAmount: JsonField<String>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(planPhaseMinimumAdjustment: PlanPhaseMinimumAdjustment) =
                        apply {
                            id = planPhaseMinimumAdjustment.id
                            adjustmentType = planPhaseMinimumAdjustment.adjustmentType
                            appliesToPriceIds =
                                planPhaseMinimumAdjustment.appliesToPriceIds.map {
                                    it.toMutableList()
                                }
                            isInvoiceLevel = planPhaseMinimumAdjustment.isInvoiceLevel
                            itemId = planPhaseMinimumAdjustment.itemId
                            minimumAmount = planPhaseMinimumAdjustment.minimumAmount
                            planPhaseOrder = planPhaseMinimumAdjustment.planPhaseOrder
                            reason = planPhaseMinimumAdjustment.reason
                            additionalProperties =
                                planPhaseMinimumAdjustment.additionalProperties.toMutableMap()
                        }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The item ID that revenue from this minimum will be attributed to. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The item ID that revenue from this minimum will be attributed to. */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * The minimum amount to charge in a given billing period for the prices this
                     * adjustment applies to.
                     */
                    fun minimumAmount(minimumAmount: String) =
                        minimumAmount(JsonField.of(minimumAmount))

                    /**
                     * The minimum amount to charge in a given billing period for the prices this
                     * adjustment applies to.
                     */
                    fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                        this.minimumAmount = minimumAmount
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.orElse(null) as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: Optional<String>) = reason(reason.orElse(null))

                    /** The reason for the adjustment. */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

                    fun build(): PlanPhaseMinimumAdjustment =
                        PlanPhaseMinimumAdjustment(
                            checkRequired("id", id),
                            checkRequired("adjustmentType", adjustmentType),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("itemId", itemId),
                            checkRequired("minimumAmount", minimumAmount),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val MINIMUM = of("minimum")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    /** An enum containing [AdjustmentType]'s known values. */
                    enum class Known {
                        MINIMUM
                    }

                    /**
                     * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AdjustmentType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MINIMUM,
                        /**
                         * An enum member indicating that [AdjustmentType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            MINIMUM -> Value.MINIMUM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            MINIMUM -> Known.MINIMUM
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            OrbInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PlanPhaseMinimumAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && itemId == other.itemId && minimumAmount == other.minimumAmount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, itemId, minimumAmount, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PlanPhaseMinimumAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, itemId=$itemId, minimumAmount=$minimumAmount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PlanPhaseMaximumAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                private val maximumAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun _maximumAmount(): JsonField<String> = maximumAmount

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PlanPhaseMaximumAdjustment = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    adjustmentType()
                    appliesToPriceIds()
                    isInvoiceLevel()
                    maximumAmount()
                    planPhaseOrder()
                    reason()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PlanPhaseMaximumAdjustment]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonField<AdjustmentType>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var maximumAmount: JsonField<String>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(planPhaseMaximumAdjustment: PlanPhaseMaximumAdjustment) =
                        apply {
                            id = planPhaseMaximumAdjustment.id
                            adjustmentType = planPhaseMaximumAdjustment.adjustmentType
                            appliesToPriceIds =
                                planPhaseMaximumAdjustment.appliesToPriceIds.map {
                                    it.toMutableList()
                                }
                            isInvoiceLevel = planPhaseMaximumAdjustment.isInvoiceLevel
                            maximumAmount = planPhaseMaximumAdjustment.maximumAmount
                            planPhaseOrder = planPhaseMaximumAdjustment.planPhaseOrder
                            reason = planPhaseMaximumAdjustment.reason
                            additionalProperties =
                                planPhaseMaximumAdjustment.additionalProperties.toMutableMap()
                        }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                        appliesToPriceIds =
                            (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                            }
                    }

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                        isInvoiceLevel(JsonField.of(isInvoiceLevel))

                    /**
                     * True for adjustments that apply to an entire invocice, false for adjustments
                     * that apply to only one price.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /**
                     * The maximum amount to charge in a given billing period for the prices this
                     * adjustment applies to.
                     */
                    fun maximumAmount(maximumAmount: String) =
                        maximumAmount(JsonField.of(maximumAmount))

                    /**
                     * The maximum amount to charge in a given billing period for the prices this
                     * adjustment applies to.
                     */
                    fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /** The plan phase in which this adjustment is active. */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.orElse(null) as Long?)

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: Optional<String>) = reason(reason.orElse(null))

                    /** The reason for the adjustment. */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

                    fun build(): PlanPhaseMaximumAdjustment =
                        PlanPhaseMaximumAdjustment(
                            checkRequired("id", id),
                            checkRequired("adjustmentType", adjustmentType),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("maximumAmount", maximumAmount),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val MAXIMUM = of("maximum")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    /** An enum containing [AdjustmentType]'s known values. */
                    enum class Known {
                        MAXIMUM
                    }

                    /**
                     * An enum containing [AdjustmentType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [AdjustmentType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MAXIMUM,
                        /**
                         * An enum member indicating that [AdjustmentType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            MAXIMUM -> Value.MAXIMUM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            MAXIMUM -> Known.MAXIMUM
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            OrbInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AdjustmentType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PlanPhaseMaximumAdjustment && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && maximumAmount == other.maximumAmount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, maximumAmount, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PlanPhaseMaximumAdjustment{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, maximumAmount=$maximumAmount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AdjustmentInterval && id == other.id && adjustment == other.adjustment && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, adjustment, appliesToPriceIntervalIds, endDate, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AdjustmentInterval{id=$id, adjustment=$adjustment, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class BillingCycleAnchorConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("day") @ExcludeMissing private val day: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("month")
        @ExcludeMissing
        private val month: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("year") @ExcludeMissing private val year: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         */
        fun day(): Long = day.getRequired("day")

        /**
         * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
         * February would have cycles starting February, May, August, and November).
         */
        fun month(): Optional<Long> = Optional.ofNullable(month.getNullable("month"))

        /**
         * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on
         * 2021 would have cycles starting on 2021, 2023, 2025, etc.).
         */
        fun year(): Optional<Long> = Optional.ofNullable(year.getNullable("year"))

        /**
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         */
        @JsonProperty("day") @ExcludeMissing fun _day(): JsonField<Long> = day

        /**
         * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
         * February would have cycles starting February, May, August, and November).
         */
        @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<Long> = month

        /**
         * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on
         * 2021 would have cycles starting on 2021, 2023, 2025, etc.).
         */
        @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Long> = year

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BillingCycleAnchorConfiguration = apply {
            if (validated) {
                return@apply
            }

            day()
            month()
            year()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillingCycleAnchorConfiguration]. */
        class Builder internal constructor() {

            private var day: JsonField<Long>? = null
            private var month: JsonField<Long> = JsonMissing.of()
            private var year: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration) =
                apply {
                    day = billingCycleAnchorConfiguration.day
                    month = billingCycleAnchorConfiguration.month
                    year = billingCycleAnchorConfiguration.year
                    additionalProperties =
                        billingCycleAnchorConfiguration.additionalProperties.toMutableMap()
                }

            /**
             * The day of the month on which the billing cycle is anchored. If the maximum number of
             * days in a month is greater than this value, the last day of the month is the billing
             * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
             * 30th.
             */
            fun day(day: Long) = day(JsonField.of(day))

            /**
             * The day of the month on which the billing cycle is anchored. If the maximum number of
             * days in a month is greater than this value, the last day of the month is the billing
             * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
             * 30th.
             */
            fun day(day: JsonField<Long>) = apply { this.day = day }

            /**
             * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
             * February would have cycles starting February, May, August, and November).
             */
            fun month(month: Long?) = month(JsonField.ofNullable(month))

            /**
             * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
             * February would have cycles starting February, May, August, and November).
             */
            fun month(month: Long) = month(month as Long?)

            /**
             * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
             * February would have cycles starting February, May, August, and November).
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun month(month: Optional<Long>) = month(month.orElse(null) as Long?)

            /**
             * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
             * February would have cycles starting February, May, August, and November).
             */
            fun month(month: JsonField<Long>) = apply { this.month = month }

            /**
             * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored
             * on 2021 would have cycles starting on 2021, 2023, 2025, etc.).
             */
            fun year(year: Long?) = year(JsonField.ofNullable(year))

            /**
             * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored
             * on 2021 would have cycles starting on 2021, 2023, 2025, etc.).
             */
            fun year(year: Long) = year(year as Long?)

            /**
             * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored
             * on 2021 would have cycles starting on 2021, 2023, 2025, etc.).
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun year(year: Optional<Long>) = year(year.orElse(null) as Long?)

            /**
             * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored
             * on 2021 would have cycles starting on 2021, 2023, 2025, etc.).
             */
            fun year(year: JsonField<Long>) = apply { this.year = year }

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

            fun build(): BillingCycleAnchorConfiguration =
                BillingCycleAnchorConfiguration(
                    checkRequired("day", day),
                    month,
                    year,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingCycleAnchorConfiguration && day == other.day && month == other.month && year == other.year && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(day, month, year, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingCycleAnchorConfiguration{day=$day, month=$month, year=$year, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = DiscountInterval.Deserializer::class)
    @JsonSerialize(using = DiscountInterval.Serializer::class)
    class DiscountInterval
    private constructor(
        private val amount: AmountDiscountInterval? = null,
        private val percentage: PercentageDiscountInterval? = null,
        private val usage: UsageDiscountInterval? = null,
        private val _json: JsonValue? = null,
    ) {

        fun amount(): Optional<AmountDiscountInterval> = Optional.ofNullable(amount)

        fun percentage(): Optional<PercentageDiscountInterval> = Optional.ofNullable(percentage)

        fun usage(): Optional<UsageDiscountInterval> = Optional.ofNullable(usage)

        fun isAmount(): Boolean = amount != null

        fun isPercentage(): Boolean = percentage != null

        fun isUsage(): Boolean = usage != null

        fun asAmount(): AmountDiscountInterval = amount.getOrThrow("amount")

        fun asPercentage(): PercentageDiscountInterval = percentage.getOrThrow("percentage")

        fun asUsage(): UsageDiscountInterval = usage.getOrThrow("usage")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                amount != null -> visitor.visitAmount(amount)
                percentage != null -> visitor.visitPercentage(percentage)
                usage != null -> visitor.visitUsage(usage)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): DiscountInterval = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAmount(amount: AmountDiscountInterval) {
                        amount.validate()
                    }

                    override fun visitPercentage(percentage: PercentageDiscountInterval) {
                        percentage.validate()
                    }

                    override fun visitUsage(usage: UsageDiscountInterval) {
                        usage.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DiscountInterval && amount == other.amount && percentage == other.percentage && usage == other.usage /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(amount, percentage, usage) /* spotless:on */

        override fun toString(): String =
            when {
                amount != null -> "DiscountInterval{amount=$amount}"
                percentage != null -> "DiscountInterval{percentage=$percentage}"
                usage != null -> "DiscountInterval{usage=$usage}"
                _json != null -> "DiscountInterval{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid DiscountInterval")
            }

        companion object {

            @JvmStatic
            fun ofAmount(amount: AmountDiscountInterval) = DiscountInterval(amount = amount)

            @JvmStatic
            fun ofPercentage(percentage: PercentageDiscountInterval) =
                DiscountInterval(percentage = percentage)

            @JvmStatic fun ofUsage(usage: UsageDiscountInterval) = DiscountInterval(usage = usage)
        }

        /**
         * An interface that defines how to map each variant of [DiscountInterval] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitAmount(amount: AmountDiscountInterval): T

            fun visitPercentage(percentage: PercentageDiscountInterval): T

            fun visitUsage(usage: UsageDiscountInterval): T

            /**
             * Maps an unknown variant of [DiscountInterval] to a value of type [T].
             *
             * An instance of [DiscountInterval] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown DiscountInterval: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<DiscountInterval>(DiscountInterval::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): DiscountInterval {
                val json = JsonValue.fromJsonNode(node)
                val discountType =
                    json.asObject().getOrNull()?.get("discount_type")?.asString()?.getOrNull()

                when (discountType) {
                    "amount" -> {
                        tryDeserialize(node, jacksonTypeRef<AmountDiscountInterval>()) {
                                it.validate()
                            }
                            ?.let {
                                return DiscountInterval(amount = it, _json = json)
                            }
                    }
                    "percentage" -> {
                        tryDeserialize(node, jacksonTypeRef<PercentageDiscountInterval>()) {
                                it.validate()
                            }
                            ?.let {
                                return DiscountInterval(percentage = it, _json = json)
                            }
                    }
                    "usage" -> {
                        tryDeserialize(node, jacksonTypeRef<UsageDiscountInterval>()) {
                                it.validate()
                            }
                            ?.let {
                                return DiscountInterval(usage = it, _json = json)
                            }
                    }
                }

                return DiscountInterval(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<DiscountInterval>(DiscountInterval::class) {

            override fun serialize(
                value: DiscountInterval,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.amount != null -> generator.writeObject(value.amount)
                    value.percentage != null -> generator.writeObject(value.percentage)
                    value.usage != null -> generator.writeObject(value.usage)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid DiscountInterval")
                }
            }
        }

        @NoAutoDetect
        class AmountDiscountInterval
        @JsonCreator
        private constructor(
            @JsonProperty("amount_discount")
            @ExcludeMissing
            private val amountDiscount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("discount_type")
            @ExcludeMissing
            private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Only available if discount_type is `amount`. */
            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            /** The price ids that this discount interval applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The price interval ids that this discount interval applies to. */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /** The end date of the discount interval. */
            fun endDate(): Optional<OffsetDateTime> =
                Optional.ofNullable(endDate.getNullable("end_date"))

            /** The start date of the discount interval. */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /** Only available if discount_type is `amount`. */
            @JsonProperty("amount_discount")
            @ExcludeMissing
            fun _amountDiscount(): JsonField<String> = amountDiscount

            /** The price ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /** The price interval ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonField<DiscountType> = discountType

            /** The end date of the discount interval. */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /** The start date of the discount interval. */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AmountDiscountInterval = apply {
                if (validated) {
                    return@apply
                }

                amountDiscount()
                appliesToPriceIds()
                appliesToPriceIntervalIds()
                discountType()
                endDate()
                startDate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AmountDiscountInterval]. */
            class Builder internal constructor() {

                private var amountDiscount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
                private var discountType: JsonField<DiscountType>? = null
                private var endDate: JsonField<OffsetDateTime>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(amountDiscountInterval: AmountDiscountInterval) = apply {
                    amountDiscount = amountDiscountInterval.amountDiscount
                    appliesToPriceIds =
                        amountDiscountInterval.appliesToPriceIds.map { it.toMutableList() }
                    appliesToPriceIntervalIds =
                        amountDiscountInterval.appliesToPriceIntervalIds.map { it.toMutableList() }
                    discountType = amountDiscountInterval.discountType
                    endDate = amountDiscountInterval.endDate
                    startDate = amountDiscountInterval.startDate
                    additionalProperties =
                        amountDiscountInterval.additionalProperties.toMutableMap()
                }

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The price ids that this discount interval applies to. */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds =
                            appliesToPriceIntervalIds.map { it.toMutableList() }
                    }

                /** The price interval ids that this discount interval applies to. */
                fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                    appliesToPriceIntervalIds =
                        (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIntervalIds", it)
                                .add(appliesToPriceIntervalId)
                        }
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

                /** The end date of the discount interval. */
                fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.orElse(null))

                /** The end date of the discount interval. */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date of the discount interval. */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
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

                fun build(): AmountDiscountInterval =
                    AmountDiscountInterval(
                        checkRequired("amountDiscount", amountDiscount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                            it.toImmutable()
                        },
                        checkRequired("discountType", discountType),
                        checkRequired("endDate", endDate),
                        checkRequired("startDate", startDate),
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val AMOUNT = of("amount")

                    @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                }

                /** An enum containing [DiscountType]'s known values. */
                enum class Known {
                    AMOUNT
                }

                /**
                 * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DiscountType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AMOUNT,
                    /**
                     * An enum member indicating that [DiscountType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AMOUNT -> Value.AMOUNT
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
                        AMOUNT -> Known.AMOUNT
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
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
                    _value().asString().orElseThrow {
                        OrbInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AmountDiscountInterval && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && discountType == other.discountType && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amountDiscount, appliesToPriceIds, appliesToPriceIntervalIds, discountType, endDate, startDate, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AmountDiscountInterval{amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, discountType=$discountType, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PercentageDiscountInterval
        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("discount_type")
            @ExcludeMissing
            private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The price ids that this discount interval applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The price interval ids that this discount interval applies to. */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /** The end date of the discount interval. */
            fun endDate(): Optional<OffsetDateTime> =
                Optional.ofNullable(endDate.getNullable("end_date"))

            /** Only available if discount_type is `percentage`.This is a number between 0 and 1. */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            /** The start date of the discount interval. */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /** The price ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /** The price interval ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonField<DiscountType> = discountType

            /** The end date of the discount interval. */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /** Only available if discount_type is `percentage`.This is a number between 0 and 1. */
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount(): JsonField<Double> = percentageDiscount

            /** The start date of the discount interval. */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PercentageDiscountInterval = apply {
                if (validated) {
                    return@apply
                }

                appliesToPriceIds()
                appliesToPriceIntervalIds()
                discountType()
                endDate()
                percentageDiscount()
                startDate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PercentageDiscountInterval]. */
            class Builder internal constructor() {

                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
                private var discountType: JsonField<DiscountType>? = null
                private var endDate: JsonField<OffsetDateTime>? = null
                private var percentageDiscount: JsonField<Double>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(percentageDiscountInterval: PercentageDiscountInterval) = apply {
                    appliesToPriceIds =
                        percentageDiscountInterval.appliesToPriceIds.map { it.toMutableList() }
                    appliesToPriceIntervalIds =
                        percentageDiscountInterval.appliesToPriceIntervalIds.map {
                            it.toMutableList()
                        }
                    discountType = percentageDiscountInterval.discountType
                    endDate = percentageDiscountInterval.endDate
                    percentageDiscount = percentageDiscountInterval.percentageDiscount
                    startDate = percentageDiscountInterval.startDate
                    additionalProperties =
                        percentageDiscountInterval.additionalProperties.toMutableMap()
                }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The price ids that this discount interval applies to. */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds =
                            appliesToPriceIntervalIds.map { it.toMutableList() }
                    }

                /** The price interval ids that this discount interval applies to. */
                fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                    appliesToPriceIntervalIds =
                        (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIntervalIds", it)
                                .add(appliesToPriceIntervalId)
                        }
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

                /** The end date of the discount interval. */
                fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.orElse(null))

                /** The end date of the discount interval. */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /**
                 * Only available if discount_type is `percentage`.This is a number between 0 and 1.
                 */
                fun percentageDiscount(percentageDiscount: Double) =
                    percentageDiscount(JsonField.of(percentageDiscount))

                /**
                 * Only available if discount_type is `percentage`.This is a number between 0 and 1.
                 */
                fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                    this.percentageDiscount = percentageDiscount
                }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date of the discount interval. */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
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

                fun build(): PercentageDiscountInterval =
                    PercentageDiscountInterval(
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                            it.toImmutable()
                        },
                        checkRequired("discountType", discountType),
                        checkRequired("endDate", endDate),
                        checkRequired("percentageDiscount", percentageDiscount),
                        checkRequired("startDate", startDate),
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PERCENTAGE = of("percentage")

                    @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                }

                /** An enum containing [DiscountType]'s known values. */
                enum class Known {
                    PERCENTAGE
                }

                /**
                 * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DiscountType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PERCENTAGE,
                    /**
                     * An enum member indicating that [DiscountType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PERCENTAGE -> Value.PERCENTAGE
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
                        PERCENTAGE -> Known.PERCENTAGE
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
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
                    _value().asString().orElseThrow {
                        OrbInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PercentageDiscountInterval && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && discountType == other.discountType && endDate == other.endDate && percentageDiscount == other.percentageDiscount && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, appliesToPriceIntervalIds, discountType, endDate, percentageDiscount, startDate, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PercentageDiscountInterval{appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, discountType=$discountType, endDate=$endDate, percentageDiscount=$percentageDiscount, startDate=$startDate, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UsageDiscountInterval
        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("discount_type")
            @ExcludeMissing
            private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("usage_discount")
            @ExcludeMissing
            private val usageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The price ids that this discount interval applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The price interval ids that this discount interval applies to. */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /** The end date of the discount interval. */
            fun endDate(): Optional<OffsetDateTime> =
                Optional.ofNullable(endDate.getNullable("end_date"))

            /** The start date of the discount interval. */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             */
            fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

            /** The price ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /** The price interval ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonField<DiscountType> = discountType

            /** The end date of the discount interval. */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /** The start date of the discount interval. */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             */
            @JsonProperty("usage_discount")
            @ExcludeMissing
            fun _usageDiscount(): JsonField<Double> = usageDiscount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UsageDiscountInterval = apply {
                if (validated) {
                    return@apply
                }

                appliesToPriceIds()
                appliesToPriceIntervalIds()
                discountType()
                endDate()
                startDate()
                usageDiscount()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UsageDiscountInterval]. */
            class Builder internal constructor() {

                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
                private var discountType: JsonField<DiscountType>? = null
                private var endDate: JsonField<OffsetDateTime>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var usageDiscount: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(usageDiscountInterval: UsageDiscountInterval) = apply {
                    appliesToPriceIds =
                        usageDiscountInterval.appliesToPriceIds.map { it.toMutableList() }
                    appliesToPriceIntervalIds =
                        usageDiscountInterval.appliesToPriceIntervalIds.map { it.toMutableList() }
                    discountType = usageDiscountInterval.discountType
                    endDate = usageDiscountInterval.endDate
                    startDate = usageDiscountInterval.startDate
                    usageDiscount = usageDiscountInterval.usageDiscount
                    additionalProperties = usageDiscountInterval.additionalProperties.toMutableMap()
                }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /** The price ids that this discount interval applies to. */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds =
                            appliesToPriceIntervalIds.map { it.toMutableList() }
                    }

                /** The price interval ids that this discount interval applies to. */
                fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                    appliesToPriceIntervalIds =
                        (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIntervalIds", it)
                                .add(appliesToPriceIntervalId)
                        }
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

                /** The end date of the discount interval. */
                fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.orElse(null))

                /** The end date of the discount interval. */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date of the discount interval. */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
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
                fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                    this.usageDiscount = usageDiscount
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

                fun build(): UsageDiscountInterval =
                    UsageDiscountInterval(
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                            it.toImmutable()
                        },
                        checkRequired("discountType", discountType),
                        checkRequired("endDate", endDate),
                        checkRequired("startDate", startDate),
                        checkRequired("usageDiscount", usageDiscount),
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val USAGE = of("usage")

                    @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                }

                /** An enum containing [DiscountType]'s known values. */
                enum class Known {
                    USAGE
                }

                /**
                 * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DiscountType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USAGE,
                    /**
                     * An enum member indicating that [DiscountType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        USAGE -> Value.USAGE
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
                        USAGE -> Known.USAGE
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
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
                    _value().asString().orElseThrow {
                        OrbInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UsageDiscountInterval && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && discountType == other.discountType && endDate == other.endDate && startDate == other.startDate && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, appliesToPriceIntervalIds, discountType, endDate, startDate, usageDiscount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsageDiscountInterval{appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, discountType=$discountType, endDate=$endDate, startDate=$startDate, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
        }
    }

    @NoAutoDetect
    class FixedFeeQuantitySchedule
    @JsonCreator
    private constructor(
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("price_id")
        @ExcludeMissing
        private val priceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        fun priceId(): String = priceId.getRequired("price_id")

        fun quantity(): Double = quantity.getRequired("quantity")

        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): FixedFeeQuantitySchedule = apply {
            if (validated) {
                return@apply
            }

            endDate()
            priceId()
            quantity()
            startDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FixedFeeQuantitySchedule]. */
        class Builder internal constructor() {

            private var endDate: JsonField<OffsetDateTime>? = null
            private var priceId: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fixedFeeQuantitySchedule: FixedFeeQuantitySchedule) = apply {
                endDate = fixedFeeQuantitySchedule.endDate
                priceId = fixedFeeQuantitySchedule.priceId
                quantity = fixedFeeQuantitySchedule.quantity
                startDate = fixedFeeQuantitySchedule.startDate
                additionalProperties = fixedFeeQuantitySchedule.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.orElse(null))

            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
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

            fun build(): FixedFeeQuantitySchedule =
                FixedFeeQuantitySchedule(
                    checkRequired("endDate", endDate),
                    checkRequired("priceId", priceId),
                    checkRequired("quantity", quantity),
                    checkRequired("startDate", startDate),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FixedFeeQuantitySchedule && endDate == other.endDate && priceId == other.priceId && quantity == other.quantity && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endDate, priceId, quantity, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FixedFeeQuantitySchedule{endDate=$endDate, priceId=$priceId, quantity=$quantity, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class MaximumInterval
    @JsonCreator
    private constructor(
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The price ids that this maximum interval applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** The price interval ids that this maximum interval applies to. */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /** The end date of the maximum interval. */
        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        /**
         * The maximum amount to charge in a given billing period for the price intervals this
         * transform applies to.
         */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /** The start date of the maximum interval. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /** The price ids that this maximum interval applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /** The price interval ids that this maximum interval applies to. */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

        /** The end date of the maximum interval. */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * The maximum amount to charge in a given billing period for the price intervals this
         * transform applies to.
         */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /** The start date of the maximum interval. */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): MaximumInterval = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            appliesToPriceIntervalIds()
            endDate()
            maximumAmount()
            startDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MaximumInterval]. */
        class Builder internal constructor() {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var maximumAmount: JsonField<String>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(maximumInterval: MaximumInterval) = apply {
                appliesToPriceIds = maximumInterval.appliesToPriceIds.map { it.toMutableList() }
                appliesToPriceIntervalIds =
                    maximumInterval.appliesToPriceIntervalIds.map { it.toMutableList() }
                endDate = maximumInterval.endDate
                maximumAmount = maximumInterval.maximumAmount
                startDate = maximumInterval.startDate
                additionalProperties = maximumInterval.additionalProperties.toMutableMap()
            }

            /** The price ids that this maximum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price ids that this maximum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The price ids that this maximum interval applies to. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /** The price interval ids that this maximum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /** The price interval ids that this maximum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds =
                        appliesToPriceIntervalIds.map { it.toMutableList() }
                }

            /** The price interval ids that this maximum interval applies to. */
            fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                appliesToPriceIntervalIds =
                    (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIntervalIds", it).add(appliesToPriceIntervalId)
                    }
            }

            /** The end date of the maximum interval. */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /** The end date of the maximum interval. */
            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.orElse(null))

            /** The end date of the maximum interval. */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * The maximum amount to charge in a given billing period for the price intervals this
             * transform applies to.
             */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /**
             * The maximum amount to charge in a given billing period for the price intervals this
             * transform applies to.
             */
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /** The start date of the maximum interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the maximum interval. */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
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

            fun build(): MaximumInterval =
                MaximumInterval(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                        it.toImmutable()
                    },
                    checkRequired("endDate", endDate),
                    checkRequired("maximumAmount", maximumAmount),
                    checkRequired("startDate", startDate),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MaximumInterval && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && endDate == other.endDate && maximumAmount == other.maximumAmount && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, appliesToPriceIntervalIds, endDate, maximumAmount, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MaximumInterval{appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, endDate=$endDate, maximumAmount=$maximumAmount, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

    @NoAutoDetect
    class MinimumInterval
    @JsonCreator
    private constructor(
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The price ids that this minimum interval applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** The price interval ids that this minimum interval applies to. */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /** The end date of the minimum interval. */
        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        /**
         * The minimum amount to charge in a given billing period for the price intervals this
         * minimum applies to.
         */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /** The start date of the minimum interval. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /** The price ids that this minimum interval applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /** The price interval ids that this minimum interval applies to. */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

        /** The end date of the minimum interval. */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * The minimum amount to charge in a given billing period for the price intervals this
         * minimum applies to.
         */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        /** The start date of the minimum interval. */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): MinimumInterval = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            appliesToPriceIntervalIds()
            endDate()
            minimumAmount()
            startDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MinimumInterval]. */
        class Builder internal constructor() {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var minimumAmount: JsonField<String>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimumInterval: MinimumInterval) = apply {
                appliesToPriceIds = minimumInterval.appliesToPriceIds.map { it.toMutableList() }
                appliesToPriceIntervalIds =
                    minimumInterval.appliesToPriceIntervalIds.map { it.toMutableList() }
                endDate = minimumInterval.endDate
                minimumAmount = minimumInterval.minimumAmount
                startDate = minimumInterval.startDate
                additionalProperties = minimumInterval.additionalProperties.toMutableMap()
            }

            /** The price ids that this minimum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price ids that this minimum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /** The price ids that this minimum interval applies to. */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /** The price interval ids that this minimum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /** The price interval ids that this minimum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds =
                        appliesToPriceIntervalIds.map { it.toMutableList() }
                }

            /** The price interval ids that this minimum interval applies to. */
            fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                appliesToPriceIntervalIds =
                    (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIntervalIds", it).add(appliesToPriceIntervalId)
                    }
            }

            /** The end date of the minimum interval. */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /** The end date of the minimum interval. */
            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.orElse(null))

            /** The end date of the minimum interval. */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * The minimum amount to charge in a given billing period for the price intervals this
             * minimum applies to.
             */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /**
             * The minimum amount to charge in a given billing period for the price intervals this
             * minimum applies to.
             */
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** The start date of the minimum interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the minimum interval. */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
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

            fun build(): MinimumInterval =
                MinimumInterval(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                        it.toImmutable()
                    },
                    checkRequired("endDate", endDate),
                    checkRequired("minimumAmount", minimumAmount),
                    checkRequired("startDate", startDate),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MinimumInterval && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && endDate == other.endDate && minimumAmount == other.minimumAmount && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, appliesToPriceIntervalIds, endDate, minimumAmount, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MinimumInterval{appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, endDate=$endDate, minimumAmount=$minimumAmount, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    /**
     * The Price Interval resource represents a period of time for which a price will bill on a
     * subscription. A subscription’s price intervals define its billing behavior.
     */
    @NoAutoDetect
    class PriceInterval
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        private val billingCycleDay: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("current_billing_period_end_date")
        @ExcludeMissing
        private val currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("current_billing_period_start_date")
        @ExcludeMissing
        private val currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filter")
        @ExcludeMissing
        private val filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        private val fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>> =
            JsonMissing.of(),
        @JsonProperty("price")
        @ExcludeMissing
        private val price: JsonField<Price> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        private val usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        /** The day of the month that Orb bills for this price */
        fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is exactly the end of the billing period. Set to null if this price
         * interval is not currently active.
         */
        fun currentBillingPeriodEndDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                currentBillingPeriodEndDate.getNullable("current_billing_period_end_date")
            )

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if this price
         * interval is not currently active.
         */
        fun currentBillingPeriodStartDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                currentBillingPeriodStartDate.getNullable("current_billing_period_start_date")
            )

        /**
         * The end date of the price interval. This is the date that Orb stops billing for this
         * price.
         */
        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        /** An additional filter to apply to usage queries. */
        fun filter(): Optional<String> = Optional.ofNullable(filter.getNullable("filter"))

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         */
        fun fixedFeeQuantityTransitions(): Optional<List<FixedFeeQuantityTransition>> =
            Optional.ofNullable(
                fixedFeeQuantityTransitions.getNullable("fixed_fee_quantity_transitions")
            )

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        fun price(): Price = price.getRequired("price")

        /**
         * The start date of the price interval. This is the date that Orb starts billing for this
         * price.
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this price
         * interval.
         */
        fun usageCustomerIds(): Optional<List<String>> =
            Optional.ofNullable(usageCustomerIds.getNullable("usage_customer_ids"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The day of the month that Orb bills for this price */
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        fun _billingCycleDay(): JsonField<Long> = billingCycleDay

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is exactly the end of the billing period. Set to null if this price
         * interval is not currently active.
         */
        @JsonProperty("current_billing_period_end_date")
        @ExcludeMissing
        fun _currentBillingPeriodEndDate(): JsonField<OffsetDateTime> = currentBillingPeriodEndDate

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if this price
         * interval is not currently active.
         */
        @JsonProperty("current_billing_period_start_date")
        @ExcludeMissing
        fun _currentBillingPeriodStartDate(): JsonField<OffsetDateTime> =
            currentBillingPeriodStartDate

        /**
         * The end date of the price interval. This is the date that Orb stops billing for this
         * price.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /** An additional filter to apply to usage queries. */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         */
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        fun _fixedFeeQuantityTransitions(): JsonField<List<FixedFeeQuantityTransition>> =
            fixedFeeQuantityTransitions

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * For more on the types of prices, see
         * [the core concepts documentation](/core-concepts#plan-and-price)
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * The start date of the price interval. This is the date that Orb starts billing for this
         * price.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this price
         * interval.
         */
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        fun _usageCustomerIds(): JsonField<List<String>> = usageCustomerIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PriceInterval = apply {
            if (validated) {
                return@apply
            }

            id()
            billingCycleDay()
            currentBillingPeriodEndDate()
            currentBillingPeriodStartDate()
            endDate()
            filter()
            fixedFeeQuantityTransitions().ifPresent { it.forEach { it.validate() } }
            price().validate()
            startDate()
            usageCustomerIds()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PriceInterval]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var billingCycleDay: JsonField<Long>? = null
            private var currentBillingPeriodEndDate: JsonField<OffsetDateTime>? = null
            private var currentBillingPeriodStartDate: JsonField<OffsetDateTime>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var filter: JsonField<String>? = null
            private var fixedFeeQuantityTransitions:
                JsonField<MutableList<FixedFeeQuantityTransition>>? =
                null
            private var price: JsonField<Price>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var usageCustomerIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(priceInterval: PriceInterval) = apply {
                id = priceInterval.id
                billingCycleDay = priceInterval.billingCycleDay
                currentBillingPeriodEndDate = priceInterval.currentBillingPeriodEndDate
                currentBillingPeriodStartDate = priceInterval.currentBillingPeriodStartDate
                endDate = priceInterval.endDate
                filter = priceInterval.filter
                fixedFeeQuantityTransitions =
                    priceInterval.fixedFeeQuantityTransitions.map { it.toMutableList() }
                price = priceInterval.price
                startDate = priceInterval.startDate
                usageCustomerIds = priceInterval.usageCustomerIds.map { it.toMutableList() }
                additionalProperties = priceInterval.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The day of the month that Orb bills for this price */
            fun billingCycleDay(billingCycleDay: Long) =
                billingCycleDay(JsonField.of(billingCycleDay))

            /** The day of the month that Orb bills for this price */
            fun billingCycleDay(billingCycleDay: JsonField<Long>) = apply {
                this.billingCycleDay = billingCycleDay
            }

            /**
             * The end of the current billing period. This is an exclusive timestamp, such that the
             * instant returned is exactly the end of the billing period. Set to null if this price
             * interval is not currently active.
             */
            fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: OffsetDateTime?) =
                currentBillingPeriodEndDate(JsonField.ofNullable(currentBillingPeriodEndDate))

            /**
             * The end of the current billing period. This is an exclusive timestamp, such that the
             * instant returned is exactly the end of the billing period. Set to null if this price
             * interval is not currently active.
             */
            fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: Optional<OffsetDateTime>) =
                currentBillingPeriodEndDate(currentBillingPeriodEndDate.orElse(null))

            /**
             * The end of the current billing period. This is an exclusive timestamp, such that the
             * instant returned is exactly the end of the billing period. Set to null if this price
             * interval is not currently active.
             */
            fun currentBillingPeriodEndDate(
                currentBillingPeriodEndDate: JsonField<OffsetDateTime>
            ) = apply { this.currentBillingPeriodEndDate = currentBillingPeriodEndDate }

            /**
             * The start date of the current billing period. This is an inclusive timestamp; the
             * instant returned is exactly the beginning of the billing period. Set to null if this
             * price interval is not currently active.
             */
            fun currentBillingPeriodStartDate(currentBillingPeriodStartDate: OffsetDateTime?) =
                currentBillingPeriodStartDate(JsonField.ofNullable(currentBillingPeriodStartDate))

            /**
             * The start date of the current billing period. This is an inclusive timestamp; the
             * instant returned is exactly the beginning of the billing period. Set to null if this
             * price interval is not currently active.
             */
            fun currentBillingPeriodStartDate(
                currentBillingPeriodStartDate: Optional<OffsetDateTime>
            ) = currentBillingPeriodStartDate(currentBillingPeriodStartDate.orElse(null))

            /**
             * The start date of the current billing period. This is an inclusive timestamp; the
             * instant returned is exactly the beginning of the billing period. Set to null if this
             * price interval is not currently active.
             */
            fun currentBillingPeriodStartDate(
                currentBillingPeriodStartDate: JsonField<OffsetDateTime>
            ) = apply { this.currentBillingPeriodStartDate = currentBillingPeriodStartDate }

            /**
             * The end date of the price interval. This is the date that Orb stops billing for this
             * price.
             */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /**
             * The end date of the price interval. This is the date that Orb stops billing for this
             * price.
             */
            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.orElse(null))

            /**
             * The end date of the price interval. This is the date that Orb stops billing for this
             * price.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** An additional filter to apply to usage queries. */
            fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

            /** An additional filter to apply to usage queries. */
            fun filter(filter: Optional<String>) = filter(filter.orElse(null))

            /** An additional filter to apply to usage queries. */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /**
             * The fixed fee quantity transitions for this price interval. This is only relevant for
             * fixed fees.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>?
            ) = fixedFeeQuantityTransitions(JsonField.ofNullable(fixedFeeQuantityTransitions))

            /**
             * The fixed fee quantity transitions for this price interval. This is only relevant for
             * fixed fees.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: Optional<List<FixedFeeQuantityTransition>>
            ) = fixedFeeQuantityTransitions(fixedFeeQuantityTransitions.orElse(null))

            /**
             * The fixed fee quantity transitions for this price interval. This is only relevant for
             * fixed fees.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>
            ) = apply {
                this.fixedFeeQuantityTransitions =
                    fixedFeeQuantityTransitions.map { it.toMutableList() }
            }

            /**
             * The fixed fee quantity transitions for this price interval. This is only relevant for
             * fixed fees.
             */
            fun addFixedFeeQuantityTransition(
                fixedFeeQuantityTransition: FixedFeeQuantityTransition
            ) = apply {
                fixedFeeQuantityTransitions =
                    (fixedFeeQuantityTransitions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fixedFeeQuantityTransitions", it)
                            .add(fixedFeeQuantityTransition)
                    }
            }

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(price: Price) = price(JsonField.of(price))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(unit: Price.UnitPrice) = price(Price.ofUnit(unit))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(packagePrice: Price.PackagePrice) = price(Price.ofPackagePrice(packagePrice))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(matrix: Price.MatrixPrice) = price(Price.ofMatrix(matrix))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(tiered: Price.TieredPrice) = price(Price.ofTiered(tiered))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(tieredBps: Price.TieredBpsPrice) = price(Price.ofTieredBps(tieredBps))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(bps: Price.BpsPrice) = price(Price.ofBps(bps))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(bulkBps: Price.BulkBpsPrice) = price(Price.ofBulkBps(bulkBps))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(bulk: Price.BulkPrice) = price(Price.ofBulk(bulk))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(thresholdTotalAmount: Price.ThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(tieredPackage: Price.TieredPackagePrice) =
                price(Price.ofTieredPackage(tieredPackage))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(groupedTiered: Price.GroupedTieredPrice) =
                price(Price.ofGroupedTiered(groupedTiered))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(tieredWithMinimum: Price.TieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(tieredPackageWithMinimum: Price.TieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(packageWithAllocation: Price.PackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(unitWithPercent: Price.UnitWithPercentPrice) =
                price(Price.ofUnitWithPercent(unitWithPercent))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(matrixWithAllocation: Price.MatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(tieredWithProration: Price.TieredWithProrationPrice) =
                price(Price.ofTieredWithProration(tieredWithProration))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(unitWithProration: Price.UnitWithProrationPrice) =
                price(Price.ofUnitWithProration(unitWithProration))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(groupedAllocation: Price.GroupedAllocationPrice) =
                price(Price.ofGroupedAllocation(groupedAllocation))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(groupedWithProratedMinimum: Price.GroupedWithProratedMinimumPrice) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimumPrice) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(matrixWithDisplayName: Price.MatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(bulkWithProration: Price.BulkWithProrationPrice) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(groupedTieredPackage: Price.GroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(maxGroupTieredPackage: Price.MaxGroupTieredPackagePrice) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(scalableMatrixWithUnitPricing: Price.ScalableMatrixWithUnitPricingPrice) =
                price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(scalableMatrixWithTieredPricing: Price.ScalableMatrixWithTieredPricingPrice) =
                price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * For more on the types of prices, see
             * [the core concepts documentation](/core-concepts#plan-and-price)
             */
            fun price(cumulativeGroupedBulk: Price.CumulativeGroupedBulkPrice) =
                price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

            /**
             * The start date of the price interval. This is the date that Orb starts billing for
             * this price.
             */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * The start date of the price interval. This is the date that Orb starts billing for
             * this price.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /**
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * price interval.
             */
            fun usageCustomerIds(usageCustomerIds: List<String>?) =
                usageCustomerIds(JsonField.ofNullable(usageCustomerIds))

            /**
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * price interval.
             */
            fun usageCustomerIds(usageCustomerIds: Optional<List<String>>) =
                usageCustomerIds(usageCustomerIds.orElse(null))

            /**
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * price interval.
             */
            fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
                this.usageCustomerIds = usageCustomerIds.map { it.toMutableList() }
            }

            /**
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * price interval.
             */
            fun addUsageCustomerId(usageCustomerId: String) = apply {
                usageCustomerIds =
                    (usageCustomerIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("usageCustomerIds", it).add(usageCustomerId)
                    }
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

            fun build(): PriceInterval =
                PriceInterval(
                    checkRequired("id", id),
                    checkRequired("billingCycleDay", billingCycleDay),
                    checkRequired("currentBillingPeriodEndDate", currentBillingPeriodEndDate),
                    checkRequired("currentBillingPeriodStartDate", currentBillingPeriodStartDate),
                    checkRequired("endDate", endDate),
                    checkRequired("filter", filter),
                    checkRequired("fixedFeeQuantityTransitions", fixedFeeQuantityTransitions).map {
                        it.toImmutable()
                    },
                    checkRequired("price", price),
                    checkRequired("startDate", startDate),
                    checkRequired("usageCustomerIds", usageCustomerIds).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class FixedFeeQuantityTransition
        @JsonCreator
        private constructor(
            @JsonProperty("effective_date")
            @ExcludeMissing
            private val effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("price_id")
            @ExcludeMissing
            private val priceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun effectiveDate(): OffsetDateTime = effectiveDate.getRequired("effective_date")

            fun priceId(): String = priceId.getRequired("price_id")

            fun quantity(): Long = quantity.getRequired("quantity")

            @JsonProperty("effective_date")
            @ExcludeMissing
            fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

            @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): FixedFeeQuantityTransition = apply {
                if (validated) {
                    return@apply
                }

                effectiveDate()
                priceId()
                quantity()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FixedFeeQuantityTransition]. */
            class Builder internal constructor() {

                private var effectiveDate: JsonField<OffsetDateTime>? = null
                private var priceId: JsonField<String>? = null
                private var quantity: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(fixedFeeQuantityTransition: FixedFeeQuantityTransition) = apply {
                    effectiveDate = fixedFeeQuantityTransition.effectiveDate
                    priceId = fixedFeeQuantityTransition.priceId
                    quantity = fixedFeeQuantityTransition.quantity
                    additionalProperties =
                        fixedFeeQuantityTransition.additionalProperties.toMutableMap()
                }

                fun effectiveDate(effectiveDate: OffsetDateTime) =
                    effectiveDate(JsonField.of(effectiveDate))

                fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
                    this.effectiveDate = effectiveDate
                }

                fun priceId(priceId: String) = priceId(JsonField.of(priceId))

                fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

                fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

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

                fun build(): FixedFeeQuantityTransition =
                    FixedFeeQuantityTransition(
                        checkRequired("effectiveDate", effectiveDate),
                        checkRequired("priceId", priceId),
                        checkRequired("quantity", quantity),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FixedFeeQuantityTransition && effectiveDate == other.effectiveDate && priceId == other.priceId && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(effectiveDate, priceId, quantity, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FixedFeeQuantityTransition{effectiveDate=$effectiveDate, priceId=$priceId, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PriceInterval && id == other.id && billingCycleDay == other.billingCycleDay && currentBillingPeriodEndDate == other.currentBillingPeriodEndDate && currentBillingPeriodStartDate == other.currentBillingPeriodStartDate && endDate == other.endDate && filter == other.filter && fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions && price == other.price && startDate == other.startDate && usageCustomerIds == other.usageCustomerIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, billingCycleDay, currentBillingPeriodEndDate, currentBillingPeriodStartDate, endDate, filter, fixedFeeQuantityTransitions, price, startDate, usageCustomerIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PriceInterval{id=$id, billingCycleDay=$billingCycleDay, currentBillingPeriodEndDate=$currentBillingPeriodEndDate, currentBillingPeriodStartDate=$currentBillingPeriodStartDate, endDate=$endDate, filter=$filter, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, price=$price, startDate=$startDate, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class RedeemedCoupon
    @JsonCreator
    private constructor(
        @JsonProperty("coupon_id")
        @ExcludeMissing
        private val couponId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun couponId(): String = couponId.getRequired("coupon_id")

        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        @JsonProperty("coupon_id") @ExcludeMissing fun _couponId(): JsonField<String> = couponId

        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RedeemedCoupon = apply {
            if (validated) {
                return@apply
            }

            couponId()
            endDate()
            startDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RedeemedCoupon]. */
        class Builder internal constructor() {

            private var couponId: JsonField<String>? = null
            private var endDate: JsonField<OffsetDateTime>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(redeemedCoupon: RedeemedCoupon) = apply {
                couponId = redeemedCoupon.couponId
                endDate = redeemedCoupon.endDate
                startDate = redeemedCoupon.startDate
                additionalProperties = redeemedCoupon.additionalProperties.toMutableMap()
            }

            fun couponId(couponId: String) = couponId(JsonField.of(couponId))

            fun couponId(couponId: JsonField<String>) = apply { this.couponId = couponId }

            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.orElse(null))

            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
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

            fun build(): RedeemedCoupon =
                RedeemedCoupon(
                    checkRequired("couponId", couponId),
                    checkRequired("endDate", endDate),
                    checkRequired("startDate", startDate),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RedeemedCoupon && couponId == other.couponId && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(couponId, endDate, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RedeemedCoupon{couponId=$couponId, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACTIVE = of("active")

            @JvmField val ENDED = of("ended")

            @JvmField val UPCOMING = of("upcoming")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            ENDED,
            UPCOMING,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            ENDED,
            UPCOMING,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ACTIVE -> Value.ACTIVE
                ENDED -> Value.ENDED
                UPCOMING -> Value.UPCOMING
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
                ACTIVE -> Known.ACTIVE
                ENDED -> Known.ENDED
                UPCOMING -> Known.UPCOMING
                else -> throw OrbInvalidDataException("Unknown Status: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class TrialInfo
    @JsonCreator
    private constructor(
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TrialInfo = apply {
            if (validated) {
                return@apply
            }

            endDate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TrialInfo]. */
        class Builder internal constructor() {

            private var endDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trialInfo: TrialInfo) = apply {
                endDate = trialInfo.endDate
                additionalProperties = trialInfo.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.orElse(null))

            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

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

            fun build(): TrialInfo =
                TrialInfo(checkRequired("endDate", endDate), additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrialInfo && endDate == other.endDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(endDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrialInfo{endDate=$endDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionUpdateFixedFeeQuantityResponse && id == other.id && activePlanPhaseOrder == other.activePlanPhaseOrder && adjustmentIntervals == other.adjustmentIntervals && autoCollection == other.autoCollection && billingCycleAnchorConfiguration == other.billingCycleAnchorConfiguration && billingCycleDay == other.billingCycleDay && createdAt == other.createdAt && currentBillingPeriodEndDate == other.currentBillingPeriodEndDate && currentBillingPeriodStartDate == other.currentBillingPeriodStartDate && customer == other.customer && defaultInvoiceMemo == other.defaultInvoiceMemo && discountIntervals == other.discountIntervals && endDate == other.endDate && fixedFeeQuantitySchedule == other.fixedFeeQuantitySchedule && invoicingThreshold == other.invoicingThreshold && maximumIntervals == other.maximumIntervals && metadata == other.metadata && minimumIntervals == other.minimumIntervals && netTerms == other.netTerms && plan == other.plan && priceIntervals == other.priceIntervals && redeemedCoupon == other.redeemedCoupon && startDate == other.startDate && status == other.status && trialInfo == other.trialInfo && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, activePlanPhaseOrder, adjustmentIntervals, autoCollection, billingCycleAnchorConfiguration, billingCycleDay, createdAt, currentBillingPeriodEndDate, currentBillingPeriodStartDate, customer, defaultInvoiceMemo, discountIntervals, endDate, fixedFeeQuantitySchedule, invoicingThreshold, maximumIntervals, metadata, minimumIntervals, netTerms, plan, priceIntervals, redeemedCoupon, startDate, status, trialInfo, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionUpdateFixedFeeQuantityResponse{id=$id, activePlanPhaseOrder=$activePlanPhaseOrder, adjustmentIntervals=$adjustmentIntervals, autoCollection=$autoCollection, billingCycleAnchorConfiguration=$billingCycleAnchorConfiguration, billingCycleDay=$billingCycleDay, createdAt=$createdAt, currentBillingPeriodEndDate=$currentBillingPeriodEndDate, currentBillingPeriodStartDate=$currentBillingPeriodStartDate, customer=$customer, defaultInvoiceMemo=$defaultInvoiceMemo, discountIntervals=$discountIntervals, endDate=$endDate, fixedFeeQuantitySchedule=$fixedFeeQuantitySchedule, invoicingThreshold=$invoicingThreshold, maximumIntervals=$maximumIntervals, metadata=$metadata, minimumIntervals=$minimumIntervals, netTerms=$netTerms, plan=$plan, priceIntervals=$priceIntervals, redeemedCoupon=$redeemedCoupon, startDate=$startDate, status=$status, trialInfo=$trialInfo, additionalProperties=$additionalProperties}"
}
