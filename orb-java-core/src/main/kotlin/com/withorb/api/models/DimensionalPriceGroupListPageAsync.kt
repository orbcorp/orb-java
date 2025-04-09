// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.DimensionalPriceGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [DimensionalPriceGroupServiceAsync.list] */
class DimensionalPriceGroupListPageAsync
private constructor(
    private val service: DimensionalPriceGroupServiceAsync,
    private val params: DimensionalPriceGroupListParams,
    private val response: DimensionalPriceGroups,
) {

    /**
     * Delegates to [DimensionalPriceGroups], but gracefully handles missing data.
     *
     * @see [DimensionalPriceGroups.data]
     */
    fun data(): List<DimensionalPriceGroup> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DimensionalPriceGroups], but gracefully handles missing data.
     *
     * @see [DimensionalPriceGroups.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<DimensionalPriceGroupListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<DimensionalPriceGroupListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DimensionalPriceGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): DimensionalPriceGroups = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DimensionalPriceGroupListPageAsync].
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

    /** A builder for [DimensionalPriceGroupListPageAsync]. */
    class Builder internal constructor() {

        private var service: DimensionalPriceGroupServiceAsync? = null
        private var params: DimensionalPriceGroupListParams? = null
        private var response: DimensionalPriceGroups? = null

        @JvmSynthetic
        internal fun from(dimensionalPriceGroupListPageAsync: DimensionalPriceGroupListPageAsync) =
            apply {
                service = dimensionalPriceGroupListPageAsync.service
                params = dimensionalPriceGroupListPageAsync.params
                response = dimensionalPriceGroupListPageAsync.response
            }

        fun service(service: DimensionalPriceGroupServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DimensionalPriceGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DimensionalPriceGroups) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DimensionalPriceGroupListPageAsync].
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
        fun build(): DimensionalPriceGroupListPageAsync =
            DimensionalPriceGroupListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DimensionalPriceGroupListPageAsync) {

        fun forEach(
            action: Predicate<DimensionalPriceGroup>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DimensionalPriceGroupListPageAsync>>.forEach(
                action: (DimensionalPriceGroup) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<DimensionalPriceGroup>> {
            val values = mutableListOf<DimensionalPriceGroup>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DimensionalPriceGroupListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DimensionalPriceGroupListPageAsync{service=$service, params=$params, response=$response}"
}
