FROM openjdk:17-alpine
COPY /target/jdbc-demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9080:8080
ENTRYPOINT ["java", "jar", "/app.jar"]