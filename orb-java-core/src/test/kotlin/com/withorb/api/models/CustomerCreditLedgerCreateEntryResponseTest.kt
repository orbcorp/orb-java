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

internal class CustomerCreditLedgerCreateEntryResponseTest {

    @Test
    fun ofIncrementLedgerEntry() {
        val incrementLedgerEntry =
            CustomerCreditLedgerCreateEntryResponse.IncrementLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.IncrementLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.IncrementLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.IncrementLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerCreateEntryResponse.IncrementLedgerEntry.EntryType.INCREMENT
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.IncrementLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofIncrementLedgerEntry(incrementLedgerEntry)

        assertThat(customerCreditLedgerCreateEntryResponse.incrementLedgerEntry())
            .contains(incrementLedgerEntry)
        assertThat(customerCreditLedgerCreateEntryResponse.decrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChangeLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiryLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.voidLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiatedLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.amendmentLedgerEntry()).isEmpty
    }

    @Test
    fun ofIncrementLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofIncrementLedgerEntry(
                CustomerCreditLedgerCreateEntryResponse.IncrementLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.IncrementLedgerEntry.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.IncrementLedgerEntry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.IncrementLedgerEntry.EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerCreateEntryResponse.IncrementLedgerEntry.EntryType
                            .INCREMENT
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.IncrementLedgerEntry.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun ofDecrementLedgerEntry() {
        val decrementLedgerEntry =
            CustomerCreditLedgerCreateEntryResponse.DecrementLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.DecrementLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.DecrementLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.DecrementLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerCreateEntryResponse.DecrementLedgerEntry.EntryType.DECREMENT
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.DecrementLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .eventId("event_id")
                .invoiceId("invoice_id")
                .priceId("price_id")
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofDecrementLedgerEntry(decrementLedgerEntry)

        assertThat(customerCreditLedgerCreateEntryResponse.incrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.decrementLedgerEntry())
            .contains(decrementLedgerEntry)
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChangeLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiryLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.voidLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiatedLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.amendmentLedgerEntry()).isEmpty
    }

    @Test
    fun ofDecrementLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofDecrementLedgerEntry(
                CustomerCreditLedgerCreateEntryResponse.DecrementLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.DecrementLedgerEntry.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.DecrementLedgerEntry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.DecrementLedgerEntry.EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerCreateEntryResponse.DecrementLedgerEntry.EntryType
                            .DECREMENT
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.DecrementLedgerEntry.Metadata
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

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun ofExpirationChangeLedgerEntry() {
        val expirationChangeLedgerEntry =
            CustomerCreditLedgerCreateEntryResponse.ExpirationChangeLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.ExpirationChangeLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.ExpirationChangeLedgerEntry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.ExpirationChangeLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerCreateEntryResponse.ExpirationChangeLedgerEntry.EntryType
                        .EXPIRATION_CHANGE
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.ExpirationChangeLedgerEntry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofExpirationChangeLedgerEntry(
                expirationChangeLedgerEntry
            )

        assertThat(customerCreditLedgerCreateEntryResponse.incrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.decrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChangeLedgerEntry())
            .contains(expirationChangeLedgerEntry)
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiryLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.voidLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiatedLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.amendmentLedgerEntry()).isEmpty
    }

    @Test
    fun ofExpirationChangeLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofExpirationChangeLedgerEntry(
                CustomerCreditLedgerCreateEntryResponse.ExpirationChangeLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.ExpirationChangeLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.ExpirationChangeLedgerEntry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.ExpirationChangeLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerCreateEntryResponse.ExpirationChangeLedgerEntry
                            .EntryType
                            .EXPIRATION_CHANGE
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.ExpirationChangeLedgerEntry.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun ofCreditBlockExpiryLedgerEntry() {
        val creditBlockExpiryLedgerEntry =
            CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiryLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiryLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiryLedgerEntry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiryLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiryLedgerEntry.EntryType
                        .CREDIT_BLOCK_EXPIRY
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiryLedgerEntry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofCreditBlockExpiryLedgerEntry(
                creditBlockExpiryLedgerEntry
            )

        assertThat(customerCreditLedgerCreateEntryResponse.incrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.decrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChangeLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiryLedgerEntry())
            .contains(creditBlockExpiryLedgerEntry)
        assertThat(customerCreditLedgerCreateEntryResponse.voidLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiatedLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.amendmentLedgerEntry()).isEmpty
    }

    @Test
    fun ofCreditBlockExpiryLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofCreditBlockExpiryLedgerEntry(
                CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiryLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiryLedgerEntry
                            .CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiryLedgerEntry
                            .Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiryLedgerEntry
                            .EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiryLedgerEntry
                            .EntryType
                            .CREDIT_BLOCK_EXPIRY
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiryLedgerEntry
                            .Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun ofVoidLedgerEntry() {
        val voidLedgerEntry =
            CustomerCreditLedgerCreateEntryResponse.VoidLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.VoidLedgerEntry.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.VoidLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.VoidLedgerEntry.EntryStatus.COMMITTED
                )
                .entryType(CustomerCreditLedgerCreateEntryResponse.VoidLedgerEntry.EntryType.VOID)
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.VoidLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofVoidLedgerEntry(voidLedgerEntry)

        assertThat(customerCreditLedgerCreateEntryResponse.incrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.decrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChangeLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiryLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.voidLedgerEntry())
            .contains(voidLedgerEntry)
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiatedLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.amendmentLedgerEntry()).isEmpty
    }

    @Test
    fun ofVoidLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofVoidLedgerEntry(
                CustomerCreditLedgerCreateEntryResponse.VoidLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.VoidLedgerEntry.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.VoidLedgerEntry.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.VoidLedgerEntry.EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerCreateEntryResponse.VoidLedgerEntry.EntryType.VOID
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.VoidLedgerEntry.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .voidAmount(0.0)
                    .voidReason("void_reason")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun ofVoidInitiatedLedgerEntry() {
        val voidInitiatedLedgerEntry =
            CustomerCreditLedgerCreateEntryResponse.VoidInitiatedLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.VoidInitiatedLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.VoidInitiatedLedgerEntry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.VoidInitiatedLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerCreateEntryResponse.VoidInitiatedLedgerEntry.EntryType
                        .VOID_INITIATED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.VoidInitiatedLedgerEntry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofVoidInitiatedLedgerEntry(
                voidInitiatedLedgerEntry
            )

        assertThat(customerCreditLedgerCreateEntryResponse.incrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.decrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChangeLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiryLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.voidLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiatedLedgerEntry())
            .contains(voidInitiatedLedgerEntry)
        assertThat(customerCreditLedgerCreateEntryResponse.amendmentLedgerEntry()).isEmpty
    }

    @Test
    fun ofVoidInitiatedLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofVoidInitiatedLedgerEntry(
                CustomerCreditLedgerCreateEntryResponse.VoidInitiatedLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.VoidInitiatedLedgerEntry.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.VoidInitiatedLedgerEntry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.VoidInitiatedLedgerEntry.EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerCreateEntryResponse.VoidInitiatedLedgerEntry.EntryType
                            .VOID_INITIATED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.VoidInitiatedLedgerEntry.Metadata
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

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun ofAmendmentLedgerEntry() {
        val amendmentLedgerEntry =
            CustomerCreditLedgerCreateEntryResponse.AmendmentLedgerEntry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.AmendmentLedgerEntry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.AmendmentLedgerEntry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.AmendmentLedgerEntry.EntryStatus
                        .COMMITTED
                )
                .entryType(
                    CustomerCreditLedgerCreateEntryResponse.AmendmentLedgerEntry.EntryType.AMENDMENT
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.AmendmentLedgerEntry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofAmendmentLedgerEntry(amendmentLedgerEntry)

        assertThat(customerCreditLedgerCreateEntryResponse.incrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.decrementLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChangeLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiryLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.voidLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiatedLedgerEntry()).isEmpty
        assertThat(customerCreditLedgerCreateEntryResponse.amendmentLedgerEntry())
            .contains(amendmentLedgerEntry)
    }

    @Test
    fun ofAmendmentLedgerEntryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofAmendmentLedgerEntry(
                CustomerCreditLedgerCreateEntryResponse.AmendmentLedgerEntry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.AmendmentLedgerEntry.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.AmendmentLedgerEntry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.AmendmentLedgerEntry.EntryStatus
                            .COMMITTED
                    )
                    .entryType(
                        CustomerCreditLedgerCreateEntryResponse.AmendmentLedgerEntry.EntryType
                            .AMENDMENT
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.AmendmentLedgerEntry.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
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
        val customerCreditLedgerCreateEntryResponse =
            jsonMapper()
                .convertValue(
                    testCase.value,
                    jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
                )

        val e =
            assertThrows<OrbInvalidDataException> {
                customerCreditLedgerCreateEntryResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
