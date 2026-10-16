// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.WebhookEndpoint
import com.withorb.api.models.WebhookEndpointCreateParams
import com.withorb.api.models.WebhookEndpointDeleteParams
import com.withorb.api.models.WebhookEndpointDisableParams
import com.withorb.api.models.WebhookEndpointEnableParams
import com.withorb.api.models.WebhookEndpointListPageAsync
import com.withorb.api.models.WebhookEndpointListParams
import com.withorb.api.models.WebhookEndpointRetrieveParams
import com.withorb.api.models.WebhookEndpointUpdateParams
import com.withorb.api.models.WebhookEndpointWithSecret
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * A webhook endpoint is an HTTPS URL that Orb sends
 * [webhook events](/integrations-and-exports/webhooks) to.
 */
interface WebhookEndpointServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookEndpointServiceAsync

    /**
     * This endpoint creates a webhook endpoint and returns the secret used to sign its webhook
     * events. The secret isn't returned by any other endpoint. An account can have at most 20
     * webhook endpoints by default.
     */
    fun create(params: WebhookEndpointCreateParams): CompletableFuture<WebhookEndpointWithSecret> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookEndpointCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEndpointWithSecret>

    /** This endpoint returns a webhook endpoint identified by its ID. */
    fun retrieve(webhookEndpointId: String): CompletableFuture<WebhookEndpoint> =
        retrieve(webhookEndpointId, WebhookEndpointRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        webhookEndpointId: String,
        params: WebhookEndpointRetrieveParams = WebhookEndpointRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEndpoint> =
        retrieve(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        webhookEndpointId: String,
        params: WebhookEndpointRetrieveParams = WebhookEndpointRetrieveParams.none(),
    ): CompletableFuture<WebhookEndpoint> =
        retrieve(webhookEndpointId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookEndpointRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEndpoint>

    /** @see retrieve */
    fun retrieve(params: WebhookEndpointRetrieveParams): CompletableFuture<WebhookEndpoint> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        webhookEndpointId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookEndpoint> =
        retrieve(webhookEndpointId, WebhookEndpointRetrieveParams.none(), requestOptions)

    /** This endpoint updates a webhook endpoint's URL or the event types sent to it. */
    fun update(webhookEndpointId: String): CompletableFuture<WebhookEndpoint> =
        update(webhookEndpointId, WebhookEndpointUpdateParams.none())

    /** @see update */
    fun update(
        webhookEndpointId: String,
        params: WebhookEndpointUpdateParams = WebhookEndpointUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEndpoint> =
        update(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

    /** @see update */
    fun update(
        webhookEndpointId: String,
        params: WebhookEndpointUpdateParams = WebhookEndpointUpdateParams.none(),
    ): CompletableFuture<WebhookEndpoint> = update(webhookEndpointId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookEndpointUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEndpoint>

    /** @see update */
    fun update(params: WebhookEndpointUpdateParams): CompletableFuture<WebhookEndpoint> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        webhookEndpointId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookEndpoint> =
        update(webhookEndpointId, WebhookEndpointUpdateParams.none(), requestOptions)

    /**
     * This endpoint returns the account's webhook endpoints, ordered starting from the most
     * recently created.
     */
    fun list(): CompletableFuture<WebhookEndpointListPageAsync> =
        list(WebhookEndpointListParams.none())

    /** @see list */
    fun list(
        params: WebhookEndpointListParams = WebhookEndpointListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEndpointListPageAsync>

    /** @see list */
    fun list(
        params: WebhookEndpointListParams = WebhookEndpointListParams.none()
    ): CompletableFuture<WebhookEndpointListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WebhookEndpointListPageAsync> =
        list(WebhookEndpointListParams.none(), requestOptions)

    /**
     * This endpoint deletes a webhook endpoint. Orb stops sending webhook events to it immediately.
     */
    fun delete(webhookEndpointId: String): CompletableFuture<Void?> =
        delete(webhookEndpointId, WebhookEndpointDeleteParams.none())

    /** @see delete */
    fun delete(
        webhookEndpointId: String,
        params: WebhookEndpointDeleteParams = WebhookEndpointDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

    /** @see delete */
    fun delete(
        webhookEndpointId: String,
        params: WebhookEndpointDeleteParams = WebhookEndpointDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(webhookEndpointId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebhookEndpointDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: WebhookEndpointDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        webhookEndpointId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        delete(webhookEndpointId, WebhookEndpointDeleteParams.none(), requestOptions)

    /**
     * This endpoint disables a webhook endpoint, so Orb stops sending webhook events to it until it
     * is enabled again.
     */
    fun disable(webhookEndpointId: String): CompletableFuture<WebhookEndpoint> =
        disable(webhookEndpointId, WebhookEndpointDisableParams.none())

    /** @see disable */
    fun disable(
        webhookEndpointId: String,
        params: WebhookEndpointDisableParams = WebhookEndpointDisableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEndpoint> =
        disable(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

    /** @see disable */
    fun disable(
        webhookEndpointId: String,
        params: WebhookEndpointDisableParams = WebhookEndpointDisableParams.none(),
    ): CompletableFuture<WebhookEndpoint> =
        disable(webhookEndpointId, params, RequestOptions.none())

    /** @see disable */
    fun disable(
        params: WebhookEndpointDisableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEndpoint>

    /** @see disable */
    fun disable(params: WebhookEndpointDisableParams): CompletableFuture<WebhookEndpoint> =
        disable(params, RequestOptions.none())

    /** @see disable */
    fun disable(
        webhookEndpointId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookEndpoint> =
        disable(webhookEndpointId, WebhookEndpointDisableParams.none(), requestOptions)

    /** This endpoint enables a webhook endpoint, so Orb resumes sending webhook events to it. */
    fun enable(webhookEndpointId: String): CompletableFuture<WebhookEndpoint> =
        enable(webhookEndpointId, WebhookEndpointEnableParams.none())

    /** @see enable */
    fun enable(
        webhookEndpointId: String,
        params: WebhookEndpointEnableParams = WebhookEndpointEnableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEndpoint> =
        enable(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

    /** @see enable */
    fun enable(
        webhookEndpointId: String,
        params: WebhookEndpointEnableParams = WebhookEndpointEnableParams.none(),
    ): CompletableFuture<WebhookEndpoint> = enable(webhookEndpointId, params, RequestOptions.none())

    /** @see enable */
    fun enable(
        params: WebhookEndpointEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEndpoint>

    /** @see enable */
    fun enable(params: WebhookEndpointEnableParams): CompletableFuture<WebhookEndpoint> =
        enable(params, RequestOptions.none())

    /** @see enable */
    fun enable(
        webhookEndpointId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookEndpoint> =
        enable(webhookEndpointId, WebhookEndpointEnableParams.none(), requestOptions)

    /**
     * A view of [WebhookEndpointServiceAsync] that provides access to raw HTTP responses for each
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
        ): WebhookEndpointServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhook_endpoints`, but is otherwise the same as
         * [WebhookEndpointServiceAsync.create].
         */
        fun create(
            params: WebhookEndpointCreateParams
        ): CompletableFuture<HttpResponseFor<WebhookEndpointWithSecret>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WebhookEndpointCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpointWithSecret>>

        /**
         * Returns a raw HTTP response for `get /webhook_endpoints/{webhook_endpoint_id}`, but is
         * otherwise the same as [WebhookEndpointServiceAsync.retrieve].
         */
        fun retrieve(
            webhookEndpointId: String
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            retrieve(webhookEndpointId, WebhookEndpointRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            webhookEndpointId: String,
            params: WebhookEndpointRetrieveParams = WebhookEndpointRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            retrieve(
                params.toBuilder().webhookEndpointId(webhookEndpointId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            webhookEndpointId: String,
            params: WebhookEndpointRetrieveParams = WebhookEndpointRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            retrieve(webhookEndpointId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WebhookEndpointRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>>

        /** @see retrieve */
        fun retrieve(
            params: WebhookEndpointRetrieveParams
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            webhookEndpointId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            retrieve(webhookEndpointId, WebhookEndpointRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /webhook_endpoints/{webhook_endpoint_id}`, but is
         * otherwise the same as [WebhookEndpointServiceAsync.update].
         */
        fun update(webhookEndpointId: String): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            update(webhookEndpointId, WebhookEndpointUpdateParams.none())

        /** @see update */
        fun update(
            webhookEndpointId: String,
            params: WebhookEndpointUpdateParams = WebhookEndpointUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            update(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

        /** @see update */
        fun update(
            webhookEndpointId: String,
            params: WebhookEndpointUpdateParams = WebhookEndpointUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            update(webhookEndpointId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WebhookEndpointUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>>

        /** @see update */
        fun update(
            params: WebhookEndpointUpdateParams
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            webhookEndpointId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            update(webhookEndpointId, WebhookEndpointUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhook_endpoints`, but is otherwise the same as
         * [WebhookEndpointServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WebhookEndpointListPageAsync>> =
            list(WebhookEndpointListParams.none())

        /** @see list */
        fun list(
            params: WebhookEndpointListParams = WebhookEndpointListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpointListPageAsync>>

        /** @see list */
        fun list(
            params: WebhookEndpointListParams = WebhookEndpointListParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookEndpointListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookEndpointListPageAsync>> =
            list(WebhookEndpointListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhook_endpoints/{webhook_endpoint_id}`, but is
         * otherwise the same as [WebhookEndpointServiceAsync.delete].
         */
        fun delete(webhookEndpointId: String): CompletableFuture<HttpResponse> =
            delete(webhookEndpointId, WebhookEndpointDeleteParams.none())

        /** @see delete */
        fun delete(
            webhookEndpointId: String,
            params: WebhookEndpointDeleteParams = WebhookEndpointDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

        /** @see delete */
        fun delete(
            webhookEndpointId: String,
            params: WebhookEndpointDeleteParams = WebhookEndpointDeleteParams.none(),
        ): CompletableFuture<HttpResponse> =
            delete(webhookEndpointId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WebhookEndpointDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: WebhookEndpointDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            webhookEndpointId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(webhookEndpointId, WebhookEndpointDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhook_endpoints/{webhook_endpoint_id}/disable`,
         * but is otherwise the same as [WebhookEndpointServiceAsync.disable].
         */
        fun disable(
            webhookEndpointId: String
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            disable(webhookEndpointId, WebhookEndpointDisableParams.none())

        /** @see disable */
        fun disable(
            webhookEndpointId: String,
            params: WebhookEndpointDisableParams = WebhookEndpointDisableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            disable(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

        /** @see disable */
        fun disable(
            webhookEndpointId: String,
            params: WebhookEndpointDisableParams = WebhookEndpointDisableParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            disable(webhookEndpointId, params, RequestOptions.none())

        /** @see disable */
        fun disable(
            params: WebhookEndpointDisableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>>

        /** @see disable */
        fun disable(
            params: WebhookEndpointDisableParams
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            disable(params, RequestOptions.none())

        /** @see disable */
        fun disable(
            webhookEndpointId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            disable(webhookEndpointId, WebhookEndpointDisableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhook_endpoints/{webhook_endpoint_id}/enable`,
         * but is otherwise the same as [WebhookEndpointServiceAsync.enable].
         */
        fun enable(webhookEndpointId: String): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            enable(webhookEndpointId, WebhookEndpointEnableParams.none())

        /** @see enable */
        fun enable(
            webhookEndpointId: String,
            params: WebhookEndpointEnableParams = WebhookEndpointEnableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            enable(params.toBuilder().webhookEndpointId(webhookEndpointId).build(), requestOptions)

        /** @see enable */
        fun enable(
            webhookEndpointId: String,
            params: WebhookEndpointEnableParams = WebhookEndpointEnableParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            enable(webhookEndpointId, params, RequestOptions.none())

        /** @see enable */
        fun enable(
            params: WebhookEndpointEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>>

        /** @see enable */
        fun enable(
            params: WebhookEndpointEnableParams
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            enable(params, RequestOptions.none())

        /** @see enable */
        fun enable(
            webhookEndpointId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookEndpoint>> =
            enable(webhookEndpointId, WebhookEndpointEnableParams.none(), requestOptions)
    }
}
