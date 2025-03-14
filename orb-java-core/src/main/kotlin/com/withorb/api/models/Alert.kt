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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or credit
 * balance and trigger webhooks when a threshold is exceeded.
 *
 * Alerts created through the API can be scoped to either customers or subscriptions.
 */
@NoAutoDetect
class Alert
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<Customer> = JsonMissing.of(),
    @JsonProperty("enabled")
    @ExcludeMissing
    private val enabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metric")
    @ExcludeMissing
    private val metric: JsonField<Metric> = JsonMissing.of(),
    @JsonProperty("plan") @ExcludeMissing private val plan: JsonField<Plan> = JsonMissing.of(),
    @JsonProperty("subscription")
    @ExcludeMissing
    private val subscription: JsonField<Subscription> = JsonMissing.of(),
    @JsonProperty("thresholds")
    @ExcludeMissing
    private val thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Also referred to as alert_id in this documentation. */
    fun id(): String = id.getRequired("id")

    /** The creation time of the resource in Orb. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The name of the currency the credit balance or invoice cost is denominated in. */
    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    /** The customer the alert applies to. */
    fun customer(): Optional<Customer> = Optional.ofNullable(customer.getNullable("customer"))

    /** Whether the alert is enabled or disabled. */
    fun enabled(): Boolean = enabled.getRequired("enabled")

    /** The metric the alert applies to. */
    fun metric(): Optional<Metric> = Optional.ofNullable(metric.getNullable("metric"))

    /** The plan the alert applies to. */
    fun plan(): Optional<Plan> = Optional.ofNullable(plan.getNullable("plan"))

    /** The subscription the alert applies to. */
    fun subscription(): Optional<Subscription> =
        Optional.ofNullable(subscription.getNullable("subscription"))

    /** The thresholds that define the conditions under which the alert will be triggered. */
    fun thresholds(): Optional<List<Threshold>> =
        Optional.ofNullable(thresholds.getNullable("thresholds"))

    /** The type of alert. This must be a valid alert type. */
    fun type(): Type = type.getRequired("type")

    /** Also referred to as alert_id in this documentation. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The creation time of the resource in Orb. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The name of the currency the credit balance or invoice cost is denominated in. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /** The customer the alert applies to. */
    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    /** Whether the alert is enabled or disabled. */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /** The metric the alert applies to. */
    @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<Metric> = metric

    /** The plan the alert applies to. */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

    /** The subscription the alert applies to. */
    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<Subscription> = subscription

    /** The thresholds that define the conditions under which the alert will be triggered. */
    @JsonProperty("thresholds")
    @ExcludeMissing
    fun _thresholds(): JsonField<List<Threshold>> = thresholds

    /** The type of alert. This must be a valid alert type. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
        type()
        validated = true
    }

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
        private var customer: JsonField<Customer>? = null
        private var enabled: JsonField<Boolean>? = null
        private var metric: JsonField<Metric>? = null
        private var plan: JsonField<Plan>? = null
        private var subscription: JsonField<Subscription>? = null
        private var thresholds: JsonField<MutableList<Threshold>>? = null
        private var type: JsonField<Type>? = null
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
            additionalProperties = alert.additionalProperties.toMutableMap()
        }

        /** Also referred to as alert_id in this documentation. */
        fun id(id: String) = id(JsonField.of(id))

        /** Also referred to as alert_id in this documentation. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The name of the currency the credit balance or invoice cost is denominated in. */
        fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

        /** The name of the currency the credit balance or invoice cost is denominated in. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /** The name of the currency the credit balance or invoice cost is denominated in. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The customer the alert applies to. */
        fun customer(customer: Customer?) = customer(JsonField.ofNullable(customer))

        /** The customer the alert applies to. */
        fun customer(customer: Optional<Customer>) = customer(customer.getOrNull())

        /** The customer the alert applies to. */
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /** Whether the alert is enabled or disabled. */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /** Whether the alert is enabled or disabled. */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /** The metric the alert applies to. */
        fun metric(metric: Metric?) = metric(JsonField.ofNullable(metric))

        /** The metric the alert applies to. */
        fun metric(metric: Optional<Metric>) = metric(metric.getOrNull())

        /** The metric the alert applies to. */
        fun metric(metric: JsonField<Metric>) = apply { this.metric = metric }

        /** The plan the alert applies to. */
        fun plan(plan: Plan?) = plan(JsonField.ofNullable(plan))

        /** The plan the alert applies to. */
        fun plan(plan: Optional<Plan>) = plan(plan.getOrNull())

        /** The plan the alert applies to. */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** The subscription the alert applies to. */
        fun subscription(subscription: Subscription?) =
            subscription(JsonField.ofNullable(subscription))

        /** The subscription the alert applies to. */
        fun subscription(subscription: Optional<Subscription>) =
            subscription(subscription.getOrNull())

        /** The subscription the alert applies to. */
        fun subscription(subscription: JsonField<Subscription>) = apply {
            this.subscription = subscription
        }

        /** The thresholds that define the conditions under which the alert will be triggered. */
        fun thresholds(thresholds: List<Threshold>?) = thresholds(JsonField.ofNullable(thresholds))

        /** The thresholds that define the conditions under which the alert will be triggered. */
        fun thresholds(thresholds: Optional<List<Threshold>>) = thresholds(thresholds.getOrNull())

        /** The thresholds that define the conditions under which the alert will be triggered. */
        fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
            this.thresholds = thresholds.map { it.toMutableList() }
        }

        /** The thresholds that define the conditions under which the alert will be triggered. */
        fun addThreshold(threshold: Threshold) = apply {
            thresholds =
                (thresholds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("thresholds", it).add(threshold)
                }
        }

        /** The type of alert. This must be a valid alert type. */
        fun type(type: Type) = type(JsonField.of(type))

        /** The type of alert. This must be a valid alert type. */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
                additionalProperties.toImmutable(),
            )
    }

    /** The customer the alert applies to. */
    @NoAutoDetect
    class Customer
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        private val externalCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun externalCustomerId(): Optional<String> =
            Optional.ofNullable(externalCustomerId.getNullable("external_customer_id"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Customer = apply {
            if (validated) {
                return@apply
            }

            id()
            externalCustomerId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Customer].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .externalCustomerId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Customer]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var externalCustomerId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customer: Customer) = apply {
                id = customer.id
                externalCustomerId = customer.externalCustomerId
                additionalProperties = customer.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            fun externalCustomerId(externalCustomerId: Optional<String>) =
                externalCustomerId(externalCustomerId.getOrNull())

            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
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

            fun build(): Customer =
                Customer(
                    checkRequired("id", id),
                    checkRequired("externalCustomerId", externalCustomerId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Customer && id == other.id && externalCustomerId == other.externalCustomerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, externalCustomerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Customer{id=$id, externalCustomerId=$externalCustomerId, additionalProperties=$additionalProperties}"
    }

    /** The metric the alert applies to. */
    @NoAutoDetect
    class Metric
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metric = apply {
            if (validated) {
                return@apply
            }

            id()
            validated = true
        }

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

            fun build(): Metric =
                Metric(checkRequired("id", id), additionalProperties.toImmutable())
        }

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
    @NoAutoDetect
    class Plan
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        private val externalPlanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plan_version")
        @ExcludeMissing
        private val planVersion: JsonField<String> = JsonMissing.of(),
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

        fun planVersion(): String = planVersion.getRequired("plan_version")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        fun _externalPlanId(): JsonField<String> = externalPlanId

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("plan_version")
        @ExcludeMissing
        fun _planVersion(): JsonField<String> = planVersion

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun id(id: Optional<String>) = id(id.getOrNull())

            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * An optional user-defined ID for this plan resource, used throughout the system as an
             * alias for this Plan. Use this field to identify a plan by an existing identifier in
             * your system.
             */
            fun externalPlanId(externalPlanId: String?) =
                externalPlanId(JsonField.ofNullable(externalPlanId))

            /**
             * An optional user-defined ID for this plan resource, used throughout the system as an
             * alias for this Plan. Use this field to identify a plan by an existing identifier in
             * your system.
             */
            fun externalPlanId(externalPlanId: Optional<String>) =
                externalPlanId(externalPlanId.getOrNull())

            /**
             * An optional user-defined ID for this plan resource, used throughout the system as an
             * alias for this Plan. Use this field to identify a plan by an existing identifier in
             * your system.
             */
            fun externalPlanId(externalPlanId: JsonField<String>) = apply {
                this.externalPlanId = externalPlanId
            }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            fun name(name: Optional<String>) = name(name.getOrNull())

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun planVersion(planVersion: String) = planVersion(JsonField.of(planVersion))

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

            fun build(): Plan =
                Plan(
                    checkRequired("id", id),
                    checkRequired("externalPlanId", externalPlanId),
                    checkRequired("name", name),
                    checkRequired("planVersion", planVersion),
                    additionalProperties.toImmutable(),
                )
        }

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

    /** The subscription the alert applies to. */
    @NoAutoDetect
    class Subscription
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Subscription = apply {
            if (validated) {
                return@apply
            }

            id()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Subscription].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Subscription]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscription: Subscription) = apply {
                id = subscription.id
                additionalProperties = subscription.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

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

            fun build(): Subscription =
                Subscription(checkRequired("id", id), additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Subscription && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Subscription{id=$id, additionalProperties=$additionalProperties}"
    }

    /** Thresholds are used to define the conditions under which an alert will be triggered. */
    @NoAutoDetect
    class Threshold
    @JsonCreator
    private constructor(
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The value at which an alert will fire. For credit balance alerts, the alert will fire at
         * or below this value. For usage and cost alerts, the alert will fire at or above this
         * value.
         */
        fun value(): Double = value.getRequired("value")

        /**
         * The value at which an alert will fire. For credit balance alerts, the alert will fire at
         * or below this value. For usage and cost alerts, the alert will fire at or above this
         * value.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Threshold = apply {
            if (validated) {
                return@apply
            }

            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Threshold].
             *
             * The following fields are required:
             * ```java
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Threshold]. */
        class Builder internal constructor() {

            private var value: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(threshold: Threshold) = apply {
                value = threshold.value
                additionalProperties = threshold.additionalProperties.toMutableMap()
            }

            /**
             * The value at which an alert will fire. For credit balance alerts, the alert will fire
             * at or below this value. For usage and cost alerts, the alert will fire at or above
             * this value.
             */
            fun value(value: Double) = value(JsonField.of(value))

            /**
             * The value at which an alert will fire. For credit balance alerts, the alert will fire
             * at or below this value. For usage and cost alerts, the alert will fire at or above
             * this value.
             */
            fun value(value: JsonField<Double>) = apply { this.value = value }

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

            fun build(): Threshold =
                Threshold(checkRequired("value", value), additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Threshold && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Threshold{value=$value, additionalProperties=$additionalProperties}"
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Alert && id == other.id && createdAt == other.createdAt && currency == other.currency && customer == other.customer && enabled == other.enabled && metric == other.metric && plan == other.plan && subscription == other.subscription && thresholds == other.thresholds && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, currency, customer, enabled, metric, plan, subscription, thresholds, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Alert{id=$id, createdAt=$createdAt, currency=$currency, customer=$customer, enabled=$enabled, metric=$metric, plan=$plan, subscription=$subscription, thresholds=$thresholds, type=$type, additionalProperties=$additionalProperties}"
}
