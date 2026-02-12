// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.AutoPager
import com.withorb.api.core.Page
import com.withorb.api.core.checkRequired
import com.withorb.api.services.blocking.LicenseTypeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see LicenseTypeService.list */
class LicenseTypeListPage
private constructor(
    private val service: LicenseTypeService,
    private val params: LicenseTypeListParams,
    private val response: LicenseTypeListPageResponse,
) : Page<LicenseTypeListResponse> {

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

    override fun nextPage(): LicenseTypeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LicenseTypeListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LicenseTypeListParams = params

    /** The response that this page was parsed from. */
    fun response(): LicenseTypeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseTypeListPage].
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

    /** A builder for [LicenseTypeListPage]. */
    class Builder internal constructor() {

        private var service: LicenseTypeService? = null
        private var params: LicenseTypeListParams? = null
        private var response: LicenseTypeListPageResponse? = null

        @JvmSynthetic
        internal fun from(licenseTypeListPage: LicenseTypeListPage) = apply {
            service = licenseTypeListPage.service
            params = licenseTypeListPage.params
            response = licenseTypeListPage.response
        }

        fun service(service: LicenseTypeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LicenseTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LicenseTypeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LicenseTypeListPage].
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
        fun build(): LicenseTypeListPage =
            LicenseTypeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseTypeListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LicenseTypeListPage{service=$service, params=$params, response=$response}"
}
