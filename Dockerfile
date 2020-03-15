# docker build -t mokdonjr/mymessenger .

FROM openjdk:11.0.4-jdk-slim
LABEL maintainer="mokdonjr@gmail.com"

# root가 아닌 사용자로 앱을 실행 (https://security.stackexchange.com/questions/106860/can-a-root-user-inside-a-docker-lxc-break-the-security-of-the-whole-system)
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

EXPOSE 8080

# fat jar 파일내 dependency 라이브러리와 어플리케이션 리소스를 명확히 분리
# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar
# ENTRYPOINT ["java","-jar","/app.jar"]

# This Dockerfile has a DEPENDENCY parameter pointing to a directory where we have unpacked the fat jar.
# From a Maven build: $ mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
# If we get that right, it already contains a BOOT-INF/lib directory with the dependency jars in it,
# and a BOOT-INF/classes directory with the application classes in it.
# Notice that we are using the application’s own main class hello.Application
# (this is faster than using the indirection provided by the fat jar launcher).
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java", "-cp", "app:app/lib/*", "mymessenger.MymessengerApplication"]
CMD ["--spring.profiles.active=dev"]