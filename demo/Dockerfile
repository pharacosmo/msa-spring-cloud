#FROM ubuntu:latest
#LABEL authors="20259996"
#
#ENTRYPOINT ["top", "-b"]

#docker build -t gateway:latest ./gateway
#docker run -d --name gateway-container -p 8080:8080 gateway:latest

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "app.jar"]

## 1️⃣ Build Stage: Gradle을 사용하여 JAR 빌드
#FROM gradle:8.10-jdk17 AS builder
#WORKDIR /app
#
## CA 인증서 업데이트
##RUN apt-get update && apt-get install -y ca-certificates && update-ca-certificates
#RUN apt-get update && apt-get install -y ca-certificates ca-certificates-java && update-ca-certificates -f
#
#
## Gradle Wrapper 및 프로젝트 파일 복사
#COPY gradlew gradle settings.gradle.kts build.gradle.kts ./
#COPY gradle/wrapper ./gradle/wrapper
#
## Gradle 실행 권한 설정 (Linux 대비)
#RUN chmod +x gradlew || true
#
## Gradle 의존성 미리 다운로드 (캐시 활용)
#RUN ./gradlew dependencies --no-daemon || true
#
## 소스 코드 복사 및 빌드
#COPY src ./src
#
## 🔥 JAR 파일이 생성되었는지 확인하는 디버깅 코드 추가
##RUN ./gradlew bootJar --no-daemon && ls -l build/libs/
#RUN gradle bootJar --no-daemon && ls -l build/libs/
#
## 2️⃣ Runtime Stage: OpenJDK 기반으로 JAR 실행
#FROM openjdk:17-jdk-slim
#WORKDIR /app
#COPY --from=builder /app/build/libs/*.jar app.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "app.jar"]



