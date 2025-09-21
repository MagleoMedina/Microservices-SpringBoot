# SpringMicroServices

Este proyecto es una colección de microservicios desarrollados con Spring Boot, diseñados para demostrar una arquitectura basada en microservicios. Cada servicio es independiente y se comunica mediante HTTP y/o mensajería asíncrona.

## Descripción

El objetivo de este proyecto es mostrar cómo construir y desplegar microservicios con Spring Boot. Cada microservicio puede gestionar una parte específica de la aplicación, como estudiantes y sus cursos. El proyecto puede incluir comunicación entre servicios, descubrimiento de servicios, balanceo de carga, y manejo de fallos.

## Estructura del Proyecto

```
├── 📁 .git/ 🚫 (auto-hidden)
├── 📁 .mvn/
│   ├── 📄 jvm.config
│   └── 📄 maven.config
├── 📁 .vscode/ 🚫 (auto-hidden)
├── 📁 microservice-configserver/
│   ├── 📁 .mvn/
│   │   └── 📁 wrapper/
│   │       └── 📄 maven-wrapper.properties
│   ├── 📁 src/
│   │   ├── 📁 main/
│   │   │   ├── 📁 java/
│   │   │   │   └── 📁 com/
│   │   │   │       └── 📁 microservice/
│   │   │   │           └── 📁 configserver/
│   │   │   │               └── ☕ MicroserviceConfigserverApplication.java
│   │   │   └── 📁 resources/
│   │   │       ├── 📁 configurations/
│   │   │       │   ├── ⚙️ msvc-course.yml
│   │   │       │   ├── ⚙️ msvc-eureka.yml
│   │   │       │   ├── ⚙️ msvc-gateway.yml
│   │   │       │   └── ⚙️ msvc-student.yml
│   │   │       ├── ⚙️ application.yml
│   │   │       ├── 📄 banner.txt
│   │   │       └── 📄 logback-spring.xml
│   │   └── 📁 test/
│   │       └── 📁 java/
│   │           └── 📁 com/
│   │               └── 📁 microservice/
│   │                   └── 📁 configserver/
│   │                       └── ☕ MicroserviceConfigserverApplicationTests.java
│   ├── 📁 target/ 🚫 (auto-hidden)
│   ├── 📄 .gitattributes
│   ├── 🚫 .gitignore
│   ├── 📝 HELP.md
│   ├── 📄 mvnw
│   ├── 🐚 mvnw.cmd
│   └── 📄 pom.xml
├── 📁 microservice-course/
│   ├── 📁 .mvn/
│   │   └── 📁 wrapper/
│   │       └── 📄 maven-wrapper.properties
│   ├── 📁 src/
│   │   ├── 📁 main/
│   │   │   ├── 📁 java/
│   │   │   │   └── 📁 com/
│   │   │   │       └── 📁 microservice/
│   │   │   │           └── 📁 course/
│   │   │   │               ├── 📁 client/
│   │   │   │               │   └── ☕ StudentClient.java
│   │   │   │               ├── 📁 controllers/
│   │   │   │               │   └── ☕ CourseController.java
│   │   │   │               ├── 📁 dto/
│   │   │   │               │   └── ☕ StudentDTO.java
│   │   │   │               ├── 📁 http/
│   │   │   │               │   ├── 📁 request/
│   │   │   │               │   └── 📁 response/
│   │   │   │               │       └── ☕ StudentByIdCourseResponse.java
│   │   │   │               ├── 📁 models/
│   │   │   │               │   └── ☕ Course.java
│   │   │   │               ├── 📁 repository/
│   │   │   │               │   └── ☕ CourseRepository.java
│   │   │   │               ├── 📁 services/
│   │   │   │               │   ├── ☕ CourseServiceImpl.java
│   │   │   │               │   └── ☕ ICourseService.java
│   │   │   │               └── ☕ MicroserviceCourseApplication.java
│   │   │   └── 📁 resources/
│   │   │       ├── 📁 static/
│   │   │       ├── 📁 templates/
│   │   │       ├── ⚙️ application.yml
│   │   │       ├── 📄 banner.txt
│   │   │       ├── 🗄️ import.sql
│   │   │       └── 📄 logback-spring.xml
│   │   └── 📁 test/
│   │       └── 📁 java/
│   │           └── 📁 com/
│   │               └── 📁 microservice/
│   │                   └── 📁 course/
│   │                       └── ☕ MicroserviceCourseApplicationTests.java
│   ├── 📁 target/ 🚫 (auto-hidden)
│   ├── 📄 .gitattributes
│   ├── 🚫 .gitignore
│   ├── 📝 HELP.md
│   ├── 📄 mvnw
│   ├── 🐚 mvnw.cmd
│   └── 📄 pom.xml
├── 📁 microservice-eureka/
│   ├── 📁 .mvn/
│   │   └── 📁 wrapper/
│   │       └── 📄 maven-wrapper.properties
│   ├── 📁 src/
│   │   ├── 📁 main/
│   │   │   ├── 📁 java/
│   │   │   │   └── 📁 com/
│   │   │   │       └── 📁 microservice/
│   │   │   │           └── 📁 eureka/
│   │   │   │               └── ☕ MicroserviceEurekaApplication.java
│   │   │   └── 📁 resources/
│   │   │       ├── ⚙️ application.yml
│   │   │       ├── 📄 banner.txt
│   │   │       └── 📄 logback-spring.xml
│   │   └── 📁 test/
│   │       └── 📁 java/
│   │           └── 📁 com/
│   │               └── 📁 microservice/
│   │                   └── 📁 eureka/
│   │                       └── ☕ MicroserviceEurekaApplicationTests.java
│   ├── 📁 target/ 🚫 (auto-hidden)
│   ├── 📄 .gitattributes
│   ├── 🚫 .gitignore
│   ├── 📝 HELP.md
│   ├── 📄 mvnw
│   ├── 🐚 mvnw.cmd
│   └── 📄 pom.xml
├── 📁 microservice-gateway/
│   ├── 📁 .mvn/
│   │   └── 📁 wrapper/
│   │       └── 📄 maven-wrapper.properties
│   ├── 📁 src/
│   │   ├── 📁 main/
│   │   │   ├── 📁 java/
│   │   │   │   └── 📁 com/
│   │   │   │       └── 📁 microservice/
│   │   │   │           └── 📁 gateway/
│   │   │   │               └── ☕ MicroserviceGatewayApplication.java
│   │   │   └── 📁 resources/
│   │   │       ├── ⚙️ application.yml
│   │   │       ├── 📄 banner.txt
│   │   │       └── 📄 logback-spring.xml
│   │   └── 📁 test/
│   │       └── 📁 java/
│   │           └── 📁 com/
│   │               └── 📁 microservice/
│   │                   └── 📁 gateway/
│   │                       └── ☕ MicroserviceGatewayApplicationTests.java
│   ├── 📁 target/ 🚫 (auto-hidden)
│   ├── 📄 .gitattributes
│   ├── 🚫 .gitignore
│   ├── 📝 HELP.md
│   ├── 📄 mvnw
│   ├── 🐚 mvnw.cmd
│   └── 📄 pom.xml
├── 📁 microservice-student/
│   ├── 📁 .mvn/
│   │   └── 📁 wrapper/
│   │       └── 📄 maven-wrapper.properties
│   ├── 📁 src/
│   │   ├── 📁 main/
│   │   │   ├── 📁 java/
│   │   │   │   └── 📁 com/
│   │   │   │       └── 📁 microservice/
│   │   │   │           └── 📁 student/
│   │   │   │               ├── 📁 controllers/
│   │   │   │               │   └── ☕ StudentController.java
│   │   │   │               ├── 📁 models/
│   │   │   │               │   └── ☕ Student.java
│   │   │   │               ├── 📁 repository/
│   │   │   │               │   └── ☕ StudentRepository.java
│   │   │   │               ├── 📁 services/
│   │   │   │               │   ├── ☕ IStudentService.java
│   │   │   │               │   └── ☕ StudentServiceImpl.java
│   │   │   │               └── ☕ MicroserviceStudentApplication.java
│   │   │   └── 📁 resources/
│   │   │       ├── 📁 static/
│   │   │       ├── 📁 templates/
│   │   │       ├── ⚙️ application.yml
│   │   │       ├── 📄 banner.txt
│   │   │       ├── 🗄️ import.sql
│   │   │       └── 📄 logback-spring.xml
│   │   └── 📁 test/
│   │       └── 📁 java/
│   │           └── 📁 com/
│   │               └── 📁 microservice/
│   │                   └── 📁 student/
│   │                       └── ☕ MicroserviceStudentApplicationTests.java
│   ├── 📁 target/ 🚫 (auto-hidden)
│   ├── 📄 .gitattributes
│   ├── 🚫 .gitignore
│   ├── 📝 HELP.md
│   ├── 📄 mvnw
│   ├── 🐚 mvnw.cmd
│   └── 📄 pom.xml
├── 📁 target/ 🚫 (auto-hidden)
├── 📖 README.md
└── 📄 pom.xml
```

## Requisitos

- Java 17 o superior
- Maven 3.8+
- Docker (opcional, para despliegue)
- IDE recomendado: IntelliJ IDEA o VS Code

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/SpringMicroServices.git
   cd SpringMicroServices
   ```

2. Compila cada uno de los microservicios:
   ```bash
   mvn clean compile
   ```

## Configuración

- El servidor de configuración centralizada (`config-server`) puede gestionar configuraciones externas e internas de los demas microservicios.
- Variables sensibles (DB, JWT, etc.) deben configurarse como variables de entorno o en archivos seguros.

## Orden para levantar los microservicios

Para evitar problemas de dependencias y asegurar el correcto funcionamiento del sistema, se recomienda iniciar los microservicios en el siguiente orden:

1. **Config Server** (`microservice-configserver`)
2. **Eureka Server** (`microservice-eureka`)
3. **Student Service** (`microservice-student`)
4. **Course Service** (`microservice-course`)
5. **Gateway** (`microservice-gateway`)
