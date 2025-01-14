FROM openjdk:17-slim

MAINTAINER joonseolee <niceweather94@gmail.com>

ENV TZ=Asia/Seoul

ARG DEPENDENCY=build

COPY ${DEPENDENCY}/libs /app/libs

ENTRYPOINT ["java", "-XX:+ExitOnOutOfMemoryError", "-Xms1g", "-Xmx2g", "-XshowSettings:vm", "-jar", "/app/libs/simple-was-0.0.1-SNAPSHOT.jar"]
