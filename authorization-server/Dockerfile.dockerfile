FROM openjdk:8-jdk-alpine
LABEL mantainer="Felipe Pereira <felipe.dspereira@gmail.com>"
ADD target/authorization-server.jar app.jar
ADD src/main/resources/docker/wait-for-it.sh wait-for-it.sh
RUN apk add --no-cache bash
ENTRYPOINT ["sh", "-c", "./wait-for-it.sh -t 120 $DB_HOST:3306 -- java -jar app.jar"]