# docker build -t mokdonjr/mymessenger .

FROM openjdk:11.0.4-jdk-slim
LABEL maintainer="mokdonjr@gmail.com"
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
CMD ["--spring.profiles.active=dev"]