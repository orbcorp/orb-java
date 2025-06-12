// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.TopLevelPingParams
import com.withorb.api.models.TopLevelPingResponse
import java.util.function.Consumer

interface TopLevelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TopLevelService

    /**
     * This endpoint allows you to test your connection to the Orb API and check the validity of
     * your API key, passed in the Authorization header. This is particularly useful for checking
     * that your environment is set up properly, and is a great choice for connectors and
     * integrations.
     *
     * This API does not have any side-effects or return any Orb resources.
     */
    fun ping(): TopLevelPingResponse = ping(TopLevelPingParams.none())

    /** @see [ping] */
    fun ping(
        params: TopLevelPingParams = TopLevelPingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TopLevelPingResponse

    /** @see [ping] */
    fun ping(params: TopLevelPingParams = TopLevelPingParams.none()): TopLevelPingResponse =
        ping(params, RequestOptions.none())

    /** @see [ping] */
    fun ping(requestOptions: RequestOptions): TopLevelPingResponse =
        ping(TopLevelPingParams.none(), requestOptions)

    /** A view of [TopLevelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TopLevelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ping`, but is otherwise the same as
         * [TopLevelService.ping].
         */
        @MustBeClosed
        fun ping(): HttpResponseFor<TopLevelPingResponse> = ping(TopLevelPingParams.none())

        /** @see [ping] */
        @MustBeClosed
        fun ping(
            params: TopLevelPingParams = TopLevelPingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TopLevelPingResponse>

        /** @see [ping] */
        @MustBeClosed
        fun ping(
            params: TopLevelPingParams = TopLevelPingParams.none()
        ): HttpResponseFor<TopLevelPingResponse> = ping(params, RequestOptions.none())

        /** @see [ping] */
        @MustBeClosed
        fun ping(requestOptions: RequestOptions): HttpResponseFor<TopLevelPingResponse> =
            ping(TopLevelPingParams.none(), requestOptions)
    }
}
