# Getting Started
Restful Web Service with Spring Boot, 

### Reference Documentation

Spring Boot Application to handle employess from DB

### Run Spring Boot Application

```bash
  ./mvnw spring-boot:run  
```

### Use Cases

### GET/employess
```bash
  curl -v  localhost:8080/employees 
```

### POST/employes
```bash
  curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'
```
