// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.services.blocking.customers.credits.TopUpService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class CustomerCreditTopUpListPage
private constructor(
    private val topUpsService: TopUpService,
    private val params: CustomerCreditTopUpListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<CustomerCreditTopUpListResponse> = response().data()

    fun paginationMetadata(): PaginationMetadata = response().paginationMetadata()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditTopUpListPage && this.topUpsService == other.topUpsService && this.params == other.params && this.response == other.response /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(topUpsService, params, response) /* spotless:on */
    }

    override fun toString() =
        "CustomerCreditTopUpListPage{topUpsService=$topUpsService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<CustomerCreditTopUpListPage> {
        return getNextPageParams().map { topUpsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            topUpsService: TopUpService,
            params: CustomerCreditTopUpListParams,
            response: Response
        ) =
            CustomerCreditTopUpListPage(
                topUpsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<CustomerCreditTopUpListResponse>>,
        private val paginationMetadata: JsonField<PaginationMetadata>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<CustomerCreditTopUpListResponse> = data.getNullable("data") ?: listOf()

        fun paginationMetadata(): PaginationMetadata =
            paginationMetadata.getRequired("pagination_metadata")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<CustomerCreditTopUpListResponse>>> =
            Optional.ofNullable(data)

        @JsonProperty("pagination_metadata")
        fun _paginationMetadata(): Optional<JsonField<PaginationMetadata>> =
            Optional.ofNullable(paginationMetadata)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                data().map { it.validate() }
                paginationMetadata().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && this.data == other.data && this.paginationMetadata == other.paginationMetadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(data, paginationMetadata, additionalProperties) /* spotless:on */
        }

        override fun toString() =
            "CustomerCreditTopUpListPage.Response{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<CustomerCreditTopUpListResponse>> = JsonMissing.of()
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.paginationMetadata = page.paginationMetadata
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<CustomerCreditTopUpListResponse>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<CustomerCreditTopUpListResponse>>) = apply {
                this.data = data
            }

            fun paginationMetadata(paginationMetadata: PaginationMetadata) =
                paginationMetadata(JsonField.of(paginationMetadata))

            @JsonProperty("pagination_metadata")
            fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply {
                this.paginationMetadata = paginationMetadata
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    data,
                    paginationMetadata,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: CustomerCreditTopUpListPage,
    ) : Iterable<CustomerCreditTopUpListResponse> {

        override fun iterator(): Iterator<CustomerCreditTopUpListResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().orElse(null) ?: break
                index = 0
            }
        }

        fun stream(): Stream<CustomerCreditTopUpListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
