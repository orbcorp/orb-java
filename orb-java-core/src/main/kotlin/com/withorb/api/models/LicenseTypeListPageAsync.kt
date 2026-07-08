// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPagerAsync
import com.withorb.api.core.PageAsync
import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.LicenseTypeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LicenseTypeServiceAsync.list */
class LicenseTypeListPageAsync
private constructor(
    private val service: LicenseTypeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LicenseTypeListParams,
    private val response: LicenseTypeListPageResponse,
) : PageAsync<LicenseTypeListResponse> {

    /**
     * Delegates to [LicenseTypeListPageResponse], but gracefully handles missing data.
     *
     * @see LicenseTypeListPageResponse.data
     */
    fun data(): List<LicenseTypeListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LicenseTypeListPageResponse], but gracefully handles missing data.
     *
     * @see LicenseTypeListPageResponse.paginationMetadata
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun items(): List<LicenseTypeListResponse> = data()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun nextPageParams(): LicenseTypeListParams {
        val nextCursor =
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LicenseTypeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LicenseTypeListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LicenseTypeListParams = params

    /** The response that this page was parsed from. */
    fun response(): LicenseTypeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseTypeListPageAsync].
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

    /** A builder for [LicenseTypeListPageAsync]. */
    class Builder internal constructor() {

        private var service: LicenseTypeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LicenseTypeListParams? = null
        private var response: LicenseTypeListPageResponse? = null

        @JvmSynthetic
        internal fun from(licenseTypeListPageAsync: LicenseTypeListPageAsync) = apply {
            service = licenseTypeListPageAsync.service
            streamHandlerExecutor = licenseTypeListPageAsync.streamHandlerExecutor
            params = licenseTypeListPageAsync.params
            response = licenseTypeListPageAsync.response
        }

        fun service(service: LicenseTypeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LicenseTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LicenseTypeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LicenseTypeListPageAsync].
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
        fun build(): LicenseTypeListPageAsync =
            LicenseTypeListPageAsync(
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

        return other is LicenseTypeListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LicenseTypeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
