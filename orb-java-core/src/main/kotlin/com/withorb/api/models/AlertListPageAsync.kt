// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.checkRequired
import com.withorb.api.services.async.AlertServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [AlertServiceAsync.list] */
class AlertListPageAsync
private constructor(
    private val service: AlertServiceAsync,
    private val params: AlertListParams,
    private val response: AlertListPageResponse,
) {

    /**
     * Delegates to [AlertListPageResponse], but gracefully handles missing data.
     *
     * @see [AlertListPageResponse.data]
     */
    fun data(): List<Alert> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AlertListPageResponse], but gracefully handles missing data.
     *
     * @see [AlertListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<AlertListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<AlertListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AlertListParams = params

    /** The response that this page was parsed from. */
    fun response(): AlertListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlertListPageAsync].
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

    /** A builder for [AlertListPageAsync]. */
    class Builder internal constructor() {

        private var service: AlertServiceAsync? = null
        private var params: AlertListParams? = null
        private var response: AlertListPageResponse? = null

        @JvmSynthetic
        internal fun from(alertListPageAsync: AlertListPageAsync) = apply {
            service = alertListPageAsync.service
            params = alertListPageAsync.params
            response = alertListPageAsync.response
        }

        fun service(service: AlertServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AlertListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AlertListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AlertListPageAsync].
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
        fun build(): AlertListPageAsync =
            AlertListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AlertListPageAsync) {

        fun forEach(action: Predicate<Alert>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AlertListPageAsync>>.forEach(
                action: (Alert) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Alert>> {
            val values = mutableListOf<Alert>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlertListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AlertListPageAsync{service=$service, params=$params, response=$response}"
}
