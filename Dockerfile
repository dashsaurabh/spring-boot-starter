FROM maven:3.6.1-jdk-8-alpine as BUILD
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY --from=build /home/app/target/spring-boot-starter-0.0.1-SNAPSHOT.jar /usr/local/lib/spring-boot-starter.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/spring-boot-starter.jar"]