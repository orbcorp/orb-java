// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.SubscriptionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SubscriptionService.listSummary */
class SubscriptionListSummaryPage
private constructor(
    private val service: SubscriptionService,
    private val params: SubscriptionListSummaryParams,
    private val response: SubscriptionListSummaryPageResponse,
) : Page<SubscriptionListSummaryResponse> {

    /**
     * Delegates to [SubscriptionListSummaryPageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionListSummaryPageResponse.data
     */
    fun data(): List<SubscriptionListSummaryResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SubscriptionListSummaryPageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionListSummaryPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<SubscriptionListSummaryResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): SubscriptionListSummaryParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): SubscriptionListSummaryPage = service.listSummary(nextPageParams())

    fun autoPager(): AutoPager<SubscriptionListSummaryResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionListSummaryParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionListSummaryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionListSummaryPage].
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

    /** A builder for [SubscriptionListSummaryPage]. */
    class Builder internal constructor() {

        private var service: SubscriptionService? = null
        private var params: SubscriptionListSummaryParams? = null
        private var response: SubscriptionListSummaryPageResponse? = null

        @JvmSynthetic
        internal fun from(subscriptionListSummaryPage: SubscriptionListSummaryPage) = apply {
            service = subscriptionListSummaryPage.service
            params = subscriptionListSummaryPage.params
            response = subscriptionListSummaryPage.response
        }

        fun service(service: SubscriptionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionListSummaryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionListSummaryPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SubscriptionListSummaryPage].
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
        fun build(): SubscriptionListSummaryPage =
            SubscriptionListSummaryPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionListSummaryPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SubscriptionListSummaryPage{service=$service, params=$params, response=$response}"
}
