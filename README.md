# learningspringboot
Project for learning Spring Boot

Base URL: http://localhost:8080/payments/1234

RequestParam examples:
http://localhost:8080/api/fetchUser?firstName=GoutHAm
http://localhost:8080/api/fetchUser?firstName=Gout%20HAm

PathVariable examples:
http://localhost:8080/api/fetchUser/GoutHAm
http://localhost:8080/api/fetchUser/Gout%20HAm

RequestBody example:

```sh
    curl --location --request POST 'http://localhost:8080/api/saveUser' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        "user_name": "Goutham",
        "email": "goutham12345@gmail.com"
    }'
```

ResponseEntity example:
http://localhost:8080/api/retrieveUser?firstName=GoutHAm


## Profile

#### Run the application with the default profile (usually no profile)
mvn spring-boot:run

### Passing value for `spring.profiles.active` during application startup itself
#### Run the application with a specific profile, e.g., 'prod'
##### This command overrides any profile set in application.properties
mvn spring-boot:run -Dspring-boot.run.profiles=prod

### Profiling using `pom.xml`
#### Run with the 'local' Maven profile (uses spring profile: dev)
mvn spring-boot:run -Plocal

#### Run with the 'stage' Maven profile (uses spring profile: qa)
mvn spring-boot:run -Pstage

#### Run with the 'production' Maven profile (uses spring profile: prod)
mvn spring-boot:run -Pproduction