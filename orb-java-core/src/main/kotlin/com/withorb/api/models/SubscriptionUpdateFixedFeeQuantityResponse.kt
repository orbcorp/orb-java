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
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<Customer> = JsonMissing.of(),
    @JsonProperty("plan") @ExcludeMissing private val plan: JsonField<Plan> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("current_billing_period_start_date")
    @ExcludeMissing
    private val currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("current_billing_period_end_date")
    @ExcludeMissing
    private val currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("trial_info")
    @ExcludeMissing
    private val trialInfo: JsonField<TrialInfo> = JsonMissing.of(),
    @JsonProperty("active_plan_phase_order")
    @ExcludeMissing
    private val activePlanPhaseOrder: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("fixed_fee_quantity_schedule")
    @ExcludeMissing
    private val fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>> =
        JsonMissing.of(),
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    private val defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
    @JsonProperty("auto_collection")
    @ExcludeMissing
    private val autoCollection: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("net_terms")
    @ExcludeMissing
    private val netTerms: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("redeemed_coupon")
    @ExcludeMissing
    private val redeemedCoupon: JsonField<RedeemedCoupon> = JsonMissing.of(),
    @JsonProperty("billing_cycle_day")
    @ExcludeMissing
    private val billingCycleDay: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("billing_cycle_anchor_configuration")
    @ExcludeMissing
    private val billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration> =
        JsonMissing.of(),
    @JsonProperty("invoicing_threshold")
    @ExcludeMissing
    private val invoicingThreshold: JsonField<String> = JsonMissing.of(),
    @JsonProperty("price_intervals")
    @ExcludeMissing
    private val priceIntervals: JsonField<List<PriceInterval>> = JsonMissing.of(),
    @JsonProperty("adjustment_intervals")
    @ExcludeMissing
    private val adjustmentIntervals: JsonField<List<AdjustmentInterval>> = JsonMissing.of(),
    @JsonProperty("discount_intervals")
    @ExcludeMissing
    private val discountIntervals: JsonField<List<DiscountInterval>> = JsonMissing.of(),
    @JsonProperty("minimum_intervals")
    @ExcludeMissing
    private val minimumIntervals: JsonField<List<MinimumInterval>> = JsonMissing.of(),
    @JsonProperty("maximum_intervals")
    @ExcludeMissing
    private val maximumIntervals: JsonField<List<MaximumInterval>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun id(): String = id.getRequired("id")

    /**
     * A customer is a buyer of your products, and the other party to the billing relationship.
     *
     * In Orb, customers are assigned system generated identifiers automatically, but it's often
     * desirable to have these match existing identifiers in your system. To avoid having to
     * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
     * identifier. See [Customer ID Aliases](../guides/events-and-metrics/customer-aliases) for
     * further information about how these aliases work in Orb.
     *
     * In addition to having an identifier in your system, a customer may exist in a payment
     * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum
     * field to express this mapping.
     *
     * A customer also has a timezone (from the standard
     * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
     * timezone. See [Timezone localization](../guides/product-catalog/timezones.md) for information
     * on what this timezone parameter influences within Orb.
     */
    fun customer(): Customer = customer.getRequired("customer")

    /**
     * The [Plan](../guides/core-concepts.mdx#plan-and-price) resource represents a plan that can be
     * subscribed to by a customer. Plans define the billing behavior of the subscription. You can
     * see more about how to configure prices in the [Price resource](/reference/price).
     */
    fun plan(): Plan = plan.getRequired("plan")

    /** The date Orb starts billing for this subscription. */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /** The date Orb stops billing for this subscription. */
    fun endDate(): Optional<OffsetDateTime> = Optional.ofNullable(endDate.getNullable("end_date"))

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

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
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is not part of the billing period. Set to null for subscriptions that are not
     * currently active.
     */
    fun currentBillingPeriodEndDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(
            currentBillingPeriodEndDate.getNullable("current_billing_period_end_date")
        )

    fun status(): Status = status.getRequired("status")

    fun trialInfo(): TrialInfo = trialInfo.getRequired("trial_info")

    /** The current plan phase that is active, only if the subscription's plan has phases. */
    fun activePlanPhaseOrder(): Optional<Long> =
        Optional.ofNullable(activePlanPhaseOrder.getNullable("active_plan_phase_order"))

    fun fixedFeeQuantitySchedule(): List<FixedFeeQuantitySchedule> =
        fixedFeeQuantitySchedule.getRequired("fixed_fee_quantity_schedule")

    /**
     * Determines the default memo on this subscriptions' invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    fun defaultInvoiceMemo(): Optional<String> =
        Optional.ofNullable(defaultInvoiceMemo.getNullable("default_invoice_memo"))

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. This property defaults to the plan's behavior. If
     * null, defaults to the customer's setting.
     */
    fun autoCollection(): Optional<Boolean> =
        Optional.ofNullable(autoCollection.getNullable("auto_collection"))

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of `0` here represents that the invoice is due on issue,
     * whereas a value of `30` represents that the customer has a month to pay the invoice.
     */
    fun netTerms(): Long = netTerms.getRequired("net_terms")

    fun redeemedCoupon(): Optional<RedeemedCoupon> =
        Optional.ofNullable(redeemedCoupon.getNullable("redeemed_coupon"))

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     */
    fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

    fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfiguration =
        billingCycleAnchorConfiguration.getRequired("billing_cycle_anchor_configuration")

    fun invoicingThreshold(): Optional<String> =
        Optional.ofNullable(invoicingThreshold.getNullable("invoicing_threshold"))

    /** The price intervals for this subscription. */
    fun priceIntervals(): List<PriceInterval> = priceIntervals.getRequired("price_intervals")

    /** The adjustment intervals for this subscription. */
    fun adjustmentIntervals(): List<AdjustmentInterval> =
        adjustmentIntervals.getRequired("adjustment_intervals")

    /** The discount intervals for this subscription. */
    fun discountIntervals(): List<DiscountInterval> =
        discountIntervals.getRequired("discount_intervals")

    /** The minimum intervals for this subscription. */
    fun minimumIntervals(): List<MinimumInterval> =
        minimumIntervals.getRequired("minimum_intervals")

    /** The maximum intervals for this subscription. */
    fun maximumIntervals(): List<MaximumInterval> =
        maximumIntervals.getRequired("maximum_intervals")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * A customer is a buyer of your products, and the other party to the billing relationship.
     *
     * In Orb, customers are assigned system generated identifiers automatically, but it's often
     * desirable to have these match existing identifiers in your system. To avoid having to
     * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
     * identifier. See [Customer ID Aliases](../guides/events-and-metrics/customer-aliases) for
     * further information about how these aliases work in Orb.
     *
     * In addition to having an identifier in your system, a customer may exist in a payment
     * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum
     * field to express this mapping.
     *
     * A customer also has a timezone (from the standard
     * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
     * timezone. See [Timezone localization](../guides/product-catalog/timezones.md) for information
     * on what this timezone parameter influences within Orb.
     */
    @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

    /**
     * The [Plan](../guides/core-concepts.mdx#plan-and-price) resource represents a plan that can be
     * subscribed to by a customer. Plans define the billing behavior of the subscription. You can
     * see more about how to configure prices in the [Price resource](/reference/price).
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan() = plan

    /** The date Orb starts billing for this subscription. */
    @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

    /** The date Orb stops billing for this subscription. */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * The start date of the current billing period. This is an inclusive timestamp; the instant
     * returned is exactly the beginning of the billing period. Set to null if the subscription is
     * not currently active.
     */
    @JsonProperty("current_billing_period_start_date")
    @ExcludeMissing
    fun _currentBillingPeriodStartDate() = currentBillingPeriodStartDate

    /**
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is not part of the billing period. Set to null for subscriptions that are not
     * currently active.
     */
    @JsonProperty("current_billing_period_end_date")
    @ExcludeMissing
    fun _currentBillingPeriodEndDate() = currentBillingPeriodEndDate

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("trial_info") @ExcludeMissing fun _trialInfo() = trialInfo

    /** The current plan phase that is active, only if the subscription's plan has phases. */
    @JsonProperty("active_plan_phase_order")
    @ExcludeMissing
    fun _activePlanPhaseOrder() = activePlanPhaseOrder

    @JsonProperty("fixed_fee_quantity_schedule")
    @ExcludeMissing
    fun _fixedFeeQuantitySchedule() = fixedFeeQuantitySchedule

    /**
     * Determines the default memo on this subscriptions' invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     */
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    fun _defaultInvoiceMemo() = defaultInvoiceMemo

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. This property defaults to the plan's behavior. If
     * null, defaults to the customer's setting.
     */
    @JsonProperty("auto_collection") @ExcludeMissing fun _autoCollection() = autoCollection

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of `0` here represents that the invoice is due on issue,
     * whereas a value of `30` represents that the customer has a month to pay the invoice.
     */
    @JsonProperty("net_terms") @ExcludeMissing fun _netTerms() = netTerms

    @JsonProperty("redeemed_coupon") @ExcludeMissing fun _redeemedCoupon() = redeemedCoupon

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     */
    @JsonProperty("billing_cycle_day") @ExcludeMissing fun _billingCycleDay() = billingCycleDay

    @JsonProperty("billing_cycle_anchor_configuration")
    @ExcludeMissing
    fun _billingCycleAnchorConfiguration() = billingCycleAnchorConfiguration

    @JsonProperty("invoicing_threshold")
    @ExcludeMissing
    fun _invoicingThreshold() = invoicingThreshold

    /** The price intervals for this subscription. */
    @JsonProperty("price_intervals") @ExcludeMissing fun _priceIntervals() = priceIntervals

    /** The adjustment intervals for this subscription. */
    @JsonProperty("adjustment_intervals")
    @ExcludeMissing
    fun _adjustmentIntervals() = adjustmentIntervals

    /** The discount intervals for this subscription. */
    @JsonProperty("discount_intervals") @ExcludeMissing fun _discountIntervals() = discountIntervals

    /** The minimum intervals for this subscription. */
    @JsonProperty("minimum_intervals") @ExcludeMissing fun _minimumIntervals() = minimumIntervals

    /** The maximum intervals for this subscription. */
    @JsonProperty("maximum_intervals") @ExcludeMissing fun _maximumIntervals() = maximumIntervals

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SubscriptionUpdateFixedFeeQuantityResponse = apply {
        if (!validated) {
            metadata().validate()
            id()
            customer().validate()
            plan().validate()
            startDate()
            endDate()
            createdAt()
            currentBillingPeriodStartDate()
            currentBillingPeriodEndDate()
            status()
            trialInfo().validate()
            activePlanPhaseOrder()
            fixedFeeQuantitySchedule().forEach { it.validate() }
            defaultInvoiceMemo()
            autoCollection()
            netTerms()
            redeemedCoupon().map { it.validate() }
            billingCycleDay()
            billingCycleAnchorConfiguration().validate()
            invoicingThreshold()
            priceIntervals().forEach { it.validate() }
            adjustmentIntervals().forEach { it.validate() }
            discountIntervals()
            minimumIntervals().forEach { it.validate() }
            maximumIntervals().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var customer: JsonField<Customer> = JsonMissing.of()
        private var plan: JsonField<Plan> = JsonMissing.of()
        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var trialInfo: JsonField<TrialInfo> = JsonMissing.of()
        private var activePlanPhaseOrder: JsonField<Long> = JsonMissing.of()
        private var fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>> =
            JsonMissing.of()
        private var defaultInvoiceMemo: JsonField<String> = JsonMissing.of()
        private var autoCollection: JsonField<Boolean> = JsonMissing.of()
        private var netTerms: JsonField<Long> = JsonMissing.of()
        private var redeemedCoupon: JsonField<RedeemedCoupon> = JsonMissing.of()
        private var billingCycleDay: JsonField<Long> = JsonMissing.of()
        private var billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration> =
            JsonMissing.of()
        private var invoicingThreshold: JsonField<String> = JsonMissing.of()
        private var priceIntervals: JsonField<List<PriceInterval>> = JsonMissing.of()
        private var adjustmentIntervals: JsonField<List<AdjustmentInterval>> = JsonMissing.of()
        private var discountIntervals: JsonField<List<DiscountInterval>> = JsonMissing.of()
        private var minimumIntervals: JsonField<List<MinimumInterval>> = JsonMissing.of()
        private var maximumIntervals: JsonField<List<MaximumInterval>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            subscriptionUpdateFixedFeeQuantityResponse: SubscriptionUpdateFixedFeeQuantityResponse
        ) = apply {
            metadata = subscriptionUpdateFixedFeeQuantityResponse.metadata
            id = subscriptionUpdateFixedFeeQuantityResponse.id
            customer = subscriptionUpdateFixedFeeQuantityResponse.customer
            plan = subscriptionUpdateFixedFeeQuantityResponse.plan
            startDate = subscriptionUpdateFixedFeeQuantityResponse.startDate
            endDate = subscriptionUpdateFixedFeeQuantityResponse.endDate
            createdAt = subscriptionUpdateFixedFeeQuantityResponse.createdAt
            currentBillingPeriodStartDate =
                subscriptionUpdateFixedFeeQuantityResponse.currentBillingPeriodStartDate
            currentBillingPeriodEndDate =
                subscriptionUpdateFixedFeeQuantityResponse.currentBillingPeriodEndDate
            status = subscriptionUpdateFixedFeeQuantityResponse.status
            trialInfo = subscriptionUpdateFixedFeeQuantityResponse.trialInfo
            activePlanPhaseOrder = subscriptionUpdateFixedFeeQuantityResponse.activePlanPhaseOrder
            fixedFeeQuantitySchedule =
                subscriptionUpdateFixedFeeQuantityResponse.fixedFeeQuantitySchedule
            defaultInvoiceMemo = subscriptionUpdateFixedFeeQuantityResponse.defaultInvoiceMemo
            autoCollection = subscriptionUpdateFixedFeeQuantityResponse.autoCollection
            netTerms = subscriptionUpdateFixedFeeQuantityResponse.netTerms
            redeemedCoupon = subscriptionUpdateFixedFeeQuantityResponse.redeemedCoupon
            billingCycleDay = subscriptionUpdateFixedFeeQuantityResponse.billingCycleDay
            billingCycleAnchorConfiguration =
                subscriptionUpdateFixedFeeQuantityResponse.billingCycleAnchorConfiguration
            invoicingThreshold = subscriptionUpdateFixedFeeQuantityResponse.invoicingThreshold
            priceIntervals = subscriptionUpdateFixedFeeQuantityResponse.priceIntervals
            adjustmentIntervals = subscriptionUpdateFixedFeeQuantityResponse.adjustmentIntervals
            discountIntervals = subscriptionUpdateFixedFeeQuantityResponse.discountIntervals
            minimumIntervals = subscriptionUpdateFixedFeeQuantityResponse.minimumIntervals
            maximumIntervals = subscriptionUpdateFixedFeeQuantityResponse.maximumIntervals
            additionalProperties =
                subscriptionUpdateFixedFeeQuantityResponse.additionalProperties.toMutableMap()
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

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * A customer is a buyer of your products, and the other party to the billing relationship.
         *
         * In Orb, customers are assigned system generated identifiers automatically, but it's often
         * desirable to have these match existing identifiers in your system. To avoid having to
         * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
         * identifier. See [Customer ID Aliases](../guides/events-and-metrics/customer-aliases) for
         * further information about how these aliases work in Orb.
         *
         * In addition to having an identifier in your system, a customer may exist in a payment
         * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider`
         * enum field to express this mapping.
         *
         * A customer also has a timezone (from the standard
         * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your
         * account's timezone. See [Timezone localization](../guides/product-catalog/timezones.md)
         * for information on what this timezone parameter influences within Orb.
         */
        fun customer(customer: Customer) = customer(JsonField.of(customer))

        /**
         * A customer is a buyer of your products, and the other party to the billing relationship.
         *
         * In Orb, customers are assigned system generated identifiers automatically, but it's often
         * desirable to have these match existing identifiers in your system. To avoid having to
         * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
         * identifier. See [Customer ID Aliases](../guides/events-and-metrics/customer-aliases) for
         * further information about how these aliases work in Orb.
         *
         * In addition to having an identifier in your system, a customer may exist in a payment
         * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider`
         * enum field to express this mapping.
         *
         * A customer also has a timezone (from the standard
         * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your
         * account's timezone. See [Timezone localization](../guides/product-catalog/timezones.md)
         * for information on what this timezone parameter influences within Orb.
         */
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /**
         * The [Plan](../guides/core-concepts.mdx#plan-and-price) resource represents a plan that
         * can be subscribed to by a customer. Plans define the billing behavior of the
         * subscription. You can see more about how to configure prices in the
         * [Price resource](/reference/price).
         */
        fun plan(plan: Plan) = plan(JsonField.of(plan))

        /**
         * The [Plan](../guides/core-concepts.mdx#plan-and-price) resource represents a plan that
         * can be subscribed to by a customer. Plans define the billing behavior of the
         * subscription. You can see more about how to configure prices in the
         * [Price resource](/reference/price).
         */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** The date Orb starts billing for this subscription. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /** The date Orb starts billing for this subscription. */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        /** The date Orb stops billing for this subscription. */
        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        /** The date Orb stops billing for this subscription. */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if the subscription
         * is not currently active.
         */
        fun currentBillingPeriodStartDate(currentBillingPeriodStartDate: OffsetDateTime) =
            currentBillingPeriodStartDate(JsonField.of(currentBillingPeriodStartDate))

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if the subscription
         * is not currently active.
         */
        fun currentBillingPeriodStartDate(
            currentBillingPeriodStartDate: JsonField<OffsetDateTime>
        ) = apply { this.currentBillingPeriodStartDate = currentBillingPeriodStartDate }

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is not part of the billing period. Set to null for subscriptions that
         * are not currently active.
         */
        fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: OffsetDateTime) =
            currentBillingPeriodEndDate(JsonField.of(currentBillingPeriodEndDate))

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is not part of the billing period. Set to null for subscriptions that
         * are not currently active.
         */
        fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: JsonField<OffsetDateTime>) =
            apply {
                this.currentBillingPeriodEndDate = currentBillingPeriodEndDate
            }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun trialInfo(trialInfo: TrialInfo) = trialInfo(JsonField.of(trialInfo))

        fun trialInfo(trialInfo: JsonField<TrialInfo>) = apply { this.trialInfo = trialInfo }

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        fun activePlanPhaseOrder(activePlanPhaseOrder: Long) =
            activePlanPhaseOrder(JsonField.of(activePlanPhaseOrder))

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        fun activePlanPhaseOrder(activePlanPhaseOrder: JsonField<Long>) = apply {
            this.activePlanPhaseOrder = activePlanPhaseOrder
        }

        fun fixedFeeQuantitySchedule(fixedFeeQuantitySchedule: List<FixedFeeQuantitySchedule>) =
            fixedFeeQuantitySchedule(JsonField.of(fixedFeeQuantitySchedule))

        fun fixedFeeQuantitySchedule(
            fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>>
        ) = apply { this.fixedFeeQuantitySchedule = fixedFeeQuantitySchedule }

        /**
         * Determines the default memo on this subscriptions' invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String) =
            defaultInvoiceMemo(JsonField.of(defaultInvoiceMemo))

        /**
         * Determines the default memo on this subscriptions' invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: JsonField<String>) = apply {
            this.defaultInvoiceMemo = defaultInvoiceMemo
        }

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior. If null, defaults to the customer's setting.
         */
        fun autoCollection(autoCollection: Boolean) = autoCollection(JsonField.of(autoCollection))

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. This property defaults to the plan's
         * behavior. If null, defaults to the customer's setting.
         */
        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            this.autoCollection = autoCollection
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

        fun redeemedCoupon(redeemedCoupon: RedeemedCoupon) =
            redeemedCoupon(JsonField.of(redeemedCoupon))

        fun redeemedCoupon(redeemedCoupon: JsonField<RedeemedCoupon>) = apply {
            this.redeemedCoupon = redeemedCoupon
        }

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

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration
        ) = billingCycleAnchorConfiguration(JsonField.of(billingCycleAnchorConfiguration))

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>
        ) = apply { this.billingCycleAnchorConfiguration = billingCycleAnchorConfiguration }

        fun invoicingThreshold(invoicingThreshold: String) =
            invoicingThreshold(JsonField.of(invoicingThreshold))

        fun invoicingThreshold(invoicingThreshold: JsonField<String>) = apply {
            this.invoicingThreshold = invoicingThreshold
        }

        /** The price intervals for this subscription. */
        fun priceIntervals(priceIntervals: List<PriceInterval>) =
            priceIntervals(JsonField.of(priceIntervals))

        /** The price intervals for this subscription. */
        fun priceIntervals(priceIntervals: JsonField<List<PriceInterval>>) = apply {
            this.priceIntervals = priceIntervals
        }

        /** The adjustment intervals for this subscription. */
        fun adjustmentIntervals(adjustmentIntervals: List<AdjustmentInterval>) =
            adjustmentIntervals(JsonField.of(adjustmentIntervals))

        /** The adjustment intervals for this subscription. */
        fun adjustmentIntervals(adjustmentIntervals: JsonField<List<AdjustmentInterval>>) = apply {
            this.adjustmentIntervals = adjustmentIntervals
        }

        /** The discount intervals for this subscription. */
        fun discountIntervals(discountIntervals: List<DiscountInterval>) =
            discountIntervals(JsonField.of(discountIntervals))

        /** The discount intervals for this subscription. */
        fun discountIntervals(discountIntervals: JsonField<List<DiscountInterval>>) = apply {
            this.discountIntervals = discountIntervals
        }

        /** The minimum intervals for this subscription. */
        fun minimumIntervals(minimumIntervals: List<MinimumInterval>) =
            minimumIntervals(JsonField.of(minimumIntervals))

        /** The minimum intervals for this subscription. */
        fun minimumIntervals(minimumIntervals: JsonField<List<MinimumInterval>>) = apply {
            this.minimumIntervals = minimumIntervals
        }

        /** The maximum intervals for this subscription. */
        fun maximumIntervals(maximumIntervals: List<MaximumInterval>) =
            maximumIntervals(JsonField.of(maximumIntervals))

        /** The maximum intervals for this subscription. */
        fun maximumIntervals(maximumIntervals: JsonField<List<MaximumInterval>>) = apply {
            this.maximumIntervals = maximumIntervals
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

        fun build(): SubscriptionUpdateFixedFeeQuantityResponse =
            SubscriptionUpdateFixedFeeQuantityResponse(
                metadata,
                id,
                customer,
                plan,
                startDate,
                endDate,
                createdAt,
                currentBillingPeriodStartDate,
                currentBillingPeriodEndDate,
                status,
                trialInfo,
                activePlanPhaseOrder,
                fixedFeeQuantitySchedule.map { it.toImmutable() },
                defaultInvoiceMemo,
                autoCollection,
                netTerms,
                redeemedCoupon,
                billingCycleDay,
                billingCycleAnchorConfiguration,
                invoicingThreshold,
                priceIntervals.map { it.toImmutable() },
                adjustmentIntervals.map { it.toImmutable() },
                discountIntervals.map { it.toImmutable() },
                minimumIntervals.map { it.toImmutable() },
                maximumIntervals.map { it.toImmutable() },
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
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

        /** The start date of the adjustment interval. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /** The end date of the adjustment interval. */
        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        /** The price interval IDs that this adjustment applies to. */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("adjustment") @ExcludeMissing fun _adjustment() = adjustment

        /** The start date of the adjustment interval. */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        /** The end date of the adjustment interval. */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        /** The price interval IDs that this adjustment applies to. */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds() = appliesToPriceIntervalIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AdjustmentInterval = apply {
            if (!validated) {
                id()
                adjustment()
                startDate()
                endDate()
                appliesToPriceIntervalIds()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var adjustment: JsonField<Adjustment> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(adjustmentInterval: AdjustmentInterval) = apply {
                id = adjustmentInterval.id
                adjustment = adjustmentInterval.adjustment
                startDate = adjustmentInterval.startDate
                endDate = adjustmentInterval.endDate
                appliesToPriceIntervalIds = adjustmentInterval.appliesToPriceIntervalIds
                additionalProperties = adjustmentInterval.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun adjustment(adjustment: Adjustment) = adjustment(JsonField.of(adjustment))

            fun adjustment(adjustment: JsonField<Adjustment>) = apply {
                this.adjustment = adjustment
            }

            /** The start date of the adjustment interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the adjustment interval. */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** The end date of the adjustment interval. */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /** The end date of the adjustment interval. */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The price interval IDs that this adjustment applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /** The price interval IDs that this adjustment applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds = appliesToPriceIntervalIds
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
                    id,
                    adjustment,
                    startDate,
                    endDate,
                    appliesToPriceIntervalIds.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val amountDiscountAdjustment: AmountDiscountAdjustment? = null,
            private val percentageDiscountAdjustment: PercentageDiscountAdjustment? = null,
            private val usageDiscountAdjustment: UsageDiscountAdjustment? = null,
            private val minimumAdjustment: MinimumAdjustment? = null,
            private val maximumAdjustment: MaximumAdjustment? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun amountDiscountAdjustment(): Optional<AmountDiscountAdjustment> =
                Optional.ofNullable(amountDiscountAdjustment)

            fun percentageDiscountAdjustment(): Optional<PercentageDiscountAdjustment> =
                Optional.ofNullable(percentageDiscountAdjustment)

            fun usageDiscountAdjustment(): Optional<UsageDiscountAdjustment> =
                Optional.ofNullable(usageDiscountAdjustment)

            fun minimumAdjustment(): Optional<MinimumAdjustment> =
                Optional.ofNullable(minimumAdjustment)

            fun maximumAdjustment(): Optional<MaximumAdjustment> =
                Optional.ofNullable(maximumAdjustment)

            fun isAmountDiscountAdjustment(): Boolean = amountDiscountAdjustment != null

            fun isPercentageDiscountAdjustment(): Boolean = percentageDiscountAdjustment != null

            fun isUsageDiscountAdjustment(): Boolean = usageDiscountAdjustment != null

            fun isMinimumAdjustment(): Boolean = minimumAdjustment != null

            fun isMaximumAdjustment(): Boolean = maximumAdjustment != null

            fun asAmountDiscountAdjustment(): AmountDiscountAdjustment =
                amountDiscountAdjustment.getOrThrow("amountDiscountAdjustment")

            fun asPercentageDiscountAdjustment(): PercentageDiscountAdjustment =
                percentageDiscountAdjustment.getOrThrow("percentageDiscountAdjustment")

            fun asUsageDiscountAdjustment(): UsageDiscountAdjustment =
                usageDiscountAdjustment.getOrThrow("usageDiscountAdjustment")

            fun asMinimumAdjustment(): MinimumAdjustment =
                minimumAdjustment.getOrThrow("minimumAdjustment")

            fun asMaximumAdjustment(): MaximumAdjustment =
                maximumAdjustment.getOrThrow("maximumAdjustment")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    amountDiscountAdjustment != null ->
                        visitor.visitAmountDiscountAdjustment(amountDiscountAdjustment)
                    percentageDiscountAdjustment != null ->
                        visitor.visitPercentageDiscountAdjustment(percentageDiscountAdjustment)
                    usageDiscountAdjustment != null ->
                        visitor.visitUsageDiscountAdjustment(usageDiscountAdjustment)
                    minimumAdjustment != null -> visitor.visitMinimumAdjustment(minimumAdjustment)
                    maximumAdjustment != null -> visitor.visitMaximumAdjustment(maximumAdjustment)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Adjustment = apply {
                if (!validated) {
                    if (
                        amountDiscountAdjustment == null &&
                            percentageDiscountAdjustment == null &&
                            usageDiscountAdjustment == null &&
                            minimumAdjustment == null &&
                            maximumAdjustment == null
                    ) {
                        throw OrbInvalidDataException("Unknown Adjustment: $_json")
                    }
                    amountDiscountAdjustment?.validate()
                    percentageDiscountAdjustment?.validate()
                    usageDiscountAdjustment?.validate()
                    minimumAdjustment?.validate()
                    maximumAdjustment?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Adjustment && amountDiscountAdjustment == other.amountDiscountAdjustment && percentageDiscountAdjustment == other.percentageDiscountAdjustment && usageDiscountAdjustment == other.usageDiscountAdjustment && minimumAdjustment == other.minimumAdjustment && maximumAdjustment == other.maximumAdjustment /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(amountDiscountAdjustment, percentageDiscountAdjustment, usageDiscountAdjustment, minimumAdjustment, maximumAdjustment) /* spotless:on */

            override fun toString(): String =
                when {
                    amountDiscountAdjustment != null ->
                        "Adjustment{amountDiscountAdjustment=$amountDiscountAdjustment}"
                    percentageDiscountAdjustment != null ->
                        "Adjustment{percentageDiscountAdjustment=$percentageDiscountAdjustment}"
                    usageDiscountAdjustment != null ->
                        "Adjustment{usageDiscountAdjustment=$usageDiscountAdjustment}"
                    minimumAdjustment != null -> "Adjustment{minimumAdjustment=$minimumAdjustment}"
                    maximumAdjustment != null -> "Adjustment{maximumAdjustment=$maximumAdjustment}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                @JvmStatic
                fun ofAmountDiscountAdjustment(amountDiscountAdjustment: AmountDiscountAdjustment) =
                    Adjustment(amountDiscountAdjustment = amountDiscountAdjustment)

                @JvmStatic
                fun ofPercentageDiscountAdjustment(
                    percentageDiscountAdjustment: PercentageDiscountAdjustment
                ) = Adjustment(percentageDiscountAdjustment = percentageDiscountAdjustment)

                @JvmStatic
                fun ofUsageDiscountAdjustment(usageDiscountAdjustment: UsageDiscountAdjustment) =
                    Adjustment(usageDiscountAdjustment = usageDiscountAdjustment)

                @JvmStatic
                fun ofMinimumAdjustment(minimumAdjustment: MinimumAdjustment) =
                    Adjustment(minimumAdjustment = minimumAdjustment)

                @JvmStatic
                fun ofMaximumAdjustment(maximumAdjustment: MaximumAdjustment) =
                    Adjustment(maximumAdjustment = maximumAdjustment)
            }

            interface Visitor<out T> {

                fun visitAmountDiscountAdjustment(
                    amountDiscountAdjustment: AmountDiscountAdjustment
                ): T

                fun visitPercentageDiscountAdjustment(
                    percentageDiscountAdjustment: PercentageDiscountAdjustment
                ): T

                fun visitUsageDiscountAdjustment(
                    usageDiscountAdjustment: UsageDiscountAdjustment
                ): T

                fun visitMinimumAdjustment(minimumAdjustment: MinimumAdjustment): T

                fun visitMaximumAdjustment(maximumAdjustment: MaximumAdjustment): T

                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Adjustment: $json")
                }
            }

            class Deserializer : BaseDeserializer<Adjustment>(Adjustment::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Adjustment {
                    val json = JsonValue.fromJsonNode(node)
                    val adjustmentType =
                        json.asObject().getOrNull()?.get("adjustment_type")?.asString()?.getOrNull()

                    when (adjustmentType) {
                        "amount_discount" -> {
                            tryDeserialize(node, jacksonTypeRef<AmountDiscountAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(amountDiscountAdjustment = it, _json = json)
                                }
                        }
                        "percentage_discount" -> {
                            tryDeserialize(node, jacksonTypeRef<PercentageDiscountAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(
                                        percentageDiscountAdjustment = it,
                                        _json = json
                                    )
                                }
                        }
                        "usage_discount" -> {
                            tryDeserialize(node, jacksonTypeRef<UsageDiscountAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(usageDiscountAdjustment = it, _json = json)
                                }
                        }
                        "minimum" -> {
                            tryDeserialize(node, jacksonTypeRef<MinimumAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(minimumAdjustment = it, _json = json)
                                }
                        }
                        "maximum" -> {
                            tryDeserialize(node, jacksonTypeRef<MaximumAdjustment>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Adjustment(maximumAdjustment = it, _json = json)
                                }
                        }
                    }

                    return Adjustment(_json = json)
                }
            }

            class Serializer : BaseSerializer<Adjustment>(Adjustment::class) {

                override fun serialize(
                    value: Adjustment,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.amountDiscountAdjustment != null ->
                            generator.writeObject(value.amountDiscountAdjustment)
                        value.percentageDiscountAdjustment != null ->
                            generator.writeObject(value.percentageDiscountAdjustment)
                        value.usageDiscountAdjustment != null ->
                            generator.writeObject(value.usageDiscountAdjustment)
                        value.minimumAdjustment != null ->
                            generator.writeObject(value.minimumAdjustment)
                        value.maximumAdjustment != null ->
                            generator.writeObject(value.maximumAdjustment)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }

            @NoAutoDetect
            class AmountDiscountAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("amount_discount")
                @ExcludeMissing
                private val amountDiscount: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel() = isInvoiceLevel

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder() = planPhaseOrder

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType() = adjustmentType

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount() = amountDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): AmountDiscountAdjustment = apply {
                    if (!validated) {
                        id()
                        isInvoiceLevel()
                        planPhaseOrder()
                        appliesToPriceIds()
                        reason()
                        adjustmentType()
                        amountDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
                    private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var adjustmentType: JsonField<AdjustmentType> = JsonMissing.of()
                    private var amountDiscount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(amountDiscountAdjustment: AmountDiscountAdjustment) = apply {
                        id = amountDiscountAdjustment.id
                        isInvoiceLevel = amountDiscountAdjustment.isInvoiceLevel
                        planPhaseOrder = amountDiscountAdjustment.planPhaseOrder
                        appliesToPriceIds = amountDiscountAdjustment.appliesToPriceIds
                        reason = amountDiscountAdjustment.reason
                        adjustmentType = amountDiscountAdjustment.adjustmentType
                        amountDiscount = amountDiscountAdjustment.amountDiscount
                        additionalProperties =
                            amountDiscountAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

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
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(JsonField.of(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String) = reason(JsonField.of(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

                    fun build(): AmountDiscountAdjustment =
                        AmountDiscountAdjustment(
                            id,
                            isInvoiceLevel,
                            planPhaseOrder,
                            appliesToPriceIds.map { it.toImmutable() },
                            reason,
                            adjustmentType,
                            amountDiscount,
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val AMOUNT_DISCOUNT = of("amount_discount")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    enum class Known {
                        AMOUNT_DISCOUNT,
                    }

                    enum class Value {
                        AMOUNT_DISCOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            AMOUNT_DISCOUNT -> Value.AMOUNT_DISCOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            AMOUNT_DISCOUNT -> Known.AMOUNT_DISCOUNT
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is AmountDiscountAdjustment && id == other.id && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && appliesToPriceIds == other.appliesToPriceIds && reason == other.reason && adjustmentType == other.adjustmentType && amountDiscount == other.amountDiscount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, isInvoiceLevel, planPhaseOrder, appliesToPriceIds, reason, adjustmentType, amountDiscount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AmountDiscountAdjustment{id=$id, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, appliesToPriceIds=$appliesToPriceIds, reason=$reason, adjustmentType=$adjustmentType, amountDiscount=$amountDiscount, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PercentageDiscountAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                fun percentageDiscount(): Double =
                    percentageDiscount.getRequired("percentage_discount")

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel() = isInvoiceLevel

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder() = planPhaseOrder

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType() = adjustmentType

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount() = percentageDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PercentageDiscountAdjustment = apply {
                    if (!validated) {
                        id()
                        isInvoiceLevel()
                        planPhaseOrder()
                        appliesToPriceIds()
                        reason()
                        adjustmentType()
                        percentageDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
                    private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var adjustmentType: JsonField<AdjustmentType> = JsonMissing.of()
                    private var percentageDiscount: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(percentageDiscountAdjustment: PercentageDiscountAdjustment) =
                        apply {
                            id = percentageDiscountAdjustment.id
                            isInvoiceLevel = percentageDiscountAdjustment.isInvoiceLevel
                            planPhaseOrder = percentageDiscountAdjustment.planPhaseOrder
                            appliesToPriceIds = percentageDiscountAdjustment.appliesToPriceIds
                            reason = percentageDiscountAdjustment.reason
                            adjustmentType = percentageDiscountAdjustment.adjustmentType
                            percentageDiscount = percentageDiscountAdjustment.percentageDiscount
                            additionalProperties =
                                percentageDiscountAdjustment.additionalProperties.toMutableMap()
                        }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

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
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(JsonField.of(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String) = reason(JsonField.of(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
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

                    fun build(): PercentageDiscountAdjustment =
                        PercentageDiscountAdjustment(
                            id,
                            isInvoiceLevel,
                            planPhaseOrder,
                            appliesToPriceIds.map { it.toImmutable() },
                            reason,
                            adjustmentType,
                            percentageDiscount,
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val PERCENTAGE_DISCOUNT = of("percentage_discount")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    enum class Known {
                        PERCENTAGE_DISCOUNT,
                    }

                    enum class Value {
                        PERCENTAGE_DISCOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PERCENTAGE_DISCOUNT -> Value.PERCENTAGE_DISCOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PERCENTAGE_DISCOUNT -> Known.PERCENTAGE_DISCOUNT
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is PercentageDiscountAdjustment && id == other.id && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && appliesToPriceIds == other.appliesToPriceIds && reason == other.reason && adjustmentType == other.adjustmentType && percentageDiscount == other.percentageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, isInvoiceLevel, planPhaseOrder, appliesToPriceIds, reason, adjustmentType, percentageDiscount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PercentageDiscountAdjustment{id=$id, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, appliesToPriceIds=$appliesToPriceIds, reason=$reason, adjustmentType=$adjustmentType, percentageDiscount=$percentageDiscount, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class UsageDiscountAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("usage_discount")
                @ExcludeMissing
                private val usageDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel() = isInvoiceLevel

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder() = planPhaseOrder

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType() = adjustmentType

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): UsageDiscountAdjustment = apply {
                    if (!validated) {
                        id()
                        isInvoiceLevel()
                        planPhaseOrder()
                        appliesToPriceIds()
                        reason()
                        adjustmentType()
                        usageDiscount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
                    private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var adjustmentType: JsonField<AdjustmentType> = JsonMissing.of()
                    private var usageDiscount: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(usageDiscountAdjustment: UsageDiscountAdjustment) = apply {
                        id = usageDiscountAdjustment.id
                        isInvoiceLevel = usageDiscountAdjustment.isInvoiceLevel
                        planPhaseOrder = usageDiscountAdjustment.planPhaseOrder
                        appliesToPriceIds = usageDiscountAdjustment.appliesToPriceIds
                        reason = usageDiscountAdjustment.reason
                        adjustmentType = usageDiscountAdjustment.adjustmentType
                        usageDiscount = usageDiscountAdjustment.usageDiscount
                        additionalProperties =
                            usageDiscountAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

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
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(JsonField.of(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String) = reason(JsonField.of(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

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

                    fun build(): UsageDiscountAdjustment =
                        UsageDiscountAdjustment(
                            id,
                            isInvoiceLevel,
                            planPhaseOrder,
                            appliesToPriceIds.map { it.toImmutable() },
                            reason,
                            adjustmentType,
                            usageDiscount,
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val USAGE_DISCOUNT = of("usage_discount")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    enum class Known {
                        USAGE_DISCOUNT,
                    }

                    enum class Value {
                        USAGE_DISCOUNT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            USAGE_DISCOUNT -> Value.USAGE_DISCOUNT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            USAGE_DISCOUNT -> Known.USAGE_DISCOUNT
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is UsageDiscountAdjustment && id == other.id && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && appliesToPriceIds == other.appliesToPriceIds && reason == other.reason && adjustmentType == other.adjustmentType && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, isInvoiceLevel, planPhaseOrder, appliesToPriceIds, reason, adjustmentType, usageDiscount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UsageDiscountAdjustment{id=$id, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, appliesToPriceIds=$appliesToPriceIds, reason=$reason, adjustmentType=$adjustmentType, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class MinimumAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                private val minimumAmount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("item_id")
                @ExcludeMissing
                private val itemId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                /** The item ID that revenue from this minimum will be attributed to. */
                fun itemId(): String = itemId.getRequired("item_id")

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel() = isInvoiceLevel

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder() = planPhaseOrder

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType() = adjustmentType

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

                /** The item ID that revenue from this minimum will be attributed to. */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId() = itemId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MinimumAdjustment = apply {
                    if (!validated) {
                        id()
                        isInvoiceLevel()
                        planPhaseOrder()
                        appliesToPriceIds()
                        reason()
                        adjustmentType()
                        minimumAmount()
                        itemId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
                    private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var adjustmentType: JsonField<AdjustmentType> = JsonMissing.of()
                    private var minimumAmount: JsonField<String> = JsonMissing.of()
                    private var itemId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(minimumAdjustment: MinimumAdjustment) = apply {
                        id = minimumAdjustment.id
                        isInvoiceLevel = minimumAdjustment.isInvoiceLevel
                        planPhaseOrder = minimumAdjustment.planPhaseOrder
                        appliesToPriceIds = minimumAdjustment.appliesToPriceIds
                        reason = minimumAdjustment.reason
                        adjustmentType = minimumAdjustment.adjustmentType
                        minimumAmount = minimumAdjustment.minimumAmount
                        itemId = minimumAdjustment.itemId
                        additionalProperties = minimumAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

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
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(JsonField.of(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String) = reason(JsonField.of(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
                    }

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

                    /** The item ID that revenue from this minimum will be attributed to. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /** The item ID that revenue from this minimum will be attributed to. */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

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

                    fun build(): MinimumAdjustment =
                        MinimumAdjustment(
                            id,
                            isInvoiceLevel,
                            planPhaseOrder,
                            appliesToPriceIds.map { it.toImmutable() },
                            reason,
                            adjustmentType,
                            minimumAmount,
                            itemId,
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val MINIMUM = of("minimum")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    enum class Known {
                        MINIMUM,
                    }

                    enum class Value {
                        MINIMUM,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MINIMUM -> Value.MINIMUM
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MINIMUM -> Known.MINIMUM
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is MinimumAdjustment && id == other.id && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && appliesToPriceIds == other.appliesToPriceIds && reason == other.reason && adjustmentType == other.adjustmentType && minimumAmount == other.minimumAmount && itemId == other.itemId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, isInvoiceLevel, planPhaseOrder, appliesToPriceIds, reason, adjustmentType, minimumAmount, itemId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MinimumAdjustment{id=$id, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, appliesToPriceIds=$appliesToPriceIds, reason=$reason, adjustmentType=$adjustmentType, minimumAmount=$minimumAmount, itemId=$itemId, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class MaximumAdjustment
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                private val isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                private val planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                private val reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                private val adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                private val maximumAmount: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /** The plan phase in which this adjustment is active. */
                fun planPhaseOrder(): Optional<Long> =
                    Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

                /** The price IDs that this adjustment applies to. */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /** The reason for the adjustment. */
                fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

                fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel() = isInvoiceLevel

                /** The plan phase in which this adjustment is active. */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder() = planPhaseOrder

                /** The price IDs that this adjustment applies to. */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds() = appliesToPriceIds

                /** The reason for the adjustment. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType() = adjustmentType

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 */
                @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MaximumAdjustment = apply {
                    if (!validated) {
                        id()
                        isInvoiceLevel()
                        planPhaseOrder()
                        appliesToPriceIds()
                        reason()
                        adjustmentType()
                        maximumAmount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var isInvoiceLevel: JsonField<Boolean> = JsonMissing.of()
                    private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
                    private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                    private var reason: JsonField<String> = JsonMissing.of()
                    private var adjustmentType: JsonField<AdjustmentType> = JsonMissing.of()
                    private var maximumAmount: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(maximumAdjustment: MaximumAdjustment) = apply {
                        id = maximumAdjustment.id
                        isInvoiceLevel = maximumAdjustment.isInvoiceLevel
                        planPhaseOrder = maximumAdjustment.planPhaseOrder
                        appliesToPriceIds = maximumAdjustment.appliesToPriceIds
                        reason = maximumAdjustment.reason
                        adjustmentType = maximumAdjustment.adjustmentType
                        maximumAmount = maximumAdjustment.maximumAmount
                        additionalProperties = maximumAdjustment.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

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
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(JsonField.of(planPhaseOrder))

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String) = reason(JsonField.of(reason))

                    /** The reason for the adjustment. */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    fun adjustmentType(adjustmentType: AdjustmentType) =
                        adjustmentType(JsonField.of(adjustmentType))

                    fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                        this.adjustmentType = adjustmentType
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

                    fun build(): MaximumAdjustment =
                        MaximumAdjustment(
                            id,
                            isInvoiceLevel,
                            planPhaseOrder,
                            appliesToPriceIds.map { it.toImmutable() },
                            reason,
                            adjustmentType,
                            maximumAmount,
                            additionalProperties.toImmutable(),
                        )
                }

                class AdjustmentType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val MAXIMUM = of("maximum")

                        @JvmStatic fun of(value: String) = AdjustmentType(JsonField.of(value))
                    }

                    enum class Known {
                        MAXIMUM,
                    }

                    enum class Value {
                        MAXIMUM,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MAXIMUM -> Value.MAXIMUM
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MAXIMUM -> Known.MAXIMUM
                            else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

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

                    return /* spotless:off */ other is MaximumAdjustment && id == other.id && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && appliesToPriceIds == other.appliesToPriceIds && reason == other.reason && adjustmentType == other.adjustmentType && maximumAmount == other.maximumAmount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, isInvoiceLevel, planPhaseOrder, appliesToPriceIds, reason, adjustmentType, maximumAmount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MaximumAdjustment{id=$id, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, appliesToPriceIds=$appliesToPriceIds, reason=$reason, adjustmentType=$adjustmentType, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AdjustmentInterval && id == other.id && adjustment == other.adjustment && startDate == other.startDate && endDate == other.endDate && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, adjustment, startDate, endDate, appliesToPriceIntervalIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AdjustmentInterval{id=$id, adjustment=$adjustment, startDate=$startDate, endDate=$endDate, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, additionalProperties=$additionalProperties}"
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
        @JsonProperty("day") @ExcludeMissing fun _day() = day

        /**
         * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
         * February would have cycles starting February, May, August, and November).
         */
        @JsonProperty("month") @ExcludeMissing fun _month() = month

        /**
         * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on
         * 2021 would have cycles starting on 2021, 2023, 2025, etc.).
         */
        @JsonProperty("year") @ExcludeMissing fun _year() = year

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BillingCycleAnchorConfiguration = apply {
            if (!validated) {
                day()
                month()
                year()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var day: JsonField<Long> = JsonMissing.of()
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
            fun month(month: Long) = month(JsonField.of(month))

            /**
             * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
             * February would have cycles starting February, May, August, and November).
             */
            fun month(month: JsonField<Long>) = apply { this.month = month }

            /**
             * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored
             * on 2021 would have cycles starting on 2021, 2023, 2025, etc.).
             */
            fun year(year: Long) = year(JsonField.of(year))

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
                    day,
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
        private val amountDiscountInterval: AmountDiscountInterval? = null,
        private val percentageDiscountInterval: PercentageDiscountInterval? = null,
        private val usageDiscountInterval: UsageDiscountInterval? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun amountDiscountInterval(): Optional<AmountDiscountInterval> =
            Optional.ofNullable(amountDiscountInterval)

        fun percentageDiscountInterval(): Optional<PercentageDiscountInterval> =
            Optional.ofNullable(percentageDiscountInterval)

        fun usageDiscountInterval(): Optional<UsageDiscountInterval> =
            Optional.ofNullable(usageDiscountInterval)

        fun isAmountDiscountInterval(): Boolean = amountDiscountInterval != null

        fun isPercentageDiscountInterval(): Boolean = percentageDiscountInterval != null

        fun isUsageDiscountInterval(): Boolean = usageDiscountInterval != null

        fun asAmountDiscountInterval(): AmountDiscountInterval =
            amountDiscountInterval.getOrThrow("amountDiscountInterval")

        fun asPercentageDiscountInterval(): PercentageDiscountInterval =
            percentageDiscountInterval.getOrThrow("percentageDiscountInterval")

        fun asUsageDiscountInterval(): UsageDiscountInterval =
            usageDiscountInterval.getOrThrow("usageDiscountInterval")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                amountDiscountInterval != null ->
                    visitor.visitAmountDiscountInterval(amountDiscountInterval)
                percentageDiscountInterval != null ->
                    visitor.visitPercentageDiscountInterval(percentageDiscountInterval)
                usageDiscountInterval != null ->
                    visitor.visitUsageDiscountInterval(usageDiscountInterval)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): DiscountInterval = apply {
            if (!validated) {
                if (
                    amountDiscountInterval == null &&
                        percentageDiscountInterval == null &&
                        usageDiscountInterval == null
                ) {
                    throw OrbInvalidDataException("Unknown DiscountInterval: $_json")
                }
                amountDiscountInterval?.validate()
                percentageDiscountInterval?.validate()
                usageDiscountInterval?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DiscountInterval && amountDiscountInterval == other.amountDiscountInterval && percentageDiscountInterval == other.percentageDiscountInterval && usageDiscountInterval == other.usageDiscountInterval /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(amountDiscountInterval, percentageDiscountInterval, usageDiscountInterval) /* spotless:on */

        override fun toString(): String =
            when {
                amountDiscountInterval != null ->
                    "DiscountInterval{amountDiscountInterval=$amountDiscountInterval}"
                percentageDiscountInterval != null ->
                    "DiscountInterval{percentageDiscountInterval=$percentageDiscountInterval}"
                usageDiscountInterval != null ->
                    "DiscountInterval{usageDiscountInterval=$usageDiscountInterval}"
                _json != null -> "DiscountInterval{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid DiscountInterval")
            }

        companion object {

            @JvmStatic
            fun ofAmountDiscountInterval(amountDiscountInterval: AmountDiscountInterval) =
                DiscountInterval(amountDiscountInterval = amountDiscountInterval)

            @JvmStatic
            fun ofPercentageDiscountInterval(
                percentageDiscountInterval: PercentageDiscountInterval
            ) = DiscountInterval(percentageDiscountInterval = percentageDiscountInterval)

            @JvmStatic
            fun ofUsageDiscountInterval(usageDiscountInterval: UsageDiscountInterval) =
                DiscountInterval(usageDiscountInterval = usageDiscountInterval)
        }

        interface Visitor<out T> {

            fun visitAmountDiscountInterval(amountDiscountInterval: AmountDiscountInterval): T

            fun visitPercentageDiscountInterval(
                percentageDiscountInterval: PercentageDiscountInterval
            ): T

            fun visitUsageDiscountInterval(usageDiscountInterval: UsageDiscountInterval): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown DiscountInterval: $json")
            }
        }

        class Deserializer : BaseDeserializer<DiscountInterval>(DiscountInterval::class) {

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
                                return DiscountInterval(amountDiscountInterval = it, _json = json)
                            }
                    }
                    "percentage" -> {
                        tryDeserialize(node, jacksonTypeRef<PercentageDiscountInterval>()) {
                                it.validate()
                            }
                            ?.let {
                                return DiscountInterval(
                                    percentageDiscountInterval = it,
                                    _json = json
                                )
                            }
                    }
                    "usage" -> {
                        tryDeserialize(node, jacksonTypeRef<UsageDiscountInterval>()) {
                                it.validate()
                            }
                            ?.let {
                                return DiscountInterval(usageDiscountInterval = it, _json = json)
                            }
                    }
                }

                return DiscountInterval(_json = json)
            }
        }

        class Serializer : BaseSerializer<DiscountInterval>(DiscountInterval::class) {

            override fun serialize(
                value: DiscountInterval,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.amountDiscountInterval != null ->
                        generator.writeObject(value.amountDiscountInterval)
                    value.percentageDiscountInterval != null ->
                        generator.writeObject(value.percentageDiscountInterval)
                    value.usageDiscountInterval != null ->
                        generator.writeObject(value.usageDiscountInterval)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid DiscountInterval")
                }
            }
        }

        @NoAutoDetect
        class AmountDiscountInterval
        @JsonCreator
        private constructor(
            @JsonProperty("discount_type")
            @ExcludeMissing
            private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("amount_discount")
            @ExcludeMissing
            private val amountDiscount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /** Only available if discount_type is `amount`. */
            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            /** The start date of the discount interval. */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /** The end date of the discount interval. */
            fun endDate(): Optional<OffsetDateTime> =
                Optional.ofNullable(endDate.getNullable("end_date"))

            /** The price ids that this discount interval applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The price interval ids that this discount interval applies to. */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

            /** Only available if discount_type is `amount`. */
            @JsonProperty("amount_discount") @ExcludeMissing fun _amountDiscount() = amountDiscount

            /** The start date of the discount interval. */
            @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

            /** The end date of the discount interval. */
            @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

            /** The price ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            /** The price interval ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds() = appliesToPriceIntervalIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AmountDiscountInterval = apply {
                if (!validated) {
                    discountType()
                    amountDiscount()
                    startDate()
                    endDate()
                    appliesToPriceIds()
                    appliesToPriceIntervalIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var discountType: JsonField<DiscountType> = JsonMissing.of()
                private var amountDiscount: JsonField<String> = JsonMissing.of()
                private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(amountDiscountInterval: AmountDiscountInterval) = apply {
                    discountType = amountDiscountInterval.discountType
                    amountDiscount = amountDiscountInterval.amountDiscount
                    startDate = amountDiscountInterval.startDate
                    endDate = amountDiscountInterval.endDate
                    appliesToPriceIds = amountDiscountInterval.appliesToPriceIds
                    appliesToPriceIntervalIds = amountDiscountInterval.appliesToPriceIntervalIds
                    additionalProperties =
                        amountDiscountInterval.additionalProperties.toMutableMap()
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date of the discount interval. */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

                /** The end date of the discount interval. */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds = appliesToPriceIntervalIds
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
                        discountType,
                        amountDiscount,
                        startDate,
                        endDate,
                        appliesToPriceIds.map { it.toImmutable() },
                        appliesToPriceIntervalIds.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val AMOUNT = of("amount")

                    @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                }

                enum class Known {
                    AMOUNT,
                }

                enum class Value {
                    AMOUNT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        AMOUNT -> Value.AMOUNT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        AMOUNT -> Known.AMOUNT
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

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

                return /* spotless:off */ other is AmountDiscountInterval && discountType == other.discountType && amountDiscount == other.amountDiscount && startDate == other.startDate && endDate == other.endDate && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(discountType, amountDiscount, startDate, endDate, appliesToPriceIds, appliesToPriceIntervalIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AmountDiscountInterval{discountType=$discountType, amountDiscount=$amountDiscount, startDate=$startDate, endDate=$endDate, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PercentageDiscountInterval
        @JsonCreator
        private constructor(
            @JsonProperty("discount_type")
            @ExcludeMissing
            private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /** Only available if discount_type is `percentage`.This is a number between 0 and 1. */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            /** The start date of the discount interval. */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /** The end date of the discount interval. */
            fun endDate(): Optional<OffsetDateTime> =
                Optional.ofNullable(endDate.getNullable("end_date"))

            /** The price ids that this discount interval applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The price interval ids that this discount interval applies to. */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

            /** Only available if discount_type is `percentage`.This is a number between 0 and 1. */
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount() = percentageDiscount

            /** The start date of the discount interval. */
            @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

            /** The end date of the discount interval. */
            @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

            /** The price ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            /** The price interval ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds() = appliesToPriceIntervalIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PercentageDiscountInterval = apply {
                if (!validated) {
                    discountType()
                    percentageDiscount()
                    startDate()
                    endDate()
                    appliesToPriceIds()
                    appliesToPriceIntervalIds()
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
                private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(percentageDiscountInterval: PercentageDiscountInterval) = apply {
                    discountType = percentageDiscountInterval.discountType
                    percentageDiscount = percentageDiscountInterval.percentageDiscount
                    startDate = percentageDiscountInterval.startDate
                    endDate = percentageDiscountInterval.endDate
                    appliesToPriceIds = percentageDiscountInterval.appliesToPriceIds
                    appliesToPriceIntervalIds = percentageDiscountInterval.appliesToPriceIntervalIds
                    additionalProperties =
                        percentageDiscountInterval.additionalProperties.toMutableMap()
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
                }

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

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

                /** The end date of the discount interval. */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds = appliesToPriceIntervalIds
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
                        discountType,
                        percentageDiscount,
                        startDate,
                        endDate,
                        appliesToPriceIds.map { it.toImmutable() },
                        appliesToPriceIntervalIds.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PERCENTAGE = of("percentage")

                    @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                }

                enum class Known {
                    PERCENTAGE,
                }

                enum class Value {
                    PERCENTAGE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PERCENTAGE -> Value.PERCENTAGE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PERCENTAGE -> Known.PERCENTAGE
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

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

                return /* spotless:off */ other is PercentageDiscountInterval && discountType == other.discountType && percentageDiscount == other.percentageDiscount && startDate == other.startDate && endDate == other.endDate && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(discountType, percentageDiscount, startDate, endDate, appliesToPriceIds, appliesToPriceIntervalIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PercentageDiscountInterval{discountType=$discountType, percentageDiscount=$percentageDiscount, startDate=$startDate, endDate=$endDate, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UsageDiscountInterval
        @JsonCreator
        private constructor(
            @JsonProperty("discount_type")
            @ExcludeMissing
            private val discountType: JsonField<DiscountType> = JsonMissing.of(),
            @JsonProperty("usage_discount")
            @ExcludeMissing
            private val usageDiscount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun discountType(): DiscountType = discountType.getRequired("discount_type")

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             */
            fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

            /** The start date of the discount interval. */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /** The end date of the discount interval. */
            fun endDate(): Optional<OffsetDateTime> =
                Optional.ofNullable(endDate.getNullable("end_date"))

            /** The price ids that this discount interval applies to. */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** The price interval ids that this discount interval applies to. */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            @JsonProperty("discount_type") @ExcludeMissing fun _discountType() = discountType

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             */
            @JsonProperty("usage_discount") @ExcludeMissing fun _usageDiscount() = usageDiscount

            /** The start date of the discount interval. */
            @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

            /** The end date of the discount interval. */
            @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

            /** The price ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            /** The price interval ids that this discount interval applies to. */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds() = appliesToPriceIntervalIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UsageDiscountInterval = apply {
                if (!validated) {
                    discountType()
                    usageDiscount()
                    startDate()
                    endDate()
                    appliesToPriceIds()
                    appliesToPriceIntervalIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var discountType: JsonField<DiscountType> = JsonMissing.of()
                private var usageDiscount: JsonField<Double> = JsonMissing.of()
                private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(usageDiscountInterval: UsageDiscountInterval) = apply {
                    discountType = usageDiscountInterval.discountType
                    usageDiscount = usageDiscountInterval.usageDiscount
                    startDate = usageDiscountInterval.startDate
                    endDate = usageDiscountInterval.endDate
                    appliesToPriceIds = usageDiscountInterval.appliesToPriceIds
                    appliesToPriceIntervalIds = usageDiscountInterval.appliesToPriceIntervalIds
                    additionalProperties = usageDiscountInterval.additionalProperties.toMutableMap()
                }

                fun discountType(discountType: DiscountType) =
                    discountType(JsonField.of(discountType))

                fun discountType(discountType: JsonField<DiscountType>) = apply {
                    this.discountType = discountType
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

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date of the discount interval. */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

                /** The end date of the discount interval. */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds = appliesToPriceIntervalIds
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
                        discountType,
                        usageDiscount,
                        startDate,
                        endDate,
                        appliesToPriceIds.map { it.toImmutable() },
                        appliesToPriceIntervalIds.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class DiscountType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val USAGE = of("usage")

                    @JvmStatic fun of(value: String) = DiscountType(JsonField.of(value))
                }

                enum class Known {
                    USAGE,
                }

                enum class Value {
                    USAGE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        USAGE -> Value.USAGE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        USAGE -> Known.USAGE
                        else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

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

                return /* spotless:off */ other is UsageDiscountInterval && discountType == other.discountType && usageDiscount == other.usageDiscount && startDate == other.startDate && endDate == other.endDate && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(discountType, usageDiscount, startDate, endDate, appliesToPriceIds, appliesToPriceIntervalIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsageDiscountInterval{discountType=$discountType, usageDiscount=$usageDiscount, startDate=$startDate, endDate=$endDate, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, additionalProperties=$additionalProperties}"
        }
    }

    @NoAutoDetect
    class FixedFeeQuantitySchedule
    @JsonCreator
    private constructor(
        @JsonProperty("price_id")
        @ExcludeMissing
        private val priceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun priceId(): String = priceId.getRequired("price_id")

        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        fun quantity(): Double = quantity.getRequired("quantity")

        @JsonProperty("price_id") @ExcludeMissing fun _priceId() = priceId

        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): FixedFeeQuantitySchedule = apply {
            if (!validated) {
                priceId()
                startDate()
                endDate()
                quantity()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var priceId: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fixedFeeQuantitySchedule: FixedFeeQuantitySchedule) = apply {
                priceId = fixedFeeQuantitySchedule.priceId
                startDate = fixedFeeQuantitySchedule.startDate
                endDate = fixedFeeQuantitySchedule.endDate
                quantity = fixedFeeQuantitySchedule.quantity
                additionalProperties = fixedFeeQuantitySchedule.additionalProperties.toMutableMap()
            }

            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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
                    priceId,
                    startDate,
                    endDate,
                    quantity,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FixedFeeQuantitySchedule && priceId == other.priceId && startDate == other.startDate && endDate == other.endDate && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(priceId, startDate, endDate, quantity, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FixedFeeQuantitySchedule{priceId=$priceId, startDate=$startDate, endDate=$endDate, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class MaximumInterval
    @JsonCreator
    private constructor(
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The start date of the maximum interval. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /** The end date of the maximum interval. */
        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        /** The price ids that this maximum interval applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** The price interval ids that this maximum interval applies to. */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /**
         * The maximum amount to charge in a given billing period for the price intervals this
         * transform applies to.
         */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /** The start date of the maximum interval. */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        /** The end date of the maximum interval. */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        /** The price ids that this maximum interval applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds() = appliesToPriceIds

        /** The price interval ids that this maximum interval applies to. */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds() = appliesToPriceIntervalIds

        /**
         * The maximum amount to charge in a given billing period for the price intervals this
         * transform applies to.
         */
        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): MaximumInterval = apply {
            if (!validated) {
                startDate()
                endDate()
                appliesToPriceIds()
                appliesToPriceIntervalIds()
                maximumAmount()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
            private var appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(maximumInterval: MaximumInterval) = apply {
                startDate = maximumInterval.startDate
                endDate = maximumInterval.endDate
                appliesToPriceIds = maximumInterval.appliesToPriceIds
                appliesToPriceIntervalIds = maximumInterval.appliesToPriceIntervalIds
                maximumAmount = maximumInterval.maximumAmount
                additionalProperties = maximumInterval.additionalProperties.toMutableMap()
            }

            /** The start date of the maximum interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the maximum interval. */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** The end date of the maximum interval. */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /** The end date of the maximum interval. */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The price ids that this maximum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price ids that this maximum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds
            }

            /** The price interval ids that this maximum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /** The price interval ids that this maximum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds = appliesToPriceIntervalIds
                }

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
                    startDate,
                    endDate,
                    appliesToPriceIds.map { it.toImmutable() },
                    appliesToPriceIntervalIds.map { it.toImmutable() },
                    maximumAmount,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MaximumInterval && startDate == other.startDate && endDate == other.endDate && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && maximumAmount == other.maximumAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(startDate, endDate, appliesToPriceIds, appliesToPriceIntervalIds, maximumAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MaximumInterval{startDate=$startDate, endDate=$endDate, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"
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
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
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
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        private val appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The start date of the minimum interval. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /** The end date of the minimum interval. */
        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        /** The price ids that this minimum interval applies to. */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** The price interval ids that this minimum interval applies to. */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /**
         * The minimum amount to charge in a given billing period for the price intervals this
         * minimum applies to.
         */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /** The start date of the minimum interval. */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        /** The end date of the minimum interval. */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        /** The price ids that this minimum interval applies to. */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds() = appliesToPriceIds

        /** The price interval ids that this minimum interval applies to. */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds() = appliesToPriceIntervalIds

        /**
         * The minimum amount to charge in a given billing period for the price intervals this
         * minimum applies to.
         */
        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): MinimumInterval = apply {
            if (!validated) {
                startDate()
                endDate()
                appliesToPriceIds()
                appliesToPriceIntervalIds()
                minimumAmount()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
            private var appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimumInterval: MinimumInterval) = apply {
                startDate = minimumInterval.startDate
                endDate = minimumInterval.endDate
                appliesToPriceIds = minimumInterval.appliesToPriceIds
                appliesToPriceIntervalIds = minimumInterval.appliesToPriceIntervalIds
                minimumAmount = minimumInterval.minimumAmount
                additionalProperties = minimumInterval.additionalProperties.toMutableMap()
            }

            /** The start date of the minimum interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the minimum interval. */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** The end date of the minimum interval. */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /** The end date of the minimum interval. */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The price ids that this minimum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /** The price ids that this minimum interval applies to. */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds
            }

            /** The price interval ids that this minimum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /** The price interval ids that this minimum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds = appliesToPriceIntervalIds
                }

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
                    startDate,
                    endDate,
                    appliesToPriceIds.map { it.toImmutable() },
                    appliesToPriceIntervalIds.map { it.toImmutable() },
                    minimumAmount,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MinimumInterval && startDate == other.startDate && endDate == other.endDate && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && minimumAmount == other.minimumAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(startDate, endDate, appliesToPriceIds, appliesToPriceIntervalIds, minimumAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MinimumInterval{startDate=$startDate, endDate=$endDate, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, minimumAmount=$minimumAmount, additionalProperties=$additionalProperties}"
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
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("price")
        @ExcludeMissing
        private val price: JsonField<Price> = JsonMissing.of(),
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        private val billingCycleDay: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        private val fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>> =
            JsonMissing.of(),
        @JsonProperty("current_billing_period_start_date")
        @ExcludeMissing
        private val currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("current_billing_period_end_date")
        @ExcludeMissing
        private val currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        /**
         * The start date of the price interval. This is the date that Orb starts billing for this
         * price.
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /**
         * The end date of the price interval. This is the date that Orb stops billing for this
         * price.
         */
        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * ## Unit pricing
         *
         * With unit pricing, each unit costs a fixed amount.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "unit",
         *     "unit_config": {
         *         "unit_amount": "0.50"
         *     }
         *     ...
         * }
         * ```
         *
         * ## Tiered pricing
         *
         * In tiered pricing, the cost of a given unit depends on the tier range that it falls into,
         * where each tier range is defined by an upper and lower bound. For example, the first ten
         * units may cost $0.50 each and all units thereafter may cost $0.10 each.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "tiered",
         *     "tiered_config": {
         *         "tiers": [
         *             {
         *                 "first_unit": 1,
         *                 "last_unit": 10,
         *                 "unit_amount": "0.50"
         *             },
         *             {
         *                 "first_unit": 11,
         *                 "last_unit": null,
         *                 "unit_amount": "0.10"
         *             }
         *         ]
         *     }
         *     ...
         * ```
         *
         * ## Bulk pricing
         *
         * Bulk pricing applies when the number of units determine the cost of all units. For
         * example, if you've bought less than 10 units, they may each be $0.50 for a total of
         * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40 (i.e.
         * 101 units total would be $40.40).
         *
         * ```json
         * {
         *     ...
         *     "model_type": "bulk",
         *     "bulk_config": {
         *         "tiers": [
         *             {
         *                 "maximum_units": 10,
         *                 "unit_amount": "0.50"
         *             },
         *             {
         *                 "maximum_units": 1000,
         *                 "unit_amount": "0.40"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Package pricing
         *
         * Package pricing defines the size or granularity of a unit for billing purposes. For
         * example, if the package size is set to 5, then 4 units will be billed as 5 and 6 units
         * will be billed at 10.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "package",
         *     "package_config": {
         *         "package_amount": "0.80",
         *         "package_size": 10
         *     }
         *     ...
         * }
         * ```
         *
         * ## BPS pricing
         *
         * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a percent
         * (the number of basis points to charge), as well as a cap per event to assess. For
         * example, this would allow you to assess a fee of 0.25% on every payment you process, with
         * a maximum charge of $25 per payment.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "bps",
         *     "bps_config": {
         *        "bps": 125,
         *        "per_unit_maximum": "11.00"
         *     }
         *     ...
         *  }
         * ```
         *
         * ## Bulk BPS pricing
         *
         * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total
         * quantity across all events. Similar to bulk pricing, the BPS parameters of a given event
         * depends on the tier range that the billing period falls into. Each tier range is defined
         * by an upper bound. For example, after $1.5M of payment volume is reached, each individual
         * payment may have a lower cap or a smaller take-rate.
         *
         * ```json
         *     ...
         *     "model_type": "bulk_bps",
         *     "bulk_bps_config": {
         *         "tiers": [
         *            {
         *                 "maximum_amount": "1000000.00",
         *                 "bps": 125,
         *                 "per_unit_maximum": "19.00"
         *            },
         *           {
         *                 "maximum_amount": null,
         *                 "bps": 115,
         *                 "per_unit_maximum": "4.00"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Tiered BPS pricing
         *
         * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
         * applicable parameter is a function of its marginal addition to the period total. Similar
         * to tiered pricing, the BPS parameters of a given event depends on the tier range that it
         * falls into, where each tier range is defined by an upper and lower bound. For example,
         * the first few payments may have a 0.8 BPS take-rate and all payments after a specific
         * volume may incur a take-rate of 0.5 BPS each.
         *
         * ```json
         *     ...
         *     "model_type": "tiered_bps",
         *     "tiered_bps_config": {
         *         "tiers": [
         *            {
         *                 "minimum_amount": "0",
         *                 "maximum_amount": "1000000.00",
         *                 "bps": 125,
         *                 "per_unit_maximum": "19.00"
         *            },
         *           {
         *                 "minimum_amount": "1000000.00",
         *                 "maximum_amount": null,
         *                 "bps": 115,
         *                 "per_unit_maximum": "4.00"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Matrix pricing
         *
         * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
         * `dimensions` defines the two event property values evaluated in this pricing model. In a
         * one-dimensional matrix, the second value is `null`. Every configuration has a list of
         * `matrix_values` which give the unit prices for specified property values. In a
         * one-dimensional matrix, the matrix values will have `dimension_values` where the second
         * value of the pair is null. If an event does not match any of the dimension values in the
         * matrix, it will resort to the `default_unit_amount`.
         *
         * ```json
         * {
         *     "model_type": "matrix"
         *     "matrix_config": {
         *         "default_unit_amount": "3.00",
         *         "dimensions": [
         *             "cluster_name",
         *             "region"
         *         ],
         *         "matrix_values": [
         *             {
         *                 "dimension_values": [
         *                     "alpha",
         *                     "west"
         *                 ],
         *                 "unit_amount": "2.00"
         *             },
         *             ...
         *         ]
         *     }
         * }
         * ```
         *
         * ## Fixed fees
         *
         * Fixed fees are prices that are applied independent of usage quantities, and follow unit
         * pricing. They also have an additional parameter `fixed_price_quantity`. If the Price
         * represents a fixed cost, this represents the quantity of units applied.
         *
         * ```json
         * {
         *     ...
         *     "id": "price_id",
         *     "model_type": "unit",
         *     "unit_config": {
         *        "unit_amount": "2.00"
         *     },
         *     "fixed_price_quantity": 3.0
         *     ...
         * }
         * ```
         */
        fun price(): Price = price.getRequired("price")

        /** The day of the month that Orb bills for this price */
        fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         */
        fun fixedFeeQuantityTransitions(): Optional<List<FixedFeeQuantityTransition>> =
            Optional.ofNullable(
                fixedFeeQuantityTransitions.getNullable("fixed_fee_quantity_transitions")
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
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is exactly the end of the billing period. Set to null if this price
         * interval is not currently active.
         */
        fun currentBillingPeriodEndDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                currentBillingPeriodEndDate.getNullable("current_billing_period_end_date")
            )

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * The start date of the price interval. This is the date that Orb starts billing for this
         * price.
         */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        /**
         * The end date of the price interval. This is the date that Orb stops billing for this
         * price.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * ## Unit pricing
         *
         * With unit pricing, each unit costs a fixed amount.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "unit",
         *     "unit_config": {
         *         "unit_amount": "0.50"
         *     }
         *     ...
         * }
         * ```
         *
         * ## Tiered pricing
         *
         * In tiered pricing, the cost of a given unit depends on the tier range that it falls into,
         * where each tier range is defined by an upper and lower bound. For example, the first ten
         * units may cost $0.50 each and all units thereafter may cost $0.10 each.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "tiered",
         *     "tiered_config": {
         *         "tiers": [
         *             {
         *                 "first_unit": 1,
         *                 "last_unit": 10,
         *                 "unit_amount": "0.50"
         *             },
         *             {
         *                 "first_unit": 11,
         *                 "last_unit": null,
         *                 "unit_amount": "0.10"
         *             }
         *         ]
         *     }
         *     ...
         * ```
         *
         * ## Bulk pricing
         *
         * Bulk pricing applies when the number of units determine the cost of all units. For
         * example, if you've bought less than 10 units, they may each be $0.50 for a total of
         * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40 (i.e.
         * 101 units total would be $40.40).
         *
         * ```json
         * {
         *     ...
         *     "model_type": "bulk",
         *     "bulk_config": {
         *         "tiers": [
         *             {
         *                 "maximum_units": 10,
         *                 "unit_amount": "0.50"
         *             },
         *             {
         *                 "maximum_units": 1000,
         *                 "unit_amount": "0.40"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Package pricing
         *
         * Package pricing defines the size or granularity of a unit for billing purposes. For
         * example, if the package size is set to 5, then 4 units will be billed as 5 and 6 units
         * will be billed at 10.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "package",
         *     "package_config": {
         *         "package_amount": "0.80",
         *         "package_size": 10
         *     }
         *     ...
         * }
         * ```
         *
         * ## BPS pricing
         *
         * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a percent
         * (the number of basis points to charge), as well as a cap per event to assess. For
         * example, this would allow you to assess a fee of 0.25% on every payment you process, with
         * a maximum charge of $25 per payment.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "bps",
         *     "bps_config": {
         *        "bps": 125,
         *        "per_unit_maximum": "11.00"
         *     }
         *     ...
         *  }
         * ```
         *
         * ## Bulk BPS pricing
         *
         * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total
         * quantity across all events. Similar to bulk pricing, the BPS parameters of a given event
         * depends on the tier range that the billing period falls into. Each tier range is defined
         * by an upper bound. For example, after $1.5M of payment volume is reached, each individual
         * payment may have a lower cap or a smaller take-rate.
         *
         * ```json
         *     ...
         *     "model_type": "bulk_bps",
         *     "bulk_bps_config": {
         *         "tiers": [
         *            {
         *                 "maximum_amount": "1000000.00",
         *                 "bps": 125,
         *                 "per_unit_maximum": "19.00"
         *            },
         *           {
         *                 "maximum_amount": null,
         *                 "bps": 115,
         *                 "per_unit_maximum": "4.00"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Tiered BPS pricing
         *
         * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
         * applicable parameter is a function of its marginal addition to the period total. Similar
         * to tiered pricing, the BPS parameters of a given event depends on the tier range that it
         * falls into, where each tier range is defined by an upper and lower bound. For example,
         * the first few payments may have a 0.8 BPS take-rate and all payments after a specific
         * volume may incur a take-rate of 0.5 BPS each.
         *
         * ```json
         *     ...
         *     "model_type": "tiered_bps",
         *     "tiered_bps_config": {
         *         "tiers": [
         *            {
         *                 "minimum_amount": "0",
         *                 "maximum_amount": "1000000.00",
         *                 "bps": 125,
         *                 "per_unit_maximum": "19.00"
         *            },
         *           {
         *                 "minimum_amount": "1000000.00",
         *                 "maximum_amount": null,
         *                 "bps": 115,
         *                 "per_unit_maximum": "4.00"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Matrix pricing
         *
         * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
         * `dimensions` defines the two event property values evaluated in this pricing model. In a
         * one-dimensional matrix, the second value is `null`. Every configuration has a list of
         * `matrix_values` which give the unit prices for specified property values. In a
         * one-dimensional matrix, the matrix values will have `dimension_values` where the second
         * value of the pair is null. If an event does not match any of the dimension values in the
         * matrix, it will resort to the `default_unit_amount`.
         *
         * ```json
         * {
         *     "model_type": "matrix"
         *     "matrix_config": {
         *         "default_unit_amount": "3.00",
         *         "dimensions": [
         *             "cluster_name",
         *             "region"
         *         ],
         *         "matrix_values": [
         *             {
         *                 "dimension_values": [
         *                     "alpha",
         *                     "west"
         *                 ],
         *                 "unit_amount": "2.00"
         *             },
         *             ...
         *         ]
         *     }
         * }
         * ```
         *
         * ## Fixed fees
         *
         * Fixed fees are prices that are applied independent of usage quantities, and follow unit
         * pricing. They also have an additional parameter `fixed_price_quantity`. If the Price
         * represents a fixed cost, this represents the quantity of units applied.
         *
         * ```json
         * {
         *     ...
         *     "id": "price_id",
         *     "model_type": "unit",
         *     "unit_config": {
         *        "unit_amount": "2.00"
         *     },
         *     "fixed_price_quantity": 3.0
         *     ...
         * }
         * ```
         */
        @JsonProperty("price") @ExcludeMissing fun _price() = price

        /** The day of the month that Orb bills for this price */
        @JsonProperty("billing_cycle_day") @ExcludeMissing fun _billingCycleDay() = billingCycleDay

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         */
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        fun _fixedFeeQuantityTransitions() = fixedFeeQuantityTransitions

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if this price
         * interval is not currently active.
         */
        @JsonProperty("current_billing_period_start_date")
        @ExcludeMissing
        fun _currentBillingPeriodStartDate() = currentBillingPeriodStartDate

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is exactly the end of the billing period. Set to null if this price
         * interval is not currently active.
         */
        @JsonProperty("current_billing_period_end_date")
        @ExcludeMissing
        fun _currentBillingPeriodEndDate() = currentBillingPeriodEndDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PriceInterval = apply {
            if (!validated) {
                id()
                startDate()
                endDate()
                price()
                billingCycleDay()
                fixedFeeQuantityTransitions().map { it.forEach { it.validate() } }
                currentBillingPeriodStartDate()
                currentBillingPeriodEndDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var billingCycleDay: JsonField<Long> = JsonMissing.of()
            private var fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>> =
                JsonMissing.of()
            private var currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(priceInterval: PriceInterval) = apply {
                id = priceInterval.id
                startDate = priceInterval.startDate
                endDate = priceInterval.endDate
                price = priceInterval.price
                billingCycleDay = priceInterval.billingCycleDay
                fixedFeeQuantityTransitions = priceInterval.fixedFeeQuantityTransitions
                currentBillingPeriodStartDate = priceInterval.currentBillingPeriodStartDate
                currentBillingPeriodEndDate = priceInterval.currentBillingPeriodEndDate
                additionalProperties = priceInterval.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

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
             * The end date of the price interval. This is the date that Orb stops billing for this
             * price.
             */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * The end date of the price interval. This is the date that Orb stops billing for this
             * price.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * ## Unit pricing
             *
             * With unit pricing, each unit costs a fixed amount.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "unit",
             *     "unit_config": {
             *         "unit_amount": "0.50"
             *     }
             *     ...
             * }
             * ```
             *
             * ## Tiered pricing
             *
             * In tiered pricing, the cost of a given unit depends on the tier range that it falls
             * into, where each tier range is defined by an upper and lower bound. For example, the
             * first ten units may cost $0.50 each and all units thereafter may cost $0.10 each.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "tiered",
             *     "tiered_config": {
             *         "tiers": [
             *             {
             *                 "first_unit": 1,
             *                 "last_unit": 10,
             *                 "unit_amount": "0.50"
             *             },
             *             {
             *                 "first_unit": 11,
             *                 "last_unit": null,
             *                 "unit_amount": "0.10"
             *             }
             *         ]
             *     }
             *     ...
             * ```
             *
             * ## Bulk pricing
             *
             * Bulk pricing applies when the number of units determine the cost of all units. For
             * example, if you've bought less than 10 units, they may each be $0.50 for a total of
             * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40
             * (i.e. 101 units total would be $40.40).
             *
             * ```json
             * {
             *     ...
             *     "model_type": "bulk",
             *     "bulk_config": {
             *         "tiers": [
             *             {
             *                 "maximum_units": 10,
             *                 "unit_amount": "0.50"
             *             },
             *             {
             *                 "maximum_units": 1000,
             *                 "unit_amount": "0.40"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Package pricing
             *
             * Package pricing defines the size or granularity of a unit for billing purposes. For
             * example, if the package size is set to 5, then 4 units will be billed as 5 and 6
             * units will be billed at 10.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "package",
             *     "package_config": {
             *         "package_amount": "0.80",
             *         "package_size": 10
             *     }
             *     ...
             * }
             * ```
             *
             * ## BPS pricing
             *
             * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a
             * percent (the number of basis points to charge), as well as a cap per event to assess.
             * For example, this would allow you to assess a fee of 0.25% on every payment you
             * process, with a maximum charge of $25 per payment.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "bps",
             *     "bps_config": {
             *        "bps": 125,
             *        "per_unit_maximum": "11.00"
             *     }
             *     ...
             *  }
             * ```
             *
             * ## Bulk BPS pricing
             *
             * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total
             * quantity across all events. Similar to bulk pricing, the BPS parameters of a given
             * event depends on the tier range that the billing period falls into. Each tier range
             * is defined by an upper bound. For example, after $1.5M of payment volume is reached,
             * each individual payment may have a lower cap or a smaller take-rate.
             *
             * ```json
             *     ...
             *     "model_type": "bulk_bps",
             *     "bulk_bps_config": {
             *         "tiers": [
             *            {
             *                 "maximum_amount": "1000000.00",
             *                 "bps": 125,
             *                 "per_unit_maximum": "19.00"
             *            },
             *           {
             *                 "maximum_amount": null,
             *                 "bps": 115,
             *                 "per_unit_maximum": "4.00"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Tiered BPS pricing
             *
             * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
             * applicable parameter is a function of its marginal addition to the period total.
             * Similar to tiered pricing, the BPS parameters of a given event depends on the tier
             * range that it falls into, where each tier range is defined by an upper and lower
             * bound. For example, the first few payments may have a 0.8 BPS take-rate and all
             * payments after a specific volume may incur a take-rate of 0.5 BPS each.
             *
             * ```json
             *     ...
             *     "model_type": "tiered_bps",
             *     "tiered_bps_config": {
             *         "tiers": [
             *            {
             *                 "minimum_amount": "0",
             *                 "maximum_amount": "1000000.00",
             *                 "bps": 125,
             *                 "per_unit_maximum": "19.00"
             *            },
             *           {
             *                 "minimum_amount": "1000000.00",
             *                 "maximum_amount": null,
             *                 "bps": 115,
             *                 "per_unit_maximum": "4.00"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Matrix pricing
             *
             * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
             * `dimensions` defines the two event property values evaluated in this pricing model.
             * In a one-dimensional matrix, the second value is `null`. Every configuration has a
             * list of `matrix_values` which give the unit prices for specified property values. In
             * a one-dimensional matrix, the matrix values will have `dimension_values` where the
             * second value of the pair is null. If an event does not match any of the dimension
             * values in the matrix, it will resort to the `default_unit_amount`.
             *
             * ```json
             * {
             *     "model_type": "matrix"
             *     "matrix_config": {
             *         "default_unit_amount": "3.00",
             *         "dimensions": [
             *             "cluster_name",
             *             "region"
             *         ],
             *         "matrix_values": [
             *             {
             *                 "dimension_values": [
             *                     "alpha",
             *                     "west"
             *                 ],
             *                 "unit_amount": "2.00"
             *             },
             *             ...
             *         ]
             *     }
             * }
             * ```
             *
             * ## Fixed fees
             *
             * Fixed fees are prices that are applied independent of usage quantities, and follow
             * unit pricing. They also have an additional parameter `fixed_price_quantity`. If the
             * Price represents a fixed cost, this represents the quantity of units applied.
             *
             * ```json
             * {
             *     ...
             *     "id": "price_id",
             *     "model_type": "unit",
             *     "unit_config": {
             *        "unit_amount": "2.00"
             *     },
             *     "fixed_price_quantity": 3.0
             *     ...
             * }
             * ```
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
             * ## Unit pricing
             *
             * With unit pricing, each unit costs a fixed amount.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "unit",
             *     "unit_config": {
             *         "unit_amount": "0.50"
             *     }
             *     ...
             * }
             * ```
             *
             * ## Tiered pricing
             *
             * In tiered pricing, the cost of a given unit depends on the tier range that it falls
             * into, where each tier range is defined by an upper and lower bound. For example, the
             * first ten units may cost $0.50 each and all units thereafter may cost $0.10 each.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "tiered",
             *     "tiered_config": {
             *         "tiers": [
             *             {
             *                 "first_unit": 1,
             *                 "last_unit": 10,
             *                 "unit_amount": "0.50"
             *             },
             *             {
             *                 "first_unit": 11,
             *                 "last_unit": null,
             *                 "unit_amount": "0.10"
             *             }
             *         ]
             *     }
             *     ...
             * ```
             *
             * ## Bulk pricing
             *
             * Bulk pricing applies when the number of units determine the cost of all units. For
             * example, if you've bought less than 10 units, they may each be $0.50 for a total of
             * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40
             * (i.e. 101 units total would be $40.40).
             *
             * ```json
             * {
             *     ...
             *     "model_type": "bulk",
             *     "bulk_config": {
             *         "tiers": [
             *             {
             *                 "maximum_units": 10,
             *                 "unit_amount": "0.50"
             *             },
             *             {
             *                 "maximum_units": 1000,
             *                 "unit_amount": "0.40"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Package pricing
             *
             * Package pricing defines the size or granularity of a unit for billing purposes. For
             * example, if the package size is set to 5, then 4 units will be billed as 5 and 6
             * units will be billed at 10.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "package",
             *     "package_config": {
             *         "package_amount": "0.80",
             *         "package_size": 10
             *     }
             *     ...
             * }
             * ```
             *
             * ## BPS pricing
             *
             * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a
             * percent (the number of basis points to charge), as well as a cap per event to assess.
             * For example, this would allow you to assess a fee of 0.25% on every payment you
             * process, with a maximum charge of $25 per payment.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "bps",
             *     "bps_config": {
             *        "bps": 125,
             *        "per_unit_maximum": "11.00"
             *     }
             *     ...
             *  }
             * ```
             *
             * ## Bulk BPS pricing
             *
             * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total
             * quantity across all events. Similar to bulk pricing, the BPS parameters of a given
             * event depends on the tier range that the billing period falls into. Each tier range
             * is defined by an upper bound. For example, after $1.5M of payment volume is reached,
             * each individual payment may have a lower cap or a smaller take-rate.
             *
             * ```json
             *     ...
             *     "model_type": "bulk_bps",
             *     "bulk_bps_config": {
             *         "tiers": [
             *            {
             *                 "maximum_amount": "1000000.00",
             *                 "bps": 125,
             *                 "per_unit_maximum": "19.00"
             *            },
             *           {
             *                 "maximum_amount": null,
             *                 "bps": 115,
             *                 "per_unit_maximum": "4.00"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Tiered BPS pricing
             *
             * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
             * applicable parameter is a function of its marginal addition to the period total.
             * Similar to tiered pricing, the BPS parameters of a given event depends on the tier
             * range that it falls into, where each tier range is defined by an upper and lower
             * bound. For example, the first few payments may have a 0.8 BPS take-rate and all
             * payments after a specific volume may incur a take-rate of 0.5 BPS each.
             *
             * ```json
             *     ...
             *     "model_type": "tiered_bps",
             *     "tiered_bps_config": {
             *         "tiers": [
             *            {
             *                 "minimum_amount": "0",
             *                 "maximum_amount": "1000000.00",
             *                 "bps": 125,
             *                 "per_unit_maximum": "19.00"
             *            },
             *           {
             *                 "minimum_amount": "1000000.00",
             *                 "maximum_amount": null,
             *                 "bps": 115,
             *                 "per_unit_maximum": "4.00"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Matrix pricing
             *
             * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
             * `dimensions` defines the two event property values evaluated in this pricing model.
             * In a one-dimensional matrix, the second value is `null`. Every configuration has a
             * list of `matrix_values` which give the unit prices for specified property values. In
             * a one-dimensional matrix, the matrix values will have `dimension_values` where the
             * second value of the pair is null. If an event does not match any of the dimension
             * values in the matrix, it will resort to the `default_unit_amount`.
             *
             * ```json
             * {
             *     "model_type": "matrix"
             *     "matrix_config": {
             *         "default_unit_amount": "3.00",
             *         "dimensions": [
             *             "cluster_name",
             *             "region"
             *         ],
             *         "matrix_values": [
             *             {
             *                 "dimension_values": [
             *                     "alpha",
             *                     "west"
             *                 ],
             *                 "unit_amount": "2.00"
             *             },
             *             ...
             *         ]
             *     }
             * }
             * ```
             *
             * ## Fixed fees
             *
             * Fixed fees are prices that are applied independent of usage quantities, and follow
             * unit pricing. They also have an additional parameter `fixed_price_quantity`. If the
             * Price represents a fixed cost, this represents the quantity of units applied.
             *
             * ```json
             * {
             *     ...
             *     "id": "price_id",
             *     "model_type": "unit",
             *     "unit_config": {
             *        "unit_amount": "2.00"
             *     },
             *     "fixed_price_quantity": 3.0
             *     ...
             * }
             * ```
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** The day of the month that Orb bills for this price */
            fun billingCycleDay(billingCycleDay: Long) =
                billingCycleDay(JsonField.of(billingCycleDay))

            /** The day of the month that Orb bills for this price */
            fun billingCycleDay(billingCycleDay: JsonField<Long>) = apply {
                this.billingCycleDay = billingCycleDay
            }

            /**
             * The fixed fee quantity transitions for this price interval. This is only relevant for
             * fixed fees.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>
            ) = fixedFeeQuantityTransitions(JsonField.of(fixedFeeQuantityTransitions))

            /**
             * The fixed fee quantity transitions for this price interval. This is only relevant for
             * fixed fees.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>
            ) = apply { this.fixedFeeQuantityTransitions = fixedFeeQuantityTransitions }

            /**
             * The start date of the current billing period. This is an inclusive timestamp; the
             * instant returned is exactly the beginning of the billing period. Set to null if this
             * price interval is not currently active.
             */
            fun currentBillingPeriodStartDate(currentBillingPeriodStartDate: OffsetDateTime) =
                currentBillingPeriodStartDate(JsonField.of(currentBillingPeriodStartDate))

            /**
             * The start date of the current billing period. This is an inclusive timestamp; the
             * instant returned is exactly the beginning of the billing period. Set to null if this
             * price interval is not currently active.
             */
            fun currentBillingPeriodStartDate(
                currentBillingPeriodStartDate: JsonField<OffsetDateTime>
            ) = apply { this.currentBillingPeriodStartDate = currentBillingPeriodStartDate }

            /**
             * The end of the current billing period. This is an exclusive timestamp, such that the
             * instant returned is exactly the end of the billing period. Set to null if this price
             * interval is not currently active.
             */
            fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: OffsetDateTime) =
                currentBillingPeriodEndDate(JsonField.of(currentBillingPeriodEndDate))

            /**
             * The end of the current billing period. This is an exclusive timestamp, such that the
             * instant returned is exactly the end of the billing period. Set to null if this price
             * interval is not currently active.
             */
            fun currentBillingPeriodEndDate(
                currentBillingPeriodEndDate: JsonField<OffsetDateTime>
            ) = apply { this.currentBillingPeriodEndDate = currentBillingPeriodEndDate }

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
                    id,
                    startDate,
                    endDate,
                    price,
                    billingCycleDay,
                    fixedFeeQuantityTransitions.map { it.toImmutable() },
                    currentBillingPeriodStartDate,
                    currentBillingPeriodEndDate,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class FixedFeeQuantityTransition
        @JsonCreator
        private constructor(
            @JsonProperty("price_id")
            @ExcludeMissing
            private val priceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("effective_date")
            @ExcludeMissing
            private val effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun priceId(): String = priceId.getRequired("price_id")

            fun effectiveDate(): OffsetDateTime = effectiveDate.getRequired("effective_date")

            fun quantity(): Long = quantity.getRequired("quantity")

            @JsonProperty("price_id") @ExcludeMissing fun _priceId() = priceId

            @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

            @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): FixedFeeQuantityTransition = apply {
                if (!validated) {
                    priceId()
                    effectiveDate()
                    quantity()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var priceId: JsonField<String> = JsonMissing.of()
                private var effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var quantity: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(fixedFeeQuantityTransition: FixedFeeQuantityTransition) = apply {
                    priceId = fixedFeeQuantityTransition.priceId
                    effectiveDate = fixedFeeQuantityTransition.effectiveDate
                    quantity = fixedFeeQuantityTransition.quantity
                    additionalProperties =
                        fixedFeeQuantityTransition.additionalProperties.toMutableMap()
                }

                fun priceId(priceId: String) = priceId(JsonField.of(priceId))

                fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

                fun effectiveDate(effectiveDate: OffsetDateTime) =
                    effectiveDate(JsonField.of(effectiveDate))

                fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
                    this.effectiveDate = effectiveDate
                }

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
                        priceId,
                        effectiveDate,
                        quantity,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FixedFeeQuantityTransition && priceId == other.priceId && effectiveDate == other.effectiveDate && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(priceId, effectiveDate, quantity, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FixedFeeQuantityTransition{priceId=$priceId, effectiveDate=$effectiveDate, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PriceInterval && id == other.id && startDate == other.startDate && endDate == other.endDate && price == other.price && billingCycleDay == other.billingCycleDay && fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions && currentBillingPeriodStartDate == other.currentBillingPeriodStartDate && currentBillingPeriodEndDate == other.currentBillingPeriodEndDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, startDate, endDate, price, billingCycleDay, fixedFeeQuantityTransitions, currentBillingPeriodStartDate, currentBillingPeriodEndDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PriceInterval{id=$id, startDate=$startDate, endDate=$endDate, price=$price, billingCycleDay=$billingCycleDay, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, currentBillingPeriodStartDate=$currentBillingPeriodStartDate, currentBillingPeriodEndDate=$currentBillingPeriodEndDate, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class RedeemedCoupon
    @JsonCreator
    private constructor(
        @JsonProperty("coupon_id")
        @ExcludeMissing
        private val couponId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun couponId(): String = couponId.getRequired("coupon_id")

        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("end_date"))

        @JsonProperty("coupon_id") @ExcludeMissing fun _couponId() = couponId

        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RedeemedCoupon = apply {
            if (!validated) {
                couponId()
                startDate()
                endDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var couponId: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(redeemedCoupon: RedeemedCoupon) = apply {
                couponId = redeemedCoupon.couponId
                startDate = redeemedCoupon.startDate
                endDate = redeemedCoupon.endDate
                additionalProperties = redeemedCoupon.additionalProperties.toMutableMap()
            }

            fun couponId(couponId: String) = couponId(JsonField.of(couponId))

            fun couponId(couponId: JsonField<String>) = apply { this.couponId = couponId }

            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

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

            fun build(): RedeemedCoupon =
                RedeemedCoupon(
                    couponId,
                    startDate,
                    endDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RedeemedCoupon && couponId == other.couponId && startDate == other.startDate && endDate == other.endDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(couponId, startDate, endDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RedeemedCoupon{couponId=$couponId, startDate=$startDate, endDate=$endDate, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("active")

            @JvmField val ENDED = of("ended")

            @JvmField val UPCOMING = of("upcoming")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            ENDED,
            UPCOMING,
        }

        enum class Value {
            ACTIVE,
            ENDED,
            UPCOMING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                ENDED -> Value.ENDED
                UPCOMING -> Value.UPCOMING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                ENDED -> Known.ENDED
                UPCOMING -> Known.UPCOMING
                else -> throw OrbInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TrialInfo = apply {
            if (!validated) {
                endDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trialInfo: TrialInfo) = apply {
                endDate = trialInfo.endDate
                additionalProperties = trialInfo.additionalProperties.toMutableMap()
            }

            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

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

            fun build(): TrialInfo = TrialInfo(endDate, additionalProperties.toImmutable())
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

        return /* spotless:off */ other is SubscriptionUpdateFixedFeeQuantityResponse && metadata == other.metadata && id == other.id && customer == other.customer && plan == other.plan && startDate == other.startDate && endDate == other.endDate && createdAt == other.createdAt && currentBillingPeriodStartDate == other.currentBillingPeriodStartDate && currentBillingPeriodEndDate == other.currentBillingPeriodEndDate && status == other.status && trialInfo == other.trialInfo && activePlanPhaseOrder == other.activePlanPhaseOrder && fixedFeeQuantitySchedule == other.fixedFeeQuantitySchedule && defaultInvoiceMemo == other.defaultInvoiceMemo && autoCollection == other.autoCollection && netTerms == other.netTerms && redeemedCoupon == other.redeemedCoupon && billingCycleDay == other.billingCycleDay && billingCycleAnchorConfiguration == other.billingCycleAnchorConfiguration && invoicingThreshold == other.invoicingThreshold && priceIntervals == other.priceIntervals && adjustmentIntervals == other.adjustmentIntervals && discountIntervals == other.discountIntervals && minimumIntervals == other.minimumIntervals && maximumIntervals == other.maximumIntervals && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(metadata, id, customer, plan, startDate, endDate, createdAt, currentBillingPeriodStartDate, currentBillingPeriodEndDate, status, trialInfo, activePlanPhaseOrder, fixedFeeQuantitySchedule, defaultInvoiceMemo, autoCollection, netTerms, redeemedCoupon, billingCycleDay, billingCycleAnchorConfiguration, invoicingThreshold, priceIntervals, adjustmentIntervals, discountIntervals, minimumIntervals, maximumIntervals, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionUpdateFixedFeeQuantityResponse{metadata=$metadata, id=$id, customer=$customer, plan=$plan, startDate=$startDate, endDate=$endDate, createdAt=$createdAt, currentBillingPeriodStartDate=$currentBillingPeriodStartDate, currentBillingPeriodEndDate=$currentBillingPeriodEndDate, status=$status, trialInfo=$trialInfo, activePlanPhaseOrder=$activePlanPhaseOrder, fixedFeeQuantitySchedule=$fixedFeeQuantitySchedule, defaultInvoiceMemo=$defaultInvoiceMemo, autoCollection=$autoCollection, netTerms=$netTerms, redeemedCoupon=$redeemedCoupon, billingCycleDay=$billingCycleDay, billingCycleAnchorConfiguration=$billingCycleAnchorConfiguration, invoicingThreshold=$invoicingThreshold, priceIntervals=$priceIntervals, adjustmentIntervals=$adjustmentIntervals, discountIntervals=$discountIntervals, minimumIntervals=$minimumIntervals, maximumIntervals=$maximumIntervals, additionalProperties=$additionalProperties}"
}
