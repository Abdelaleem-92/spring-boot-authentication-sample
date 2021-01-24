# CALLSIGN Authentication Application

this is Java spring that presents one API for authentication, 

## Technologies
Project is created with:
* JAvA - Spring Boot framework - spring boot security.
* JWT library


## Installation 

* build docker image
```bash
 docker build -t springBootExample.jar .
``` 

run docker container 
```bash
docker run -p 8080:8080 springBootExample.jar
``` 

## API documentation

```bash
http://192.168.99.100:8080/swagger-ui.html
http://192.168.99.100:8080/v2/api-docs
``` 

## USAGE
* to get the valid JWT, first we call authenticate api with Method Post.
* then use the JWT to access applications APIs.

```bash
http://192.168.99.100:8080/authenticate

sample Request :
{
	"username":"callsign",
	"password":"callsign"
}

{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjYWxsc2lnbiIsImV4cCI6MTYxMDA5ODYyMCwiaWF0IjoxNjEwMDEyMjIwfQ.Df3cDWIU9zHPoREuY5IEo7Pjs5OS8vuLmDjH9Ir1LgbmtQbpcXic0BF7qMQ8LiCi9fYuDhNvQP9AA4Mky_D6Qw"
}
``` 