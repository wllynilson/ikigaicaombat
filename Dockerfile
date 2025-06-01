FROM ubuntu:latest AS build

RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        curl \
        gnupg \
        software-properties-common && \
    rm -rf /var/lib/apt/lists/* \
    && apt-get clean \

RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install -DskipTests

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /target/ikigaicombat-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]