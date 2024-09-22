# Use the latest official GraalVM image for aarch64 with Java 21
FROM ghcr.io/graalvm/graalvm-ce:21.0.0

# Set the working directory
WORKDIR /app

# Copy the project’s build artifact
COPY build/libs/SecretSanta-0.0.1-SNAPSHOT.jar SecretSanta.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "SecretSanta.jar"]