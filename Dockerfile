FROM openjdk:17-oracle
COPY target/pdris-jenkins-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 3001
ENTRYPOINT ["java","-jar","app.jar"]