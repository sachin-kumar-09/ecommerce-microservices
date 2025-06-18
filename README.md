🛒 E-Commerce Microservices Project
A cloud-ready, scalable E-Commerce platform built using Spring Boot Microservices Architecture.

📦 Technology Stack
Layer	Technologies Used
Backend	Java 21, Spring Boot 3.5, Spring Cloud 2023.0.1, Spring Security, Spring Data JPA, Hibernate, Lombok
Microservices	Eureka Discovery Server, Spring Cloud API Gateway, Config Server, Auth Service, User Service, Product Service, Order Service, Payment Service, Inventory Service, Address Service, Recommendation Service, Notification Service, Logging Service, Report Service, CommonLib
Database	PostgreSQL
Messaging	RabbitMQ, Kafka (future planned)
DevOps	Docker, Jenkins (CI/CD - planned)
Testing	JUnit 5, Mockito
Build Tool	Maven

🗂️ Modules Overview
Service	Description	Port
Discovery Server	Eureka Service Registry	8761
API Gateway	Entry point to microservices, routing, security	8081
Config Server	Centralized configuration management	TBD
Auth Service	Authentication, JWT/OAuth2	TBD
User Service	User management (CRUD)	9001
Product Service	Product catalog service	TBD
Order Service	Order placement, history	TBD
Payment Service	Payment processing	TBD
Inventory Service	Inventory tracking	TBD
Address Service	User address management	TBD
Recommendation Service	Product recommendations (AI planned)	TBD
Notification Service	Email/SMS/Push notifications	TBD
Logging Service	Centralized logging	TBD
Report Service	Business reports	TBD
CommonLib	Shared DTOs, utilities	NA

🚀 How to Run Locally
Pre-requisites:

Java 21

Maven 3.8+

PostgreSQL 17 (Configured with username: postgres, password: pgAdmin)

Eureka Server must be up (DiscoveryServerApplication.java)

Run services in order:

bash
Copy
Edit
1. Discovery Server (port 8761)
2. Config Server (TBD)
3. API Gateway (port 8081)
4. User Service (port 9001)
5. Other services as required
   Access Eureka Dashboard:

arduino
Copy
Edit
http://localhost:8761/
Test API via Gateway (Example):

bash
Copy
Edit
http://localhost:8081/api/users/hello
🏗️ CI/CD Pipeline (Planned via Jenkins)
Build & Test: Maven Build + Unit Tests

Dockerize: Containerize services

Deploy: Multi-container orchestration via Docker Compose / Kubernetes

Monitor: Spring Boot Actuator + Prometheus + Grafana (planned)

📌 Project Status
✔️ Eureka Discovery Working
✔️ API Gateway Working
✔️ User Service Configured
⏳ Other Services: Development in progress
⏳ CI/CD via Jenkins: Planned

👨‍💻 Author
Sachin Kumar
GitHub