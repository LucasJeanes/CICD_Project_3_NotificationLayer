FROM openjdk:23-jdk-slim
WORKDIR /app
COPY target/CICD_Project_3_NotificationLayer-0.0.1-SNAPSHOT.jar /app
EXPOSE 8083
CMD ["java", "-jar", "CICD_Project_3_NotificationLayer-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=docker"]