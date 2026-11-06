# Inventory Management System

A web-based Inventory Management System developed using Java, Spring Boot, MySQL, HTML, CSS, and JavaScript. This application helps manage products, monitor stock levels, and organize inventory through a responsive web interface.

## Features

- **User Authentication:** User registration, login, and logout.
- **Dashboard:** Displays total products, total stock, low-stock items, and out-of-stock items.
- **Product Management:** Add, view, update, and delete products.
- **Category Management:** Organize products by category.
- **Search and Filtering:** Search products and filter by category.
- **Image Upload:** Upload and manage product images.
- **Pagination:** Navigate product records across multiple pages.
- **Sorting:** Organize product records.
- **Responsive Design:** Supports desktop and mobile screens.
- **Validation and Error Handling:** Handles invalid inputs and application errors.

## Technology Stack

| Technology | Purpose |
|---|---|
| Java | Backend programming |
| Spring Boot | Backend framework |
| Spring Data JPA | Database operations |
| MySQL / MariaDB | Database |
| HTML5 | Frontend structure |
| CSS3 | Styling and responsive design |
| JavaScript | Frontend functionality |
| Maven | Dependency management |
| Git and GitHub | Version control |

## Project Structure

```text
inventory-management-springboot/
├── src/
│   └── main/
│       ├── java/com/pradip/inventory/
│       │   ├── controller/
│       │   ├── entity/
│       │   ├── exception/
│       │   ├── repository/
│       │   ├── service/
│       │   ├── ImageConfig.java
│       │   ├── LoginRequest.java
│       │   └── InventoryManagementApplication.java
│       └── resources/
│           ├── static/
│           │   ├── index.html
│           │   ├── login.html
│           │   └── register.html
│           └── application.properties
├── uploads/
├── pom.xml
└── .gitignore
```

## Prerequisites

- Java version supported by the project
- MySQL or MariaDB
- IntelliJ IDEA or another Java IDE
- Maven

## Database Setup

1. Start your MySQL or MariaDB server.
2. Create the database:

```sql
CREATE DATABASE inventory_db;
```

3. Open `src/main/resources/application.properties`.
4. Configure your local database connection.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=YOUR_DATABASE_USERNAME
spring.datasource.password=YOUR_DATABASE_PASSWORD
```

Replace the example credentials with your local database credentials. Never publish your real password or other secrets.

## Run the Application

1. Clone the repository:

```bash
git clone https://github.com/Pradipga/inventory-management-springboot.git
```

2. Open the project in IntelliJ IDEA.
3. Configure the database connection.
4. Allow Maven to download dependencies.
5. Run `InventoryManagementApplication.java`.
6. Open your browser:

```text
http://localhost:8080
```

## Learning Outcomes

- Java and Spring Boot application development.
- REST API development.
- Database integration using Spring Data JPA.
- CRUD operations.
- Image upload handling.
- Frontend and backend integration.
- Form validation and exception handling.
- Git and GitHub version control.

## Author

**Pradip Gawade**

GitHub: [Pradipga](https://github.com/Pradipga)

## Repository

[Inventory Management System](https://github.com/Pradipga/inventory-management-springboot)
