FROM openjdk:8-jdk-alpine
LABEL mantainer="Felipe Pereira <felipe.dspereira@gmail.com>"
ADD target/resource-server.jar app.jar
ADD src/main/resources/docker/wait-for-it.sh wait-for-it.sh
RUN apk add --no-cache bash