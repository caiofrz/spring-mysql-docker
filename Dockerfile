# Use uma imagem base com o JDK e Maven
FROM openjdk:17-alpine

# Defina o diretório de trabalho no contêiner
RUN mkdir "app"
WORKDIR /app

# Copie o JAR construído para o contêiner
COPY target/spring-mysql-docker-test-0.0.1-SNAPSHOT.jar /app.jar

# Comando para iniciar a aplicação Spring Boot
ENTRYPOINT ["java", "-jar", "/app.jar"]
