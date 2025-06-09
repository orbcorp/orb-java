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
    fun basePlan(): Optional<BasePlan> = basePlan.getOptional("base_plan")

    /**
     * The parent plan id if the given plan was created by overriding one or more of the parent's
     * prices
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun basePlanId(): Optional<String> = basePlanId.getOptional("base_plan_id")

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
        defaultInvoiceMemo.getOptional("default_invoice_memo")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated") fun discount(): Optional<Discount> = discount.getOptional("discount")

    /**
     * An optional user-defined ID for this plan resource, used throughout the system as an alias
     * for this Plan. Use this field to identify a plan by an existing identifier in your system.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalPlanId(): Optional<String> = externalPlanId.getOptional("external_plan_id")

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
    @Deprecated("deprecated") fun maximum(): Optional<Maximum> = maximum.getOptional("maximum")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun maximumAmount(): Optional<String> = maximumAmount.getOptional("maximum_amount")

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
    @Deprecated("deprecated") fun minimum(): Optional<Minimum> = minimum.getOptional("minimum")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun minimumAmount(): Optional<String> = minimumAmount.getOptional("minimum_amount")

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
    fun netTerms(): Optional<Long> = netTerms.getOptional("net_terms")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun planPhases(): Optional<List<PlanPhase>> = planPhases.getOptional("plan_phases")

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
    @Deprecated("deprecated")
    @JsonProperty("discount")
    @ExcludeMissing
    fun _discount(): JsonField<Discount> = discount

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
    @Deprecated("deprecated")
    @JsonProperty("maximum")
    @ExcludeMissing
    fun _maximum(): JsonField<Maximum> = maximum

    /**
     * Returns the raw JSON value of [maximumAmount].
     *
     * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
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
    @Deprecated("deprecated")
    @JsonProperty("minimum")
    @ExcludeMissing
    fun _minimum(): JsonField<Minimum> = minimum

    /**
     * Returns the raw JSON value of [minimumAmount].
     *
     * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
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

        /** Alias for calling [addAdjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`. */
        fun addAdjustment(usageDiscount: PlanPhaseUsageDiscountAdjustment) =
            addAdjustment(Adjustment.ofUsageDiscount(usageDiscount))

        /** Alias for calling [addAdjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`. */
        fun addAdjustment(amountDiscount: PlanPhaseAmountDiscountAdjustment) =
            addAdjustment(Adjustment.ofAmountDiscount(amountDiscount))

        /**
         * Alias for calling [addAdjustment] with
         * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
         */
        fun addAdjustment(percentageDiscount: PlanPhasePercentageDiscountAdjustment) =
            addAdjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

        /** Alias for calling [addAdjustment] with `Adjustment.ofMinimum(minimum)`. */
        fun addAdjustment(minimum: PlanPhaseMinimumAdjustment) =
            addAdjustment(Adjustment.ofMinimum(minimum))

        /** Alias for calling [addAdjustment] with `Adjustment.ofMaximum(maximum)`. */
        fun addAdjustment(maximum: PlanPhaseMaximumAdjustment) =
            addAdjustment(Adjustment.ofMaximum(maximum))

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

        @Deprecated("deprecated")
        fun discount(discount: Discount?) = discount(JsonField.ofNullable(discount))

        /** Alias for calling [Builder.discount] with `discount.orElse(null)`. */
        @Deprecated("deprecated")
        fun discount(discount: Optional<Discount>) = discount(discount.getOrNull())

        /**
         * Sets [Builder.discount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discount] with a well-typed [Discount] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

        /** Alias for calling [discount] with `Discount.ofPercentage(percentage)`. */
        @Deprecated("deprecated")
        fun discount(percentage: PercentageDiscount) = discount(Discount.ofPercentage(percentage))

        /**
         * Alias for calling [discount] with the following:
         * ```java
         * PercentageDiscount.builder()
         *     .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
         *     .percentageDiscount(percentageDiscount)
         *     .build()
         * ```
         */
        @Deprecated("deprecated")
        fun percentageDiscount(percentageDiscount: Double) =
            discount(
                PercentageDiscount.builder()
                    .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                    .percentageDiscount(percentageDiscount)
                    .build()
            )

        /** Alias for calling [discount] with `Discount.ofTrial(trial)`. */
        @Deprecated("deprecated")
        fun discount(trial: TrialDiscount) = discount(Discount.ofTrial(trial))

        /** Alias for calling [discount] with `Discount.ofUsage(usage)`. */
        @Deprecated("deprecated")
        fun discount(usage: UsageDiscount) = discount(Discount.ofUsage(usage))

        /**
         * Alias for calling [discount] with the following:
         * ```java
         * UsageDiscount.builder()
         *     .discountType(UsageDiscount.DiscountType.USAGE)
         *     .usageDiscount(usageDiscount)
         *     .build()
         * ```
         */
        @Deprecated("deprecated")
        fun usageDiscount(usageDiscount: Double) =
            discount(
                UsageDiscount.builder()
                    .discountType(UsageDiscount.DiscountType.USAGE)
                    .usageDiscount(usageDiscount)
                    .build()
            )

        /** Alias for calling [discount] with `Discount.ofAmount(amount)`. */
        @Deprecated("deprecated")
        fun discount(amount: AmountDiscount) = discount(Discount.ofAmount(amount))

        /**
         * Alias for calling [discount] with the following:
         * ```java
         * AmountDiscount.builder()
         *     .discountType(AmountDiscount.DiscountType.AMOUNT)
         *     .amountDiscount(amountDiscount)
         *     .build()
         * ```
         */
        @Deprecated("deprecated")
        fun amountDiscount(amountDiscount: String) =
            discount(
                AmountDiscount.builder()
                    .discountType(AmountDiscount.DiscountType.AMOUNT)
                    .amountDiscount(amountDiscount)
                    .build()
            )

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

        @Deprecated("deprecated")
        fun maximum(maximum: Maximum?) = maximum(JsonField.ofNullable(maximum))

        /** Alias for calling [Builder.maximum] with `maximum.orElse(null)`. */
        @Deprecated("deprecated")
        fun maximum(maximum: Optional<Maximum>) = maximum(maximum.getOrNull())

        /**
         * Sets [Builder.maximum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximum] with a well-typed [Maximum] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

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
         * You should usually call [Builder.maximumAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
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

        @Deprecated("deprecated")
        fun minimum(minimum: Minimum?) = minimum(JsonField.ofNullable(minimum))

        /** Alias for calling [Builder.minimum] with `minimum.orElse(null)`. */
        @Deprecated("deprecated")
        fun minimum(minimum: Optional<Minimum>) = minimum(minimum.getOrNull())

        /**
         * Sets [Builder.minimum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minimum] with a well-typed [Minimum] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

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
         * You should usually call [Builder.minimumAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
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
        fun addPrice(unit: Price.Unit) = addPrice(Price.ofUnit(unit))

        /** Alias for calling [addPrice] with `Price.ofPackage(package_)`. */
        fun addPrice(package_: Price.Package) = addPrice(Price.ofPackage(package_))

        /** Alias for calling [addPrice] with `Price.ofMatrix(matrix)`. */
        fun addPrice(matrix: Price.Matrix) = addPrice(Price.ofMatrix(matrix))

        /** Alias for calling [addPrice] with `Price.ofTiered(tiered)`. */
        fun addPrice(tiered: Price.Tiered) = addPrice(Price.ofTiered(tiered))

        /** Alias for calling [addPrice] with `Price.ofTieredBps(tieredBps)`. */
        fun addPrice(tieredBps: Price.TieredBps) = addPrice(Price.ofTieredBps(tieredBps))

        /** Alias for calling [addPrice] with `Price.ofBps(bps)`. */
        fun addPrice(bps: Price.Bps) = addPrice(Price.ofBps(bps))

        /** Alias for calling [addPrice] with `Price.ofBulkBps(bulkBps)`. */
        fun addPrice(bulkBps: Price.BulkBps) = addPrice(Price.ofBulkBps(bulkBps))

        /** Alias for calling [addPrice] with `Price.ofBulk(bulk)`. */
        fun addPrice(bulk: Price.Bulk) = addPrice(Price.ofBulk(bulk))

        /**
         * Alias for calling [addPrice] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
         */
        fun addPrice(thresholdTotalAmount: Price.ThresholdTotalAmount) =
            addPrice(Price.ofThresholdTotalAmount(thresholdTotalAmount))

        /** Alias for calling [addPrice] with `Price.ofTieredPackage(tieredPackage)`. */
        fun addPrice(tieredPackage: Price.TieredPackage) =
            addPrice(Price.ofTieredPackage(tieredPackage))

        /** Alias for calling [addPrice] with `Price.ofGroupedTiered(groupedTiered)`. */
        fun addPrice(groupedTiered: Price.GroupedTiered) =
            addPrice(Price.ofGroupedTiered(groupedTiered))

        /** Alias for calling [addPrice] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
        fun addPrice(tieredWithMinimum: Price.TieredWithMinimum) =
            addPrice(Price.ofTieredWithMinimum(tieredWithMinimum))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
         */
        fun addPrice(tieredPackageWithMinimum: Price.TieredPackageWithMinimum) =
            addPrice(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

        /**
         * Alias for calling [addPrice] with `Price.ofPackageWithAllocation(packageWithAllocation)`.
         */
        fun addPrice(packageWithAllocation: Price.PackageWithAllocation) =
            addPrice(Price.ofPackageWithAllocation(packageWithAllocation))

        /** Alias for calling [addPrice] with `Price.ofUnitWithPercent(unitWithPercent)`. */
        fun addPrice(unitWithPercent: Price.UnitWithPercent) =
            addPrice(Price.ofUnitWithPercent(unitWithPercent))

        /**
         * Alias for calling [addPrice] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
         */
        fun addPrice(matrixWithAllocation: Price.MatrixWithAllocation) =
            addPrice(Price.ofMatrixWithAllocation(matrixWithAllocation))

        /** Alias for calling [addPrice] with `Price.ofTieredWithProration(tieredWithProration)`. */
        fun addPrice(tieredWithProration: Price.TieredWithProration) =
            addPrice(Price.ofTieredWithProration(tieredWithProration))

        /** Alias for calling [addPrice] with `Price.ofUnitWithProration(unitWithProration)`. */
        fun addPrice(unitWithProration: Price.UnitWithProration) =
            addPrice(Price.ofUnitWithProration(unitWithProration))

        /** Alias for calling [addPrice] with `Price.ofGroupedAllocation(groupedAllocation)`. */
        fun addPrice(groupedAllocation: Price.GroupedAllocation) =
            addPrice(Price.ofGroupedAllocation(groupedAllocation))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
         */
        fun addPrice(groupedWithProratedMinimum: Price.GroupedWithProratedMinimum) =
            addPrice(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
         */
        fun addPrice(groupedWithMeteredMinimum: Price.GroupedWithMeteredMinimum) =
            addPrice(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

        /**
         * Alias for calling [addPrice] with `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
         */
        fun addPrice(matrixWithDisplayName: Price.MatrixWithDisplayName) =
            addPrice(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

        /** Alias for calling [addPrice] with `Price.ofBulkWithProration(bulkWithProration)`. */
        fun addPrice(bulkWithProration: Price.BulkWithProration) =
            addPrice(Price.ofBulkWithProration(bulkWithProration))

        /**
         * Alias for calling [addPrice] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
         */
        fun addPrice(groupedTieredPackage: Price.GroupedTieredPackage) =
            addPrice(Price.ofGroupedTieredPackage(groupedTieredPackage))

        /**
         * Alias for calling [addPrice] with `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
         */
        fun addPrice(maxGroupTieredPackage: Price.MaxGroupTieredPackage) =
            addPrice(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
         */
        fun addPrice(scalableMatrixWithUnitPricing: Price.ScalableMatrixWithUnitPricing) =
            addPrice(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

        /**
         * Alias for calling [addPrice] with
         * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
         */
        fun addPrice(scalableMatrixWithTieredPricing: Price.ScalableMatrixWithTieredPricing) =
            addPrice(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

        /**
         * Alias for calling [addPrice] with `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
         */
        fun addPrice(cumulativeGroupedBulk: Price.CumulativeGroupedBulk) =
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
        status().validate()
        trialConfig().validate()
        version()
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
            (adjustments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (basePlan.asKnown().getOrNull()?.validity() ?: 0) +
            (if (basePlanId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (defaultInvoiceMemo.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (discount.asKnown().getOrNull()?.validity() ?: 0) +
            (if (externalPlanId.asKnown().isPresent) 1 else 0) +
            (if (invoicingCurrency.asKnown().isPresent) 1 else 0) +
            (maximum.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maximumAmount.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (minimum.asKnown().getOrNull()?.validity() ?: 0) +
            (if (minimumAmount.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (netTerms.asKnown().isPresent) 1 else 0) +
            (planPhases.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (prices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (product.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (trialConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = Adjustment.Deserializer::class)
    @JsonSerialize(using = Adjustment.Serializer::class)
    class Adjustment
    private constructor(
        private val usageDiscount: PlanPhaseUsageDiscountAdjustment? = null,
        private val amountDiscount: PlanPhaseAmountDiscountAdjustment? = null,
        private val percentageDiscount: PlanPhasePercentageDiscountAdjustment? = null,
        private val minimum: PlanPhaseMinimumAdjustment? = null,
        private val maximum: PlanPhaseMaximumAdjustment? = null,
        private val _json: JsonValue? = null,
    ) {

        fun usageDiscount(): Optional<PlanPhaseUsageDiscountAdjustment> =
            Optional.ofNullable(usageDiscount)

        fun amountDiscount(): Optional<PlanPhaseAmountDiscountAdjustment> =
            Optional.ofNullable(amountDiscount)

        fun percentageDiscount(): Optional<PlanPhasePercentageDiscountAdjustment> =
            Optional.ofNullable(percentageDiscount)

        fun minimum(): Optional<PlanPhaseMinimumAdjustment> = Optional.ofNullable(minimum)

        fun maximum(): Optional<PlanPhaseMaximumAdjustment> = Optional.ofNullable(maximum)

        fun isUsageDiscount(): Boolean = usageDiscount != null

        fun isAmountDiscount(): Boolean = amountDiscount != null

        fun isPercentageDiscount(): Boolean = percentageDiscount != null

        fun isMinimum(): Boolean = minimum != null

        fun isMaximum(): Boolean = maximum != null

        fun asUsageDiscount(): PlanPhaseUsageDiscountAdjustment =
            usageDiscount.getOrThrow("usageDiscount")

        fun asAmountDiscount(): PlanPhaseAmountDiscountAdjustment =
            amountDiscount.getOrThrow("amountDiscount")

        fun asPercentageDiscount(): PlanPhasePercentageDiscountAdjustment =
            percentageDiscount.getOrThrow("percentageDiscount")

        fun asMinimum(): PlanPhaseMinimumAdjustment = minimum.getOrThrow("minimum")

        fun asMaximum(): PlanPhaseMaximumAdjustment = maximum.getOrThrow("maximum")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
                percentageDiscount != null -> visitor.visitPercentageDiscount(percentageDiscount)
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
                    override fun visitUsageDiscount(
                        usageDiscount: PlanPhaseUsageDiscountAdjustment
                    ) {
                        usageDiscount.validate()
                    }

                    override fun visitAmountDiscount(
                        amountDiscount: PlanPhaseAmountDiscountAdjustment
                    ) {
                        amountDiscount.validate()
                    }

                    override fun visitPercentageDiscount(
                        percentageDiscount: PlanPhasePercentageDiscountAdjustment
                    ) {
                        percentageDiscount.validate()
                    }

                    override fun visitMinimum(minimum: PlanPhaseMinimumAdjustment) {
                        minimum.validate()
                    }

                    override fun visitMaximum(maximum: PlanPhaseMaximumAdjustment) {
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
                    override fun visitUsageDiscount(
                        usageDiscount: PlanPhaseUsageDiscountAdjustment
                    ) = usageDiscount.validity()

                    override fun visitAmountDiscount(
                        amountDiscount: PlanPhaseAmountDiscountAdjustment
                    ) = amountDiscount.validity()

                    override fun visitPercentageDiscount(
                        percentageDiscount: PlanPhasePercentageDiscountAdjustment
                    ) = percentageDiscount.validity()

                    override fun visitMinimum(minimum: PlanPhaseMinimumAdjustment) =
                        minimum.validity()

                    override fun visitMaximum(maximum: PlanPhaseMaximumAdjustment) =
                        maximum.validity()

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
                percentageDiscount != null -> "Adjustment{percentageDiscount=$percentageDiscount}"
                minimum != null -> "Adjustment{minimum=$minimum}"
                maximum != null -> "Adjustment{maximum=$maximum}"
                _json != null -> "Adjustment{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Adjustment")
            }

        companion object {

            @JvmStatic
            fun ofUsageDiscount(usageDiscount: PlanPhaseUsageDiscountAdjustment) =
                Adjustment(usageDiscount = usageDiscount)

            @JvmStatic
            fun ofAmountDiscount(amountDiscount: PlanPhaseAmountDiscountAdjustment) =
                Adjustment(amountDiscount = amountDiscount)

            @JvmStatic
            fun ofPercentageDiscount(percentageDiscount: PlanPhasePercentageDiscountAdjustment) =
                Adjustment(percentageDiscount = percentageDiscount)

            @JvmStatic
            fun ofMinimum(minimum: PlanPhaseMinimumAdjustment) = Adjustment(minimum = minimum)

            @JvmStatic
            fun ofMaximum(maximum: PlanPhaseMaximumAdjustment) = Adjustment(maximum = maximum)
        }

        /**
         * An interface that defines how to map each variant of [Adjustment] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUsageDiscount(usageDiscount: PlanPhaseUsageDiscountAdjustment): T

            fun visitAmountDiscount(amountDiscount: PlanPhaseAmountDiscountAdjustment): T

            fun visitPercentageDiscount(
                percentageDiscount: PlanPhasePercentageDiscountAdjustment
            ): T

            fun visitMinimum(minimum: PlanPhaseMinimumAdjustment): T

            fun visitMaximum(maximum: PlanPhaseMaximumAdjustment): T

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
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PlanPhaseUsageDiscountAdjustment>(),
                            )
                            ?.let { Adjustment(usageDiscount = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "amount_discount" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PlanPhaseAmountDiscountAdjustment>(),
                            )
                            ?.let { Adjustment(amountDiscount = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "percentage_discount" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PlanPhasePercentageDiscountAdjustment>(),
                            )
                            ?.let { Adjustment(percentageDiscount = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "minimum" -> {
                        return tryDeserialize(node, jacksonTypeRef<PlanPhaseMinimumAdjustment>())
                            ?.let { Adjustment(minimum = it, _json = json) }
                            ?: Adjustment(_json = json)
                    }
                    "maximum" -> {
                        return tryDeserialize(node, jacksonTypeRef<PlanPhaseMaximumAdjustment>())
                            ?.let { Adjustment(maximum = it, _json = json) }
                            ?: Adjustment(_json = json)
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
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPlanId(): Optional<String> = externalPlanId.getOptional("external_plan_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

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
                (if (externalPlanId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

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
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun discount(): Optional<Discount> = discount.getOptional("discount")

        /**
         * How many terms of length `duration_unit` this phase is active for. If null, this phase is
         * evergreen and active indefinitely
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun duration(): Optional<Long> = duration.getOptional("duration")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun durationUnit(): Optional<DurationUnit> = durationUnit.getOptional("duration_unit")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximum(): Optional<Maximum> = maximum.getOptional("maximum")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumAmount(): Optional<String> = maximumAmount.getOptional("maximum_amount")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimum(): Optional<Minimum> = minimum.getOptional("minimum")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumAmount(): Optional<String> = minimumAmount.getOptional("minimum_amount")

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

            /**
             * Alias for calling [discount] with the following:
             * ```java
             * PercentageDiscount.builder()
             *     .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
             *     .percentageDiscount(percentageDiscount)
             *     .build()
             * ```
             */
            fun percentageDiscount(percentageDiscount: Double) =
                discount(
                    PercentageDiscount.builder()
                        .discountType(PercentageDiscount.DiscountType.PERCENTAGE)
                        .percentageDiscount(percentageDiscount)
                        .build()
                )

            /** Alias for calling [discount] with `Discount.ofTrial(trial)`. */
            fun discount(trial: TrialDiscount) = discount(Discount.ofTrial(trial))

            /** Alias for calling [discount] with `Discount.ofUsage(usage)`. */
            fun discount(usage: UsageDiscount) = discount(Discount.ofUsage(usage))

            /**
             * Alias for calling [discount] with the following:
             * ```java
             * UsageDiscount.builder()
             *     .discountType(UsageDiscount.DiscountType.USAGE)
             *     .usageDiscount(usageDiscount)
             *     .build()
             * ```
             */
            fun usageDiscount(usageDiscount: Double) =
                discount(
                    UsageDiscount.builder()
                        .discountType(UsageDiscount.DiscountType.USAGE)
                        .usageDiscount(usageDiscount)
                        .build()
                )

            /** Alias for calling [discount] with `Discount.ofAmount(amount)`. */
            fun discount(amount: AmountDiscount) = discount(Discount.ofAmount(amount))

            /**
             * Alias for calling [discount] with the following:
             * ```java
             * AmountDiscount.builder()
             *     .discountType(AmountDiscount.DiscountType.AMOUNT)
             *     .amountDiscount(amountDiscount)
             *     .build()
             * ```
             */
            fun amountDiscount(amountDiscount: String) =
                discount(
                    AmountDiscount.builder()
                        .discountType(AmountDiscount.DiscountType.AMOUNT)
                        .amountDiscount(amountDiscount)
                        .build()
                )

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
            durationUnit().ifPresent { it.validate() }
            maximum().ifPresent { it.validate() }
            maximumAmount()
            minimum().ifPresent { it.validate() }
            minimumAmount()
            name()
            order()
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
                (if (description.asKnown().isPresent) 1 else 0) +
                (discount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (duration.asKnown().isPresent) 1 else 0) +
                (durationUnit.asKnown().getOrNull()?.validity() ?: 0) +
                (maximum.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maximumAmount.asKnown().isPresent) 1 else 0) +
                (minimum.asKnown().getOrNull()?.validity() ?: 0) +
                (if (minimumAmount.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (order.asKnown().isPresent) 1 else 0)

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

            private var validated: Boolean = false

            fun validate(): DurationUnit = apply {
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

                return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

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
        fun trialPeriod(): Optional<Long> = trialPeriod.getOptional("trial_period")

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
            trialPeriodUnit().validate()
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
            (if (trialPeriod.asKnown().isPresent) 1 else 0) +
                (trialPeriodUnit.asKnown().getOrNull()?.validity() ?: 0)

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

            private var validated: Boolean = false

            fun validate(): TrialPeriodUnit = apply {
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
