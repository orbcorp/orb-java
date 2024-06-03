// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async.prices

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.Price
import com.withorb.api.models.PriceExternalPriceIdFetchParams
import java.util.concurrent.CompletableFuture

interface ExternalPriceIdServiceAsync {

    /**
     * This endpoint returns a price given an external price id. See the
     * [price creation API](../reference/create-price) for more information about external price
     * aliases.
     */
    @JvmOverloads
    fun fetch(
        params: PriceExternalPriceIdFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Price>
}
