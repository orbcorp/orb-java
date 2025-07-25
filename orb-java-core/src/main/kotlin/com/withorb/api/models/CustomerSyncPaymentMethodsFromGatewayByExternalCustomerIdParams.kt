// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Sync Orb's payment methods for the customer with their gateway.
 *
 * This method can be called before taking an action that may cause the customer to be charged,
 * ensuring that the most up-to-date payment method is charged.
 *
 * **Note**: This functionality is currently only available for Stripe.
 */
class CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
private constructor(
    private val externalCustomerId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun externalCustomerId(): Optional<String> = Optional.ofNullable(externalCustomerId)

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun none(): CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams =
            builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams]. */
    class Builder internal constructor() {

        private var externalCustomerId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            customerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams:
                CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
        ) = apply {
            externalCustomerId =
                customerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.externalCustomerId
            additionalHeaders =
                customerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams.additionalHeaders
                    .toBuilder()
            additionalQueryParams =
                customerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
                    .additionalQueryParams
                    .toBuilder()
            additionalBodyProperties =
                customerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams
                    .additionalBodyProperties
                    .toMutableMap()
        }

        fun externalCustomerId(externalCustomerId: String?) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /**
         * Alias for calling [Builder.externalCustomerId] with `externalCustomerId.orElse(null)`.
         */
        fun externalCustomerId(externalCustomerId: Optional<String>) =
            externalCustomerId(externalCustomerId.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of
         * [CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams =
            CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams(
                externalCustomerId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalCustomerId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams && externalCustomerId == other.externalCustomerId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalCustomerId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CustomerSyncPaymentMethodsFromGatewayByExternalCustomerIdParams{externalCustomerId=$externalCustomerId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
