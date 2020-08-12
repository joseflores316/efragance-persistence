# Efragance-peristence

## Requisitos
```
java jdk 1.8.0
maven 3.3.9
openjdk:8-jre-alpine

**Importante** : De momento en versión beta se está usando H2 como DB hasta que se defina la estructura de forma concreta.

```

## Entorno
```
Asegurar que el entorno de programación esta configruado en UTF-8 para garantizar que los acentos se 
ven adecuadamente, sobretodo en los archivos .properties, encargados de internacionlizar el aplicativo

- Eclipse 4.13 (Plugins: SVN Suversive, Git,STS,JAutodoc,PMD,Checkstyle)

Formatear sin trailing spaces para evitar más conflictos de los necesarios a la hora de realziar el merge 

Sustituir tabs por spaces, también aplica en ficheros XML

Bajar el proyecto y a continuación ejecutar el comando:
	**mvn clean install, se pueden añadir los parámetrso  -Dprofile="dev"/"qa"/"prod" dependiendo del entorno
	
	De esta manera se autogenerarán todas las clases que manejan las librerias mapstruts y querydsl

```

## Estructura de carpetas

El proyecto se divide en las siguientes estructura de paquetes (se listan los paquetes/archivos más significativos)

    Config structure
    . root
    |__config (directorio que contiene lo necesario para poder configurar la base de datos en el resto de proyectos)
    	 
    
     Module structure / cada modulo funcional tiene la siguiente estructura
	. <module_name>
	|__dto (dto de entidad por si hace falta utilizarlo)
	|__ models (enntities)
	|__ repositories


## Explicación
Este proyecto únicamente es un proyecto destinado a servise como una libreria, que nos de la capacidad de compartir entre varios proyectos el uso de la base de datos.
