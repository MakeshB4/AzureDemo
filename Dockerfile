FROM openjdk:17-jdk-slim-buster
MAINTAINER makeshb.com
COPY target/mongodemo-0.0.1-SNAPSHOT.jar mongodemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mongodemo-0.0.1-SNAPSHOT.jar"]