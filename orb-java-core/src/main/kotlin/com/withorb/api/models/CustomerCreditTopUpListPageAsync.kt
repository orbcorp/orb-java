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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.services.async.customers.credits.TopUpServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** List top-ups */
class CustomerCreditTopUpListPageAsync
private constructor(
    private val topUpsService: TopUpServiceAsync,
    private val params: CustomerCreditTopUpListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<TopUpModel> = response().data()

    fun paginationMetadata(): PaginationMetadata = response().paginationMetadata()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditTopUpListPageAsync && topUpsService == other.topUpsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(topUpsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditTopUpListPageAsync{topUpsService=$topUpsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return paginationMetadata().nextCursor().isPresent
    }

    fun getNextPageParams(): Optional<CustomerCreditTopUpListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            CustomerCreditTopUpListParams.builder()
                .from(params)
                .apply { paginationMetadata().nextCursor().ifPresent { this.cursor(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CustomerCreditTopUpListPageAsync>> {
        return getNextPageParams()
            .map { topUpsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            topUpsService: TopUpServiceAsync,
            params: CustomerCreditTopUpListParams,
            response: Response,
        ) = CustomerCreditTopUpListPageAsync(topUpsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("data") private val data: JsonField<List<TopUpModel>> = JsonMissing.of(),
        @JsonProperty("pagination_metadata")
        private val paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<TopUpModel> = data.getNullable("data") ?: listOf()

        fun paginationMetadata(): PaginationMetadata =
            paginationMetadata.getRequired("pagination_metadata")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<TopUpModel>>> = Optional.ofNullable(data)

        @JsonProperty("pagination_metadata")
        fun _paginationMetadata(): Optional<JsonField<PaginationMetadata>> =
            Optional.ofNullable(paginationMetadata)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            data().map { it.validate() }
            paginationMetadata().validate()
            validated = true
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
             * [CustomerCreditTopUpListPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<TopUpModel>> = JsonMissing.of()
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.paginationMetadata = page.paginationMetadata
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<TopUpModel>) = data(JsonField.of(data))

            fun data(data: JsonField<List<TopUpModel>>) = apply { this.data = data }

            fun paginationMetadata(paginationMetadata: PaginationMetadata) =
                paginationMetadata(JsonField.of(paginationMetadata))

            fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply {
                this.paginationMetadata = paginationMetadata
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(data, paginationMetadata, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: CustomerCreditTopUpListPageAsync) {

        fun forEach(action: Predicate<TopUpModel>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CustomerCreditTopUpListPageAsync>>.forEach(
                action: (TopUpModel) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<TopUpModel>> {
            val values = mutableListOf<TopUpModel>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
