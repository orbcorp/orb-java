# Orb Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.withorb.api/orb-java)](https://central.sonatype.com/artifact/com.withorb.api/orb-java/0.31.0)

<!-- x-release-please-end -->

The Orb Java SDK provides convenient access to the Orb REST API from applications written in Java.

The Orb Java SDK is similar to the Orb Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

The REST API documentation can be found on [docs.withorb.com](https://docs.withorb.com/reference/api-reference).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.withorb.api:orb-java:0.31.0")
```

### Maven

```xml
<dependency>
    <groupId>com.withorb.api</groupId>
    <artifactId>orb-java</artifactId>
    <version>0.31.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

### Configure the client

Use `OrbOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiKey()`:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;

OrbClient client = OrbOkHttpClient.builder()
    .apiKey("My API Key")
    .build();
```

Alternately, set the environment with `ORB_API_KEY` or `ORB_WEBHOOK_SECRET`, and use `OrbOkHttpClient.fromEnv()` to read from the environment.

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;

OrbClient client = OrbOkHttpClient.fromEnv();

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
OrbClient client = OrbOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build();
```

| Property      | Environment variable | Required | Default value |
| ------------- | -------------------- | -------- | ------------- |
| apiKey        | `ORB_API_KEY`        | true     | —             |
| webhookSecret | `ORB_WEBHOOK_SECRET` | false    | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new customer, first use the `CustomerCreateParams` builder to specify attributes, then pass that to the `create` method of the `customers` service.

```java
import com.withorb.api.models.Customer;
import com.withorb.api.models.CustomerCreateParams;

CustomerCreateParams params = CustomerCreateParams.builder()
    .email("example-customer@withorb.com")
    .name("My Customer")
    .build();
Customer customer = client.customers().create(params);
```

### Example: listing resources

The Orb API provides a `list` method to get a paginated list of coupons. You can retrieve the first page by:

```java
import com.withorb.api.models.Coupon;
import com.withorb.api.models.CouponListPage;

CouponListPage page = client.coupons().list();
for (Coupon coupon : page.data()) {
    System.out.println(coupon);
}
```

Use the `CouponListParams` builder to set parameters:

```java
import com.withorb.api.models.CouponListPage;
import com.withorb.api.models.CouponListParams;

CouponListParams params = CouponListParams.builder()
    .cursor("cursor")
    .limit(1L)
    .redemptionCode("redemption_code")
    .showArchived(true)
    .build();
CouponListPage page1 = client.coupons().list(params);

// Using the `from` method of the builder you can reuse previous params values:
CouponListPage page2 = client.coupons().list(CouponListParams.builder()
    .from(params)
    .nextCursor("abc123...")
    .build());

// Or easily get params for the next page by using the helper `getNextPageParams`:
CouponListPage page3 = client.coupons().list(params.getNextPageParams(page2));
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---

## Requests

### Parameters and bodies

To make a request to the Orb API, you generally build an instance of the appropriate `Params` class.

See [Undocumented request params](#undocumented-request-params) for how to send arbitrary parameters.

## Responses

### Response validation

When receiving a response, the Orb Java SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Java type. If you directly access the mistaken property, the SDK will throw an unchecked `OrbInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```java
import com.withorb.api.models.Customer;

Customer customer = client.customers().create().validate();
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```java
import com.withorb.api.core.JsonField;
import java.util.Optional;

JsonField field = responseObj._field();

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  Optional<String> jsonString = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  MyClass myObj = responseObj._field().asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```java
import com.withorb.api.core.JsonValue;

JsonValue secret = amountDiscount._additionalProperties().get("secret_field");
```

---

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

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`OrbException`** - Base exception for all exceptions

- **`OrbServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

  | 400    | BadRequestException           |
  | ------ | ----------------------------- |
  | 401    | AuthenticationException       |
  | 403    | PermissionDeniedException     |
  | 404    | NotFoundException             |
  | 422    | UnprocessableEntityException  |
  | 429    | RateLimitException            |
  | 5xx    | InternalServerException       |
  | others | UnexpectedStatusCodeException |

- **`OrbIoException`** - I/O networking errors
- **`OrbInvalidDataException`** - any other exceptions on the client side, e.g.:
  - We failed to serialize the request body
  - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default. You can provide a `maxRetries` on the client builder to configure this:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;

OrbClient client = OrbOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

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

Requests can be routed through a proxy. You can configure this on the client builder:

```java
import com.withorb.api.client.OrbClient;
import com.withorb.api.client.okhttp.OrbOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

OrbClient client = OrbOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 8080)))
    .build();
```

## Making custom/undocumented requests

This library is typed for convenient access to the documented API. If you need to access undocumented params or response properties, the library can still be used.

### Undocumented request params

In [Example: creating a resource](#example-creating-a-resource) above, we used the `CustomerCreateParams.builder()` to pass to the `create` method of the `customers` service.

Sometimes, the API may support other properties that are not yet supported in the Java SDK types. In that case, you can attach them using raw setters:

```java
import com.withorb.api.core.JsonValue;
import com.withorb.api.models.CustomerCreateParams;

CustomerCreateParams params = CustomerCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

You can also use the `putAdditionalProperty` method on nested headers, query params, or body objects.

### Undocumented response properties

To access undocumented response properties, you can use `res._additionalProperties()` on a response object to get a map of untyped fields of type `Map<String, JsonValue>`. You can then access fields like `res._additionalProperties().get("secret_prop").asString()` or use other helpers defined on the `JsonValue` class to extract it to a desired type.

## Logging

We use the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

You can enable logging by setting the environment variable `ORB_LOG` to `info`.

```sh
$ export ORB_LOG=info
```

Or to `debug` for more verbose logging.

```sh
$ export ORB_LOG=debug
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/orbcorp/orb-java/issues) with questions, bugs, or suggestions.
