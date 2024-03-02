FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/coffee-order-0.0.1-SNAPSHOT.jar jar.jar
ENTRYPOINT ["java", "-jar", "jar.jar"]
