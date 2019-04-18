FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/spring-boot-starter-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} spring-boot-starter.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-starter.jar"]