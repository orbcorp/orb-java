// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.plans.MigrationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see MigrationService.list */
class PlanMigrationListPage
private constructor(
    private val service: MigrationService,
    private val params: PlanMigrationListParams,
    private val response: PlanMigrationListPageResponse,
) : Page<PlanMigrationListResponse> {

    /**
     * Delegates to [PlanMigrationListPageResponse], but gracefully handles missing data.
     *
     * @see PlanMigrationListPageResponse.data
     */
    fun data(): List<PlanMigrationListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanMigrationListPageResponse], but gracefully handles missing data.
     *
     * @see PlanMigrationListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<PlanMigrationListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): PlanMigrationListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): PlanMigrationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PlanMigrationListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanMigrationListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanMigrationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanMigrationListPage].
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

    /** A builder for [PlanMigrationListPage]. */
    class Builder internal constructor() {

        private var service: MigrationService? = null
        private var params: PlanMigrationListParams? = null
        private var response: PlanMigrationListPageResponse? = null

        @JvmSynthetic
        internal fun from(planMigrationListPage: PlanMigrationListPage) = apply {
            service = planMigrationListPage.service
            params = planMigrationListPage.params
            response = planMigrationListPage.response
        }

        fun service(service: MigrationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanMigrationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanMigrationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanMigrationListPage].
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
        fun build(): PlanMigrationListPage =
            PlanMigrationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanMigrationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PlanMigrationListPage{service=$service, params=$params, response=$response}"
}
