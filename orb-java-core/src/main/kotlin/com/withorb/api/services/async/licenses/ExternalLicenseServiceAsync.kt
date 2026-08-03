// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.licenses

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.LicenseExternalLicenseGetUsageParams
import com.withorb.api.models.LicenseExternalLicenseGetUsageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExternalLicenseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalLicenseServiceAsync

    /**
     * Returns usage and remaining credits for a license identified by its external license ID.
     *
     * Resolves the currently active license with this external ID, i.e. the license whose active
     * window contains the current time. An external license ID can map to multiple licenses over
     * time, so if none is currently active (deactivated, window ended, or not yet started) this
     * returns a 404. To fetch usage for a license regardless of active state, use the endpoint that
     * takes Orb's internal license ID.
     *
     * Date range defaults to the current billing period if not specified.
     */
    fun getUsage(
        externalLicenseId: String,
        params: LicenseExternalLicenseGetUsageParams,
    ): CompletableFuture<LicenseExternalLicenseGetUsageResponse> =
        getUsage(externalLicenseId, params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(
        externalLicenseId: String,
        params: LicenseExternalLicenseGetUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseExternalLicenseGetUsageResponse> =
        getUsage(params.toBuilder().externalLicenseId(externalLicenseId).build(), requestOptions)

    /** @see getUsage */
    fun getUsage(
        params: LicenseExternalLicenseGetUsageParams
    ): CompletableFuture<LicenseExternalLicenseGetUsageResponse> =
        getUsage(params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(
        params: LicenseExternalLicenseGetUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseExternalLicenseGetUsageResponse>

    /**
     * A view of [ExternalLicenseServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalLicenseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /licenses/external_licenses/{external_license_id}/usage`, but is otherwise the same as
         * [ExternalLicenseServiceAsync.getUsage].
         */
        fun getUsage(
            externalLicenseId: String,
            params: LicenseExternalLicenseGetUsageParams,
        ): CompletableFuture<HttpResponseFor<LicenseExternalLicenseGetUsageResponse>> =
            getUsage(externalLicenseId, params, RequestOptions.none())

        /** @see getUsage */
        fun getUsage(
            externalLicenseId: String,
            params: LicenseExternalLicenseGetUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseExternalLicenseGetUsageResponse>> =
            getUsage(
                params.toBuilder().externalLicenseId(externalLicenseId).build(),
                requestOptions,
            )

        /** @see getUsage */
        fun getUsage(
            params: LicenseExternalLicenseGetUsageParams
        ): CompletableFuture<HttpResponseFor<LicenseExternalLicenseGetUsageResponse>> =
            getUsage(params, RequestOptions.none())

        /** @see getUsage */
        fun getUsage(
            params: LicenseExternalLicenseGetUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseExternalLicenseGetUsageResponse>>
    }
}
