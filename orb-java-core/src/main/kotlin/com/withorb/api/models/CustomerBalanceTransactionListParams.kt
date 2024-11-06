// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class CustomerBalanceTransactionListParams
constructor(
    private val customerId: String,
    private val cursor: String?,
    private val limit: Long?,
    private val operationTimeGt: OffsetDateTime?,
    private val operationTimeGte: OffsetDateTime?,
    private val operationTimeLt: OffsetDateTime?,
    private val operationTimeLte: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = customerId

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun operationTimeGt(): Optional<OffsetDateTime> = Optional.ofNullable(operationTimeGt)

    fun operationTimeGte(): Optional<OffsetDateTime> = Optional.ofNullable(operationTimeGte)

    fun operationTimeLt(): Optional<OffsetDateTime> = Optional.ofNullable(operationTimeLt)

    fun operationTimeLte(): Optional<OffsetDateTime> = Optional.ofNullable(operationTimeLte)

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.operationTimeGt?.let {
            queryParams.put(
                "operation_time[gt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.operationTimeGte?.let {
            queryParams.put(
                "operation_time[gte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.operationTimeLt?.let {
            queryParams.put(
                "operation_time[lt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        this.operationTimeLte?.let {
            queryParams.put(
                "operation_time[lte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
            )
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBalanceTransactionListParams && this.customerId == other.customerId && this.cursor == other.cursor && this.limit == other.limit && this.operationTimeGt == other.operationTimeGt && this.operationTimeGte == other.operationTimeGte && this.operationTimeLt == other.operationTimeLt && this.operationTimeLte == other.operationTimeLte && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, cursor, limit, operationTimeGt, operationTimeGte, operationTimeLt, operationTimeLte, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "CustomerBalanceTransactionListParams{customerId=$customerId, cursor=$cursor, limit=$limit, operationTimeGt=$operationTimeGt, operationTimeGte=$operationTimeGte, operationTimeLt=$operationTimeLt, operationTimeLte=$operationTimeLte, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

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
            this.customerId = customerBalanceTransactionListParams.customerId
            this.cursor = customerBalanceTransactionListParams.cursor
            this.limit = customerBalanceTransactionListParams.limit
            this.operationTimeGt = customerBalanceTransactionListParams.operationTimeGt
            this.operationTimeGte = customerBalanceTransactionListParams.operationTimeGte
            this.operationTimeLt = customerBalanceTransactionListParams.operationTimeLt
            this.operationTimeLte = customerBalanceTransactionListParams.operationTimeLte
            additionalHeaders(customerBalanceTransactionListParams.additionalHeaders)
            additionalQueryParams(customerBalanceTransactionListParams.additionalQueryParams)
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply { this.limit = limit }

        fun operationTimeGt(operationTimeGt: OffsetDateTime) = apply {
            this.operationTimeGt = operationTimeGt
        }

        fun operationTimeGte(operationTimeGte: OffsetDateTime) = apply {
            this.operationTimeGte = operationTimeGte
        }

        fun operationTimeLt(operationTimeLt: OffsetDateTime) = apply {
            this.operationTimeLt = operationTimeLt
        }

        fun operationTimeLte(operationTimeLte: OffsetDateTime) = apply {
            this.operationTimeLte = operationTimeLte
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

        fun build(): CustomerBalanceTransactionListParams =
            CustomerBalanceTransactionListParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
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
}
