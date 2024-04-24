# Use the official Gradle image as the builder
FROM gradle:8.6.0 as builder

# Set the working directory
WORKDIR /home/gradle/src

# Copy the source code into the container
COPY . .

# Build the project and skip tests
RUN gradle bootJar -x test

# Use OpenJDK 11 for the runtime stage
FROM openjdk:21 as runtime

# Set the working directory
WORKDIR /app

# Copy the built JAR file from the builder stage
COPY --from=builder /home/gradle/src/build/libs/*.jar ./ChatWithJwt.jar

# Expose the port that the Spring Boot application will run on
EXPOSE 8080

# Define the command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "ChatWithJwt.jar"]