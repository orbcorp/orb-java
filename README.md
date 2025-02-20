# Orb Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.withorb.api/orb-java)](https://central.sonatype.com/artifact/com.withorb.api/orb-java/0.32.0)

<!-- x-release-please-end -->

The Orb Java SDK provides convenient access to the Orb REST API from applications written in Java.

The Orb Java SDK is similar to the Orb Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

The REST API documentation can be found on [docs.withorb.com](https://docs.withorb.com/reference/api-reference).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.withorb.api:orb-java:0.32.0")
```

### Maven

```xml
<dependency>
    <groupId>com.withorb.api</groupId>
    <artifactId>orb-java</artifactId>
    <version>0.32.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;
import com.withorb.api.models.Customer;
import com.withorb.api.models.CustomerCreateParams;

// Configures using the `ORB_API_KEY` and `ORB_WEBHOOK_SECRET` environment variables
OrbClient client = OrbOkHttpClient.fromEnv();

CustomerCreateParams params = CustomerCreateParams.builder()
    .email("example-customer@withorb.com")
    .name("My Customer")
    .build();
Customer customer = client.customers().create(params);
```

## Client configuration

Configure the client using environment variables:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;

// Configures using the `ORB_API_KEY` and `ORB_WEBHOOK_SECRET` environment variables
OrbClient client = OrbOkHttpClient.fromEnv();
```

Or manually:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;

OrbClient client = OrbOkHttpClient.builder()
    .apiKey("My API Key")
    .build();
```

Or using a combination of the two approaches:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;

OrbClient client = OrbOkHttpClient.builder()
    // Configures using the `ORB_API_KEY` and `ORB_WEBHOOK_SECRET` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build();
```

See this table for the available options:

| Setter          | Environment variable | Required | Default value |
| --------------- | -------------------- | -------- | ------------- |
| `apiKey`        | `ORB_API_KEY`        | true     | -             |
| `webhookSecret` | `ORB_WEBHOOK_SECRET` | false    | -             |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the Orb API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.customers().create(...)` should be called with an instance of `CustomerCreateParams`, and it will return an instance of `Customer`.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;
import com.withorb.api.models.Customer;
import com.withorb.api.models.CustomerCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `ORB_API_KEY` and `ORB_WEBHOOK_SECRET` environment variables
OrbClient client = OrbOkHttpClient.fromEnv();

CustomerCreateParams params = CustomerCreateParams.builder()
    .email("example-customer@withorb.com")
    .name("My Customer")
    .build();
CompletableFuture<Customer> customer = client.async().customers().create(params);
```

Or create an asynchronous client from the beginning:

```java
import com.withorb.api.client.OrbClientAsync;
import com.withorb.api.client.okhttp.OrbOkHttpClientAsync;
import com.withorb.api.models.Customer;
import com.withorb.api.models.CustomerCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `ORB_API_KEY` and `ORB_WEBHOOK_SECRET` environment variables
OrbClientAsync client = OrbOkHttpClientAsync.fromEnv();

CustomerCreateParams params = CustomerCreateParams.builder()
    .email("example-customer@withorb.com")
    .name("My Customer")
    .build();
CompletableFuture<Customer> customer = client.customers().create(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Error handling

The SDK throws custom unchecked exception types:

- `OrbServiceException`: Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                       |
  | ------ | ------------------------------- |
  | 400    | `BadRequestException`           |
  | 401    | `AuthenticationException`       |
  | 403    | `PermissionDeniedException`     |
  | 404    | `NotFoundException`             |
  | 422    | `UnprocessableEntityException`  |
  | 429    | `RateLimitException`            |
  | 5xx    | `InternalServerException`       |
  | others | `UnexpectedStatusCodeException` |

- `OrbIoException`: I/O networking errors.

- `OrbInvalidDataException`: Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- `OrbException`: Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`, which automatically handles fetching more pages for you:

### Synchronous

```java
import com.withorb.api.models.Coupon;
import com.withorb.api.models.CouponListPage;

// As an Iterable:
CouponListPage page = client.coupons().list(params);
for (Coupon coupon : page.autoPager()) {
    System.out.println(coupon);
};

// As a Stream:
client.coupons().list(params).autoPager().stream()
    .limit(50)
    .forEach(coupon -> System.out.println(coupon));
```

### Asynchronous

```java
// Using forEach, which returns CompletableFuture<Void>:
asyncClient.coupons().list(params).autoPager()
    .forEach(coupon -> System.out.println(coupon), executor);
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one. A page of results has a `data()` method to fetch the list of objects, as well as top-level `response` and other methods to fetch top-level data about the page. It also has methods `hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
import com.withorb.api.models.Coupon;
import com.withorb.api.models.CouponListPage;

CouponListPage page = client.coupons().list(params);
while (page != null) {
    for (Coupon coupon : page.data()) {
        System.out.println(coupon);
    }

    page = page.getNextPage().orElse(null);
}
```

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `ORB_LOG` environment variable to `info`:

```sh
$ export ORB_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export ORB_LOG=debug
```

## Webhook Verification

We provide helper methods for verifying that a webhook request came from Orb, and not a malicious third party.

You can use `orb.webhooks().verifySignature(body, headers, secret?)` or `orb.webhooks().unwrap(body, headers, secret?)`,
both of which will raise an error if the signature is invalid.

Note that the `body` parameter must be the raw JSON string sent from the server (do not parse it first).
The `.unwrap()` method can parse this JSON for you.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;

OrbClient client = OrbOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import com.withorb.api.models.Customer;
import com.withorb.api.models.CustomerCreateParams;

Customer customer = client.customers().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;
import java.time.Duration;

OrbClient client = OrbOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

OrbClient client = OrbOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.withorb.api.core.JsonValue;
import com.withorb.api.models.CustomerCreateParams;

CustomerCreateParams params = CustomerCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods. You can also set undocumented parameters on nested headers, query params, or body classes using the `putAdditionalProperty` method. These properties can be accessed on the built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a `JsonValue` object to its setter:

```java
import com.withorb.api.core.JsonValue;
import com.withorb.api.models.CustomerCreateParams;

CustomerCreateParams params = CustomerCreateParams.builder()
    .email(JsonValue.from(42))
    .name("My Customer")
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import com.withorb.api.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.customers().create(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import com.withorb.api.core.JsonField;
import java.util.Optional;

JsonField<String> email = client.customers().create(params)._email();

if (email.isMissing()) {
  // The property is absent from the JSON response
} else if (email.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = email.asString();

  // Try to deserialize into a custom type
  MyClass myObject = email.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw `OrbInvalidDataException` only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.withorb.api.models.Customer;

Customer customer = client.customers().create(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.withorb.api.models.Customer;
import com.withorb.api.models.CustomerCreateParams;

Customer customer = client.customers().create(
  params, RequestOptions.builder().responseValidation(true).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;

OrbClient client = OrbOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/orbcorp/orb-java/issues) with questions, bugs, or suggestions.
