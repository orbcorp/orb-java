// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.MigrationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see MigrationService.list */
class MigrationListPage
private constructor(
    private val service: MigrationService,
    private val params: MigrationListParams,
    private val response: MigrationListPageResponse,
) : Page<MigrationListResponse> {

    /**
     * Delegates to [MigrationListPageResponse], but gracefully handles missing data.
     *
     * @see MigrationListPageResponse.data
     */
    fun data(): List<MigrationListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MigrationListPageResponse], but gracefully handles missing data.
     *
     * @see MigrationListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<MigrationListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): MigrationListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): MigrationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MigrationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MigrationListParams = params

    /** The response that this page was parsed from. */
    fun response(): MigrationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MigrationListPage].
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

    /** A builder for [MigrationListPage]. */
    class Builder internal constructor() {

        private var service: MigrationService? = null
        private var params: MigrationListParams? = null
        private var response: MigrationListPageResponse? = null

        @JvmSynthetic
        internal fun from(migrationListPage: MigrationListPage) = apply {
            service = migrationListPage.service
            params = migrationListPage.params
            response = migrationListPage.response
        }

        fun service(service: MigrationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MigrationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MigrationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MigrationListPage].
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
        fun build(): MigrationListPage =
            MigrationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MigrationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MigrationListPage{service=$service, params=$params, response=$response}"
}
