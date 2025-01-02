// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async.dimensionalPriceGroups

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.DimensionalPriceGroup
import com.withorb.api.models.DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams
import java.util.concurrent.CompletableFuture

interface ExternalDimensionalPriceGroupIdServiceAsync {

    /** Fetch dimensional price group by external ID */
    @JvmOverloads
    fun retrieve(
        params: DimensionalPriceGroupExternalDimensionalPriceGroupIdRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DimensionalPriceGroup>
}
