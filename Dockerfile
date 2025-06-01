FROM ubuntu:latest AS build

RUN apt-get update && apt-get install -y software-properties-common

RUN add-apt-repository -y "deb http://archive.ubuntu.com/ubuntu/ $(lsb_release -sc) main restricted universe multiverse"

RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get update -y
RUN apt-get install -y maven
RUN mvn clean install -DskipTests

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /target/ikigaicombat-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]