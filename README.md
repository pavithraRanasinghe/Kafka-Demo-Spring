# Simple Spring Boot Kafka

This is a simple Spring Boot project demonstrating how to integrate Apache Kafka for message processing.

## Requirements

- Java Development Kit (JDK) 17
- Apache Kafka 3.6.1
- Maven

## Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/pavithraRanasinghe/Kafka-Demo-Spring
    ```

2. **Configure Kafka:**

   Make sure you have Apache Kafka 3.6.1
   Start kafka environment with ZooKeeper
   ```bash
   bin/zookeeper-server-start.sh config/zookeeper.properties
    ```
   Open new terminal session and run
   ```bash
   bin/kafka-server-start.sh config/server.properties
    ```
   installed and running. Update the Kafka configuration in `application.properties` with the appropriate settings.

4. **Build the project:**

    If you're using Maven:

    ```bash
    cd spring-boot-kafka-example
    mvn clean package
    ```

5. **Run the application:**

    ```bash
    java -jar target/spring-boot-kafka-example.jar
    ```

    Or if you prefer to run from your IDE, you can run the `KafkaDemoApplication` class directly.
