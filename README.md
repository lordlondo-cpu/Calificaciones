Procesamiento de Calificaciones con Programación Funcional en Java
Integrantes
Juan Camilo Londoño Londoño
---
Descripción del problema
Una institución educativa requiere analizar las calificaciones de un grupo de estudiantes de manera sencilla y eficiente.
Para solucionar esta necesidad se desarrolló un programa en Java utilizando conceptos de programación funcional. El sistema permite registrar estudiantes, evaluar si han aprobado una asignatura, clasificar su rendimiento académico y mostrar la información procesada.
El objetivo principal es aplicar expresiones lambda e interfaces funcionales para realizar operaciones sobre conjuntos de datos de manera más flexible y legible.
---
Objetivo
Aplicar los conceptos fundamentales de programación funcional en Java mediante el uso de expresiones lambda e interfaces funcionales para definir, transformar, evaluar y procesar información relacionada con las calificaciones de estudiantes.
---
Escenario seleccionado
Procesamiento de Calificaciones
El programa analiza una lista de estudiantes con sus respectivas notas y realiza diferentes operaciones funcionales para determinar su estado académico y nivel de desempeño.
---
Datos utilizados
Nombre	Nota
Ana	4.5
Carlos	2.8
María	3.7
Juan	4.9
Pedro	3.2
Cada estudiante está representado mediante un objeto con los siguientes atributos:
```java
String nombre;
double nota;
```
---
Tecnologías utilizadas
Java
NetBeans IDE
Programación funcional
Expresiones Lambda
Interfaces funcionales de Java 8+
---
Expresiones Lambda Implementadas
1. Evaluación de aprobación
```java
Predicate<Estudiante> aprobado =
        estudiante -> estudiante.nota >= 3.0;
```
Información que recibe
Un objeto de tipo `Estudiante`.
Operación que realiza
Verifica si la nota del estudiante es mayor o igual a 3.0.
Resultado que devuelve
Un valor booleano: true o false.
---
2. Clasificación del desempeño
```java
Function<Estudiante, String> clasificacion = ...
```
Transforma una nota numérica en una categoría de rendimiento.
---
3. Mostrar información de estudiantes
```java
Consumer<Estudiante> mostrarDetalle = ...
```
Imprime información detallada de cada estudiante.
---
4. Creación de un estudiante
```java
Supplier<Estudiante> nuevoEstudiante = ...
```
Genera un nuevo objeto de tipo Estudiante.
---
Interfaces funcionales utilizadas
Interfaz Funcional	Función dentro del programa
Predicate<Estudiante>	Evaluar si un estudiante aprobó la materia
Function<Estudiante, String>	Transformar una nota numérica en una clasificación
Consumer<Estudiante>	Mostrar información de cada estudiante
Supplier<Estudiante>	Crear un nuevo estudiante
---
Instrucciones de compilación y ejecución
Compilar
```bash
javac ProcesamientoCalificaciones.java
```
Ejecutar
```bash
java ProcesamientoCalificaciones
```
---
Declaración sobre el uso de Inteligencia Artificial
Para la elaboración de esta actividad se utilizó inteligencia artificial como herramienta de apoyo académico para la consulta y comprensión de conceptos relacionados con programación funcional en Java, generación de ejemplos y apoyo en la documentación del proyecto.
