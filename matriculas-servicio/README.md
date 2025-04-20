# matriculas-servicio

Microservicio encargado de registrar las matrículas entre estudiantes y asignaturas dentro del Sistema Educativo distribuido.

## Características
- Registra matrículas con `estudianteId` y `asignaturaId`
- Usa Feign Client para consultar datos en:
  - `usuarios-servicio`
  - `asignaturas-servicio`
- Base de datos H2
- Documentación Swagger

## Tecnologías
- Spring Boot
- Spring Web
- Spring Data JPA
- OpenFeign
- Lombok
- H2 Database
- SpringDoc Swagger

## Endpoints principales
- `GET /api/matriculas` - Listar matrículas
- `POST /api/matriculas` - Crear matrícula

## Puerto local
- `8082`

## Swagger
- `http://localhost:8082/swagger-ui/index.html`

## Ejecución
```bash
mvn spring-boot:run
```

## Autor
- [Tu nombre]  
- [Tu correo]
