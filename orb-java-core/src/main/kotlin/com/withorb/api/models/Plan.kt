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

/**
 * The [Plan](../guides/core-concepts.mdx#plan-and-price) resource represents a plan that can be
 * subscribed to by a customer. Plans define the billing behavior of the subscription. You can see
 * more about how to configure prices in the [Price resource](/reference/price).
 */
@NoAutoDetect
class Plan
@JsonCreator
private constructor(
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    private val maximumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    private val minimumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("maximum")
    @ExcludeMissing
    private val maximum: JsonField<Maximum> = JsonMissing.of(),
    @JsonProperty("minimum")
    @ExcludeMissing
    private val minimum: JsonField<Minimum> = JsonMissing.of(),
    @JsonProperty("discount")
    @ExcludeMissing
    private val discount: JsonField<Discount> = JsonMissing.of(),
    @JsonProperty("product")
    @ExcludeMissing
    private val product: JsonField<Product> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("trial_config")
    @ExcludeMissing
    private val trialConfig: JsonField<TrialConfig> = JsonMissing.of(),
    @JsonProperty("plan_phases")
    @ExcludeMissing
    private val planPhases: JsonField<List<PlanPhase>> = JsonMissing.of(),
    @JsonProperty("base_plan")
    @ExcludeMissing
    private val basePlan: JsonField<BasePlan> = JsonMissing.of(),
    @JsonProperty("base_plan_id")
    @ExcludeMissing
    private val basePlanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("external_plan_id")
    @ExcludeMissing
    private val externalPlanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoicing_currency")
    @ExcludeMissing
    private val invoicingCurrency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("net_terms")
    @ExcludeMissing
    private val netTerms: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    private val defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
    @JsonProperty("prices")
    @ExcludeMissing
    private val prices: JsonField<List<Price>> = JsonMissing.of(),
    @JsonProperty("adjustments")
    @ExcludeMissing
    private val adjustments: JsonField<List<Adjustment>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun id(): String = id.getRequired("id")

    fun name(): String = name.getRequired("name")

    fun description(): String = description.getRequired("description")

    fun maximumAmount(): Optional<String> =
        Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

    fun minimumAmount(): Optional<String> =
        Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun status(): Status = status.getRequired("status")

    fun maximum(): Optional<Maximum> = Optional.ofNullable(maximum.getNullable("maximum"))

    fun minimum(): Optional<Minimum> = Optional.ofNullable(minimum.getNullable("minimum"))

    fun discount(): Optional<Discount> = Optional.ofNullable(discount.getNullable("discount"))

    fun product(): Product = product.getRequired("product")

    fun version(): Long = version.getRequired("version")

    fun trialConfig(): TrialConfig = trialConfig.getRequired("trial_config")

    fun planPhases(): Optional<List<PlanPhase>> =
        Optional.ofNullable(planPhases.getNullable("plan_phases"))

    fun basePlan(): Optional<BasePlan> = Optional.ofNullable(basePlan.getNullable("base_plan"))

    /**
     * The parent plan id if the given plan was created by overriding one or more of the parent's
     * prices
     */
    fun basePlanId(): Optional<String> = Optional.ofNullable(basePlanId.getNullable("base_plan_id"))

    /**
     * An optional user-defined ID for this plan resource, used throughout the system as an alias
     * for this Plan. Use this field to identify a plan by an existing identifier in your system.
     */
    fun externalPlanId(): Optional<String> =
        Optional.ofNullable(externalPlanId.getNullable("external_plan_id"))

    /** An ISO 4217 currency string or custom pricing unit (`credits`) for this plan's prices. */
    fun currency(): String = currency.getRequired("currency")

    /**
     * An ISO 4217 currency string for which this plan is billed in. Matches `currency` unless
     * `currency` is a custom pricing unit.
     */
    fun invoicingCurrency(): String = invoicingCurrency.getRequired("invoicing_currency")

    /**
     * Determines the difference between the invoice issue date and the due date. A value of "0"
     * here signifies that invoices are due on issue, whereas a value of "30" means that the
     * customer has a month to pay the invoice before its overdue. Note that individual
     * subscriptions or invoices may set a different net terms configuration.
     */
    fun netTerms(): Optional<Long> = Optional.ofNullable(netTerms.getNullable("net_terms"))

    /**
     * The default memo text on the invoices corresponding to subscriptions on this plan. Note that
     * each subscription may configure its own memo.
     */
    fun defaultInvoiceMemo(): Optional<String> =
        Optional.ofNullable(defaultInvoiceMemo.getNullable("default_invoice_memo"))

    /**
     * Prices for this plan. If the plan has phases, this includes prices across all phases of the
     * plan.
     */
    fun prices(): List<Price> = prices.getRequired("prices")

    /**
     * Adjustments for this plan. If the plan has phases, this includes adjustments across all
     * phases of the plan.
     */
    fun adjustments(): List<Adjustment> = adjustments.getRequired("adjustments")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

    @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

    @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

    @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

    @JsonProperty("product") @ExcludeMissing fun _product() = product

    @JsonProperty("version") @ExcludeMissing fun _version() = version

    @JsonProperty("trial_config") @ExcludeMissing fun _trialConfig() = trialConfig

    @JsonProperty("plan_phases") @ExcludeMissing fun _planPhases() = planPhases

    @JsonProperty("base_plan") @ExcludeMissing fun _basePlan() = basePlan

    /**
     * The parent plan id if the given plan was created by overriding one or more of the parent's
     * prices
     */
    @JsonProperty("base_plan_id") @ExcludeMissing fun _basePlanId() = basePlanId

    /**
     * An optional user-defined ID for this plan resource, used throughout the system as an alias
     * for this Plan. Use this field to identify a plan by an existing identifier in your system.
     */
    @JsonProperty("external_plan_id") @ExcludeMissing fun _externalPlanId() = externalPlanId

    /** An ISO 4217 currency string or custom pricing unit (`credits`) for this plan's prices. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * An ISO 4217 currency string for which this plan is billed in. Matches `currency` unless
     * `currency` is a custom pricing unit.
     */
    @JsonProperty("invoicing_currency") @ExcludeMissing fun _invoicingCurrency() = invoicingCurrency

    /**
     * Determines the difference between the invoice issue date and the due date. A value of "0"
     * here signifies that invoices are due on issue, whereas a value of "30" means that the
     * customer has a month to pay the invoice before its overdue. Note that individual
     * subscriptions or invoices may set a different net terms configuration.
     */
    @JsonProperty("net_terms") @ExcludeMissing fun _netTerms() = netTerms

    /**
     * The default memo text on the invoices corresponding to subscriptions on this plan. Note that
     * each subscription may configure its own memo.
     */
    @JsonProperty("default_invoice_memo")
    @ExcludeMissing
    fun _defaultInvoiceMemo() = defaultInvoiceMemo

    /**
     * Prices for this plan. If the plan has phases, this includes prices across all phases of the
     * plan.
     */
    @JsonProperty("prices") @ExcludeMissing fun _prices() = prices

    /**
     * Adjustments for this plan. If the plan has phases, this includes adjustments across all
     * phases of the plan.
     */
    @JsonProperty("adjustments") @ExcludeMissing fun _adjustments() = adjustments

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Plan = apply {
        if (!validated) {
            metadata().validate()
            id()
            name()
            description()
            maximumAmount()
            minimumAmount()
            createdAt()
            status()
            maximum().map { it.validate() }
            minimum().map { it.validate() }
            discount()
            product().validate()
            version()
            trialConfig().validate()
            planPhases().map { it.forEach { it.validate() } }
            basePlan().map { it.validate() }
            basePlanId()
            externalPlanId()
            currency()
            invoicingCurrency()
            netTerms()
            defaultInvoiceMemo()
            prices()
            adjustments()
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
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var maximumAmount: JsonField<String> = JsonMissing.of()
        private var minimumAmount: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var maximum: JsonField<Maximum> = JsonMissing.of()
        private var minimum: JsonField<Minimum> = JsonMissing.of()
        private var discount: JsonField<Discount> = JsonMissing.of()
        private var product: JsonField<Product> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var trialConfig: JsonField<TrialConfig> = JsonMissing.of()
        private var planPhases: JsonField<List<PlanPhase>> = JsonMissing.of()
        private var basePlan: JsonField<BasePlan> = JsonMissing.of()
        private var basePlanId: JsonField<String> = JsonMissing.of()
        private var externalPlanId: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var invoicingCurrency: JsonField<String> = JsonMissing.of()
        private var netTerms: JsonField<Long> = JsonMissing.of()
        private var defaultInvoiceMemo: JsonField<String> = JsonMissing.of()
        private var prices: JsonField<List<Price>> = JsonMissing.of()
        private var adjustments: JsonField<List<Adjustment>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(plan: Plan) = apply {
            metadata = plan.metadata
            id = plan.id
            name = plan.name
            description = plan.description
            maximumAmount = plan.maximumAmount
            minimumAmount = plan.minimumAmount
            createdAt = plan.createdAt
            status = plan.status
            maximum = plan.maximum
            minimum = plan.minimum
            discount = plan.discount
            product = plan.product
            version = plan.version
            trialConfig = plan.trialConfig
            planPhases = plan.planPhases
            basePlan = plan.basePlan
            basePlanId = plan.basePlanId
            externalPlanId = plan.externalPlanId
            currency = plan.currency
            invoicingCurrency = plan.invoicingCurrency
            netTerms = plan.netTerms
            defaultInvoiceMemo = plan.defaultInvoiceMemo
            prices = plan.prices
            adjustments = plan.adjustments
            additionalProperties = plan.additionalProperties.toMutableMap()
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

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
        }

        fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

        fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

        fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

        fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

        fun discount(discount: Discount) = discount(JsonField.of(discount))

        fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

        fun product(product: Product) = product(JsonField.of(product))

        fun product(product: JsonField<Product>) = apply { this.product = product }

        fun version(version: Long) = version(JsonField.of(version))

        fun version(version: JsonField<Long>) = apply { this.version = version }

        fun trialConfig(trialConfig: TrialConfig) = trialConfig(JsonField.of(trialConfig))

        fun trialConfig(trialConfig: JsonField<TrialConfig>) = apply {
            this.trialConfig = trialConfig
        }

        fun planPhases(planPhases: List<PlanPhase>) = planPhases(JsonField.of(planPhases))

        fun planPhases(planPhases: JsonField<List<PlanPhase>>) = apply {
            this.planPhases = planPhases
        }

        fun basePlan(basePlan: BasePlan) = basePlan(JsonField.of(basePlan))

        fun basePlan(basePlan: JsonField<BasePlan>) = apply { this.basePlan = basePlan }

        /**
         * The parent plan id if the given plan was created by overriding one or more of the
         * parent's prices
         */
        fun basePlanId(basePlanId: String) = basePlanId(JsonField.of(basePlanId))

        /**
         * The parent plan id if the given plan was created by overriding one or more of the
         * parent's prices
         */
        fun basePlanId(basePlanId: JsonField<String>) = apply { this.basePlanId = basePlanId }

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        fun externalPlanId(externalPlanId: String) = externalPlanId(JsonField.of(externalPlanId))

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        fun externalPlanId(externalPlanId: JsonField<String>) = apply {
            this.externalPlanId = externalPlanId
        }

        /**
         * An ISO 4217 currency string or custom pricing unit (`credits`) for this plan's prices.
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * An ISO 4217 currency string or custom pricing unit (`credits`) for this plan's prices.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * An ISO 4217 currency string for which this plan is billed in. Matches `currency` unless
         * `currency` is a custom pricing unit.
         */
        fun invoicingCurrency(invoicingCurrency: String) =
            invoicingCurrency(JsonField.of(invoicingCurrency))

        /**
         * An ISO 4217 currency string for which this plan is billed in. Matches `currency` unless
         * `currency` is a custom pricing unit.
         */
        fun invoicingCurrency(invoicingCurrency: JsonField<String>) = apply {
            this.invoicingCurrency = invoicingCurrency
        }

        /**
         * Determines the difference between the invoice issue date and the due date. A value of "0"
         * here signifies that invoices are due on issue, whereas a value of "30" means that the
         * customer has a month to pay the invoice before its overdue. Note that individual
         * subscriptions or invoices may set a different net terms configuration.
         */
        fun netTerms(netTerms: Long) = netTerms(JsonField.of(netTerms))

        /**
         * Determines the difference between the invoice issue date and the due date. A value of "0"
         * here signifies that invoices are due on issue, whereas a value of "30" means that the
         * customer has a month to pay the invoice before its overdue. Note that individual
         * subscriptions or invoices may set a different net terms configuration.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

        /**
         * The default memo text on the invoices corresponding to subscriptions on this plan. Note
         * that each subscription may configure its own memo.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: String) =
            defaultInvoiceMemo(JsonField.of(defaultInvoiceMemo))

        /**
         * The default memo text on the invoices corresponding to subscriptions on this plan. Note
         * that each subscription may configure its own memo.
         */
        fun defaultInvoiceMemo(defaultInvoiceMemo: JsonField<String>) = apply {
            this.defaultInvoiceMemo = defaultInvoiceMemo
        }

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun prices(prices: List<Price>) = prices(JsonField.of(prices))

        /**
         * Prices for this plan. If the plan has phases, this includes prices across all phases of
         * the plan.
         */
        fun prices(prices: JsonField<List<Price>>) = apply { this.prices = prices }

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun adjustments(adjustments: List<Adjustment>) = adjustments(JsonField.of(adjustments))

        /**
         * Adjustments for this plan. If the plan has phases, this includes adjustments across all
         * phases of the plan.
         */
        fun adjustments(adjustments: JsonField<List<Adjustment>>) = apply {
            this.adjustments = adjustments
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

        fun build(): Plan =
            Plan(
                metadata,
                id,
                name,
                description,
                maximumAmount,
                minimumAmount,
                createdAt,
                status,
                maximum,
                minimum,
                discount,
                product,
                version,
                trialConfig,
                planPhases.map { it.toImmutable() },
                basePlan,
                basePlanId,
                externalPlanId,
                currency,
                invoicingCurrency,
                netTerms,
                defaultInvoiceMemo,
                prices.map { it.toImmutable() },
                adjustments.map { it.toImmutable() },
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

            fun visitAmountDiscountAdjustment(amountDiscountAdjustment: AmountDiscountAdjustment): T

            fun visitPercentageDiscountAdjustment(
                percentageDiscountAdjustment: PercentageDiscountAdjustment
            ): T

            fun visitUsageDiscountAdjustment(usageDiscountAdjustment: UsageDiscountAdjustment): T

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
                                return Adjustment(percentageDiscountAdjustment = it, _json = json)
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
                        tryDeserialize(node, jacksonTypeRef<MinimumAdjustment>()) { it.validate() }
                            ?.let {
                                return Adjustment(minimumAdjustment = it, _json = json)
                            }
                    }
                    "maximum" -> {
                        tryDeserialize(node, jacksonTypeRef<MaximumAdjustment>()) { it.validate() }
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
            @JsonProperty("is_invoice_level") @ExcludeMissing fun _isInvoiceLevel() = isInvoiceLevel

            /** The plan phase in which this adjustment is active. */
            @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

            /** The price IDs that this adjustment applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            /** The reason for the adjustment. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonProperty("adjustment_type") @ExcludeMissing fun _adjustmentType() = adjustmentType

            /**
             * The amount by which to discount the prices this adjustment applies to in a given
             * billing period.
             */
            @JsonProperty("amount_discount") @ExcludeMissing fun _amountDiscount() = amountDiscount

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
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
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
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
                 */
                fun amountDiscount(amountDiscount: String) =
                    amountDiscount(JsonField.of(amountDiscount))

                /**
                 * The amount by which to discount the prices this adjustment applies to in a given
                 * billing period.
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

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
             * The percentage (as a value between 0 and 1) by which to discount the price intervals
             * this adjustment applies to in a given billing period.
             */
            fun percentageDiscount(): Double = percentageDiscount.getRequired("percentage_discount")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            @JsonProperty("is_invoice_level") @ExcludeMissing fun _isInvoiceLevel() = isInvoiceLevel

            /** The plan phase in which this adjustment is active. */
            @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

            /** The price IDs that this adjustment applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            /** The reason for the adjustment. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonProperty("adjustment_type") @ExcludeMissing fun _adjustmentType() = adjustmentType

            /**
             * The percentage (as a value between 0 and 1) by which to discount the price intervals
             * this adjustment applies to in a given billing period.
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
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
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

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
             * The number of usage units by which to discount the price this adjustment applies to
             * in a given billing period.
             */
            fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            @JsonProperty("is_invoice_level") @ExcludeMissing fun _isInvoiceLevel() = isInvoiceLevel

            /** The plan phase in which this adjustment is active. */
            @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

            /** The price IDs that this adjustment applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            /** The reason for the adjustment. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonProperty("adjustment_type") @ExcludeMissing fun _adjustmentType() = adjustmentType

            /**
             * The number of usage units by which to discount the price this adjustment applies to
             * in a given billing period.
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
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
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
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
                 */
                fun usageDiscount(usageDiscount: Double) =
                    usageDiscount(JsonField.of(usageDiscount))

                /**
                 * The number of usage units by which to discount the price this adjustment applies
                 * to in a given billing period.
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

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
             * The minimum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /** The item ID that revenue from this minimum will be attributed to. */
            fun itemId(): String = itemId.getRequired("item_id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            @JsonProperty("is_invoice_level") @ExcludeMissing fun _isInvoiceLevel() = isInvoiceLevel

            /** The plan phase in which this adjustment is active. */
            @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

            /** The price IDs that this adjustment applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            /** The reason for the adjustment. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonProperty("adjustment_type") @ExcludeMissing fun _adjustmentType() = adjustmentType

            /**
             * The minimum amount to charge in a given billing period for the prices this adjustment
             * applies to.
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
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
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

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
             * The maximum amount to charge in a given billing period for the prices this adjustment
             * applies to.
             */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * True for adjustments that apply to an entire invocice, false for adjustments that
             * apply to only one price.
             */
            @JsonProperty("is_invoice_level") @ExcludeMissing fun _isInvoiceLevel() = isInvoiceLevel

            /** The plan phase in which this adjustment is active. */
            @JsonProperty("plan_phase_order") @ExcludeMissing fun _planPhaseOrder() = planPhaseOrder

            /** The price IDs that this adjustment applies to. */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            /** The reason for the adjustment. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonProperty("adjustment_type") @ExcludeMissing fun _adjustmentType() = adjustmentType

            /**
             * The maximum amount to charge in a given billing period for the prices this adjustment
             * applies to.
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
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
                 */
                fun isInvoiceLevel(isInvoiceLevel: Boolean) =
                    isInvoiceLevel(JsonField.of(isInvoiceLevel))

                /**
                 * True for adjustments that apply to an entire invocice, false for adjustments that
                 * apply to only one price.
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

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

    @NoAutoDetect
    class BasePlan
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        private val externalPlanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        fun externalPlanId(): Optional<String> =
            Optional.ofNullable(externalPlanId.getNullable("external_plan_id"))

        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        @JsonProperty("external_plan_id") @ExcludeMissing fun _externalPlanId() = externalPlanId

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BasePlan = apply {
            if (!validated) {
                id()
                externalPlanId()
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var externalPlanId: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(basePlan: BasePlan) = apply {
                id = basePlan.id
                externalPlanId = basePlan.externalPlanId
                name = basePlan.name
                additionalProperties = basePlan.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * An optional user-defined ID for this plan resource, used throughout the system as an
             * alias for this Plan. Use this field to identify a plan by an existing identifier in
             * your system.
             */
            fun externalPlanId(externalPlanId: String) =
                externalPlanId(JsonField.of(externalPlanId))

            /**
             * An optional user-defined ID for this plan resource, used throughout the system as an
             * alias for this Plan. Use this field to identify a plan by an existing identifier in
             * your system.
             */
            fun externalPlanId(externalPlanId: JsonField<String>) = apply {
                this.externalPlanId = externalPlanId
            }

            fun name(name: String) = name(JsonField.of(name))

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

            fun build(): BasePlan =
                BasePlan(
                    id,
                    externalPlanId,
                    name,
                    additionalProperties.toImmutable(),
                )
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

    @NoAutoDetect
    class Maximum
    @JsonCreator
    private constructor(
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Maximum amount applied */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** Maximum amount applied */
        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds() = appliesToPriceIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Maximum = apply {
            if (!validated) {
                maximumAmount()
                appliesToPriceIds()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(maximum: Maximum) = apply {
                maximumAmount = maximum.maximumAmount
                appliesToPriceIds = maximum.appliesToPriceIds
                additionalProperties = maximum.additionalProperties.toMutableMap()
            }

            /** Maximum amount applied */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /** Maximum amount applied */
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds
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

            fun build(): Maximum =
                Maximum(
                    maximumAmount,
                    appliesToPriceIds.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Maximum && maximumAmount == other.maximumAmount && appliesToPriceIds == other.appliesToPriceIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(maximumAmount, appliesToPriceIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"
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
    class Minimum
    @JsonCreator
    private constructor(
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Minimum amount applied */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** Minimum amount applied */
        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds() = appliesToPriceIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Minimum = apply {
            if (!validated) {
                minimumAmount()
                appliesToPriceIds()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimum: Minimum) = apply {
                minimumAmount = minimum.minimumAmount
                appliesToPriceIds = minimum.appliesToPriceIds
                additionalProperties = minimum.additionalProperties.toMutableMap()
            }

            /** Minimum amount applied */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /** Minimum amount applied */
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds
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

            fun build(): Minimum =
                Minimum(
                    minimumAmount,
                    appliesToPriceIds.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Minimum && minimumAmount == other.minimumAmount && appliesToPriceIds == other.appliesToPriceIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(minimumAmount, appliesToPriceIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class PlanPhase
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration")
        @ExcludeMissing
        private val duration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("duration_unit")
        @ExcludeMissing
        private val durationUnit: JsonField<DurationUnit> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order")
        @ExcludeMissing
        private val order: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("minimum")
        @ExcludeMissing
        private val minimum: JsonField<Minimum> = JsonMissing.of(),
        @JsonProperty("maximum")
        @ExcludeMissing
        private val maximum: JsonField<Maximum> = JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discount")
        @ExcludeMissing
        private val discount: JsonField<Discount> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * How many terms of length `duration_unit` this phase is active for. If null, this phase is
         * evergreen and active indefinitely
         */
        fun duration(): Optional<Long> = Optional.ofNullable(duration.getNullable("duration"))

        fun durationUnit(): Optional<DurationUnit> =
            Optional.ofNullable(durationUnit.getNullable("duration_unit"))

        fun name(): String = name.getRequired("name")

        /** Determines the ordering of the phase in a plan's lifecycle. 1 = first phase. */
        fun order(): Long = order.getRequired("order")

        fun minimum(): Optional<Minimum> = Optional.ofNullable(minimum.getNullable("minimum"))

        fun maximum(): Optional<Maximum> = Optional.ofNullable(maximum.getNullable("maximum"))

        fun maximumAmount(): Optional<String> =
            Optional.ofNullable(maximumAmount.getNullable("maximum_amount"))

        fun minimumAmount(): Optional<String> =
            Optional.ofNullable(minimumAmount.getNullable("minimum_amount"))

        fun discount(): Optional<Discount> = Optional.ofNullable(discount.getNullable("discount"))

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /**
         * How many terms of length `duration_unit` this phase is active for. If null, this phase is
         * evergreen and active indefinitely
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration() = duration

        @JsonProperty("duration_unit") @ExcludeMissing fun _durationUnit() = durationUnit

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** Determines the ordering of the phase in a plan's lifecycle. 1 = first phase. */
        @JsonProperty("order") @ExcludeMissing fun _order() = order

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PlanPhase = apply {
            if (!validated) {
                id()
                description()
                duration()
                durationUnit()
                name()
                order()
                minimum().map { it.validate() }
                maximum().map { it.validate() }
                maximumAmount()
                minimumAmount()
                discount()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var duration: JsonField<Long> = JsonMissing.of()
            private var durationUnit: JsonField<DurationUnit> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var order: JsonField<Long> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(planPhase: PlanPhase) = apply {
                id = planPhase.id
                description = planPhase.description
                duration = planPhase.duration
                durationUnit = planPhase.durationUnit
                name = planPhase.name
                order = planPhase.order
                minimum = planPhase.minimum
                maximum = planPhase.maximum
                maximumAmount = planPhase.maximumAmount
                minimumAmount = planPhase.minimumAmount
                discount = planPhase.discount
                additionalProperties = planPhase.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * How many terms of length `duration_unit` this phase is active for. If null, this
             * phase is evergreen and active indefinitely
             */
            fun duration(duration: Long) = duration(JsonField.of(duration))

            /**
             * How many terms of length `duration_unit` this phase is active for. If null, this
             * phase is evergreen and active indefinitely
             */
            fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

            fun durationUnit(durationUnit: DurationUnit) = durationUnit(JsonField.of(durationUnit))

            fun durationUnit(durationUnit: JsonField<DurationUnit>) = apply {
                this.durationUnit = durationUnit
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Determines the ordering of the phase in a plan's lifecycle. 1 = first phase. */
            fun order(order: Long) = order(JsonField.of(order))

            /** Determines the ordering of the phase in a plan's lifecycle. 1 = first phase. */
            fun order(order: JsonField<Long>) = apply { this.order = order }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

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

            fun build(): PlanPhase =
                PlanPhase(
                    id,
                    description,
                    duration,
                    durationUnit,
                    name,
                    order,
                    minimum,
                    maximum,
                    maximumAmount,
                    minimumAmount,
                    discount,
                    additionalProperties.toImmutable(),
                )
        }

        class DurationUnit
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DAILY = of("daily")

                @JvmField val MONTHLY = of("monthly")

                @JvmField val QUARTERLY = of("quarterly")

                @JvmField val SEMI_ANNUAL = of("semi_annual")

                @JvmField val ANNUAL = of("annual")

                @JvmStatic fun of(value: String) = DurationUnit(JsonField.of(value))
            }

            enum class Known {
                DAILY,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
            }

            enum class Value {
                DAILY,
                MONTHLY,
                QUARTERLY,
                SEMI_ANNUAL,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    DAILY -> Value.DAILY
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    SEMI_ANNUAL -> Value.SEMI_ANNUAL
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    DAILY -> Known.DAILY
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    SEMI_ANNUAL -> Known.SEMI_ANNUAL
                    ANNUAL -> Known.ANNUAL
                    else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Maximum
        @JsonCreator
        private constructor(
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            private val maximumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(maximum: Maximum) = apply {
                    maximumAmount = maximum.maximumAmount
                    appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties = maximum.additionalProperties.toMutableMap()
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
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

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Maximum && maximumAmount == other.maximumAmount && appliesToPriceIds == other.appliesToPriceIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(maximumAmount, appliesToPriceIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Minimum
        @JsonCreator
        private constructor(
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            private val minimumAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            private val appliesToPriceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(minimum: Minimum) = apply {
                    minimumAmount = minimum.minimumAmount
                    appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties = minimum.additionalProperties.toMutableMap()
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
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

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Minimum && minimumAmount == other.minimumAmount && appliesToPriceIds == other.appliesToPriceIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(minimumAmount, appliesToPriceIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PlanPhase && id == other.id && description == other.description && duration == other.duration && durationUnit == other.durationUnit && name == other.name && order == other.order && minimum == other.minimum && maximum == other.maximum && maximumAmount == other.maximumAmount && minimumAmount == other.minimumAmount && discount == other.discount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, description, duration, durationUnit, name, order, minimum, maximum, maximumAmount, minimumAmount, discount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlanPhase{id=$id, description=$description, duration=$duration, durationUnit=$durationUnit, name=$name, order=$order, minimum=$minimum, maximum=$maximum, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, discount=$discount, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Product
    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Product = apply {
            if (!validated) {
                createdAt()
                id()
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(product: Product) = apply {
                createdAt = product.createdAt
                id = product.id
                name = product.name
                additionalProperties = product.additionalProperties.toMutableMap()
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

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

            fun build(): Product =
                Product(
                    createdAt,
                    id,
                    name,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Product && createdAt == other.createdAt && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(createdAt, id, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Product{createdAt=$createdAt, id=$id, name=$name, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("active")

            @JvmField val ARCHIVED = of("archived")

            @JvmField val DRAFT = of("draft")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            ARCHIVED,
            DRAFT,
        }

        enum class Value {
            ACTIVE,
            ARCHIVED,
            DRAFT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                ARCHIVED -> Value.ARCHIVED
                DRAFT -> Value.DRAFT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                ARCHIVED -> Known.ARCHIVED
                DRAFT -> Known.DRAFT
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
    class TrialConfig
    @JsonCreator
    private constructor(
        @JsonProperty("trial_period")
        @ExcludeMissing
        private val trialPeriod: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("trial_period_unit")
        @ExcludeMissing
        private val trialPeriodUnit: JsonField<TrialPeriodUnit> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun trialPeriod(): Optional<Long> =
            Optional.ofNullable(trialPeriod.getNullable("trial_period"))

        fun trialPeriodUnit(): TrialPeriodUnit = trialPeriodUnit.getRequired("trial_period_unit")

        @JsonProperty("trial_period") @ExcludeMissing fun _trialPeriod() = trialPeriod

        @JsonProperty("trial_period_unit") @ExcludeMissing fun _trialPeriodUnit() = trialPeriodUnit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TrialConfig = apply {
            if (!validated) {
                trialPeriod()
                trialPeriodUnit()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var trialPeriod: JsonField<Long> = JsonMissing.of()
            private var trialPeriodUnit: JsonField<TrialPeriodUnit> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trialConfig: TrialConfig) = apply {
                trialPeriod = trialConfig.trialPeriod
                trialPeriodUnit = trialConfig.trialPeriodUnit
                additionalProperties = trialConfig.additionalProperties.toMutableMap()
            }

            fun trialPeriod(trialPeriod: Long) = trialPeriod(JsonField.of(trialPeriod))

            fun trialPeriod(trialPeriod: JsonField<Long>) = apply { this.trialPeriod = trialPeriod }

            fun trialPeriodUnit(trialPeriodUnit: TrialPeriodUnit) =
                trialPeriodUnit(JsonField.of(trialPeriodUnit))

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

            fun build(): TrialConfig =
                TrialConfig(
                    trialPeriod,
                    trialPeriodUnit,
                    additionalProperties.toImmutable(),
                )
        }

        class TrialPeriodUnit
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DAYS = of("days")

                @JvmStatic fun of(value: String) = TrialPeriodUnit(JsonField.of(value))
            }

            enum class Known {
                DAYS,
            }

            enum class Value {
                DAYS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    DAYS -> Value.DAYS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    DAYS -> Known.DAYS
                    else -> throw OrbInvalidDataException("Unknown TrialPeriodUnit: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is Plan && metadata == other.metadata && id == other.id && name == other.name && description == other.description && maximumAmount == other.maximumAmount && minimumAmount == other.minimumAmount && createdAt == other.createdAt && status == other.status && maximum == other.maximum && minimum == other.minimum && discount == other.discount && product == other.product && version == other.version && trialConfig == other.trialConfig && planPhases == other.planPhases && basePlan == other.basePlan && basePlanId == other.basePlanId && externalPlanId == other.externalPlanId && currency == other.currency && invoicingCurrency == other.invoicingCurrency && netTerms == other.netTerms && defaultInvoiceMemo == other.defaultInvoiceMemo && prices == other.prices && adjustments == other.adjustments && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(metadata, id, name, description, maximumAmount, minimumAmount, createdAt, status, maximum, minimum, discount, product, version, trialConfig, planPhases, basePlan, basePlanId, externalPlanId, currency, invoicingCurrency, netTerms, defaultInvoiceMemo, prices, adjustments, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Plan{metadata=$metadata, id=$id, name=$name, description=$description, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, createdAt=$createdAt, status=$status, maximum=$maximum, minimum=$minimum, discount=$discount, product=$product, version=$version, trialConfig=$trialConfig, planPhases=$planPhases, basePlan=$basePlan, basePlanId=$basePlanId, externalPlanId=$externalPlanId, currency=$currency, invoicingCurrency=$invoicingCurrency, netTerms=$netTerms, defaultInvoiceMemo=$defaultInvoiceMemo, prices=$prices, adjustments=$adjustments, additionalProperties=$additionalProperties}"
}
