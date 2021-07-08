# Test Falabella

### Build
Clonar proyecto ejecutar en el directorio de la aplicacion

mvnw clean install

### Ejecucion
mvnw spring-boot:run

### Arquitectura
Se uso una base de datos en memoria H2, para una rapida ejeuccion independiente de la infraestructura donde se ejecute.

Se utilizo repositorios de JPA para el acceso a los datos, con la interfaz **JpaRepository**.

Se creo un @ControllerAdvice para el manejo de las validaciones y la excepcion del duplicado de SKU.