#Trabajo Práctico 1 - Círculos

**Fecha entrega:** 19/9/2016  
**Repositorio del tp:** https://github.com/programacion­basica­2­unlam/tp1­circulos  
**Modalidad:** Individual

##Introducción

Un círculo es la región del plano delimitada por una circunferencia y que posee un área definida.
Es una curva geométrica plana, cerrada, cuyos puntos son equidistantes del centro, y sólo posee longitud (es decir, el perímetro del círculo).

##Consigna

Modelar la clase circulo e implementarla en Java creando los siguientes test unitarios:

- Crear los círculo con los siguientes radios, comprobando que el cada uno se creó correctamente:

  1. 2
  2. 3.7
  3. 5
  4. 10.9
  5. Crear un círculo de radio 9.8​ y luego comprobar que el perímetro del círculo es 615,73
  6. Crear un círculo de radio 16.6​ y luego comprobar que el perímetro del círculo es 865,67

##Restricciones

- Tomar como precisión hasta dos decimales para las comparaciones
- No utilizar tipos primitivos

##Tip de ayuda:

Documentación de la clase Assert:

http://junit.sourceforge.net/javadoc/org/junit/Assert.html

###Ejemplo de uso de assertEquals con un Double

    Double esperado = 1.10;
    Double actual = 1.10;
    
    assertEquals(esperado.doubleValue(),actual.doubleValue(),precisión​);

Donde precisión es la cantidad de decimales que se comparan