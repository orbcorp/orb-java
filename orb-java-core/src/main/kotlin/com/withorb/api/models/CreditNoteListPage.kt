// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.blocking.CreditNoteService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Get a paginated list of CreditNotes. Users can also filter by customer_id, subscription_id, or
 * external_customer_id. The credit notes will be returned in reverse chronological order by
 * `creation_time`.
 */
class CreditNoteListPage
private constructor(
    private val creditNotesService: CreditNoteService,
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

        return /* spotless:off */ other is CreditNoteListPage && creditNotesService == other.creditNotesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditNotesService, params, response) /* spotless:on */

    override fun toString() =
        "CreditNoteListPage{creditNotesService=$creditNotesService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<CreditNoteListPage> {
        return getNextPageParams().map { creditNotesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            creditNotesService: CreditNoteService,
            params: CreditNoteListParams,
            response: CreditNoteListPageResponse,
        ) = CreditNoteListPage(creditNotesService, params, response)
    }

    class AutoPager(private val firstPage: CreditNoteListPage) : Iterable<CreditNote> {

        override fun iterator(): Iterator<CreditNote> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<CreditNote> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
