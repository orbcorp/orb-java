// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.CreditNoteServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [CreditNoteServiceAsync.list] */
class CreditNoteListPageAsync
private constructor(
    private val service: CreditNoteServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CreditNoteListParams,
    private val response: CreditNoteListPageResponse,
) : PageAsync<CreditNote> {

    /**
     * Delegates to [CreditNoteListPageResponse], but gracefully handles missing data.
     *
     * @see [CreditNoteListPageResponse.data]
     */
    fun data(): List<CreditNote> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CreditNoteListPageResponse], but gracefully handles missing data.
     *
     * @see [CreditNoteListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<CreditNote> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): CreditNoteListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CreditNoteListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CreditNote> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CreditNoteListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditNoteListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditNoteListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditNoteListPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditNoteServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CreditNoteListParams? = null
        private var response: CreditNoteListPageResponse? = null

        @JvmSynthetic
        internal fun from(creditNoteListPageAsync: CreditNoteListPageAsync) = apply {
            service = creditNoteListPageAsync.service
            streamHandlerExecutor = creditNoteListPageAsync.streamHandlerExecutor
            params = creditNoteListPageAsync.params
            response = creditNoteListPageAsync.response
        }

        fun service(service: CreditNoteServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CreditNoteListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditNoteListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditNoteListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditNoteListPageAsync =
            CreditNoteListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNoteListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CreditNoteListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
