FROM eclipse-temurin:17-jdk-focal as builder
WORKDIR /src
COPY . /src
RUN ./gradlew bootJar
RUN mkdir -p /build && java -Djarmode=layertools -jar /src/build/libs/*SNAPSHOT.jar extract --destination /build


# Run the application on startup
ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]