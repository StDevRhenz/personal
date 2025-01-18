# README.md

# Login Page API

This project implements a simple API for a login page, providing functionality for user authentication and management.

## Project Structure

```
login-page-api
├── src
│   ├── main
│   │   ├── java
│   │   │   └── LoginPageArchitecture
│   │   │       ├── Main.java
│   │   │       ├── controller
│   │   │       │   └── LoginController.java
│   │   │       ├── model
│   │   │       │   └── User.java
│   │   │       ├── service
│   │   │       │   └── LoginService.java
│   │   │       └── repository
│   │   │           └── UserRepository.java
│   └── test
│       ├── java
│       │   └── LoginPageArchitecture
│       │       └── LoginControllerTest.java
├── pom.xml
└── README.md
```

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd login-page-api
   ```

3. Build the project using Maven:
   ```
   mvn clean install
   ```

## Usage

- Start the application by running the `Main` class.
- Use the `LoginController` to handle login and logout requests.
- The `LoginService` contains the business logic for user authentication.
- User data is managed through the `UserRepository`.

## Testing

Unit tests for the `LoginController` can be found in the `LoginControllerTest` class. Run the tests using:
```
mvn test
```

## License

This project is licensed under the MIT License.