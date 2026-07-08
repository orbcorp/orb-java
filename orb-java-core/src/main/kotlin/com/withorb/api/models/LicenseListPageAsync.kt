// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.LicenseServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LicenseServiceAsync.list */
class LicenseListPageAsync
private constructor(
    private val service: LicenseServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LicenseListParams,
    private val response: LicenseListPageResponse,
) : PageAsync<LicenseListResponse> {

    /**
     * Delegates to [LicenseListPageResponse], but gracefully handles missing data.
     *
     * @see LicenseListPageResponse.data
     */
    fun data(): List<LicenseListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LicenseListPageResponse], but gracefully handles missing data.
     *
     * @see LicenseListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<LicenseListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): LicenseListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LicenseListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LicenseListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LicenseListParams = params

    /** The response that this page was parsed from. */
    fun response(): LicenseListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseListPageAsync].
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

    /** A builder for [LicenseListPageAsync]. */
    class Builder internal constructor() {

        private var service: LicenseServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LicenseListParams? = null
        private var response: LicenseListPageResponse? = null

        @JvmSynthetic
        internal fun from(licenseListPageAsync: LicenseListPageAsync) = apply {
            service = licenseListPageAsync.service
            streamHandlerExecutor = licenseListPageAsync.streamHandlerExecutor
            params = licenseListPageAsync.params
            response = licenseListPageAsync.response
        }

        fun service(service: LicenseServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LicenseListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LicenseListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LicenseListPageAsync].
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
        fun build(): LicenseListPageAsync =
            LicenseListPageAsync(
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

        return other is LicenseListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LicenseListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
