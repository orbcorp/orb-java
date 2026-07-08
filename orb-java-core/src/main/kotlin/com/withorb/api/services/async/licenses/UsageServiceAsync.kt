// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.licenses

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.LicenseUsageGetAllUsageParams
import com.withorb.api.models.LicenseUsageGetAllUsageResponse
import com.withorb.api.models.LicenseUsageGetUsageParams
import com.withorb.api.models.LicenseUsageGetUsageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UsageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageServiceAsync

    /**
     * Returns usage and remaining credits for all licenses of a given type on a subscription.
     *
     * Date range defaults to the current billing period if not specified.
     */
    fun getAllUsage(
        params: LicenseUsageGetAllUsageParams
    ): CompletableFuture<LicenseUsageGetAllUsageResponse> =
        getAllUsage(params, RequestOptions.none())

    /** @see getAllUsage */
    fun getAllUsage(
        params: LicenseUsageGetAllUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseUsageGetAllUsageResponse>

    /**
     * Returns usage and remaining credits for a specific license over a date range.
     *
     * Date range defaults to the current billing period if not specified.
     */
    fun getUsage(licenseId: String): CompletableFuture<LicenseUsageGetUsageResponse> =
        getUsage(licenseId, LicenseUsageGetUsageParams.none())

    /** @see getUsage */
    fun getUsage(
        licenseId: String,
        params: LicenseUsageGetUsageParams = LicenseUsageGetUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseUsageGetUsageResponse> =
        getUsage(params.toBuilder().licenseId(licenseId).build(), requestOptions)

    /** @see getUsage */
    fun getUsage(
        licenseId: String,
        params: LicenseUsageGetUsageParams = LicenseUsageGetUsageParams.none(),
    ): CompletableFuture<LicenseUsageGetUsageResponse> =
        getUsage(licenseId, params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(
        params: LicenseUsageGetUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseUsageGetUsageResponse>

    /** @see getUsage */
    fun getUsage(
        params: LicenseUsageGetUsageParams
    ): CompletableFuture<LicenseUsageGetUsageResponse> = getUsage(params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(
        licenseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LicenseUsageGetUsageResponse> =
        getUsage(licenseId, LicenseUsageGetUsageParams.none(), requestOptions)

    /** A view of [UsageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /licenses/usage`, but is otherwise the same as
         * [UsageServiceAsync.getAllUsage].
         */
        fun getAllUsage(
            params: LicenseUsageGetAllUsageParams
        ): CompletableFuture<HttpResponseFor<LicenseUsageGetAllUsageResponse>> =
            getAllUsage(params, RequestOptions.none())

        /** @see getAllUsage */
        fun getAllUsage(
            params: LicenseUsageGetAllUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseUsageGetAllUsageResponse>>

        /**
         * Returns a raw HTTP response for `get /licenses/{license_id}/usage`, but is otherwise the
         * same as [UsageServiceAsync.getUsage].
         */
        fun getUsage(
            licenseId: String
        ): CompletableFuture<HttpResponseFor<LicenseUsageGetUsageResponse>> =
            getUsage(licenseId, LicenseUsageGetUsageParams.none())

        /** @see getUsage */
        fun getUsage(
            licenseId: String,
            params: LicenseUsageGetUsageParams = LicenseUsageGetUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseUsageGetUsageResponse>> =
            getUsage(params.toBuilder().licenseId(licenseId).build(), requestOptions)

        /** @see getUsage */
        fun getUsage(
            licenseId: String,
            params: LicenseUsageGetUsageParams = LicenseUsageGetUsageParams.none(),
        ): CompletableFuture<HttpResponseFor<LicenseUsageGetUsageResponse>> =
            getUsage(licenseId, params, RequestOptions.none())

        /** @see getUsage */
        fun getUsage(
            params: LicenseUsageGetUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseUsageGetUsageResponse>>

        /** @see getUsage */
        fun getUsage(
            params: LicenseUsageGetUsageParams
        ): CompletableFuture<HttpResponseFor<LicenseUsageGetUsageResponse>> =
            getUsage(params, RequestOptions.none())

        /** @see getUsage */
        fun getUsage(
            licenseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseUsageGetUsageResponse>> =
            getUsage(licenseId, LicenseUsageGetUsageParams.none(), requestOptions)
    }
}
