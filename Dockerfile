# docker run -it -p 8080:8080 --name mymessenger mokdonjr/mymessenger
# docker run -d -p 8080:8080 --name mymessenger mokdonjr/mymessenger
FROM openjdk:11.0.4-jdk-slim
COPY target/mymessenger-*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]