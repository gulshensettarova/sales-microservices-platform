# Sales Microservices Platform

---

## Project Overview

This project is aimed at building a small-scale microservices platform for managing sales transactions and customer data. The platform will consist of two services: **Customer Service** and **Order Service**. The services will communicate via HTTP using **Feign Client**, and data will be stored in a PostgreSQL database. **Liquibase** will be used to manage database schema changes. The project will follow the **Git Flow** development process.

---

## Features

- **Customer Service**:
  - Register new customers.
  - Retrieve customer details by ID.
  
- **Order Service**:
  - Create new orders for customers.
  - Retrieve order details by ID.
  - Validate customer details by communicating with Customer Service using Feign Client.

- **Database Management**:
  - Use PostgreSQL as the database for both services.
  - Database schema management via **Liquibase**.

- **Service Communication**:
  - **Feign Client** for communication between **Order Service** and **Customer Service**.

- **Version Control**:
  - Git Flow will be used for managing development, testing, and production branches.

---

## Technical Specifications

### Microservices

1. **Customer Service**:
   - Endpoints:
     - `POST /customers`: Register a new customer.
     - `GET /customers/{id}`: Retrieve customer details by ID.
   - Uses PostgreSQL to store customer data.
   
2. **Order Service**:
   - Endpoints:
     - `POST /orders`: Create a new order for a customer.
     - `GET /orders/{id}`: Retrieve order details by ID.
   - Uses PostgreSQL to store order data.
   - Uses Feign Client to communicate with **Customer Service** for customer data validation.

### Database

- **PostgreSQL** for both services.
- **Liquibase** for database schema management.

### Service Communication

- **Feign Client** for inter-service communication.

### Git Flow

- **develop**: Active development branch.
- **preprod**: Staging branch for testing.
- **prod**: Production branch.

---

## Non-Functional Requirements

- **Performance**: API response time should be under 200ms.
- **Security**: JWT-based authentication (optional for further enhancement).
- **Scalability**: Microservices should be able to scale horizontally.
- **Reliability**: 99.9% uptime for both services.
- **Test Coverage**: At least 80% test coverage.
- **Logging**: Basic logging for service operations.

---

## Tech Stack

- **Programming Language**: Java
- **Frameworks**: Spring Boot, Spring Cloud (for Feign Client)
- **Database**: PostgreSQL
- **Database Migration**: Liquibase
- **Version Control**: Git Flow
- **Service Communication**: Feign Client

---

