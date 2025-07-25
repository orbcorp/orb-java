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
 * This endpoint returns a [paginated](/api-reference/pagination) list of all plans associated with
 * a subscription along with their start and end dates. This list contains the subscription's
 * initial plan along with past and future plan changes.
 */
class SubscriptionFetchScheduleParams
private constructor(
    private val subscriptionId: String?,
    private val cursor: String?,
    private val limit: Long?,
    private val startDateGt: OffsetDateTime?,
    private val startDateGte: OffsetDateTime?,
    private val startDateLt: OffsetDateTime?,
    private val startDateLte: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): Optional<String> = Optional.ofNullable(subscriptionId)

    /**
     * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
     * initial request.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** The number of items to fetch. Defaults to 20. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun startDateGt(): Optional<OffsetDateTime> = Optional.ofNullable(startDateGt)

    fun startDateGte(): Optional<OffsetDateTime> = Optional.ofNullable(startDateGte)

    fun startDateLt(): Optional<OffsetDateTime> = Optional.ofNullable(startDateLt)

    fun startDateLte(): Optional<OffsetDateTime> = Optional.ofNullable(startDateLte)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SubscriptionFetchScheduleParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionFetchScheduleParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionFetchScheduleParams]. */
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var startDateGt: OffsetDateTime? = null
        private var startDateGte: OffsetDateTime? = null
        private var startDateLt: OffsetDateTime? = null
        private var startDateLte: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionFetchScheduleParams: SubscriptionFetchScheduleParams) =
            apply {
                subscriptionId = subscriptionFetchScheduleParams.subscriptionId
                cursor = subscriptionFetchScheduleParams.cursor
                limit = subscriptionFetchScheduleParams.limit
                startDateGt = subscriptionFetchScheduleParams.startDateGt
                startDateGte = subscriptionFetchScheduleParams.startDateGte
                startDateLt = subscriptionFetchScheduleParams.startDateLt
                startDateLte = subscriptionFetchScheduleParams.startDateLte
                additionalHeaders = subscriptionFetchScheduleParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    subscriptionFetchScheduleParams.additionalQueryParams.toBuilder()
            }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        /** Alias for calling [Builder.subscriptionId] with `subscriptionId.orElse(null)`. */
        fun subscriptionId(subscriptionId: Optional<String>) =
            subscriptionId(subscriptionId.getOrNull())

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

        fun startDateGt(startDateGt: OffsetDateTime?) = apply { this.startDateGt = startDateGt }

        /** Alias for calling [Builder.startDateGt] with `startDateGt.orElse(null)`. */
        fun startDateGt(startDateGt: Optional<OffsetDateTime>) =
            startDateGt(startDateGt.getOrNull())

        fun startDateGte(startDateGte: OffsetDateTime?) = apply { this.startDateGte = startDateGte }

        /** Alias for calling [Builder.startDateGte] with `startDateGte.orElse(null)`. */
        fun startDateGte(startDateGte: Optional<OffsetDateTime>) =
            startDateGte(startDateGte.getOrNull())

        fun startDateLt(startDateLt: OffsetDateTime?) = apply { this.startDateLt = startDateLt }

        /** Alias for calling [Builder.startDateLt] with `startDateLt.orElse(null)`. */
        fun startDateLt(startDateLt: Optional<OffsetDateTime>) =
            startDateLt(startDateLt.getOrNull())

        fun startDateLte(startDateLte: OffsetDateTime?) = apply { this.startDateLte = startDateLte }

        /** Alias for calling [Builder.startDateLte] with `startDateLte.orElse(null)`. */
        fun startDateLte(startDateLte: Optional<OffsetDateTime>) =
            startDateLte(startDateLte.getOrNull())

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
         * Returns an immutable instance of [SubscriptionFetchScheduleParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionFetchScheduleParams =
            SubscriptionFetchScheduleParams(
                subscriptionId,
                cursor,
                limit,
                startDateGt,
                startDateGte,
                startDateLt,
                startDateLte,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cursor?.let { put("cursor", it) }
                limit?.let { put("limit", it.toString()) }
                startDateGt?.let {
                    put("start_date[gt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                startDateGte?.let {
                    put("start_date[gte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                startDateLt?.let {
                    put("start_date[lt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                startDateLte?.let {
                    put("start_date[lte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchScheduleParams && subscriptionId == other.subscriptionId && cursor == other.cursor && limit == other.limit && startDateGt == other.startDateGt && startDateGte == other.startDateGte && startDateLt == other.startDateLt && startDateLte == other.startDateLte && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, cursor, limit, startDateGt, startDateGte, startDateLt, startDateLte, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionFetchScheduleParams{subscriptionId=$subscriptionId, cursor=$cursor, limit=$limit, startDateGt=$startDateGt, startDateGte=$startDateGte, startDateLt=$startDateLt, startDateLte=$startDateLte, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
