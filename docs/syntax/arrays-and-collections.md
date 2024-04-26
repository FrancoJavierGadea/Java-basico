# Arrays

### Inicializar un Array

```java
String[] LANGUAGES = new String[5];
```

```java
String[] LANGUAGES = new String[]{
    "Java", 
    "Python", 
    "PHP", 
    "JavaScript",
    "TypeScript"
};
```
<br>

El `String[]` antes de `LANGUAGES` es el **tipo** y el `new String[5]` es el **array** en si mismo

Al estar definido explicitamente el **tipo** al **declarar la variable** se puede quitar el `new String[]` y usar solo las `{}`

```java
String[] LANGUAGES = {
    "Java", 
    "Python", 
    "PHP", 
    "JavaScript",
    "TypeScript"
};
```

Pero si vamos a pasar el **array** como un **parametro**, tenemos que usar el `new String[]` si o si

```java
Consumer<String[]> function = (String[] array) -> {

};

function.accept(new String[]{
    "Java", 
    "Python", 
    "PHP", 
    "JavaScript",
    "TypeScript"
});
```
<br>



### Clase de utilidades [Arrays](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)

<br>




# Colecciones

### Pasar de Array a Collection

`Arrays.asList()`

Toma un `array` o **secuencia de elementos** y devulve una **Lista de tamaño fijo**

No funcionan `.add()` `.remove()` y otros metodos que modifiquen el tamaño de la Lista

```java
List<String> list = Arrays.asList(new String[]{
    "Java", 
    "Python", 
    "JavaScript"
});
```

La **Lista** esta contruida sobre el `array original`, de modo que, si modificamos el `array` modificamos la lista y si modificamos la **Lista** con `set()` tambien se modifica el `array`

```java
String[] array = {"Java", "Python", "JavaScript"};
        
List<String> list = Arrays.asList(array);

//array[1] = "PHP";
list.set(1, "PHP");

System.out.println("List: " + list);
System.out.println("Array: " + Arrays.toString(array));
```


<br>

#### Docs 

- [collection interfaces](https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html)
- [List.of() Vs Arrays.asList](https://medium.com/@mgm06bm/list-of-vs-arrays-aslist-7e2f7af64361)