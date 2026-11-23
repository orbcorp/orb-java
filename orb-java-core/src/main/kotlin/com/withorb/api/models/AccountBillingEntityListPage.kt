// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.account.BillingEntityService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see BillingEntityService.list */
class AccountBillingEntityListPage
private constructor(
    private val service: BillingEntityService,
    private val params: AccountBillingEntityListParams,
    private val response: AccountBillingEntityListPageResponse,
) : Page<BillingEntity> {

    /**
     * Delegates to [AccountBillingEntityListPageResponse], but gracefully handles missing data.
     *
     * @see AccountBillingEntityListPageResponse.data
     */
    fun data(): List<BillingEntity> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountBillingEntityListPageResponse], but gracefully handles missing data.
     *
     * @see AccountBillingEntityListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<BillingEntity> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): AccountBillingEntityListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): AccountBillingEntityListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BillingEntity> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountBillingEntityListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountBillingEntityListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountBillingEntityListPage].
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

    /** A builder for [AccountBillingEntityListPage]. */
    class Builder internal constructor() {

        private var service: BillingEntityService? = null
        private var params: AccountBillingEntityListParams? = null
        private var response: AccountBillingEntityListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountBillingEntityListPage: AccountBillingEntityListPage) = apply {
            service = accountBillingEntityListPage.service
            params = accountBillingEntityListPage.params
            response = accountBillingEntityListPage.response
        }

        fun service(service: BillingEntityService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountBillingEntityListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountBillingEntityListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AccountBillingEntityListPage].
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
        fun build(): AccountBillingEntityListPage =
            AccountBillingEntityListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountBillingEntityListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AccountBillingEntityListPage{service=$service, params=$params, response=$response}"
}
