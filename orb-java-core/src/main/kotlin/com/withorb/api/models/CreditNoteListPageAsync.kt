// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.CreditNoteServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Get a paginated list of CreditNotes. Users can also filter by customer_id, subscription_id, or
 * external_customer_id. The credit notes will be returned in reverse chronological order by
 * `creation_time`.
 */
class CreditNoteListPageAsync
private constructor(
    private val creditNotesService: CreditNoteServiceAsync,
    private val params: CreditNoteListParams,
    private val response: CreditNoteListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CreditNoteListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNoteListPageAsync && creditNotesService == other.creditNotesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditNotesService, params, response) /* spotless:on */

    override fun toString() =
        "CreditNoteListPageAsync{creditNotesService=$creditNotesService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<CreditNoteListPageAsync>> {
        return getNextPageParams()
            .map { creditNotesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            creditNotesService: CreditNoteServiceAsync,
            params: CreditNoteListParams,
            response: CreditNoteListPageResponse,
        ) = CreditNoteListPageAsync(creditNotesService, params, response)
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
}
