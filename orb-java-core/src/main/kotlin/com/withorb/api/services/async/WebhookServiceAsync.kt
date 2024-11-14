// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.JsonValue
import com.withorb.api.core.http.Headers
import java.util.concurrent.CompletableFuture

interface WebhookServiceAsync {

    fun unwrap(payload: String, headers: Headers, secret: String?): CompletableFuture<JsonValue>

    fun verifySignature(payload: String, headers: Headers, secret: String?): CompletableFuture<Void>
}
