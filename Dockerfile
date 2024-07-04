
FROM eclipse-temurin:17.0.8.1_1-jdk-focal

WORKDIR /app

COPY target/imc-1.0.jar imc.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "imc.jar" ]