
# Urbi Challenge

## Problem

Expose a REST API for retrieving vehicles

## Video

attach URL here

### URL

Here there is a cURL call to the implemented webservice

```
curl --location --request GET 'http://localhost:8080/vehicles?lat=45.4486&lon=9.1204605&radius=100'
```

## Technology

This project was made with Java 8 with the Spring Boot framework and Maven

## How to run the application (standalone)

1. Make sure you have Java 8 installed and properly configured
2. Run the following command
```
git clone https://github.com/netlopa/urbichallenge.git
```
3. Inside the created folder you need to run 
```
mvn spring-boot:run
```

## How to run the application with Docker

1. Make sure you have Java 8 installed and properly configured and clone the project
2. First of all you need to create the JAR package of the application: you need to go in the main folder of the project that you cloned and then execute this command
```
./mvnw package
```
3. Now, you need to create the Docker image, using this command
```
docker build -t netlopa/urbichallenge .
```
4. If you want to run the Docker image, run this command
```
docker run -p 8080:8080 -t netlopa/urbichallenge
```



