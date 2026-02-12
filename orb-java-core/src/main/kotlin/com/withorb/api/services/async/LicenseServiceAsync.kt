// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.LicenseCreateParams
import com.withorb.api.models.LicenseCreateResponse
import com.withorb.api.models.LicenseDeactivateParams
import com.withorb.api.models.LicenseDeactivateResponse
import com.withorb.api.models.LicenseListPageAsync
import com.withorb.api.models.LicenseListParams
import com.withorb.api.models.LicenseRetrieveByExternalIdParams
import com.withorb.api.models.LicenseRetrieveByExternalIdResponse
import com.withorb.api.models.LicenseRetrieveParams
import com.withorb.api.models.LicenseRetrieveResponse
import com.withorb.api.services.async.licenses.ExternalLicenseServiceAsync
import com.withorb.api.services.async.licenses.UsageServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LicenseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LicenseServiceAsync

    fun externalLicenses(): ExternalLicenseServiceAsync

    fun usage(): UsageServiceAsync

    /**
     * This endpoint is used to create a new license for a user.
     *
     * If a start date is provided, the license will be activated at the **start** of the specified
     * date in the customer's timezone. Otherwise, the activation time will default to the **start**
     * of the current day in the customer's timezone.
     */
    fun create(params: LicenseCreateParams): CompletableFuture<LicenseCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LicenseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseCreateResponse>

    /** This endpoint is used to fetch a license given an identifier. */
    fun retrieve(licenseId: String): CompletableFuture<LicenseRetrieveResponse> =
        retrieve(licenseId, LicenseRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        licenseId: String,
        params: LicenseRetrieveParams = LicenseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseRetrieveResponse> =
        retrieve(params.toBuilder().licenseId(licenseId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        licenseId: String,
        params: LicenseRetrieveParams = LicenseRetrieveParams.none(),
    ): CompletableFuture<LicenseRetrieveResponse> =
        retrieve(licenseId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LicenseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: LicenseRetrieveParams): CompletableFuture<LicenseRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        licenseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LicenseRetrieveResponse> =
        retrieve(licenseId, LicenseRetrieveParams.none(), requestOptions)

    /** This endpoint returns a list of all licenses for a subscription. */
    fun list(params: LicenseListParams): CompletableFuture<LicenseListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LicenseListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseListPageAsync>

    /**
     * This endpoint is used to deactivate an existing license.
     *
     * If an end date is provided, the license will be deactivated at the **start** of the specified
     * date in the customer's timezone. Otherwise, the deactivation time will default to the **end**
     * of the current day in the customer's timezone.
     */
    fun deactivate(licenseId: String): CompletableFuture<LicenseDeactivateResponse> =
        deactivate(licenseId, LicenseDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        licenseId: String,
        params: LicenseDeactivateParams = LicenseDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseDeactivateResponse> =
        deactivate(params.toBuilder().licenseId(licenseId).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        licenseId: String,
        params: LicenseDeactivateParams = LicenseDeactivateParams.none(),
    ): CompletableFuture<LicenseDeactivateResponse> =
        deactivate(licenseId, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: LicenseDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseDeactivateResponse>

    /** @see deactivate */
    fun deactivate(params: LicenseDeactivateParams): CompletableFuture<LicenseDeactivateResponse> =
        deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        licenseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LicenseDeactivateResponse> =
        deactivate(licenseId, LicenseDeactivateParams.none(), requestOptions)

    /** This endpoint is used to fetch a license given an external license identifier. */
    fun retrieveByExternalId(
        externalLicenseId: String,
        params: LicenseRetrieveByExternalIdParams,
    ): CompletableFuture<LicenseRetrieveByExternalIdResponse> =
        retrieveByExternalId(externalLicenseId, params, RequestOptions.none())

    /** @see retrieveByExternalId */
    fun retrieveByExternalId(
        externalLicenseId: String,
        params: LicenseRetrieveByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseRetrieveByExternalIdResponse> =
        retrieveByExternalId(
            params.toBuilder().externalLicenseId(externalLicenseId).build(),
            requestOptions,
        )

    /** @see retrieveByExternalId */
    fun retrieveByExternalId(
        params: LicenseRetrieveByExternalIdParams
    ): CompletableFuture<LicenseRetrieveByExternalIdResponse> =
        retrieveByExternalId(params, RequestOptions.none())

    /** @see retrieveByExternalId */
    fun retrieveByExternalId(
        params: LicenseRetrieveByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseRetrieveByExternalIdResponse>

    /**
     * A view of [LicenseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LicenseServiceAsync.WithRawResponse

        fun externalLicenses(): ExternalLicenseServiceAsync.WithRawResponse

        fun usage(): UsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /licenses`, but is otherwise the same as
         * [LicenseServiceAsync.create].
         */
        fun create(
            params: LicenseCreateParams
        ): CompletableFuture<HttpResponseFor<LicenseCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LicenseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /licenses/{license_id}`, but is otherwise the same
         * as [LicenseServiceAsync.retrieve].
         */
        fun retrieve(
            licenseId: String
        ): CompletableFuture<HttpResponseFor<LicenseRetrieveResponse>> =
            retrieve(licenseId, LicenseRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            licenseId: String,
            params: LicenseRetrieveParams = LicenseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseRetrieveResponse>> =
            retrieve(params.toBuilder().licenseId(licenseId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            licenseId: String,
            params: LicenseRetrieveParams = LicenseRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LicenseRetrieveResponse>> =
            retrieve(licenseId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LicenseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: LicenseRetrieveParams
        ): CompletableFuture<HttpResponseFor<LicenseRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            licenseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseRetrieveResponse>> =
            retrieve(licenseId, LicenseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /licenses`, but is otherwise the same as
         * [LicenseServiceAsync.list].
         */
        fun list(
            params: LicenseListParams
        ): CompletableFuture<HttpResponseFor<LicenseListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: LicenseListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseListPageAsync>>

        /**
         * Returns a raw HTTP response for `post /licenses/{license_id}/deactivate`, but is
         * otherwise the same as [LicenseServiceAsync.deactivate].
         */
        fun deactivate(
            licenseId: String
        ): CompletableFuture<HttpResponseFor<LicenseDeactivateResponse>> =
            deactivate(licenseId, LicenseDeactivateParams.none())

        /** @see deactivate */
        fun deactivate(
            licenseId: String,
            params: LicenseDeactivateParams = LicenseDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseDeactivateResponse>> =
            deactivate(params.toBuilder().licenseId(licenseId).build(), requestOptions)

        /** @see deactivate */
        fun deactivate(
            licenseId: String,
            params: LicenseDeactivateParams = LicenseDeactivateParams.none(),
        ): CompletableFuture<HttpResponseFor<LicenseDeactivateResponse>> =
            deactivate(licenseId, params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            params: LicenseDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseDeactivateResponse>>

        /** @see deactivate */
        fun deactivate(
            params: LicenseDeactivateParams
        ): CompletableFuture<HttpResponseFor<LicenseDeactivateResponse>> =
            deactivate(params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            licenseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseDeactivateResponse>> =
            deactivate(licenseId, LicenseDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /licenses/external_license_id/{external_license_id}`, but is otherwise the same as
         * [LicenseServiceAsync.retrieveByExternalId].
         */
        fun retrieveByExternalId(
            externalLicenseId: String,
            params: LicenseRetrieveByExternalIdParams,
        ): CompletableFuture<HttpResponseFor<LicenseRetrieveByExternalIdResponse>> =
            retrieveByExternalId(externalLicenseId, params, RequestOptions.none())

        /** @see retrieveByExternalId */
        fun retrieveByExternalId(
            externalLicenseId: String,
            params: LicenseRetrieveByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseRetrieveByExternalIdResponse>> =
            retrieveByExternalId(
                params.toBuilder().externalLicenseId(externalLicenseId).build(),
                requestOptions,
            )

        /** @see retrieveByExternalId */
        fun retrieveByExternalId(
            params: LicenseRetrieveByExternalIdParams
        ): CompletableFuture<HttpResponseFor<LicenseRetrieveByExternalIdResponse>> =
            retrieveByExternalId(params, RequestOptions.none())

        /** @see retrieveByExternalId */
        fun retrieveByExternalId(
            params: LicenseRetrieveByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseRetrieveByExternalIdResponse>>
    }
}
