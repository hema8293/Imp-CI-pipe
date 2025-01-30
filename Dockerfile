# Use an official OpenJDK image
FROM openjdk:11

# Set working directory
WORKDIR /app

# Copy everything from the project into the container
COPY . /app/

# Create a bin directory for compiled files
RUN mkdir -p /app/bin

# Compile the Java code
RUN javac -d /app/bin /app/src/Main.java

# Command to run the Java application
CMD ["java", "-cp", "/app/bin", "Main"]
