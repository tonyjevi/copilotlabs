# Calculadora en Java

Este proyecto es una implementación simple de una calculadora en Java que realiza operaciones básicas como suma, resta, multiplicación y división.

## Estructura del Proyecto

```
calculadora-java
├── src
│   └── Calculadora.java
├── README.md
└── pom.xml
```

## Archivos del Proyecto

- **src/Calculadora.java**: Contiene la clase `Calculadora` con métodos para realizar operaciones matemáticas básicas.
- **pom.xml**: Archivo de configuración para Maven que define las dependencias y la versión de Java utilizada.

## Instrucciones para Compilar y Ejecutar

1. Asegúrate de tener [Maven](https://maven.apache.org/) instalado en tu sistema.
2. Navega al directorio del proyecto:
   ```
   cd calculadora-java
   ```
3. Compila el proyecto usando Maven:
   ```
   mvn clean install
   ```
4. Ejecuta la calculadora:
   ```
   mvn exec:java -Dexec.mainClass="src.Calculadora"
   ```

## Uso

Una vez ejecutada, podrás utilizar los métodos de la clase `Calculadora` para realizar operaciones matemáticas básicas. Asegúrate de proporcionar dos números de tipo `double` como parámetros para cada operación.