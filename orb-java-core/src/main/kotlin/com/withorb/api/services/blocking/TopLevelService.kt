// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.blocking

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.TopLevelPingParams
import com.withorb.api.models.TopLevelPingResponse

interface TopLevelService {

    /**
     * This endpoint allows you to test your connection to the Orb API and check the validity of
     * your API key, passed in the Authorization header. This is particularly useful for checking
     * that your environment is set up properly, and is a great choice for connectors and
     * integrations.
     *
     * This API does not have any side-effects or return any Orb resources.
     */
    @JvmOverloads
    fun ping(
        params: TopLevelPingParams = TopLevelPingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TopLevelPingResponse

    /**
     * This endpoint allows you to test your connection to the Orb API and check the validity of
     * your API key, passed in the Authorization header. This is particularly useful for checking
     * that your environment is set up properly, and is a great choice for connectors and
     * integrations.
     *
     * This API does not have any side-effects or return any Orb resources.
     */
    fun ping(requestOptions: RequestOptions): TopLevelPingResponse =
        ping(TopLevelPingParams.none(), requestOptions)
}
