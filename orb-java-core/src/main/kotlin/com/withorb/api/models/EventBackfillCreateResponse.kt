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
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * A backfill represents an update to historical usage data, adding or replacing events in a
 * timeframe.
 */
@JsonDeserialize(builder = EventBackfillCreateResponse.Builder::class)
@NoAutoDetect
class EventBackfillCreateResponse
private constructor(
    private val id: JsonField<String>,
    private val status: JsonField<Status>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val timeframeStart: JsonField<OffsetDateTime>,
    private val timeframeEnd: JsonField<OffsetDateTime>,
    private val eventsIngested: JsonField<Long>,
    private val closeTime: JsonField<OffsetDateTime>,
    private val revertedAt: JsonField<OffsetDateTime>,
    private val customerId: JsonField<String>,
    private val deprecationFilter: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    /** The status of the backfill. */
    fun status(): Status = status.getRequired("status")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

    fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

    /** The number of events ingested in this backfill. */
    fun eventsIngested(): Long = eventsIngested.getRequired("events_ingested")

    /**
     * If in the future, the time at which the backfill will automatically close. If in the past,
     * the time at which the backfill was closed.
     */
    fun closeTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(closeTime.getNullable("close_time"))

    /** The time at which this backfill was reverted. */
    fun revertedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(revertedAt.getNullable("reverted_at"))

    /**
     * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
     * backfill is scoped to all customers.
     */
    fun customerId(): Optional<String> = Optional.ofNullable(customerId.getNullable("customer_id"))

    /**
     * A boolean [computed property](../guides/extensibility/advanced-metrics#computed-properties)
     * used to filter the set of events to deprecate
     */
    fun deprecationFilter(): Optional<String> =
        Optional.ofNullable(deprecationFilter.getNullable("deprecation_filter"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The status of the backfill. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("timeframe_start") @ExcludeMissing fun _timeframeStart() = timeframeStart

    @JsonProperty("timeframe_end") @ExcludeMissing fun _timeframeEnd() = timeframeEnd

    /** The number of events ingested in this backfill. */
    @JsonProperty("events_ingested") @ExcludeMissing fun _eventsIngested() = eventsIngested

    /**
     * If in the future, the time at which the backfill will automatically close. If in the past,
     * the time at which the backfill was closed.
     */
    @JsonProperty("close_time") @ExcludeMissing fun _closeTime() = closeTime

    /** The time at which this backfill was reverted. */
    @JsonProperty("reverted_at") @ExcludeMissing fun _revertedAt() = revertedAt

    /**
     * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
     * backfill is scoped to all customers.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId() = customerId

    /**
     * A boolean [computed property](../guides/extensibility/advanced-metrics#computed-properties)
     * used to filter the set of events to deprecate
     */
    @JsonProperty("deprecation_filter") @ExcludeMissing fun _deprecationFilter() = deprecationFilter

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EventBackfillCreateResponse = apply {
        if (!validated) {
            id()
            status()
            createdAt()
            timeframeStart()
            timeframeEnd()
            eventsIngested()
            closeTime()
            revertedAt()
            customerId()
            deprecationFilter()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of()
        private var timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventsIngested: JsonField<Long> = JsonMissing.of()
        private var closeTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var revertedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerId: JsonField<String> = JsonMissing.of()
        private var deprecationFilter: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventBackfillCreateResponse: EventBackfillCreateResponse) = apply {
            this.id = eventBackfillCreateResponse.id
            this.status = eventBackfillCreateResponse.status
            this.createdAt = eventBackfillCreateResponse.createdAt
            this.timeframeStart = eventBackfillCreateResponse.timeframeStart
            this.timeframeEnd = eventBackfillCreateResponse.timeframeEnd
            this.eventsIngested = eventBackfillCreateResponse.eventsIngested
            this.closeTime = eventBackfillCreateResponse.closeTime
            this.revertedAt = eventBackfillCreateResponse.revertedAt
            this.customerId = eventBackfillCreateResponse.customerId
            this.deprecationFilter = eventBackfillCreateResponse.deprecationFilter
            additionalProperties(eventBackfillCreateResponse.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The status of the backfill. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the backfill. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun timeframeStart(timeframeStart: OffsetDateTime) =
            timeframeStart(JsonField.of(timeframeStart))

        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
            this.timeframeStart = timeframeStart
        }

        fun timeframeEnd(timeframeEnd: OffsetDateTime) = timeframeEnd(JsonField.of(timeframeEnd))

        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
            this.timeframeEnd = timeframeEnd
        }

        /** The number of events ingested in this backfill. */
        fun eventsIngested(eventsIngested: Long) = eventsIngested(JsonField.of(eventsIngested))

        /** The number of events ingested in this backfill. */
        @JsonProperty("events_ingested")
        @ExcludeMissing
        fun eventsIngested(eventsIngested: JsonField<Long>) = apply {
            this.eventsIngested = eventsIngested
        }

        /**
         * If in the future, the time at which the backfill will automatically close. If in the
         * past, the time at which the backfill was closed.
         */
        fun closeTime(closeTime: OffsetDateTime) = closeTime(JsonField.of(closeTime))

        /**
         * If in the future, the time at which the backfill will automatically close. If in the
         * past, the time at which the backfill was closed.
         */
        @JsonProperty("close_time")
        @ExcludeMissing
        fun closeTime(closeTime: JsonField<OffsetDateTime>) = apply { this.closeTime = closeTime }

        /** The time at which this backfill was reverted. */
        fun revertedAt(revertedAt: OffsetDateTime) = revertedAt(JsonField.of(revertedAt))

        /** The time at which this backfill was reverted. */
        @JsonProperty("reverted_at")
        @ExcludeMissing
        fun revertedAt(revertedAt: JsonField<OffsetDateTime>) = apply {
            this.revertedAt = revertedAt
        }

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
         * backfill is scoped to all customers.
         */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * The Orb-generated ID of the customer to which this backfill is scoped. If `null`, this
         * backfill is scoped to all customers.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the set of events to deprecate
         */
        fun deprecationFilter(deprecationFilter: String) =
            deprecationFilter(JsonField.of(deprecationFilter))

        /**
         * A boolean
         * [computed property](../guides/extensibility/advanced-metrics#computed-properties) used to
         * filter the set of events to deprecate
         */
        @JsonProperty("deprecation_filter")
        @ExcludeMissing
        fun deprecationFilter(deprecationFilter: JsonField<String>) = apply {
            this.deprecationFilter = deprecationFilter
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

        fun build(): EventBackfillCreateResponse =
            EventBackfillCreateResponse(
                id,
                status,
                createdAt,
                timeframeStart,
                timeframeEnd,
                eventsIngested,
                closeTime,
                revertedAt,
                customerId,
                deprecationFilter,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("pending")

            @JvmField val REFLECTED = of("reflected")

            @JvmField val PENDING_REVERT = of("pending_revert")

            @JvmField val REVERTED = of("reverted")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            REFLECTED,
            PENDING_REVERT,
            REVERTED,
        }

        enum class Value {
            PENDING,
            REFLECTED,
            PENDING_REVERT,
            REVERTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                REFLECTED -> Value.REFLECTED
                PENDING_REVERT -> Value.PENDING_REVERT
                REVERTED -> Value.REVERTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                REFLECTED -> Known.REFLECTED
                PENDING_REVERT -> Known.PENDING_REVERT
                REVERTED -> Known.REVERTED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventBackfillCreateResponse && id == other.id && status == other.status && createdAt == other.createdAt && timeframeStart == other.timeframeStart && timeframeEnd == other.timeframeEnd && eventsIngested == other.eventsIngested && closeTime == other.closeTime && revertedAt == other.revertedAt && customerId == other.customerId && deprecationFilter == other.deprecationFilter && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, status, createdAt, timeframeStart, timeframeEnd, eventsIngested, closeTime, revertedAt, customerId, deprecationFilter, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventBackfillCreateResponse{id=$id, status=$status, createdAt=$createdAt, timeframeStart=$timeframeStart, timeframeEnd=$timeframeEnd, eventsIngested=$eventsIngested, closeTime=$closeTime, revertedAt=$revertedAt, customerId=$customerId, deprecationFilter=$deprecationFilter, additionalProperties=$additionalProperties}"
}
