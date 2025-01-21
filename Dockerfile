FROM maven:3.8.4-openjdk-17-slim

WORKDIR /app

COPY pom.xml .
COPY src ./src

# Download dependencies and keep them cached in a separate layer
RUN mvn dependency:go-offline

ENV DB_URL=${DB_URL}
ENV DB_NAME=${DB_NAME}
ENV DB_USER=${DB_USER}
ENV DB_PASSWORD=${DB_PASSWORD}

EXPOSE 8080

CMD ["mvn", "spring-boot:run", "-Dspring-boot.run.profiles=dev"]