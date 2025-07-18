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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or credit
 * balance and trigger webhooks when a threshold is exceeded.
 *
 * Alerts created through the API can be scoped to either customers or subscriptions.
 */
class Alert
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val customer: JsonField<CustomerMinified>,
    private val enabled: JsonField<Boolean>,
    private val metric: JsonField<Metric>,
    private val plan: JsonField<Plan>,
    private val subscription: JsonField<SubscriptionMinified>,
    private val thresholds: JsonField<List<Threshold>>,
    private val type: JsonField<Type>,
    private val balanceAlertStatus: JsonField<List<BalanceAlertStatus>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        customer: JsonField<CustomerMinified> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metric") @ExcludeMissing metric: JsonField<Metric> = JsonMissing.of(),
        @JsonProperty("plan") @ExcludeMissing plan: JsonField<Plan> = JsonMissing.of(),
        @JsonProperty("subscription")
        @ExcludeMissing
        subscription: JsonField<SubscriptionMinified> = JsonMissing.of(),
        @JsonProperty("thresholds")
        @ExcludeMissing
        thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("balance_alert_status")
        @ExcludeMissing
        balanceAlertStatus: JsonField<List<BalanceAlertStatus>> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        currency,
        customer,
        enabled,
        metric,
        plan,
        subscription,
        thresholds,
        type,
        balanceAlertStatus,
        mutableMapOf(),
    )

    /**
     * Also referred to as alert_id in this documentation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The creation time of the resource in Orb.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The name of the currency the credit balance or invoice cost is denominated in.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * The customer the alert applies to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun customer(): Optional<CustomerMinified> = customer.getOptional("customer")

    /**
     * Whether the alert is enabled or disabled.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enabled(): Boolean = enabled.getRequired("enabled")

    /**
     * The metric the alert applies to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun metric(): Optional<Metric> = metric.getOptional("metric")

    /**
     * The plan the alert applies to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun plan(): Optional<Plan> = plan.getOptional("plan")

    /**
     * The subscription the alert applies to.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun subscription(): Optional<SubscriptionMinified> = subscription.getOptional("subscription")

    /**
     * The thresholds that define the conditions under which the alert will be triggered.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun thresholds(): Optional<List<Threshold>> = thresholds.getOptional("thresholds")

    /**
     * The type of alert. This must be a valid alert type.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The current status of the alert. This field is only present for credit balance alerts.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun balanceAlertStatus(): Optional<List<BalanceAlertStatus>> =
        balanceAlertStatus.getOptional("balance_alert_status")

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
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer")
    @ExcludeMissing
    fun _customer(): JsonField<CustomerMinified> = customer

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [metric].
     *
     * Unlike [metric], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<Metric> = metric

    /**
     * Returns the raw JSON value of [plan].
     *
     * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

    /**
     * Returns the raw JSON value of [subscription].
     *
     * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<SubscriptionMinified> = subscription

    /**
     * Returns the raw JSON value of [thresholds].
     *
     * Unlike [thresholds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thresholds")
    @ExcludeMissing
    fun _thresholds(): JsonField<List<Threshold>> = thresholds

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [balanceAlertStatus].
     *
     * Unlike [balanceAlertStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("balance_alert_status")
    @ExcludeMissing
    fun _balanceAlertStatus(): JsonField<List<BalanceAlertStatus>> = balanceAlertStatus

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
         * Returns a mutable builder for constructing an instance of [Alert].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .currency()
         * .customer()
         * .enabled()
         * .metric()
         * .plan()
         * .subscription()
         * .thresholds()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Alert]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var customer: JsonField<CustomerMinified>? = null
        private var enabled: JsonField<Boolean>? = null
        private var metric: JsonField<Metric>? = null
        private var plan: JsonField<Plan>? = null
        private var subscription: JsonField<SubscriptionMinified>? = null
        private var thresholds: JsonField<MutableList<Threshold>>? = null
        private var type: JsonField<Type>? = null
        private var balanceAlertStatus: JsonField<MutableList<BalanceAlertStatus>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(alert: Alert) = apply {
            id = alert.id
            createdAt = alert.createdAt
            currency = alert.currency
            customer = alert.customer
            enabled = alert.enabled
            metric = alert.metric
            plan = alert.plan
            subscription = alert.subscription
            thresholds = alert.thresholds.map { it.toMutableList() }
            type = alert.type
            balanceAlertStatus = alert.balanceAlertStatus.map { it.toMutableList() }
            additionalProperties = alert.additionalProperties.toMutableMap()
        }

        /** Also referred to as alert_id in this documentation. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The name of the currency the credit balance or invoice cost is denominated in. */
        fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The customer the alert applies to. */
        fun customer(customer: CustomerMinified?) = customer(JsonField.ofNullable(customer))

        /** Alias for calling [Builder.customer] with `customer.orElse(null)`. */
        fun customer(customer: Optional<CustomerMinified>) = customer(customer.getOrNull())

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [CustomerMinified] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customer(customer: JsonField<CustomerMinified>) = apply { this.customer = customer }

        /** Whether the alert is enabled or disabled. */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /** The metric the alert applies to. */
        fun metric(metric: Metric?) = metric(JsonField.ofNullable(metric))

        /** Alias for calling [Builder.metric] with `metric.orElse(null)`. */
        fun metric(metric: Optional<Metric>) = metric(metric.getOrNull())

        /**
         * Sets [Builder.metric] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metric] with a well-typed [Metric] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun metric(metric: JsonField<Metric>) = apply { this.metric = metric }

        /** The plan the alert applies to. */
        fun plan(plan: Plan?) = plan(JsonField.ofNullable(plan))

        /** Alias for calling [Builder.plan] with `plan.orElse(null)`. */
        fun plan(plan: Optional<Plan>) = plan(plan.getOrNull())

        /**
         * Sets [Builder.plan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plan] with a well-typed [Plan] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** The subscription the alert applies to. */
        fun subscription(subscription: SubscriptionMinified?) =
            subscription(JsonField.ofNullable(subscription))

        /** Alias for calling [Builder.subscription] with `subscription.orElse(null)`. */
        fun subscription(subscription: Optional<SubscriptionMinified>) =
            subscription(subscription.getOrNull())

        /**
         * Sets [Builder.subscription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscription] with a well-typed [SubscriptionMinified]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subscription(subscription: JsonField<SubscriptionMinified>) = apply {
            this.subscription = subscription
        }

        /** The thresholds that define the conditions under which the alert will be triggered. */
        fun thresholds(thresholds: List<Threshold>?) = thresholds(JsonField.ofNullable(thresholds))

        /** Alias for calling [Builder.thresholds] with `thresholds.orElse(null)`. */
        fun thresholds(thresholds: Optional<List<Threshold>>) = thresholds(thresholds.getOrNull())

        /**
         * Sets [Builder.thresholds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thresholds] with a well-typed `List<Threshold>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
            this.thresholds = thresholds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Threshold] to [thresholds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addThreshold(threshold: Threshold) = apply {
            thresholds =
                (thresholds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("thresholds", it).add(threshold)
                }
        }

        /** The type of alert. This must be a valid alert type. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * The current status of the alert. This field is only present for credit balance alerts.
         */
        fun balanceAlertStatus(balanceAlertStatus: List<BalanceAlertStatus>?) =
            balanceAlertStatus(JsonField.ofNullable(balanceAlertStatus))

        /**
         * Alias for calling [Builder.balanceAlertStatus] with `balanceAlertStatus.orElse(null)`.
         */
        fun balanceAlertStatus(balanceAlertStatus: Optional<List<BalanceAlertStatus>>) =
            balanceAlertStatus(balanceAlertStatus.getOrNull())

        /**
         * Sets [Builder.balanceAlertStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceAlertStatus] with a well-typed
         * `List<BalanceAlertStatus>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun balanceAlertStatus(balanceAlertStatus: JsonField<List<BalanceAlertStatus>>) = apply {
            this.balanceAlertStatus = balanceAlertStatus.map { it.toMutableList() }
        }

        /**
         * Adds a single [BalanceAlertStatus] to [Builder.balanceAlertStatus].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBalanceAlertStatus(balanceAlertStatus: BalanceAlertStatus) = apply {
            this.balanceAlertStatus =
                (this.balanceAlertStatus ?: JsonField.of(mutableListOf())).also {
                    checkKnown("balanceAlertStatus", it).add(balanceAlertStatus)
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
         * Returns an immutable instance of [Alert].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .currency()
         * .customer()
         * .enabled()
         * .metric()
         * .plan()
         * .subscription()
         * .thresholds()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Alert =
            Alert(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("enabled", enabled),
                checkRequired("metric", metric),
                checkRequired("plan", plan),
                checkRequired("subscription", subscription),
                checkRequired("thresholds", thresholds).map { it.toImmutable() },
                checkRequired("type", type),
                (balanceAlertStatus ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Alert = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        currency()
        customer().ifPresent { it.validate() }
        enabled()
        metric().ifPresent { it.validate() }
        plan().ifPresent { it.validate() }
        subscription().ifPresent { it.validate() }
        thresholds().ifPresent { it.forEach { it.validate() } }
        type().validate()
        balanceAlertStatus().ifPresent { it.forEach { it.validate() } }
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (customer.asKnown().getOrNull()?.validity() ?: 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (metric.asKnown().getOrNull()?.validity() ?: 0) +
            (plan.asKnown().getOrNull()?.validity() ?: 0) +
            (subscription.asKnown().getOrNull()?.validity() ?: 0) +
            (thresholds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (balanceAlertStatus.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** The metric the alert applies to. */
    class Metric
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
             * Returns a mutable builder for constructing an instance of [Metric].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metric]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metric: Metric) = apply {
                id = metric.id
                additionalProperties = metric.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metric].
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
            fun build(): Metric =
                Metric(checkRequired("id", id), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Metric = apply {
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

            return /* spotless:off */ other is Metric && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metric{id=$id, additionalProperties=$additionalProperties}"
    }

    /** The plan the alert applies to. */
    class Plan
    private constructor(
        private val id: JsonField<String>,
        private val externalPlanId: JsonField<String>,
        private val name: JsonField<String>,
        private val planVersion: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_plan_id")
            @ExcludeMissing
            externalPlanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_version")
            @ExcludeMissing
            planVersion: JsonField<String> = JsonMissing.of(),
        ) : this(id, externalPlanId, name, planVersion, mutableMapOf())

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
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun planVersion(): String = planVersion.getRequired("plan_version")

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

        /**
         * Returns the raw JSON value of [planVersion].
         *
         * Unlike [planVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plan_version")
        @ExcludeMissing
        fun _planVersion(): JsonField<String> = planVersion

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
             * .externalPlanId()
             * .name()
             * .planVersion()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Plan]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var externalPlanId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var planVersion: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(plan: Plan) = apply {
                id = plan.id
                externalPlanId = plan.externalPlanId
                name = plan.name
                planVersion = plan.planVersion
                additionalProperties = plan.additionalProperties.toMutableMap()
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

            fun planVersion(planVersion: String) = planVersion(JsonField.of(planVersion))

            /**
             * Sets [Builder.planVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planVersion(planVersion: JsonField<String>) = apply {
                this.planVersion = planVersion
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
             * Returns an immutable instance of [Plan].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .externalPlanId()
             * .name()
             * .planVersion()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Plan =
                Plan(
                    checkRequired("id", id),
                    checkRequired("externalPlanId", externalPlanId),
                    checkRequired("name", name),
                    checkRequired("planVersion", planVersion),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Plan = apply {
            if (validated) {
                return@apply
            }

            id()
            externalPlanId()
            name()
            planVersion()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (planVersion.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Plan && id == other.id && externalPlanId == other.externalPlanId && name == other.name && planVersion == other.planVersion && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, externalPlanId, name, planVersion, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Plan{id=$id, externalPlanId=$externalPlanId, name=$name, planVersion=$planVersion, additionalProperties=$additionalProperties}"
    }

    /** The type of alert. This must be a valid alert type. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CREDIT_BALANCE_DEPLETED = of("credit_balance_depleted")

            @JvmField val CREDIT_BALANCE_DROPPED = of("credit_balance_dropped")

            @JvmField val CREDIT_BALANCE_RECOVERED = of("credit_balance_recovered")

            @JvmField val USAGE_EXCEEDED = of("usage_exceeded")

            @JvmField val COST_EXCEEDED = of("cost_exceeded")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_DROPPED,
            CREDIT_BALANCE_RECOVERED,
            USAGE_EXCEEDED,
            COST_EXCEEDED,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_DROPPED,
            CREDIT_BALANCE_RECOVERED,
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                CREDIT_BALANCE_DEPLETED -> Value.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_DROPPED -> Value.CREDIT_BALANCE_DROPPED
                CREDIT_BALANCE_RECOVERED -> Value.CREDIT_BALANCE_RECOVERED
                USAGE_EXCEEDED -> Value.USAGE_EXCEEDED
                COST_EXCEEDED -> Value.COST_EXCEEDED
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
                CREDIT_BALANCE_DEPLETED -> Known.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_DROPPED -> Known.CREDIT_BALANCE_DROPPED
                CREDIT_BALANCE_RECOVERED -> Known.CREDIT_BALANCE_RECOVERED
                USAGE_EXCEEDED -> Known.USAGE_EXCEEDED
                COST_EXCEEDED -> Known.COST_EXCEEDED
                else -> throw OrbInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Alert status is used to determine if an alert is currently in-alert or not. */
    class BalanceAlertStatus
    private constructor(
        private val inAlert: JsonField<Boolean>,
        private val thresholdValue: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("in_alert")
            @ExcludeMissing
            inAlert: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("threshold_value")
            @ExcludeMissing
            thresholdValue: JsonField<Double> = JsonMissing.of(),
        ) : this(inAlert, thresholdValue, mutableMapOf())

        /**
         * Whether the alert is currently in-alert or not.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inAlert(): Boolean = inAlert.getRequired("in_alert")

        /**
         * The value of the threshold that defines the alert status.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun thresholdValue(): Double = thresholdValue.getRequired("threshold_value")

        /**
         * Returns the raw JSON value of [inAlert].
         *
         * Unlike [inAlert], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("in_alert") @ExcludeMissing fun _inAlert(): JsonField<Boolean> = inAlert

        /**
         * Returns the raw JSON value of [thresholdValue].
         *
         * Unlike [thresholdValue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("threshold_value")
        @ExcludeMissing
        fun _thresholdValue(): JsonField<Double> = thresholdValue

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
             * Returns a mutable builder for constructing an instance of [BalanceAlertStatus].
             *
             * The following fields are required:
             * ```java
             * .inAlert()
             * .thresholdValue()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BalanceAlertStatus]. */
        class Builder internal constructor() {

            private var inAlert: JsonField<Boolean>? = null
            private var thresholdValue: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balanceAlertStatus: BalanceAlertStatus) = apply {
                inAlert = balanceAlertStatus.inAlert
                thresholdValue = balanceAlertStatus.thresholdValue
                additionalProperties = balanceAlertStatus.additionalProperties.toMutableMap()
            }

            /** Whether the alert is currently in-alert or not. */
            fun inAlert(inAlert: Boolean) = inAlert(JsonField.of(inAlert))

            /**
             * Sets [Builder.inAlert] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inAlert] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inAlert(inAlert: JsonField<Boolean>) = apply { this.inAlert = inAlert }

            /** The value of the threshold that defines the alert status. */
            fun thresholdValue(thresholdValue: Double) =
                thresholdValue(JsonField.of(thresholdValue))

            /**
             * Sets [Builder.thresholdValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thresholdValue] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun thresholdValue(thresholdValue: JsonField<Double>) = apply {
                this.thresholdValue = thresholdValue
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
             * Returns an immutable instance of [BalanceAlertStatus].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .inAlert()
             * .thresholdValue()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BalanceAlertStatus =
                BalanceAlertStatus(
                    checkRequired("inAlert", inAlert),
                    checkRequired("thresholdValue", thresholdValue),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BalanceAlertStatus = apply {
            if (validated) {
                return@apply
            }

            inAlert()
            thresholdValue()
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
            (if (inAlert.asKnown().isPresent) 1 else 0) +
                (if (thresholdValue.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BalanceAlertStatus && inAlert == other.inAlert && thresholdValue == other.thresholdValue && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(inAlert, thresholdValue, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BalanceAlertStatus{inAlert=$inAlert, thresholdValue=$thresholdValue, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Alert && id == other.id && createdAt == other.createdAt && currency == other.currency && customer == other.customer && enabled == other.enabled && metric == other.metric && plan == other.plan && subscription == other.subscription && thresholds == other.thresholds && type == other.type && balanceAlertStatus == other.balanceAlertStatus && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, currency, customer, enabled, metric, plan, subscription, thresholds, type, balanceAlertStatus, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Alert{id=$id, createdAt=$createdAt, currency=$currency, customer=$customer, enabled=$enabled, metric=$metric, plan=$plan, subscription=$subscription, thresholds=$thresholds, type=$type, balanceAlertStatus=$balanceAlertStatus, additionalProperties=$additionalProperties}"
}
