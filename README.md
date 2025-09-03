# Sistema de Gestión de Reservas de Vuelos - Version 2 (Java)

##  Descripción
Proyecto desarrollado en **Java** usando **Maven**, que gestiona vuelos, pasajeros y reservas. Ideal como prototipo robusto para aerolíneas pequeñas o como proyecto académico avanzado.

##  Tecnologías
- **Lenguaje**: Java (estructura modular con Maven)
- **Gestión de dependencias**: Maven (`pom.xml`)
- **Persistencia**: Archivos planos (`.txt`) para vuelos, pasajeros y usuarios
- **Estructura del proyecto**:
  - `src/main/java`: lógica de negocio
  - Archivos de datos: `vuelosLatam.txt`, `pasajerosLatam.txt`, `usuarios.txt`

##  Características principales
- Registro y listado de vuelos con detalles esenciales
- Registro y consulta de pasajeros y usuarios
- Reservas y cancelaciones de vuelos
- Persistencia funcional mediante archivos de texto
- Base lista para migrar a base de datos o interfaz gráfica

##  Posibles mejoras futuras
- Integración con base de datos relacional
- Interfaz gráfica desktop (Swing o JavaFX)
- API REST con Spring Boot para acceso web o móvil
- Validez de datos, seguridad y autenticación

##  Ejecución del proyecto
```bash
git clone https://github.com/Paulinaczz/flightManagementSystemV2.git
cd flightManagementSystemV2
mvn clean package
java -jar target/<nombre-del-jar>.jar
