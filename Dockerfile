FROM openjdk:8-jdk-alpine
EXPOSE 8091
ARG JAR_FILE=target/spring-boot-2-mockito-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} spring-boot-2-mockito.jar
ENTRYPOINT ["java","-jar","/spring-boot-2-mockito.jar"]