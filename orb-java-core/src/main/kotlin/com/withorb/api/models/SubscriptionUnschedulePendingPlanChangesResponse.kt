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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SubscriptionUnschedulePendingPlanChangesResponse
private constructor(
    private val id: JsonField<String>,
    private val activePlanPhaseOrder: JsonField<Long>,
    private val adjustmentIntervals: JsonField<List<AdjustmentInterval>>,
    private val autoCollection: JsonField<Boolean>,
    private val billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>,
    private val billingCycleDay: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currentBillingPeriodEndDate: JsonField<OffsetDateTime>,
    private val currentBillingPeriodStartDate: JsonField<OffsetDateTime>,
    private val customer: JsonField<Customer>,
    private val defaultInvoiceMemo: JsonField<String>,
    private val discountIntervals: JsonField<List<DiscountInterval>>,
    private val endDate: JsonField<OffsetDateTime>,
    private val fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>>,
    private val invoicingThreshold: JsonField<String>,
    private val maximumIntervals: JsonField<List<MaximumInterval>>,
    private val metadata: JsonField<Metadata>,
    private val minimumIntervals: JsonField<List<MinimumInterval>>,
    private val netTerms: JsonField<Long>,
    private val pendingSubscriptionChange: JsonField<PendingSubscriptionChange>,
    private val plan: JsonField<Plan>,
    private val priceIntervals: JsonField<List<PriceInterval>>,
    private val redeemedCoupon: JsonField<RedeemedCoupon>,
    private val startDate: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val trialInfo: JsonField<TrialInfo>,
    private val changedResources: JsonField<ChangedResources>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active_plan_phase_order")
        @ExcludeMissing
        activePlanPhaseOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("adjustment_intervals")
        @ExcludeMissing
        adjustmentIntervals: JsonField<List<AdjustmentInterval>> = JsonMissing.of(),
        @JsonProperty("auto_collection")
        @ExcludeMissing
        autoCollection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("billing_cycle_anchor_configuration")
        @ExcludeMissing
        billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration> =
            JsonMissing.of(),
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        billingCycleDay: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("current_billing_period_end_date")
        @ExcludeMissing
        currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("current_billing_period_start_date")
        @ExcludeMissing
        currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer") @ExcludeMissing customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("default_invoice_memo")
        @ExcludeMissing
        defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount_intervals")
        @ExcludeMissing
        discountIntervals: JsonField<List<DiscountInterval>> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fixed_fee_quantity_schedule")
        @ExcludeMissing
        fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>> = JsonMissing.of(),
        @JsonProperty("invoicing_threshold")
        @ExcludeMissing
        invoicingThreshold: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maximum_intervals")
        @ExcludeMissing
        maximumIntervals: JsonField<List<MaximumInterval>> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("minimum_intervals")
        @ExcludeMissing
        minimumIntervals: JsonField<List<MinimumInterval>> = JsonMissing.of(),
        @JsonProperty("net_terms") @ExcludeMissing netTerms: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pending_subscription_change")
        @ExcludeMissing
        pendingSubscriptionChange: JsonField<PendingSubscriptionChange> = JsonMissing.of(),
        @JsonProperty("plan") @ExcludeMissing plan: JsonField<Plan> = JsonMissing.of(),
        @JsonProperty("price_intervals")
        @ExcludeMissing
        priceIntervals: JsonField<List<PriceInterval>> = JsonMissing.of(),
        @JsonProperty("redeemed_coupon")
        @ExcludeMissing
        redeemedCoupon: JsonField<RedeemedCoupon> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("trial_info")
        @ExcludeMissing
        trialInfo: JsonField<TrialInfo> = JsonMissing.of(),
        @JsonProperty("changed_resources")
        @ExcludeMissing
        changedResources: JsonField<ChangedResources> = JsonMissing.of(),
    ) : this(
        id,
        activePlanPhaseOrder,
        adjustmentIntervals,
        autoCollection,
        billingCycleAnchorConfiguration,
        billingCycleDay,
        createdAt,
        currentBillingPeriodEndDate,
        currentBillingPeriodStartDate,
        customer,
        defaultInvoiceMemo,
        discountIntervals,
        endDate,
        fixedFeeQuantitySchedule,
        invoicingThreshold,
        maximumIntervals,
        metadata,
        minimumIntervals,
        netTerms,
        pendingSubscriptionChange,
        plan,
        priceIntervals,
        redeemedCoupon,
        startDate,
        status,
        trialInfo,
        changedResources,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The current plan phase that is active, only if the subscription's plan has phases.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun activePlanPhaseOrder(): Optional<Long> =
        activePlanPhaseOrder.getOptional("active_plan_phase_order")

    /**
     * The adjustment intervals for this subscription sorted by the start_date of the adjustment
     * interval.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjustmentIntervals(): List<AdjustmentInterval> =
        adjustmentIntervals.getRequired("adjustment_intervals")

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. This property defaults to the plan's behavior. If
     * null, defaults to the customer's setting.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun autoCollection(): Optional<Boolean> = autoCollection.getOptional("auto_collection")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingCycleAnchorConfiguration(): BillingCycleAnchorConfiguration =
        billingCycleAnchorConfiguration.getRequired("billing_cycle_anchor_configuration")

    /**
     * The day of the month on which the billing cycle is anchored. If the maximum number of days in
     * a month is greater than this value, the last day of the month is the billing cycle day (e.g.
     * billing_cycle_day=31 for April means the billing period begins on the 30th.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The end of the current billing period. This is an exclusive timestamp, such that the instant
     * returned is not part of the billing period. Set to null for subscriptions that are not
     * currently active.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currentBillingPeriodEndDate(): Optional<OffsetDateTime> =
        currentBillingPeriodEndDate.getOptional("current_billing_period_end_date")

    /**
     * The start date of the current billing period. This is an inclusive timestamp; the instant
     * returned is exactly the beginning of the billing period. Set to null if the subscription is
     * not currently active.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currentBillingPeriodStartDate(): Optional<OffsetDateTime> =
        currentBillingPeriodStartDate.getOptional("current_billing_period_start_date")

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
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): Customer = customer.getRequired("customer")

    /**
     * Determines the default memo on this subscriptions' invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun defaultInvoiceMemo(): Optional<String> =
        defaultInvoiceMemo.getOptional("default_invoice_memo")

    /**
     * The discount intervals for this subscription sorted by the start_date.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discountIntervals(): List<DiscountInterval> =
        discountIntervals.getRequired("discount_intervals")

    /**
     * The date Orb stops billing for this subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fixedFeeQuantitySchedule(): List<FixedFeeQuantitySchedule> =
        fixedFeeQuantitySchedule.getRequired("fixed_fee_quantity_schedule")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invoicingThreshold(): Optional<String> =
        invoicingThreshold.getOptional("invoicing_threshold")

    /**
     * The maximum intervals for this subscription sorted by the start_date.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maximumIntervals(): List<MaximumInterval> =
        maximumIntervals.getRequired("maximum_intervals")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * The minimum intervals for this subscription sorted by the start_date.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minimumIntervals(): List<MinimumInterval> =
        minimumIntervals.getRequired("minimum_intervals")

    /**
     * Determines the difference between the invoice issue date for subscription invoices as the
     * date that they are due. A value of `0` here represents that the invoice is due on issue,
     * whereas a value of `30` represents that the customer has a month to pay the invoice.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun netTerms(): Long = netTerms.getRequired("net_terms")

    /**
     * A pending subscription change if one exists on this subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun pendingSubscriptionChange(): Optional<PendingSubscriptionChange> =
        pendingSubscriptionChange.getOptional("pending_subscription_change")

    /**
     * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed
     * to by a customer. Plans define the billing behavior of the subscription. You can see more
     * about how to configure prices in the [Price resource](/reference/price).
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun plan(): Plan = plan.getRequired("plan")

    /**
     * The price intervals for this subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun priceIntervals(): List<PriceInterval> = priceIntervals.getRequired("price_intervals")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun redeemedCoupon(): Optional<RedeemedCoupon> = redeemedCoupon.getOptional("redeemed_coupon")

    /**
     * The date Orb starts billing for this subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trialInfo(): TrialInfo = trialInfo.getRequired("trial_info")

    /**
     * The resources that were changed as part of this operation. Only present when fetched through
     * the subscription changes API or if the `include_changed_resources` parameter was passed in
     * the request.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun changedResources(): Optional<ChangedResources> =
        changedResources.getOptional("changed_resources")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [activePlanPhaseOrder].
     *
     * Unlike [activePlanPhaseOrder], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("active_plan_phase_order")
    @ExcludeMissing
    fun _activePlanPhaseOrder(): JsonField<Long> = activePlanPhaseOrder

    /**
     * Returns the raw JSON value of [adjustmentIntervals].
     *
     * Unlike [adjustmentIntervals], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("adjustment_intervals")
    @ExcludeMissing
    fun _adjustmentIntervals(): JsonField<List<AdjustmentInterval>> = adjustmentIntervals

    /**
     * Returns the raw JSON value of [autoCollection].
     *
     * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auto_collection")
    @ExcludeMissing
    fun _autoCollection(): JsonField<Boolean> = autoCollection

    /**
     * Returns the raw JSON value of [billingCycleAnchorConfiguration].
     *
     * Unlike [billingCycleAnchorConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("billing_cycle_anchor_configuration")
    @ExcludeMissing
    fun _billingCycleAnchorConfiguration(): JsonField<BillingCycleAnchorConfiguration> =
        billingCycleAnchorConfiguration

    /**
     * Returns the raw JSON value of [billingCycleDay].
     *
     * Unlike [billingCycleDay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_cycle_day")
    @ExcludeMissing
    fun _billingCycleDay(): JsonField<Long> = billingCycleDay

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currentBillingPeriodEndDate].
     *
     * Unlike [currentBillingPeriodEndDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("current_billing_period_end_date")
    @ExcludeMissing
    fun _currentBillingPeriodEndDate(): JsonField<OffsetDateTime> = currentBillingPeriodEndDate

    /**
     * Returns the raw JSON value of [currentBillingPeriodStartDate].
     *
     * Unlike [currentBillingPeriodStartDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("current_billing_period_start_date")
    @ExcludeMissing
    fun _currentBillingPeriodStartDate(): JsonField<OffsetDateTime> = currentBillingPeriodStartDate

    /**
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    /**
     * Returns the raw JSON value of [defaultInvoiceMemo].
     *
     * Unlike [defaultInvoiceMemo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    fun _defaultInvoiceMemo(): JsonField<String> = defaultInvoiceMemo

    /**
     * Returns the raw JSON value of [discountIntervals].
     *
     * Unlike [discountIntervals], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("discount_intervals")
    @ExcludeMissing
    fun _discountIntervals(): JsonField<List<DiscountInterval>> = discountIntervals

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    /**
     * Returns the raw JSON value of [fixedFeeQuantitySchedule].
     *
     * Unlike [fixedFeeQuantitySchedule], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("fixed_fee_quantity_schedule")
    @ExcludeMissing
    fun _fixedFeeQuantitySchedule(): JsonField<List<FixedFeeQuantitySchedule>> =
        fixedFeeQuantitySchedule

    /**
     * Returns the raw JSON value of [invoicingThreshold].
     *
     * Unlike [invoicingThreshold], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("invoicing_threshold")
    @ExcludeMissing
    fun _invoicingThreshold(): JsonField<String> = invoicingThreshold

    /**
     * Returns the raw JSON value of [maximumIntervals].
     *
     * Unlike [maximumIntervals], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maximum_intervals")
    @ExcludeMissing
    fun _maximumIntervals(): JsonField<List<MaximumInterval>> = maximumIntervals

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [minimumIntervals].
     *
     * Unlike [minimumIntervals], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("minimum_intervals")
    @ExcludeMissing
    fun _minimumIntervals(): JsonField<List<MinimumInterval>> = minimumIntervals

    /**
     * Returns the raw JSON value of [netTerms].
     *
     * Unlike [netTerms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

    /**
     * Returns the raw JSON value of [pendingSubscriptionChange].
     *
     * Unlike [pendingSubscriptionChange], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("pending_subscription_change")
    @ExcludeMissing
    fun _pendingSubscriptionChange(): JsonField<PendingSubscriptionChange> =
        pendingSubscriptionChange

    /**
     * Returns the raw JSON value of [plan].
     *
     * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

    /**
     * Returns the raw JSON value of [priceIntervals].
     *
     * Unlike [priceIntervals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_intervals")
    @ExcludeMissing
    fun _priceIntervals(): JsonField<List<PriceInterval>> = priceIntervals

    /**
     * Returns the raw JSON value of [redeemedCoupon].
     *
     * Unlike [redeemedCoupon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redeemed_coupon")
    @ExcludeMissing
    fun _redeemedCoupon(): JsonField<RedeemedCoupon> = redeemedCoupon

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [trialInfo].
     *
     * Unlike [trialInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_info") @ExcludeMissing fun _trialInfo(): JsonField<TrialInfo> = trialInfo

    /**
     * Returns the raw JSON value of [changedResources].
     *
     * Unlike [changedResources], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("changed_resources")
    @ExcludeMissing
    fun _changedResources(): JsonField<ChangedResources> = changedResources

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
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionUnschedulePendingPlanChangesResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .activePlanPhaseOrder()
         * .adjustmentIntervals()
         * .autoCollection()
         * .billingCycleAnchorConfiguration()
         * .billingCycleDay()
         * .createdAt()
         * .currentBillingPeriodEndDate()
         * .currentBillingPeriodStartDate()
         * .customer()
         * .defaultInvoiceMemo()
         * .discountIntervals()
         * .endDate()
         * .fixedFeeQuantitySchedule()
         * .invoicingThreshold()
         * .maximumIntervals()
         * .metadata()
         * .minimumIntervals()
         * .netTerms()
         * .pendingSubscriptionChange()
         * .plan()
         * .priceIntervals()
         * .redeemedCoupon()
         * .startDate()
         * .status()
         * .trialInfo()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionUnschedulePendingPlanChangesResponse]. */
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
        private var pendingSubscriptionChange: JsonField<PendingSubscriptionChange>? = null
        private var plan: JsonField<Plan>? = null
        private var priceIntervals: JsonField<MutableList<PriceInterval>>? = null
        private var redeemedCoupon: JsonField<RedeemedCoupon>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var trialInfo: JsonField<TrialInfo>? = null
        private var changedResources: JsonField<ChangedResources> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            subscriptionUnschedulePendingPlanChangesResponse:
                SubscriptionUnschedulePendingPlanChangesResponse
        ) = apply {
            id = subscriptionUnschedulePendingPlanChangesResponse.id
            activePlanPhaseOrder =
                subscriptionUnschedulePendingPlanChangesResponse.activePlanPhaseOrder
            adjustmentIntervals =
                subscriptionUnschedulePendingPlanChangesResponse.adjustmentIntervals.map {
                    it.toMutableList()
                }
            autoCollection = subscriptionUnschedulePendingPlanChangesResponse.autoCollection
            billingCycleAnchorConfiguration =
                subscriptionUnschedulePendingPlanChangesResponse.billingCycleAnchorConfiguration
            billingCycleDay = subscriptionUnschedulePendingPlanChangesResponse.billingCycleDay
            createdAt = subscriptionUnschedulePendingPlanChangesResponse.createdAt
            currentBillingPeriodEndDate =
                subscriptionUnschedulePendingPlanChangesResponse.currentBillingPeriodEndDate
            currentBillingPeriodStartDate =
                subscriptionUnschedulePendingPlanChangesResponse.currentBillingPeriodStartDate
            customer = subscriptionUnschedulePendingPlanChangesResponse.customer
            defaultInvoiceMemo = subscriptionUnschedulePendingPlanChangesResponse.defaultInvoiceMemo
            discountIntervals =
                subscriptionUnschedulePendingPlanChangesResponse.discountIntervals.map {
                    it.toMutableList()
                }
            endDate = subscriptionUnschedulePendingPlanChangesResponse.endDate
            fixedFeeQuantitySchedule =
                subscriptionUnschedulePendingPlanChangesResponse.fixedFeeQuantitySchedule.map {
                    it.toMutableList()
                }
            invoicingThreshold = subscriptionUnschedulePendingPlanChangesResponse.invoicingThreshold
            maximumIntervals =
                subscriptionUnschedulePendingPlanChangesResponse.maximumIntervals.map {
                    it.toMutableList()
                }
            metadata = subscriptionUnschedulePendingPlanChangesResponse.metadata
            minimumIntervals =
                subscriptionUnschedulePendingPlanChangesResponse.minimumIntervals.map {
                    it.toMutableList()
                }
            netTerms = subscriptionUnschedulePendingPlanChangesResponse.netTerms
            pendingSubscriptionChange =
                subscriptionUnschedulePendingPlanChangesResponse.pendingSubscriptionChange
            plan = subscriptionUnschedulePendingPlanChangesResponse.plan
            priceIntervals =
                subscriptionUnschedulePendingPlanChangesResponse.priceIntervals.map {
                    it.toMutableList()
                }
            redeemedCoupon = subscriptionUnschedulePendingPlanChangesResponse.redeemedCoupon
            startDate = subscriptionUnschedulePendingPlanChangesResponse.startDate
            status = subscriptionUnschedulePendingPlanChangesResponse.status
            trialInfo = subscriptionUnschedulePendingPlanChangesResponse.trialInfo
            changedResources = subscriptionUnschedulePendingPlanChangesResponse.changedResources
            additionalProperties =
                subscriptionUnschedulePendingPlanChangesResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The current plan phase that is active, only if the subscription's plan has phases. */
        fun activePlanPhaseOrder(activePlanPhaseOrder: Long?) =
            activePlanPhaseOrder(JsonField.ofNullable(activePlanPhaseOrder))

        /**
         * Alias for [Builder.activePlanPhaseOrder].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun activePlanPhaseOrder(activePlanPhaseOrder: Long) =
            activePlanPhaseOrder(activePlanPhaseOrder as Long?)

        /**
         * Alias for calling [Builder.activePlanPhaseOrder] with
         * `activePlanPhaseOrder.orElse(null)`.
         */
        fun activePlanPhaseOrder(activePlanPhaseOrder: Optional<Long>) =
            activePlanPhaseOrder(activePlanPhaseOrder.getOrNull())

        /**
         * Sets [Builder.activePlanPhaseOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activePlanPhaseOrder] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activePlanPhaseOrder(activePlanPhaseOrder: JsonField<Long>) = apply {
            this.activePlanPhaseOrder = activePlanPhaseOrder
        }

        /**
         * The adjustment intervals for this subscription sorted by the start_date of the adjustment
         * interval.
         */
        fun adjustmentIntervals(adjustmentIntervals: List<AdjustmentInterval>) =
            adjustmentIntervals(JsonField.of(adjustmentIntervals))

        /**
         * Sets [Builder.adjustmentIntervals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustmentIntervals] with a well-typed
         * `List<AdjustmentInterval>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun adjustmentIntervals(adjustmentIntervals: JsonField<List<AdjustmentInterval>>) = apply {
            this.adjustmentIntervals = adjustmentIntervals.map { it.toMutableList() }
        }

        /**
         * Adds a single [AdjustmentInterval] to [adjustmentIntervals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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
         * Alias for [Builder.autoCollection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

        /** Alias for calling [Builder.autoCollection] with `autoCollection.orElse(null)`. */
        fun autoCollection(autoCollection: Optional<Boolean>) =
            autoCollection(autoCollection.getOrNull())

        /**
         * Sets [Builder.autoCollection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCollection] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            this.autoCollection = autoCollection
        }

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration
        ) = billingCycleAnchorConfiguration(JsonField.of(billingCycleAnchorConfiguration))

        /**
         * Sets [Builder.billingCycleAnchorConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCycleAnchorConfiguration] with a well-typed
         * [BillingCycleAnchorConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
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
         * Sets [Builder.billingCycleDay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCycleDay] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billingCycleDay(billingCycleDay: JsonField<Long>) = apply {
            this.billingCycleDay = billingCycleDay
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is not part of the billing period. Set to null for subscriptions that
         * are not currently active.
         */
        fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: OffsetDateTime?) =
            currentBillingPeriodEndDate(JsonField.ofNullable(currentBillingPeriodEndDate))

        /**
         * Alias for calling [Builder.currentBillingPeriodEndDate] with
         * `currentBillingPeriodEndDate.orElse(null)`.
         */
        fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: Optional<OffsetDateTime>) =
            currentBillingPeriodEndDate(currentBillingPeriodEndDate.getOrNull())

        /**
         * Sets [Builder.currentBillingPeriodEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentBillingPeriodEndDate] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
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
         * Alias for calling [Builder.currentBillingPeriodStartDate] with
         * `currentBillingPeriodStartDate.orElse(null)`.
         */
        fun currentBillingPeriodStartDate(currentBillingPeriodStartDate: Optional<OffsetDateTime>) =
            currentBillingPeriodStartDate(currentBillingPeriodStartDate.getOrNull())

        /**
         * Sets [Builder.currentBillingPeriodStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentBillingPeriodStartDate] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
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
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [Customer] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /**
         * Determines the default memo on this subscriptions' invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String?) =
            defaultInvoiceMemo(JsonField.ofNullable(defaultInvoiceMemo))

        /**
         * Alias for calling [Builder.defaultInvoiceMemo] with `defaultInvoiceMemo.orElse(null)`.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: Optional<String>) =
            defaultInvoiceMemo(defaultInvoiceMemo.getOrNull())

        /**
         * Sets [Builder.defaultInvoiceMemo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultInvoiceMemo] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: JsonField<String>) = apply {
            this.defaultInvoiceMemo = defaultInvoiceMemo
        }

        /** The discount intervals for this subscription sorted by the start_date. */
        fun discountIntervals(discountIntervals: List<DiscountInterval>) =
            discountIntervals(JsonField.of(discountIntervals))

        /**
         * Sets [Builder.discountIntervals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountIntervals] with a well-typed
         * `List<DiscountInterval>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun discountIntervals(discountIntervals: JsonField<List<DiscountInterval>>) = apply {
            this.discountIntervals = discountIntervals.map { it.toMutableList() }
        }

        /**
         * Adds a single [DiscountInterval] to [discountIntervals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDiscountInterval(discountInterval: DiscountInterval) = apply {
            discountIntervals =
                (discountIntervals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("discountIntervals", it).add(discountInterval)
                }
        }

        /** Alias for calling [addDiscountInterval] with `DiscountInterval.ofAmount(amount)`. */
        fun addDiscountInterval(amount: DiscountInterval.Amount) =
            addDiscountInterval(DiscountInterval.ofAmount(amount))

        /**
         * Alias for calling [addDiscountInterval] with `DiscountInterval.ofPercentage(percentage)`.
         */
        fun addDiscountInterval(percentage: DiscountInterval.Percentage) =
            addDiscountInterval(DiscountInterval.ofPercentage(percentage))

        /** Alias for calling [addDiscountInterval] with `DiscountInterval.ofUsage(usage)`. */
        fun addDiscountInterval(usage: DiscountInterval.Usage) =
            addDiscountInterval(DiscountInterval.ofUsage(usage))

        /** The date Orb stops billing for this subscription. */
        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        fun fixedFeeQuantitySchedule(fixedFeeQuantitySchedule: List<FixedFeeQuantitySchedule>) =
            fixedFeeQuantitySchedule(JsonField.of(fixedFeeQuantitySchedule))

        /**
         * Sets [Builder.fixedFeeQuantitySchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fixedFeeQuantitySchedule] with a well-typed
         * `List<FixedFeeQuantitySchedule>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun fixedFeeQuantitySchedule(
            fixedFeeQuantitySchedule: JsonField<List<FixedFeeQuantitySchedule>>
        ) = apply {
            this.fixedFeeQuantitySchedule = fixedFeeQuantitySchedule.map { it.toMutableList() }
        }

        /**
         * Adds a single [FixedFeeQuantitySchedule] to [Builder.fixedFeeQuantitySchedule].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFixedFeeQuantitySchedule(fixedFeeQuantitySchedule: FixedFeeQuantitySchedule) =
            apply {
                this.fixedFeeQuantitySchedule =
                    (this.fixedFeeQuantitySchedule ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fixedFeeQuantitySchedule", it).add(fixedFeeQuantitySchedule)
                    }
            }

        fun invoicingThreshold(invoicingThreshold: String?) =
            invoicingThreshold(JsonField.ofNullable(invoicingThreshold))

        /**
         * Alias for calling [Builder.invoicingThreshold] with `invoicingThreshold.orElse(null)`.
         */
        fun invoicingThreshold(invoicingThreshold: Optional<String>) =
            invoicingThreshold(invoicingThreshold.getOrNull())

        /**
         * Sets [Builder.invoicingThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoicingThreshold] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoicingThreshold(invoicingThreshold: JsonField<String>) = apply {
            this.invoicingThreshold = invoicingThreshold
        }

        /** The maximum intervals for this subscription sorted by the start_date. */
        fun maximumIntervals(maximumIntervals: List<MaximumInterval>) =
            maximumIntervals(JsonField.of(maximumIntervals))

        /**
         * Sets [Builder.maximumIntervals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumIntervals] with a well-typed
         * `List<MaximumInterval>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun maximumIntervals(maximumIntervals: JsonField<List<MaximumInterval>>) = apply {
            this.maximumIntervals = maximumIntervals.map { it.toMutableList() }
        }

        /**
         * Adds a single [MaximumInterval] to [maximumIntervals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The minimum intervals for this subscription sorted by the start_date. */
        fun minimumIntervals(minimumIntervals: List<MinimumInterval>) =
            minimumIntervals(JsonField.of(minimumIntervals))

        /**
         * Sets [Builder.minimumIntervals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumIntervals] with a well-typed
         * `List<MinimumInterval>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun minimumIntervals(minimumIntervals: JsonField<List<MinimumInterval>>) = apply {
            this.minimumIntervals = minimumIntervals.map { it.toMutableList() }
        }

        /**
         * Adds a single [MinimumInterval] to [minimumIntervals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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
         * Sets [Builder.netTerms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netTerms] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

        /** A pending subscription change if one exists on this subscription. */
        fun pendingSubscriptionChange(pendingSubscriptionChange: PendingSubscriptionChange?) =
            pendingSubscriptionChange(JsonField.ofNullable(pendingSubscriptionChange))

        /**
         * Alias for calling [Builder.pendingSubscriptionChange] with
         * `pendingSubscriptionChange.orElse(null)`.
         */
        fun pendingSubscriptionChange(
            pendingSubscriptionChange: Optional<PendingSubscriptionChange>
        ) = pendingSubscriptionChange(pendingSubscriptionChange.getOrNull())

        /**
         * Sets [Builder.pendingSubscriptionChange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingSubscriptionChange] with a well-typed
         * [PendingSubscriptionChange] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun pendingSubscriptionChange(
            pendingSubscriptionChange: JsonField<PendingSubscriptionChange>
        ) = apply { this.pendingSubscriptionChange = pendingSubscriptionChange }

        /**
         * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be
         * subscribed to by a customer. Plans define the billing behavior of the subscription. You
         * can see more about how to configure prices in the [Price resource](/reference/price).
         */
        fun plan(plan: Plan) = plan(JsonField.of(plan))

        /**
         * Sets [Builder.plan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plan] with a well-typed [Plan] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** The price intervals for this subscription. */
        fun priceIntervals(priceIntervals: List<PriceInterval>) =
            priceIntervals(JsonField.of(priceIntervals))

        /**
         * Sets [Builder.priceIntervals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceIntervals] with a well-typed `List<PriceInterval>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun priceIntervals(priceIntervals: JsonField<List<PriceInterval>>) = apply {
            this.priceIntervals = priceIntervals.map { it.toMutableList() }
        }

        /**
         * Adds a single [PriceInterval] to [priceIntervals].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriceInterval(priceInterval: PriceInterval) = apply {
            priceIntervals =
                (priceIntervals ?: JsonField.of(mutableListOf())).also {
                    checkKnown("priceIntervals", it).add(priceInterval)
                }
        }

        fun redeemedCoupon(redeemedCoupon: RedeemedCoupon?) =
            redeemedCoupon(JsonField.ofNullable(redeemedCoupon))

        /** Alias for calling [Builder.redeemedCoupon] with `redeemedCoupon.orElse(null)`. */
        fun redeemedCoupon(redeemedCoupon: Optional<RedeemedCoupon>) =
            redeemedCoupon(redeemedCoupon.getOrNull())

        /**
         * Sets [Builder.redeemedCoupon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redeemedCoupon] with a well-typed [RedeemedCoupon] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun redeemedCoupon(redeemedCoupon: JsonField<RedeemedCoupon>) = apply {
            this.redeemedCoupon = redeemedCoupon
        }

        /** The date Orb starts billing for this subscription. */
        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun trialInfo(trialInfo: TrialInfo) = trialInfo(JsonField.of(trialInfo))

        /**
         * Sets [Builder.trialInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialInfo] with a well-typed [TrialInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trialInfo(trialInfo: JsonField<TrialInfo>) = apply { this.trialInfo = trialInfo }

        /**
         * The resources that were changed as part of this operation. Only present when fetched
         * through the subscription changes API or if the `include_changed_resources` parameter was
         * passed in the request.
         */
        fun changedResources(changedResources: ChangedResources?) =
            changedResources(JsonField.ofNullable(changedResources))

        /** Alias for calling [Builder.changedResources] with `changedResources.orElse(null)`. */
        fun changedResources(changedResources: Optional<ChangedResources>) =
            changedResources(changedResources.getOrNull())

        /**
         * Sets [Builder.changedResources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changedResources] with a well-typed [ChangedResources]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun changedResources(changedResources: JsonField<ChangedResources>) = apply {
            this.changedResources = changedResources
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
         * Returns an immutable instance of [SubscriptionUnschedulePendingPlanChangesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .activePlanPhaseOrder()
         * .adjustmentIntervals()
         * .autoCollection()
         * .billingCycleAnchorConfiguration()
         * .billingCycleDay()
         * .createdAt()
         * .currentBillingPeriodEndDate()
         * .currentBillingPeriodStartDate()
         * .customer()
         * .defaultInvoiceMemo()
         * .discountIntervals()
         * .endDate()
         * .fixedFeeQuantitySchedule()
         * .invoicingThreshold()
         * .maximumIntervals()
         * .metadata()
         * .minimumIntervals()
         * .netTerms()
         * .pendingSubscriptionChange()
         * .plan()
         * .priceIntervals()
         * .redeemedCoupon()
         * .startDate()
         * .status()
         * .trialInfo()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionUnschedulePendingPlanChangesResponse =
            SubscriptionUnschedulePendingPlanChangesResponse(
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
                checkRequired("pendingSubscriptionChange", pendingSubscriptionChange),
                checkRequired("plan", plan),
                checkRequired("priceIntervals", priceIntervals).map { it.toImmutable() },
                checkRequired("redeemedCoupon", redeemedCoupon),
                checkRequired("startDate", startDate),
                checkRequired("status", status),
                checkRequired("trialInfo", trialInfo),
                changedResources,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionUnschedulePendingPlanChangesResponse = apply {
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
        pendingSubscriptionChange().ifPresent { it.validate() }
        plan().validate()
        priceIntervals().forEach { it.validate() }
        redeemedCoupon().ifPresent { it.validate() }
        startDate()
        status().validate()
        trialInfo().validate()
        changedResources().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (activePlanPhaseOrder.asKnown().isPresent) 1 else 0) +
            (adjustmentIntervals.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (autoCollection.asKnown().isPresent) 1 else 0) +
            (billingCycleAnchorConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
            (if (billingCycleDay.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (currentBillingPeriodEndDate.asKnown().isPresent) 1 else 0) +
            (if (currentBillingPeriodStartDate.asKnown().isPresent) 1 else 0) +
            (customer.asKnown().getOrNull()?.validity() ?: 0) +
            (if (defaultInvoiceMemo.asKnown().isPresent) 1 else 0) +
            (discountIntervals.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (fixedFeeQuantitySchedule.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (invoicingThreshold.asKnown().isPresent) 1 else 0) +
            (maximumIntervals.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (minimumIntervals.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (netTerms.asKnown().isPresent) 1 else 0) +
            (pendingSubscriptionChange.asKnown().getOrNull()?.validity() ?: 0) +
            (plan.asKnown().getOrNull()?.validity() ?: 0) +
            (priceIntervals.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (redeemedCoupon.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (trialInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (changedResources.asKnown().getOrNull()?.validity() ?: 0)

    class AdjustmentInterval
    private constructor(
        private val id: JsonField<String>,
        private val adjustment: JsonField<Adjustment>,
        private val appliesToPriceIntervalIds: JsonField<List<String>>,
        private val endDate: JsonField<OffsetDateTime>,
        private val startDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("adjustment")
            @ExcludeMissing
            adjustment: JsonField<Adjustment> = JsonMissing.of(),
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, adjustment, appliesToPriceIntervalIds, endDate, startDate, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

        /**
         * The price interval IDs that this adjustment applies to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /**
         * The end date of the adjustment interval.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

        /**
         * The start date of the adjustment interval.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [adjustment].
         *
         * Unlike [adjustment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("adjustment")
        @ExcludeMissing
        fun _adjustment(): JsonField<Adjustment> = adjustment

        /**
         * Returns the raw JSON value of [appliesToPriceIntervalIds].
         *
         * Unlike [appliesToPriceIntervalIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

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
             * Returns a mutable builder for constructing an instance of [AdjustmentInterval].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .adjustment()
             * .appliesToPriceIntervalIds()
             * .endDate()
             * .startDate()
             * ```
             */
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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun adjustment(adjustment: Adjustment) = adjustment(JsonField.of(adjustment))

            /**
             * Sets [Builder.adjustment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustment] with a well-typed [Adjustment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adjustment(adjustment: JsonField<Adjustment>) = apply {
                this.adjustment = adjustment
            }

            /** Alias for calling [adjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`. */
            fun adjustment(usageDiscount: Adjustment.UsageDiscount) =
                adjustment(Adjustment.ofUsageDiscount(usageDiscount))

            /**
             * Alias for calling [adjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`.
             */
            fun adjustment(amountDiscount: Adjustment.AmountDiscount) =
                adjustment(Adjustment.ofAmountDiscount(amountDiscount))

            /**
             * Alias for calling [adjustment] with
             * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
             */
            fun adjustment(percentageDiscount: Adjustment.PercentageDiscount) =
                adjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

            /** Alias for calling [adjustment] with `Adjustment.ofMinimum(minimum)`. */
            fun adjustment(minimum: Adjustment.Minimum) = adjustment(Adjustment.ofMinimum(minimum))

            /** Alias for calling [adjustment] with `Adjustment.ofMaximum(maximum)`. */
            fun adjustment(maximum: Adjustment.Maximum) = adjustment(Adjustment.ofMaximum(maximum))

            /** The price interval IDs that this adjustment applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /**
             * Sets [Builder.appliesToPriceIntervalIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesToPriceIntervalIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds =
                        appliesToPriceIntervalIds.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [appliesToPriceIntervalIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                appliesToPriceIntervalIds =
                    (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIntervalIds", it).add(appliesToPriceIntervalId)
                    }
            }

            /** The end date of the adjustment interval. */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** The start date of the adjustment interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [AdjustmentInterval].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .adjustment()
             * .appliesToPriceIntervalIds()
             * .endDate()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AdjustmentInterval =
                AdjustmentInterval(
                    checkRequired("id", id),
                    checkRequired("adjustment", adjustment),
                    checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                        it.toImmutable()
                    },
                    checkRequired("endDate", endDate),
                    checkRequired("startDate", startDate),
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (id.asKnown().isPresent) 1 else 0) +
                (adjustment.asKnown().getOrNull()?.validity() ?: 0) +
                (appliesToPriceIntervalIds.asKnown().getOrNull()?.size ?: 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0)

        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val usageDiscount: UsageDiscount? = null,
            private val amountDiscount: AmountDiscount? = null,
            private val percentageDiscount: PercentageDiscount? = null,
            private val minimum: Minimum? = null,
            private val maximum: Maximum? = null,
            private val _json: JsonValue? = null,
        ) {

            fun usageDiscount(): Optional<UsageDiscount> = Optional.ofNullable(usageDiscount)

            fun amountDiscount(): Optional<AmountDiscount> = Optional.ofNullable(amountDiscount)

            fun percentageDiscount(): Optional<PercentageDiscount> =
                Optional.ofNullable(percentageDiscount)

            fun minimum(): Optional<Minimum> = Optional.ofNullable(minimum)

            fun maximum(): Optional<Maximum> = Optional.ofNullable(maximum)

            fun isUsageDiscount(): Boolean = usageDiscount != null

            fun isAmountDiscount(): Boolean = amountDiscount != null

            fun isPercentageDiscount(): Boolean = percentageDiscount != null

            fun isMinimum(): Boolean = minimum != null

            fun isMaximum(): Boolean = maximum != null

            fun asUsageDiscount(): UsageDiscount = usageDiscount.getOrThrow("usageDiscount")

            fun asAmountDiscount(): AmountDiscount = amountDiscount.getOrThrow("amountDiscount")

            fun asPercentageDiscount(): PercentageDiscount =
                percentageDiscount.getOrThrow("percentageDiscount")

            fun asMinimum(): Minimum = minimum.getOrThrow("minimum")

            fun asMaximum(): Maximum = maximum.getOrThrow("maximum")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                    amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
                    percentageDiscount != null ->
                        visitor.visitPercentageDiscount(percentageDiscount)
                    minimum != null -> visitor.visitMinimum(minimum)
                    maximum != null -> visitor.visitMaximum(maximum)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Adjustment = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUsageDiscount(usageDiscount: UsageDiscount) {
                            usageDiscount.validate()
                        }

                        override fun visitAmountDiscount(amountDiscount: AmountDiscount) {
                            amountDiscount.validate()
                        }

                        override fun visitPercentageDiscount(
                            percentageDiscount: PercentageDiscount
                        ) {
                            percentageDiscount.validate()
                        }

                        override fun visitMinimum(minimum: Minimum) {
                            minimum.validate()
                        }

                        override fun visitMaximum(maximum: Maximum) {
                            maximum.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitUsageDiscount(usageDiscount: UsageDiscount) =
                            usageDiscount.validity()

                        override fun visitAmountDiscount(amountDiscount: AmountDiscount) =
                            amountDiscount.validity()

                        override fun visitPercentageDiscount(
                            percentageDiscount: PercentageDiscount
                        ) = percentageDiscount.validity()

                        override fun visitMinimum(minimum: Minimum) = minimum.validity()

                        override fun visitMaximum(maximum: Maximum) = maximum.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Adjustment && usageDiscount == other.usageDiscount && amountDiscount == other.amountDiscount && percentageDiscount == other.percentageDiscount && minimum == other.minimum && maximum == other.maximum /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(usageDiscount, amountDiscount, percentageDiscount, minimum, maximum) /* spotless:on */

            override fun toString(): String =
                when {
                    usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                    amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                    percentageDiscount != null ->
                        "Adjustment{percentageDiscount=$percentageDiscount}"
                    minimum != null -> "Adjustment{minimum=$minimum}"
                    maximum != null -> "Adjustment{maximum=$maximum}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                @JvmStatic
                fun ofUsageDiscount(usageDiscount: UsageDiscount) =
                    Adjustment(usageDiscount = usageDiscount)

                @JvmStatic
                fun ofAmountDiscount(amountDiscount: AmountDiscount) =
                    Adjustment(amountDiscount = amountDiscount)

                @JvmStatic
                fun ofPercentageDiscount(percentageDiscount: PercentageDiscount) =
                    Adjustment(percentageDiscount = percentageDiscount)

                @JvmStatic fun ofMinimum(minimum: Minimum) = Adjustment(minimum = minimum)

                @JvmStatic fun ofMaximum(maximum: Maximum) = Adjustment(maximum = maximum)
            }

            /**
             * An interface that defines how to map each variant of [Adjustment] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitUsageDiscount(usageDiscount: UsageDiscount): T

                fun visitAmountDiscount(amountDiscount: AmountDiscount): T

                fun visitPercentageDiscount(percentageDiscount: PercentageDiscount): T

                fun visitMinimum(minimum: Minimum): T

                fun visitMaximum(maximum: Maximum): T

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
                            return tryDeserialize(node, jacksonTypeRef<UsageDiscount>())?.let {
                                Adjustment(usageDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "amount_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<AmountDiscount>())?.let {
                                Adjustment(amountDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "percentage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<PercentageDiscount>())?.let {
                                Adjustment(percentageDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "minimum" -> {
                            return tryDeserialize(node, jacksonTypeRef<Minimum>())?.let {
                                Adjustment(minimum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "maximum" -> {
                            return tryDeserialize(node, jacksonTypeRef<Maximum>())?.let {
                                Adjustment(maximum = it, _json = json)
                            } ?: Adjustment(_json = json)
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
                        value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                        value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                        value.percentageDiscount != null ->
                            generator.writeObject(value.percentageDiscount)
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value.maximum != null -> generator.writeObject(value.maximum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }

            class UsageDiscount
            private constructor(
                private val id: JsonField<String>,
                private val adjustmentType: JsonValue,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val isInvoiceLevel: JsonField<Boolean>,
                private val planPhaseOrder: JsonField<Long>,
                private val reason: JsonField<String>,
                private val usageDiscount: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    adjustmentType: JsonValue = JsonMissing.of(),
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("is_invoice_level")
                    @ExcludeMissing
                    isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("plan_phase_order")
                    @ExcludeMissing
                    planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    usageDiscount: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    id,
                    adjustmentType,
                    appliesToPriceIds,
                    isInvoiceLevel,
                    planPhaseOrder,
                    reason,
                    usageDiscount,
                    mutableMapOf(),
                )

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("usage_discount")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonValue = adjustmentType

                /**
                 * The price IDs that this adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The plan phase in which this adjustment is active.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun planPhaseOrder(): Optional<Long> =
                    planPhaseOrder.getOptional("plan_phase_order")

                /**
                 * The reason for the adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun reason(): Optional<String> = reason.getOptional("reason")

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [appliesToPriceIds].
                 *
                 * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * Returns the raw JSON value of [isInvoiceLevel].
                 *
                 * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * Returns the raw JSON value of [planPhaseOrder].
                 *
                 * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /**
                 * Returns the raw JSON value of [reason].
                 *
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

                /**
                 * Returns the raw JSON value of [usageDiscount].
                 *
                 * Unlike [usageDiscount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("usage_discount")
                @ExcludeMissing
                fun _usageDiscount(): JsonField<Double> = usageDiscount

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
                     * Returns a mutable builder for constructing an instance of [UsageDiscount].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .appliesToPriceIds()
                     * .isInvoiceLevel()
                     * .planPhaseOrder()
                     * .reason()
                     * .usageDiscount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [UsageDiscount]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonValue = JsonValue.from("usage_discount")
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var usageDiscount: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(usageDiscount: UsageDiscount) = apply {
                        id = usageDiscount.id
                        adjustmentType = usageDiscount.adjustmentType
                        appliesToPriceIds =
                            usageDiscount.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = usageDiscount.isInvoiceLevel
                        planPhaseOrder = usageDiscount.planPhaseOrder
                        reason = usageDiscount.reason
                        this.usageDiscount = usageDiscount.usageDiscount
                        additionalProperties = usageDiscount.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("usage_discount")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun adjustmentType(adjustmentType: JsonValue) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.appliesToPriceIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [appliesToPriceIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
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
                     * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /**
                     * Alias for [Builder.planPhaseOrder].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /**
                     * Alias for calling [Builder.planPhaseOrder] with
                     * `planPhaseOrder.orElse(null)`.
                     */
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.getOrNull())

                    /**
                     * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.planPhaseOrder] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
                    fun reason(reason: Optional<String>) = reason(reason.getOrNull())

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                    /**
                     * The number of usage units by which to discount the price this adjustment
                     * applies to in a given billing period.
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Sets [Builder.usageDiscount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.usageDiscount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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

                    /**
                     * Returns an immutable instance of [UsageDiscount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .appliesToPriceIds()
                     * .isInvoiceLevel()
                     * .planPhaseOrder()
                     * .reason()
                     * .usageDiscount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): UsageDiscount =
                        UsageDiscount(
                            checkRequired("id", id),
                            adjustmentType,
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            checkRequired("usageDiscount", usageDiscount),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): UsageDiscount = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    _adjustmentType().let {
                        if (it != JsonValue.from("usage_discount")) {
                            throw OrbInvalidDataException(
                                "'adjustmentType' is invalid, received $it"
                            )
                        }
                    }
                    appliesToPriceIds()
                    isInvoiceLevel()
                    planPhaseOrder()
                    reason()
                    usageDiscount()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        adjustmentType.let {
                            if (it == JsonValue.from("usage_discount")) 1 else 0
                        } +
                        (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                        (if (isInvoiceLevel.asKnown().isPresent) 1 else 0) +
                        (if (planPhaseOrder.asKnown().isPresent) 1 else 0) +
                        (if (reason.asKnown().isPresent) 1 else 0) +
                        (if (usageDiscount.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is UsageDiscount && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && reason == other.reason && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, planPhaseOrder, reason, usageDiscount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UsageDiscount{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
            }

            class AmountDiscount
            private constructor(
                private val id: JsonField<String>,
                private val adjustmentType: JsonValue,
                private val amountDiscount: JsonField<String>,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val isInvoiceLevel: JsonField<Boolean>,
                private val planPhaseOrder: JsonField<Long>,
                private val reason: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    adjustmentType: JsonValue = JsonMissing.of(),
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    amountDiscount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("is_invoice_level")
                    @ExcludeMissing
                    isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("plan_phase_order")
                    @ExcludeMissing
                    planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    adjustmentType,
                    amountDiscount,
                    appliesToPriceIds,
                    isInvoiceLevel,
                    planPhaseOrder,
                    reason,
                    mutableMapOf(),
                )

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("amount_discount")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonValue = adjustmentType

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

                /**
                 * The price IDs that this adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The plan phase in which this adjustment is active.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun planPhaseOrder(): Optional<Long> =
                    planPhaseOrder.getOptional("plan_phase_order")

                /**
                 * The reason for the adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun reason(): Optional<String> = reason.getOptional("reason")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [amountDiscount].
                 *
                 * Unlike [amountDiscount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount(): JsonField<String> = amountDiscount

                /**
                 * Returns the raw JSON value of [appliesToPriceIds].
                 *
                 * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * Returns the raw JSON value of [isInvoiceLevel].
                 *
                 * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * Returns the raw JSON value of [planPhaseOrder].
                 *
                 * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /**
                 * Returns the raw JSON value of [reason].
                 *
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                     * Returns a mutable builder for constructing an instance of [AmountDiscount].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .amountDiscount()
                     * .appliesToPriceIds()
                     * .isInvoiceLevel()
                     * .planPhaseOrder()
                     * .reason()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AmountDiscount]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonValue = JsonValue.from("amount_discount")
                    private var amountDiscount: JsonField<String>? = null
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(amountDiscount: AmountDiscount) = apply {
                        id = amountDiscount.id
                        adjustmentType = amountDiscount.adjustmentType
                        this.amountDiscount = amountDiscount.amountDiscount
                        appliesToPriceIds =
                            amountDiscount.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = amountDiscount.isInvoiceLevel
                        planPhaseOrder = amountDiscount.planPhaseOrder
                        reason = amountDiscount.reason
                        additionalProperties = amountDiscount.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("amount_discount")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun adjustmentType(adjustmentType: JsonValue) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /**
                     * The amount by which to discount the prices this adjustment applies to in a
                     * given billing period.
                     */
                    fun amountDiscount(amountDiscount: String) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /**
                     * Sets [Builder.amountDiscount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amountDiscount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.appliesToPriceIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [appliesToPriceIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
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
                     * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /**
                     * Alias for [Builder.planPhaseOrder].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /**
                     * Alias for calling [Builder.planPhaseOrder] with
                     * `planPhaseOrder.orElse(null)`.
                     */
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.getOrNull())

                    /**
                     * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.planPhaseOrder] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
                    fun reason(reason: Optional<String>) = reason(reason.getOrNull())

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [AmountDiscount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .amountDiscount()
                     * .appliesToPriceIds()
                     * .isInvoiceLevel()
                     * .planPhaseOrder()
                     * .reason()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AmountDiscount =
                        AmountDiscount(
                            checkRequired("id", id),
                            adjustmentType,
                            checkRequired("amountDiscount", amountDiscount),
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AmountDiscount = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    _adjustmentType().let {
                        if (it != JsonValue.from("amount_discount")) {
                            throw OrbInvalidDataException(
                                "'adjustmentType' is invalid, received $it"
                            )
                        }
                    }
                    amountDiscount()
                    appliesToPriceIds()
                    isInvoiceLevel()
                    planPhaseOrder()
                    reason()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        adjustmentType.let {
                            if (it == JsonValue.from("amount_discount")) 1 else 0
                        } +
                        (if (amountDiscount.asKnown().isPresent) 1 else 0) +
                        (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                        (if (isInvoiceLevel.asKnown().isPresent) 1 else 0) +
                        (if (planPhaseOrder.asKnown().isPresent) 1 else 0) +
                        (if (reason.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AmountDiscount && id == other.id && adjustmentType == other.adjustmentType && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, amountDiscount, appliesToPriceIds, isInvoiceLevel, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AmountDiscount{id=$id, adjustmentType=$adjustmentType, amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }

            class PercentageDiscount
            private constructor(
                private val id: JsonField<String>,
                private val adjustmentType: JsonValue,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val isInvoiceLevel: JsonField<Boolean>,
                private val percentageDiscount: JsonField<Double>,
                private val planPhaseOrder: JsonField<Long>,
                private val reason: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    adjustmentType: JsonValue = JsonMissing.of(),
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("is_invoice_level")
                    @ExcludeMissing
                    isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    percentageDiscount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("plan_phase_order")
                    @ExcludeMissing
                    planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    adjustmentType,
                    appliesToPriceIds,
                    isInvoiceLevel,
                    percentageDiscount,
                    planPhaseOrder,
                    reason,
                    mutableMapOf(),
                )

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("percentage_discount")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonValue = adjustmentType

                /**
                 * The price IDs that this adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The percentage (as a value between 0 and 1) by which to discount the price
                 * intervals this adjustment applies to in a given billing period.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun percentageDiscount(): Double =
                    percentageDiscount.getRequired("percentage_discount")

                /**
                 * The plan phase in which this adjustment is active.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun planPhaseOrder(): Optional<Long> =
                    planPhaseOrder.getOptional("plan_phase_order")

                /**
                 * The reason for the adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun reason(): Optional<String> = reason.getOptional("reason")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [appliesToPriceIds].
                 *
                 * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * Returns the raw JSON value of [isInvoiceLevel].
                 *
                 * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * Returns the raw JSON value of [percentageDiscount].
                 *
                 * Unlike [percentageDiscount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount(): JsonField<Double> = percentageDiscount

                /**
                 * Returns the raw JSON value of [planPhaseOrder].
                 *
                 * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /**
                 * Returns the raw JSON value of [reason].
                 *
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                     * Returns a mutable builder for constructing an instance of
                     * [PercentageDiscount].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .appliesToPriceIds()
                     * .isInvoiceLevel()
                     * .percentageDiscount()
                     * .planPhaseOrder()
                     * .reason()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PercentageDiscount]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonValue = JsonValue.from("percentage_discount")
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var percentageDiscount: JsonField<Double>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(percentageDiscount: PercentageDiscount) = apply {
                        id = percentageDiscount.id
                        adjustmentType = percentageDiscount.adjustmentType
                        appliesToPriceIds =
                            percentageDiscount.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = percentageDiscount.isInvoiceLevel
                        this.percentageDiscount = percentageDiscount.percentageDiscount
                        planPhaseOrder = percentageDiscount.planPhaseOrder
                        reason = percentageDiscount.reason
                        additionalProperties =
                            percentageDiscount.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("percentage_discount")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun adjustmentType(adjustmentType: JsonValue) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.appliesToPriceIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [appliesToPriceIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
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
                     * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * Sets [Builder.percentageDiscount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentageDiscount] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /**
                     * Alias for [Builder.planPhaseOrder].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /**
                     * Alias for calling [Builder.planPhaseOrder] with
                     * `planPhaseOrder.orElse(null)`.
                     */
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.getOrNull())

                    /**
                     * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.planPhaseOrder] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
                    fun reason(reason: Optional<String>) = reason(reason.getOrNull())

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [PercentageDiscount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .appliesToPriceIds()
                     * .isInvoiceLevel()
                     * .percentageDiscount()
                     * .planPhaseOrder()
                     * .reason()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PercentageDiscount =
                        PercentageDiscount(
                            checkRequired("id", id),
                            adjustmentType,
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("percentageDiscount", percentageDiscount),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): PercentageDiscount = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    _adjustmentType().let {
                        if (it != JsonValue.from("percentage_discount")) {
                            throw OrbInvalidDataException(
                                "'adjustmentType' is invalid, received $it"
                            )
                        }
                    }
                    appliesToPriceIds()
                    isInvoiceLevel()
                    percentageDiscount()
                    planPhaseOrder()
                    reason()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        adjustmentType.let {
                            if (it == JsonValue.from("percentage_discount")) 1 else 0
                        } +
                        (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                        (if (isInvoiceLevel.asKnown().isPresent) 1 else 0) +
                        (if (percentageDiscount.asKnown().isPresent) 1 else 0) +
                        (if (planPhaseOrder.asKnown().isPresent) 1 else 0) +
                        (if (reason.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PercentageDiscount && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && percentageDiscount == other.percentageDiscount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, percentageDiscount, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PercentageDiscount{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, percentageDiscount=$percentageDiscount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }

            class Minimum
            private constructor(
                private val id: JsonField<String>,
                private val adjustmentType: JsonValue,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val isInvoiceLevel: JsonField<Boolean>,
                private val itemId: JsonField<String>,
                private val minimumAmount: JsonField<String>,
                private val planPhaseOrder: JsonField<Long>,
                private val reason: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    adjustmentType: JsonValue = JsonMissing.of(),
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("is_invoice_level")
                    @ExcludeMissing
                    isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    itemId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("minimum_amount")
                    @ExcludeMissing
                    minimumAmount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("plan_phase_order")
                    @ExcludeMissing
                    planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    adjustmentType,
                    appliesToPriceIds,
                    isInvoiceLevel,
                    itemId,
                    minimumAmount,
                    planPhaseOrder,
                    reason,
                    mutableMapOf(),
                )

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("minimum")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonValue = adjustmentType

                /**
                 * The price IDs that this adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The item ID that revenue from this minimum will be attributed to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * The minimum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

                /**
                 * The plan phase in which this adjustment is active.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun planPhaseOrder(): Optional<Long> =
                    planPhaseOrder.getOptional("plan_phase_order")

                /**
                 * The reason for the adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun reason(): Optional<String> = reason.getOptional("reason")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [appliesToPriceIds].
                 *
                 * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * Returns the raw JSON value of [isInvoiceLevel].
                 *
                 * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * Returns the raw JSON value of [itemId].
                 *
                 * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * Returns the raw JSON value of [minimumAmount].
                 *
                 * Unlike [minimumAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun _minimumAmount(): JsonField<String> = minimumAmount

                /**
                 * Returns the raw JSON value of [planPhaseOrder].
                 *
                 * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /**
                 * Returns the raw JSON value of [reason].
                 *
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                     * Returns a mutable builder for constructing an instance of [Minimum].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .appliesToPriceIds()
                     * .isInvoiceLevel()
                     * .itemId()
                     * .minimumAmount()
                     * .planPhaseOrder()
                     * .reason()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Minimum]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonValue = JsonValue.from("minimum")
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var itemId: JsonField<String>? = null
                    private var minimumAmount: JsonField<String>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(minimum: Minimum) = apply {
                        id = minimum.id
                        adjustmentType = minimum.adjustmentType
                        appliesToPriceIds = minimum.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = minimum.isInvoiceLevel
                        itemId = minimum.itemId
                        minimumAmount = minimum.minimumAmount
                        planPhaseOrder = minimum.planPhaseOrder
                        reason = minimum.reason
                        additionalProperties = minimum.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("minimum")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun adjustmentType(adjustmentType: JsonValue) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.appliesToPriceIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [appliesToPriceIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
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
                     * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun isInvoiceLevel(isInvoiceLevel: JsonField<Boolean>) = apply {
                        this.isInvoiceLevel = isInvoiceLevel
                    }

                    /** The item ID that revenue from this minimum will be attributed to. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /**
                     * Sets [Builder.itemId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itemId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * The minimum amount to charge in a given billing period for the prices this
                     * adjustment applies to.
                     */
                    fun minimumAmount(minimumAmount: String) =
                        minimumAmount(JsonField.of(minimumAmount))

                    /**
                     * Sets [Builder.minimumAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.minimumAmount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                        this.minimumAmount = minimumAmount
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /**
                     * Alias for [Builder.planPhaseOrder].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /**
                     * Alias for calling [Builder.planPhaseOrder] with
                     * `planPhaseOrder.orElse(null)`.
                     */
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.getOrNull())

                    /**
                     * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.planPhaseOrder] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
                    fun reason(reason: Optional<String>) = reason(reason.getOrNull())

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [Minimum].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .appliesToPriceIds()
                     * .isInvoiceLevel()
                     * .itemId()
                     * .minimumAmount()
                     * .planPhaseOrder()
                     * .reason()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Minimum =
                        Minimum(
                            checkRequired("id", id),
                            adjustmentType,
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("itemId", itemId),
                            checkRequired("minimumAmount", minimumAmount),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Minimum = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    _adjustmentType().let {
                        if (it != JsonValue.from("minimum")) {
                            throw OrbInvalidDataException(
                                "'adjustmentType' is invalid, received $it"
                            )
                        }
                    }
                    appliesToPriceIds()
                    isInvoiceLevel()
                    itemId()
                    minimumAmount()
                    planPhaseOrder()
                    reason()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        adjustmentType.let { if (it == JsonValue.from("minimum")) 1 else 0 } +
                        (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                        (if (isInvoiceLevel.asKnown().isPresent) 1 else 0) +
                        (if (itemId.asKnown().isPresent) 1 else 0) +
                        (if (minimumAmount.asKnown().isPresent) 1 else 0) +
                        (if (planPhaseOrder.asKnown().isPresent) 1 else 0) +
                        (if (reason.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Minimum && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && itemId == other.itemId && minimumAmount == other.minimumAmount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, itemId, minimumAmount, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Minimum{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, itemId=$itemId, minimumAmount=$minimumAmount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
            }

            class Maximum
            private constructor(
                private val id: JsonField<String>,
                private val adjustmentType: JsonValue,
                private val appliesToPriceIds: JsonField<List<String>>,
                private val isInvoiceLevel: JsonField<Boolean>,
                private val maximumAmount: JsonField<String>,
                private val planPhaseOrder: JsonField<Long>,
                private val reason: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("adjustment_type")
                    @ExcludeMissing
                    adjustmentType: JsonValue = JsonMissing.of(),
                    @JsonProperty("applies_to_price_ids")
                    @ExcludeMissing
                    appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("is_invoice_level")
                    @ExcludeMissing
                    isInvoiceLevel: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("maximum_amount")
                    @ExcludeMissing
                    maximumAmount: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("plan_phase_order")
                    @ExcludeMissing
                    planPhaseOrder: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("reason")
                    @ExcludeMissing
                    reason: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    adjustmentType,
                    appliesToPriceIds,
                    isInvoiceLevel,
                    maximumAmount,
                    planPhaseOrder,
                    reason,
                    mutableMapOf(),
                )

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Expected to always return the following:
                 * ```java
                 * JsonValue.from("maximum")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("adjustment_type")
                @ExcludeMissing
                fun _adjustmentType(): JsonValue = adjustmentType

                /**
                 * The price IDs that this adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun appliesToPriceIds(): List<String> =
                    appliesToPriceIds.getRequired("applies_to_price_ids")

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun isInvoiceLevel(): Boolean = isInvoiceLevel.getRequired("is_invoice_level")

                /**
                 * The maximum amount to charge in a given billing period for the prices this
                 * adjustment applies to.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

                /**
                 * The plan phase in which this adjustment is active.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun planPhaseOrder(): Optional<Long> =
                    planPhaseOrder.getOptional("plan_phase_order")

                /**
                 * The reason for the adjustment.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun reason(): Optional<String> = reason.getOptional("reason")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [appliesToPriceIds].
                 *
                 * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

                /**
                 * Returns the raw JSON value of [isInvoiceLevel].
                 *
                 * Unlike [isInvoiceLevel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("is_invoice_level")
                @ExcludeMissing
                fun _isInvoiceLevel(): JsonField<Boolean> = isInvoiceLevel

                /**
                 * Returns the raw JSON value of [maximumAmount].
                 *
                 * Unlike [maximumAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun _maximumAmount(): JsonField<String> = maximumAmount

                /**
                 * Returns the raw JSON value of [planPhaseOrder].
                 *
                 * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("plan_phase_order")
                @ExcludeMissing
                fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

                /**
                 * Returns the raw JSON value of [reason].
                 *
                 * Unlike [reason], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                     * Returns a mutable builder for constructing an instance of [Maximum].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .appliesToPriceIds()
                     * .isInvoiceLevel()
                     * .maximumAmount()
                     * .planPhaseOrder()
                     * .reason()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Maximum]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var adjustmentType: JsonValue = JsonValue.from("maximum")
                    private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                    private var isInvoiceLevel: JsonField<Boolean>? = null
                    private var maximumAmount: JsonField<String>? = null
                    private var planPhaseOrder: JsonField<Long>? = null
                    private var reason: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(maximum: Maximum) = apply {
                        id = maximum.id
                        adjustmentType = maximum.adjustmentType
                        appliesToPriceIds = maximum.appliesToPriceIds.map { it.toMutableList() }
                        isInvoiceLevel = maximum.isInvoiceLevel
                        maximumAmount = maximum.maximumAmount
                        planPhaseOrder = maximum.planPhaseOrder
                        reason = maximum.reason
                        additionalProperties = maximum.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```java
                     * JsonValue.from("maximum")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun adjustmentType(adjustmentType: JsonValue) = apply {
                        this.adjustmentType = adjustmentType
                    }

                    /** The price IDs that this adjustment applies to. */
                    fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                        appliesToPriceIds(JsonField.of(appliesToPriceIds))

                    /**
                     * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.appliesToPriceIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                        this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [appliesToPriceIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
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
                     * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * Sets [Builder.maximumAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maximumAmount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** The plan phase in which this adjustment is active. */
                    fun planPhaseOrder(planPhaseOrder: Long?) =
                        planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

                    /**
                     * Alias for [Builder.planPhaseOrder].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun planPhaseOrder(planPhaseOrder: Long) =
                        planPhaseOrder(planPhaseOrder as Long?)

                    /**
                     * Alias for calling [Builder.planPhaseOrder] with
                     * `planPhaseOrder.orElse(null)`.
                     */
                    fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                        planPhaseOrder(planPhaseOrder.getOrNull())

                    /**
                     * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.planPhaseOrder] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                        this.planPhaseOrder = planPhaseOrder
                    }

                    /** The reason for the adjustment. */
                    fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

                    /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
                    fun reason(reason: Optional<String>) = reason(reason.getOrNull())

                    /**
                     * Sets [Builder.reason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reason] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [Maximum].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .appliesToPriceIds()
                     * .isInvoiceLevel()
                     * .maximumAmount()
                     * .planPhaseOrder()
                     * .reason()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Maximum =
                        Maximum(
                            checkRequired("id", id),
                            adjustmentType,
                            checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                                it.toImmutable()
                            },
                            checkRequired("isInvoiceLevel", isInvoiceLevel),
                            checkRequired("maximumAmount", maximumAmount),
                            checkRequired("planPhaseOrder", planPhaseOrder),
                            checkRequired("reason", reason),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Maximum = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    _adjustmentType().let {
                        if (it != JsonValue.from("maximum")) {
                            throw OrbInvalidDataException(
                                "'adjustmentType' is invalid, received $it"
                            )
                        }
                    }
                    appliesToPriceIds()
                    isInvoiceLevel()
                    maximumAmount()
                    planPhaseOrder()
                    reason()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        adjustmentType.let { if (it == JsonValue.from("maximum")) 1 else 0 } +
                        (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                        (if (isInvoiceLevel.asKnown().isPresent) 1 else 0) +
                        (if (maximumAmount.asKnown().isPresent) 1 else 0) +
                        (if (planPhaseOrder.asKnown().isPresent) 1 else 0) +
                        (if (reason.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Maximum && id == other.id && adjustmentType == other.adjustmentType && appliesToPriceIds == other.appliesToPriceIds && isInvoiceLevel == other.isInvoiceLevel && maximumAmount == other.maximumAmount && planPhaseOrder == other.planPhaseOrder && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, adjustmentType, appliesToPriceIds, isInvoiceLevel, maximumAmount, planPhaseOrder, reason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Maximum{id=$id, adjustmentType=$adjustmentType, appliesToPriceIds=$appliesToPriceIds, isInvoiceLevel=$isInvoiceLevel, maximumAmount=$maximumAmount, planPhaseOrder=$planPhaseOrder, reason=$reason, additionalProperties=$additionalProperties}"
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

    class BillingCycleAnchorConfiguration
    private constructor(
        private val day: JsonField<Long>,
        private val month: JsonField<Long>,
        private val year: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("day") @ExcludeMissing day: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("month") @ExcludeMissing month: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("year") @ExcludeMissing year: JsonField<Long> = JsonMissing.of(),
        ) : this(day, month, year, mutableMapOf())

        /**
         * The day of the month on which the billing cycle is anchored. If the maximum number of
         * days in a month is greater than this value, the last day of the month is the billing
         * cycle day (e.g. billing_cycle_day=31 for April means the billing period begins on the
         * 30th.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun day(): Long = day.getRequired("day")

        /**
         * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
         * February would have cycles starting February, May, August, and November).
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun month(): Optional<Long> = month.getOptional("month")

        /**
         * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored on
         * 2021 would have cycles starting on 2021, 2023, 2025, etc.).
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun year(): Optional<Long> = year.getOptional("year")

        /**
         * Returns the raw JSON value of [day].
         *
         * Unlike [day], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("day") @ExcludeMissing fun _day(): JsonField<Long> = day

        /**
         * Returns the raw JSON value of [month].
         *
         * Unlike [month], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<Long> = month

        /**
         * Returns the raw JSON value of [year].
         *
         * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Long> = year

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
             * Returns a mutable builder for constructing an instance of
             * [BillingCycleAnchorConfiguration].
             *
             * The following fields are required:
             * ```java
             * .day()
             * ```
             */
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
             * Sets [Builder.day] to an arbitrary JSON value.
             *
             * You should usually call [Builder.day] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun day(day: JsonField<Long>) = apply { this.day = day }

            /**
             * The month on which the billing cycle is anchored (e.g. a quarterly price anchored in
             * February would have cycles starting February, May, August, and November).
             */
            fun month(month: Long?) = month(JsonField.ofNullable(month))

            /**
             * Alias for [Builder.month].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun month(month: Long) = month(month as Long?)

            /** Alias for calling [Builder.month] with `month.orElse(null)`. */
            fun month(month: Optional<Long>) = month(month.getOrNull())

            /**
             * Sets [Builder.month] to an arbitrary JSON value.
             *
             * You should usually call [Builder.month] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun month(month: JsonField<Long>) = apply { this.month = month }

            /**
             * The year on which the billing cycle is anchored (e.g. a 2 year billing cycle anchored
             * on 2021 would have cycles starting on 2021, 2023, 2025, etc.).
             */
            fun year(year: Long?) = year(JsonField.ofNullable(year))

            /**
             * Alias for [Builder.year].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun year(year: Long) = year(year as Long?)

            /** Alias for calling [Builder.year] with `year.orElse(null)`. */
            fun year(year: Optional<Long>) = year(year.getOrNull())

            /**
             * Sets [Builder.year] to an arbitrary JSON value.
             *
             * You should usually call [Builder.year] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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

            /**
             * Returns an immutable instance of [BillingCycleAnchorConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .day()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BillingCycleAnchorConfiguration =
                BillingCycleAnchorConfiguration(
                    checkRequired("day", day),
                    month,
                    year,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (day.asKnown().isPresent) 1 else 0) +
                (if (month.asKnown().isPresent) 1 else 0) +
                (if (year.asKnown().isPresent) 1 else 0)

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
        private val amount: Amount? = null,
        private val percentage: Percentage? = null,
        private val usage: Usage? = null,
        private val _json: JsonValue? = null,
    ) {

        fun amount(): Optional<Amount> = Optional.ofNullable(amount)

        fun percentage(): Optional<Percentage> = Optional.ofNullable(percentage)

        fun usage(): Optional<Usage> = Optional.ofNullable(usage)

        fun isAmount(): Boolean = amount != null

        fun isPercentage(): Boolean = percentage != null

        fun isUsage(): Boolean = usage != null

        fun asAmount(): Amount = amount.getOrThrow("amount")

        fun asPercentage(): Percentage = percentage.getOrThrow("percentage")

        fun asUsage(): Usage = usage.getOrThrow("usage")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                amount != null -> visitor.visitAmount(amount)
                percentage != null -> visitor.visitPercentage(percentage)
                usage != null -> visitor.visitUsage(usage)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): DiscountInterval = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAmount(amount: Amount) {
                        amount.validate()
                    }

                    override fun visitPercentage(percentage: Percentage) {
                        percentage.validate()
                    }

                    override fun visitUsage(usage: Usage) {
                        usage.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitAmount(amount: Amount) = amount.validity()

                    override fun visitPercentage(percentage: Percentage) = percentage.validity()

                    override fun visitUsage(usage: Usage) = usage.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

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

            @JvmStatic fun ofAmount(amount: Amount) = DiscountInterval(amount = amount)

            @JvmStatic
            fun ofPercentage(percentage: Percentage) = DiscountInterval(percentage = percentage)

            @JvmStatic fun ofUsage(usage: Usage) = DiscountInterval(usage = usage)
        }

        /**
         * An interface that defines how to map each variant of [DiscountInterval] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitAmount(amount: Amount): T

            fun visitPercentage(percentage: Percentage): T

            fun visitUsage(usage: Usage): T

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
                        return tryDeserialize(node, jacksonTypeRef<Amount>())?.let {
                            DiscountInterval(amount = it, _json = json)
                        } ?: DiscountInterval(_json = json)
                    }
                    "percentage" -> {
                        return tryDeserialize(node, jacksonTypeRef<Percentage>())?.let {
                            DiscountInterval(percentage = it, _json = json)
                        } ?: DiscountInterval(_json = json)
                    }
                    "usage" -> {
                        return tryDeserialize(node, jacksonTypeRef<Usage>())?.let {
                            DiscountInterval(usage = it, _json = json)
                        } ?: DiscountInterval(_json = json)
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

        class Amount
        private constructor(
            private val amountDiscount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val appliesToPriceIntervalIds: JsonField<List<String>>,
            private val discountType: JsonValue,
            private val endDate: JsonField<OffsetDateTime>,
            private val startDate: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount_discount")
                @ExcludeMissing
                amountDiscount: JsonField<String> = JsonMissing.of(),
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("applies_to_price_interval_ids")
                @ExcludeMissing
                appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("discount_type")
                @ExcludeMissing
                discountType: JsonValue = JsonMissing.of(),
                @JsonProperty("end_date")
                @ExcludeMissing
                endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("start_date")
                @ExcludeMissing
                startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                amountDiscount,
                appliesToPriceIds,
                appliesToPriceIntervalIds,
                discountType,
                endDate,
                startDate,
                mutableMapOf(),
            )

            /**
             * Only available if discount_type is `amount`.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amountDiscount(): String = amountDiscount.getRequired("amount_discount")

            /**
             * The price ids that this discount interval applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * The price interval ids that this discount interval applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("amount")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonValue = discountType

            /**
             * The end date of the discount interval.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

            /**
             * The start date of the discount interval.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /**
             * Returns the raw JSON value of [amountDiscount].
             *
             * Unlike [amountDiscount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("amount_discount")
            @ExcludeMissing
            fun _amountDiscount(): JsonField<String> = amountDiscount

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * Returns the raw JSON value of [appliesToPriceIntervalIds].
             *
             * Unlike [appliesToPriceIntervalIds], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

            /**
             * Returns the raw JSON value of [endDate].
             *
             * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /**
             * Returns the raw JSON value of [startDate].
             *
             * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

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
                 * Returns a mutable builder for constructing an instance of [Amount].
                 *
                 * The following fields are required:
                 * ```java
                 * .amountDiscount()
                 * .appliesToPriceIds()
                 * .appliesToPriceIntervalIds()
                 * .endDate()
                 * .startDate()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Amount]. */
            class Builder internal constructor() {

                private var amountDiscount: JsonField<String>? = null
                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
                private var discountType: JsonValue = JsonValue.from("amount")
                private var endDate: JsonField<OffsetDateTime>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(amount: Amount) = apply {
                    amountDiscount = amount.amountDiscount
                    appliesToPriceIds = amount.appliesToPriceIds.map { it.toMutableList() }
                    appliesToPriceIntervalIds =
                        amount.appliesToPriceIntervalIds.map { it.toMutableList() }
                    discountType = amount.discountType
                    endDate = amount.endDate
                    startDate = amount.startDate
                    additionalProperties = amount.additionalProperties.toMutableMap()
                }

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                /**
                 * Sets [Builder.amountDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amountDiscount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun amountDiscount(amountDiscount: JsonField<String>) = apply {
                    this.amountDiscount = amountDiscount
                }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /**
                 * Sets [Builder.appliesToPriceIntervalIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIntervalIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds =
                            appliesToPriceIntervalIds.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [String] to [appliesToPriceIntervalIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                    appliesToPriceIntervalIds =
                        (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIntervalIds", it)
                                .add(appliesToPriceIntervalId)
                        }
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("amount")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun discountType(discountType: JsonValue) = apply {
                    this.discountType = discountType
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

                /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
                fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

                /**
                 * Sets [Builder.endDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /**
                 * Sets [Builder.startDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Amount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amountDiscount()
                 * .appliesToPriceIds()
                 * .appliesToPriceIntervalIds()
                 * .endDate()
                 * .startDate()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Amount =
                    Amount(
                        checkRequired("amountDiscount", amountDiscount),
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                            it.toImmutable()
                        },
                        discountType,
                        checkRequired("endDate", endDate),
                        checkRequired("startDate", startDate),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Amount = apply {
                if (validated) {
                    return@apply
                }

                amountDiscount()
                appliesToPriceIds()
                appliesToPriceIntervalIds()
                _discountType().let {
                    if (it != JsonValue.from("amount")) {
                        throw OrbInvalidDataException("'discountType' is invalid, received $it")
                    }
                }
                endDate()
                startDate()
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
                (if (amountDiscount.asKnown().isPresent) 1 else 0) +
                    (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                    (appliesToPriceIntervalIds.asKnown().getOrNull()?.size ?: 0) +
                    discountType.let { if (it == JsonValue.from("amount")) 1 else 0 } +
                    (if (endDate.asKnown().isPresent) 1 else 0) +
                    (if (startDate.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Amount && amountDiscount == other.amountDiscount && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && discountType == other.discountType && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amountDiscount, appliesToPriceIds, appliesToPriceIntervalIds, discountType, endDate, startDate, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Amount{amountDiscount=$amountDiscount, appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, discountType=$discountType, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
        }

        class Percentage
        private constructor(
            private val appliesToPriceIds: JsonField<List<String>>,
            private val appliesToPriceIntervalIds: JsonField<List<String>>,
            private val discountType: JsonValue,
            private val endDate: JsonField<OffsetDateTime>,
            private val percentageDiscount: JsonField<Double>,
            private val startDate: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("applies_to_price_interval_ids")
                @ExcludeMissing
                appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("discount_type")
                @ExcludeMissing
                discountType: JsonValue = JsonMissing.of(),
                @JsonProperty("end_date")
                @ExcludeMissing
                endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                percentageDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("start_date")
                @ExcludeMissing
                startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                appliesToPriceIds,
                appliesToPriceIntervalIds,
                discountType,
                endDate,
                percentageDiscount,
                startDate,
                mutableMapOf(),
            )

            /**
             * The price ids that this discount interval applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * The price interval ids that this discount interval applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("percentage")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonValue = discountType

            /**
             * The end date of the discount interval.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

            /**
             * Only available if discount_type is `percentage`.This is a number between 0 and 1.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            /**
             * The start date of the discount interval.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * Returns the raw JSON value of [appliesToPriceIntervalIds].
             *
             * Unlike [appliesToPriceIntervalIds], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

            /**
             * Returns the raw JSON value of [endDate].
             *
             * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /**
             * Returns the raw JSON value of [percentageDiscount].
             *
             * Unlike [percentageDiscount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("percentage_discount")
            @ExcludeMissing
            fun _percentageDiscount(): JsonField<Double> = percentageDiscount

            /**
             * Returns the raw JSON value of [startDate].
             *
             * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

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
                 * Returns a mutable builder for constructing an instance of [Percentage].
                 *
                 * The following fields are required:
                 * ```java
                 * .appliesToPriceIds()
                 * .appliesToPriceIntervalIds()
                 * .endDate()
                 * .percentageDiscount()
                 * .startDate()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Percentage]. */
            class Builder internal constructor() {

                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
                private var discountType: JsonValue = JsonValue.from("percentage")
                private var endDate: JsonField<OffsetDateTime>? = null
                private var percentageDiscount: JsonField<Double>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(percentage: Percentage) = apply {
                    appliesToPriceIds = percentage.appliesToPriceIds.map { it.toMutableList() }
                    appliesToPriceIntervalIds =
                        percentage.appliesToPriceIntervalIds.map { it.toMutableList() }
                    discountType = percentage.discountType
                    endDate = percentage.endDate
                    percentageDiscount = percentage.percentageDiscount
                    startDate = percentage.startDate
                    additionalProperties = percentage.additionalProperties.toMutableMap()
                }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /**
                 * Sets [Builder.appliesToPriceIntervalIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIntervalIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds =
                            appliesToPriceIntervalIds.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [String] to [appliesToPriceIntervalIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                    appliesToPriceIntervalIds =
                        (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIntervalIds", it)
                                .add(appliesToPriceIntervalId)
                        }
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("percentage")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun discountType(discountType: JsonValue) = apply {
                    this.discountType = discountType
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

                /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
                fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

                /**
                 * Sets [Builder.endDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /**
                 * Only available if discount_type is `percentage`.This is a number between 0 and 1.
                 */
                fun percentageDiscount(percentageDiscount: Double) =
                    percentageDiscount(JsonField.of(percentageDiscount))

                /**
                 * Sets [Builder.percentageDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.percentageDiscount] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                    this.percentageDiscount = percentageDiscount
                }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /**
                 * Sets [Builder.startDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Percentage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .appliesToPriceIds()
                 * .appliesToPriceIntervalIds()
                 * .endDate()
                 * .percentageDiscount()
                 * .startDate()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Percentage =
                    Percentage(
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                            it.toImmutable()
                        },
                        discountType,
                        checkRequired("endDate", endDate),
                        checkRequired("percentageDiscount", percentageDiscount),
                        checkRequired("startDate", startDate),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Percentage = apply {
                if (validated) {
                    return@apply
                }

                appliesToPriceIds()
                appliesToPriceIntervalIds()
                _discountType().let {
                    if (it != JsonValue.from("percentage")) {
                        throw OrbInvalidDataException("'discountType' is invalid, received $it")
                    }
                }
                endDate()
                percentageDiscount()
                startDate()
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
                (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                    (appliesToPriceIntervalIds.asKnown().getOrNull()?.size ?: 0) +
                    discountType.let { if (it == JsonValue.from("percentage")) 1 else 0 } +
                    (if (endDate.asKnown().isPresent) 1 else 0) +
                    (if (percentageDiscount.asKnown().isPresent) 1 else 0) +
                    (if (startDate.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Percentage && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && discountType == other.discountType && endDate == other.endDate && percentageDiscount == other.percentageDiscount && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, appliesToPriceIntervalIds, discountType, endDate, percentageDiscount, startDate, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Percentage{appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, discountType=$discountType, endDate=$endDate, percentageDiscount=$percentageDiscount, startDate=$startDate, additionalProperties=$additionalProperties}"
        }

        class Usage
        private constructor(
            private val appliesToPriceIds: JsonField<List<String>>,
            private val appliesToPriceIntervalIds: JsonField<List<String>>,
            private val discountType: JsonValue,
            private val endDate: JsonField<OffsetDateTime>,
            private val startDate: JsonField<OffsetDateTime>,
            private val usageDiscount: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("applies_to_price_interval_ids")
                @ExcludeMissing
                appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("discount_type")
                @ExcludeMissing
                discountType: JsonValue = JsonMissing.of(),
                @JsonProperty("end_date")
                @ExcludeMissing
                endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("start_date")
                @ExcludeMissing
                startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("usage_discount")
                @ExcludeMissing
                usageDiscount: JsonField<Double> = JsonMissing.of(),
            ) : this(
                appliesToPriceIds,
                appliesToPriceIntervalIds,
                discountType,
                endDate,
                startDate,
                usageDiscount,
                mutableMapOf(),
            )

            /**
             * The price ids that this discount interval applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * The price interval ids that this discount interval applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun appliesToPriceIntervalIds(): List<String> =
                appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("usage")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("discount_type")
            @ExcludeMissing
            fun _discountType(): JsonValue = discountType

            /**
             * The end date of the discount interval.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

            /**
             * The start date of the discount interval.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

            /**
             * Only available if discount_type is `usage`. Number of usage units that this discount
             * is for
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

            /**
             * Returns the raw JSON value of [appliesToPriceIds].
             *
             * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

            /**
             * Returns the raw JSON value of [appliesToPriceIntervalIds].
             *
             * Unlike [appliesToPriceIntervalIds], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

            /**
             * Returns the raw JSON value of [endDate].
             *
             * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /**
             * Returns the raw JSON value of [startDate].
             *
             * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

            /**
             * Returns the raw JSON value of [usageDiscount].
             *
             * Unlike [usageDiscount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usage_discount")
            @ExcludeMissing
            fun _usageDiscount(): JsonField<Double> = usageDiscount

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
                 * Returns a mutable builder for constructing an instance of [Usage].
                 *
                 * The following fields are required:
                 * ```java
                 * .appliesToPriceIds()
                 * .appliesToPriceIntervalIds()
                 * .endDate()
                 * .startDate()
                 * .usageDiscount()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Usage]. */
            class Builder internal constructor() {

                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var appliesToPriceIntervalIds: JsonField<MutableList<String>>? = null
                private var discountType: JsonValue = JsonValue.from("usage")
                private var endDate: JsonField<OffsetDateTime>? = null
                private var startDate: JsonField<OffsetDateTime>? = null
                private var usageDiscount: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(usage: Usage) = apply {
                    appliesToPriceIds = usage.appliesToPriceIds.map { it.toMutableList() }
                    appliesToPriceIntervalIds =
                        usage.appliesToPriceIntervalIds.map { it.toMutableList() }
                    discountType = usage.discountType
                    endDate = usage.endDate
                    startDate = usage.startDate
                    usageDiscount = usage.usageDiscount
                    additionalProperties = usage.additionalProperties.toMutableMap()
                }

                /** The price ids that this discount interval applies to. */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [appliesToPriceIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                    appliesToPriceIds =
                        (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                        }
                }

                /** The price interval ids that this discount interval applies to. */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                    appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

                /**
                 * Sets [Builder.appliesToPriceIntervalIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.appliesToPriceIntervalIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                    apply {
                        this.appliesToPriceIntervalIds =
                            appliesToPriceIntervalIds.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [String] to [appliesToPriceIntervalIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                    appliesToPriceIntervalIds =
                        (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("appliesToPriceIntervalIds", it)
                                .add(appliesToPriceIntervalId)
                        }
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("usage")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun discountType(discountType: JsonValue) = apply {
                    this.discountType = discountType
                }

                /** The end date of the discount interval. */
                fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

                /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
                fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

                /**
                 * Sets [Builder.endDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /** The start date of the discount interval. */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /**
                 * Sets [Builder.startDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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
                 * Sets [Builder.usageDiscount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usageDiscount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [Usage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .appliesToPriceIds()
                 * .appliesToPriceIntervalIds()
                 * .endDate()
                 * .startDate()
                 * .usageDiscount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Usage =
                    Usage(
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                            it.toImmutable()
                        },
                        discountType,
                        checkRequired("endDate", endDate),
                        checkRequired("startDate", startDate),
                        checkRequired("usageDiscount", usageDiscount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Usage = apply {
                if (validated) {
                    return@apply
                }

                appliesToPriceIds()
                appliesToPriceIntervalIds()
                _discountType().let {
                    if (it != JsonValue.from("usage")) {
                        throw OrbInvalidDataException("'discountType' is invalid, received $it")
                    }
                }
                endDate()
                startDate()
                usageDiscount()
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
                (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                    (appliesToPriceIntervalIds.asKnown().getOrNull()?.size ?: 0) +
                    discountType.let { if (it == JsonValue.from("usage")) 1 else 0 } +
                    (if (endDate.asKnown().isPresent) 1 else 0) +
                    (if (startDate.asKnown().isPresent) 1 else 0) +
                    (if (usageDiscount.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Usage && appliesToPriceIds == other.appliesToPriceIds && appliesToPriceIntervalIds == other.appliesToPriceIntervalIds && discountType == other.discountType && endDate == other.endDate && startDate == other.startDate && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, appliesToPriceIntervalIds, discountType, endDate, startDate, usageDiscount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Usage{appliesToPriceIds=$appliesToPriceIds, appliesToPriceIntervalIds=$appliesToPriceIntervalIds, discountType=$discountType, endDate=$endDate, startDate=$startDate, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
        }
    }

    class FixedFeeQuantitySchedule
    private constructor(
        private val endDate: JsonField<OffsetDateTime>,
        private val priceId: JsonField<String>,
        private val quantity: JsonField<Double>,
        private val startDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(endDate, priceId, quantity, startDate, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun priceId(): String = priceId.getRequired("price_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Double = quantity.getRequired("quantity")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [priceId].
         *
         * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

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
             * Returns a mutable builder for constructing an instance of [FixedFeeQuantitySchedule].
             *
             * The following fields are required:
             * ```java
             * .endDate()
             * .priceId()
             * .quantity()
             * .startDate()
             * ```
             */
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

            /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            /**
             * Sets [Builder.priceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [FixedFeeQuantitySchedule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endDate()
             * .priceId()
             * .quantity()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FixedFeeQuantitySchedule =
                FixedFeeQuantitySchedule(
                    checkRequired("endDate", endDate),
                    checkRequired("priceId", priceId),
                    checkRequired("quantity", quantity),
                    checkRequired("startDate", startDate),
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (priceId.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0)

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

    class MaximumInterval
    private constructor(
        private val appliesToPriceIds: JsonField<List<String>>,
        private val appliesToPriceIntervalIds: JsonField<List<String>>,
        private val endDate: JsonField<OffsetDateTime>,
        private val maximumAmount: JsonField<String>,
        private val startDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            maximumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            appliesToPriceIds,
            appliesToPriceIntervalIds,
            endDate,
            maximumAmount,
            startDate,
            mutableMapOf(),
        )

        /**
         * The price ids that this maximum interval applies to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * The price interval ids that this maximum interval applies to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /**
         * The end date of the maximum interval.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

        /**
         * The maximum amount to charge in a given billing period for the price intervals this
         * transform applies to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /**
         * The start date of the maximum interval.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /**
         * Returns the raw JSON value of [appliesToPriceIds].
         *
         * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * Returns the raw JSON value of [appliesToPriceIntervalIds].
         *
         * Unlike [appliesToPriceIntervalIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [maximumAmount].
         *
         * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

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
             * Returns a mutable builder for constructing an instance of [MaximumInterval].
             *
             * The following fields are required:
             * ```java
             * .appliesToPriceIds()
             * .appliesToPriceIntervalIds()
             * .endDate()
             * .maximumAmount()
             * .startDate()
             * ```
             */
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

            /**
             * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesToPriceIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [appliesToPriceIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /** The price interval ids that this maximum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /**
             * Sets [Builder.appliesToPriceIntervalIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesToPriceIntervalIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds =
                        appliesToPriceIntervalIds.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [appliesToPriceIntervalIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                appliesToPriceIntervalIds =
                    (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIntervalIds", it).add(appliesToPriceIntervalId)
                    }
            }

            /** The end date of the maximum interval. */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * The maximum amount to charge in a given billing period for the price intervals this
             * transform applies to.
             */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /**
             * Sets [Builder.maximumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /** The start date of the maximum interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [MaximumInterval].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .appliesToPriceIds()
             * .appliesToPriceIntervalIds()
             * .endDate()
             * .maximumAmount()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): MaximumInterval =
                MaximumInterval(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                        it.toImmutable()
                    },
                    checkRequired("endDate", endDate),
                    checkRequired("maximumAmount", maximumAmount),
                    checkRequired("startDate", startDate),
                    additionalProperties.toMutableMap(),
                )
        }

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
            (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                (appliesToPriceIntervalIds.asKnown().getOrNull()?.size ?: 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (maximumAmount.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0)

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
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

    class MinimumInterval
    private constructor(
        private val appliesToPriceIds: JsonField<List<String>>,
        private val appliesToPriceIntervalIds: JsonField<List<String>>,
        private val endDate: JsonField<OffsetDateTime>,
        private val minimumAmount: JsonField<String>,
        private val startDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applies_to_price_interval_ids")
            @ExcludeMissing
            appliesToPriceIntervalIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            minimumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            appliesToPriceIds,
            appliesToPriceIntervalIds,
            endDate,
            minimumAmount,
            startDate,
            mutableMapOf(),
        )

        /**
         * The price ids that this minimum interval applies to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * The price interval ids that this minimum interval applies to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun appliesToPriceIntervalIds(): List<String> =
            appliesToPriceIntervalIds.getRequired("applies_to_price_interval_ids")

        /**
         * The end date of the minimum interval.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

        /**
         * The minimum amount to charge in a given billing period for the price intervals this
         * minimum applies to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /**
         * The start date of the minimum interval.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /**
         * Returns the raw JSON value of [appliesToPriceIds].
         *
         * Unlike [appliesToPriceIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds(): JsonField<List<String>> = appliesToPriceIds

        /**
         * Returns the raw JSON value of [appliesToPriceIntervalIds].
         *
         * Unlike [appliesToPriceIntervalIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applies_to_price_interval_ids")
        @ExcludeMissing
        fun _appliesToPriceIntervalIds(): JsonField<List<String>> = appliesToPriceIntervalIds

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [minimumAmount].
         *
         * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

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
             * Returns a mutable builder for constructing an instance of [MinimumInterval].
             *
             * The following fields are required:
             * ```java
             * .appliesToPriceIds()
             * .appliesToPriceIntervalIds()
             * .endDate()
             * .minimumAmount()
             * .startDate()
             * ```
             */
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

            /**
             * Sets [Builder.appliesToPriceIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesToPriceIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [appliesToPriceIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAppliesToPriceId(appliesToPriceId: String) = apply {
                appliesToPriceIds =
                    (appliesToPriceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIds", it).add(appliesToPriceId)
                    }
            }

            /** The price interval ids that this minimum interval applies to. */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: List<String>) =
                appliesToPriceIntervalIds(JsonField.of(appliesToPriceIntervalIds))

            /**
             * Sets [Builder.appliesToPriceIntervalIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesToPriceIntervalIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun appliesToPriceIntervalIds(appliesToPriceIntervalIds: JsonField<List<String>>) =
                apply {
                    this.appliesToPriceIntervalIds =
                        appliesToPriceIntervalIds.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [appliesToPriceIntervalIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAppliesToPriceIntervalId(appliesToPriceIntervalId: String) = apply {
                appliesToPriceIntervalIds =
                    (appliesToPriceIntervalIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("appliesToPriceIntervalIds", it).add(appliesToPriceIntervalId)
                    }
            }

            /** The end date of the minimum interval. */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * The minimum amount to charge in a given billing period for the price intervals this
             * minimum applies to.
             */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /**
             * Sets [Builder.minimumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** The start date of the minimum interval. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [MinimumInterval].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .appliesToPriceIds()
             * .appliesToPriceIntervalIds()
             * .endDate()
             * .minimumAmount()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): MinimumInterval =
                MinimumInterval(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("appliesToPriceIntervalIds", appliesToPriceIntervalIds).map {
                        it.toImmutable()
                    },
                    checkRequired("endDate", endDate),
                    checkRequired("minimumAmount", minimumAmount),
                    checkRequired("startDate", startDate),
                    additionalProperties.toMutableMap(),
                )
        }

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
            (appliesToPriceIds.asKnown().getOrNull()?.size ?: 0) +
                (appliesToPriceIntervalIds.asKnown().getOrNull()?.size ?: 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (minimumAmount.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0)

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

    /** A pending subscription change if one exists on this subscription. */
    class PendingSubscriptionChange
    private constructor(
        private val id: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
        ) : this(id, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
             * Returns a mutable builder for constructing an instance of
             * [PendingSubscriptionChange].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PendingSubscriptionChange]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pendingSubscriptionChange: PendingSubscriptionChange) = apply {
                id = pendingSubscriptionChange.id
                additionalProperties = pendingSubscriptionChange.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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
             * Returns an immutable instance of [PendingSubscriptionChange].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PendingSubscriptionChange =
                PendingSubscriptionChange(
                    checkRequired("id", id),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PendingSubscriptionChange = apply {
            if (validated) {
                return@apply
            }

            id()
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
        @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PendingSubscriptionChange && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PendingSubscriptionChange{id=$id, additionalProperties=$additionalProperties}"
    }

    /**
     * The Price Interval resource represents a period of time for which a price will bill on a
     * subscription. A subscription’s price intervals define its billing behavior.
     */
    class PriceInterval
    private constructor(
        private val id: JsonField<String>,
        private val billingCycleDay: JsonField<Long>,
        private val currentBillingPeriodEndDate: JsonField<OffsetDateTime>,
        private val currentBillingPeriodStartDate: JsonField<OffsetDateTime>,
        private val endDate: JsonField<OffsetDateTime>,
        private val filter: JsonField<String>,
        private val fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>,
        private val price: JsonField<Price>,
        private val startDate: JsonField<OffsetDateTime>,
        private val usageCustomerIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing_cycle_day")
            @ExcludeMissing
            billingCycleDay: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("current_billing_period_end_date")
            @ExcludeMissing
            currentBillingPeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("current_billing_period_start_date")
            @ExcludeMissing
            currentBillingPeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fixed_fee_quantity_transitions")
            @ExcludeMissing
            fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>> =
                JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("usage_customer_ids")
            @ExcludeMissing
            usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            id,
            billingCycleDay,
            currentBillingPeriodEndDate,
            currentBillingPeriodStartDate,
            endDate,
            filter,
            fixedFeeQuantityTransitions,
            price,
            startDate,
            usageCustomerIds,
            mutableMapOf(),
        )

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The day of the month that Orb bills for this price
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingCycleDay(): Long = billingCycleDay.getRequired("billing_cycle_day")

        /**
         * The end of the current billing period. This is an exclusive timestamp, such that the
         * instant returned is exactly the end of the billing period. Set to null if this price
         * interval is not currently active.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currentBillingPeriodEndDate(): Optional<OffsetDateTime> =
            currentBillingPeriodEndDate.getOptional("current_billing_period_end_date")

        /**
         * The start date of the current billing period. This is an inclusive timestamp; the instant
         * returned is exactly the beginning of the billing period. Set to null if this price
         * interval is not currently active.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currentBillingPeriodStartDate(): Optional<OffsetDateTime> =
            currentBillingPeriodStartDate.getOptional("current_billing_period_start_date")

        /**
         * The end date of the price interval. This is the date that Orb stops billing for this
         * price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

        /**
         * An additional filter to apply to usage queries.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * The fixed fee quantity transitions for this price interval. This is only relevant for
         * fixed fees.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fixedFeeQuantityTransitions(): Optional<List<FixedFeeQuantityTransition>> =
            fixedFeeQuantityTransitions.getOptional("fixed_fee_quantity_transitions")

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
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun price(): Price = price.getRequired("price")

        /**
         * The start date of the price interval. This is the date that Orb starts billing for this
         * price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this price
         * interval.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageCustomerIds(): Optional<List<String>> =
            usageCustomerIds.getOptional("usage_customer_ids")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [billingCycleDay].
         *
         * Unlike [billingCycleDay], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        fun _billingCycleDay(): JsonField<Long> = billingCycleDay

        /**
         * Returns the raw JSON value of [currentBillingPeriodEndDate].
         *
         * Unlike [currentBillingPeriodEndDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("current_billing_period_end_date")
        @ExcludeMissing
        fun _currentBillingPeriodEndDate(): JsonField<OffsetDateTime> = currentBillingPeriodEndDate

        /**
         * Returns the raw JSON value of [currentBillingPeriodStartDate].
         *
         * Unlike [currentBillingPeriodStartDate], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("current_billing_period_start_date")
        @ExcludeMissing
        fun _currentBillingPeriodStartDate(): JsonField<OffsetDateTime> =
            currentBillingPeriodStartDate

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [fixedFeeQuantityTransitions].
         *
         * Unlike [fixedFeeQuantityTransitions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        fun _fixedFeeQuantityTransitions(): JsonField<List<FixedFeeQuantityTransition>> =
            fixedFeeQuantityTransitions

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * Returns the raw JSON value of [usageCustomerIds].
         *
         * Unlike [usageCustomerIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        fun _usageCustomerIds(): JsonField<List<String>> = usageCustomerIds

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
             * Returns a mutable builder for constructing an instance of [PriceInterval].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .billingCycleDay()
             * .currentBillingPeriodEndDate()
             * .currentBillingPeriodStartDate()
             * .endDate()
             * .filter()
             * .fixedFeeQuantityTransitions()
             * .price()
             * .startDate()
             * .usageCustomerIds()
             * ```
             */
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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The day of the month that Orb bills for this price */
            fun billingCycleDay(billingCycleDay: Long) =
                billingCycleDay(JsonField.of(billingCycleDay))

            /**
             * Sets [Builder.billingCycleDay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingCycleDay] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Alias for calling [Builder.currentBillingPeriodEndDate] with
             * `currentBillingPeriodEndDate.orElse(null)`.
             */
            fun currentBillingPeriodEndDate(currentBillingPeriodEndDate: Optional<OffsetDateTime>) =
                currentBillingPeriodEndDate(currentBillingPeriodEndDate.getOrNull())

            /**
             * Sets [Builder.currentBillingPeriodEndDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentBillingPeriodEndDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
             * Alias for calling [Builder.currentBillingPeriodStartDate] with
             * `currentBillingPeriodStartDate.orElse(null)`.
             */
            fun currentBillingPeriodStartDate(
                currentBillingPeriodStartDate: Optional<OffsetDateTime>
            ) = currentBillingPeriodStartDate(currentBillingPeriodStartDate.getOrNull())

            /**
             * Sets [Builder.currentBillingPeriodStartDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentBillingPeriodStartDate] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun currentBillingPeriodStartDate(
                currentBillingPeriodStartDate: JsonField<OffsetDateTime>
            ) = apply { this.currentBillingPeriodStartDate = currentBillingPeriodStartDate }

            /**
             * The end date of the price interval. This is the date that Orb stops billing for this
             * price.
             */
            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** An additional filter to apply to usage queries. */
            fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

            /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
            fun filter(filter: Optional<String>) = filter(filter.getOrNull())

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /**
             * The fixed fee quantity transitions for this price interval. This is only relevant for
             * fixed fees.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>?
            ) = fixedFeeQuantityTransitions(JsonField.ofNullable(fixedFeeQuantityTransitions))

            /**
             * Alias for calling [Builder.fixedFeeQuantityTransitions] with
             * `fixedFeeQuantityTransitions.orElse(null)`.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: Optional<List<FixedFeeQuantityTransition>>
            ) = fixedFeeQuantityTransitions(fixedFeeQuantityTransitions.getOrNull())

            /**
             * Sets [Builder.fixedFeeQuantityTransitions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fixedFeeQuantityTransitions] with a well-typed
             * `List<FixedFeeQuantityTransition>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>
            ) = apply {
                this.fixedFeeQuantityTransitions =
                    fixedFeeQuantityTransitions.map { it.toMutableList() }
            }

            /**
             * Adds a single [FixedFeeQuantityTransition] to [fixedFeeQuantityTransitions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
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
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** Alias for calling [price] with `Price.ofUnit(unit)`. */
            fun price(unit: Price.Unit) = price(Price.ofUnit(unit))

            /** Alias for calling [price] with `Price.ofPackage(package_)`. */
            fun price(package_: Price.Package) = price(Price.ofPackage(package_))

            /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
            fun price(matrix: Price.Matrix) = price(Price.ofMatrix(matrix))

            /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
            fun price(tiered: Price.Tiered) = price(Price.ofTiered(tiered))

            /** Alias for calling [price] with `Price.ofTieredBps(tieredBps)`. */
            fun price(tieredBps: Price.TieredBps) = price(Price.ofTieredBps(tieredBps))

            /** Alias for calling [price] with `Price.ofBps(bps)`. */
            fun price(bps: Price.Bps) = price(Price.ofBps(bps))

            /** Alias for calling [price] with `Price.ofBulkBps(bulkBps)`. */
            fun price(bulkBps: Price.BulkBps) = price(Price.ofBulkBps(bulkBps))

            /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
            fun price(bulk: Price.Bulk) = price(Price.ofBulk(bulk))

            /**
             * Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
             */
            fun price(thresholdTotalAmount: Price.ThresholdTotalAmount) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
            fun price(tieredPackage: Price.TieredPackage) =
                price(Price.ofTieredPackage(tieredPackage))

            /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
            fun price(groupedTiered: Price.GroupedTiered) =
                price(Price.ofGroupedTiered(groupedTiered))

            /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
            fun price(tieredWithMinimum: Price.TieredWithMinimum) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
             */
            fun price(tieredPackageWithMinimum: Price.TieredPackageWithMinimum) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofPackageWithAllocation(packageWithAllocation)`.
             */
            fun price(packageWithAllocation: Price.PackageWithAllocation) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
            fun price(unitWithPercent: Price.UnitWithPercent) =
                price(Price.ofUnitWithPercent(unitWithPercent))

            /**
             * Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
             */
            fun price(matrixWithAllocation: Price.MatrixWithAllocation) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /**
             * Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`.
             */
            fun price(tieredWithProration: Price.TieredWithProration) =
                price(Price.ofTieredWithProration(tieredWithProration))

            /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
            fun price(unitWithProration: Price.UnitWithProration) =
                price(Price.ofUnitWithProration(unitWithProration))

            /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
            fun price(groupedAllocation: Price.GroupedAllocation) =
                price(Price.ofGroupedAllocation(groupedAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
             */
            fun price(groupedWithProratedMinimum: Price.GroupedWithProratedMinimum) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
             */
            fun price(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimum) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
             */
            fun price(matrixWithDisplayName: Price.MatrixWithDisplayName) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
            fun price(bulkWithProration: Price.BulkWithProration) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
             */
            fun price(groupedTieredPackage: Price.GroupedTieredPackage) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
             */
            fun price(maxGroupTieredPackage: Price.MaxGroupTieredPackage) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
             */
            fun price(scalableMatrixWithUnitPricing: Price.ScalableMatrixWithUnitPricing) =
                price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
             */
            fun price(scalableMatrixWithTieredPricing: Price.ScalableMatrixWithTieredPricing) =
                price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
             */
            fun price(cumulativeGroupedBulk: Price.CumulativeGroupedBulk) =
                price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

            /**
             * The start date of the price interval. This is the date that Orb starts billing for
             * this price.
             */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Alias for calling [Builder.usageCustomerIds] with `usageCustomerIds.orElse(null)`.
             */
            fun usageCustomerIds(usageCustomerIds: Optional<List<String>>) =
                usageCustomerIds(usageCustomerIds.getOrNull())

            /**
             * Sets [Builder.usageCustomerIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageCustomerIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
                this.usageCustomerIds = usageCustomerIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [usageCustomerIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
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

            /**
             * Returns an immutable instance of [PriceInterval].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .billingCycleDay()
             * .currentBillingPeriodEndDate()
             * .currentBillingPeriodStartDate()
             * .endDate()
             * .filter()
             * .fixedFeeQuantityTransitions()
             * .price()
             * .startDate()
             * .usageCustomerIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (billingCycleDay.asKnown().isPresent) 1 else 0) +
                (if (currentBillingPeriodEndDate.asKnown().isPresent) 1 else 0) +
                (if (currentBillingPeriodStartDate.asKnown().isPresent) 1 else 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
                (fixedFeeQuantityTransitions.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (price.asKnown().getOrNull()?.validity() ?: 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (usageCustomerIds.asKnown().getOrNull()?.size ?: 0)

        class FixedFeeQuantityTransition
        private constructor(
            private val effectiveDate: JsonField<OffsetDateTime>,
            private val priceId: JsonField<String>,
            private val quantity: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("effective_date")
                @ExcludeMissing
                effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("price_id")
                @ExcludeMissing
                priceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Long> = JsonMissing.of(),
            ) : this(effectiveDate, priceId, quantity, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun effectiveDate(): OffsetDateTime = effectiveDate.getRequired("effective_date")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun priceId(): String = priceId.getRequired("price_id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quantity(): Long = quantity.getRequired("quantity")

            /**
             * Returns the raw JSON value of [effectiveDate].
             *
             * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("effective_date")
            @ExcludeMissing
            fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

            /**
             * Returns the raw JSON value of [priceId].
             *
             * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

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
                 * Returns a mutable builder for constructing an instance of
                 * [FixedFeeQuantityTransition].
                 *
                 * The following fields are required:
                 * ```java
                 * .effectiveDate()
                 * .priceId()
                 * .quantity()
                 * ```
                 */
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

                /**
                 * Sets [Builder.effectiveDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effectiveDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
                    this.effectiveDate = effectiveDate
                }

                fun priceId(priceId: String) = priceId(JsonField.of(priceId))

                /**
                 * Sets [Builder.priceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

                fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [FixedFeeQuantityTransition].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .effectiveDate()
                 * .priceId()
                 * .quantity()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FixedFeeQuantityTransition =
                    FixedFeeQuantityTransition(
                        checkRequired("effectiveDate", effectiveDate),
                        checkRequired("priceId", priceId),
                        checkRequired("quantity", quantity),
                        additionalProperties.toMutableMap(),
                    )
            }

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
                (if (effectiveDate.asKnown().isPresent) 1 else 0) +
                    (if (priceId.asKnown().isPresent) 1 else 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0)

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

    class RedeemedCoupon
    private constructor(
        private val couponId: JsonField<String>,
        private val endDate: JsonField<OffsetDateTime>,
        private val startDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("coupon_id")
            @ExcludeMissing
            couponId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(couponId, endDate, startDate, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun couponId(): String = couponId.getRequired("coupon_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /**
         * Returns the raw JSON value of [couponId].
         *
         * Unlike [couponId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("coupon_id") @ExcludeMissing fun _couponId(): JsonField<String> = couponId

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

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
             * Returns a mutable builder for constructing an instance of [RedeemedCoupon].
             *
             * The following fields are required:
             * ```java
             * .couponId()
             * .endDate()
             * .startDate()
             * ```
             */
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

            /**
             * Sets [Builder.couponId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.couponId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun couponId(couponId: JsonField<String>) = apply { this.couponId = couponId }

            fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

            /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [RedeemedCoupon].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .couponId()
             * .endDate()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RedeemedCoupon =
                RedeemedCoupon(
                    checkRequired("couponId", couponId),
                    checkRequired("endDate", endDate),
                    checkRequired("startDate", startDate),
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (couponId.asKnown().isPresent) 1 else 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0)

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

        private var validated: Boolean = false

        fun validate(): Status = apply {
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TrialInfo
    private constructor(
        private val endDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        ) : this(endDate, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

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
             * Returns a mutable builder for constructing an instance of [TrialInfo].
             *
             * The following fields are required:
             * ```java
             * .endDate()
             * ```
             */
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

            /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
            fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [TrialInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .endDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TrialInfo =
                TrialInfo(checkRequired("endDate", endDate), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): TrialInfo = apply {
            if (validated) {
                return@apply
            }

            endDate()
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
        @JvmSynthetic internal fun validity(): Int = (if (endDate.asKnown().isPresent) 1 else 0)

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

    /**
     * The resources that were changed as part of this operation. Only present when fetched through
     * the subscription changes API or if the `include_changed_resources` parameter was passed in
     * the request.
     */
    class ChangedResources
    private constructor(
        private val createdCreditNotes: JsonField<List<CreditNote>>,
        private val createdInvoices: JsonField<List<Invoice>>,
        private val voidedCreditNotes: JsonField<List<CreditNote>>,
        private val voidedInvoices: JsonField<List<Invoice>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_credit_notes")
            @ExcludeMissing
            createdCreditNotes: JsonField<List<CreditNote>> = JsonMissing.of(),
            @JsonProperty("created_invoices")
            @ExcludeMissing
            createdInvoices: JsonField<List<Invoice>> = JsonMissing.of(),
            @JsonProperty("voided_credit_notes")
            @ExcludeMissing
            voidedCreditNotes: JsonField<List<CreditNote>> = JsonMissing.of(),
            @JsonProperty("voided_invoices")
            @ExcludeMissing
            voidedInvoices: JsonField<List<Invoice>> = JsonMissing.of(),
        ) : this(
            createdCreditNotes,
            createdInvoices,
            voidedCreditNotes,
            voidedInvoices,
            mutableMapOf(),
        )

        /**
         * The credit notes that were created as part of this operation.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdCreditNotes(): List<CreditNote> =
            createdCreditNotes.getRequired("created_credit_notes")

        /**
         * The invoices that were created as part of this operation.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdInvoices(): List<Invoice> = createdInvoices.getRequired("created_invoices")

        /**
         * The credit notes that were voided as part of this operation.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun voidedCreditNotes(): List<CreditNote> =
            voidedCreditNotes.getRequired("voided_credit_notes")

        /**
         * The invoices that were voided as part of this operation.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun voidedInvoices(): List<Invoice> = voidedInvoices.getRequired("voided_invoices")

        /**
         * Returns the raw JSON value of [createdCreditNotes].
         *
         * Unlike [createdCreditNotes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("created_credit_notes")
        @ExcludeMissing
        fun _createdCreditNotes(): JsonField<List<CreditNote>> = createdCreditNotes

        /**
         * Returns the raw JSON value of [createdInvoices].
         *
         * Unlike [createdInvoices], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("created_invoices")
        @ExcludeMissing
        fun _createdInvoices(): JsonField<List<Invoice>> = createdInvoices

        /**
         * Returns the raw JSON value of [voidedCreditNotes].
         *
         * Unlike [voidedCreditNotes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("voided_credit_notes")
        @ExcludeMissing
        fun _voidedCreditNotes(): JsonField<List<CreditNote>> = voidedCreditNotes

        /**
         * Returns the raw JSON value of [voidedInvoices].
         *
         * Unlike [voidedInvoices], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("voided_invoices")
        @ExcludeMissing
        fun _voidedInvoices(): JsonField<List<Invoice>> = voidedInvoices

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
             * Returns a mutable builder for constructing an instance of [ChangedResources].
             *
             * The following fields are required:
             * ```java
             * .createdCreditNotes()
             * .createdInvoices()
             * .voidedCreditNotes()
             * .voidedInvoices()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ChangedResources]. */
        class Builder internal constructor() {

            private var createdCreditNotes: JsonField<MutableList<CreditNote>>? = null
            private var createdInvoices: JsonField<MutableList<Invoice>>? = null
            private var voidedCreditNotes: JsonField<MutableList<CreditNote>>? = null
            private var voidedInvoices: JsonField<MutableList<Invoice>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(changedResources: ChangedResources) = apply {
                createdCreditNotes = changedResources.createdCreditNotes.map { it.toMutableList() }
                createdInvoices = changedResources.createdInvoices.map { it.toMutableList() }
                voidedCreditNotes = changedResources.voidedCreditNotes.map { it.toMutableList() }
                voidedInvoices = changedResources.voidedInvoices.map { it.toMutableList() }
                additionalProperties = changedResources.additionalProperties.toMutableMap()
            }

            /** The credit notes that were created as part of this operation. */
            fun createdCreditNotes(createdCreditNotes: List<CreditNote>) =
                createdCreditNotes(JsonField.of(createdCreditNotes))

            /**
             * Sets [Builder.createdCreditNotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdCreditNotes] with a well-typed
             * `List<CreditNote>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun createdCreditNotes(createdCreditNotes: JsonField<List<CreditNote>>) = apply {
                this.createdCreditNotes = createdCreditNotes.map { it.toMutableList() }
            }

            /**
             * Adds a single [CreditNote] to [createdCreditNotes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCreatedCreditNote(createdCreditNote: CreditNote) = apply {
                createdCreditNotes =
                    (createdCreditNotes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("createdCreditNotes", it).add(createdCreditNote)
                    }
            }

            /** The invoices that were created as part of this operation. */
            fun createdInvoices(createdInvoices: List<Invoice>) =
                createdInvoices(JsonField.of(createdInvoices))

            /**
             * Sets [Builder.createdInvoices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdInvoices] with a well-typed `List<Invoice>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun createdInvoices(createdInvoices: JsonField<List<Invoice>>) = apply {
                this.createdInvoices = createdInvoices.map { it.toMutableList() }
            }

            /**
             * Adds a single [Invoice] to [createdInvoices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCreatedInvoice(createdInvoice: Invoice) = apply {
                createdInvoices =
                    (createdInvoices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("createdInvoices", it).add(createdInvoice)
                    }
            }

            /** The credit notes that were voided as part of this operation. */
            fun voidedCreditNotes(voidedCreditNotes: List<CreditNote>) =
                voidedCreditNotes(JsonField.of(voidedCreditNotes))

            /**
             * Sets [Builder.voidedCreditNotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voidedCreditNotes] with a well-typed
             * `List<CreditNote>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun voidedCreditNotes(voidedCreditNotes: JsonField<List<CreditNote>>) = apply {
                this.voidedCreditNotes = voidedCreditNotes.map { it.toMutableList() }
            }

            /**
             * Adds a single [CreditNote] to [voidedCreditNotes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVoidedCreditNote(voidedCreditNote: CreditNote) = apply {
                voidedCreditNotes =
                    (voidedCreditNotes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("voidedCreditNotes", it).add(voidedCreditNote)
                    }
            }

            /** The invoices that were voided as part of this operation. */
            fun voidedInvoices(voidedInvoices: List<Invoice>) =
                voidedInvoices(JsonField.of(voidedInvoices))

            /**
             * Sets [Builder.voidedInvoices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voidedInvoices] with a well-typed `List<Invoice>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun voidedInvoices(voidedInvoices: JsonField<List<Invoice>>) = apply {
                this.voidedInvoices = voidedInvoices.map { it.toMutableList() }
            }

            /**
             * Adds a single [Invoice] to [voidedInvoices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVoidedInvoice(voidedInvoice: Invoice) = apply {
                voidedInvoices =
                    (voidedInvoices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("voidedInvoices", it).add(voidedInvoice)
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

            /**
             * Returns an immutable instance of [ChangedResources].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .createdCreditNotes()
             * .createdInvoices()
             * .voidedCreditNotes()
             * .voidedInvoices()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ChangedResources =
                ChangedResources(
                    checkRequired("createdCreditNotes", createdCreditNotes).map {
                        it.toImmutable()
                    },
                    checkRequired("createdInvoices", createdInvoices).map { it.toImmutable() },
                    checkRequired("voidedCreditNotes", voidedCreditNotes).map { it.toImmutable() },
                    checkRequired("voidedInvoices", voidedInvoices).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ChangedResources = apply {
            if (validated) {
                return@apply
            }

            createdCreditNotes().forEach { it.validate() }
            createdInvoices().forEach { it.validate() }
            voidedCreditNotes().forEach { it.validate() }
            voidedInvoices().forEach { it.validate() }
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
            (createdCreditNotes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (createdInvoices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (voidedCreditNotes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (voidedInvoices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChangedResources && createdCreditNotes == other.createdCreditNotes && createdInvoices == other.createdInvoices && voidedCreditNotes == other.voidedCreditNotes && voidedInvoices == other.voidedInvoices && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(createdCreditNotes, createdInvoices, voidedCreditNotes, voidedInvoices, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ChangedResources{createdCreditNotes=$createdCreditNotes, createdInvoices=$createdInvoices, voidedCreditNotes=$voidedCreditNotes, voidedInvoices=$voidedInvoices, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionUnschedulePendingPlanChangesResponse && id == other.id && activePlanPhaseOrder == other.activePlanPhaseOrder && adjustmentIntervals == other.adjustmentIntervals && autoCollection == other.autoCollection && billingCycleAnchorConfiguration == other.billingCycleAnchorConfiguration && billingCycleDay == other.billingCycleDay && createdAt == other.createdAt && currentBillingPeriodEndDate == other.currentBillingPeriodEndDate && currentBillingPeriodStartDate == other.currentBillingPeriodStartDate && customer == other.customer && defaultInvoiceMemo == other.defaultInvoiceMemo && discountIntervals == other.discountIntervals && endDate == other.endDate && fixedFeeQuantitySchedule == other.fixedFeeQuantitySchedule && invoicingThreshold == other.invoicingThreshold && maximumIntervals == other.maximumIntervals && metadata == other.metadata && minimumIntervals == other.minimumIntervals && netTerms == other.netTerms && pendingSubscriptionChange == other.pendingSubscriptionChange && plan == other.plan && priceIntervals == other.priceIntervals && redeemedCoupon == other.redeemedCoupon && startDate == other.startDate && status == other.status && trialInfo == other.trialInfo && changedResources == other.changedResources && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, activePlanPhaseOrder, adjustmentIntervals, autoCollection, billingCycleAnchorConfiguration, billingCycleDay, createdAt, currentBillingPeriodEndDate, currentBillingPeriodStartDate, customer, defaultInvoiceMemo, discountIntervals, endDate, fixedFeeQuantitySchedule, invoicingThreshold, maximumIntervals, metadata, minimumIntervals, netTerms, pendingSubscriptionChange, plan, priceIntervals, redeemedCoupon, startDate, status, trialInfo, changedResources, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionUnschedulePendingPlanChangesResponse{id=$id, activePlanPhaseOrder=$activePlanPhaseOrder, adjustmentIntervals=$adjustmentIntervals, autoCollection=$autoCollection, billingCycleAnchorConfiguration=$billingCycleAnchorConfiguration, billingCycleDay=$billingCycleDay, createdAt=$createdAt, currentBillingPeriodEndDate=$currentBillingPeriodEndDate, currentBillingPeriodStartDate=$currentBillingPeriodStartDate, customer=$customer, defaultInvoiceMemo=$defaultInvoiceMemo, discountIntervals=$discountIntervals, endDate=$endDate, fixedFeeQuantitySchedule=$fixedFeeQuantitySchedule, invoicingThreshold=$invoicingThreshold, maximumIntervals=$maximumIntervals, metadata=$metadata, minimumIntervals=$minimumIntervals, netTerms=$netTerms, pendingSubscriptionChange=$pendingSubscriptionChange, plan=$plan, priceIntervals=$priceIntervals, redeemedCoupon=$redeemedCoupon, startDate=$startDate, status=$status, trialInfo=$trialInfo, changedResources=$changedResources, additionalProperties=$additionalProperties}"
}
