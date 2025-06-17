FROM maven:3.9.9-eclipse-temurin-24-noble AS build

WORKDIR /usr/src/app

COPY pom.xml /usr/src/app

RUN mvn dependency:go-offline

COPY src /usr/src/app/src
RUN mvn clean package -DskipTests=true

FROM eclipse-temurin:24

WORKDIR /usr/app
# Configure timezone
RUN echo "Europe/Paris" > /etc/timezone
RUN dpkg-reconfigure -f noninteractive tzdata

COPY --from=build /usr/src/app/target/*.jar /usr/app/app.jar

EXPOSE 8080
CMD ["java","-jar","/usr/app/app.jar"]