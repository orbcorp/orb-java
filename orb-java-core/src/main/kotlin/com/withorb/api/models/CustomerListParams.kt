// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

/**
 * This endpoint returns a list of all customers for an account. The list of customers is ordered
 * starting from the most recently created customer. This endpoint follows Orb's
 * [standardized pagination format](/api-reference/pagination).
 *
 * See [Customer](/core-concepts##customer) for an overview of the customer model.
 */
class CustomerListParams
private constructor(
    private val createdAtGt: OffsetDateTime?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLt: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val cursor: String?,
    private val limit: Long?,
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

    /** The number of items to fetch. Defaults to 20. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.createdAtGt?.let {
            queryParams.put(
                "created_at[gt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)),
            )
        }
        this.createdAtGte?.let {
            queryParams.put(
                "created_at[gte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)),
            )
        }
        this.createdAtLt?.let {
            queryParams.put(
                "created_at[lt]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)),
            )
        }
        this.createdAtLte?.let {
            queryParams.put(
                "created_at[lte]",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)),
            )
        }
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CustomerListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CustomerListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var createdAtGt: OffsetDateTime? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLt: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerListParams: CustomerListParams) = apply {
            createdAtGt = customerListParams.createdAtGt
            createdAtGte = customerListParams.createdAtGte
            createdAtLt = customerListParams.createdAtLt
            createdAtLte = customerListParams.createdAtLte
            cursor = customerListParams.cursor
            limit = customerListParams.limit
            additionalHeaders = customerListParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerListParams.additionalQueryParams.toBuilder()
        }

        fun createdAtGt(createdAtGt: OffsetDateTime?) = apply { this.createdAtGt = createdAtGt }

        fun createdAtGt(createdAtGt: Optional<OffsetDateTime>) =
            createdAtGt(createdAtGt.orElse(null))

        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        fun createdAtGte(createdAtGte: Optional<OffsetDateTime>) =
            createdAtGte(createdAtGte.orElse(null))

        fun createdAtLt(createdAtLt: OffsetDateTime?) = apply { this.createdAtLt = createdAtLt }

        fun createdAtLt(createdAtLt: Optional<OffsetDateTime>) =
            createdAtLt(createdAtLt.orElse(null))

        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        fun createdAtLte(createdAtLte: Optional<OffsetDateTime>) =
            createdAtLte(createdAtLte.orElse(null))

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: Optional<String>) = cursor(cursor.orElse(null))

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = limit(limit as Long?)

        /** The number of items to fetch. Defaults to 20. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

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

        fun build(): CustomerListParams =
            CustomerListParams(
                createdAtGt,
                createdAtGte,
                createdAtLt,
                createdAtLte,
                cursor,
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListParams && createdAtGt == other.createdAtGt && createdAtGte == other.createdAtGte && createdAtLt == other.createdAtLt && createdAtLte == other.createdAtLte && cursor == other.cursor && limit == other.limit && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(createdAtGt, createdAtGte, createdAtLt, createdAtLte, cursor, limit, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerListParams{createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, cursor=$cursor, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
