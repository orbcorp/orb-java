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
import com.withorb.api.services.async.customers.credits.LedgerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/**
 * The credits ledger provides _auditing_ functionality over Orb's credits system with a list of
 * actions that have taken place to modify a customer's credit balance. This
 * [paginated endpoint](/api-reference/pagination) lists these entries, starting from the most
 * recent ledger entry.
 *
 * More details on using Orb's real-time credit feature are [here](/product-catalog/prepurchase).
 *
 * There are four major types of modifications to credit balance, detailed below.
 *
 * ## Increment
 *
 * Credits (which optionally expire on a future date) can be added via the API ([Add Ledger
 * Entry](create-ledger-entry)). The ledger entry for such an action will always contain the total
 * eligible starting and ending balance for the customer at the time the entry was added to the
 * ledger.
 *
 * ## Decrement
 *
 * Deductions can occur as a result of an API call to create a ledger entry (see
 * [Add Ledger Entry](create-ledger-entry)), or automatically as a result of incurring usage. Both
 * ledger entries present the `decrement` entry type.
 *
 * As usage for a customer is reported into Orb, credits may be deducted according to the customer's
 * plan configuration. An automated deduction of this type will result in a ledger entry, also with
 * a starting and ending balance. In order to provide better tracing capabilities for automatic
 * deductions, Orb always associates each automatic deduction with the `event_id` at the time of
 * ingestion, used to pinpoint _why_ credit deduction took place and to ensure that credits are
 * never deducted without an associated usage event.
 *
 * By default, Orb uses an algorithm that automatically deducts from the _soonest expiring credit
 * block_ first in order to ensure that all credits are utilized appropriately. As an example, if
 * trial credits with an expiration date of 2 weeks from now are present for a customer, they will
 * be used before any deductions take place from a non-expiring credit block.
 *
 * If there are multiple blocks with the same expiration date, Orb will deduct from the block with
 * the _lower cost basis_ first (e.g. trial credits with a $0 cost basis before paid credits with a
 * $5.00 cost basis).
 *
 * It's also possible for a single usage event's deduction to _span_ credit blocks. In this case,
 * Orb will deduct from the next block, ending at the credit block which consists of unexpiring
 * credits. Each of these deductions will lead to a _separate_ ledger entry, one per credit block
 * that is deducted from. By default, the customer's total credit balance in Orb can be negative as
 * a result of a decrement.
 *
 * ## Expiration change
 *
 * The expiry of credits can be changed as a result of the API (See
 * [Add Ledger Entry](create-ledger-entry)). This will create a ledger entry that specifies the
 * balance as well as the initial and target expiry dates.
 *
 * Note that for this entry type, `starting_balance` will equal `ending_balance`, and the `amount`
 * represents the balance transferred. The credit block linked to the ledger entry is the source
 * credit block from which there was an expiration change
 *
 * ## Credits expiry
 *
 * When a set of credits expire on pre-set expiration date, the customer's balance automatically
 * reflects this change and adds an entry to the ledger indicating this event. Note that credit
 * expiry should always happen close to a date boundary in the customer's timezone.
 *
 * ## Void initiated
 *
 * Credit blocks can be voided via the API. The `amount` on this entry corresponds to the number of
 * credits that were remaining in the block at time of void. `void_reason` will be populated if the
 * void is created with a reason.
 *
 * ## Void
 *
 * When a set of credits is voided, the customer's balance automatically reflects this change and
 * adds an entry to the ledger indicating this event.
 *
 * ## Amendment
 *
 * When credits are added to a customer's balance as a result of a correction, this entry will be
 * added to the ledger to indicate the adjustment of credits.
 */
class CustomerCreditLedgerListByExternalIdPageAsync
private constructor(
    private val ledgerService: LedgerServiceAsync,
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

        return /* spotless:off */ other is CustomerCreditLedgerListByExternalIdPageAsync && ledgerService == other.ledgerService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerListByExternalIdPageAsync{ledgerService=$ledgerService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<CustomerCreditLedgerListByExternalIdPageAsync>> {
        return getNextPageParams()
            .map { ledgerService.listByExternalId(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerService: LedgerServiceAsync,
            params: CustomerCreditLedgerListByExternalIdParams,
            response: Response,
        ) = CustomerCreditLedgerListByExternalIdPageAsync(ledgerService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("data")
        private val data: JsonField<List<CustomerCreditLedgerListByExternalIdResponse>> =
            JsonMissing.of(),
        @JsonProperty("pagination_metadata")
        private val paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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

            fun data(data: JsonField<List<CustomerCreditLedgerListByExternalIdResponse>>) = apply {
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

            fun build() = Response(data, paginationMetadata, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: CustomerCreditLedgerListByExternalIdPageAsync) {

        fun forEach(
            action: Predicate<CustomerCreditLedgerListByExternalIdResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CustomerCreditLedgerListByExternalIdPageAsync>>.forEach(
                action: (CustomerCreditLedgerListByExternalIdResponse) -> Boolean,
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

        fun toList(
            executor: Executor
        ): CompletableFuture<List<CustomerCreditLedgerListByExternalIdResponse>> {
            val values = mutableListOf<CustomerCreditLedgerListByExternalIdResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
