FROM openjdk:17-jdk-slim-buster
MAINTAINER makeshb.com
EXPOSE 8080
COPY target/azuretest.jar azuretest.jar
ENTRYPOINT ["java","-jar","/azuretest.jar"]