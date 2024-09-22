# Usar uma imagem base do OpenJDK para rodar a aplicação Java
FROM openjdk:17-jdk-slim

# Diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo JAR gerado pelo Maven para dentro do container
COPY target/minha-biblioteca-backend-0.0.1-SNAPSHOT.jar /app/minha-biblioteca-backend.jar

# Expor a porta 25000 para acessar a aplicação
EXPOSE 25000

# Comando para rodar o JAR com a aplicação Spring Boot
ENTRYPOINT ["java", "-jar", "minha-biblioteca-backend.jar"]
