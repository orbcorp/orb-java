// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async.customers

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.CustomerCreditListByExternalIdPageAsync
import com.withorb.api.models.CustomerCreditListByExternalIdParams
import com.withorb.api.models.CustomerCreditListPageAsync
import com.withorb.api.models.CustomerCreditListParams
import com.withorb.api.services.async.customers.credits.LedgerServiceAsync
import com.withorb.api.services.async.customers.credits.TopUpServiceAsync
import java.util.concurrent.CompletableFuture

interface CreditServiceAsync {

    fun ledger(): LedgerServiceAsync

    fun topUps(): TopUpServiceAsync

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    @JvmOverloads
    fun list(
        params: CustomerCreditListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerCreditListPageAsync>

    /**
     * Returns a paginated list of unexpired, non-zero credit blocks for a customer.
     *
     * Note that `currency` defaults to credits if not specified. To use a real world currency, set
     * `currency` to an ISO 4217 string.
     */
    @JvmOverloads
    fun listByExternalId(
        params: CustomerCreditListByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerCreditListByExternalIdPageAsync>
}
