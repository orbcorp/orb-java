// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
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
@JsonDeserialize(builder = Alert.Builder::class)
@NoAutoDetect
class Alert
private constructor(
    private val id: JsonField<String>,
    private val type: JsonField<Type>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val enabled: JsonField<Boolean>,
    private val thresholds: JsonField<List<Threshold>>,
    private val customer: JsonField<Customer>,
    private val plan: JsonField<Plan>,
    private val subscription: JsonField<Subscription>,
    private val metric: JsonField<Metric>,
    private val currency: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Alert &&
            this.id == other.id &&
            this.type == other.type &&
            this.createdAt == other.createdAt &&
            this.enabled == other.enabled &&
            this.thresholds == other.thresholds &&
            this.customer == other.customer &&
            this.plan == other.plan &&
            this.subscription == other.subscription &&
            this.metric == other.metric &&
            this.currency == other.currency &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    type,
                    createdAt,
                    enabled,
                    thresholds,
                    customer,
                    plan,
                    subscription,
                    metric,
                    currency,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Alert{id=$id, type=$type, createdAt=$createdAt, enabled=$enabled, thresholds=$thresholds, customer=$customer, plan=$plan, subscription=$subscription, metric=$metric, currency=$currency, additionalProperties=$additionalProperties}"

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
            this.id = alert.id
            this.type = alert.type
            this.createdAt = alert.createdAt
            this.enabled = alert.enabled
            this.thresholds = alert.thresholds
            this.customer = alert.customer
            this.plan = alert.plan
            this.subscription = alert.subscription
            this.metric = alert.metric
            this.currency = alert.currency
            additionalProperties(alert.additionalProperties)
        }

        /** Also referred to as alert_id in this documentation. */
        fun id(id: String) = id(JsonField.of(id))

        /** Also referred to as alert_id in this documentation. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The type of alert. This must be a valid alert type. */
        fun type(type: Type) = type(JsonField.of(type))

        /** The type of alert. This must be a valid alert type. */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The creation time of the resource in Orb. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Whether the alert is enabled or disabled. */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /** Whether the alert is enabled or disabled. */
        @JsonProperty("enabled")
        @ExcludeMissing
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /** The thresholds that define the conditions under which the alert will be triggered. */
        fun thresholds(thresholds: List<Threshold>) = thresholds(JsonField.of(thresholds))

        /** The thresholds that define the conditions under which the alert will be triggered. */
        @JsonProperty("thresholds")
        @ExcludeMissing
        fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
            this.thresholds = thresholds
        }

        /** The customer the alert applies to. */
        fun customer(customer: Customer) = customer(JsonField.of(customer))

        /** The customer the alert applies to. */
        @JsonProperty("customer")
        @ExcludeMissing
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /** The plan the alert applies to. */
        fun plan(plan: Plan) = plan(JsonField.of(plan))

        /** The plan the alert applies to. */
        @JsonProperty("plan")
        @ExcludeMissing
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** The subscription the alert applies to. */
        fun subscription(subscription: Subscription) = subscription(JsonField.of(subscription))

        /** The subscription the alert applies to. */
        @JsonProperty("subscription")
        @ExcludeMissing
        fun subscription(subscription: JsonField<Subscription>) = apply {
            this.subscription = subscription
        }

        /** The metric the alert applies to. */
        fun metric(metric: Metric) = metric(JsonField.of(metric))

        /** The metric the alert applies to. */
        @JsonProperty("metric")
        @ExcludeMissing
        fun metric(metric: JsonField<Metric>) = apply { this.metric = metric }

        /** The name of the currency the credit balance or invoice cost is denominated in. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The name of the currency the credit balance or invoice cost is denominated in. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Alert =
            Alert(
                id,
                type,
                createdAt,
                enabled,
                thresholds.map { it.toUnmodifiable() },
                customer,
                plan,
                subscription,
                metric,
                currency,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** The customer the alert applies to. */
    @JsonDeserialize(builder = Customer.Builder::class)
    @NoAutoDetect
    class Customer
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Customer = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Customer && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Customer{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customer: Customer) = apply {
                additionalProperties(customer.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Customer = Customer(additionalProperties.toUnmodifiable())
        }
    }

    /** The metric the alert applies to. */
    @JsonDeserialize(builder = Metric.Builder::class)
    @NoAutoDetect
    class Metric
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metric = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metric && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metric{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metric: Metric) = apply {
                additionalProperties(metric.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Metric = Metric(additionalProperties.toUnmodifiable())
        }
    }

    /** The plan the alert applies to. */
    @JsonDeserialize(builder = Plan.Builder::class)
    @NoAutoDetect
    class Plan
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Plan = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Plan && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Plan{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(plan: Plan) = apply {
                additionalProperties(plan.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Plan = Plan(additionalProperties.toUnmodifiable())
        }
    }

    /** The subscription the alert applies to. */
    @JsonDeserialize(builder = Subscription.Builder::class)
    @NoAutoDetect
    class Subscription
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Subscription = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Subscription && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Subscription{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscription: Subscription) = apply {
                additionalProperties(subscription.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Subscription = Subscription(additionalProperties.toUnmodifiable())
        }
    }

    /** Thresholds are used to define the conditions under which an alert will be triggered. */
    @JsonDeserialize(builder = Threshold.Builder::class)
    @NoAutoDetect
    class Threshold
    private constructor(
        private val value: JsonField<Double>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

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

        fun validate(): Threshold = apply {
            if (!validated) {
                value()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Threshold &&
                this.value == other.value &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(value, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "Threshold{value=$value, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var value: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(threshold: Threshold) = apply {
                this.value = threshold.value
                additionalProperties(threshold.additionalProperties)
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
            @JsonProperty("value")
            @ExcludeMissing
            fun value(value: JsonField<Double>) = apply { this.value = value }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Threshold = Threshold(value, additionalProperties.toUnmodifiable())
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val USAGE_EXCEEDED = Type(JsonField.of("usage_exceeded"))

            @JvmField val COST_EXCEEDED = Type(JsonField.of("cost_exceeded"))

            @JvmField val CREDIT_BALANCE_DEPLETED = Type(JsonField.of("credit_balance_depleted"))

            @JvmField val CREDIT_BALANCE_DROPPED = Type(JsonField.of("credit_balance_dropped"))

            @JvmField val CREDIT_BALANCE_RECOVERED = Type(JsonField.of("credit_balance_recovered"))

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
    }
}
