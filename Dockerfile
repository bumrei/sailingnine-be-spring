#FROM openjdk:17
#ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]


FROM openjdk:17-oracle AS builder
WORKDIR /workspace/app

RUN microdnf install findutils

RUN apk update && apk add findutils

RUN ./gradlew bootJar
RUN mkdir -p build/libs/dependency && (cd build/libs/dependency; jar -xf ../*.jar)


FROM openjdk:17-oracle

WORKDIR /workspace/app
COPY --from=builder /workspace/app/build/libs/healthcheck-*.jar app.jar

ENTRYPOINT java -jar app.jar