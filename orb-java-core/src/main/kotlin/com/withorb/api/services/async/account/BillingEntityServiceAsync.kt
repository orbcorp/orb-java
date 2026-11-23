// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.services.async.account

import com.withorb.api.core.ClientOptions
import com.withorb.api.core.RequestOptions
import com.withorb.api.core.http.HttpResponseFor
import com.withorb.api.models.AccountBillingEntityArchiveByExternalIdParams
import com.withorb.api.models.AccountBillingEntityArchiveParams
import com.withorb.api.models.AccountBillingEntityCreateParams
import com.withorb.api.models.AccountBillingEntityFetchByExternalIdParams
import com.withorb.api.models.AccountBillingEntityFetchParams
import com.withorb.api.models.AccountBillingEntityListPageAsync
import com.withorb.api.models.AccountBillingEntityListParams
import com.withorb.api.models.AccountBillingEntityUnarchiveByExternalIdParams
import com.withorb.api.models.AccountBillingEntityUnarchiveParams
import com.withorb.api.models.AccountBillingEntityUpdateByExternalIdParams
import com.withorb.api.models.AccountBillingEntityUpdateParams
import com.withorb.api.models.BillingEntity
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * A billing entity is a legal entity an account invoices from, with its own legal name, address and
 * tax registrations.
 */
interface BillingEntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingEntityServiceAsync

    /**
     * This endpoint creates a billing entity: a legal entity the account invoices from, with its
     * own legal name, address, tax registrations, and invoice settings.
     * `external_billing_entity_id` cannot be changed after creation. This endpoint requires an
     * admin API key.
     */
    fun create(params: AccountBillingEntityCreateParams): CompletableFuture<BillingEntity> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountBillingEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity>

    /**
     * This endpoint updates a billing entity, including the default one. Omitted fields keep their
     * value. A change to the name, legal name, address, or tax registrations writes a new version
     * of the billing entity; invoices already issued keep the version they were issued with. In
     * `invoice_settings`, null clears a field so it inherits the account's setting; the default
     * billing entity accepts only `memo` and `net_terms`. An archived billing entity cannot be
     * updated until it is unarchived. This endpoint requires an admin API key.
     *
     * `payment_gateway_connections` is the full set of connections the billing entity collects
     * payments through; a connection left out is disconnected from the billing entity. If a payment
     * through a connection left out is still in progress, the whole update is rejected and can be
     * retried once the payment finishes.
     */
    fun update(billingEntityId: String): CompletableFuture<BillingEntity> =
        update(billingEntityId, AccountBillingEntityUpdateParams.none())

    /** @see update */
    fun update(
        billingEntityId: String,
        params: AccountBillingEntityUpdateParams = AccountBillingEntityUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity> =
        update(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

    /** @see update */
    fun update(
        billingEntityId: String,
        params: AccountBillingEntityUpdateParams = AccountBillingEntityUpdateParams.none(),
    ): CompletableFuture<BillingEntity> = update(billingEntityId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AccountBillingEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity>

    /** @see update */
    fun update(params: AccountBillingEntityUpdateParams): CompletableFuture<BillingEntity> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        billingEntityId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingEntity> =
        update(billingEntityId, AccountBillingEntityUpdateParams.none(), requestOptions)

    /**
     * This endpoint returns the account's billing entities, including the default billing entity
     * (`is_default: true`), ordered in descending order by creation time.
     */
    fun list(): CompletableFuture<AccountBillingEntityListPageAsync> =
        list(AccountBillingEntityListParams.none())

    /** @see list */
    fun list(
        params: AccountBillingEntityListParams = AccountBillingEntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountBillingEntityListPageAsync>

    /** @see list */
    fun list(
        params: AccountBillingEntityListParams = AccountBillingEntityListParams.none()
    ): CompletableFuture<AccountBillingEntityListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountBillingEntityListPageAsync> =
        list(AccountBillingEntityListParams.none(), requestOptions)

    /**
     * This endpoint archives a billing entity. An archived billing entity cannot be updated;
     * invoices already issued keep it. The default billing entity cannot be archived. Archiving a
     * billing entity that is already archived returns it unchanged. This endpoint requires an admin
     * API key.
     */
    fun archive(billingEntityId: String): CompletableFuture<BillingEntity> =
        archive(billingEntityId, AccountBillingEntityArchiveParams.none())

    /** @see archive */
    fun archive(
        billingEntityId: String,
        params: AccountBillingEntityArchiveParams = AccountBillingEntityArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity> =
        archive(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

    /** @see archive */
    fun archive(
        billingEntityId: String,
        params: AccountBillingEntityArchiveParams = AccountBillingEntityArchiveParams.none(),
    ): CompletableFuture<BillingEntity> = archive(billingEntityId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: AccountBillingEntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity>

    /** @see archive */
    fun archive(params: AccountBillingEntityArchiveParams): CompletableFuture<BillingEntity> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        billingEntityId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingEntity> =
        archive(billingEntityId, AccountBillingEntityArchiveParams.none(), requestOptions)

    /**
     * This endpoint archives a billing entity. An archived billing entity cannot be updated;
     * invoices already issued keep it. The default billing entity cannot be archived. Archiving a
     * billing entity that is already archived returns it unchanged. This endpoint requires an admin
     * API key.
     */
    fun archiveByExternalId(externalBillingEntityId: String): CompletableFuture<BillingEntity> =
        archiveByExternalId(
            externalBillingEntityId,
            AccountBillingEntityArchiveByExternalIdParams.none(),
        )

    /** @see archiveByExternalId */
    fun archiveByExternalId(
        externalBillingEntityId: String,
        params: AccountBillingEntityArchiveByExternalIdParams =
            AccountBillingEntityArchiveByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity> =
        archiveByExternalId(
            params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
            requestOptions,
        )

    /** @see archiveByExternalId */
    fun archiveByExternalId(
        externalBillingEntityId: String,
        params: AccountBillingEntityArchiveByExternalIdParams =
            AccountBillingEntityArchiveByExternalIdParams.none(),
    ): CompletableFuture<BillingEntity> =
        archiveByExternalId(externalBillingEntityId, params, RequestOptions.none())

    /** @see archiveByExternalId */
    fun archiveByExternalId(
        params: AccountBillingEntityArchiveByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity>

    /** @see archiveByExternalId */
    fun archiveByExternalId(
        params: AccountBillingEntityArchiveByExternalIdParams
    ): CompletableFuture<BillingEntity> = archiveByExternalId(params, RequestOptions.none())

    /** @see archiveByExternalId */
    fun archiveByExternalId(
        externalBillingEntityId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingEntity> =
        archiveByExternalId(
            externalBillingEntityId,
            AccountBillingEntityArchiveByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * This endpoint returns a billing entity identified by its ID, or by the
     * `external_billing_entity_id` set when it was created.
     */
    fun fetch(billingEntityId: String): CompletableFuture<BillingEntity> =
        fetch(billingEntityId, AccountBillingEntityFetchParams.none())

    /** @see fetch */
    fun fetch(
        billingEntityId: String,
        params: AccountBillingEntityFetchParams = AccountBillingEntityFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity> =
        fetch(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

    /** @see fetch */
    fun fetch(
        billingEntityId: String,
        params: AccountBillingEntityFetchParams = AccountBillingEntityFetchParams.none(),
    ): CompletableFuture<BillingEntity> = fetch(billingEntityId, params, RequestOptions.none())

    /** @see fetch */
    fun fetch(
        params: AccountBillingEntityFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity>

    /** @see fetch */
    fun fetch(params: AccountBillingEntityFetchParams): CompletableFuture<BillingEntity> =
        fetch(params, RequestOptions.none())

    /** @see fetch */
    fun fetch(
        billingEntityId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingEntity> =
        fetch(billingEntityId, AccountBillingEntityFetchParams.none(), requestOptions)

    /**
     * This endpoint returns a billing entity identified by its ID, or by the
     * `external_billing_entity_id` set when it was created.
     */
    fun fetchByExternalId(externalBillingEntityId: String): CompletableFuture<BillingEntity> =
        fetchByExternalId(
            externalBillingEntityId,
            AccountBillingEntityFetchByExternalIdParams.none(),
        )

    /** @see fetchByExternalId */
    fun fetchByExternalId(
        externalBillingEntityId: String,
        params: AccountBillingEntityFetchByExternalIdParams =
            AccountBillingEntityFetchByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity> =
        fetchByExternalId(
            params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
            requestOptions,
        )

    /** @see fetchByExternalId */
    fun fetchByExternalId(
        externalBillingEntityId: String,
        params: AccountBillingEntityFetchByExternalIdParams =
            AccountBillingEntityFetchByExternalIdParams.none(),
    ): CompletableFuture<BillingEntity> =
        fetchByExternalId(externalBillingEntityId, params, RequestOptions.none())

    /** @see fetchByExternalId */
    fun fetchByExternalId(
        params: AccountBillingEntityFetchByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity>

    /** @see fetchByExternalId */
    fun fetchByExternalId(
        params: AccountBillingEntityFetchByExternalIdParams
    ): CompletableFuture<BillingEntity> = fetchByExternalId(params, RequestOptions.none())

    /** @see fetchByExternalId */
    fun fetchByExternalId(
        externalBillingEntityId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingEntity> =
        fetchByExternalId(
            externalBillingEntityId,
            AccountBillingEntityFetchByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * This endpoint restores an archived billing entity to active. Unarchiving an active billing
     * entity returns it unchanged. This endpoint requires an admin API key.
     */
    fun unarchive(billingEntityId: String): CompletableFuture<BillingEntity> =
        unarchive(billingEntityId, AccountBillingEntityUnarchiveParams.none())

    /** @see unarchive */
    fun unarchive(
        billingEntityId: String,
        params: AccountBillingEntityUnarchiveParams = AccountBillingEntityUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity> =
        unarchive(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(
        billingEntityId: String,
        params: AccountBillingEntityUnarchiveParams = AccountBillingEntityUnarchiveParams.none(),
    ): CompletableFuture<BillingEntity> = unarchive(billingEntityId, params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        params: AccountBillingEntityUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity>

    /** @see unarchive */
    fun unarchive(params: AccountBillingEntityUnarchiveParams): CompletableFuture<BillingEntity> =
        unarchive(params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        billingEntityId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingEntity> =
        unarchive(billingEntityId, AccountBillingEntityUnarchiveParams.none(), requestOptions)

    /**
     * This endpoint restores an archived billing entity to active. Unarchiving an active billing
     * entity returns it unchanged. This endpoint requires an admin API key.
     */
    fun unarchiveByExternalId(externalBillingEntityId: String): CompletableFuture<BillingEntity> =
        unarchiveByExternalId(
            externalBillingEntityId,
            AccountBillingEntityUnarchiveByExternalIdParams.none(),
        )

    /** @see unarchiveByExternalId */
    fun unarchiveByExternalId(
        externalBillingEntityId: String,
        params: AccountBillingEntityUnarchiveByExternalIdParams =
            AccountBillingEntityUnarchiveByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity> =
        unarchiveByExternalId(
            params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
            requestOptions,
        )

    /** @see unarchiveByExternalId */
    fun unarchiveByExternalId(
        externalBillingEntityId: String,
        params: AccountBillingEntityUnarchiveByExternalIdParams =
            AccountBillingEntityUnarchiveByExternalIdParams.none(),
    ): CompletableFuture<BillingEntity> =
        unarchiveByExternalId(externalBillingEntityId, params, RequestOptions.none())

    /** @see unarchiveByExternalId */
    fun unarchiveByExternalId(
        params: AccountBillingEntityUnarchiveByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity>

    /** @see unarchiveByExternalId */
    fun unarchiveByExternalId(
        params: AccountBillingEntityUnarchiveByExternalIdParams
    ): CompletableFuture<BillingEntity> = unarchiveByExternalId(params, RequestOptions.none())

    /** @see unarchiveByExternalId */
    fun unarchiveByExternalId(
        externalBillingEntityId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingEntity> =
        unarchiveByExternalId(
            externalBillingEntityId,
            AccountBillingEntityUnarchiveByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * This endpoint updates a billing entity, including the default one. Omitted fields keep their
     * value. A change to the name, legal name, address, or tax registrations writes a new version
     * of the billing entity; invoices already issued keep the version they were issued with. In
     * `invoice_settings`, null clears a field so it inherits the account's setting; the default
     * billing entity accepts only `memo` and `net_terms`. An archived billing entity cannot be
     * updated until it is unarchived. This endpoint requires an admin API key.
     *
     * `payment_gateway_connections` is the full set of connections the billing entity collects
     * payments through; a connection left out is disconnected from the billing entity. If a payment
     * through a connection left out is still in progress, the whole update is rejected and can be
     * retried once the payment finishes.
     */
    fun updateByExternalId(externalBillingEntityId: String): CompletableFuture<BillingEntity> =
        updateByExternalId(
            externalBillingEntityId,
            AccountBillingEntityUpdateByExternalIdParams.none(),
        )

    /** @see updateByExternalId */
    fun updateByExternalId(
        externalBillingEntityId: String,
        params: AccountBillingEntityUpdateByExternalIdParams =
            AccountBillingEntityUpdateByExternalIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity> =
        updateByExternalId(
            params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
            requestOptions,
        )

    /** @see updateByExternalId */
    fun updateByExternalId(
        externalBillingEntityId: String,
        params: AccountBillingEntityUpdateByExternalIdParams =
            AccountBillingEntityUpdateByExternalIdParams.none(),
    ): CompletableFuture<BillingEntity> =
        updateByExternalId(externalBillingEntityId, params, RequestOptions.none())

    /** @see updateByExternalId */
    fun updateByExternalId(
        params: AccountBillingEntityUpdateByExternalIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingEntity>

    /** @see updateByExternalId */
    fun updateByExternalId(
        params: AccountBillingEntityUpdateByExternalIdParams
    ): CompletableFuture<BillingEntity> = updateByExternalId(params, RequestOptions.none())

    /** @see updateByExternalId */
    fun updateByExternalId(
        externalBillingEntityId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingEntity> =
        updateByExternalId(
            externalBillingEntityId,
            AccountBillingEntityUpdateByExternalIdParams.none(),
            requestOptions,
        )

    /**
     * A view of [BillingEntityServiceAsync] that provides access to raw HTTP responses for each
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
        ): BillingEntityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /account/billing_entities`, but is otherwise the
         * same as [BillingEntityServiceAsync.create].
         */
        fun create(
            params: AccountBillingEntityCreateParams
        ): CompletableFuture<HttpResponseFor<BillingEntity>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AccountBillingEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>>

        /**
         * Returns a raw HTTP response for `put /account/billing_entities/{billing_entity_id}`, but
         * is otherwise the same as [BillingEntityServiceAsync.update].
         */
        fun update(billingEntityId: String): CompletableFuture<HttpResponseFor<BillingEntity>> =
            update(billingEntityId, AccountBillingEntityUpdateParams.none())

        /** @see update */
        fun update(
            billingEntityId: String,
            params: AccountBillingEntityUpdateParams = AccountBillingEntityUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            update(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

        /** @see update */
        fun update(
            billingEntityId: String,
            params: AccountBillingEntityUpdateParams = AccountBillingEntityUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            update(billingEntityId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AccountBillingEntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>>

        /** @see update */
        fun update(
            params: AccountBillingEntityUpdateParams
        ): CompletableFuture<HttpResponseFor<BillingEntity>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            billingEntityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            update(billingEntityId, AccountBillingEntityUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account/billing_entities`, but is otherwise the
         * same as [BillingEntityServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccountBillingEntityListPageAsync>> =
            list(AccountBillingEntityListParams.none())

        /** @see list */
        fun list(
            params: AccountBillingEntityListParams = AccountBillingEntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountBillingEntityListPageAsync>>

        /** @see list */
        fun list(
            params: AccountBillingEntityListParams = AccountBillingEntityListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountBillingEntityListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountBillingEntityListPageAsync>> =
            list(AccountBillingEntityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /account/billing_entities/{billing_entity_id}/archive`, but is otherwise the same as
         * [BillingEntityServiceAsync.archive].
         */
        fun archive(billingEntityId: String): CompletableFuture<HttpResponseFor<BillingEntity>> =
            archive(billingEntityId, AccountBillingEntityArchiveParams.none())

        /** @see archive */
        fun archive(
            billingEntityId: String,
            params: AccountBillingEntityArchiveParams = AccountBillingEntityArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            archive(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

        /** @see archive */
        fun archive(
            billingEntityId: String,
            params: AccountBillingEntityArchiveParams = AccountBillingEntityArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            archive(billingEntityId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: AccountBillingEntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>>

        /** @see archive */
        fun archive(
            params: AccountBillingEntityArchiveParams
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            billingEntityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            archive(billingEntityId, AccountBillingEntityArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /account/billing_entities/external_billing_entity_id/{external_billing_entity_id}/archive`,
         * but is otherwise the same as [BillingEntityServiceAsync.archiveByExternalId].
         */
        fun archiveByExternalId(
            externalBillingEntityId: String
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            archiveByExternalId(
                externalBillingEntityId,
                AccountBillingEntityArchiveByExternalIdParams.none(),
            )

        /** @see archiveByExternalId */
        fun archiveByExternalId(
            externalBillingEntityId: String,
            params: AccountBillingEntityArchiveByExternalIdParams =
                AccountBillingEntityArchiveByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            archiveByExternalId(
                params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
                requestOptions,
            )

        /** @see archiveByExternalId */
        fun archiveByExternalId(
            externalBillingEntityId: String,
            params: AccountBillingEntityArchiveByExternalIdParams =
                AccountBillingEntityArchiveByExternalIdParams.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            archiveByExternalId(externalBillingEntityId, params, RequestOptions.none())

        /** @see archiveByExternalId */
        fun archiveByExternalId(
            params: AccountBillingEntityArchiveByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>>

        /** @see archiveByExternalId */
        fun archiveByExternalId(
            params: AccountBillingEntityArchiveByExternalIdParams
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            archiveByExternalId(params, RequestOptions.none())

        /** @see archiveByExternalId */
        fun archiveByExternalId(
            externalBillingEntityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            archiveByExternalId(
                externalBillingEntityId,
                AccountBillingEntityArchiveByExternalIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /account/billing_entities/{billing_entity_id}`, but
         * is otherwise the same as [BillingEntityServiceAsync.fetch].
         */
        fun fetch(billingEntityId: String): CompletableFuture<HttpResponseFor<BillingEntity>> =
            fetch(billingEntityId, AccountBillingEntityFetchParams.none())

        /** @see fetch */
        fun fetch(
            billingEntityId: String,
            params: AccountBillingEntityFetchParams = AccountBillingEntityFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            fetch(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

        /** @see fetch */
        fun fetch(
            billingEntityId: String,
            params: AccountBillingEntityFetchParams = AccountBillingEntityFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            fetch(billingEntityId, params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            params: AccountBillingEntityFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>>

        /** @see fetch */
        fun fetch(
            params: AccountBillingEntityFetchParams
        ): CompletableFuture<HttpResponseFor<BillingEntity>> = fetch(params, RequestOptions.none())

        /** @see fetch */
        fun fetch(
            billingEntityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            fetch(billingEntityId, AccountBillingEntityFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /account/billing_entities/external_billing_entity_id/{external_billing_entity_id}`, but
         * is otherwise the same as [BillingEntityServiceAsync.fetchByExternalId].
         */
        fun fetchByExternalId(
            externalBillingEntityId: String
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            fetchByExternalId(
                externalBillingEntityId,
                AccountBillingEntityFetchByExternalIdParams.none(),
            )

        /** @see fetchByExternalId */
        fun fetchByExternalId(
            externalBillingEntityId: String,
            params: AccountBillingEntityFetchByExternalIdParams =
                AccountBillingEntityFetchByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            fetchByExternalId(
                params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
                requestOptions,
            )

        /** @see fetchByExternalId */
        fun fetchByExternalId(
            externalBillingEntityId: String,
            params: AccountBillingEntityFetchByExternalIdParams =
                AccountBillingEntityFetchByExternalIdParams.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            fetchByExternalId(externalBillingEntityId, params, RequestOptions.none())

        /** @see fetchByExternalId */
        fun fetchByExternalId(
            params: AccountBillingEntityFetchByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>>

        /** @see fetchByExternalId */
        fun fetchByExternalId(
            params: AccountBillingEntityFetchByExternalIdParams
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            fetchByExternalId(params, RequestOptions.none())

        /** @see fetchByExternalId */
        fun fetchByExternalId(
            externalBillingEntityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            fetchByExternalId(
                externalBillingEntityId,
                AccountBillingEntityFetchByExternalIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /account/billing_entities/{billing_entity_id}/unarchive`, but is otherwise the same as
         * [BillingEntityServiceAsync.unarchive].
         */
        fun unarchive(billingEntityId: String): CompletableFuture<HttpResponseFor<BillingEntity>> =
            unarchive(billingEntityId, AccountBillingEntityUnarchiveParams.none())

        /** @see unarchive */
        fun unarchive(
            billingEntityId: String,
            params: AccountBillingEntityUnarchiveParams =
                AccountBillingEntityUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            unarchive(params.toBuilder().billingEntityId(billingEntityId).build(), requestOptions)

        /** @see unarchive */
        fun unarchive(
            billingEntityId: String,
            params: AccountBillingEntityUnarchiveParams = AccountBillingEntityUnarchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            unarchive(billingEntityId, params, RequestOptions.none())

        /** @see unarchive */
        fun unarchive(
            params: AccountBillingEntityUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>>

        /** @see unarchive */
        fun unarchive(
            params: AccountBillingEntityUnarchiveParams
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            unarchive(params, RequestOptions.none())

        /** @see unarchive */
        fun unarchive(
            billingEntityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            unarchive(billingEntityId, AccountBillingEntityUnarchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /account/billing_entities/external_billing_entity_id/{external_billing_entity_id}/unarchive`,
         * but is otherwise the same as [BillingEntityServiceAsync.unarchiveByExternalId].
         */
        fun unarchiveByExternalId(
            externalBillingEntityId: String
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            unarchiveByExternalId(
                externalBillingEntityId,
                AccountBillingEntityUnarchiveByExternalIdParams.none(),
            )

        /** @see unarchiveByExternalId */
        fun unarchiveByExternalId(
            externalBillingEntityId: String,
            params: AccountBillingEntityUnarchiveByExternalIdParams =
                AccountBillingEntityUnarchiveByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            unarchiveByExternalId(
                params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
                requestOptions,
            )

        /** @see unarchiveByExternalId */
        fun unarchiveByExternalId(
            externalBillingEntityId: String,
            params: AccountBillingEntityUnarchiveByExternalIdParams =
                AccountBillingEntityUnarchiveByExternalIdParams.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            unarchiveByExternalId(externalBillingEntityId, params, RequestOptions.none())

        /** @see unarchiveByExternalId */
        fun unarchiveByExternalId(
            params: AccountBillingEntityUnarchiveByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>>

        /** @see unarchiveByExternalId */
        fun unarchiveByExternalId(
            params: AccountBillingEntityUnarchiveByExternalIdParams
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            unarchiveByExternalId(params, RequestOptions.none())

        /** @see unarchiveByExternalId */
        fun unarchiveByExternalId(
            externalBillingEntityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            unarchiveByExternalId(
                externalBillingEntityId,
                AccountBillingEntityUnarchiveByExternalIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put
         * /account/billing_entities/external_billing_entity_id/{external_billing_entity_id}`, but
         * is otherwise the same as [BillingEntityServiceAsync.updateByExternalId].
         */
        fun updateByExternalId(
            externalBillingEntityId: String
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            updateByExternalId(
                externalBillingEntityId,
                AccountBillingEntityUpdateByExternalIdParams.none(),
            )

        /** @see updateByExternalId */
        fun updateByExternalId(
            externalBillingEntityId: String,
            params: AccountBillingEntityUpdateByExternalIdParams =
                AccountBillingEntityUpdateByExternalIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            updateByExternalId(
                params.toBuilder().externalBillingEntityId(externalBillingEntityId).build(),
                requestOptions,
            )

        /** @see updateByExternalId */
        fun updateByExternalId(
            externalBillingEntityId: String,
            params: AccountBillingEntityUpdateByExternalIdParams =
                AccountBillingEntityUpdateByExternalIdParams.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            updateByExternalId(externalBillingEntityId, params, RequestOptions.none())

        /** @see updateByExternalId */
        fun updateByExternalId(
            params: AccountBillingEntityUpdateByExternalIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingEntity>>

        /** @see updateByExternalId */
        fun updateByExternalId(
            params: AccountBillingEntityUpdateByExternalIdParams
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            updateByExternalId(params, RequestOptions.none())

        /** @see updateByExternalId */
        fun updateByExternalId(
            externalBillingEntityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingEntity>> =
            updateByExternalId(
                externalBillingEntityId,
                AccountBillingEntityUpdateByExternalIdParams.none(),
                requestOptions,
            )
    }
}
