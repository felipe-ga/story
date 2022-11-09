FROM openjdk:11
ADD target/story-api-docker.jar story-api-docker.jar
ENTRYPOINT ["java", "-jar","story-api-docker.jar"]
EXPOSE 8080