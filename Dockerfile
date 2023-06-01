FROM gradle:jdk11 as gradleimage
ARG VERSION=0.0.1-SNAPSHOT
WORKDIR /build/
COPY build.gradle /build/
COPY src /build/src/

RUN gradle build
COPY /build/libs/room-web-app-${VERSION}.jar /libs/application.jar

FROM openjdk:11.0.8-jre-slim
WORKDIR /app/

COPY --from=gradleimage /libs/application.jar /app/
CMD java -jar /app/application.jar