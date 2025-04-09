// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.services.async.ItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** This endpoint returns a list of all Items, ordered in descending order by creation time. */
class ItemListPageAsync
private constructor(
    private val itemsService: ItemServiceAsync,
    private val params: ItemListParams,
    private val response: ItemListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ItemListPageResponse = response

    /**
     * Delegates to [ItemListPageResponse], but gracefully handles missing data.
     *
     * @see [ItemListPageResponse.data]
     */
    fun data(): List<Item> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ItemListPageResponse], but gracefully handles missing data.
     *
     * @see [ItemListPageResponse.paginationMetadata]
     */
    fun paginationMetadata(): Optional<PaginationMetadata> =
        response._paginationMetadata().getOptional("pagination_metadata")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ItemListPageAsync && itemsService == other.itemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(itemsService, params, response) /* spotless:on */

    override fun toString() =
        "ItemListPageAsync{itemsService=$itemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean =
        data().isNotEmpty() &&
            paginationMetadata().flatMap { it._nextCursor().getOptional("next_cursor") }.isPresent

    fun getNextPageParams(): Optional<ItemListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ItemListPageAsync>> {
        return getNextPageParams()
            .map { itemsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            itemsService: ItemServiceAsync,
            params: ItemListParams,
            response: ItemListPageResponse,
        ) = ItemListPageAsync(itemsService, params, response)
    }

    class AutoPager(private val firstPage: ItemListPageAsync) {

        fun forEach(action: Predicate<Item>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ItemListPageAsync>>.forEach(
                action: (Item) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Item>> {
            val values = mutableListOf<Item>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
