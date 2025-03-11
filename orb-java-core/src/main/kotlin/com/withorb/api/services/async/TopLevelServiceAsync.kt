// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.TopLevelPingParams
import com.withorb.api.models.TopLevelPingResponse
import java.util.concurrent.CompletableFuture

interface TopLevelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint allows you to test your connection to the Orb API and check the
     * validity of your API key, passed in the Authorization header. This is
     * particularly useful for checking that your environment is set up properly, and
     * is a great choice for connectors and integrations.
     *
     * This API does not have any side-effects or return any Orb resources.
     */
    fun ping(): CompletableFuture<TopLevelPingResponse> = ping(TopLevelPingParams.none())

    /** @see [ping] */
    fun ping(params: TopLevelPingParams = TopLevelPingParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TopLevelPingResponse>

    /** @see [ping] */
    fun ping(params: TopLevelPingParams = TopLevelPingParams.none()): CompletableFuture<TopLevelPingResponse> =
        ping(
          params, RequestOptions.none()
        )

    /** @see [ping] */
    fun ping(requestOptions: RequestOptions): CompletableFuture<TopLevelPingResponse> = ping(TopLevelPingParams.none(), requestOptions)

    /**
     * A view of [TopLevelServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /ping`, but is otherwise the same as
         * [TopLevelServiceAsync.ping].
         */
        @MustBeClosed
        fun ping(): CompletableFuture<HttpResponseFor<TopLevelPingResponse>> = ping(TopLevelPingParams.none())

        /** @see [ping] */
        @MustBeClosed
        fun ping(params: TopLevelPingParams = TopLevelPingParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TopLevelPingResponse>>

        /** @see [ping] */
        @MustBeClosed
        fun ping(params: TopLevelPingParams = TopLevelPingParams.none()): CompletableFuture<HttpResponseFor<TopLevelPingResponse>> =
            ping(
              params, RequestOptions.none()
            )

        /** @see [ping] */
        @MustBeClosed
        fun ping(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TopLevelPingResponse>> = ping(TopLevelPingParams.none(), requestOptions)
    }
}
