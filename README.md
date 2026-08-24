# Product Management System

A RESTful Product Management System developed using **Java, Spring Boot, Spring Data JPA, and MySQL**. The application provides CRUD operations for managing products through REST APIs.

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* REST API
* Postman
* Spring Tool Suite (STS)

## Project Structure

```text
Product-Management-System
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.flipkart.product_management_system
│   │   │       ├── controller
│   │   │       ├── entity
│   │   │       ├── repository
│   │   │       └── service
|   |   |       └── ProductManagementSystemApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
├── .gitignore
└── README.md
```

## Product Fields

The `Product` entity contains the following fields:

| Field         | Description         |
| ------------- | ------------------- |
| `id`          | Unique product ID   |
| `name`        | Product name        |
| `description` | Product description |
| `price`       | Product price       |
| `quantity`    | Available quantity  |
| `category`    | Product category    |
| `brand`       | Product brand       |

## REST API Endpoints

| Method   | Endpoint             | Description       |
| -------- | -------------------- | ----------------- |
| `POST`   | `/api/products`      | Add a new product |
| `GET`    | `/api/products`      | Get all products  |
| `GET`    | `/api/products/{id}` | Get product by ID |
| `PUT`    | `/api/products/{id}` | Update product    |
| `DELETE` | `/api/products/{id}` | Delete product    |

## Sample Request

### Create Product

**POST**

```text
/api/products
```

**Request Body:**

```json
{
    "name": "Laptop",
    "description": "Dell Inspiron Laptop",
    "price": 65000.0,
    "quantity": 10,
    "category": "Electronics",
    "brand": "Dell"
}
```

## Sample Response

```json
{
    "id": 1,
    "name": "Laptop",
    "description": "Dell Inspiron Laptop",
    "price": 65000.0,
    "quantity": 10,
    "category": "Electronics",
    "brand": "Dell"
}
```

## Database Configuration

Create a MySQL database named:

```sql
CREATE DATABASE product_management;
```

Configure the database connection in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/product_management
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Replace `YOUR_PASSWORD` with your local MySQL password.

**Do not commit real database credentials to a public repository.**

## How to Run

1. Clone the repository.
2. Open the project in Spring Tool Suite (STS).
3. Configure your MySQL credentials in `application.properties`.
4. Make sure the `product_management` database exists.
5. Run `ProductManagementSystemApplication.java`.
6. Use Postman to test the REST APIs.

The application runs by default at:

```text
http://localhost:8183
```

## Testing

The REST APIs were tested using **Postman** for:

* Creating products
* Retrieving all products
* Retrieving a product by ID
* Updating products
* Deleting products

## Future Enhancements

* Global exception handling
* Request validation
* DTO implementation
* Search and filtering
* Pagination and sorting
* API documentation using Swagger/OpenAPI

## Author

**Naresh Gupta**

Java Full Stack Developer | MCA Graduate
