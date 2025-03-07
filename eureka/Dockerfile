#FROM ubuntu:latest
#LABEL authors="20259996"
#
#ENTRYPOINT ["top", "-b"]

# 1. OpenJDK 17을 기반으로 하는 컨테이너 생성
FROM openjdk:17-jdk-slim

# 2. 작업 디렉토리 설정
WORKDIR /app

# 3. Eureka 서버 JAR 파일을 컨테이너로 복사
COPY build/libs/eureka-0.0.1-SNAPSHOT.jar app.jar

# 4. 컨테이너 실행 시 JAR 실행
ENTRYPOINT ["java", "-jar", "app.jar"]

# 5. Eureka 서버 포트 노출
EXPOSE 8761
