<<<<<<< HEAD
# conferences
Repo holds Ampath Best Practices Portal files
=======
# AMPATH Conference Application

This is the AMPATH Conference Application, a Spring Boot project for managing conference abstract submissions.

## Table of Contents

- [Requirements](#requirements)
- [Running the Application](#running-the-application)
    - [Using Docker](#using-docker)
    - [Using Maven](#using-maven)
- [Configuration](#configuration)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Requirements

To run this application, you need the following:

- Java Development Kit (JDK) 11 or higher
- Maven (if running using Maven)
- Docker (if running using Docker)
- MySQL database (update `application.properties` accordingly)

## Running the Application

### Using Docker

1. Ensure Docker is installed and running on your system.
2. Build the Docker image:
   ```bash
   docker build -t ampath-conference .
   ```
3. Run the Docker container:
   ```bash
   docker run -p 8080:8080 ampath-conference
   ```
4. Access the application at `http://localhost:8080`.

### Using Maven

1. Ensure Java and Maven are installed on your system.
2. Navigate to the project directory and run:
   ```bash
   mvn spring-boot:run
   ```
3. Access the application at `http://localhost:8080`.

## Configuration

- Database configuration: Update `src/main/resources/application.properties` with your MySQL database settings.
- Other configurations: Refer to `src/main/resources/application.properties` for additional configurations.

## Usage

- The application allows users to submit conference abstracts.
- Visit the application URL to access the submission form and other features.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/my-feature`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature/my-feature`).
6. Create a new Pull Request.

## License

This project is licensed under the [MIT License](LICENSE).

---

Feel free to customize the sections and content based on your project's specifics.
>>>>>>> initial setup
