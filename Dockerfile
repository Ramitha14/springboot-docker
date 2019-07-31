FROM openjdk:11

# ENV MONGO_DATABASE=Trackdb
# ENV MONGO _CI_URL=jdbc:mongo://localhost:3306/Trackdb
ADD ./target/mongoDB-0.0.1-SNAPSHOT.jar  mongoDB-0.0.1-SNAPSHOT.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","mongoDB-0.0.1-SNAPSHOT.jar"]
