# Getting Started
Restful Web Service with Spring Boot

### Reference Documentation

Spring Boot Application to handle employees from DB

### Run Spring Boot Application

You can run the application in two ways:

#### Using Maven
```bash
./mvnw spring-boot:run
```

#### Using Docker
1. Build the Docker image:
```bash
docker build -t payroll-app .
```

2. Run the container:
```bash
docker run -p 8080:8080 payroll-app
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
