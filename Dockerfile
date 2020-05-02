FROM openjdk:8-jdk-alpine
EXPOSE 8091
ARG JAR_FILE=target/Spring-boot-2-Mockito-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} Spring-boot-2-Mockito.jar
ENTRYPOINT ["java","-jar","/Spring-boot-2-Mockito.jar"]