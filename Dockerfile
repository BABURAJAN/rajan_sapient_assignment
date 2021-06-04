# For Java 8, try this
FROM openjdk:8-jdk-alpine

# For Java 11, try this
# FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/fbleague-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/football-league-abansal.jar /opt/app/football-league-abansal.jar
COPY ${JAR_FILE} fbleague-0.0.1-SNAPSHOT.jar
EXPOSE 8088
# java -jar /opt/app/fbleague-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","fbleague-0.0.1-SNAPSHOT.jar"]
# sudo docker build -t spring-boot:2.1.6 .
# sudo docker run -d -p 8088:8088 -t spring-boot:2.1.6
