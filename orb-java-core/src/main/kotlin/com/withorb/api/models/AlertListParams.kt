// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class AlertListParams
constructor(
    private val createdAtGt: OffsetDateTime?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLt: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val cursor: String?,
    private val customerId: String?,
    private val externalCustomerId: String?,
    private val limit: Long?,
    private val subscriptionId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun createdAtGt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGt)

    fun createdAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGte)

    fun createdAtLt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLt)

    fun createdAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLte)

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun customerId(): Optional<String> = Optional.ofNullable(customerId)

    fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun subscriptionId(): Optional<String> = Optional.ofNullable(subscriptionId)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.createdAtGt?.let {
            params.put("created_at[gt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.createdAtGte?.let {
            params.put("created_at[gte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.createdAtLt?.let {
            params.put("created_at[lt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.createdAtLte?.let {
            params.put("created_at[lte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.customerId?.let { params.put("customer_id", listOf(it.toString())) }
        this.externalCustomerId?.let { params.put("external_customer_id", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.subscriptionId?.let { params.put("subscription_id", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlertListParams && this.createdAtGt == other.createdAtGt && this.createdAtGte == other.createdAtGte && this.createdAtLt == other.createdAtLt && this.createdAtLte == other.createdAtLte && this.cursor == other.cursor && this.customerId == other.customerId && this.externalCustomerId == other.externalCustomerId && this.limit == other.limit && this.subscriptionId == other.subscriptionId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(createdAtGt, createdAtGte, createdAtLt, createdAtLte, cursor, customerId, externalCustomerId, limit, subscriptionId, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "AlertListParams{createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, cursor=$cursor, customerId=$customerId, externalCustomerId=$externalCustomerId, limit=$limit, subscriptionId=$subscriptionId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var createdAtGt: OffsetDateTime? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLt: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var cursor: String? = null
        private var customerId: String? = null
        private var externalCustomerId: String? = null
        private var limit: Long? = null
        private var subscriptionId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(alertListParams: AlertListParams) = apply {
            this.createdAtGt = alertListParams.createdAtGt
            this.createdAtGte = alertListParams.createdAtGte
            this.createdAtLt = alertListParams.createdAtLt
            this.createdAtLte = alertListParams.createdAtLte
            this.cursor = alertListParams.cursor
            this.customerId = alertListParams.customerId
            this.externalCustomerId = alertListParams.externalCustomerId
            this.limit = alertListParams.limit
            this.subscriptionId = alertListParams.subscriptionId
            additionalQueryParams(alertListParams.additionalQueryParams)
            additionalHeaders(alertListParams.additionalHeaders)
        }

        fun createdAtGt(createdAtGt: OffsetDateTime) = apply { this.createdAtGt = createdAtGt }

        fun createdAtGte(createdAtGte: OffsetDateTime) = apply { this.createdAtGte = createdAtGte }

        fun createdAtLt(createdAtLt: OffsetDateTime) = apply { this.createdAtLt = createdAtLt }

        fun createdAtLte(createdAtLte: OffsetDateTime) = apply { this.createdAtLte = createdAtLte }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /** Fetch alerts scoped to this customer_id */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** Fetch alerts scoped to this external_customer_id */
        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** Fetch alerts scoped to this subscription_id */
        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): AlertListParams =
            AlertListParams(
                createdAtGt,
                createdAtGte,
                createdAtLt,
                createdAtLte,
                cursor,
                customerId,
                externalCustomerId,
                limit,
                subscriptionId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
