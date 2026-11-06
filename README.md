# Inventory Management System

A web-based Inventory Management System developed using **Java, Spring Boot, MySQL, HTML, CSS, and JavaScript**. This application helps manage products, monitor stock levels, and organize inventory through a user-friendly web interface.

## Features

- **User Authentication:** User registration and login.
- **Dashboard:** Displays total products, total stock, low-stock items, and out-of-stock items.
- **Product Management:** Add, view, update, and delete products.
- **Product Categories:** Store and manage product category information.
- **Search:** Search products easily.
- **Image Upload:** Upload and manage product images.
- **Form Validation:** Validate product information before saving.
- **Exception Handling:** Handle application errors and missing products.
- **Responsive Interface:** Simple and user-friendly frontend.

## Technology Stack

| Technology | Purpose |
|---|---|
| Java | Backend programming |
| Spring Boot | Backend framework |
| Spring Data JPA | Database operations |
| MySQL | Database management |
| HTML5 | Frontend structure |
| CSS3 | Frontend styling |
| JavaScript | Frontend functionality |
| Maven | Dependency management |
| Git and GitHub | Version control |
| IntelliJ IDEA | Development environment |

## Project Structure

```text
inventory-management-springboot/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/pradip/inventory/
│       │       ├── controller/
│       │       ├── entity/
│       │       ├── exception/
│       │       ├── service/
│       │       ├── repository/
│       │       ├── ImageConfig.java
│       │       └── InventoryManagementApplication.java
│       │
│       └── resources/
│           ├── static/
│           │   ├── index.html
│           │   ├── login.html
│           │   └── register.html
│           └── application.properties
│
├── pom.xml
├── README.md
└── .gitignore
```

## Prerequisites

- Java (version supported by the project)
- MySQL Server
- IntelliJ IDEA
- Maven

## Database Configuration

1. Start your MySQL server.
2. Create your database (use the database name configured in your application):

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

Replace the example credentials and database name with your actual local configuration.

**Security:** Never commit real database passwords, API keys, or other secrets to GitHub.

## How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/Pradipga/inventory-management-springboot.git
```

2. Open the project in IntelliJ IDEA.
3. Configure your MySQL database.
4. Allow Maven to download dependencies.
5. Run `InventoryManagementApplication.java`.
6. Open your browser:

```text
http://localhost:8080
```

## Learning Outcomes

- Java application development.
- Spring Boot fundamentals.
- REST API development.
- Database integration using Spring Data JPA.
- CRUD operations.
- MySQL database management.
- Frontend and backend integration.
- Git and GitHub version control.

## Author

**Pradip Gawade**

GitHub: [Pradipga](https://github.com/Pradipga)

## Project Repository

[Inventory Management System – GitHub](https://github.com/Pradipga/inventory-management-springboot)
