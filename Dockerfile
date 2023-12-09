## 첫 번째 스테이지
### 멀티 스테이지 이미지
#FROM openjdk:17
#WORKDIR /build
#
### Gradle 프로젝트의 빌드 파일 및 소스 코드를 복사
#COPY build.gradle settings.gradle ./
#COPY src/ ./src/
#
### 프로젝트 빌드
#RUN gradle build
#
#
## 두 번째 스테이지
### 빌드된 어플리케이션을 실행할 베이스 이미지
#FROM openjdk:17-slim
#WORKDIR /app
#
### 빌드된 어플리케이션 JAR 파일을 복사
#COPY --from=builder /build/build/libs/sailingnine-be-spring-0.0.1-SNAPSHOT.jar /app
#
### 어플리케이션 실행
#CMD ["java", "-jar", "app.jar"]

FROM openjdk:17
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} sailingnine-be-spring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app.jar"]