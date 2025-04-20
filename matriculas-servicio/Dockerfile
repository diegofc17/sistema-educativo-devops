# Usa una imagen base con JDK 17
FROM eclipse-temurin:17-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR construido
COPY target/matriculas-servicio-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto del microservicio
EXPOSE 8083

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]
