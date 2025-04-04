// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.services.async.DimensionalPriceGroupServiceAsync
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List dimensional price groups */
class DimensionalPriceGroupListPageAsync
private constructor(
    private val dimensionalPriceGroupsService: DimensionalPriceGroupServiceAsync,
    private val params: DimensionalPriceGroupListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<DimensionalPriceGroup> = response().data()

    fun paginationMetadata(): PaginationMetadata = response().paginationMetadata()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DimensionalPriceGroupListPageAsync && dimensionalPriceGroupsService == other.dimensionalPriceGroupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(dimensionalPriceGroupsService, params, response) /* spotless:on */

    override fun toString() =
        "DimensionalPriceGroupListPageAsync{dimensionalPriceGroupsService=$dimensionalPriceGroupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return paginationMetadata().nextCursor().isPresent
    }

    fun getNextPageParams(): Optional<DimensionalPriceGroupListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            DimensionalPriceGroupListParams.builder()
                .from(params)
                .apply { paginationMetadata().nextCursor().ifPresent { this.cursor(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DimensionalPriceGroupListPageAsync>> {
        return getNextPageParams()
            .map { dimensionalPriceGroupsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            dimensionalPriceGroupsService: DimensionalPriceGroupServiceAsync,
            params: DimensionalPriceGroupListParams,
            response: Response,
        ) = DimensionalPriceGroupListPageAsync(dimensionalPriceGroupsService, params, response)
    }

    class Response(
        private val data: JsonField<List<DimensionalPriceGroup>>,
        private val paginationMetadata: JsonField<PaginationMetadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") data: JsonField<List<DimensionalPriceGroup>> = JsonMissing.of(),
            @JsonProperty("pagination_metadata")
            paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
        ) : this(data, paginationMetadata, mutableMapOf())

        fun data(): List<DimensionalPriceGroup> = data.getOptional("data").getOrNull() ?: listOf()

        fun paginationMetadata(): PaginationMetadata =
            paginationMetadata.getRequired("pagination_metadata")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<DimensionalPriceGroup>>> = Optional.ofNullable(data)

        @JsonProperty("pagination_metadata")
        fun _paginationMetadata(): Optional<JsonField<PaginationMetadata>> =
            Optional.ofNullable(paginationMetadata)

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            data().map { it.validate() }
            paginationMetadata().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && data == other.data && paginationMetadata == other.paginationMetadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, paginationMetadata, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [DimensionalPriceGroupListPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<DimensionalPriceGroup>> = JsonMissing.of()
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.paginationMetadata = page.paginationMetadata
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<DimensionalPriceGroup>) = data(JsonField.of(data))

            fun data(data: JsonField<List<DimensionalPriceGroup>>) = apply { this.data = data }

            fun paginationMetadata(paginationMetadata: PaginationMetadata) =
                paginationMetadata(JsonField.of(paginationMetadata))

            fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply {
                this.paginationMetadata = paginationMetadata
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response =
                Response(data, paginationMetadata, additionalProperties.toMutableMap())
        }
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
}
