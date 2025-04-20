# usuarios-servicio

Este microservicio forma parte del Sistema Educativo basado en arquitectura de microservicios. Gestiona la información de los usuarios del sistema (estudiantes y docentes).

## Características
- CRUD de usuarios
- Roles diferenciados: estudiante y docente
- Base de datos H2 integrada
- Documentación Swagger

## Tecnologías
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- SpringDoc (Swagger UI)

## Endpoints principales
- `GET /api/usuarios` - Listar todos los usuarios
- `GET /api/usuarios/{id}` - Obtener un usuario por ID
- `POST /api/usuarios` - Crear nuevo usuario

## Puerto local
- `8080`

## Swagger
- `http://localhost:8080/swagger-ui/index.html`

## Ejecución
```bash
mvn spring-boot:run
```

## Autor
- [Tu nombre]  
- [Tu correo]
