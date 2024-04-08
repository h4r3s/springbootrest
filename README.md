# Spring Boot REST API for Price Query
This project implements a Spring Boot REST API for querying price information for products in an e-commerce database. The API provides an endpoint to retrieve price details based on input parameters such as product ID, brand ID, and application date.

## Table of Contents
1. [Introduction](#introduction)
2. [Features](#features)
3. [Technologies](#technologies)
4. [Usage](#usage)
5. [Endpoints](#endpoints)
6. [Database](#database)
7. [Project Structure](#project-structure)
8. [Setup](#setup)
9. [Testing](#testing)
10. [Contributing](#contributing)
11. [Author](#author)
12. [License](#license)


## Introduction
In the e-commerce company's database, there is a `PRICES` table reflecting the final price (PVP) and the rate that applies to a product of a chain within certain dates.

### Features
- Accepts input parameters: application date, product identifier, chain identifier.
- Returns output data: product identifier, chain identifier, applicable rate, application dates, and final price to apply.

## Technologies
- Java 21
- Spring Boot (version 3.2.4)
- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- Spring Boot DevTools
- H2 Database
- Project Lombok
- Spring Boot Starter Test

## Usage
To use this project, ensure you have Java and Maven installed on your system. Clone the repository and build the project using Maven.
```bash
git clone https://github.com/jorgejimenezsl/springbootrest.git
cd springbootrest
mvn clean install
```

After building the project, you can run it using the following command:
```bash
mvn spring-boot:run
```
The application will start, and you can then make requests to the defined endpoints.

## Endpoints

### /prices
- Method: GET
- Parameters:
    - productId: Long (required) - Product identifier
    - brandId: Long (required) - Brand identifier
    - date: LocalDateTime (required) - Application date

#### Sample Request
```bash
GET /prices?productId=35455&brandId=1&date=2020-06-14T10:00:00
```

#### Sample Response
```json
[
  {
    "id": 1,
    "brandId": 1,
    "startDate": "2020-06-14T00:00:00",
    "endDate": "2020-12-31T23:59:59",
    "priceList": 1,
    "productId": 35455,
    "priority": 0,
    "price": 35.50,
    "currency": "EUR"
  }
]
```

## Database
The project uses an H2 in-memory database. The schema and initial data are defined in schema.sql and data.sql, respectively.

## Project Structure

The project follows an organized directory structure to facilitate code and resource management. 
Below is the main directory structure and its contents:

- `src/main/java`: Contains the Java application source code.
  - `com.jorgejimenezsl.springbootrest`: Main package of the application.
    - `controller`: Contains REST controllers handling HTTP requests.
      - `domain`: Contains domain classes such as Price, representing database entities.
        - `repository`: Contains repository interfaces defining database operations.
          - `service`: Contains interfaces and implementations of application services.
  - `src/main/resources`: Contains application resource files such as configuration files and view templates (if applicable).
  - `src/test/java`: Contains Java application test files.
  - `pom.xml`: Maven POM file defining project dependencies and configuration.


## Setup
1. Clone the repository
2. Build the project using Maven: `mvn clean install`
3. Run the application: `mvn spring-boot:run` 

## Testing

**Advice:** TESTS ARE NOT AVALIABLE YET -- WIP

**Advice:** Patience is key; progress takes time and effort. Keep going!

```bash
mvn test
```

## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue for bug fixes, feature requests, or any suggestions.

## Author
`Jorge Jimenez`

## License
This project is licensed under the [License Name] - see the [LICENSE.md](LICENSE.md) file for details.
