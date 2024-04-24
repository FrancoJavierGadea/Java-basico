## Modificadores

### `final`

- La `Clase` no puede **heredarse**

- El `Metodo` no pude ser sobresctrito: `@Override` 

- La `Propiedad` no puede modificarse

<br>


### `abstract`

- La `Clase` no puede **instanciarse**, no se puede crear un objeto con ella

- Los `Metodos` deben estar dentro de una `Clase abstracta`, no tienen cuerpo (implementacion) solo definicion. 

    El cuerpo (implementacion) lo propocionan las `Clases` que lo heredan

<br>

### `static`

Las `Propiedades` y `Metodos` pertenecen a la `Clase` en ves de a una instancia / objeto

<br>


## Modificadores de accesso

- #### `public`: 
  
    La `Clase`, `Metodo`, `Propiedad` es visible en todo el proyecto, desde cualquier `Clase`


- #### por defecto:
  
    La `Clase`, `Metodo`, `Propiedad` es visible solo en `Clases` del **mismo paquete**


- #### `private`:
 
    El `Metodo`, `Propiedad` es visible solo dentro de su misma `Clase`


- #### `protected`:
  
    El `Metodo`, `Propiedad` es visible solo dentro de su misma `Clase` y las `Clases` que hereden de esta



<br>

#### Docs

- [Java Modifiers](https://www.w3schools.com/java/java_modifiers.asp)