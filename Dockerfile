FROM openjdk:20-jdk-slim

WORKDIR /opt

COPY target/*.jar /opt/app.jar

ENTRYPOINT exec java $JAVA_OPTS -jar app.jar


