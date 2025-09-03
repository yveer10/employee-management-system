# Employee Management System (Spring Boot)

## 📌 Overview
A simple Employee Management System built using **Spring Boot, Spring Data JPA, Hibernate, and MySQL**.  
It provides REST APIs for employee CRUD operations, validation, exception handling, and API documentation with Swagger.

## 🚀 Features
- Create, Read, Update, Delete employees
- Input validation with `@Valid`
- Global exception handling (`@RestControllerAdvice`)
- Swagger UI for API documentation
- JUnit & Mockito tests for service layer

## 🏗️ Architecture
The project follows a **3-layered architecture**:
- **Controller** – Handles REST endpoints  
- **Service** – Business logic  
- **Repository** – Database interaction via JPA  

![Architecture Diagram](
       +-------------+
       |   Client    |
       +-------------+
              |
              v
   +----------------------+
   | EmployeeController   |  <-- REST APIs
   +----------------------+
              |
              v
   +----------------------+
   | EmployeeService      |  <-- Business Logic
   +----------------------+
              |
              v
   +----------------------+
   | EmployeeRepository   |  <-- JPA Repository
   +----------------------+
              |
              v
        +-----------+
        |  MySQL DB |
        +-----------+


## 🛠️ Tech Stack
- Java 17
- Spring Boot 3
- Spring Data JPA (Hibernate)
- MySQL (Clever Cloud)
- Swagger / OpenAPI
- JUnit 5 + Mockito

## ▶️ How to Run
1. Clone the repo:
   ```bash
   git clone https://github.com/yveer10/employee-management-system.git
   cd employee-management-system
