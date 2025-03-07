#FROM ubuntu:latest
#LABEL authors="20259996"
#
#ENTRYPOINT ["top", "-b"]

#docker build -t gateway:latest ./gateway
#docker run -d --name gateway-container -p 8080:8080 gateway:latest

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/gateway-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "app.jar"]







