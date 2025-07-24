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
 * ## The customer balance
 *
 * The customer balance is an amount in the customer's currency, which Orb automatically applies to
 * subsequent invoices. This balance can be adjusted manually via Orb's webapp on the customer
 * details page. You can use this balance to provide a fixed mid-period credit to the customer.
 * Commonly, this is done due to system downtime/SLA violation, or an adhoc adjustment discussed
 * with the customer.
 *
 * If the balance is a positive value at the time of invoicing, it represents that the customer has
 * credit that should be used to offset the amount due on the next issued invoice. In this case, Orb
 * will automatically reduce the next invoice by the balance amount, and roll over any remaining
 * balance if the invoice is fully discounted.
 *
 * If the balance is a negative value at the time of invoicing, Orb will increase the invoice's
 * amount due with a positive adjustment, and reset the balance to 0.
 *
 * This endpoint retrieves all customer balance transactions in reverse chronological order for a
 * single customer, providing a complete audit trail of all adjustments and invoice applications.
 */
class CustomerBalanceTransactionListParams
private constructor(
    private val customerId: String?,
    private val cursor: String?,
    private val limit: Long?,
    private val operationTimeGt: OffsetDateTime?,
    private val operationTimeGte: OffsetDateTime?,
    private val operationTimeLt: OffsetDateTime?,
    private val operationTimeLte: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): Optional<String> = Optional.ofNullable(customerId)

    /**
     * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
     * initial request.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** The number of items to fetch. Defaults to 20. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun operationTimeGt(): Optional<OffsetDateTime> = Optional.ofNullable(operationTimeGt)

    fun operationTimeGte(): Optional<OffsetDateTime> = Optional.ofNullable(operationTimeGte)

    fun operationTimeLt(): Optional<OffsetDateTime> = Optional.ofNullable(operationTimeLt)

    fun operationTimeLte(): Optional<OffsetDateTime> = Optional.ofNullable(operationTimeLte)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CustomerBalanceTransactionListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerBalanceTransactionListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerBalanceTransactionListParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var operationTimeGt: OffsetDateTime? = null
        private var operationTimeGte: OffsetDateTime? = null
        private var operationTimeLt: OffsetDateTime? = null
        private var operationTimeLte: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            customerBalanceTransactionListParams: CustomerBalanceTransactionListParams
        ) = apply {
            customerId = customerBalanceTransactionListParams.customerId
            cursor = customerBalanceTransactionListParams.cursor
            limit = customerBalanceTransactionListParams.limit
            operationTimeGt = customerBalanceTransactionListParams.operationTimeGt
            operationTimeGte = customerBalanceTransactionListParams.operationTimeGte
            operationTimeLt = customerBalanceTransactionListParams.operationTimeLt
            operationTimeLte = customerBalanceTransactionListParams.operationTimeLte
            additionalHeaders = customerBalanceTransactionListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerBalanceTransactionListParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** Alias for calling [Builder.customerId] with `customerId.orElse(null)`. */
        fun customerId(customerId: Optional<String>) = customerId(customerId.getOrNull())

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

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

        fun operationTimeGt(operationTimeGt: OffsetDateTime?) = apply {
            this.operationTimeGt = operationTimeGt
        }

        /** Alias for calling [Builder.operationTimeGt] with `operationTimeGt.orElse(null)`. */
        fun operationTimeGt(operationTimeGt: Optional<OffsetDateTime>) =
            operationTimeGt(operationTimeGt.getOrNull())

        fun operationTimeGte(operationTimeGte: OffsetDateTime?) = apply {
            this.operationTimeGte = operationTimeGte
        }

        /** Alias for calling [Builder.operationTimeGte] with `operationTimeGte.orElse(null)`. */
        fun operationTimeGte(operationTimeGte: Optional<OffsetDateTime>) =
            operationTimeGte(operationTimeGte.getOrNull())

        fun operationTimeLt(operationTimeLt: OffsetDateTime?) = apply {
            this.operationTimeLt = operationTimeLt
        }

        /** Alias for calling [Builder.operationTimeLt] with `operationTimeLt.orElse(null)`. */
        fun operationTimeLt(operationTimeLt: Optional<OffsetDateTime>) =
            operationTimeLt(operationTimeLt.getOrNull())

        fun operationTimeLte(operationTimeLte: OffsetDateTime?) = apply {
            this.operationTimeLte = operationTimeLte
        }

        /** Alias for calling [Builder.operationTimeLte] with `operationTimeLte.orElse(null)`. */
        fun operationTimeLte(operationTimeLte: Optional<OffsetDateTime>) =
            operationTimeLte(operationTimeLte.getOrNull())

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
         * Returns an immutable instance of [CustomerBalanceTransactionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerBalanceTransactionListParams =
            CustomerBalanceTransactionListParams(
                customerId,
                cursor,
                limit,
                operationTimeGt,
                operationTimeGte,
                operationTimeLt,
                operationTimeLte,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                operationTimeGt?.let {
                    put("operation_time[gt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                operationTimeGte?.let {
                    put("operation_time[gte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                operationTimeLt?.let {
                    put("operation_time[lt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                operationTimeLte?.let {
                    put("operation_time[lte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBalanceTransactionListParams && customerId == other.customerId && cursor == other.cursor && limit == other.limit && operationTimeGt == other.operationTimeGt && operationTimeGte == other.operationTimeGte && operationTimeLt == other.operationTimeLt && operationTimeLte == other.operationTimeLte && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, cursor, limit, operationTimeGt, operationTimeGte, operationTimeLt, operationTimeLte, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerBalanceTransactionListParams{customerId=$customerId, cursor=$cursor, limit=$limit, operationTimeGt=$operationTimeGt, operationTimeGte=$operationTimeGte, operationTimeLt=$operationTimeLt, operationTimeLte=$operationTimeLte, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
