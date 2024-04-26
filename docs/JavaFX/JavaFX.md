# Java FX

La `Clase` principal de una **aplicacion** `JavaFX` tiene que heredar de la `Clase Application` en el paquete `javafx.application`

El metodo `start()` es el **punto de entrada** de la aplicacion



La Clase `Stage` es el `top-level container`

La Clase `Scene` es el contenedor de todos los elementos


<br>

## La Clase `Node` - [show](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/Node.html)

Es la `Clase base` de todos los elementos que se pueden añadir a una **escena** `Scene`

Es una `clase abstracta` que define propiedades y metodos comunes para todos los componentes

- `id`
- `prefWidth` `prefHeight`
- `maxWidth` `maxHeight`
- `minWidth` `minHeight`
- `opacity`
- `userData`
- `visible`
- `style` `styleClass`
- `scene` `parent`
- `layoutX` `layoutY`
- `layoutBounds` `boundsInParent` `boundsInLocal`

<br>

#### [`Clase Parent`](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/Parent.html): 

Herada directamente de `Node`

Es la Clase base para todos los **nodos** que tengan elementos hijos

#### [`Clase Region`](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/Region.html):

Hereda de `Parent` y `Node`

Es la Clase base para todos los `componentes UI` y `Contenedores`

- `border`
- `background`
- `padding`
- `insets`


#### Ver mas

[JavaFX Node](https://jenkov.com/tutorials/javafx/node.html)



<br>

#### Docs

[Java Platform, Standard Edition (Java SE) 8 - Client Technologies](https://docs.oracle.com/javase/8/javase-clienttechnologies.htm)