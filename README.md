# Orb Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.withorb.api/orb-java)](https://central.sonatype.com/artifact/com.withorb.api/orb-java/1.9.0)

<!-- x-release-please-end -->

The Orb Java SDK provides convenient access to the [Orb REST API](https://docs.withorb.com/reference/api-reference) from applications written in Java.

The Orb Java SDK is similar to the Orb Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

The REST API documentation can be found on [docs.withorb.com](https://docs.withorb.com/reference/api-reference).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.withorb.api:orb-java:1.9.0")
```

### Maven

```xml
<dependency>
  <groupId>com.withorb.api</groupId>
  <artifactId>orb-java</artifactId>
  <version>1.9.0</version>
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

// Configures using the `orb.apiKey`, `orb.webhookSecret` and `orb.baseUrl` system properties
// Or configures using the `ORB_API_KEY`, `ORB_WEBHOOK_SECRET` and `ORB_BASE_URL` environment variables
OrbClient client = OrbOkHttpClient.fromEnv();

CustomerCreateParams params = CustomerCreateParams.builder()
    .email("example-customer@withorb.com")
    .name("My Customer")
    .build();
Customer customer = client.customers().create(params);
```

## Client configuration

Configure the client using system properties or environment variables:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;

// Configures using the `orb.apiKey`, `orb.webhookSecret` and `orb.baseUrl` system properties
// Or configures using the `ORB_API_KEY`, `ORB_WEBHOOK_SECRET` and `ORB_BASE_URL` environment variables
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
    // Configures using the `orb.apiKey`, `orb.webhookSecret` and `orb.baseUrl` system properties
    // Or configures using the `ORB_API_KEY`, `ORB_WEBHOOK_SECRET` and `ORB_BASE_URL` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build();
```

See this table for the available options:

| Setter          | System property     | Environment variable | Required | Default value                  |
| --------------- | ------------------- | -------------------- | -------- | ------------------------------ |
| `apiKey`        | `orb.apiKey`        | `ORB_API_KEY`        | true     | -                              |
| `webhookSecret` | `orb.webhookSecret` | `ORB_WEBHOOK_SECRET` | false    | -                              |
| `baseUrl`       | `orb.baseUrl`       | `ORB_BASE_URL`       | true     | `"https://api.withorb.com/v1"` |

System properties take precedence over environment variables.

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```java
import com.withorb.api.client.OrbClient;

OrbClient clientWithOptions = client.withOptions(optionsBuilder -> {
    optionsBuilder.baseUrl("https://example.com");
    optionsBuilder.maxRetries(42);
});
```

The `withOptions()` method does not affect the original client or service.

## Requests and responses

To send a request to the Orb API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.customers().create(...)` should be called with an instance of `CustomerCreateParams`, and it will return an instance of `Customer`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;
import com.withorb.api.models.Customer;
import com.withorb.api.models.CustomerCreateParams;
import java.util.concurrent.CompletableFuture;

// Configures using the `orb.apiKey`, `orb.webhookSecret` and `orb.baseUrl` system properties
// Or configures using the `ORB_API_KEY`, `ORB_WEBHOOK_SECRET` and `ORB_BASE_URL` environment variables
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

// Configures using the `orb.apiKey`, `orb.webhookSecret` and `orb.baseUrl` system properties
// Or configures using the `ORB_API_KEY`, `ORB_WEBHOOK_SECRET` and `ORB_BASE_URL` environment variables
OrbClientAsync client = OrbOkHttpClientAsync.fromEnv();

CustomerCreateParams params = CustomerCreateParams.builder()
    .email("example-customer@withorb.com")
    .name("My Customer")
    .build();
CompletableFuture<Customer> customer = client.customers().create(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import com.withorb.api.core.http.Headers;
import com.withorb.api.core.http.HttpResponseFor;
import com.withorb.api.models.Customer;
import com.withorb.api.models.CustomerCreateParams;

CustomerCreateParams params = CustomerCreateParams.builder()
    .email("example-customer@withorb.com")
    .name("My Customer")
    .build();
HttpResponseFor<Customer> customer = client.customers().withRawResponse().create(params);

int statusCode = customer.statusCode();
Headers headers = customer.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import com.withorb.api.models.Customer;

Customer parsedCustomer = customer.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`OrbServiceException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/OrbServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                |
  | ------ | ------------------------------------------------------------------------------------------------------------------------ |
  | 400    | [`BadRequestException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/UnexpectedStatusCodeException.kt) |

- [`OrbIoException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/OrbIoException.kt): I/O networking errors.

- [`OrbInvalidDataException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/OrbInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`OrbException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/OrbException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Pagination

The SDK defines methods that return a paginated lists of results. It provides convenient ways to access the results either one page at a time or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, use the `autoPager()` method, which automatically fetches more pages as needed.

When using the synchronous client, the method returns an [`Iterable`](https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html)

```java
import com.withorb.api.models.Coupon;
import com.withorb.api.models.CouponListPage;

CouponListPage page = client.coupons().list();

// Process as an Iterable
for (Coupon coupon : page.autoPager()) {
    System.out.println(coupon);
}

// Process as a Stream
page.autoPager()
    .stream()
    .limit(50)
    .forEach(coupon -> System.out.println(coupon));
```

When using the asynchronous client, the method returns an [`AsyncStreamResponse`](orb-java-core/src/main/kotlin/com/withorb/api/core/http/AsyncStreamResponse.kt):

```java
import com.withorb.api.core.http.AsyncStreamResponse;
import com.withorb.api.models.Coupon;
import com.withorb.api.models.CouponListPageAsync;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

CompletableFuture<CouponListPageAsync> pageFuture = client.async().coupons().list();

pageFuture.thenRun(page -> page.autoPager().subscribe(coupon -> {
    System.out.println(coupon);
}));

// If you need to handle errors or completion of the stream
pageFuture.thenRun(page -> page.autoPager().subscribe(new AsyncStreamResponse.Handler<>() {
    @Override
    public void onNext(Coupon coupon) {
        System.out.println(coupon);
    }

    @Override
    public void onComplete(Optional<Throwable> error) {
        if (error.isPresent()) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(error.get());
        } else {
            System.out.println("No more!");
        }
    }
}));

// Or use futures
pageFuture.thenRun(page -> page.autoPager()
    .subscribe(coupon -> {
        System.out.println(coupon);
    })
    .onCompleteFuture()
    .whenComplete((unused, error) -> {
        if (error != null) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(error);
        } else {
            System.out.println("No more!");
        }
    }));
```

### Manual pagination

To access individual page items and manually request the next page, use the `items()`,
`hasNextPage()`, and `nextPage()` methods:

```java
import com.withorb.api.models.Coupon;
import com.withorb.api.models.CouponListPage;

CouponListPage page = client.coupons().list();
while (true) {
    for (Coupon coupon : page.items()) {
        System.out.println(coupon);
    }

    if (!page.hasNextPage()) {
        break;
    }

    page = page.nextPage();
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

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`OrbOkHttpClient`](orb-java-client-okhttp/src/main/kotlin/com/withorb/api/client/okhttp/OrbOkHttpClient.kt) or [`OrbOkHttpClientAsync`](orb-java-client-okhttp/src/main/kotlin/com/withorb/api/client/okhttp/OrbOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff between requests.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a request.

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

### HTTPS

> [!NOTE]
> Most applications should not call these methods, and instead use the system defaults. The defaults include
> special optimizations that can be lost if the implementations are modified.

To configure how HTTPS connections are secured, configure the client using the `sslSocketFactory`, `trustManager`, and `hostnameVerifier` methods:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;

OrbClient client = OrbOkHttpClient.builder()
    .fromEnv()
    // If `sslSocketFactory` is set, then `trustManager` must be set, and vice versa.
    .sslSocketFactory(yourSSLSocketFactory)
    .trustManager(yourTrustManager)
    .hostnameVerifier(yourHostnameVerifier)
    .build();
```

### Custom HTTP client

The SDK consists of three artifacts:

- `orb-java-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`OrbClient`](orb-java-core/src/main/kotlin/com/withorb/api/client/OrbClient.kt), [`OrbClientAsync`](orb-java-core/src/main/kotlin/com/withorb/api/client/OrbClientAsync.kt), [`OrbClientImpl`](orb-java-core/src/main/kotlin/com/withorb/api/client/OrbClientImpl.kt), and [`OrbClientAsyncImpl`](orb-java-core/src/main/kotlin/com/withorb/api/client/OrbClientAsyncImpl.kt), all of which can work with any HTTP client
- `orb-java-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`OrbOkHttpClient`](orb-java-client-okhttp/src/main/kotlin/com/withorb/api/client/okhttp/OrbOkHttpClient.kt) and [`OrbOkHttpClientAsync`](orb-java-client-okhttp/src/main/kotlin/com/withorb/api/client/okhttp/OrbOkHttpClientAsync.kt), which provide a way to construct [`OrbClientImpl`](orb-java-core/src/main/kotlin/com/withorb/api/client/OrbClientImpl.kt) and [`OrbClientAsyncImpl`](orb-java-core/src/main/kotlin/com/withorb/api/client/OrbClientAsyncImpl.kt), respectively, using OkHttp
- `orb-java`
  - Depends on and exposes the APIs of both `orb-java-core` and `orb-java-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`orb-java` dependency](#installation) with `orb-java-core`
2. Copy `orb-java-client-okhttp`'s [`OkHttpClient`](orb-java-client-okhttp/src/main/kotlin/com/withorb/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`OrbClientImpl`](orb-java-core/src/main/kotlin/com/withorb/api/client/OrbClientImpl.kt) or [`OrbClientAsyncImpl`](orb-java-core/src/main/kotlin/com/withorb/api/client/OrbClientAsyncImpl.kt), similarly to [`OrbOkHttpClient`](orb-java-client-okhttp/src/main/kotlin/com/withorb/api/client/okhttp/OrbOkHttpClient.kt) or [`OrbOkHttpClientAsync`](orb-java-client-okhttp/src/main/kotlin/com/withorb/api/client/okhttp/OrbOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`orb-java` dependency](#installation) with `orb-java-core`
2. Write a class that implements the [`HttpClient`](orb-java-core/src/main/kotlin/com/withorb/api/core/http/HttpClient.kt) interface
3. Construct [`OrbClientImpl`](orb-java-core/src/main/kotlin/com/withorb/api/client/OrbClientImpl.kt) or [`OrbClientAsyncImpl`](orb-java-core/src/main/kotlin/com/withorb/api/client/OrbClientAsyncImpl.kt), similarly to [`OrbOkHttpClient`](orb-java-client-okhttp/src/main/kotlin/com/withorb/api/client/okhttp/OrbOkHttpClient.kt) or [`OrbOkHttpClientAsync`](orb-java-client-okhttp/src/main/kotlin/com/withorb/api/client/okhttp/OrbOkHttpClientAsync.kt), using your new client class

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

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set undocumented parameters on _nested_ headers, query params, or body classes, call the `putAdditionalProperty` method on the nested class:

```java
import com.withorb.api.core.JsonValue;
import com.withorb.api.models.AddressInput;
import com.withorb.api.models.CustomerCreateParams;

CustomerCreateParams params = CustomerCreateParams.builder()
    .billingAddress(AddressInput.builder()
        .putAdditionalProperty("secretProperty", JsonValue.from("42"))
        .build())
    .build();
```

These properties can be accessed on the nested built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](orb-java-core/src/main/kotlin/com/withorb/api/core/Values.kt) object to its setter:

```java
import com.withorb.api.core.JsonValue;
import com.withorb.api.models.CustomerCreateParams;

CustomerCreateParams params = CustomerCreateParams.builder()
    .email(JsonValue.from(42))
    .name("My Customer")
    .build();
```

The most straightforward way to create a [`JsonValue`](orb-java-core/src/main/kotlin/com/withorb/api/core/Values.kt) is using its `from(...)` method:

```java
import com.withorb.api.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](orb-java-core/src/main/kotlin/com/withorb/api/core/Values.kt):

```java
import com.withorb.api.core.JsonMissing;
import com.withorb.api.models.CustomerCreateParams;

CustomerCreateParams params = CustomerCreateParams.builder()
    .name("x")
    .email(JsonMissing.of())
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

By default, the SDK will not throw an exception in this case. It will throw [`OrbInvalidDataException`](orb-java-core/src/main/kotlin/com/withorb/api/errors/OrbInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.withorb.api.models.Customer;

Customer customer = client.customers().create(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.withorb.api.models.Customer;

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

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/orbcorp/orb-java/issues) with questions, bugs, or suggestions.
