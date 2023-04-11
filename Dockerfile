FROM openjdk:17-jdk-alpine AS builder

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package


FROM openjdk:17-jdk-alpine
WORKDIR app
COPY --from=build target/*.jar hospital-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","hospital-0.0.1-SNAPSHOT.jar"]