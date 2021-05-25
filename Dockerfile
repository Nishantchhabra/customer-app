FROM openjdk:8
EXPOSE 8080
ADD target/customer-app.jar customer-app.jar
ENTRYPOINT ["java", "-jar","/customer-app.jar"]