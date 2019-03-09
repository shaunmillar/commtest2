## Communication test application w/ Basic Authentication

Provides simple feedback as a Spring Boot application

# endpoint
```
    http://[server]:[port]/commtest/ping
```

# Basic Auth required

    u:admin
    p:password 

    Otherwise 401 Unauthorized error. 

# response

```
    { "pong":1 }
```
# notes: 

- Current port is 8080. Change at application.properties if required.

