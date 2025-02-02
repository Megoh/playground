# Stage 1: Build the application using Gradle
FROM gradle:8.10-jdk21 AS build
WORKDIR /app

# Copy the entire project (including gradlew, build.gradle.kts, src, etc.)
COPY --chown=gradle:gradle . .

# Convert CRLF to LF in gradlew and ensure it's executable
RUN sed -i 's/\r$//' gradlew && chmod +x gradlew

# Ensure the Gradle wrapper is executable
RUN chmod +x gradlew

# Use the Gradle wrapper to build the project (make sure gradlew has executable permission)
RUN ./gradlew build --no-daemon -x test

# Stage 2: Create a lean runtime image
FROM openjdk:21-jdk-slim
WORKDIR /app

# Copy the built jar from the build stage. Adjust the path if needed.
COPY --from=build /app/build/libs/*.jar app.jar

# Expose the port your app listens on (adjust as needed)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]