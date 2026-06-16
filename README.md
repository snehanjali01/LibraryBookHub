# LibraryBookHub

A REST API for managing a library's book collection built with Spring Boot and MongoDB.

## Tech Stack
- Java 21 | Spring Boot | MongoDB | Maven

## Run Locally
Make sure MongoDB is running, then:
  mvn spring-boot:run
API runs at http://localhost:9092

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/books | Get all books |
| POST | /api/books | Add a book |
| PUT | /api/books/{id} | Update a book |
| DELETE | /api/books/{id} | Delete a book |
