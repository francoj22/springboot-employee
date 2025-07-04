# Getting Started
Restful Web Service with Spring Boot, 

### Reference Documentation

Spring Boot Application to handle employess from DB

### Run Spring Boot Application

```bash
  ./mvnw spring-boot:run  
```

### Use Cases

### GET/employees
```bash
  curl -v  localhost:8080/employees 
```

### POST/employees
```bash
  curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'
```

### GET/employees/{id}
```bash
  curl -v localhost:8080/employess/1
```
# neobank-backend
