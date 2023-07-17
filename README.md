# LegalEase Backend

This project is an api backend to supply a list of LegalBase's firm ranking data in json format.

Built using Java spring boot with a h2 database configuration incorporating Hibernate JPA.

I would improve the code by passing of properties used within the app (e.g security api token, db users and passwords) using a vault or
environment variables that are pulled in at runtime.

Some of the classes could have been extended with a common Abstract class.

I would also improve upon by expanding the unit tests.

I would also implement OpenAPI Swagger deinitions to document the api.

## Running
Starting the backend:

```mvn clean install```

```mvn spring-boot:run```

### Testing a valid URL

Run the following command in a separate command window or in Postman 
with <regionId> integer value other than ```170``` and valid api-key: ```legalbase-api-key-321```:

```curl --location --request GET 'http://localhost:8080/api/v1/firm-rankings/find-by-region-id/100' --header 'X-API-KEY: legalbase-api-key-321'```
#### Output
Should get a JSON response message with content

### Testing an invalid URL
Run the following command in a separate command window or in Postman
with <regionId> integer value ```170``` and with a valid api-key: ```legalbase-api-key-321```:

```curl --location --request GET 'http://localhost:8080/api/v1/firm-rankings/find-by-region-id/170' --header 'X-API-KEY: legalbase-api-key-321'```

#### Output
Should get no JSON response back on the command prompt but the http response status will be ```400 Bad Request```

### Testing an invalid Api Key
Run the following command in a separate command window or in Postman
with <regionId> integer value other than ```170``` and with an invalid api-key: ```legalbase-api-key-3214```:

```curl --location --request GET 'http://localhost:8080/api/v1/firm-rankings/find-by-region-id/100' --header 'X-API-KEY: legalbase-api-key-3214'```

#### Output
Should get the message: ```Invalid API Key```
