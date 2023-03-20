# Conversor de monedas y medidas
### Alura Latam OracleONE - Backend Challenge

## Descripción del Proyecto

En este challenge se nos solicitó crear un conversor de divisas utilizando el lenguaje Java. Las características solicitadas por nuestro cliente son las siguientes:

### Requisitos: 

El convertidor de moneda debe:

      - Convertir de la moneda de tu país a Dólar
      - Convertir de la moneda de tu país  a Euros
      - Convertir de la moneda de tu país  a Libras Esterlinas
      - Convertir de la moneda de tu país  a Yen Japonés
      - Convertir de la moneda de tu país  a Won sul-coreano

Recordando que también debe ser posible convertir inversamente, es decir:

        - Convertir de Dólar a la moneda de tu país
        - Convertir de Euros a la moneda de tu país
        - Convertir de Libras Esterlinas a la moneda de tu país
        - Convertir de Yen Japonés a la moneda de tu país
        - Convertir de Won sul-coreano a la moneda de tu país

Extras:
Se puede añadir al programa otros tipos de conversiones como temperatura, unidades de medidas de peso, longitud, etc..

## Antes de empezar
 - En este repositorio hay 2 soluciones de igual resultado pero diferente implementación. La primera, llamada Conversor_standard, que fue la primer implementación y luego a modo de ejercicio realice la implementación con la arquitectura Modelo-Vista-Controlador, llamada Conversor_MVC. 
 - En ambas soluciones se implementó como extra un conversor de unidades Imperiales a Métricas y viceversa.
 - La interfaz gráfica se realizó únicamente utilizando la biblioteca javax.swing para conocerla y aprender a utilizarla.
 - Se realizó según la lógica y estética de las tarjetas de trello, utilizando la clase JOPtionPane.

## Para empezar
Para empezar pudes clonar el repositorio y ejecutar cualquiera de los archivos .jar o pudes descargar directamente el .jar que desees.
 -Descargar [Conversor_standard](https://github.com/pabloboer/Conversor_Monedas/blob/master/Convertidor_standard.jar)
 -Descargar [Conversor_MVC](https://github.com/pabloboer/Conversor_Monedas/blob/master/Convertidor_MVC.jar)

## Pre-requisitos
Para poder ejecutar el programa debes tener instalado la maquina virtual de java JRE de Java. Puedes descargarlo [aqui](https://www.java.com/en/download/) y luego instalarlo siguiendo las instrucciones.

## Funcionalidades

### El programa permite según los requisitos:
        - Convertir de la moneda de tu país a Dólar
        - Convertir de la moneda de tu país  a Euros
        - Convertir de la moneda de tu país  a Libras Esterlinas
        - Convertir de la moneda de tu país  a Yen Japonés
        - Convertir de la moneda de tu país  a Won sul-coreano
        - Convertir de Dólar a la moneda de tu país
        - Convertir de Euros a la moneda de tu país
        - Convertir de Libras Esterlinas a la moneda de tu país
        - Convertir de Yen Japonés a la moneda de tu país
        - Convertir de Won sul-coreano a la moneda de tu país

### Además permite
        - Convertir cm a pulgadas.
        - Convertir km a millas.
        - Convertir hectáreas a acres.
        - Convertir litros a galones (US).
        - Convertir gramos a onzas.
        - Convertir kilogramos a libras.

## Utilización

Ejecutar el .jar

Primero elegir el tipo de conversión:

![Alt Text](https://github.com/pabloboer/Conversor_Monedas/blob/master/menu_conversion.gif)

Si elige conversión de Monedas:

![Alt Text](https://github.com/pabloboer/Conversor_Monedas/blob/master/monedas.gif)

Si elige conversión de unidades:

![Alt Text](https://github.com/pabloboer/Conversor_Monedas/blob/master/metrico-imperial.gif)
 
En todos los casos sólo se aceptan números y el caracter de punto flotante es el punto (.)
No ingresar caracter de separación de miles.
Si no introduce un caracter numérico, genera ventana de error y vuelve a pedir valor de entrada.

![Alt Text](https://github.com/pabloboer/Conversor_Monedas/blob/master/error.gif)

Mensaje de confirmación y anuncio de cierre.

![Alt Text](https://github.com/pabloboer/Conversor_Monedas/blob/master/fin.gif)


## Herramientas utilizadas

 - JDK 19
 - Eclipse -> Utilizado para escribir y debug el código fuente (descargar [aqui](https://www.eclipse.org/downloads/))
 - Sublime Text 3 -> Utilizada para escribir Readme.md (descargar [aqui](https://www.sublimetext.com/3))
 - Extensión de chrome "Recordadora de pantalla para Chrome" -> Utilizada para grabar la pantalla y crear los gifs (descargar [aqui](https://chrome.google.com/webstore/detail/screen-recorder-for-chrom/aloeieipaodpomkchfojicbelpcglnep))
 - VLC -> Utilizada para editar grabación de pantalla para gifs (descargar [aqui](https://www.videolan.org/vlc/))

## Autor
 - [Pablo Boer](https://www.linkedin.com/in/pablo-boer-1616735a/)

## Agradecimientos
 ### Muchas gracias a:
 - ONE Oracle next Education en conjunto con Alura Latam por el acceso a los cursos necesarios para completar este challenge.
 - Génesys Rondón, Eric Monné, Paz Correa y toda la comunidad a través del Discord y los lives de Youtube.
 - [Villanuevand](https://github.com/Villanuevand) por la plantilla para generar este Readme.md.




