# Patterns
## Respuestas
1. El comando mvn package de Maven se utiliza para compilar el código, ejecutar las pruebas y empaquetar
el código compilado y otros recursos en un formato distribuible, como un archivo JAR, WAR o EAR. Este
comando es una parte clave del ciclo de vida de compilación de Maven, que normalmente se usa para crear
un artefacto que se puede implementar o distribuir.
2. Para ejecutar la aplicación principal del programa, es necesario configurar la dirección del archivo
.java en el archivo pom.xml, indicando el paquete que debe ejecutarse. De esta manera, será suficiente con
escribir el comando mvn exec:java desde la consola. De lo contrario, será necesario especificar la dirección
completa con el comando mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.archetype.App""
![image (1)](images/image(1).png)
![Screenshot2025-01-29091948](images/Screenshot2025-01-29091948.png)
3. Si se intenta ejecutar el programa que requiere recibir un parámetro, se producirá un error al intentar
ejecutarlo desde la consola.
![Screenshot2025-01-29091923](images/Screenshot2025-01-29091923.png)

Para enviar parámetros, se debe ejecutar el comando mvn exec:java -Dexec.args="Argumentos a agregar".
En el siguiente ejemplo, se agregó 'Pepito' como argumento.
![image](images/image.png)
4. La fábrica utilizada fue el Method Factory, ya que, en caso de necesitar agregar nuevas figuras en el futuro,
el programador únicamente tendrá que añadir el tipo de figura en RegularShapeType y la figura correspondiente en
ShapeFactory. Las figuras que retorna dependen de la interfaz Shape.
![Screenshot2025-02-02120051](images/Screenshot2025-02-02120051.png)
5. Ejecuté múltiples veces la clase ShapeMain, usando el plugin exec de Maven con los siguientes parámetros y
verifiqué la salida en consola para cada uno:

- Sin parámetros: No.
La aplicación necesita un parámetro para reconocer la figura, y sin él no se ejecuta correctamente.

- Parámetro "qwerty": No.
Con "qwerty" no funciona, ya que ninguna figura está definida de esta manera, por lo cual no lo valida y
no lo ejecuta en la terminal.

- Parámetro "pentágono": Sí.
"pentagon" ees reconocido como una figura válida en la aplicación y, al momento de la ejecución en la
terminal, muestra la salida esperada.

- Parámetro "Hexágono": No.
"hexagon" es reconocido como una figura válida en la aplicación y, al momento de la ejecución en la
terminal, muestra la salida esperada.

6. ¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?

Las únicas que se ejecutaron y funcionaron correctamente fueron "pentagon" y "hexagon", ya que son parámetros
que están definidos dentro de la propia aplicación. Las demás no funcionaron por distintos factores, como la mayúscula,
caracteres o los parámetros incorrectos.

## Integrantes
- Santiago Botero Garcia - [LePeanutButter](https://github.com/LePeanutButter)
- Ricardo Andres Ayala Garzon - [lRicardol](https://github.com/lRicardol)