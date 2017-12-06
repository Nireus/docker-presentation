FROM openjdk:8

MAINTAINER Jakub Białek

ENV ENVVAR Dockerfile-example

RUN apt-get update &&	apt-get install nano

#WORKDIR /app

#COPY app.jar /
ADD app.jar /

EXPOSE 8080

#ENTRYPOINT java -jar app.jar
CMD ["java", "-jar", "app.jar"]
