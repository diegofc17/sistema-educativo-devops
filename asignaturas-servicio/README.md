# asignaturas-servicio

Este microservicio pertenece al Sistema Educativo distribuido. Se encarga de la gestión de asignaturas disponibles para estudiantes.

## Características
- CRUD de asignaturas
- Integrado con base de datos H2
- Documentación vía Swagger

## Tecnologías
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- SpringDoc (Swagger UI)

## Endpoints principales
- `GET /api/asignaturas` - Listar todas las asignaturas
- `GET /api/asignaturas/{id}` - Obtener asignatura por ID
- `POST /api/asignaturas` - Crear nueva asignatura

## Puerto local
- `8081`

## Swagger
- `http://localhost:8081/swagger-ui/index.html`

## Ejecución
```bash
mvn spring-boot:run
```

## Autor
- [Tu nombre]  
- [Tu correo]
