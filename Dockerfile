FROM openjdk:17-jdk-slim-buster
MAINTAINER makeshb.com
EXPOSE 8080
COPY target/AzureDemo.jar AzureDemo.jar
ENTRYPOINT ["java","-jar","/AzureDemo.jar"]