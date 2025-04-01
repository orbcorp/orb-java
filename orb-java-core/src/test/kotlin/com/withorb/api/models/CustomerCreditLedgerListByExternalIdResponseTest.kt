// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.JsonValue
import com.withorb.api.core.jsonMapper
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class CustomerCreditLedgerListByExternalIdResponseTest {

    @Test
    fun ofIncrementLedgerEntry() {
        val incrementLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.EntryType
                        .INCREMENT
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofIncrementLedgerEntry(
                incrementLedgerEntry
            )

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry())
            .contains(incrementLedgerEntry)
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry()).isEmpty
    }

    @Test
    fun ofIncrementLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofIncrementLedgerEntry(
                CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.EntryType
                            .INCREMENT
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.IncrementLedgerEntry.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    @Test
    fun ofDecrementLedgerEntry() {
        val decrementLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.EntryType
                        .DECREMENT
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .eventId("event_id")
                .invoiceId("invoice_id")
                .priceId("price_id")
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofDecrementLedgerEntry(
                decrementLedgerEntry
            )

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry())
            .contains(decrementLedgerEntry)
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry()).isEmpty
    }

    @Test
    fun ofDecrementLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofDecrementLedgerEntry(
                CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.EntryType
                            .DECREMENT
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.DecrementLedgerEntry.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .eventId("event_id")
                    .invoiceId("invoice_id")
                    .priceId("price_id")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    @Test
    fun ofExpirationChangeLedgerEntry() {
        val expirationChangeLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                        .Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                        .EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                        .EntryType
                        .EXPIRATION_CHANGE
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                        .Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofExpirationChangeLedgerEntry(
                expirationChangeLedgerEntry
            )

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .contains(expirationChangeLedgerEntry)
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry()).isEmpty
    }

    @Test
    fun ofExpirationChangeLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofExpirationChangeLedgerEntry(
                CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                            .Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                            .EntryType
                            .EXPIRATION_CHANGE
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.ExpirationChangeLedgerEntry
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    @Test
    fun ofCreditBlockExpiryLedgerEntry() {
        val creditBlockExpiryLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .EntryType
                        .CREDIT_BLOCK_EXPIRY
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                        .Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofCreditBlockExpiryLedgerEntry(
                creditBlockExpiryLedgerEntry
            )

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .contains(creditBlockExpiryLedgerEntry)
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry()).isEmpty
    }

    @Test
    fun ofCreditBlockExpiryLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofCreditBlockExpiryLedgerEntry(
                CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                            .Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                            .EntryType
                            .CREDIT_BLOCK_EXPIRY
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiryLedgerEntry
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    @Test
    fun ofVoidLedgerEntry() {
        val voidLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.EntryType.VOID
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofVoidLedgerEntry(voidLedgerEntry)

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry())
            .contains(voidLedgerEntry)
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry()).isEmpty
    }

    @Test
    fun ofVoidLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofVoidLedgerEntry(
                CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.EntryType.VOID
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.VoidLedgerEntry.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .voidAmount(0.0)
                    .voidReason("void_reason")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    @Test
    fun ofVoidInitiatedLedgerEntry() {
        val voidInitiatedLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry
                        .CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry
                        .EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry.EntryType
                        .VOID_INITIATED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofVoidInitiatedLedgerEntry(
                voidInitiatedLedgerEntry
            )

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry())
            .contains(voidInitiatedLedgerEntry)
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry()).isEmpty
    }

    @Test
    fun ofVoidInitiatedLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofVoidInitiatedLedgerEntry(
                CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry
                            .Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry
                            .EntryType
                            .VOID_INITIATED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.VoidInitiatedLedgerEntry
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingBalance(0.0)
                    .voidAmount(0.0)
                    .voidReason("void_reason")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    @Test
    fun ofAmendmentLedgerEntry() {
        val amendmentLedgerEntry =
            CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.EntryType
                        .AMENDMENT
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofAmendmentLedgerEntry(
                amendmentLedgerEntry
            )

        assertThat(customerCreditLedgerListByExternalIdResponse.incrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.decrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChangeLedgerEntry())
            .isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiryLedgerEntry())
            .isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.voidLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiatedLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerListByExternalIdResponse.amendmentLedgerEntry())
            .contains(amendmentLedgerEntry)
    }

    @Test
    fun ofAmendmentLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofAmendmentLedgerEntry(
                CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.EntryType
                            .AMENDMENT
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.AmendmentLedgerEntry.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val customerCreditLedgerListByExternalIdResponse =
            jsonMapper()
                .convertValue(
                    testCase.value,
                    jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
                )

        val e =
            assertThrows<OrbInvalidDataException> {
                customerCreditLedgerListByExternalIdResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
