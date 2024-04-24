# Variable arguments - varargs - `...`

Simplifica la creacion de metodos con un numero variale de argumentos de un mismo tipo

Solo puede usarse como **ultimo argumento** del metodo

```java
public void showList(String message, Object ...values){

    System.out.println(
        String.format("List: %s \n------------------", message)
    );

    for (Object value : values) {
        
        System.out.println(value.toString());
    }
}
```

Se le puede pasar:

- Una secuencia de elementos del mismo tipo

    ```java
    showList("Numbers", 1, 2, 3, 4, 5);
    ```

- Un **array** de elementos
   
    ```java
    showList("Numbers", new Number[]{1, 2, 3, 4, 5});
    ``` 
<br>


> `public static void main(String[] args)` es lo mismo que `public static void main(String... args)`


#### Docs 

- [Varargs](https://docs.oracle.com/javase/8/docs/technotes/guides/language/varargs.html)
- [Variable Arguments (Varargs) in Java](https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/)