// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
 *
 * If `include_all_blocks` is set to `true`, all credit blocks (including expired and depleted
 * blocks) will be included in the response.
 *
 * Note that `currency` defaults to credits if not specified. To use a real world currency, set
 * `currency` to an ISO 4217 string.
 */
class CustomerCreditListParams
private constructor(
    private val customerId: String,
    private val currency: String?,
    private val cursor: String?,
    private val includeAllBlocks: Boolean?,
    private val limit: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    /** The ledger currency or custom pricing unit to use. */
    fun currency(): Optional<String> = Optional.ofNullable(currency)

    /**
     * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
     * initial request.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /**
     * If set to True, all expired and depleted blocks, as well as active block will be returned.
     */
    fun includeAllBlocks(): Optional<Boolean> = Optional.ofNullable(includeAllBlocks)

    /** The number of items to fetch. Defaults to 20. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.currency?.let { queryParams.put("currency", listOf(it.toString())) }
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.includeAllBlocks?.let { queryParams.put("include_all_blocks", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerCreditListParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerCreditListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var customerId: String? = null
        private var currency: String? = null
        private var cursor: String? = null
        private var includeAllBlocks: Boolean? = null
        private var limit: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerCreditListParams: CustomerCreditListParams) = apply {
            customerId = customerCreditListParams.customerId
            currency = customerCreditListParams.currency
            cursor = customerCreditListParams.cursor
            includeAllBlocks = customerCreditListParams.includeAllBlocks
            limit = customerCreditListParams.limit
            additionalHeaders = customerCreditListParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCreditListParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** The ledger currency or custom pricing unit to use. */
        fun currency(currency: String?) = apply { this.currency = currency }

        /** The ledger currency or custom pricing unit to use. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * If set to True, all expired and depleted blocks, as well as active block will be
         * returned.
         */
        fun includeAllBlocks(includeAllBlocks: Boolean?) = apply {
            this.includeAllBlocks = includeAllBlocks
        }

        /**
         * If set to True, all expired and depleted blocks, as well as active block will be
         * returned.
         */
        fun includeAllBlocks(includeAllBlocks: Boolean) =
            includeAllBlocks(includeAllBlocks as Boolean?)

        /**
         * If set to True, all expired and depleted blocks, as well as active block will be
         * returned.
         */
        fun includeAllBlocks(includeAllBlocks: Optional<Boolean>) =
            includeAllBlocks(includeAllBlocks.getOrNull())

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = limit(limit as Long?)

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

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

        fun build(): CustomerCreditListParams =
            CustomerCreditListParams(
                checkRequired("customerId", customerId),
                currency,
                cursor,
                includeAllBlocks,
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditListParams && customerId == other.customerId && currency == other.currency && cursor == other.cursor && includeAllBlocks == other.includeAllBlocks && limit == other.limit && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, currency, cursor, includeAllBlocks, limit, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCreditListParams{customerId=$customerId, currency=$currency, cursor=$cursor, includeAllBlocks=$includeAllBlocks, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
