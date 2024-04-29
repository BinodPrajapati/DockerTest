FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/docker-test-example.jar docker-test-example.jar
ENTRYPOINT [ "java","-jar","/docker-test-example.jar" ]