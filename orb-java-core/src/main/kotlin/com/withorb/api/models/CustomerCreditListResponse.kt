// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonField
import com.withorb.api.core.Enum
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException

@JsonDeserialize(builder = CustomerCreditListResponse.Builder::class)
@NoAutoDetect
class CustomerCreditListResponse private constructor(
  private val id: JsonField<String>,
  private val balance: JsonField<Double>,
  private val effectiveDate: JsonField<OffsetDateTime>,
  private val expiryDate: JsonField<OffsetDateTime>,
  private val perUnitCostBasis: JsonField<String>,
  private val status: JsonField<Status>,
  private val maximumInitialBalance: JsonField<Double>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun balance(): Double = balance.getRequired("balance")

    fun effectiveDate(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveDate.getNullable("effective_date"))

    fun expiryDate(): Optional<OffsetDateTime> = Optional.ofNullable(expiryDate.getNullable("expiry_date"))

    fun perUnitCostBasis(): Optional<String> = Optional.ofNullable(perUnitCostBasis.getNullable("per_unit_cost_basis"))

    fun status(): Status = status.getRequired("status")

    fun maximumInitialBalance(): Optional<Double> = Optional.ofNullable(maximumInitialBalance.getNullable("maximum_initial_balance"))

    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    @JsonProperty("balance")
    @ExcludeMissing
    fun _balance() = balance

    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate() = effectiveDate

    @JsonProperty("expiry_date")
    @ExcludeMissing
    fun _expiryDate() = expiryDate

    @JsonProperty("per_unit_cost_basis")
    @ExcludeMissing
    fun _perUnitCostBasis() = perUnitCostBasis

    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    @JsonProperty("maximum_initial_balance")
    @ExcludeMissing
    fun _maximumInitialBalance() = maximumInitialBalance

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CustomerCreditListResponse = apply {
        if (!validated) {
          id()
          balance()
          effectiveDate()
          expiryDate()
          perUnitCostBasis()
          status()
          maximumInitialBalance()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is CustomerCreditListResponse &&
          this.id == other.id &&
          this.balance == other.balance &&
          this.effectiveDate == other.effectiveDate &&
          this.expiryDate == other.expiryDate &&
          this.perUnitCostBasis == other.perUnitCostBasis &&
          this.status == other.status &&
          this.maximumInitialBalance == other.maximumInitialBalance &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            id,
            balance,
            effectiveDate,
            expiryDate,
            perUnitCostBasis,
            status,
            maximumInitialBalance,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "CustomerCreditListResponse{id=$id, balance=$balance, effectiveDate=$effectiveDate, expiryDate=$expiryDate, perUnitCostBasis=$perUnitCostBasis, status=$status, maximumInitialBalance=$maximumInitialBalance, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var balance: JsonField<Double> = JsonMissing.of()
        private var effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var expiryDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var perUnitCostBasis: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var maximumInitialBalance: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerCreditListResponse: CustomerCreditListResponse) = apply {
            this.id = customerCreditListResponse.id
            this.balance = customerCreditListResponse.balance
            this.effectiveDate = customerCreditListResponse.effectiveDate
            this.expiryDate = customerCreditListResponse.expiryDate
            this.perUnitCostBasis = customerCreditListResponse.perUnitCostBasis
            this.status = customerCreditListResponse.status
            this.maximumInitialBalance = customerCreditListResponse.maximumInitialBalance
            additionalProperties(customerCreditListResponse.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        fun balance(balance: Double) = balance(JsonField.of(balance))

        @JsonProperty("balance")
        @ExcludeMissing
        fun balance(balance: JsonField<Double>) = apply {
            this.balance = balance
        }

        fun effectiveDate(effectiveDate: OffsetDateTime) = effectiveDate(JsonField.of(effectiveDate))

        @JsonProperty("effective_date")
        @ExcludeMissing
        fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
            this.effectiveDate = effectiveDate
        }

        fun expiryDate(expiryDate: OffsetDateTime) = expiryDate(JsonField.of(expiryDate))

        @JsonProperty("expiry_date")
        @ExcludeMissing
        fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
            this.expiryDate = expiryDate
        }

        fun perUnitCostBasis(perUnitCostBasis: String) = perUnitCostBasis(JsonField.of(perUnitCostBasis))

        @JsonProperty("per_unit_cost_basis")
        @ExcludeMissing
        fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
            this.perUnitCostBasis = perUnitCostBasis
        }

        fun status(status: Status) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        fun maximumInitialBalance(maximumInitialBalance: Double) = maximumInitialBalance(JsonField.of(maximumInitialBalance))

        @JsonProperty("maximum_initial_balance")
        @ExcludeMissing
        fun maximumInitialBalance(maximumInitialBalance: JsonField<Double>) = apply {
            this.maximumInitialBalance = maximumInitialBalance
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

        fun build(): CustomerCreditListResponse = CustomerCreditListResponse(
            id,
            balance,
            effectiveDate,
            expiryDate,
            perUnitCostBasis,
            status,
            maximumInitialBalance,
            additionalProperties.toUnmodifiable(),
        )
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACTIVE = Status(JsonField.of("active"))

            @JvmField val PENDING_PAYMENT = Status(JsonField.of("pending_payment"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            PENDING_PAYMENT,
        }

        enum class Value {
            ACTIVE,
            PENDING_PAYMENT,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACTIVE -> Value.ACTIVE
            PENDING_PAYMENT -> Value.PENDING_PAYMENT
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACTIVE -> Known.ACTIVE
            PENDING_PAYMENT -> Known.PENDING_PAYMENT
            else -> throw OrbInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
