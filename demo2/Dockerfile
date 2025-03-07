#FROM ubuntu:latest
#LABEL authors="20259996"
#
#ENTRYPOINT ["top", "-b"]

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/demo2-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "app.jar"]