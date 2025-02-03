CI/CD Pipeline Implementation with GitHub Actions

Technology Used

Application: Java

CI/CD Tool: GitHub Actions

Containerization: Docker

Steps Followed

Created a new branch named assignment-1-{YourName} from the main branch.

Organized the folder structure to include the application code, Dockerfile, and GitHub Actions workflow file.

Created a Dockerfile to containerize the application.

Set up a GitHub Actions workflow to:

Build the project.

Run test cases (minimum 3).

Containerize the application.

Run the Docker container within the pipeline.

Show the running container.

Stop the container.

Pushed the changes to the feature branch and created a Pull Request (PR) to merge into the Assignment-1 branch.

Verified the pipeline execution by checking the logs in GitHub Actions.

CI Pipeline Implementation

1. Build Stage

The pipeline builds the application using mvn clean package.

2. Test Stage

The pipeline runs 3 test cases using mvn test.

3. Containerization Stage

The pipeline builds a Docker image using the Dockerfile.

The Dockerfile includes:

Base image: openjdk:17-jdk-slim

Copying application files.

Installing dependencies.

Exposing the application port.

Running the application.

4. Run Container Stage

The pipeline runs the Docker container and verifies that the application is running.

5. Stop Container Stage

The pipeline stops the running container after verification.

How to Run the Pipeline

Clone the repository:

git clone https://github.com/{YourGitHubUsername}/java-app.
