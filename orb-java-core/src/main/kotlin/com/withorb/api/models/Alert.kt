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
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * [Alerts within Orb](https://docs.withorb.com/guides/product-catalog/configuring-alerts) monitor
 * spending, usage, or credit balance and trigger webhooks when a threshold is exceeded.
 *
 * Alerts created through the API can be scoped to either customers or subscriptions.
 *
 * |Scope       |Monitors                      |Vaild Alert Types                                                                  |
 * |------------|------------------------------|-----------------------------------------------------------------------------------|
 * |Customer    |A customer's credit balance   |`credit_balance_depleted`, `credit_balance_recovered`, and `credit_balance_dropped`|
 * |Subscription|A subscription's usage or cost|`usage_exceeded` and `cost_exceeded`                                               |
 */
@NoAutoDetect
class Alert
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("enabled")
    @ExcludeMissing
    private val enabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("thresholds")
    @ExcludeMissing
    private val thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<Customer> = JsonMissing.of(),
    @JsonProperty("plan") @ExcludeMissing private val plan: JsonField<Plan> = JsonMissing.of(),
    @JsonProperty("subscription")
    @ExcludeMissing
    private val subscription: JsonField<Subscription> = JsonMissing.of(),
    @JsonProperty("metric")
    @ExcludeMissing
    private val metric: JsonField<Metric> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Also referred to as alert_id in this documentation. */
    fun id(): String = id.getRequired("id")

    /** The type of alert. This must be a valid alert type. */
    fun type(): Type = type.getRequired("type")

    /** The creation time of the resource in Orb. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** Whether the alert is enabled or disabled. */
    fun enabled(): Boolean = enabled.getRequired("enabled")

    /** The thresholds that define the conditions under which the alert will be triggered. */
    fun thresholds(): Optional<List<Threshold>> =
        Optional.ofNullable(thresholds.getNullable("thresholds"))

    /** The customer the alert applies to. */
    fun customer(): Optional<Customer> = Optional.ofNullable(customer.getNullable("customer"))

    /** The plan the alert applies to. */
    fun plan(): Optional<Plan> = Optional.ofNullable(plan.getNullable("plan"))

    /** The subscription the alert applies to. */
    fun subscription(): Optional<Subscription> =
        Optional.ofNullable(subscription.getNullable("subscription"))

    /** The metric the alert applies to. */
    fun metric(): Optional<Metric> = Optional.ofNullable(metric.getNullable("metric"))

    /** The name of the currency the credit balance or invoice cost is denominated in. */
    fun currency(): Optional<String> = Optional.ofNullable(currency.getNullable("currency"))

    /** Also referred to as alert_id in this documentation. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The type of alert. This must be a valid alert type. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** The creation time of the resource in Orb. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** Whether the alert is enabled or disabled. */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled() = enabled

    /** The thresholds that define the conditions under which the alert will be triggered. */
    @JsonProperty("thresholds") @ExcludeMissing fun _thresholds() = thresholds

    /** The customer the alert applies to. */
    @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

    /** The plan the alert applies to. */
    @JsonProperty("plan") @ExcludeMissing fun _plan() = plan

    /** The subscription the alert applies to. */
    @JsonProperty("subscription") @ExcludeMissing fun _subscription() = subscription

    /** The metric the alert applies to. */
    @JsonProperty("metric") @ExcludeMissing fun _metric() = metric

    /** The name of the currency the credit balance or invoice cost is denominated in. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Alert = apply {
        if (!validated) {
            id()
            type()
            createdAt()
            enabled()
            thresholds().map { it.forEach { it.validate() } }
            customer().map { it.validate() }
            plan().map { it.validate() }
            subscription().map { it.validate() }
            metric().map { it.validate() }
            currency()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var thresholds: JsonField<List<Threshold>> = JsonMissing.of()
        private var customer: JsonField<Customer> = JsonMissing.of()
        private var plan: JsonField<Plan> = JsonMissing.of()
        private var subscription: JsonField<Subscription> = JsonMissing.of()
        private var metric: JsonField<Metric> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(alert: Alert) = apply {
            id = alert.id
            type = alert.type
            createdAt = alert.createdAt
            enabled = alert.enabled
            thresholds = alert.thresholds
            customer = alert.customer
            plan = alert.plan
            subscription = alert.subscription
            metric = alert.metric
            currency = alert.currency
            additionalProperties = alert.additionalProperties.toMutableMap()
        }

        /** Also referred to as alert_id in this documentation. */
        fun id(id: String) = id(JsonField.of(id))

        /** Also referred to as alert_id in this documentation. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The type of alert. This must be a valid alert type. */
        fun type(type: Type) = type(JsonField.of(type))

        /** The type of alert. This must be a valid alert type. */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Whether the alert is enabled or disabled. */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /** Whether the alert is enabled or disabled. */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /** The thresholds that define the conditions under which the alert will be triggered. */
        fun thresholds(thresholds: List<Threshold>) = thresholds(JsonField.of(thresholds))

        /** The thresholds that define the conditions under which the alert will be triggered. */
        fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
            this.thresholds = thresholds
        }

        /** The customer the alert applies to. */
        fun customer(customer: Customer) = customer(JsonField.of(customer))

        /** The customer the alert applies to. */
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /** The plan the alert applies to. */
        fun plan(plan: Plan) = plan(JsonField.of(plan))

        /** The plan the alert applies to. */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** The subscription the alert applies to. */
        fun subscription(subscription: Subscription) = subscription(JsonField.of(subscription))

        /** The subscription the alert applies to. */
        fun subscription(subscription: JsonField<Subscription>) = apply {
            this.subscription = subscription
        }

        /** The metric the alert applies to. */
        fun metric(metric: Metric) = metric(JsonField.of(metric))

        /** The metric the alert applies to. */
        fun metric(metric: JsonField<Metric>) = apply { this.metric = metric }

        /** The name of the currency the credit balance or invoice cost is denominated in. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The name of the currency the credit balance or invoice cost is denominated in. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                id,
                type,
                createdAt,
                enabled,
                thresholds.map { it.toImmutable() },
                customer,
                plan,
                subscription,
                metric,
                currency,
                additionalProperties.toImmutable(),
            )
    }

    /** The customer the alert applies to. */
    @NoAutoDetect
    class Customer
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Customer = apply {
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
            internal fun from(customer: Customer) = apply {
                additionalProperties = customer.additionalProperties.toMutableMap()
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

            fun build(): Customer = Customer(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Customer && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Customer{additionalProperties=$additionalProperties}"
    }

    /** The metric the alert applies to. */
    @NoAutoDetect
    class Metric
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metric = apply {
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
            internal fun from(metric: Metric) = apply {
                additionalProperties = metric.additionalProperties.toMutableMap()
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

            fun build(): Metric = Metric(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metric && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metric{additionalProperties=$additionalProperties}"
    }

    /** The plan the alert applies to. */
    @NoAutoDetect
    class Plan
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Plan = apply {
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
            internal fun from(plan: Plan) = apply {
                additionalProperties = plan.additionalProperties.toMutableMap()
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

            fun build(): Plan = Plan(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Plan && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Plan{additionalProperties=$additionalProperties}"
    }

    /** The subscription the alert applies to. */
    @NoAutoDetect
    class Subscription
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Subscription = apply {
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
            internal fun from(subscription: Subscription) = apply {
                additionalProperties = subscription.additionalProperties.toMutableMap()
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

            fun build(): Subscription = Subscription(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Subscription && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Subscription{additionalProperties=$additionalProperties}"
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
        @JsonProperty("value") @ExcludeMissing fun _value() = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Threshold = apply {
            if (!validated) {
                value()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var value: JsonField<Double> = JsonMissing.of()
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

            fun build(): Threshold = Threshold(value, additionalProperties.toImmutable())
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val USAGE_EXCEEDED = of("usage_exceeded")

            @JvmField val COST_EXCEEDED = of("cost_exceeded")

            @JvmField val CREDIT_BALANCE_DEPLETED = of("credit_balance_depleted")

            @JvmField val CREDIT_BALANCE_DROPPED = of("credit_balance_dropped")

            @JvmField val CREDIT_BALANCE_RECOVERED = of("credit_balance_recovered")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_DROPPED,
            CREDIT_BALANCE_RECOVERED,
        }

        enum class Value {
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_DROPPED,
            CREDIT_BALANCE_RECOVERED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USAGE_EXCEEDED -> Value.USAGE_EXCEEDED
                COST_EXCEEDED -> Value.COST_EXCEEDED
                CREDIT_BALANCE_DEPLETED -> Value.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_DROPPED -> Value.CREDIT_BALANCE_DROPPED
                CREDIT_BALANCE_RECOVERED -> Value.CREDIT_BALANCE_RECOVERED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USAGE_EXCEEDED -> Known.USAGE_EXCEEDED
                COST_EXCEEDED -> Known.COST_EXCEEDED
                CREDIT_BALANCE_DEPLETED -> Known.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_DROPPED -> Known.CREDIT_BALANCE_DROPPED
                CREDIT_BALANCE_RECOVERED -> Known.CREDIT_BALANCE_RECOVERED
                else -> throw OrbInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is Alert && id == other.id && type == other.type && createdAt == other.createdAt && enabled == other.enabled && thresholds == other.thresholds && customer == other.customer && plan == other.plan && subscription == other.subscription && metric == other.metric && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, type, createdAt, enabled, thresholds, customer, plan, subscription, metric, currency, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Alert{id=$id, type=$type, createdAt=$createdAt, enabled=$enabled, thresholds=$thresholds, customer=$customer, plan=$plan, subscription=$subscription, metric=$metric, currency=$currency, additionalProperties=$additionalProperties}"
}
