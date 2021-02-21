## Taller Clientes y Servicios

En este taller se presentan diferentes retos en donde se explora los conceptos de esquemas de nombres y de clientes y servicios. Adicionalmente, el taller explora la arquitectura de las aplicaciones distribuidas sobre internet.

### APP WEB
Aqui puede acceder a la aplicacion web para este proyecto.

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://radiant-bayou-20008.herokuapp.com/)

### Integración Continua

[![CircleCI](https://circleci.com/gh/StivenVanegas/AREP-TALLER3.svg?style=svg)](https://app.circleci.com/pipelines/github/StivenVanegas/AREP-TALLER3)

### REQUISITOS
* Java
* Maven
* Git
* Heroku

### COMPILE

   `mvn package`

### EXECUTE

* Ejercicio 1

`java -cp target/classes edu.escuelaing.arem.ejercicios.URLPrint`

* Ejercicio 2

`java -cp target/classes edu.escuelaing.arem.ejercicios.URLReader`

* Ejercicio 3

`java -cp target/classes edu.escuelaing.arem.ejercicios.EchoServer`

`java -cp target/classes edu.escuelaing.arem.ejercicios.EchoClient`

### JAVADOC

Para generar la documentacion java del proyecto ejecute las siguientes instrucciones.

`mvn javadoc:javadoc`

`mvn site`

`mvn site:run`

Y a continuación ir a la siguiente direccion web

`http://localhost:8080/apidocs/index.html`

### AUTOR
* Janer Stiven Vanegas Trujillo