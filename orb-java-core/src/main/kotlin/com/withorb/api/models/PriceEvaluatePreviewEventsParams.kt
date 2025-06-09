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
 * This endpoint evaluates prices on preview events instead of actual usage, making it ideal for
 * building price calculators and cost estimation tools. You can filter and group results using
 * [computed properties](/extensibility/advanced-metrics#computed-properties) to analyze pricing
 * across different dimensions.
 *
 * Prices may either reference existing prices in your Orb account or be defined inline in the
 * request body. The endpoint has the following limitations:
 * 1. Up to 100 prices can be evaluated in a single request.
 * 2. Up to 500 preview events can be provided in a single request.
 *
 * A top-level customer_id is required to evaluate the preview events. Additionally, all events
 * without a customer_id will have the top-level customer_id added.
 *
 * Note that this is a POST endpoint rather than a GET endpoint because it employs a JSON body
 * rather than query parameters.
 */
class PriceEvaluatePreviewEventsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The exclusive upper bound for event timestamps
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeframeEnd(): OffsetDateTime = body.timeframeEnd()

    /**
     * The inclusive lower bound for event timestamps
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeframeStart(): OffsetDateTime = body.timeframeStart()

    /**
     * The ID of the customer to which this evaluation is scoped.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun customerId(): Optional<String> = body.customerId()

    /**
     * List of preview events to use instead of actual usage data
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun events(): Optional<List<Event>> = body.events()

    /**
     * The external customer ID of the customer to which this evaluation is scoped.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalCustomerId(): Optional<String> = body.externalCustomerId()

    /**
     * List of prices to evaluate (max 100)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun priceEvaluations(): Optional<List<PriceEvaluation>> = body.priceEvaluations()

    /**
     * Returns the raw JSON value of [timeframeEnd].
     *
     * Unlike [timeframeEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeframeEnd(): JsonField<OffsetDateTime> = body._timeframeEnd()

    /**
     * Returns the raw JSON value of [timeframeStart].
     *
     * Unlike [timeframeStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeframeStart(): JsonField<OffsetDateTime> = body._timeframeStart()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _events(): JsonField<List<Event>> = body._events()

    /**
     * Returns the raw JSON value of [externalCustomerId].
     *
     * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalCustomerId(): JsonField<String> = body._externalCustomerId()

    /**
     * Returns the raw JSON value of [priceEvaluations].
     *
     * Unlike [priceEvaluations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _priceEvaluations(): JsonField<List<PriceEvaluation>> = body._priceEvaluations()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PriceEvaluatePreviewEventsParams].
         *
         * The following fields are required:
         * ```java
         * .timeframeEnd()
         * .timeframeStart()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PriceEvaluatePreviewEventsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(priceEvaluatePreviewEventsParams: PriceEvaluatePreviewEventsParams) =
            apply {
                body = priceEvaluatePreviewEventsParams.body.toBuilder()
                additionalHeaders = priceEvaluatePreviewEventsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    priceEvaluatePreviewEventsParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [timeframeEnd]
         * - [timeframeStart]
         * - [customerId]
         * - [events]
         * - [externalCustomerId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The exclusive upper bound for event timestamps */
        fun timeframeEnd(timeframeEnd: OffsetDateTime) = apply { body.timeframeEnd(timeframeEnd) }

        /**
         * Sets [Builder.timeframeEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeframeEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
            body.timeframeEnd(timeframeEnd)
        }

        /** The inclusive lower bound for event timestamps */
        fun timeframeStart(timeframeStart: OffsetDateTime) = apply {
            body.timeframeStart(timeframeStart)
        }

        /**
         * Sets [Builder.timeframeStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeframeStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
            body.timeframeStart(timeframeStart)
        }

        /** The ID of the customer to which this evaluation is scoped. */
        fun customerId(customerId: String?) = apply { body.customerId(customerId) }

        /** Alias for calling [Builder.customerId] with `customerId.orElse(null)`. */
        fun customerId(customerId: Optional<String>) = customerId(customerId.getOrNull())

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** List of preview events to use instead of actual usage data */
        fun events(events: List<Event>) = apply { body.events(events) }

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<Event>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun events(events: JsonField<List<Event>>) = apply { body.events(events) }

        /**
         * Adds a single [Event] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: Event) = apply { body.addEvent(event) }

        /** The external customer ID of the customer to which this evaluation is scoped. */
        fun externalCustomerId(externalCustomerId: String?) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /**
         * Alias for calling [Builder.externalCustomerId] with `externalCustomerId.orElse(null)`.
         */
        fun externalCustomerId(externalCustomerId: Optional<String>) =
            externalCustomerId(externalCustomerId.getOrNull())

        /**
         * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /** List of prices to evaluate (max 100) */
        fun priceEvaluations(priceEvaluations: List<PriceEvaluation>) = apply {
            body.priceEvaluations(priceEvaluations)
        }

        /**
         * Sets [Builder.priceEvaluations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceEvaluations] with a well-typed
         * `List<PriceEvaluation>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun priceEvaluations(priceEvaluations: JsonField<List<PriceEvaluation>>) = apply {
            body.priceEvaluations(priceEvaluations)
        }

        /**
         * Adds a single [PriceEvaluation] to [priceEvaluations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPriceEvaluation(priceEvaluation: PriceEvaluation) = apply {
            body.addPriceEvaluation(priceEvaluation)
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
         * Returns an immutable instance of [PriceEvaluatePreviewEventsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .timeframeEnd()
         * .timeframeStart()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PriceEvaluatePreviewEventsParams =
            PriceEvaluatePreviewEventsParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val timeframeEnd: JsonField<OffsetDateTime>,
        private val timeframeStart: JsonField<OffsetDateTime>,
        private val customerId: JsonField<String>,
        private val events: JsonField<List<Event>>,
        private val externalCustomerId: JsonField<String>,
        private val priceEvaluations: JsonField<List<PriceEvaluation>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("timeframe_end")
            @ExcludeMissing
            timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("timeframe_start")
            @ExcludeMissing
            timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("events")
            @ExcludeMissing
            events: JsonField<List<Event>> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            externalCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price_evaluations")
            @ExcludeMissing
            priceEvaluations: JsonField<List<PriceEvaluation>> = JsonMissing.of(),
        ) : this(
            timeframeEnd,
            timeframeStart,
            customerId,
            events,
            externalCustomerId,
            priceEvaluations,
            mutableMapOf(),
        )

        /**
         * The exclusive upper bound for event timestamps
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

        /**
         * The inclusive lower bound for event timestamps
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

        /**
         * The ID of the customer to which this evaluation is scoped.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerId(): Optional<String> = customerId.getOptional("customer_id")

        /**
         * List of preview events to use instead of actual usage data
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun events(): Optional<List<Event>> = events.getOptional("events")

        /**
         * The external customer ID of the customer to which this evaluation is scoped.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalCustomerId(): Optional<String> =
            externalCustomerId.getOptional("external_customer_id")

        /**
         * List of prices to evaluate (max 100)
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceEvaluations(): Optional<List<PriceEvaluation>> =
            priceEvaluations.getOptional("price_evaluations")

        /**
         * Returns the raw JSON value of [timeframeEnd].
         *
         * Unlike [timeframeEnd], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

        /**
         * Returns the raw JSON value of [timeframeStart].
         *
         * Unlike [timeframeStart], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [events].
         *
         * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<Event>> = events

        /**
         * Returns the raw JSON value of [externalCustomerId].
         *
         * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        /**
         * Returns the raw JSON value of [priceEvaluations].
         *
         * Unlike [priceEvaluations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("price_evaluations")
        @ExcludeMissing
        fun _priceEvaluations(): JsonField<List<PriceEvaluation>> = priceEvaluations

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
             * .timeframeEnd()
             * .timeframeStart()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var timeframeEnd: JsonField<OffsetDateTime>? = null
            private var timeframeStart: JsonField<OffsetDateTime>? = null
            private var customerId: JsonField<String> = JsonMissing.of()
            private var events: JsonField<MutableList<Event>>? = null
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var priceEvaluations: JsonField<MutableList<PriceEvaluation>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                timeframeEnd = body.timeframeEnd
                timeframeStart = body.timeframeStart
                customerId = body.customerId
                events = body.events.map { it.toMutableList() }
                externalCustomerId = body.externalCustomerId
                priceEvaluations = body.priceEvaluations.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The exclusive upper bound for event timestamps */
            fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                timeframeEnd(JsonField.of(timeframeEnd))

            /**
             * Sets [Builder.timeframeEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeframeEnd] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                this.timeframeEnd = timeframeEnd
            }

            /** The inclusive lower bound for event timestamps */
            fun timeframeStart(timeframeStart: OffsetDateTime) =
                timeframeStart(JsonField.of(timeframeStart))

            /**
             * Sets [Builder.timeframeStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeframeStart] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                this.timeframeStart = timeframeStart
            }

            /** The ID of the customer to which this evaluation is scoped. */
            fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

            /** Alias for calling [Builder.customerId] with `customerId.orElse(null)`. */
            fun customerId(customerId: Optional<String>) = customerId(customerId.getOrNull())

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** List of preview events to use instead of actual usage data */
            fun events(events: List<Event>) = events(JsonField.of(events))

            /**
             * Sets [Builder.events] to an arbitrary JSON value.
             *
             * You should usually call [Builder.events] with a well-typed `List<Event>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun events(events: JsonField<List<Event>>) = apply {
                this.events = events.map { it.toMutableList() }
            }

            /**
             * Adds a single [Event] to [events].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvent(event: Event) = apply {
                events =
                    (events ?: JsonField.of(mutableListOf())).also {
                        checkKnown("events", it).add(event)
                    }
            }

            /** The external customer ID of the customer to which this evaluation is scoped. */
            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            /**
             * Alias for calling [Builder.externalCustomerId] with
             * `externalCustomerId.orElse(null)`.
             */
            fun externalCustomerId(externalCustomerId: Optional<String>) =
                externalCustomerId(externalCustomerId.getOrNull())

            /**
             * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /** List of prices to evaluate (max 100) */
            fun priceEvaluations(priceEvaluations: List<PriceEvaluation>) =
                priceEvaluations(JsonField.of(priceEvaluations))

            /**
             * Sets [Builder.priceEvaluations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceEvaluations] with a well-typed
             * `List<PriceEvaluation>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun priceEvaluations(priceEvaluations: JsonField<List<PriceEvaluation>>) = apply {
                this.priceEvaluations = priceEvaluations.map { it.toMutableList() }
            }

            /**
             * Adds a single [PriceEvaluation] to [priceEvaluations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPriceEvaluation(priceEvaluation: PriceEvaluation) = apply {
                priceEvaluations =
                    (priceEvaluations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("priceEvaluations", it).add(priceEvaluation)
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
             * .timeframeEnd()
             * .timeframeStart()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("timeframeEnd", timeframeEnd),
                    checkRequired("timeframeStart", timeframeStart),
                    customerId,
                    (events ?: JsonMissing.of()).map { it.toImmutable() },
                    externalCustomerId,
                    (priceEvaluations ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            timeframeEnd()
            timeframeStart()
            customerId()
            events().ifPresent { it.forEach { it.validate() } }
            externalCustomerId()
            priceEvaluations().ifPresent { it.forEach { it.validate() } }
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
            (if (timeframeEnd.asKnown().isPresent) 1 else 0) +
                (if (timeframeStart.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (externalCustomerId.asKnown().isPresent) 1 else 0) +
                (priceEvaluations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && customerId == other.customerId && events == other.events && externalCustomerId == other.externalCustomerId && priceEvaluations == other.priceEvaluations && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(timeframeEnd, timeframeStart, customerId, events, externalCustomerId, priceEvaluations, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, customerId=$customerId, events=$events, externalCustomerId=$externalCustomerId, priceEvaluations=$priceEvaluations, additionalProperties=$additionalProperties}"
    }

    class Event
    private constructor(
        private val eventName: JsonField<String>,
        private val properties: JsonField<Properties>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val customerId: JsonField<String>,
        private val externalCustomerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_name")
            @ExcludeMissing
            eventName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("properties")
            @ExcludeMissing
            properties: JsonField<Properties> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            externalCustomerId: JsonField<String> = JsonMissing.of(),
        ) : this(eventName, properties, timestamp, customerId, externalCustomerId, mutableMapOf())

        /**
         * A name to meaningfully identify the action or event type.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventName(): String = eventName.getRequired("event_name")

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun properties(): Properties = properties.getRequired("properties")

        /**
         * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
         * time that usage was recorded, and is particularly important to attribute usage to a given
         * billing period.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        /**
         * The Orb Customer identifier
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerId(): Optional<String> = customerId.getOptional("customer_id")

        /**
         * An alias for the Orb customer, whose mapping is specified when creating the customer
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalCustomerId(): Optional<String> =
            externalCustomerId.getOptional("external_customer_id")

        /**
         * Returns the raw JSON value of [eventName].
         *
         * Unlike [eventName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_name") @ExcludeMissing fun _eventName(): JsonField<String> = eventName

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [externalCustomerId].
         *
         * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

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
             * Returns a mutable builder for constructing an instance of [Event].
             *
             * The following fields are required:
             * ```java
             * .eventName()
             * .properties()
             * .timestamp()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Event]. */
        class Builder internal constructor() {

            private var eventName: JsonField<String>? = null
            private var properties: JsonField<Properties>? = null
            private var timestamp: JsonField<OffsetDateTime>? = null
            private var customerId: JsonField<String> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(event: Event) = apply {
                eventName = event.eventName
                properties = event.properties
                timestamp = event.timestamp
                customerId = event.customerId
                externalCustomerId = event.externalCustomerId
                additionalProperties = event.additionalProperties.toMutableMap()
            }

            /** A name to meaningfully identify the action or event type. */
            fun eventName(eventName: String) = eventName(JsonField.of(eventName))

            /**
             * Sets [Builder.eventName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

            /**
             * A dictionary of custom properties. Values in this dictionary must be numeric,
             * boolean, or strings. Nested dictionaries are disallowed.
             */
            fun properties(properties: Properties) = properties(JsonField.of(properties))

            /**
             * Sets [Builder.properties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.properties] with a well-typed [Properties] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun properties(properties: JsonField<Properties>) = apply {
                this.properties = properties
            }

            /**
             * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the
             * time that usage was recorded, and is particularly important to attribute usage to a
             * given billing period.
             */
            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            /** The Orb Customer identifier */
            fun customerId(customerId: String?) = customerId(JsonField.ofNullable(customerId))

            /** Alias for calling [Builder.customerId] with `customerId.orElse(null)`. */
            fun customerId(customerId: Optional<String>) = customerId(customerId.getOrNull())

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * An alias for the Orb customer, whose mapping is specified when creating the customer
             */
            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            /**
             * Alias for calling [Builder.externalCustomerId] with
             * `externalCustomerId.orElse(null)`.
             */
            fun externalCustomerId(externalCustomerId: Optional<String>) =
                externalCustomerId(externalCustomerId.getOrNull())

            /**
             * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Event].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .eventName()
             * .properties()
             * .timestamp()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Event =
                Event(
                    checkRequired("eventName", eventName),
                    checkRequired("properties", properties),
                    checkRequired("timestamp", timestamp),
                    customerId,
                    externalCustomerId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Event = apply {
            if (validated) {
                return@apply
            }

            eventName()
            properties().validate()
            timestamp()
            customerId()
            externalCustomerId()
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
            (if (eventName.asKnown().isPresent) 1 else 0) +
                (properties.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (externalCustomerId.asKnown().isPresent) 1 else 0)

        /**
         * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or
         * strings. Nested dictionaries are disallowed.
         */
        class Properties
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

                /** Returns a mutable builder for constructing an instance of [Properties]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Properties]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(properties: Properties) = apply {
                    additionalProperties = properties.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Properties].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Properties = Properties(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Properties = apply {
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

                return /* spotless:off */ other is Properties && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Properties{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Event && eventName == other.eventName && properties == other.properties && timestamp == other.timestamp && customerId == other.customerId && externalCustomerId == other.externalCustomerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventName, properties, timestamp, customerId, externalCustomerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Event{eventName=$eventName, properties=$properties, timestamp=$timestamp, customerId=$customerId, externalCustomerId=$externalCustomerId, additionalProperties=$additionalProperties}"
    }

    class PriceEvaluation
    private constructor(
        private val filter: JsonField<String>,
        private val groupingKeys: JsonField<List<String>>,
        private val price: JsonField<Price>,
        private val priceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grouping_keys")
            @ExcludeMissing
            groupingKeys: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
        ) : this(filter, groupingKeys, price, priceId, mutableMapOf())

        /**
         * A boolean [computed property](/extensibility/advanced-metrics#computed-properties) used
         * to filter the underlying billable metric
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * Properties (or
         * [computed properties](/extensibility/advanced-metrics#computed-properties)) used to group
         * the underlying billable metric
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun groupingKeys(): Optional<List<String>> = groupingKeys.getOptional("grouping_keys")

        /**
         * An inline price definition to evaluate, allowing you to test price configurations before
         * adding them to Orb.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun price(): Optional<Price> = price.getOptional("price")

        /**
         * The ID of a price to evaluate that exists in your Orb account.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceId(): Optional<String> = priceId.getOptional("price_id")

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [groupingKeys].
         *
         * Unlike [groupingKeys], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("grouping_keys")
        @ExcludeMissing
        fun _groupingKeys(): JsonField<List<String>> = groupingKeys

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

            /** Returns a mutable builder for constructing an instance of [PriceEvaluation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PriceEvaluation]. */
        class Builder internal constructor() {

            private var filter: JsonField<String> = JsonMissing.of()
            private var groupingKeys: JsonField<MutableList<String>>? = null
            private var price: JsonField<Price> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(priceEvaluation: PriceEvaluation) = apply {
                filter = priceEvaluation.filter
                groupingKeys = priceEvaluation.groupingKeys.map { it.toMutableList() }
                price = priceEvaluation.price
                priceId = priceEvaluation.priceId
                additionalProperties = priceEvaluation.additionalProperties.toMutableMap()
            }

            /**
             * A boolean [computed property](/extensibility/advanced-metrics#computed-properties)
             * used to filter the underlying billable metric
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

            /**
             * Properties (or
             * [computed properties](/extensibility/advanced-metrics#computed-properties)) used to
             * group the underlying billable metric
             */
            fun groupingKeys(groupingKeys: List<String>) = groupingKeys(JsonField.of(groupingKeys))

            /**
             * Sets [Builder.groupingKeys] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupingKeys] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupingKeys(groupingKeys: JsonField<List<String>>) = apply {
                this.groupingKeys = groupingKeys.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [groupingKeys].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGroupingKey(groupingKey: String) = apply {
                groupingKeys =
                    (groupingKeys ?: JsonField.of(mutableListOf())).also {
                        checkKnown("groupingKeys", it).add(groupingKey)
                    }
            }

            /**
             * An inline price definition to evaluate, allowing you to test price configurations
             * before adding them to Orb.
             */
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
            fun price(unit: NewFloatingUnitPrice) = price(Price.ofUnit(unit))

            /** Alias for calling [price] with `Price.ofPackage(package_)`. */
            fun price(package_: NewFloatingPackagePrice) = price(Price.ofPackage(package_))

            /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
            fun price(matrix: NewFloatingMatrixPrice) = price(Price.ofMatrix(matrix))

            /**
             * Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
             */
            fun price(matrixWithAllocation: NewFloatingMatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
            fun price(tiered: NewFloatingTieredPrice) = price(Price.ofTiered(tiered))

            /** Alias for calling [price] with `Price.ofTieredBps(tieredBps)`. */
            fun price(tieredBps: NewFloatingTieredBpsPrice) = price(Price.ofTieredBps(tieredBps))

            /** Alias for calling [price] with `Price.ofBps(bps)`. */
            fun price(bps: NewFloatingBpsPrice) = price(Price.ofBps(bps))

            /** Alias for calling [price] with `Price.ofBulkBps(bulkBps)`. */
            fun price(bulkBps: NewFloatingBulkBpsPrice) = price(Price.ofBulkBps(bulkBps))

            /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
            fun price(bulk: NewFloatingBulkPrice) = price(Price.ofBulk(bulk))

            /**
             * Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
             */
            fun price(thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
            fun price(tieredPackage: NewFloatingTieredPackagePrice) =
                price(Price.ofTieredPackage(tieredPackage))

            /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
            fun price(groupedTiered: NewFloatingGroupedTieredPrice) =
                price(Price.ofGroupedTiered(groupedTiered))

            /**
             * Alias for calling [price] with
             * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
             */
            fun price(maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
            fun price(tieredWithMinimum: NewFloatingTieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofPackageWithAllocation(packageWithAllocation)`.
             */
            fun price(packageWithAllocation: NewFloatingPackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
             */
            fun price(tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
            fun price(unitWithPercent: NewFloatingUnitWithPercentPrice) =
                price(Price.ofUnitWithPercent(unitWithPercent))

            /**
             * Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`.
             */
            fun price(tieredWithProration: NewFloatingTieredWithProrationPrice) =
                price(Price.ofTieredWithProration(tieredWithProration))

            /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
            fun price(unitWithProration: NewFloatingUnitWithProrationPrice) =
                price(Price.ofUnitWithProration(unitWithProration))

            /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
            fun price(groupedAllocation: NewFloatingGroupedAllocationPrice) =
                price(Price.ofGroupedAllocation(groupedAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
             */
            fun price(groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
             */
            fun price(groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
             */
            fun price(matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
            fun price(bulkWithProration: NewFloatingBulkWithProrationPrice) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
             */
            fun price(groupedTieredPackage: NewFloatingGroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
             */
            fun price(
                scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
            ) = price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
             */
            fun price(
                scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
            ) = price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
             */
            fun price(cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice) =
                price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

            /** The ID of a price to evaluate that exists in your Orb account. */
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
             * Returns an immutable instance of [PriceEvaluation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PriceEvaluation =
                PriceEvaluation(
                    filter,
                    (groupingKeys ?: JsonMissing.of()).map { it.toImmutable() },
                    price,
                    priceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PriceEvaluation = apply {
            if (validated) {
                return@apply
            }

            filter()
            groupingKeys()
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
            (if (filter.asKnown().isPresent) 1 else 0) +
                (groupingKeys.asKnown().getOrNull()?.size ?: 0) +
                (price.asKnown().getOrNull()?.validity() ?: 0) +
                (if (priceId.asKnown().isPresent) 1 else 0)

        /**
         * An inline price definition to evaluate, allowing you to test price configurations before
         * adding them to Orb.
         */
        @JsonDeserialize(using = Price.Deserializer::class)
        @JsonSerialize(using = Price.Serializer::class)
        class Price
        private constructor(
            private val unit: NewFloatingUnitPrice? = null,
            private val package_: NewFloatingPackagePrice? = null,
            private val matrix: NewFloatingMatrixPrice? = null,
            private val matrixWithAllocation: NewFloatingMatrixWithAllocationPrice? = null,
            private val tiered: NewFloatingTieredPrice? = null,
            private val tieredBps: NewFloatingTieredBpsPrice? = null,
            private val bps: NewFloatingBpsPrice? = null,
            private val bulkBps: NewFloatingBulkBpsPrice? = null,
            private val bulk: NewFloatingBulkPrice? = null,
            private val thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice? = null,
            private val tieredPackage: NewFloatingTieredPackagePrice? = null,
            private val groupedTiered: NewFloatingGroupedTieredPrice? = null,
            private val maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice? = null,
            private val tieredWithMinimum: NewFloatingTieredWithMinimumPrice? = null,
            private val packageWithAllocation: NewFloatingPackageWithAllocationPrice? = null,
            private val tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice? = null,
            private val unitWithPercent: NewFloatingUnitWithPercentPrice? = null,
            private val tieredWithProration: NewFloatingTieredWithProrationPrice? = null,
            private val unitWithProration: NewFloatingUnitWithProrationPrice? = null,
            private val groupedAllocation: NewFloatingGroupedAllocationPrice? = null,
            private val groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice? =
                null,
            private val groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice? =
                null,
            private val matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice? = null,
            private val bulkWithProration: NewFloatingBulkWithProrationPrice? = null,
            private val groupedTieredPackage: NewFloatingGroupedTieredPackagePrice? = null,
            private val scalableMatrixWithUnitPricing:
                NewFloatingScalableMatrixWithUnitPricingPrice? =
                null,
            private val scalableMatrixWithTieredPricing:
                NewFloatingScalableMatrixWithTieredPricingPrice? =
                null,
            private val cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unit(): Optional<NewFloatingUnitPrice> = Optional.ofNullable(unit)

            fun package_(): Optional<NewFloatingPackagePrice> = Optional.ofNullable(package_)

            fun matrix(): Optional<NewFloatingMatrixPrice> = Optional.ofNullable(matrix)

            fun matrixWithAllocation(): Optional<NewFloatingMatrixWithAllocationPrice> =
                Optional.ofNullable(matrixWithAllocation)

            fun tiered(): Optional<NewFloatingTieredPrice> = Optional.ofNullable(tiered)

            fun tieredBps(): Optional<NewFloatingTieredBpsPrice> = Optional.ofNullable(tieredBps)

            fun bps(): Optional<NewFloatingBpsPrice> = Optional.ofNullable(bps)

            fun bulkBps(): Optional<NewFloatingBulkBpsPrice> = Optional.ofNullable(bulkBps)

            fun bulk(): Optional<NewFloatingBulkPrice> = Optional.ofNullable(bulk)

            fun thresholdTotalAmount(): Optional<NewFloatingThresholdTotalAmountPrice> =
                Optional.ofNullable(thresholdTotalAmount)

            fun tieredPackage(): Optional<NewFloatingTieredPackagePrice> =
                Optional.ofNullable(tieredPackage)

            fun groupedTiered(): Optional<NewFloatingGroupedTieredPrice> =
                Optional.ofNullable(groupedTiered)

            fun maxGroupTieredPackage(): Optional<NewFloatingMaxGroupTieredPackagePrice> =
                Optional.ofNullable(maxGroupTieredPackage)

            fun tieredWithMinimum(): Optional<NewFloatingTieredWithMinimumPrice> =
                Optional.ofNullable(tieredWithMinimum)

            fun packageWithAllocation(): Optional<NewFloatingPackageWithAllocationPrice> =
                Optional.ofNullable(packageWithAllocation)

            fun tieredPackageWithMinimum(): Optional<NewFloatingTieredPackageWithMinimumPrice> =
                Optional.ofNullable(tieredPackageWithMinimum)

            fun unitWithPercent(): Optional<NewFloatingUnitWithPercentPrice> =
                Optional.ofNullable(unitWithPercent)

            fun tieredWithProration(): Optional<NewFloatingTieredWithProrationPrice> =
                Optional.ofNullable(tieredWithProration)

            fun unitWithProration(): Optional<NewFloatingUnitWithProrationPrice> =
                Optional.ofNullable(unitWithProration)

            fun groupedAllocation(): Optional<NewFloatingGroupedAllocationPrice> =
                Optional.ofNullable(groupedAllocation)

            fun groupedWithProratedMinimum(): Optional<NewFloatingGroupedWithProratedMinimumPrice> =
                Optional.ofNullable(groupedWithProratedMinimum)

            fun groupedWithMeteredMinimum(): Optional<NewFloatingGroupedWithMeteredMinimumPrice> =
                Optional.ofNullable(groupedWithMeteredMinimum)

            fun matrixWithDisplayName(): Optional<NewFloatingMatrixWithDisplayNamePrice> =
                Optional.ofNullable(matrixWithDisplayName)

            fun bulkWithProration(): Optional<NewFloatingBulkWithProrationPrice> =
                Optional.ofNullable(bulkWithProration)

            fun groupedTieredPackage(): Optional<NewFloatingGroupedTieredPackagePrice> =
                Optional.ofNullable(groupedTieredPackage)

            fun scalableMatrixWithUnitPricing():
                Optional<NewFloatingScalableMatrixWithUnitPricingPrice> =
                Optional.ofNullable(scalableMatrixWithUnitPricing)

            fun scalableMatrixWithTieredPricing():
                Optional<NewFloatingScalableMatrixWithTieredPricingPrice> =
                Optional.ofNullable(scalableMatrixWithTieredPricing)

            fun cumulativeGroupedBulk(): Optional<NewFloatingCumulativeGroupedBulkPrice> =
                Optional.ofNullable(cumulativeGroupedBulk)

            fun isUnit(): Boolean = unit != null

            fun isPackage(): Boolean = package_ != null

            fun isMatrix(): Boolean = matrix != null

            fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

            fun isTiered(): Boolean = tiered != null

            fun isTieredBps(): Boolean = tieredBps != null

            fun isBps(): Boolean = bps != null

            fun isBulkBps(): Boolean = bulkBps != null

            fun isBulk(): Boolean = bulk != null

            fun isThresholdTotalAmount(): Boolean = thresholdTotalAmount != null

            fun isTieredPackage(): Boolean = tieredPackage != null

            fun isGroupedTiered(): Boolean = groupedTiered != null

            fun isMaxGroupTieredPackage(): Boolean = maxGroupTieredPackage != null

            fun isTieredWithMinimum(): Boolean = tieredWithMinimum != null

            fun isPackageWithAllocation(): Boolean = packageWithAllocation != null

            fun isTieredPackageWithMinimum(): Boolean = tieredPackageWithMinimum != null

            fun isUnitWithPercent(): Boolean = unitWithPercent != null

            fun isTieredWithProration(): Boolean = tieredWithProration != null

            fun isUnitWithProration(): Boolean = unitWithProration != null

            fun isGroupedAllocation(): Boolean = groupedAllocation != null

            fun isGroupedWithProratedMinimum(): Boolean = groupedWithProratedMinimum != null

            fun isGroupedWithMeteredMinimum(): Boolean = groupedWithMeteredMinimum != null

            fun isMatrixWithDisplayName(): Boolean = matrixWithDisplayName != null

            fun isBulkWithProration(): Boolean = bulkWithProration != null

            fun isGroupedTieredPackage(): Boolean = groupedTieredPackage != null

            fun isScalableMatrixWithUnitPricing(): Boolean = scalableMatrixWithUnitPricing != null

            fun isScalableMatrixWithTieredPricing(): Boolean =
                scalableMatrixWithTieredPricing != null

            fun isCumulativeGroupedBulk(): Boolean = cumulativeGroupedBulk != null

            fun asUnit(): NewFloatingUnitPrice = unit.getOrThrow("unit")

            fun asPackage(): NewFloatingPackagePrice = package_.getOrThrow("package_")

            fun asMatrix(): NewFloatingMatrixPrice = matrix.getOrThrow("matrix")

            fun asMatrixWithAllocation(): NewFloatingMatrixWithAllocationPrice =
                matrixWithAllocation.getOrThrow("matrixWithAllocation")

            fun asTiered(): NewFloatingTieredPrice = tiered.getOrThrow("tiered")

            fun asTieredBps(): NewFloatingTieredBpsPrice = tieredBps.getOrThrow("tieredBps")

            fun asBps(): NewFloatingBpsPrice = bps.getOrThrow("bps")

            fun asBulkBps(): NewFloatingBulkBpsPrice = bulkBps.getOrThrow("bulkBps")

            fun asBulk(): NewFloatingBulkPrice = bulk.getOrThrow("bulk")

            fun asThresholdTotalAmount(): NewFloatingThresholdTotalAmountPrice =
                thresholdTotalAmount.getOrThrow("thresholdTotalAmount")

            fun asTieredPackage(): NewFloatingTieredPackagePrice =
                tieredPackage.getOrThrow("tieredPackage")

            fun asGroupedTiered(): NewFloatingGroupedTieredPrice =
                groupedTiered.getOrThrow("groupedTiered")

            fun asMaxGroupTieredPackage(): NewFloatingMaxGroupTieredPackagePrice =
                maxGroupTieredPackage.getOrThrow("maxGroupTieredPackage")

            fun asTieredWithMinimum(): NewFloatingTieredWithMinimumPrice =
                tieredWithMinimum.getOrThrow("tieredWithMinimum")

            fun asPackageWithAllocation(): NewFloatingPackageWithAllocationPrice =
                packageWithAllocation.getOrThrow("packageWithAllocation")

            fun asTieredPackageWithMinimum(): NewFloatingTieredPackageWithMinimumPrice =
                tieredPackageWithMinimum.getOrThrow("tieredPackageWithMinimum")

            fun asUnitWithPercent(): NewFloatingUnitWithPercentPrice =
                unitWithPercent.getOrThrow("unitWithPercent")

            fun asTieredWithProration(): NewFloatingTieredWithProrationPrice =
                tieredWithProration.getOrThrow("tieredWithProration")

            fun asUnitWithProration(): NewFloatingUnitWithProrationPrice =
                unitWithProration.getOrThrow("unitWithProration")

            fun asGroupedAllocation(): NewFloatingGroupedAllocationPrice =
                groupedAllocation.getOrThrow("groupedAllocation")

            fun asGroupedWithProratedMinimum(): NewFloatingGroupedWithProratedMinimumPrice =
                groupedWithProratedMinimum.getOrThrow("groupedWithProratedMinimum")

            fun asGroupedWithMeteredMinimum(): NewFloatingGroupedWithMeteredMinimumPrice =
                groupedWithMeteredMinimum.getOrThrow("groupedWithMeteredMinimum")

            fun asMatrixWithDisplayName(): NewFloatingMatrixWithDisplayNamePrice =
                matrixWithDisplayName.getOrThrow("matrixWithDisplayName")

            fun asBulkWithProration(): NewFloatingBulkWithProrationPrice =
                bulkWithProration.getOrThrow("bulkWithProration")

            fun asGroupedTieredPackage(): NewFloatingGroupedTieredPackagePrice =
                groupedTieredPackage.getOrThrow("groupedTieredPackage")

            fun asScalableMatrixWithUnitPricing(): NewFloatingScalableMatrixWithUnitPricingPrice =
                scalableMatrixWithUnitPricing.getOrThrow("scalableMatrixWithUnitPricing")

            fun asScalableMatrixWithTieredPricing():
                NewFloatingScalableMatrixWithTieredPricingPrice =
                scalableMatrixWithTieredPricing.getOrThrow("scalableMatrixWithTieredPricing")

            fun asCumulativeGroupedBulk(): NewFloatingCumulativeGroupedBulkPrice =
                cumulativeGroupedBulk.getOrThrow("cumulativeGroupedBulk")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unit != null -> visitor.visitUnit(unit)
                    package_ != null -> visitor.visitPackage(package_)
                    matrix != null -> visitor.visitMatrix(matrix)
                    matrixWithAllocation != null ->
                        visitor.visitMatrixWithAllocation(matrixWithAllocation)
                    tiered != null -> visitor.visitTiered(tiered)
                    tieredBps != null -> visitor.visitTieredBps(tieredBps)
                    bps != null -> visitor.visitBps(bps)
                    bulkBps != null -> visitor.visitBulkBps(bulkBps)
                    bulk != null -> visitor.visitBulk(bulk)
                    thresholdTotalAmount != null ->
                        visitor.visitThresholdTotalAmount(thresholdTotalAmount)
                    tieredPackage != null -> visitor.visitTieredPackage(tieredPackage)
                    groupedTiered != null -> visitor.visitGroupedTiered(groupedTiered)
                    maxGroupTieredPackage != null ->
                        visitor.visitMaxGroupTieredPackage(maxGroupTieredPackage)
                    tieredWithMinimum != null -> visitor.visitTieredWithMinimum(tieredWithMinimum)
                    packageWithAllocation != null ->
                        visitor.visitPackageWithAllocation(packageWithAllocation)
                    tieredPackageWithMinimum != null ->
                        visitor.visitTieredPackageWithMinimum(tieredPackageWithMinimum)
                    unitWithPercent != null -> visitor.visitUnitWithPercent(unitWithPercent)
                    tieredWithProration != null ->
                        visitor.visitTieredWithProration(tieredWithProration)
                    unitWithProration != null -> visitor.visitUnitWithProration(unitWithProration)
                    groupedAllocation != null -> visitor.visitGroupedAllocation(groupedAllocation)
                    groupedWithProratedMinimum != null ->
                        visitor.visitGroupedWithProratedMinimum(groupedWithProratedMinimum)
                    groupedWithMeteredMinimum != null ->
                        visitor.visitGroupedWithMeteredMinimum(groupedWithMeteredMinimum)
                    matrixWithDisplayName != null ->
                        visitor.visitMatrixWithDisplayName(matrixWithDisplayName)
                    bulkWithProration != null -> visitor.visitBulkWithProration(bulkWithProration)
                    groupedTieredPackage != null ->
                        visitor.visitGroupedTieredPackage(groupedTieredPackage)
                    scalableMatrixWithUnitPricing != null ->
                        visitor.visitScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)
                    scalableMatrixWithTieredPricing != null ->
                        visitor.visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing
                        )
                    cumulativeGroupedBulk != null ->
                        visitor.visitCumulativeGroupedBulk(cumulativeGroupedBulk)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Price = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnit(unit: NewFloatingUnitPrice) {
                            unit.validate()
                        }

                        override fun visitPackage(package_: NewFloatingPackagePrice) {
                            package_.validate()
                        }

                        override fun visitMatrix(matrix: NewFloatingMatrixPrice) {
                            matrix.validate()
                        }

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                        ) {
                            matrixWithAllocation.validate()
                        }

                        override fun visitTiered(tiered: NewFloatingTieredPrice) {
                            tiered.validate()
                        }

                        override fun visitTieredBps(tieredBps: NewFloatingTieredBpsPrice) {
                            tieredBps.validate()
                        }

                        override fun visitBps(bps: NewFloatingBpsPrice) {
                            bps.validate()
                        }

                        override fun visitBulkBps(bulkBps: NewFloatingBulkBpsPrice) {
                            bulkBps.validate()
                        }

                        override fun visitBulk(bulk: NewFloatingBulkPrice) {
                            bulk.validate()
                        }

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                        ) {
                            thresholdTotalAmount.validate()
                        }

                        override fun visitTieredPackage(
                            tieredPackage: NewFloatingTieredPackagePrice
                        ) {
                            tieredPackage.validate()
                        }

                        override fun visitGroupedTiered(
                            groupedTiered: NewFloatingGroupedTieredPrice
                        ) {
                            groupedTiered.validate()
                        }

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                        ) {
                            maxGroupTieredPackage.validate()
                        }

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewFloatingTieredWithMinimumPrice
                        ) {
                            tieredWithMinimum.validate()
                        }

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewFloatingPackageWithAllocationPrice
                        ) {
                            packageWithAllocation.validate()
                        }

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                        ) {
                            tieredPackageWithMinimum.validate()
                        }

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewFloatingUnitWithPercentPrice
                        ) {
                            unitWithPercent.validate()
                        }

                        override fun visitTieredWithProration(
                            tieredWithProration: NewFloatingTieredWithProrationPrice
                        ) {
                            tieredWithProration.validate()
                        }

                        override fun visitUnitWithProration(
                            unitWithProration: NewFloatingUnitWithProrationPrice
                        ) {
                            unitWithProration.validate()
                        }

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewFloatingGroupedAllocationPrice
                        ) {
                            groupedAllocation.validate()
                        }

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                        ) {
                            groupedWithProratedMinimum.validate()
                        }

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                        ) {
                            groupedWithMeteredMinimum.validate()
                        }

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                        ) {
                            matrixWithDisplayName.validate()
                        }

                        override fun visitBulkWithProration(
                            bulkWithProration: NewFloatingBulkWithProrationPrice
                        ) {
                            bulkWithProration.validate()
                        }

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                        ) {
                            groupedTieredPackage.validate()
                        }

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewFloatingScalableMatrixWithUnitPricingPrice
                        ) {
                            scalableMatrixWithUnitPricing.validate()
                        }

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewFloatingScalableMatrixWithTieredPricingPrice
                        ) {
                            scalableMatrixWithTieredPricing.validate()
                        }

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                        ) {
                            cumulativeGroupedBulk.validate()
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
                        override fun visitUnit(unit: NewFloatingUnitPrice) = unit.validity()

                        override fun visitPackage(package_: NewFloatingPackagePrice) =
                            package_.validity()

                        override fun visitMatrix(matrix: NewFloatingMatrixPrice) = matrix.validity()

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                        ) = matrixWithAllocation.validity()

                        override fun visitTiered(tiered: NewFloatingTieredPrice) = tiered.validity()

                        override fun visitTieredBps(tieredBps: NewFloatingTieredBpsPrice) =
                            tieredBps.validity()

                        override fun visitBps(bps: NewFloatingBpsPrice) = bps.validity()

                        override fun visitBulkBps(bulkBps: NewFloatingBulkBpsPrice) =
                            bulkBps.validity()

                        override fun visitBulk(bulk: NewFloatingBulkPrice) = bulk.validity()

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                        ) = thresholdTotalAmount.validity()

                        override fun visitTieredPackage(
                            tieredPackage: NewFloatingTieredPackagePrice
                        ) = tieredPackage.validity()

                        override fun visitGroupedTiered(
                            groupedTiered: NewFloatingGroupedTieredPrice
                        ) = groupedTiered.validity()

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                        ) = maxGroupTieredPackage.validity()

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewFloatingTieredWithMinimumPrice
                        ) = tieredWithMinimum.validity()

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewFloatingPackageWithAllocationPrice
                        ) = packageWithAllocation.validity()

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                        ) = tieredPackageWithMinimum.validity()

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewFloatingUnitWithPercentPrice
                        ) = unitWithPercent.validity()

                        override fun visitTieredWithProration(
                            tieredWithProration: NewFloatingTieredWithProrationPrice
                        ) = tieredWithProration.validity()

                        override fun visitUnitWithProration(
                            unitWithProration: NewFloatingUnitWithProrationPrice
                        ) = unitWithProration.validity()

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewFloatingGroupedAllocationPrice
                        ) = groupedAllocation.validity()

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                        ) = groupedWithProratedMinimum.validity()

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                        ) = groupedWithMeteredMinimum.validity()

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                        ) = matrixWithDisplayName.validity()

                        override fun visitBulkWithProration(
                            bulkWithProration: NewFloatingBulkWithProrationPrice
                        ) = bulkWithProration.validity()

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                        ) = groupedTieredPackage.validity()

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewFloatingScalableMatrixWithUnitPricingPrice
                        ) = scalableMatrixWithUnitPricing.validity()

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewFloatingScalableMatrixWithTieredPricingPrice
                        ) = scalableMatrixWithTieredPricing.validity()

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                        ) = cumulativeGroupedBulk.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Price && unit == other.unit && package_ == other.package_ && matrix == other.matrix && matrixWithAllocation == other.matrixWithAllocation && tiered == other.tiered && tieredBps == other.tieredBps && bps == other.bps && bulkBps == other.bulkBps && bulk == other.bulk && thresholdTotalAmount == other.thresholdTotalAmount && tieredPackage == other.tieredPackage && groupedTiered == other.groupedTiered && maxGroupTieredPackage == other.maxGroupTieredPackage && tieredWithMinimum == other.tieredWithMinimum && packageWithAllocation == other.packageWithAllocation && tieredPackageWithMinimum == other.tieredPackageWithMinimum && unitWithPercent == other.unitWithPercent && tieredWithProration == other.tieredWithProration && unitWithProration == other.unitWithProration && groupedAllocation == other.groupedAllocation && groupedWithProratedMinimum == other.groupedWithProratedMinimum && groupedWithMeteredMinimum == other.groupedWithMeteredMinimum && matrixWithDisplayName == other.matrixWithDisplayName && bulkWithProration == other.bulkWithProration && groupedTieredPackage == other.groupedTieredPackage && scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing && scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing && cumulativeGroupedBulk == other.cumulativeGroupedBulk /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(unit, package_, matrix, matrixWithAllocation, tiered, tieredBps, bps, bulkBps, bulk, thresholdTotalAmount, tieredPackage, groupedTiered, maxGroupTieredPackage, tieredWithMinimum, packageWithAllocation, tieredPackageWithMinimum, unitWithPercent, tieredWithProration, unitWithProration, groupedAllocation, groupedWithProratedMinimum, groupedWithMeteredMinimum, matrixWithDisplayName, bulkWithProration, groupedTieredPackage, scalableMatrixWithUnitPricing, scalableMatrixWithTieredPricing, cumulativeGroupedBulk) /* spotless:on */

            override fun toString(): String =
                when {
                    unit != null -> "Price{unit=$unit}"
                    package_ != null -> "Price{package_=$package_}"
                    matrix != null -> "Price{matrix=$matrix}"
                    matrixWithAllocation != null ->
                        "Price{matrixWithAllocation=$matrixWithAllocation}"
                    tiered != null -> "Price{tiered=$tiered}"
                    tieredBps != null -> "Price{tieredBps=$tieredBps}"
                    bps != null -> "Price{bps=$bps}"
                    bulkBps != null -> "Price{bulkBps=$bulkBps}"
                    bulk != null -> "Price{bulk=$bulk}"
                    thresholdTotalAmount != null ->
                        "Price{thresholdTotalAmount=$thresholdTotalAmount}"
                    tieredPackage != null -> "Price{tieredPackage=$tieredPackage}"
                    groupedTiered != null -> "Price{groupedTiered=$groupedTiered}"
                    maxGroupTieredPackage != null ->
                        "Price{maxGroupTieredPackage=$maxGroupTieredPackage}"
                    tieredWithMinimum != null -> "Price{tieredWithMinimum=$tieredWithMinimum}"
                    packageWithAllocation != null ->
                        "Price{packageWithAllocation=$packageWithAllocation}"
                    tieredPackageWithMinimum != null ->
                        "Price{tieredPackageWithMinimum=$tieredPackageWithMinimum}"
                    unitWithPercent != null -> "Price{unitWithPercent=$unitWithPercent}"
                    tieredWithProration != null -> "Price{tieredWithProration=$tieredWithProration}"
                    unitWithProration != null -> "Price{unitWithProration=$unitWithProration}"
                    groupedAllocation != null -> "Price{groupedAllocation=$groupedAllocation}"
                    groupedWithProratedMinimum != null ->
                        "Price{groupedWithProratedMinimum=$groupedWithProratedMinimum}"
                    groupedWithMeteredMinimum != null ->
                        "Price{groupedWithMeteredMinimum=$groupedWithMeteredMinimum}"
                    matrixWithDisplayName != null ->
                        "Price{matrixWithDisplayName=$matrixWithDisplayName}"
                    bulkWithProration != null -> "Price{bulkWithProration=$bulkWithProration}"
                    groupedTieredPackage != null ->
                        "Price{groupedTieredPackage=$groupedTieredPackage}"
                    scalableMatrixWithUnitPricing != null ->
                        "Price{scalableMatrixWithUnitPricing=$scalableMatrixWithUnitPricing}"
                    scalableMatrixWithTieredPricing != null ->
                        "Price{scalableMatrixWithTieredPricing=$scalableMatrixWithTieredPricing}"
                    cumulativeGroupedBulk != null ->
                        "Price{cumulativeGroupedBulk=$cumulativeGroupedBulk}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }

            companion object {

                @JvmStatic fun ofUnit(unit: NewFloatingUnitPrice) = Price(unit = unit)

                @JvmStatic
                fun ofPackage(package_: NewFloatingPackagePrice) = Price(package_ = package_)

                @JvmStatic fun ofMatrix(matrix: NewFloatingMatrixPrice) = Price(matrix = matrix)

                @JvmStatic
                fun ofMatrixWithAllocation(
                    matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                ) = Price(matrixWithAllocation = matrixWithAllocation)

                @JvmStatic fun ofTiered(tiered: NewFloatingTieredPrice) = Price(tiered = tiered)

                @JvmStatic
                fun ofTieredBps(tieredBps: NewFloatingTieredBpsPrice) = Price(tieredBps = tieredBps)

                @JvmStatic fun ofBps(bps: NewFloatingBpsPrice) = Price(bps = bps)

                @JvmStatic
                fun ofBulkBps(bulkBps: NewFloatingBulkBpsPrice) = Price(bulkBps = bulkBps)

                @JvmStatic fun ofBulk(bulk: NewFloatingBulkPrice) = Price(bulk = bulk)

                @JvmStatic
                fun ofThresholdTotalAmount(
                    thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                ) = Price(thresholdTotalAmount = thresholdTotalAmount)

                @JvmStatic
                fun ofTieredPackage(tieredPackage: NewFloatingTieredPackagePrice) =
                    Price(tieredPackage = tieredPackage)

                @JvmStatic
                fun ofGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice) =
                    Price(groupedTiered = groupedTiered)

                @JvmStatic
                fun ofMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                ) = Price(maxGroupTieredPackage = maxGroupTieredPackage)

                @JvmStatic
                fun ofTieredWithMinimum(tieredWithMinimum: NewFloatingTieredWithMinimumPrice) =
                    Price(tieredWithMinimum = tieredWithMinimum)

                @JvmStatic
                fun ofPackageWithAllocation(
                    packageWithAllocation: NewFloatingPackageWithAllocationPrice
                ) = Price(packageWithAllocation = packageWithAllocation)

                @JvmStatic
                fun ofTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                ) = Price(tieredPackageWithMinimum = tieredPackageWithMinimum)

                @JvmStatic
                fun ofUnitWithPercent(unitWithPercent: NewFloatingUnitWithPercentPrice) =
                    Price(unitWithPercent = unitWithPercent)

                @JvmStatic
                fun ofTieredWithProration(
                    tieredWithProration: NewFloatingTieredWithProrationPrice
                ) = Price(tieredWithProration = tieredWithProration)

                @JvmStatic
                fun ofUnitWithProration(unitWithProration: NewFloatingUnitWithProrationPrice) =
                    Price(unitWithProration = unitWithProration)

                @JvmStatic
                fun ofGroupedAllocation(groupedAllocation: NewFloatingGroupedAllocationPrice) =
                    Price(groupedAllocation = groupedAllocation)

                @JvmStatic
                fun ofGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                ) = Price(groupedWithProratedMinimum = groupedWithProratedMinimum)

                @JvmStatic
                fun ofGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                ) = Price(groupedWithMeteredMinimum = groupedWithMeteredMinimum)

                @JvmStatic
                fun ofMatrixWithDisplayName(
                    matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                ) = Price(matrixWithDisplayName = matrixWithDisplayName)

                @JvmStatic
                fun ofBulkWithProration(bulkWithProration: NewFloatingBulkWithProrationPrice) =
                    Price(bulkWithProration = bulkWithProration)

                @JvmStatic
                fun ofGroupedTieredPackage(
                    groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                ) = Price(groupedTieredPackage = groupedTieredPackage)

                @JvmStatic
                fun ofScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
                ) = Price(scalableMatrixWithUnitPricing = scalableMatrixWithUnitPricing)

                @JvmStatic
                fun ofScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
                ) = Price(scalableMatrixWithTieredPricing = scalableMatrixWithTieredPricing)

                @JvmStatic
                fun ofCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                ) = Price(cumulativeGroupedBulk = cumulativeGroupedBulk)
            }

            /**
             * An interface that defines how to map each variant of [Price] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnit(unit: NewFloatingUnitPrice): T

                fun visitPackage(package_: NewFloatingPackagePrice): T

                fun visitMatrix(matrix: NewFloatingMatrixPrice): T

                fun visitMatrixWithAllocation(
                    matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                ): T

                fun visitTiered(tiered: NewFloatingTieredPrice): T

                fun visitTieredBps(tieredBps: NewFloatingTieredBpsPrice): T

                fun visitBps(bps: NewFloatingBpsPrice): T

                fun visitBulkBps(bulkBps: NewFloatingBulkBpsPrice): T

                fun visitBulk(bulk: NewFloatingBulkPrice): T

                fun visitThresholdTotalAmount(
                    thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                ): T

                fun visitTieredPackage(tieredPackage: NewFloatingTieredPackagePrice): T

                fun visitGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice): T

                fun visitMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                ): T

                fun visitTieredWithMinimum(tieredWithMinimum: NewFloatingTieredWithMinimumPrice): T

                fun visitPackageWithAllocation(
                    packageWithAllocation: NewFloatingPackageWithAllocationPrice
                ): T

                fun visitTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                ): T

                fun visitUnitWithPercent(unitWithPercent: NewFloatingUnitWithPercentPrice): T

                fun visitTieredWithProration(
                    tieredWithProration: NewFloatingTieredWithProrationPrice
                ): T

                fun visitUnitWithProration(unitWithProration: NewFloatingUnitWithProrationPrice): T

                fun visitGroupedAllocation(groupedAllocation: NewFloatingGroupedAllocationPrice): T

                fun visitGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                ): T

                fun visitGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                ): T

                fun visitMatrixWithDisplayName(
                    matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                ): T

                fun visitBulkWithProration(bulkWithProration: NewFloatingBulkWithProrationPrice): T

                fun visitGroupedTieredPackage(
                    groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                ): T

                fun visitScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
                ): T

                fun visitScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
                ): T

                fun visitCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                ): T

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
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingUnitPrice>())
                                ?.let { Price(unit = it, _json = json) } ?: Price(_json = json)
                        }
                        "package" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingPackagePrice>())
                                ?.let { Price(package_ = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingMatrixPrice>())
                                ?.let { Price(matrix = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMatrixWithAllocationPrice>(),
                                )
                                ?.let { Price(matrixWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingTieredPrice>())
                                ?.let { Price(tiered = it, _json = json) } ?: Price(_json = json)
                        }
                        "tiered_bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingTieredBpsPrice>())
                                ?.let { Price(tieredBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingBpsPrice>())
                                ?.let { Price(bps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk_bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingBulkBpsPrice>())
                                ?.let { Price(bulkBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingBulkPrice>())
                                ?.let { Price(bulk = it, _json = json) } ?: Price(_json = json)
                        }
                        "threshold_total_amount" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingThresholdTotalAmountPrice>(),
                                )
                                ?.let { Price(thresholdTotalAmount = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredPackagePrice>(),
                                )
                                ?.let { Price(tieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedTieredPrice>(),
                                )
                                ?.let { Price(groupedTiered = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "max_group_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMaxGroupTieredPackagePrice>(),
                                )
                                ?.let { Price(maxGroupTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "package_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingPackageWithAllocationPrice>(),
                                )
                                ?.let { Price(packageWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredPackageWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredPackageWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_percent" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingUnitWithPercentPrice>(),
                                )
                                ?.let { Price(unitWithPercent = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredWithProrationPrice>(),
                                )
                                ?.let { Price(tieredWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingUnitWithProrationPrice>(),
                                )
                                ?.let { Price(unitWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedAllocationPrice>(),
                                )
                                ?.let { Price(groupedAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_prorated_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedWithProratedMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithProratedMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_metered_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedWithMeteredMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithMeteredMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_display_name" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMatrixWithDisplayNamePrice>(),
                                )
                                ?.let { Price(matrixWithDisplayName = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "bulk_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingBulkWithProrationPrice>(),
                                )
                                ?.let { Price(bulkWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedTieredPackagePrice>(),
                                )
                                ?.let { Price(groupedTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_unit_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingScalableMatrixWithUnitPricingPrice>(),
                                )
                                ?.let { Price(scalableMatrixWithUnitPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_tiered_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        NewFloatingScalableMatrixWithTieredPricingPrice
                                    >(),
                                )
                                ?.let { Price(scalableMatrixWithTieredPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "cumulative_grouped_bulk" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingCumulativeGroupedBulkPrice>(),
                                )
                                ?.let { Price(cumulativeGroupedBulk = it, _json = json) }
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
                        value.matrixWithAllocation != null ->
                            generator.writeObject(value.matrixWithAllocation)
                        value.tiered != null -> generator.writeObject(value.tiered)
                        value.tieredBps != null -> generator.writeObject(value.tieredBps)
                        value.bps != null -> generator.writeObject(value.bps)
                        value.bulkBps != null -> generator.writeObject(value.bulkBps)
                        value.bulk != null -> generator.writeObject(value.bulk)
                        value.thresholdTotalAmount != null ->
                            generator.writeObject(value.thresholdTotalAmount)
                        value.tieredPackage != null -> generator.writeObject(value.tieredPackage)
                        value.groupedTiered != null -> generator.writeObject(value.groupedTiered)
                        value.maxGroupTieredPackage != null ->
                            generator.writeObject(value.maxGroupTieredPackage)
                        value.tieredWithMinimum != null ->
                            generator.writeObject(value.tieredWithMinimum)
                        value.packageWithAllocation != null ->
                            generator.writeObject(value.packageWithAllocation)
                        value.tieredPackageWithMinimum != null ->
                            generator.writeObject(value.tieredPackageWithMinimum)
                        value.unitWithPercent != null ->
                            generator.writeObject(value.unitWithPercent)
                        value.tieredWithProration != null ->
                            generator.writeObject(value.tieredWithProration)
                        value.unitWithProration != null ->
                            generator.writeObject(value.unitWithProration)
                        value.groupedAllocation != null ->
                            generator.writeObject(value.groupedAllocation)
                        value.groupedWithProratedMinimum != null ->
                            generator.writeObject(value.groupedWithProratedMinimum)
                        value.groupedWithMeteredMinimum != null ->
                            generator.writeObject(value.groupedWithMeteredMinimum)
                        value.matrixWithDisplayName != null ->
                            generator.writeObject(value.matrixWithDisplayName)
                        value.bulkWithProration != null ->
                            generator.writeObject(value.bulkWithProration)
                        value.groupedTieredPackage != null ->
                            generator.writeObject(value.groupedTieredPackage)
                        value.scalableMatrixWithUnitPricing != null ->
                            generator.writeObject(value.scalableMatrixWithUnitPricing)
                        value.scalableMatrixWithTieredPricing != null ->
                            generator.writeObject(value.scalableMatrixWithTieredPricing)
                        value.cumulativeGroupedBulk != null ->
                            generator.writeObject(value.cumulativeGroupedBulk)
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

            return /* spotless:off */ other is PriceEvaluation && filter == other.filter && groupingKeys == other.groupingKeys && price == other.price && priceId == other.priceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(filter, groupingKeys, price, priceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PriceEvaluation{filter=$filter, groupingKeys=$groupingKeys, price=$price, priceId=$priceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceEvaluatePreviewEventsParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PriceEvaluatePreviewEventsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
