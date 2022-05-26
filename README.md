# Qué Me Pongo


## **Segunda Iteración**

**Comentarios:**



1. Se agrega trama como enum (punto 1) 
2. Se agrega la clase Borrador que implementa un patron Builder para crear las prendas, esto me permite mas flexibilidad en cuanto al orden en que se setean los atributos de la prenda y el orden se podría implementar desde una interfaz para el usuario, y me permite crearla paso a paso.

    Las validaciones de inconsistencias elijo no modelarlas porque se podrian implementar también desde la interfaz (punto 2, punto 3, punto 4)

3. Se instancia el atributo trama de la clase borrador con el valor de Trama.LISA.
4. Se agrega una clase validarPrenda() que solo valida que los parametros de la prenda que son obligatorios no sean nulos al momento de crearla, por el momento no se agregaron otras validaciones como requerimientos.
5. BONUS

    Para el primer punto cree la clase sugerencias y el metodo recibirSugerencia que por el momento lo pense como que elija un uniforme al azar de los que esten en el listado para sugerir, pero mas adelante podria pensarse que el usuario va a tener algun criterio por el cual le podamos sugerir.


    Para el segundo punto cree la clase Uniforme Builder que se encarga de crear uniformes, esto me da mas flexibilidad y de poder hacerlo paso paso, tambien le agregue las validaciones para que conste de una prenda superior, una inferior y un calzado.


    Para el tercer punto cree la clase Administrador que posee los métodos para configurar los diferentes uniformes, pero esto podría haberlo metido en la parte de los tests.


En esta iteración seguiremos trabajando sobre la carga de prendas válidas:


```
Como usuarie de QuéMePongo, quiero poder cargar prendas válidas para generar atuendos con ellas.
```


Sin embargo, agregaremos algunos requerimiento adicionales



* Como usuarie de QuéMePongo, quiero especificar qué trama tiene la tela de una prenda (lisa, rayada, con lunares, a cuadros o un estampado).
* Como usuarie de QuéMePongo, quiero crear una prenda especificando primero de qué tipo es.
* Como usuarie de QuéMePongo, quiero crear una prenda especificando en segundo lugar los aspectos relacionados a su material (colores, material, trama, etc) para evitar elegir materiales inconsistentes con el tipo de prenda.
* Como usuarie de QuéMePongo, quiero guardar un borrador de la última prenda que empecé a cargar para continuar después.
* Como usuarie de QuéMePongo, quiero poder no indicar ninguna trama para una tela, y que por defecto ésta sea lisa.
* Como usuarie de QuéMePongo, quiero poder guardar una prenda solamente si esta es válida.

BONUS:Por otro lado, el equipo de producto está analizando potenciales futuras funcionalidades para la aplicación y, a fin de tener una estimación de su complejidad, nos pidió que esbocemos una solución a los siguientes requerimientos, orientados a integrar el software con colegios e instituciones privadas:



* Como usuario QueMePongo, quiero poder recibir sugerencias de uniformes armados.
* Como usuario QueMePongo, quiero que un uniforme siempre conste de una prenda superior, una inferior y un calzado
* Como administrador de QueMePongo, quiero poder configurar diferentes uniformes para distintas instituciones (Ej: para el colegio San Juan debe ser una chomba verde de piqué, un pantalón de acetato gris y zapatillas blancas, mientras que para el Instituto Johnson siempre será una camisa blanca, pantalón de vestir negro y zapatos negros) 


