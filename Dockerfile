FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/*.jar app.jar
COPY target/lib lib


EXPOSE 8080

CMD ["java", "-jar", "app.jar"]