# Spring WebFlux Number Sorter

This is a simple application to demonstrate the non-blocking, reactive programming model of Spring WebFlux. The application receives a list of numbers via an HTTP POST request, sorts them in ascending order, and then outputs the sorted numbers to the console.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You need to have the following installed on your machine:
- Java JDK 8 or above
- Maven

### Installing

To install the application, follow these steps:

1. Clone the repository to your local machine.
2. Open a terminal window and navigate to the project directory.
3. Run the following command to build the project:

```
mvn clean install
```

### Running the application

After the build process completes, run the following command to start the application:

```
mvn spring-boot:run
```

## Using the application

1. Start the application as described in the previous section.

2. Open your web browser and navigate to `http://localhost:8080/numbers`. The application will respond with a stream of numbers: `[1, 2, 3, 4, 5, 35, 678, 1]`.

3. To receive and sort a list of numbers, use an HTTP client to send a POST request to `http://localhost:8080/receive` with a JSON array of integers in the request body. For example:

```
POST /receive HTTP/1.1
Host: localhost:8080
Content-Type: application/json

[1, 3, 35, 3, 2]
```

4. The application will output the sorted list to the console.

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring WebFlux](https://spring.io/projects/spring-webflux)

## Contributing

Contributions are welcome. Please feel free to submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgements

Thanks to the Spring team for their excellent work on Spring Boot and WebFlux.
