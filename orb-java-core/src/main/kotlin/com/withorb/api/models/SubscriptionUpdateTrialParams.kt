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
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class SubscriptionUpdateTrialParams
constructor(
    private val subscriptionId: String,
    private val trialEndDate: TrialEndDate,
    private val shift: Boolean?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun subscriptionId(): String = subscriptionId

    fun trialEndDate(): TrialEndDate = trialEndDate

    fun shift(): Optional<Boolean> = Optional.ofNullable(shift)

    @JvmSynthetic
    internal fun getBody(): SubscriptionUpdateTrialBody {
        return SubscriptionUpdateTrialBody(
            trialEndDate,
            shift,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SubscriptionUpdateTrialBody.Builder::class)
    @NoAutoDetect
    class SubscriptionUpdateTrialBody
    internal constructor(
        private val trialEndDate: TrialEndDate?,
        private val shift: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The new date that the trial should end, or the literal string `immediate` to end the
         * trial immediately.
         */
        @JsonProperty("trial_end_date") fun trialEndDate(): TrialEndDate? = trialEndDate

        /**
         * If true, shifts subsequent price and adjustment intervals (preserving their durations,
         * but adjusting their absolute dates).
         */
        @JsonProperty("shift") fun shift(): Boolean? = shift

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var trialEndDate: TrialEndDate? = null
            private var shift: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscriptionUpdateTrialBody: SubscriptionUpdateTrialBody) = apply {
                this.trialEndDate = subscriptionUpdateTrialBody.trialEndDate
                this.shift = subscriptionUpdateTrialBody.shift
                additionalProperties(subscriptionUpdateTrialBody.additionalProperties)
            }

            /**
             * The new date that the trial should end, or the literal string `immediate` to end the
             * trial immediately.
             */
            @JsonProperty("trial_end_date")
            fun trialEndDate(trialEndDate: TrialEndDate) = apply {
                this.trialEndDate = trialEndDate
            }

            /**
             * If true, shifts subsequent price and adjustment intervals (preserving their
             * durations, but adjusting their absolute dates).
             */
            @JsonProperty("shift") fun shift(shift: Boolean) = apply { this.shift = shift }

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

            fun build(): SubscriptionUpdateTrialBody =
                SubscriptionUpdateTrialBody(
                    checkNotNull(trialEndDate) { "`trialEndDate` is required but was not set" },
                    shift,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SubscriptionUpdateTrialBody && this.trialEndDate == other.trialEndDate && this.shift == other.shift && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(trialEndDate, shift, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SubscriptionUpdateTrialBody{trialEndDate=$trialEndDate, shift=$shift, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionUpdateTrialParams && this.subscriptionId == other.subscriptionId && this.trialEndDate == other.trialEndDate && this.shift == other.shift && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(subscriptionId, trialEndDate, shift, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SubscriptionUpdateTrialParams{subscriptionId=$subscriptionId, trialEndDate=$trialEndDate, shift=$shift, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var subscriptionId: String? = null
        private var trialEndDate: TrialEndDate? = null
        private var shift: Boolean? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionUpdateTrialParams: SubscriptionUpdateTrialParams) = apply {
            this.subscriptionId = subscriptionUpdateTrialParams.subscriptionId
            this.trialEndDate = subscriptionUpdateTrialParams.trialEndDate
            this.shift = subscriptionUpdateTrialParams.shift
            additionalHeaders(subscriptionUpdateTrialParams.additionalHeaders)
            additionalQueryParams(subscriptionUpdateTrialParams.additionalQueryParams)
            additionalBodyProperties(subscriptionUpdateTrialParams.additionalBodyProperties)
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /**
         * The new date that the trial should end, or the literal string `immediate` to end the
         * trial immediately.
         */
        fun trialEndDate(trialEndDate: TrialEndDate) = apply { this.trialEndDate = trialEndDate }

        /**
         * The new date that the trial should end, or the literal string `immediate` to end the
         * trial immediately.
         */
        fun trialEndDate(offsetDateTime: OffsetDateTime) = apply {
            this.trialEndDate = TrialEndDate.ofOffsetDateTime(offsetDateTime)
        }

        /**
         * The new date that the trial should end, or the literal string `immediate` to end the
         * trial immediately.
         */
        fun trialEndDate(unionMember1: TrialEndDate.UnionMember1) = apply {
            this.trialEndDate = TrialEndDate.ofUnionMember1(unionMember1)
        }

        /**
         * If true, shifts subsequent price and adjustment intervals (preserving their durations,
         * but adjusting their absolute dates).
         */
        fun shift(shift: Boolean) = apply { this.shift = shift }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): SubscriptionUpdateTrialParams =
            SubscriptionUpdateTrialParams(
                checkNotNull(subscriptionId) { "`subscriptionId` is required but was not set" },
                checkNotNull(trialEndDate) { "`trialEndDate` is required but was not set" },
                shift,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = TrialEndDate.Deserializer::class)
    @JsonSerialize(using = TrialEndDate.Serializer::class)
    class TrialEndDate
    private constructor(
        private val offsetDateTime: OffsetDateTime? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun offsetDateTime(): Optional<OffsetDateTime> = Optional.ofNullable(offsetDateTime)

        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun isOffsetDateTime(): Boolean = offsetDateTime != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): TrialEndDate = apply {
            if (!validated) {
                if (offsetDateTime == null && unionMember1 == null) {
                    throw OrbInvalidDataException("Unknown TrialEndDate: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrialEndDate && this.offsetDateTime == other.offsetDateTime && this.unionMember1 == other.unionMember1 /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(offsetDateTime, unionMember1) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                offsetDateTime != null -> "TrialEndDate{offsetDateTime=$offsetDateTime}"
                unionMember1 != null -> "TrialEndDate{unionMember1=$unionMember1}"
                _json != null -> "TrialEndDate{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TrialEndDate")
            }
        }

        companion object {

            @JvmStatic
            fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                TrialEndDate(offsetDateTime = offsetDateTime)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) =
                TrialEndDate(unionMember1 = unionMember1)
        }

        interface Visitor<out T> {

            fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown TrialEndDate: $json")
            }
        }

        class Deserializer : BaseDeserializer<TrialEndDate>(TrialEndDate::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TrialEndDate {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                    return TrialEndDate(offsetDateTime = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                    return TrialEndDate(unionMember1 = it, _json = json)
                }

                return TrialEndDate(_json = json)
            }
        }

        class Serializer : BaseSerializer<TrialEndDate>(TrialEndDate::class) {

            override fun serialize(
                value: TrialEndDate,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.offsetDateTime != null -> generator.writeObject(value.offsetDateTime)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TrialEndDate")
                }
            }
        }

        class UnionMember1
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnionMember1 && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val IMMEDIATE = UnionMember1(JsonField.of("immediate"))

                @JvmStatic fun of(value: String) = UnionMember1(JsonField.of(value))
            }

            enum class Known {
                IMMEDIATE,
            }

            enum class Value {
                IMMEDIATE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    IMMEDIATE -> Value.IMMEDIATE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    IMMEDIATE -> Known.IMMEDIATE
                    else -> throw OrbInvalidDataException("Unknown UnionMember1: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
