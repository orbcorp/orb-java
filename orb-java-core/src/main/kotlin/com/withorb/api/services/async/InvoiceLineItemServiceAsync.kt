// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.InvoiceLineItemCreateParams
import com.withorb.api.models.InvoiceLineItemCreateResponse
import java.util.concurrent.CompletableFuture

interface InvoiceLineItemServiceAsync {

    /**
     * This creates a one-off fixed fee invoice line item on an Invoice. This can only be done for
     * invoices that are in a `draft` status.
     */
    @JvmOverloads
    fun create(
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InvoiceLineItemCreateResponse>
}
