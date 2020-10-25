FROM maven:3.6.1-jdk-8-slim AS build
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
RUN mvn -f pom.xml clean package

FROM openjdk:14
COPY --from=build /workspace/target/*.jar text-analyzer.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","text-analyzer.jar"]
