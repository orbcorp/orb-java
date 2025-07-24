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
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint can be used to change an existing subscription's plan. It returns the serialized
 * updated subscription object.
 *
 * The body parameter `change_option` determines when the plan change occurrs. Orb supports three
 * options:
 * - `end_of_subscription_term`: changes the plan at the end of the existing plan's term.
 *     - Issuing this plan change request for a monthly subscription will keep the existing plan
 *       active until the start of the subsequent month. Issuing this plan change request for a
 *       yearly subscription will keep the existing plan active for the full year. Charges incurred
 *       in the remaining period will be invoiced as normal.
 *     - Example: The plan is billed monthly on the 1st of the month, the request is made on January
 *       15th, so the plan will be changed on February 1st, and invoice will be issued on February
 *       1st for the last month of the original plan.
 * - `immediate`: changes the plan immediately.
 *     - Subscriptions that have their plan changed with this option will move to the new plan
 *       immediately, and be invoiced immediately.
 *     - This invoice will include any usage fees incurred in the billing period up to the change,
 *       along with any prorated recurring fees for the billing period, if applicable.
 *     - Example: The plan is billed monthly on the 1st of the month, the request is made on January
 *       15th, so the plan will be changed on January 15th, and an invoice will be issued for the
 *       partial month, from January 1 to January 15, on the original plan.
 * - `requested_date`: changes the plan on the requested date (`change_date`).
 *     - If no timezone is provided, the customer's timezone is used. The `change_date` body
 *       parameter is required if this option is chosen.
 *     - Example: The plan is billed monthly on the 1st of the month, the request is made on January
 *       15th, with a requested `change_date` of February 15th, so the plan will be changed on
 *       February 15th, and invoices will be issued on February 1st and February 15th.
 *
 * Note that one of `plan_id` or `external_plan_id` is required in the request body for this
 * operation.
 *
 * ## Customize your customer's subscriptions
 *
 * Prices and adjustments in a plan can be added, removed, or replaced on the subscription when you
 * schedule the plan change. This is useful when a customer has prices that differ from the default
 * prices for a specific plan.
 *
 * <Note> This feature is only available for accounts that have migrated to Subscription Overrides
 * Version 2. You can find your Subscription Overrides Version at the bottom of your
 * [Plans page](https://app.withorb.com/plans) </Note>
 *
 * ### Adding Prices
 *
 * To add prices, provide a list of objects with the key `add_prices`. An object in the list must
 * specify an existing add-on price with a `price_id` or `external_price_id` field, or create a new
 * add-on price by including an object with the key `price`, identical to what would be used in the
 * request body for the [create price endpoint](/api-reference/price/create-price). See the
 * [Price resource](/product-catalog/price-configuration) for the specification of different price
 * model configurations possible in this object.
 *
 * If the plan has phases, each object in the list must include a number with `plan_phase_order` key
 * to indicate which phase the price should be added to.
 *
 * An object in the list can specify an optional `start_date` and optional `end_date`. If
 * `start_date` is unspecified, the start of the phase / plan change time will be used. If
 * `end_date` is unspecified, it will finish at the end of the phase / have no end time.
 *
 * An object in the list can specify an optional `minimum_amount`, `maximum_amount`, or `discounts`.
 * This will create adjustments which apply only to this price.
 *
 * Additionally, an object in the list can specify an optional `reference_id`. This ID can be used
 * to reference this price when [adding an adjustment](#adding-adjustments) in the same API call.
 * However the ID is _transient_ and cannot be used to refer to the price in future API calls.
 *
 * ### Removing Prices
 *
 * To remove prices, provide a list of objects with the key `remove_prices`. An object in the list
 * must specify a plan price with either a `price_id` or `external_price_id` field.
 *
 * ### Replacing Prices
 *
 * To replace prices, provide a list of objects with the key `replace_prices`. An object in the list
 * must specify a plan price to replace with the `replaces_price_id` key, and it must specify a
 * price to replace it with by either referencing an existing add-on price with a `price_id` or
 * `external_price_id` field, or by creating a new add-on price by including an object with the key
 * `price`, identical to what would be used in the request body for the
 * [create price endpoint](/api-reference/price/create-price). See the
 * [Price resource](/product-catalog/price-configuration) for the specification of different price
 * model configurations possible in this object.
 *
 * For fixed fees, an object in the list can supply a `fixed_price_quantity` instead of a `price`,
 * `price_id`, or `external_price_id` field. This will update only the quantity for the price,
 * similar to the [Update price quantity](/api-reference/subscription/update-price-quantity)
 * endpoint.
 *
 * The replacement price will have the same phase, if applicable, and the same start and end dates
 * as the price it replaces.
 *
 * An object in the list can specify an optional `minimum_amount`, `maximum_amount`, or `discounts`.
 * This will create adjustments which apply only to this price.
 *
 * Additionally, an object in the list can specify an optional `reference_id`. This ID can be used
 * to reference the replacement price when [adding an adjustment](#adding-adjustments) in the same
 * API call. However the ID is _transient_ and cannot be used to refer to the price in future API
 * calls.
 *
 * ### Adding adjustments
 *
 * To add adjustments, provide a list of objects with the key `add_adjustments`. An object in the
 * list must include an object with the key `adjustment`, identical to the adjustment object in the
 * [add/edit price intervals endpoint](/api-reference/price-interval/add-or-edit-price-intervals).
 *
 * If the plan has phases, each object in the list must include a number with `plan_phase_order` key
 * to indicate which phase the adjustment should be added to.
 *
 * An object in the list can specify an optional `start_date` and optional `end_date`. If
 * `start_date` is unspecified, the start of the phase / plan change time will be used. If
 * `end_date` is unspecified, it will finish at the end of the phase / have no end time.
 *
 * ### Removing adjustments
 *
 * To remove adjustments, provide a list of objects with the key `remove_adjustments`. An object in
 * the list must include a key, `adjustment_id`, with the ID of the adjustment to be removed.
 *
 * ### Replacing adjustments
 *
 * To replace adjustments, provide a list of objects with the key `replace_adjustments`. An object
 * in the list must specify a plan adjustment to replace with the `replaces_adjustment_id` key, and
 * it must specify an adjustment to replace it with by including an object with the key
 * `adjustment`, identical to the adjustment object in the
 * [add/edit price intervals endpoint](/api-reference/price-interval/add-or-edit-price-intervals).
 *
 * The replacement adjustment will have the same phase, if applicable, and the same start and end
 * dates as the adjustment it replaces.
 *
 * ## Price overrides (DEPRECATED)
 *
 * <Note> Price overrides are being phased out in favor adding/removing/replacing prices. (See
 * [Customize your customer's subscriptions](/api-reference/subscription/schedule-plan-change))
 * </Note>
 *
 * Price overrides are used to update some or all prices in a plan for the specific subscription
 * being created. This is useful when a new customer has negotiated a rate that is unique to the
 * customer.
 *
 * To override prices, provide a list of objects with the key `price_overrides`. The price object in
 * the list of overrides is expected to contain the existing price id, the `model_type` and
 * configuration. (See the [Price resource](/product-catalog/price-configuration) for the
 * specification of different price model configurations.) The numerical values can be updated, but
 * the billable metric, cadence, type, and name of a price can not be overridden.
 *
 * ### Maximums, and minimums
 *
 * Price overrides are used to update some or all prices in the target plan. Minimums and maximums,
 * much like price overrides, can be useful when a new customer has negotiated a new or different
 * minimum or maximum spend cap than the default for the plan. The request format for maximums and
 * minimums is the same as those in [subscription creation](create-subscription).
 *
 * ## Scheduling multiple plan changes
 *
 * When scheduling multiple plan changes with the same date, the latest plan change on that day
 * takes effect.
 *
 * ## Prorations for in-advance fees
 *
 * By default, Orb calculates the prorated difference in any fixed fees when making a plan change,
 * adjusting the customer balance as needed. For details on this behavior, see
 * [Modifying subscriptions](/product-catalog/modifying-subscriptions#prorations-for-in-advance-fees).
 */
class SubscriptionSchedulePlanChangeParams
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
     * Additional adjustments to be added to the subscription. (Only available for accounts that
     * have migrated off of legacy subscription overrides)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun addAdjustments(): Optional<List<AddAdjustment>> = body.addAdjustments()

    /**
     * Additional prices to be added to the subscription. (Only available for accounts that have
     * migrated off of legacy subscription overrides)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun addPrices(): Optional<List<AddPrice>> = body.addPrices()

    /**
     * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned with
     * the plan change's effective date.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun alignBillingWithPlanChangeDate(): Optional<Boolean> = body.alignBillingWithPlanChangeDate()

    /**
     * Determines whether issued invoices for this subscription will automatically be charged with
     * the saved payment method on the due date. If not specified, this defaults to the behavior
     * configured for this customer.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun autoCollection(): Optional<Boolean> = body.autoCollection()

    /**
     * Reset billing periods to be aligned with the plan change's effective date or start of the
     * month. Defaults to `unchanged` which keeps subscription's existing billing cycle alignment.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun billingCycleAlignment(): Optional<BillingCycleAlignment> = body.billingCycleAlignment()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun billingCycleAnchorConfiguration(): Optional<BillingCycleAnchorConfiguration> =
        body.billingCycleAnchorConfiguration()

    /**
     * The date that the plan change should take effect. This parameter can only be passed if the
     * `change_option` is `requested_date`. If a date with no time is passed, the plan change will
     * happen at midnight in the customer's timezone.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun changeDate(): Optional<OffsetDateTime> = body.changeDate()

    /**
     * Redemption code to be used for this subscription. If the coupon cannot be found by its
     * redemption code, or cannot be redeemed, an error response will be returned and the
     * subscription creation or plan change will not be scheduled.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun couponRedemptionCode(): Optional<String> = body.couponRedemptionCode()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated") fun creditsOverageRate(): Optional<Double> = body.creditsOverageRate()

    /**
     * Determines the default memo on this subscription's invoices. Note that if this is not
     * provided, it is determined by the plan configuration.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun defaultInvoiceMemo(): Optional<String> = body.defaultInvoiceMemo()

    /**
     * The external_plan_id of the plan that the given subscription should be switched to. Note that
     * either this property or `plan_id` must be specified.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalPlanId(): Optional<String> = body.externalPlanId()

    /**
     * An additional filter to apply to usage queries. This filter must be expressed as a boolean
     * [computed property](/extensibility/advanced-metrics#computed-properties). If null, usage
     * queries will not include any additional filter.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun filter(): Optional<String> = body.filter()

    /**
     * The phase of the plan to start with
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun initialPhaseOrder(): Optional<Long> = body.initialPhaseOrder()

    /**
     * When this subscription's accrued usage reaches this threshold, an invoice will be issued for
     * the subscription. If not specified, invoices will only be issued at the end of the billing
     * period.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invoicingThreshold(): Optional<String> = body.invoicingThreshold()

    /**
     * The net terms determines the difference between the invoice date and the issue date for the
     * invoice. If you intend the invoice to be due on issue, set this to 0. If not provided, this
     * defaults to the value specified in the plan.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun netTerms(): Optional<Long> = body.netTerms()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun perCreditOverageAmount(): Optional<Double> = body.perCreditOverageAmount()

    /**
     * The plan that the given subscription should be switched to. Note that either this property or
     * `external_plan_id` must be specified.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun planId(): Optional<String> = body.planId()

    /**
     * Specifies which version of the plan to change to. If null, the default version will be used.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun planVersionNumber(): Optional<Long> = body.planVersionNumber()

    /**
     * Optionally provide a list of overrides for prices on the plan
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun priceOverrides(): Optional<List<JsonValue>> = body.priceOverrides()

    /**
     * Plan adjustments to be removed from the subscription. (Only available for accounts that have
     * migrated off of legacy subscription overrides)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun removeAdjustments(): Optional<List<RemoveAdjustment>> = body.removeAdjustments()

    /**
     * Plan prices to be removed from the subscription. (Only available for accounts that have
     * migrated off of legacy subscription overrides)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun removePrices(): Optional<List<RemovePrice>> = body.removePrices()

    /**
     * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
     * available for accounts that have migrated off of legacy subscription overrides)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun replaceAdjustments(): Optional<List<ReplaceAdjustment>> = body.replaceAdjustments()

    /**
     * Plan prices to be replaced with additional prices on the subscription. (Only available for
     * accounts that have migrated off of legacy subscription overrides)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun replacePrices(): Optional<List<ReplacePrice>> = body.replacePrices()

    /**
     * The duration of the trial period in days. If not provided, this defaults to the value
     * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun trialDurationDays(): Optional<Long> = body.trialDurationDays()

    /**
     * A list of customer IDs whose usage events will be aggregated and billed under this
     * subscription. By default, a subscription only considers usage events associated with its
     * attached customer's customer_id. When usage_customer_ids is provided, the subscription
     * includes usage events from the specified customers only. Provided usage_customer_ids must be
     * either the customer for this subscription itself, or any of that customer's children.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun usageCustomerIds(): Optional<List<String>> = body.usageCustomerIds()

    /**
     * Returns the raw JSON value of [changeOption].
     *
     * Unlike [changeOption], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _changeOption(): JsonField<ChangeOption> = body._changeOption()

    /**
     * Returns the raw JSON value of [addAdjustments].
     *
     * Unlike [addAdjustments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addAdjustments(): JsonField<List<AddAdjustment>> = body._addAdjustments()

    /**
     * Returns the raw JSON value of [addPrices].
     *
     * Unlike [addPrices], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addPrices(): JsonField<List<AddPrice>> = body._addPrices()

    /**
     * Returns the raw JSON value of [alignBillingWithPlanChangeDate].
     *
     * Unlike [alignBillingWithPlanChangeDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _alignBillingWithPlanChangeDate(): JsonField<Boolean> =
        body._alignBillingWithPlanChangeDate()

    /**
     * Returns the raw JSON value of [autoCollection].
     *
     * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoCollection(): JsonField<Boolean> = body._autoCollection()

    /**
     * Returns the raw JSON value of [billingCycleAlignment].
     *
     * Unlike [billingCycleAlignment], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _billingCycleAlignment(): JsonField<BillingCycleAlignment> = body._billingCycleAlignment()

    /**
     * Returns the raw JSON value of [billingCycleAnchorConfiguration].
     *
     * Unlike [billingCycleAnchorConfiguration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _billingCycleAnchorConfiguration(): JsonField<BillingCycleAnchorConfiguration> =
        body._billingCycleAnchorConfiguration()

    /**
     * Returns the raw JSON value of [changeDate].
     *
     * Unlike [changeDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _changeDate(): JsonField<OffsetDateTime> = body._changeDate()

    /**
     * Returns the raw JSON value of [couponRedemptionCode].
     *
     * Unlike [couponRedemptionCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _couponRedemptionCode(): JsonField<String> = body._couponRedemptionCode()

    /**
     * Returns the raw JSON value of [creditsOverageRate].
     *
     * Unlike [creditsOverageRate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    fun _creditsOverageRate(): JsonField<Double> = body._creditsOverageRate()

    /**
     * Returns the raw JSON value of [defaultInvoiceMemo].
     *
     * Unlike [defaultInvoiceMemo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultInvoiceMemo(): JsonField<String> = body._defaultInvoiceMemo()

    /**
     * Returns the raw JSON value of [externalPlanId].
     *
     * Unlike [externalPlanId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalPlanId(): JsonField<String> = body._externalPlanId()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<String> = body._filter()

    /**
     * Returns the raw JSON value of [initialPhaseOrder].
     *
     * Unlike [initialPhaseOrder], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _initialPhaseOrder(): JsonField<Long> = body._initialPhaseOrder()

    /**
     * Returns the raw JSON value of [invoicingThreshold].
     *
     * Unlike [invoicingThreshold], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _invoicingThreshold(): JsonField<String> = body._invoicingThreshold()

    /**
     * Returns the raw JSON value of [netTerms].
     *
     * Unlike [netTerms], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _netTerms(): JsonField<Long> = body._netTerms()

    /**
     * Returns the raw JSON value of [perCreditOverageAmount].
     *
     * Unlike [perCreditOverageAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    fun _perCreditOverageAmount(): JsonField<Double> = body._perCreditOverageAmount()

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planId(): JsonField<String> = body._planId()

    /**
     * Returns the raw JSON value of [planVersionNumber].
     *
     * Unlike [planVersionNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _planVersionNumber(): JsonField<Long> = body._planVersionNumber()

    /**
     * Returns the raw JSON value of [priceOverrides].
     *
     * Unlike [priceOverrides], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    fun _priceOverrides(): JsonField<List<JsonValue>> = body._priceOverrides()

    /**
     * Returns the raw JSON value of [removeAdjustments].
     *
     * Unlike [removeAdjustments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _removeAdjustments(): JsonField<List<RemoveAdjustment>> = body._removeAdjustments()

    /**
     * Returns the raw JSON value of [removePrices].
     *
     * Unlike [removePrices], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _removePrices(): JsonField<List<RemovePrice>> = body._removePrices()

    /**
     * Returns the raw JSON value of [replaceAdjustments].
     *
     * Unlike [replaceAdjustments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _replaceAdjustments(): JsonField<List<ReplaceAdjustment>> = body._replaceAdjustments()

    /**
     * Returns the raw JSON value of [replacePrices].
     *
     * Unlike [replacePrices], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _replacePrices(): JsonField<List<ReplacePrice>> = body._replacePrices()

    /**
     * Returns the raw JSON value of [trialDurationDays].
     *
     * Unlike [trialDurationDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _trialDurationDays(): JsonField<Long> = body._trialDurationDays()

    /**
     * Returns the raw JSON value of [usageCustomerIds].
     *
     * Unlike [usageCustomerIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _usageCustomerIds(): JsonField<List<String>> = body._usageCustomerIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionSchedulePlanChangeParams].
         *
         * The following fields are required:
         * ```java
         * .changeOption()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionSchedulePlanChangeParams]. */
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            subscriptionSchedulePlanChangeParams: SubscriptionSchedulePlanChangeParams
        ) = apply {
            subscriptionId = subscriptionSchedulePlanChangeParams.subscriptionId
            body = subscriptionSchedulePlanChangeParams.body.toBuilder()
            additionalHeaders = subscriptionSchedulePlanChangeParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                subscriptionSchedulePlanChangeParams.additionalQueryParams.toBuilder()
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
         * - [addAdjustments]
         * - [addPrices]
         * - [alignBillingWithPlanChangeDate]
         * - [autoCollection]
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
         * Additional adjustments to be added to the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        fun addAdjustments(addAdjustments: List<AddAdjustment>?) = apply {
            body.addAdjustments(addAdjustments)
        }

        /** Alias for calling [Builder.addAdjustments] with `addAdjustments.orElse(null)`. */
        fun addAdjustments(addAdjustments: Optional<List<AddAdjustment>>) =
            addAdjustments(addAdjustments.getOrNull())

        /**
         * Sets [Builder.addAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addAdjustments] with a well-typed `List<AddAdjustment>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun addAdjustments(addAdjustments: JsonField<List<AddAdjustment>>) = apply {
            body.addAdjustments(addAdjustments)
        }

        /**
         * Adds a single [AddAdjustment] to [addAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddAdjustment(addAdjustment: AddAdjustment) = apply {
            body.addAddAdjustment(addAdjustment)
        }

        /**
         * Additional prices to be added to the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        fun addPrices(addPrices: List<AddPrice>?) = apply { body.addPrices(addPrices) }

        /** Alias for calling [Builder.addPrices] with `addPrices.orElse(null)`. */
        fun addPrices(addPrices: Optional<List<AddPrice>>) = addPrices(addPrices.getOrNull())

        /**
         * Sets [Builder.addPrices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addPrices] with a well-typed `List<AddPrice>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addPrices(addPrices: JsonField<List<AddPrice>>) = apply { body.addPrices(addPrices) }

        /**
         * Adds a single [AddPrice] to [addPrices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddPrice(addPrice: AddPrice) = apply { body.addAddPrice(addPrice) }

        /**
         * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
         * with the plan change's effective date.
         */
        fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: Boolean?) = apply {
            body.alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate)
        }

        /**
         * Alias for [Builder.alignBillingWithPlanChangeDate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: Boolean) =
            alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate as Boolean?)

        /**
         * Alias for calling [Builder.alignBillingWithPlanChangeDate] with
         * `alignBillingWithPlanChangeDate.orElse(null)`.
         */
        fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: Optional<Boolean>) =
            alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate.getOrNull())

        /**
         * Sets [Builder.alignBillingWithPlanChangeDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alignBillingWithPlanChangeDate] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: JsonField<Boolean>) =
            apply {
                body.alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate)
            }

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. If not specified, this defaults to the
         * behavior configured for this customer.
         */
        fun autoCollection(autoCollection: Boolean?) = apply { body.autoCollection(autoCollection) }

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
            body.autoCollection(autoCollection)
        }

        /**
         * Reset billing periods to be aligned with the plan change's effective date or start of the
         * month. Defaults to `unchanged` which keeps subscription's existing billing cycle
         * alignment.
         */
        fun billingCycleAlignment(billingCycleAlignment: BillingCycleAlignment?) = apply {
            body.billingCycleAlignment(billingCycleAlignment)
        }

        /**
         * Alias for calling [Builder.billingCycleAlignment] with
         * `billingCycleAlignment.orElse(null)`.
         */
        fun billingCycleAlignment(billingCycleAlignment: Optional<BillingCycleAlignment>) =
            billingCycleAlignment(billingCycleAlignment.getOrNull())

        /**
         * Sets [Builder.billingCycleAlignment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCycleAlignment] with a well-typed
         * [BillingCycleAlignment] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun billingCycleAlignment(billingCycleAlignment: JsonField<BillingCycleAlignment>) = apply {
            body.billingCycleAlignment(billingCycleAlignment)
        }

        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration?
        ) = apply { body.billingCycleAnchorConfiguration(billingCycleAnchorConfiguration) }

        /**
         * Alias for calling [Builder.billingCycleAnchorConfiguration] with
         * `billingCycleAnchorConfiguration.orElse(null)`.
         */
        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: Optional<BillingCycleAnchorConfiguration>
        ) = billingCycleAnchorConfiguration(billingCycleAnchorConfiguration.getOrNull())

        /**
         * Sets [Builder.billingCycleAnchorConfiguration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCycleAnchorConfiguration] with a well-typed
         * [BillingCycleAnchorConfiguration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun billingCycleAnchorConfiguration(
            billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>
        ) = apply { body.billingCycleAnchorConfiguration(billingCycleAnchorConfiguration) }

        /**
         * The date that the plan change should take effect. This parameter can only be passed if
         * the `change_option` is `requested_date`. If a date with no time is passed, the plan
         * change will happen at midnight in the customer's timezone.
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

        /**
         * Redemption code to be used for this subscription. If the coupon cannot be found by its
         * redemption code, or cannot be redeemed, an error response will be returned and the
         * subscription creation or plan change will not be scheduled.
         */
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

        @Deprecated("deprecated")
        fun creditsOverageRate(creditsOverageRate: Double?) = apply {
            body.creditsOverageRate(creditsOverageRate)
        }

        /**
         * Alias for [Builder.creditsOverageRate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        @Deprecated("deprecated")
        fun creditsOverageRate(creditsOverageRate: Double) =
            creditsOverageRate(creditsOverageRate as Double?)

        /**
         * Alias for calling [Builder.creditsOverageRate] with `creditsOverageRate.orElse(null)`.
         */
        @Deprecated("deprecated")
        fun creditsOverageRate(creditsOverageRate: Optional<Double>) =
            creditsOverageRate(creditsOverageRate.getOrNull())

        /**
         * Sets [Builder.creditsOverageRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditsOverageRate] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun creditsOverageRate(creditsOverageRate: JsonField<Double>) = apply {
            body.creditsOverageRate(creditsOverageRate)
        }

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String?) = apply {
            body.defaultInvoiceMemo(defaultInvoiceMemo)
        }

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
            body.defaultInvoiceMemo(defaultInvoiceMemo)
        }

        /**
         * The external_plan_id of the plan that the given subscription should be switched to. Note
         * that either this property or `plan_id` must be specified.
         */
        fun externalPlanId(externalPlanId: String?) = apply { body.externalPlanId(externalPlanId) }

        /** Alias for calling [Builder.externalPlanId] with `externalPlanId.orElse(null)`. */
        fun externalPlanId(externalPlanId: Optional<String>) =
            externalPlanId(externalPlanId.getOrNull())

        /**
         * Sets [Builder.externalPlanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalPlanId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalPlanId(externalPlanId: JsonField<String>) = apply {
            body.externalPlanId(externalPlanId)
        }

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         */
        fun filter(filter: String?) = apply { body.filter(filter) }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { body.filter(filter) }

        /** The phase of the plan to start with */
        fun initialPhaseOrder(initialPhaseOrder: Long?) = apply {
            body.initialPhaseOrder(initialPhaseOrder)
        }

        /**
         * Alias for [Builder.initialPhaseOrder].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun initialPhaseOrder(initialPhaseOrder: Long) =
            initialPhaseOrder(initialPhaseOrder as Long?)

        /** Alias for calling [Builder.initialPhaseOrder] with `initialPhaseOrder.orElse(null)`. */
        fun initialPhaseOrder(initialPhaseOrder: Optional<Long>) =
            initialPhaseOrder(initialPhaseOrder.getOrNull())

        /**
         * Sets [Builder.initialPhaseOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialPhaseOrder] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun initialPhaseOrder(initialPhaseOrder: JsonField<Long>) = apply {
            body.initialPhaseOrder(initialPhaseOrder)
        }

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will be issued
         * for the subscription. If not specified, invoices will only be issued at the end of the
         * billing period.
         */
        fun invoicingThreshold(invoicingThreshold: String?) = apply {
            body.invoicingThreshold(invoicingThreshold)
        }

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
            body.invoicingThreshold(invoicingThreshold)
        }

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0. If not
         * provided, this defaults to the value specified in the plan.
         */
        fun netTerms(netTerms: Long?) = apply { body.netTerms(netTerms) }

        /**
         * Alias for [Builder.netTerms].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

        /** Alias for calling [Builder.netTerms] with `netTerms.orElse(null)`. */
        fun netTerms(netTerms: Optional<Long>) = netTerms(netTerms.getOrNull())

        /**
         * Sets [Builder.netTerms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netTerms] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { body.netTerms(netTerms) }

        @Deprecated("deprecated")
        fun perCreditOverageAmount(perCreditOverageAmount: Double?) = apply {
            body.perCreditOverageAmount(perCreditOverageAmount)
        }

        /**
         * Alias for [Builder.perCreditOverageAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        @Deprecated("deprecated")
        fun perCreditOverageAmount(perCreditOverageAmount: Double) =
            perCreditOverageAmount(perCreditOverageAmount as Double?)

        /**
         * Alias for calling [Builder.perCreditOverageAmount] with
         * `perCreditOverageAmount.orElse(null)`.
         */
        @Deprecated("deprecated")
        fun perCreditOverageAmount(perCreditOverageAmount: Optional<Double>) =
            perCreditOverageAmount(perCreditOverageAmount.getOrNull())

        /**
         * Sets [Builder.perCreditOverageAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perCreditOverageAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun perCreditOverageAmount(perCreditOverageAmount: JsonField<Double>) = apply {
            body.perCreditOverageAmount(perCreditOverageAmount)
        }

        /**
         * The plan that the given subscription should be switched to. Note that either this
         * property or `external_plan_id` must be specified.
         */
        fun planId(planId: String?) = apply { body.planId(planId) }

        /** Alias for calling [Builder.planId] with `planId.orElse(null)`. */
        fun planId(planId: Optional<String>) = planId(planId.getOrNull())

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /**
         * Specifies which version of the plan to change to. If null, the default version will be
         * used.
         */
        fun planVersionNumber(planVersionNumber: Long?) = apply {
            body.planVersionNumber(planVersionNumber)
        }

        /**
         * Alias for [Builder.planVersionNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun planVersionNumber(planVersionNumber: Long) =
            planVersionNumber(planVersionNumber as Long?)

        /** Alias for calling [Builder.planVersionNumber] with `planVersionNumber.orElse(null)`. */
        fun planVersionNumber(planVersionNumber: Optional<Long>) =
            planVersionNumber(planVersionNumber.getOrNull())

        /**
         * Sets [Builder.planVersionNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planVersionNumber] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planVersionNumber(planVersionNumber: JsonField<Long>) = apply {
            body.planVersionNumber(planVersionNumber)
        }

        /** Optionally provide a list of overrides for prices on the plan */
        @Deprecated("deprecated")
        fun priceOverrides(priceOverrides: List<JsonValue>?) = apply {
            body.priceOverrides(priceOverrides)
        }

        /** Alias for calling [Builder.priceOverrides] with `priceOverrides.orElse(null)`. */
        @Deprecated("deprecated")
        fun priceOverrides(priceOverrides: Optional<List<JsonValue>>) =
            priceOverrides(priceOverrides.getOrNull())

        /**
         * Sets [Builder.priceOverrides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceOverrides] with a well-typed `List<JsonValue>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("deprecated")
        fun priceOverrides(priceOverrides: JsonField<List<JsonValue>>) = apply {
            body.priceOverrides(priceOverrides)
        }

        /**
         * Adds a single [JsonValue] to [priceOverrides].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        @Deprecated("deprecated")
        fun addPriceOverride(priceOverride: JsonValue) = apply {
            body.addPriceOverride(priceOverride)
        }

        /**
         * Plan adjustments to be removed from the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         */
        fun removeAdjustments(removeAdjustments: List<RemoveAdjustment>?) = apply {
            body.removeAdjustments(removeAdjustments)
        }

        /** Alias for calling [Builder.removeAdjustments] with `removeAdjustments.orElse(null)`. */
        fun removeAdjustments(removeAdjustments: Optional<List<RemoveAdjustment>>) =
            removeAdjustments(removeAdjustments.getOrNull())

        /**
         * Sets [Builder.removeAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removeAdjustments] with a well-typed
         * `List<RemoveAdjustment>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun removeAdjustments(removeAdjustments: JsonField<List<RemoveAdjustment>>) = apply {
            body.removeAdjustments(removeAdjustments)
        }

        /**
         * Adds a single [RemoveAdjustment] to [removeAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemoveAdjustment(removeAdjustment: RemoveAdjustment) = apply {
            body.addRemoveAdjustment(removeAdjustment)
        }

        /**
         * Plan prices to be removed from the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         */
        fun removePrices(removePrices: List<RemovePrice>?) = apply {
            body.removePrices(removePrices)
        }

        /** Alias for calling [Builder.removePrices] with `removePrices.orElse(null)`. */
        fun removePrices(removePrices: Optional<List<RemovePrice>>) =
            removePrices(removePrices.getOrNull())

        /**
         * Sets [Builder.removePrices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.removePrices] with a well-typed `List<RemovePrice>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun removePrices(removePrices: JsonField<List<RemovePrice>>) = apply {
            body.removePrices(removePrices)
        }

        /**
         * Adds a single [RemovePrice] to [removePrices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemovePrice(removePrice: RemovePrice) = apply { body.addRemovePrice(removePrice) }

        /**
         * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
         * available for accounts that have migrated off of legacy subscription overrides)
         */
        fun replaceAdjustments(replaceAdjustments: List<ReplaceAdjustment>?) = apply {
            body.replaceAdjustments(replaceAdjustments)
        }

        /**
         * Alias for calling [Builder.replaceAdjustments] with `replaceAdjustments.orElse(null)`.
         */
        fun replaceAdjustments(replaceAdjustments: Optional<List<ReplaceAdjustment>>) =
            replaceAdjustments(replaceAdjustments.getOrNull())

        /**
         * Sets [Builder.replaceAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replaceAdjustments] with a well-typed
         * `List<ReplaceAdjustment>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun replaceAdjustments(replaceAdjustments: JsonField<List<ReplaceAdjustment>>) = apply {
            body.replaceAdjustments(replaceAdjustments)
        }

        /**
         * Adds a single [ReplaceAdjustment] to [replaceAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReplaceAdjustment(replaceAdjustment: ReplaceAdjustment) = apply {
            body.addReplaceAdjustment(replaceAdjustment)
        }

        /**
         * Plan prices to be replaced with additional prices on the subscription. (Only available
         * for accounts that have migrated off of legacy subscription overrides)
         */
        fun replacePrices(replacePrices: List<ReplacePrice>?) = apply {
            body.replacePrices(replacePrices)
        }

        /** Alias for calling [Builder.replacePrices] with `replacePrices.orElse(null)`. */
        fun replacePrices(replacePrices: Optional<List<ReplacePrice>>) =
            replacePrices(replacePrices.getOrNull())

        /**
         * Sets [Builder.replacePrices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replacePrices] with a well-typed `List<ReplacePrice>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun replacePrices(replacePrices: JsonField<List<ReplacePrice>>) = apply {
            body.replacePrices(replacePrices)
        }

        /**
         * Adds a single [ReplacePrice] to [replacePrices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReplacePrice(replacePrice: ReplacePrice) = apply {
            body.addReplacePrice(replacePrice)
        }

        /**
         * The duration of the trial period in days. If not provided, this defaults to the value
         * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
         */
        fun trialDurationDays(trialDurationDays: Long?) = apply {
            body.trialDurationDays(trialDurationDays)
        }

        /**
         * Alias for [Builder.trialDurationDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun trialDurationDays(trialDurationDays: Long) =
            trialDurationDays(trialDurationDays as Long?)

        /** Alias for calling [Builder.trialDurationDays] with `trialDurationDays.orElse(null)`. */
        fun trialDurationDays(trialDurationDays: Optional<Long>) =
            trialDurationDays(trialDurationDays.getOrNull())

        /**
         * Sets [Builder.trialDurationDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialDurationDays] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trialDurationDays(trialDurationDays: JsonField<Long>) = apply {
            body.trialDurationDays(trialDurationDays)
        }

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         */
        fun usageCustomerIds(usageCustomerIds: List<String>?) = apply {
            body.usageCustomerIds(usageCustomerIds)
        }

        /** Alias for calling [Builder.usageCustomerIds] with `usageCustomerIds.orElse(null)`. */
        fun usageCustomerIds(usageCustomerIds: Optional<List<String>>) =
            usageCustomerIds(usageCustomerIds.getOrNull())

        /**
         * Sets [Builder.usageCustomerIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageCustomerIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
            body.usageCustomerIds(usageCustomerIds)
        }

        /**
         * Adds a single [String] to [usageCustomerIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUsageCustomerId(usageCustomerId: String) = apply {
            body.addUsageCustomerId(usageCustomerId)
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
         * Returns an immutable instance of [SubscriptionSchedulePlanChangeParams].
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
        fun build(): SubscriptionSchedulePlanChangeParams =
            SubscriptionSchedulePlanChangeParams(
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
        private val addAdjustments: JsonField<List<AddAdjustment>>,
        private val addPrices: JsonField<List<AddPrice>>,
        private val alignBillingWithPlanChangeDate: JsonField<Boolean>,
        private val autoCollection: JsonField<Boolean>,
        private val billingCycleAlignment: JsonField<BillingCycleAlignment>,
        private val billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>,
        private val changeDate: JsonField<OffsetDateTime>,
        private val couponRedemptionCode: JsonField<String>,
        private val creditsOverageRate: JsonField<Double>,
        private val defaultInvoiceMemo: JsonField<String>,
        private val externalPlanId: JsonField<String>,
        private val filter: JsonField<String>,
        private val initialPhaseOrder: JsonField<Long>,
        private val invoicingThreshold: JsonField<String>,
        private val netTerms: JsonField<Long>,
        private val perCreditOverageAmount: JsonField<Double>,
        private val planId: JsonField<String>,
        private val planVersionNumber: JsonField<Long>,
        private val priceOverrides: JsonField<List<JsonValue>>,
        private val removeAdjustments: JsonField<List<RemoveAdjustment>>,
        private val removePrices: JsonField<List<RemovePrice>>,
        private val replaceAdjustments: JsonField<List<ReplaceAdjustment>>,
        private val replacePrices: JsonField<List<ReplacePrice>>,
        private val trialDurationDays: JsonField<Long>,
        private val usageCustomerIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("change_option")
            @ExcludeMissing
            changeOption: JsonField<ChangeOption> = JsonMissing.of(),
            @JsonProperty("add_adjustments")
            @ExcludeMissing
            addAdjustments: JsonField<List<AddAdjustment>> = JsonMissing.of(),
            @JsonProperty("add_prices")
            @ExcludeMissing
            addPrices: JsonField<List<AddPrice>> = JsonMissing.of(),
            @JsonProperty("align_billing_with_plan_change_date")
            @ExcludeMissing
            alignBillingWithPlanChangeDate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("auto_collection")
            @ExcludeMissing
            autoCollection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("billing_cycle_alignment")
            @ExcludeMissing
            billingCycleAlignment: JsonField<BillingCycleAlignment> = JsonMissing.of(),
            @JsonProperty("billing_cycle_anchor_configuration")
            @ExcludeMissing
            billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration> =
                JsonMissing.of(),
            @JsonProperty("change_date")
            @ExcludeMissing
            changeDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("coupon_redemption_code")
            @ExcludeMissing
            couponRedemptionCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credits_overage_rate")
            @ExcludeMissing
            creditsOverageRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("default_invoice_memo")
            @ExcludeMissing
            defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_plan_id")
            @ExcludeMissing
            externalPlanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("initial_phase_order")
            @ExcludeMissing
            initialPhaseOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("invoicing_threshold")
            @ExcludeMissing
            invoicingThreshold: JsonField<String> = JsonMissing.of(),
            @JsonProperty("net_terms") @ExcludeMissing netTerms: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("per_credit_overage_amount")
            @ExcludeMissing
            perCreditOverageAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("plan_id") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_version_number")
            @ExcludeMissing
            planVersionNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("price_overrides")
            @ExcludeMissing
            priceOverrides: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("remove_adjustments")
            @ExcludeMissing
            removeAdjustments: JsonField<List<RemoveAdjustment>> = JsonMissing.of(),
            @JsonProperty("remove_prices")
            @ExcludeMissing
            removePrices: JsonField<List<RemovePrice>> = JsonMissing.of(),
            @JsonProperty("replace_adjustments")
            @ExcludeMissing
            replaceAdjustments: JsonField<List<ReplaceAdjustment>> = JsonMissing.of(),
            @JsonProperty("replace_prices")
            @ExcludeMissing
            replacePrices: JsonField<List<ReplacePrice>> = JsonMissing.of(),
            @JsonProperty("trial_duration_days")
            @ExcludeMissing
            trialDurationDays: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("usage_customer_ids")
            @ExcludeMissing
            usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            changeOption,
            addAdjustments,
            addPrices,
            alignBillingWithPlanChangeDate,
            autoCollection,
            billingCycleAlignment,
            billingCycleAnchorConfiguration,
            changeDate,
            couponRedemptionCode,
            creditsOverageRate,
            defaultInvoiceMemo,
            externalPlanId,
            filter,
            initialPhaseOrder,
            invoicingThreshold,
            netTerms,
            perCreditOverageAmount,
            planId,
            planVersionNumber,
            priceOverrides,
            removeAdjustments,
            removePrices,
            replaceAdjustments,
            replacePrices,
            trialDurationDays,
            usageCustomerIds,
            mutableMapOf(),
        )

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun changeOption(): ChangeOption = changeOption.getRequired("change_option")

        /**
         * Additional adjustments to be added to the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addAdjustments(): Optional<List<AddAdjustment>> =
            addAdjustments.getOptional("add_adjustments")

        /**
         * Additional prices to be added to the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addPrices(): Optional<List<AddPrice>> = addPrices.getOptional("add_prices")

        /**
         * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
         * with the plan change's effective date.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alignBillingWithPlanChangeDate(): Optional<Boolean> =
            alignBillingWithPlanChangeDate.getOptional("align_billing_with_plan_change_date")

        /**
         * Determines whether issued invoices for this subscription will automatically be charged
         * with the saved payment method on the due date. If not specified, this defaults to the
         * behavior configured for this customer.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoCollection(): Optional<Boolean> = autoCollection.getOptional("auto_collection")

        /**
         * Reset billing periods to be aligned with the plan change's effective date or start of the
         * month. Defaults to `unchanged` which keeps subscription's existing billing cycle
         * alignment.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingCycleAlignment(): Optional<BillingCycleAlignment> =
            billingCycleAlignment.getOptional("billing_cycle_alignment")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingCycleAnchorConfiguration(): Optional<BillingCycleAnchorConfiguration> =
            billingCycleAnchorConfiguration.getOptional("billing_cycle_anchor_configuration")

        /**
         * The date that the plan change should take effect. This parameter can only be passed if
         * the `change_option` is `requested_date`. If a date with no time is passed, the plan
         * change will happen at midnight in the customer's timezone.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun changeDate(): Optional<OffsetDateTime> = changeDate.getOptional("change_date")

        /**
         * Redemption code to be used for this subscription. If the coupon cannot be found by its
         * redemption code, or cannot be redeemed, an error response will be returned and the
         * subscription creation or plan change will not be scheduled.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun couponRedemptionCode(): Optional<String> =
            couponRedemptionCode.getOptional("coupon_redemption_code")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun creditsOverageRate(): Optional<Double> =
            creditsOverageRate.getOptional("credits_overage_rate")

        /**
         * Determines the default memo on this subscription's invoices. Note that if this is not
         * provided, it is determined by the plan configuration.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultInvoiceMemo(): Optional<String> =
            defaultInvoiceMemo.getOptional("default_invoice_memo")

        /**
         * The external_plan_id of the plan that the given subscription should be switched to. Note
         * that either this property or `plan_id` must be specified.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPlanId(): Optional<String> = externalPlanId.getOptional("external_plan_id")

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * The phase of the plan to start with
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun initialPhaseOrder(): Optional<Long> =
            initialPhaseOrder.getOptional("initial_phase_order")

        /**
         * When this subscription's accrued usage reaches this threshold, an invoice will be issued
         * for the subscription. If not specified, invoices will only be issued at the end of the
         * billing period.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoicingThreshold(): Optional<String> =
            invoicingThreshold.getOptional("invoicing_threshold")

        /**
         * The net terms determines the difference between the invoice date and the issue date for
         * the invoice. If you intend the invoice to be due on issue, set this to 0. If not
         * provided, this defaults to the value specified in the plan.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun netTerms(): Optional<Long> = netTerms.getOptional("net_terms")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun perCreditOverageAmount(): Optional<Double> =
            perCreditOverageAmount.getOptional("per_credit_overage_amount")

        /**
         * The plan that the given subscription should be switched to. Note that either this
         * property or `external_plan_id` must be specified.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planId(): Optional<String> = planId.getOptional("plan_id")

        /**
         * Specifies which version of the plan to change to. If null, the default version will be
         * used.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planVersionNumber(): Optional<Long> =
            planVersionNumber.getOptional("plan_version_number")

        /**
         * Optionally provide a list of overrides for prices on the plan
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun priceOverrides(): Optional<List<JsonValue>> =
            priceOverrides.getOptional("price_overrides")

        /**
         * Plan adjustments to be removed from the subscription. (Only available for accounts that
         * have migrated off of legacy subscription overrides)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun removeAdjustments(): Optional<List<RemoveAdjustment>> =
            removeAdjustments.getOptional("remove_adjustments")

        /**
         * Plan prices to be removed from the subscription. (Only available for accounts that have
         * migrated off of legacy subscription overrides)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun removePrices(): Optional<List<RemovePrice>> = removePrices.getOptional("remove_prices")

        /**
         * Plan adjustments to be replaced with additional adjustments on the subscription. (Only
         * available for accounts that have migrated off of legacy subscription overrides)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replaceAdjustments(): Optional<List<ReplaceAdjustment>> =
            replaceAdjustments.getOptional("replace_adjustments")

        /**
         * Plan prices to be replaced with additional prices on the subscription. (Only available
         * for accounts that have migrated off of legacy subscription overrides)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replacePrices(): Optional<List<ReplacePrice>> =
            replacePrices.getOptional("replace_prices")

        /**
         * The duration of the trial period in days. If not provided, this defaults to the value
         * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trialDurationDays(): Optional<Long> =
            trialDurationDays.getOptional("trial_duration_days")

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageCustomerIds(): Optional<List<String>> =
            usageCustomerIds.getOptional("usage_customer_ids")

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
         * Returns the raw JSON value of [addAdjustments].
         *
         * Unlike [addAdjustments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("add_adjustments")
        @ExcludeMissing
        fun _addAdjustments(): JsonField<List<AddAdjustment>> = addAdjustments

        /**
         * Returns the raw JSON value of [addPrices].
         *
         * Unlike [addPrices], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("add_prices")
        @ExcludeMissing
        fun _addPrices(): JsonField<List<AddPrice>> = addPrices

        /**
         * Returns the raw JSON value of [alignBillingWithPlanChangeDate].
         *
         * Unlike [alignBillingWithPlanChangeDate], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("align_billing_with_plan_change_date")
        @ExcludeMissing
        fun _alignBillingWithPlanChangeDate(): JsonField<Boolean> = alignBillingWithPlanChangeDate

        /**
         * Returns the raw JSON value of [autoCollection].
         *
         * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_collection")
        @ExcludeMissing
        fun _autoCollection(): JsonField<Boolean> = autoCollection

        /**
         * Returns the raw JSON value of [billingCycleAlignment].
         *
         * Unlike [billingCycleAlignment], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billing_cycle_alignment")
        @ExcludeMissing
        fun _billingCycleAlignment(): JsonField<BillingCycleAlignment> = billingCycleAlignment

        /**
         * Returns the raw JSON value of [billingCycleAnchorConfiguration].
         *
         * Unlike [billingCycleAnchorConfiguration], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("billing_cycle_anchor_configuration")
        @ExcludeMissing
        fun _billingCycleAnchorConfiguration(): JsonField<BillingCycleAnchorConfiguration> =
            billingCycleAnchorConfiguration

        /**
         * Returns the raw JSON value of [changeDate].
         *
         * Unlike [changeDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("change_date")
        @ExcludeMissing
        fun _changeDate(): JsonField<OffsetDateTime> = changeDate

        /**
         * Returns the raw JSON value of [couponRedemptionCode].
         *
         * Unlike [couponRedemptionCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("coupon_redemption_code")
        @ExcludeMissing
        fun _couponRedemptionCode(): JsonField<String> = couponRedemptionCode

        /**
         * Returns the raw JSON value of [creditsOverageRate].
         *
         * Unlike [creditsOverageRate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("credits_overage_rate")
        @ExcludeMissing
        fun _creditsOverageRate(): JsonField<Double> = creditsOverageRate

        /**
         * Returns the raw JSON value of [defaultInvoiceMemo].
         *
         * Unlike [defaultInvoiceMemo], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("default_invoice_memo")
        @ExcludeMissing
        fun _defaultInvoiceMemo(): JsonField<String> = defaultInvoiceMemo

        /**
         * Returns the raw JSON value of [externalPlanId].
         *
         * Unlike [externalPlanId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        fun _externalPlanId(): JsonField<String> = externalPlanId

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [initialPhaseOrder].
         *
         * Unlike [initialPhaseOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("initial_phase_order")
        @ExcludeMissing
        fun _initialPhaseOrder(): JsonField<Long> = initialPhaseOrder

        /**
         * Returns the raw JSON value of [invoicingThreshold].
         *
         * Unlike [invoicingThreshold], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("invoicing_threshold")
        @ExcludeMissing
        fun _invoicingThreshold(): JsonField<String> = invoicingThreshold

        /**
         * Returns the raw JSON value of [netTerms].
         *
         * Unlike [netTerms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

        /**
         * Returns the raw JSON value of [perCreditOverageAmount].
         *
         * Unlike [perCreditOverageAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("per_credit_overage_amount")
        @ExcludeMissing
        fun _perCreditOverageAmount(): JsonField<Double> = perCreditOverageAmount

        /**
         * Returns the raw JSON value of [planId].
         *
         * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /**
         * Returns the raw JSON value of [planVersionNumber].
         *
         * Unlike [planVersionNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_version_number")
        @ExcludeMissing
        fun _planVersionNumber(): JsonField<Long> = planVersionNumber

        /**
         * Returns the raw JSON value of [priceOverrides].
         *
         * Unlike [priceOverrides], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("price_overrides")
        @ExcludeMissing
        fun _priceOverrides(): JsonField<List<JsonValue>> = priceOverrides

        /**
         * Returns the raw JSON value of [removeAdjustments].
         *
         * Unlike [removeAdjustments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("remove_adjustments")
        @ExcludeMissing
        fun _removeAdjustments(): JsonField<List<RemoveAdjustment>> = removeAdjustments

        /**
         * Returns the raw JSON value of [removePrices].
         *
         * Unlike [removePrices], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("remove_prices")
        @ExcludeMissing
        fun _removePrices(): JsonField<List<RemovePrice>> = removePrices

        /**
         * Returns the raw JSON value of [replaceAdjustments].
         *
         * Unlike [replaceAdjustments], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("replace_adjustments")
        @ExcludeMissing
        fun _replaceAdjustments(): JsonField<List<ReplaceAdjustment>> = replaceAdjustments

        /**
         * Returns the raw JSON value of [replacePrices].
         *
         * Unlike [replacePrices], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("replace_prices")
        @ExcludeMissing
        fun _replacePrices(): JsonField<List<ReplacePrice>> = replacePrices

        /**
         * Returns the raw JSON value of [trialDurationDays].
         *
         * Unlike [trialDurationDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trial_duration_days")
        @ExcludeMissing
        fun _trialDurationDays(): JsonField<Long> = trialDurationDays

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
            private var addAdjustments: JsonField<MutableList<AddAdjustment>>? = null
            private var addPrices: JsonField<MutableList<AddPrice>>? = null
            private var alignBillingWithPlanChangeDate: JsonField<Boolean> = JsonMissing.of()
            private var autoCollection: JsonField<Boolean> = JsonMissing.of()
            private var billingCycleAlignment: JsonField<BillingCycleAlignment> = JsonMissing.of()
            private var billingCycleAnchorConfiguration:
                JsonField<BillingCycleAnchorConfiguration> =
                JsonMissing.of()
            private var changeDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var couponRedemptionCode: JsonField<String> = JsonMissing.of()
            private var creditsOverageRate: JsonField<Double> = JsonMissing.of()
            private var defaultInvoiceMemo: JsonField<String> = JsonMissing.of()
            private var externalPlanId: JsonField<String> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var initialPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var invoicingThreshold: JsonField<String> = JsonMissing.of()
            private var netTerms: JsonField<Long> = JsonMissing.of()
            private var perCreditOverageAmount: JsonField<Double> = JsonMissing.of()
            private var planId: JsonField<String> = JsonMissing.of()
            private var planVersionNumber: JsonField<Long> = JsonMissing.of()
            private var priceOverrides: JsonField<MutableList<JsonValue>>? = null
            private var removeAdjustments: JsonField<MutableList<RemoveAdjustment>>? = null
            private var removePrices: JsonField<MutableList<RemovePrice>>? = null
            private var replaceAdjustments: JsonField<MutableList<ReplaceAdjustment>>? = null
            private var replacePrices: JsonField<MutableList<ReplacePrice>>? = null
            private var trialDurationDays: JsonField<Long> = JsonMissing.of()
            private var usageCustomerIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                changeOption = body.changeOption
                addAdjustments = body.addAdjustments.map { it.toMutableList() }
                addPrices = body.addPrices.map { it.toMutableList() }
                alignBillingWithPlanChangeDate = body.alignBillingWithPlanChangeDate
                autoCollection = body.autoCollection
                billingCycleAlignment = body.billingCycleAlignment
                billingCycleAnchorConfiguration = body.billingCycleAnchorConfiguration
                changeDate = body.changeDate
                couponRedemptionCode = body.couponRedemptionCode
                creditsOverageRate = body.creditsOverageRate
                defaultInvoiceMemo = body.defaultInvoiceMemo
                externalPlanId = body.externalPlanId
                filter = body.filter
                initialPhaseOrder = body.initialPhaseOrder
                invoicingThreshold = body.invoicingThreshold
                netTerms = body.netTerms
                perCreditOverageAmount = body.perCreditOverageAmount
                planId = body.planId
                planVersionNumber = body.planVersionNumber
                priceOverrides = body.priceOverrides.map { it.toMutableList() }
                removeAdjustments = body.removeAdjustments.map { it.toMutableList() }
                removePrices = body.removePrices.map { it.toMutableList() }
                replaceAdjustments = body.replaceAdjustments.map { it.toMutableList() }
                replacePrices = body.replacePrices.map { it.toMutableList() }
                trialDurationDays = body.trialDurationDays
                usageCustomerIds = body.usageCustomerIds.map { it.toMutableList() }
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
             * Additional adjustments to be added to the subscription. (Only available for accounts
             * that have migrated off of legacy subscription overrides)
             */
            fun addAdjustments(addAdjustments: List<AddAdjustment>?) =
                addAdjustments(JsonField.ofNullable(addAdjustments))

            /** Alias for calling [Builder.addAdjustments] with `addAdjustments.orElse(null)`. */
            fun addAdjustments(addAdjustments: Optional<List<AddAdjustment>>) =
                addAdjustments(addAdjustments.getOrNull())

            /**
             * Sets [Builder.addAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addAdjustments] with a well-typed
             * `List<AddAdjustment>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun addAdjustments(addAdjustments: JsonField<List<AddAdjustment>>) = apply {
                this.addAdjustments = addAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [AddAdjustment] to [addAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddAdjustment(addAdjustment: AddAdjustment) = apply {
                addAdjustments =
                    (addAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addAdjustments", it).add(addAdjustment)
                    }
            }

            /**
             * Additional prices to be added to the subscription. (Only available for accounts that
             * have migrated off of legacy subscription overrides)
             */
            fun addPrices(addPrices: List<AddPrice>?) = addPrices(JsonField.ofNullable(addPrices))

            /** Alias for calling [Builder.addPrices] with `addPrices.orElse(null)`. */
            fun addPrices(addPrices: Optional<List<AddPrice>>) = addPrices(addPrices.getOrNull())

            /**
             * Sets [Builder.addPrices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addPrices] with a well-typed `List<AddPrice>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addPrices(addPrices: JsonField<List<AddPrice>>) = apply {
                this.addPrices = addPrices.map { it.toMutableList() }
            }

            /**
             * Adds a single [AddPrice] to [addPrices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddPrice(addPrice: AddPrice) = apply {
                addPrices =
                    (addPrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addPrices", it).add(addPrice)
                    }
            }

            /**
             * [DEPRECATED] Use billing_cycle_alignment instead. Reset billing periods to be aligned
             * with the plan change's effective date.
             */
            fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: Boolean?) =
                alignBillingWithPlanChangeDate(JsonField.ofNullable(alignBillingWithPlanChangeDate))

            /**
             * Alias for [Builder.alignBillingWithPlanChangeDate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: Boolean) =
                alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate as Boolean?)

            /**
             * Alias for calling [Builder.alignBillingWithPlanChangeDate] with
             * `alignBillingWithPlanChangeDate.orElse(null)`.
             */
            fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: Optional<Boolean>) =
                alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate.getOrNull())

            /**
             * Sets [Builder.alignBillingWithPlanChangeDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alignBillingWithPlanChangeDate] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun alignBillingWithPlanChangeDate(alignBillingWithPlanChangeDate: JsonField<Boolean>) =
                apply {
                    this.alignBillingWithPlanChangeDate = alignBillingWithPlanChangeDate
                }

            /**
             * Determines whether issued invoices for this subscription will automatically be
             * charged with the saved payment method on the due date. If not specified, this
             * defaults to the behavior configured for this customer.
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

            /**
             * Reset billing periods to be aligned with the plan change's effective date or start of
             * the month. Defaults to `unchanged` which keeps subscription's existing billing cycle
             * alignment.
             */
            fun billingCycleAlignment(billingCycleAlignment: BillingCycleAlignment?) =
                billingCycleAlignment(JsonField.ofNullable(billingCycleAlignment))

            /**
             * Alias for calling [Builder.billingCycleAlignment] with
             * `billingCycleAlignment.orElse(null)`.
             */
            fun billingCycleAlignment(billingCycleAlignment: Optional<BillingCycleAlignment>) =
                billingCycleAlignment(billingCycleAlignment.getOrNull())

            /**
             * Sets [Builder.billingCycleAlignment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingCycleAlignment] with a well-typed
             * [BillingCycleAlignment] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun billingCycleAlignment(billingCycleAlignment: JsonField<BillingCycleAlignment>) =
                apply {
                    this.billingCycleAlignment = billingCycleAlignment
                }

            fun billingCycleAnchorConfiguration(
                billingCycleAnchorConfiguration: BillingCycleAnchorConfiguration?
            ) =
                billingCycleAnchorConfiguration(
                    JsonField.ofNullable(billingCycleAnchorConfiguration)
                )

            /**
             * Alias for calling [Builder.billingCycleAnchorConfiguration] with
             * `billingCycleAnchorConfiguration.orElse(null)`.
             */
            fun billingCycleAnchorConfiguration(
                billingCycleAnchorConfiguration: Optional<BillingCycleAnchorConfiguration>
            ) = billingCycleAnchorConfiguration(billingCycleAnchorConfiguration.getOrNull())

            /**
             * Sets [Builder.billingCycleAnchorConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingCycleAnchorConfiguration] with a well-typed
             * [BillingCycleAnchorConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun billingCycleAnchorConfiguration(
                billingCycleAnchorConfiguration: JsonField<BillingCycleAnchorConfiguration>
            ) = apply { this.billingCycleAnchorConfiguration = billingCycleAnchorConfiguration }

            /**
             * The date that the plan change should take effect. This parameter can only be passed
             * if the `change_option` is `requested_date`. If a date with no time is passed, the
             * plan change will happen at midnight in the customer's timezone.
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

            /**
             * Redemption code to be used for this subscription. If the coupon cannot be found by
             * its redemption code, or cannot be redeemed, an error response will be returned and
             * the subscription creation or plan change will not be scheduled.
             */
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

            @Deprecated("deprecated")
            fun creditsOverageRate(creditsOverageRate: Double?) =
                creditsOverageRate(JsonField.ofNullable(creditsOverageRate))

            /**
             * Alias for [Builder.creditsOverageRate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            @Deprecated("deprecated")
            fun creditsOverageRate(creditsOverageRate: Double) =
                creditsOverageRate(creditsOverageRate as Double?)

            /**
             * Alias for calling [Builder.creditsOverageRate] with
             * `creditsOverageRate.orElse(null)`.
             */
            @Deprecated("deprecated")
            fun creditsOverageRate(creditsOverageRate: Optional<Double>) =
                creditsOverageRate(creditsOverageRate.getOrNull())

            /**
             * Sets [Builder.creditsOverageRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditsOverageRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun creditsOverageRate(creditsOverageRate: JsonField<Double>) = apply {
                this.creditsOverageRate = creditsOverageRate
            }

            /**
             * Determines the default memo on this subscription's invoices. Note that if this is not
             * provided, it is determined by the plan configuration.
             */
            fun defaultInvoiceMemo(defaultInvoiceMemo: String?) =
                defaultInvoiceMemo(JsonField.ofNullable(defaultInvoiceMemo))

            /**
             * Alias for calling [Builder.defaultInvoiceMemo] with
             * `defaultInvoiceMemo.orElse(null)`.
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

            /**
             * The external_plan_id of the plan that the given subscription should be switched to.
             * Note that either this property or `plan_id` must be specified.
             */
            fun externalPlanId(externalPlanId: String?) =
                externalPlanId(JsonField.ofNullable(externalPlanId))

            /** Alias for calling [Builder.externalPlanId] with `externalPlanId.orElse(null)`. */
            fun externalPlanId(externalPlanId: Optional<String>) =
                externalPlanId(externalPlanId.getOrNull())

            /**
             * Sets [Builder.externalPlanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPlanId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPlanId(externalPlanId: JsonField<String>) = apply {
                this.externalPlanId = externalPlanId
            }

            /**
             * An additional filter to apply to usage queries. This filter must be expressed as a
             * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
             * null, usage queries will not include any additional filter.
             */
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

            /** The phase of the plan to start with */
            fun initialPhaseOrder(initialPhaseOrder: Long?) =
                initialPhaseOrder(JsonField.ofNullable(initialPhaseOrder))

            /**
             * Alias for [Builder.initialPhaseOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun initialPhaseOrder(initialPhaseOrder: Long) =
                initialPhaseOrder(initialPhaseOrder as Long?)

            /**
             * Alias for calling [Builder.initialPhaseOrder] with `initialPhaseOrder.orElse(null)`.
             */
            fun initialPhaseOrder(initialPhaseOrder: Optional<Long>) =
                initialPhaseOrder(initialPhaseOrder.getOrNull())

            /**
             * Sets [Builder.initialPhaseOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initialPhaseOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun initialPhaseOrder(initialPhaseOrder: JsonField<Long>) = apply {
                this.initialPhaseOrder = initialPhaseOrder
            }

            /**
             * When this subscription's accrued usage reaches this threshold, an invoice will be
             * issued for the subscription. If not specified, invoices will only be issued at the
             * end of the billing period.
             */
            fun invoicingThreshold(invoicingThreshold: String?) =
                invoicingThreshold(JsonField.ofNullable(invoicingThreshold))

            /**
             * Alias for calling [Builder.invoicingThreshold] with
             * `invoicingThreshold.orElse(null)`.
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

            /**
             * The net terms determines the difference between the invoice date and the issue date
             * for the invoice. If you intend the invoice to be due on issue, set this to 0. If not
             * provided, this defaults to the value specified in the plan.
             */
            fun netTerms(netTerms: Long?) = netTerms(JsonField.ofNullable(netTerms))

            /**
             * Alias for [Builder.netTerms].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

            /** Alias for calling [Builder.netTerms] with `netTerms.orElse(null)`. */
            fun netTerms(netTerms: Optional<Long>) = netTerms(netTerms.getOrNull())

            /**
             * Sets [Builder.netTerms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netTerms] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

            @Deprecated("deprecated")
            fun perCreditOverageAmount(perCreditOverageAmount: Double?) =
                perCreditOverageAmount(JsonField.ofNullable(perCreditOverageAmount))

            /**
             * Alias for [Builder.perCreditOverageAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            @Deprecated("deprecated")
            fun perCreditOverageAmount(perCreditOverageAmount: Double) =
                perCreditOverageAmount(perCreditOverageAmount as Double?)

            /**
             * Alias for calling [Builder.perCreditOverageAmount] with
             * `perCreditOverageAmount.orElse(null)`.
             */
            @Deprecated("deprecated")
            fun perCreditOverageAmount(perCreditOverageAmount: Optional<Double>) =
                perCreditOverageAmount(perCreditOverageAmount.getOrNull())

            /**
             * Sets [Builder.perCreditOverageAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perCreditOverageAmount] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated("deprecated")
            fun perCreditOverageAmount(perCreditOverageAmount: JsonField<Double>) = apply {
                this.perCreditOverageAmount = perCreditOverageAmount
            }

            /**
             * The plan that the given subscription should be switched to. Note that either this
             * property or `external_plan_id` must be specified.
             */
            fun planId(planId: String?) = planId(JsonField.ofNullable(planId))

            /** Alias for calling [Builder.planId] with `planId.orElse(null)`. */
            fun planId(planId: Optional<String>) = planId(planId.getOrNull())

            /**
             * Sets [Builder.planId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /**
             * Specifies which version of the plan to change to. If null, the default version will
             * be used.
             */
            fun planVersionNumber(planVersionNumber: Long?) =
                planVersionNumber(JsonField.ofNullable(planVersionNumber))

            /**
             * Alias for [Builder.planVersionNumber].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planVersionNumber(planVersionNumber: Long) =
                planVersionNumber(planVersionNumber as Long?)

            /**
             * Alias for calling [Builder.planVersionNumber] with `planVersionNumber.orElse(null)`.
             */
            fun planVersionNumber(planVersionNumber: Optional<Long>) =
                planVersionNumber(planVersionNumber.getOrNull())

            /**
             * Sets [Builder.planVersionNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planVersionNumber] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planVersionNumber(planVersionNumber: JsonField<Long>) = apply {
                this.planVersionNumber = planVersionNumber
            }

            /** Optionally provide a list of overrides for prices on the plan */
            @Deprecated("deprecated")
            fun priceOverrides(priceOverrides: List<JsonValue>?) =
                priceOverrides(JsonField.ofNullable(priceOverrides))

            /** Alias for calling [Builder.priceOverrides] with `priceOverrides.orElse(null)`. */
            @Deprecated("deprecated")
            fun priceOverrides(priceOverrides: Optional<List<JsonValue>>) =
                priceOverrides(priceOverrides.getOrNull())

            /**
             * Sets [Builder.priceOverrides] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceOverrides] with a well-typed `List<JsonValue>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated("deprecated")
            fun priceOverrides(priceOverrides: JsonField<List<JsonValue>>) = apply {
                this.priceOverrides = priceOverrides.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [priceOverrides].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            @Deprecated("deprecated")
            fun addPriceOverride(priceOverride: JsonValue) = apply {
                priceOverrides =
                    (priceOverrides ?: JsonField.of(mutableListOf())).also {
                        checkKnown("priceOverrides", it).add(priceOverride)
                    }
            }

            /**
             * Plan adjustments to be removed from the subscription. (Only available for accounts
             * that have migrated off of legacy subscription overrides)
             */
            fun removeAdjustments(removeAdjustments: List<RemoveAdjustment>?) =
                removeAdjustments(JsonField.ofNullable(removeAdjustments))

            /**
             * Alias for calling [Builder.removeAdjustments] with `removeAdjustments.orElse(null)`.
             */
            fun removeAdjustments(removeAdjustments: Optional<List<RemoveAdjustment>>) =
                removeAdjustments(removeAdjustments.getOrNull())

            /**
             * Sets [Builder.removeAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removeAdjustments] with a well-typed
             * `List<RemoveAdjustment>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun removeAdjustments(removeAdjustments: JsonField<List<RemoveAdjustment>>) = apply {
                this.removeAdjustments = removeAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [RemoveAdjustment] to [removeAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemoveAdjustment(removeAdjustment: RemoveAdjustment) = apply {
                removeAdjustments =
                    (removeAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removeAdjustments", it).add(removeAdjustment)
                    }
            }

            /**
             * Plan prices to be removed from the subscription. (Only available for accounts that
             * have migrated off of legacy subscription overrides)
             */
            fun removePrices(removePrices: List<RemovePrice>?) =
                removePrices(JsonField.ofNullable(removePrices))

            /** Alias for calling [Builder.removePrices] with `removePrices.orElse(null)`. */
            fun removePrices(removePrices: Optional<List<RemovePrice>>) =
                removePrices(removePrices.getOrNull())

            /**
             * Sets [Builder.removePrices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.removePrices] with a well-typed `List<RemovePrice>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun removePrices(removePrices: JsonField<List<RemovePrice>>) = apply {
                this.removePrices = removePrices.map { it.toMutableList() }
            }

            /**
             * Adds a single [RemovePrice] to [removePrices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemovePrice(removePrice: RemovePrice) = apply {
                removePrices =
                    (removePrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("removePrices", it).add(removePrice)
                    }
            }

            /**
             * Plan adjustments to be replaced with additional adjustments on the subscription.
             * (Only available for accounts that have migrated off of legacy subscription overrides)
             */
            fun replaceAdjustments(replaceAdjustments: List<ReplaceAdjustment>?) =
                replaceAdjustments(JsonField.ofNullable(replaceAdjustments))

            /**
             * Alias for calling [Builder.replaceAdjustments] with
             * `replaceAdjustments.orElse(null)`.
             */
            fun replaceAdjustments(replaceAdjustments: Optional<List<ReplaceAdjustment>>) =
                replaceAdjustments(replaceAdjustments.getOrNull())

            /**
             * Sets [Builder.replaceAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replaceAdjustments] with a well-typed
             * `List<ReplaceAdjustment>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun replaceAdjustments(replaceAdjustments: JsonField<List<ReplaceAdjustment>>) = apply {
                this.replaceAdjustments = replaceAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [ReplaceAdjustment] to [replaceAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReplaceAdjustment(replaceAdjustment: ReplaceAdjustment) = apply {
                replaceAdjustments =
                    (replaceAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("replaceAdjustments", it).add(replaceAdjustment)
                    }
            }

            /**
             * Plan prices to be replaced with additional prices on the subscription. (Only
             * available for accounts that have migrated off of legacy subscription overrides)
             */
            fun replacePrices(replacePrices: List<ReplacePrice>?) =
                replacePrices(JsonField.ofNullable(replacePrices))

            /** Alias for calling [Builder.replacePrices] with `replacePrices.orElse(null)`. */
            fun replacePrices(replacePrices: Optional<List<ReplacePrice>>) =
                replacePrices(replacePrices.getOrNull())

            /**
             * Sets [Builder.replacePrices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replacePrices] with a well-typed
             * `List<ReplacePrice>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun replacePrices(replacePrices: JsonField<List<ReplacePrice>>) = apply {
                this.replacePrices = replacePrices.map { it.toMutableList() }
            }

            /**
             * Adds a single [ReplacePrice] to [replacePrices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReplacePrice(replacePrice: ReplacePrice) = apply {
                replacePrices =
                    (replacePrices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("replacePrices", it).add(replacePrice)
                    }
            }

            /**
             * The duration of the trial period in days. If not provided, this defaults to the value
             * specified in the plan. If `0` is provided, the trial on the plan will be skipped.
             */
            fun trialDurationDays(trialDurationDays: Long?) =
                trialDurationDays(JsonField.ofNullable(trialDurationDays))

            /**
             * Alias for [Builder.trialDurationDays].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun trialDurationDays(trialDurationDays: Long) =
                trialDurationDays(trialDurationDays as Long?)

            /**
             * Alias for calling [Builder.trialDurationDays] with `trialDurationDays.orElse(null)`.
             */
            fun trialDurationDays(trialDurationDays: Optional<Long>) =
                trialDurationDays(trialDurationDays.getOrNull())

            /**
             * Sets [Builder.trialDurationDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialDurationDays] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trialDurationDays(trialDurationDays: JsonField<Long>) = apply {
                this.trialDurationDays = trialDurationDays
            }

            /**
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * subscription. By default, a subscription only considers usage events associated with
             * its attached customer's customer_id. When usage_customer_ids is provided, the
             * subscription includes usage events from the specified customers only. Provided
             * usage_customer_ids must be either the customer for this subscription itself, or any
             * of that customer's children.
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
                    (addAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (addPrices ?: JsonMissing.of()).map { it.toImmutable() },
                    alignBillingWithPlanChangeDate,
                    autoCollection,
                    billingCycleAlignment,
                    billingCycleAnchorConfiguration,
                    changeDate,
                    couponRedemptionCode,
                    creditsOverageRate,
                    defaultInvoiceMemo,
                    externalPlanId,
                    filter,
                    initialPhaseOrder,
                    invoicingThreshold,
                    netTerms,
                    perCreditOverageAmount,
                    planId,
                    planVersionNumber,
                    (priceOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                    (removeAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (removePrices ?: JsonMissing.of()).map { it.toImmutable() },
                    (replaceAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    (replacePrices ?: JsonMissing.of()).map { it.toImmutable() },
                    trialDurationDays,
                    (usageCustomerIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            changeOption().validate()
            addAdjustments().ifPresent { it.forEach { it.validate() } }
            addPrices().ifPresent { it.forEach { it.validate() } }
            alignBillingWithPlanChangeDate()
            autoCollection()
            billingCycleAlignment().ifPresent { it.validate() }
            billingCycleAnchorConfiguration().ifPresent { it.validate() }
            changeDate()
            couponRedemptionCode()
            creditsOverageRate()
            defaultInvoiceMemo()
            externalPlanId()
            filter()
            initialPhaseOrder()
            invoicingThreshold()
            netTerms()
            perCreditOverageAmount()
            planId()
            planVersionNumber()
            priceOverrides()
            removeAdjustments().ifPresent { it.forEach { it.validate() } }
            removePrices().ifPresent { it.forEach { it.validate() } }
            replaceAdjustments().ifPresent { it.forEach { it.validate() } }
            replacePrices().ifPresent { it.forEach { it.validate() } }
            trialDurationDays()
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
            (changeOption.asKnown().getOrNull()?.validity() ?: 0) +
                (addAdjustments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (addPrices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (alignBillingWithPlanChangeDate.asKnown().isPresent) 1 else 0) +
                (if (autoCollection.asKnown().isPresent) 1 else 0) +
                (billingCycleAlignment.asKnown().getOrNull()?.validity() ?: 0) +
                (billingCycleAnchorConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (changeDate.asKnown().isPresent) 1 else 0) +
                (if (couponRedemptionCode.asKnown().isPresent) 1 else 0) +
                (if (creditsOverageRate.asKnown().isPresent) 1 else 0) +
                (if (defaultInvoiceMemo.asKnown().isPresent) 1 else 0) +
                (if (externalPlanId.asKnown().isPresent) 1 else 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
                (if (initialPhaseOrder.asKnown().isPresent) 1 else 0) +
                (if (invoicingThreshold.asKnown().isPresent) 1 else 0) +
                (if (netTerms.asKnown().isPresent) 1 else 0) +
                (if (perCreditOverageAmount.asKnown().isPresent) 1 else 0) +
                (if (planId.asKnown().isPresent) 1 else 0) +
                (if (planVersionNumber.asKnown().isPresent) 1 else 0) +
                (priceOverrides.asKnown().getOrNull()?.size ?: 0) +
                (removeAdjustments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (removePrices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (replaceAdjustments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (replacePrices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (trialDurationDays.asKnown().isPresent) 1 else 0) +
                (usageCustomerIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && changeOption == other.changeOption && addAdjustments == other.addAdjustments && addPrices == other.addPrices && alignBillingWithPlanChangeDate == other.alignBillingWithPlanChangeDate && autoCollection == other.autoCollection && billingCycleAlignment == other.billingCycleAlignment && billingCycleAnchorConfiguration == other.billingCycleAnchorConfiguration && changeDate == other.changeDate && couponRedemptionCode == other.couponRedemptionCode && creditsOverageRate == other.creditsOverageRate && defaultInvoiceMemo == other.defaultInvoiceMemo && externalPlanId == other.externalPlanId && filter == other.filter && initialPhaseOrder == other.initialPhaseOrder && invoicingThreshold == other.invoicingThreshold && netTerms == other.netTerms && perCreditOverageAmount == other.perCreditOverageAmount && planId == other.planId && planVersionNumber == other.planVersionNumber && priceOverrides == other.priceOverrides && removeAdjustments == other.removeAdjustments && removePrices == other.removePrices && replaceAdjustments == other.replaceAdjustments && replacePrices == other.replacePrices && trialDurationDays == other.trialDurationDays && usageCustomerIds == other.usageCustomerIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(changeOption, addAdjustments, addPrices, alignBillingWithPlanChangeDate, autoCollection, billingCycleAlignment, billingCycleAnchorConfiguration, changeDate, couponRedemptionCode, creditsOverageRate, defaultInvoiceMemo, externalPlanId, filter, initialPhaseOrder, invoicingThreshold, netTerms, perCreditOverageAmount, planId, planVersionNumber, priceOverrides, removeAdjustments, removePrices, replaceAdjustments, replacePrices, trialDurationDays, usageCustomerIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{changeOption=$changeOption, addAdjustments=$addAdjustments, addPrices=$addPrices, alignBillingWithPlanChangeDate=$alignBillingWithPlanChangeDate, autoCollection=$autoCollection, billingCycleAlignment=$billingCycleAlignment, billingCycleAnchorConfiguration=$billingCycleAnchorConfiguration, changeDate=$changeDate, couponRedemptionCode=$couponRedemptionCode, creditsOverageRate=$creditsOverageRate, defaultInvoiceMemo=$defaultInvoiceMemo, externalPlanId=$externalPlanId, filter=$filter, initialPhaseOrder=$initialPhaseOrder, invoicingThreshold=$invoicingThreshold, netTerms=$netTerms, perCreditOverageAmount=$perCreditOverageAmount, planId=$planId, planVersionNumber=$planVersionNumber, priceOverrides=$priceOverrides, removeAdjustments=$removeAdjustments, removePrices=$removePrices, replaceAdjustments=$replaceAdjustments, replacePrices=$replacePrices, trialDurationDays=$trialDurationDays, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
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

    class AddAdjustment
    private constructor(
        private val adjustment: JsonField<Adjustment>,
        private val endDate: JsonField<OffsetDateTime>,
        private val planPhaseOrder: JsonField<Long>,
        private val startDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment")
            @ExcludeMissing
            adjustment: JsonField<Adjustment> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            planPhaseOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(adjustment, endDate, planPhaseOrder, startDate, mutableMapOf())

        /**
         * The definition of a new adjustment to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

        /**
         * The end date of the adjustment interval. This is the date that the adjustment will stop
         * affecting prices on the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

        /**
         * The phase to add this adjustment to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planPhaseOrder(): Optional<Long> = planPhaseOrder.getOptional("plan_phase_order")

        /**
         * The start date of the adjustment interval. This is the date that the adjustment will
         * start affecting prices on the subscription. If null, the adjustment will start when the
         * phase or subscription starts.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): Optional<OffsetDateTime> = startDate.getOptional("start_date")

        /**
         * Returns the raw JSON value of [adjustment].
         *
         * Unlike [adjustment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("adjustment")
        @ExcludeMissing
        fun _adjustment(): JsonField<Adjustment> = adjustment

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [planPhaseOrder].
         *
         * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

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
             * Returns a mutable builder for constructing an instance of [AddAdjustment].
             *
             * The following fields are required:
             * ```java
             * .adjustment()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AddAdjustment]. */
        class Builder internal constructor() {

            private var adjustment: JsonField<Adjustment>? = null
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addAdjustment: AddAdjustment) = apply {
                adjustment = addAdjustment.adjustment
                endDate = addAdjustment.endDate
                planPhaseOrder = addAdjustment.planPhaseOrder
                startDate = addAdjustment.startDate
                additionalProperties = addAdjustment.additionalProperties.toMutableMap()
            }

            /** The definition of a new adjustment to create and add to the subscription. */
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

            /**
             * Alias for calling [adjustment] with
             * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
             */
            fun adjustment(percentageDiscount: NewPercentageDiscount) =
                adjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```java
             * NewPercentageDiscount.builder()
             *     .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
             *     .percentageDiscount(percentageDiscount)
             *     .build()
             * ```
             */
            fun percentageDiscountAdjustment(percentageDiscount: Double) =
                adjustment(
                    NewPercentageDiscount.builder()
                        .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
                        .percentageDiscount(percentageDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`. */
            fun adjustment(usageDiscount: NewUsageDiscount) =
                adjustment(Adjustment.ofUsageDiscount(usageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```java
             * NewUsageDiscount.builder()
             *     .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
             *     .usageDiscount(usageDiscount)
             *     .build()
             * ```
             */
            fun usageDiscountAdjustment(usageDiscount: Double) =
                adjustment(
                    NewUsageDiscount.builder()
                        .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
                        .usageDiscount(usageDiscount)
                        .build()
                )

            /**
             * Alias for calling [adjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`.
             */
            fun adjustment(amountDiscount: NewAmountDiscount) =
                adjustment(Adjustment.ofAmountDiscount(amountDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```java
             * NewAmountDiscount.builder()
             *     .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
             *     .amountDiscount(amountDiscount)
             *     .build()
             * ```
             */
            fun amountDiscountAdjustment(amountDiscount: String) =
                adjustment(
                    NewAmountDiscount.builder()
                        .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
                        .amountDiscount(amountDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofMinimum(minimum)`. */
            fun adjustment(minimum: NewMinimum) = adjustment(Adjustment.ofMinimum(minimum))

            /** Alias for calling [adjustment] with `Adjustment.ofMaximum(maximum)`. */
            fun adjustment(maximum: NewMaximum) = adjustment(Adjustment.ofMaximum(maximum))

            /**
             * Alias for calling [adjustment] with the following:
             * ```java
             * NewMaximum.builder()
             *     .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
             *     .maximumAmount(maximumAmount)
             *     .build()
             * ```
             */
            fun maximumAdjustment(maximumAmount: String) =
                adjustment(
                    NewMaximum.builder()
                        .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
                        .maximumAmount(maximumAmount)
                        .build()
                )

            /**
             * The end date of the adjustment interval. This is the date that the adjustment will
             * stop affecting prices on the subscription.
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

            /** The phase to add this adjustment to. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /**
             * Alias for [Builder.planPhaseOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /** Alias for calling [Builder.planPhaseOrder] with `planPhaseOrder.orElse(null)`. */
            fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                planPhaseOrder(planPhaseOrder.getOrNull())

            /**
             * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            /**
             * The start date of the adjustment interval. This is the date that the adjustment will
             * start affecting prices on the subscription. If null, the adjustment will start when
             * the phase or subscription starts.
             */
            fun startDate(startDate: OffsetDateTime?) = startDate(JsonField.ofNullable(startDate))

            /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
            fun startDate(startDate: Optional<OffsetDateTime>) = startDate(startDate.getOrNull())

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
             * Returns an immutable instance of [AddAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .adjustment()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AddAdjustment =
                AddAdjustment(
                    checkRequired("adjustment", adjustment),
                    endDate,
                    planPhaseOrder,
                    startDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AddAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustment().validate()
            endDate()
            planPhaseOrder()
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
            (adjustment.asKnown().getOrNull()?.validity() ?: 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (planPhaseOrder.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0)

        /** The definition of a new adjustment to create and add to the subscription. */
        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val percentageDiscount: NewPercentageDiscount? = null,
            private val usageDiscount: NewUsageDiscount? = null,
            private val amountDiscount: NewAmountDiscount? = null,
            private val minimum: NewMinimum? = null,
            private val maximum: NewMaximum? = null,
            private val _json: JsonValue? = null,
        ) {

            fun percentageDiscount(): Optional<NewPercentageDiscount> =
                Optional.ofNullable(percentageDiscount)

            fun usageDiscount(): Optional<NewUsageDiscount> = Optional.ofNullable(usageDiscount)

            fun amountDiscount(): Optional<NewAmountDiscount> = Optional.ofNullable(amountDiscount)

            fun minimum(): Optional<NewMinimum> = Optional.ofNullable(minimum)

            fun maximum(): Optional<NewMaximum> = Optional.ofNullable(maximum)

            fun isPercentageDiscount(): Boolean = percentageDiscount != null

            fun isUsageDiscount(): Boolean = usageDiscount != null

            fun isAmountDiscount(): Boolean = amountDiscount != null

            fun isMinimum(): Boolean = minimum != null

            fun isMaximum(): Boolean = maximum != null

            fun asPercentageDiscount(): NewPercentageDiscount =
                percentageDiscount.getOrThrow("percentageDiscount")

            fun asUsageDiscount(): NewUsageDiscount = usageDiscount.getOrThrow("usageDiscount")

            fun asAmountDiscount(): NewAmountDiscount = amountDiscount.getOrThrow("amountDiscount")

            fun asMinimum(): NewMinimum = minimum.getOrThrow("minimum")

            fun asMaximum(): NewMaximum = maximum.getOrThrow("maximum")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    percentageDiscount != null ->
                        visitor.visitPercentageDiscount(percentageDiscount)
                    usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                    amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
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
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) {
                            percentageDiscount.validate()
                        }

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) {
                            usageDiscount.validate()
                        }

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) {
                            amountDiscount.validate()
                        }

                        override fun visitMinimum(minimum: NewMinimum) {
                            minimum.validate()
                        }

                        override fun visitMaximum(maximum: NewMaximum) {
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
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) = percentageDiscount.validity()

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) =
                            usageDiscount.validity()

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) =
                            amountDiscount.validity()

                        override fun visitMinimum(minimum: NewMinimum) = minimum.validity()

                        override fun visitMaximum(maximum: NewMaximum) = maximum.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Adjustment && percentageDiscount == other.percentageDiscount && usageDiscount == other.usageDiscount && amountDiscount == other.amountDiscount && minimum == other.minimum && maximum == other.maximum /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(percentageDiscount, usageDiscount, amountDiscount, minimum, maximum) /* spotless:on */

            override fun toString(): String =
                when {
                    percentageDiscount != null ->
                        "Adjustment{percentageDiscount=$percentageDiscount}"
                    usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                    amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                    minimum != null -> "Adjustment{minimum=$minimum}"
                    maximum != null -> "Adjustment{maximum=$maximum}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                @JvmStatic
                fun ofPercentageDiscount(percentageDiscount: NewPercentageDiscount) =
                    Adjustment(percentageDiscount = percentageDiscount)

                @JvmStatic
                fun ofUsageDiscount(usageDiscount: NewUsageDiscount) =
                    Adjustment(usageDiscount = usageDiscount)

                @JvmStatic
                fun ofAmountDiscount(amountDiscount: NewAmountDiscount) =
                    Adjustment(amountDiscount = amountDiscount)

                @JvmStatic fun ofMinimum(minimum: NewMinimum) = Adjustment(minimum = minimum)

                @JvmStatic fun ofMaximum(maximum: NewMaximum) = Adjustment(maximum = maximum)
            }

            /**
             * An interface that defines how to map each variant of [Adjustment] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitPercentageDiscount(percentageDiscount: NewPercentageDiscount): T

                fun visitUsageDiscount(usageDiscount: NewUsageDiscount): T

                fun visitAmountDiscount(amountDiscount: NewAmountDiscount): T

                fun visitMinimum(minimum: NewMinimum): T

                fun visitMaximum(maximum: NewMaximum): T

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
                        "percentage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPercentageDiscount>())
                                ?.let { Adjustment(percentageDiscount = it, _json = json) }
                                ?: Adjustment(_json = json)
                        }
                        "usage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewUsageDiscount>())?.let {
                                Adjustment(usageDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "amount_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewAmountDiscount>())?.let {
                                Adjustment(amountDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "minimum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMinimum>())?.let {
                                Adjustment(minimum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "maximum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMaximum>())?.let {
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
                        value.percentageDiscount != null ->
                            generator.writeObject(value.percentageDiscount)
                        value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                        value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value.maximum != null -> generator.writeObject(value.maximum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddAdjustment && adjustment == other.adjustment && endDate == other.endDate && planPhaseOrder == other.planPhaseOrder && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustment, endDate, planPhaseOrder, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddAdjustment{adjustment=$adjustment, endDate=$endDate, planPhaseOrder=$planPhaseOrder, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    class AddPrice
    private constructor(
        private val allocationPrice: JsonField<NewAllocationPrice>,
        private val discounts: JsonField<List<DiscountOverride>>,
        private val endDate: JsonField<OffsetDateTime>,
        private val externalPriceId: JsonField<String>,
        private val maximumAmount: JsonField<String>,
        private val minimumAmount: JsonField<String>,
        private val planPhaseOrder: JsonField<Long>,
        private val price: JsonField<Price>,
        private val priceId: JsonField<String>,
        private val startDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allocation_price")
            @ExcludeMissing
            allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of(),
            @JsonProperty("discounts")
            @ExcludeMissing
            discounts: JsonField<List<DiscountOverride>> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("external_price_id")
            @ExcludeMissing
            externalPriceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            maximumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            minimumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_phase_order")
            @ExcludeMissing
            planPhaseOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            allocationPrice,
            discounts,
            endDate,
            externalPriceId,
            maximumAmount,
            minimumAmount,
            planPhaseOrder,
            price,
            priceId,
            startDate,
            mutableMapOf(),
        )

        /**
         * The definition of a new allocation price to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allocationPrice(): Optional<NewAllocationPrice> =
            allocationPrice.getOptional("allocation_price")

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for this price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun discounts(): Optional<List<DiscountOverride>> = discounts.getOptional("discounts")

        /**
         * The end date of the price interval. This is the date that the price will stop billing on
         * the subscription. If null, billing will end when the phase or subscription ends.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

        /**
         * The external price id of the price to add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPriceId(): Optional<String> = externalPriceId.getOptional("external_price_id")

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for this
         * price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun maximumAmount(): Optional<String> = maximumAmount.getOptional("maximum_amount")

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for this
         * price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun minimumAmount(): Optional<String> = minimumAmount.getOptional("minimum_amount")

        /**
         * The phase to add this price to.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planPhaseOrder(): Optional<Long> = planPhaseOrder.getOptional("plan_phase_order")

        /**
         * The definition of a new price to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun price(): Optional<Price> = price.getOptional("price")

        /**
         * The id of the price to add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceId(): Optional<String> = priceId.getOptional("price_id")

        /**
         * The start date of the price interval. This is the date that the price will start billing
         * on the subscription. If null, billing will start when the phase or subscription starts.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): Optional<OffsetDateTime> = startDate.getOptional("start_date")

        /**
         * Returns the raw JSON value of [allocationPrice].
         *
         * Unlike [allocationPrice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allocation_price")
        @ExcludeMissing
        fun _allocationPrice(): JsonField<NewAllocationPrice> = allocationPrice

        /**
         * Returns the raw JSON value of [discounts].
         *
         * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<DiscountOverride>> = discounts

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date")
        @ExcludeMissing
        fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [externalPriceId].
         *
         * Unlike [externalPriceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_price_id")
        @ExcludeMissing
        fun _externalPriceId(): JsonField<String> = externalPriceId

        /**
         * Returns the raw JSON value of [maximumAmount].
         *
         * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /**
         * Returns the raw JSON value of [minimumAmount].
         *
         * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        /**
         * Returns the raw JSON value of [planPhaseOrder].
         *
         * Unlike [planPhaseOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plan_phase_order")
        @ExcludeMissing
        fun _planPhaseOrder(): JsonField<Long> = planPhaseOrder

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * Returns the raw JSON value of [priceId].
         *
         * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

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

            /** Returns a mutable builder for constructing an instance of [AddPrice]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AddPrice]. */
        class Builder internal constructor() {

            private var allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of()
            private var discounts: JsonField<MutableList<DiscountOverride>>? = null
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var planPhaseOrder: JsonField<Long> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addPrice: AddPrice) = apply {
                allocationPrice = addPrice.allocationPrice
                discounts = addPrice.discounts.map { it.toMutableList() }
                endDate = addPrice.endDate
                externalPriceId = addPrice.externalPriceId
                maximumAmount = addPrice.maximumAmount
                minimumAmount = addPrice.minimumAmount
                planPhaseOrder = addPrice.planPhaseOrder
                price = addPrice.price
                priceId = addPrice.priceId
                startDate = addPrice.startDate
                additionalProperties = addPrice.additionalProperties.toMutableMap()
            }

            /** The definition of a new allocation price to create and add to the subscription. */
            fun allocationPrice(allocationPrice: NewAllocationPrice?) =
                allocationPrice(JsonField.ofNullable(allocationPrice))

            /** Alias for calling [Builder.allocationPrice] with `allocationPrice.orElse(null)`. */
            fun allocationPrice(allocationPrice: Optional<NewAllocationPrice>) =
                allocationPrice(allocationPrice.getOrNull())

            /**
             * Sets [Builder.allocationPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationPrice] with a well-typed
             * [NewAllocationPrice] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun allocationPrice(allocationPrice: JsonField<NewAllocationPrice>) = apply {
                this.allocationPrice = allocationPrice
            }

            /**
             * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for this
             * price.
             */
            @Deprecated("deprecated")
            fun discounts(discounts: List<DiscountOverride>?) =
                discounts(JsonField.ofNullable(discounts))

            /** Alias for calling [Builder.discounts] with `discounts.orElse(null)`. */
            @Deprecated("deprecated")
            fun discounts(discounts: Optional<List<DiscountOverride>>) =
                discounts(discounts.getOrNull())

            /**
             * Sets [Builder.discounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discounts] with a well-typed
             * `List<DiscountOverride>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            @Deprecated("deprecated")
            fun discounts(discounts: JsonField<List<DiscountOverride>>) = apply {
                this.discounts = discounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [DiscountOverride] to [discounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            @Deprecated("deprecated")
            fun addDiscount(discount: DiscountOverride) = apply {
                discounts =
                    (discounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("discounts", it).add(discount)
                    }
            }

            /**
             * The end date of the price interval. This is the date that the price will stop billing
             * on the subscription. If null, billing will end when the phase or subscription ends.
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

            /** The external price id of the price to add to the subscription. */
            fun externalPriceId(externalPriceId: String?) =
                externalPriceId(JsonField.ofNullable(externalPriceId))

            /** Alias for calling [Builder.externalPriceId] with `externalPriceId.orElse(null)`. */
            fun externalPriceId(externalPriceId: Optional<String>) =
                externalPriceId(externalPriceId.getOrNull())

            /**
             * Sets [Builder.externalPriceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPriceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for this
             * price.
             */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: String?) =
                maximumAmount(JsonField.ofNullable(maximumAmount))

            /** Alias for calling [Builder.maximumAmount] with `maximumAmount.orElse(null)`. */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: Optional<String>) =
                maximumAmount(maximumAmount.getOrNull())

            /**
             * Sets [Builder.maximumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /**
             * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for this
             * price.
             */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: String?) =
                minimumAmount(JsonField.ofNullable(minimumAmount))

            /** Alias for calling [Builder.minimumAmount] with `minimumAmount.orElse(null)`. */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: Optional<String>) =
                minimumAmount(minimumAmount.getOrNull())

            /**
             * Sets [Builder.minimumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** The phase to add this price to. */
            fun planPhaseOrder(planPhaseOrder: Long?) =
                planPhaseOrder(JsonField.ofNullable(planPhaseOrder))

            /**
             * Alias for [Builder.planPhaseOrder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

            /** Alias for calling [Builder.planPhaseOrder] with `planPhaseOrder.orElse(null)`. */
            fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                planPhaseOrder(planPhaseOrder.getOrNull())

            /**
             * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planPhaseOrder(planPhaseOrder: JsonField<Long>) = apply {
                this.planPhaseOrder = planPhaseOrder
            }

            /** The definition of a new price to create and add to the subscription. */
            fun price(price: Price?) = price(JsonField.ofNullable(price))

            /** Alias for calling [Builder.price] with `price.orElse(null)`. */
            fun price(price: Optional<Price>) = price(price.getOrNull())

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** Alias for calling [price] with `Price.ofUnit(unit)`. */
            fun price(unit: NewSubscriptionUnitPrice) = price(Price.ofUnit(unit))

            /** Alias for calling [price] with `Price.ofPackage(package_)`. */
            fun price(package_: NewSubscriptionPackagePrice) = price(Price.ofPackage(package_))

            /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
            fun price(matrix: NewSubscriptionMatrixPrice) = price(Price.ofMatrix(matrix))

            /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
            fun price(tiered: NewSubscriptionTieredPrice) = price(Price.ofTiered(tiered))

            /** Alias for calling [price] with `Price.ofTieredBps(tieredBps)`. */
            fun price(tieredBps: NewSubscriptionTieredBpsPrice) =
                price(Price.ofTieredBps(tieredBps))

            /** Alias for calling [price] with `Price.ofBps(bps)`. */
            fun price(bps: NewSubscriptionBpsPrice) = price(Price.ofBps(bps))

            /** Alias for calling [price] with `Price.ofBulkBps(bulkBps)`. */
            fun price(bulkBps: NewSubscriptionBulkBpsPrice) = price(Price.ofBulkBps(bulkBps))

            /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
            fun price(bulk: NewSubscriptionBulkPrice) = price(Price.ofBulk(bulk))

            /**
             * Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
             */
            fun price(thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
            fun price(tieredPackage: NewSubscriptionTieredPackagePrice) =
                price(Price.ofTieredPackage(tieredPackage))

            /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
            fun price(tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
            fun price(unitWithPercent: NewSubscriptionUnitWithPercentPrice) =
                price(Price.ofUnitWithPercent(unitWithPercent))

            /**
             * Alias for calling [price] with
             * `Price.ofPackageWithAllocation(packageWithAllocation)`.
             */
            fun price(packageWithAllocation: NewSubscriptionPackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /**
             * Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`.
             */
            fun price(tieredWithProration: NewSubscriptionTierWithProrationPrice) =
                price(Price.ofTieredWithProration(tieredWithProration))

            /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
            fun price(unitWithProration: NewSubscriptionUnitWithProrationPrice) =
                price(Price.ofUnitWithProration(unitWithProration))

            /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
            fun price(groupedAllocation: NewSubscriptionGroupedAllocationPrice) =
                price(Price.ofGroupedAllocation(groupedAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
             */
            fun price(groupedWithProratedMinimum: NewSubscriptionGroupedWithProratedMinimumPrice) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

            /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
            fun price(bulkWithProration: NewSubscriptionBulkWithProrationPrice) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
             */
            fun price(
                scalableMatrixWithUnitPricing: NewSubscriptionScalableMatrixWithUnitPricingPrice
            ) = price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
             */
            fun price(
                scalableMatrixWithTieredPricing: NewSubscriptionScalableMatrixWithTieredPricingPrice
            ) = price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
             */
            fun price(cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice) =
                price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

            /**
             * Alias for calling [price] with
             * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
             */
            fun price(maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
             */
            fun price(groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
             */
            fun price(matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /**
             * Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
             */
            fun price(groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

            /**
             * Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
             */
            fun price(matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
             */
            fun price(tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
            fun price(groupedTiered: NewSubscriptionGroupedTieredPrice) =
                price(Price.ofGroupedTiered(groupedTiered))

            /** The id of the price to add to the subscription. */
            fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

            /** Alias for calling [Builder.priceId] with `priceId.orElse(null)`. */
            fun priceId(priceId: Optional<String>) = priceId(priceId.getOrNull())

            /**
             * Sets [Builder.priceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            /**
             * The start date of the price interval. This is the date that the price will start
             * billing on the subscription. If null, billing will start when the phase or
             * subscription starts.
             */
            fun startDate(startDate: OffsetDateTime?) = startDate(JsonField.ofNullable(startDate))

            /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
            fun startDate(startDate: Optional<OffsetDateTime>) = startDate(startDate.getOrNull())

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
             * Returns an immutable instance of [AddPrice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AddPrice =
                AddPrice(
                    allocationPrice,
                    (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                    endDate,
                    externalPriceId,
                    maximumAmount,
                    minimumAmount,
                    planPhaseOrder,
                    price,
                    priceId,
                    startDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AddPrice = apply {
            if (validated) {
                return@apply
            }

            allocationPrice().ifPresent { it.validate() }
            discounts().ifPresent { it.forEach { it.validate() } }
            endDate()
            externalPriceId()
            maximumAmount()
            minimumAmount()
            planPhaseOrder()
            price().ifPresent { it.validate() }
            priceId()
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
            (allocationPrice.asKnown().getOrNull()?.validity() ?: 0) +
                (discounts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (externalPriceId.asKnown().isPresent) 1 else 0) +
                (if (maximumAmount.asKnown().isPresent) 1 else 0) +
                (if (minimumAmount.asKnown().isPresent) 1 else 0) +
                (if (planPhaseOrder.asKnown().isPresent) 1 else 0) +
                (price.asKnown().getOrNull()?.validity() ?: 0) +
                (if (priceId.asKnown().isPresent) 1 else 0) +
                (if (startDate.asKnown().isPresent) 1 else 0)

        /** The definition of a new price to create and add to the subscription. */
        @JsonDeserialize(using = Price.Deserializer::class)
        @JsonSerialize(using = Price.Serializer::class)
        class Price
        private constructor(
            private val unit: NewSubscriptionUnitPrice? = null,
            private val package_: NewSubscriptionPackagePrice? = null,
            private val matrix: NewSubscriptionMatrixPrice? = null,
            private val tiered: NewSubscriptionTieredPrice? = null,
            private val tieredBps: NewSubscriptionTieredBpsPrice? = null,
            private val bps: NewSubscriptionBpsPrice? = null,
            private val bulkBps: NewSubscriptionBulkBpsPrice? = null,
            private val bulk: NewSubscriptionBulkPrice? = null,
            private val thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice? = null,
            private val tieredPackage: NewSubscriptionTieredPackagePrice? = null,
            private val tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice? = null,
            private val unitWithPercent: NewSubscriptionUnitWithPercentPrice? = null,
            private val packageWithAllocation: NewSubscriptionPackageWithAllocationPrice? = null,
            private val tieredWithProration: NewSubscriptionTierWithProrationPrice? = null,
            private val unitWithProration: NewSubscriptionUnitWithProrationPrice? = null,
            private val groupedAllocation: NewSubscriptionGroupedAllocationPrice? = null,
            private val groupedWithProratedMinimum:
                NewSubscriptionGroupedWithProratedMinimumPrice? =
                null,
            private val bulkWithProration: NewSubscriptionBulkWithProrationPrice? = null,
            private val scalableMatrixWithUnitPricing:
                NewSubscriptionScalableMatrixWithUnitPricingPrice? =
                null,
            private val scalableMatrixWithTieredPricing:
                NewSubscriptionScalableMatrixWithTieredPricingPrice? =
                null,
            private val cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice? = null,
            private val maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice? = null,
            private val groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice? =
                null,
            private val matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice? = null,
            private val groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice? = null,
            private val matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice? = null,
            private val tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice? =
                null,
            private val groupedTiered: NewSubscriptionGroupedTieredPrice? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unit(): Optional<NewSubscriptionUnitPrice> = Optional.ofNullable(unit)

            fun package_(): Optional<NewSubscriptionPackagePrice> = Optional.ofNullable(package_)

            fun matrix(): Optional<NewSubscriptionMatrixPrice> = Optional.ofNullable(matrix)

            fun tiered(): Optional<NewSubscriptionTieredPrice> = Optional.ofNullable(tiered)

            fun tieredBps(): Optional<NewSubscriptionTieredBpsPrice> =
                Optional.ofNullable(tieredBps)

            fun bps(): Optional<NewSubscriptionBpsPrice> = Optional.ofNullable(bps)

            fun bulkBps(): Optional<NewSubscriptionBulkBpsPrice> = Optional.ofNullable(bulkBps)

            fun bulk(): Optional<NewSubscriptionBulkPrice> = Optional.ofNullable(bulk)

            fun thresholdTotalAmount(): Optional<NewSubscriptionThresholdTotalAmountPrice> =
                Optional.ofNullable(thresholdTotalAmount)

            fun tieredPackage(): Optional<NewSubscriptionTieredPackagePrice> =
                Optional.ofNullable(tieredPackage)

            fun tieredWithMinimum(): Optional<NewSubscriptionTieredWithMinimumPrice> =
                Optional.ofNullable(tieredWithMinimum)

            fun unitWithPercent(): Optional<NewSubscriptionUnitWithPercentPrice> =
                Optional.ofNullable(unitWithPercent)

            fun packageWithAllocation(): Optional<NewSubscriptionPackageWithAllocationPrice> =
                Optional.ofNullable(packageWithAllocation)

            fun tieredWithProration(): Optional<NewSubscriptionTierWithProrationPrice> =
                Optional.ofNullable(tieredWithProration)

            fun unitWithProration(): Optional<NewSubscriptionUnitWithProrationPrice> =
                Optional.ofNullable(unitWithProration)

            fun groupedAllocation(): Optional<NewSubscriptionGroupedAllocationPrice> =
                Optional.ofNullable(groupedAllocation)

            fun groupedWithProratedMinimum():
                Optional<NewSubscriptionGroupedWithProratedMinimumPrice> =
                Optional.ofNullable(groupedWithProratedMinimum)

            fun bulkWithProration(): Optional<NewSubscriptionBulkWithProrationPrice> =
                Optional.ofNullable(bulkWithProration)

            fun scalableMatrixWithUnitPricing():
                Optional<NewSubscriptionScalableMatrixWithUnitPricingPrice> =
                Optional.ofNullable(scalableMatrixWithUnitPricing)

            fun scalableMatrixWithTieredPricing():
                Optional<NewSubscriptionScalableMatrixWithTieredPricingPrice> =
                Optional.ofNullable(scalableMatrixWithTieredPricing)

            fun cumulativeGroupedBulk(): Optional<NewSubscriptionCumulativeGroupedBulkPrice> =
                Optional.ofNullable(cumulativeGroupedBulk)

            fun maxGroupTieredPackage(): Optional<NewSubscriptionMaxGroupTieredPackagePrice> =
                Optional.ofNullable(maxGroupTieredPackage)

            fun groupedWithMeteredMinimum():
                Optional<NewSubscriptionGroupedWithMeteredMinimumPrice> =
                Optional.ofNullable(groupedWithMeteredMinimum)

            fun matrixWithDisplayName(): Optional<NewSubscriptionMatrixWithDisplayNamePrice> =
                Optional.ofNullable(matrixWithDisplayName)

            fun groupedTieredPackage(): Optional<NewSubscriptionGroupedTieredPackagePrice> =
                Optional.ofNullable(groupedTieredPackage)

            fun matrixWithAllocation(): Optional<NewSubscriptionMatrixWithAllocationPrice> =
                Optional.ofNullable(matrixWithAllocation)

            fun tieredPackageWithMinimum(): Optional<NewSubscriptionTieredPackageWithMinimumPrice> =
                Optional.ofNullable(tieredPackageWithMinimum)

            fun groupedTiered(): Optional<NewSubscriptionGroupedTieredPrice> =
                Optional.ofNullable(groupedTiered)

            fun isUnit(): Boolean = unit != null

            fun isPackage(): Boolean = package_ != null

            fun isMatrix(): Boolean = matrix != null

            fun isTiered(): Boolean = tiered != null

            fun isTieredBps(): Boolean = tieredBps != null

            fun isBps(): Boolean = bps != null

            fun isBulkBps(): Boolean = bulkBps != null

            fun isBulk(): Boolean = bulk != null

            fun isThresholdTotalAmount(): Boolean = thresholdTotalAmount != null

            fun isTieredPackage(): Boolean = tieredPackage != null

            fun isTieredWithMinimum(): Boolean = tieredWithMinimum != null

            fun isUnitWithPercent(): Boolean = unitWithPercent != null

            fun isPackageWithAllocation(): Boolean = packageWithAllocation != null

            fun isTieredWithProration(): Boolean = tieredWithProration != null

            fun isUnitWithProration(): Boolean = unitWithProration != null

            fun isGroupedAllocation(): Boolean = groupedAllocation != null

            fun isGroupedWithProratedMinimum(): Boolean = groupedWithProratedMinimum != null

            fun isBulkWithProration(): Boolean = bulkWithProration != null

            fun isScalableMatrixWithUnitPricing(): Boolean = scalableMatrixWithUnitPricing != null

            fun isScalableMatrixWithTieredPricing(): Boolean =
                scalableMatrixWithTieredPricing != null

            fun isCumulativeGroupedBulk(): Boolean = cumulativeGroupedBulk != null

            fun isMaxGroupTieredPackage(): Boolean = maxGroupTieredPackage != null

            fun isGroupedWithMeteredMinimum(): Boolean = groupedWithMeteredMinimum != null

            fun isMatrixWithDisplayName(): Boolean = matrixWithDisplayName != null

            fun isGroupedTieredPackage(): Boolean = groupedTieredPackage != null

            fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

            fun isTieredPackageWithMinimum(): Boolean = tieredPackageWithMinimum != null

            fun isGroupedTiered(): Boolean = groupedTiered != null

            fun asUnit(): NewSubscriptionUnitPrice = unit.getOrThrow("unit")

            fun asPackage(): NewSubscriptionPackagePrice = package_.getOrThrow("package_")

            fun asMatrix(): NewSubscriptionMatrixPrice = matrix.getOrThrow("matrix")

            fun asTiered(): NewSubscriptionTieredPrice = tiered.getOrThrow("tiered")

            fun asTieredBps(): NewSubscriptionTieredBpsPrice = tieredBps.getOrThrow("tieredBps")

            fun asBps(): NewSubscriptionBpsPrice = bps.getOrThrow("bps")

            fun asBulkBps(): NewSubscriptionBulkBpsPrice = bulkBps.getOrThrow("bulkBps")

            fun asBulk(): NewSubscriptionBulkPrice = bulk.getOrThrow("bulk")

            fun asThresholdTotalAmount(): NewSubscriptionThresholdTotalAmountPrice =
                thresholdTotalAmount.getOrThrow("thresholdTotalAmount")

            fun asTieredPackage(): NewSubscriptionTieredPackagePrice =
                tieredPackage.getOrThrow("tieredPackage")

            fun asTieredWithMinimum(): NewSubscriptionTieredWithMinimumPrice =
                tieredWithMinimum.getOrThrow("tieredWithMinimum")

            fun asUnitWithPercent(): NewSubscriptionUnitWithPercentPrice =
                unitWithPercent.getOrThrow("unitWithPercent")

            fun asPackageWithAllocation(): NewSubscriptionPackageWithAllocationPrice =
                packageWithAllocation.getOrThrow("packageWithAllocation")

            fun asTieredWithProration(): NewSubscriptionTierWithProrationPrice =
                tieredWithProration.getOrThrow("tieredWithProration")

            fun asUnitWithProration(): NewSubscriptionUnitWithProrationPrice =
                unitWithProration.getOrThrow("unitWithProration")

            fun asGroupedAllocation(): NewSubscriptionGroupedAllocationPrice =
                groupedAllocation.getOrThrow("groupedAllocation")

            fun asGroupedWithProratedMinimum(): NewSubscriptionGroupedWithProratedMinimumPrice =
                groupedWithProratedMinimum.getOrThrow("groupedWithProratedMinimum")

            fun asBulkWithProration(): NewSubscriptionBulkWithProrationPrice =
                bulkWithProration.getOrThrow("bulkWithProration")

            fun asScalableMatrixWithUnitPricing():
                NewSubscriptionScalableMatrixWithUnitPricingPrice =
                scalableMatrixWithUnitPricing.getOrThrow("scalableMatrixWithUnitPricing")

            fun asScalableMatrixWithTieredPricing():
                NewSubscriptionScalableMatrixWithTieredPricingPrice =
                scalableMatrixWithTieredPricing.getOrThrow("scalableMatrixWithTieredPricing")

            fun asCumulativeGroupedBulk(): NewSubscriptionCumulativeGroupedBulkPrice =
                cumulativeGroupedBulk.getOrThrow("cumulativeGroupedBulk")

            fun asMaxGroupTieredPackage(): NewSubscriptionMaxGroupTieredPackagePrice =
                maxGroupTieredPackage.getOrThrow("maxGroupTieredPackage")

            fun asGroupedWithMeteredMinimum(): NewSubscriptionGroupedWithMeteredMinimumPrice =
                groupedWithMeteredMinimum.getOrThrow("groupedWithMeteredMinimum")

            fun asMatrixWithDisplayName(): NewSubscriptionMatrixWithDisplayNamePrice =
                matrixWithDisplayName.getOrThrow("matrixWithDisplayName")

            fun asGroupedTieredPackage(): NewSubscriptionGroupedTieredPackagePrice =
                groupedTieredPackage.getOrThrow("groupedTieredPackage")

            fun asMatrixWithAllocation(): NewSubscriptionMatrixWithAllocationPrice =
                matrixWithAllocation.getOrThrow("matrixWithAllocation")

            fun asTieredPackageWithMinimum(): NewSubscriptionTieredPackageWithMinimumPrice =
                tieredPackageWithMinimum.getOrThrow("tieredPackageWithMinimum")

            fun asGroupedTiered(): NewSubscriptionGroupedTieredPrice =
                groupedTiered.getOrThrow("groupedTiered")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unit != null -> visitor.visitUnit(unit)
                    package_ != null -> visitor.visitPackage(package_)
                    matrix != null -> visitor.visitMatrix(matrix)
                    tiered != null -> visitor.visitTiered(tiered)
                    tieredBps != null -> visitor.visitTieredBps(tieredBps)
                    bps != null -> visitor.visitBps(bps)
                    bulkBps != null -> visitor.visitBulkBps(bulkBps)
                    bulk != null -> visitor.visitBulk(bulk)
                    thresholdTotalAmount != null ->
                        visitor.visitThresholdTotalAmount(thresholdTotalAmount)
                    tieredPackage != null -> visitor.visitTieredPackage(tieredPackage)
                    tieredWithMinimum != null -> visitor.visitTieredWithMinimum(tieredWithMinimum)
                    unitWithPercent != null -> visitor.visitUnitWithPercent(unitWithPercent)
                    packageWithAllocation != null ->
                        visitor.visitPackageWithAllocation(packageWithAllocation)
                    tieredWithProration != null ->
                        visitor.visitTieredWithProration(tieredWithProration)
                    unitWithProration != null -> visitor.visitUnitWithProration(unitWithProration)
                    groupedAllocation != null -> visitor.visitGroupedAllocation(groupedAllocation)
                    groupedWithProratedMinimum != null ->
                        visitor.visitGroupedWithProratedMinimum(groupedWithProratedMinimum)
                    bulkWithProration != null -> visitor.visitBulkWithProration(bulkWithProration)
                    scalableMatrixWithUnitPricing != null ->
                        visitor.visitScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)
                    scalableMatrixWithTieredPricing != null ->
                        visitor.visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing
                        )
                    cumulativeGroupedBulk != null ->
                        visitor.visitCumulativeGroupedBulk(cumulativeGroupedBulk)
                    maxGroupTieredPackage != null ->
                        visitor.visitMaxGroupTieredPackage(maxGroupTieredPackage)
                    groupedWithMeteredMinimum != null ->
                        visitor.visitGroupedWithMeteredMinimum(groupedWithMeteredMinimum)
                    matrixWithDisplayName != null ->
                        visitor.visitMatrixWithDisplayName(matrixWithDisplayName)
                    groupedTieredPackage != null ->
                        visitor.visitGroupedTieredPackage(groupedTieredPackage)
                    matrixWithAllocation != null ->
                        visitor.visitMatrixWithAllocation(matrixWithAllocation)
                    tieredPackageWithMinimum != null ->
                        visitor.visitTieredPackageWithMinimum(tieredPackageWithMinimum)
                    groupedTiered != null -> visitor.visitGroupedTiered(groupedTiered)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Price = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnit(unit: NewSubscriptionUnitPrice) {
                            unit.validate()
                        }

                        override fun visitPackage(package_: NewSubscriptionPackagePrice) {
                            package_.validate()
                        }

                        override fun visitMatrix(matrix: NewSubscriptionMatrixPrice) {
                            matrix.validate()
                        }

                        override fun visitTiered(tiered: NewSubscriptionTieredPrice) {
                            tiered.validate()
                        }

                        override fun visitTieredBps(tieredBps: NewSubscriptionTieredBpsPrice) {
                            tieredBps.validate()
                        }

                        override fun visitBps(bps: NewSubscriptionBpsPrice) {
                            bps.validate()
                        }

                        override fun visitBulkBps(bulkBps: NewSubscriptionBulkBpsPrice) {
                            bulkBps.validate()
                        }

                        override fun visitBulk(bulk: NewSubscriptionBulkPrice) {
                            bulk.validate()
                        }

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                        ) {
                            thresholdTotalAmount.validate()
                        }

                        override fun visitTieredPackage(
                            tieredPackage: NewSubscriptionTieredPackagePrice
                        ) {
                            tieredPackage.validate()
                        }

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice
                        ) {
                            tieredWithMinimum.validate()
                        }

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewSubscriptionUnitWithPercentPrice
                        ) {
                            unitWithPercent.validate()
                        }

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                        ) {
                            packageWithAllocation.validate()
                        }

                        override fun visitTieredWithProration(
                            tieredWithProration: NewSubscriptionTierWithProrationPrice
                        ) {
                            tieredWithProration.validate()
                        }

                        override fun visitUnitWithProration(
                            unitWithProration: NewSubscriptionUnitWithProrationPrice
                        ) {
                            unitWithProration.validate()
                        }

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewSubscriptionGroupedAllocationPrice
                        ) {
                            groupedAllocation.validate()
                        }

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum:
                                NewSubscriptionGroupedWithProratedMinimumPrice
                        ) {
                            groupedWithProratedMinimum.validate()
                        }

                        override fun visitBulkWithProration(
                            bulkWithProration: NewSubscriptionBulkWithProrationPrice
                        ) {
                            bulkWithProration.validate()
                        }

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewSubscriptionScalableMatrixWithUnitPricingPrice
                        ) {
                            scalableMatrixWithUnitPricing.validate()
                        }

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewSubscriptionScalableMatrixWithTieredPricingPrice
                        ) {
                            scalableMatrixWithTieredPricing.validate()
                        }

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                        ) {
                            cumulativeGroupedBulk.validate()
                        }

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                        ) {
                            maxGroupTieredPackage.validate()
                        }

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                        ) {
                            groupedWithMeteredMinimum.validate()
                        }

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                        ) {
                            matrixWithDisplayName.validate()
                        }

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                        ) {
                            groupedTieredPackage.validate()
                        }

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                        ) {
                            matrixWithAllocation.validate()
                        }

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                        ) {
                            tieredPackageWithMinimum.validate()
                        }

                        override fun visitGroupedTiered(
                            groupedTiered: NewSubscriptionGroupedTieredPrice
                        ) {
                            groupedTiered.validate()
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
                        override fun visitUnit(unit: NewSubscriptionUnitPrice) = unit.validity()

                        override fun visitPackage(package_: NewSubscriptionPackagePrice) =
                            package_.validity()

                        override fun visitMatrix(matrix: NewSubscriptionMatrixPrice) =
                            matrix.validity()

                        override fun visitTiered(tiered: NewSubscriptionTieredPrice) =
                            tiered.validity()

                        override fun visitTieredBps(tieredBps: NewSubscriptionTieredBpsPrice) =
                            tieredBps.validity()

                        override fun visitBps(bps: NewSubscriptionBpsPrice) = bps.validity()

                        override fun visitBulkBps(bulkBps: NewSubscriptionBulkBpsPrice) =
                            bulkBps.validity()

                        override fun visitBulk(bulk: NewSubscriptionBulkPrice) = bulk.validity()

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                        ) = thresholdTotalAmount.validity()

                        override fun visitTieredPackage(
                            tieredPackage: NewSubscriptionTieredPackagePrice
                        ) = tieredPackage.validity()

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice
                        ) = tieredWithMinimum.validity()

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewSubscriptionUnitWithPercentPrice
                        ) = unitWithPercent.validity()

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                        ) = packageWithAllocation.validity()

                        override fun visitTieredWithProration(
                            tieredWithProration: NewSubscriptionTierWithProrationPrice
                        ) = tieredWithProration.validity()

                        override fun visitUnitWithProration(
                            unitWithProration: NewSubscriptionUnitWithProrationPrice
                        ) = unitWithProration.validity()

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewSubscriptionGroupedAllocationPrice
                        ) = groupedAllocation.validity()

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum:
                                NewSubscriptionGroupedWithProratedMinimumPrice
                        ) = groupedWithProratedMinimum.validity()

                        override fun visitBulkWithProration(
                            bulkWithProration: NewSubscriptionBulkWithProrationPrice
                        ) = bulkWithProration.validity()

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewSubscriptionScalableMatrixWithUnitPricingPrice
                        ) = scalableMatrixWithUnitPricing.validity()

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewSubscriptionScalableMatrixWithTieredPricingPrice
                        ) = scalableMatrixWithTieredPricing.validity()

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                        ) = cumulativeGroupedBulk.validity()

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                        ) = maxGroupTieredPackage.validity()

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                        ) = groupedWithMeteredMinimum.validity()

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                        ) = matrixWithDisplayName.validity()

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                        ) = groupedTieredPackage.validity()

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                        ) = matrixWithAllocation.validity()

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                        ) = tieredPackageWithMinimum.validity()

                        override fun visitGroupedTiered(
                            groupedTiered: NewSubscriptionGroupedTieredPrice
                        ) = groupedTiered.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Price && unit == other.unit && package_ == other.package_ && matrix == other.matrix && tiered == other.tiered && tieredBps == other.tieredBps && bps == other.bps && bulkBps == other.bulkBps && bulk == other.bulk && thresholdTotalAmount == other.thresholdTotalAmount && tieredPackage == other.tieredPackage && tieredWithMinimum == other.tieredWithMinimum && unitWithPercent == other.unitWithPercent && packageWithAllocation == other.packageWithAllocation && tieredWithProration == other.tieredWithProration && unitWithProration == other.unitWithProration && groupedAllocation == other.groupedAllocation && groupedWithProratedMinimum == other.groupedWithProratedMinimum && bulkWithProration == other.bulkWithProration && scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing && scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing && cumulativeGroupedBulk == other.cumulativeGroupedBulk && maxGroupTieredPackage == other.maxGroupTieredPackage && groupedWithMeteredMinimum == other.groupedWithMeteredMinimum && matrixWithDisplayName == other.matrixWithDisplayName && groupedTieredPackage == other.groupedTieredPackage && matrixWithAllocation == other.matrixWithAllocation && tieredPackageWithMinimum == other.tieredPackageWithMinimum && groupedTiered == other.groupedTiered /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(unit, package_, matrix, tiered, tieredBps, bps, bulkBps, bulk, thresholdTotalAmount, tieredPackage, tieredWithMinimum, unitWithPercent, packageWithAllocation, tieredWithProration, unitWithProration, groupedAllocation, groupedWithProratedMinimum, bulkWithProration, scalableMatrixWithUnitPricing, scalableMatrixWithTieredPricing, cumulativeGroupedBulk, maxGroupTieredPackage, groupedWithMeteredMinimum, matrixWithDisplayName, groupedTieredPackage, matrixWithAllocation, tieredPackageWithMinimum, groupedTiered) /* spotless:on */

            override fun toString(): String =
                when {
                    unit != null -> "Price{unit=$unit}"
                    package_ != null -> "Price{package_=$package_}"
                    matrix != null -> "Price{matrix=$matrix}"
                    tiered != null -> "Price{tiered=$tiered}"
                    tieredBps != null -> "Price{tieredBps=$tieredBps}"
                    bps != null -> "Price{bps=$bps}"
                    bulkBps != null -> "Price{bulkBps=$bulkBps}"
                    bulk != null -> "Price{bulk=$bulk}"
                    thresholdTotalAmount != null ->
                        "Price{thresholdTotalAmount=$thresholdTotalAmount}"
                    tieredPackage != null -> "Price{tieredPackage=$tieredPackage}"
                    tieredWithMinimum != null -> "Price{tieredWithMinimum=$tieredWithMinimum}"
                    unitWithPercent != null -> "Price{unitWithPercent=$unitWithPercent}"
                    packageWithAllocation != null ->
                        "Price{packageWithAllocation=$packageWithAllocation}"
                    tieredWithProration != null -> "Price{tieredWithProration=$tieredWithProration}"
                    unitWithProration != null -> "Price{unitWithProration=$unitWithProration}"
                    groupedAllocation != null -> "Price{groupedAllocation=$groupedAllocation}"
                    groupedWithProratedMinimum != null ->
                        "Price{groupedWithProratedMinimum=$groupedWithProratedMinimum}"
                    bulkWithProration != null -> "Price{bulkWithProration=$bulkWithProration}"
                    scalableMatrixWithUnitPricing != null ->
                        "Price{scalableMatrixWithUnitPricing=$scalableMatrixWithUnitPricing}"
                    scalableMatrixWithTieredPricing != null ->
                        "Price{scalableMatrixWithTieredPricing=$scalableMatrixWithTieredPricing}"
                    cumulativeGroupedBulk != null ->
                        "Price{cumulativeGroupedBulk=$cumulativeGroupedBulk}"
                    maxGroupTieredPackage != null ->
                        "Price{maxGroupTieredPackage=$maxGroupTieredPackage}"
                    groupedWithMeteredMinimum != null ->
                        "Price{groupedWithMeteredMinimum=$groupedWithMeteredMinimum}"
                    matrixWithDisplayName != null ->
                        "Price{matrixWithDisplayName=$matrixWithDisplayName}"
                    groupedTieredPackage != null ->
                        "Price{groupedTieredPackage=$groupedTieredPackage}"
                    matrixWithAllocation != null ->
                        "Price{matrixWithAllocation=$matrixWithAllocation}"
                    tieredPackageWithMinimum != null ->
                        "Price{tieredPackageWithMinimum=$tieredPackageWithMinimum}"
                    groupedTiered != null -> "Price{groupedTiered=$groupedTiered}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }

            companion object {

                @JvmStatic fun ofUnit(unit: NewSubscriptionUnitPrice) = Price(unit = unit)

                @JvmStatic
                fun ofPackage(package_: NewSubscriptionPackagePrice) = Price(package_ = package_)

                @JvmStatic fun ofMatrix(matrix: NewSubscriptionMatrixPrice) = Price(matrix = matrix)

                @JvmStatic fun ofTiered(tiered: NewSubscriptionTieredPrice) = Price(tiered = tiered)

                @JvmStatic
                fun ofTieredBps(tieredBps: NewSubscriptionTieredBpsPrice) =
                    Price(tieredBps = tieredBps)

                @JvmStatic fun ofBps(bps: NewSubscriptionBpsPrice) = Price(bps = bps)

                @JvmStatic
                fun ofBulkBps(bulkBps: NewSubscriptionBulkBpsPrice) = Price(bulkBps = bulkBps)

                @JvmStatic fun ofBulk(bulk: NewSubscriptionBulkPrice) = Price(bulk = bulk)

                @JvmStatic
                fun ofThresholdTotalAmount(
                    thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                ) = Price(thresholdTotalAmount = thresholdTotalAmount)

                @JvmStatic
                fun ofTieredPackage(tieredPackage: NewSubscriptionTieredPackagePrice) =
                    Price(tieredPackage = tieredPackage)

                @JvmStatic
                fun ofTieredWithMinimum(tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice) =
                    Price(tieredWithMinimum = tieredWithMinimum)

                @JvmStatic
                fun ofUnitWithPercent(unitWithPercent: NewSubscriptionUnitWithPercentPrice) =
                    Price(unitWithPercent = unitWithPercent)

                @JvmStatic
                fun ofPackageWithAllocation(
                    packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                ) = Price(packageWithAllocation = packageWithAllocation)

                @JvmStatic
                fun ofTieredWithProration(
                    tieredWithProration: NewSubscriptionTierWithProrationPrice
                ) = Price(tieredWithProration = tieredWithProration)

                @JvmStatic
                fun ofUnitWithProration(unitWithProration: NewSubscriptionUnitWithProrationPrice) =
                    Price(unitWithProration = unitWithProration)

                @JvmStatic
                fun ofGroupedAllocation(groupedAllocation: NewSubscriptionGroupedAllocationPrice) =
                    Price(groupedAllocation = groupedAllocation)

                @JvmStatic
                fun ofGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewSubscriptionGroupedWithProratedMinimumPrice
                ) = Price(groupedWithProratedMinimum = groupedWithProratedMinimum)

                @JvmStatic
                fun ofBulkWithProration(bulkWithProration: NewSubscriptionBulkWithProrationPrice) =
                    Price(bulkWithProration = bulkWithProration)

                @JvmStatic
                fun ofScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewSubscriptionScalableMatrixWithUnitPricingPrice
                ) = Price(scalableMatrixWithUnitPricing = scalableMatrixWithUnitPricing)

                @JvmStatic
                fun ofScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing:
                        NewSubscriptionScalableMatrixWithTieredPricingPrice
                ) = Price(scalableMatrixWithTieredPricing = scalableMatrixWithTieredPricing)

                @JvmStatic
                fun ofCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                ) = Price(cumulativeGroupedBulk = cumulativeGroupedBulk)

                @JvmStatic
                fun ofMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                ) = Price(maxGroupTieredPackage = maxGroupTieredPackage)

                @JvmStatic
                fun ofGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                ) = Price(groupedWithMeteredMinimum = groupedWithMeteredMinimum)

                @JvmStatic
                fun ofMatrixWithDisplayName(
                    matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                ) = Price(matrixWithDisplayName = matrixWithDisplayName)

                @JvmStatic
                fun ofGroupedTieredPackage(
                    groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                ) = Price(groupedTieredPackage = groupedTieredPackage)

                @JvmStatic
                fun ofMatrixWithAllocation(
                    matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                ) = Price(matrixWithAllocation = matrixWithAllocation)

                @JvmStatic
                fun ofTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                ) = Price(tieredPackageWithMinimum = tieredPackageWithMinimum)

                @JvmStatic
                fun ofGroupedTiered(groupedTiered: NewSubscriptionGroupedTieredPrice) =
                    Price(groupedTiered = groupedTiered)
            }

            /**
             * An interface that defines how to map each variant of [Price] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnit(unit: NewSubscriptionUnitPrice): T

                fun visitPackage(package_: NewSubscriptionPackagePrice): T

                fun visitMatrix(matrix: NewSubscriptionMatrixPrice): T

                fun visitTiered(tiered: NewSubscriptionTieredPrice): T

                fun visitTieredBps(tieredBps: NewSubscriptionTieredBpsPrice): T

                fun visitBps(bps: NewSubscriptionBpsPrice): T

                fun visitBulkBps(bulkBps: NewSubscriptionBulkBpsPrice): T

                fun visitBulk(bulk: NewSubscriptionBulkPrice): T

                fun visitThresholdTotalAmount(
                    thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                ): T

                fun visitTieredPackage(tieredPackage: NewSubscriptionTieredPackagePrice): T

                fun visitTieredWithMinimum(
                    tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice
                ): T

                fun visitUnitWithPercent(unitWithPercent: NewSubscriptionUnitWithPercentPrice): T

                fun visitPackageWithAllocation(
                    packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                ): T

                fun visitTieredWithProration(
                    tieredWithProration: NewSubscriptionTierWithProrationPrice
                ): T

                fun visitUnitWithProration(
                    unitWithProration: NewSubscriptionUnitWithProrationPrice
                ): T

                fun visitGroupedAllocation(
                    groupedAllocation: NewSubscriptionGroupedAllocationPrice
                ): T

                fun visitGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewSubscriptionGroupedWithProratedMinimumPrice
                ): T

                fun visitBulkWithProration(
                    bulkWithProration: NewSubscriptionBulkWithProrationPrice
                ): T

                fun visitScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewSubscriptionScalableMatrixWithUnitPricingPrice
                ): T

                fun visitScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing:
                        NewSubscriptionScalableMatrixWithTieredPricingPrice
                ): T

                fun visitCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                ): T

                fun visitMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                ): T

                fun visitGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                ): T

                fun visitMatrixWithDisplayName(
                    matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                ): T

                fun visitGroupedTieredPackage(
                    groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                ): T

                fun visitMatrixWithAllocation(
                    matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                ): T

                fun visitTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                ): T

                fun visitGroupedTiered(groupedTiered: NewSubscriptionGroupedTieredPrice): T

                /**
                 * Maps an unknown variant of [Price] to a value of type [T].
                 *
                 * An instance of [Price] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Price: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Price>(Price::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Price {
                    val json = JsonValue.fromJsonNode(node)
                    val modelType =
                        json.asObject().getOrNull()?.get("model_type")?.asString()?.getOrNull()

                    when (modelType) {
                        "unit" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewSubscriptionUnitPrice>())
                                ?.let { Price(unit = it, _json = json) } ?: Price(_json = json)
                        }
                        "package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionPackagePrice>(),
                                )
                                ?.let { Price(package_ = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMatrixPrice>(),
                                )
                                ?.let { Price(matrix = it, _json = json) } ?: Price(_json = json)
                        }
                        "tiered" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredPrice>(),
                                )
                                ?.let { Price(tiered = it, _json = json) } ?: Price(_json = json)
                        }
                        "tiered_bps" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredBpsPrice>(),
                                )
                                ?.let { Price(tieredBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewSubscriptionBpsPrice>())
                                ?.let { Price(bps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk_bps" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionBulkBpsPrice>(),
                                )
                                ?.let { Price(bulkBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewSubscriptionBulkPrice>())
                                ?.let { Price(bulk = it, _json = json) } ?: Price(_json = json)
                        }
                        "threshold_total_amount" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionThresholdTotalAmountPrice>(),
                                )
                                ?.let { Price(thresholdTotalAmount = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredPackagePrice>(),
                                )
                                ?.let { Price(tieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_percent" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionUnitWithPercentPrice>(),
                                )
                                ?.let { Price(unitWithPercent = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "package_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionPackageWithAllocationPrice>(),
                                )
                                ?.let { Price(packageWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTierWithProrationPrice>(),
                                )
                                ?.let { Price(tieredWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionUnitWithProrationPrice>(),
                                )
                                ?.let { Price(unitWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedAllocationPrice>(),
                                )
                                ?.let { Price(groupedAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_prorated_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedWithProratedMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithProratedMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "bulk_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionBulkWithProrationPrice>(),
                                )
                                ?.let { Price(bulkWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_unit_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        NewSubscriptionScalableMatrixWithUnitPricingPrice
                                    >(),
                                )
                                ?.let { Price(scalableMatrixWithUnitPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_tiered_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        NewSubscriptionScalableMatrixWithTieredPricingPrice
                                    >(),
                                )
                                ?.let { Price(scalableMatrixWithTieredPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "cumulative_grouped_bulk" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionCumulativeGroupedBulkPrice>(),
                                )
                                ?.let { Price(cumulativeGroupedBulk = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "max_group_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMaxGroupTieredPackagePrice>(),
                                )
                                ?.let { Price(maxGroupTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_metered_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedWithMeteredMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithMeteredMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_display_name" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMatrixWithDisplayNamePrice>(),
                                )
                                ?.let { Price(matrixWithDisplayName = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedTieredPackagePrice>(),
                                )
                                ?.let { Price(groupedTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMatrixWithAllocationPrice>(),
                                )
                                ?.let { Price(matrixWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredPackageWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredPackageWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedTieredPrice>(),
                                )
                                ?.let { Price(groupedTiered = it, _json = json) }
                                ?: Price(_json = json)
                        }
                    }

                    return Price(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Price>(Price::class) {

                override fun serialize(
                    value: Price,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.unit != null -> generator.writeObject(value.unit)
                        value.package_ != null -> generator.writeObject(value.package_)
                        value.matrix != null -> generator.writeObject(value.matrix)
                        value.tiered != null -> generator.writeObject(value.tiered)
                        value.tieredBps != null -> generator.writeObject(value.tieredBps)
                        value.bps != null -> generator.writeObject(value.bps)
                        value.bulkBps != null -> generator.writeObject(value.bulkBps)
                        value.bulk != null -> generator.writeObject(value.bulk)
                        value.thresholdTotalAmount != null ->
                            generator.writeObject(value.thresholdTotalAmount)
                        value.tieredPackage != null -> generator.writeObject(value.tieredPackage)
                        value.tieredWithMinimum != null ->
                            generator.writeObject(value.tieredWithMinimum)
                        value.unitWithPercent != null ->
                            generator.writeObject(value.unitWithPercent)
                        value.packageWithAllocation != null ->
                            generator.writeObject(value.packageWithAllocation)
                        value.tieredWithProration != null ->
                            generator.writeObject(value.tieredWithProration)
                        value.unitWithProration != null ->
                            generator.writeObject(value.unitWithProration)
                        value.groupedAllocation != null ->
                            generator.writeObject(value.groupedAllocation)
                        value.groupedWithProratedMinimum != null ->
                            generator.writeObject(value.groupedWithProratedMinimum)
                        value.bulkWithProration != null ->
                            generator.writeObject(value.bulkWithProration)
                        value.scalableMatrixWithUnitPricing != null ->
                            generator.writeObject(value.scalableMatrixWithUnitPricing)
                        value.scalableMatrixWithTieredPricing != null ->
                            generator.writeObject(value.scalableMatrixWithTieredPricing)
                        value.cumulativeGroupedBulk != null ->
                            generator.writeObject(value.cumulativeGroupedBulk)
                        value.maxGroupTieredPackage != null ->
                            generator.writeObject(value.maxGroupTieredPackage)
                        value.groupedWithMeteredMinimum != null ->
                            generator.writeObject(value.groupedWithMeteredMinimum)
                        value.matrixWithDisplayName != null ->
                            generator.writeObject(value.matrixWithDisplayName)
                        value.groupedTieredPackage != null ->
                            generator.writeObject(value.groupedTieredPackage)
                        value.matrixWithAllocation != null ->
                            generator.writeObject(value.matrixWithAllocation)
                        value.tieredPackageWithMinimum != null ->
                            generator.writeObject(value.tieredPackageWithMinimum)
                        value.groupedTiered != null -> generator.writeObject(value.groupedTiered)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Price")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddPrice && allocationPrice == other.allocationPrice && discounts == other.discounts && endDate == other.endDate && externalPriceId == other.externalPriceId && maximumAmount == other.maximumAmount && minimumAmount == other.minimumAmount && planPhaseOrder == other.planPhaseOrder && price == other.price && priceId == other.priceId && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(allocationPrice, discounts, endDate, externalPriceId, maximumAmount, minimumAmount, planPhaseOrder, price, priceId, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddPrice{allocationPrice=$allocationPrice, discounts=$discounts, endDate=$endDate, externalPriceId=$externalPriceId, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, planPhaseOrder=$planPhaseOrder, price=$price, priceId=$priceId, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    /**
     * Reset billing periods to be aligned with the plan change's effective date or start of the
     * month. Defaults to `unchanged` which keeps subscription's existing billing cycle alignment.
     */
    class BillingCycleAlignment
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val UNCHANGED = of("unchanged")

            @JvmField val PLAN_CHANGE_DATE = of("plan_change_date")

            @JvmField val START_OF_MONTH = of("start_of_month")

            @JvmStatic fun of(value: String) = BillingCycleAlignment(JsonField.of(value))
        }

        /** An enum containing [BillingCycleAlignment]'s known values. */
        enum class Known {
            UNCHANGED,
            PLAN_CHANGE_DATE,
            START_OF_MONTH,
        }

        /**
         * An enum containing [BillingCycleAlignment]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [BillingCycleAlignment] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNCHANGED,
            PLAN_CHANGE_DATE,
            START_OF_MONTH,
            /**
             * An enum member indicating that [BillingCycleAlignment] was instantiated with an
             * unknown value.
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
                UNCHANGED -> Value.UNCHANGED
                PLAN_CHANGE_DATE -> Value.PLAN_CHANGE_DATE
                START_OF_MONTH -> Value.START_OF_MONTH
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
                UNCHANGED -> Known.UNCHANGED
                PLAN_CHANGE_DATE -> Known.PLAN_CHANGE_DATE
                START_OF_MONTH -> Known.START_OF_MONTH
                else -> throw OrbInvalidDataException("Unknown BillingCycleAlignment: $value")
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

        fun validate(): BillingCycleAlignment = apply {
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

            return /* spotless:off */ other is BillingCycleAlignment && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class RemoveAdjustment
    private constructor(
        private val adjustmentId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment_id")
            @ExcludeMissing
            adjustmentId: JsonField<String> = JsonMissing.of()
        ) : this(adjustmentId, mutableMapOf())

        /**
         * The id of the adjustment to remove on the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustmentId(): String = adjustmentId.getRequired("adjustment_id")

        /**
         * Returns the raw JSON value of [adjustmentId].
         *
         * Unlike [adjustmentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("adjustment_id")
        @ExcludeMissing
        fun _adjustmentId(): JsonField<String> = adjustmentId

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
             * Returns a mutable builder for constructing an instance of [RemoveAdjustment].
             *
             * The following fields are required:
             * ```java
             * .adjustmentId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RemoveAdjustment]. */
        class Builder internal constructor() {

            private var adjustmentId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(removeAdjustment: RemoveAdjustment) = apply {
                adjustmentId = removeAdjustment.adjustmentId
                additionalProperties = removeAdjustment.additionalProperties.toMutableMap()
            }

            /** The id of the adjustment to remove on the subscription. */
            fun adjustmentId(adjustmentId: String) = adjustmentId(JsonField.of(adjustmentId))

            /**
             * Sets [Builder.adjustmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustmentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adjustmentId(adjustmentId: JsonField<String>) = apply {
                this.adjustmentId = adjustmentId
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
             * Returns an immutable instance of [RemoveAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .adjustmentId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RemoveAdjustment =
                RemoveAdjustment(
                    checkRequired("adjustmentId", adjustmentId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RemoveAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustmentId()
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
        internal fun validity(): Int = (if (adjustmentId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RemoveAdjustment && adjustmentId == other.adjustmentId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustmentId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RemoveAdjustment{adjustmentId=$adjustmentId, additionalProperties=$additionalProperties}"
    }

    class RemovePrice
    private constructor(
        private val externalPriceId: JsonField<String>,
        private val priceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("external_price_id")
            @ExcludeMissing
            externalPriceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
        ) : this(externalPriceId, priceId, mutableMapOf())

        /**
         * The external price id of the price to remove on the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPriceId(): Optional<String> = externalPriceId.getOptional("external_price_id")

        /**
         * The id of the price to remove on the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceId(): Optional<String> = priceId.getOptional("price_id")

        /**
         * Returns the raw JSON value of [externalPriceId].
         *
         * Unlike [externalPriceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_price_id")
        @ExcludeMissing
        fun _externalPriceId(): JsonField<String> = externalPriceId

        /**
         * Returns the raw JSON value of [priceId].
         *
         * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

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

            /** Returns a mutable builder for constructing an instance of [RemovePrice]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RemovePrice]. */
        class Builder internal constructor() {

            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(removePrice: RemovePrice) = apply {
                externalPriceId = removePrice.externalPriceId
                priceId = removePrice.priceId
                additionalProperties = removePrice.additionalProperties.toMutableMap()
            }

            /** The external price id of the price to remove on the subscription. */
            fun externalPriceId(externalPriceId: String?) =
                externalPriceId(JsonField.ofNullable(externalPriceId))

            /** Alias for calling [Builder.externalPriceId] with `externalPriceId.orElse(null)`. */
            fun externalPriceId(externalPriceId: Optional<String>) =
                externalPriceId(externalPriceId.getOrNull())

            /**
             * Sets [Builder.externalPriceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPriceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The id of the price to remove on the subscription. */
            fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

            /** Alias for calling [Builder.priceId] with `priceId.orElse(null)`. */
            fun priceId(priceId: Optional<String>) = priceId(priceId.getOrNull())

            /**
             * Sets [Builder.priceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

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
             * Returns an immutable instance of [RemovePrice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RemovePrice =
                RemovePrice(externalPriceId, priceId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): RemovePrice = apply {
            if (validated) {
                return@apply
            }

            externalPriceId()
            priceId()
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
            (if (externalPriceId.asKnown().isPresent) 1 else 0) +
                (if (priceId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RemovePrice && externalPriceId == other.externalPriceId && priceId == other.priceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(externalPriceId, priceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RemovePrice{externalPriceId=$externalPriceId, priceId=$priceId, additionalProperties=$additionalProperties}"
    }

    class ReplaceAdjustment
    private constructor(
        private val adjustment: JsonField<Adjustment>,
        private val replacesAdjustmentId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment")
            @ExcludeMissing
            adjustment: JsonField<Adjustment> = JsonMissing.of(),
            @JsonProperty("replaces_adjustment_id")
            @ExcludeMissing
            replacesAdjustmentId: JsonField<String> = JsonMissing.of(),
        ) : this(adjustment, replacesAdjustmentId, mutableMapOf())

        /**
         * The definition of a new adjustment to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

        /**
         * The id of the adjustment on the plan to replace in the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun replacesAdjustmentId(): String =
            replacesAdjustmentId.getRequired("replaces_adjustment_id")

        /**
         * Returns the raw JSON value of [adjustment].
         *
         * Unlike [adjustment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("adjustment")
        @ExcludeMissing
        fun _adjustment(): JsonField<Adjustment> = adjustment

        /**
         * Returns the raw JSON value of [replacesAdjustmentId].
         *
         * Unlike [replacesAdjustmentId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("replaces_adjustment_id")
        @ExcludeMissing
        fun _replacesAdjustmentId(): JsonField<String> = replacesAdjustmentId

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
             * Returns a mutable builder for constructing an instance of [ReplaceAdjustment].
             *
             * The following fields are required:
             * ```java
             * .adjustment()
             * .replacesAdjustmentId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ReplaceAdjustment]. */
        class Builder internal constructor() {

            private var adjustment: JsonField<Adjustment>? = null
            private var replacesAdjustmentId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(replaceAdjustment: ReplaceAdjustment) = apply {
                adjustment = replaceAdjustment.adjustment
                replacesAdjustmentId = replaceAdjustment.replacesAdjustmentId
                additionalProperties = replaceAdjustment.additionalProperties.toMutableMap()
            }

            /** The definition of a new adjustment to create and add to the subscription. */
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

            /**
             * Alias for calling [adjustment] with
             * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
             */
            fun adjustment(percentageDiscount: NewPercentageDiscount) =
                adjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```java
             * NewPercentageDiscount.builder()
             *     .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
             *     .percentageDiscount(percentageDiscount)
             *     .build()
             * ```
             */
            fun percentageDiscountAdjustment(percentageDiscount: Double) =
                adjustment(
                    NewPercentageDiscount.builder()
                        .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
                        .percentageDiscount(percentageDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`. */
            fun adjustment(usageDiscount: NewUsageDiscount) =
                adjustment(Adjustment.ofUsageDiscount(usageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```java
             * NewUsageDiscount.builder()
             *     .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
             *     .usageDiscount(usageDiscount)
             *     .build()
             * ```
             */
            fun usageDiscountAdjustment(usageDiscount: Double) =
                adjustment(
                    NewUsageDiscount.builder()
                        .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
                        .usageDiscount(usageDiscount)
                        .build()
                )

            /**
             * Alias for calling [adjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`.
             */
            fun adjustment(amountDiscount: NewAmountDiscount) =
                adjustment(Adjustment.ofAmountDiscount(amountDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```java
             * NewAmountDiscount.builder()
             *     .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
             *     .amountDiscount(amountDiscount)
             *     .build()
             * ```
             */
            fun amountDiscountAdjustment(amountDiscount: String) =
                adjustment(
                    NewAmountDiscount.builder()
                        .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
                        .amountDiscount(amountDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofMinimum(minimum)`. */
            fun adjustment(minimum: NewMinimum) = adjustment(Adjustment.ofMinimum(minimum))

            /** Alias for calling [adjustment] with `Adjustment.ofMaximum(maximum)`. */
            fun adjustment(maximum: NewMaximum) = adjustment(Adjustment.ofMaximum(maximum))

            /**
             * Alias for calling [adjustment] with the following:
             * ```java
             * NewMaximum.builder()
             *     .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
             *     .maximumAmount(maximumAmount)
             *     .build()
             * ```
             */
            fun maximumAdjustment(maximumAmount: String) =
                adjustment(
                    NewMaximum.builder()
                        .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
                        .maximumAmount(maximumAmount)
                        .build()
                )

            /** The id of the adjustment on the plan to replace in the subscription. */
            fun replacesAdjustmentId(replacesAdjustmentId: String) =
                replacesAdjustmentId(JsonField.of(replacesAdjustmentId))

            /**
             * Sets [Builder.replacesAdjustmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replacesAdjustmentId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun replacesAdjustmentId(replacesAdjustmentId: JsonField<String>) = apply {
                this.replacesAdjustmentId = replacesAdjustmentId
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
             * Returns an immutable instance of [ReplaceAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .adjustment()
             * .replacesAdjustmentId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ReplaceAdjustment =
                ReplaceAdjustment(
                    checkRequired("adjustment", adjustment),
                    checkRequired("replacesAdjustmentId", replacesAdjustmentId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ReplaceAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustment().validate()
            replacesAdjustmentId()
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
            (adjustment.asKnown().getOrNull()?.validity() ?: 0) +
                (if (replacesAdjustmentId.asKnown().isPresent) 1 else 0)

        /** The definition of a new adjustment to create and add to the subscription. */
        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val percentageDiscount: NewPercentageDiscount? = null,
            private val usageDiscount: NewUsageDiscount? = null,
            private val amountDiscount: NewAmountDiscount? = null,
            private val minimum: NewMinimum? = null,
            private val maximum: NewMaximum? = null,
            private val _json: JsonValue? = null,
        ) {

            fun percentageDiscount(): Optional<NewPercentageDiscount> =
                Optional.ofNullable(percentageDiscount)

            fun usageDiscount(): Optional<NewUsageDiscount> = Optional.ofNullable(usageDiscount)

            fun amountDiscount(): Optional<NewAmountDiscount> = Optional.ofNullable(amountDiscount)

            fun minimum(): Optional<NewMinimum> = Optional.ofNullable(minimum)

            fun maximum(): Optional<NewMaximum> = Optional.ofNullable(maximum)

            fun isPercentageDiscount(): Boolean = percentageDiscount != null

            fun isUsageDiscount(): Boolean = usageDiscount != null

            fun isAmountDiscount(): Boolean = amountDiscount != null

            fun isMinimum(): Boolean = minimum != null

            fun isMaximum(): Boolean = maximum != null

            fun asPercentageDiscount(): NewPercentageDiscount =
                percentageDiscount.getOrThrow("percentageDiscount")

            fun asUsageDiscount(): NewUsageDiscount = usageDiscount.getOrThrow("usageDiscount")

            fun asAmountDiscount(): NewAmountDiscount = amountDiscount.getOrThrow("amountDiscount")

            fun asMinimum(): NewMinimum = minimum.getOrThrow("minimum")

            fun asMaximum(): NewMaximum = maximum.getOrThrow("maximum")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    percentageDiscount != null ->
                        visitor.visitPercentageDiscount(percentageDiscount)
                    usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                    amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
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
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) {
                            percentageDiscount.validate()
                        }

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) {
                            usageDiscount.validate()
                        }

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) {
                            amountDiscount.validate()
                        }

                        override fun visitMinimum(minimum: NewMinimum) {
                            minimum.validate()
                        }

                        override fun visitMaximum(maximum: NewMaximum) {
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
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) = percentageDiscount.validity()

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) =
                            usageDiscount.validity()

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) =
                            amountDiscount.validity()

                        override fun visitMinimum(minimum: NewMinimum) = minimum.validity()

                        override fun visitMaximum(maximum: NewMaximum) = maximum.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Adjustment && percentageDiscount == other.percentageDiscount && usageDiscount == other.usageDiscount && amountDiscount == other.amountDiscount && minimum == other.minimum && maximum == other.maximum /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(percentageDiscount, usageDiscount, amountDiscount, minimum, maximum) /* spotless:on */

            override fun toString(): String =
                when {
                    percentageDiscount != null ->
                        "Adjustment{percentageDiscount=$percentageDiscount}"
                    usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                    amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                    minimum != null -> "Adjustment{minimum=$minimum}"
                    maximum != null -> "Adjustment{maximum=$maximum}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                @JvmStatic
                fun ofPercentageDiscount(percentageDiscount: NewPercentageDiscount) =
                    Adjustment(percentageDiscount = percentageDiscount)

                @JvmStatic
                fun ofUsageDiscount(usageDiscount: NewUsageDiscount) =
                    Adjustment(usageDiscount = usageDiscount)

                @JvmStatic
                fun ofAmountDiscount(amountDiscount: NewAmountDiscount) =
                    Adjustment(amountDiscount = amountDiscount)

                @JvmStatic fun ofMinimum(minimum: NewMinimum) = Adjustment(minimum = minimum)

                @JvmStatic fun ofMaximum(maximum: NewMaximum) = Adjustment(maximum = maximum)
            }

            /**
             * An interface that defines how to map each variant of [Adjustment] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitPercentageDiscount(percentageDiscount: NewPercentageDiscount): T

                fun visitUsageDiscount(usageDiscount: NewUsageDiscount): T

                fun visitAmountDiscount(amountDiscount: NewAmountDiscount): T

                fun visitMinimum(minimum: NewMinimum): T

                fun visitMaximum(maximum: NewMaximum): T

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
                        "percentage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPercentageDiscount>())
                                ?.let { Adjustment(percentageDiscount = it, _json = json) }
                                ?: Adjustment(_json = json)
                        }
                        "usage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewUsageDiscount>())?.let {
                                Adjustment(usageDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "amount_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewAmountDiscount>())?.let {
                                Adjustment(amountDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "minimum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMinimum>())?.let {
                                Adjustment(minimum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "maximum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMaximum>())?.let {
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
                        value.percentageDiscount != null ->
                            generator.writeObject(value.percentageDiscount)
                        value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                        value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value.maximum != null -> generator.writeObject(value.maximum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReplaceAdjustment && adjustment == other.adjustment && replacesAdjustmentId == other.replacesAdjustmentId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustment, replacesAdjustmentId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReplaceAdjustment{adjustment=$adjustment, replacesAdjustmentId=$replacesAdjustmentId, additionalProperties=$additionalProperties}"
    }

    class ReplacePrice
    private constructor(
        private val replacesPriceId: JsonField<String>,
        private val allocationPrice: JsonField<NewAllocationPrice>,
        private val discounts: JsonField<List<DiscountOverride>>,
        private val externalPriceId: JsonField<String>,
        private val fixedPriceQuantity: JsonField<Double>,
        private val maximumAmount: JsonField<String>,
        private val minimumAmount: JsonField<String>,
        private val price: JsonField<Price>,
        private val priceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("replaces_price_id")
            @ExcludeMissing
            replacesPriceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allocation_price")
            @ExcludeMissing
            allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of(),
            @JsonProperty("discounts")
            @ExcludeMissing
            discounts: JsonField<List<DiscountOverride>> = JsonMissing.of(),
            @JsonProperty("external_price_id")
            @ExcludeMissing
            externalPriceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fixed_price_quantity")
            @ExcludeMissing
            fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            maximumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            minimumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
        ) : this(
            replacesPriceId,
            allocationPrice,
            discounts,
            externalPriceId,
            fixedPriceQuantity,
            maximumAmount,
            minimumAmount,
            price,
            priceId,
            mutableMapOf(),
        )

        /**
         * The id of the price on the plan to replace in the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun replacesPriceId(): String = replacesPriceId.getRequired("replaces_price_id")

        /**
         * The definition of a new allocation price to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allocationPrice(): Optional<NewAllocationPrice> =
            allocationPrice.getOptional("allocation_price")

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for the
         * replacement price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun discounts(): Optional<List<DiscountOverride>> = discounts.getOptional("discounts")

        /**
         * The external price id of the price to add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPriceId(): Optional<String> = externalPriceId.getOptional("external_price_id")

        /**
         * The new quantity of the price, if the price is a fixed price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fixedPriceQuantity(): Optional<Double> =
            fixedPriceQuantity.getOptional("fixed_price_quantity")

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for the
         * replacement price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun maximumAmount(): Optional<String> = maximumAmount.getOptional("maximum_amount")

        /**
         * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for the
         * replacement price.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun minimumAmount(): Optional<String> = minimumAmount.getOptional("minimum_amount")

        /**
         * The definition of a new price to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun price(): Optional<Price> = price.getOptional("price")

        /**
         * The id of the price to add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceId(): Optional<String> = priceId.getOptional("price_id")

        /**
         * Returns the raw JSON value of [replacesPriceId].
         *
         * Unlike [replacesPriceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("replaces_price_id")
        @ExcludeMissing
        fun _replacesPriceId(): JsonField<String> = replacesPriceId

        /**
         * Returns the raw JSON value of [allocationPrice].
         *
         * Unlike [allocationPrice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allocation_price")
        @ExcludeMissing
        fun _allocationPrice(): JsonField<NewAllocationPrice> = allocationPrice

        /**
         * Returns the raw JSON value of [discounts].
         *
         * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<DiscountOverride>> = discounts

        /**
         * Returns the raw JSON value of [externalPriceId].
         *
         * Unlike [externalPriceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_price_id")
        @ExcludeMissing
        fun _externalPriceId(): JsonField<String> = externalPriceId

        /**
         * Returns the raw JSON value of [fixedPriceQuantity].
         *
         * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("fixed_price_quantity")
        @ExcludeMissing
        fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

        /**
         * Returns the raw JSON value of [maximumAmount].
         *
         * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

        /**
         * Returns the raw JSON value of [minimumAmount].
         *
         * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * Returns the raw JSON value of [priceId].
         *
         * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

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
             * Returns a mutable builder for constructing an instance of [ReplacePrice].
             *
             * The following fields are required:
             * ```java
             * .replacesPriceId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ReplacePrice]. */
        class Builder internal constructor() {

            private var replacesPriceId: JsonField<String>? = null
            private var allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of()
            private var discounts: JsonField<MutableList<DiscountOverride>>? = null
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(replacePrice: ReplacePrice) = apply {
                replacesPriceId = replacePrice.replacesPriceId
                allocationPrice = replacePrice.allocationPrice
                discounts = replacePrice.discounts.map { it.toMutableList() }
                externalPriceId = replacePrice.externalPriceId
                fixedPriceQuantity = replacePrice.fixedPriceQuantity
                maximumAmount = replacePrice.maximumAmount
                minimumAmount = replacePrice.minimumAmount
                price = replacePrice.price
                priceId = replacePrice.priceId
                additionalProperties = replacePrice.additionalProperties.toMutableMap()
            }

            /** The id of the price on the plan to replace in the subscription. */
            fun replacesPriceId(replacesPriceId: String) =
                replacesPriceId(JsonField.of(replacesPriceId))

            /**
             * Sets [Builder.replacesPriceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replacesPriceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun replacesPriceId(replacesPriceId: JsonField<String>) = apply {
                this.replacesPriceId = replacesPriceId
            }

            /** The definition of a new allocation price to create and add to the subscription. */
            fun allocationPrice(allocationPrice: NewAllocationPrice?) =
                allocationPrice(JsonField.ofNullable(allocationPrice))

            /** Alias for calling [Builder.allocationPrice] with `allocationPrice.orElse(null)`. */
            fun allocationPrice(allocationPrice: Optional<NewAllocationPrice>) =
                allocationPrice(allocationPrice.getOrNull())

            /**
             * Sets [Builder.allocationPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationPrice] with a well-typed
             * [NewAllocationPrice] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun allocationPrice(allocationPrice: JsonField<NewAllocationPrice>) = apply {
                this.allocationPrice = allocationPrice
            }

            /**
             * [DEPRECATED] Use add_adjustments instead. The subscription's discounts for the
             * replacement price.
             */
            @Deprecated("deprecated")
            fun discounts(discounts: List<DiscountOverride>?) =
                discounts(JsonField.ofNullable(discounts))

            /** Alias for calling [Builder.discounts] with `discounts.orElse(null)`. */
            @Deprecated("deprecated")
            fun discounts(discounts: Optional<List<DiscountOverride>>) =
                discounts(discounts.getOrNull())

            /**
             * Sets [Builder.discounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discounts] with a well-typed
             * `List<DiscountOverride>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            @Deprecated("deprecated")
            fun discounts(discounts: JsonField<List<DiscountOverride>>) = apply {
                this.discounts = discounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [DiscountOverride] to [discounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            @Deprecated("deprecated")
            fun addDiscount(discount: DiscountOverride) = apply {
                discounts =
                    (discounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("discounts", it).add(discount)
                    }
            }

            /** The external price id of the price to add to the subscription. */
            fun externalPriceId(externalPriceId: String?) =
                externalPriceId(JsonField.ofNullable(externalPriceId))

            /** Alias for calling [Builder.externalPriceId] with `externalPriceId.orElse(null)`. */
            fun externalPriceId(externalPriceId: Optional<String>) =
                externalPriceId(externalPriceId.getOrNull())

            /**
             * Sets [Builder.externalPriceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPriceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The new quantity of the price, if the price is a fixed price. */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

            /**
             * Alias for [Builder.fixedPriceQuantity].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /**
             * Alias for calling [Builder.fixedPriceQuantity] with
             * `fixedPriceQuantity.orElse(null)`.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Optional<Double>) =
                fixedPriceQuantity(fixedPriceQuantity.getOrNull())

            /**
             * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fixedPriceQuantity] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * [DEPRECATED] Use add_adjustments instead. The subscription's maximum amount for the
             * replacement price.
             */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: String?) =
                maximumAmount(JsonField.ofNullable(maximumAmount))

            /** Alias for calling [Builder.maximumAmount] with `maximumAmount.orElse(null)`. */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: Optional<String>) =
                maximumAmount(maximumAmount.getOrNull())

            /**
             * Sets [Builder.maximumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /**
             * [DEPRECATED] Use add_adjustments instead. The subscription's minimum amount for the
             * replacement price.
             */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: String?) =
                minimumAmount(JsonField.ofNullable(minimumAmount))

            /** Alias for calling [Builder.minimumAmount] with `minimumAmount.orElse(null)`. */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: Optional<String>) =
                minimumAmount(minimumAmount.getOrNull())

            /**
             * Sets [Builder.minimumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** The definition of a new price to create and add to the subscription. */
            fun price(price: Price?) = price(JsonField.ofNullable(price))

            /** Alias for calling [Builder.price] with `price.orElse(null)`. */
            fun price(price: Optional<Price>) = price(price.getOrNull())

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** Alias for calling [price] with `Price.ofUnit(unit)`. */
            fun price(unit: NewSubscriptionUnitPrice) = price(Price.ofUnit(unit))

            /** Alias for calling [price] with `Price.ofPackage(package_)`. */
            fun price(package_: NewSubscriptionPackagePrice) = price(Price.ofPackage(package_))

            /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
            fun price(matrix: NewSubscriptionMatrixPrice) = price(Price.ofMatrix(matrix))

            /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
            fun price(tiered: NewSubscriptionTieredPrice) = price(Price.ofTiered(tiered))

            /** Alias for calling [price] with `Price.ofTieredBps(tieredBps)`. */
            fun price(tieredBps: NewSubscriptionTieredBpsPrice) =
                price(Price.ofTieredBps(tieredBps))

            /** Alias for calling [price] with `Price.ofBps(bps)`. */
            fun price(bps: NewSubscriptionBpsPrice) = price(Price.ofBps(bps))

            /** Alias for calling [price] with `Price.ofBulkBps(bulkBps)`. */
            fun price(bulkBps: NewSubscriptionBulkBpsPrice) = price(Price.ofBulkBps(bulkBps))

            /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
            fun price(bulk: NewSubscriptionBulkPrice) = price(Price.ofBulk(bulk))

            /**
             * Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
             */
            fun price(thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
            fun price(tieredPackage: NewSubscriptionTieredPackagePrice) =
                price(Price.ofTieredPackage(tieredPackage))

            /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
            fun price(tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
            fun price(unitWithPercent: NewSubscriptionUnitWithPercentPrice) =
                price(Price.ofUnitWithPercent(unitWithPercent))

            /**
             * Alias for calling [price] with
             * `Price.ofPackageWithAllocation(packageWithAllocation)`.
             */
            fun price(packageWithAllocation: NewSubscriptionPackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /**
             * Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`.
             */
            fun price(tieredWithProration: NewSubscriptionTierWithProrationPrice) =
                price(Price.ofTieredWithProration(tieredWithProration))

            /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
            fun price(unitWithProration: NewSubscriptionUnitWithProrationPrice) =
                price(Price.ofUnitWithProration(unitWithProration))

            /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
            fun price(groupedAllocation: NewSubscriptionGroupedAllocationPrice) =
                price(Price.ofGroupedAllocation(groupedAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
             */
            fun price(groupedWithProratedMinimum: NewSubscriptionGroupedWithProratedMinimumPrice) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

            /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
            fun price(bulkWithProration: NewSubscriptionBulkWithProrationPrice) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
             */
            fun price(
                scalableMatrixWithUnitPricing: NewSubscriptionScalableMatrixWithUnitPricingPrice
            ) = price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
             */
            fun price(
                scalableMatrixWithTieredPricing: NewSubscriptionScalableMatrixWithTieredPricingPrice
            ) = price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
             */
            fun price(cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice) =
                price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

            /**
             * Alias for calling [price] with
             * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
             */
            fun price(maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
             */
            fun price(groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
             */
            fun price(matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /**
             * Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
             */
            fun price(groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

            /**
             * Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
             */
            fun price(matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
             */
            fun price(tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
            fun price(groupedTiered: NewSubscriptionGroupedTieredPrice) =
                price(Price.ofGroupedTiered(groupedTiered))

            /** The id of the price to add to the subscription. */
            fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

            /** Alias for calling [Builder.priceId] with `priceId.orElse(null)`. */
            fun priceId(priceId: Optional<String>) = priceId(priceId.getOrNull())

            /**
             * Sets [Builder.priceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

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
             * Returns an immutable instance of [ReplacePrice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .replacesPriceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ReplacePrice =
                ReplacePrice(
                    checkRequired("replacesPriceId", replacesPriceId),
                    allocationPrice,
                    (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                    externalPriceId,
                    fixedPriceQuantity,
                    maximumAmount,
                    minimumAmount,
                    price,
                    priceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ReplacePrice = apply {
            if (validated) {
                return@apply
            }

            replacesPriceId()
            allocationPrice().ifPresent { it.validate() }
            discounts().ifPresent { it.forEach { it.validate() } }
            externalPriceId()
            fixedPriceQuantity()
            maximumAmount()
            minimumAmount()
            price().ifPresent { it.validate() }
            priceId()
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
            (if (replacesPriceId.asKnown().isPresent) 1 else 0) +
                (allocationPrice.asKnown().getOrNull()?.validity() ?: 0) +
                (discounts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (externalPriceId.asKnown().isPresent) 1 else 0) +
                (if (fixedPriceQuantity.asKnown().isPresent) 1 else 0) +
                (if (maximumAmount.asKnown().isPresent) 1 else 0) +
                (if (minimumAmount.asKnown().isPresent) 1 else 0) +
                (price.asKnown().getOrNull()?.validity() ?: 0) +
                (if (priceId.asKnown().isPresent) 1 else 0)

        /** The definition of a new price to create and add to the subscription. */
        @JsonDeserialize(using = Price.Deserializer::class)
        @JsonSerialize(using = Price.Serializer::class)
        class Price
        private constructor(
            private val unit: NewSubscriptionUnitPrice? = null,
            private val package_: NewSubscriptionPackagePrice? = null,
            private val matrix: NewSubscriptionMatrixPrice? = null,
            private val tiered: NewSubscriptionTieredPrice? = null,
            private val tieredBps: NewSubscriptionTieredBpsPrice? = null,
            private val bps: NewSubscriptionBpsPrice? = null,
            private val bulkBps: NewSubscriptionBulkBpsPrice? = null,
            private val bulk: NewSubscriptionBulkPrice? = null,
            private val thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice? = null,
            private val tieredPackage: NewSubscriptionTieredPackagePrice? = null,
            private val tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice? = null,
            private val unitWithPercent: NewSubscriptionUnitWithPercentPrice? = null,
            private val packageWithAllocation: NewSubscriptionPackageWithAllocationPrice? = null,
            private val tieredWithProration: NewSubscriptionTierWithProrationPrice? = null,
            private val unitWithProration: NewSubscriptionUnitWithProrationPrice? = null,
            private val groupedAllocation: NewSubscriptionGroupedAllocationPrice? = null,
            private val groupedWithProratedMinimum:
                NewSubscriptionGroupedWithProratedMinimumPrice? =
                null,
            private val bulkWithProration: NewSubscriptionBulkWithProrationPrice? = null,
            private val scalableMatrixWithUnitPricing:
                NewSubscriptionScalableMatrixWithUnitPricingPrice? =
                null,
            private val scalableMatrixWithTieredPricing:
                NewSubscriptionScalableMatrixWithTieredPricingPrice? =
                null,
            private val cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice? = null,
            private val maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice? = null,
            private val groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice? =
                null,
            private val matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice? = null,
            private val groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice? = null,
            private val matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice? = null,
            private val tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice? =
                null,
            private val groupedTiered: NewSubscriptionGroupedTieredPrice? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unit(): Optional<NewSubscriptionUnitPrice> = Optional.ofNullable(unit)

            fun package_(): Optional<NewSubscriptionPackagePrice> = Optional.ofNullable(package_)

            fun matrix(): Optional<NewSubscriptionMatrixPrice> = Optional.ofNullable(matrix)

            fun tiered(): Optional<NewSubscriptionTieredPrice> = Optional.ofNullable(tiered)

            fun tieredBps(): Optional<NewSubscriptionTieredBpsPrice> =
                Optional.ofNullable(tieredBps)

            fun bps(): Optional<NewSubscriptionBpsPrice> = Optional.ofNullable(bps)

            fun bulkBps(): Optional<NewSubscriptionBulkBpsPrice> = Optional.ofNullable(bulkBps)

            fun bulk(): Optional<NewSubscriptionBulkPrice> = Optional.ofNullable(bulk)

            fun thresholdTotalAmount(): Optional<NewSubscriptionThresholdTotalAmountPrice> =
                Optional.ofNullable(thresholdTotalAmount)

            fun tieredPackage(): Optional<NewSubscriptionTieredPackagePrice> =
                Optional.ofNullable(tieredPackage)

            fun tieredWithMinimum(): Optional<NewSubscriptionTieredWithMinimumPrice> =
                Optional.ofNullable(tieredWithMinimum)

            fun unitWithPercent(): Optional<NewSubscriptionUnitWithPercentPrice> =
                Optional.ofNullable(unitWithPercent)

            fun packageWithAllocation(): Optional<NewSubscriptionPackageWithAllocationPrice> =
                Optional.ofNullable(packageWithAllocation)

            fun tieredWithProration(): Optional<NewSubscriptionTierWithProrationPrice> =
                Optional.ofNullable(tieredWithProration)

            fun unitWithProration(): Optional<NewSubscriptionUnitWithProrationPrice> =
                Optional.ofNullable(unitWithProration)

            fun groupedAllocation(): Optional<NewSubscriptionGroupedAllocationPrice> =
                Optional.ofNullable(groupedAllocation)

            fun groupedWithProratedMinimum():
                Optional<NewSubscriptionGroupedWithProratedMinimumPrice> =
                Optional.ofNullable(groupedWithProratedMinimum)

            fun bulkWithProration(): Optional<NewSubscriptionBulkWithProrationPrice> =
                Optional.ofNullable(bulkWithProration)

            fun scalableMatrixWithUnitPricing():
                Optional<NewSubscriptionScalableMatrixWithUnitPricingPrice> =
                Optional.ofNullable(scalableMatrixWithUnitPricing)

            fun scalableMatrixWithTieredPricing():
                Optional<NewSubscriptionScalableMatrixWithTieredPricingPrice> =
                Optional.ofNullable(scalableMatrixWithTieredPricing)

            fun cumulativeGroupedBulk(): Optional<NewSubscriptionCumulativeGroupedBulkPrice> =
                Optional.ofNullable(cumulativeGroupedBulk)

            fun maxGroupTieredPackage(): Optional<NewSubscriptionMaxGroupTieredPackagePrice> =
                Optional.ofNullable(maxGroupTieredPackage)

            fun groupedWithMeteredMinimum():
                Optional<NewSubscriptionGroupedWithMeteredMinimumPrice> =
                Optional.ofNullable(groupedWithMeteredMinimum)

            fun matrixWithDisplayName(): Optional<NewSubscriptionMatrixWithDisplayNamePrice> =
                Optional.ofNullable(matrixWithDisplayName)

            fun groupedTieredPackage(): Optional<NewSubscriptionGroupedTieredPackagePrice> =
                Optional.ofNullable(groupedTieredPackage)

            fun matrixWithAllocation(): Optional<NewSubscriptionMatrixWithAllocationPrice> =
                Optional.ofNullable(matrixWithAllocation)

            fun tieredPackageWithMinimum(): Optional<NewSubscriptionTieredPackageWithMinimumPrice> =
                Optional.ofNullable(tieredPackageWithMinimum)

            fun groupedTiered(): Optional<NewSubscriptionGroupedTieredPrice> =
                Optional.ofNullable(groupedTiered)

            fun isUnit(): Boolean = unit != null

            fun isPackage(): Boolean = package_ != null

            fun isMatrix(): Boolean = matrix != null

            fun isTiered(): Boolean = tiered != null

            fun isTieredBps(): Boolean = tieredBps != null

            fun isBps(): Boolean = bps != null

            fun isBulkBps(): Boolean = bulkBps != null

            fun isBulk(): Boolean = bulk != null

            fun isThresholdTotalAmount(): Boolean = thresholdTotalAmount != null

            fun isTieredPackage(): Boolean = tieredPackage != null

            fun isTieredWithMinimum(): Boolean = tieredWithMinimum != null

            fun isUnitWithPercent(): Boolean = unitWithPercent != null

            fun isPackageWithAllocation(): Boolean = packageWithAllocation != null

            fun isTieredWithProration(): Boolean = tieredWithProration != null

            fun isUnitWithProration(): Boolean = unitWithProration != null

            fun isGroupedAllocation(): Boolean = groupedAllocation != null

            fun isGroupedWithProratedMinimum(): Boolean = groupedWithProratedMinimum != null

            fun isBulkWithProration(): Boolean = bulkWithProration != null

            fun isScalableMatrixWithUnitPricing(): Boolean = scalableMatrixWithUnitPricing != null

            fun isScalableMatrixWithTieredPricing(): Boolean =
                scalableMatrixWithTieredPricing != null

            fun isCumulativeGroupedBulk(): Boolean = cumulativeGroupedBulk != null

            fun isMaxGroupTieredPackage(): Boolean = maxGroupTieredPackage != null

            fun isGroupedWithMeteredMinimum(): Boolean = groupedWithMeteredMinimum != null

            fun isMatrixWithDisplayName(): Boolean = matrixWithDisplayName != null

            fun isGroupedTieredPackage(): Boolean = groupedTieredPackage != null

            fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

            fun isTieredPackageWithMinimum(): Boolean = tieredPackageWithMinimum != null

            fun isGroupedTiered(): Boolean = groupedTiered != null

            fun asUnit(): NewSubscriptionUnitPrice = unit.getOrThrow("unit")

            fun asPackage(): NewSubscriptionPackagePrice = package_.getOrThrow("package_")

            fun asMatrix(): NewSubscriptionMatrixPrice = matrix.getOrThrow("matrix")

            fun asTiered(): NewSubscriptionTieredPrice = tiered.getOrThrow("tiered")

            fun asTieredBps(): NewSubscriptionTieredBpsPrice = tieredBps.getOrThrow("tieredBps")

            fun asBps(): NewSubscriptionBpsPrice = bps.getOrThrow("bps")

            fun asBulkBps(): NewSubscriptionBulkBpsPrice = bulkBps.getOrThrow("bulkBps")

            fun asBulk(): NewSubscriptionBulkPrice = bulk.getOrThrow("bulk")

            fun asThresholdTotalAmount(): NewSubscriptionThresholdTotalAmountPrice =
                thresholdTotalAmount.getOrThrow("thresholdTotalAmount")

            fun asTieredPackage(): NewSubscriptionTieredPackagePrice =
                tieredPackage.getOrThrow("tieredPackage")

            fun asTieredWithMinimum(): NewSubscriptionTieredWithMinimumPrice =
                tieredWithMinimum.getOrThrow("tieredWithMinimum")

            fun asUnitWithPercent(): NewSubscriptionUnitWithPercentPrice =
                unitWithPercent.getOrThrow("unitWithPercent")

            fun asPackageWithAllocation(): NewSubscriptionPackageWithAllocationPrice =
                packageWithAllocation.getOrThrow("packageWithAllocation")

            fun asTieredWithProration(): NewSubscriptionTierWithProrationPrice =
                tieredWithProration.getOrThrow("tieredWithProration")

            fun asUnitWithProration(): NewSubscriptionUnitWithProrationPrice =
                unitWithProration.getOrThrow("unitWithProration")

            fun asGroupedAllocation(): NewSubscriptionGroupedAllocationPrice =
                groupedAllocation.getOrThrow("groupedAllocation")

            fun asGroupedWithProratedMinimum(): NewSubscriptionGroupedWithProratedMinimumPrice =
                groupedWithProratedMinimum.getOrThrow("groupedWithProratedMinimum")

            fun asBulkWithProration(): NewSubscriptionBulkWithProrationPrice =
                bulkWithProration.getOrThrow("bulkWithProration")

            fun asScalableMatrixWithUnitPricing():
                NewSubscriptionScalableMatrixWithUnitPricingPrice =
                scalableMatrixWithUnitPricing.getOrThrow("scalableMatrixWithUnitPricing")

            fun asScalableMatrixWithTieredPricing():
                NewSubscriptionScalableMatrixWithTieredPricingPrice =
                scalableMatrixWithTieredPricing.getOrThrow("scalableMatrixWithTieredPricing")

            fun asCumulativeGroupedBulk(): NewSubscriptionCumulativeGroupedBulkPrice =
                cumulativeGroupedBulk.getOrThrow("cumulativeGroupedBulk")

            fun asMaxGroupTieredPackage(): NewSubscriptionMaxGroupTieredPackagePrice =
                maxGroupTieredPackage.getOrThrow("maxGroupTieredPackage")

            fun asGroupedWithMeteredMinimum(): NewSubscriptionGroupedWithMeteredMinimumPrice =
                groupedWithMeteredMinimum.getOrThrow("groupedWithMeteredMinimum")

            fun asMatrixWithDisplayName(): NewSubscriptionMatrixWithDisplayNamePrice =
                matrixWithDisplayName.getOrThrow("matrixWithDisplayName")

            fun asGroupedTieredPackage(): NewSubscriptionGroupedTieredPackagePrice =
                groupedTieredPackage.getOrThrow("groupedTieredPackage")

            fun asMatrixWithAllocation(): NewSubscriptionMatrixWithAllocationPrice =
                matrixWithAllocation.getOrThrow("matrixWithAllocation")

            fun asTieredPackageWithMinimum(): NewSubscriptionTieredPackageWithMinimumPrice =
                tieredPackageWithMinimum.getOrThrow("tieredPackageWithMinimum")

            fun asGroupedTiered(): NewSubscriptionGroupedTieredPrice =
                groupedTiered.getOrThrow("groupedTiered")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unit != null -> visitor.visitUnit(unit)
                    package_ != null -> visitor.visitPackage(package_)
                    matrix != null -> visitor.visitMatrix(matrix)
                    tiered != null -> visitor.visitTiered(tiered)
                    tieredBps != null -> visitor.visitTieredBps(tieredBps)
                    bps != null -> visitor.visitBps(bps)
                    bulkBps != null -> visitor.visitBulkBps(bulkBps)
                    bulk != null -> visitor.visitBulk(bulk)
                    thresholdTotalAmount != null ->
                        visitor.visitThresholdTotalAmount(thresholdTotalAmount)
                    tieredPackage != null -> visitor.visitTieredPackage(tieredPackage)
                    tieredWithMinimum != null -> visitor.visitTieredWithMinimum(tieredWithMinimum)
                    unitWithPercent != null -> visitor.visitUnitWithPercent(unitWithPercent)
                    packageWithAllocation != null ->
                        visitor.visitPackageWithAllocation(packageWithAllocation)
                    tieredWithProration != null ->
                        visitor.visitTieredWithProration(tieredWithProration)
                    unitWithProration != null -> visitor.visitUnitWithProration(unitWithProration)
                    groupedAllocation != null -> visitor.visitGroupedAllocation(groupedAllocation)
                    groupedWithProratedMinimum != null ->
                        visitor.visitGroupedWithProratedMinimum(groupedWithProratedMinimum)
                    bulkWithProration != null -> visitor.visitBulkWithProration(bulkWithProration)
                    scalableMatrixWithUnitPricing != null ->
                        visitor.visitScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)
                    scalableMatrixWithTieredPricing != null ->
                        visitor.visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing
                        )
                    cumulativeGroupedBulk != null ->
                        visitor.visitCumulativeGroupedBulk(cumulativeGroupedBulk)
                    maxGroupTieredPackage != null ->
                        visitor.visitMaxGroupTieredPackage(maxGroupTieredPackage)
                    groupedWithMeteredMinimum != null ->
                        visitor.visitGroupedWithMeteredMinimum(groupedWithMeteredMinimum)
                    matrixWithDisplayName != null ->
                        visitor.visitMatrixWithDisplayName(matrixWithDisplayName)
                    groupedTieredPackage != null ->
                        visitor.visitGroupedTieredPackage(groupedTieredPackage)
                    matrixWithAllocation != null ->
                        visitor.visitMatrixWithAllocation(matrixWithAllocation)
                    tieredPackageWithMinimum != null ->
                        visitor.visitTieredPackageWithMinimum(tieredPackageWithMinimum)
                    groupedTiered != null -> visitor.visitGroupedTiered(groupedTiered)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Price = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnit(unit: NewSubscriptionUnitPrice) {
                            unit.validate()
                        }

                        override fun visitPackage(package_: NewSubscriptionPackagePrice) {
                            package_.validate()
                        }

                        override fun visitMatrix(matrix: NewSubscriptionMatrixPrice) {
                            matrix.validate()
                        }

                        override fun visitTiered(tiered: NewSubscriptionTieredPrice) {
                            tiered.validate()
                        }

                        override fun visitTieredBps(tieredBps: NewSubscriptionTieredBpsPrice) {
                            tieredBps.validate()
                        }

                        override fun visitBps(bps: NewSubscriptionBpsPrice) {
                            bps.validate()
                        }

                        override fun visitBulkBps(bulkBps: NewSubscriptionBulkBpsPrice) {
                            bulkBps.validate()
                        }

                        override fun visitBulk(bulk: NewSubscriptionBulkPrice) {
                            bulk.validate()
                        }

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                        ) {
                            thresholdTotalAmount.validate()
                        }

                        override fun visitTieredPackage(
                            tieredPackage: NewSubscriptionTieredPackagePrice
                        ) {
                            tieredPackage.validate()
                        }

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice
                        ) {
                            tieredWithMinimum.validate()
                        }

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewSubscriptionUnitWithPercentPrice
                        ) {
                            unitWithPercent.validate()
                        }

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                        ) {
                            packageWithAllocation.validate()
                        }

                        override fun visitTieredWithProration(
                            tieredWithProration: NewSubscriptionTierWithProrationPrice
                        ) {
                            tieredWithProration.validate()
                        }

                        override fun visitUnitWithProration(
                            unitWithProration: NewSubscriptionUnitWithProrationPrice
                        ) {
                            unitWithProration.validate()
                        }

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewSubscriptionGroupedAllocationPrice
                        ) {
                            groupedAllocation.validate()
                        }

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum:
                                NewSubscriptionGroupedWithProratedMinimumPrice
                        ) {
                            groupedWithProratedMinimum.validate()
                        }

                        override fun visitBulkWithProration(
                            bulkWithProration: NewSubscriptionBulkWithProrationPrice
                        ) {
                            bulkWithProration.validate()
                        }

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewSubscriptionScalableMatrixWithUnitPricingPrice
                        ) {
                            scalableMatrixWithUnitPricing.validate()
                        }

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewSubscriptionScalableMatrixWithTieredPricingPrice
                        ) {
                            scalableMatrixWithTieredPricing.validate()
                        }

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                        ) {
                            cumulativeGroupedBulk.validate()
                        }

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                        ) {
                            maxGroupTieredPackage.validate()
                        }

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                        ) {
                            groupedWithMeteredMinimum.validate()
                        }

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                        ) {
                            matrixWithDisplayName.validate()
                        }

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                        ) {
                            groupedTieredPackage.validate()
                        }

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                        ) {
                            matrixWithAllocation.validate()
                        }

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                        ) {
                            tieredPackageWithMinimum.validate()
                        }

                        override fun visitGroupedTiered(
                            groupedTiered: NewSubscriptionGroupedTieredPrice
                        ) {
                            groupedTiered.validate()
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
                        override fun visitUnit(unit: NewSubscriptionUnitPrice) = unit.validity()

                        override fun visitPackage(package_: NewSubscriptionPackagePrice) =
                            package_.validity()

                        override fun visitMatrix(matrix: NewSubscriptionMatrixPrice) =
                            matrix.validity()

                        override fun visitTiered(tiered: NewSubscriptionTieredPrice) =
                            tiered.validity()

                        override fun visitTieredBps(tieredBps: NewSubscriptionTieredBpsPrice) =
                            tieredBps.validity()

                        override fun visitBps(bps: NewSubscriptionBpsPrice) = bps.validity()

                        override fun visitBulkBps(bulkBps: NewSubscriptionBulkBpsPrice) =
                            bulkBps.validity()

                        override fun visitBulk(bulk: NewSubscriptionBulkPrice) = bulk.validity()

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                        ) = thresholdTotalAmount.validity()

                        override fun visitTieredPackage(
                            tieredPackage: NewSubscriptionTieredPackagePrice
                        ) = tieredPackage.validity()

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice
                        ) = tieredWithMinimum.validity()

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewSubscriptionUnitWithPercentPrice
                        ) = unitWithPercent.validity()

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                        ) = packageWithAllocation.validity()

                        override fun visitTieredWithProration(
                            tieredWithProration: NewSubscriptionTierWithProrationPrice
                        ) = tieredWithProration.validity()

                        override fun visitUnitWithProration(
                            unitWithProration: NewSubscriptionUnitWithProrationPrice
                        ) = unitWithProration.validity()

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewSubscriptionGroupedAllocationPrice
                        ) = groupedAllocation.validity()

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum:
                                NewSubscriptionGroupedWithProratedMinimumPrice
                        ) = groupedWithProratedMinimum.validity()

                        override fun visitBulkWithProration(
                            bulkWithProration: NewSubscriptionBulkWithProrationPrice
                        ) = bulkWithProration.validity()

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewSubscriptionScalableMatrixWithUnitPricingPrice
                        ) = scalableMatrixWithUnitPricing.validity()

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewSubscriptionScalableMatrixWithTieredPricingPrice
                        ) = scalableMatrixWithTieredPricing.validity()

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                        ) = cumulativeGroupedBulk.validity()

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                        ) = maxGroupTieredPackage.validity()

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                        ) = groupedWithMeteredMinimum.validity()

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                        ) = matrixWithDisplayName.validity()

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                        ) = groupedTieredPackage.validity()

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                        ) = matrixWithAllocation.validity()

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                        ) = tieredPackageWithMinimum.validity()

                        override fun visitGroupedTiered(
                            groupedTiered: NewSubscriptionGroupedTieredPrice
                        ) = groupedTiered.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Price && unit == other.unit && package_ == other.package_ && matrix == other.matrix && tiered == other.tiered && tieredBps == other.tieredBps && bps == other.bps && bulkBps == other.bulkBps && bulk == other.bulk && thresholdTotalAmount == other.thresholdTotalAmount && tieredPackage == other.tieredPackage && tieredWithMinimum == other.tieredWithMinimum && unitWithPercent == other.unitWithPercent && packageWithAllocation == other.packageWithAllocation && tieredWithProration == other.tieredWithProration && unitWithProration == other.unitWithProration && groupedAllocation == other.groupedAllocation && groupedWithProratedMinimum == other.groupedWithProratedMinimum && bulkWithProration == other.bulkWithProration && scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing && scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing && cumulativeGroupedBulk == other.cumulativeGroupedBulk && maxGroupTieredPackage == other.maxGroupTieredPackage && groupedWithMeteredMinimum == other.groupedWithMeteredMinimum && matrixWithDisplayName == other.matrixWithDisplayName && groupedTieredPackage == other.groupedTieredPackage && matrixWithAllocation == other.matrixWithAllocation && tieredPackageWithMinimum == other.tieredPackageWithMinimum && groupedTiered == other.groupedTiered /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(unit, package_, matrix, tiered, tieredBps, bps, bulkBps, bulk, thresholdTotalAmount, tieredPackage, tieredWithMinimum, unitWithPercent, packageWithAllocation, tieredWithProration, unitWithProration, groupedAllocation, groupedWithProratedMinimum, bulkWithProration, scalableMatrixWithUnitPricing, scalableMatrixWithTieredPricing, cumulativeGroupedBulk, maxGroupTieredPackage, groupedWithMeteredMinimum, matrixWithDisplayName, groupedTieredPackage, matrixWithAllocation, tieredPackageWithMinimum, groupedTiered) /* spotless:on */

            override fun toString(): String =
                when {
                    unit != null -> "Price{unit=$unit}"
                    package_ != null -> "Price{package_=$package_}"
                    matrix != null -> "Price{matrix=$matrix}"
                    tiered != null -> "Price{tiered=$tiered}"
                    tieredBps != null -> "Price{tieredBps=$tieredBps}"
                    bps != null -> "Price{bps=$bps}"
                    bulkBps != null -> "Price{bulkBps=$bulkBps}"
                    bulk != null -> "Price{bulk=$bulk}"
                    thresholdTotalAmount != null ->
                        "Price{thresholdTotalAmount=$thresholdTotalAmount}"
                    tieredPackage != null -> "Price{tieredPackage=$tieredPackage}"
                    tieredWithMinimum != null -> "Price{tieredWithMinimum=$tieredWithMinimum}"
                    unitWithPercent != null -> "Price{unitWithPercent=$unitWithPercent}"
                    packageWithAllocation != null ->
                        "Price{packageWithAllocation=$packageWithAllocation}"
                    tieredWithProration != null -> "Price{tieredWithProration=$tieredWithProration}"
                    unitWithProration != null -> "Price{unitWithProration=$unitWithProration}"
                    groupedAllocation != null -> "Price{groupedAllocation=$groupedAllocation}"
                    groupedWithProratedMinimum != null ->
                        "Price{groupedWithProratedMinimum=$groupedWithProratedMinimum}"
                    bulkWithProration != null -> "Price{bulkWithProration=$bulkWithProration}"
                    scalableMatrixWithUnitPricing != null ->
                        "Price{scalableMatrixWithUnitPricing=$scalableMatrixWithUnitPricing}"
                    scalableMatrixWithTieredPricing != null ->
                        "Price{scalableMatrixWithTieredPricing=$scalableMatrixWithTieredPricing}"
                    cumulativeGroupedBulk != null ->
                        "Price{cumulativeGroupedBulk=$cumulativeGroupedBulk}"
                    maxGroupTieredPackage != null ->
                        "Price{maxGroupTieredPackage=$maxGroupTieredPackage}"
                    groupedWithMeteredMinimum != null ->
                        "Price{groupedWithMeteredMinimum=$groupedWithMeteredMinimum}"
                    matrixWithDisplayName != null ->
                        "Price{matrixWithDisplayName=$matrixWithDisplayName}"
                    groupedTieredPackage != null ->
                        "Price{groupedTieredPackage=$groupedTieredPackage}"
                    matrixWithAllocation != null ->
                        "Price{matrixWithAllocation=$matrixWithAllocation}"
                    tieredPackageWithMinimum != null ->
                        "Price{tieredPackageWithMinimum=$tieredPackageWithMinimum}"
                    groupedTiered != null -> "Price{groupedTiered=$groupedTiered}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }

            companion object {

                @JvmStatic fun ofUnit(unit: NewSubscriptionUnitPrice) = Price(unit = unit)

                @JvmStatic
                fun ofPackage(package_: NewSubscriptionPackagePrice) = Price(package_ = package_)

                @JvmStatic fun ofMatrix(matrix: NewSubscriptionMatrixPrice) = Price(matrix = matrix)

                @JvmStatic fun ofTiered(tiered: NewSubscriptionTieredPrice) = Price(tiered = tiered)

                @JvmStatic
                fun ofTieredBps(tieredBps: NewSubscriptionTieredBpsPrice) =
                    Price(tieredBps = tieredBps)

                @JvmStatic fun ofBps(bps: NewSubscriptionBpsPrice) = Price(bps = bps)

                @JvmStatic
                fun ofBulkBps(bulkBps: NewSubscriptionBulkBpsPrice) = Price(bulkBps = bulkBps)

                @JvmStatic fun ofBulk(bulk: NewSubscriptionBulkPrice) = Price(bulk = bulk)

                @JvmStatic
                fun ofThresholdTotalAmount(
                    thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                ) = Price(thresholdTotalAmount = thresholdTotalAmount)

                @JvmStatic
                fun ofTieredPackage(tieredPackage: NewSubscriptionTieredPackagePrice) =
                    Price(tieredPackage = tieredPackage)

                @JvmStatic
                fun ofTieredWithMinimum(tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice) =
                    Price(tieredWithMinimum = tieredWithMinimum)

                @JvmStatic
                fun ofUnitWithPercent(unitWithPercent: NewSubscriptionUnitWithPercentPrice) =
                    Price(unitWithPercent = unitWithPercent)

                @JvmStatic
                fun ofPackageWithAllocation(
                    packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                ) = Price(packageWithAllocation = packageWithAllocation)

                @JvmStatic
                fun ofTieredWithProration(
                    tieredWithProration: NewSubscriptionTierWithProrationPrice
                ) = Price(tieredWithProration = tieredWithProration)

                @JvmStatic
                fun ofUnitWithProration(unitWithProration: NewSubscriptionUnitWithProrationPrice) =
                    Price(unitWithProration = unitWithProration)

                @JvmStatic
                fun ofGroupedAllocation(groupedAllocation: NewSubscriptionGroupedAllocationPrice) =
                    Price(groupedAllocation = groupedAllocation)

                @JvmStatic
                fun ofGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewSubscriptionGroupedWithProratedMinimumPrice
                ) = Price(groupedWithProratedMinimum = groupedWithProratedMinimum)

                @JvmStatic
                fun ofBulkWithProration(bulkWithProration: NewSubscriptionBulkWithProrationPrice) =
                    Price(bulkWithProration = bulkWithProration)

                @JvmStatic
                fun ofScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewSubscriptionScalableMatrixWithUnitPricingPrice
                ) = Price(scalableMatrixWithUnitPricing = scalableMatrixWithUnitPricing)

                @JvmStatic
                fun ofScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing:
                        NewSubscriptionScalableMatrixWithTieredPricingPrice
                ) = Price(scalableMatrixWithTieredPricing = scalableMatrixWithTieredPricing)

                @JvmStatic
                fun ofCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                ) = Price(cumulativeGroupedBulk = cumulativeGroupedBulk)

                @JvmStatic
                fun ofMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                ) = Price(maxGroupTieredPackage = maxGroupTieredPackage)

                @JvmStatic
                fun ofGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                ) = Price(groupedWithMeteredMinimum = groupedWithMeteredMinimum)

                @JvmStatic
                fun ofMatrixWithDisplayName(
                    matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                ) = Price(matrixWithDisplayName = matrixWithDisplayName)

                @JvmStatic
                fun ofGroupedTieredPackage(
                    groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                ) = Price(groupedTieredPackage = groupedTieredPackage)

                @JvmStatic
                fun ofMatrixWithAllocation(
                    matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                ) = Price(matrixWithAllocation = matrixWithAllocation)

                @JvmStatic
                fun ofTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                ) = Price(tieredPackageWithMinimum = tieredPackageWithMinimum)

                @JvmStatic
                fun ofGroupedTiered(groupedTiered: NewSubscriptionGroupedTieredPrice) =
                    Price(groupedTiered = groupedTiered)
            }

            /**
             * An interface that defines how to map each variant of [Price] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnit(unit: NewSubscriptionUnitPrice): T

                fun visitPackage(package_: NewSubscriptionPackagePrice): T

                fun visitMatrix(matrix: NewSubscriptionMatrixPrice): T

                fun visitTiered(tiered: NewSubscriptionTieredPrice): T

                fun visitTieredBps(tieredBps: NewSubscriptionTieredBpsPrice): T

                fun visitBps(bps: NewSubscriptionBpsPrice): T

                fun visitBulkBps(bulkBps: NewSubscriptionBulkBpsPrice): T

                fun visitBulk(bulk: NewSubscriptionBulkPrice): T

                fun visitThresholdTotalAmount(
                    thresholdTotalAmount: NewSubscriptionThresholdTotalAmountPrice
                ): T

                fun visitTieredPackage(tieredPackage: NewSubscriptionTieredPackagePrice): T

                fun visitTieredWithMinimum(
                    tieredWithMinimum: NewSubscriptionTieredWithMinimumPrice
                ): T

                fun visitUnitWithPercent(unitWithPercent: NewSubscriptionUnitWithPercentPrice): T

                fun visitPackageWithAllocation(
                    packageWithAllocation: NewSubscriptionPackageWithAllocationPrice
                ): T

                fun visitTieredWithProration(
                    tieredWithProration: NewSubscriptionTierWithProrationPrice
                ): T

                fun visitUnitWithProration(
                    unitWithProration: NewSubscriptionUnitWithProrationPrice
                ): T

                fun visitGroupedAllocation(
                    groupedAllocation: NewSubscriptionGroupedAllocationPrice
                ): T

                fun visitGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewSubscriptionGroupedWithProratedMinimumPrice
                ): T

                fun visitBulkWithProration(
                    bulkWithProration: NewSubscriptionBulkWithProrationPrice
                ): T

                fun visitScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewSubscriptionScalableMatrixWithUnitPricingPrice
                ): T

                fun visitScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing:
                        NewSubscriptionScalableMatrixWithTieredPricingPrice
                ): T

                fun visitCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewSubscriptionCumulativeGroupedBulkPrice
                ): T

                fun visitMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewSubscriptionMaxGroupTieredPackagePrice
                ): T

                fun visitGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewSubscriptionGroupedWithMeteredMinimumPrice
                ): T

                fun visitMatrixWithDisplayName(
                    matrixWithDisplayName: NewSubscriptionMatrixWithDisplayNamePrice
                ): T

                fun visitGroupedTieredPackage(
                    groupedTieredPackage: NewSubscriptionGroupedTieredPackagePrice
                ): T

                fun visitMatrixWithAllocation(
                    matrixWithAllocation: NewSubscriptionMatrixWithAllocationPrice
                ): T

                fun visitTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewSubscriptionTieredPackageWithMinimumPrice
                ): T

                fun visitGroupedTiered(groupedTiered: NewSubscriptionGroupedTieredPrice): T

                /**
                 * Maps an unknown variant of [Price] to a value of type [T].
                 *
                 * An instance of [Price] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Price: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Price>(Price::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Price {
                    val json = JsonValue.fromJsonNode(node)
                    val modelType =
                        json.asObject().getOrNull()?.get("model_type")?.asString()?.getOrNull()

                    when (modelType) {
                        "unit" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewSubscriptionUnitPrice>())
                                ?.let { Price(unit = it, _json = json) } ?: Price(_json = json)
                        }
                        "package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionPackagePrice>(),
                                )
                                ?.let { Price(package_ = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMatrixPrice>(),
                                )
                                ?.let { Price(matrix = it, _json = json) } ?: Price(_json = json)
                        }
                        "tiered" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredPrice>(),
                                )
                                ?.let { Price(tiered = it, _json = json) } ?: Price(_json = json)
                        }
                        "tiered_bps" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredBpsPrice>(),
                                )
                                ?.let { Price(tieredBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewSubscriptionBpsPrice>())
                                ?.let { Price(bps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk_bps" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionBulkBpsPrice>(),
                                )
                                ?.let { Price(bulkBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewSubscriptionBulkPrice>())
                                ?.let { Price(bulk = it, _json = json) } ?: Price(_json = json)
                        }
                        "threshold_total_amount" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionThresholdTotalAmountPrice>(),
                                )
                                ?.let { Price(thresholdTotalAmount = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredPackagePrice>(),
                                )
                                ?.let { Price(tieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_percent" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionUnitWithPercentPrice>(),
                                )
                                ?.let { Price(unitWithPercent = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "package_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionPackageWithAllocationPrice>(),
                                )
                                ?.let { Price(packageWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTierWithProrationPrice>(),
                                )
                                ?.let { Price(tieredWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionUnitWithProrationPrice>(),
                                )
                                ?.let { Price(unitWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedAllocationPrice>(),
                                )
                                ?.let { Price(groupedAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_prorated_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedWithProratedMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithProratedMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "bulk_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionBulkWithProrationPrice>(),
                                )
                                ?.let { Price(bulkWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_unit_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        NewSubscriptionScalableMatrixWithUnitPricingPrice
                                    >(),
                                )
                                ?.let { Price(scalableMatrixWithUnitPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_tiered_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        NewSubscriptionScalableMatrixWithTieredPricingPrice
                                    >(),
                                )
                                ?.let { Price(scalableMatrixWithTieredPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "cumulative_grouped_bulk" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionCumulativeGroupedBulkPrice>(),
                                )
                                ?.let { Price(cumulativeGroupedBulk = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "max_group_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMaxGroupTieredPackagePrice>(),
                                )
                                ?.let { Price(maxGroupTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_metered_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedWithMeteredMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithMeteredMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_display_name" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMatrixWithDisplayNamePrice>(),
                                )
                                ?.let { Price(matrixWithDisplayName = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedTieredPackagePrice>(),
                                )
                                ?.let { Price(groupedTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionMatrixWithAllocationPrice>(),
                                )
                                ?.let { Price(matrixWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionTieredPackageWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredPackageWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewSubscriptionGroupedTieredPrice>(),
                                )
                                ?.let { Price(groupedTiered = it, _json = json) }
                                ?: Price(_json = json)
                        }
                    }

                    return Price(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Price>(Price::class) {

                override fun serialize(
                    value: Price,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.unit != null -> generator.writeObject(value.unit)
                        value.package_ != null -> generator.writeObject(value.package_)
                        value.matrix != null -> generator.writeObject(value.matrix)
                        value.tiered != null -> generator.writeObject(value.tiered)
                        value.tieredBps != null -> generator.writeObject(value.tieredBps)
                        value.bps != null -> generator.writeObject(value.bps)
                        value.bulkBps != null -> generator.writeObject(value.bulkBps)
                        value.bulk != null -> generator.writeObject(value.bulk)
                        value.thresholdTotalAmount != null ->
                            generator.writeObject(value.thresholdTotalAmount)
                        value.tieredPackage != null -> generator.writeObject(value.tieredPackage)
                        value.tieredWithMinimum != null ->
                            generator.writeObject(value.tieredWithMinimum)
                        value.unitWithPercent != null ->
                            generator.writeObject(value.unitWithPercent)
                        value.packageWithAllocation != null ->
                            generator.writeObject(value.packageWithAllocation)
                        value.tieredWithProration != null ->
                            generator.writeObject(value.tieredWithProration)
                        value.unitWithProration != null ->
                            generator.writeObject(value.unitWithProration)
                        value.groupedAllocation != null ->
                            generator.writeObject(value.groupedAllocation)
                        value.groupedWithProratedMinimum != null ->
                            generator.writeObject(value.groupedWithProratedMinimum)
                        value.bulkWithProration != null ->
                            generator.writeObject(value.bulkWithProration)
                        value.scalableMatrixWithUnitPricing != null ->
                            generator.writeObject(value.scalableMatrixWithUnitPricing)
                        value.scalableMatrixWithTieredPricing != null ->
                            generator.writeObject(value.scalableMatrixWithTieredPricing)
                        value.cumulativeGroupedBulk != null ->
                            generator.writeObject(value.cumulativeGroupedBulk)
                        value.maxGroupTieredPackage != null ->
                            generator.writeObject(value.maxGroupTieredPackage)
                        value.groupedWithMeteredMinimum != null ->
                            generator.writeObject(value.groupedWithMeteredMinimum)
                        value.matrixWithDisplayName != null ->
                            generator.writeObject(value.matrixWithDisplayName)
                        value.groupedTieredPackage != null ->
                            generator.writeObject(value.groupedTieredPackage)
                        value.matrixWithAllocation != null ->
                            generator.writeObject(value.matrixWithAllocation)
                        value.tieredPackageWithMinimum != null ->
                            generator.writeObject(value.tieredPackageWithMinimum)
                        value.groupedTiered != null -> generator.writeObject(value.groupedTiered)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Price")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReplacePrice && replacesPriceId == other.replacesPriceId && allocationPrice == other.allocationPrice && discounts == other.discounts && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && maximumAmount == other.maximumAmount && minimumAmount == other.minimumAmount && price == other.price && priceId == other.priceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(replacesPriceId, allocationPrice, discounts, externalPriceId, fixedPriceQuantity, maximumAmount, minimumAmount, price, priceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReplacePrice{replacesPriceId=$replacesPriceId, allocationPrice=$allocationPrice, discounts=$discounts, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, price=$price, priceId=$priceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionSchedulePlanChangeParams && subscriptionId == other.subscriptionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionSchedulePlanChangeParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
