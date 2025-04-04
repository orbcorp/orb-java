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
import com.withorb.api.services.blocking.customers.BalanceTransactionService
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * ## The customer balance
 *
 * The customer balance is an amount in the customer's currency, which Orb automatically applies to
 * subsequent invoices. This balance can be adjusted manually via Orb's webapp on the customer
 * details page. You can use this balance to provide a fixed mid-period credit to the customer.
 * Commonly, this is done due to system downtime/SLA violation, or an adhoc adjustment discussed
 * with the customer.
 *
 * If the balance is a positive value at the time of invoicing, it represents that the customer has
 * credit that should be used to offset the amount due on the next issued invoice. In this case, Orb
 * will automatically reduce the next invoice by the balance amount, and roll over any remaining
 * balance if the invoice is fully discounted.
 *
 * If the balance is a negative value at the time of invoicing, Orb will increase the invoice's
 * amount due with a positive adjustment, and reset the balance to 0.
 *
 * This endpoint retrieves all customer balance transactions in reverse chronological order for a
 * single customer, providing a complete audit trail of all adjustments and invoice applications.
 *
 * ## Eligibility
 *
 * The customer balance can only be applied to invoices or adjusted manually if invoices are not
 * synced to a separate invoicing provider. If a payment gateway such as Stripe is used, the balance
 * will be applied to the invoice before forwarding payment to the gateway.
 */
class CustomerBalanceTransactionListPage
private constructor(
    private val balanceTransactionsService: BalanceTransactionService,
    private val params: CustomerBalanceTransactionListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<CustomerBalanceTransactionListResponse> = response().data()

    fun paginationMetadata(): PaginationMetadata = response().paginationMetadata()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBalanceTransactionListPage && balanceTransactionsService == other.balanceTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balanceTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerBalanceTransactionListPage{balanceTransactionsService=$balanceTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return paginationMetadata().nextCursor().isPresent
    }

    fun getNextPageParams(): Optional<CustomerBalanceTransactionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            CustomerBalanceTransactionListParams.builder()
                .from(params)
                .apply { paginationMetadata().nextCursor().ifPresent { this.cursor(it) } }
                .build()
        )
    }

    fun getNextPage(): Optional<CustomerBalanceTransactionListPage> {
        return getNextPageParams().map { balanceTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            balanceTransactionsService: BalanceTransactionService,
            params: CustomerBalanceTransactionListParams,
            response: Response,
        ) = CustomerBalanceTransactionListPage(balanceTransactionsService, params, response)
    }

    class Response(
        private val data: JsonField<List<CustomerBalanceTransactionListResponse>>,
        private val paginationMetadata: JsonField<PaginationMetadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            data: JsonField<List<CustomerBalanceTransactionListResponse>> = JsonMissing.of(),
            @JsonProperty("pagination_metadata")
            paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
        ) : this(data, paginationMetadata, mutableMapOf())

        fun data(): List<CustomerBalanceTransactionListResponse> =
            data.getNullable("data") ?: listOf()

        fun paginationMetadata(): PaginationMetadata =
            paginationMetadata.getRequired("pagination_metadata")

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<CustomerBalanceTransactionListResponse>>> =
            Optional.ofNullable(data)

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
             * [CustomerBalanceTransactionListPage].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<CustomerBalanceTransactionListResponse>> =
                JsonMissing.of()
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.paginationMetadata = page.paginationMetadata
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<CustomerBalanceTransactionListResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<CustomerBalanceTransactionListResponse>>) = apply {
                this.data = data
            }

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

    class AutoPager(private val firstPage: CustomerBalanceTransactionListPage) :
        Iterable<CustomerBalanceTransactionListResponse> {

        override fun iterator(): Iterator<CustomerBalanceTransactionListResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<CustomerBalanceTransactionListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
