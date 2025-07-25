// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint returns a list of alerts within Orb.
 *
 * The request must specify one of `customer_id`, `external_customer_id`, or `subscription_id`.
 *
 * If querying by subscripion_id, the endpoint will return the subscription level alerts as well as
 * the plan level alerts associated with the subscription.
 *
 * The list of alerts is ordered starting from the most recently created alert. This endpoint
 * follows Orb's [standardized pagination format](/api-reference/pagination).
 */
class AlertListParams
private constructor(
    private val createdAtGt: OffsetDateTime?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLt: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val cursor: String?,
    private val customerId: String?,
    private val externalCustomerId: String?,
    private val limit: Long?,
    private val subscriptionId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun createdAtGt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGt)

    fun createdAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGte)

    fun createdAtLt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLt)

    fun createdAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLte)

    /**
     * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
     * initial request.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Fetch alerts scoped to this customer_id */
    fun customerId(): Optional<String> = Optional.ofNullable(customerId)

    /** Fetch alerts scoped to this external_customer_id */
    fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId)

    /** The number of items to fetch. Defaults to 20. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Fetch alerts scoped to this subscription_id */
    fun subscriptionId(): Optional<String> = Optional.ofNullable(subscriptionId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AlertListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AlertListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AlertListParams]. */
    class Builder internal constructor() {

        private var createdAtGt: OffsetDateTime? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLt: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var cursor: String? = null
        private var customerId: String? = null
        private var externalCustomerId: String? = null
        private var limit: Long? = null
        private var subscriptionId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(alertListParams: AlertListParams) = apply {
            createdAtGt = alertListParams.createdAtGt
            createdAtGte = alertListParams.createdAtGte
            createdAtLt = alertListParams.createdAtLt
            createdAtLte = alertListParams.createdAtLte
            cursor = alertListParams.cursor
            customerId = alertListParams.customerId
            externalCustomerId = alertListParams.externalCustomerId
            limit = alertListParams.limit
            subscriptionId = alertListParams.subscriptionId
            additionalHeaders = alertListParams.additionalHeaders.toBuilder()
            additionalQueryParams = alertListParams.additionalQueryParams.toBuilder()
        }

        fun createdAtGt(createdAtGt: OffsetDateTime?) = apply { this.createdAtGt = createdAtGt }

        /** Alias for calling [Builder.createdAtGt] with `createdAtGt.orElse(null)`. */
        fun createdAtGt(createdAtGt: Optional<OffsetDateTime>) =
            createdAtGt(createdAtGt.getOrNull())

        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        /** Alias for calling [Builder.createdAtGte] with `createdAtGte.orElse(null)`. */
        fun createdAtGte(createdAtGte: Optional<OffsetDateTime>) =
            createdAtGte(createdAtGte.getOrNull())

        fun createdAtLt(createdAtLt: OffsetDateTime?) = apply { this.createdAtLt = createdAtLt }

        /** Alias for calling [Builder.createdAtLt] with `createdAtLt.orElse(null)`. */
        fun createdAtLt(createdAtLt: Optional<OffsetDateTime>) =
            createdAtLt(createdAtLt.getOrNull())

        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        /** Alias for calling [Builder.createdAtLte] with `createdAtLte.orElse(null)`. */
        fun createdAtLte(createdAtLte: Optional<OffsetDateTime>) =
            createdAtLte(createdAtLte.getOrNull())

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Fetch alerts scoped to this customer_id */
        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** Alias for calling [Builder.customerId] with `customerId.orElse(null)`. */
        fun customerId(customerId: Optional<String>) = customerId(customerId.getOrNull())

        /** Fetch alerts scoped to this external_customer_id */
        fun externalCustomerId(externalCustomerId: String?) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /**
         * Alias for calling [Builder.externalCustomerId] with `externalCustomerId.orElse(null)`.
         */
        fun externalCustomerId(externalCustomerId: Optional<String>) =
            externalCustomerId(externalCustomerId.getOrNull())

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Fetch alerts scoped to this subscription_id */
        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        /** Alias for calling [Builder.subscriptionId] with `subscriptionId.orElse(null)`. */
        fun subscriptionId(subscriptionId: Optional<String>) =
            subscriptionId(subscriptionId.getOrNull())

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
         * Returns an immutable instance of [AlertListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                createdAtGt?.let {
                    put("created_at[gt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtGte?.let {
                    put("created_at[gte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtLt?.let {
                    put("created_at[lt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtLte?.let {
                    put("created_at[lte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                cursor?.let { put("cursor", it) }
                customerId?.let { put("customer_id", it) }
                externalCustomerId?.let { put("external_customer_id", it) }
                limit?.let { put("limit", it.toString()) }
                subscriptionId?.let { put("subscription_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlertListParams && createdAtGt == other.createdAtGt && createdAtGte == other.createdAtGte && createdAtLt == other.createdAtLt && createdAtLte == other.createdAtLte && cursor == other.cursor && customerId == other.customerId && externalCustomerId == other.externalCustomerId && limit == other.limit && subscriptionId == other.subscriptionId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(createdAtGt, createdAtGte, createdAtLt, createdAtLte, cursor, customerId, externalCustomerId, limit, subscriptionId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AlertListParams{createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, cursor=$cursor, customerId=$customerId, externalCustomerId=$externalCustomerId, limit=$limit, subscriptionId=$subscriptionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
