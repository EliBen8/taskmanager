# Task Manager REST API

[![Java CI with Maven](https://github.com/EliBen8/taskmanager/actions/workflows/ci.yml/badge.svg)](https://github.com/EliBen8/taskmanager/actions/workflows/ci.yml)

A production-ready REST API for managing tasks, built with Spring Boot and PostgreSQL. Features comprehensive test coverage, CI/CD pipeline, and Docker containerization.

## 🚀 Features

- ✅ Full CRUD operations for task management
- ✅ RESTful API design with proper HTTP status codes
- ✅ PostgreSQL database with JPA/Hibernate
- ✅ Input validation with Bean Validation
- ✅ Comprehensive test suite (20+ tests, unit & integration)
- ✅ CI/CD pipeline with GitHub Actions
- ✅ Docker & Docker Compose support
- ✅ Multi-stage Docker builds for optimized images

## 🛠️ Tech Stack

- **Language:** Java 17
- **Framework:** Spring Boot 3.5.7
- **Database:** PostgreSQL 15
- **Build Tool:** Maven
- **Testing:** JUnit 5, Mockito, MockMvc
- **Containerization:** Docker & Docker Compose
- **CI/CD:** GitHub Actions

## 📋 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/tasks` | Get all tasks |
| GET | `/api/tasks/{id}` | Get task by ID |
| POST | `/api/tasks` | Create new task |
| PUT | `/api/tasks/{id}` | Update existing task |
| DELETE | `/api/tasks/{id}` | Delete task |

### Example Request/Response

**Create Task:**
```bash
POST /api/tasks
Content-Type: application/json

{
  "title": "Learn Spring Boot",
  "description": "Build a REST API",
  "completed": false
}
```

**Response:**
```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Build a REST API",
  "completed": false,
  "createdAt": "2025-11-11T23:00:00",
  "updatedAt": "2025-11-11T23:00:00"
}
```

## 🏃 Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- PostgreSQL 15+ (or Docker)

### Option 1: Run with Docker (Recommended)
```bash
# Clone the repository
git clone https://github.com/EliBen8/taskmanager.git
cd taskmanager

# Start the application and database
docker-compose up

# The API will be available at http://localhost:8080
```

### Option 2: Run Locally

**1. Start PostgreSQL:**
```bash
docker run --name postgres-taskdb \
  -e POSTGRES_USER=postgres \
  -e POSTGRES_PASSWORD=password \
  -e POSTGRES_DB=taskdb \
  -p 5432:5432 \
  -d postgres:15
```

**2. Run the application:**
```bash
mvn spring-boot:run
```

**3. Access the API at:** `http://localhost:8080`

## 🧪 Running Tests
```bash
# Run all tests
mvn test

# Run tests with coverage report
mvn test jacoco:report
```

**Test Coverage:**
- Repository Layer: 5 tests
- Service Layer: 7 tests
- Controller Layer: 8 tests
- **Total: 20 tests**

## 🏗️ Project Structure
```
taskmanager/
├── src/
│   ├── main/
│   │   ├── java/com/taskapi/taskmanager/
│   │   │   ├── controller/     # REST API endpoints
│   │   │   ├── service/        # Business logic
│   │   │   ├── repository/     # Database access
│   │   │   └── model/          # Entity classes
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/taskapi/taskmanager/
│           ├── controller/     # Controller tests
│           ├── service/        # Service tests
│           └── repository/     # Repository tests
├── .github/workflows/
│   └── ci.yml                  # GitHub Actions CI/CD
├── Dockerfile                  # Docker image configuration
├── docker-compose.yml          # Multi-container setup
└── pom.xml                     # Maven dependencies
```

## 🔄 CI/CD Pipeline

The project uses GitHub Actions for continuous integration:

- ✅ Automated testing on every push
- ✅ PostgreSQL service container for integration tests
- ✅ Test reports generation
- ✅ Build verification

## 🐳 Docker

**Build the image:**
```bash
docker build -t taskmanager-app .
```

**Run with Docker Compose:**
```bash
docker-compose up -d
```

**View logs:**
```bash
docker-compose logs -f
```

**Stop services:**
```bash
docker-compose down
```

## 📝 Configuration

Key configuration in `application.properties`:
```properties
# Database
spring.datasource.url=jdbc:postgresql://localhost:5432/taskdb
spring.datasource.username=postgres
spring.datasource.password=password

# JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Server
server.port=8080
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 👤 Author

**Eli Bendavid**
- GitHub: [@EliBen8](https://github.com/EliBen8)
- LinkedIn: [Your LinkedIn](https://linkedin.com/in/your-profile)

## 🙏 Acknowledgments

- Built with Spring Boot
- Inspired by modern REST API best practices
- Comprehensive testing with JUnit & Mockito

---