// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.CreditNoteServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CreditNoteServiceAsync.list] */
class CreditNoteListPageAsync
private constructor(
    private val service: CreditNoteServiceAsync,
    private val params: CreditNoteListParams,
    private val response: CreditNoteListPageResponse,
) {

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

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<CreditNoteListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params
                .toBuilder()
                .apply {
                    paginationMetadata()
                        .flatMap { it._nextCursor().getOptional("next_cursor") }
                        .ifPresent { cursor(it) }
                }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CreditNoteListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreditNoteListPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditNoteServiceAsync? = null
        private var params: CreditNoteListParams? = null
        private var response: CreditNoteListPageResponse? = null

        @JvmSynthetic
        internal fun from(creditNoteListPageAsync: CreditNoteListPageAsync) = apply {
            service = creditNoteListPageAsync.service
            params = creditNoteListPageAsync.params
            response = creditNoteListPageAsync.response
        }

        fun service(service: CreditNoteServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditNoteListPageAsync =
            CreditNoteListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CreditNoteListPageAsync) {

        fun forEach(action: Predicate<CreditNote>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CreditNoteListPageAsync>>.forEach(
                action: (CreditNote) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<CreditNote>> {
            val values = mutableListOf<CreditNote>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNoteListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CreditNoteListPageAsync{service=$service, params=$params, response=$response}"
}
