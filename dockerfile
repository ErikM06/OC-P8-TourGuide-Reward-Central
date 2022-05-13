FROM openjdk:11
WORKDIR /usr/app
COPY build/libs/reward-service-1.0.0.jar reward-service.jar
CMD  java -jar reward-service.jar
