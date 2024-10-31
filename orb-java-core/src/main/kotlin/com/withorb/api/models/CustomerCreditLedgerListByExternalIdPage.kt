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
import com.withorb.api.core.toImmutable
import com.withorb.api.services.blocking.customers.credits.LedgerService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport

class CustomerCreditLedgerListByExternalIdPage
private constructor(
    private val ledgerService: LedgerService,
    private val params: CustomerCreditLedgerListByExternalIdParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<CustomerCreditLedgerListByExternalIdResponse> = response().data()

    fun paginationMetadata(): PaginationMetadata = response().paginationMetadata()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListByExternalIdPage && this.ledgerService == other.ledgerService && this.params == other.params && this.response == other.response /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(ledgerService, params, response) /* spotless:on */
    }

    override fun toString() =
        "CustomerCreditLedgerListByExternalIdPage{ledgerService=$ledgerService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return paginationMetadata().nextCursor().isPresent
    }

    fun getNextPageParams(): Optional<CustomerCreditLedgerListByExternalIdParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            CustomerCreditLedgerListByExternalIdParams.builder()
                .from(params)
                .apply { paginationMetadata().nextCursor().ifPresent { this.cursor(it) } }
                .build()
        )
    }

    fun getNextPage(): Optional<CustomerCreditLedgerListByExternalIdPage> {
        return getNextPageParams().map { ledgerService.listByExternalId(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerService: LedgerService,
            params: CustomerCreditLedgerListByExternalIdParams,
            response: Response
        ) =
            CustomerCreditLedgerListByExternalIdPage(
                ledgerService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<CustomerCreditLedgerListByExternalIdResponse>>,
        private val paginationMetadata: JsonField<PaginationMetadata>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<CustomerCreditLedgerListByExternalIdResponse> =
            data.getNullable("data") ?: listOf()

        fun paginationMetadata(): PaginationMetadata =
            paginationMetadata.getRequired("pagination_metadata")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<CustomerCreditLedgerListByExternalIdResponse>>> =
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
            "CustomerCreditLedgerListByExternalIdPage.Response{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<CustomerCreditLedgerListByExternalIdResponse>> =
                JsonMissing.of()
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.paginationMetadata = page.paginationMetadata
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<CustomerCreditLedgerListByExternalIdResponse>) =
                data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<CustomerCreditLedgerListByExternalIdResponse>>) = apply {
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
                    additionalProperties.toImmutable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: CustomerCreditLedgerListByExternalIdPage,
    ) : Iterable<CustomerCreditLedgerListByExternalIdResponse> {

        override fun iterator(): Iterator<CustomerCreditLedgerListByExternalIdResponse> = iterator {
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

        fun stream(): Stream<CustomerCreditLedgerListByExternalIdResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
