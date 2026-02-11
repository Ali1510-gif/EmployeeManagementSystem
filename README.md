# 📌 Employee Management System

A Spring Boot + JDBC + MySQL based console application that performs full CRUD (Create, Read, Update, Delete) operations on Employee records.

This project demonstrates proper layered architecture using Service, Repository, and Runner layers.

---

## 🚀 Tech Stack

- Java 21
- Spring Boot
- JDBC Template
- MySQL
- Maven

---

## 📂 Project Structure

```
EmployeeManagementSystem
│
├── src/main/java/in/rayeesali
│   ├── EmployeeManagementSystem.java
│   │
│   ├── modal
│   │   └── Employee.java
│   │
│   ├── repository
│   │   ├── EmployeeRepository.java
│   │   └── EmployeeRowMapper.java
│   │
│   ├── service
│   │   └── EmployeeService.java
│   │
│   └── runner
│       └── EmployeeRunner.java
│
├── src/main/resources
│   └── application.properties
│
└── pom.xml
```

---

## 🛠 Features

- Create Employee
- View All Employees
- Find Employee by ID
- Update Employee
- Delete Employee
- Layered Architecture
- MySQL Database Integration using JdbcTemplate

---

## 🗄 Database Setup

Run the following SQL commands in MySQL:

```sql
CREATE DATABASE compdb;
USE compdb;

CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    dept VARCHAR(50),
    sal INT
);
```

---

## ⚙ Configuration

Update your `application.properties` file:

```properties
spring.application.name=EmployeeManagementSystem

spring.datasource.url=jdbc:mysql://localhost:3306/compdb
spring.datasource.username=root
spring.datasource.password=your_password
```

---

## ▶ How to Run

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/EmployeeManagementSystem.git
```

### 2️⃣ Navigate to Project Folder

```bash
cd EmployeeManagementSystem
```

### 3️⃣ Run Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run `EmployeeManagementSystem.java` from your IDE.

---

## 🧠 Concepts Used

- Spring Boot Auto Configuration
- Dependency Injection
- JdbcTemplate
- RowMapper
- Exception Handling
- Layered Architecture
- CRUD Operations

---

## 🔮 Future Improvements

- Convert to REST API
- Add Validation
- Add Logging
- Implement Spring Data JPA
- Add Pagination
- Add Global Exception Handling

---

## 👨‍💻 Author

Rayees Ali  
B.Tech CSE | Java Developer | Spring Boot 
Focused on Backend Development & Clean Architecture
