// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.CreditNoteService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [CreditNoteService.list] */
class CreditNoteListPage
private constructor(
    private val service: CreditNoteService,
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

    fun getNextPage(): Optional<CreditNoteListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CreditNoteListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditNoteListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditNoteListPage].
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

    /** A builder for [CreditNoteListPage]. */
    class Builder internal constructor() {

        private var service: CreditNoteService? = null
        private var params: CreditNoteListParams? = null
        private var response: CreditNoteListPageResponse? = null

        @JvmSynthetic
        internal fun from(creditNoteListPage: CreditNoteListPage) = apply {
            service = creditNoteListPage.service
            params = creditNoteListPage.params
            response = creditNoteListPage.response
        }

        fun service(service: CreditNoteService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CreditNoteListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditNoteListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditNoteListPage].
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
        fun build(): CreditNoteListPage =
            CreditNoteListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNoteListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CreditNoteListPage{service=$service, params=$params, response=$response}"
}
