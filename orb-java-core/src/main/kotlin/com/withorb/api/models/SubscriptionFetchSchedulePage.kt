// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.SubscriptionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SubscriptionService.fetchSchedule */
class SubscriptionFetchSchedulePage
private constructor(
    private val service: SubscriptionService,
    private val params: SubscriptionFetchScheduleParams,
    private val response: SubscriptionFetchSchedulePageResponse,
) : Page<SubscriptionFetchScheduleResponse> {

    /**
     * Delegates to [SubscriptionFetchSchedulePageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionFetchSchedulePageResponse.data
     */
    fun data(): List<SubscriptionFetchScheduleResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SubscriptionFetchSchedulePageResponse], but gracefully handles missing data.
     *
     * @see SubscriptionFetchSchedulePageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<SubscriptionFetchScheduleResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): SubscriptionFetchScheduleParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): SubscriptionFetchSchedulePage = service.fetchSchedule(nextPageParams())

    fun autoPager(): AutoPager<SubscriptionFetchScheduleResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionFetchScheduleParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionFetchSchedulePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionFetchSchedulePage].
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

    /** A builder for [SubscriptionFetchSchedulePage]. */
    class Builder internal constructor() {

        private var service: SubscriptionService? = null
        private var params: SubscriptionFetchScheduleParams? = null
        private var response: SubscriptionFetchSchedulePageResponse? = null

        @JvmSynthetic
        internal fun from(subscriptionFetchSchedulePage: SubscriptionFetchSchedulePage) = apply {
            service = subscriptionFetchSchedulePage.service
            params = subscriptionFetchSchedulePage.params
            response = subscriptionFetchSchedulePage.response
        }

        fun service(service: SubscriptionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionFetchScheduleParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionFetchSchedulePageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SubscriptionFetchSchedulePage].
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
        fun build(): SubscriptionFetchSchedulePage =
            SubscriptionFetchSchedulePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchSchedulePage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "SubscriptionFetchSchedulePage{service=$service, params=$params, response=$response}"
}
