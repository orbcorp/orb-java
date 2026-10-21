// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.webhooks

import com.withorb.api.core.ClientOptions
import com.withorb.api.models.UnwrapStandardWebhookEvent
import com.withorb.api.services.blocking.webhooks.StandardServiceImpl
import java.util.function.Consumer

class StandardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StandardServiceAsync {

    private val withRawResponse: StandardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StandardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StandardServiceAsync =
        StandardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun unwrapStandard(body: String): UnwrapStandardWebhookEvent =
        StandardServiceImpl(clientOptions).unwrapStandard(body)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StandardServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StandardServiceAsync.WithRawResponse =
            StandardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
