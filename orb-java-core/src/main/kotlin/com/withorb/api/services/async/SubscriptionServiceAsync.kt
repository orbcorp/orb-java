// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.Subscription
import com.withorb.api.models.SubscriptionCancelParams
import com.withorb.api.models.SubscriptionCreateParams
import com.withorb.api.models.SubscriptionFetchCostsParams
import com.withorb.api.models.SubscriptionFetchCostsResponse
import com.withorb.api.models.SubscriptionFetchParams
import com.withorb.api.models.SubscriptionFetchSchedulePageAsync
import com.withorb.api.models.SubscriptionFetchScheduleParams
import com.withorb.api.models.SubscriptionFetchUsageParams
import com.withorb.api.models.SubscriptionListPageAsync
import com.withorb.api.models.SubscriptionListParams
import com.withorb.api.models.SubscriptionPriceIntervalsParams
import com.withorb.api.models.SubscriptionSchedulePlanChangeParams
import com.withorb.api.models.SubscriptionTriggerPhaseParams
import com.withorb.api.models.SubscriptionUnscheduleCancellationParams
import com.withorb.api.models.SubscriptionUnscheduleFixedFeeQuantityUpdatesParams
import com.withorb.api.models.SubscriptionUnschedulePendingPlanChangesParams
import com.withorb.api.models.SubscriptionUpdateFixedFeeQuantityParams
import com.withorb.api.models.SubscriptionUpdateParams
import com.withorb.api.models.SubscriptionUsage
import java.util.concurrent.CompletableFuture

interface SubscriptionServiceAsync {

    /**
     * A subscription represents the purchase of a plan by a customer. The customer is identified by
     * either the `customer_id` or the `external_customer_id`, and exactly one of these fields must
     * be provided.
     *
     * By default, subscriptions begin on the day that they're created and renew automatically for
     * each billing cycle at the cadence that's configured in the plan definition.
     *
     * The default configuration for subscriptions in Orb is **In-advance billing** and **Beginning
     * of month alignment** (see [Subscription](../guides/concepts#subscription) for more details).
     *
     * In order to change the alignment behavior, Orb also supports billing subscriptions on the day
     * of the month they are created. If `align_billing_with_subscription_start_date = true` is
     * specified, subscriptions have billing cycles that are aligned with their `start_date`. For
     * example, a subscription that begins on January 15th will have a billing cycle from January
     * 15th to February 15th. Every subsequent billing cycle will continue to start and invoice on
     * the 15th.
     *
     * If the "day" value is greater than the number of days in the month, the next billing cycle
     * will start at the end of the month. For example, if the start_date is January 31st, the next
     * billing cycle will start on February 28th.
     *
     * If a customer was created with a currency, Orb only allows subscribing the customer to a plan
     * with a matching `invoicing_currency`. If the customer does not have a currency set, on
     * subscription creation, we set the customer's currency to be the `invoicing_currency` of the
     * plan.
     *
     * ## Price overrides
     *
     * Price overrides are used to update some or all prices in a plan for the specific subscription
     * being created. This is useful when a new customer has negotiated one or more different prices
     * for a specific plan than the plan's default prices. Any type of price can be overridden, if
     * the correct data is provided. The billable metric, cadence, type, and name of a price can not
     * be overridden.
     *
     * To override prices, provide a list of objects with the key `price_overrides`. The price
     * object in the list of overrides is expected to contain the existing price id, the
     * `model_type` and config value in the format below. The specific numerical values can be
     * updated, but the config value and `model_type` must match the existing price that is being
     * overridden
     *
     * ### Request format for price overrides
     *
     * Orb supports a few different pricing models out of the box. The `model_type` field determines
     * the key for the configuration object that is present.
     *
     * ### Unit pricing
     *
     * With unit pricing, each unit costs a fixed amount.
     *
     * ```json
     * {
     *   ...
     *   "id": "price_id",
     *   "model_type": "unit",
     *   "unit_config": {
     *     "unit_amount": "0.50"
     *   }
     *   ...
     * }
     * ```
     *
     * ### Tiered pricing
     *
     * In tiered pricing, the cost of a given unit depends on the tier range that it falls into,
     * where each tier range is defined by an upper and lower bound. For example, the first ten
     * units may cost $0.50 each and all units thereafter may cost $0.10 each. Tiered prices can be
     * overridden with a new number of tiers or new values for `first_unit`, `last_unit`, or
     * `unit_amount`.
     *
     * ```json
     * {
     *   ...
     *   "id": "price_id",
     *   "model_type": "tiered",
     *   "tiered_config": {
     *     "tiers": [
     *       {
     *         "first_unit":"1",
     *         "last_unit": "11",
     *         "unit_amount": "0.50"
     *       },
     *       {
     *         "first_unit": "11",
     *         "last_unit": null,
     *         "unit_amount": "0.10"
     *       }
     *     ]
     *   }
     *   ...
     * }
     * ```
     *
     * ### Bulk pricing
     *
     * Bulk pricing applies when the number of units determine the cost of _all_ units. For example,
     * if you've bought less than 10 units, they may each be $0.50 for a total of $5.00. Once you've
     * bought more than 10 units, all units may now be priced at $0.40 (i.e. 101 units total would
     * be $40.40). Bulk prices can be overridden with a new number of tiers or new values for
     * `maximum_units`, or `unit_amount`.
     *
     * ```json
     * {
     *   ...
     *   "id": "price_id",
     *   "model_type": "bulk",
     *   "bulk_config": {
     *     "tiers": [
     *       {
     *         "maximum_units": "10",
     *         "unit_amount": "0.50"
     *       },
     *       {
     *         "maximum_units": "1000",
     *         "unit_amount": "0.40"
     *       }
     *     ]
     *   }
     *   ...
     * }
     * ```
     *
     * ### Package pricing
     *
     * Package pricing defines the size or granularity of a unit for billing purposes. For example,
     * if the package size is set to 5, then 4 units will be billed as 5 and 6 units will be billed
     * at 10.
     *
     * ```json
     * {
     *   ...
     *   "id": "price_id",
     *   "model_type": "package",
     *   "package_config": {
     *     "package_amount": "0.80",
     *     "package_size": 10
     *   }
     *   ...
     * }
     * ```
     *
     * ### BPS pricing
     *
     * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a percent (the
     * number of basis points to charge), as well as a cap per event to assess. For example, this
     * would allow you to assess a fee of 0.25% on every payment you process, with a maximum charge
     * of $25 per payment.
     *
     * ```json
     * {
     *   ...
     *   "id": "price_id"
     *   "model_type": "bps",
     *   "bps_config": {
     *     "bps": 125,
     *     "per_event_cap": "11.00"
     *   }
     *   ...
     * }
     * ```
     *
     * ### Bulk BPS pricing
     *
     * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total quantity
     * across all events. Similar to bulk pricing, the BPS parameters of a given event depends on
     * the tier range that the billing period falls into. Each tier range is defined by an upper and
     * lower bound. For example, after $1.5M of payment volume is reached, each individual payment
     * may have a lower cap or a smaller take-rate.
     *
     * ```json
     * {
     *   ...
     *   "id": "price_id"
     *   "model_type": "bulk_bps",
     *   "bulk_bps_config": {
     *     "tiers": [
     *       {
     *         "minimum_amount": "0.00",
     *         "maximum_amount": "1000000.00",
     *         "bps": 125,
     *         "per_event_cap": "19.00"
     *       },
     *       {
     *         "minimum_amount":"1000000.00",
     *         "maximum_amount": null,
     *         "bps": 115,
     *         "per_event_cap": "4.00"
     *       }
     *     ]
     *   }
     * ...
     * }
     * ```
     *
     * ### Tiered BPS pricing
     *
     * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
     * applicable parameter is a function of its marginal addition to the period total. Similar to
     * tiered pricing, the BPS parameters of a given event depends on the tier range that it falls
     * into, where each tier range is defined by an upper and lower bound. For example, the first
     * few payments may have a 0.8 BPS take-rate and all payments after a specific volume may incur
     * a take-rate of 0.5 BPS each.
     *
     * ```json
     * {
     *   ...
     *   "id": "price_id"
     *   "model_type": "tiered_bps",
     *   "tiered_bps_config": {
     *     "tiers": [
     *       {
     *         "minimum_amount": "0.00",
     *         "maximum_amount": "1000000.00",
     *         "bps": 125,
     *         "per_event_cap": "19.00"
     *       },
     *       {
     *         "minimum_amount":"1000000",
     *         "maximum_amount": null,
     *         "bps": 115,
     *         "per_event_cap": "4.00"
     *       }
     *     ]
     *   }
     *   ...
     * }
     * ```
     *
     * ### Matrix pricing
     *
     * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix. `dimensions`
     * defines the two event property values evaluated in this pricing model. In a one-dimensional
     * matrix, the second value is `null`. Every configuration has a list of `matrix_values` which
     * give the unit prices for specified property values. In a one-dimensional matrix, the matrix
     * values will have `dimension_values` where the second value of the pair is null. If an event
     * does not match any of the dimension values in the matrix, it will resort to the
     * `default_unit_amount`.
     *
     * ```json
     * {
     *   ...
     *   "model_type": "matrix",
     *   "matrix_config": {
     *     "default_unit_amount": "3.00",
     *     "dimensions": [
     *       "cluster_name",
     *       "region"
     *     ],
     *     "matrix_values": [
     *       {
     *         "dimension_values": [
     *           "alpha",
     *           "west"
     *         ],
     *         "unit_amount": "2.00"
     *       },
     *       ...
     *     ]
     *   }
     * }
     * ```
     *
     * ### Fixed fees
     *
     * Fixed fees follow unit pricing, and also have an additional parameter `fixed_price_quantity`
     * that indicates how many of a fixed fee that should be applied for a subscription. This
     * parameter defaults to 1.
     *
     * ```json
     * {
     *   ...
     *   "id": "price_id",
     *   "model_type": "unit",
     *   "unit_config": {
     *     "unit_amount": "2.00"
     *   },
     *   "fixed_price_quantity": 3.0
     *   ...
     * }
     * ```
     *
     * ## Maximums and Minimums
     *
     * Minimums and maximums, much like price overrides, can be useful when a new customer has
     * negotiated a new or different minimum or maximum spend cap than the default for a given
     * price. If one exists for a price and null is provided for the minimum/maximum override on
     * creation, then there will be no minimum/maximum on the new subscription. If no value is
     * provided, then the default price maximum or minimum is used.
     *
     * To add a minimum for a specific price, add `minimum_amount` to the specific price in the
     * `price_overrides` object.
     *
     * To add a maximum for a specific price, add `maximum_amount` to the specific price in the
     * `price_overrides` object.
     *
     * ### Minimum override example
     *
     * Price minimum override example:
     * ```json
     * {
     *   ...
     *   "id": "price_id",
     *   "model_type": "unit",
     *   "unit_config": {
     *     "unit_amount": "0.50"
     *   },
     *   "minimum_amount": "100.00"
     *   ...
     * }
     * ```
     *
     * Removing an existing minimum example
     *
     * ```json
     * {
     *   ...
     *   "id": "price_id",
     *   "model_type": "unit",
     *   "unit_config": {
     *     "unit_amount": "0.50"
     *   },
     *   "minimum_amount": null
     *   ...
     * }
     * ```
     *
     * ## Discounts
     *
     * Discounts, like price overrides, can be useful when a new customer has negotiated a new or
     * different discount than the default for a price. A single price price can have at most one
     * discount. If a discount exists for a price and a null discount is provided on creation, then
     * there will be no discount on the new subscription.
     *
     * To add a discount for a specific price, add `discount` to the price in the `price_overrides`
     * object. Discount should be a dictionary of the format:
     * ```ts
     * {
     *   "discount_type": "amount" | "percentage" | "usage",
     *   "amount_discount": string,
     *   "percentage_discount": string,
     *   "usage_discount": string
     * }
     * ```
     *
     * where either `amount_discount`, `percentage_discount`, or `usage_discount` is provided.
     *
     * Price discount example
     *
     * ```json
     * {
     *   ...
     *   "id": "price_id",
     *   "model_type": "unit",
     *   "unit_config": {
     *     "unit_amount": "0.50"
     *   },
     *   "discount": {"discount_type": "amount", "amount_discount": "175"},
     * }
     * ```
     *
     * Removing an existing discount example
     *
     * ```json
     * {
     *   "customer_id": "customer_id",
     *   "plan_id": "plan_id",
     *   "discount": null,
     *   "price_overrides": [ ... ]
     *   ...
     * }
     * ```
     *
     * ## Threshold Billing
     *
     * Orb supports invoicing for a subscription when a preconfigured usage threshold is hit. To
     * enable threshold billing, pass in an `invoicing_threshold`, which is specified in the
     * subscription's invoicing currency, when creating a subscription. E.g. pass in `10.00` to
     * issue an invoice when usage amounts hit $10.00 for a subscription that invoices in USD.
     */
    @JvmOverloads
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Subscription>

    /**
     * This endpoint can be used to update the `metadata`, `net terms`, `auto_collection`,
     * `invoicing_threshold`, and `default_invoice_memo` properties on a subscription.
     */
    @JvmOverloads
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Subscription>

    /**
     * This endpoint returns a list of all subscriptions for an account as a
     * [paginated](../reference/pagination) list, ordered starting from the most recently created
     * subscription. For a full discussion of the subscription resource, see
     * [Subscription](../guides/concepts#subscription).
     *
     * Subscriptions can be filtered for a specific customer by using either the customer_id or
     * external_customer_id query parameters. To filter subscriptions for multiple customers, use
     * the customer_id[] or external_customer_id[] query parameters.
     */
    @JvmOverloads
    fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SubscriptionListPageAsync>

    /**
     * This endpoint can be used to cancel an existing subscription. It returns the serialized
     * subscription object with an `end_date` parameter that signifies when the subscription will
     * transition to an ended state.
     *
     * The body parameter `cancel_option` determines the cancellation behavior. Orb supports three
     * cancellation options:
     * - `end_of_subscription_term`: stops the subscription from auto-renewing. Subscriptions that
     *   have been cancelled with this option can still incur charges for the remainder of their
     *   term:
     *     - Issuing this cancellation request for a monthly subscription will keep the subscription
     *       active until the start of the subsequent month, and potentially issue an invoice for
     *       any usage charges incurred in the intervening period.
     *     - Issuing this cancellation request for a quarterly subscription will keep the
     *       subscription active until the end of the quarter and potentially issue an invoice for
     *       any usage charges incurred in the intervening period.
     *     - Issuing this cancellation request for a yearly subscription will keep the subscription
     *       active for the full year. For example, a yearly subscription starting on 2021-11-01 and
     *       cancelled on 2021-12-08 will remain active until 2022-11-01 and potentially issue
     *       charges in the intervening months for any recurring monthly usage charges in its plan.
     *     - **Note**: If a subscription's plan contains prices with difference cadences, the end of
     *       term date will be determined by the largest cadence value. For example, cancelling end
     *       of term for a subscription with a quarterly fixed fee with a monthly usage fee will
     *       result in the subscription ending at the end of the quarter.
     * - `immediate`: ends the subscription immediately, setting the `end_date` to the current time:
     *     - Subscriptions that have been cancelled with this option will be invoiced immediately.
     *       This invoice will include any usage fees incurred in the billing period up to the
     *       cancellation, along with any prorated recurring fees for the billing period, if
     *       applicable.
     *     - **Note**: If the subscription has a recurring fee that was paid in-advance, the
     *       prorated amount for the remaining time period will be added to the
     *       [customer's balance](list-balance-transactions) upon immediate cancellation. However,
     *       if the customer is ineligible to use the customer balance, the subscription cannot be
     *       cancelled immediately.
     * - `requested_date`: ends the subscription on a specified date, which requires a
     *   `cancellation_date` to be passed in. If no timezone is provided, the customer's timezone is
     *   used. For example, a subscription starting on January 1st with a monthly price can be set
     *   to be cancelled on the first of any month after January 1st (e.g. March 1st, April 1st, May
     *   1st). A subscription with multiple prices with different cadences defines the "term" to be
     *   the highest cadence of the prices.
     *
     * Upcoming subscriptions are only eligible for immediate cancellation, which will set the
     * `end_date` equal to the `start_date` upon cancellation.
     *
     * ## Backdated cancellations
     *
     * Orb allows you to cancel a subscription in the past as long as there are no paid invoices
     * between the `requested_date` and the current time. If the cancellation is after the latest
     * issued invoice, Orb will generate a balance refund for the current period. If the
     * cancellation is before the most recently issued invoice, Orb will void the intervening
     * invoice and generate a new one based on the new dates for the subscription. See the section
     * on
     * [cancellation behaviors](../guides/product-catalog/creating-subscriptions.md#cancellation-behaviors).
     */
    @JvmOverloads
    fun cancel(
        params: SubscriptionCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Subscription>

    /**
     * This endpoint is used to fetch a [Subscription](../guides/concepts#subscription) given an
     * identifier.
     */
    @JvmOverloads
    fun fetch(
        params: SubscriptionFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Subscription>

    /**
     * This endpoint is used to fetch a day-by-day snapshot of a subscription's costs in Orb,
     * calculated by applying pricing information to the underlying usage (see the
     * [subscription usage endpoint](fetch-subscription-usage) to fetch usage per metric, in usage
     * units rather than a currency).
     *
     * The semantics of this endpoint exactly mirror those of
     * [fetching a customer's costs](fetch-customer-costs). Use this endpoint to limit your analysis
     * of costs to a specific subscription for the customer (e.g. to de-aggregate costs when a
     * customer's subscription has started and stopped on the same day).
     */
    @JvmOverloads
    fun fetchCosts(
        params: SubscriptionFetchCostsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SubscriptionFetchCostsResponse>

    /**
     * This endpoint returns a [paginated](../reference/pagination) list of all plans associated
     * with a subscription along with their start and end dates. This list contains the
     * subscription's initial plan along with past and future plan changes.
     */
    @JvmOverloads
    fun fetchSchedule(
        params: SubscriptionFetchScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SubscriptionFetchSchedulePageAsync>

    /**
     * This endpoint is used to fetch a subscription's usage in Orb. Especially when combined with
     * optional query parameters, this endpoint is a powerful way to build visualizations on top of
     * Orb's event data and metrics.
     *
     * With no query parameters specified, this endpoint returns usage for the subscription's
     * _current billing period_ across each billable metric that participates in the subscription.
     * Usage quantities returned are the result of evaluating the metric definition for the entirety
     * of the customer's billing period.
     *
     * ### Default response shape
     *
     * Orb returns a `data` array with an object corresponding to each billable metric. Nested
     * within this object is a `usage` array which has a `quantity` value and a corresponding
     * `timeframe_start` and `timeframe_end`. The `quantity` value represents the calculated usage
     * value for the billable metric over the specified timeframe (inclusive of the
     * `timeframe_start` timestamp and exclusive of the `timeframe_end` timestamp).
     *
     * Orb will include _every_ window in the response starting from the beginning of the billing
     * period, even when there were no events (and therefore no usage) in the window. This increases
     * the size of the response but prevents the caller from filling in gaps and handling cumbersome
     * time-based logic.
     *
     * The query parameters in this endpoint serve to override this behavior and provide some key
     * functionality, as listed below. Note that this functionality can also be used _in
     * conjunction_ with each other, e.g. to display grouped usage on a custom timeframe.
     *
     * ## Custom timeframe
     *
     * In order to view usage for a custom timeframe rather than the current billing period, specify
     * a `timeframe_start` and `timeframe_end`. This will calculate quantities for usage incurred
     * between timeframe_start (inclusive) and timeframe_end (exclusive), i.e. `[timeframe_start,
     * timeframe_end)`.
     *
     * Note:
     * - These timestamps must be specified in ISO 8601 format and UTC timezone, e.g.
     *   `2022-02-01T05:00:00Z`.
     * - Both parameters must be specified if either is specified.
     *
     * ## Grouping by custom attributes
     *
     * In order to view a single metric grouped by a specific _attribute_ that each event is tagged
     * with (e.g. `cluster`), you must additionally specify a `billable_metric_id` and a `group_by`
     * key. The `group_by` key denotes the event property on which to group.
     *
     * When returning grouped usage, only usage for `billable_metric_id` is returned, and a separate
     * object in the `data` array is returned for each value of the `group_by` key present in your
     * events. The `quantity` value is the result of evaluating the billable metric for events
     * filtered to a single value of the `group_by` key.
     *
     * Orb expects that events that match the billable metric will contain values in the
     * `properties` dictionary that correspond to the `group_by` key specified. By default, Orb will
     * not return a `null` group (i.e. events that match the metric but do not have the key set).
     * Currently, it is only possible to view usage grouped by a single attribute at a time.
     *
     * When viewing grouped usage, Orb uses pagination to limit the response size to 1000 groups by
     * default. If there are more groups for a given subscription, pagination metadata in the
     * response can be used to fetch all of the data.
     *
     * The following example shows usage for an "API Requests" billable metric grouped by `region`.
     * Note the extra `metric_group` dictionary in the response, which provides metadata about the
     * group:
     * ```json
     * {
     *     "data": [
     *         {
     *             "usage": [
     *                 {
     *                     "quantity": 0.19291,
     *                     "timeframe_start": "2021-10-01T07:00:00Z",
     *                     "timeframe_end": "2021-10-02T07:00:00Z",
     *                 },
     *                 ...
     *             ],
     *             "metric_group": {
     *                 "property_key": "region",
     *                 "property_value": "asia/pacific"
     *             },
     *             "billable_metric": {
     *                 "id": "Fe9pbpMk86xpwdGB",
     *                 "name": "API Requests"
     *             },
     *             "view_mode": "periodic"
     *         },
     *         ...
     *     ]
     * }
     * ```
     *
     * ## Windowed usage
     *
     * The `granularity` parameter can be used to _window_ the usage `quantity` value into periods.
     * When not specified, usage is returned for the entirety of the time range.
     *
     * When `granularity = day` is specified with a timeframe longer than a day, Orb will return a
     * `quantity` value for each full day between `timeframe_start` and `timeframe_end`. Note that
     * the days are demarcated by the _customer's local midnight_.
     *
     * For example, with `timeframe_start = 2022-02-01T05:00:00Z`, `timeframe_end =
     * 2022-02-04T01:00:00Z` and `granularity=day`, the following windows will be returned for a
     * customer in the `America/Los_Angeles` timezone since local midnight is `08:00` UTC:
     * - `[2022-02-01T05:00:00Z, 2022-02-01T08:00:00Z)`
     * - `[2022-02-01T08:00:00, 2022-02-02T08:00:00Z)`
     * - `[2022-02-02T08:00:00, 2022-02-03T08:00:00Z)`
     * - `[2022-02-03T08:00:00, 2022-02-04T01:00:00Z)`
     *
     * ```json
     * {
     *     "data": [
     *         {
     *             "billable_metric": {
     *                 "id": "Q8w89wjTtBdejXKsm",
     *                 "name": "API Requests"
     *             },
     *             "usage": [
     *                 {
     *                     "quantity": 0,
     *                     "timeframe_end": "2022-02-01T08:00:00+00:00",
     *                     "timeframe_start": "2022-02-01T05:00:00+00:00"
     *                 },
     *                 {
     *
     *                     "quantity": 0,
     *                     "timeframe_end": "2022-02-02T08:00:00+00:00",
     *                     "timeframe_start": "2022-02-01T08:00:00+00:00"
     *                 },
     *                 {
     *                     "quantity": 0,
     *                     "timeframe_end": "2022-02-03T08:00:00+00:00",
     *                     "timeframe_start": "2022-02-02T08:00:00+00:00"
     *                 },
     *                 {
     *                     "quantity": 0,
     *                     "timeframe_end": "2022-02-04T01:00:00+00:00",
     *                     "timeframe_start": "2022-02-03T08:00:00+00:00"
     *                 }
     *             ],
     *             "view_mode": "periodic"
     *         },
     *         ...
     *     ]
     * }
     * ```
     *
     * ## Decomposable vs. non-decomposable metrics
     *
     * Billable metrics fall into one of two categories: decomposable and non-decomposable. A
     * decomposable billable metric, such as a sum or a count, can be displayed and aggregated
     * across arbitrary timescales. On the other hand, a non-decomposable metric is not meaningful
     * when only a slice of the billing window is considered.
     *
     * As an example, if we have a billable metric that's defined to count unique users, displaying
     * a graph of unique users for each day is not representative of the billable metric value over
     * the month (days could have an overlapping set of 'unique' users). Instead, what's useful for
     * any given day is the number of unique users in the billing period so far, which are the
     * _cumulative_ unique users.
     *
     * Accordingly, this endpoint returns treats these two types of metrics differently when
     * `group_by` is specified:
     * - Decomposable metrics can be grouped by any event property.
     * - Non-decomposable metrics can only be grouped by the corresponding price's invoice grouping
     *   key. If no invoice grouping key is present, the metric does not support `group_by`.
     *
     * ## Matrix prices
     *
     * When a billable metric is attached to a price that uses matrix pricing, it's important to
     * view usage grouped by those matrix dimensions. In this case, use the query parameters
     * `first_dimension_key`, `first_dimension_value` and `second_dimension_key`,
     * `second_dimension_value` while filtering to a specific `billable_metric_id`.
     *
     * For example, if your compute metric has a separate unit price (i.e. a matrix pricing model)
     * per `region` and `provider`, your request might provide the following parameters:
     * - `first_dimension_key`: `region`
     * - `first_dimension_value`: `us-east-1`
     * - `second_dimension_key`: `provider`
     * - `second_dimension_value`: `aws`
     */
    @JvmOverloads
    fun fetchUsage(
        params: SubscriptionFetchUsageParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SubscriptionUsage>

    /**
     * This endpoint is used to add and edit subscription
     * [price intervals](../reference/price-interval). By making modifications to a subscription’s
     * price intervals, you can
     * [flexibly and atomically control the billing behavior of a subscription](../guides/product-catalog/modifying-subscriptions).
     *
     * ## Adding price intervals
     *
     * Prices can be added as price intervals to a subscription by specifying them in the `add`
     * array. A `price_id` or `external_price_id` from an add-on price or previously removed plan
     * price can be specified to reuse an existing price definition (however, please note that
     * prices from other plans cannot be added to the subscription). Additionally, a new price can
     * be specified using the `price` field — this price will be created automatically.
     *
     * A `start_date` must be specified for the price interval. This is the date when the price will
     * start billing on the subscription, so this will notably result in an immediate charge at this
     * time for any billed in advance fixed fees. The `end_date` will default to null, resulting in
     * a price interval that will bill on a continually recurring basis. Both of these dates can be
     * set in the past or the future and Orb will generate or modify invoices to ensure the
     * subscription’s invoicing behavior is correct.
     *
     * Additionally, a discount, minimum, or maximum can be specified on the price interval. This
     * will only apply to this price interval, not any other price intervals on the subscription.
     *
     * ## Adjustment intervals
     *
     * An adjustment interval represents the time period that a particular adjustment (a discount,
     * minimum, or maximum) applies to the prices on a subscription. Adjustment intervals can be
     * added to a subscription by specifying them in the `add_adjustments` array, or modified via
     * the `edit_adjustments` array. When creating an adjustment interval, you'll need to provide
     * the definition of the new adjustment (the type of adjustment, and which prices it applies
     * to), as well as the start and end dates for the adjustment interval. The start and end dates
     * of an existing adjustment interval can be edited via the `edit_adjustments` field (just like
     * price intervals). (To "change" the amount of a discount, minimum, or maximum, then, you'll
     * need to end the existing interval, and create a new adjustment interval with the new amount
     * and a start date that matches the end date of the previous interval.)
     *
     * ## Editing price intervals
     *
     * Price intervals can be adjusted by specifying edits to make in the `edit` array. A
     * `price_interval_id` to edit must be specified — this can be retrieved from the
     * `price_intervals` field on the subscription.
     *
     * A new `start_date` or `end_date` can be specified to change the range of the price interval,
     * which will modify past or future invoices to ensure correctness. If either of these dates are
     * unspecified, they will default to the existing date on the price interval. To remove a price
     * interval entirely from a subscription, set the `end_date` to be equivalent to the
     * `start_date`.
     *
     * ## Fixed fee quantity transitions
     *
     * The fixed fee quantity transitions for a fixed fee price interval can also be specified when
     * adding or editing by passing an array for `fixed_fee_quantity_transitions`. A fixed fee
     * quantity transition must have a `quantity` and an `effective_date`, which is the date after
     * which the new quantity will be used for billing. If a fixed fee quantity transition is
     * scheduled at a billing period boundary, the full quantity will be billed on an invoice with
     * the other prices on the subscription. If the fixed fee quantity transition is scheduled
     * mid-billing period, the difference between the existing quantity and quantity specified in
     * the transition will be prorated for the rest of the billing period and billed immediately,
     * which will generate a new invoice.
     *
     * Notably, the list of fixed fee quantity transitions passed will overwrite the existing fixed
     * fee quantity transitions on the price interval, so the entire list of transitions must be
     * specified to add additional transitions. The existing list of transitions can be retrieved
     * using the `fixed_fee_quantity_transitions` property on a subscription’s serialized price
     * intervals.
     */
    @JvmOverloads
    fun priceIntervals(
        params: SubscriptionPriceIntervalsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Subscription>

    /**
     * This endpoint can be used to change the plan on an existing subscription. It returns the
     * serialized updated subscription object.
     *
     * The body parameter `change_option` determines the timing of the plan change. Orb supports
     * three options:
     * - `end_of_subscription_term`: changes the plan at the end of the existing plan's term.
     *     - Issuing this plan change request for a monthly subscription will keep the existing plan
     *       active until the start of the subsequent month, and potentially issue an invoice for
     *       any usage charges incurred in the intervening period.
     *     - Issuing this plan change request for a yearly subscription will keep the existing plan
     *       active for the full year.
     * - `immediate`: changes the plan immediately. Subscriptions that have their plan changed with
     *   this option will be invoiced immediately. This invoice will include any usage fees incurred
     *   in the billing period up to the change, along with any prorated recurring fees for the
     *   billing period, if applicable.
     * - `requested_date`: changes the plan on the requested date (`change_date`). If no timezone is
     *   provided, the customer's timezone is used. The `change_date` body parameter is required if
     *   this option is chosen.
     *
     * Note that one of `plan_id` or `external_plan_id` is required in the request body for this
     * operation.
     *
     * ## Price overrides, maximums, and minimums
     *
     * Price overrides are used to update some or all prices in the target plan. Minimums and
     * maximums, much like price overrides, can be useful when a new customer has negotiated a new
     * or different minimum or maximum spend cap than the default for the plan. The request format
     * for price overrides, maximums, and minimums are the same as those in
     * [subscription creation](create-subscription).
     *
     * ## Scheduling multiple plan changes
     *
     * When scheduling multiple plan changes with the same date, the latest plan change on that day
     * takes effect.
     *
     * ## Prorations for in-advance fees
     *
     * By default, Orb calculates the prorated difference in any fixed fees when making a plan
     * change, adjusting the customer balance as needed. For details on this behavior, see
     * [Modifying subscriptions](../guides/product-catalog/modifying-subscriptions.md#prorations-for-in-advance-fees).
     */
    @JvmOverloads
    fun schedulePlanChange(
        params: SubscriptionSchedulePlanChangeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Subscription>

    /**
     * Manually trigger a phase, effective the given date (or the current time, if not specified).
     */
    @JvmOverloads
    fun triggerPhase(
        params: SubscriptionTriggerPhaseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Subscription>

    /**
     * This endpoint can be used to unschedule any pending cancellations for a subscription.
     *
     * To be eligible, the subscription must currently be active and have a future cancellation.
     * This operation will turn on auto-renew, ensuring that the subscription does not end at the
     * currently scheduled cancellation time.
     */
    @JvmOverloads
    fun unscheduleCancellation(
        params: SubscriptionUnscheduleCancellationParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Subscription>

    /**
     * This endpoint can be used to clear scheduled updates to the quantity for a fixed fee.
     *
     * If there are no updates scheduled, a request validation error will be returned with a 400
     * status code.
     */
    @JvmOverloads
    fun unscheduleFixedFeeQuantityUpdates(
        params: SubscriptionUnscheduleFixedFeeQuantityUpdatesParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Subscription>

    /**
     * This endpoint can be used to unschedule any pending plan changes on an existing subscription.
     */
    @JvmOverloads
    fun unschedulePendingPlanChanges(
        params: SubscriptionUnschedulePendingPlanChangesParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Subscription>

    /**
     * This endpoint can be used to update the quantity for a fixed fee.
     *
     * To be eligible, the subscription must currently be active and the price specified must be a
     * fixed fee (not usage-based). This operation will immediately update the quantity for the fee,
     * or if a `effective_date` is passed in, will update the quantity on the requested date at
     * midnight in the customer's timezone.
     *
     * In order to change the fixed fee quantity as of the next draft invoice for this subscription,
     * pass `change_option=upcoming_invoice` without an `effective_date` specified.
     *
     * If the fee is an in-advance fixed fee, it will also issue an immediate invoice for the
     * difference for the remainder of the billing period.
     */
    @JvmOverloads
    fun updateFixedFeeQuantity(
        params: SubscriptionUpdateFixedFeeQuantityParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Subscription>
}
