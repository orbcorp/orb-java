// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.checkRequired
import com.withorb.api.core.handlers.emptyHandler
import com.withorb.api.core.handlers.errorBodyHandler
import com.withorb.api.core.handlers.errorHandler
import com.withorb.api.core.handlers.jsonHandler
import com.withorb.api.core.http.HttpMethod
import com.withorb.api.core.http.HttpRequest
import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.core.http.json
import com.withorb.api.core.http.parseable
import com.withorb.api.core.prepareAsync
import com.withorb.api.models.Invoice
import com.withorb.api.models.InvoiceCreateParams
import com.withorb.api.models.InvoiceDeleteLineItemParams
import com.withorb.api.models.InvoiceFetchParams
import com.withorb.api.models.InvoiceFetchUpcomingParams
import com.withorb.api.models.InvoiceFetchUpcomingResponse
import com.withorb.api.models.InvoiceIssueParams
import com.withorb.api.models.InvoiceIssueSummaryParams
import com.withorb.api.models.InvoiceIssueSummaryResponse
import com.withorb.api.models.InvoiceListPageAsync
import com.withorb.api.models.InvoiceListPageResponse
import com.withorb.api.models.InvoiceListParams
import com.withorb.api.models.InvoiceListSummaryPageAsync
import com.withorb.api.models.InvoiceListSummaryPageResponse
import com.withorb.api.models.InvoiceListSummaryParams
import com.withorb.api.models.InvoiceMarkPaidParams
import com.withorb.api.models.InvoicePayParams
import com.withorb.api.models.InvoiceRegenerateInvoicePdfParams
import com.withorb.api.models.InvoiceRegenerateReceiptPdfParams
import com.withorb.api.models.InvoiceUpdateParams
import com.withorb.api.models.InvoiceVoidInvoiceParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * An [`Invoice`](/core-concepts#invoice) is a fundamental billing entity, representing the request
 * for payment for a single subscription. This includes a set of line items, which correspond to
 * prices in the subscription's plan and can represent fixed recurring fees or usage-based fees.
 * They are generated at the end of a billing period, or as the result of an action, such as a
 * cancellation.
 */
class InvoiceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InvoiceServiceAsync {

    private val withRawResponse: InvoiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvoiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvoiceServiceAsync =
        InvoiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Invoice> =
        // post /invoices
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Invoice> =
        // put /invoices/{invoice_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InvoiceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceListPageAsync> =
        // get /invoices
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun deleteLineItem(
        params: InvoiceDeleteLineItemParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /invoices/{invoice_id}/invoice_line_items/{line_item_id}
        withRawResponse().deleteLineItem(params, requestOptions).thenAccept {}

    override fun fetch(
        params: InvoiceFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Invoice> =
        // get /invoices/{invoice_id}
        withRawResponse().fetch(params, requestOptions).thenApply { it.parse() }

    override fun fetchUpcoming(
        params: InvoiceFetchUpcomingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceFetchUpcomingResponse> =
        // get /invoices/upcoming
        withRawResponse().fetchUpcoming(params, requestOptions).thenApply { it.parse() }

    override fun issue(
        params: InvoiceIssueParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Invoice> =
        // post /invoices/{invoice_id}/issue
        withRawResponse().issue(params, requestOptions).thenApply { it.parse() }

    override fun issueSummary(
        params: InvoiceIssueSummaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceIssueSummaryResponse> =
        // post /invoices/summary/{invoice_id}/issue
        withRawResponse().issueSummary(params, requestOptions).thenApply { it.parse() }

    override fun listSummary(
        params: InvoiceListSummaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvoiceListSummaryPageAsync> =
        // get /invoices/summary
        withRawResponse().listSummary(params, requestOptions).thenApply { it.parse() }

    override fun markPaid(
        params: InvoiceMarkPaidParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Invoice> =
        // post /invoices/{invoice_id}/mark_paid
        withRawResponse().markPaid(params, requestOptions).thenApply { it.parse() }

    override fun pay(
        params: InvoicePayParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Invoice> =
        // post /invoices/{invoice_id}/pay
        withRawResponse().pay(params, requestOptions).thenApply { it.parse() }

    override fun regenerateInvoicePdf(
        params: InvoiceRegenerateInvoicePdfParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Invoice> =
        // post /invoices/{invoice_id}/regenerate_invoice_pdf
        withRawResponse().regenerateInvoicePdf(params, requestOptions).thenApply { it.parse() }

    override fun regenerateReceiptPdf(
        params: InvoiceRegenerateReceiptPdfParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Invoice> =
        // post /invoices/{invoice_id}/regenerate_receipt_pdf
        withRawResponse().regenerateReceiptPdf(params, requestOptions).thenApply { it.parse() }

    override fun voidInvoice(
        params: InvoiceVoidInvoiceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Invoice> =
        // post /invoices/{invoice_id}/void
        withRawResponse().voidInvoice(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvoiceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvoiceServiceAsync.WithRawResponse =
            InvoiceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<InvoiceListPageResponse> =
            jsonHandler<InvoiceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InvoiceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                InvoiceListPageAsync.builder()
                                    .service(InvoiceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteLineItemHandler: Handler<Void?> = emptyHandler()

        override fun deleteLineItem(
            params: InvoiceDeleteLineItemParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lineItemId", params.lineItemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "invoices",
                        params._pathParam(0),
                        "invoice_line_items",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteLineItemHandler.handle(it) }
                    }
                }
        }

        private val fetchHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun fetch(
            params: InvoiceFetchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { fetchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val fetchUpcomingHandler: Handler<InvoiceFetchUpcomingResponse> =
            jsonHandler<InvoiceFetchUpcomingResponse>(clientOptions.jsonMapper)

        override fun fetchUpcoming(
            params: InvoiceFetchUpcomingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceFetchUpcomingResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", "upcoming")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { fetchUpcomingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val issueHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun issue(
            params: InvoiceIssueParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0), "issue")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { issueHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val issueSummaryHandler: Handler<InvoiceIssueSummaryResponse> =
            jsonHandler<InvoiceIssueSummaryResponse>(clientOptions.jsonMapper)

        override fun issueSummary(
            params: InvoiceIssueSummaryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceIssueSummaryResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", "summary", params._pathParam(0), "issue")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { issueSummaryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listSummaryHandler: Handler<InvoiceListSummaryPageResponse> =
            jsonHandler<InvoiceListSummaryPageResponse>(clientOptions.jsonMapper)

        override fun listSummary(
            params: InvoiceListSummaryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvoiceListSummaryPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", "summary")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listSummaryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                InvoiceListSummaryPageAsync.builder()
                                    .service(InvoiceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val markPaidHandler: Handler<Invoice> =
            jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun markPaid(
            params: InvoiceMarkPaidParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0), "mark_paid")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { markPaidHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val payHandler: Handler<Invoice> = jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun pay(
            params: InvoicePayParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0), "pay")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { payHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val regenerateInvoicePdfHandler: Handler<Invoice> =
            jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun regenerateInvoicePdf(
            params: InvoiceRegenerateInvoicePdfParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0), "regenerate_invoice_pdf")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { regenerateInvoicePdfHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val regenerateReceiptPdfHandler: Handler<Invoice> =
            jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun regenerateReceiptPdf(
            params: InvoiceRegenerateReceiptPdfParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0), "regenerate_receipt_pdf")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { regenerateReceiptPdfHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val voidInvoiceHandler: Handler<Invoice> =
            jsonHandler<Invoice>(clientOptions.jsonMapper)

        override fun voidInvoice(
            params: InvoiceVoidInvoiceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Invoice>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invoices", params._pathParam(0), "void")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { voidInvoiceHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
