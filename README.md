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