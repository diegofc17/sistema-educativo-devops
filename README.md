# 🎓 Sistema Educativo Distribuido

Este proyecto implementa un sistema educativo basado en microservicios, utilizando **Spring Boot**, **Spring Cloud**, **Eureka**, **MongoDB**, **Feign**, **Swagger**, **Docker**, **Config Server** y **GitHub Actions** para CI/CD.

---

## 🧱 Microservicios

- `usuarios-servicio`: gestión de usuarios.
- `asignaturas-servicio`: gestión de asignaturas.
- `matriculas-servicio`: gestión de matrículas.
- `eureka-server`: servidor de descubrimiento.
- `config-server`: servidor de configuración centralizada.
- `mongo` y `mongo-express`: base de datos y dashboard web para MongoDB.

---

## ⚙️ Tecnologías Utilizadas

| Tecnología | Propósito |
|------------|-----------|
| Spring Boot | Desarrollo de microservicios |
| Spring Cloud Config | Configuración centralizada |
| Eureka | Descubrimiento de servicios |
| MongoDB | Base de datos NoSQL |
| Feign Client | Comunicación entre microservicios |
| Swagger | Documentación automática |
| Docker / Docker Compose | Contenerización y orquestación |
| GitHub Actions | CI/CD |

---

## 🚀 Cómo Ejecutar Localmente

### 1. Clonar el proyecto

```bash
git clone https://github.com/diegofc17/sistema-educativo-devops.git
cd sistema-educativo-devops
```

### 2. Compilar los microservicios

```bash
mvn clean install
```

Hazlo en cada carpeta de microservicio: `usuarios-servicio`, `asignaturas-servicio`, `matriculas-servicio`.

### 3. Ejecutar con Docker Compose

```bash
docker-compose up --build
```

Esto construirá y levantará:

- Eureka Server en `http://localhost:8761`
- Config Server en `http://localhost:8888`
- Microservicios en puertos: `8081`, `8082`, `8083`
- Mongo Express en `http://localhost:8085`

---

## 🧪 Ejecutar Pruebas

```bash
mvn test

```

> Ejecuta este comando en la carpeta del microservicio donde se hayan implementado las pruebas unitarias (`matriculas-servicio` por ejemplo).

---

## 📄 Documentación Swagger

- Usuarios: [http://localhost:8082/swagger-ui.html](http://localhost:8082/swagger-ui.html)
- Asignaturas: [http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html)
- Matrículas: [http://localhost:8083/swagger-ui.html](http://localhost:8083/swagger-ui.html)

---

## 🛠️ Variables importantes

- **Repositorio de configuración:**  
  `https://github.com/diegofc17/sistema-config`

- **Mongo Express:**  
  Dashboard web para inspeccionar datos en MongoDB.  
  URL: `http://localhost:8085`

---

## 🔄 Integración y Despliegue (CI/CD)

Cada push al repositorio ejecuta automáticamente un pipeline en **GitHub Actions** que:
- Compila el proyecto.
- Ejecuta pruebas unitarias.


---

## 📌 Notas

- Todos los microservicios están registrados en Eureka automáticamente.
- La configuración proviene del repositorio `sistema-config` a través del `config-server`.
