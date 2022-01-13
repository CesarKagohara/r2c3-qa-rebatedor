FROM openjdk

WORKDIR /camel

COPY target/STUB-0.0.1-SNAPSHOT.jar /camel/stub.jar

EXPOSE 8080 8081 8082 8083 8084

ENTRYPOINT ["java","-jar","stub.jar"]