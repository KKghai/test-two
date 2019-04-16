FROM openjdk:8-jre-slim

MAINTAINER Andy Oskin <pasker127@gmail.com>

RUN mkdir -p /opt/app
ENV PROJECT_HOME /opt/app

COPY build/libs/shop-0.0.1-SNAPSHOT.jar $PROJECT_HOME/shop-0.0.1-SNAPSHOT.jar

WORKDIR $PROJECT_HOME

CMD ["java", "-jar","./shop-0.0.1-SNAPSHOT.jar"]
