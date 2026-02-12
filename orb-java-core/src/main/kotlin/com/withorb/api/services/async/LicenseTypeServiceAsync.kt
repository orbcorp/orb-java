// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.LicenseTypeCreateParams
import com.withorb.api.models.LicenseTypeCreateResponse
import com.withorb.api.models.LicenseTypeListPageAsync
import com.withorb.api.models.LicenseTypeListParams
import com.withorb.api.models.LicenseTypeRetrieveParams
import com.withorb.api.models.LicenseTypeRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LicenseTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LicenseTypeServiceAsync

    /**
     * This endpoint is used to create a new license type.
     *
     * License types are used to group licenses and define billing behavior. Each license type has a
     * name and a grouping key that determines how metrics are aggregated for billing purposes.
     */
    fun create(params: LicenseTypeCreateParams): CompletableFuture<LicenseTypeCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LicenseTypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseTypeCreateResponse>

    /**
     * This endpoint returns a license type identified by its license_type_id.
     *
     * Use this endpoint to retrieve details about a specific license type, including its name and
     * grouping key.
     */
    fun retrieve(licenseTypeId: String): CompletableFuture<LicenseTypeRetrieveResponse> =
        retrieve(licenseTypeId, LicenseTypeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        licenseTypeId: String,
        params: LicenseTypeRetrieveParams = LicenseTypeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseTypeRetrieveResponse> =
        retrieve(params.toBuilder().licenseTypeId(licenseTypeId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        licenseTypeId: String,
        params: LicenseTypeRetrieveParams = LicenseTypeRetrieveParams.none(),
    ): CompletableFuture<LicenseTypeRetrieveResponse> =
        retrieve(licenseTypeId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LicenseTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseTypeRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: LicenseTypeRetrieveParams
    ): CompletableFuture<LicenseTypeRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        licenseTypeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LicenseTypeRetrieveResponse> =
        retrieve(licenseTypeId, LicenseTypeRetrieveParams.none(), requestOptions)

    /**
     * This endpoint returns a list of all license types configured for the account, ordered in
     * ascending order by creation time.
     *
     * License types are used to group licenses and define billing behavior. Each license type has a
     * name and a grouping key that determines how metrics are aggregated for billing purposes.
     */
    fun list(): CompletableFuture<LicenseTypeListPageAsync> = list(LicenseTypeListParams.none())

    /** @see list */
    fun list(
        params: LicenseTypeListParams = LicenseTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseTypeListPageAsync>

    /** @see list */
    fun list(
        params: LicenseTypeListParams = LicenseTypeListParams.none()
    ): CompletableFuture<LicenseTypeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LicenseTypeListPageAsync> =
        list(LicenseTypeListParams.none(), requestOptions)

    /**
     * A view of [LicenseTypeServiceAsync] that provides access to raw HTTP responses for each
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
        ): LicenseTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /license_types`, but is otherwise the same as
         * [LicenseTypeServiceAsync.create].
         */
        fun create(
            params: LicenseTypeCreateParams
        ): CompletableFuture<HttpResponseFor<LicenseTypeCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LicenseTypeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseTypeCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /license_types/{license_type_id}`, but is otherwise
         * the same as [LicenseTypeServiceAsync.retrieve].
         */
        fun retrieve(
            licenseTypeId: String
        ): CompletableFuture<HttpResponseFor<LicenseTypeRetrieveResponse>> =
            retrieve(licenseTypeId, LicenseTypeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            licenseTypeId: String,
            params: LicenseTypeRetrieveParams = LicenseTypeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseTypeRetrieveResponse>> =
            retrieve(params.toBuilder().licenseTypeId(licenseTypeId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            licenseTypeId: String,
            params: LicenseTypeRetrieveParams = LicenseTypeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LicenseTypeRetrieveResponse>> =
            retrieve(licenseTypeId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LicenseTypeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseTypeRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: LicenseTypeRetrieveParams
        ): CompletableFuture<HttpResponseFor<LicenseTypeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            licenseTypeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseTypeRetrieveResponse>> =
            retrieve(licenseTypeId, LicenseTypeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /license_types`, but is otherwise the same as
         * [LicenseTypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LicenseTypeListPageAsync>> =
            list(LicenseTypeListParams.none())

        /** @see list */
        fun list(
            params: LicenseTypeListParams = LicenseTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseTypeListPageAsync>>

        /** @see list */
        fun list(
            params: LicenseTypeListParams = LicenseTypeListParams.none()
        ): CompletableFuture<HttpResponseFor<LicenseTypeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LicenseTypeListPageAsync>> =
            list(LicenseTypeListParams.none(), requestOptions)
    }
}
