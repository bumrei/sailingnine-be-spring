#FROM openjdk:17
#ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#

FROM openjdk:17 AS builder
WORKDIR /workspace/app

COPY gradle gradle
COPY build.gradle settings.gradle gradlew ./
COPY src src

RUN ./gradlew bootJar
RUN mkdir -p build/libs/dependency && (cd build/libs/dependency; jar -xf ../*.jar)


FROM openjdk:17

WORKDIR /workspace/app
COPY --from=builder /workspace/app/build/libs/healthcheck-*.jar app.jar

ENTRYPOINT java -jar app.jar