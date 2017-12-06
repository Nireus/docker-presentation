FROM openjdk:8

MAINTAINER Jakub Białek

RUN mkdir /volume

#WORKDIR /app

#COPY app.jar /
ADD app.jar /

EXPOSE 8080 8787

CMD ["java", "-jar", "app.jar"]
