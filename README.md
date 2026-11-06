# Inventory Management System

A web-based Inventory Management System built using **Java, Spring Boot, MySQL, HTML, CSS, and JavaScript**. This application helps manage product information, monitor stock levels, and organize inventory through a simple and responsive user interface.

## Features

- **User Authentication:** User registration, login, and logout.
- **Dashboard:** View total products, total stock, low-stock items, and out-of-stock items.
- **Product Management:** Add, view, update, and delete products.
- **Category Management:** Organize products by category.
- **Search and Filtering:** Search products and filter them by category.
- **Image Upload:** Upload and manage product images.
- **Pagination:** Navigate product records across multiple pages.
- **Sorting:** Organize product records for easier viewing.
- **Responsive Design:** Access the application on desktop and mobile devices.
- **Validation and Error Handling:** Handle invalid inputs and product-related errors.

## Technology Stack

| Technology | Purpose |
|---|---|
| Java | Backend programming |
| Spring Boot | Backend application framework |
| Spring Data JPA | Database operations |
| MySQL / MariaDB | Database |
| HTML5 | Frontend structure |
| CSS3 | Styling and responsive design |
| JavaScript | Frontend functionality |
| Maven | Project dependency management |
| Git and GitHub | Version control and source code hosting |
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
│       │       ├── repository/
│       │       ├── service/
│       │       ├── ImageConfig.java
│       │       ├── LoginRequest.java
│       │       └── InventoryManagementApplication.java
│       │
│       └── resources/
│           ├── static/
│           │   ├── index.html
│           │   ├── login.html
│           │   └── register.html
│           └── application.properties
│
├── uploads/
├── pom.xml
└── .gitignore
```

## Prerequisites

Install the following before running the application:

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
4. Configure the database URL, username, and password for your local database.

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=YOUR_DATABASE_USERNAME
spring.datasource.password=YOUR_DATABASE_PASSWORD
```

Use your actual local database credentials. Do not publish passwords or other secrets to GitHub.

## Run the Application

1. Clone the repository:

```bash
git clone https://github.com/Pradipga/inventory-management-springboot.git
```

2. Open the project in IntelliJ IDEA.
3. Configure the database connection in `application.properties`.
4. Allow Maven to download the project dependencies.
5. Run the main Spring Boot application:

`InventoryManagementApplication.java`

6. Open your browser and visit:

```text
http://localhost:8080
```

## Learning Outcomes

Through this project, I gained practical experience with:

- Java and Spring Boot application development.
- Building REST APIs.
- Database integration using Spring Data JPA.
- Implementing CRUD operations.
- Handling image uploads.
- Frontend and backend integration.
- Form validation and exception handling.
- Git and GitHub version control.

## Author

**Pradip Gawade**

GitHub: [Pradipga](https://github.com/Pradipga)

## Repository

[Inventory Management System – GitHub](https://github.com/Pradipga/inventory-management-springboot)
