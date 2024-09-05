// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.withorb.api.services.async

import com.withorb.api.core.RequestOptions
import com.withorb.api.models.Plan
import com.withorb.api.models.PlanCreateParams
import com.withorb.api.models.PlanFetchParams
import com.withorb.api.models.PlanListPageAsync
import com.withorb.api.models.PlanListParams
import com.withorb.api.models.PlanUpdateParams
import com.withorb.api.services.async.plans.ExternalPlanIdServiceAsync
import java.util.concurrent.CompletableFuture

interface PlanServiceAsync {

    fun externalPlanId(): ExternalPlanIdServiceAsync

    /** This endpoint allows creation of plans including their prices. */
    @JvmOverloads
    fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Plan>

    /**
     * This endpoint can be used to update the `external_plan_id`, and `metadata` of an existing
     * plan.
     *
     * Other fields on a customer are currently immutable.
     */
    @JvmOverloads
    fun update(
        params: PlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Plan>

    /**
     * This endpoint returns a list of all [plans](../guides/concepts##plan-and-price) for an
     * account in a list format. The list of plans is ordered starting from the most recently
     * created plan. The response also includes [`pagination_metadata`](../reference/pagination),
     * which lets the caller retrieve the next page of results if they exist.
     */
    @JvmOverloads
    fun list(
        params: PlanListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PlanListPageAsync>

    /**
     * This endpoint is used to fetch [plan](../guides/concepts##plan-and-price) details given a
     * plan identifier. It returns information about the prices included in the plan and their
     * configuration, as well as the product that the plan is attached to.
     *
     * ## Serialized prices
     *
     * Orb supports a few different pricing models out of the box. Each of these models is
     * serialized differently in a given [Price](../guides/concepts#plan-and-price) object. The
     * `model_type` field determines the key for the configuration object that is present. A
     * detailed explanation of price types can be found in the
     * [Price schema](../guides/concepts#plan-and-price).
     *
     * ## Phases
     *
     * Orb supports plan phases, also known as contract ramps. For plans with phases, the serialized
     * prices refer to all prices across all phases.
     */
    @JvmOverloads
    fun fetch(
        params: PlanFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Plan>
}
