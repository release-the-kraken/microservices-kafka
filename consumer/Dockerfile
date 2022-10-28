FROM maven:3.8.6-jdk-11-slim

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]