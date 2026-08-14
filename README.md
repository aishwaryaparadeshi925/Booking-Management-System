# Booking Management System

A RESTful web application built with **Spring Boot** for managing trip bookings — supports creating, retrieving, updating, and deleting trip records through a clean, layered architecture.

## Tech Stack

- **Java 21**
- **Spring Boot**
- **Spring Data JPA / Hibernate**
- **MySQL** (or your configured DB — update in `application.properties`)
- **Maven**

## Project Architecture

The project follows a standard layered architecture for separation of concerns:

```
com.example.bookingmanagesystem
│
├── controller/     → REST API endpoints (TripController)
├── service/        → Business logic (TripService)
├── repository/      → Data access layer (TripRepository)
├── entity/         → JPA entities (Trip)
└── exception/       → Custom exceptions & global error handling
    ├── TripNotFoundException
    └── GlobalExceptionHandler
```

## Features

- Create, view, update, and delete trip records
- Centralized exception handling with meaningful error responses
- Custom exception (`TripNotFoundException`) for invalid trip lookups
- Clean REST API design following standard HTTP conventions

## API Endpoints

| Method | Endpoint          | Description              |
|--------|-------------------|---------------------------|
| GET    | `/api/trips`      | Get all trips             |
| GET    | `/api/trips/{id}` | Get a trip by ID          |
| POST   | `/api/trips`      | Create a new trip         |
| PUT    | `/api/trips/{id}` | Update an existing trip   |
| DELETE | `/api/trips/{id}` | Delete a trip             |

*(Update this table to match your actual `TripController` endpoints and request/response bodies.)*

## Getting Started

### Prerequisites
- JDK 21
- Maven
- MySQL (or your chosen database)

### Setup

1. Clone the repository
   ```bash
   git clone https://github.com/<your-username>/bookingmanagesystem.git
   cd bookingmanagesystem
   ```

2. Configure your database in `src/main/resources/application.properties`
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/booking_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Build and run the project
   ```bash
   ./mvnw spring-boot:run
   ```

4. The application will start on `http://localhost:8082`

## Testing the API

You can test the endpoints using **Postman** or **cURL**. Example:

```bash
curl -X GET http://localhost:8080/api/trips
```

## Future Enhancements

- Add user authentication (Spring Security + JWT)
- Add pagination and filtering for trip listings
- Integrate Swagger/OpenAPI documentation
- Add unit and integration tests

## Author

**Aishwarya R Paradeshi**
Java Full Stack Developer
[LinkedIn](https://linkedin.com/in/aishwarya-paradeshi-180953282) | [GitHub](https://github.com/aishwaryaparadeshi925)
