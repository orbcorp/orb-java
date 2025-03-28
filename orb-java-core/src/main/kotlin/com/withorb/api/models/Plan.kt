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

/**
 * The [Plan](/core-concepts#plan-and-price) resource represents a plan that can be subscribed to by
 * a customer. Plans define the billing behavior of the subscription. You can see more about how to
 * configure prices in the [Price resource](/reference/price).
 */
class Plan
private constructor(
    private val id: JsonField<String>,
    private val adjustments: JsonField<List<Adjustment>>,
    private val basePlan: JsonField<BasePlan>,
    private val basePlanId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val defaultInvoiceMemo: JsonField<String>,
    private val description: JsonField<String>,
    private val discount: JsonField<Discount>,
    private val externalPlanId: JsonField<String>,
    private val invoicingCurrency: JsonField<String>,
    private val maximum: JsonField<Maximum>,
    private val maximumAmount: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val minimum: JsonField<Minimum>,
    private val minimumAmount: JsonField<String>,
    private val name: JsonField<String>,
    private val netTerms: JsonField<Long>,
    private val planPhases: JsonField<List<PlanPhase>>,
    private val prices: JsonField<List<Price>>,
    private val product: JsonField<Product>,
    private val status: JsonField<Status>,
    private val trialConfig: JsonField<TrialConfig>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("adjustments")
        @ExcludeMissing
        adjustments: JsonField<List<Adjustment>> = JsonMissing.of(),
        @JsonProperty("base_plan") @ExcludeMissing basePlan: JsonField<BasePlan> = JsonMissing.of(),
        @JsonProperty("base_plan_id")
        @ExcludeMissing
        basePlanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_invoice_memo")
        @ExcludeMissing
        defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount") @ExcludeMissing discount: JsonField<Discount> = JsonMissing.of(),
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        externalPlanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoicing_currency")
        @ExcludeMissing
        invoicingCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maximum") @ExcludeMissing maximum: JsonField<Maximum> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("minimum") @ExcludeMissing minimum: JsonField<Minimum> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_terms") @ExcludeMissing netTerms: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("plan_phases")
        @ExcludeMissing
        planPhases: JsonField<List<PlanPhase>> = JsonMissing.of(),
        @JsonProperty("prices") @ExcludeMissing prices: JsonField<List<Price>> = JsonMissing.of(),
        @JsonProperty("product") @ExcludeMissing product: JsonField<Product> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("trial_config")
        @ExcludeMissing
        trialConfig: JsonField<TrialConfig> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        adjustments,
        basePlan,
        basePlanId,
        createdAt,
        currency,
        defaultInvoiceMemo,
        description,
        discount,
        externalPlanId,
        invoicingCurrency,
        maximum,
        maximumAmount,
        metadata,
        minimum,
        minimumAmount,
        name,
        netTerms,
        planPhases,
        prices,
        product,
        status,
        trialConfig,
        version,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Adjustments for this plan. If the plan has phases, this includes adjustments across all
     * phases of the plan.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjustments(): List<Adjustment> = adjustments.getRequired("adjustments")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun basePlan(): Optional<BasePlan> = Optional.ofNullable(basePlan.getNullable("base_plan"))

    /**
     * The parent plan id if the given plan was created by overriding one or more of the parent's
     * prices
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun basePlanId(): Optional<String> = Optional.ofNullable(basePlanId.getNullable("base_plan_id"))

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * An ISO 4217 currency string or custom pricing unit (`credits`) for this plan's prices.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun currency(): String = currency.getRequired("currency")

    /**
     * The default memo text on the invoices corresponding to subscriptions on this plan. Note that
     * each subscription may configure its own memo.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun defaultInvoiceMemo(): Optional<String> =
        Optional.ofNullable(defaultInvoiceMemo.getNullable("default_invoice_memo"))

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun discount(): Optional<Discount> = Optional.ofNullable(discount.getNullable("discount"))

    /**
     * An optional user-defined ID for this plan resource, used throughout the system as an alias
     * for this Plan. Use this field to identify a plan by an existing identifier in your system.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalPlanId(): Optional<String> =
        Optional.ofNullable(externalPlanId.getNullable("external_plan_id"))

    /**
     * An ISO 4217 currency string for which this plan is billed in. Matches `currency` unless
     * `currency` is a custom pricing unit.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoicingCurrency(): String = invoicingCurrency.getRequired("invoicing_currency")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun maximum(): Optional<Maximum> = Optional.ofNullable(maximum.getNullable("maximum"))

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun maximumAmount(): Optional<String> =
        Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

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
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun minimum(): Optional<Minimum> = Optional.ofNullable(minimum.getNullable("minimum"))

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun minimumAmount(): Optional<String> =
        Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Determines the difference between the invoice issue date and the due date. A value of "0"
     * here signifies that invoices are due on issue, whereas a value of "30" means that the
     * customer has a month to pay the invoice before its overdue. Note that individual
     * subscriptions or invoices may set a different net terms configuration.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun netTerms(): Optional<Long> = Optional.ofNullable(netTerms.getNullable("net_terms"))

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun planPhases(): Optional<List<PlanPhase>> =
        Optional.ofNullable(planPhases.getNullable("plan_phases"))

    /**
     * Prices for this plan. If the plan has phases, this includes prices across all phases of the
     * plan.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prices(): List<Price> = prices.getRequired("prices")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun product(): Product = product.getRequired("product")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trialConfig(): TrialConfig = trialConfig.getRequired("trial_config")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [adjustments].
     *
     * Unlike [adjustments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("adjustments")
    @ExcludeMissing
    fun _adjustments(): JsonField<List<Adjustment>> = adjustments

    /**
     * Returns the raw JSON value of [basePlan].
     *
     * Unlike [basePlan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base_plan") @ExcludeMissing fun _basePlan(): JsonField<BasePlan> = basePlan

    /**
     * Returns the raw JSON value of [basePlanId].
     *
     * Unlike [basePlanId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base_plan_id") @ExcludeMissing fun _basePlanId(): JsonField<String> = basePlanId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("currency")
    @ExcludeMissing
    fun _currency(): JsonField<String> = currency

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [discount].
     *
     * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

    /**
     * Returns the raw JSON value of [externalPlanId].
     *
     * Unlike [externalPlanId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_plan_id")
    @ExcludeMissing
    fun _externalPlanId(): JsonField<String> = externalPlanId

    /**
     * Returns the raw JSON value of [invoicingCurrency].
     *
     * Unlike [invoicingCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("invoicing_currency")
    @ExcludeMissing
    fun _invoicingCurrency(): JsonField<String> = invoicingCurrency

    /**
     * Returns the raw JSON value of [maximum].
     *
     * Unlike [maximum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maximum") @ExcludeMissing fun _maximum(): JsonField<Maximum> = maximum

    /**
     * Returns the raw JSON value of [maximumAmount].
     *
     * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [minimum].
     *
     * Unlike [minimum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<Minimum> = minimum

    /**
     * Returns the raw JSON value of [minimumAmount].
     *
     * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [netTerms].
     *
     * Unlike [netTerms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

    /**
     * Returns the raw JSON value of [planPhases].
     *
     * Unlike [planPhases], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan_phases")
    @ExcludeMissing
    fun _planPhases(): JsonField<List<PlanPhase>> = planPhases

    /**
     * Returns the raw JSON value of [prices].
     *
     * Unlike [prices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prices") @ExcludeMissing fun _prices(): JsonField<List<Price>> = prices

    /**
     * Returns the raw JSON value of [product].
     *
     * Unlike [product], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [trialConfig].
     *
     * Unlike [trialConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_config")
    @ExcludeMissing
    fun _trialConfig(): JsonField<TrialConfig> = trialConfig

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

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
         * Returns a mutable builder for constructing an instance of [Plan].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .adjustments()
         * .basePlan()
         * .basePlanId()
         * .createdAt()
         * .currency()
         * .defaultInvoiceMemo()
         * .description()
         * .discount()
         * .externalPlanId()
         * .invoicingCurrency()
         * .maximum()
         * .maximumAmount()
         * .metadata()
         * .minimum()
         * .minimumAmount()
         * .name()
         * .netTerms()
         * .planPhases()
         * .prices()
         * .product()
         * .status()
         * .trialConfig()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Plan]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var adjustments: JsonField<MutableList<Adjustment>>? = null
        private var basePlan: JsonField<BasePlan>? = null
        private var basePlanId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var defaultInvoiceMemo: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var discount: JsonField<Discount>? = null
        private var externalPlanId: JsonField<String>? = null
        private var invoicingCurrency: JsonField<String>? = null
        private var maximum: JsonField<Maximum>? = null
        private var maximumAmount: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var minimum: JsonField<Minimum>? = null
        private var minimumAmount: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var netTerms: JsonField<Long>? = null
        private var planPhases: JsonField<MutableList<PlanPhase>>? = null
        private var prices: JsonField<MutableList<Price>>? = null
        private var product: JsonField<Product>? = null
        private var status: JsonField<Status>? = null
        private var trialConfig: JsonField<TrialConfig>? = null
        private var version: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(plan: Plan) = apply {
            id = plan.id
            adjustments = plan.adjustments.map { it.toMutableList() }
            basePlan = plan.basePlan
            basePlanId = plan.basePlanId
            createdAt = plan.createdAt
            currency = plan.currency
            defaultInvoiceMemo = plan.defaultInvoiceMemo
            description = plan.description
            discount = plan.discount
            externalPlanId = plan.externalPlanId
            invoicingCurrency = plan.invoicingCurrency
            maximum = plan.maximum
            maximumAmount = plan.maximumAmount
            metadata = plan.metadata
            minimum = plan.minimum
            minimumAmount = plan.minimumAmount
            name = plan.name
            netTerms = plan.netTerms
            planPhases = plan.planPhases.map { it.toMutableList() }
            prices = plan.prices.map { it.toMutableList() }
            product = plan.product
            status = plan.status
            trialConfig = plan.trialConfig
            version = plan.version
            additionalProperties = plan.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun adjustments(adjustments: List<Adjustment>) = adjustments(JsonField.of(adjustments))

        /**
         * Sets [Builder.adjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustments] with a well-typed `List<Adjustment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun adjustments(adjustments: JsonField<List<Adjustment>>) = apply {
            this.adjustments = adjustments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Adjustment] to [adjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdjustment(adjustment: Adjustment) = apply {
            adjustments =
                (adjustments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("adjustments", it).add(adjustment)
                }
        }

        /**
         * Alias for calling [addAdjustment] with
         * `Adjustment.ofPlanPhaseUsageDiscount(planPhaseUsageDiscount)`.
         */
        fun addAdjustment(planPhaseUsageDiscount: Adjustment.PlanPhaseUsageDiscountAdjustment) =
            addAdjustment(Adjustment.ofPlanPhaseUsageDiscount(planPhaseUsageDiscount))

        /**
         * Alias for calling [addAdjustment] with
         * `Adjustment.ofPlanPhaseAmountDiscount(planPhaseAmountDiscount)`.
         */
        fun addAdjustment(planPhaseAmountDiscount: Adjustment.PlanPhaseAmountDiscountAdjustment) =
            addAdjustment(Adjustment.ofPlanPhaseAmountDiscount(planPhaseAmountDiscount))

        /**
         * Alias for calling [addAdjustment] with
         * `Adjustment.ofPlanPhasePercentageDiscount(planPhasePercentageDiscount)`.
         */
        fun addAdjustment(
            planPhasePercentageDiscount: Adjustment.PlanPhasePercentageDiscountAdjustment
        ) = addAdjustment(Adjustment.ofPlanPhasePercentageDiscount(planPhasePercentageDiscount))

        /**
         * Alias for calling [addAdjustment] with `Adjustment.ofPlanPhaseMinimum(planPhaseMinimum)`.
         */
        fun addAdjustment(planPhaseMinimum: Adjustment.PlanPhaseMinimumAdjustment) =
            addAdjustment(Adjustment.ofPlanPhaseMinimum(planPhaseMinimum))

        /**
         * Alias for calling [addAdjustment] with `Adjustment.ofPlanPhaseMaximum(planPhaseMaximum)`.
         */
        fun addAdjustment(planPhaseMaximum: Adjustment.PlanPhaseMaximumAdjustment) =
            addAdjustment(Adjustment.ofPlanPhaseMaximum(planPhaseMaximum))

        fun basePlan(basePlan: BasePlan?) = basePlan(JsonField.ofNullable(basePlan))

        /** Alias for calling [Builder.basePlan] with `basePlan.orElse(null)`. */
        fun basePlan(basePlan: Optional<BasePlan>) = basePlan(basePlan.getOrNull())

        /**
         * Sets [Builder.basePlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.basePlan] with a well-typed [BasePlan] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun basePlan(basePlan: JsonField<BasePlan>) = apply { this.basePlan = basePlan }

        /**
         * The parent plan id if the given plan was created by overriding one or more of the
         * parent's prices
         */
        fun basePlanId(basePlanId: String?) = basePlanId(JsonField.ofNullable(basePlanId))

        /** Alias for calling [Builder.basePlanId] with `basePlanId.orElse(null)`. */
        fun basePlanId(basePlanId: Optional<String>) = basePlanId(basePlanId.getOrNull())

        /**
         * Sets [Builder.basePlanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.basePlanId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun basePlanId(basePlanId: JsonField<String>) = apply { this.basePlanId = basePlanId }

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
         * An ISO 4217 currency string or custom pricing unit (`credits`) for this plan's prices.
         */
        @Deprecated("deprecated") fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * The default memo text on the invoices corresponding to subscriptions on this plan. Note
         * that each subscription may configure its own memo.
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

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun discount(discount: Discount?) = discount(JsonField.ofNullable(discount))

        /** Alias for calling [Builder.discount] with `discount.orElse(null)`. */
        fun discount(discount: Optional<Discount>) = discount(discount.getOrNull())

        /**
         * Sets [Builder.discount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discount] with a well-typed [Discount] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

        /** Alias for calling [discount] with `Discount.ofPercentage(percentage)`. */
        fun discount(percentage: PercentageDiscount) = discount(Discount.ofPercentage(percentage))

        /** Alias for calling [discount] with `Discount.ofTrial(trial)`. */
        fun discount(trial: TrialDiscount) = discount(Discount.ofTrial(trial))

        /**
         * Alias for calling [discount] with the following:
         * ```java
         * TrialDiscount.builder()
         *     .discountType(TrialDiscount.DiscountType.TRIAL)
         *     .appliesToPriceIds(appliesToPriceIds)
         *     .build()
         * ```
         */
        fun trialDiscount(appliesToPriceIds: List<String>) =
            discount(
                TrialDiscount.builder()
                    .discountType(TrialDiscount.DiscountType.TRIAL)
                    .appliesToPriceIds(appliesToPriceIds)
                    .build()
            )

        /** Alias for calling [discount] with `Discount.ofUsage(usage)`. */
        fun discount(usage: UsageDiscount) = discount(Discount.ofUsage(usage))

        /** Alias for calling [discount] with `Discount.ofAmount(amount)`. */
        fun discount(amount: AmountDiscount) = discount(Discount.ofAmount(amount))

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
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
         * An ISO 4217 currency string for which this plan is billed in. Matches `currency` unless
         * `currency` is a custom pricing unit.
         */
        fun invoicingCurrency(invoicingCurrency: String) =
            invoicingCurrency(JsonField.of(invoicingCurrency))

        /**
         * Sets [Builder.invoicingCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoicingCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoicingCurrency(invoicingCurrency: JsonField<String>) = apply {
            this.invoicingCurrency = invoicingCurrency
        }

        fun maximum(maximum: Maximum?) = maximum(JsonField.ofNullable(maximum))

        /** Alias for calling [Builder.maximum] with `maximum.orElse(null)`. */
        fun maximum(maximum: Optional<Maximum>) = maximum(maximum.getOrNull())

        /**
         * Sets [Builder.maximum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximum] with a well-typed [Maximum] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

        fun maximumAmount(maximumAmount: String?) =
            maximumAmount(JsonField.ofNullable(maximumAmount))

        /** Alias for calling [Builder.maximumAmount] with `maximumAmount.orElse(null)`. */
        fun maximumAmount(maximumAmount: Optional<String>) =
            maximumAmount(maximumAmount.getOrNull())

        /**
         * Sets [Builder.maximumAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
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

        fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

        /** Alias for calling [Builder.minimum] with `minimum.orElse(null)`. */
        fun minimum(minimum: Optional<Minimum>) = minimum(minimum.getOrNull())

        /**
         * Sets [Builder.minimum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimum] with a well-typed [Minimum] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

        fun minimumAmount(minimumAmount: String?) =
            minimumAmount(JsonField.ofNullable(minimumAmount))

        /** Alias for calling [Builder.minimumAmount] with `minimumAmount.orElse(null)`. */
        fun minimumAmount(minimumAmount: Optional<String>) =
            minimumAmount(minimumAmount.getOrNull())

        /**
         * Sets [Builder.minimumAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimumAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Determines the difference between the invoice issue date and the due date. A value of "0"
         * here signifies that invoices are due on issue, whereas a value of "30" means that the
         * customer has a month to pay the invoice before its overdue. Note that individual
         * subscriptions or invoices may set a different net terms configuration.
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
         * You should usually call [Builder.netTerms] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

        fun planPhases(planPhases: List<PlanPhase>?) = planPhases(JsonField.ofNullable(planPhases))

        /** Alias for calling [Builder.planPhases] with `planPhases.orElse(null)`. */
        fun planPhases(planPhases: Optional<List<PlanPhase>>) = planPhases(planPhases.getOrNull())

        /**
         * Sets [Builder.planPhases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planPhases] with a well-typed `List<PlanPhase>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planPhases(planPhases: JsonField<List<PlanPhase>>) = apply {
            this.planPhases = planPhases.map { it.toMutableList() }
        }

        /**
         * Adds a single [PlanPhase] to [planPhases].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPlanPhase(planPhase: PlanPhase) = apply {
            planPhases =
                (planPhases ?: JsonField.of(mutableListOf())).also {
                    checkKnown("planPhases", it).add(planPhase)
                }
        }

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun prices(prices: List<Price>) = prices(JsonField.of(prices))

        /**
         * Sets [Builder.prices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prices] with a well-typed `List<Price>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prices(prices: JsonField<List<Price>>) = apply {
            this.prices = prices.map { it.toMutableList() }
        }

        /**
         * Adds a single [Price] to [prices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrice(price: Price) = apply {
            prices =
                (prices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("prices", it).add(price)
                }
        }

        /** Alias for calling [addPrice] with `Price.ofUnit(unit)`. */
        fun addPrice(unit: Price.UnitPrice) = addPrice(Price.ofUnit(unit))

        /** Alias for calling [addPrice] with `Price.ofPackagePrice(packagePrice)`. */
        fun addPrice(packagePrice: Price.PackagePrice) =
            addPrice(Price.ofPackagePrice(packagePrice))

        /** Alias for calling [addPrice] with `Price.ofMatrix(matrix)`. */
        fun addPrice(matrix: Price.MatrixPrice) = addPrice(Price.ofMatrix(matrix))

        /** Alias for calling [addPrice] with `Price.ofTiered(tiered)`. */
        fun addPrice(tiered: Price.TieredPrice) = addPrice(Price.ofTiered(tiered))

        /** Alias for calling [addPrice] with `Price.ofTieredBps(tieredBps)`. */
        fun addPrice(tieredBps: Price.TieredBpsPrice) = addPrice(Price.ofTieredBps(tieredBps))

        /** Alias for calling [addPrice] with `Price.ofBps(bps)`. */
        fun addPrice(bps: Price.BpsPrice) = addPrice(Price.ofBps(bps))

        /** Alias for calling [addPrice] with `Price.ofBulkBps(bulkBps)`. */
        fun addPrice(bulkBps: Price.BulkBpsPrice) = addPrice(Price.ofBulkBps(bulkBps))

        /** Alias for calling [addPrice] with `Price.ofBulk(bulk)`. */
        fun addPrice(bulk: Price.BulkPrice) = addPrice(Price.ofBulk(bulk))

        /**
         * Alias for calling [addPrice] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
         */
        fun addPrice(thresholdTotalAmount: Price.ThresholdTotalAmountPrice) =
            addPrice(Price.ofThresholdTotalAmount(thresholdTotalAmount))

        /** Alias for calling [addPrice] with `Price.ofTieredPackage(tieredPackage)`. */
        fun addPrice(tieredPackage: Price.TieredPackagePrice) =
            addPrice(Price.ofTieredPackage(tieredPackage))

        /** Alias for calling [addPrice] with `Price.ofGroupedTiered(groupedTiered)`. */
        fun addPrice(groupedTiered: Price.GroupedTieredPrice) =
            addPrice(Price.ofGroupedTiered(groupedTiered))

        /** Alias for calling [addPrice] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
        fun addPrice(tieredWithMinimum: Price.TieredWithMinimumPrice) =
            addPrice(Price.ofTieredWithMinimum(tieredWithMinimum))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
         */
        fun addPrice(tieredPackageWithMinimum: Price.TieredPackageWithMinimumPrice) =
            addPrice(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

        /**
         * Alias for calling [addPrice] with `Price.ofPackageWithAllocation(packageWithAllocation)`.
         */
        fun addPrice(packageWithAllocation: Price.PackageWithAllocationPrice) =
            addPrice(Price.ofPackageWithAllocation(packageWithAllocation))

        /** Alias for calling [addPrice] with `Price.ofUnitWithPercent(unitWithPercent)`. */
        fun addPrice(unitWithPercent: Price.UnitWithPercentPrice) =
            addPrice(Price.ofUnitWithPercent(unitWithPercent))

        /**
         * Alias for calling [addPrice] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
         */
        fun addPrice(matrixWithAllocation: Price.MatrixWithAllocationPrice) =
            addPrice(Price.ofMatrixWithAllocation(matrixWithAllocation))

        /** Alias for calling [addPrice] with `Price.ofTieredWithProration(tieredWithProration)`. */
        fun addPrice(tieredWithProration: Price.TieredWithProrationPrice) =
            addPrice(Price.ofTieredWithProration(tieredWithProration))

        /** Alias for calling [addPrice] with `Price.ofUnitWithProration(unitWithProration)`. */
        fun addPrice(unitWithProration: Price.UnitWithProrationPrice) =
            addPrice(Price.ofUnitWithProration(unitWithProration))

        /** Alias for calling [addPrice] with `Price.ofGroupedAllocation(groupedAllocation)`. */
        fun addPrice(groupedAllocation: Price.GroupedAllocationPrice) =
            addPrice(Price.ofGroupedAllocation(groupedAllocation))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
         */
        fun addPrice(groupedWithProratedMinimum: Price.GroupedWithProratedMinimumPrice) =
            addPrice(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
         */
        fun addPrice(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimumPrice) =
            addPrice(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

        /**
         * Alias for calling [addPrice] with `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
         */
        fun addPrice(matrixWithDisplayName: Price.MatrixWithDisplayNamePrice) =
            addPrice(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

        /** Alias for calling [addPrice] with `Price.ofBulkWithProration(bulkWithProration)`. */
        fun addPrice(bulkWithProration: Price.BulkWithProrationPrice) =
            addPrice(Price.ofBulkWithProration(bulkWithProration))

        /**
         * Alias for calling [addPrice] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
         */
        fun addPrice(groupedTieredPackage: Price.GroupedTieredPackagePrice) =
            addPrice(Price.ofGroupedTieredPackage(groupedTieredPackage))

        /**
         * Alias for calling [addPrice] with `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
         */
        fun addPrice(maxGroupTieredPackage: Price.MaxGroupTieredPackagePrice) =
            addPrice(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
         */
        fun addPrice(scalableMatrixWithUnitPricing: Price.ScalableMatrixWithUnitPricingPrice) =
            addPrice(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
         */
        fun addPrice(scalableMatrixWithTieredPricing: Price.ScalableMatrixWithTieredPricingPrice) =
            addPrice(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

        /**
         * Alias for calling [addPrice] with `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
         */
        fun addPrice(cumulativeGroupedBulk: Price.CumulativeGroupedBulkPrice) =
            addPrice(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

        fun product(product: Product) = product(JsonField.of(product))

        /**
         * Sets [Builder.product] to an arbitrary JSON value.
         *
         * You should usually call [Builder.product] with a well-typed [Product] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun product(product: JsonField<Product>) = apply { this.product = product }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun trialConfig(trialConfig: TrialConfig) = trialConfig(JsonField.of(trialConfig))

        /**
         * Sets [Builder.trialConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialConfig] with a well-typed [TrialConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trialConfig(trialConfig: JsonField<TrialConfig>) = apply {
            this.trialConfig = trialConfig
        }

        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

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
         * Returns an immutable instance of [Plan].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .adjustments()
         * .basePlan()
         * .basePlanId()
         * .createdAt()
         * .currency()
         * .defaultInvoiceMemo()
         * .description()
         * .discount()
         * .externalPlanId()
         * .invoicingCurrency()
         * .maximum()
         * .maximumAmount()
         * .metadata()
         * .minimum()
         * .minimumAmount()
         * .name()
         * .netTerms()
         * .planPhases()
         * .prices()
         * .product()
         * .status()
         * .trialConfig()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Plan =
            Plan(
                checkRequired("id", id),
                checkRequired("adjustments", adjustments).map { it.toImmutable() },
                checkRequired("basePlan", basePlan),
                checkRequired("basePlanId", basePlanId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("defaultInvoiceMemo", defaultInvoiceMemo),
                checkRequired("description", description),
                checkRequired("discount", discount),
                checkRequired("externalPlanId", externalPlanId),
                checkRequired("invoicingCurrency", invoicingCurrency),
                checkRequired("maximum", maximum),
                checkRequired("maximumAmount", maximumAmount),
                checkRequired("metadata", metadata),
                checkRequired("minimum", minimum),
                checkRequired("minimumAmount", minimumAmount),
                checkRequired("name", name),
                checkRequired("netTerms", netTerms),
                checkRequired("planPhases", planPhases).map { it.toImmutable() },
                checkRequired("prices", prices).map { it.toImmutable() },
                checkRequired("product", product),
                checkRequired("status", status),
                checkRequired("trialConfig", trialConfig),
                checkRequired("version", version),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Plan = apply {
        if (validated) {
            return@apply
        }

        id()
        adjustments().forEach { it.validate() }
        basePlan().ifPresent { it.validate() }
        basePlanId()
        createdAt()
        currency()
        defaultInvoiceMemo()
        description()
        discount().ifPresent { it.validate() }
        externalPlanId()
        invoicingCurrency()
        maximum().ifPresent { it.validate() }
        maximumAmount()
        metadata().validate()
        minimum().ifPresent { it.validate() }
        minimumAmount()
        name()
        netTerms()
        planPhases().ifPresent { it.forEach { it.validate() } }
        prices().forEach { it.validate() }
        product().validate()
        status()
        trialConfig().validate()
        version()
        validated = true
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
            fun ofPlanPhaseUsageDiscount(planPhaseUsageDiscount: PlanPhaseUsageDiscountAdjustment) =
                Adjustment(planPhaseUsageDiscount = planPhaseUsageDiscount)

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
         * An interface that defines how to map each variant of [Adjustment] to a value of type [T].
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
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
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
                        return Adjustment(
                            planPhaseUsageDiscount =
                                deserialize(
                                    node,
                                    jacksonTypeRef<PlanPhaseUsageDiscountAdjustment>(),
                                ),
                            _json = json,
                        )
                    }
                    "amount_discount" -> {
                        return Adjustment(
                            planPhaseAmountDiscount =
                                deserialize(
                                    node,
                                    jacksonTypeRef<PlanPhaseAmountDiscountAdjustment>(),
                                ),
                            _json = json,
                        )
                    }
                    "percentage_discount" -> {
                        return Adjustment(
                            planPhasePercentageDiscount =
                                deserialize(
                                    node,
                                    jacksonTypeRef<PlanPhasePercentageDiscountAdjustment>(),
                                ),
                            _json = json,
                        )
                    }
                    "minimum" -> {
                        return Adjustment(
                            planPhaseMinimum =
                                deserialize(node, jacksonTypeRef<PlanPhaseMinimumAdjustment>()),
                            _json = json,
                        )
                    }
                    "maximum" -> {
                        return Adjustment(
                            planPhaseMaximum =
                                deserialize(node, jacksonTypeRef<PlanPhaseMaximumAdjustment>()),
                            _json = json,
                        )
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
                    value.planPhaseMinimum != null -> generator.writeObject(value.planPhaseMinimum)
                    value.planPhaseMaximum != null -> generator.writeObject(value.planPhaseMaximum)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Adjustment")
                }
            }
        }

        class PlanPhaseUsageDiscountAdjustment
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonField<AdjustmentType>,
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
                adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
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
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

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
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun planPhaseOrder(): Optional<Long> =
                Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

            /**
             * The number of usage units by which to discount the price this adjustment applies to
             * in a given billing period.
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
             * Returns the raw JSON value of [adjustmentType].
             *
             * Unlike [adjustmentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

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
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
                 * Returns a mutable builder for constructing an instance of
                 * [PlanPhaseUsageDiscountAdjustment].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .adjustmentType()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .planPhaseOrder()
                 * .reason()
                 * .usageDiscount()
                 * ```
                 */
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

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                /**
                 * Sets [Builder.adjustmentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.adjustmentType] with a well-typed
                 * [AdjustmentType] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The price IDs that this adjustment applies to. */
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

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

                /**
                 * Alias for calling [Builder.planPhaseOrder] with `planPhaseOrder.orElse(null)`.
                 */
                fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                    planPhaseOrder(planPhaseOrder.getOrNull())

                /**
                 * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
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
                 * Returns an immutable instance of [PlanPhaseUsageDiscountAdjustment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .adjustmentType()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .planPhaseOrder()
                 * .reason()
                 * .usageDiscount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
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
                        additionalProperties.toMutableMap(),
                    )
            }

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

            class AdjustmentType
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        USAGE_DISCOUNT -> Value.USAGE_DISCOUNT
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
                        USAGE_DISCOUNT -> Known.USAGE_DISCOUNT
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

        class PlanPhaseAmountDiscountAdjustment
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonField<AdjustmentType>,
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
                adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
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
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
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
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

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
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun planPhaseOrder(): Optional<Long> =
                Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [adjustmentType].
             *
             * Unlike [adjustmentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

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
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
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
                 * [PlanPhaseAmountDiscountAdjustment].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .adjustmentType()
                 * .amountDiscount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 */
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

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                /**
                 * Sets [Builder.adjustmentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.adjustmentType] with a well-typed
                 * [AdjustmentType] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
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

                /** The price IDs that this adjustment applies to. */
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

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

                /**
                 * Alias for calling [Builder.planPhaseOrder] with `planPhaseOrder.orElse(null)`.
                 */
                fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                    planPhaseOrder(planPhaseOrder.getOrNull())

                /**
                 * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [PlanPhaseAmountDiscountAdjustment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .adjustmentType()
                 * .amountDiscount()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
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
                        additionalProperties.toMutableMap(),
                    )
            }

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

            class AdjustmentType
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AMOUNT_DISCOUNT -> Value.AMOUNT_DISCOUNT
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
                        AMOUNT_DISCOUNT -> Known.AMOUNT_DISCOUNT
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

        class PlanPhasePercentageDiscountAdjustment
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonField<AdjustmentType>,
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
                adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
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
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
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
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

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
             * The percentage (as a value between 0 and 1) by which to discount the price intervals
             * this adjustment applies to in a given billing period.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            /**
             * The plan phase in which this adjustment is active.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun planPhaseOrder(): Optional<Long> =
                Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [adjustmentType].
             *
             * Unlike [adjustmentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

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
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
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
                 * [PlanPhasePercentageDiscountAdjustment].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .adjustmentType()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .percentageDiscount()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 */
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
                    percentageDiscount = planPhasePercentageDiscountAdjustment.percentageDiscount
                    planPhaseOrder = planPhasePercentageDiscountAdjustment.planPhaseOrder
                    reason = planPhasePercentageDiscountAdjustment.reason
                    additionalProperties =
                        planPhasePercentageDiscountAdjustment.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                /**
                 * Sets [Builder.adjustmentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.adjustmentType] with a well-typed
                 * [AdjustmentType] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The price IDs that this adjustment applies to. */
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

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.percentageDiscount] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

                /**
                 * Alias for calling [Builder.planPhaseOrder] with `planPhaseOrder.orElse(null)`.
                 */
                fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                    planPhaseOrder(planPhaseOrder.getOrNull())

                /**
                 * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [PlanPhasePercentageDiscountAdjustment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .adjustmentType()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .percentageDiscount()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
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
                        additionalProperties.toMutableMap(),
                    )
            }

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

            class AdjustmentType
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PERCENTAGE_DISCOUNT -> Value.PERCENTAGE_DISCOUNT
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
                        PERCENTAGE_DISCOUNT -> Known.PERCENTAGE_DISCOUNT
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

        class PlanPhaseMinimumAdjustment
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonField<AdjustmentType>,
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
                adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
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
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
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
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

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
             * The minimum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * The plan phase in which this adjustment is active.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun planPhaseOrder(): Optional<Long> =
                Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [adjustmentType].
             *
             * Unlike [adjustmentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

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
             * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

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
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
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
                 * [PlanPhaseMinimumAdjustment].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .adjustmentType()
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
                internal fun from(planPhaseMinimumAdjustment: PlanPhaseMinimumAdjustment) = apply {
                    id = planPhaseMinimumAdjustment.id
                    adjustmentType = planPhaseMinimumAdjustment.adjustmentType
                    appliesToPriceIds =
                        planPhaseMinimumAdjustment.appliesToPriceIds.map { it.toMutableList() }
                    isInvoiceLevel = planPhaseMinimumAdjustment.isInvoiceLevel
                    itemId = planPhaseMinimumAdjustment.itemId
                    minimumAmount = planPhaseMinimumAdjustment.minimumAmount
                    planPhaseOrder = planPhaseMinimumAdjustment.planPhaseOrder
                    reason = planPhaseMinimumAdjustment.reason
                    additionalProperties =
                        planPhaseMinimumAdjustment.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                /**
                 * Sets [Builder.adjustmentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.adjustmentType] with a well-typed
                 * [AdjustmentType] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The price IDs that this adjustment applies to. */
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

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.minimumAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

                /**
                 * Alias for calling [Builder.planPhaseOrder] with `planPhaseOrder.orElse(null)`.
                 */
                fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                    planPhaseOrder(planPhaseOrder.getOrNull())

                /**
                 * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [PlanPhaseMinimumAdjustment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .adjustmentType()
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
                        additionalProperties.toMutableMap(),
                    )
            }

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

            class AdjustmentType
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MINIMUM -> Value.MINIMUM
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
                        MINIMUM -> Known.MINIMUM
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

        class PlanPhaseMaximumAdjustment
        private constructor(
            private val id: JsonField<String>,
            private val adjustmentType: JsonField<AdjustmentType>,
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
                adjustmentType: JsonField<AdjustmentType> = JsonMissing.of(),
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
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
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
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun adjustmentType(): AdjustmentType = adjustmentType.getRequired("adjustment_type")

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
             * The maximum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * The plan phase in which this adjustment is active.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun planPhaseOrder(): Optional<Long> =
                Optional.ofNullable(planPhaseOrder.getNullable("plan_phase_order"))

            /**
             * The reason for the adjustment.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [adjustmentType].
             *
             * Unlike [adjustmentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("adjustment_type")
            @ExcludeMissing
            fun _adjustmentType(): JsonField<AdjustmentType> = adjustmentType

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
             * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
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
                 * [PlanPhaseMaximumAdjustment].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .adjustmentType()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .maximumAmount()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 */
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
                internal fun from(planPhaseMaximumAdjustment: PlanPhaseMaximumAdjustment) = apply {
                    id = planPhaseMaximumAdjustment.id
                    adjustmentType = planPhaseMaximumAdjustment.adjustmentType
                    appliesToPriceIds =
                        planPhaseMaximumAdjustment.appliesToPriceIds.map { it.toMutableList() }
                    isInvoiceLevel = planPhaseMaximumAdjustment.isInvoiceLevel
                    maximumAmount = planPhaseMaximumAdjustment.maximumAmount
                    planPhaseOrder = planPhaseMaximumAdjustment.planPhaseOrder
                    reason = planPhaseMaximumAdjustment.reason
                    additionalProperties =
                        planPhaseMaximumAdjustment.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun adjustmentType(adjustmentType: AdjustmentType) =
                    adjustmentType(JsonField.of(adjustmentType))

                /**
                 * Sets [Builder.adjustmentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.adjustmentType] with a well-typed
                 * [AdjustmentType] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun adjustmentType(adjustmentType: JsonField<AdjustmentType>) = apply {
                    this.adjustmentType = adjustmentType
                }

                /** The price IDs that this adjustment applies to. */
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

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * Sets [Builder.isInvoiceLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isInvoiceLevel] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.maximumAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                fun planPhaseOrder(planPhaseOrder: Long) = planPhaseOrder(planPhaseOrder as Long?)

                /**
                 * Alias for calling [Builder.planPhaseOrder] with `planPhaseOrder.orElse(null)`.
                 */
                fun planPhaseOrder(planPhaseOrder: Optional<Long>) =
                    planPhaseOrder(planPhaseOrder.getOrNull())

                /**
                 * Sets [Builder.planPhaseOrder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.planPhaseOrder] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [PlanPhaseMaximumAdjustment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .adjustmentType()
                 * .appliesToPriceIds()
                 * .isInvoiceLevel()
                 * .maximumAmount()
                 * .planPhaseOrder()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
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
                        additionalProperties.toMutableMap(),
                    )
            }

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

            class AdjustmentType
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MAXIMUM -> Value.MAXIMUM
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
                        MAXIMUM -> Known.MAXIMUM
                        else -> throw OrbInvalidDataException("Unknown AdjustmentType: $value")
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

    class BasePlan
    private constructor(
        private val id: JsonField<String>,
        private val externalPlanId: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_plan_id")
            @ExcludeMissing
            externalPlanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(id, externalPlanId, name, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPlanId(): Optional<String> =
            Optional.ofNullable(externalPlanId.getNullable("external_plan_id"))

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [BasePlan].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .externalPlanId()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BasePlan]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var externalPlanId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(basePlan: BasePlan) = apply {
                id = basePlan.id
                externalPlanId = basePlan.externalPlanId
                name = basePlan.name
                additionalProperties = basePlan.additionalProperties.toMutableMap()
            }

            fun id(id: String?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<String>) = id(id.getOrNull())

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * An optional user-defined ID for this plan resource, used throughout the system as an
             * alias for this Plan. Use this field to identify a plan by an existing identifier in
             * your system.
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

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [BasePlan].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .externalPlanId()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BasePlan =
                BasePlan(
                    checkRequired("id", id),
                    checkRequired("externalPlanId", externalPlanId),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BasePlan = apply {
            if (validated) {
                return@apply
            }

            id()
            externalPlanId()
            name()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BasePlan && id == other.id && externalPlanId == other.externalPlanId && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, externalPlanId, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BasePlan{id=$id, externalPlanId=$externalPlanId, name=$name, additionalProperties=$additionalProperties}"
    }

    class Maximum
    private constructor(
        private val appliesToPriceIds: JsonField<List<String>>,
        private val maximumAmount: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            maximumAmount: JsonField<String> = JsonMissing.of(),
        ) : this(appliesToPriceIds, maximumAmount, mutableMapOf())

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * Maximum amount applied
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

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
         * Returns the raw JSON value of [maximumAmount].
         *
         * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<String> = maximumAmount

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
             * .appliesToPriceIds()
             * .maximumAmount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Maximum]. */
        class Builder internal constructor() {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var maximumAmount: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(maximum: Maximum) = apply {
                appliesToPriceIds = maximum.appliesToPriceIds.map { it.toMutableList() }
                maximumAmount = maximum.maximumAmount
                additionalProperties = maximum.additionalProperties.toMutableMap()
            }

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
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

            /** Maximum amount applied */
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
             * Returns an immutable instance of [Maximum].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .appliesToPriceIds()
             * .maximumAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Maximum =
                Maximum(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("maximumAmount", maximumAmount),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Maximum = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            maximumAmount()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Maximum && appliesToPriceIds == other.appliesToPriceIds && maximumAmount == other.maximumAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, maximumAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Maximum{appliesToPriceIds=$appliesToPriceIds, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"
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

    class Minimum
    private constructor(
        private val appliesToPriceIds: JsonField<List<String>>,
        private val minimumAmount: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            minimumAmount: JsonField<String> = JsonMissing.of(),
        ) : this(appliesToPriceIds, minimumAmount, mutableMapOf())

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /**
         * Minimum amount applied
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

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
         * Returns the raw JSON value of [minimumAmount].
         *
         * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<String> = minimumAmount

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
             * .appliesToPriceIds()
             * .minimumAmount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Minimum]. */
        class Builder internal constructor() {

            private var appliesToPriceIds: JsonField<MutableList<String>>? = null
            private var minimumAmount: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimum: Minimum) = apply {
                appliesToPriceIds = minimum.appliesToPriceIds.map { it.toMutableList() }
                minimumAmount = minimum.minimumAmount
                additionalProperties = minimum.additionalProperties.toMutableMap()
            }

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
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

            /** Minimum amount applied */
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
             * Returns an immutable instance of [Minimum].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .appliesToPriceIds()
             * .minimumAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Minimum =
                Minimum(
                    checkRequired("appliesToPriceIds", appliesToPriceIds).map { it.toImmutable() },
                    checkRequired("minimumAmount", minimumAmount),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Minimum = apply {
            if (validated) {
                return@apply
            }

            appliesToPriceIds()
            minimumAmount()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Minimum && appliesToPriceIds == other.appliesToPriceIds && minimumAmount == other.minimumAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, minimumAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Minimum{appliesToPriceIds=$appliesToPriceIds, minimumAmount=$minimumAmount, additionalProperties=$additionalProperties}"
    }

    class PlanPhase
    private constructor(
        private val id: JsonField<String>,
        private val description: JsonField<String>,
        private val discount: JsonField<Discount>,
        private val duration: JsonField<Long>,
        private val durationUnit: JsonField<DurationUnit>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val name: JsonField<String>,
        private val order: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount")
            @ExcludeMissing
            discount: JsonField<Discount> = JsonMissing.of(),
            @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("duration_unit")
            @ExcludeMissing
            durationUnit: JsonField<DurationUnit> = JsonMissing.of(),
            @JsonProperty("maximum") @ExcludeMissing maximum: JsonField<Maximum> = JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            maximumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("minimum") @ExcludeMissing minimum: JsonField<Minimum> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            minimumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            description,
            discount,
            duration,
            durationUnit,
            maximum,
            maximumAmount,
            minimum,
            minimumAmount,
            name,
            order,
            mutableMapOf(),
        )

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun discount(): Optional<Discount> = Optional.ofNullable(discount.getNullable("discount"))

        /**
         * How many terms of length `duration_unit` this phase is active for. If null, this phase is
         * evergreen and active indefinitely
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Optional<Long> = Optional.ofNullable(duration.getNullable("duration"))

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun durationUnit(): Optional<DurationUnit> =
            Optional.ofNullable(durationUnit.getNullable("duration_unit"))

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximum(): Optional<Maximum> = Optional.ofNullable(maximum.getNullable("maximum"))

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumAmount(): Optional<String> =
            Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimum(): Optional<Minimum> = Optional.ofNullable(minimum.getNullable("minimum"))

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumAmount(): Optional<String> =
            Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Determines the ordering of the phase in a plan's lifecycle. 1 = first phase.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun order(): Long = order.getRequired("order")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [discount].
         *
         * Unlike [discount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount") @ExcludeMissing fun _discount(): JsonField<Discount> = discount

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

        /**
         * Returns the raw JSON value of [durationUnit].
         *
         * Unlike [durationUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("duration_unit")
        @ExcludeMissing
        fun _durationUnit(): JsonField<DurationUnit> = durationUnit

        /**
         * Returns the raw JSON value of [maximum].
         *
         * Unlike [maximum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maximum") @ExcludeMissing fun _maximum(): JsonField<Maximum> = maximum

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
         * Returns the raw JSON value of [minimum].
         *
         * Unlike [minimum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<Minimum> = minimum

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Long> = order

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
             * Returns a mutable builder for constructing an instance of [PlanPhase].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .description()
             * .discount()
             * .duration()
             * .durationUnit()
             * .maximum()
             * .maximumAmount()
             * .minimum()
             * .minimumAmount()
             * .name()
             * .order()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PlanPhase]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var discount: JsonField<Discount>? = null
            private var duration: JsonField<Long>? = null
            private var durationUnit: JsonField<DurationUnit>? = null
            private var maximum: JsonField<Maximum>? = null
            private var maximumAmount: JsonField<String>? = null
            private var minimum: JsonField<Minimum>? = null
            private var minimumAmount: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var order: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(planPhase: PlanPhase) = apply {
                id = planPhase.id
                description = planPhase.description
                discount = planPhase.discount
                duration = planPhase.duration
                durationUnit = planPhase.durationUnit
                maximum = planPhase.maximum
                maximumAmount = planPhase.maximumAmount
                minimum = planPhase.minimum
                minimumAmount = planPhase.minimumAmount
                name = planPhase.name
                order = planPhase.order
                additionalProperties = planPhase.additionalProperties.toMutableMap()
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

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun discount(discount: Discount?) = discount(JsonField.ofNullable(discount))

            /** Alias for calling [Builder.discount] with `discount.orElse(null)`. */
            fun discount(discount: Optional<Discount>) = discount(discount.getOrNull())

            /**
             * Sets [Builder.discount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discount] with a well-typed [Discount] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            /** Alias for calling [discount] with `Discount.ofPercentage(percentage)`. */
            fun discount(percentage: PercentageDiscount) =
                discount(Discount.ofPercentage(percentage))

            /** Alias for calling [discount] with `Discount.ofTrial(trial)`. */
            fun discount(trial: TrialDiscount) = discount(Discount.ofTrial(trial))

            /**
             * Alias for calling [discount] with the following:
             * ```java
             * TrialDiscount.builder()
             *     .discountType(TrialDiscount.DiscountType.TRIAL)
             *     .appliesToPriceIds(appliesToPriceIds)
             *     .build()
             * ```
             */
            fun trialDiscount(appliesToPriceIds: List<String>) =
                discount(
                    TrialDiscount.builder()
                        .discountType(TrialDiscount.DiscountType.TRIAL)
                        .appliesToPriceIds(appliesToPriceIds)
                        .build()
                )

            /** Alias for calling [discount] with `Discount.ofUsage(usage)`. */
            fun discount(usage: UsageDiscount) = discount(Discount.ofUsage(usage))

            /** Alias for calling [discount] with `Discount.ofAmount(amount)`. */
            fun discount(amount: AmountDiscount) = discount(Discount.ofAmount(amount))

            /**
             * How many terms of length `duration_unit` this phase is active for. If null, this
             * phase is evergreen and active indefinitely
             */
            fun duration(duration: Long?) = duration(JsonField.ofNullable(duration))

            /**
             * Alias for [Builder.duration].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun duration(duration: Long) = duration(duration as Long?)

            /** Alias for calling [Builder.duration] with `duration.orElse(null)`. */
            fun duration(duration: Optional<Long>) = duration(duration.getOrNull())

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

            fun durationUnit(durationUnit: DurationUnit?) =
                durationUnit(JsonField.ofNullable(durationUnit))

            /** Alias for calling [Builder.durationUnit] with `durationUnit.orElse(null)`. */
            fun durationUnit(durationUnit: Optional<DurationUnit>) =
                durationUnit(durationUnit.getOrNull())

            /**
             * Sets [Builder.durationUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationUnit] with a well-typed [DurationUnit] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationUnit(durationUnit: JsonField<DurationUnit>) = apply {
                this.durationUnit = durationUnit
            }

            fun maximum(maximum: Maximum?) = maximum(JsonField.ofNullable(maximum))

            /** Alias for calling [Builder.maximum] with `maximum.orElse(null)`. */
            fun maximum(maximum: Optional<Maximum>) = maximum(maximum.getOrNull())

            /**
             * Sets [Builder.maximum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximum] with a well-typed [Maximum] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String?) =
                maximumAmount(JsonField.ofNullable(maximumAmount))

            /** Alias for calling [Builder.maximumAmount] with `maximumAmount.orElse(null)`. */
            fun maximumAmount(maximumAmount: Optional<String>) =
                maximumAmount(maximumAmount.getOrNull())

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

            fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

            /** Alias for calling [Builder.minimum] with `minimum.orElse(null)`. */
            fun minimum(minimum: Optional<Minimum>) = minimum(minimum.getOrNull())

            /**
             * Sets [Builder.minimum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimum] with a well-typed [Minimum] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String?) =
                minimumAmount(JsonField.ofNullable(minimumAmount))

            /** Alias for calling [Builder.minimumAmount] with `minimumAmount.orElse(null)`. */
            fun minimumAmount(minimumAmount: Optional<String>) =
                minimumAmount(minimumAmount.getOrNull())

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

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Determines the ordering of the phase in a plan's lifecycle. 1 = first phase. */
            fun order(order: Long) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Long>) = apply { this.order = order }

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
             * Returns an immutable instance of [PlanPhase].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .description()
             * .discount()
             * .duration()
             * .durationUnit()
             * .maximum()
             * .maximumAmount()
             * .minimum()
             * .minimumAmount()
             * .name()
             * .order()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PlanPhase =
                PlanPhase(
                    checkRequired("id", id),
                    checkRequired("description", description),
                    checkRequired("discount", discount),
                    checkRequired("duration", duration),
                    checkRequired("durationUnit", durationUnit),
                    checkRequired("maximum", maximum),
                    checkRequired("maximumAmount", maximumAmount),
                    checkRequired("minimum", minimum),
                    checkRequired("minimumAmount", minimumAmount),
                    checkRequired("name", name),
                    checkRequired("order", order),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PlanPhase = apply {
            if (validated) {
                return@apply
            }

            id()
            description()
            discount().ifPresent { it.validate() }
            duration()
            durationUnit()
            maximum().ifPresent { it.validate() }
            maximumAmount()
            minimum().ifPresent { it.validate() }
            minimumAmount()
            name()
            order()
            validated = true
        }

        class DurationUnit @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DAILY = of("daily")

                @JvmField val MONTHLY = of("monthly")

                @JvmField val QUARTERLY = of("quarterly")

                @JvmField val SEMI_ANNUAL = of("semi_annual")

                @JvmField val ANNUAL = of("annual")

                @JvmStatic fun of(value: String) = DurationUnit(JsonField.of(value))
            }

            /** An enum containing [DurationUnit]'s known values. */
            enum class Known {
                DAILY,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            /**
             * An enum containing [DurationUnit]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DurationUnit] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DAILY,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                /**
                 * An enum member indicating that [DurationUnit] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DAILY -> Value.DAILY
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
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
                    DAILY -> Known.DAILY
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
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
                _value().asString().orElseThrow { OrbInvalidDataException("Value is not a String") }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Maximum
        private constructor(
            private val appliesToPriceIds: JsonField<List<String>>,
            private val maximumAmount: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                maximumAmount: JsonField<String> = JsonMissing.of(),
            ) : this(appliesToPriceIds, maximumAmount, mutableMapOf())

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * Maximum amount applied
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

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
             * Returns the raw JSON value of [maximumAmount].
             *
             * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun _maximumAmount(): JsonField<String> = maximumAmount

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
                 * .appliesToPriceIds()
                 * .maximumAmount()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Maximum]. */
            class Builder internal constructor() {

                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var maximumAmount: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(maximum: Maximum) = apply {
                    appliesToPriceIds = maximum.appliesToPriceIds.map { it.toMutableList() }
                    maximumAmount = maximum.maximumAmount
                    additionalProperties = maximum.additionalProperties.toMutableMap()
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
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

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /**
                 * Sets [Builder.maximumAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maximumAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [Maximum].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .appliesToPriceIds()
                 * .maximumAmount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Maximum =
                    Maximum(
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("maximumAmount", maximumAmount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Maximum = apply {
                if (validated) {
                    return@apply
                }

                appliesToPriceIds()
                maximumAmount()
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Maximum && appliesToPriceIds == other.appliesToPriceIds && maximumAmount == other.maximumAmount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, maximumAmount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Maximum{appliesToPriceIds=$appliesToPriceIds, maximumAmount=$maximumAmount, additionalProperties=$additionalProperties}"
        }

        class Minimum
        private constructor(
            private val appliesToPriceIds: JsonField<List<String>>,
            private val minimumAmount: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                minimumAmount: JsonField<String> = JsonMissing.of(),
            ) : this(appliesToPriceIds, minimumAmount, mutableMapOf())

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /**
             * Minimum amount applied
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

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
             * Returns the raw JSON value of [minimumAmount].
             *
             * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun _minimumAmount(): JsonField<String> = minimumAmount

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
                 * .appliesToPriceIds()
                 * .minimumAmount()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Minimum]. */
            class Builder internal constructor() {

                private var appliesToPriceIds: JsonField<MutableList<String>>? = null
                private var minimumAmount: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(minimum: Minimum) = apply {
                    appliesToPriceIds = minimum.appliesToPriceIds.map { it.toMutableList() }
                    minimumAmount = minimum.minimumAmount
                    additionalProperties = minimum.additionalProperties.toMutableMap()
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
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

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /**
                 * Sets [Builder.minimumAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.minimumAmount] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * .appliesToPriceIds()
                 * .minimumAmount()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Minimum =
                    Minimum(
                        checkRequired("appliesToPriceIds", appliesToPriceIds).map {
                            it.toImmutable()
                        },
                        checkRequired("minimumAmount", minimumAmount),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Minimum = apply {
                if (validated) {
                    return@apply
                }

                appliesToPriceIds()
                minimumAmount()
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Minimum && appliesToPriceIds == other.appliesToPriceIds && minimumAmount == other.minimumAmount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(appliesToPriceIds, minimumAmount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Minimum{appliesToPriceIds=$appliesToPriceIds, minimumAmount=$minimumAmount, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PlanPhase && id == other.id && description == other.description && discount == other.discount && duration == other.duration && durationUnit == other.durationUnit && maximum == other.maximum && maximumAmount == other.maximumAmount && minimum == other.minimum && minimumAmount == other.minimumAmount && name == other.name && order == other.order && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, description, discount, duration, durationUnit, maximum, maximumAmount, minimum, minimumAmount, name, order, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlanPhase{id=$id, description=$description, discount=$discount, duration=$duration, durationUnit=$durationUnit, maximum=$maximum, maximumAmount=$maximumAmount, minimum=$minimum, minimumAmount=$minimumAmount, name=$name, order=$order, additionalProperties=$additionalProperties}"
    }

    class Product
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(id, createdAt, name, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Product].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Product]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(product: Product) = apply {
                id = product.id
                createdAt = product.createdAt
                name = product.name
                additionalProperties = product.additionalProperties.toMutableMap()
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

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Product].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Product =
                Product(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Product = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            name()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Product && id == other.id && createdAt == other.createdAt && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Product{id=$id, createdAt=$createdAt, name=$name, additionalProperties=$additionalProperties}"
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

            @JvmField val ARCHIVED = of("archived")

            @JvmField val DRAFT = of("draft")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            ARCHIVED,
            DRAFT,
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
            ARCHIVED,
            DRAFT,
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
                ARCHIVED -> Value.ARCHIVED
                DRAFT -> Value.DRAFT
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
                ARCHIVED -> Known.ARCHIVED
                DRAFT -> Known.DRAFT
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

    class TrialConfig
    private constructor(
        private val trialPeriod: JsonField<Long>,
        private val trialPeriodUnit: JsonField<TrialPeriodUnit>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("trial_period")
            @ExcludeMissing
            trialPeriod: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("trial_period_unit")
            @ExcludeMissing
            trialPeriodUnit: JsonField<TrialPeriodUnit> = JsonMissing.of(),
        ) : this(trialPeriod, trialPeriodUnit, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun trialPeriod(): Optional<Long> =
            Optional.ofNullable(trialPeriod.getNullable("trial_period"))

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun trialPeriodUnit(): TrialPeriodUnit = trialPeriodUnit.getRequired("trial_period_unit")

        /**
         * Returns the raw JSON value of [trialPeriod].
         *
         * Unlike [trialPeriod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trial_period")
        @ExcludeMissing
        fun _trialPeriod(): JsonField<Long> = trialPeriod

        /**
         * Returns the raw JSON value of [trialPeriodUnit].
         *
         * Unlike [trialPeriodUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trial_period_unit")
        @ExcludeMissing
        fun _trialPeriodUnit(): JsonField<TrialPeriodUnit> = trialPeriodUnit

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
             * Returns a mutable builder for constructing an instance of [TrialConfig].
             *
             * The following fields are required:
             * ```java
             * .trialPeriod()
             * .trialPeriodUnit()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TrialConfig]. */
        class Builder internal constructor() {

            private var trialPeriod: JsonField<Long>? = null
            private var trialPeriodUnit: JsonField<TrialPeriodUnit>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trialConfig: TrialConfig) = apply {
                trialPeriod = trialConfig.trialPeriod
                trialPeriodUnit = trialConfig.trialPeriodUnit
                additionalProperties = trialConfig.additionalProperties.toMutableMap()
            }

            fun trialPeriod(trialPeriod: Long?) = trialPeriod(JsonField.ofNullable(trialPeriod))

            /**
             * Alias for [Builder.trialPeriod].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun trialPeriod(trialPeriod: Long) = trialPeriod(trialPeriod as Long?)

            /** Alias for calling [Builder.trialPeriod] with `trialPeriod.orElse(null)`. */
            fun trialPeriod(trialPeriod: Optional<Long>) = trialPeriod(trialPeriod.getOrNull())

            /**
             * Sets [Builder.trialPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialPeriod] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trialPeriod(trialPeriod: JsonField<Long>) = apply { this.trialPeriod = trialPeriod }

            fun trialPeriodUnit(trialPeriodUnit: TrialPeriodUnit) =
                trialPeriodUnit(JsonField.of(trialPeriodUnit))

            /**
             * Sets [Builder.trialPeriodUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialPeriodUnit] with a well-typed [TrialPeriodUnit]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun trialPeriodUnit(trialPeriodUnit: JsonField<TrialPeriodUnit>) = apply {
                this.trialPeriodUnit = trialPeriodUnit
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
             * Returns an immutable instance of [TrialConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .trialPeriod()
             * .trialPeriodUnit()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TrialConfig =
                TrialConfig(
                    checkRequired("trialPeriod", trialPeriod),
                    checkRequired("trialPeriodUnit", trialPeriodUnit),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TrialConfig = apply {
            if (validated) {
                return@apply
            }

            trialPeriod()
            trialPeriodUnit()
            validated = true
        }

        class TrialPeriodUnit
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DAYS = of("days")

                @JvmStatic fun of(value: String) = TrialPeriodUnit(JsonField.of(value))
            }

            /** An enum containing [TrialPeriodUnit]'s known values. */
            enum class Known {
                DAYS
            }

            /**
             * An enum containing [TrialPeriodUnit]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TrialPeriodUnit] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DAYS,
                /**
                 * An enum member indicating that [TrialPeriodUnit] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DAYS -> Value.DAYS
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
                    DAYS -> Known.DAYS
                    else -> throw OrbInvalidDataException("Unknown TrialPeriodUnit: $value")
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
                _value().asString().orElseThrow { OrbInvalidDataException("Value is not a String") }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TrialPeriodUnit && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrialConfig && trialPeriod == other.trialPeriod && trialPeriodUnit == other.trialPeriodUnit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(trialPeriod, trialPeriodUnit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrialConfig{trialPeriod=$trialPeriod, trialPeriodUnit=$trialPeriodUnit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Plan && id == other.id && adjustments == other.adjustments && basePlan == other.basePlan && basePlanId == other.basePlanId && createdAt == other.createdAt && currency == other.currency && defaultInvoiceMemo == other.defaultInvoiceMemo && description == other.description && discount == other.discount && externalPlanId == other.externalPlanId && invoicingCurrency == other.invoicingCurrency && maximum == other.maximum && maximumAmount == other.maximumAmount && metadata == other.metadata && minimum == other.minimum && minimumAmount == other.minimumAmount && name == other.name && netTerms == other.netTerms && planPhases == other.planPhases && prices == other.prices && product == other.product && status == other.status && trialConfig == other.trialConfig && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, adjustments, basePlan, basePlanId, createdAt, currency, defaultInvoiceMemo, description, discount, externalPlanId, invoicingCurrency, maximum, maximumAmount, metadata, minimum, minimumAmount, name, netTerms, planPhases, prices, product, status, trialConfig, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Plan{id=$id, adjustments=$adjustments, basePlan=$basePlan, basePlanId=$basePlanId, createdAt=$createdAt, currency=$currency, defaultInvoiceMemo=$defaultInvoiceMemo, description=$description, discount=$discount, externalPlanId=$externalPlanId, invoicingCurrency=$invoicingCurrency, maximum=$maximum, maximumAmount=$maximumAmount, metadata=$metadata, minimum=$minimum, minimumAmount=$minimumAmount, name=$name, netTerms=$netTerms, planPhases=$planPhases, prices=$prices, product=$product, status=$status, trialConfig=$trialConfig, version=$version, additionalProperties=$additionalProperties}"
}
