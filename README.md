# E-Commerce Microservices Project

This is a backend **E-Commerce Microservices Architecture** project built using **Java 17, Spring Boot 3.5.0, Spring Cloud 2023.0.1 (Release Train), PostgreSQL**, and various Spring ecosystem components.

## Tech Stack

- **Java 17**
- **Spring Boot 3.5.0**
- **Spring Cloud 2023.0.1**
- **Spring Security, OAuth2, JWT**
- **PostgreSQL**
- **Eureka Discovery Server**
- **Spring Cloud Gateway (API Gateway)**
- **Docker (planned)**
- **Jenkins CI/CD (planned)**
- **JUnit, Mockito for testing**

## Microservices Included

- **API Gateway** — Routing and Authentication via JWT/OAuth2
- **Discovery Server (Eureka)** — Service Registration & Discovery
- **User Service** — User Management (PostgreSQL)
- **Auth Service** — Token Generation & Validation
- **Config Server** — Centralized configuration (planned)
- **Product, Order, Payment, Inventory Services** — (planned)
- **Logging, Notification, Report Services** — (planned)
- **CommonLib** — Shared DTOs/Utils across microservices

## Running Locally

1. Start **Discovery Server**.
2. Start **Config Server** (when available).
3. Start **User Service**.
4. Start **API Gateway**.
5. Access Eureka Dashboard: [http://localhost:8761](http://localhost:8761)
6. Access User Service via Gateway: [http://localhost:8081/api/users/hello](http://localhost:8081/api/users/hello)

## Prerequisites

- Java 17+
- Maven
- PostgreSQL 17 (Password: `pgAdmin`)
- IntelliJ IDEA / VS Code
- Docker (planned)
- Jenkins (planned)

## To-Do

- Dockerize each microservice
- Setup CI/CD pipelines via Jenkins
- Implement Config Server
- Add Payment Gateway Integration
- Enable central logging with ELK/Grafana
- React + Redux Frontend (future)

## Author

[Sachin Kumar](https://github.com/sachin-kumar-09)

